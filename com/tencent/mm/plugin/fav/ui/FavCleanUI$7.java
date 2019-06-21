package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.ui.a.b;

final class FavCleanUI$7
  implements Runnable
{
  FavCleanUI$7(FavCleanUI paramFavCleanUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(73959);
    if (FavCleanUI.e(this.mhW) != null)
      FavCleanUI.e(this.mhW).bvX();
    this.mhW.bvz();
    AppMethodBeat.o(73959);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavCleanUI.7
 * JD-Core Version:    0.6.2
 */