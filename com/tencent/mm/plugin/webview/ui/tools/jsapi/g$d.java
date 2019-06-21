package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.aj;

final class g$d
  implements aj
{
  volatile boolean cEn;
  volatile boolean ftW;
  volatile boolean hxt;
  volatile boolean hxu;
  g.d.a uID;

  g$d(g.d.a parama)
  {
    this.uID = parama;
  }

  public final void dR(boolean paramBoolean)
  {
    AppMethodBeat.i(9213);
    this.ftW = true;
    this.hxt = paramBoolean;
    if ((this.hxu) && (this.uID != null))
      this.uID.r(this.cEn, paramBoolean);
    AppMethodBeat.o(9213);
  }

  final void dS(boolean paramBoolean)
  {
    AppMethodBeat.i(9214);
    this.cEn = paramBoolean;
    this.hxu = true;
    if ((this.ftW) && (this.uID != null))
      this.uID.r(paramBoolean, this.hxt);
    AppMethodBeat.o(9214);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.d
 * JD-Core Version:    0.6.2
 */