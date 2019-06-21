package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.d.a;
import com.tencent.mm.sdk.platformtools.ab;

final class FavCleanUI$3
  implements d.a
{
  FavCleanUI$3(FavCleanUI paramFavCleanUI)
  {
  }

  public final void onFinish()
  {
    AppMethodBeat.i(73951);
    ab.i("MicroMsg.FavCleanUI", "FavCleanFirstLoader onRefreshed()");
    FavCleanUI.c(this.mhW);
    FavCleanUI.d(this.mhW);
    AppMethodBeat.o(73951);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavCleanUI.3
 * JD-Core Version:    0.6.2
 */