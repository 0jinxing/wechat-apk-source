package com.tencent.mm.plugin.appbrand.launching;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.iz;
import com.tencent.mm.g.a.vx;
import com.tencent.mm.g.a.vy;
import com.tencent.mm.g.b.a.cg;
import com.tencent.mm.model.ai;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.s;
import com.tencent.mm.plugin.appbrand.appstorage.c.a;
import com.tencent.mm.plugin.appbrand.appusage.k;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.r.j;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.model.kv_14609;
import com.tencent.mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.mm.protocal.protobuf.axn;
import com.tencent.mm.protocal.protobuf.rg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.vending.j.b;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public final class g
  implements ILaunchWxaAppInfoNotify
{
  private static final android.support.v4.f.a<String, g> igC;
  private static final com.tencent.mm.vending.j.d<AppBrandSysConfigWC, AppBrandLaunchErrorAction, AppStartupPerformanceReportBundle> igQ;
  final String appId;
  final int cDB;
  final int cOq;
  final int har;
  final String hgC;
  final AppBrandLaunchReferrer hgF;
  private final QualitySession hgN;
  volatile g.b igD;
  volatile boolean igE;
  volatile com.tencent.mm.vending.j.d<AppBrandSysConfigWC, AppBrandLaunchErrorAction, AppStartupPerformanceReportBundle> igF;
  volatile long igG;
  final String igH;
  final int igI;
  private volatile WxaAttributes.e igJ;
  private final AppStartupPerformanceReportBundle igK;
  private final List<kv_14609> igL;
  private final com.tencent.mm.sdk.b.c<iz> igM;
  private final List<cg> igN;
  private final com.tencent.mm.sdk.b.c<vx> igO;
  private final com.tencent.mm.sdk.b.c<vy> igP;
  volatile boolean started;
  final String username;

  static
  {
    AppMethodBeat.i(131801);
    igC = new android.support.v4.f.a();
    igQ = com.tencent.mm.vending.j.a.i(null, null, null);
    AppMethodBeat.o(131801);
  }

  public g(AppBrandInitConfigWC paramAppBrandInitConfigWC, AppBrandStatObject paramAppBrandStatObject)
  {
    this(paramAppBrandInitConfigWC.username, paramAppBrandInitConfigWC.appId, paramAppBrandInitConfigWC.gVs, paramAppBrandStatObject.cOq, paramAppBrandStatObject.scene, paramAppBrandInitConfigWC.hgC, paramAppBrandInitConfigWC.hgF, paramAppBrandInitConfigWC.xz(), -1, paramAppBrandInitConfigWC.hgN);
    AppMethodBeat.i(131789);
    if (paramAppBrandInitConfigWC.xy())
      s.xp(paramAppBrandInitConfigWC.appId);
    AppMethodBeat.o(131789);
  }

  public g(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, AppBrandLaunchReferrer paramAppBrandLaunchReferrer, String paramString4, int paramInt4, QualitySession paramQualitySession)
  {
    AppMethodBeat.i(131790);
    this.igG = -1L;
    this.igL = new CopyOnWriteArrayList();
    this.igM = new g.1(this);
    this.igN = new CopyOnWriteArrayList();
    this.igO = new g.2(this);
    this.igP = new g.3(this);
    this.username = paramString1;
    this.appId = paramString2;
    this.har = paramInt1;
    this.cOq = paramInt2;
    this.cDB = paramInt3;
    this.hgC = paramString3;
    this.hgF = paramAppBrandLaunchReferrer;
    this.igH = paramString4;
    this.igI = paramInt4;
    this.hgN = paramQualitySession;
    this.igK = new AppStartupPerformanceReportBundle(paramQualitySession.igT);
    AppMethodBeat.o(131790);
  }

  static g Cg(String paramString)
  {
    AppMethodBeat.i(131787);
    synchronized (igC)
    {
      g localg = (g)igC.remove(paramString);
      if (localg != null)
        ab.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "pollProcess appId(%s) type(%d) sessionId(%s)", new Object[] { localg.appId, Integer.valueOf(localg.har), paramString });
      AppMethodBeat.o(131787);
      return localg;
    }
  }

  static g Ch(String paramString)
  {
    AppMethodBeat.i(131788);
    synchronized (igC)
    {
      paramString = (g)igC.get(paramString);
      AppMethodBeat.o(131788);
      return paramString;
    }
  }

  private void aHh()
  {
    AppMethodBeat.i(131796);
    Object localObject = new StringBuilder("transferData   callback != null ");
    if (this.igD != null);
    Timer localTimer;
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", bool);
      localTimer = new Timer();
      localTimer.schedule(new g.8(this), 5000L);
      if (this.igD != null)
      {
        this.igD.nm(1);
        ab.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "DATA_TRANSFER_STATE_START ");
      }
      localObject = new com.tencent.mm.plugin.appbrand.appstorage.c(this.appId);
      for (int i = 0; i <= 0; i++)
      {
        ai localai = new ai[] { localObject }[0];
        if (localai.kw(com.tencent.mm.protocal.d.vxo))
          localai.transfer(com.tencent.mm.protocal.d.vxo);
      }
    }
    localTimer.cancel();
    if (this.igD != null)
    {
      this.igD.nm(2);
      ab.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "DATA_TRANSFER_STATE_FINISH ");
    }
    AppMethodBeat.o(131796);
  }

  final void a(com.tencent.mm.vending.j.d<AppBrandSysConfigWC, AppBrandLaunchErrorAction, AppStartupPerformanceReportBundle> paramd)
  {
    AppMethodBeat.i(131791);
    this.igF = paramd;
    if (this.igD != null)
    {
      this.igD.a((AppBrandSysConfigWC)paramd.get(0), (AppBrandLaunchErrorAction)paramd.get(1), (AppStartupPerformanceReportBundle)paramd.get(2));
      Cg(this.igH);
    }
    AppMethodBeat.o(131791);
  }

  public final void a(String paramString1, int paramInt, String paramString2, aa paramaa)
  {
    AppMethodBeat.i(131792);
    if (this.igF != null)
    {
      paramString2 = AppBrandLaunchErrorAction.CREATOR;
      paramString2 = AppBrandLaunchErrorAction.a.a(this.appId, this.har, paramaa);
      if (paramString2 != null)
      {
        this.igF = com.tencent.mm.vending.j.a.i(null, paramString2, this.igK);
        AppMethodBeat.o(131792);
      }
    }
    while (true)
    {
      return;
      paramString2 = (AppBrandSysConfigWC)this.igF.get(0);
      if (paramString2 == null)
      {
        ab.e("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "notifyLaunchInfoUpdate null config with appId(%s)", new Object[] { paramString1 });
        AppMethodBeat.o(131792);
      }
      else
      {
        paramaa.a(paramString2);
        this.igF = com.tencent.mm.vending.j.a.i(paramString2, null, this.igK);
        AppMethodBeat.o(131792);
      }
    }
  }

  public final void aHd()
  {
    AppMethodBeat.i(131793);
    if (this.started)
      AppMethodBeat.o(131793);
    while (true)
    {
      return;
      this.started = true;
      ab.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[applaunch] startPrepare in mm %s %d", new Object[] { this.appId, Integer.valueOf(this.har) });
      synchronized (igC)
      {
        igC.put(this.igH, this);
        ??? = new g.a(this.igH);
        long l = TimeUnit.SECONDS.toMillis(300L);
        ((ap)???).ae(l, l);
        ??? = com.tencent.mm.sdk.g.d.anM(String.format(Locale.US, "AppLaunchPrepareProcess[%s %d]", new Object[] { this.appId, Integer.valueOf(this.har) }));
        ((HandlerThread)???).start();
        new ak(((HandlerThread)???).getLooper()).post(new g.4(this, (HandlerThread)???));
        AppMethodBeat.o(131793);
      }
    }
  }

  public final com.tencent.mm.vending.j.d<AppBrandSysConfigWC, AppBrandLaunchErrorAction, AppStartupPerformanceReportBundle> aHf()
  {
    AppMethodBeat.i(131794);
    AppBrandSysConfigWC localAppBrandSysConfigWC = p.zj(this.appId);
    if (localAppBrandSysConfigWC == null)
      ag.Ck(com.tencent.mm.plugin.appbrand.s.e.getMMString(2131296770, new Object[] { "" }));
    Object localObject1;
    if (localAppBrandSysConfigWC == null)
    {
      ab.e("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "get null config!!!");
      localObject1 = igQ;
      AppMethodBeat.o(131794);
    }
    while (true)
    {
      return localObject1;
      ((k)com.tencent.mm.plugin.appbrand.app.f.E(k.class)).x(p.zo(this.appId), bo.anT());
      localObject1 = new j();
      Object localObject2 = com.tencent.mm.plugin.appbrand.app.f.auO().e(this.appId, new String[] { "versionInfo", "appInfo" });
      this.igM.dnU();
      label142: Object localObject3;
      int i;
      if (this.har == 0)
      {
        this.igO.dnU();
        this.igJ = ((WxaAttributes)localObject2).ayL();
        localObject3 = new g.5(this, localAppBrandSysConfigWC.appId, this.har, this.hgC, this.cDB, (WxaAttributes)localObject2);
        localObject2 = new FutureTask((Callable)localObject3);
        com.tencent.mm.sdk.g.d.xDG.a((Runnable)localObject2, ((af)localObject3).getTag(), new af.1((af)localObject3, (FutureTask)localObject2));
        localObject3 = (aa)new g.6(this, this.appId, this.har, this.cOq, this.cDB, this.hgC, this.hgF, this.igH, this.igI, this.hgN).aHy();
        if (localObject3 != null)
          break label361;
        ab.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "fillConfig username %s, appId %s, get null launchInfo", new Object[] { this.username, this.appId });
        i = 0;
      }
      while (true)
        if (i == 0)
        {
          ab.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "fillConfig, false, username %s, appId %s", new Object[] { this.username, this.appId });
          localObject1 = com.tencent.mm.vending.j.a.i(null, ((j)localObject1).value, this.igK);
          AppMethodBeat.o(131794);
          break;
          this.igP.dnU();
          break label142;
          label361: Object localObject4 = AppBrandLaunchErrorAction.CREATOR;
          localObject4 = AppBrandLaunchErrorAction.a.a(this.appId, this.har, (aa)localObject3);
          if (localObject4 != null)
          {
            ((j)localObject1).value = localObject4;
            ab.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "fillConfig username %s, appId %s, launch ban code %d", new Object[] { this.username, this.appId, Integer.valueOf(((aa)localObject3).field_launchAction.vAS) });
            i = 0;
          }
          else
          {
            this.igK.igW = ((aa)localObject3).ihY;
            if ((((aa)localObject3).field_jsapiInfo == null) || (((aa)localObject3).field_jsapiInfo.vYw == null))
            {
              ab.e("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "fillConfig username %s, appId %s, get null jsapi_info", new Object[] { this.username, this.appId });
              i = 0;
            }
            else
            {
              ((aa)localObject3).a(localAppBrandSysConfigWC);
              boolean bool;
              if (((aa)localObject3).field_launchAction.wBv)
              {
                com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.widget.recentview.d.class);
                if (!com.tencent.mm.kernel.g.RP().Ry().getBoolean(ac.a.xOt, false))
                {
                  bool = true;
                  label544: localAppBrandSysConfigWC.bQr = bool;
                  com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xOt, Boolean.TRUE);
                }
              }
              while (true)
              {
                localObject2 = (WxaPkgWrappingInfo)((Future)localObject2).get();
                this.igE = true;
                aHg();
                this.igM.dead();
                this.igO.dead();
                this.igP.dead();
                this.igK.igU.addAll(this.igN);
                this.igK.igV.addAll(this.igL);
                if (localObject2 != null)
                  break label689;
                ab.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "fillConfig null app pkg, username %s appId %s", new Object[] { this.username, this.appId });
                i = 0;
                break;
                bool = false;
                break label544;
                localAppBrandSysConfigWC.bQr = false;
              }
              label689: localAppBrandSysConfigWC.hhd.a((WxaPkgWrappingInfo)localObject2);
              if (localAppBrandSysConfigWC.hhd.gVt != 0)
                localAppBrandSysConfigWC.hhd.gVu = 0;
              ab.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "fillConfig username %s, appId %s, app pkg %s", new Object[] { this.username, localAppBrandSysConfigWC.appId, localAppBrandSysConfigWC.hhd });
              localAppBrandSysConfigWC.bQO = AppBrandGlobalSystemConfig.ayC();
              localAppBrandSysConfigWC.bQP = com.tencent.mm.plugin.appbrand.app.f.xH().get("key_sendtodesktop_no_more_show_permission_notify_dialog", "0").equals("1");
              localObject2 = com.tencent.mm.plugin.appbrand.i.f.inF;
              localObject2 = com.tencent.mm.plugin.appbrand.i.f.cF(this.appId, "copypath");
              if (localObject2 == null);
              for (long l = 0L; ; l = ((Long)localObject2).longValue())
              {
                localAppBrandSysConfigWC.bQN = l;
                ab.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "copyPathMenuShowExpireTime = " + localAppBrandSysConfigWC.bQN);
                com.tencent.mm.sdk.g.d.post(new g.7(this), "AppLaunchPrepareProcess#ExtraWorks");
                ab.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "fillConfig ok username %s, appId %s", new Object[] { this.username, this.appId });
                aHh();
                localObject2 = com.tencent.mm.plugin.appbrand.appstorage.c.gXe;
                localAppBrandSysConfigWC.hhe = c.a.xV(this.appId);
                localAppBrandSysConfigWC.hhf = com.tencent.mm.plugin.appbrand.appstorage.d.gXk.awJ();
                i = 1;
                break;
              }
            }
          }
        }
      ab.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "prepare ok, just go weapp, username %s, appId %s", new Object[] { this.username, this.appId });
      localObject1 = com.tencent.mm.vending.j.a.i(localAppBrandSysConfigWC, null, this.igK);
      AppMethodBeat.o(131794);
    }
  }

  final void aHg()
  {
    AppMethodBeat.i(131795);
    if (this.igD != null)
      this.igD.onDownloadProgress(100);
    AppMethodBeat.o(131795);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.g
 * JD-Core Version:    0.6.2
 */