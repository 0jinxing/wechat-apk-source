package com.tencent.mm.plugin.qqmail.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MailWebViewUI$5
  implements MenuItem.OnMenuItemClickListener
{
  MailWebViewUI$5(MailWebViewUI paramMailWebViewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(68399);
    this.pzh.finish();
    AppMethodBeat.o(68399);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailWebViewUI.5
 * JD-Core Version:    0.6.2
 */