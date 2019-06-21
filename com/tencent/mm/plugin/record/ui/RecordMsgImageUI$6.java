package com.tencent.mm.plugin.record.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RecordMsgImageUI$6
  implements MenuItem.OnMenuItemClickListener
{
  RecordMsgImageUI$6(RecordMsgImageUI paramRecordMsgImageUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(24300);
    this.pKQ.finish();
    AppMethodBeat.o(24300);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgImageUI.6
 * JD-Core Version:    0.6.2
 */