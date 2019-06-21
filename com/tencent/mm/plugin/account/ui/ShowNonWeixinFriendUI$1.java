package com.tencent.mm.plugin.account.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShowNonWeixinFriendUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ShowNonWeixinFriendUI$1(ShowNonWeixinFriendUI paramShowNonWeixinFriendUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(125584);
    this.gIm.aqX();
    this.gIm.finish();
    AppMethodBeat.o(125584);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.ShowNonWeixinFriendUI.1
 * JD-Core Version:    0.6.2
 */