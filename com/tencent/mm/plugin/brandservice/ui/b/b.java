package com.tencent.mm.plugin.brandservice.ui.b;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.GregorianCalendar;
import java.util.HashMap;

public final class b
{
  private static HashMap<Long, Long> jZc;
  private static HashMap<Long, String> jZd;

  static
  {
    AppMethodBeat.i(14449);
    jZc = new HashMap();
    jZd = new HashMap();
    AppMethodBeat.o(14449);
  }

  public static void clean()
  {
    try
    {
      AppMethodBeat.i(14447);
      jZc.clear();
      jZd.clear();
      AppMethodBeat.o(14447);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static String e(Context paramContext, long paramLong)
  {
    while (true)
    {
      GregorianCalendar localGregorianCalendar1;
      long l1;
      try
      {
        AppMethodBeat.i(14448);
        localGregorianCalendar1 = new java/util/GregorianCalendar;
        localGregorianCalendar1.<init>();
        if (paramLong < 3600000L)
        {
          paramContext = "";
          AppMethodBeat.o(14448);
          return paramContext;
        }
        l1 = localGregorianCalendar1.getTimeInMillis();
        if (!jZc.containsKey(Long.valueOf(paramLong)))
          break label137;
        if (l1 - ((Long)jZc.get(Long.valueOf(paramLong))).longValue() < 60000L)
        {
          if (!jZd.containsKey(Long.valueOf(paramLong)))
            break label137;
          paramContext = (String)jZd.get(Long.valueOf(paramLong));
          AppMethodBeat.o(14448);
          continue;
        }
      }
      finally
      {
      }
      jZc.remove(Long.valueOf(paramLong));
      label137: int i;
      int j;
      if ((l1 - paramLong) / 3600000L == 0L)
      {
        i = (int)((l1 - paramLong) / 60000L);
        j = i;
        if (i <= 0)
          j = 1;
        paramContext = paramContext.getResources().getQuantityString(2131361802, j, new Object[] { Integer.valueOf(j) });
        jZd.put(Long.valueOf(paramLong), paramContext);
        jZc.put(Long.valueOf(paramLong), Long.valueOf(l1));
        AppMethodBeat.o(14448);
      }
      else
      {
        GregorianCalendar localGregorianCalendar2 = new java/util/GregorianCalendar;
        localGregorianCalendar2.<init>(localGregorianCalendar1.get(1), localGregorianCalendar1.get(2), localGregorianCalendar1.get(5));
        long l2 = localGregorianCalendar2.getTimeInMillis();
        long l3 = paramLong - l2;
        if ((l3 > 0L) && (l3 <= 86400000L))
        {
          i = (int)((l1 - paramLong) / 3600000L);
          j = i;
          if (i <= 0)
            j = 1;
          paramContext = paramContext.getResources().getQuantityString(2131361801, j, new Object[] { Integer.valueOf(j) });
          jZd.put(Long.valueOf(paramLong), paramContext);
          jZc.put(Long.valueOf(paramLong), Long.valueOf(l1));
          AppMethodBeat.o(14448);
        }
        else
        {
          l3 = paramLong - l2 + 86400000L;
          if ((l3 > 0L) && (l3 <= 86400000L))
          {
            paramContext = paramContext.getString(2131299986);
            jZd.put(Long.valueOf(paramLong), paramContext);
            jZc.put(Long.valueOf(paramLong), Long.valueOf(l1));
            AppMethodBeat.o(14448);
          }
          else
          {
            i = (int)((l2 + 86400000L - paramLong) / 86400000L);
            j = i;
            if (i <= 0)
              j = 1;
            paramContext = paramContext.getResources().getQuantityString(2131361803, j, new Object[] { Integer.valueOf(j) });
            jZd.put(Long.valueOf(paramLong), paramContext);
            jZc.put(Long.valueOf(paramLong), Long.valueOf(l1));
            AppMethodBeat.o(14448);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.b.b
 * JD-Core Version:    0.6.2
 */