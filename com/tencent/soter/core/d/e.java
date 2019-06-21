package com.tencent.soter.core.d;

import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.CountDownLatch;

public final class e
{
  private static Handler AvE = null;
  CountDownLatch vaN = null;

  static void d(Runnable paramRunnable)
  {
    AppMethodBeat.i(73090);
    if (AvE == null)
      AvE = new Handler(Looper.getMainLooper());
    AvE.post(paramRunnable);
    AppMethodBeat.o(73090);
  }

  public final void countDown()
  {
    AppMethodBeat.i(73089);
    if (this.vaN != null)
    {
      this.vaN.countDown();
      this.vaN = null;
    }
    AppMethodBeat.o(73089);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.d.e
 * JD-Core Version:    0.6.2
 */