package com.tencent.mm.ui.bizchat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.c.a;
import com.tencent.mm.aj.c.a.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.g;

final class BizChatConversationUI$BizChatConversationFmUI$14
  implements c.a
{
  BizChatConversationUI$BizChatConversationFmUI$14(BizChatConversationUI.BizChatConversationFmUI paramBizChatConversationFmUI)
  {
  }

  public final void a(c.a.a parama)
  {
    AppMethodBeat.i(30071);
    String str = BizChatConversationUI.BizChatConversationFmUI.d(this.yEp);
    if ((parama != null) && (!bo.isNullOrNil(parama.fuO)) && (parama.fuO.equals(str)))
    {
      int i = BizChatConversationUI.BizChatConversationFmUI.l(this.yEp);
      BizChatConversationUI.BizChatConversationFmUI.c(this.yEp, g.bK(this.yEp.getContext(), str));
      if (BizChatConversationUI.BizChatConversationFmUI.l(this.yEp) != i)
        BizChatConversationUI.BizChatConversationFmUI.r(this.yEp);
    }
    AppMethodBeat.o(30071);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI.14
 * JD-Core Version:    0.6.2
 */