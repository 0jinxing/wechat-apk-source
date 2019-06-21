package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.c.a;
import com.tencent.mm.aj.c.a.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.g;

final class EnterpriseConversationUI$EnterpriseConversationFmUI$10
  implements c.a
{
  EnterpriseConversationUI$EnterpriseConversationFmUI$10(EnterpriseConversationUI.EnterpriseConversationFmUI paramEnterpriseConversationFmUI)
  {
  }

  public final void a(c.a.a parama)
  {
    AppMethodBeat.i(34428);
    if ((parama != null) && (!bo.isNullOrNil(parama.fuO)) && (parama.fuO.equals(EnterpriseConversationUI.EnterpriseConversationFmUI.c(this.zut))))
    {
      int i = EnterpriseConversationUI.EnterpriseConversationFmUI.e(this.zut);
      EnterpriseConversationUI.EnterpriseConversationFmUI.b(this.zut, g.bK(this.zut.getContext(), EnterpriseConversationUI.EnterpriseConversationFmUI.c(this.zut)));
      if (EnterpriseConversationUI.EnterpriseConversationFmUI.e(this.zut) != i)
        EnterpriseConversationUI.EnterpriseConversationFmUI.q(this.zut);
    }
    AppMethodBeat.o(34428);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI.10
 * JD-Core Version:    0.6.2
 */