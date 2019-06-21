package com.a.a;

import android.os.IBinder.DeathRecipient;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$1
  implements IBinder.DeathRecipient
{
  a$1(a parama)
  {
  }

  public final void binderDied()
  {
    AppMethodBeat.i(118244);
    if (this.bCc.bBZ != null)
      this.bCc.bBZ.bJ(2101, -1);
    AppMethodBeat.o(118244);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.a.a.a.1
 * JD-Core Version:    0.6.2
 */