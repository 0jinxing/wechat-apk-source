package com.tencent.mm.plugin.scanner.history.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ScannerHistoryUI$3
  implements AdapterView.OnItemLongClickListener
{
  ScannerHistoryUI$3(ScannerHistoryUI paramScannerHistoryUI)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(80802);
    if (paramInt == 0)
    {
      ab.i("MicroMsg.ScannerHistoryUI", "onItemLongClick pos is 0");
      AppMethodBeat.o(80802);
    }
    while (true)
    {
      return true;
      int i = paramInt;
      if (paramInt > 0)
        i = paramInt - 1;
      if (i >= ScannerHistoryUI.a(this.pZg).getCount())
      {
        AppMethodBeat.o(80802);
      }
      else
      {
        ScannerHistoryUI.b(this.pZg, i);
        AppMethodBeat.o(80802);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI.3
 * JD-Core Version:    0.6.2
 */