package com.tencent.soter.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.a.g.f;
import com.tencent.soter.core.c.d;

final class a$3
  implements Runnable
{
  a$3(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10461);
    d.w("Soter.SoterBiometricCanceller", "hy: waiting for %s ms not callback to system callback. cancel manually", new Object[] { Long.valueOf(350L) });
    f.dRn().dRp();
    AppMethodBeat.o(10461);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.a.a.3
 * JD-Core Version:    0.6.2
 */