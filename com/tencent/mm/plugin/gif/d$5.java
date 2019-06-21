package com.tencent.mm.plugin.gif;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$5
  implements Runnable
{
  d$5(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(62384);
    MMGIFJNI.saveRemainder(d.e(this.npc));
    AppMethodBeat.o(62384);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gif.d.5
 * JD-Core Version:    0.6.2
 */