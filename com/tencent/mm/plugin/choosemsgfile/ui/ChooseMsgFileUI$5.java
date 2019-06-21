package com.tencent.mm.plugin.choosemsgfile.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ChooseMsgFileUI$5
  implements MenuItem.OnMenuItemClickListener
{
  ChooseMsgFileUI$5(ChooseMsgFileUI paramChooseMsgFileUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(54448);
    paramMenuItem = new Intent();
    paramMenuItem.putExtra("ERRMSG", "cancel");
    this.kvQ.setResult(1, paramMenuItem);
    this.kvQ.finish();
    AppMethodBeat.o(54448);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI.5
 * JD-Core Version:    0.6.2
 */