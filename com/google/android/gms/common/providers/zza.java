package com.google.android.gms.common.providers;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

final class zza
  implements PooledExecutorsProvider.PooledExecutorFactory
{
  public final ScheduledExecutorService newSingleThreadScheduledExecutor()
  {
    AppMethodBeat.i(89934);
    ScheduledExecutorService localScheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
    AppMethodBeat.o(89934);
    return localScheduledExecutorService;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.providers.zza
 * JD-Core Version:    0.6.2
 */