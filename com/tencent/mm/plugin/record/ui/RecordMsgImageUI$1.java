package com.tencent.mm.plugin.record.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.record.b.n;
import java.util.List;

final class RecordMsgImageUI$1
  implements AdapterView.OnItemSelectedListener
{
  RecordMsgImageUI$1(RecordMsgImageUI paramRecordMsgImageUI)
  {
  }

  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(24294);
    if (n.d(RecordMsgImageUI.a(this.pKQ).BI(paramInt), RecordMsgImageUI.b(this.pKQ)))
    {
      this.pKQ.setMMTitle(String.format("%d/%d", new Object[] { Integer.valueOf(paramInt + 1), Integer.valueOf(RecordMsgImageUI.c(this.pKQ).size()) }));
      this.pKQ.enableOptionMenu(true);
      AppMethodBeat.o(24294);
    }
    while (true)
    {
      return;
      this.pKQ.enableOptionMenu(false);
      AppMethodBeat.o(24294);
    }
  }

  public final void onNothingSelected(AdapterView<?> paramAdapterView)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgImageUI.1
 * JD-Core Version:    0.6.2
 */