package com.tencent.mm.plugin.ipcall.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.g.m;
import com.tencent.mm.ui.tools.j;

final class e$5
  implements AdapterView.OnItemLongClickListener
{
  e$5(e parame)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(22037);
    paramView = this.nBc.nAT;
    if (paramView.nDZ == null)
      paramView.nDZ = m.bIb();
    paramView = this.nBc.nAT.xt(paramInt - ((ListView)paramAdapterView).getHeaderViewsCount());
    e locale = this.nBc;
    int i = ((ListView)paramAdapterView).getHeaderViewsCount();
    if (paramView != null)
    {
      paramAdapterView = new j(locale.nAV);
      paramAdapterView.rBl = new e.8(locale);
      paramAdapterView.rBm = new e.9(locale, paramView, paramInt - i);
      paramAdapterView.cuu();
    }
    AppMethodBeat.o(22037);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.e.5
 * JD-Core Version:    0.6.2
 */