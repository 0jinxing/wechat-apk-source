package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsTimeLineUI$26
  implements MenuItem.OnMenuItemClickListener
{
  SnsTimeLineUI$26(SnsTimeLineUI paramSnsTimeLineUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(39494);
    paramMenuItem = new Intent();
    paramMenuItem.setClass(this.rzs, SnsMsgUI.class);
    paramMenuItem.putExtra("sns_msg_force_show_all", true);
    this.rzs.startActivityForResult(paramMenuItem, 8);
    AppMethodBeat.o(39494);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.26
 * JD-Core Version:    0.6.2
 */