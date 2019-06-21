package com.tencent.mm.ui.contact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMSlideDelView.f;

final class ChatroomContactUI$10
  implements MMSlideDelView.f
{
  ChatroomContactUI$10(ChatroomContactUI paramChatroomContactUI)
  {
  }

  public final void bN(Object paramObject)
  {
    AppMethodBeat.i(33582);
    if (paramObject == null)
    {
      ab.e("MicroMsg.ChatroomContactUI", "onItemDel object null");
      AppMethodBeat.o(33582);
    }
    while (true)
    {
      return;
      ChatroomContactUI.arN(paramObject.toString());
      ChatroomContactUI.c(this.zls);
      AppMethodBeat.o(33582);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ChatroomContactUI.10
 * JD-Core Version:    0.6.2
 */