package com.tencent.smtt.export.external.interfaces;

import android.net.http.SslCertificate;

public abstract interface SslError
{
  public abstract boolean addError(int paramInt);

  public abstract SslCertificate getCertificate();

  public abstract int getPrimaryError();

  public abstract boolean hasError(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.SslError
 * JD-Core Version:    0.6.2
 */