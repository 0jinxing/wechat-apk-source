package com.tencent.luggage.sdk.b;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ab;
import com.tencent.mm.plugin.appbrand.appcache.aw;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.plugin.appbrand.permission.f;
import com.tencent.mm.plugin.appbrand.permission.g;
import com.tencent.mm.plugin.appbrand.permission.h;
import com.tencent.mm.plugin.appbrand.permission.j;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.ui.k;
import com.tencent.mm.plugin.appbrand.ui.k.1;
import com.tencent.mm.plugin.appbrand.widget.c;
import com.tencent.mm.sdk.platformtools.bo;

public class b extends i
{
  public k bRn;
  private Boolean bRo = null;

  public b(Activity paramActivity, ab paramab)
  {
    super(paramActivity, paramab);
  }

  private static boolean a(AppBrandInitConfigLU paramAppBrandInitConfigLU)
  {
    AppMethodBeat.i(101697);
    boolean bool;
    if ((paramAppBrandInitConfigLU.bQf) && (b(paramAppBrandInitConfigLU)))
    {
      bool = true;
      AppMethodBeat.o(101697);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(101697);
    }
  }

  private static boolean b(AppBrandInitConfigLU paramAppBrandInitConfigLU)
  {
    paramAppBrandInitConfigLU = paramAppBrandInitConfigLU.bQn;
    if ((paramAppBrandInitConfigLU.scene == 1011) || (paramAppBrandInitConfigLU.scene == 1012) || (paramAppBrandInitConfigLU.scene == 1013));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void a(AppBrandInitConfig paramAppBrandInitConfig)
  {
    AppMethodBeat.i(101686);
    if (!this.eMP)
    {
      AppMethodBeat.o(101686);
      return;
    }
    boolean bool1 = yd();
    boolean bool2 = a((AppBrandInitConfigLU)paramAppBrandInitConfig);
    if (((!bool1) && (bool2)) || ((bool1) && (!bool2) && (b((AppBrandInitConfigLU)paramAppBrandInitConfig))));
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        this.bRo = null;
        atn();
      }
      super.a(paramAppBrandInitConfig);
      AppMethodBeat.o(101686);
      break;
    }
  }

  public final void b(AppBrandInitConfig paramAppBrandInitConfig)
  {
    AppMethodBeat.i(101690);
    AppBrandInitConfigLU localAppBrandInitConfigLU = ya().xC();
    AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
    localAppBrandStatObject.scene = 1038;
    if ((paramAppBrandInitConfig instanceof AppBrandInitConfigLU))
      localAppBrandStatObject.cst = (paramAppBrandInitConfig.appId + ':' + ((AppBrandInitConfigLU)paramAppBrandInitConfig).xz() + ':' + (((AppBrandInitConfigLU)paramAppBrandInitConfig).bQe + 1000));
    localAppBrandInitConfigLU.startTime = bo.anU();
    localAppBrandInitConfigLU.hgC = null;
    localAppBrandInitConfigLU.resetSession();
    localAppBrandInitConfigLU.bQn = localAppBrandStatObject;
    a(localAppBrandInitConfigLU);
    AppMethodBeat.o(101690);
  }

  public void onCreate()
  {
    AppMethodBeat.i(101692);
    super.onCreate();
    a(g.class, j.iwZ);
    a(f.class, new h(this));
    AppMethodBeat.o(101692);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(101694);
    super.onDestroy();
    if (this.bRn != null)
    {
      if ((this.bRn.getParent() instanceof ViewGroup))
      {
        k localk = this.bRn;
        AppBrandPerformanceManager.Dl(localk.ivC.mAppId);
        localk.animate().alpha(0.0F).setDuration(500L).setListener(new k.1(localk));
        ((ViewGroup)this.bRn.getParent()).removeView(this.bRn);
      }
      this.bRn = null;
    }
    AppMethodBeat.o(101694);
  }

  public void onReady()
  {
    AppMethodBeat.i(101691);
    if ((AppBrandPerformanceManager.b(this)) && (this.bRn == null))
    {
      AppBrandPerformanceManager.a(this);
      this.bRn = yc();
      if (this.bRn != null)
      {
        this.gNE.addView(this.bRn);
        k localk = this.bRn;
        AppBrandPerformanceManager.c(localk.ivC);
        localk.setVisibility(0);
        localk.setAlpha(0.0F);
        localk.animate().alpha(1.0F).setDuration(500L).setStartDelay(500L).setListener(null);
      }
    }
    AppMethodBeat.o(101691);
  }

  public com.tencent.mm.plugin.appbrand.permission.e xY()
  {
    AppMethodBeat.i(101685);
    com.tencent.mm.plugin.appbrand.permission.e locale = new com.tencent.mm.plugin.appbrand.permission.e(this, -1, true);
    AppMethodBeat.o(101685);
    return locale;
  }

  public AppBrandSysConfigLU xZ()
  {
    AppMethodBeat.i(101687);
    AppBrandSysConfigLU localAppBrandSysConfigLU = (AppBrandSysConfigLU)c(AppBrandSysConfigLU.class, false);
    AppMethodBeat.o(101687);
    return localAppBrandSysConfigLU;
  }

  public final AppBrandStatObject xx()
  {
    AppMethodBeat.i(101689);
    AppBrandStatObject localAppBrandStatObject = ya().bQn;
    AppMethodBeat.o(101689);
    return localAppBrandStatObject;
  }

  public AppBrandInitConfigLU ya()
  {
    AppMethodBeat.i(101688);
    AppBrandInitConfigLU localAppBrandInitConfigLU = (AppBrandInitConfigLU)super.yf();
    AppMethodBeat.o(101688);
    return localAppBrandInitConfigLU;
  }

  public final void yb()
  {
    AppMethodBeat.i(101693);
    super.yb();
    aw.a(this, (com.tencent.mm.plugin.appbrand.appcache.o)com.tencent.luggage.a.e.B(com.tencent.mm.plugin.appbrand.appstorage.o.class));
    AppMethodBeat.o(101693);
  }

  protected k yc()
  {
    AppMethodBeat.i(101695);
    k localk = new k(getContext(), this);
    AppMethodBeat.o(101695);
    return localk;
  }

  public boolean yd()
  {
    AppMethodBeat.i(101696);
    boolean bool;
    if (this.bRo != null)
    {
      bool = this.bRo.booleanValue();
      AppMethodBeat.o(101696);
    }
    while (true)
    {
      return bool;
      Boolean localBoolean = Boolean.valueOf(a(ya()));
      this.bRo = localBoolean;
      bool = localBoolean.booleanValue();
      AppMethodBeat.o(101696);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.sdk.b.b
 * JD-Core Version:    0.6.2
 */