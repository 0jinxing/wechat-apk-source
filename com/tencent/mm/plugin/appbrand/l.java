package com.tencent.mm.plugin.appbrand;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.tencent.luggage.a.e;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.j;
import com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.f;
import com.tencent.mm.plugin.appbrand.ui.AppBrandEmbedUI;
import com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI;
import com.tencent.mm.plugin.appbrand.ui.t;
import com.tencent.mm.plugin.appbrand.ui.u;
import com.tencent.mm.ui.base.b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public final class l extends com.tencent.luggage.sdk.b.a
{
  boolean gOF;
  boolean gOG;
  private boolean gOQ;

  public l(com.tencent.mm.plugin.appbrand.task.i parami)
  {
    super(parami, o.class);
    AppMethodBeat.i(128961);
    this.gOF = false;
    this.gOG = false;
    this.gOQ = false;
    this.gNy.getApplication().registerActivityLifecycleCallbacks(new l.1(this));
    AppMethodBeat.o(128961);
  }

  private void atA()
  {
    AppMethodBeat.i(128968);
    if ((this.gNy instanceof AppBrandPluginUI))
      b.a(this.gNy, null);
    AppMethodBeat.o(128968);
  }

  private void atB()
  {
    AppMethodBeat.i(128969);
    if ((this.gNy instanceof AppBrandPluginUI))
      b.au(this.gNy);
    AppMethodBeat.o(128969);
  }

  private void du(boolean paramBoolean)
  {
    AppMethodBeat.i(128966);
    int i;
    if ((!this.gOQ) && (!this.gNy.isFinishing()))
    {
      if ((!(this.gNy instanceof t)) || (!((t)this.gNy).aLZ()))
        break label91;
      i = 1;
      if ((i == 0) || (!paramBoolean))
        break label96;
      this.gNy.moveTaskToBack(true);
    }
    while (true)
    {
      if (this.gOB.size() <= 0)
        this.gNy.overridePendingTransition(0, 0);
      AppMethodBeat.o(128966);
      return;
      label91: i = 0;
      break;
      label96: this.gNy.finish();
    }
  }

  public final void a(i parami, MiniProgramNavigationBackResult paramMiniProgramNavigationBackResult)
  {
    AppMethodBeat.i(128965);
    if (paramMiniProgramNavigationBackResult != null);
    while (true)
    {
      try
      {
        if ((this.gNy instanceof AppBrandEmbedUI))
        {
          Intent localIntent = new android/content/Intent;
          localIntent.<init>();
          localIntent.putExtra("result_key_mini_program_navigate_back_result", paramMiniProgramNavigationBackResult);
          this.gNy.setResult(-1, localIntent);
          this.gNy.finish();
          AppMethodBeat.o(128965);
          return;
        }
      }
      catch (Exception localException)
      {
        d.printErrStackTrace("MicroMsg.AppBrandRuntimeContainerWC", localException, "close runtime %s", new Object[] { parami.mAppId });
      }
      super.a(parami, paramMiniProgramNavigationBackResult);
      AppMethodBeat.o(128965);
    }
  }

  protected final void a(i parami1, i parami2, AppBrandInitConfig paramAppBrandInitConfig)
  {
    AppMethodBeat.i(128962);
    if (parami1 != null)
      g.a(parami1.mAppId, g.d.gNt);
    if ((parami1 != null) && (j.a((o)parami1, (o)parami2, (AppBrandInitConfigWC)paramAppBrandInitConfig)))
      AppMethodBeat.o(128962);
    while (true)
    {
      return;
      if (p.f(paramAppBrandInitConfig))
        atB();
      this.gOQ = true;
      if (p.f(paramAppBrandInitConfig))
        a.asC();
      super.a(parami1, parami2, paramAppBrandInitConfig);
      this.gOQ = false;
      if (parami1 != null)
        ((u)e.B(u.class)).a(parami2, parami1);
      AppMethodBeat.o(128962);
    }
  }

  public final boolean atC()
  {
    boolean bool = false;
    AppMethodBeat.i(128970);
    if (this.gOB.size() <= 0)
    {
      du(false);
      bool = true;
      AppMethodBeat.o(128970);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(128970);
    }
  }

  protected final void b(i parami1, i parami2, AppBrandInitConfig paramAppBrandInitConfig)
  {
    AppMethodBeat.i(128964);
    if (parami1 != null)
      g.a(parami1.mAppId, g.d.gNt);
    if (p.f(paramAppBrandInitConfig))
      atB();
    int i = aty().indexOf(parami2);
    if (i > 0)
    {
      Object localObject1 = new LinkedList();
      ListIterator localListIterator = aty().listIterator(i);
      while (localListIterator.hasPrevious())
      {
        localObject2 = (i)localListIterator.previous();
        if ((localObject2 != parami2) && (localObject2 != parami1) && (p.l((i)localObject2)))
          ((LinkedList)localObject1).add(localObject2);
      }
      Object localObject2 = ((LinkedList)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (i)((Iterator)localObject2).next();
        ((i)localObject1).gNT = false;
        super.j((i)localObject1);
        super.f((i)localObject1);
      }
    }
    super.b(parami1, parami2, paramAppBrandInitConfig);
    if (parami1 != null)
      ((u)e.B(u.class)).a(parami2, parami1);
    AppMethodBeat.o(128964);
  }

  protected final void b(final i parami1, final i parami2, final Runnable paramRunnable)
  {
    AppMethodBeat.i(128967);
    String str;
    if (parami1 == null)
    {
      str = "null";
      d.i("MicroMsg.AppBrandRuntimeContainerWC", "onRuntimeClose entered, in.appId[%s], out.appId[%s], out.isFinishing[%b], out.canDoCloseAnimation[%b], mIsActivityPaused[%b], stackSize[%d]", new Object[] { str, parami2.mAppId, Boolean.valueOf(parami2.Pf), Boolean.valueOf(parami2.ato()), Boolean.valueOf(this.gOG), Integer.valueOf(this.gOB.size()) });
      paramRunnable = new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(128960);
          l.a(l.this, parami1, parami2, paramRunnable);
          AppMethodBeat.o(128960);
        }
      };
      if (this.gOG)
        parami2.gNT = false;
      if (parami2.Pf)
        break label195;
      if (this.gOB.size() <= 1)
        break label181;
      if (!parami2.ato())
        break label172;
      ((u)e.B(u.class)).a(parami1, parami2, paramRunnable);
      label148: if (parami1 == null)
        break label283;
      atA();
      AppMethodBeat.o(128967);
    }
    label283: 
    while (true)
    {
      return;
      str = parami1.mAppId;
      break;
      label172: paramRunnable.run();
      break label148;
      label181: du(true);
      AppMethodBeat.o(128967);
      continue;
      label195: if (!e(parami2))
      {
        paramRunnable.run();
        AppMethodBeat.o(128967);
      }
      else
      {
        if (this.gOB.size() > 1)
        {
          if (parami2.ato())
            ((u)e.B(u.class)).a(parami1, parami2, paramRunnable);
          while (true)
          {
            if (parami1 == null)
              break label283;
            atA();
            AppMethodBeat.o(128967);
            break;
            paramRunnable.run();
          }
        }
        du(false);
        AppMethodBeat.o(128967);
      }
    }
  }

  protected final i e(AppBrandInitConfig paramAppBrandInitConfig)
  {
    AppMethodBeat.i(128963);
    o localo = f.a((AppBrandInitConfigWC)paramAppBrandInitConfig, this);
    if (localo != null)
    {
      AppMethodBeat.o(128963);
      paramAppBrandInitConfig = localo;
    }
    while (true)
    {
      return paramAppBrandInitConfig;
      paramAppBrandInitConfig = super.e(paramAppBrandInitConfig);
      AppMethodBeat.o(128963);
    }
  }

  public final Activity getContext()
  {
    return this.gNy;
  }

  public final void onBackPressed()
  {
    AppMethodBeat.i(128971);
    if (atC())
      AppMethodBeat.o(128971);
    while (true)
    {
      return;
      super.onBackPressed();
      AppMethodBeat.o(128971);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l
 * JD-Core Version:    0.6.2
 */