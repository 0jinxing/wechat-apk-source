package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.aj;

final class JsApiLaunchApplicationDirectly$a
  implements aj
{
  volatile boolean cEn;
  volatile boolean ftW;
  JsApiLaunchApplicationDirectly.a.a hxQ;
  volatile boolean hxt;
  volatile boolean hxu;

  JsApiLaunchApplicationDirectly$a(JsApiLaunchApplicationDirectly.a.a parama)
  {
    this.hxQ = parama;
  }

  public final void dR(boolean paramBoolean)
  {
    AppMethodBeat.i(130476);
    this.ftW = true;
    this.hxt = paramBoolean;
    if ((this.hxu) && (this.hxQ != null))
      this.hxQ.r(this.cEn, paramBoolean);
    AppMethodBeat.o(130476);
  }

  final void dS(boolean paramBoolean)
  {
    AppMethodBeat.i(130477);
    this.cEn = paramBoolean;
    this.hxu = true;
    if ((this.ftW) && (this.hxQ != null))
      this.hxQ.r(paramBoolean, this.hxt);
    AppMethodBeat.o(130477);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly.a
 * JD-Core Version:    0.6.2
 */