package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.x;

final class FavSearchUI$1
  implements Runnable
{
  FavSearchUI$1(FavSearchUI paramFavSearchUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74065);
    FavSearchUI.a(this.mjo, ((ae)g.M(ae.class)).getFavItemInfoStorage().bvb());
    AppMethodBeat.o(74065);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavSearchUI.1
 * JD-Core Version:    0.6.2
 */