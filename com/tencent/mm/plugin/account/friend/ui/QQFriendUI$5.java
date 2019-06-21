package com.tencent.mm.plugin.account.friend.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class QQFriendUI$5
  implements MenuItem.OnMenuItemClickListener
{
  QQFriendUI$5(QQFriendUI paramQQFriendUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(108617);
    this.gxX.aqX();
    this.gxX.finish();
    AppMethodBeat.o(108617);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.QQFriendUI.5
 * JD-Core Version:    0.6.2
 */