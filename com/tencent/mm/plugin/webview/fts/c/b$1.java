package com.tencent.mm.plugin.webview.fts.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.ui.WebSearchWebVideoViewControlBar;
import com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements a
{
  b$1(b paramb, FtsWebVideoView paramFtsWebVideoView)
  {
  }

  public final void aDI()
  {
    AppMethodBeat.i(5929);
    FtsWebVideoView localFtsWebVideoView = this.uhC;
    ab.i("MicroMsg.FtsWebVideoView", "onExitFullScreen");
    if (localFtsWebVideoView.ugQ.hZM)
      localFtsWebVideoView.ugQ.aDF();
    localFtsWebVideoView.er(false);
    AppMethodBeat.o(5929);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.c.b.1
 * JD-Core Version:    0.6.2
 */