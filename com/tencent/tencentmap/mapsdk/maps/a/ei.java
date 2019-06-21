package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.Handler;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ei
  implements Runnable
{
  ei(ec paramec)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(98788);
    try
    {
      ce.e();
      Object localObject1 = ce.b();
      localObject1 = ec.a(this.a, (String)localObject1);
      long l = SystemClock.elapsedRealtime();
      int i = ec.a(this.a, ((ec.a)localObject1).b);
      if ((l - ((ec.a)localObject1).a > i) || (l < ((ec.a)localObject1).a))
      {
        ec.b(2);
        ec.c(this.a).removeCallbacks(ec.b(this.a));
        ec.c(this.a).post(ec.b(this.a));
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(98788);
    }
    finally
    {
      AppMethodBeat.o(98788);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ei
 * JD-Core Version:    0.6.2
 */