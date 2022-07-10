package com.google.gson;

import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
/* loaded from: /home/caiyi/jadx/jadx-1.4.2/bin/classes.dex */
public abstract class TypeAdapter<T> {
    public abstract T read(JsonReader jsonReader) throws IOException;

    public abstract void write(JsonWriter jsonWriter, T t) throws IOException;

    public final void toJson(Writer out, T value) throws IOException {
        JsonWriter writer = new JsonWriter(out);
        write(writer, value);
    }

    /* renamed from: com.google.gson.TypeAdapter$1 */
    /* loaded from: /home/caiyi/jadx/jadx-1.4.2/bin/classes.dex */
    class AnonymousClass1 extends TypeAdapter<T> {
        AnonymousClass1() {
            TypeAdapter.this = r1;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter out, T value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                TypeAdapter.this.write(out, value);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public T read(JsonReader reader) throws IOException {
            if (reader.peek() == JsonToken.NULL) {
                reader.nextNull();
                return null;
            }
            return (T) TypeAdapter.this.read(reader);
        }
    }

    public final TypeAdapter<T> nullSafe() {
        return new AnonymousClass1();
    }

    public final String toJson(T value) throws IOException {
        StringWriter stringWriter = new StringWriter();
        toJson(stringWriter, value);
        return stringWriter.toString();
    }

    public final JsonElement toJsonTree(T value) {
        try {
            JsonTreeWriter jsonWriter = new JsonTreeWriter();
            write(jsonWriter, value);
            return jsonWriter.get();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final T fromJson(Reader in) throws IOException {
        JsonReader reader = new JsonReader(in);
        return read(reader);
    }

    public final T fromJson(String json) throws IOException {
        return fromJson(new StringReader(json));
    }

    public final T fromJsonTree(JsonElement jsonTree) {
        try {
            JsonReader jsonReader = new JsonTreeReader(jsonTree);
            return read(jsonReader);
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }
}
