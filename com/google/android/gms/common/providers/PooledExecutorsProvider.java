package com.google.android.gms.common.providers;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class PooledExecutorsProvider
{
  private static PooledExecutorsProvider.PooledExecutorFactory zzvs;

  public static PooledExecutorsProvider.PooledExecutorFactory createDefaultFactory()
  {
    AppMethodBeat.i(89933);
    zza localzza = new zza();
    AppMethodBeat.o(89933);
    return localzza;
  }

  public static PooledExecutorsProvider.PooledExecutorFactory getInstance()
  {
    try
    {
      AppMethodBeat.i(89932);
      if (zzvs == null)
        zzvs = createDefaultFactory();
      PooledExecutorsProvider.PooledExecutorFactory localPooledExecutorFactory = zzvs;
      AppMethodBeat.o(89932);
      return localPooledExecutorFactory;
    }
    finally
    {
    }
  }

  public static void setInstance(PooledExecutorsProvider.PooledExecutorFactory paramPooledExecutorFactory)
  {
    try
    {
      zzvs = paramPooledExecutorFactory;
      return;
    }
    finally
    {
      paramPooledExecutorFactory = finally;
    }
    throw paramPooledExecutorFactory;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.providers.PooledExecutorsProvider
 * JD-Core Version:    0.6.2
 */