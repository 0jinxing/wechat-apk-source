package com.tencent.mm.plugin.account.bind.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BindGoogleContactUI$1
  implements MenuItem.OnMenuItemClickListener
{
  BindGoogleContactUI$1(BindGoogleContactUI paramBindGoogleContactUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(13347);
    this.gqC.finish();
    AppMethodBeat.o(13347);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI.1
 * JD-Core Version:    0.6.2
 */