package com.tencent.mm.plugin.choosemsgfile.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ChooseMsgFileListUI$2
  implements MenuItem.OnMenuItemClickListener
{
  ChooseMsgFileListUI$2(ChooseMsgFileListUI paramChooseMsgFileListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(54412);
    paramMenuItem = new Intent();
    paramMenuItem.putExtra("ERRMSG", "cancel");
    this.kvB.setResult(1, paramMenuItem);
    this.kvB.finish();
    this.kvB.overridePendingTransition(2131034229, 2131034227);
    AppMethodBeat.o(54412);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI.2
 * JD-Core Version:    0.6.2
 */