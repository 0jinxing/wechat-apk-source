package com.google.android.gms.common.util.concurrent;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zza
  implements Runnable
{
  private final int priority;
  private final Runnable zzaax;

  public zza(Runnable paramRunnable, int paramInt)
  {
    this.zzaax = paramRunnable;
    this.priority = paramInt;
  }

  public final void run()
  {
    AppMethodBeat.i(90305);
    Process.setThreadPriority(this.priority);
    this.zzaax.run();
    AppMethodBeat.o(90305);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.concurrent.zza
 * JD-Core Version:    0.6.2
 */