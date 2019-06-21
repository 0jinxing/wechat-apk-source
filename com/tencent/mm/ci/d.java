package com.tencent.mm.ci;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.vending.h.a;

public final class d
  implements a
{
  private ak mHandler;

  public d(ak paramak)
  {
    this.mHandler = paramak;
  }

  public static d c(ak paramak)
  {
    AppMethodBeat.i(59210);
    paramak = new d(paramak);
    AppMethodBeat.o(59210);
    return paramak;
  }

  public final void d(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(59212);
    this.mHandler.postDelayed(paramRunnable, paramLong);
    AppMethodBeat.o(59212);
  }

  public final void eD()
  {
    AppMethodBeat.i(59214);
    this.mHandler.removeCallbacksAndMessages(null);
    AppMethodBeat.o(59214);
  }

  public final void f(Runnable paramRunnable)
  {
    AppMethodBeat.i(59211);
    this.mHandler.post(paramRunnable);
    AppMethodBeat.o(59211);
  }

  public final Looper getLooper()
  {
    AppMethodBeat.i(59213);
    Looper localLooper = this.mHandler.getLooper();
    AppMethodBeat.o(59213);
    return localLooper;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ci.d
 * JD-Core Version:    0.6.2
 */