package com.tencent.mm.plugin.appbrand.ui.recents;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v4.view.s;
import android.support.v4.view.w;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.f;
import android.support.v7.widget.RecyclerView.f.a;
import android.support.v7.widget.RecyclerView.f.c;
import android.support.v7.widget.RecyclerView.s;
import android.support.v7.widget.RecyclerView.v;
import android.support.v7.widget.av;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class p extends android.support.v7.widget.y
{
  boolean iOM;
  boolean iON;
  private final RecyclerView.f.a iOO;
  final Set<RecyclerView.f.a> iOP;
  private final Interpolator iOQ;
  private final ArrayList<p.b> iOR;
  final ArrayList<RecyclerView.v> iOS;
  private final ArrayList<p.d> iOT;
  final ArrayList<RecyclerView.v> iOU;
  private final ArrayList<AppBrandLauncherRecentsList.e> iOV;
  final ArrayList<AppBrandLauncherRecentsList.e> iOW;
  private final ArrayList<AppBrandLauncherRecentsList.e> iOX;
  final ArrayList<AppBrandLauncherRecentsList.e> iOY;
  private final ArrayList<p.f> iOZ;
  final ArrayList<AppBrandLauncherRecentsList.e> iPa;
  private final ArrayList<RecyclerView.v> iPb;
  private final ArrayList<AppBrandLauncherRecentsList.e> iPc;
  final ArrayList<AppBrandLauncherRecentsList.e> iPd;
  final ArrayList<AppBrandLauncherRecentsList.e> iPe;
  boolean iPf;

  p()
  {
    AppMethodBeat.i(133519);
    this.iOM = false;
    this.iON = true;
    this.iOO = new p.1(this);
    this.iOP = new HashSet();
    this.iOQ = new AccelerateDecelerateInterpolator();
    this.iOR = new ArrayList();
    this.iOS = new ArrayList();
    this.iOT = new ArrayList();
    this.iOU = new ArrayList();
    this.iOV = new ArrayList();
    this.iOW = new ArrayList();
    this.iOX = new ArrayList();
    this.iOY = new ArrayList();
    this.iOZ = new ArrayList();
    this.iPa = new ArrayList();
    this.iPb = new ArrayList();
    this.iPc = new ArrayList();
    this.iPd = new ArrayList();
    this.iPe = new ArrayList();
    this.iPf = false;
    AppMethodBeat.o(133519);
  }

  private void e(RecyclerView.v paramv)
  {
    AppMethodBeat.i(133522);
    paramv.apJ.animate().setInterpolator(new ValueAnimator().getInterpolator());
    d(paramv);
    s.d(paramv.apJ, 0.0F);
    s.e(paramv.apJ, 1.0F);
    AppMethodBeat.o(133522);
  }

  public final void D(RecyclerView.v paramv)
  {
    AppMethodBeat.i(133525);
    super.D(paramv);
    if (!this.iPa.contains(paramv))
      this.iPf = true;
    AppMethodBeat.o(133525);
  }

  public final void F(RecyclerView.v paramv)
  {
    AppMethodBeat.i(133535);
    super.F(paramv);
    if (this.iPb.contains(paramv))
      ((RecentsRecyclerView)paramv.apJ.getParent()).cy(paramv.apJ);
    AppMethodBeat.o(133535);
  }

  public final void G(RecyclerView.v paramv)
  {
    AppMethodBeat.i(133536);
    super.G(paramv);
    if (this.iPb.contains(paramv))
    {
      this.iPb.remove(paramv);
      ((RecentsRecyclerView)paramv.apJ.getParent()).cz(paramv.apJ);
    }
    AppMethodBeat.o(133536);
  }

  public final RecyclerView.f.c a(RecyclerView.s params, RecyclerView.v paramv, int paramInt, List<Object> paramList)
  {
    AppMethodBeat.i(133537);
    Object localObject;
    if ((paramInt & 0x2) > 0)
    {
      Iterator localIterator = paramList.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          localObject = localIterator.next();
          if ((localObject instanceof Bundle))
          {
            localObject = (Boolean)((Bundle)localObject).get("star");
            if ((localObject != null) && (((Boolean)localObject).booleanValue()))
            {
              params = new p.c((byte)0).c(paramv, paramInt);
              AppMethodBeat.o(133537);
            }
          }
        }
    }
    while (true)
    {
      return params;
      if ((localObject == null) || (((Boolean)localObject).booleanValue()))
        break;
      params = new p.e((byte)0).c(paramv, paramInt);
      AppMethodBeat.o(133537);
      continue;
      params = super.a(params, paramv, paramInt, paramList);
      params.aox = paramInt;
      AppMethodBeat.o(133537);
    }
  }

  public final boolean a(RecyclerView.v paramv, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(133526);
    boolean bool;
    if ((!(paramv instanceof AppBrandLauncherRecentsList.e)) || (!this.iON))
    {
      e(paramv);
      C(paramv);
      bool = false;
      AppMethodBeat.o(133526);
    }
    while (true)
    {
      return bool;
      bool = super.a(paramv, paramInt1, paramInt2, paramInt3, paramInt4);
      AppMethodBeat.o(133526);
    }
  }

  public final boolean a(RecyclerView.v paramv1, RecyclerView.v paramv2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(133532);
    if (s.ab(paramv1.apJ) == null)
    {
      s.e(paramv1.apJ, 1.0F);
      s.d(paramv1.apJ, 0.0F);
    }
    if (s.ab(paramv2.apJ) == null)
    {
      s.e(paramv2.apJ, 1.0F);
      s.d(paramv2.apJ, 0.0F);
    }
    m(paramv1);
    m(paramv2);
    AppMethodBeat.o(133532);
    return false;
  }

  public final boolean a(RecyclerView.v paramv1, RecyclerView.v paramv2, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2)
  {
    AppMethodBeat.i(133538);
    boolean bool;
    if (!this.iON)
    {
      m(paramv1);
      m(paramv2);
      AppMethodBeat.o(133538);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((paramc1 instanceof p.c))
      {
        if (((p.c)paramc1).aNz())
        {
          ((AppBrandLauncherRecentsList.e)paramv2).iNs.setVisibility(0);
          ((AppBrandLauncherRecentsList.e)paramv2).iNs.invalidate();
          ((RecentsRecyclerView)paramv2.apJ.getParent()).cy(paramv2.apJ);
          this.iPb.add(paramv2);
          bool = super.a(paramv2, paramc1.left, paramc1.top, paramc2.left, paramc2.top);
          AppMethodBeat.o(133538);
        }
        else
        {
          e(paramv2);
          this.iOV.add((AppBrandLauncherRecentsList.e)paramv2);
          AppMethodBeat.o(133538);
          bool = true;
        }
      }
      else if ((paramc1 instanceof p.e))
      {
        if (!((p.e)paramc1).aNz())
        {
          e(paramv2);
          this.iOX.add((AppBrandLauncherRecentsList.e)paramv2);
          AppMethodBeat.o(133538);
          bool = true;
        }
        else
        {
          ((AppBrandLauncherRecentsList.e)paramv2).iNs.setVisibility(8);
          bool = super.a(paramv2, paramc1.left, paramc1.top, paramc2.left, paramc2.top);
          AppMethodBeat.o(133538);
        }
      }
      else
      {
        bool = super.a(paramv1, paramv2, paramc1, paramc2);
        AppMethodBeat.o(133538);
      }
    }
  }

  public final boolean a(RecyclerView.v paramv, List<Object> paramList)
  {
    AppMethodBeat.i(133539);
    boolean bool = super.a(paramv, paramList);
    if (((paramv instanceof AppBrandLauncherRecentsList.e)) || (bool))
    {
      bool = true;
      AppMethodBeat.o(133539);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(133539);
    }
  }

  final void b(RecyclerView.f.a parama)
  {
    AppMethodBeat.i(133520);
    if (parama != null)
      this.iOP.add(parama);
    AppMethodBeat.o(133520);
  }

  public final boolean b(RecyclerView.v paramv)
  {
    AppMethodBeat.i(133531);
    boolean bool;
    if (!this.iON)
    {
      e(paramv);
      B(paramv);
      bool = false;
      AppMethodBeat.o(133531);
    }
    while (true)
    {
      return bool;
      bool = super.b(paramv);
      AppMethodBeat.o(133531);
    }
  }

  final void c(RecyclerView.f.a parama)
  {
    AppMethodBeat.i(133521);
    if (parama != null)
      this.iOP.remove(parama);
    AppMethodBeat.o(133521);
  }

  public final boolean c(RecyclerView.v paramv)
  {
    AppMethodBeat.i(133527);
    e(paramv);
    m(paramv);
    AppMethodBeat.o(133527);
    return false;
  }

  public final void d(RecyclerView.v paramv)
  {
    AppMethodBeat.i(133528);
    if (((paramv instanceof AppBrandLauncherRecentsList.e)) && (this.iPc.remove(paramv)))
    {
      s.d(paramv.apJ, 0.0F);
      m(paramv);
    }
    super.d(paramv);
    AppMethodBeat.o(133528);
  }

  public final boolean d(RecyclerView.v paramv, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2)
  {
    AppMethodBeat.i(133530);
    boolean bool;
    if (!this.iON)
    {
      e(paramv);
      B(paramv);
      AppMethodBeat.o(133530);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((paramc1 instanceof p.c))
      {
        e(paramv);
        this.iOR.add(new p.b((AppBrandLauncherRecentsList.e)paramv, paramc1.left, paramc1.top));
        AppMethodBeat.o(133530);
        bool = true;
      }
      else if ((paramc1 instanceof p.e))
      {
        e(paramv);
        this.iOT.add(new p.d((AppBrandLauncherRecentsList.e)paramv, paramc1.left, paramc1.top));
        AppMethodBeat.o(133530);
        bool = true;
      }
      else if (((paramc1.aox & 0x800) > 0) && ((paramv instanceof AppBrandLauncherRecentsList.e)) && (paramc2 == null))
      {
        try
        {
          bool = ((AppBrandLauncherRecentsList.e)paramv).aNq().had;
          if (!bool)
          {
            e(paramv);
            this.iOZ.add(new p.f((AppBrandLauncherRecentsList.e)paramv, paramc1.left, paramc1.top, (byte)0));
            AppMethodBeat.o(133530);
            bool = true;
          }
        }
        catch (Exception localException)
        {
          while (true)
            bool = false;
        }
      }
      else
      {
        bool = super.d(paramv, paramc1, paramc2);
        AppMethodBeat.o(133530);
      }
    }
  }

  public final boolean e(RecyclerView.v paramv, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2)
  {
    AppMethodBeat.i(133529);
    boolean bool;
    if (!this.iON)
    {
      bool = c(paramv);
      AppMethodBeat.o(133529);
    }
    while (true)
    {
      return bool;
      if ((paramc1 != null) && ((paramc1.left != paramc2.left) || (paramc1.top != paramc2.top)))
      {
        bool = super.a(paramv, paramc1.left, paramc1.top, paramc2.left, paramc2.top);
        AppMethodBeat.o(133529);
      }
      else if ((this.iOM) && ((paramv.apJ.getParent() instanceof RecyclerView)) && ((paramv instanceof AppBrandLauncherRecentsList.e)))
      {
        paramc1 = (RecyclerView)paramv.apJ.getParent();
        if (paramc1.getHeight() > 0)
        {
          if (paramc2.bottom >= paramc1.getHeight())
          {
            paramv = (AppBrandLauncherRecentsList.e)paramv;
            s.d(paramv.apJ, paramv.apJ.getHeight());
            this.iPc.add(paramv);
            AppMethodBeat.o(133529);
            bool = true;
            continue;
          }
          if (paramc2.top <= 0)
          {
            paramv = (AppBrandLauncherRecentsList.e)paramv;
            s.d(paramv.apJ, -paramv.apJ.getHeight());
            this.iPc.add(paramv);
            AppMethodBeat.o(133529);
            bool = true;
          }
        }
      }
      else
      {
        bool = c(paramv);
        AppMethodBeat.o(133529);
      }
    }
  }

  public final boolean f(RecyclerView.v paramv, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2)
  {
    AppMethodBeat.i(133533);
    boolean bool;
    if (!this.iON)
    {
      e(paramv);
      C(paramv);
      bool = false;
      AppMethodBeat.o(133533);
    }
    while (true)
    {
      return bool;
      bool = super.f(paramv, paramc1, paramc2);
      AppMethodBeat.o(133533);
    }
  }

  public final void hX()
  {
    AppMethodBeat.i(133524);
    a(this.iOO);
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    if (!this.iOR.isEmpty())
    {
      localObject1 = this.iOR.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (p.b)((Iterator)localObject1).next();
        this.iOS.add(((p.b)localObject2).iPj);
        localObject3 = ((p.b)localObject2).iPj;
        localObject4 = ((p.b)localObject2).iPj.apJ;
        ((p.b)localObject2).iPj.iNs.setVisibility(0);
        s.d((View)localObject4, 0.0F);
        localObject5 = s.ab((View)localObject4);
        double d1 = ((p.b)localObject2).ahO / ((p.b)localObject2).iPj.apJ.getHeight();
        double d2 = this.aov;
        ((w)localObject5).l(Math.max(this.aov, Math.min(Math.round(d1 * d2) + this.aov, 400L)));
        ((w)localObject5).c(this.iOQ);
        ((w)localObject5).a(new p.2(this, (RecyclerView.v)localObject3, (w)localObject5));
        ((w)localObject5).u(-((p.b)localObject2).ahO - ((View)localObject4).getHeight()).start();
      }
      this.iOR.clear();
    }
    if (!this.iOT.isEmpty())
    {
      localObject2 = this.iOT.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject4 = (p.d)((Iterator)localObject2).next();
        this.iOU.add(((p.d)localObject4).iPj);
        localObject5 = ((p.d)localObject4).iPj;
        localObject1 = ((p.d)localObject4).iPj.apJ;
        localObject3 = (RecentsRecyclerView)((View)localObject1).getParent();
        ((p.d)localObject4).iPj.iNs.setVisibility(8);
        s.d((View)localObject1, 0.0F);
        localObject1 = s.ab((View)localObject1);
        ((w)localObject1).l(this.aov);
        ((w)localObject1).a(new p.3(this, (RecyclerView.v)localObject5, (w)localObject1));
        ((w)localObject1).u(((RecentsRecyclerView)localObject3).getHeight() - ((p.d)localObject4).ahO).start();
      }
      this.iOT.clear();
    }
    if (!this.iOV.isEmpty())
    {
      localObject2 = this.iOV.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject4 = (AppBrandLauncherRecentsList.e)((Iterator)localObject2).next();
        this.iOW.add(localObject4);
        s.f(((AppBrandLauncherRecentsList.e)localObject4).iNs, 0.1F);
        s.g(((AppBrandLauncherRecentsList.e)localObject4).iNs, 0.1F);
        s.e(((AppBrandLauncherRecentsList.e)localObject4).iNs, 0.0F);
        ((AppBrandLauncherRecentsList.e)localObject4).iNs.setVisibility(0);
        localObject5 = s.ab(((AppBrandLauncherRecentsList.e)localObject4).iNs);
        ((w)localObject5).l(this.aow);
        ((w)localObject5).a(new p.4(this, (AppBrandLauncherRecentsList.e)localObject4, (w)localObject5));
        ((w)localObject5).t(1.0F).v(1.0F).A(1.0F).start();
      }
      this.iOV.clear();
    }
    if (!this.iOX.isEmpty())
    {
      localObject2 = this.iOX.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject4 = (AppBrandLauncherRecentsList.e)((Iterator)localObject2).next();
        this.iOY.add(localObject4);
        s.f(((AppBrandLauncherRecentsList.e)localObject4).iNs, 1.0F);
        s.g(((AppBrandLauncherRecentsList.e)localObject4).iNs, 1.0F);
        s.e(((AppBrandLauncherRecentsList.e)localObject4).iNs, 1.0F);
        ((AppBrandLauncherRecentsList.e)localObject4).iNs.setVisibility(0);
        localObject5 = s.ab(((AppBrandLauncherRecentsList.e)localObject4).iNs);
        ((w)localObject5).l(this.aow);
        ((w)localObject5).a(new p.5(this, (AppBrandLauncherRecentsList.e)localObject4));
        ((w)localObject5).t(0.0F).v(0.1F).A(0.1F).start();
      }
      this.iOX.clear();
    }
    if (!this.iOZ.isEmpty())
    {
      localObject5 = this.iOZ.iterator();
      while (((Iterator)localObject5).hasNext())
      {
        localObject4 = (p.f)((Iterator)localObject5).next();
        this.iPa.add(((p.f)localObject4).iPj);
        localObject2 = ((p.f)localObject4).iPj.apJ;
        s.d((View)localObject2, 0.0F);
        s.e((View)localObject2, 1.0F);
        localObject3 = ((p.f)localObject4).iPj;
        localObject4 = s.ab((View)localObject2);
        ((w)localObject4).l(this.aov);
        ((w)localObject4).a(new android.support.v4.view.y()
        {
          public final void aA(View paramAnonymousView)
          {
            AppMethodBeat.i(133514);
            s.d(paramAnonymousView, 0.0F);
            s.e(paramAnonymousView, 1.0F);
            p.this.B(this.iPi);
            p.this.iPa.remove(this.iPi);
            p.a(p.this);
            AppMethodBeat.o(133514);
          }

          public final void az(View paramAnonymousView)
          {
            AppMethodBeat.i(133513);
            p.this.D(this.iPi);
            AppMethodBeat.o(133513);
          }
        });
        ((w)localObject4).t(0.0F).u(-((View)localObject2).getHeight()).start();
      }
      this.iOZ.clear();
    }
    super.hX();
    if (!this.iPc.isEmpty())
    {
      this.iPd.addAll(this.iPc);
      localObject5 = new p.7(this);
      this.iPc.clear();
      if (this.iPf)
      {
        s.a(((AppBrandLauncherRecentsList.e)this.iPd.get(0)).apJ, (Runnable)localObject5, this.aou);
        AppMethodBeat.o(133524);
      }
    }
    while (true)
    {
      return;
      ((Runnable)localObject5).run();
      AppMethodBeat.o(133524);
    }
  }

  public final boolean isRunning()
  {
    AppMethodBeat.i(133523);
    boolean bool;
    if ((!this.iOR.isEmpty()) || (!this.iOS.isEmpty()) || (!this.iOT.isEmpty()) || (!this.iOU.isEmpty()) || (!this.iOV.isEmpty()) || (!this.iOW.isEmpty()) || (!this.iOX.isEmpty()) || (!this.iOY.isEmpty()) || (!this.iOZ.isEmpty()) || (!this.iPa.isEmpty()) || (!this.iPc.isEmpty()) || (!this.iPd.isEmpty()) || (!this.iPe.isEmpty()) || (super.isRunning()))
    {
      bool = true;
      AppMethodBeat.o(133523);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(133523);
    }
  }

  public final void n(RecyclerView.v paramv)
  {
    AppMethodBeat.i(133534);
    super.n(paramv);
    ViewParent localViewParent = paramv.apJ.getParent();
    if ((localViewParent instanceof RecentsRecyclerView))
      ((RecentsRecyclerView)localViewParent).cz(paramv.apJ);
    AppMethodBeat.o(133534);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.p
 * JD-Core Version:    0.6.2
 */