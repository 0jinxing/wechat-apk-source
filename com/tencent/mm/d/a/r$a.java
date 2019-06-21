package com.tencent.mm.d.a;

import android.os.HandlerThread;
import android.os.SystemClock;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Function;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.concurrent.TimeUnit;

final class r$a extends r.c
  implements Runnable
{
  private final ap che;
  private long cis;
  private long cit;

  r$a(r paramr, l paraml, int paramInt, V8Function paramV8Function, V8Array paramV8Array, boolean paramBoolean, long paramLong)
  {
    super(paramr, paraml, paramInt, paramV8Function, paramV8Array, paramBoolean, paramLong);
    AppMethodBeat.i(113875);
    this.che = new ap(paramr.cip.oAl.getLooper(), new r.a.1(this, paramr, paraml), false);
    AppMethodBeat.o(113875);
  }

  final void cancel()
  {
    AppMethodBeat.i(113878);
    this.che.stopTimer();
    super.cancel();
    AppMethodBeat.o(113878);
  }

  public final void run()
  {
    AppMethodBeat.i(113877);
    if (!isValid())
      AppMethodBeat.o(113877);
    while (true)
    {
      return;
      a(this.ciA);
      if (!isValid())
      {
        AppMethodBeat.o(113877);
      }
      else
      {
        if (this.ciz)
          break;
        cleanup();
        AppMethodBeat.o(113877);
      }
    }
    long l1 = SystemClock.elapsedRealtimeNanos();
    if (0L == this.cis);
    for (this.cis = (l1 - this.cit); ; this.cis = ((l1 + this.cis - this.cit) / 2L))
    {
      long l2 = this.ciy - TimeUnit.NANOSECONDS.toMillis(this.cis);
      l1 = l2;
      if (l2 <= 0L)
        l1 = this.ciy;
      this.che.ae(l1, l1);
      AppMethodBeat.o(113877);
      break;
    }
  }

  final void schedule()
  {
    AppMethodBeat.i(113876);
    this.che.ae(this.ciy, this.ciy);
    AppMethodBeat.o(113876);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.r.a
 * JD-Core Version:    0.6.2
 */