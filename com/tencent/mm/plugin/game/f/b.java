package com.tencent.mm.plugin.game.f;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b
{
  public static HashMap<Long, Long> jZc;
  public static HashMap<Long, String> jZd;
  private static Map<String, List<String>> nnv;
  private static Map<String, List<String>> nnw;

  static
  {
    AppMethodBeat.i(112292);
    nnv = new HashMap();
    nnw = new HashMap();
    jZc = new HashMap();
    jZd = new HashMap();
    AppMethodBeat.o(112292);
  }

  public static String h(Context paramContext, long paramLong)
  {
    AppMethodBeat.i(112291);
    GregorianCalendar localGregorianCalendar = new GregorianCalendar();
    if (paramLong < 3600000L)
    {
      paramContext = "";
      AppMethodBeat.o(112291);
    }
    while (true)
    {
      return paramContext;
      long l1 = localGregorianCalendar.getTimeInMillis();
      if (jZc.containsKey(Long.valueOf(paramLong)))
      {
        if (l1 - ((Long)jZc.get(Long.valueOf(paramLong))).longValue() < 60000L)
        {
          if (jZd.containsKey(Long.valueOf(paramLong)))
          {
            paramContext = (String)jZd.get(Long.valueOf(paramLong));
            AppMethodBeat.o(112291);
          }
        }
        else
          jZc.remove(Long.valueOf(paramLong));
      }
      else
      {
        int i;
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
          AppMethodBeat.o(112291);
        }
        else
        {
          localGregorianCalendar = new GregorianCalendar(localGregorianCalendar.get(1), localGregorianCalendar.get(2), localGregorianCalendar.get(5));
          long l2 = paramLong - localGregorianCalendar.getTimeInMillis();
          if ((l2 > 0L) && (l2 <= 86400000L))
          {
            i = (int)((l1 - paramLong) / 3600000L);
            j = i;
            if (i <= 0)
              j = 1;
            paramContext = paramContext.getResources().getQuantityString(2131361801, j, new Object[] { Integer.valueOf(j) });
            jZd.put(Long.valueOf(paramLong), paramContext);
            jZc.put(Long.valueOf(paramLong), Long.valueOf(l1));
            AppMethodBeat.o(112291);
          }
          else
          {
            l2 = paramLong - localGregorianCalendar.getTimeInMillis() + 86400000L;
            if ((l2 > 0L) && (l2 <= 86400000L))
            {
              paramContext = paramContext.getString(2131299986);
              jZd.put(Long.valueOf(paramLong), paramContext);
              jZc.put(Long.valueOf(paramLong), Long.valueOf(l1));
              AppMethodBeat.o(112291);
            }
            else
            {
              i = (int)((localGregorianCalendar.getTimeInMillis() + 86400000L - paramLong) / 86400000L);
              j = i;
              if (i <= 0)
                j = 1;
              paramContext = paramContext.getResources().getQuantityString(2131361803, j, new Object[] { Integer.valueOf(j) });
              jZd.put(Long.valueOf(paramLong), paramContext);
              jZc.put(Long.valueOf(paramLong), Long.valueOf(l1));
              AppMethodBeat.o(112291);
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.f.b
 * JD-Core Version:    0.6.2
 */