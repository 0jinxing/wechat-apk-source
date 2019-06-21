package com.tencent.mm.plugin.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.HandlerThread;
import android.os.PowerManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.bp;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.platformtools.t.a;
import com.tencent.mm.plugin.f.a.d;
import com.tencent.mm.plugin.f.a.f;
import com.tencent.mm.plugin.f.c.c.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.util.HashMap;
import java.util.HashSet;

public final class b
  implements com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.kernel.b.c
{
  private static HashMap<Integer, h.d> jZD;
  private static b jZG;
  private h.a jKo;
  private com.tencent.mm.plugin.f.b.b jZE;
  private t.a jZF;
  private al jZH;
  private com.tencent.mm.plugin.f.c.c jZI;
  public HashSet<Long> jZJ;
  public boolean jZK;
  private boolean jZL;
  public com.tencent.mm.plugin.f.c.c jZM;
  com.tencent.mm.plugin.f.c.b jZN;
  private HashMap<Integer, com.tencent.mm.plugin.f.a.a> jZO;
  private c.a jZP;
  private c.a jZQ;
  private com.tencent.mm.sdk.b.c<ch> jZR;
  private boolean jZS;
  private boolean jZT;
  private BroadcastReceiver jZU;
  private Runnable jZV;
  private boolean jZW;
  private com.tencent.mm.sdk.b.c<bp> jZX;

  static
  {
    AppMethodBeat.i(18616);
    HashMap localHashMap = new HashMap();
    jZD = localHashMap;
    localHashMap.put(Integer.valueOf("WXFILEINDEX_TABLE".hashCode()), new b.1());
    AppMethodBeat.o(18616);
  }

  public b()
  {
    AppMethodBeat.i(18595);
    this.jZI = null;
    this.jZJ = new HashSet();
    this.jZK = false;
    this.jZL = false;
    this.jZM = null;
    this.jZN = null;
    this.jZO = new HashMap();
    this.jZP = new b.8(this);
    this.jZQ = new b.13(this);
    this.jKo = new h.a()
    {
      public final void a(com.tencent.mm.plugin.messenger.foundation.a.a.h paramAnonymoush, h.c paramAnonymousc)
      {
        AppMethodBeat.i(18575);
        if (paramAnonymoush == null)
          AppMethodBeat.o(18575);
        while (true)
        {
          return;
          if ((paramAnonymousc == null) || (paramAnonymousc.oqK == null))
          {
            AppMethodBeat.o(18575);
          }
          else
          {
            b.a(b.this, new b.2.1(this, paramAnonymousc));
            AppMethodBeat.o(18575);
          }
        }
      }
    };
    this.jZR = new b.3(this);
    this.jZS = false;
    this.jZT = true;
    this.jZW = false;
    this.jZX = new b.5(this);
    AppMethodBeat.o(18595);
  }

  public static void C(int paramInt, long paramLong)
  {
    int i = 30;
    AppMethodBeat.i(18608);
    if (paramLong <= 1000L)
    {
      paramInt += 5;
      if (paramInt <= 30)
        break label121;
      paramInt = i;
    }
    label121: 
    while (true)
    {
      i = paramInt;
      if (paramInt < 5)
        i = 5;
      g.RP().Ry().set(ac.a.xSO, Integer.valueOf(i));
      paramInt = ((Integer)com.tencent.mm.plugin.report.service.h.a(i, new int[] { 5, 10, 20, 25, 30 }, 10, 15)).intValue();
      com.tencent.mm.plugin.report.service.h.pYm.a(664L, paramInt, 1L, false);
      AppMethodBeat.o(18608);
      return;
      paramInt -= 5;
      break;
    }
  }

  public static b aZc()
  {
    try
    {
      AppMethodBeat.i(18596);
      if (jZG == null)
      {
        localb = new com/tencent/mm/plugin/f/b;
        localb.<init>();
        jZG = localb;
      }
      b localb = jZG;
      AppMethodBeat.o(18596);
      return localb;
    }
    finally
    {
    }
  }

  public static long aZf()
  {
    AppMethodBeat.i(18604);
    long l1 = ((Long)g.RP().Ry().get(ac.a.xSQ, Long.valueOf(-1L))).longValue();
    long l2 = l1;
    if (l1 <= -1L)
    {
      l2 = ((j)g.K(j.class)).bOr().Ry("message");
      g.RP().Ry().set(ac.a.xSQ, Long.valueOf(l2));
    }
    AppMethodBeat.o(18604);
    return l2;
  }

  public static long aZi()
  {
    AppMethodBeat.i(18610);
    long l = ((Long)g.RP().Ry().get(ac.a.xSP, Long.valueOf(0L))).longValue();
    AppMethodBeat.o(18610);
    return l;
  }

  public static int aZj()
  {
    AppMethodBeat.i(18611);
    int i = ((Integer)g.RP().Ry().get(ac.a.xSO, Integer.valueOf(5))).intValue();
    AppMethodBeat.o(18611);
    return i;
  }

  private void stopScan()
  {
    AppMethodBeat.i(18601);
    f(new b.12(this));
    AppMethodBeat.o(18601);
  }

  public final void O(bi parambi)
  {
    AppMethodBeat.i(18607);
    if (parambi == null)
      AppMethodBeat.o(18607);
    while (true)
    {
      return;
      try
      {
        com.tencent.mm.plugin.f.a.a locala = (com.tencent.mm.plugin.f.a.a)this.jZO.get(Integer.valueOf(parambi.getType()));
        if (locala != null)
          locala.P(parambi);
        AppMethodBeat.o(18607);
      }
      catch (Exception parambi)
      {
        ab.printErrStackTrace("MicroMsg.CalcWxService", parambi, "", new Object[0]);
        com.tencent.mm.plugin.report.service.h.pYm.a(664L, 5L, 1L, false);
        AppMethodBeat.o(18607);
      }
    }
  }

  public final com.tencent.mm.plugin.f.b.b aZd()
  {
    AppMethodBeat.i(18597);
    if (this.jZE == null)
      this.jZE = new com.tencent.mm.plugin.f.b.b(this.jZF);
    com.tencent.mm.plugin.f.b.b localb = this.jZE;
    AppMethodBeat.o(18597);
    return localb;
  }

  public final void aZe()
  {
    boolean bool = false;
    AppMethodBeat.i(18600);
    com.tencent.mm.vfs.b[] arrayOfb = new com.tencent.mm.vfs.b(com.tencent.mm.compatible.util.e.eSn).a(new b.9(this));
    if ((arrayOfb != null) && (arrayOfb.length > 0))
    {
      String str = aZk();
      if (this.jZM != null)
        bool = true;
      ab.i("MicroMsg.CalcWxService", "%s stop manual scan now manualScanTask[%b]", new Object[] { str, Boolean.valueOf(bool) });
      f(new b.10(this, arrayOfb));
    }
    AppMethodBeat.o(18600);
  }

  public final boolean aZg()
  {
    AppMethodBeat.i(18605);
    long l1 = aZf();
    long l2 = aZi();
    if (l2 >= l1);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.CalcWxService", "%d scan finish [%d %d %b]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(l1), Long.valueOf(l2), Boolean.valueOf(bool) });
      if ((bool) && (((Long)g.RP().Ry().get(ac.a.xST, Long.valueOf(0L))).longValue() <= 0L))
        g.RP().Ry().set(ac.a.xST, Long.valueOf(bo.anT()));
      AppMethodBeat.o(18605);
      return bool;
    }
  }

  public final void aZh()
  {
    AppMethodBeat.i(18606);
    this.jZK = false;
    this.jZJ.clear();
    ab.d("MicroMsg.CalcWxService", "%d unlock msg change [%s]", new Object[] { Integer.valueOf(hashCode()), bo.dpG() });
    AppMethodBeat.o(18606);
  }

  public final String aZk()
  {
    AppMethodBeat.i(18612);
    String str = hashCode();
    AppMethodBeat.o(18612);
    return str;
  }

  public final void f(Runnable paramRunnable)
  {
    AppMethodBeat.i(18598);
    try
    {
      if (this.jZH != null)
      {
        this.jZH.aa(paramRunnable);
        AppMethodBeat.o(18598);
      }
      while (true)
      {
        return;
        ab.w("MicroMsg.CalcWxService", "%s post runnable but thread is null ", new Object[] { aZk() });
        AppMethodBeat.o(18598);
      }
    }
    catch (Exception paramRunnable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.CalcWxService", paramRunnable, "post error: [%s]", new Object[] { paramRunnable.toString() });
        AppMethodBeat.o(18598);
      }
    }
  }

  public final void fD(boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(18599);
    String str = aZk();
    if (this.jZM != null)
      bool = true;
    ab.d("MicroMsg.CalcWxService", "%s manual scan now manualScanTask[%b] uiClick[%b]", new Object[] { str, Boolean.valueOf(bool), Boolean.valueOf(paramBoolean) });
    f(new b.6(this, paramBoolean));
    AppMethodBeat.o(18599);
  }

  public final void gS(long paramLong)
  {
    AppMethodBeat.i(18609);
    ab.d("MicroMsg.CalcWxService", "%d update scan msgid[%d]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(paramLong) });
    g.RP().Ry().set(ac.a.xSP, Long.valueOf(paramLong));
    AppMethodBeat.o(18609);
  }

  public final void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(18602);
    ab.i("MicroMsg.CalcWxService", "%s CalcWxService Initialized", new Object[] { aZk() });
    if (this.jZH == null)
    {
      ab.i("MicroMsg.CalcWxService", "%s init calc wx thread", new Object[] { aZk() });
      this.jZH = new al("calc-wx");
    }
    paramc = g.RP().cachePath + "WxFileIndex.db";
    this.jZF = t.a(hashCode(), paramc, jZD, true);
    this.jZO.put(Integer.valueOf(43), new com.tencent.mm.plugin.f.a.e());
    this.jZO.put(Integer.valueOf(62), new com.tencent.mm.plugin.f.a.e());
    this.jZO.put(Integer.valueOf(44), new com.tencent.mm.plugin.f.a.e());
    this.jZO.put(Integer.valueOf(34), new f());
    this.jZO.put(Integer.valueOf(3), new d());
    this.jZO.put(Integer.valueOf(49), new com.tencent.mm.plugin.f.a.c());
    this.jZO.put(Integer.valueOf(268435505), new com.tencent.mm.plugin.f.a.b());
    aZf();
    ((j)g.K(j.class)).bOr().a(this.jKo, null);
    com.tencent.mm.sdk.b.a.xxA.b(this.jZR);
    paramc = ah.getContext();
    Object localObject = paramc.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    boolean bool;
    if (localObject != null)
    {
      int i = ((Intent)localObject).getIntExtra("status", -1);
      if ((i == 2) || (i == 5))
        bool = true;
    }
    for (this.jZS = bool; ; this.jZS = false)
    {
      this.jZT = ((PowerManager)paramc.getSystemService("power")).isScreenOn();
      this.jZU = new b.4(this);
      localObject = new IntentFilter();
      ((IntentFilter)localObject).addAction("android.intent.action.SCREEN_ON");
      ((IntentFilter)localObject).addAction("android.intent.action.SCREEN_OFF");
      ((IntentFilter)localObject).addAction("android.intent.action.ACTION_POWER_CONNECTED");
      ((IntentFilter)localObject).addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
      paramc.registerReceiver(this.jZU, (IntentFilter)localObject);
      com.tencent.mm.sdk.b.a.xxA.b(this.jZX);
      if (this.jZW)
        com.tencent.mm.sdk.b.a.xxA.m(new bp());
      AppMethodBeat.o(18602);
      return;
      bool = false;
      break;
    }
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(18603);
    ab.i("MicroMsg.CalcWxService", "CalcWxService Release");
    this.jZJ.clear();
    this.jZK = false;
    if (this.jZF != null)
    {
      this.jZF.mJ(hashCode());
      this.jZF = null;
    }
    ((j)g.K(j.class)).bOr().a(this.jKo);
    com.tencent.mm.sdk.b.a.xxA.d(this.jZR);
    this.jZO.clear();
    if (this.jZU != null)
    {
      ah.getContext().unregisterReceiver(this.jZU);
      this.jZU = null;
    }
    if (this.jZV != null)
    {
      aw.RS();
      al.af(this.jZV);
      this.jZV = null;
    }
    stopScan();
    if (this.jZH != null)
    {
      ab.i("MicroMsg.CalcWxService", "%s quit calc wx thread", new Object[] { aZk() });
      this.jZH.oAl.quit();
    }
    this.jZH = null;
    com.tencent.mm.sdk.b.a.xxA.d(this.jZX);
    AppMethodBeat.o(18603);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b
 * JD-Core Version:    0.6.2
 */