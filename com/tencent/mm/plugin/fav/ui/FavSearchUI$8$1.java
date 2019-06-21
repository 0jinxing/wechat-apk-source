package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.ui.a.b;
import com.tencent.mm.plugin.fav.ui.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class FavSearchUI$8$1
  implements Runnable
{
  FavSearchUI$8$1(FavSearchUI.8 param8, List paramList1, List paramList2, List paramList3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74072);
    if ((this.mjp.isEmpty()) && (this.mjq.isEmpty()) && (FavSearchUI.e(this.mjs.mjo)))
    {
      FavSearchUI.a(this.mjs.mjo, false);
      FavSearchUI.a(this.mjs.mjo, this.mjp, this.mjq);
      AppMethodBeat.o(74072);
    }
    while (true)
    {
      return;
      FavSearchUI.a(this.mjs.mjo, this.mjp, this.mjq);
      ab.d("MicroMsg.FavSearchUI", "on text changed, types %s keys %s tags %s", new Object[] { this.mjr, this.mjp, this.mjq });
      FavSearchUI.b(this.mjs.mjo, this.mjp);
      FavSearchUI.c(this.mjs.mjo, this.mjq);
      FavSearchUI.d(this.mjs.mjo, this.mjr);
      FavSearchUI.f(this.mjs.mjo).bQ(this.mjq);
      FavSearchUI.g(this.mjs.mjo).c(this.mjr, this.mjp, this.mjq);
      FavSearchUI.b(this.mjs.mjo, false);
      AppMethodBeat.o(74072);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavSearchUI.8.1
 * JD-Core Version:    0.6.2
 */