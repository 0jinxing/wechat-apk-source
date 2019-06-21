package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView;
import com.tencent.mm.plugin.fav.ui.widget.FavTagPanel;

final class FavSearchUI$4
  implements Runnable
{
  FavSearchUI$4(FavSearchUI paramFavSearchUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74068);
    if (FavSearchUI.a(this.mjo) <= 0)
    {
      FavSearchActionView localFavSearchActionView = FavSearchUI.b(this.mjo);
      if (localFavSearchActionView.mjS != null)
        localFavSearchActionView.mjS.dAc();
      this.mjo.showVKB();
    }
    AppMethodBeat.o(74068);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavSearchUI.4
 * JD-Core Version:    0.6.2
 */