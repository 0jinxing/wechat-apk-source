package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ak
  implements aj
{
  public volatile boolean cEn;
  public volatile boolean ftW;
  public volatile boolean hxt;
  public volatile boolean hxu;
  ak.a vcJ;

  public ak(ak.a parama)
  {
    this.vcJ = parama;
  }

  public final void dR(boolean paramBoolean)
  {
    AppMethodBeat.i(79395);
    this.ftW = true;
    this.hxt = paramBoolean;
    if ((this.hxu) && (this.vcJ != null))
      this.vcJ.r(this.cEn, paramBoolean);
    AppMethodBeat.o(79395);
  }

  public final void dS(boolean paramBoolean)
  {
    AppMethodBeat.i(79396);
    this.cEn = paramBoolean;
    this.hxu = true;
    if ((this.ftW) && (this.vcJ != null))
      this.vcJ.r(paramBoolean, this.hxt);
    AppMethodBeat.o(79396);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ak
 * JD-Core Version:    0.6.2
 */