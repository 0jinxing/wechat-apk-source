package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class FavCleanUI$6
  implements f
{
  FavCleanUI$6(FavCleanUI paramFavCleanUI)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(73958);
    ab.i("MicroMsg.FavCleanUI", "on getfavinfo scene end");
    if (FavCleanUI.f(this.mhW) != null)
      FavCleanUI.f(this.mhW).mpx = b.buh();
    AppMethodBeat.o(73958);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavCleanUI.6
 * JD-Core Version:    0.6.2
 */