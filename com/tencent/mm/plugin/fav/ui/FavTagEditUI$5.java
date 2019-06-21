package com.tencent.mm.plugin.fav.ui;

import android.util.SparseArray;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.l;
import com.tencent.mm.plugin.fav.ui.a.c;
import com.tencent.mm.plugin.fav.ui.a.d;
import com.tencent.mm.plugin.fav.ui.widget.FavTagPanel;
import com.tencent.mm.protocal.protobuf.abp;
import com.tencent.mm.protocal.protobuf.abq;
import com.tencent.mm.protocal.protobuf.abr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMTagPanel.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class FavTagEditUI$5
  implements MMTagPanel.a
{
  FavTagEditUI$5(FavTagEditUI paramFavTagEditUI)
  {
  }

  public final void JR(String paramString)
  {
    AppMethodBeat.i(74141);
    FavTagEditUI.d(this.mjZ).removeTag(paramString);
    FavTagEditUI.f(this.mjZ).Mf(paramString);
    if (FavTagEditUI.g(this.mjZ) != null)
      FavTagEditUI.g(this.mjZ).cd(paramString, false);
    FavTagEditUI.c(this.mjZ);
    AppMethodBeat.o(74141);
  }

  public final void JS(String paramString)
  {
  }

  public final void JT(String paramString)
  {
    AppMethodBeat.i(74142);
    FavTagEditUI.d(this.mjZ).removeTag(paramString);
    FavTagEditUI.f(this.mjZ).Mf(paramString);
    if (FavTagEditUI.g(this.mjZ) != null)
      FavTagEditUI.g(this.mjZ).cd(paramString, false);
    FavTagEditUI.c(this.mjZ);
    AppMethodBeat.o(74142);
  }

  public final void JU(String paramString)
  {
    AppMethodBeat.i(74143);
    if (!bo.isNullOrNil(paramString))
    {
      d locald = FavTagEditUI.h(this.mjZ);
      locald.mly.clear();
      locald.mlx.clear();
      locald.kPJ = bo.bc(paramString, "");
      Object localObject = ((ae)g.M(ae.class)).getFavTagSetMgr();
      boolean bool = bo.isNullOrNil(paramString);
      ArrayList localArrayList = new ArrayList(16);
      localObject = ((l)localObject).mfn.wiH.iterator();
      while (((Iterator)localObject).hasNext())
      {
        Iterator localIterator = ((abq)((Iterator)localObject).next()).wiG.iterator();
        while (localIterator.hasNext())
        {
          abp localabp = (abp)localIterator.next();
          if ((bool) || (localabp.rMJ.contains(paramString)))
            localArrayList.add(localabp.rMJ);
        }
      }
      locald.mlx.addAll(localArrayList);
      locald.notifyDataSetChanged();
      FavTagEditUI.i(this.mjZ).setVisibility(0);
      FavTagEditUI.j(this.mjZ).setVisibility(8);
    }
    while (true)
    {
      FavTagEditUI.c(this.mjZ);
      AppMethodBeat.o(74143);
      return;
      FavTagEditUI.i(this.mjZ).setVisibility(8);
      FavTagEditUI.j(this.mjZ).setVisibility(0);
    }
  }

  public final void JV(String paramString)
  {
    AppMethodBeat.i(74144);
    if (bo.isNullOrNil(paramString))
    {
      ab.d("MicroMsg.FavTagEditUI", "on create tag, fail, tag is empty");
      AppMethodBeat.o(74144);
    }
    while (true)
    {
      return;
      FavTagEditUI.d(this.mjZ).cc(paramString, true);
      FavTagEditUI.c(this.mjZ);
      AppMethodBeat.o(74144);
    }
  }

  public final void bmm()
  {
  }

  public final void q(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(74145);
    FavTagEditUI.a(this.mjZ, paramBoolean);
    TextView localTextView = FavTagEditUI.k(this.mjZ);
    if ((FavTagEditUI.b(this.mjZ)) && (paramInt > 0));
    for (int i = 0; ; i = 8)
    {
      localTextView.setVisibility(i);
      FavTagEditUI.k(this.mjZ).setText(this.mjZ.getString(2131299753, new Object[] { Integer.valueOf(paramInt) }));
      FavTagEditUI.c(this.mjZ);
      AppMethodBeat.o(74145);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavTagEditUI.5
 * JD-Core Version:    0.6.2
 */