package com.tencent.mm.plugin.record.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.d;

final class RecordMsgDetailUI$3
  implements MenuItem.OnMenuItemClickListener
{
  RecordMsgDetailUI$3(RecordMsgDetailUI paramRecordMsgDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(24238);
    paramMenuItem = new d(this.pKD.mController.ylL, 1, false);
    paramMenuItem.rBl = new RecordMsgDetailUI.3.1(this);
    paramMenuItem.rBm = new RecordMsgDetailUI.3.2(this);
    paramMenuItem.cpD();
    AppMethodBeat.o(24238);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgDetailUI.3
 * JD-Core Version:    0.6.2
 */