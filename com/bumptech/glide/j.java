package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.f.b;
import com.bumptech.glide.manager.c.a;
import com.bumptech.glide.manager.d;
import com.bumptech.glide.manager.h;
import com.bumptech.glide.manager.m;
import com.bumptech.glide.manager.n;
import com.bumptech.glide.manager.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class j
  implements com.bumptech.glide.manager.i
{
  private static final com.bumptech.glide.f.e awW;
  private static final com.bumptech.glide.f.e axk;
  private static final com.bumptech.glide.f.e axl;
  private final Handler awA;
  com.bumptech.glide.f.e awZ;
  protected final c awc;
  final h axm;
  final n axn;
  private final m axo;
  final o axp;
  private final Runnable axq;
  private final com.bumptech.glide.manager.c axr;
  protected final Context context;

  static
  {
    AppMethodBeat.i(91663);
    com.bumptech.glide.f.e locale = com.bumptech.glide.f.e.w(Bitmap.class);
    locale.aCf = true;
    axk = locale;
    locale = com.bumptech.glide.f.e.w(com.bumptech.glide.c.d.e.c.class);
    locale.aCf = true;
    axl = locale;
    awW = com.bumptech.glide.f.e.a(com.bumptech.glide.c.b.i.aBk).b(g.awK).nQ();
    AppMethodBeat.o(91663);
  }

  public j(c paramc, h paramh, m paramm, Context paramContext)
  {
    this(paramc, paramh, paramm, new n(), paramc.awm, paramContext);
    AppMethodBeat.i(91652);
    AppMethodBeat.o(91652);
  }

  private j(c paramc, h arg2, m paramm, n paramn, d paramd, Context paramContext)
  {
    AppMethodBeat.i(91653);
    this.axp = new o();
    this.axq = new j.1(this);
    this.awA = new Handler(Looper.getMainLooper());
    this.awc = paramc;
    this.axm = ???;
    this.axo = paramm;
    this.axn = paramn;
    this.context = paramContext;
    this.axr = paramd.a(paramContext.getApplicationContext(), new a(paramn));
    if (com.bumptech.glide.h.j.oo())
      this.awA.post(this.axq);
    while (true)
    {
      ???.a(this.axr);
      this.awZ = paramc.awi.awv.nR().nS();
      synchronized (paramc.awn)
      {
        if (!paramc.awn.contains(this))
          break;
        paramc = new java/lang/IllegalStateException;
        paramc.<init>("Cannot register already registered manager");
        AppMethodBeat.o(91653);
        throw paramc;
      }
      ???.a(this);
    }
    paramc.awn.add(this);
    AppMethodBeat.o(91653);
  }

  private void d(com.bumptech.glide.f.a.e<?> parame)
  {
    AppMethodBeat.i(91659);
    if ((!e(parame)) && (!this.awc.a(parame)) && (parame.og() != null))
    {
      b localb = parame.og();
      parame.h(null);
      localb.clear();
    }
    AppMethodBeat.o(91659);
  }

  public final void c(com.bumptech.glide.f.a.e<?> parame)
  {
    AppMethodBeat.i(91658);
    if (parame == null)
      AppMethodBeat.o(91658);
    while (true)
    {
      return;
      if (com.bumptech.glide.h.j.on())
      {
        d(parame);
        AppMethodBeat.o(91658);
      }
      else
      {
        this.awA.post(new j.2(this, parame));
        AppMethodBeat.o(91658);
      }
    }
  }

  final boolean e(com.bumptech.glide.f.a.e<?> parame)
  {
    boolean bool = true;
    AppMethodBeat.i(91660);
    b localb = parame.og();
    if (localb == null)
      AppMethodBeat.o(91660);
    while (true)
    {
      return bool;
      if (this.axn.a(localb, true))
      {
        this.axp.f(parame);
        parame.h(null);
        AppMethodBeat.o(91660);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(91660);
      }
    }
  }

  final <T> k<?, T> k(Class<T> paramClass)
  {
    AppMethodBeat.i(91661);
    Object localObject1 = this.awc.awi;
    Object localObject2 = (k)((e)localObject1).awp.get(paramClass);
    Object localObject3 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = ((e)localObject1).awp.entrySet().iterator();
      localObject3 = localObject2;
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        if (!((Class)((Map.Entry)localObject2).getKey()).isAssignableFrom(paramClass))
          break label122;
        localObject3 = (k)((Map.Entry)localObject2).getValue();
      }
    }
    label122: 
    while (true)
    {
      break;
      paramClass = (Class<T>)localObject3;
      if (localObject3 == null)
        paramClass = e.awz;
      AppMethodBeat.o(91661);
      return paramClass;
    }
  }

  public final i<Bitmap> lI()
  {
    AppMethodBeat.i(91657);
    i locali = new i(this.awc, this, Bitmap.class, this.context).a(axk);
    AppMethodBeat.o(91657);
    return locali;
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(91656);
    this.axp.onDestroy();
    ??? = com.bumptech.glide.h.j.d(this.axp.aGW).iterator();
    while (((Iterator)???).hasNext())
      c((com.bumptech.glide.f.a.e)((Iterator)???).next());
    this.axp.aGW.clear();
    ??? = this.axn;
    Object localObject2 = com.bumptech.glide.h.j.d(((n)???).aGR).iterator();
    while (((Iterator)localObject2).hasNext())
      ((n)???).a((b)((Iterator)localObject2).next(), false);
    ((n)???).aGS.clear();
    this.axm.b(this);
    this.axm.b(this.axr);
    this.awA.removeCallbacks(this.axq);
    localObject2 = this.awc;
    synchronized (((c)localObject2).awn)
    {
      if (!((c)localObject2).awn.contains(this))
      {
        localObject2 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject2).<init>("Cannot unregister not yet registered manager");
        AppMethodBeat.o(91656);
        throw ((Throwable)localObject2);
      }
    }
    localObject3.awn.remove(this);
    AppMethodBeat.o(91656);
  }

  public final void onStart()
  {
    AppMethodBeat.i(91654);
    com.bumptech.glide.h.j.om();
    n localn = this.axn;
    localn.isPaused = false;
    Iterator localIterator = com.bumptech.glide.h.j.d(localn.aGR).iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if ((!localb.isComplete()) && (!localb.isCancelled()) && (!localb.isRunning()))
        localb.begin();
    }
    localn.aGS.clear();
    this.axp.onStart();
    AppMethodBeat.o(91654);
  }

  public final void onStop()
  {
    AppMethodBeat.i(91655);
    com.bumptech.glide.h.j.om();
    n localn = this.axn;
    localn.isPaused = true;
    Iterator localIterator = com.bumptech.glide.h.j.d(localn.aGR).iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if (localb.isRunning())
      {
        localb.pause();
        localn.aGS.add(localb);
      }
    }
    this.axp.onStop();
    AppMethodBeat.o(91655);
  }

  public final String toString()
  {
    AppMethodBeat.i(91662);
    String str = super.toString() + "{tracker=" + this.axn + ", treeNode=" + this.axo + "}";
    AppMethodBeat.o(91662);
    return str;
  }

  static final class a
    implements c.a
  {
    private final n axn;

    a(n paramn)
    {
      this.axn = paramn;
    }

    public final void aw(boolean paramBoolean)
    {
      AppMethodBeat.i(91651);
      if (paramBoolean)
      {
        n localn = this.axn;
        Iterator localIterator = com.bumptech.glide.h.j.d(localn.aGR).iterator();
        while (localIterator.hasNext())
        {
          b localb = (b)localIterator.next();
          if ((!localb.isComplete()) && (!localb.isCancelled()))
          {
            localb.pause();
            if (!localn.isPaused)
              localb.begin();
            else
              localn.aGS.add(localb);
          }
        }
      }
      AppMethodBeat.o(91651);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.j
 * JD-Core Version:    0.6.2
 */