package com.tencent.soter.core.biometric;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public final class FaceManager$CryptoObject
{
  private final Object mCrypto;

  public FaceManager$CryptoObject(Signature paramSignature)
  {
    this.mCrypto = paramSignature;
  }

  public FaceManager$CryptoObject(Cipher paramCipher)
  {
    this.mCrypto = paramCipher;
  }

  public FaceManager$CryptoObject(Mac paramMac)
  {
    this.mCrypto = paramMac;
  }

  public final Cipher getCipher()
  {
    if ((this.mCrypto instanceof Cipher));
    for (Cipher localCipher = (Cipher)this.mCrypto; ; localCipher = null)
      return localCipher;
  }

  public final Mac getMac()
  {
    if ((this.mCrypto instanceof Mac));
    for (Mac localMac = (Mac)this.mCrypto; ; localMac = null)
      return localMac;
  }

  public final Signature getSignature()
  {
    if ((this.mCrypto instanceof Signature));
    for (Signature localSignature = (Signature)this.mCrypto; ; localSignature = null)
      return localSignature;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.biometric.FaceManager.CryptoObject
 * JD-Core Version:    0.6.2
 */