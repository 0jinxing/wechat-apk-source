package com.tencent.mm.ui.bizchat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.a;
import com.tencent.mm.aj.a.b.a;
import com.tencent.mm.aj.a.b.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class BizChatConversationUI$BizChatConversationFmUI$11
  implements b.a
{
  BizChatConversationUI$BizChatConversationFmUI$11(BizChatConversationUI.BizChatConversationFmUI paramBizChatConversationFmUI)
  {
  }

  public final void a(b.a.b paramb)
  {
    AppMethodBeat.i(30068);
    if ((paramb != null) && (paramb.fxr != null) && (BizChatConversationUI.BizChatConversationFmUI.a(this.yEp).equals(paramb.fxr.field_brandUserName)))
    {
      ab.i("MicroMsg.BizChatConversationFmUI", "bizChatExtension bizChatConv change");
      BizChatConversationUI.BizChatConversationFmUI.b(this.yEp).mY(paramb.fxq);
      if (BizChatConversationUI.BizChatConversationFmUI.q(this.yEp))
        BizChatConversationUI.BizChatConversationFmUI.b(this.yEp).KC();
    }
    AppMethodBeat.o(30068);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI.11
 * JD-Core Version:    0.6.2
 */