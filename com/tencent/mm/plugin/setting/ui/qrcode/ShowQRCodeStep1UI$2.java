package com.tencent.mm.plugin.setting.ui.qrcode;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class ShowQRCodeStep1UI$2
  implements MenuItem.OnMenuItemClickListener
{
  ShowQRCodeStep1UI$2(ShowQRCodeStep1UI paramShowQRCodeStep1UI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(126932);
    paramMenuItem = this.qkF;
    String str1 = paramMenuItem.getString(2131302913);
    String str2 = paramMenuItem.getString(2131302917);
    ShowQRCodeStep1UI.4 local4 = new ShowQRCodeStep1UI.4(paramMenuItem);
    h.a(paramMenuItem, "", new String[] { str1, str2 }, "", false, local4);
    AppMethodBeat.o(126932);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI.2
 * JD-Core Version:    0.6.2
 */