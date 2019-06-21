package com.tencent.mm.kernel;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.i;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.g.a.cc;
import com.tencent.mm.g.a.cd;
import com.tencent.mm.g.a.gi;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.model.as;
import com.tencent.mm.model.av;
import com.tencent.mm.model.ax;
import com.tencent.mm.model.cf;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bs;
import com.tencent.mm.storage.by;
import com.tencent.mm.storage.z;
import com.tencent.mm.vfs.FileSystemManager;
import com.tencent.mm.vfs.FileSystemManager.MaintenanceBroadcastReceiver;
import com.tencent.mm.vfs.FileSystemManager.a;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public final class a
{
  private static boolean eIJ;
  private static boolean eIK;
  static b eIM;
  private static String eIN;
  private static String eIO;
  private static boolean eIP;
  private static int eIY;
  private com.tencent.mm.kernel.api.c eIH;
  private com.tencent.mm.ai.y eII;
  byte[] eIL;
  public com.tencent.mm.model.a eIQ;
  public e.c eIR;
  public int eIS;
  public boolean eIT;
  private boolean eIU;
  public int eIV;
  public int eIW;
  public List<as> eIX;
  long eIZ;
  private volatile a eJa;
  public volatile boolean eJb;
  private String eJc;
  private Map<String, Integer> eJd;

  static
  {
    AppMethodBeat.i(57921);
    eIJ = true;
    eIK = false;
    eIM = new b();
    eIN = "NoResetUinStack";
    eIO = null;
    eIY = -1;
    AppMethodBeat.o(57921);
  }

  public a(com.tencent.mm.kernel.api.c paramc)
  {
    AppMethodBeat.i(57893);
    this.eIL = new byte[0];
    this.eIT = false;
    this.eIU = false;
    this.eIV = 0;
    this.eIX = new LinkedList();
    this.eJa = a.eJg;
    this.eJb = false;
    this.eJc = "";
    this.eJd = new HashMap();
    Assert.assertNotNull(eIM);
    g.RQ();
    boolean bool;
    if (bo.h((Integer)g.RP().eJH.get(17)) != 0)
    {
      bool = true;
      eIJ = bool;
      if (!f.vxx)
        break label144;
    }
    label144: for (int i = 763; ; i = 702)
    {
      com.tencent.mm.protocal.j.c.a.vxR = new ax(i);
      this.eIH = paramc;
      AppMethodBeat.o(57893);
      return;
      bool = false;
      break;
    }
  }

  public static SharedPreferences Mz()
  {
    AppMethodBeat.i(57912);
    SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("notify_key_pref_settings", com.tencent.mm.compatible.util.h.Mu());
    AppMethodBeat.o(57912);
    return localSharedPreferences;
  }

  public static int QF()
  {
    AppMethodBeat.i(57894);
    int i = b.a(eIM);
    AppMethodBeat.o(57894);
    return i;
  }

  public static String QG()
  {
    AppMethodBeat.i(57895);
    String str = new com.tencent.mm.a.p(b.a(eIM)).toString();
    AppMethodBeat.o(57895);
    return str;
  }

  public static String QH()
  {
    return eIO;
  }

  public static boolean QI()
  {
    return eIP;
  }

  public static void QJ()
  {
    eIP = true;
  }

  public static String QK()
  {
    return eIN;
  }

  protected static void QL()
  {
    AppMethodBeat.i(57896);
    b.a(eIM, 0);
    AppMethodBeat.o(57896);
  }

  protected static void QM()
  {
    AppMethodBeat.i(57897);
    b.a(eIM, 0);
    AppMethodBeat.o(57897);
  }

  private void QN()
  {
    AppMethodBeat.i(57898);
    this.eJa = a.eJg;
    this.eJb = false;
    ab.i("MMKernel.CoreAccount", "mAccountStatus to NotReady");
    ah.getContext().getSharedPreferences(ah.doA(), 0).edit().putBoolean("isLogin", false).commit();
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
    ab.w("MMKernel.CoreAccount", "[arthurdan.AccountNR] account storage reset! uin:%d, resetStack is:%s, resetTime:%s", new Object[] { Integer.valueOf(b.a(eIM)), eIN, localSimpleDateFormat.format(new Date()) });
    AppMethodBeat.o(57898);
  }

  public static boolean QS()
  {
    return eIK;
  }

  public static boolean QT()
  {
    AppMethodBeat.i(57904);
    if (eIJ)
    {
      g.RQ();
      if (g.RN() == null)
        break label80;
      g.RQ();
      g.RN();
    }
    label80: for (String str = com.tencent.mm.a.p.getString(b.a(eIM)); ; str = "-1")
    {
      ab.w("MMKernel.CoreAccount", "account holded :%s init:%b", new Object[] { str, Boolean.valueOf(g.RN().QY()) });
      boolean bool = eIJ;
      AppMethodBeat.o(57904);
      return bool;
    }
  }

  public static int QW()
  {
    AppMethodBeat.i(57911);
    int i = Mz().getInt("notification.user.state", 0);
    AppMethodBeat.o(57911);
    return i;
  }

  public static boolean QX()
  {
    AppMethodBeat.i(57915);
    boolean bool;
    if (b.a(eIM) != 0)
    {
      bool = true;
      AppMethodBeat.o(57915);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(57915);
    }
  }

  public static int Ra()
  {
    AppMethodBeat.i(57917);
    int i = ah.getContext().getSharedPreferences("system_config_prefs", com.tencent.mm.compatible.util.h.Mu()).getInt("default_uin", 0);
    AppMethodBeat.o(57917);
    return i;
  }

  public static String Rb()
  {
    AppMethodBeat.i(57918);
    g.RQ();
    if (bo.isNullOrNil(g.RN().eJc))
      Rc();
    g.RQ();
    String str = g.RN().eJc;
    AppMethodBeat.o(57918);
    return str;
  }

  public static void Rc()
  {
    AppMethodBeat.i(57919);
    g.RQ();
    g.RN().eJc = (q.LM() + "_" + System.currentTimeMillis());
    g.RQ();
    g.RN().eJd.clear();
    AppMethodBeat.o(57919);
  }

  public static void cm(boolean paramBoolean)
  {
    eIK = paramBoolean;
  }

  public static void hold()
  {
    AppMethodBeat.i(57905);
    g.RQ();
    if (g.RN() != null)
    {
      g.RQ();
      g.RN();
    }
    for (String str = com.tencent.mm.a.p.getString(b.a(eIM)); ; str = "-1")
    {
      ab.w("MMKernel.CoreAccount", " HOLD ACCOUNT! uin:%s stack:%s init:%b", new Object[] { str, bo.dpG(), Boolean.valueOf(g.RN().QY()) });
      eIJ = true;
      g.RQ();
      g.RP().eJH.set(17, Integer.valueOf(1));
      AppMethodBeat.o(57905);
      return;
    }
  }

  static boolean jN(int paramInt)
  {
    if (paramInt != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static void jO(int paramInt)
  {
    AppMethodBeat.i(57910);
    if ((eIY != -1) && (eIY == paramInt))
      AppMethodBeat.o(57910);
    while (true)
    {
      return;
      eIY = paramInt;
      Mz().edit().putInt("notification.user.state", paramInt).commit();
      ab.i("MMKernel.CoreAccount", "[NOTIFICATION SETTINGS]save UserStatus: %d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(57910);
    }
  }

  public static boolean jP(int paramInt)
  {
    if ((paramInt & 0x1) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static String lD(String paramString)
  {
    eIO = paramString;
    return paramString;
  }

  public static void lE(String paramString)
  {
    eIN = paramString;
  }

  public static int lF(String paramString)
  {
    AppMethodBeat.i(57920);
    g.RQ();
    int i;
    int j;
    if (g.RN().eJd.get(paramString) == null)
    {
      i = 0;
      j = (int)bo.anT();
      if (i != 0)
        break label91;
      g.RQ();
      g.RN().eJd.put(paramString, Integer.valueOf(j));
      AppMethodBeat.o(57920);
    }
    while (true)
    {
      return i;
      g.RQ();
      i = ((Integer)g.RN().eJd.get(paramString)).intValue();
      break;
      label91: i = j - i;
      g.RQ();
      g.RN().eJd.put(paramString, Integer.valueOf(j));
      if (i >= 0)
      {
        AppMethodBeat.o(57920);
      }
      else
      {
        AppMethodBeat.o(57920);
        i = 0;
      }
    }
  }

  public static void unhold()
  {
    AppMethodBeat.i(57906);
    g.RQ();
    if (g.RN() != null)
    {
      g.RQ();
      g.RN();
    }
    for (String str = com.tencent.mm.a.p.getString(b.a(eIM)); ; str = "-1")
    {
      ab.w("MMKernel.CoreAccount", " UN HOLD ACCOUNT! uin:%s init:%b", new Object[] { str, Boolean.valueOf(g.RN().QY()) });
      eIJ = false;
      g.RQ();
      g.RP().eJH.set(17, Integer.valueOf(0));
      AppMethodBeat.o(57906);
      return;
    }
  }

  final void QO()
  {
    AppMethodBeat.i(57899);
    ab.w("MMKernel.CoreAccount", "account storage release  uin:%s thread:%s stack:%s", new Object[] { com.tencent.mm.a.p.getString(b.a(eIM)), Thread.currentThread().getName(), bo.dpG() });
    if (!QY())
    {
      ab.i("MMKernel.CoreAccount", "Fatal crash error!!! status is not initialized when release(), this callStack is:%s, last reset stack is:%s", new Object[] { bo.dpG().toString(), eIN });
      AppMethodBeat.o(57899);
    }
    while (true)
    {
      return;
      this.eIH.onAccountRelease();
      g.RQ();
      g.RP().jC(null);
      QN();
      g.RQ();
      g.RP().eJV.clear();
      AppMethodBeat.o(57899);
    }
  }

  public final void QP()
  {
    AppMethodBeat.i(57901);
    if (!this.eIU)
    {
      ab.i("MMKernel.CoreAccount", "no need do account initialized notify.");
      AppMethodBeat.o(57901);
    }
    while (true)
    {
      return;
      this.eIU = false;
      ab.i("MMKernel.CoreAccount", "summerasyncinit onAccountInitialized tid:%d, stack[%s]", new Object[] { Long.valueOf(Thread.currentThread().getId()), bo.dpG() });
      long l = System.currentTimeMillis();
      this.eIH.onAccountInitialized(this.eIR);
      ab.i("MMKernel.CoreAccount", "summerasyncinit onAccountInitialized run tid[%d] take[%d]ms", new Object[] { Long.valueOf(Thread.currentThread().getId()), Long.valueOf(System.currentTimeMillis() - l) });
      QQ();
      AppMethodBeat.o(57901);
    }
  }

  public final void QQ()
  {
    AppMethodBeat.i(57902);
    if ((QY()) && (com.tencent.mm.kernel.a.c.Sa().eLa))
    {
      ab.i("MMKernel.CoreAccount", "Flush client version.");
      g.RP().Rp();
    }
    AppMethodBeat.o(57902);
  }

  public final com.tencent.mm.ai.y QR()
  {
    try
    {
      AppMethodBeat.i(57903);
      if (this.eII == null)
      {
        localy = new com/tencent/mm/ai/y;
        localy.<init>();
        this.eII = localy;
      }
      com.tencent.mm.ai.y localy = this.eII;
      AppMethodBeat.o(57903);
      return localy;
    }
    finally
    {
    }
  }

  public final void QU()
  {
    AppMethodBeat.i(57907);
    if (!QY())
    {
      com.tencent.mm.model.b localb = new com.tencent.mm.model.b();
      AppMethodBeat.o(57907);
      throw localb;
    }
    AppMethodBeat.o(57907);
  }

  public final void QV()
  {
    AppMethodBeat.i(57908);
    new ak(Looper.getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(57881);
        as[] arrayOfas = new as[a.b(a.this).size()];
        a.b(a.this).toArray(arrayOfas);
        int i = arrayOfas.length;
        for (int j = 0; j < i; j++)
          arrayOfas[j].ZB();
        AppMethodBeat.o(57881);
      }
    });
    AppMethodBeat.o(57908);
  }

  public final boolean QY()
  {
    if (this.eJa == a.eJh);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void QZ()
  {
    AppMethodBeat.i(57916);
    ab.i("MMKernel.CoreAccount", "summerasyncinit setInitializedNotifyAllDone[%b] to true stack[%s]", new Object[] { Boolean.valueOf(this.eJb), bo.dpG() });
    this.eJb = true;
    long l = SystemClock.elapsedRealtime();
    ab.i("MMKernel.CoreAccount", "summerhardcoder setInitializedNotifyAllDone [%d %d] take[%d]ms, stack[%s]", new Object[] { Long.valueOf(this.eIZ), Long.valueOf(l), Long.valueOf(l - this.eIZ), bo.dpG() });
    cc localcc = new cc();
    com.tencent.mm.sdk.b.a.xxA.m(localcc);
    AppMethodBeat.o(57916);
  }

  public final void cd(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57909);
    int i;
    if ((this.eIV != paramInt1) || (this.eIW != paramInt2))
    {
      i = 1;
      ab.d("MMKernel.CoreAccount", "online status, %d, %d, %d ,%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(this.eIW), Integer.valueOf(this.eIV) });
      if (i != 0)
        break label86;
      AppMethodBeat.o(57909);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label86: this.eIV = paramInt1;
      this.eIW = paramInt2;
      new ak(Looper.getMainLooper()).post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(57882);
          a.this.QV();
          AppMethodBeat.o(57882);
        }
      });
      AppMethodBeat.o(57909);
    }
  }

  final void cl(boolean paramBoolean)
  {
    AppMethodBeat.i(57900);
    int i;
    int j;
    final int k;
    int m;
    if (!paramBoolean)
    {
      bool1 = WXHardCoderJNI.hcBootEnable;
      i = WXHardCoderJNI.hcBootDelay;
      j = WXHardCoderJNI.hcBootCPU;
      k = WXHardCoderJNI.hcBootIO;
      if (WXHardCoderJNI.hcBootThr)
      {
        m = g.RS().doL();
        this.eIS = WXHardCoderJNI.startPerformance(bool1, i, j, k, m, WXHardCoderJNI.hcBootTimeout, 101, WXHardCoderJNI.hcBootAction, "MMKernel.CoreAccount");
        ab.i("MMKernel.CoreAccount", "summerhardcoder startPerformance[%s] stack[%s]", new Object[] { Integer.valueOf(this.eIS), bo.dpG() });
      }
    }
    else
    {
      ab.i("MMKernel.CoreAccount", "UserStatusChange: clear");
    }
    while (true)
    {
      synchronized (this.eIX)
      {
        this.eIX.clear();
        long l1 = System.currentTimeMillis();
        k = b.a(eIM);
        ab.i("MMKernel.CoreAccount", "dkacc setAccuin %s hash:%d thread:%d[%s] stack:%s", new Object[] { com.tencent.mm.a.p.getString(k), Integer.valueOf(i.bL(k, 100)), Long.valueOf(Thread.currentThread().getId()), Thread.currentThread().getName(), bo.dpG() });
        if (k != 0)
        {
          m = 1;
          if (m != 0)
            break;
          ab.w("MMKernel.CoreAccount", "setAccUin, Reset by MMCore.resetAccUin");
          ab.i("MMKernel.CoreAccount", "start time check setUinImpl end total time %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
          ab.i("MMKernel.CoreAccount", "mAccountStatus to AccountHasReady");
          AppMethodBeat.o(57900);
          return;
          m = 0;
        }
      }
      m = 0;
    }
    com.tencent.mm.a.p.getString(k);
    com.tencent.mm.sdk.a.b.dnL();
    g.RQ();
    ??? = g.RP();
    Object localObject3 = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(57880);
        a.a(a.this);
        String str = com.tencent.mm.a.g.x(("mm" + k).getBytes());
        FileSystemManager localFileSystemManager = FileSystemManager.dMv();
        localFileSystemManager.dMx().ir("account", str).ri(false);
        localFileSystemManager.dMy();
        Object localObject1 = FileSystemManager.sContext;
        long l = localFileSystemManager.zZh;
        boolean bool;
        if ((420000L >= 0L) && (l < 0L))
        {
          Object localObject2 = new IntentFilter();
          ((IntentFilter)localObject2).addAction("android.intent.action.SCREEN_ON");
          ((IntentFilter)localObject2).addAction("android.intent.action.SCREEN_OFF");
          ((IntentFilter)localObject2).addAction("android.intent.action.ACTION_POWER_CONNECTED");
          ((IntentFilter)localObject2).addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
          ((Context)localObject1).registerReceiver(localFileSystemManager.zZf, (IntentFilter)localObject2);
          localObject2 = localFileSystemManager.zZf;
          ((FileSystemManager.MaintenanceBroadcastReceiver)localObject2).jZT = ((PowerManager)((Context)localObject1).getSystemService("power")).isScreenOn();
          localObject1 = ((Context)localObject1).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
          if (localObject1 != null)
          {
            int i = ((Intent)localObject1).getIntExtra("status", -1);
            if ((i != 2) && (i != 5))
              break label257;
            bool = true;
            ((FileSystemManager.MaintenanceBroadcastReceiver)localObject2).jZS = bool;
          }
        }
        while (true)
        {
          localFileSystemManager.zZh = 420000L;
          localFileSystemManager.zZi = 259200000L;
          localFileSystemManager.zZj = true;
          ab.i("VFS.Debug", "SetEnv ${account} = " + str + " and broadcast.");
          AppMethodBeat.o(57880);
          return;
          label257: bool = false;
          break;
          if ((420000L < 0L) && (l >= 0L))
            ((Context)localObject1).unregisterReceiver(localFileSystemManager.zZf);
        }
      }
    };
    ah.getContext().getSharedPreferences(ah.doA(), 0).edit().putBoolean("isLogin", true).apply();
    String str1 = com.tencent.mm.a.g.x("mm".concat(String.valueOf(k)).getBytes());
    ((e)???).eJM = (((e)???).eJL + str1 + "/");
    ((e)???).cachePath = (ac.eSj + str1 + "/");
    Object localObject4 = new File(((e)???).cachePath);
    ab.i("MMKernel.CoreStorage", "dkacc cachePath:" + ((e)???).cachePath + " accPath:" + ((e)???).eJM);
    long l2;
    if (!((File)localObject4).exists())
    {
      ab.w("MMKernel.CoreStorage", "setUin REBUILD data now ! DO NOT FUCKING TELL ME DB BROKEN !!! uin:%s data:%s sd:%s", new Object[] { com.tencent.mm.a.p.getString(k), ((e)???).cachePath, ((e)???).eJM });
      ((File)localObject4).mkdirs();
      if (!((e)???).cachePath.equalsIgnoreCase(((e)???).eJM))
      {
        l2 = System.currentTimeMillis();
        localObject4 = new File(((e)???).eJM);
        str1 = str1 + "temp" + System.currentTimeMillis();
        str1 = com.tencent.mm.compatible.util.e.eSn + str1;
        ((File)localObject4).renameTo(new File(str1));
        ab.i("MMKernel.CoreStorage", "find the old files and rename then %s" + (System.currentTimeMillis() - l2), new Object[] { str1 });
      }
    }
    for (boolean bool1 = true; ; bool1 = false)
    {
      ((e)???).eJU = new cf(((e)???).cachePath, bool1);
      ((e)???).Rq();
      String str2 = ((e)???).cachePath + "MicroMsg.db";
      str1 = ((e)???).cachePath + "EnMicroMsg.db";
      localObject4 = ((e)???).cachePath + "EnMicroMsg2.db";
      ((e)???).jC(null);
      ((e)???).lJ(str1);
      ((e)???).eJN = new com.tencent.mm.cd.h(new e.2((e)???));
      Object localObject5 = ((e)???).eJN;
      l2 = k;
      q.LK();
      if (!((com.tencent.mm.cd.h)localObject5).b(str2, str1, (String)localObject4, l2, e.Jx(), true))
      {
        ??? = new SQLiteException("main db init failed");
        AppMethodBeat.o(57900);
        throw ((Throwable)???);
      }
      localObject5 = ((e)???).eJN.ybS;
      if (!bo.isNullOrNil((String)localObject5))
      {
        ab.e("MMKernel.CoreStorage", "dbinit failed :".concat(String.valueOf(localObject5)));
        com.tencent.mm.sdk.a.b.A("init db Failed: [ " + (String)localObject5 + "]", "DBinit");
      }
      localObject5 = ((e)???).eJN;
      if (((com.tencent.mm.cd.h)localObject5).ybP != null);
      for (boolean bool2 = ((com.tencent.mm.cd.h)localObject5).ybP.ybo; ; bool2 = false)
      {
        if (bool2)
          ((e)???).eJT = true;
        ((e)???).eJP = new z(((e)???).eJN);
        ((e)???).eJR = new by(((e)???).eJN);
        ((e)???).eJN.ybR = new e.3((e)???);
        ((e)???).eJS = ((e)???).eJR.duv();
        ((e)???).eJO = new com.tencent.mm.cd.h(((e)???).eJK);
        localObject5 = ((e)???).eJO;
        l2 = k;
        q.LK();
        if (((com.tencent.mm.cd.h)localObject5).b(str2, str1, (String)localObject4, l2, new HashMap(), true))
          break;
        ??? = new com.tencent.mm.model.b((byte)0);
        AppMethodBeat.o(57900);
        throw ((Throwable)???);
      }
      ((e)???).eJQ = new bs(((e)???).eJP);
      ((e)???).eJQ.c(new e.4((e)???));
      ((e)???).eJQ.duo();
      ((Runnable)localObject3).run();
      if (bool1)
      {
        l2 = ((Long)((e)???).eJP.get(ac.a.xPw, Long.valueOf(0L))).longValue();
        m = ((Integer)((e)???).eJP.get(ac.a.xPx, Integer.valueOf(0))).intValue();
        if (l2 > 0L)
        {
          ab.w("MMKernel.CoreStorage", "summerinstall new install but firsttime[%d] > 0", new Object[] { Long.valueOf(l2) });
          label1239: if (m <= 0)
            break label1492;
          ab.w("MMKernel.CoreStorage", "summerinstall new install but version[%d] > 0", new Object[] { Integer.valueOf(m) });
          label1265: ab.i("MMKernel.CoreStorage", "edw setAccUin, summerinstall time[%d]，version[%d], clientversion[%d]", new Object[] { (Long)((e)???).eJP.get(ac.a.xPw, Long.valueOf(0L)), (Integer)((e)???).eJP.get(ac.a.xPx, Integer.valueOf(0)), Integer.valueOf(d.vxo) });
        }
      }
      else
      {
        if (paramBoolean)
          break label1518;
        g.RQ();
        ??? = bo.nullAsNil((String)g.RP().Ry().get(2, null));
        ab.i("MMKernel.CoreAccount", "summerinit validateUsername username[%s]", new Object[] { ??? });
        if (((String)???).length() > 0)
          break label1512;
        ab.e("MMKernel.CoreAccount", "username of acc stg not set: uin=" + b.a(eIM));
        QN();
        b.a(eIM, 0);
        eIN = bo.dpG().toString();
        al.d(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(57883);
            g.RQ().releaseAll();
            AppMethodBeat.o(57883);
          }
        });
      }
      label1492: label1512: for (m = 0; ; m = 1)
      {
        if (m != 0)
          break label1518;
        com.tencent.mm.plugin.report.e.pXa.a(598L, 21L, 1L, true);
        ab.w("MMKernel.CoreAccount", "setAccUin, validateUsername false no need initialize!");
        break;
        ((e)???).eJP.set(ac.a.xPw, Long.valueOf(System.currentTimeMillis()));
        break label1239;
        ((e)???).eJP.set(ac.a.xPx, Integer.valueOf(d.vxo));
        break label1265;
      }
      label1518: ??? = new cd();
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)???);
      g.RQ();
      localObject3 = g.RP();
      ??? = new e.c();
      j = bo.h((Integer)((e)localObject3).eJP.get(14, null));
      i = d.vxo;
      ab.d("MMKernel.CoreStorage", "sVer: %s, cVer: %s.", new Object[] { Integer.toHexString(j), Integer.toHexString(i) });
      if (i == j)
        paramBoolean = false;
      while (true)
      {
        label1613: if (paramBoolean)
        {
          ((e)localObject3).eJP.set(8197, "");
          ((e)localObject3).eJP.set(15, Integer.valueOf(0));
        }
        if (j != i)
        {
          bool1 = true;
          label1652: if ((j > 620822536) || (j == i))
            break label2413;
          ((e)localObject3).eJP.set(274480, Boolean.TRUE);
          ab.i("MMKernel.CoreStorage", "[initialize] need init emoji");
          label1689: if ((j != 0) && (j < 637599744))
            ((e)localObject3).eJP.set(348162, Boolean.TRUE);
          if (j == i)
            break label2439;
          m = 1;
          label1725: if (m == 0)
            break label2445;
          ab.w("MMKernel.CoreStorage", "account storage version changed from " + Integer.toHexString(j) + " to " + Integer.toHexString(i) + ", init=" + paramBoolean);
          if (((Integer)((e)localObject3).eJH.get(37, Integer.valueOf(0))).intValue() == 0)
            ((e)localObject3).eJH.set(37, Integer.valueOf(j));
          ((e)localObject3).eJP.set(30, Boolean.FALSE);
          ((e)localObject3).eJP.set(-2046825377, Boolean.FALSE);
          ((e)localObject3).eJP.set(-2046825369, Boolean.FALSE);
          ((e)localObject3).eJP.set(54, Boolean.FALSE);
          ((e)localObject3).eJP.set(-2046825368, Boolean.FALSE);
          ((e)localObject3).eJP.set(-2046825366, Boolean.TRUE);
          ((e)localObject3).eJP.set(62, Boolean.TRUE);
          ah.getContext().getSharedPreferences("update_config_prefs", com.tencent.mm.compatible.util.h.Mu()).edit().clear().commit();
          if (((j & 0xFFFFFF00) == (i & 0xFFFFFF00)) || (j == 0))
          {
            ab.d("MMKernel.CoreStorage", "lock show_whatsnew from if.");
            aj.amA("show_whatsnew");
          }
          label1976: paramBoolean = ((e)localObject3).eJP.getBoolean(ac.a.xWN, false);
          ((e)localObject3).eJP.set(ac.a.xWN, Boolean.FALSE);
          ab.i("MMKernel.CoreStorage", "unlock show_whatsnew from testWhatsNew, %s.", new Object[] { Boolean.valueOf(paramBoolean) });
          if (paramBoolean)
            aj.amB("show_whatsnew");
          ((e.c)???).eKe = bool1;
          ((e.c)???).eKf = j;
          this.eIR = ((e.c)???);
          ab.i("MMKernel.CoreAccount", "check is update :%b ", new Object[] { Boolean.valueOf(((e.c)???).eKe) });
          this.eIU = true;
          if (!this.eIT)
          {
            QP();
            g.RN().QZ();
          }
          av.fly.ak("last_login_uin", com.tencent.mm.a.p.getString(k));
          com.tencent.mm.plugin.report.e.pXa.hB(k);
          if (getClass().getClassLoader() != null)
            break label2464;
          m = -1;
          label2132: if (Thread.currentThread().getContextClassLoader() != null)
            break label2479;
        }
        label2439: label2445: label2464: label2479: for (i = -1; ; i = Thread.currentThread().getContextClassLoader().hashCode())
        {
          ab.i("MMKernel.CoreAccount", "SmcLogic.setUin, class loader %s, %s", new Object[] { Integer.valueOf(m), Integer.valueOf(i) });
          this.eIQ = new com.tencent.mm.model.a();
          ab.i("MMKernel.CoreAccount", "setAccUin done :%s", new Object[] { com.tencent.mm.a.p.getString(k) });
          ??? = new gi();
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)???);
          g.RQ();
          if (g.RO().eJo == null)
            break;
          g.RQ();
          if (g.RO().eJo.ftA == null)
            break;
          g.RQ();
          g.RO().eJo.ftA.cG(true);
          g.RQ();
          ??? = g.RO().eJo.ftA.adg();
          if ((k == 0) || (??? == null) || (k == ((com.tencent.mm.network.c)???).QF()))
            break;
          ab.w("MMKernel.CoreAccount", "summerauth update acc info with acc stg: old acc uin=%d, this uin=%d", new Object[] { Integer.valueOf(((com.tencent.mm.network.c)???).QF()), Integer.valueOf(k) });
          com.tencent.mm.plugin.report.e.pXa.a(148L, 46L, 1L, false);
          ((com.tencent.mm.network.c)???).hB(k);
          break;
          if ((i > 570425344) && (j <= 570425344))
          {
            paramBoolean = true;
            break label1613;
          }
          if ((i <= 570556456) || (j > 570556456))
            break label2492;
          paramBoolean = true;
          break label1613;
          bool1 = false;
          break label1652;
          label2413: ((e)localObject3).eJP.set(274480, Boolean.FALSE);
          ab.i("MMKernel.CoreStorage", "[initialize] need not init emoji");
          break label1689;
          m = 0;
          break label1725;
          ab.d("MMKernel.CoreStorage", "lock show_whatsnew from else.");
          aj.amA("show_whatsnew");
          break label1976;
          m = getClass().getClassLoader().hashCode();
          break label2132;
        }
        label2492: paramBoolean = false;
      }
    }
  }

  public final void initialize()
  {
    AppMethodBeat.i(57914);
    if (QY())
      AppMethodBeat.o(57914);
    while (true)
    {
      return;
      synchronized (this.eIL)
      {
        if (QY())
        {
          AppMethodBeat.o(57914);
          continue;
        }
        int i = b.a(eIM);
        if (i != 0)
        {
          this.eIZ = SystemClock.elapsedRealtime();
          ab.w("MMKernel.CoreAccount", "auto set up account storage uin: %d, stack: %s", new Object[] { Integer.valueOf(i), bo.dpG() });
          cl(false);
        }
        AppMethodBeat.o(57914);
      }
    }
  }

  public final void release()
  {
    AppMethodBeat.i(57913);
    synchronized (this.eIL)
    {
      QO();
      AppMethodBeat.o(57913);
      return;
    }
  }

  static enum a
  {
    static
    {
      AppMethodBeat.i(57886);
      eJg = new a("NotReady", 0);
      eJh = new a("AccountHasReady", 1);
      eJi = new a[] { eJg, eJh };
      AppMethodBeat.o(57886);
    }
  }

  static final class b
  {
    private static boolean eJl = true;
    private boolean eJj = false;
    private com.tencent.mm.storage.y eJk;
    private int uin = 0;

    private int QF()
    {
      try
      {
        AppMethodBeat.i(57887);
        if (!this.eJj)
        {
          Rd();
          this.eJj = true;
        }
        int i = this.uin;
        AppMethodBeat.o(57887);
        return i;
      }
      finally
      {
      }
    }

    private void Rd()
    {
      int i = 0;
      try
      {
        AppMethodBeat.i(57889);
        Assert.assertNotNull(this.eJk);
        com.tencent.mm.storage.y localy = this.eJk;
        if (localy == null)
          ab.w("MMKernel.CoreAccount", "summer read detault uin exception sysCfg is null!");
        while (true)
        {
          this.uin = i;
          AppMethodBeat.o(57889);
          return;
          Integer localInteger1 = (Integer)localy.get(1);
          Object localObject1 = localInteger1;
          if (localInteger1 == null)
          {
            if (localy.xIr)
              com.tencent.mm.plugin.report.e.pXa.a(148L, 40L, 1L, false);
            Integer localInteger2 = Integer.valueOf(ah.getContext().getSharedPreferences("system_config_prefs", com.tencent.mm.compatible.util.h.Mu()).getInt("default_uin", 0));
            localObject1 = localInteger1;
            if (localInteger2 != null)
            {
              ab.i("MMKernel.CoreAccount", "summer read detault uin[%d], bakUin[%d] sysCfg.isOpenException[%b]", new Object[] { localInteger1, localInteger2, Boolean.valueOf(localy.xIr) });
              if (eJl)
              {
                ab.w("MMKernel.CoreAccount", "summer read detault uin exception backup uin[%d], stack[%s]", new Object[] { localInteger2, bo.dpG() });
                com.tencent.mm.plugin.report.e.pXa.e(11911, new Object[] { Integer.valueOf(bo.h(localInteger2)) });
                eJl = false;
              }
              a(localy, localInteger2.intValue());
              localObject1 = localInteger2;
            }
          }
          ab.i("MMKernel.CoreAccount", "summer getDefaultUin uin[%d]", new Object[] { Integer.valueOf(bo.h((Integer)localObject1)) });
          i = bo.h((Integer)localObject1);
        }
      }
      finally
      {
      }
    }

    private static void a(com.tencent.mm.storage.y paramy, int paramInt)
    {
      AppMethodBeat.i(57890);
      ab.i("MMKernel.CoreAccount", "setSysUin uin: %d, stack: %s", new Object[] { Integer.valueOf(paramInt), bo.dpG() });
      ah.getContext().getSharedPreferences("system_config_prefs", com.tencent.mm.compatible.util.h.Mu()).edit().putInt("default_uin", paramInt).commit();
      paramy.set(1, Integer.valueOf(paramInt));
      AppMethodBeat.o(57890);
    }

    private void hB(int paramInt)
    {
      try
      {
        AppMethodBeat.i(57888);
        ab.i("MMKernel.CoreAccount", "Uin From %s To %s hash:%d thread:%d[%s] stack:%s", new Object[] { com.tencent.mm.a.p.getString(this.uin), com.tencent.mm.a.p.getString(paramInt), Integer.valueOf(i.bL(paramInt, 100)), Long.valueOf(Thread.currentThread().getId()), Thread.currentThread().getName(), bo.dpG() });
        Assert.assertNotNull(this.eJk);
        a(this.eJk, paramInt);
        this.uin = paramInt;
        AppMethodBeat.o(57888);
        return;
      }
      finally
      {
        localObject = finally;
        throw localObject;
      }
    }

    public final void a(com.tencent.mm.storage.y paramy)
    {
      try
      {
        this.eJk = paramy;
        return;
      }
      finally
      {
        paramy = finally;
      }
      throw paramy;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kernel.a
 * JD-Core Version:    0.6.2
 */