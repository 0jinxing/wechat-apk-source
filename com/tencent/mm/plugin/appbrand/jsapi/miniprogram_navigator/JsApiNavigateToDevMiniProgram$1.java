package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.d;
import com.tencent.mm.plugin.appbrand.jsapi.m;

final class JsApiNavigateToDevMiniProgram$1
  implements c.c
{
  JsApiNavigateToDevMiniProgram$1(JsApiNavigateToDevMiniProgram paramJsApiNavigateToDevMiniProgram, d paramd, int paramInt)
  {
  }

  public final void dY(boolean paramBoolean)
  {
    AppMethodBeat.i(131337);
    d locald = this.hJo;
    int i = this.eIl;
    JsApiNavigateToDevMiniProgram localJsApiNavigateToDevMiniProgram = this.hQS;
    if (paramBoolean);
    for (String str = "ok"; ; str = "fail")
    {
      locald.M(i, localJsApiNavigateToDevMiniProgram.j(str, null));
      AppMethodBeat.o(131337);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram.1
 * JD-Core Version:    0.6.2
 */