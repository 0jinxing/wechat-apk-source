package com.tencent.mm.ui.bizchat;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BizChatAtSomeoneUI$1
  implements MenuItem.OnMenuItemClickListener
{
  BizChatAtSomeoneUI$1(BizChatAtSomeoneUI paramBizChatAtSomeoneUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(30027);
    this.yDK.setResult(0);
    this.yDK.finish();
    AppMethodBeat.o(30027);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI.1
 * JD-Core Version:    0.6.2
 */