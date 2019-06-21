package com.tencent.mm.plugin.gif;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$4
  implements Runnable
{
  d$4(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(62383);
    MMGIFJNI.reset(d.e(this.npc));
    d.a(this.npc, -1);
    d.a(this.npc, d.f(this.npc), 0L);
    AppMethodBeat.o(62383);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gif.d.4
 * JD-Core Version:    0.6.2
 */