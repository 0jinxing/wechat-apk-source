package com.tencent.mm.plugin.record.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class RecordMsgBaseUI$3
  implements Runnable
{
  RecordMsgBaseUI$3(RecordMsgBaseUI paramRecordMsgBaseUI, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24233);
    View localView = this.pKx.gGW.getChildAt(this.pKx.gGW.getLastVisiblePosition());
    if (localView != null)
    {
      int i = localView.getBottom();
      int j = this.pKx.gGW.getBottom();
      int k = a.fromDPToPix(this.pKx.mController.ylL, 64);
      ab.d("MicroMsg.RecordMsgBaseUI", "lastBotm %s, listBotm %s, listEndmargin %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
      if (i < j - k)
      {
        i = j - i - k;
        ab.d("MicroMsg.RecordMsgBaseUI", "offset %d", new Object[] { Integer.valueOf(i) });
        this.pKy.setPadding(0, i, 0, 0);
      }
    }
    this.pKx.gGW.addFooterView(this.pKy, null, false);
    AppMethodBeat.o(24233);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgBaseUI.3
 * JD-Core Version:    0.6.2
 */