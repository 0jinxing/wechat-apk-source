package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.ui.a.a;

final class FavBaseUI$2
  implements Runnable
{
  FavBaseUI$2(FavBaseUI paramFavBaseUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(73927);
    synchronized (FavBaseUI.g(this.mhG))
    {
      this.mhG.bvv();
      this.mhG.bvu().bvY();
      this.mhG.bvz();
      AppMethodBeat.o(73927);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavBaseUI.2
 * JD-Core Version:    0.6.2
 */