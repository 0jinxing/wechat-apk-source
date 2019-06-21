package com.tencent.mm.plugin.setting.ui.qrcode;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareToQQUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ShareToQQUI$1(ShareToQQUI paramShareToQQUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(126916);
    this.qkA.aqX();
    this.qkA.finish();
    AppMethodBeat.o(126916);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI.1
 * JD-Core Version:    0.6.2
 */