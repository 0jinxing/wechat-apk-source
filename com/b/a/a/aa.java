package com.b.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.TimeZone;

final class aa
{
  private static long ax(long paramLong)
  {
    AppMethodBeat.i(55696);
    long l = TimeZone.getDefault().getOffset(paramLong);
    AppMethodBeat.o(55696);
    return l + paramLong;
  }

  static long ay(long paramLong)
  {
    AppMethodBeat.i(55697);
    paramLong = ax(paramLong) / 1000L;
    AppMethodBeat.o(55697);
    return paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.b.a.a.aa
 * JD-Core Version:    0.6.2
 */