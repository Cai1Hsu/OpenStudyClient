package android.support.v4.hardware.fingerprint;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.hardware.fingerprint.FingerprintManagerCompatApi23;
import android.support.v4.os.CancellationSignal;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes.jar:android/support/v4/hardware/fingerprint/FingerprintManagerCompat.class */
public final class FingerprintManagerCompat {
    static final FingerprintManagerCompatImpl IMPL;
    private Context mContext;

    /* loaded from: classes.jar:android/support/v4/hardware/fingerprint/FingerprintManagerCompat$Api23FingerprintManagerCompatImpl.class */
    private static class Api23FingerprintManagerCompatImpl implements FingerprintManagerCompatImpl {
        static CryptoObject unwrapCryptoObject(FingerprintManagerCompatApi23.CryptoObject cryptoObject) {
            CryptoObject cryptoObject2 = null;
            if (cryptoObject != null) {
                if (cryptoObject.getCipher() != null) {
                    cryptoObject2 = new CryptoObject(cryptoObject.getCipher());
                } else if (cryptoObject.getSignature() != null) {
                    cryptoObject2 = new CryptoObject(cryptoObject.getSignature());
                } else if (cryptoObject.getMac() != null) {
                    cryptoObject2 = new CryptoObject(cryptoObject.getMac());
                }
            }
            return cryptoObject2;
        }

        private static FingerprintManagerCompatApi23.AuthenticationCallback wrapCallback(final AuthenticationCallback authenticationCallback) {
            return new FingerprintManagerCompatApi23.AuthenticationCallback() { // from class: android.support.v4.hardware.fingerprint.FingerprintManagerCompat.Api23FingerprintManagerCompatImpl.1
                @Override // android.support.v4.hardware.fingerprint.FingerprintManagerCompatApi23.AuthenticationCallback
                public void onAuthenticationError(int i, CharSequence charSequence) {
                    authenticationCallback.onAuthenticationError(i, charSequence);
                }

                @Override // android.support.v4.hardware.fingerprint.FingerprintManagerCompatApi23.AuthenticationCallback
                public void onAuthenticationFailed() {
                    authenticationCallback.onAuthenticationFailed();
                }

                @Override // android.support.v4.hardware.fingerprint.FingerprintManagerCompatApi23.AuthenticationCallback
                public void onAuthenticationHelp(int i, CharSequence charSequence) {
                    authenticationCallback.onAuthenticationHelp(i, charSequence);
                }

                @Override // android.support.v4.hardware.fingerprint.FingerprintManagerCompatApi23.AuthenticationCallback
                public void onAuthenticationSucceeded(FingerprintManagerCompatApi23.AuthenticationResultInternal authenticationResultInternal) {
                    authenticationCallback.onAuthenticationSucceeded(new AuthenticationResult(Api23FingerprintManagerCompatImpl.unwrapCryptoObject(authenticationResultInternal.getCryptoObject())));
                }
            };
        }

        private static FingerprintManagerCompatApi23.CryptoObject wrapCryptoObject(CryptoObject cryptoObject) {
            FingerprintManagerCompatApi23.CryptoObject cryptoObject2 = null;
            if (cryptoObject != null) {
                if (cryptoObject.getCipher() != null) {
                    cryptoObject2 = new FingerprintManagerCompatApi23.CryptoObject(cryptoObject.getCipher());
                } else if (cryptoObject.getSignature() != null) {
                    cryptoObject2 = new FingerprintManagerCompatApi23.CryptoObject(cryptoObject.getSignature());
                } else if (cryptoObject.getMac() != null) {
                    cryptoObject2 = new FingerprintManagerCompatApi23.CryptoObject(cryptoObject.getMac());
                }
            }
            return cryptoObject2;
        }

        @Override // android.support.v4.hardware.fingerprint.FingerprintManagerCompat.FingerprintManagerCompatImpl
        public void authenticate(Context context, CryptoObject cryptoObject, int i, CancellationSignal cancellationSignal, AuthenticationCallback authenticationCallback, Handler handler) {
            FingerprintManagerCompatApi23.authenticate(context, wrapCryptoObject(cryptoObject), i, cancellationSignal != null ? cancellationSignal.getCancellationSignalObject() : null, wrapCallback(authenticationCallback), handler);
        }

        @Override // android.support.v4.hardware.fingerprint.FingerprintManagerCompat.FingerprintManagerCompatImpl
        public boolean hasEnrolledFingerprints(Context context) {
            return FingerprintManagerCompatApi23.hasEnrolledFingerprints(context);
        }

        @Override // android.support.v4.hardware.fingerprint.FingerprintManagerCompat.FingerprintManagerCompatImpl
        public boolean isHardwareDetected(Context context) {
            return FingerprintManagerCompatApi23.isHardwareDetected(context);
        }
    }

    /* loaded from: classes.jar:android/support/v4/hardware/fingerprint/FingerprintManagerCompat$AuthenticationCallback.class */
    public static abstract class AuthenticationCallback {
        public void onAuthenticationError(int i, CharSequence charSequence) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
        }

        public void onAuthenticationSucceeded(AuthenticationResult authenticationResult) {
        }
    }

    /* loaded from: classes.jar:android/support/v4/hardware/fingerprint/FingerprintManagerCompat$AuthenticationResult.class */
    public static final class AuthenticationResult {
        private CryptoObject mCryptoObject;

        public AuthenticationResult(CryptoObject cryptoObject) {
            this.mCryptoObject = cryptoObject;
        }

        public CryptoObject getCryptoObject() {
            return this.mCryptoObject;
        }
    }

    /* loaded from: classes.jar:android/support/v4/hardware/fingerprint/FingerprintManagerCompat$CryptoObject.class */
    public static class CryptoObject {
        private final Cipher mCipher;
        private final Mac mMac;
        private final Signature mSignature;

        public CryptoObject(Signature signature) {
            this.mSignature = signature;
            this.mCipher = null;
            this.mMac = null;
        }

        public CryptoObject(Cipher cipher) {
            this.mCipher = cipher;
            this.mSignature = null;
            this.mMac = null;
        }

        public CryptoObject(Mac mac) {
            this.mMac = mac;
            this.mCipher = null;
            this.mSignature = null;
        }

        public Cipher getCipher() {
            return this.mCipher;
        }

        public Mac getMac() {
            return this.mMac;
        }

        public Signature getSignature() {
            return this.mSignature;
        }
    }

    /* loaded from: classes.jar:android/support/v4/hardware/fingerprint/FingerprintManagerCompat$FingerprintManagerCompatImpl.class */
    private interface FingerprintManagerCompatImpl {
        void authenticate(Context context, CryptoObject cryptoObject, int i, CancellationSignal cancellationSignal, AuthenticationCallback authenticationCallback, Handler handler);

        boolean hasEnrolledFingerprints(Context context);

        boolean isHardwareDetected(Context context);
    }

    /* loaded from: classes.jar:android/support/v4/hardware/fingerprint/FingerprintManagerCompat$LegacyFingerprintManagerCompatImpl.class */
    private static class LegacyFingerprintManagerCompatImpl implements FingerprintManagerCompatImpl {
        @Override // android.support.v4.hardware.fingerprint.FingerprintManagerCompat.FingerprintManagerCompatImpl
        public void authenticate(Context context, CryptoObject cryptoObject, int i, CancellationSignal cancellationSignal, AuthenticationCallback authenticationCallback, Handler handler) {
        }

        @Override // android.support.v4.hardware.fingerprint.FingerprintManagerCompat.FingerprintManagerCompatImpl
        public boolean hasEnrolledFingerprints(Context context) {
            return false;
        }

        @Override // android.support.v4.hardware.fingerprint.FingerprintManagerCompat.FingerprintManagerCompatImpl
        public boolean isHardwareDetected(Context context) {
            return false;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            IMPL = new Api23FingerprintManagerCompatImpl();
        } else {
            IMPL = new LegacyFingerprintManagerCompatImpl();
        }
    }

    private FingerprintManagerCompat(Context context) {
        this.mContext = context;
    }

    public static FingerprintManagerCompat from(Context context) {
        return new FingerprintManagerCompat(context);
    }

    public void authenticate(@Nullable CryptoObject cryptoObject, int i, @Nullable CancellationSignal cancellationSignal, @NonNull AuthenticationCallback authenticationCallback, @Nullable Handler handler) {
        IMPL.authenticate(this.mContext, cryptoObject, i, cancellationSignal, authenticationCallback, handler);
    }

    public boolean hasEnrolledFingerprints() {
        return IMPL.hasEnrolledFingerprints(this.mContext);
    }

    public boolean isHardwareDetected() {
        return IMPL.isHardwareDetected(this.mContext);
    }
}
