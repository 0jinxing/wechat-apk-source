package com.bumptech.glide.h;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e
{
  private static final double aIb;

  static
  {
    double d = 1.0D;
    AppMethodBeat.i(92579);
    if (Build.VERSION.SDK_INT >= 17)
      d = 1.0D / Math.pow(10.0D, 6.0D);
    aIb = d;
    AppMethodBeat.o(92579);
  }

  @TargetApi(17)
  public static long ok()
  {
    AppMethodBeat.i(92577);
    long l;
    if (Build.VERSION.SDK_INT >= 17)
    {
      l = SystemClock.elapsedRealtimeNanos();
      AppMethodBeat.o(92577);
    }
    while (true)
    {
      return l;
      l = SystemClock.uptimeMillis();
      AppMethodBeat.o(92577);
    }
  }

  public static double q(long paramLong)
  {
    AppMethodBeat.i(92578);
    double d1 = ok() - paramLong;
    double d2 = aIb;
    AppMethodBeat.o(92578);
    return d1 * d2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.h.e
 * JD-Core Version:    0.6.2
 */