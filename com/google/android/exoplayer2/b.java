package com.google.android.exoplayer2;

import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.UUID;

public final class b
{
  public static final int CHANNEL_OUT_7POINT1_SURROUND;
  public static final UUID aMA;
  public static final UUID aMx;
  public static final UUID aMy;
  public static final UUID aMz;

  static
  {
    AppMethodBeat.i(94735);
    if (v.SDK_INT < 23);
    for (int i = 1020; ; i = 6396)
    {
      CHANNEL_OUT_7POINT1_SURROUND = i;
      aMx = new UUID(0L, 0L);
      aMy = new UUID(1186680826959645954L, -5988876978535335093L);
      aMz = new UUID(-1301668207276963122L, -6645017420763422227L);
      aMA = new UUID(-7348484286925749626L, -6083546864340672619L);
      AppMethodBeat.o(94735);
      return;
    }
  }

  public static long w(long paramLong)
  {
    long l = paramLong;
    if (paramLong != -9223372036854775807L)
      if (paramLong != -9223372036854775808L)
        break label22;
    label22: for (l = paramLong; ; l = paramLong / 1000L)
      return l;
  }

  public static long x(long paramLong)
  {
    long l = paramLong;
    if (paramLong != -9223372036854775807L)
      if (paramLong != -9223372036854775808L)
        break label22;
    label22: for (l = paramLong; ; l = paramLong * 1000L)
      return l;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.b
 * JD-Core Version:    0.6.2
 */