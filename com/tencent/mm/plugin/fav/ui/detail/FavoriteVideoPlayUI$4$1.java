package com.tencent.mm.plugin.fav.ui.detail;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.ui.widget.FavVideoView;
import com.tencent.mm.ui.tools.e.b;

final class FavoriteVideoPlayUI$4$1
  implements e.b
{
  FavoriteVideoPlayUI$4$1(FavoriteVideoPlayUI.4 param4)
  {
  }

  public final void onAnimationEnd()
  {
  }

  public final void onAnimationStart()
  {
    AppMethodBeat.i(74462);
    if (FavoriteVideoPlayUI.e(this.mng.mne) != null)
      FavoriteVideoPlayUI.e(this.mng.mne).onResume();
    AppMethodBeat.o(74462);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI.4.1
 * JD-Core Version:    0.6.2
 */