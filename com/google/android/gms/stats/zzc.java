package com.google.android.gms.stats;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class zzc
  implements Runnable
{
  zzc(WeakReference paramWeakReference)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(113996);
    WakeLock.HeldLock localHeldLock = (WakeLock.HeldLock)this.zzaej.get();
    if (localHeldLock != null)
      localHeldLock.release(0);
    AppMethodBeat.o(113996);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.stats.zzc
 * JD-Core Version:    0.6.2
 */