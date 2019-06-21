package com.tencent.mm.ui.bizchat;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.k;

final class BizChatConversationUI$BizChatConversationFmUI$5
  implements MenuItem.OnMenuItemClickListener
{
  BizChatConversationUI$BizChatConversationFmUI$5(BizChatConversationUI.BizChatConversationFmUI paramBizChatConversationFmUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(30061);
    if (BizChatConversationUI.BizChatConversationFmUI.k(this.yEp) != null)
    {
      BizChatConversationUI.BizChatConversationFmUI.k(this.yEp).dismiss();
      BizChatConversationUI.BizChatConversationFmUI.a(this.yEp, null);
    }
    BizChatConversationUI.BizChatConversationFmUI.a(this.yEp, new k(this.yEp.getContext()));
    BizChatConversationUI.BizChatConversationFmUI.k(this.yEp).rBl = new BizChatConversationUI.BizChatConversationFmUI.5.1(this);
    BizChatConversationUI.BizChatConversationFmUI.k(this.yEp).rBm = new BizChatConversationUI.BizChatConversationFmUI.5.2(this);
    BizChatConversationUI.BizChatConversationFmUI.k(this.yEp).gP();
    AppMethodBeat.o(30061);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI.5
 * JD-Core Version:    0.6.2
 */