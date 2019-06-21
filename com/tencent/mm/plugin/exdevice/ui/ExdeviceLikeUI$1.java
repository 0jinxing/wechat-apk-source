package com.tencent.mm.plugin.exdevice.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceLikeUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ExdeviceLikeUI$1(ExdeviceLikeUI paramExdeviceLikeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(19968);
    paramMenuItem = new Intent(this.lAY, ExdeviceRankInfoUI.class);
    paramMenuItem.putExtra("app_username", ExdeviceLikeUI.a(this.lAY));
    paramMenuItem.putExtra("rank_id", "#");
    paramMenuItem.putExtra("key_is_latest", true);
    paramMenuItem.putExtra("device_type", 1);
    this.lAY.startActivity(paramMenuItem);
    this.lAY.finish();
    AppMethodBeat.o(19968);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI.1
 * JD-Core Version:    0.6.2
 */