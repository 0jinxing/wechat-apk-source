package com.tencent.mm.ui.transmit;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.k;
import com.tencent.mm.sdk.platformtools.ab;

final class MMCreateChatroomUI$1
  implements MenuItem.OnMenuItemClickListener
{
  MMCreateChatroomUI$1(MMCreateChatroomUI paramMMCreateChatroomUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(35040);
    if (!MMCreateChatroomUI.a(this.zIQ))
    {
      MMCreateChatroomUI.a(this.zIQ, true);
      MMCreateChatroomUI.b(this.zIQ);
      if (MMCreateChatroomUI.c(this.zIQ) == 3)
      {
        MMCreateChatroomUI.d(this.zIQ);
        k.hA(true);
      }
    }
    ab.i("MicroMsg.MMCreateChatroomUI", "Create the chatroom");
    AppMethodBeat.o(35040);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MMCreateChatroomUI.1
 * JD-Core Version:    0.6.2
 */