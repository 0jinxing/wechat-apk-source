package com.tencent.liteav.basic.b;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;

class a$3
  implements Runnable
{
  a$3(a parama)
  {
  }

  public void run()
  {
    AppMethodBeat.i(66048);
    a.a(this.a, false);
    a.a(this.a);
    try
    {
      Looper.myLooper().quit();
      AppMethodBeat.o(66048);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(66048);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.b.a.3
 * JD-Core Version:    0.6.2
 */