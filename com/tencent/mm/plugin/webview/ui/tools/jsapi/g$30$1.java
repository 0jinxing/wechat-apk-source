package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class g$30$1
  implements j.d
{
  g$30$1(g.30 param30)
  {
  }

  private void bI(int paramInt, String paramString)
  {
    AppMethodBeat.i(9078);
    g.c localc = g.b(this.uHE.uHd, paramInt);
    if ((localc != null) && (localc.uGd != null) && (localc.umI != null))
      g.a(this.uHE.uHd, g.k(this.uHE.uHd), g.j(this.uHE.uHd), "openMapNavigateMenu:" + bo.bc(paramString, "fail"));
    AppMethodBeat.o(9078);
  }

  public final void JP(int paramInt)
  {
    AppMethodBeat.i(9075);
    bI(paramInt, "cancel");
    AppMethodBeat.o(9075);
  }

  public final void JQ(int paramInt)
  {
    AppMethodBeat.i(9079);
    g.c(this.uHE.uHd, paramInt);
    AppMethodBeat.o(9079);
  }

  public final void onFail(int paramInt)
  {
    AppMethodBeat.i(9076);
    bI(paramInt, "fail");
    AppMethodBeat.o(9076);
  }

  public final void onSuccess(int paramInt)
  {
    AppMethodBeat.i(9077);
    bI(paramInt, "ok");
    AppMethodBeat.o(9077);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.30.1
 * JD-Core Version:    0.6.2
 */