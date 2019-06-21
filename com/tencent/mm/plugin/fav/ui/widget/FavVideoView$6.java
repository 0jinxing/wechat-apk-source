package com.tencent.mm.plugin.fav.ui.widget;

import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

final class FavVideoView$6
  implements Runnable
{
  FavVideoView$6(FavVideoView paramFavVideoView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74719);
    if ((FavVideoView.d(this.mqn) != null) && (FavVideoView.d(this.mqn).getVisibility() != 8))
      FavVideoView.d(this.mqn).setVisibility(8);
    if ((FavVideoView.e(this.mqn) != null) && (FavVideoView.e(this.mqn).getVisibility() != 8))
      FavVideoView.e(this.mqn).setVisibility(8);
    AppMethodBeat.o(74719);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.FavVideoView.6
 * JD-Core Version:    0.6.2
 */