package com.tencent.mm.plugin.qqmail.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MailAddrProfileUI$1
  implements MenuItem.OnMenuItemClickListener
{
  MailAddrProfileUI$1(MailAddrProfileUI paramMailAddrProfileUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(68333);
    this.pyx.aqX();
    this.pyx.finish();
    AppMethodBeat.o(68333);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailAddrProfileUI.1
 * JD-Core Version:    0.6.2
 */