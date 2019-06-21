package com.tencent.mars.cdn;

import java.security.cert.X509Certificate;
import java.util.List;

abstract interface X509Util$X509TrustManagerImplementation
{
  public abstract List<X509Certificate> checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString1, String paramString2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mars.cdn.X509Util.X509TrustManagerImplementation
 * JD-Core Version:    0.6.2
 */