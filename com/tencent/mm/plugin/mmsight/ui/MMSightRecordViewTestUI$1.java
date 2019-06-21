package com.tencent.mm.plugin.mmsight.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMSightRecordViewTestUI$1
  implements MenuItem.OnMenuItemClickListener
{
  MMSightRecordViewTestUI$1(MMSightRecordViewTestUI paramMMSightRecordViewTestUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(55117);
    this.oBu.finish();
    AppMethodBeat.o(55117);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI.1
 * JD-Core Version:    0.6.2
 */