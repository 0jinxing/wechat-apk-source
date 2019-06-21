package com.tencent.mm.vending.h;

import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
  implements a
{
  public Handler a;

  public b(Handler paramHandler)
  {
    this.a = paramHandler;
  }

  public final void d(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(126115);
    this.a.postDelayed(paramRunnable, paramLong);
    AppMethodBeat.o(126115);
  }

  public final void eD()
  {
    AppMethodBeat.i(126117);
    this.a.removeCallbacksAndMessages(null);
    AppMethodBeat.o(126117);
  }

  public final void f(Runnable paramRunnable)
  {
    AppMethodBeat.i(126114);
    this.a.post(paramRunnable);
    AppMethodBeat.o(126114);
  }

  public final Looper getLooper()
  {
    AppMethodBeat.i(126116);
    Looper localLooper = this.a.getLooper();
    AppMethodBeat.o(126116);
    return localLooper;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.h.b
 * JD-Core Version:    0.6.2
 */