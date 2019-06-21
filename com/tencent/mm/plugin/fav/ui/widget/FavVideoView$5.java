package com.tencent.mm.plugin.fav.ui.widget;

import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

final class FavVideoView$5
  implements Runnable
{
  FavVideoView$5(FavVideoView paramFavVideoView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74718);
    if ((FavVideoView.d(this.mqn) != null) && (FavVideoView.d(this.mqn).getVisibility() != 0))
      FavVideoView.d(this.mqn).setVisibility(0);
    if ((FavVideoView.e(this.mqn) != null) && (FavVideoView.e(this.mqn).getVisibility() != 8))
      FavVideoView.e(this.mqn).setVisibility(8);
    AppMethodBeat.o(74718);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.FavVideoView.5
 * JD-Core Version:    0.6.2
 */