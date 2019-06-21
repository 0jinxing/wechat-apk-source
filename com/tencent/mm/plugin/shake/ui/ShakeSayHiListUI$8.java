package com.tencent.mm.plugin.shake.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.tools.j;

final class ShakeSayHiListUI$8
  implements AdapterView.OnItemLongClickListener
{
  ShakeSayHiListUI$8(ShakeSayHiListUI paramShakeSayHiListUI, j paramj)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(24881);
    if (paramInt < ShakeSayHiListUI.d(this.qwt).getHeaderViewsCount())
    {
      ab.w("MicroMsg.SayHiListUI", "on header view long click, ignore");
      AppMethodBeat.o(24881);
    }
    while (true)
    {
      return true;
      this.jKd.a(paramView, paramInt, paramLong, this.qwt, ShakeSayHiListUI.f(this.qwt));
      AppMethodBeat.o(24881);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI.8
 * JD-Core Version:    0.6.2
 */