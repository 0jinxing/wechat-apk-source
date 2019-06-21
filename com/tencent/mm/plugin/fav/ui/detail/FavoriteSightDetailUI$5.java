package com.tencent.mm.plugin.fav.ui.detail;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;

final class FavoriteSightDetailUI$5
  implements Runnable
{
  FavoriteSightDetailUI$5(FavoriteSightDetailUI paramFavoriteSightDetailUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74420);
    if ((FavoriteSightDetailUI.a(this.mmH).isDone()) && (b.f(FavoriteSightDetailUI.b(this.mmH))) && (FavoriteSightDetailUI.d(this.mmH) != null) && (FavoriteSightDetailUI.d(this.mmH).isPlaying()))
      AppMethodBeat.o(74420);
    while (true)
    {
      return;
      FavoriteSightDetailUI.a(this.mmH, true);
      AppMethodBeat.o(74420);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI.5
 * JD-Core Version:    0.6.2
 */