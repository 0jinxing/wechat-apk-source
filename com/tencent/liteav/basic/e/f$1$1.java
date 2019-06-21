package com.tencent.liteav.basic.e;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;

class f$1$1
  implements Runnable
{
  f$1$1(f.1 param1)
  {
  }

  public void run()
  {
    AppMethodBeat.i(66207);
    if (this.a.a != null)
      this.a.a.removeCallbacksAndMessages(null);
    if (this.a.b != null)
      if (Build.VERSION.SDK_INT >= 18)
      {
        this.a.b.quitSafely();
        AppMethodBeat.o(66207);
      }
    while (true)
    {
      return;
      this.a.b.quit();
      AppMethodBeat.o(66207);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.e.f.1.1
 * JD-Core Version:    0.6.2
 */