package com.tencent.mm.plugin.webview.fts.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FtsWebVideoView$8
  implements View.OnClickListener
{
  FtsWebVideoView$8(FtsWebVideoView paramFtsWebVideoView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(5833);
    if (FtsWebVideoView.a(this.uhl) == FtsWebVideoView.c.uhr)
      FtsWebVideoView.b(this.uhl);
    this.uhl.cg(true);
    AppMethodBeat.o(5833);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView.8
 * JD-Core Version:    0.6.2
 */