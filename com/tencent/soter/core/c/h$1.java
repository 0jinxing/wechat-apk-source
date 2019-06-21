package com.tencent.soter.core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class h$1
  implements h.a
{
  private boolean Avk = false;

  public final boolean dQY()
  {
    return this.Avk;
  }

  public final void dQZ()
  {
    AppMethodBeat.i(73039);
    d.e("Soter.SoterDelegate", "soter: triggered OOM. using default imp, just record the flag", new Object[0]);
    this.Avk = true;
    AppMethodBeat.o(73039);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.c.h.1
 * JD-Core Version:    0.6.2
 */