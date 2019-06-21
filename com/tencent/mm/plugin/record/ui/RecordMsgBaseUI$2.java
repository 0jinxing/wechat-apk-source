package com.tencent.mm.plugin.record.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RecordMsgBaseUI$2
  implements MenuItem.OnMenuItemClickListener
{
  RecordMsgBaseUI$2(RecordMsgBaseUI paramRecordMsgBaseUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(24232);
    this.pKx.finish();
    AppMethodBeat.o(24232);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgBaseUI.2
 * JD-Core Version:    0.6.2
 */