package com.google.android.gms.gcm;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zze
  implements ThreadFactory
{
  private final AtomicInteger zzx;

  zze(GcmTaskService paramGcmTaskService)
  {
    AppMethodBeat.i(70027);
    this.zzx = new AtomicInteger(1);
    AppMethodBeat.o(70027);
  }

  public final Thread newThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(70028);
    int i = this.zzx.getAndIncrement();
    paramRunnable = new Thread(paramRunnable, 20 + "gcm-task#" + i);
    paramRunnable.setPriority(4);
    AppMethodBeat.o(70028);
    return paramRunnable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.gcm.zze
 * JD-Core Version:    0.6.2
 */