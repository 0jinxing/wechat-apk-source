package com.tencent.mm.ui.bizchat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.c;
import com.tencent.mm.aj.a.d.a;
import com.tencent.mm.aj.a.d.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class BizChatConversationUI$BizChatConversationFmUI$13
  implements d.a
{
  BizChatConversationUI$BizChatConversationFmUI$13(BizChatConversationUI.BizChatConversationFmUI paramBizChatConversationFmUI)
  {
  }

  public final void a(d.a.b paramb)
  {
    AppMethodBeat.i(30070);
    if ((paramb != null) && (paramb.fxB != null) && (BizChatConversationUI.BizChatConversationFmUI.a(this.yEp).equals(paramb.fxB.field_brandUserName)))
    {
      ab.i("MicroMsg.BizChatConversationFmUI", "bizChatExtension bizChat change");
      BizChatConversationUI.BizChatConversationFmUI.b(this.yEp).mY(paramb.fxq);
      if (BizChatConversationUI.BizChatConversationFmUI.q(this.yEp))
        BizChatConversationUI.BizChatConversationFmUI.b(this.yEp).KC();
    }
    AppMethodBeat.o(30070);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI.13
 * JD-Core Version:    0.6.2
 */