package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.aj;

final class JsApiLaunchApplication$a
  implements aj
{
  volatile boolean cEn;
  volatile boolean ftW;
  volatile boolean hxt;
  volatile boolean hxu;
  JsApiLaunchApplication.a.a hxv;

  JsApiLaunchApplication$a(JsApiLaunchApplication.a.a parama)
  {
    this.hxv = parama;
  }

  public final void dR(boolean paramBoolean)
  {
    AppMethodBeat.i(130448);
    this.ftW = true;
    this.hxt = paramBoolean;
    if ((this.hxu) && (this.hxv != null))
      this.hxv.r(this.cEn, paramBoolean);
    AppMethodBeat.o(130448);
  }

  final void dS(boolean paramBoolean)
  {
    AppMethodBeat.i(130449);
    this.cEn = paramBoolean;
    this.hxu = true;
    if ((this.ftW) && (this.hxv != null))
      this.hxv.r(paramBoolean, this.hxt);
    AppMethodBeat.o(130449);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication.a
 * JD-Core Version:    0.6.2
 */