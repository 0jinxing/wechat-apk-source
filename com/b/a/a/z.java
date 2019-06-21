package com.b.a.a;

import android.os.Handler;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class z
{
  private static z bIZ;
  private static final SparseArray<z> bJa;
  private final ExecutorService bJb;
  private final Handler handler;

  static
  {
    AppMethodBeat.i(55674);
    bJa = new SparseArray();
    AppMethodBeat.o(55674);
  }

  private z(Handler paramHandler)
  {
    AppMethodBeat.i(55675);
    if (paramHandler != null);
    for (this.bJb = null; ; this.bJb = Executors.newSingleThreadExecutor())
    {
      this.handler = paramHandler;
      AppMethodBeat.o(55675);
      return;
    }
  }

  static z b(Handler paramHandler)
  {
    AppMethodBeat.i(55676);
    z localz2;
    if (paramHandler != null)
    {
      int i = paramHandler.getLooper().hashCode();
      z localz1 = (z)bJa.get(i);
      localz2 = localz1;
      if (localz1 == null)
      {
        localz2 = new z(paramHandler);
        bJa.put(i, localz2);
      }
      AppMethodBeat.o(55676);
    }
    while (true)
    {
      return localz2;
      if (bIZ == null)
        bIZ = new z(null);
      localz2 = bIZ;
      AppMethodBeat.o(55676);
    }
  }

  final void execute(Runnable paramRunnable)
  {
    AppMethodBeat.i(55677);
    if (this.handler != null)
    {
      this.handler.post(paramRunnable);
      AppMethodBeat.o(55677);
    }
    while (true)
    {
      return;
      this.bJb.execute(paramRunnable);
      AppMethodBeat.o(55677);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.b.a.a.z
 * JD-Core Version:    0.6.2
 */