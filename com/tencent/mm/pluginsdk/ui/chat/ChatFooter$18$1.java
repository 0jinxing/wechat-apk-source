package com.tencent.mm.pluginsdk.ui.chat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ChatFooter$18$1
  implements Runnable
{
  ChatFooter$18$1(ChatFooter.18 param18)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27807);
    ab.i("MicroMsg.ChatFooter", "reflesh smiley panel.");
    this.vnY.vnX.dkw();
    AppMethodBeat.o(27807);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.18.1
 * JD-Core Version:    0.6.2
 */