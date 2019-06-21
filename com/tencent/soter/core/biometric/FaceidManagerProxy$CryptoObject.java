package com.tencent.soter.core.biometric;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public class FaceidManagerProxy$CryptoObject
{
  private final Cipher mCipher;
  private final Mac mMac;
  private final Signature mSignature;

  public FaceidManagerProxy$CryptoObject(Signature paramSignature)
  {
    this.mSignature = paramSignature;
    this.mCipher = null;
    this.mMac = null;
  }

  public FaceidManagerProxy$CryptoObject(Cipher paramCipher)
  {
    this.mCipher = paramCipher;
    this.mSignature = null;
    this.mMac = null;
  }

  public FaceidManagerProxy$CryptoObject(Mac paramMac)
  {
    this.mMac = paramMac;
    this.mCipher = null;
    this.mSignature = null;
  }

  public Cipher getCipher()
  {
    return this.mCipher;
  }

  public Mac getMac()
  {
    return this.mMac;
  }

  public Signature getSignature()
  {
    return this.mSignature;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.biometric.FaceidManagerProxy.CryptoObject
 * JD-Core Version:    0.6.2
 */