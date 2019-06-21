package com.tencent.mm.plugin.expt.hellhound.core.stack;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a
{
  int value;

  static
  {
    AppMethodBeat.i(73357);
    lMo = new a("CREATE", 0, 0);
    lMp = new a("RESUME", 1, 1);
    lMq = new a("PAUSE", 2, 2);
    lMr = new a("STOP", 3, 3);
    lMs = new a("DESTROY", 4, 4);
    lMt = new a[] { lMo, lMp, lMq, lMr, lMs };
    AppMethodBeat.o(73357);
  }

  private a(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.core.stack.a
 * JD-Core Version:    0.6.2
 */