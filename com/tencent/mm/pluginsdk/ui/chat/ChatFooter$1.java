package com.tencent.mm.pluginsdk.ui.chat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText;

final class ChatFooter$1
  implements m.a
{
  ChatFooter$1(ChatFooter paramChatFooter)
  {
  }

  public final void clear()
  {
    AppMethodBeat.i(27786);
    ChatFooter localChatFooter = this.vnX;
    if (localChatFooter.oij != null)
    {
      localChatFooter.oij.setText("");
      localChatFooter.dka();
    }
    AppMethodBeat.o(27786);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.1
 * JD-Core Version:    0.6.2
 */