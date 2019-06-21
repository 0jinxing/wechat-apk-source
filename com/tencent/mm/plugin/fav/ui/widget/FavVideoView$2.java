package com.tencent.mm.plugin.fav.ui.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class FavVideoView$2
  implements Runnable
{
  FavVideoView$2(FavVideoView paramFavVideoView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74715);
    if (FavVideoView.a(this.mqn) != null)
      this.mqn.Mj(FavVideoView.c(this.mqn));
    AppMethodBeat.o(74715);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.FavVideoView.2
 * JD-Core Version:    0.6.2
 */