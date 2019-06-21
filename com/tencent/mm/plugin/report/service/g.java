package com.tencent.mm.plugin.report.service;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.regex.Pattern;

public final class g
{
  private static SparseArray<Long> pYb;
  private static SparseArray<HashMap<Integer, Integer>> pYc;
  private static boolean pYd;
  private static long pYe;
  private static long pYf;
  private static long pYg;

  static
  {
    AppMethodBeat.i(72750);
    pYb = new SparseArray();
    pYc = new SparseArray();
    pYd = true;
    pYe = 0L;
    pYf = 0L;
    pYg = 0L;
    AppMethodBeat.o(72750);
  }

  public static void BN(int paramInt)
  {
    AppMethodBeat.i(72744);
    if (!pYd)
      AppMethodBeat.o(72744);
    while (true)
    {
      return;
      pYb.put(paramInt, Long.valueOf(bo.anU()));
      ab.d("MicroMsg.ReportLogInfo", "ReportLogInfo operationBegin eventID:%d  time:%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(bo.anU()) });
      AppMethodBeat.o(72744);
    }
  }

  public static void BO(int paramInt)
  {
    AppMethodBeat.i(72746);
    if (!pYd)
      AppMethodBeat.o(72746);
    long l;
    while (true)
    {
      return;
      Long localLong = (Long)pYb.get(paramInt);
      if (localLong == null)
      {
        AppMethodBeat.o(72746);
      }
      else if (localLong.longValue() == -1L)
      {
        AppMethodBeat.o(72746);
      }
      else
      {
        pYb.put(paramInt, Long.valueOf(-1L));
        l = bo.anU() - localLong.longValue();
        if (l > 0L)
          break;
        AppMethodBeat.o(72746);
      }
    }
    switch (paramInt)
    {
    case 11:
    case 15:
    case 16:
    case 17:
    default:
    case 8:
    case 9:
    case 10:
    case 12:
    case 13:
    case 14:
    case 18:
    case 25:
    case 24:
    case 19:
    case 21:
    case 23:
    case 22:
    case 20:
    }
    while (true)
    {
      ab.i("MicroMsg.ReportLogInfo", "ReportLogInfo operationEnd eventID:%d  time:%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(l) });
      AppMethodBeat.o(72746);
      break;
      if (ah.xzd)
      {
        h.pYm.d(23, 4, 5, (int)l, false);
      }
      else
      {
        W(1, l);
        V(227, l);
        h.pYm.d(23, 1, 2, (int)l, false);
        continue;
        W(3, l);
        V(229, l);
        h.pYm.d(27, 1, 2, (int)l, false);
        continue;
        W(2, l);
        V(228, l);
        h.pYm.d(28, 1, 2, (int)l, false);
        continue;
        W(6, l);
        continue;
        W(7, l);
        continue;
        W(8, l);
        continue;
        W(10, l);
        continue;
        W(14, l);
        continue;
        W(15, l);
        continue;
        W(9, l);
        continue;
        W(11, l);
        continue;
        W(16, l);
        continue;
        W(13, l);
        continue;
        W(12, l);
      }
    }
  }

  public static void BP(int paramInt)
  {
    AppMethodBeat.i(72749);
    if (!pYd)
      AppMethodBeat.o(72749);
    while (true)
    {
      return;
      ab.d("MicroMsg.ReportLogInfo", "ReportLogInfo stopOperation stop eventID:%d", new Object[] { Integer.valueOf(paramInt) });
      pYb.put(paramInt, Long.valueOf(-1L));
      AppMethodBeat.o(72749);
    }
  }

  private static void V(int paramInt, long paramLong)
  {
    AppMethodBeat.i(72747);
    if (paramLong <= 0L)
      AppMethodBeat.o(72747);
    while (true)
    {
      return;
      if (paramLong < 1000L)
      {
        h.pYm.ag(paramInt, 0, 1);
        AppMethodBeat.o(72747);
      }
      else if (paramLong < 2000L)
      {
        h.pYm.ag(paramInt, 0, 3);
        AppMethodBeat.o(72747);
      }
      else if (paramLong < 5000L)
      {
        h.pYm.ag(paramInt, 0, 5);
        AppMethodBeat.o(72747);
      }
      else if (paramLong < 10000L)
      {
        h.pYm.ag(paramInt, 0, 7);
        AppMethodBeat.o(72747);
      }
      else
      {
        h.pYm.ag(paramInt, 0, 9);
        AppMethodBeat.o(72747);
      }
    }
  }

  private static void W(int paramInt, long paramLong)
  {
    AppMethodBeat.i(72748);
    long l;
    if (paramInt == 6)
    {
      l = System.currentTimeMillis();
      if (l < pYe + 60000L)
        AppMethodBeat.o(72748);
    }
    while (true)
    {
      return;
      pYe = l;
      while (true)
      {
        g.a locala = g.a.cgs();
        if (!locala.hasInit)
          break label210;
        h.pYm.a(11335, true, false, new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong), Integer.valueOf(locala.pYi), Long.valueOf(locala.pYh[0]), Long.valueOf(locala.pYh[1]), Long.valueOf(locala.pYk) });
        AppMethodBeat.o(72748);
        break;
        if (paramInt == 7)
        {
          l = System.currentTimeMillis();
          if (l < pYf + 60000L)
          {
            AppMethodBeat.o(72748);
            break;
          }
          pYf = l;
          continue;
        }
        if (paramInt == 8)
        {
          l = System.currentTimeMillis();
          if (l < pYg + 60000L)
          {
            AppMethodBeat.o(72748);
            break;
          }
          pYg = l;
        }
      }
      label210: h.pYm.a(11335, true, false, new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong) });
      AppMethodBeat.o(72748);
    }
  }

  public static void jG(long paramLong)
  {
    AppMethodBeat.i(72745);
    if (!pYd)
      AppMethodBeat.o(72745);
    while (true)
    {
      return;
      ab.d("MicroMsg.ReportLogInfo", "ReportLogInfo operationBegin eventID:%d  with time:%d", new Object[] { Integer.valueOf(8), Long.valueOf(paramLong) });
      pYb.put(8, Long.valueOf(paramLong));
      AppMethodBeat.o(72745);
    }
  }

  final class a$a
    implements FileFilter
  {
    public final boolean accept(File paramFile)
    {
      AppMethodBeat.i(72740);
      boolean bool;
      if (Pattern.matches("cpu[0-9]", paramFile.getName()))
      {
        bool = true;
        AppMethodBeat.o(72740);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(72740);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.service.g
 * JD-Core Version:    0.6.2
 */