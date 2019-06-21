package com.tencent.mm.plugin.record.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RecordMsgFileUI$1
  implements MenuItem.OnMenuItemClickListener
{
  RecordMsgFileUI$1(RecordMsgFileUI paramRecordMsgFileUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(24252);
    this.pKI.finish();
    AppMethodBeat.o(24252);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgFileUI.1
 * JD-Core Version:    0.6.2
 */