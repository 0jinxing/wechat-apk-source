package com.tencent.mm.plugin.qqmail.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MailAddrListUI$5
  implements MenuItem.OnMenuItemClickListener
{
  MailAddrListUI$5(MailAddrListUI paramMailAddrListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(68315);
    this.pyp.setResult(0);
    this.pyp.finish();
    AppMethodBeat.o(68315);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailAddrListUI.5
 * JD-Core Version:    0.6.2
 */