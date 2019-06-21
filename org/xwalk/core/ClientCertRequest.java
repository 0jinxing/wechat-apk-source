package org.xwalk.core;

import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.List;

public abstract interface ClientCertRequest
{
  public abstract void cancel();

  public abstract String getHost();

  public abstract String[] getKeyTypes();

  public abstract int getPort();

  public abstract Principal[] getPrincipals();

  public abstract void ignore();

  public abstract void proceed(PrivateKey paramPrivateKey, List<X509Certificate> paramList);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     org.xwalk.core.ClientCertRequest
 * JD-Core Version:    0.6.2
 */