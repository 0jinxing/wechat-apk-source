package com.tencent.mm.ui.contact;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout.b;
import com.tencent.mm.sdk.platformtools.ab;

final class ChatroomContactUI$5
  implements VoiceSearchLayout.b
{
  ChatroomContactUI$5(ChatroomContactUI paramChatroomContactUI)
  {
  }

  public final void dd(boolean paramBoolean)
  {
    AppMethodBeat.i(33576);
    ab.d("MicroMsg.ChatroomContactUI", "visible ".concat(String.valueOf(paramBoolean)));
    if (paramBoolean)
    {
      int i = ChatroomContactUI.b(this.zls).getFirstVisiblePosition();
      ab.d("MicroMsg.ChatroomContactUI", "getFirstVisiblePosition  ".concat(String.valueOf(i)));
      if (i > 0)
        ChatroomContactUI.b(this.zls).post(new ChatroomContactUI.5.1(this));
    }
    AppMethodBeat.o(33576);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ChatroomContactUI.5
 * JD-Core Version:    0.6.2
 */