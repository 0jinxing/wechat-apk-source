package com.tencent.mm.plugin.appbrand;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager.TaskDescription;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.a.a;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.t;
import com.tencent.mm.plugin.appbrand.b.c.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.config.a.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService.a;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.mm.plugin.appbrand.j.a.c;
import com.tencent.mm.plugin.appbrand.l.l;
import com.tencent.mm.plugin.appbrand.s.w;
import com.tencent.mm.plugin.appbrand.widget.b.e;
import com.tencent.mm.sdk.d.d.c;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class i
  implements com.tencent.mm.vending.e.b
{
  volatile boolean Pf;
  public volatile boolean eMP;
  i gNA;
  public volatile AppBrandInitConfig gNB;
  volatile q gNC;
  volatile com.tencent.mm.plugin.appbrand.page.q gND;
  public com.tencent.mm.plugin.appbrand.widget.c gNE;
  com.tencent.mm.plugin.appbrand.ui.q gNF;
  public e gNG;
  private volatile com.tencent.mm.plugin.appbrand.appstorage.p gNH;
  public final ConcurrentLinkedDeque<com.tencent.mm.plugin.appbrand.jsapi.j> gNI;
  private final LinkedHashSet<com.tencent.mm.plugin.appbrand.jsapi.k> gNJ;
  volatile com.tencent.mm.kernel.c.d gNK;
  private com.tencent.mm.plugin.appbrand.s.d gNL;
  public com.tencent.mm.plugin.appbrand.page.m gNM;
  public volatile com.tencent.mm.plugin.appbrand.b.c gNN;
  public com.tencent.mm.plugin.appbrand.j.a gNO;
  boolean gNP;
  boolean gNQ;
  public boolean gNR;
  public boolean gNS;
  public boolean gNT;
  private Set<a.a> gNU;
  boolean gNV;
  private final Set<com.tencent.mm.vending.e.a> gNW;
  LinkedList<i.b> gNX;
  private AppBrandMainProcessService.a gNY;
  Runnable gNZ;
  Activity gNy;
  public ab gNz;
  private final Deque<Runnable> gOa;
  public volatile String mAppId;
  public volatile boolean mFinished;
  Handler mHandler;

  public i(Activity paramActivity, ab paramab)
  {
    AppMethodBeat.i(86668);
    this.gNH = null;
    this.gNI = new ConcurrentLinkedDeque();
    this.gNJ = new LinkedHashSet();
    this.gNK = new com.tencent.mm.kernel.c.d();
    this.gNS = false;
    this.gNT = true;
    this.gNU = Collections.newSetFromMap(new ConcurrentHashMap());
    this.gNV = false;
    this.gNW = new CopyOnWriteArraySet();
    this.gNX = new LinkedList();
    this.gNY = new i.4(this);
    this.gNZ = new i.5(this);
    this.gOa = new LinkedBlockingDeque();
    this.gNy = paramActivity;
    this.gNz = paramab;
    this.mHandler = new Handler();
    this.gNE = new com.tencent.mm.plugin.appbrand.widget.c(paramActivity);
    this.gNE.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.gNL = new com.tencent.mm.plugin.appbrand.s.d();
    this.gNM = new com.tencent.mm.plugin.appbrand.page.m();
    AppMethodBeat.o(86668);
  }

  public final void A(Runnable paramRunnable)
  {
    AppMethodBeat.i(86705);
    if ((this.Pf) || (this.mFinished))
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.AppBrandRuntime", "runOnRuntimeReady runtime[%s] finishing, stack %s", new Object[] { this.mAppId, Log.getStackTraceString(new Throwable()) });
      AppMethodBeat.o(86705);
    }
    while (true)
    {
      return;
      if (this.eMP)
      {
        this.gNy.runOnUiThread(paramRunnable);
        AppMethodBeat.o(86705);
      }
      else
      {
        this.gOa.offerLast(paramRunnable);
        AppMethodBeat.o(86705);
      }
    }
  }

  public final void B(Runnable paramRunnable)
  {
    AppMethodBeat.i(86706);
    if (paramRunnable == null)
      AppMethodBeat.o(86706);
    while (true)
    {
      return;
      if (this.mFinished)
      {
        AppMethodBeat.o(86706);
      }
      else
      {
        paramRunnable = com.tencent.mm.plugin.appbrand.s.p.O(paramRunnable);
        keep(paramRunnable);
        this.gNy.runOnUiThread(paramRunnable);
        AppMethodBeat.o(86706);
      }
    }
  }

  public final <T extends com.tencent.mm.kernel.c.a> T K(Class<T> paramClass)
  {
    AppMethodBeat.i(86687);
    paramClass = this.gNK.U(paramClass);
    AppMethodBeat.o(86687);
    return paramClass;
  }

  public final void a(MiniProgramNavigationBackResult paramMiniProgramNavigationBackResult)
  {
    AppMethodBeat.i(86699);
    if (this.gNy == null)
      AppMethodBeat.o(86699);
    while (true)
    {
      return;
      this.gNy.runOnUiThread(new i.3(this, paramMiniProgramNavigationBackResult));
      AppMethodBeat.o(86699);
    }
  }

  protected void a(AppBrandInitConfig paramAppBrandInitConfig)
  {
    int i = 1;
    AppMethodBeat.i(86673);
    if (!this.eMP)
    {
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.AppBrandRuntime", "updateConfig %s, not initialized", new Object[] { paramAppBrandInitConfig });
      AppMethodBeat.o(86673);
      return;
    }
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.AppBrandRuntime", "updateConfig %s", new Object[] { paramAppBrandInitConfig });
    if (paramAppBrandInitConfig != null)
      if (this.gNR)
        this.gNR = false;
    while (true)
    {
      if (i != 0)
        atn();
      this.gNB = paramAppBrandInitConfig;
      AppMethodBeat.o(86673);
      break;
      if (paramAppBrandInitConfig.gVs == this.gNB.gVs)
        i = 0;
    }
  }

  public final void a(AppBrandInitConfig paramAppBrandInitConfig, MiniProgramNavigationBackResult paramMiniProgramNavigationBackResult)
  {
    Object localObject = null;
    AppMethodBeat.i(86696);
    AppBrandLaunchReferrer localAppBrandLaunchReferrer = new AppBrandLaunchReferrer();
    localAppBrandLaunchReferrer.appId = paramAppBrandInitConfig.appId;
    localAppBrandLaunchReferrer.hgQ = 3;
    String str;
    if (paramMiniProgramNavigationBackResult == null)
    {
      str = null;
      localAppBrandLaunchReferrer.cFM = str;
      if (paramMiniProgramNavigationBackResult != null)
        break label94;
    }
    label94: for (paramMiniProgramNavigationBackResult = localObject; ; paramMiniProgramNavigationBackResult = paramMiniProgramNavigationBackResult.gQu.toString())
    {
      localAppBrandLaunchReferrer.hgR = paramMiniProgramNavigationBackResult;
      this.gNB.hgF.a(localAppBrandLaunchReferrer);
      b(paramAppBrandInitConfig);
      AppMethodBeat.o(86696);
      return;
      str = paramMiniProgramNavigationBackResult.gQt.toString();
      break;
    }
  }

  public final void a(com.tencent.mm.plugin.appbrand.config.a parama)
  {
    AppMethodBeat.i(86677);
    this.gNI.add(parama);
    AppMethodBeat.o(86677);
  }

  protected final void a(i.b paramb)
  {
    AppMethodBeat.i(86672);
    this.gNX.add(paramb);
    AppMethodBeat.o(86672);
  }

  public final <T extends com.tencent.mm.kernel.c.a, N extends T> void a(Class<T> paramClass, N paramN)
  {
    AppMethodBeat.i(86688);
    this.gNK.a(paramClass, paramN);
    AppMethodBeat.o(86688);
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.jsapi.k paramk)
  {
    AppMethodBeat.i(86686);
    synchronized (this.gNJ)
    {
      this.gNJ.add(paramk);
      AppMethodBeat.o(86686);
      return true;
    }
  }

  public final <T extends com.tencent.mm.plugin.appbrand.jsapi.j> T aa(Class<T> paramClass)
  {
    AppMethodBeat.i(86684);
    if (!this.gNV);
    for (boolean bool = true; ; bool = false)
    {
      paramClass = c(paramClass, bool);
      AppMethodBeat.o(86684);
      return paramClass;
    }
  }

  public final <T extends com.tencent.mm.plugin.appbrand.jsapi.k> T ab(Class<T> paramClass)
  {
    AppMethodBeat.i(86685);
    synchronized (this.gNJ)
    {
      Iterator localIterator = this.gNJ.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.appbrand.jsapi.k localk = (com.tencent.mm.plugin.appbrand.jsapi.k)localIterator.next();
        if (paramClass.isInstance(localk))
        {
          AppMethodBeat.o(86685);
          paramClass = localk;
          return paramClass;
        }
      }
      paramClass = null;
      AppMethodBeat.o(86685);
    }
  }

  public com.tencent.mm.plugin.appbrand.appstorage.p asE()
  {
    return this.gNH;
  }

  public final void asS()
  {
    AppMethodBeat.i(86671);
    if (this.gNF != null)
      atb();
    Object localObject1 = ata();
    if (localObject1 != null)
    {
      localObject2 = ((com.tencent.mm.plugin.appbrand.ui.q)localObject1).getView();
      this.gNE.addView((View)localObject2, -1, -1);
      this.gNF = ((com.tencent.mm.plugin.appbrand.ui.q)localObject1);
      ((View)localObject2).setClickable(true);
      this.gNE.setOnHierarchyChangeListener(new i.9(this, (View)localObject2));
    }
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandRuntime", "appOnCreate: %s, %s", new Object[] { this.gNB.cwz, this.gNB.appId });
    AppBrandMainProcessService.a(this.gNY);
    n.wX(this.mAppId);
    a(com.tencent.mm.plugin.appbrand.jsapi.base.f.class, new z());
    a(com.tencent.mm.plugin.appbrand.networking.b.class, new com.tencent.mm.plugin.appbrand.networking.d(this));
    a(com.tencent.mm.plugin.appbrand.widget.g.class, com.tencent.mm.plugin.appbrand.widget.g.iUd);
    a(com.tencent.mm.plugin.appbrand.d.b.class, new com.tencent.mm.plugin.appbrand.luggage.b.m(this));
    a(com.tencent.mm.plugin.appbrand.d.a.class, new com.tencent.mm.plugin.appbrand.luggage.b.k(this));
    onCreate();
    this.gNN.gWy.nt(3);
    g.wU(this.mAppId);
    g.wN(this.mAppId);
    g.a(this.mAppId, g.b.gNg);
    atq();
    Object localObject2 = new i.c(this, (byte)0);
    if (this.gNF == null);
    for (localObject1 = this.gNE; ; localObject1 = this.gNF.getView())
    {
      ((View)localObject1).getViewTreeObserver().addOnPreDrawListener(new i.7(this, (View)localObject1, (i.c)localObject2));
      this.mHandler.postDelayed(this.gNZ, 10000L);
      AppMethodBeat.o(86671);
      return;
    }
  }

  public final int asT()
  {
    return this.gNB.gVs;
  }

  public final i asU()
  {
    AppMethodBeat.i(86674);
    i locali = this.gNz.d(this);
    AppMethodBeat.o(86674);
    return locali;
  }

  public com.tencent.mm.plugin.appbrand.page.q asV()
  {
    return this.gND;
  }

  public final com.tencent.mm.plugin.appbrand.b.c asW()
  {
    return this.gNN;
  }

  protected com.tencent.mm.plugin.appbrand.j.a asX()
  {
    AppMethodBeat.i(86678);
    a.c localc = new a.c();
    AppMethodBeat.o(86678);
    return localc;
  }

  public final void asY()
  {
    AppMethodBeat.i(86679);
    if (this.gNH == null)
      this.gNH = asZ();
    AppMethodBeat.o(86679);
  }

  protected com.tencent.mm.plugin.appbrand.appstorage.p asZ()
  {
    AppMethodBeat.i(86680);
    t localt = new t(this);
    AppMethodBeat.o(86680);
    return localt;
  }

  protected com.tencent.mm.plugin.appbrand.ui.q ata()
  {
    return null;
  }

  public final void atb()
  {
    AppMethodBeat.i(86681);
    if (this.mFinished)
    {
      this.gNF = null;
      AppMethodBeat.o(86681);
    }
    while (true)
    {
      return;
      if (this.gNF == null)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppBrandRuntime", "hideSplash, splash view null");
        AppMethodBeat.o(86681);
      }
      else
      {
        this.gNF.aHS();
        this.gNF = null;
        AppMethodBeat.o(86681);
      }
    }
  }

  public final String atc()
  {
    AppMethodBeat.i(86682);
    String str;
    if (this.gNB == null)
    {
      str = "";
      AppMethodBeat.o(86682);
    }
    while (true)
    {
      return str;
      if (bo.isNullOrNil(this.gNB.hgC))
      {
        if (getAppConfig() == null)
        {
          str = "";
          AppMethodBeat.o(86682);
        }
        else
        {
          str = getAppConfig().ayw();
          AppMethodBeat.o(86682);
        }
      }
      else
      {
        str = this.gNB.hgC;
        AppMethodBeat.o(86682);
      }
    }
  }

  @Deprecated
  public Looper atd()
  {
    AppMethodBeat.i(86689);
    Looper localLooper = Looper.getMainLooper();
    AppMethodBeat.o(86689);
    return localLooper;
  }

  public final boolean ate()
  {
    return this.eMP;
  }

  protected void atf()
  {
  }

  protected void atg()
  {
  }

  protected q ath()
  {
    AppMethodBeat.i(86690);
    q localq = new q();
    AppMethodBeat.o(86690);
    return localq;
  }

  protected com.tencent.mm.plugin.appbrand.page.q ati()
  {
    AppMethodBeat.i(86691);
    com.tencent.mm.plugin.appbrand.page.q localq = new com.tencent.mm.plugin.appbrand.page.q(getContext(), this);
    AppMethodBeat.o(86691);
    return localq;
  }

  public boolean atj()
  {
    return false;
  }

  final void atk()
  {
    AppMethodBeat.i(86692);
    if (!this.eMP)
      AppMethodBeat.o(86692);
    while (true)
    {
      return;
      if (this.mFinished)
      {
        AppMethodBeat.o(86692);
      }
      else
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandRuntime", "onPause: %s", new Object[] { this.mAppId });
        onPause();
        this.gNN.gWy.nt(1);
        this.gNC.atW();
        this.gND.wW();
        g.wP(this.mAppId);
        g.a(this.mAppId, g.b.gNi);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandUserCaptureScreenMonitor", "onPause");
        try
        {
          bc.a(ah.getContext(), null);
          AppMethodBeat.o(86692);
        }
        catch (SecurityException localSecurityException)
        {
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.AppBrandUserCaptureScreenMonitor", localSecurityException, "[NOT CRASH] pause set null callback", new Object[0]);
          AppMethodBeat.o(86692);
        }
      }
    }
  }

  final void atl()
  {
    AppMethodBeat.i(86693);
    if (!this.eMP)
      AppMethodBeat.o(86693);
    while (true)
    {
      return;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandRuntime", "onResume: %s", new Object[] { this.mAppId });
      if ((this.mFinished) || (this.gNP))
      {
        d(null);
        AppMethodBeat.o(86693);
        continue;
      }
      g.wU(this.mAppId);
      g.wQ(this.mAppId);
      g.a(this.mAppId, g.b.gNh);
      onResume();
      this.gND.wU();
      this.gNN.gWy.nt(3);
      boolean bool = this.gNQ;
      this.gNE.post(new i.14(this, bool));
      com.tencent.mm.plugin.appbrand.s.d locald = this.gNL;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandUserCaptureScreenMonitor", "onResume");
      try
      {
        bc.a(ah.getContext(), locald.iRh);
        atq();
        this.gNP = false;
        this.gNQ = false;
        AppMethodBeat.o(86693);
      }
      catch (SecurityException localSecurityException)
      {
        while (true)
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.AppBrandUserCaptureScreenMonitor", localSecurityException, "[NOT CRASH] resume set callback", new Object[0]);
      }
    }
  }

  protected void atm()
  {
  }

  protected final void atn()
  {
    AppMethodBeat.i(86700);
    this.gNP = true;
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.AppBrandRuntime", "setWillRestart");
    AppMethodBeat.o(86700);
  }

  protected final boolean ato()
  {
    boolean bool = false;
    AppMethodBeat.i(86701);
    if (!this.gNT)
      AppMethodBeat.o(86701);
    while (true)
    {
      return bool;
      if ((this.gNy != null) && (this.gNy.isFinishing()))
      {
        AppMethodBeat.o(86701);
      }
      else if ((this.gND != null) && (this.gND.getCurrentPage() != null) && (!this.gND.getCurrentPage().mSwiping))
      {
        bool = true;
        AppMethodBeat.o(86701);
      }
      else
      {
        AppMethodBeat.o(86701);
      }
    }
  }

  public final void atp()
  {
    AppMethodBeat.i(86702);
    this.gNN.gWy.nt(12);
    AppMethodBeat.o(86702);
  }

  @TargetApi(21)
  protected void atq()
  {
    AppMethodBeat.i(86703);
    if (Build.VERSION.SDK_INT < 21)
    {
      AppMethodBeat.o(86703);
      return;
    }
    if (getAppConfig() == null);
    int i;
    for (ActivityManager.TaskDescription localTaskDescription = new ActivityManager.TaskDescription(yf().cwz); ; localTaskDescription = new ActivityManager.TaskDescription(yf().cwz, null, i))
    {
      this.gNy.setTaskDescription(localTaskDescription);
      com.tencent.mm.modelappbrand.a.b.abR().a(new i.6(this, localTaskDescription), yf().iconUrl, com.tencent.mm.modelappbrand.a.f.fqH);
      AppMethodBeat.o(86703);
      break;
      i = w.bx(getAppConfig().heS.hfw, -16777216);
    }
  }

  public final boolean atr()
  {
    boolean bool = true;
    AppMethodBeat.i(86704);
    int i;
    if (this.gNN.gWy.awz() == com.tencent.mm.plugin.appbrand.b.b.gWv)
    {
      i = 1;
      if (i == 0)
        break label47;
      cleanup();
      AppMethodBeat.o(86704);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label47: AppMethodBeat.o(86704);
      bool = false;
    }
  }

  protected void b(AppBrandInitConfig paramAppBrandInitConfig)
  {
  }

  public final <T extends com.tencent.mm.plugin.appbrand.jsapi.j> T c(Class<T> paramClass, boolean paramBoolean)
  {
    AppMethodBeat.i(86683);
    com.tencent.mm.plugin.appbrand.jsapi.j localj1 = null;
    Iterator localIterator = this.gNI.descendingIterator();
    com.tencent.mm.plugin.appbrand.jsapi.j localj2;
    do
    {
      localj2 = localj1;
      if (!localIterator.hasNext())
        break;
      localj2 = (com.tencent.mm.plugin.appbrand.jsapi.j)localIterator.next();
    }
    while (!paramClass.isInstance(localj2));
    if ((localj2 == null) && (paramBoolean));
    while (true)
      try
      {
        localj1 = (com.tencent.mm.plugin.appbrand.jsapi.j)paramClass.newInstance();
        localj2 = localj1;
        AppMethodBeat.o(86683);
        return localj2;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppBrandRuntime", "Make sure %s has default constructor", new Object[] { paramClass.getName() });
      }
  }

  protected final void c(AppBrandInitConfig paramAppBrandInitConfig)
  {
    AppMethodBeat.i(86670);
    if (paramAppBrandInitConfig == null)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandRuntime", "null current config, ignored");
      AppMethodBeat.o(86670);
    }
    while (true)
    {
      return;
      this.gNB = paramAppBrandInitConfig;
      this.mAppId = paramAppBrandInitConfig.appId;
      this.gNN = new com.tencent.mm.plugin.appbrand.b.c(this);
      this.gNN.gWy.start();
      this.gNN.a(new c.a()
      {
        public final void a(String paramAnonymousString, com.tencent.mm.plugin.appbrand.b.b paramAnonymousb)
        {
          AppMethodBeat.i(86651);
          i locali = i.this;
          HashMap localHashMap = new HashMap();
          switch (com.tencent.mm.plugin.appbrand.page.j.1.gWN[paramAnonymousb.ordinal()])
          {
          default:
            AppMethodBeat.o(86651);
            return;
          case 1:
            paramAnonymousString = "background";
          case 2:
          case 3:
          }
          while (true)
          {
            localHashMap.put("status", paramAnonymousString);
            new com.tencent.mm.plugin.appbrand.page.j().s(localHashMap).i(locali.xT()).aCj();
            AppMethodBeat.o(86651);
            break;
            paramAnonymousString = "active";
            continue;
            paramAnonymousString = "suspend";
          }
        }
      });
      this.gNG = new e(this.gNy);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandRuntime", "init %s, config %s", new Object[] { this.mAppId, this.gNB });
      this.eMP = false;
      this.mFinished = false;
      this.Pf = false;
      this.gNP = false;
      this.gNQ = false;
      this.gNR = false;
      AppMethodBeat.o(86670);
    }
  }

  public final void cleanup()
  {
    AppMethodBeat.i(86694);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandRuntime", "dl: cleanup, finished?[%b] initialized?[%b]", new Object[] { Boolean.valueOf(this.mFinished), Boolean.valueOf(this.eMP) });
    if (this.mFinished)
      AppMethodBeat.o(86694);
    while (true)
    {
      return;
      this.mFinished = true;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandRuntime", "onDestroy: %s", new Object[] { this.mAppId });
      onDestroy();
      ??? = this.gNW.iterator();
      while (((Iterator)???).hasNext())
        ((com.tencent.mm.vending.e.a)((Iterator)???).next()).dead();
      this.gNW.clear();
      this.gNH = null;
      AppBrandMainProcessService.b(this.gNY);
      MMToClientEvent.f(this.gNC);
      g.wO(this.mAppId);
      g.a(this.mAppId, g.b.gNk);
      com.tencent.luggage.g.f.az(getContext());
      ??? = this.gNN;
      ??? = ((com.tencent.mm.plugin.appbrand.b.c)???).gWy;
      ((com.tencent.mm.plugin.appbrand.b.d)???).gWG.set(true);
      Object localObject10 = ((com.tencent.mm.sdk.d.d)???).xCt;
      if (localObject10 != null)
        d.c.f((d.c)localObject10);
      ((com.tencent.mm.plugin.appbrand.b.d)???).a(com.tencent.mm.plugin.appbrand.b.b.gWw);
      synchronized (((com.tencent.mm.plugin.appbrand.b.c)???).gWz)
      {
        ((com.tencent.mm.plugin.appbrand.b.c)???).gWz.clear();
        ??? = com.tencent.mm.plugin.appbrand.l.f.aIE();
        ??? = this.mAppId;
        if (((com.tencent.mm.plugin.appbrand.l.f)???).hGk.containsKey(???))
          ((com.tencent.mm.plugin.appbrand.l.f)???).hGk.remove(???);
        ??? = com.tencent.mm.plugin.appbrand.l.c.aIB();
        ??? = this.mAppId;
        if (!((com.tencent.mm.plugin.appbrand.l.c)???).hGk.containsKey(???))
          break label357;
        ??? = (com.tencent.mm.plugin.appbrand.l.b)((com.tencent.mm.plugin.appbrand.l.c)???).hGk.remove(???);
        synchronized (((com.tencent.mm.plugin.appbrand.l.b)???).iov)
        {
          localObject10 = ((com.tencent.mm.plugin.appbrand.l.b)???).iov.iterator();
          if (((Iterator)localObject10).hasNext())
            ((com.tencent.mm.plugin.appbrand.l.a.b)((Iterator)localObject10).next()).isRunning = false;
        }
      }
      localObject6.iov.clear();
      label357: ??? = com.tencent.mm.plugin.appbrand.l.i.aIG();
      Object localObject7 = this.mAppId;
      if (((com.tencent.mm.plugin.appbrand.l.i)???).hGk.containsKey(localObject7))
      {
        localObject10 = (com.tencent.mm.plugin.appbrand.l.g)((com.tencent.mm.plugin.appbrand.l.i)???).hGk.remove(localObject7);
        synchronized (((com.tencent.mm.plugin.appbrand.l.g)localObject10).ioU)
        {
          localObject7 = ((com.tencent.mm.plugin.appbrand.l.g)localObject10).ioU.iterator();
          if (((Iterator)localObject7).hasNext())
            ((com.tencent.mm.plugin.appbrand.l.h)((Iterator)localObject7).next()).isRunning = false;
        }
        ((com.tencent.mm.plugin.appbrand.l.g)localObject10).ioU.clear();
      }
      ??? = l.aII();
      ??? = this.mAppId;
      if (((l)???).hGk.containsKey(???))
      {
        ??? = (com.tencent.mm.plugin.appbrand.jsapi.websocket.d)((l)???).hGk.remove(???);
        if (??? != null)
          ((com.tencent.mm.plugin.appbrand.jsapi.websocket.d)???).release();
      }
      g.wT(this.mAppId);
      if (this.eMP)
      {
        this.gNC.cleanup();
        this.gND.cleanup();
      }
      this.gNE.removeAllViews();
      this.gNE.setOnHierarchyChangeListener(null);
      this.gNI.clear();
      synchronized (this.gNJ)
      {
        this.gNJ.clear();
        this.gNK = new com.tencent.mm.kernel.c.d();
        this.gOa.clear();
        AppMethodBeat.o(86694);
      }
    }
  }

  public void close()
  {
    AppMethodBeat.i(86698);
    com.tencent.luggage.g.f.az(getContext());
    a(null);
    AppMethodBeat.o(86698);
  }

  protected void d(AppBrandInitConfig paramAppBrandInitConfig)
  {
    AppMethodBeat.i(138229);
    cleanup();
    if (paramAppBrandInitConfig != null);
    while (true)
    {
      c(paramAppBrandInitConfig);
      asS();
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandRuntime", "reload: %s", new Object[] { this.mAppId });
      AppMethodBeat.o(138229);
      return;
      paramAppBrandInitConfig = yf();
    }
  }

  public final void finish()
  {
    AppMethodBeat.i(86695);
    this.Pf = true;
    com.tencent.luggage.g.f.az(this.gNy);
    this.gNy.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(86652);
        i locali = i.this;
        locali.gNz.f(locali);
        AppMethodBeat.o(86652);
      }
    });
    AppMethodBeat.o(86695);
  }

  public final boolean finished()
  {
    return this.mFinished;
  }

  public final com.tencent.mm.plugin.appbrand.config.a getAppConfig()
  {
    AppMethodBeat.i(86676);
    com.tencent.mm.plugin.appbrand.config.a locala = (com.tencent.mm.plugin.appbrand.config.a)c(com.tencent.mm.plugin.appbrand.config.a.class, false);
    AppMethodBeat.o(86676);
    return locala;
  }

  public final String getAppId()
  {
    return this.mAppId;
  }

  public Activity getContext()
  {
    return this.gNy;
  }

  public final void keep(com.tencent.mm.vending.e.a parama)
  {
    AppMethodBeat.i(86669);
    if (parama != null)
      this.gNW.add(parama);
    AppMethodBeat.o(86669);
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
  }

  protected void onCreate()
  {
  }

  protected void onDestroy()
  {
  }

  protected void onPause()
  {
  }

  protected void onReady()
  {
  }

  protected void onResume()
  {
  }

  public q xT()
  {
    return this.gNC;
  }

  protected void yb()
  {
  }

  public com.tencent.mm.plugin.appbrand.config.h ye()
  {
    AppMethodBeat.i(86675);
    com.tencent.mm.plugin.appbrand.config.h localh = (com.tencent.mm.plugin.appbrand.config.h)aa(com.tencent.mm.plugin.appbrand.config.h.class);
    AppMethodBeat.o(86675);
    return localh;
  }

  public AppBrandInitConfig yf()
  {
    return this.gNB;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.i
 * JD-Core Version:    0.6.2
 */