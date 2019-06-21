package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class n$7$1
  implements Runnable
{
  n$7$1(n.7 param7)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34601);
    ab.i("MicroMsg.RefreshHelper", "APPHasInitEvent begin");
    com.tencent.mm.g.a.a locala = new com.tencent.mm.g.a.a();
    com.tencent.mm.sdk.b.a.xxA.m(locala);
    AppMethodBeat.o(34601);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.n.7.1
 * JD-Core Version:    0.6.2
 */