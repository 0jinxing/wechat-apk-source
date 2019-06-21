package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;

class SystemWebChromeClient$e
  implements com.tencent.smtt.export.external.interfaces.JsResult
{
  android.webkit.JsResult a;

  SystemWebChromeClient$e(SystemWebChromeClient paramSystemWebChromeClient, android.webkit.JsResult paramJsResult)
  {
    this.a = paramJsResult;
  }

  public void cancel()
  {
    AppMethodBeat.i(64168);
    this.a.cancel();
    AppMethodBeat.o(64168);
  }

  public void confirm()
  {
    AppMethodBeat.i(64169);
    this.a.confirm();
    AppMethodBeat.o(64169);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.SystemWebChromeClient.e
 * JD-Core Version:    0.6.2
 */