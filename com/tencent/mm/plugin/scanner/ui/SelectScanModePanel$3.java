package com.tencent.mm.plugin.scanner.ui;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SelectScanModePanel$3
  implements AdapterView.OnItemClickListener
{
  SelectScanModePanel$3(SelectScanModePanel paramSelectScanModePanel)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    boolean bool1 = true;
    AppMethodBeat.i(81333);
    boolean bool2;
    if ((paramAdapterView == null) || (SelectScanModePanel.e(this.qgR) == null))
    {
      paramView = new StringBuilder("parent == null ? ");
      if (paramAdapterView == null)
      {
        bool2 = true;
        paramAdapterView = paramView.append(bool2).append(", context == null ? ");
        if (SelectScanModePanel.e(this.qgR) != null)
          break label91;
        bool2 = bool1;
        label65: ab.e("MicroMsg.scanner.SelectScanModePanel", bool2);
        AppMethodBeat.o(81333);
      }
    }
    while (true)
    {
      return;
      bool2 = false;
      break;
      label91: bool2 = false;
      break label65;
      paramView = (SelectScanModeGrid.b)paramAdapterView.getAdapter().getItem(paramInt);
      if (paramView == null)
      {
        ab.e("MicroMsg.scanner.SelectScanModePanel", "clickItem == null");
        AppMethodBeat.o(81333);
      }
      else
      {
        ((SelectScanModeGrid.a)paramAdapterView.getAdapter()).qgq = paramInt;
        ab.d("MicroMsg.scanner.SelectScanModePanel", "position=[%s], clickItem=[%s]", new Object[] { Integer.valueOf(paramInt), paramView.title });
        if ((SelectScanModePanel.f(this.qgR) != null) && (paramView != null))
          SelectScanModePanel.f(this.qgR).BX(paramView.qgv);
        this.qgR.setSelectedMode(paramView.qgv);
        AppMethodBeat.o(81333);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.SelectScanModePanel.3
 * JD-Core Version:    0.6.2
 */