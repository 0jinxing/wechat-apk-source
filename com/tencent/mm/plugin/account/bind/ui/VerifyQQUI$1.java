package com.tencent.mm.plugin.account.bind.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VerifyQQUI$1
  implements MenuItem.OnMenuItemClickListener
{
  VerifyQQUI$1(VerifyQQUI paramVerifyQQUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(13777);
    this.guy.aqX();
    VerifyQQUI.a(this.guy);
    AppMethodBeat.o(13777);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.VerifyQQUI.1
 * JD-Core Version:    0.6.2
 */