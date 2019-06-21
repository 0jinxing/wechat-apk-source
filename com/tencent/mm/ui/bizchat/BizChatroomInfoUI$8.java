package com.tencent.mm.ui.bizchat;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BizChatroomInfoUI$8
  implements MenuItem.OnMenuItemClickListener
{
  BizChatroomInfoUI$8(BizChatroomInfoUI paramBizChatroomInfoUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(30207);
    this.yFp.finish();
    AppMethodBeat.o(30207);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatroomInfoUI.8
 * JD-Core Version:    0.6.2
 */