package com.tencent.mm.plugin.fav.ui;

import android.support.v4.view.g;
import android.support.v7.widget.Toolbar.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView;

final class FavSearchUI$6
  implements Runnable
{
  FavSearchUI$6(FavSearchUI paramFavSearchUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74070);
    if (FavSearchUI.c(this.mjo) != null)
    {
      g.b(FavSearchUI.c(this.mjo));
      Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)FavSearchUI.b(this.mjo).getLayoutParams();
      if (localLayoutParams != null)
      {
        localLayoutParams.height = -1;
        localLayoutParams.width = -1;
      }
      FavSearchUI.b(this.mjo).setLayoutParams(localLayoutParams);
    }
    AppMethodBeat.o(74070);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavSearchUI.6
 * JD-Core Version:    0.6.2
 */