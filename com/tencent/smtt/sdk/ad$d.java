package com.tencent.smtt.sdk;

import android.net.http.SslCertificate;
import com.tencent.matrix.trace.core.AppMethodBeat;

class ad$d
  implements com.tencent.smtt.export.external.interfaces.SslError
{
  android.net.http.SslError a;

  ad$d(android.net.http.SslError paramSslError)
  {
    this.a = paramSslError;
  }

  public boolean addError(int paramInt)
  {
    AppMethodBeat.i(64215);
    boolean bool = this.a.addError(paramInt);
    AppMethodBeat.o(64215);
    return bool;
  }

  public SslCertificate getCertificate()
  {
    AppMethodBeat.i(64214);
    SslCertificate localSslCertificate = this.a.getCertificate();
    AppMethodBeat.o(64214);
    return localSslCertificate;
  }

  public int getPrimaryError()
  {
    AppMethodBeat.i(64217);
    int i = this.a.getPrimaryError();
    AppMethodBeat.o(64217);
    return i;
  }

  public boolean hasError(int paramInt)
  {
    AppMethodBeat.i(64216);
    boolean bool = this.a.hasError(paramInt);
    AppMethodBeat.o(64216);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ad.d
 * JD-Core Version:    0.6.2
 */