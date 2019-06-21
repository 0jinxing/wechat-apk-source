package com.tencent.liteav.basic.e;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$1
  implements Runnable
{
  f$1(Handler paramHandler, HandlerThread paramHandlerThread)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(66210);
    new Handler(Looper.getMainLooper()).post(new f.1.1(this));
    AppMethodBeat.o(66210);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.e.f.1
 * JD-Core Version:    0.6.2
 */