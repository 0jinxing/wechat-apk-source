package com.tencent.smtt.export.external.interfaces;

import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

public abstract class ClientCertRequest
{
  public abstract void cancel();

  public abstract String getHost();

  public abstract String[] getKeyTypes();

  public abstract int getPort();

  public abstract Principal[] getPrincipals();

  public abstract void ignore();

  public abstract void proceed(PrivateKey paramPrivateKey, X509Certificate[] paramArrayOfX509Certificate);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.ClientCertRequest
 * JD-Core Version:    0.6.2
 */