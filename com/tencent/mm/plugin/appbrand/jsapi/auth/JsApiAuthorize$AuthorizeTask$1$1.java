package com.tencent.mm.plugin.appbrand.jsapi.auth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class JsApiAuthorize$AuthorizeTask$1$1
  implements e.b
{
  JsApiAuthorize$AuthorizeTask$1$1(JsApiAuthorize.AuthorizeTask.1 param1)
  {
  }

  public final void AQ(String paramString)
  {
    AppMethodBeat.i(130829);
    this.hCh.hCg.hCb = paramString;
    StringBuilder localStringBuilder = new StringBuilder(" userHeadIconPath=");
    if (this.hCh.hCg.hCb == null);
    for (paramString = ""; ; paramString = this.hCh.hCg.hCb)
    {
      ab.i("MicroMsg.JsApiAuthorize", paramString);
      JsApiAuthorize.AuthorizeTask.d(this.hCh.hCg);
      AppMethodBeat.o(130829);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize.AuthorizeTask.1.1
 * JD-Core Version:    0.6.2
 */