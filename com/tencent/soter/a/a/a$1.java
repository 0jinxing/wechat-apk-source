package com.tencent.soter.a.a;

import android.os.CancellationSignal;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.a.g.f;
import com.tencent.soter.core.c.d;

final class a$1
  implements Runnable
{
  a$1(a parama, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10459);
    d.v("Soter.SoterBiometricCanceller", "soter: enter worker thread. perform cancel", new Object[0]);
    this.AvL.zZp.cancel();
    if (this.AvK)
      f.dRn().dRp();
    AppMethodBeat.o(10459);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.a.a.1
 * JD-Core Version:    0.6.2
 */