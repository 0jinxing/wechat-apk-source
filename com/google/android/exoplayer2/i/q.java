package com.google.android.exoplayer2.i;

import android.os.SystemClock;
import com.google.android.exoplayer2.b;
import com.google.android.exoplayer2.p;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class q
  implements h
{
  private p aNg = p.aOC;
  private long brI;
  private long brJ;
  private boolean started;

  public final void a(h paramh)
  {
    AppMethodBeat.i(95937);
    ai(paramh.qy());
    this.aNg = paramh.qC();
    AppMethodBeat.o(95937);
  }

  public final void ai(long paramLong)
  {
    AppMethodBeat.i(95936);
    this.brI = paramLong;
    if (this.started)
      this.brJ = SystemClock.elapsedRealtime();
    AppMethodBeat.o(95936);
  }

  public final p b(p paramp)
  {
    AppMethodBeat.i(95939);
    if (this.started)
      ai(qy());
    this.aNg = paramp;
    AppMethodBeat.o(95939);
    return paramp;
  }

  public final p qC()
  {
    return this.aNg;
  }

  public final long qy()
  {
    AppMethodBeat.i(95938);
    long l1 = this.brI;
    long l2 = l1;
    if (this.started)
    {
      l2 = SystemClock.elapsedRealtime() - this.brJ;
      if (this.aNg.speed != 1.0F)
        break label54;
    }
    label54: for (l2 = l1 + b.x(l2); ; l2 = l1 + l2 * this.aNg.aOD)
    {
      AppMethodBeat.o(95938);
      return l2;
    }
  }

  public final void start()
  {
    AppMethodBeat.i(95934);
    if (!this.started)
    {
      this.brJ = SystemClock.elapsedRealtime();
      this.started = true;
    }
    AppMethodBeat.o(95934);
  }

  public final void stop()
  {
    AppMethodBeat.i(95935);
    if (this.started)
    {
      ai(qy());
      this.started = false;
    }
    AppMethodBeat.o(95935);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i.q
 * JD-Core Version:    0.6.2
 */