package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;

final class FavBaseUI$9
  implements f
{
  FavBaseUI$9(FavBaseUI paramFavBaseUI)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(73934);
    ab.i("MicroMsg.FavoriteBaseUI", "on batch get end");
    if (FavBaseUI.c(this.mhG))
    {
      ab.i("MicroMsg.FavoriteBaseUI", "init currently, dismiss dialog");
      FavBaseUI.d(this.mhG);
      this.mhG.hh(false);
    }
    AppMethodBeat.o(73934);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavBaseUI.9
 * JD-Core Version:    0.6.2
 */