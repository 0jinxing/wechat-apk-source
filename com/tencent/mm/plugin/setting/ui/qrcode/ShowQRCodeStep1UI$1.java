package com.tencent.mm.plugin.setting.ui.qrcode;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShowQRCodeStep1UI$1
  implements MenuItem.OnMenuItemClickListener
{
  ShowQRCodeStep1UI$1(ShowQRCodeStep1UI paramShowQRCodeStep1UI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(126931);
    this.qkF.aqX();
    this.qkF.finish();
    AppMethodBeat.o(126931);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI.1
 * JD-Core Version:    0.6.2
 */