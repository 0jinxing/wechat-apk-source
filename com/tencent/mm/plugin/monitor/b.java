package com.tencent.mm.plugin.monitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.HandlerThread;
import android.os.PowerManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.vfs.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class b
  implements at
{
  private static final long startTime;
  private k.a foI;
  private boolean jZS;
  private boolean jZT;
  private BroadcastReceiver jZU;
  private Runnable jZV;
  private com.tencent.mm.sdk.b.c nqj;
  private long oEA;
  private long oEB;
  private long oEC;
  private long oED;
  private long oEE;
  private a.a oEF;
  private long oEG;
  private f oEH;
  private Runnable oEI;
  private Runnable oEJ;
  private ap oEK;
  private long oEt;
  private long oEu;
  private long oEv;
  private long oEw;
  private long oEx;
  private long oEy;
  private long oEz;

  static
  {
    AppMethodBeat.i(84555);
    startTime = System.currentTimeMillis();
    AppMethodBeat.o(84555);
  }

  public b()
  {
    AppMethodBeat.i(84536);
    this.oEt = 1024L;
    this.oEu = 10L;
    this.oEv = 1800L;
    this.oEw = 3000000L;
    this.oEx = 15000L;
    this.oEy = 100000L;
    this.oEz = 10000L;
    this.oEA = 1024L;
    this.oEB = 1440L;
    this.oEC = 20L;
    this.oED = 1440L;
    this.jZS = false;
    this.jZT = true;
    this.oEE = 0L;
    this.oEG = 0L;
    this.oEH = new b.1(this);
    this.foI = new k.a()
    {
      public final void a(String paramAnonymousString, m paramAnonymousm)
      {
        AppMethodBeat.i(84525);
        ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv abTestListener onNotifyChange stack[%s]", new Object[] { bo.dpG() });
        if ((paramAnonymousString != null) && (paramAnonymousString.length() > 0) && ("event_updated".equals(paramAnonymousString)))
          com.tencent.mm.sdk.g.d.xDH.o(new b.8.1(this), 100L);
        AppMethodBeat.o(84525);
      }
    };
    this.oEI = new b.9(this);
    this.oEJ = new b.10(this);
    this.nqj = new b.11(this);
    this.oEK = new ap(g.RS().oAl.getLooper(), new b.12(this), true);
    AppMethodBeat.o(84536);
  }

  private static boolean RQ(String paramString)
  {
    AppMethodBeat.i(84540);
    g.RQ();
    boolean bool;
    if (g.RP().eJM.equals(paramString + "/"))
    {
      bool = true;
      AppMethodBeat.o(84540);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84540);
    }
  }

  private a.a a(com.tencent.mm.vfs.b paramb, a.a parama, a.b paramb1, a.c paramc, Map<String, Integer> paramMap, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(84541);
    if (parama.fIa)
    {
      ab.i("MicroMsg.SubCoreBaseMonitor", "summclean scanFile been canceled fileResult[%s], subDirResult[%s]", new Object[] { parama, paramb1 });
      AppMethodBeat.o(84541);
      return parama;
    }
    if (parama.bna < paramInt)
      parama.bna += 1;
    Object localObject1;
    if (paramb.isDirectory())
    {
      localObject1 = j.w(paramb.dMD());
      if (paramb1 != null)
        break label1027;
      if ((paramMap != null) && (paramMap.size() > 0) && (paramMap.get(localObject1) != null))
      {
        paramb1 = new a.b((String)localObject1, ((Integer)paramMap.get(localObject1)).intValue());
        paramMap.remove(localObject1);
        label142: localObject2 = paramb1;
        if (paramb1 != null)
        {
          parama.oEq.add(paramb1);
          ab.d("MicroMsg.SubCoreBaseMonitor", "summerhv scanFile start scan subDir[%s], fileResult[%s], newSubDirResult[%s]", new Object[] { localObject1, parama, paramb1 });
        }
      }
    }
    label1024: label1027: for (Object localObject2 = paramb1; ; localObject2 = paramb1)
    {
      parama.oEo += 1L;
      if (localObject2 != null)
        ((a.b)localObject2).oEo += 1L;
      if (paramc != null)
        paramc.oEo += 1L;
      int i;
      if (paramInt > 15)
      {
        ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv scanFile been stopped as depth[%d] over limit path[%s], fileResult[%s]", new Object[] { Integer.valueOf(paramInt), j.w(paramb.dMD()), parama });
        AppMethodBeat.o(84541);
        break;
        localObject2 = paramb.getParent();
        if (com.tencent.mm.compatible.util.e.eSn.equals((String)localObject2 + "/"))
          i = 1;
        while (true)
          if ((i != 0) && (!RQ((String)localObject1)))
          {
            if (Pattern.matches("[a-fA-F0-9]{32}temp[0-9]{13}", paramb.getName()))
            {
              paramb1 = new a.b((String)localObject1, 202);
              break;
              i = 0;
              continue;
            }
            if (Pattern.matches("[a-fA-F0-9]{32}", paramb.getName()))
            {
              paramb1 = new a.b((String)localObject1, 201);
              break;
            }
            paramb1 = new a.b((String)localObject1, 203);
            break;
          }
        if (!RQ(paramb.getParent()))
          break label1024;
        paramb1 = new a.b((String)localObject1, 203);
        break label142;
      }
      localObject1 = paramb.list();
      int j;
      if (localObject1 != null)
      {
        if (paramBoolean)
        {
          j = localObject1.length;
          i = 0;
          while (i < j)
          {
            String str = localObject1[i];
            paramb1 = paramc;
            if (!bo.isNullOrNil(str))
            {
              paramb1 = paramc;
              if (Pattern.matches("[a-fA-F0-9]{32}temp[0-9]{13}", str))
              {
                paramb1 = new a.c(j.w(paramb.dMD()) + "/" + str);
                parama.oEr.add(paramb1);
              }
            }
            a(new com.tencent.mm.vfs.b(j.w(paramb.mUri) + "/" + str), parama, (a.b)localObject2, paramb1, paramMap, false, paramInt + 1);
            i++;
            paramc = paramb1;
          }
        }
        i = 1;
        int k = localObject1.length;
        j = 0;
        label620: if (j >= k)
          break label968;
        paramb1 = localObject1[j];
        a(new com.tencent.mm.vfs.b(j.w(paramb.dMD()) + "/" + paramb1), parama, (a.b)localObject2, paramc, paramMap, false, paramInt + 1);
        if ((i == 0) || (parama.bna <= 15))
          break label1021;
        h.pYm.a(418L, 7L, 1L, true);
        h.pYm.e(13778, new Object[] { Integer.valueOf(2), Integer.valueOf(2), j.w(paramb.dMD()) + "/" + paramb1 });
        i = 0;
      }
      label968: label1021: 
      while (true)
      {
        j++;
        break label620;
        ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv scanFile dir is empty[%s] ret", new Object[] { j.w(paramb.dMD()) });
        AppMethodBeat.o(84541);
        break;
        parama.oEp += 1L;
        if (paramb1 != null)
          paramb1.oEp += 1L;
        if (paramc != null)
          paramc.oEp += 1L;
        if (!paramb.exists())
        {
          ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv scanFile file not exist[%s][%d] ret", new Object[] { j.w(paramb.dMD()), Long.valueOf(parama.oEp) });
          AppMethodBeat.o(84541);
          break;
        }
        long l = paramb.length();
        if ((l > 0L) && (l < 2147483648L))
        {
          parama.jrb += l;
          if (paramb1 != null)
            paramb1.jrb += l;
          if (paramc != null)
            paramc.jrb = (l + paramc.jrb);
        }
        while (true)
        {
          AppMethodBeat.o(84541);
          break;
          parama.fileLenInvalidCount += 1L;
          if (paramb1 != null)
            paramb1.fileLenInvalidCount += 1L;
          if (paramc != null)
            paramc.oEs += 1L;
        }
      }
      break label142;
    }
  }

  private boolean je(boolean paramBoolean)
  {
    AppMethodBeat.i(84537);
    Object localObject = com.tencent.mm.model.c.c.abi().ll("100212");
    ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv reloadHeavyUserCfg update[%b] abTest[%s][%b][%s] default[%d, %d, %d, %d, %d, %d, %d, %d, %d, %d, %d]", new Object[] { Boolean.valueOf(paramBoolean), localObject, Boolean.valueOf(((com.tencent.mm.storage.c)localObject).isValid()), ((com.tencent.mm.storage.c)localObject).dru(), Long.valueOf(1024L), Long.valueOf(10L), Long.valueOf(1800L), Long.valueOf(3000000L), Long.valueOf(15000L), Long.valueOf(15000L), Long.valueOf(100000L), Long.valueOf(10000L), Long.valueOf(1440L), Long.valueOf(20L), Long.valueOf(1440L) });
    if (((com.tencent.mm.storage.c)localObject).isValid())
    {
      ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv reloadHeavyUserCfg abTest valid!");
      localObject = ((com.tencent.mm.storage.c)localObject).dru();
      long l1 = bo.getLong((String)((Map)localObject).get("sdsize"), 1024L);
      long l2 = bo.getLong((String)((Map)localObject).get("sdratio"), 10L);
      long l3 = bo.getLong((String)((Map)localObject).get("dbsize"), 1800L);
      long l4 = bo.getLong((String)((Map)localObject).get("fdbsize"), 1024L);
      long l5 = bo.getLong((String)((Map)localObject).get("msg"), 3000000L);
      long l6 = bo.getLong((String)((Map)localObject).get("conv"), 15000L);
      long l7 = bo.getLong((String)((Map)localObject).get("contact"), 100000L);
      long l8 = bo.getLong((String)((Map)localObject).get("chatroom"), 10000L);
      long l9 = bo.getLong((String)((Map)localObject).get("sditv"), 1440L);
      long l10 = bo.getLong((String)((Map)localObject).get("sdwait"), 20L);
      long l11 = bo.getLong((String)((Map)localObject).get("dbitv"), 1440L);
      ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv reloadHeavyUserCfg sd[%d, %d] sdr[%d, %d] db[%d, %d] fdbsize[%d, %d] msg[%d, %d] conv[%d, %d] contact[%d, %d] chatroom[%d, %d] sditv[%d, %d] sdwait[%d, %d] dbitv[%d, %d]", new Object[] { Long.valueOf(this.oEt), Long.valueOf(l1), Long.valueOf(this.oEu), Long.valueOf(l2), Long.valueOf(this.oEv), Long.valueOf(l3), Long.valueOf(this.oEA), Long.valueOf(l4), Long.valueOf(this.oEw), Long.valueOf(l5), Long.valueOf(this.oEx), Long.valueOf(l6), Long.valueOf(this.oEy), Long.valueOf(l7), Long.valueOf(this.oEz), Long.valueOf(l8), Long.valueOf(this.oEB), Long.valueOf(l9), Long.valueOf(this.oEC), Long.valueOf(l10), Long.valueOf(this.oED), Long.valueOf(l11) });
      if (this.oEt != l1)
      {
        this.oEt = l1;
        bool = true;
        if (this.oEu != l2)
        {
          this.oEu = l2;
          bool = true;
        }
        if (this.oEv != l3)
        {
          this.oEv = l3;
          bool = true;
        }
        if (this.oEA != l4)
        {
          this.oEA = l4;
          bool = true;
        }
        if (this.oEw != l5)
        {
          this.oEw = l5;
          bool = true;
        }
        if (this.oEx != l6)
        {
          this.oEx = l6;
          bool = true;
        }
        if (this.oEy != l7)
        {
          this.oEy = l7;
          bool = true;
        }
        if (this.oEz != l8)
        {
          this.oEz = l8;
          bool = true;
        }
        if (this.oEB != l9)
        {
          this.oEB = l9;
          bool = true;
        }
        if (this.oEC != l10)
        {
          this.oEC = l10;
          bool = true;
        }
        if (this.oED != l11)
          this.oED = l11;
      }
    }
    for (boolean bool = true; ; bool = false)
    {
      if (bool)
      {
        h.pYm.a(509L, 0L, 1L, true);
        if (paramBoolean)
          h.pYm.a(509L, 18L, 1L, true);
      }
      if (this.oEt <= 0L)
      {
        h.pYm.a(509L, 30L, 1L, true);
        this.oEt = 1024L;
      }
      if (this.oEu <= 0L)
      {
        h.pYm.a(509L, 31L, 1L, true);
        this.oEu = 10L;
      }
      if (this.oEv <= 0L)
      {
        h.pYm.a(509L, 32L, 1L, true);
        this.oEv = 1800L;
      }
      if (this.oEw <= 0L)
      {
        h.pYm.a(509L, 33L, 1L, true);
        this.oEw = 3000000L;
      }
      if (this.oEx <= 0L)
      {
        h.pYm.a(509L, 34L, 1L, true);
        this.oEx = 15000L;
      }
      if (this.oEy <= 0L)
      {
        h.pYm.a(509L, 35L, 1L, true);
        this.oEy = 100000L;
      }
      if (this.oEz <= 0L)
      {
        h.pYm.a(509L, 36L, 1L, true);
        this.oEz = 10000L;
      }
      if (this.oEB <= 0L)
      {
        h.pYm.a(509L, 37L, 1L, true);
        this.oEB = 1440L;
      }
      if (this.oEC <= 0L)
      {
        h.pYm.a(509L, 38L, 1L, true);
        this.oEC = 20L;
      }
      if (this.oED <= 0L)
      {
        h.pYm.a(509L, 39L, 1L, true);
        this.oED = 1440L;
      }
      if (this.oEA <= 0L)
      {
        h.pYm.a(509L, 40L, 1L, true);
        this.oEA = 1024L;
      }
      AppMethodBeat.o(84537);
      return bool;
      bool = false;
      break;
    }
  }

  private void k(int paramInt, long paramLong1, long paramLong2)
  {
    try
    {
      AppMethodBeat.i(84542);
      long l;
      label32: ac.a locala;
      if (paramLong1 > paramLong2)
      {
        bool = true;
        if (!bool)
          break label302;
        l = this.oEG | paramInt;
        ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv resetHeavyUser type[%d] value[%d] limit[%d] heavy[%b] mHeavyUser[%d] newHeavyUser[%d] tid[%s]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Boolean.valueOf(bool), Long.valueOf(this.oEG), Long.valueOf(l), Long.valueOf(Thread.currentThread().getId()) });
        if (l != this.oEG)
        {
          if (this.oEG == 0L)
            h.pYm.a(509L, 1L, 1L, true);
          if (l == 0L)
            h.pYm.a(509L, 2L, 1L, true);
        }
        locala = null;
        switch (paramInt)
        {
        default:
          this.oEG = l;
          if (l == 0L)
            break;
        case 1:
        case 2:
        case 4:
        case 8:
        case 16:
        case 32:
        case 64:
        case 128:
        }
      }
      for (boolean bool = true; ; bool = false)
      {
        com.tencent.mm.plugin.report.service.e.ki(bool);
        Object localObject2 = com.tencent.mm.sdk.g.d.xDH;
        b.6 local6 = new com/tencent/mm/plugin/monitor/b$6;
        local6.<init>(this, l, locala, paramLong1);
        ((com.tencent.mm.sdk.g.a.c)localObject2).ak(local6);
        AppMethodBeat.o(84542);
        return;
        bool = false;
        break;
        label302: l = this.oEG & (paramInt ^ 0xFFFFFFFF);
        break label32;
        locala = ac.a.xQt;
        localObject2 = h.pYm;
        if (bool);
        for (paramLong2 = 3L; ; paramLong2 = 4L)
        {
          ((h)localObject2).a(509L, paramLong2, 1L, true);
          break;
        }
        locala = ac.a.xQu;
        localObject2 = h.pYm;
        if (bool);
        for (paramLong2 = 5L; ; paramLong2 = 6L)
        {
          ((h)localObject2).a(509L, paramLong2, 1L, true);
          break;
        }
        locala = ac.a.xQv;
        localObject2 = h.pYm;
        if (bool);
        for (paramLong2 = 7L; ; paramLong2 = 8L)
        {
          ((h)localObject2).a(509L, paramLong2, 1L, true);
          break;
        }
        locala = ac.a.xQw;
        localObject2 = h.pYm;
        if (bool);
        for (paramLong2 = 9L; ; paramLong2 = 10L)
        {
          ((h)localObject2).a(509L, paramLong2, 1L, true);
          break;
        }
        locala = ac.a.xQx;
        localObject2 = h.pYm;
        if (bool);
        for (paramLong2 = 11L; ; paramLong2 = 12L)
        {
          ((h)localObject2).a(509L, paramLong2, 1L, true);
          break;
        }
        locala = ac.a.xQy;
        localObject2 = h.pYm;
        if (bool);
        for (paramLong2 = 13L; ; paramLong2 = 14L)
        {
          ((h)localObject2).a(509L, paramLong2, 1L, true);
          break;
        }
        locala = ac.a.xQz;
        localObject2 = h.pYm;
        if (bool);
        for (paramLong2 = 15L; ; paramLong2 = 16L)
        {
          ((h)localObject2).a(509L, paramLong2, 1L, true);
          break;
        }
        locala = ac.a.xQA;
        localObject2 = h.pYm;
        if (bool);
        for (paramLong2 = 19L; ; paramLong2 = 20L)
        {
          ((h)localObject2).a(509L, paramLong2, 1L, true);
          break;
        }
      }
    }
    finally
    {
    }
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(84538);
    a.xxA.b(this.nqj);
    com.tencent.mm.model.c.c.abi().c(this.foI);
    boolean bool = je(false);
    g.RQ();
    this.oEG = ((Long)g.RP().Ry().get(ac.a.xQr, Long.valueOf(0L))).longValue();
    Object localObject1;
    Object localObject2;
    if (this.oEG != 0L)
    {
      paramBoolean = true;
      com.tencent.mm.plugin.report.service.e.ki(paramBoolean);
      ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv onAccountPostReset heavyuser[%d], reloadHeavyUser[%b] abTestListener[%s]", new Object[] { Long.valueOf(this.oEG), Boolean.valueOf(bool), this.foI });
      g.RQ();
      g.RO().eJo.a(989, this.oEH);
      g.RQ();
      g.RO().eJo.a(988, this.oEH);
      g.RQ();
      g.RO().eJo.a(987, this.oEH);
      g.RQ();
      g.RO().eJo.a(986, this.oEH);
      g.RQ();
      this.oEE = ((Long)g.RP().Ry().get(ac.a.xPt, Long.valueOf(0L))).longValue();
      localObject1 = ah.getContext();
      localObject2 = ((Context)localObject1).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
      if (localObject2 == null)
        break label501;
      int i = ((Intent)localObject2).getIntExtra("status", -1);
      if ((i != 2) && (i != 5))
        break label496;
      paramBoolean = true;
      label275: this.jZS = paramBoolean;
      label280: this.jZT = ((PowerManager)((Context)localObject1).getSystemService("power")).isScreenOn();
      this.jZU = new b.13(this);
      localObject2 = new IntentFilter();
      ((IntentFilter)localObject2).addAction("android.intent.action.SCREEN_ON");
      ((IntentFilter)localObject2).addAction("android.intent.action.SCREEN_OFF");
      ((IntentFilter)localObject2).addAction("android.intent.action.ACTION_POWER_CONNECTED");
      ((IntentFilter)localObject2).addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
      ((IntentFilter)localObject2).addAction("android.intent.action.TIME_SET");
      ((IntentFilter)localObject2).addAction("android.intent.action.DATE_CHANGED");
      ((Context)localObject1).registerReceiver(this.jZU, (IntentFilter)localObject2);
      if (this.oEF == null)
        break label509;
      localObject1 = "enabled";
      label388: if (!this.jZT)
        break label516;
      localObject2 = "";
      label400: if (!this.jZS)
        break label524;
    }
    label516: label524: for (String str = ""; ; str = " not")
    {
      ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv registerReceiver auto scan %s. Device status:%s interactive,%s charging mLastAutoScanTime[%d], mAutoScanInterval[%d], mAutoScanWaitTime[%d].", new Object[] { localObject1, localObject2, str, Long.valueOf(this.oEE), Long.valueOf(this.oEB * 60000L), Long.valueOf(this.oEC * 60000L) });
      this.oEK.stopTimer();
      AppMethodBeat.o(84538);
      return;
      paramBoolean = false;
      break;
      label496: paramBoolean = false;
      break label275;
      label501: this.jZS = false;
      break label280;
      label509: localObject1 = "disabled";
      break label388;
      localObject2 = " not";
      break label400;
    }
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(84539);
    ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv onAccountRelease [%d]", new Object[] { Long.valueOf(startTime), Long.valueOf(System.currentTimeMillis()) });
    if (this.jZU != null)
    {
      ah.getContext().unregisterReceiver(this.jZU);
      ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv unregisterReceiver mChargeAndInteractiveReceiver[%s]", new Object[] { this.jZU });
      this.jZU = null;
    }
    if (this.jZV != null)
    {
      com.tencent.mm.sdk.g.d.xDH.al(this.jZV);
      this.jZV = null;
      ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv unregisterReceiver remove[%s]", new Object[] { this.oEF });
    }
    if (this.oEF != null)
    {
      this.oEF.fIa = true;
      ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv unregisterReceiver canceled[%s]", new Object[] { this.oEF });
      this.oEF = null;
    }
    g.RQ();
    g.RO().eJo.b(989, this.oEH);
    g.RQ();
    g.RO().eJo.b(988, this.oEH);
    g.RQ();
    g.RO().eJo.b(987, this.oEH);
    g.RQ();
    g.RO().eJo.b(986, this.oEH);
    com.tencent.mm.model.c.c.abi().d(this.foI);
    a.xxA.d(this.nqj);
    AppMethodBeat.o(84539);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.monitor.b
 * JD-Core Version:    0.6.2
 */