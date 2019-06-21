package com.tencent.mm.model.b;

import android.os.Build;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class b
{
  private boolean fog;
  public ArrayList<b.a> mListeners;

  public b()
  {
    AppMethodBeat.i(16355);
    this.mListeners = new ArrayList();
    this.fog = false;
    AppMethodBeat.o(16355);
  }

  private void a(String paramString1, String paramString2, long paramLong1, boolean paramBoolean1, boolean paramBoolean2, String paramString3, String paramString4, long paramLong2, boolean paramBoolean3, boolean paramBoolean4, String paramString5)
  {
    AppMethodBeat.i(16364);
    aw.ZK();
    c.Ry().set(ac.a.xSa, paramString3);
    aw.ZK();
    c.Ry().set(ac.a.xSb, paramString4);
    aw.ZK();
    c.Ry().set(ac.a.xSc, Long.valueOf(paramLong2));
    aw.ZK();
    c.Ry().set(ac.a.xSd, Boolean.valueOf(paramBoolean3));
    aw.ZK();
    c.Ry().set(ac.a.xSe, Boolean.valueOf(paramBoolean4));
    aw.ZK();
    c.Ry().set(ac.a.xSg, paramString5);
    aw.ZK();
    c.Ry().set(ac.a.xSf, Boolean.FALSE);
    aw.ZK();
    c.Ry().set(ac.a.xSh, paramString1);
    aw.ZK();
    c.Ry().set(ac.a.xSi, paramString2);
    aw.ZK();
    c.Ry().set(ac.a.xSj, Long.valueOf(paramLong1));
    aw.ZK();
    c.Ry().set(ac.a.xSk, Boolean.valueOf(paramBoolean1));
    aw.ZK();
    c.Ry().set(ac.a.xSl, Boolean.valueOf(paramBoolean2));
    aw.ZK();
    c.Ry().set(ac.a.xSn, Long.valueOf(bo.anT()));
    aw.ZK();
    c.Ry().set(ac.a.xSm, Boolean.FALSE);
    aw.ZK();
    c.Ry().set(ac.a.xSo, Boolean.FALSE);
    aw.ZK();
    c.Ry().dsb();
    aaU();
    AppMethodBeat.o(16364);
  }

  public static boolean a(b.b paramb)
  {
    AppMethodBeat.i(16367);
    ab.d("MicroMsg.ChattingMonitoredBannerStorage", "hy: is checking monitor banner scene: %s", new Object[] { paramb });
    long l1 = bo.anT();
    aw.ZK();
    long l2 = ((Long)c.Ry().get(ac.a.xSn, Long.valueOf(-1L))).longValue();
    aw.ZK();
    String str = (String)c.Ry().get(ac.a.xSg, "");
    long l3;
    boolean bool1;
    boolean bool2;
    if (paramb == b.b.foi)
    {
      aw.ZK();
      l3 = ((Long)c.Ry().get(ac.a.xSc, Long.valueOf(0L))).longValue();
      aw.ZK();
      bool1 = ((Boolean)c.Ry().get(ac.a.xSf, Boolean.FALSE)).booleanValue();
      bool2 = aaT();
      paramb = aaQ();
      if (bo.isNullOrNil(str))
        break label305;
      if (str.equals(Build.FINGERPRINT))
        break label283;
      h.pYm.a(633L, 5L, 1L, false);
      ab.d("MicroMsg.ChattingMonitoredBannerStorage", "ocr banner: fingerprint [%s] NOT equals current device's [%s] , should NOT show banner", new Object[] { str, Build.FINGERPRINT });
      bool1 = false;
      AppMethodBeat.o(16367);
    }
    while (true)
    {
      return bool1;
      aw.ZK();
      l3 = ((Long)c.Ry().get(ac.a.xSj, Long.valueOf(0L))).longValue();
      aw.ZK();
      bool1 = ((Boolean)c.Ry().get(ac.a.xSm, Boolean.FALSE)).booleanValue();
      aw.ZK();
      bool2 = ((Boolean)c.Ry().get(ac.a.xSl, Boolean.FALSE)).booleanValue();
      paramb = aaN();
      break;
      label283: ab.d("MicroMsg.ChattingMonitoredBannerStorage", "ocr banner: fingerprint [%s] equals current device's [%s] , should show banner", new Object[] { str, Build.FINGERPRINT });
      label305: if (bo.isNullOrNil(paramb))
      {
        ab.d("MicroMsg.ChattingMonitoredBannerStorage", "hy: not get wording");
        bool1 = false;
        AppMethodBeat.o(16367);
      }
      else if (bool1)
      {
        ab.d("MicroMsg.ChattingMonitoredBannerStorage", "hy: not check trigger and already closed");
        bool1 = false;
        AppMethodBeat.o(16367);
      }
      else if (l2 < 0L)
      {
        ab.d("MicroMsg.ChattingMonitoredBannerStorage", "hy: no msg occurs");
        bool1 = false;
        AppMethodBeat.o(16367);
      }
      else if ((bool2) && (!isTriggered()))
      {
        ab.d("MicroMsg.ChattingMonitoredBannerStorage", "hy: should check triggered but not triggered");
        bool1 = false;
        AppMethodBeat.o(16367);
      }
      else if (l3 == -1L)
      {
        ab.i("MicroMsg.ChattingMonitoredBannerStorage", "hy: should always show");
        bool1 = true;
        AppMethodBeat.o(16367);
      }
      else if (l2 + l3 > l1)
      {
        ab.i("MicroMsg.ChattingMonitoredBannerStorage", "hy: still in show time. show banner");
        bool1 = true;
        AppMethodBeat.o(16367);
      }
      else
      {
        ab.i("MicroMsg.ChattingMonitoredBannerStorage", "hy: expired.");
        bool1 = false;
        AppMethodBeat.o(16367);
      }
    }
  }

  public static String aaN()
  {
    AppMethodBeat.i(16356);
    aw.ZK();
    String str = (String)c.Ry().get(ac.a.xSh, "");
    AppMethodBeat.o(16356);
    return str;
  }

  public static String aaO()
  {
    AppMethodBeat.i(16357);
    aw.ZK();
    String str = (String)c.Ry().get(ac.a.xSi, "");
    AppMethodBeat.o(16357);
    return str;
  }

  public static boolean aaP()
  {
    AppMethodBeat.i(16358);
    aw.ZK();
    boolean bool = ((Boolean)c.Ry().get(ac.a.xSk, Boolean.FALSE)).booleanValue();
    AppMethodBeat.o(16358);
    return bool;
  }

  public static String aaQ()
  {
    AppMethodBeat.i(16359);
    aw.ZK();
    String str = (String)c.Ry().get(ac.a.xSa, "");
    AppMethodBeat.o(16359);
    return str;
  }

  public static String aaR()
  {
    AppMethodBeat.i(16360);
    aw.ZK();
    String str = (String)c.Ry().get(ac.a.xSb, "");
    AppMethodBeat.o(16360);
    return str;
  }

  public static boolean aaS()
  {
    AppMethodBeat.i(16361);
    aw.ZK();
    boolean bool = ((Boolean)c.Ry().get(ac.a.xSd, Boolean.FALSE)).booleanValue();
    AppMethodBeat.o(16361);
    return bool;
  }

  private static boolean aaT()
  {
    AppMethodBeat.i(16362);
    aw.ZK();
    boolean bool = ((Boolean)c.Ry().get(ac.a.xSe, Boolean.FALSE)).booleanValue();
    AppMethodBeat.o(16362);
    return bool;
  }

  private void aaU()
  {
    AppMethodBeat.i(16368);
    try
    {
      Iterator localIterator = this.mListeners.iterator();
      while (localIterator.hasNext())
        ((b.a)localIterator.next()).aaW();
    }
    finally
    {
      AppMethodBeat.o(16368);
    }
    AppMethodBeat.o(16368);
  }

  private void h(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(16366);
    String str1 = paramString + "chatting.";
    String str2 = bo.nullAsNil((String)paramMap.get(str1 + "fingerprint"));
    if ((str1.equals(".sysmsg.banner.monitorbanner_n.")) && (!bo.isNullOrNil(str2)))
    {
      ab.e("MicroMsg.ChattingMonitoredBannerStorage", "monitorbanner_n must NOT contain fingerprint.");
      AppMethodBeat.o(16366);
      return;
    }
    String str3 = bo.nullAsNil((String)paramMap.get(str1 + "url"));
    String str4 = bo.nullAsNil((String)paramMap.get(str1 + "wording"));
    long l1 = bo.getLong((String)paramMap.get(str1 + "duration"), 0L);
    boolean bool1;
    label236: boolean bool2;
    label276: String str5;
    long l2;
    boolean bool3;
    if (bo.getInt((String)paramMap.get(str1 + "autotrigger"), 0) == 1)
    {
      bool1 = true;
      if (bo.getInt((String)paramMap.get(str1 + "closable"), 0) != 1)
        break label613;
      bool2 = true;
      paramString = paramString + "mainframe.";
      str1 = bo.nullAsNil((String)paramMap.get(paramString + "url"));
      str5 = bo.nullAsNil((String)paramMap.get(paramString + "wording"));
      l2 = bo.getLong((String)paramMap.get(paramString + "duration"), 0L);
      if (bo.getInt((String)paramMap.get(paramString + "autotrigger"), 0) != 1)
        break label619;
      bool3 = true;
      label439: if (bo.getInt((String)paramMap.get(paramString + "closable"), 0) != 1)
        break label625;
    }
    label613: label619: label625: for (boolean bool4 = true; ; bool4 = false)
    {
      if ((!bo.isNullOrNil(str5)) || (!bo.isNullOrNil(str4)))
      {
        ab.d("MicroMsg.ChattingMonitoredBannerStorage", "received msg:\nchattingUrl = " + str3 + "\nchattingWording = " + str4 + "\nchattingDuration = " + l1 + "\nchattingAutotrigger = " + bool1 + "\nchattingCloseable = " + bool2 + "\nfingerPrint = " + str2);
        a(str5, str1, l2, bool4, bool3, str4, str3, l1, bool2, bool1, str2);
      }
      AppMethodBeat.o(16366);
      break;
      bool1 = false;
      break label236;
      bool2 = false;
      break label276;
      bool3 = false;
      break label439;
    }
  }

  private static boolean isTriggered()
  {
    AppMethodBeat.i(16363);
    aw.ZK();
    boolean bool = ((Boolean)c.Ry().get(ac.a.xSo, Boolean.FALSE)).booleanValue();
    AppMethodBeat.o(16363);
    return bool;
  }

  public final void aaV()
  {
    AppMethodBeat.i(16369);
    if (isTriggered() != true)
    {
      ab.d("MicroMsg.ChattingMonitoredBannerStorage", "hy: monitored illegal set text. mark now as the start time ");
      aw.ZK();
      c.Ry().set(ac.a.xSn, Long.valueOf(bo.anT()));
      aw.ZK();
      c.Ry().set(ac.a.xSo, Boolean.TRUE);
      aaU();
    }
    AppMethodBeat.o(16369);
  }

  public final void b(b.b paramb)
  {
    AppMethodBeat.i(16370);
    if (paramb == b.b.foh)
    {
      aw.ZK();
      c.Ry().set(ac.a.xSm, Boolean.FALSE);
    }
    while (true)
    {
      aaU();
      AppMethodBeat.o(16370);
      return;
      aw.ZK();
      c.Ry().set(ac.a.xSf, Boolean.FALSE);
    }
  }

  public final void c(b.b paramb)
  {
    AppMethodBeat.i(16371);
    if (paramb == b.b.foh)
    {
      aw.ZK();
      c.Ry().set(ac.a.xSj, Long.valueOf(0L));
    }
    while (true)
    {
      aaU();
      do
      {
        AppMethodBeat.o(16371);
        return;
      }
      while (paramb != b.b.foi);
      if (!aaT())
      {
        aw.ZK();
        c.Ry().set(ac.a.xSc, Long.valueOf(0L));
      }
      else
      {
        aw.ZK();
        c.Ry().set(ac.a.xSf, Boolean.TRUE);
      }
    }
  }

  public final void n(Map<String, String> paramMap)
  {
    AppMethodBeat.i(16365);
    if (paramMap == null)
      AppMethodBeat.o(16365);
    while (true)
    {
      return;
      h.pYm.a(633L, 3L, 1L, false);
      ab.d("MicroMsg.ChattingMonitoredBannerStorage", "origin values: ".concat(String.valueOf(paramMap)));
      h(".sysmsg.banner.monitorbanner_n.", paramMap);
      h(".sysmsg.banner.monitorbanner_o.", paramMap);
      AppMethodBeat.o(16365);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.b.b
 * JD-Core Version:    0.6.2
 */