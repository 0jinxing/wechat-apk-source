package com.tencent.mm.plugin.fav.ui.detail;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.ui.widget.FavVideoView;
import com.tencent.mm.ui.tools.e;

final class FavoriteVideoPlayUI$4
  implements ViewTreeObserver.OnPreDrawListener
{
  FavoriteVideoPlayUI$4(FavoriteVideoPlayUI paramFavoriteVideoPlayUI)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(74463);
    FavoriteVideoPlayUI.e(this.mne).getViewTreeObserver().removeOnPreDrawListener(this);
    FavoriteVideoPlayUI.g(this.mne).a(FavoriteVideoPlayUI.e(this.mne), FavoriteVideoPlayUI.f(this.mne), new FavoriteVideoPlayUI.4.1(this));
    AppMethodBeat.o(74463);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI.4
 * JD-Core Version:    0.6.2
 */