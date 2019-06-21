package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;

class ad$c
  implements com.tencent.smtt.export.external.interfaces.SslErrorHandler
{
  android.webkit.SslErrorHandler a;

  ad$c(android.webkit.SslErrorHandler paramSslErrorHandler)
  {
    this.a = paramSslErrorHandler;
  }

  public void cancel()
  {
    AppMethodBeat.i(64213);
    this.a.cancel();
    AppMethodBeat.o(64213);
  }

  public void proceed()
  {
    AppMethodBeat.i(64212);
    this.a.proceed();
    AppMethodBeat.o(64212);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ad.c
 * JD-Core Version:    0.6.2
 */