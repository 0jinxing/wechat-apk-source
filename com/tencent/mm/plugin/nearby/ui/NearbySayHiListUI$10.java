package com.tencent.mm.plugin.nearby.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.tools.j;

final class NearbySayHiListUI$10
  implements AdapterView.OnItemLongClickListener
{
  NearbySayHiListUI$10(NearbySayHiListUI paramNearbySayHiListUI, j paramj)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(55504);
    if (paramInt < NearbySayHiListUI.d(this.oQP).getHeaderViewsCount())
    {
      ab.w("MicroMsg.SayHiListUI", "on header view long click, ignore");
      AppMethodBeat.o(55504);
    }
    while (true)
    {
      return true;
      this.jKd.a(paramView, paramInt, paramLong, this.oQP, NearbySayHiListUI.g(this.oQP));
      AppMethodBeat.o(55504);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI.10
 * JD-Core Version:    0.6.2
 */