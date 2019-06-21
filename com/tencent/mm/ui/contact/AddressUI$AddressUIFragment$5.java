package com.tencent.mm.ui.contact;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.f;
import com.tencent.mm.ui.voicesearch.b;

final class AddressUI$AddressUIFragment$5
  implements AdapterView.OnItemLongClickListener
{
  AddressUI$AddressUIFragment$5(AddressUI.AddressUIFragment paramAddressUIFragment)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(33487);
    ab.i("MicroMsg.AddressUI", "onItemLongClick, targetview is SearchBar::ListView, pos = ".concat(String.valueOf(paramInt)));
    if (paramInt < AddressUI.AddressUIFragment.c(this.zkz).getHeaderViewsCount())
    {
      ab.w("MicroMsg.AddressUI", "on item long click, but match header view");
      AppMethodBeat.o(33487);
    }
    while (true)
    {
      return true;
      if ((AddressUI.AddressUIFragment.g(this.zkz) != null) && (AddressUI.AddressUIFragment.g(this.zkz).zLy))
      {
        AppMethodBeat.o(33487);
      }
      else
      {
        paramAdapterView = (f)AddressUI.AddressUIFragment.a(this.zkz).MG(paramInt - AddressUI.AddressUIFragment.c(this.zkz).getHeaderViewsCount());
        if (paramAdapterView == null)
        {
          ab.e("MicroMsg.AddressUI", "cont is null. position:%d, header count:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(AddressUI.AddressUIFragment.c(this.zkz).getHeaderViewsCount()) });
          AppMethodBeat.o(33487);
        }
        else
        {
          paramAdapterView = paramAdapterView.field_username;
          if ((t.ny(paramAdapterView)) || (t.nz(paramAdapterView)))
          {
            AppMethodBeat.o(33487);
          }
          else
          {
            AddressUI.AddressUIFragment.b(this.zkz, paramAdapterView);
            AddressUI.AddressUIFragment.l(this.zkz).a(paramView, paramInt, paramLong, this.zkz, AddressUI.AddressUIFragment.i(this.zkz), AddressUI.AddressUIFragment.j(this.zkz), AddressUI.AddressUIFragment.k(this.zkz));
            AppMethodBeat.o(33487);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.AddressUI.AddressUIFragment.5
 * JD-Core Version:    0.6.2
 */