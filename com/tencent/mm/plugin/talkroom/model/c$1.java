package com.tencent.mm.plugin.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class c$1
  implements Runnable
{
  c$1(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25765);
    b.cEg();
    ab.v("MicroMsg.TalkRoomDisplayMgr", "yy dismissStatusBar");
    b.cEg();
    c.cEo();
    AppMethodBeat.o(25765);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.model.c.1
 * JD-Core Version:    0.6.2
 */