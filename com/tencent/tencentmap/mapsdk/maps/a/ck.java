package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.CountDownLatch;

final class ck
  implements Runnable
{
  ck(boolean[] paramArrayOfBoolean, CountDownLatch paramCountDownLatch)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(98641);
    try
    {
      this.a[0] = cj.b();
      label14: this.b.countDown();
      AppMethodBeat.o(98641);
      return;
    }
    catch (Exception localException)
    {
      break label14;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ck
 * JD-Core Version:    0.6.2
 */