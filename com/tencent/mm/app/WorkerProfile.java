package com.tencent.mm.app;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.i;
import com.tencent.mm.ai.p;
import com.tencent.mm.ai.v;
import com.tencent.mm.ai.v.a;
import com.tencent.mm.console.Shell;
import com.tencent.mm.console.Shell.Receiver;
import com.tencent.mm.g.a.ck;
import com.tencent.mm.g.a.hm;
import com.tencent.mm.g.a.jl;
import com.tencent.mm.g.a.kz;
import com.tencent.mm.kiss.a.b.2;
import com.tencent.mm.model.ae;
import com.tencent.mm.model.am;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.d.a.1;
import com.tencent.mm.model.d.a.2;
import com.tencent.mm.model.f.a;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.plugin.report.service.IKVReportNotify;
import com.tencent.mm.pluginsdk.j;
import com.tencent.mm.pluginsdk.q;
import com.tencent.mm.pluginsdk.ui.i.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.be.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ai;
import com.tencent.mm.ui.tools.AccountDeletedAlphaAlertUI;
import com.tencent.mm.ui.tools.NewTaskUI;
import java.io.File;
import java.util.Locale;
import java.util.Map;

public final class WorkerProfile extends com.tencent.mm.compatible.loader.e
  implements com.tencent.mm.ai.f, v.a, am, f.a, IKVReportNotify
{
  public static final String ceo;
  private static WorkerProfile cfI;
  private static int cfX;
  private final int ID;
  private final Shell cfG;
  private final com.tencent.mm.console.a cfH;
  private an cfJ;
  private be.b cfK;
  private ae cfL;
  public boolean cfM;

  @Deprecated
  public boolean cfN;
  public boolean cfO;
  private final int cfP;
  private final int cfQ;
  private int cfR;
  private StringBuilder cfS;
  private com.tencent.mm.booter.notification.a.g cfT;
  private com.tencent.mm.h.b cfU;
  public final y cfV;
  public final x cfW;
  private boolean cfY;
  protected Locale locale;

  static
  {
    AppMethodBeat.i(15558);
    ceo = ah.getPackageName();
    cfX = -1;
    AppMethodBeat.o(15558);
  }

  public WorkerProfile()
  {
    AppMethodBeat.i(15547);
    this.cfG = new Shell();
    this.cfH = new com.tencent.mm.console.a();
    this.cfM = false;
    this.cfP = 0;
    this.cfQ = 1;
    this.ID = 2130706432;
    this.cfS = new StringBuilder();
    this.cfV = new y();
    this.cfW = new x();
    this.cfY = false;
    cfI = this;
    AppMethodBeat.o(15547);
  }

  public static WorkerProfile Ca()
  {
    return cfI;
  }

  public final be.b Cb()
  {
    AppMethodBeat.i(15552);
    if (this.cfK == null)
      this.cfK = new WorkerProfile.28(this);
    be.b localb = this.cfK;
    AppMethodBeat.o(15552);
    return localb;
  }

  public final ae Cc()
  {
    AppMethodBeat.i(15553);
    if (this.cfL == null)
      this.cfL = com.tencent.mm.booter.a.Ib();
    ae localae = this.cfL;
    AppMethodBeat.o(15553);
    return localae;
  }

  public final void dm(String paramString)
  {
    AppMethodBeat.i(15556);
    ab.i("MicroMsg.WorkerProfile", "summerdiz onOldDisaster errStr[%s]", new Object[] { paramString });
    com.tencent.mm.g.a.ak localak = new com.tencent.mm.g.a.ak();
    localak.cto.type = 4;
    localak.cto.ctq = paramString;
    com.tencent.mm.sdk.b.a.xxA.m(localak);
    AppMethodBeat.o(15556);
  }

  public final void dn(String paramString)
  {
    AppMethodBeat.i(15557);
    ab.i("MicroMsg.WorkerProfile", "summerdiz onReMoveNoticeId:%s", new Object[] { paramString });
    com.tencent.mm.g.a.ak localak = new com.tencent.mm.g.a.ak();
    localak.cto.type = 1;
    localak.cto.ctq = paramString;
    com.tencent.mm.sdk.b.a.xxA.m(localak);
    AppMethodBeat.o(15557);
  }

  public final an getNotification()
  {
    AppMethodBeat.i(15551);
    if (this.cfJ == null)
      this.cfJ = new com.tencent.mm.booter.notification.b(this.app);
    an localan = this.cfJ;
    AppMethodBeat.o(15551);
    return localan;
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(15550);
    SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences(ah.doA(), 0);
    ah.getContext();
    if ("language_default".equals(aa.h(localSharedPreferences)))
    {
      ab.i("MicroMsg.WorkerProfile", "config locale %s", new Object[] { aa.c(paramConfiguration.locale) });
      paramConfiguration = MMActivity.bM(this.app.getBaseContext(), aa.c(paramConfiguration.locale));
      ab.i("MicroMsg.WorkerProfile", "onConfigurationChanged, locale = %s, n = %s", new Object[] { this.locale, paramConfiguration });
      if ((paramConfiguration != null) && (this.locale != null) && (!paramConfiguration.equals(this.locale)) && (!aw.RK()));
    }
    try
    {
      paramConfiguration = aw.Rg().ftA;
      if (paramConfiguration != null)
      {
        paramConfiguration = paramConfiguration.adg();
        if (paramConfiguration != null)
        {
          aw.ZK();
          int i = com.tencent.mm.model.c.QF();
          paramConfiguration.a(new byte[0], new byte[0], new byte[0], i);
        }
      }
      ab.w("MicroMsg.WorkerProfile", "language changed, restart process");
      System.exit(-1);
      AppMethodBeat.o(15550);
      return;
    }
    catch (Exception paramConfiguration)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WorkerProfile", paramConfiguration, "", new Object[0]);
        ab.printErrStackTrace("MicroMsg.WorkerProfile", paramConfiguration, "what the f$!k", new Object[0]);
      }
    }
  }

  public final void onCreate()
  {
    AppMethodBeat.i(15548);
    long l1 = System.currentTimeMillis();
    ab.v("MicroMsg.WorkerProfile", "workerProfile onCreate, step 1");
    ab.i("MicroMsg.WorkerProfile", "start time check onCreate proc:%s pid:%d" + ceo + Process.myPid());
    ab.i("MicroMsg.WorkerProfile", "appOnCreate start getAccStg %b, thread name %s", new Object[] { Boolean.TRUE, Thread.currentThread().getName() });
    long l2 = System.currentTimeMillis();
    Object localObject1 = com.tencent.mm.model.d.a.abl();
    com.tencent.mm.model.d.a.ceK = ceo;
    if (ah.xzd)
      ab.i("MicroMsg.HandlerTraceManager", "trace setup delete old file ret: ".concat(String.valueOf(com.tencent.mm.a.e.deleteFile(com.tencent.mm.model.d.a.foO))));
    ((com.tencent.mm.model.d.a)localObject1).fpd = System.currentTimeMillis();
    com.tencent.mm.sdk.platformtools.ak.setLogCallback(new a.1((com.tencent.mm.model.d.a)localObject1));
    ao.a("NetsceneQueue forbid in ", new a.2((com.tencent.mm.model.d.a)localObject1));
    aw.Rg().a(-1, this);
    v.a(this);
    aw.ZN().fkz = this;
    aw.a(new WorkerProfile.12(this));
    aw.getSysCmdMsgExtension().a("getkvidkeystg", new WorkerProfile.23(this), true);
    localObject1 = this.app;
    com.tencent.mm.sdk.platformtools.g.gj((Context)localObject1);
    com.tencent.mm.sdk.platformtools.g.gk((Context)localObject1);
    Object localObject3 = ((Context)localObject1).getPackageManager();
    try
    {
      localObject1 = ((PackageManager)localObject3).getPackageInfo(((Context)localObject1).getPackageName(), 0).applicationInfo.sourceDir;
      ab.i("MicroMsg.WorkerProfile", "initChannelUtil sourceFile = %s", new Object[] { localObject1 });
      try
      {
        i = com.tencent.mm.a.e.cs((String)localObject1);
        ab.i("MicroMsg.WorkerProfile", "checkApkExternal, fileSize = %s", new Object[] { Integer.valueOf(i) });
        if (i < 8);
        while (true)
        {
          localObject1 = com.tencent.mm.c.a.cL((String)localObject1);
          if ((localObject1 == null) || (((com.tencent.mm.c.a)localObject1).cdc == null))
            break label2496;
          ab.i("MicroMsg.WorkerProfile", "apk external info not null");
          if (((com.tencent.mm.c.a)localObject1).cdc.cdf != 0)
          {
            com.tencent.mm.sdk.platformtools.g.cdf = ((com.tencent.mm.c.a)localObject1).cdc.cdf;
            ab.i("MicroMsg.WorkerProfile", "read channelId from apk external");
          }
          if (((com.tencent.mm.c.a)localObject1).cdc.cdh != 0)
          {
            com.tencent.mm.sdk.platformtools.g.cdh = ((com.tencent.mm.c.a)localObject1).cdc.cdh;
            ab.i("MicroMsg.WorkerProfile", "ext.updateMode = %s", new Object[] { Integer.valueOf(com.tencent.mm.sdk.platformtools.g.cdh) });
          }
          if (((com.tencent.mm.c.a)localObject1).cdc.cdi != null)
            com.tencent.mm.sdk.platformtools.g.xyb = bo.getInt(((com.tencent.mm.c.a)localObject1).cdc.cdi, 0);
          if (((com.tencent.mm.c.a)localObject1).cdc.cdj != null)
            com.tencent.mm.sdk.platformtools.g.xyc = ((com.tencent.mm.c.a)localObject1).cdc.cdj;
          if (((com.tencent.mm.c.a)localObject1).cdc.cdg != null)
            com.tencent.mm.sdk.platformtools.g.cdg = ((com.tencent.mm.c.a)localObject1).cdc.cdg;
          if (((com.tencent.mm.c.a)localObject1).cdc.cdm)
          {
            com.tencent.mm.sdk.platformtools.g.xyg = ((com.tencent.mm.c.a)localObject1).cdc.cdm;
            ab.i("MicroMsg.WorkerProfile", "ext.isNokiaol = %s", new Object[] { Boolean.valueOf(com.tencent.mm.sdk.platformtools.g.xyg) });
          }
          if (((com.tencent.mm.c.a)localObject1).cdc.cdl != 0)
          {
            com.tencent.mm.sdk.platformtools.g.cdl = ((com.tencent.mm.c.a)localObject1).cdc.cdl;
            ab.i("MicroMsg.WorkerProfile", "ext.autoAddAccount = %s", new Object[] { Integer.valueOf(com.tencent.mm.sdk.platformtools.g.cdl) });
          }
          if (((com.tencent.mm.c.a)localObject1).cdc.cdk)
          {
            com.tencent.mm.sdk.platformtools.g.xyf = ((com.tencent.mm.c.a)localObject1).cdc.cdk;
            ab.i("MicroMsg.WorkerProfile", "ext.shouldShowGprsAlert = %s", new Object[] { Boolean.valueOf(com.tencent.mm.sdk.platformtools.g.xyf) });
          }
          d.Ba();
          localObject1 = com.tencent.mm.booter.d.bo(this.app);
          if ((localObject1 != null) && (((com.tencent.mm.booter.d)localObject1).ebO != -1))
            com.tencent.mm.sdk.platformtools.g.cdf = ((com.tencent.mm.booter.d)localObject1).ebO;
          localObject1 = this.app.getApplicationContext();
          j = com.tencent.mm.sdk.platformtools.g.cdf;
          k = com.tencent.mm.protocal.d.vxo;
          if ((localObject1 != null) && (j >= 0) && (k >= 637534208))
            break label2558;
          if (com.tencent.mm.sdk.platformtools.g.xyb > 0)
            com.tencent.mm.sdk.platformtools.g.xyd = true;
          com.tencent.mm.bp.d.dlL();
          localObject3 = new StringBuilder("android-");
          if (!bo.isNullOrNil(com.tencent.mm.sdk.platformtools.g.cdg))
            break label2660;
          localObject1 = Integer.valueOf(Build.VERSION.SDK_INT);
          com.tencent.mm.protocal.d.eSg = localObject1;
          if (!bo.isNullOrNil(com.tencent.mm.sdk.a.b.dnP()))
            com.tencent.mm.protocal.d.eSg = "android-" + com.tencent.mm.sdk.a.b.dnP();
          ab.v("MicroMsg.WorkerProfile", "set device type :%s  %s", new Object[] { com.tencent.mm.protocal.d.eSg, com.tencent.mm.sdk.a.b.dnP() });
          this.locale = MMActivity.initLanguage(this.app.getBaseContext());
          if (com.tencent.mm.sdk.a.b.dnO())
          {
            localObject3 = this.cfG;
            localObject1 = ah.getContext();
            if (((Shell)localObject3).ewv == null)
            {
              ((Shell)localObject3).ewv = new Shell.Receiver();
              ((Context)localObject1).registerReceiver(((Shell)localObject3).ewv, Shell.ewx);
            }
          }
          localObject1 = this.cfH;
          com.tencent.mm.sdk.b.a.xxA.c((com.tencent.mm.sdk.b.c)localObject1);
          localObject1 = new c();
          ab.d("MicroMsg.AvatarDrawable", "setLoader".concat(String.valueOf(localObject1)));
          com.tencent.mm.pluginsdk.ui.a.b.pqK = (i.a)localObject1;
          com.tencent.mm.pluginsdk.f.e.vdx = new WorkerProfile.26(this);
          com.tencent.mm.kernel.g.a(i.class, new com.tencent.mm.kernel.c.e(this.cfW));
          com.tencent.mm.kernel.g.a(com.tencent.mm.pluginsdk.h.class, new com.tencent.mm.kernel.c.e(this.cfW));
          com.tencent.mm.kernel.g.a(j.class, new com.tencent.mm.kernel.c.e(this.cfW));
          com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.brandservice.a.a.class, new com.tencent.mm.plugin.bbom.d());
          com.tencent.mm.kernel.g.a(q.class, new com.tencent.mm.app.plugin.d());
          com.tencent.mm.kernel.g.a(com.tencent.mm.choosemsgfile.compat.b.class, new com.tencent.mm.ui.chatting.b.a());
          com.tencent.mm.sdk.b.a.xxA.c(new com.tencent.mm.app.plugin.b.a.a());
          if (this.cfJ == null)
            this.cfJ = new com.tencent.mm.booter.notification.b(this.app);
          this.cfU = new com.tencent.mm.h.b();
          localObject1 = this.cfU;
          ab.i("MicroMsg.BroadcastController", "summerdiz init");
          com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.h.b)localObject1).eeX);
          localObject1 = com.tencent.mm.kiss.a.b.SM();
          com.tencent.mm.sdk.b.a.xxA.c(new b.2((com.tencent.mm.kiss.a.b)localObject1));
          com.tencent.mm.sdk.b.a.xxA.c(new com.tencent.mm.plugin.account.bind.ui.e());
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.30(this));
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.31(this));
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.32(this));
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.33(this));
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.34(this));
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.35(this));
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.2(this));
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.3(this));
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.4(this));
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.5(this));
          com.tencent.mm.sdk.b.a.xxA.c(new com.tencent.mm.sdk.b.c()
          {
          });
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.7(this));
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.8(this));
          com.tencent.mm.sdk.b.a.xxA.c(new com.tencent.mm.sdk.b.c()
          {
          });
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.10(this));
          com.tencent.mm.sdk.b.a.xxA.c(new com.tencent.mm.sdk.b.c()
          {
          });
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.13(this));
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.14(this));
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.15(this));
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.16(this));
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.17(this));
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.18(this));
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.19(this));
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.20(this));
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.21(this));
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.22(this));
          com.tencent.mm.sdk.b.a.xxA.c(new m(2, 12));
          com.tencent.mm.sdk.b.a.xxA.c(new WorkerProfile.24(this));
          com.tencent.mm.plugin.messenger.a.g.opT = new com.tencent.mm.ui.transmit.d();
          com.tencent.mm.pluginsdk.r.a.vax = new com.tencent.mm.app.plugin.a();
          com.tencent.mm.pluginsdk.ui.e.b.a.vrC = com.tencent.mm.app.plugin.e.Cl();
          if (!aw.QT())
            aw.ZK();
          localObject1 = new ck();
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
          this.cfM = true;
          Log.setLogImpl(new WorkerProfile.25(this));
          ab.d("MicroMsg.WorkerProfile", "start time check WorkerProfile appOnCreate use time " + (System.currentTimeMillis() - l2));
          localObject1 = new WorkerProfile.27(ah.getContext());
          ((WorkerProfile.27)localObject1).map.put("qqmail", Integer.valueOf(2131300489));
          ((WorkerProfile.27)localObject1).map.put("fmessage", Integer.valueOf(2131300458));
          ((WorkerProfile.27)localObject1).map.put("floatbottle", Integer.valueOf(2131300443));
          ((WorkerProfile.27)localObject1).map.put("lbsapp", Integer.valueOf(2131300466));
          ((WorkerProfile.27)localObject1).map.put("shakeapp", Integer.valueOf(2131300501));
          ((WorkerProfile.27)localObject1).map.put("medianote", Integer.valueOf(2131300475));
          ((WorkerProfile.27)localObject1).map.put("qqfriend", Integer.valueOf(2131300486));
          ((WorkerProfile.27)localObject1).map.put("newsapp", Integer.valueOf(2131300497));
          ((WorkerProfile.27)localObject1).map.put("facebookapp", Integer.valueOf(2131300452));
          ((WorkerProfile.27)localObject1).map.put("masssendapp", Integer.valueOf(2131300472));
          ((WorkerProfile.27)localObject1).map.put("meishiapp", Integer.valueOf(2131300478));
          ((WorkerProfile.27)localObject1).map.put("feedsapp", Integer.valueOf(2131300455));
          ((WorkerProfile.27)localObject1).map.put("voipapp", Integer.valueOf(2131300511));
          ((WorkerProfile.27)localObject1).map.put("weixin", Integer.valueOf(2131301859));
          ((WorkerProfile.27)localObject1).map.put("filehelper", Integer.valueOf(2131300439));
          ((WorkerProfile.27)localObject1).map.put("cardpackage", Integer.valueOf(2131300446));
          ((WorkerProfile.27)localObject1).map.put("officialaccounts", Integer.valueOf(2131300482));
          ((WorkerProfile.27)localObject1).map.put("voicevoipapp", Integer.valueOf(2131300514));
          ((WorkerProfile.27)localObject1).map.put("helper_entry", Integer.valueOf(2131300463));
          ((WorkerProfile.27)localObject1).map.put("voiceinputapp", Integer.valueOf(2131300508));
          ((WorkerProfile.27)localObject1).map.put("linkedinplugin", Integer.valueOf(2131300469));
          ((WorkerProfile.27)localObject1).map.put("notifymessage", Integer.valueOf(2131300479));
          ((WorkerProfile.27)localObject1).map.put("gh_43f2581f6fd6", Integer.valueOf(2131300504));
          ((WorkerProfile.27)localObject1).map.put("appbrandcustomerservicemsg", Integer.valueOf(2131300440));
          ((WorkerProfile.27)localObject1).cgf.put("weixin", Integer.valueOf(2131301858));
          com.tencent.mm.n.a.a((com.tencent.mm.n.a.a)localObject1);
          ai.a(new WorkerProfile.1(this));
          if (!com.tencent.mm.compatible.util.f.Mn())
          {
            localObject1 = com.tencent.mm.plugin.report.service.h.pYm;
            if (!com.tencent.mm.compatible.util.d.iW(19))
              break label2668;
            l2 = 5L;
            ((com.tencent.mm.plugin.report.service.h)localObject1).a(340L, l2, 1L, false);
            localObject1 = com.tencent.mm.plugin.report.service.h.pYm;
            if (!com.tencent.mm.compatible.util.d.iW(19))
              break label2675;
            i = 5001;
            ((com.tencent.mm.plugin.report.service.h)localObject1).e(11098, new Object[] { Integer.valueOf(i), String.format("%s;%s;%s", new Object[] { com.tencent.mm.compatible.util.e.eSl, Environment.getExternalStorageDirectory().getAbsolutePath(), com.tencent.mm.compatible.util.h.getExternalStorageDirectory().getAbsolutePath() }) });
          }
          ab.i("MicroMsg.WorkerProfile", "start time check WorkerProfile oncreate use time :%d, launcherisFirst :%b channel:%d cv:%d. topActivityName:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l1), Boolean.valueOf(this.cfN), Integer.valueOf(com.tencent.mm.sdk.platformtools.g.cdf), Integer.valueOf(com.tencent.mm.protocal.d.vxo), bo.gW(ah.getContext()) });
          AppMethodBeat.o(15548);
          return;
          locala = com.tencent.mm.c.a.a.C(com.tencent.mm.a.e.f((String)localObject1, i - 8, 8));
          if (locala != null)
            break;
          ab.e("MicroMsg.WorkerProfile", "checkApkExternal, header null");
        }
      }
      catch (Exception localException2)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.WorkerProfile", localException2, "", new Object[0]);
          ab.e("MicroMsg.WorkerProfile", "Exception in checkApkExternal, %s", new Object[] { localException2.getMessage() });
        }
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
      {
        com.tencent.mm.c.a.a locala;
        ab.e("MicroMsg.WorkerProfile", "initChannelUtil NameNotFoundException");
        continue;
        if (locala.cde + 8 - 8 >= 0)
        {
          com.tencent.mm.c.b localb = new com/tencent/mm/c/b;
          localb.<init>();
          localb.parseFrom(com.tencent.mm.a.e.f(localNameNotFoundException, i - (locala.cde + 8 - 8) - 8, locala.cde + 8 - 8));
          new com.tencent.mm.c.a(localb);
          ab.i("MicroMsg.WorkerProfile", "checkApkExternal, check ok");
        }
        else
        {
          ab.e("MicroMsg.WorkerProfile", "checkApkExternal header wrong");
          continue;
          if (localNameNotFoundException != null)
            break;
          bool = true;
          ab.e("MicroMsg.WorkerProfile", "initChannelUtil something null %s", new Object[] { Boolean.valueOf(bool) });
        }
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        int j;
        int k;
        label2496: ab.e("MicroMsg.WorkerProfile", "Exception in initChannel, %s", new Object[] { localException1.getMessage() });
        continue;
        boolean bool = false;
        continue;
        try
        {
          label2558: Object localObject2 = localException1.getSharedPreferences("crash_status_file", 4);
          i = ((SharedPreferences)localObject2).getInt("channel", -1);
          int m = ((SharedPreferences)localObject2).getInt("version", 0);
          if ((i == j) && (m == k))
            continue;
          localObject2 = ((SharedPreferences)localObject2).edit();
          ((SharedPreferences.Editor)localObject2).putInt("channel", j);
          ((SharedPreferences.Editor)localObject2).putInt("version", k);
          ((SharedPreferences.Editor)localObject2).commit();
        }
        catch (Throwable localThrowable)
        {
        }
        continue;
        label2660: String str = com.tencent.mm.sdk.platformtools.g.cdg;
        continue;
        label2668: l2 = 6L;
        continue;
        label2675: int i = 5002;
      }
    }
  }

  public final void onReportKVDataReady(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    AppMethodBeat.i(15555);
    aw.RS().aa(new WorkerProfile.29(this, paramInt, paramArrayOfByte2));
    AppMethodBeat.o(15555);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(15554);
    ab.i("MicroMsg.WorkerProfile", "onSceneEnd dkwt type:%d [%d,%d,%s]", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 3) && (paramInt2 == -1))
      ab.i("MicroMsg.WorkerProfile", "getStack([ %s ]), ThreadID: %s", new Object[] { bo.dpG(), Long.valueOf(Thread.currentThread().getId()) });
    if ((paramInt1 == 4) && (paramInt2 == -3002))
      if (bo.isNullOrNil(paramString))
      {
        ab.e("MicroMsg.WorkerProfile", "summerdiz -3002 but errMsg is null");
        AppMethodBeat.o(15554);
      }
    while (true)
    {
      return;
      paramm = paramString;
      if (paramString.startsWith("autoauth_errmsg_"))
        paramm = paramString.substring(16);
      ab.i("MicroMsg.WorkerProfile", "summerdiz MM_ERR_IDCDISASTER -3002 errStr:%s", new Object[] { paramm });
      paramString = new com.tencent.mm.g.a.ak();
      paramString.cto.type = 4;
      paramString.cto.ctq = paramm;
      com.tencent.mm.sdk.b.a.xxA.m(paramString);
      AppMethodBeat.o(15554);
      continue;
      if ((aw.RK()) && (paramInt1 == 4) && ((paramInt2 == -6) || (paramInt2 == -310) || (paramInt2 == -311)) && (paramString != null) && (paramString.startsWith("autoauth_errmsg_")))
      {
        if (NewTaskUI.dJR() != null)
        {
          AppMethodBeat.o(15554);
        }
        else
        {
          paramString = new Intent();
          paramString.setClass(ah.getContext(), NewTaskUI.class).addFlags(268435456);
          ah.getContext().startActivity(paramString);
          AppMethodBeat.o(15554);
        }
      }
      else if ((paramm.getType() == 701) || (paramm.getType() == 702) || (paramm.getType() == 126) || (paramm.getType() == 252) || (paramm.getType() == 763) || (paramm.getType() == 138))
      {
        if ((paramInt1 == 4) && (paramInt2 == -213))
        {
          paramm = new jl();
          paramm.cEK.status = 0;
          paramm.cEK.boZ = 3;
          com.tencent.mm.sdk.b.a.xxA.m(paramm);
          if (AccountDeletedAlphaAlertUI.dJp() != null)
          {
            AppMethodBeat.o(15554);
          }
          else
          {
            paramm = new Intent();
            paramm.setClass(ah.getContext(), AccountDeletedAlphaAlertUI.class).addFlags(268435456);
            paramm.putExtra("errmsg", paramString);
            ah.getContext().startActivity(paramm);
            AppMethodBeat.o(15554);
          }
        }
        else if ((paramInt1 == 4) && (paramInt2 == -100))
        {
          paramString = new jl();
          paramString.cEK.status = 0;
          paramString.cEK.boZ = 1;
          com.tencent.mm.sdk.b.a.xxA.m(paramString);
        }
      }
      else
        AppMethodBeat.o(15554);
    }
  }

  public final void onTerminate()
  {
    AppMethodBeat.i(15549);
    super.onTerminate();
    com.tencent.mm.h.b localb = this.cfU;
    ab.i("MicroMsg.BroadcastController", "summerdiz release oldNoticeInfo[%s], newDisasterNoticeInfoMap[%d]", new Object[] { localb.eeU, Integer.valueOf(localb.eeW.size()) });
    com.tencent.mm.sdk.b.a.xxA.d(localb.eeX);
    localb.eeU = null;
    localb.eeV.clear();
    localb.eeW.clear();
    this.cfU = null;
    AppMethodBeat.o(15549);
  }

  public final String toString()
  {
    return ceo;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.WorkerProfile
 * JD-Core Version:    0.6.2
 */