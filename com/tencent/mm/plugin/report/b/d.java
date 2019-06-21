package com.tencent.mm.plugin.report.b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.preference.PreferenceManager;
import com.tencent.c.a.a.f;
import com.tencent.c.a.a.i;
import com.tencent.c.a.a.i.1;
import com.tencent.c.a.a.s;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class d
{
  private static i pXn;
  private static int pXo;

  static
  {
    AppMethodBeat.i(123501);
    pXn = i.aG(ah.getContext());
    pXo = 2;
    AppMethodBeat.o(123501);
  }

  public static void VY(String paramString)
  {
    AppMethodBeat.i(123499);
    try
    {
      i locali = pXn;
      if (i.mContext != null)
      {
        i.cbv = System.currentTimeMillis();
        com.tencent.c.a.a.n.cbG = -1L;
      }
      try
      {
        Object localObject = PreferenceManager.getDefaultSharedPreferences(i.mContext).edit();
        ((SharedPreferences.Editor)localObject).putLong("__MID_LAST_CHECK_TIME__", i.cbv);
        ((SharedPreferences.Editor)localObject).commit();
        if (i.mHandler != null)
        {
          Handler localHandler = i.mHandler;
          localObject = new com/tencent/c/a/a/i$1;
          ((i.1)localObject).<init>(locali, paramString);
          localHandler.post((Runnable)localObject);
        }
        ab.i("MicroMsg.MidHelper", "QueryMid local:%s", new Object[] { pXn.zS() });
        AppMethodBeat.o(123499);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          s.zZ();
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.MidHelper", "procReturnData Error e:%s", new Object[] { bo.l(paramString) });
        AppMethodBeat.o(123499);
      }
    }
  }

  public static String cgi()
  {
    AppMethodBeat.i(123498);
    try
    {
      Object localObject = new com/tencent/mm/plugin/report/b/d$1;
      ((d.1)localObject).<init>();
      i.a((f)localObject);
      localObject = pXn.zR();
      ab.i("MicroMsg.MidHelper", "QueryMid try Get Now getMid:%s getLocalMid:%s", new Object[] { localObject, pXn.zS() });
      AppMethodBeat.o(123498);
      return localObject;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MidHelper", "QueryMid Error e:%s", new Object[] { bo.l(localException) });
        String str = "";
        AppMethodBeat.o(123498);
      }
    }
  }

  public static int u(int paramInt1, int paramInt2, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(123500);
    if (!g.RK())
    {
      ab.i("MicroMsg.MidHelper", "checkReportMid acc not ready");
      paramInt1 = -1;
      AppMethodBeat.o(123500);
    }
    long l;
    while (true)
    {
      return paramInt1;
      l = bo.anT();
      if ((paramInt1 != 3) || (bo.a((Long)g.RP().Ry().get(331778, null), 0L) < l))
        break;
      AppMethodBeat.o(123500);
      paramInt1 = i;
    }
    int j;
    if (at.is2G(ah.getContext()))
      j = 1;
    while (true)
    {
      String str = cgi();
      ab.i("MicroMsg.MidHelper", "querymid checkReportMid moment:%d mid[%s]", new Object[] { Integer.valueOf(paramInt1), str });
      com.tencent.mm.plugin.report.e.pXa.e(11402, new Object[] { str, Integer.valueOf(paramInt1), Integer.valueOf(j), q.LM(), Integer.valueOf(paramInt2), paramString, at.getISPName(ah.getContext()), Integer.valueOf(0), q.getDeviceID(ah.getContext()) });
      g.RP().Ry().set(331778, Long.valueOf(259200L + l));
      AppMethodBeat.o(123500);
      paramInt1 = i;
      break;
      if (at.isWifi(ah.getContext()))
        j = 3;
      else if (at.is3G(ah.getContext()))
        j = 2;
      else
        j = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.b.d
 * JD-Core Version:    0.6.2
 */