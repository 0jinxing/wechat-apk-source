package com.tencent.mm.plugin.fav.ui.detail;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.tools.e.b;

final class FavoriteVideoPlayUI$5
  implements e.b
{
  FavoriteVideoPlayUI$5(FavoriteVideoPlayUI paramFavoriteVideoPlayUI)
  {
  }

  public final void onAnimationEnd()
  {
    AppMethodBeat.i(74465);
    new ak().post(new FavoriteVideoPlayUI.5.1(this));
    AppMethodBeat.o(74465);
  }

  public final void onAnimationStart()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI.5
 * JD-Core Version:    0.6.2
 */