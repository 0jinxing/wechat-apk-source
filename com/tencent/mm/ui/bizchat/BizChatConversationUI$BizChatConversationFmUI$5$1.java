package com.tencent.mm.ui.bizchat;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ah;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.g;

final class BizChatConversationUI$BizChatConversationFmUI$5$1
  implements n.c
{
  BizChatConversationUI$BizChatConversationFmUI$5$1(BizChatConversationUI.BizChatConversationFmUI.5 param5)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(30059);
    if (BizChatConversationUI.BizChatConversationFmUI.l(this.yEq.yEp) == 1)
    {
      paraml.ax(2, 2131299240, 2131230733);
      g.t(this.yEq.yEp.getContext(), BizChatConversationUI.BizChatConversationFmUI.a(this.yEq.yEp), 6);
    }
    paraml.ax(1, 2131297689, 2131230726);
    paraml.a(4, this.yEq.yEp.getResources().getString(2131297688), ah.f(this.yEq.yEp.getContext(), 2131230731, -1));
    paraml.a(3, this.yEq.yEp.getResources().getString(2131296398), ah.f(this.yEq.yEp.getContext(), 2131230759, -1));
    AppMethodBeat.o(30059);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI.5.1
 * JD-Core Version:    0.6.2
 */