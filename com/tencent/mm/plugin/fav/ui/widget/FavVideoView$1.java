package com.tencent.mm.plugin.fav.ui.widget;

import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FavVideoView$1
  implements Runnable
{
  FavVideoView$1(FavVideoView paramFavVideoView, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74714);
    ab.i("MicroMsg.FavVideoView", "VideoPlay: switch video model isVideoPlay %b ", new Object[] { Boolean.valueOf(this.klz) });
    View localView = (View)FavVideoView.a(this.mqn);
    if (this.klz)
    {
      localView.setAlpha(1.0F);
      localView.setVisibility(0);
      FavVideoView.b(this.mqn).setVisibility(8);
      AppMethodBeat.o(74714);
    }
    while (true)
    {
      return;
      localView.setVisibility(8);
      FavVideoView.b(this.mqn).setVisibility(0);
      AppMethodBeat.o(74714);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.FavVideoView.1
 * JD-Core Version:    0.6.2
 */