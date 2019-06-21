package com.tencent.mm.plugin.appbrand.dynamic.k;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.CountDownLatch;

public final class a
{
  public static <T extends com.tencent.mm.kernel.c.a> T ag(Class<T> paramClass)
  {
    AppMethodBeat.i(11036);
    Object localObject = com.tencent.mm.kernel.g.K(paramClass);
    if (localObject != null)
    {
      AppMethodBeat.o(11036);
      paramClass = (Class<T>)localObject;
    }
    while (true)
    {
      return paramClass;
      if (Looper.myLooper() == Looper.getMainLooper())
      {
        AppMethodBeat.o(11036);
        paramClass = null;
      }
      else if (!com.tencent.mm.kernel.g.RQ().eKi.eKC)
      {
        CountDownLatch localCountDownLatch = new CountDownLatch(1);
        localObject = new a.1(localCountDownLatch);
        com.tencent.mm.kernel.g.RQ().a((com.tencent.mm.kernel.api.g)localObject);
        try
        {
          localCountDownLatch.await();
          com.tencent.mm.kernel.g.RQ().b((com.tencent.mm.kernel.api.g)localObject);
          paramClass = com.tencent.mm.kernel.g.K(paramClass);
          AppMethodBeat.o(11036);
          continue;
        }
        catch (InterruptedException localInterruptedException)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.SyncGetter", localInterruptedException, "", new Object[0]);
            com.tencent.mm.kernel.g.RQ().b((com.tencent.mm.kernel.api.g)localObject);
          }
        }
        finally
        {
          com.tencent.mm.kernel.g.RQ().b((com.tencent.mm.kernel.api.g)localObject);
          AppMethodBeat.o(11036);
        }
      }
      else
      {
        AppMethodBeat.o(11036);
        paramClass = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.k.a
 * JD-Core Version:    0.6.2
 */