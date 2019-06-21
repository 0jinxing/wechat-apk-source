package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.c.b.v;
import com.tencent.mm.ui.chatting.d.a;

final class ChattingUIFragment$5
  implements Runnable
{
  String username;
  v yLw;

  ChattingUIFragment$5(ChattingUIFragment paramChattingUIFragment)
  {
    AppMethodBeat.i(30834);
    this.yLw = ((v)this.yLv.cgL.aF(v.class));
    this.username = this.yLv.cgL.getTalkerUserName();
    AppMethodBeat.o(30834);
  }

  public final void run()
  {
    AppMethodBeat.i(30835);
    long l = System.currentTimeMillis();
    if (this.yLw == null)
    {
      ab.e("MicroMsg.ChattingUIFragment", "messBoxComponent == null! without writeOpLogAndMarkRead!");
      AppMethodBeat.o(30835);
    }
    while (true)
    {
      return;
      this.yLw.arp(this.username);
      ab.i("MicroMsg.ChattingUIFragment", "ChattingUI writeOpLogAndMarkRead last : %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(30835);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingUIFragment.5
 * JD-Core Version:    0.6.2
 */