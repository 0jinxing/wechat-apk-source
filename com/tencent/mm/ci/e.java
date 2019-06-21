package com.tencent.mm.ci;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vending.h.d;

public final class e extends d
{
  public final void cancel()
  {
  }

  public final String getType()
  {
    return "WxNoLooperScheduler";
  }

  public final void l(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(123368);
    paramRunnable.run();
    AppMethodBeat.o(123368);
  }

  public final void o(Runnable paramRunnable)
  {
    AppMethodBeat.i(123367);
    paramRunnable.run();
    AppMethodBeat.o(123367);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ci.e
 * JD-Core Version:    0.6.2
 */