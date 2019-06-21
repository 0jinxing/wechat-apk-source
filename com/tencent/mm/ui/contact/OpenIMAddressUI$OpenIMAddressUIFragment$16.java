package com.tencent.mm.ui.contact;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.voicesearch.b;

final class OpenIMAddressUI$OpenIMAddressUIFragment$16
  implements AdapterView.OnItemLongClickListener
{
  OpenIMAddressUI$OpenIMAddressUIFragment$16(OpenIMAddressUI.OpenIMAddressUIFragment paramOpenIMAddressUIFragment)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(33781);
    ab.i("MicroMsg.OpenIMAddressUI", "onItemLongClick, targetview is SearchBar::ListView, pos = ".concat(String.valueOf(paramInt)));
    if (paramInt < OpenIMAddressUI.OpenIMAddressUIFragment.c(this.zoc).getHeaderViewsCount())
    {
      ab.w("MicroMsg.OpenIMAddressUI", "on item long click, but match header view");
      AppMethodBeat.o(33781);
    }
    while (true)
    {
      return true;
      if ((OpenIMAddressUI.OpenIMAddressUIFragment.d(this.zoc) != null) && (OpenIMAddressUI.OpenIMAddressUIFragment.d(this.zoc).zLy))
      {
        AppMethodBeat.o(33781);
      }
      else
      {
        paramAdapterView = (com.tencent.mm.storage.f)OpenIMAddressUI.OpenIMAddressUIFragment.a(this.zoc).MG(paramInt - OpenIMAddressUI.OpenIMAddressUIFragment.c(this.zoc).getHeaderViewsCount());
        if (paramAdapterView == null)
        {
          ab.e("MicroMsg.OpenIMAddressUI", "cont is null. position:%d, header count:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(OpenIMAddressUI.OpenIMAddressUIFragment.c(this.zoc).getHeaderViewsCount()) });
          AppMethodBeat.o(33781);
        }
        else
        {
          paramAdapterView = paramAdapterView.field_username;
          if ((com.tencent.mm.model.t.ny(paramAdapterView)) || (com.tencent.mm.model.t.nz(paramAdapterView)))
          {
            AppMethodBeat.o(33781);
          }
          else
          {
            OpenIMAddressUI.OpenIMAddressUIFragment.b(this.zoc, paramAdapterView);
            OpenIMAddressUI.OpenIMAddressUIFragment.h(this.zoc).a(paramView, paramInt, paramLong, this.zoc, OpenIMAddressUI.OpenIMAddressUIFragment.e(this.zoc), OpenIMAddressUI.OpenIMAddressUIFragment.f(this.zoc), OpenIMAddressUI.OpenIMAddressUIFragment.g(this.zoc));
            AppMethodBeat.o(33781);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment.16
 * JD-Core Version:    0.6.2
 */