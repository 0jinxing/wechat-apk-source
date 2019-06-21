package com.tencent.mm.plugin.messenger.foundation.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ak;

public final class a
{
  public static long a(ak paramak, int paramInt, long paramLong)
  {
    long l = 0L;
    AppMethodBeat.i(60016);
    if (paramak == null)
    {
      AppMethodBeat.o(60016);
      paramLong = l;
    }
    while (true)
    {
      label20: return paramLong;
      if (paramLong != 0L);
      while (true)
        switch (paramInt)
        {
        default:
          paramLong = a(paramak, paramLong);
          AppMethodBeat.o(60016);
          break label20;
          paramLong = bo.anU();
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        }
      paramLong = a(paramak, paramLong) | 0x0;
      AppMethodBeat.o(60016);
      continue;
      paramLong = a(paramak, paramLong) & 0xFFFFFFFF;
      AppMethodBeat.o(60016);
      continue;
      paramLong = a(paramak, paramLong) & 0x0;
      AppMethodBeat.o(60016);
      continue;
      paramLong = a(paramak, paramLong) | 0x0;
      AppMethodBeat.o(60016);
      continue;
      paramLong = a(paramak, paramLong) & 0xFFFFFFFF;
      AppMethodBeat.o(60016);
      continue;
      paramLong = a(paramak, paramLong) & 0x0;
      AppMethodBeat.o(60016);
    }
  }

  public static long a(ak paramak, long paramLong)
  {
    return paramak.field_flag & 0x0 | 0xFFFFFFFF & paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.foundation.a.a.a
 * JD-Core Version:    0.6.2
 */