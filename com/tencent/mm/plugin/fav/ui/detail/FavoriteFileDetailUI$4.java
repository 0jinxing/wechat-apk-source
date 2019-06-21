package com.tencent.mm.plugin.fav.ui.detail;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class FavoriteFileDetailUI$4
  implements e.a
{
  FavoriteFileDetailUI$4(FavoriteFileDetailUI paramFavoriteFileDetailUI)
  {
  }

  public final void EA()
  {
  }

  public final int dG(int paramInt1, int paramInt2)
  {
    return 0;
  }

  public final void dH(int paramInt1, int paramInt2)
  {
  }

  public final void onError(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(74326);
    FavoriteFileDetailUI.p(this.mlX).stop();
    if (FavoriteFileDetailUI.q(this.mlX))
      AppMethodBeat.o(74326);
    while (true)
    {
      return;
      FavoriteFileDetailUI.r(this.mlX);
      al.d(new FavoriteFileDetailUI.4.1(this));
      AppMethodBeat.o(74326);
    }
  }

  public final void pL()
  {
    AppMethodBeat.i(74325);
    ab.d("MicroMsg.FavoriteFileDetailUI", g.Mp() + " onPrepared");
    FavoriteFileDetailUI.p(this.mlX).setLoop(true);
    FavoriteFileDetailUI.p(this.mlX).start();
    AppMethodBeat.o(74325);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.4
 * JD-Core Version:    0.6.2
 */