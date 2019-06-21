package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class WebViewUI$m
{
  private int uxN = 0;

  protected WebViewUI$m(WebViewUI paramWebViewUI)
  {
  }

  public final void daN()
  {
    AppMethodBeat.i(7955);
    ab.d("MicroMsg.WebViewUI", "addGetA8KeySceneEndListener, before inc count=%d", new Object[] { Integer.valueOf(this.uxN) });
    if (this.uxN == 0)
      WebViewUI.d(this.uxp, 233);
    this.uxN += 1;
    AppMethodBeat.o(7955);
  }

  public final void daO()
  {
    AppMethodBeat.i(7956);
    ab.d("MicroMsg.WebViewUI", "removeGetA8KeySceneEndListener, before dec count=%d", new Object[] { Integer.valueOf(this.uxN) });
    this.uxN -= 1;
    if (this.uxN <= 0)
      WebViewUI.e(this.uxp, 233);
    AppMethodBeat.o(7956);
  }

  public final boolean daP()
  {
    boolean bool = true;
    AppMethodBeat.i(7957);
    ab.d("MicroMsg.WebViewUI", "GetA8KeySceneEndController.hasAddListener count=%d", new Object[] { Integer.valueOf(this.uxN) });
    if (this.uxN > 0)
      AppMethodBeat.o(7957);
    while (true)
    {
      return bool;
      AppMethodBeat.o(7957);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.m
 * JD-Core Version:    0.6.2
 */