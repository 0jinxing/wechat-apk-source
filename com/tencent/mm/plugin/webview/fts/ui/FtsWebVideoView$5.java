package com.tencent.mm.plugin.webview.fts.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.ui.WebSearchWebVideoViewControlBar;

final class FtsWebVideoView$5
  implements View.OnClickListener
{
  FtsWebVideoView$5(FtsWebVideoView paramFtsWebVideoView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(5828);
    if (FtsWebVideoView.d(this.uhl).isPlaying())
    {
      FtsWebVideoView.c(this.uhl).cHd();
      this.uhl.pause();
      AppMethodBeat.o(5828);
    }
    while (true)
    {
      return;
      FtsWebVideoView.c(this.uhl).aFE();
      this.uhl.cg(true);
      AppMethodBeat.o(5828);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView.5
 * JD-Core Version:    0.6.2
 */