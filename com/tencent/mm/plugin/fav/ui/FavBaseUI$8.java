package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.fav.a.aj;
import com.tencent.mm.sdk.platformtools.ab;

final class FavBaseUI$8
  implements f
{
  FavBaseUI$8(FavBaseUI paramFavBaseUI)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(73933);
    ab.i("MicroMsg.FavoriteBaseUI", "on fav sync end");
    if (((aj)paramm).mgl)
    {
      ab.i("MicroMsg.FavoriteBaseUI", "need batch get return");
      AppMethodBeat.o(73933);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.FavoriteBaseUI", "dismiss loading dialog");
      if (FavBaseUI.c(this.mhG))
        FavBaseUI.d(this.mhG);
      this.mhG.hh(false);
      this.mhG.bvz();
      AppMethodBeat.o(73933);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavBaseUI.8
 * JD-Core Version:    0.6.2
 */