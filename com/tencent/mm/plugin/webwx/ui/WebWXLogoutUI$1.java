package com.tencent.mm.plugin.webwx.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebWXLogoutUI$1
  implements MenuItem.OnMenuItemClickListener
{
  WebWXLogoutUI$1(WebWXLogoutUI paramWebWXLogoutUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(26538);
    this.uLG.finish();
    AppMethodBeat.o(26538);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.ui.WebWXLogoutUI.1
 * JD-Core Version:    0.6.2
 */