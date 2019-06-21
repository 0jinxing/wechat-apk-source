package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsUserUI$3
  implements MenuItem.OnMenuItemClickListener
{
  SnsUserUI$3(SnsUserUI paramSnsUserUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(39787);
    paramMenuItem = new Intent();
    paramMenuItem.setClass(this.rDa, SnsMsgUI.class);
    paramMenuItem.putExtra("sns_msg_force_show_all", true);
    this.rDa.startActivityForResult(paramMenuItem, 8);
    AppMethodBeat.o(39787);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUserUI.3
 * JD-Core Version:    0.6.2
 */