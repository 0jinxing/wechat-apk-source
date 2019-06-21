package com.tencent.mm.plugin.webview.fts.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.ui.WebSearchWebVideoViewControlBar.a;

final class FtsWebVideoView$6
  implements WebSearchWebVideoViewControlBar.a
{
  FtsWebVideoView$6(FtsWebVideoView paramFtsWebVideoView)
  {
  }

  public final int aFg()
  {
    AppMethodBeat.i(5829);
    int i = FtsWebVideoView.d(this.uhl).getCacheTimeSec();
    AppMethodBeat.o(5829);
    return i;
  }

  public final int aFh()
  {
    AppMethodBeat.i(5830);
    int i = FtsWebVideoView.d(this.uhl).getVideoDurationSec();
    AppMethodBeat.o(5830);
    return i;
  }

  public final int cVN()
  {
    AppMethodBeat.i(5831);
    int i = FtsWebVideoView.d(this.uhl).getCurrPosMs();
    AppMethodBeat.o(5831);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView.6
 * JD-Core Version:    0.6.2
 */