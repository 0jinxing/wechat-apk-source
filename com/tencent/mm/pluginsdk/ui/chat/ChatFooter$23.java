package com.tencent.mm.pluginsdk.ui.chat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ChatFooter$23
  implements Runnable
{
  ChatFooter$23(ChatFooter paramChatFooter)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27814);
    if (!this.vnX.dkx())
    {
      ChatFooter.a(this.vnX, 1);
      AppMethodBeat.o(27814);
    }
    while (true)
    {
      return;
      ab.i("changelcai", "isScrolling!! pass this event!");
      AppMethodBeat.o(27814);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.23
 * JD-Core Version:    0.6.2
 */