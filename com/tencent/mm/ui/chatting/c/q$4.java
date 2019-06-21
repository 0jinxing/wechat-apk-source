package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter.b;
import com.tencent.mm.ui.chatting.d.a;

final class q$4
  implements ChatFooter.b
{
  q$4(q paramq)
  {
  }

  public final String getTalkerUserName()
  {
    AppMethodBeat.i(31410);
    String str = this.yPW.cgL.getTalkerUserName();
    AppMethodBeat.o(31410);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.q.4
 * JD-Core Version:    0.6.2
 */