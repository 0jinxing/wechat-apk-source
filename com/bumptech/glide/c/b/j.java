package com.bumptech.glide.c.b;

import android.support.v4.f.k.a;
import android.util.Log;
import com.bumptech.glide.c.b.b.a.a;
import com.bumptech.glide.c.b.b.b;
import com.bumptech.glide.c.b.b.h.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class j
  implements h.a, l, o.a
{
  private static final boolean aBn;
  private final r aBo;
  private final n aBp;
  private final com.bumptech.glide.c.b.b.h aBq;
  private final b aBr;
  private final x aBs;
  private final c aBt;
  private final j.a aBu;
  private final a aBv;

  static
  {
    AppMethodBeat.i(91821);
    aBn = Log.isLoggable("Engine", 2);
    AppMethodBeat.o(91821);
  }

  public j(com.bumptech.glide.c.b.b.h paramh, a.a parama, com.bumptech.glide.c.b.c.a parama1, com.bumptech.glide.c.b.c.a parama2, com.bumptech.glide.c.b.c.a parama3, com.bumptech.glide.c.b.c.a parama4, boolean paramBoolean)
  {
    this(paramh, parama, parama1, parama2, parama3, parama4, paramBoolean, (byte)0);
  }

  private j(com.bumptech.glide.c.b.b.h paramh, a.a parama, com.bumptech.glide.c.b.c.a parama1, com.bumptech.glide.c.b.c.a parama2, com.bumptech.glide.c.b.c.a parama3, com.bumptech.glide.c.b.c.a parama4, boolean paramBoolean, byte paramByte)
  {
    AppMethodBeat.i(91813);
    this.aBq = paramh;
    this.aBt = new c(parama);
    parama = new a(paramBoolean);
    this.aBv = parama;
    parama.azJ = this;
    this.aBp = new n();
    this.aBo = new r();
    this.aBr = new b(parama1, parama2, parama3, parama4, this);
    this.aBu = new j.a(this.aBt);
    this.aBs = new x();
    paramh.a(this);
    AppMethodBeat.o(91813);
  }

  private static void a(String paramString, long paramLong, com.bumptech.glide.c.h paramh)
  {
    AppMethodBeat.i(91815);
    new StringBuilder().append(paramString).append(" in ").append(com.bumptech.glide.h.e.q(paramLong)).append("ms, key: ").append(paramh);
    AppMethodBeat.o(91815);
  }

  public static void b(u<?> paramu)
  {
    AppMethodBeat.i(91816);
    com.bumptech.glide.h.j.om();
    if ((paramu instanceof o))
    {
      ((o)paramu).release();
      AppMethodBeat.o(91816);
      return;
    }
    paramu = new IllegalArgumentException("Cannot release anything but an EngineResource");
    AppMethodBeat.o(91816);
    throw paramu;
  }

  public final <R> j.d a(com.bumptech.glide.e parame, Object paramObject, com.bumptech.glide.c.h paramh, int paramInt1, int paramInt2, Class<?> paramClass, Class<R> paramClass1, com.bumptech.glide.g paramg, i parami, Map<Class<?>, com.bumptech.glide.c.m<?>> paramMap, boolean paramBoolean1, boolean paramBoolean2, com.bumptech.glide.c.j paramj, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, com.bumptech.glide.f.f paramf)
  {
    AppMethodBeat.i(91814);
    com.bumptech.glide.h.j.om();
    long l;
    m localm;
    if (aBn)
    {
      l = com.bumptech.glide.h.e.ok();
      localm = new m(paramObject, paramh, paramInt1, paramInt2, paramMap, paramClass, paramClass1, paramj);
      if (paramBoolean3)
        break label97;
      localObject1 = null;
      if (localObject1 == null)
        break label174;
      paramf.c((u)localObject1, com.bumptech.glide.c.a.ayH);
      if (aBn)
        a("Loaded resource from active resources", l, localm);
      parame = null;
      AppMethodBeat.o(91814);
    }
    while (true)
    {
      return parame;
      l = 0L;
      break;
      label97: localObject1 = this.aBv;
      localObject2 = (a.b)((a)localObject1).azI.get(localm);
      if (localObject2 == null)
        localObject3 = null;
      while (true)
      {
        localObject1 = localObject3;
        if (localObject3 == null)
          break;
        ((o)localObject3).acquire();
        localObject1 = localObject3;
        break;
        localObject3 = (o)((a.b)localObject2).get();
        if (localObject3 == null)
          ((a)localObject1).a((a.b)localObject2);
      }
      label174: if (!paramBoolean3)
      {
        localObject1 = null;
        if (localObject1 != null)
        {
          paramf.c((u)localObject1, com.bumptech.glide.c.a.ayH);
          if (aBn)
            a("Loaded resource from cache", l, localm);
          parame = null;
          AppMethodBeat.o(91814);
        }
      }
      else
      {
        localObject3 = this.aBq.b(localm);
        if (localObject3 == null)
          localObject3 = null;
        while (true)
        {
          localObject1 = localObject3;
          if (localObject3 == null)
            break;
          ((o)localObject3).acquire();
          this.aBv.a(localm, (o)localObject3);
          localObject1 = localObject3;
          break;
          if ((localObject3 instanceof o))
            localObject3 = (o)localObject3;
          else
            localObject3 = new o((u)localObject3, true, true);
        }
        localObject3 = (k)this.aBo.ax(paramBoolean6).get(localm);
        if (localObject3 == null)
          break label379;
        ((k)localObject3).a(paramf);
        if (aBn)
          a("Added to existing load", l, localm);
        parame = new j.d(paramf, (k)localObject3);
        AppMethodBeat.o(91814);
      }
    }
    label379: Object localObject1 = (k)com.bumptech.glide.h.i.d((k)this.aBr.aAr.aA(), "Argument must not be null");
    ((k)localObject1).azP = localm;
    ((k)localObject1).azQ = paramBoolean3;
    ((k)localObject1).aBJ = paramBoolean4;
    ((k)localObject1).aBK = paramBoolean5;
    ((k)localObject1).aAz = paramBoolean6;
    Object localObject2 = this.aBu;
    Object localObject3 = (g)com.bumptech.glide.h.i.d((g)((j.a)localObject2).aAr.aA(), "Argument must not be null");
    int i = ((j.a)localObject2).aBw;
    ((j.a)localObject2).aBw = (i + 1);
    f localf = ((g)localObject3).aAo;
    localObject2 = ((g)localObject3).aAg;
    localf.awi = parame;
    localf.axb = paramObject;
    localf.aAb = paramh;
    localf.width = paramInt1;
    localf.height = paramInt2;
    localf.aAl = parami;
    localf.aAf = paramClass;
    localf.aAg = ((g.d)localObject2);
    localf.awY = paramClass1;
    localf.aAk = paramg;
    localf.aAd = paramj;
    localf.aAh = paramMap;
    localf.aAm = paramBoolean1;
    localf.aAn = paramBoolean2;
    ((g)localObject3).awi = parame;
    ((g)localObject3).aAb = paramh;
    ((g)localObject3).aAk = paramg;
    ((g)localObject3).aAu = localm;
    ((g)localObject3).width = paramInt1;
    ((g)localObject3).height = paramInt2;
    ((g)localObject3).aAl = parami;
    ((g)localObject3).aAz = paramBoolean6;
    ((g)localObject3).aAd = paramj;
    ((g)localObject3).aAv = ((g.a)localObject1);
    ((g)localObject3).order = i;
    ((g)localObject3).aAx = g.f.aAS;
    ((g)localObject3).axb = paramObject;
    this.aBo.ax(((k)localObject1).aAz).put(localm, localObject1);
    ((k)localObject1).a(paramf);
    ((k)localObject1).aBQ = ((g)localObject3);
    parame = ((g)localObject3).a(g.g.aAW);
    if ((parame == g.g.aAX) || (parame == g.g.aAY))
    {
      paramInt1 = 1;
      label744: if (paramInt1 == 0)
        break label803;
    }
    label803: for (parame = ((k)localObject1).awr; ; parame = ((k)localObject1).mH())
    {
      parame.execute((Runnable)localObject3);
      if (aBn)
        a("Started new load", l, localm);
      parame = new j.d(paramf, (k)localObject1);
      AppMethodBeat.o(91814);
      break;
      paramInt1 = 0;
      break label744;
    }
  }

  public final void a(k<?> paramk, com.bumptech.glide.c.h paramh)
  {
    AppMethodBeat.i(91818);
    com.bumptech.glide.h.j.om();
    this.aBo.a(paramh, paramk);
    AppMethodBeat.o(91818);
  }

  public final void a(k<?> paramk, com.bumptech.glide.c.h paramh, o<?> paramo)
  {
    AppMethodBeat.i(91817);
    com.bumptech.glide.h.j.om();
    if (paramo != null)
    {
      paramo.a(paramh, this);
      if (paramo.azQ)
        this.aBv.a(paramh, paramo);
    }
    this.aBo.a(paramh, paramk);
    AppMethodBeat.o(91817);
  }

  public final void b(com.bumptech.glide.c.h paramh, o<?> paramo)
  {
    AppMethodBeat.i(91820);
    com.bumptech.glide.h.j.om();
    a.b localb = (a.b)this.aBv.azI.remove(paramh);
    if (localb != null)
      localb.reset();
    if (paramo.azQ)
    {
      this.aBq.a(paramh, paramo);
      AppMethodBeat.o(91820);
    }
    while (true)
    {
      return;
      this.aBs.e(paramo);
      AppMethodBeat.o(91820);
    }
  }

  public final void c(u<?> paramu)
  {
    AppMethodBeat.i(91819);
    com.bumptech.glide.h.j.om();
    this.aBs.e(paramu);
    AppMethodBeat.o(91819);
  }

  static final class b
  {
    final k.a<k<?>> aAr;
    final com.bumptech.glide.c.b.c.a aBy;
    final l aBz;
    final com.bumptech.glide.c.b.c.a awq;
    final com.bumptech.glide.c.b.c.a awr;
    final com.bumptech.glide.c.b.c.a awx;

    b(com.bumptech.glide.c.b.c.a parama1, com.bumptech.glide.c.b.c.a parama2, com.bumptech.glide.c.b.c.a parama3, com.bumptech.glide.c.b.c.a parama4, l paraml)
    {
      AppMethodBeat.i(91811);
      this.aAr = com.bumptech.glide.h.a.a.a(new j.b.1(this));
      this.awr = parama1;
      this.awq = parama2;
      this.aBy = parama3;
      this.awx = parama4;
      this.aBz = paraml;
      AppMethodBeat.o(91811);
    }
  }

  static final class c
    implements g.d
  {
    private final a.a aBB;
    private volatile com.bumptech.glide.c.b.b.a aBC;

    c(a.a parama)
    {
      this.aBB = parama;
    }

    public final com.bumptech.glide.c.b.b.a mn()
    {
      AppMethodBeat.i(91812);
      if (this.aBC == null);
      try
      {
        if (this.aBC == null)
          this.aBC = this.aBB.mU();
        if (this.aBC == null)
        {
          localObject1 = new com/bumptech/glide/c/b/b/b;
          ((b)localObject1).<init>();
          this.aBC = ((com.bumptech.glide.c.b.b.a)localObject1);
        }
        Object localObject1 = this.aBC;
        AppMethodBeat.o(91812);
        return localObject1;
      }
      finally
      {
        AppMethodBeat.o(91812);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.j
 * JD-Core Version:    0.6.2
 */