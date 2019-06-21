package com.tencent.mm.plugin.appbrand.page;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.luggage.g.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.a.f;
import com.tencent.mm.plugin.appbrand.config.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

@SuppressLint({"ViewConstructor"})
public final class g extends n
{
  private String hZt;
  private ViewGroup hkC;
  private com.tencent.mm.plugin.appbrand.widget.i.a iri;
  private FrameLayout irj;
  private u irk;
  private Map<String, u> irl;
  private Map<Integer, AppBrandPageFullScreenView> irm;
  private boolean irn;
  private final Runnable iro;
  private LinkedList<g.b> irp;

  public g(Context paramContext, q paramq)
  {
    super(paramContext, paramq);
    AppMethodBeat.i(87042);
    this.irl = new HashMap();
    this.irm = new HashMap();
    this.irn = false;
    this.iro = new g.1(this);
    this.irp = new LinkedList();
    this.irk = getContainer().getPageViewPrivate();
    AppMethodBeat.o(87042);
  }

  private u CX(String paramString)
  {
    try
    {
      AppMethodBeat.i(87049);
      u localu;
      if (this.irk != null)
      {
        localu = this.irk;
        this.irk = null;
      }
      while (true)
      {
        localu.k(this);
        this.irl.put(paramString, localu);
        this.irj.addView(localu.getContentView(), 0);
        AppMethodBeat.o(87049);
        return localu;
        localu = getContainer().getPageViewPrivate();
      }
    }
    finally
    {
    }
    throw paramString;
  }

  private void CY(String paramString)
  {
    AppMethodBeat.i(87050);
    this.irn = false;
    u localu1 = (u)this.irl.get(h.bO(paramString));
    localu1.getContentView().setVisibility(4);
    paramString = null;
    Iterator localIterator = this.irl.values().iterator();
    if (localIterator.hasNext())
    {
      u localu2 = (u)localIterator.next();
      if (localu2.getContentView().getVisibility() != 0)
        break label131;
      paramString = localu2;
    }
    label131: 
    while (true)
    {
      break;
      localu1.getContentView().setVisibility(0);
      if (paramString != null)
        paramString.getContentView().setVisibility(4);
      if (paramString != null)
        paramString.wW();
      localu1.wU();
      aJg();
      AppMethodBeat.o(87050);
      return;
    }
  }

  private void aJe()
  {
    AppMethodBeat.i(87046);
    post(this.iro);
    AppMethodBeat.o(87046);
  }

  private com.tencent.mm.plugin.appbrand.widget.i.a aJf()
  {
    AppMethodBeat.i(87047);
    com.tencent.mm.plugin.appbrand.widget.i.a locala = (com.tencent.mm.plugin.appbrand.widget.i.a)getContainer().getDecorWidgetFactory().b(getContext(), com.tencent.mm.plugin.appbrand.widget.i.a.class);
    locala.setId(2131820566);
    a.f localf = getContainer().getAppConfig().heV;
    locala.setPosition(localf.hfm);
    locala.g(localf.color, localf.hfn, localf.hfo, localf.hfp);
    Iterator localIterator = localf.cHb.iterator();
    while (localIterator.hasNext())
    {
      a.g localg = (a.g)localIterator.next();
      locala.h(localg.url, localg.text, localg.cIY, localg.hfr);
    }
    locala.setClickListener(new g.3(this, localf));
    AppMethodBeat.o(87047);
    return locala;
  }

  private void aJg()
  {
    AppMethodBeat.i(87051);
    if (this.irm.size() <= 0)
      AppMethodBeat.o(87051);
    while (true)
    {
      return;
      Object localObject = this.irm.values().iterator();
      while (((Iterator)localObject).hasNext())
        ((ViewGroup)((Iterator)localObject).next()).setVisibility(4);
      localObject = (AppBrandPageFullScreenView)this.irm.get(Integer.valueOf(getCurrentPageView().hashCode()));
      if (localObject != null)
        ((AppBrandPageFullScreenView)localObject).setVisibility(0);
      AppMethodBeat.o(87051);
    }
  }

  private void aJh()
  {
    AppMethodBeat.i(87052);
    Iterator localIterator = this.irp.iterator();
    while (localIterator.hasNext())
    {
      g.b localb = (g.b)localIterator.next();
      removeCallbacks(localb);
      localb.xH = true;
    }
    this.irp.clear();
    AppMethodBeat.o(87052);
  }

  public final boolean Ay(String paramString)
  {
    AppMethodBeat.i(87053);
    boolean bool;
    if (this.iri.EV(paramString) != -1)
    {
      bool = true;
      AppMethodBeat.o(87053);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87053);
    }
  }

  protected final void a(u paramu, AppBrandPageFullScreenView paramAppBrandPageFullScreenView)
  {
    AppMethodBeat.i(138230);
    if (paramu == null)
    {
      ab.e("MicroMsg.AppBrandMultiplePage", "getCurrentFullScreenView err, pageView is null");
      AppMethodBeat.o(138230);
    }
    while (true)
    {
      return;
      if ((paramAppBrandPageFullScreenView != null) && (paramAppBrandPageFullScreenView.getParent() == null) && ((this.hkC instanceof ViewGroup)))
      {
        this.hkC.addView(paramAppBrandPageFullScreenView, new ViewGroup.LayoutParams(-1, -1));
        this.irm.put(Integer.valueOf(paramu.hashCode()), paramAppBrandPageFullScreenView);
      }
      AppMethodBeat.o(138230);
    }
  }

  protected final View aAQ()
  {
    AppMethodBeat.i(87043);
    Object localObject;
    RelativeLayout.LayoutParams localLayoutParams;
    if (this.hkC == null)
    {
      localObject = new RelativeLayout(getContext());
      this.irj = new FrameLayout(getContext());
      this.iri = aJf();
      if (getContainer().getAppConfig().heV.hfq)
        this.iri.setVisibility(8);
      if (!"top".equals(getContainer().getAppConfig().heV.hfm))
        break label163;
      localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
      localLayoutParams.addRule(10);
      ((RelativeLayout)localObject).addView(this.irj, localLayoutParams);
      localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
      localLayoutParams.addRule(10);
      ((RelativeLayout)localObject).addView(this.iri, localLayoutParams);
    }
    while (true)
    {
      this.hkC = ((ViewGroup)localObject);
      localObject = this.hkC;
      AppMethodBeat.o(87043);
      return localObject;
      label163: localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
      localLayoutParams.addRule(12);
      ((RelativeLayout)localObject).addView(this.iri, localLayoutParams);
      localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
      localLayoutParams.addRule(2, this.iri.getId());
      ((RelativeLayout)localObject).addView(this.irj, localLayoutParams);
    }
  }

  protected final void aAR()
  {
    AppMethodBeat.i(87056);
    super.aAR();
    if (this.irk != null)
      this.irk.onDestroy();
    Iterator localIterator = this.irl.values().iterator();
    while (localIterator.hasNext())
      ((u)localIterator.next()).onDestroy();
    AppMethodBeat.o(87056);
  }

  public final void aAS()
  {
    AppMethodBeat.i(87054);
    super.aAS();
    getCurrentPageView().wU();
    AppMethodBeat.o(87054);
  }

  public final void aAT()
  {
    AppMethodBeat.i(87055);
    super.aAT();
    getCurrentPageView().wW();
    AppMethodBeat.o(87055);
  }

  public final void b(String paramString1, String paramString2, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(87057);
    if ((this.irk != null) && (f(paramArrayOfInt, this.irk.hashCode())))
      this.irk.h(paramString1, paramString2, 0);
    Iterator localIterator = this.irl.values().iterator();
    while (localIterator.hasNext())
    {
      u localu = (u)localIterator.next();
      if (f(paramArrayOfInt, localu.hashCode()))
        localu.h(paramString1, paramString2, 0);
    }
    AppMethodBeat.o(87057);
  }

  public final void cleanup()
  {
    AppMethodBeat.i(87058);
    super.cleanup();
    if (this.irk != null)
      this.irk.cleanup();
    Iterator localIterator = this.irl.values().iterator();
    while (localIterator.hasNext())
      ((u)localIterator.next()).cleanup();
    aJh();
    AppMethodBeat.o(87058);
  }

  public final u getCurrentPageView()
  {
    try
    {
      AppMethodBeat.i(87059);
      u localu;
      if (this.irk != null)
      {
        localu = this.irk;
        AppMethodBeat.o(87059);
      }
      while (true)
      {
        return localu;
        localu = (u)this.irl.get(h.bO(this.hZt));
        AppMethodBeat.o(87059);
      }
    }
    finally
    {
    }
  }

  public final String getCurrentUrl()
  {
    return this.hZt;
  }

  public final com.tencent.mm.plugin.appbrand.widget.i.a getTabBar()
  {
    return this.iri;
  }

  public final void loadUrl(String paramString)
  {
    AppMethodBeat.i(87048);
    if (paramString.equals(this.hZt))
      AppMethodBeat.o(87048);
    while (true)
    {
      return;
      int i = this.iri.EV(paramString);
      if (i < 0)
      {
        AppMethodBeat.o(87048);
      }
      else
      {
        this.hZt = paramString;
        this.iri.re(i);
        if (this.irl.get(h.bO(paramString)) == null)
        {
          u localu = CX(h.bO(paramString));
          g.4 local4 = new g.4(this, paramString);
          localu.a(new g.5(this, localu, local4, System.currentTimeMillis()));
          if (this.irl.size() > 1)
          {
            this.irp.add(local4);
            postDelayed(local4, 500L);
          }
          this.irn = true;
          localu.AA(paramString);
          AppMethodBeat.o(87048);
        }
        else
        {
          aJh();
          CY(paramString);
          AppMethodBeat.o(87048);
        }
      }
    }
  }

  public final void onDescendantInvalidated(View paramView1, View paramView2)
  {
    AppMethodBeat.i(87045);
    super.onDescendantInvalidated(paramView1, paramView2);
    if ((paramView2 instanceof com.tencent.mm.plugin.appbrand.widget.actionbar.d))
      aJe();
    AppMethodBeat.o(87045);
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(87044);
    super.onMeasure(paramInt1, paramInt2);
    aJe();
    AppMethodBeat.o(87044);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.g
 * JD-Core Version:    0.6.2
 */