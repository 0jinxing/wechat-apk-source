package com.tencent.mm.jni.utils;

public class UtilsJni
{
  public static native byte[] AesGcmDecrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);

  public static native byte[] AesGcmDecryptWithUncompress(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);

  public static native byte[] AesGcmEncrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);

  public static native byte[] AesGcmEncryptWithCompress(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);

  public static native long CreateHybridEcdhCryptoEngine(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3);

  public static native byte[] DecryptAvatar(byte[] paramArrayOfByte);

  public static native byte[] Ecdh(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);

  public static native byte[] EcdsaSign(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);

  public static native int EcdsaVerify(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3);

  public static native byte[][] GenEcdhKeyPair();

  public static native byte[][] GenEcdsaKeyPair();

  public static native byte[] HKDF(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, String paramString, int paramInt);

  public static native byte[] HybridEcdhDecrypt(long paramLong, byte[] paramArrayOfByte);

  public static native byte[] HybridEcdhEncrypt(long paramLong, byte[] paramArrayOfByte);

  public static native void ReleaseHybridEcdhCryptoEngine(long paramLong);

  public static native void ResetHybridEcdhCryptoEngine(long paramLong);

  public static native byte[] cryptGenRandom(int paramInt);

  public static native int doEcdsaSHAVerify(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3);

  public static native int doEcdsaVerify(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.jni.utils.UtilsJni
 * JD-Core Version:    0.6.2
 */