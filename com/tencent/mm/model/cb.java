package com.tencent.mm.model;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class cb
{
  private static long fnM = 0L;

  public static long aaD()
  {
    long l1 = 0L;
    AppMethodBeat.i(58137);
    if (ah.bqo())
    {
      g.RQ();
      if (g.RN().QY());
    }
    else
    {
      AppMethodBeat.o(58137);
    }
    while (true)
    {
      return l1;
      try
      {
        long l2 = aaE();
        l1 = l2;
        AppMethodBeat.o(58137);
      }
      catch (Throwable localThrowable)
      {
        ab.e("MicroMsg.TimeHelper", localThrowable.getMessage());
        AppMethodBeat.o(58137);
      }
    }
  }

  public static long aaE()
  {
    AppMethodBeat.i(58139);
    long l1 = SystemClock.elapsedRealtime();
    g.RQ();
    long l2 = g.RP().Ry().a(ac.a.xRA, l1);
    g.RQ();
    long l3 = g.RP().Ry().a(ac.a.xRz, 0L);
    l2 = Math.max(0L, l1 - l2);
    ab.d("MicroMsg.TimeHelper", "[getSyncServerTimeMs] SyncServerTime:" + fnM + " offset:" + l2);
    if (0L < l3)
    {
      l3 = l2 + l3;
      AppMethodBeat.o(58139);
    }
    while (true)
    {
      return l3;
      l3 = System.currentTimeMillis();
      AppMethodBeat.o(58139);
    }
  }

  public static int aaF()
  {
    AppMethodBeat.i(58140);
    int i = (int)(aaE() / 1000L);
    AppMethodBeat.o(58140);
    return i;
  }

  public static void fo(long paramLong)
  {
    AppMethodBeat.i(58138);
    long l = SystemClock.elapsedRealtime();
    fnM = Math.max(paramLong, fnM);
    g.RQ();
    g.RP().Ry().set(ac.a.xRz, Long.valueOf(fnM));
    g.RQ();
    g.RP().Ry().set(ac.a.xRA, Long.valueOf(l));
    ab.d("MicroMsg.TimeHelper", "[updateSyncServerTime] elapsedTime:%s SLastSyncServerTimeMs:%s", new Object[] { Long.valueOf(l), Long.valueOf(fnM) });
    AppMethodBeat.o(58138);
  }

  public static long fp(long paramLong)
  {
    AppMethodBeat.i(58141);
    long l = aaE() / 1000L;
    AppMethodBeat.o(58141);
    return l - paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.cb
 * JD-Core Version:    0.6.2
 */