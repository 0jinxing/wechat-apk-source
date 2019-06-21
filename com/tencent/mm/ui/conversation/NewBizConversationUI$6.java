package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMSlideDelView.f;

final class NewBizConversationUI$6
  implements MMSlideDelView.f
{
  NewBizConversationUI$6(NewBizConversationUI paramNewBizConversationUI)
  {
  }

  public final void bN(Object paramObject)
  {
    AppMethodBeat.i(34537);
    if (paramObject == null)
    {
      ab.e("MicroMsg.NewBizConversationUI", "onItemDel object null");
      AppMethodBeat.o(34537);
    }
    while (true)
    {
      return;
      paramObject = paramObject.toString();
      NewBizConversationUI.b(this.zvm, paramObject);
      AppMethodBeat.o(34537);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.NewBizConversationUI.6
 * JD-Core Version:    0.6.2
 */