package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

class ad$a extends com.tencent.smtt.export.external.interfaces.ClientCertRequest
{
  private android.webkit.ClientCertRequest a;

  public ad$a(android.webkit.ClientCertRequest paramClientCertRequest)
  {
    this.a = paramClientCertRequest;
  }

  public void cancel()
  {
    AppMethodBeat.i(64202);
    this.a.cancel();
    AppMethodBeat.o(64202);
  }

  public String getHost()
  {
    AppMethodBeat.i(64203);
    String str = this.a.getHost();
    AppMethodBeat.o(64203);
    return str;
  }

  public String[] getKeyTypes()
  {
    AppMethodBeat.i(64204);
    String[] arrayOfString = this.a.getKeyTypes();
    AppMethodBeat.o(64204);
    return arrayOfString;
  }

  public int getPort()
  {
    AppMethodBeat.i(64205);
    int i = this.a.getPort();
    AppMethodBeat.o(64205);
    return i;
  }

  public Principal[] getPrincipals()
  {
    AppMethodBeat.i(64206);
    Principal[] arrayOfPrincipal = this.a.getPrincipals();
    AppMethodBeat.o(64206);
    return arrayOfPrincipal;
  }

  public void ignore()
  {
    AppMethodBeat.i(64207);
    this.a.ignore();
    AppMethodBeat.o(64207);
  }

  public void proceed(PrivateKey paramPrivateKey, X509Certificate[] paramArrayOfX509Certificate)
  {
    AppMethodBeat.i(64208);
    this.a.proceed(paramPrivateKey, paramArrayOfX509Certificate);
    AppMethodBeat.o(64208);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ad.a
 * JD-Core Version:    0.6.2
 */