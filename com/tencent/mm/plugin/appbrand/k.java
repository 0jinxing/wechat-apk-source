package com.tencent.mm.plugin.appbrand;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.widget.FrameLayout;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.page.q;
import com.tencent.mm.plugin.appbrand.widget.b.e;
import com.tencent.mm.plugin.appbrand.widget.c;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import org.a.a;

public class k
  implements ab
{
  public Activity gNy;
  FrameLayout gOA;
  public final LinkedList<i> gOB;
  public final HashMap<String, i> gOC;
  public final com.tencent.mm.plugin.appbrand.task.i gOD;
  private Class<? extends i> gOE;
  boolean gOF;
  boolean gOG;

  public k(com.tencent.mm.plugin.appbrand.task.i parami, Class<? extends i> paramClass)
  {
    AppMethodBeat.i(86718);
    this.gOF = false;
    this.gOG = false;
    this.gNy = parami.getContext();
    this.gOB = new LinkedList();
    this.gOC = new HashMap();
    this.gOA = parami.aLY();
    this.gOD = parami;
    this.gOE = paramClass;
    this.gNy.getApplication().registerActivityLifecycleCallbacks(new k.1(this));
    AppMethodBeat.o(86718);
  }

  public void a(i parami, MiniProgramNavigationBackResult paramMiniProgramNavigationBackResult)
  {
    AppMethodBeat.i(86722);
    if (parami == null)
      AppMethodBeat.o(86722);
    while (true)
    {
      return;
      this.gOD.getContext().runOnUiThread(new k.2(this, parami, paramMiniProgramNavigationBackResult));
      AppMethodBeat.o(86722);
    }
  }

  public void a(i parami1, i parami2, AppBrandInitConfig paramAppBrandInitConfig)
  {
    AppMethodBeat.i(86719);
    parami2.gNA = parami1;
    parami2.c(paramAppBrandInitConfig);
    this.gOB.push(parami2);
    this.gOA.addView(parami2.gNE);
    if (parami1 != null)
      parami1.atk();
    parami2.asS();
    AppMethodBeat.o(86719);
  }

  public final i atv()
  {
    AppMethodBeat.i(86724);
    i locali = (i)this.gOB.peek();
    AppMethodBeat.o(86724);
    return locali;
  }

  public final int atw()
  {
    AppMethodBeat.i(86726);
    int i = this.gOB.size();
    AppMethodBeat.o(86726);
    return i;
  }

  public final void atx()
  {
    AppMethodBeat.i(86735);
    Iterator localIterator = this.gOB.iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      locali.gNE.setVisibility(8);
      this.gOC.put(locali.mAppId, locali);
      locali.atp();
    }
    this.gOB.clear();
    AppMethodBeat.o(86735);
  }

  protected final LinkedList<i> aty()
  {
    AppMethodBeat.i(86737);
    LinkedList localLinkedList = new LinkedList(this.gOB);
    AppMethodBeat.o(86737);
    return localLinkedList;
  }

  public final com.tencent.mm.plugin.appbrand.task.i atz()
  {
    return this.gOD;
  }

  public void b(i parami1, i parami2, AppBrandInitConfig paramAppBrandInitConfig)
  {
    AppMethodBeat.i(86721);
    i(parami2);
    h(parami2);
    parami2.gNA = parami1;
    parami2.a(paramAppBrandInitConfig);
    if (parami1 != null)
    {
      parami1.atk();
      parami2.atl();
    }
    AppMethodBeat.o(86721);
  }

  protected void b(i parami1, i parami2, Runnable paramRunnable)
  {
    AppMethodBeat.i(86723);
    if (parami1 == null);
    for (parami1 = "null"; ; parami1 = parami1.mAppId)
    {
      d.i("MicroMsg.AppBrandRuntimeContainer", "onRuntimeClose entered, in.appId[%s], out.appId[%s]", new Object[] { parami1, parami2.mAppId });
      paramRunnable.run();
      AppMethodBeat.o(86723);
      return;
    }
  }

  public final i d(i parami)
  {
    AppMethodBeat.i(86725);
    if (parami == null)
    {
      parami = new NullPointerException("Null runtime");
      AppMethodBeat.o(86725);
      throw parami;
    }
    ListIterator localListIterator = this.gOB.listIterator();
    int i = 0;
    while (localListIterator.hasNext())
    {
      i locali = (i)localListIterator.next();
      if (locali == parami)
      {
        i = 1;
      }
      else if (i != 0)
      {
        AppMethodBeat.o(86725);
        parami = locali;
      }
    }
    while (true)
    {
      return parami;
      if (i == 0)
      {
        parami = new IllegalAccessError(String.format("Runtime not in stack %s", new Object[] { parami.mAppId }));
        AppMethodBeat.o(86725);
        throw parami;
      }
      parami = null;
      AppMethodBeat.o(86725);
    }
  }

  public i e(AppBrandInitConfig paramAppBrandInitConfig)
  {
    AppMethodBeat.i(86720);
    paramAppBrandInitConfig = (i)a.be(this.gOE).ab(new Object[] { this.gNy, this }).object;
    AppMethodBeat.o(86720);
    return paramAppBrandInitConfig;
  }

  public final boolean e(i parami)
  {
    AppMethodBeat.i(86727);
    boolean bool = this.gOB.contains(parami);
    AppMethodBeat.o(86727);
    return bool;
  }

  public final void f(i parami)
  {
    AppMethodBeat.i(86731);
    if (parami == null)
      AppMethodBeat.o(86731);
    while (true)
    {
      return;
      this.gNy.runOnUiThread(new k.6(this, parami));
      AppMethodBeat.o(86731);
    }
  }

  protected final boolean g(i parami)
  {
    AppMethodBeat.i(86732);
    boolean bool;
    if (this.gOB.peekFirst() == parami)
    {
      bool = true;
      AppMethodBeat.o(86732);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(86732);
    }
  }

  final void h(i parami)
  {
    AppMethodBeat.i(86733);
    this.gOB.remove(parami);
    this.gOB.push(parami);
    parami.gNE.setVisibility(0);
    this.gOA.bringChildToFront(parami.gNE);
    AppMethodBeat.o(86733);
  }

  final void i(i parami)
  {
    AppMethodBeat.i(86734);
    if (this.gOB.contains(parami))
      AppMethodBeat.o(86734);
    while (true)
    {
      return;
      this.gOB.push(parami);
      if (this.gOA.indexOfChild(parami.gNE) == -1)
        this.gOA.addView(parami.gNE);
      this.gOC.remove(parami.mAppId);
      AppMethodBeat.o(86734);
    }
  }

  public final void j(i parami)
  {
    AppMethodBeat.i(86736);
    if (parami == null)
      AppMethodBeat.o(86736);
    while (true)
    {
      return;
      this.gOB.remove(parami);
      AppMethodBeat.o(86736);
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(86729);
    i locali = atv();
    if (locali != null);
    while (true)
    {
      try
      {
        if (locali.gNF == null)
        {
          if ((!locali.gNG.wY()) && (locali.gND != null))
          {
            locali.gND.onBackPressed();
            AppMethodBeat.o(86729);
          }
        }
        else
        {
          g.a(locali.mAppId, g.d.gNn);
          locali.finish();
        }
        AppMethodBeat.o(86729);
        continue;
      }
      catch (Exception localException)
      {
        d.e("MicroMsg.AppBrandRuntimeContainer", "onBackPressed e = %s", new Object[] { localException });
        al.d(new Runnable()
        {
          public final void run()
          {
            throw localException;
          }
        });
      }
      AppMethodBeat.o(86729);
    }
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(86730);
    if (this.gOB != null)
    {
      Iterator localIterator = this.gOB.iterator();
      while (localIterator.hasNext())
        ((i)localIterator.next()).onConfigurationChanged(paramConfiguration);
    }
    AppMethodBeat.o(86730);
  }

  public final void onResume()
  {
    AppMethodBeat.i(86728);
    d.i("MicroMsg.AppBrandRuntimeContainer", "onResume tid = %d", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
    this.gNy.runOnUiThread(new k.4(this));
    AppMethodBeat.o(86728);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.k
 * JD-Core Version:    0.6.2
 */