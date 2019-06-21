package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzjm
{
  private long startTime;
  private final Clock zzro;

  public zzjm(Clock paramClock)
  {
    AppMethodBeat.i(69396);
    Preconditions.checkNotNull(paramClock);
    this.zzro = paramClock;
    AppMethodBeat.o(69396);
  }

  public final void clear()
  {
    this.startTime = 0L;
  }

  public final void start()
  {
    AppMethodBeat.i(69397);
    this.startTime = this.zzro.elapsedRealtime();
    AppMethodBeat.o(69397);
  }

  public final boolean zzj(long paramLong)
  {
    boolean bool = true;
    AppMethodBeat.i(69398);
    if (this.startTime == 0L)
      AppMethodBeat.o(69398);
    while (true)
    {
      return bool;
      if (this.zzro.elapsedRealtime() - this.startTime >= 3600000L)
      {
        AppMethodBeat.o(69398);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(69398);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzjm
 * JD-Core Version:    0.6.2
 */