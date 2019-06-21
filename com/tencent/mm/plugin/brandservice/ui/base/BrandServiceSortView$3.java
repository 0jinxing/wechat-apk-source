package com.tencent.mm.plugin.brandservice.ui.base;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.aj.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.n.d;

final class BrandServiceSortView$3
  implements n.d
{
  BrandServiceSortView$3(BrandServiceSortView paramBrandServiceSortView)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(14060);
    if (bo.isNullOrNil(BrandServiceSortView.d(this.jMW)))
    {
      ab.i("MicroMsg.BrandServiceSortView", "username is null or nil.");
      AppMethodBeat.o(14060);
    }
    while (true)
    {
      return;
      if (paramMenuItem.getItemId() == 0)
      {
        ab.i("MicroMsg.BrandServiceSortView", "Menu Item selected, pos(%d)", new Object[] { Integer.valueOf(paramInt) });
        ad localad = ((j)g.K(j.class)).XM().aoO(BrandServiceSortView.d(this.jMW));
        d locald = f.qX(BrandServiceSortView.d(this.jMW));
        BrandServiceSortView.a(this.jMW, locald, this.jMW.getContext(), localad, paramMenuItem.getGroupId());
      }
      AppMethodBeat.o(14060);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView.3
 * JD-Core Version:    0.6.2
 */