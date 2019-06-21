package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.b.a;

final class SnsMsgUI$2
  implements AdapterView.OnItemLongClickListener
{
  SnsMsgUI$2(SnsMsgUI paramSnsMsgUI)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(39066);
    if (paramInt < SnsMsgUI.c(this.rub).getHeaderViewsCount())
    {
      ab.w("MicroMsg.SnsMsgUI", "on header view long click, ignore");
      AppMethodBeat.o(39066);
    }
    while (true)
    {
      return true;
      new a(this.rub).a(paramView, paramInt, paramLong, this.rub, SnsMsgUI.k(this.rub), SnsMsgUI.j(this.rub)[0], SnsMsgUI.j(this.rub)[1]);
      AppMethodBeat.o(39066);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsMsgUI.2
 * JD-Core Version:    0.6.2
 */