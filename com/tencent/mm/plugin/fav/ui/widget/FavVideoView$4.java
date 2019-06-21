package com.tencent.mm.plugin.fav.ui.widget;

import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

final class FavVideoView$4
  implements Runnable
{
  FavVideoView$4(FavVideoView paramFavVideoView, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74717);
    if ((FavVideoView.d(this.mqn) != null) && (FavVideoView.d(this.mqn).getVisibility() != 8))
      FavVideoView.d(this.mqn).setVisibility(8);
    if (FavVideoView.e(this.mqn) != null)
    {
      if (FavVideoView.e(this.mqn).getVisibility() != 0)
        FavVideoView.e(this.mqn).setVisibility(0);
      ab.i("MicroMsg.FavVideoView", "download video update progress offset:%d  total: %d", new Object[] { Integer.valueOf(this.fzv), Integer.valueOf(this.fFn) });
      if ((FavVideoView.e(this.mqn).getMax() != this.fFn) && (this.fFn > 0))
        FavVideoView.e(this.mqn).setMax(this.fFn);
      FavVideoView.e(this.mqn).setProgress(this.fzv);
    }
    AppMethodBeat.o(74717);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.FavVideoView.4
 * JD-Core Version:    0.6.2
 */