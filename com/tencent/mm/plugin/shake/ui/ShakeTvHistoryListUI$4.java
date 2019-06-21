package com.tencent.mm.plugin.shake.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.j;

final class ShakeTvHistoryListUI$4
  implements AdapterView.OnItemLongClickListener
{
  ShakeTvHistoryListUI$4(ShakeTvHistoryListUI paramShakeTvHistoryListUI, j paramj)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(24896);
    if (paramInt < ShakeTvHistoryListUI.b(this.qwx).getHeaderViewsCount())
      AppMethodBeat.o(24896);
    while (true)
    {
      return true;
      this.jKd.a(paramView, paramInt, paramLong, this.qwx.mController.ylL, ShakeTvHistoryListUI.c(this.qwx));
      AppMethodBeat.o(24896);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI.4
 * JD-Core Version:    0.6.2
 */