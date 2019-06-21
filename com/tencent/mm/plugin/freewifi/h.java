package com.tencent.mm.plugin.freewifi;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.g.b;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.protocal.protobuf.ad;
import com.tencent.mm.protocal.protobuf.tw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class h
{
  private b mtP;
  private String userAgent;

  private h()
  {
    AppMethodBeat.i(20583);
    this.mtP = j.byX();
    AppMethodBeat.o(20583);
  }

  private void Mr(String paramString)
  {
    AppMethodBeat.i(20593);
    if (("0".equals(paramString)) || ("1".equals(paramString)));
    while (true)
    {
      try
      {
        this.mtP.et(a.mtT.key, paramString);
        AppMethodBeat.o(20593);
        return;
      }
      catch (Exception paramString)
      {
      }
      AppMethodBeat.o(20593);
    }
  }

  private void Ms(String paramString)
  {
    AppMethodBeat.i(20595);
    if (!m.isEmpty(paramString));
    while (true)
    {
      try
      {
        Uri.parse(paramString);
        this.mtP.et(a.mtU.key, paramString);
        AppMethodBeat.o(20595);
        return;
      }
      catch (Exception paramString)
      {
      }
      AppMethodBeat.o(20595);
    }
  }

  private void Mt(String paramString)
  {
    AppMethodBeat.i(20597);
    if (!m.isEmpty(paramString));
    while (true)
    {
      try
      {
        Uri.parse(paramString);
        this.mtP.et(a.mtV.key, paramString);
        AppMethodBeat.o(20597);
        return;
      }
      catch (Exception paramString)
      {
      }
      AppMethodBeat.o(20597);
    }
  }

  private void byf()
  {
    try
    {
      AppMethodBeat.i(20585);
      try
      {
        localObject1 = this.mtP.MJ(a.mtQ.key);
        if ((!m.isEmpty((String)localObject1)) && (Integer.valueOf((String)localObject1).intValue() < Integer.valueOf(a.mtQ.mtW).intValue()))
        {
          vN(Integer.valueOf(a.mtR.mtW).intValue());
          vO(Integer.valueOf(a.mtS.mtW).intValue());
          Ms(a.mtU.mtW);
          Mr(a.mtT.mtW);
          Mt(a.mtV.mtW);
          vM(Integer.valueOf(a.mtQ.mtW).intValue());
        }
        AppMethodBeat.o(20585);
        return;
      }
      catch (Exception localException)
      {
        while (true)
        {
          Object localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("updateDiskDbCacheIfLowerThanDefault exception. ");
          ab.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", m.h(localException));
          AppMethodBeat.o(20585);
        }
      }
    }
    finally
    {
    }
  }

  private void vM(int paramInt)
  {
    try
    {
      AppMethodBeat.i(20587);
      if (paramInt > Integer.valueOf(a.mtQ.mtW).intValue())
        j.byX().et(a.mtQ.key, String.valueOf(paramInt));
      AppMethodBeat.o(20587);
      return;
    }
    finally
    {
    }
  }

  private static void vN(int paramInt)
  {
    AppMethodBeat.i(20589);
    if (paramInt > 0)
      j.byX().et(a.mtR.key, String.valueOf(paramInt));
    AppMethodBeat.o(20589);
  }

  private void vO(int paramInt)
  {
    AppMethodBeat.i(20591);
    if (paramInt > 0)
      this.mtP.et(a.mtS.key, String.valueOf(paramInt));
    AppMethodBeat.o(20591);
  }

  public final void a(ad paramad)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(20584);
        byf();
        if ((paramad == null) || (paramad.vBg == null))
        {
          ab.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "resp.config is null.");
          AppMethodBeat.o(20584);
          return;
        }
        this.mtP.bzw();
        if (paramad.vBg.version == -1)
        {
          this.mtP.axQ();
          ab.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "all local config data deleted.");
          this.mtP.bzw();
          AppMethodBeat.o(20584);
          continue;
        }
      }
      finally
      {
      }
      if (paramad.vBg.version > byg())
      {
        ab.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "resp.config.version is %d, local version is %d.", new Object[] { Integer.valueOf(paramad.vBg.version), Integer.valueOf(byg()) });
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("resp.config.version = %d ");
        ab.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", paramad.vBg.version);
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("resp.config.httpConnectTimeoutMillis = %d ");
        ab.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", paramad.vBg.wbk);
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("resp.config.httpReadTimeoutMillis = %d ");
        ab.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", paramad.vBg.wbl);
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("resp.config.pingUrl = %s ");
        ab.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", paramad.vBg.cuG);
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("resp.config.pingEnabled = %s ");
        ab.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", paramad.vBg.cuF);
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("resp.config.ThreeTwoBlackUrl = %s ");
        ab.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", paramad.vBg.wbm);
        vN(paramad.vBg.wbk);
        vO(paramad.vBg.wbl);
        Ms(paramad.vBg.cuG);
        Mr(paramad.vBg.cuF);
        Mt(paramad.vBg.wbm);
        vM(paramad.vBg.version);
        ab.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "local config data changed.");
        this.mtP.bzw();
      }
      AppMethodBeat.o(20584);
    }
  }

  // ERROR //
  public final int byg()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: sipush 20586
    //   5: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: invokespecial 156	com/tencent/mm/plugin/freewifi/h:byf	()V
    //   12: aload_0
    //   13: getfield 31	com/tencent/mm/plugin/freewifi/h:mtP	Lcom/tencent/mm/plugin/freewifi/g/b;
    //   16: getstatic 88	com/tencent/mm/plugin/freewifi/h$a:mtQ	Lcom/tencent/mm/plugin/freewifi/h$a;
    //   19: getfield 58	com/tencent/mm/plugin/freewifi/h$a:key	Ljava/lang/String;
    //   22: invokevirtual 92	com/tencent/mm/plugin/freewifi/g/b:MJ	(Ljava/lang/String;)Ljava/lang/String;
    //   25: astore_1
    //   26: aload_1
    //   27: invokestatic 71	com/tencent/mm/plugin/freewifi/m:isEmpty	(Ljava/lang/String;)Z
    //   30: ifeq +26 -> 56
    //   33: getstatic 88	com/tencent/mm/plugin/freewifi/h$a:mtQ	Lcom/tencent/mm/plugin/freewifi/h$a;
    //   36: getfield 105	com/tencent/mm/plugin/freewifi/h$a:mtW	Ljava/lang/String;
    //   39: invokestatic 98	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   42: invokevirtual 102	java/lang/Integer:intValue	()I
    //   45: istore_2
    //   46: sipush 20586
    //   49: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   52: aload_0
    //   53: monitorexit
    //   54: iload_2
    //   55: ireturn
    //   56: aload_1
    //   57: invokestatic 98	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   60: invokevirtual 102	java/lang/Integer:intValue	()I
    //   63: istore_2
    //   64: sipush 20586
    //   67: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   70: goto -18 -> 52
    //   73: astore_1
    //   74: aload_0
    //   75: monitorexit
    //   76: aload_1
    //   77: athrow
    //   78: astore_1
    //   79: getstatic 88	com/tencent/mm/plugin/freewifi/h$a:mtQ	Lcom/tencent/mm/plugin/freewifi/h$a;
    //   82: getfield 105	com/tencent/mm/plugin/freewifi/h$a:mtW	Ljava/lang/String;
    //   85: invokestatic 98	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   88: invokevirtual 102	java/lang/Integer:intValue	()I
    //   91: istore_2
    //   92: sipush 20586
    //   95: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   98: goto -46 -> 52
    //
    // Exception table:
    //   from	to	target	type
    //   2	12	73	finally
    //   12	46	73	finally
    //   46	52	73	finally
    //   56	64	73	finally
    //   64	70	73	finally
    //   79	98	73	finally
    //   12	46	78	java/lang/Exception
    //   56	64	78	java/lang/Exception
  }

  public final int byh()
  {
    AppMethodBeat.i(20588);
    byf();
    try
    {
      String str = this.mtP.MJ(a.mtR.key);
      if (m.isEmpty(str))
      {
        i = Integer.valueOf(a.mtR.mtW).intValue();
        AppMethodBeat.o(20588);
      }
      while (true)
      {
        return i;
        i = Integer.valueOf(str).intValue();
        AppMethodBeat.o(20588);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        int i = Integer.valueOf(a.mtR.mtW).intValue();
        AppMethodBeat.o(20588);
      }
    }
  }

  public final int byi()
  {
    AppMethodBeat.i(20590);
    byf();
    try
    {
      String str = this.mtP.MJ(a.mtS.key);
      if (m.isEmpty(str))
      {
        i = Integer.valueOf(a.mtS.mtW).intValue();
        AppMethodBeat.o(20590);
      }
      while (true)
      {
        return i;
        i = Integer.valueOf(str).intValue();
        AppMethodBeat.o(20590);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        int i = Integer.valueOf(a.mtS.mtW).intValue();
        AppMethodBeat.o(20590);
      }
    }
  }

  public final String byj()
  {
    AppMethodBeat.i(20592);
    byf();
    try
    {
      String str1;
      if ("0".equals(this.mtP.MJ(a.mtT.key)))
      {
        str1 = "0";
        AppMethodBeat.o(20592);
      }
      while (true)
      {
        return str1;
        str1 = "1";
        AppMethodBeat.o(20592);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        String str2 = a.mtT.mtW;
        AppMethodBeat.o(20592);
      }
    }
  }

  public final String byk()
  {
    AppMethodBeat.i(20594);
    byf();
    try
    {
      String str1 = this.mtP.MJ(a.mtU.key);
      if (m.isEmpty(str1))
      {
        str1 = a.mtU.mtW;
        AppMethodBeat.o(20594);
      }
      while (true)
      {
        return str1;
        Uri.parse(str1);
        AppMethodBeat.o(20594);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        String str2 = a.mtU.mtW;
        AppMethodBeat.o(20594);
      }
    }
  }

  public final String byl()
  {
    AppMethodBeat.i(20596);
    byf();
    try
    {
      String str1 = this.mtP.MJ(a.mtV.key);
      if (m.isEmpty(str1))
      {
        str1 = a.mtV.mtW;
        AppMethodBeat.o(20596);
      }
      while (true)
      {
        return str1;
        Uri.parse(str1);
        AppMethodBeat.o(20596);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        String str2 = a.mtV.mtW;
        AppMethodBeat.o(20596);
      }
    }
  }

  public final String getUserAgent()
  {
    AppMethodBeat.i(20598);
    if (m.isEmpty(this.userAgent))
      this.userAgent = u.bh(ah.getContext(), null).toLowerCase();
    String str = this.userAgent;
    AppMethodBeat.o(20598);
    return str;
  }

  static enum a
  {
    String key;
    String mtW;

    static
    {
      AppMethodBeat.i(20581);
      mtQ = new a("version", 0, "version", "2");
      mtR = new a("httpConnectTimeoutMillis", 1, "httpConnectTimeoutMillis", "5000");
      mtS = new a("httpReadTimeoutMillis", 2, "httpReadTimeoutMillis", "5000");
      mtT = new a("pingEnabled", 3, "pingEnabled", "1");
      mtU = new a("pingUrl", 4, "pingUrl", "http://o2o.gtimg.com/wifi/echo");
      mtV = new a("threeTwoBlackUrl", 5, "threeTwoBlackUrl", "http://o2o.gtimg.com/wifi/echo.html");
      mtX = new a[] { mtQ, mtR, mtS, mtT, mtU, mtV };
      AppMethodBeat.o(20581);
    }

    private a(String paramString1, String paramString2)
    {
      this.key = paramString1;
      this.mtW = paramString2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.h
 * JD-Core Version:    0.6.2
 */