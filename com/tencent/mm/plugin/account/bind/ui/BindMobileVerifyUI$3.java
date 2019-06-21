package com.tencent.mm.plugin.account.bind.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BindMobileVerifyUI$3
  implements MenuItem.OnMenuItemClickListener
{
  BindMobileVerifyUI$3(BindMobileVerifyUI paramBindMobileVerifyUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(13531);
    this.gst.finish();
    AppMethodBeat.o(13531);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI.3
 * JD-Core Version:    0.6.2
 */