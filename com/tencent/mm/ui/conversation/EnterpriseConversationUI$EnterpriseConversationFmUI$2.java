package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMSlideDelView.f;

final class EnterpriseConversationUI$EnterpriseConversationFmUI$2
  implements MMSlideDelView.f
{
  EnterpriseConversationUI$EnterpriseConversationFmUI$2(EnterpriseConversationUI.EnterpriseConversationFmUI paramEnterpriseConversationFmUI)
  {
  }

  public final void bN(Object paramObject)
  {
    AppMethodBeat.i(34418);
    if (paramObject == null)
    {
      ab.e("MicroMsg.EnterpriseConversationUI", "onItemDel object null");
      AppMethodBeat.o(34418);
    }
    while (true)
    {
      return;
      paramObject = paramObject.toString();
      EnterpriseConversationUI.EnterpriseConversationFmUI.a(this.zut, paramObject);
      AppMethodBeat.o(34418);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI.2
 * JD-Core Version:    0.6.2
 */