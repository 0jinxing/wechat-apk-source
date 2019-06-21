package com.tencent.soter.core.d;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.soterserver.a;

final class d$1
  implements IBinder.DeathRecipient
{
  d$1(d paramd)
  {
  }

  public final void binderDied()
  {
    AppMethodBeat.i(73068);
    com.tencent.soter.core.c.d.i("Soter.SoterCoreTreble", "soter: binder died", new Object[0]);
    if (this.AvD.Avz == null)
      AppMethodBeat.o(73068);
    while (true)
    {
      return;
      synchronized (d.a(this.AvD))
      {
        d.a(this.AvD, false);
        d.a(this.AvD).notifyAll();
        this.AvD.Avz.asBinder().unlinkToDeath(d.b(this.AvD), 0);
        this.AvD.Avz = null;
        this.AvD.beW();
        AppMethodBeat.o(73068);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.d.d.1
 * JD-Core Version:    0.6.2
 */