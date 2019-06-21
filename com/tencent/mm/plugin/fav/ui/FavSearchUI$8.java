package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.ui.a.b;
import com.tencent.mm.plugin.fav.ui.a.c;
import com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView;
import com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class FavSearchUI$8
  implements FavSearchActionView.a
{
  FavSearchUI$8(FavSearchUI paramFavSearchUI)
  {
  }

  public final void a(String paramString, List<Integer> paramList, List<String> paramList1, List<String> paramList2)
  {
    AppMethodBeat.i(74075);
    FavSearchUI.b(this.mjo).post(new FavSearchUI.8.1(this, paramList1, paramList2, paramList));
    if (paramString != null)
    {
      FavSearchUI.a(this.mjo, paramString);
      if (FavSearchUI.g(this.mjo) == null)
        break label101;
      paramString = FavSearchUI.g(this.mjo);
      paramList = FavSearchUI.h(this.mjo);
      if (paramList == null)
        break label95;
      paramString.query = paramList;
      AppMethodBeat.o(74075);
    }
    while (true)
    {
      return;
      FavSearchUI.a(this.mjo, "");
      break;
      label95: paramString.query = "";
      label101: AppMethodBeat.o(74075);
    }
  }

  public final void a(List<Integer> paramList, List<String> paramList1, List<String> paramList2, boolean paramBoolean)
  {
    AppMethodBeat.i(74074);
    if ((paramList1.isEmpty()) && (paramList2.isEmpty()) && (FavSearchUI.e(this.mjo)))
    {
      FavSearchUI.a(this.mjo, true);
      FavSearchUI.a(this.mjo, paramList1, paramList2);
      AppMethodBeat.o(74074);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.FavSearchUI", "on search, types %s keys %s tags %s", new Object[] { paramList, paramList1, paramList2 });
      FavSearchUI.b(this.mjo, paramList1);
      FavSearchUI.c(this.mjo, paramList2);
      FavSearchUI.d(this.mjo, paramList);
      FavSearchUI.f(this.mjo).bQ(paramList2);
      if (paramBoolean)
      {
        FavSearchUI.d(this.mjo);
        FavSearchUI.a(this.mjo, paramList1, paramList2);
        AppMethodBeat.o(74074);
      }
      else
      {
        FavSearchUI.g(this.mjo).c(paramList, paramList1, paramList2);
        FavSearchUI.b(this.mjo, true);
        FavSearchUI.a(this.mjo, paramList1, paramList2);
        AppMethodBeat.o(74074);
      }
    }
  }

  public final void app()
  {
    AppMethodBeat.i(74073);
    ab.d("MicroMsg.FavSearchUI", "on enter search, show tag panel");
    FavSearchUI.d(this.mjo);
    AppMethodBeat.o(74073);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavSearchUI.8
 * JD-Core Version:    0.6.2
 */