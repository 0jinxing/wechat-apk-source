package com.tencent.soter.core.a;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public final class b$c
{
  final Cipher mCipher;
  final Mac mMac;
  final Signature mSignature;

  public b$c(Signature paramSignature)
  {
    this.mSignature = paramSignature;
    this.mCipher = null;
    this.mMac = null;
  }

  public b$c(Cipher paramCipher)
  {
    this.mCipher = paramCipher;
    this.mSignature = null;
    this.mMac = null;
  }

  public b$c(Mac paramMac)
  {
    this.mMac = paramMac;
    this.mCipher = null;
    this.mSignature = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.a.b.c
 * JD-Core Version:    0.6.2
 */