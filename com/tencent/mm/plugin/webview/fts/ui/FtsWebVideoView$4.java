package com.tencent.mm.plugin.webview.fts.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.ui.b;
import com.tencent.mm.plugin.websearch.ui.WebSearchWebVideoViewControlBar;
import com.tencent.mm.plugin.webview.fts.c.d;
import com.tencent.mm.sdk.platformtools.ab;

final class FtsWebVideoView$4
  implements b
{
  FtsWebVideoView$4(FtsWebVideoView paramFtsWebVideoView)
  {
  }

  public final void aFw()
  {
    AppMethodBeat.i(5826);
    ab.i("MicroMsg.FtsWebVideoView", "onSeekPre");
    FtsWebVideoView.c(this.uhl).cHd();
    AppMethodBeat.o(5826);
  }

  public final void oA(int paramInt)
  {
    AppMethodBeat.i(5827);
    ab.i("MicroMsg.FtsWebVideoView", "onSeekTo %d", new Object[] { Integer.valueOf(paramInt) });
    this.uhl.ar(paramInt, false);
    FtsWebVideoView.c(this.uhl).aFE();
    if (FtsWebVideoView.h(this.uhl) != null)
      FtsWebVideoView.h(this.uhl).cWB();
    AppMethodBeat.o(5827);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView.4
 * JD-Core Version:    0.6.2
 */