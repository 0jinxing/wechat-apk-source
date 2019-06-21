package com.tencent.mm.plugin.gif;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$3
  implements Runnable
{
  d$3(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(62382);
    MMGIFJNI.restoreRemainder(d.e(this.npc));
    d.a(this.npc, d.f(this.npc), d.g(this.npc));
    AppMethodBeat.o(62382);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gif.d.3
 * JD-Core Version:    0.6.2
 */