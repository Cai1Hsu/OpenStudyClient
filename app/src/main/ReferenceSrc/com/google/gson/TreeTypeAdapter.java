package com.google.gson;

import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: classes.jar:com/google/gson/TreeTypeAdapter.class */
final class TreeTypeAdapter<T> extends TypeAdapter<T> {
    private TypeAdapter<T> delegate;
    private final JsonDeserializer<T> deserializer;
    private final Gson gson;
    private final JsonSerializer<T> serializer;
    private final TypeAdapterFactory skipPast;
    private final TypeToken<T> typeToken;

    /* loaded from: classes.jar:com/google/gson/TreeTypeAdapter$SingleTypeFactory.class */
    private static class SingleTypeFactory implements TypeAdapterFactory {
        private final JsonDeserializer<?> deserializer;
        private final TypeToken<?> exactType;
        private final Class<?> hierarchyType;
        private final boolean matchRawType;
        private final JsonSerializer<?> serializer;

        private SingleTypeFactory(Object obj, TypeToken<?> typeToken, boolean z, Class<?> cls) {
            this.serializer = obj instanceof JsonSerializer ? (JsonSerializer) obj : null;
            this.deserializer = obj instanceof JsonDeserializer ? (JsonDeserializer) obj : null;
            C$Gson$Preconditions.checkArgument((this.serializer == null && this.deserializer == null) ? false : true);
            this.exactType = typeToken;
            this.matchRawType = z;
            this.hierarchyType = cls;
        }

        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            return this.exactType != null ? this.exactType.equals(typeToken) || (this.matchRawType && this.exactType.getType() == typeToken.getRawType()) : this.hierarchyType.isAssignableFrom(typeToken.getRawType()) ? new TreeTypeAdapter(this.serializer, this.deserializer, gson, typeToken, this) : null;
        }
    }

    private TreeTypeAdapter(JsonSerializer<T> jsonSerializer, JsonDeserializer<T> jsonDeserializer, Gson gson, TypeToken<T> typeToken, TypeAdapterFactory typeAdapterFactory) {
        this.serializer = jsonSerializer;
        this.deserializer = jsonDeserializer;
        this.gson = gson;
        this.typeToken = typeToken;
        this.skipPast = typeAdapterFactory;
    }

    private TypeAdapter<T> delegate() {
        TypeAdapter<T> typeAdapter = this.delegate;
        if (typeAdapter == null) {
            typeAdapter = this.gson.getDelegateAdapter(this.skipPast, this.typeToken);
            this.delegate = typeAdapter;
        }
        return typeAdapter;
    }

    public static TypeAdapterFactory newFactory(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, false, null);
    }

    public static TypeAdapterFactory newFactoryWithMatchRawType(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, typeToken.getType() == typeToken.getRawType(), null);
    }

    public static TypeAdapterFactory newTypeHierarchyFactory(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    @Override // com.google.gson.TypeAdapter
    public T read(JsonReader jsonReader) throws IOException {
        T deserialize;
        if (this.deserializer == null) {
            deserialize = delegate().read(jsonReader);
        } else {
            JsonElement parse = Streams.parse(jsonReader);
            deserialize = parse.isJsonNull() ? null : this.deserializer.deserialize(parse, this.typeToken.getType(), this.gson.deserializationContext);
        }
        return deserialize;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t) throws IOException {
        if (this.serializer == null) {
            delegate().write(jsonWriter, t);
        } else if (t == null) {
            jsonWriter.nullValue();
        } else {
            Streams.write(this.serializer.serialize(t, this.typeToken.getType(), this.gson.serializationContext), jsonWriter);
        }
    }
}
