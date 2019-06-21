package com.tencent.mm.plugin.qqmail.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;

final class MailImageDownloadUI$1
  implements MenuItem.OnMenuItemClickListener
{
  MailImageDownloadUI$1(MailImageDownloadUI paramMailImageDownloadUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(68381);
    g.RO().eJo.c(MailImageDownloadUI.a(this.pze));
    this.pze.finish();
    AppMethodBeat.o(68381);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailImageDownloadUI.1
 * JD-Core Version:    0.6.2
 */