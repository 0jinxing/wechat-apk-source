package com.bumptech.glide.c.b;

import android.os.Build.VERSION;
import android.support.v4.f.k.a;
import android.util.Log;
import com.bumptech.glide.c.a.d;
import com.bumptech.glide.c.j;
import com.bumptech.glide.h.a.a.c;
import com.bumptech.glide.h.a.b.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class g<R>
  implements e.a, a.c, Comparable<g<?>>, Runnable
{
  private Thread aAA;
  com.bumptech.glide.c.h aAB;
  private com.bumptech.glide.c.h aAC;
  private Object aAD;
  private com.bumptech.glide.c.a aAE;
  private d<?> aAF;
  public volatile e aAG;
  private volatile boolean aAH;
  com.bumptech.glide.c.h aAb;
  j aAd;
  final d aAg;
  com.bumptech.glide.g aAk;
  i aAl;
  final f<R> aAo;
  private final List<Throwable> aAp;
  private final com.bumptech.glide.h.a.b aAq;
  private final k.a<g<?>> aAr;
  final g.c<?> aAs;
  final g.e aAt;
  m aAu;
  g.a<R> aAv;
  private g.g aAw;
  g.f aAx;
  private long aAy;
  boolean aAz;
  com.bumptech.glide.e awi;
  Object axb;
  int height;
  public volatile boolean isCancelled;
  int order;
  int width;

  g(d paramd, k.a<g<?>> parama)
  {
    AppMethodBeat.i(91784);
    this.aAo = new f();
    this.aAp = new ArrayList();
    this.aAq = new b.a();
    this.aAs = new g.c();
    this.aAt = new g.e();
    this.aAg = paramd;
    this.aAr = parama;
    AppMethodBeat.o(91784);
  }

  private <Data> u<R> a(d<?> paramd, Data paramData, com.bumptech.glide.c.a parama)
  {
    Object localObject = null;
    AppMethodBeat.i(91800);
    if (paramData == null)
    {
      paramd.cleanup();
      AppMethodBeat.o(91800);
      paramd = localObject;
    }
    while (true)
    {
      return paramd;
      try
      {
        long l = com.bumptech.glide.h.e.ok();
        paramData = a(paramData, parama, this.aAo.m(paramData.getClass()));
        if (Log.isLoggable("DecodeJob", 2))
          a("Decoded result ".concat(String.valueOf(paramData)), l, null);
        paramd.cleanup();
        AppMethodBeat.o(91800);
        paramd = paramData;
      }
      finally
      {
        paramd.cleanup();
        AppMethodBeat.o(91800);
      }
    }
  }

  private <Data, ResourceType> u<R> a(Data paramData, com.bumptech.glide.c.a parama, s<Data, ResourceType, R> params)
  {
    AppMethodBeat.i(91801);
    Object localObject1 = this.aAd;
    Object localObject2 = localObject1;
    if (Build.VERSION.SDK_INT >= 26)
    {
      localObject2 = localObject1;
      if (((j)localObject1).a(com.bumptech.glide.c.d.a.h.aFo) == null)
        if (parama != com.bumptech.glide.c.a.ayG)
        {
          localObject2 = localObject1;
          if (!this.aAo.aAn);
        }
        else
        {
          localObject2 = new j();
          ((j)localObject2).a(this.aAd);
          com.bumptech.glide.c.i locali = com.bumptech.glide.c.d.a.h.aFo;
          localObject1 = Boolean.TRUE;
          ((j)localObject2).azh.put(locali, localObject1);
        }
    }
    paramData = this.awi.awj.awQ.T(paramData);
    try
    {
      int i = this.width;
      int j = this.height;
      localObject1 = new com/bumptech/glide/c/b/g$b;
      ((g.b)localObject1).<init>(this, parama);
      parama = params.a(paramData, (j)localObject2, i, j, (h.a)localObject1);
      return parama;
    }
    finally
    {
      paramData.cleanup();
      AppMethodBeat.o(91801);
    }
    throw parama;
  }

  private void a(u<R> paramu, com.bumptech.glide.c.a parama)
  {
    AppMethodBeat.i(91792);
    mw();
    this.aAv.c(paramu, parama);
    AppMethodBeat.o(91792);
  }

  private void a(String paramString1, long paramLong, String paramString2)
  {
    AppMethodBeat.i(91802);
    StringBuilder localStringBuilder = new StringBuilder().append(paramString1).append(" in ").append(com.bumptech.glide.h.e.q(paramLong)).append(", load key: ").append(this.aAu);
    if (paramString2 != null);
    for (paramString1 = ", ".concat(String.valueOf(paramString2)); ; paramString1 = "")
    {
      localStringBuilder.append(paramString1).append(", thread: ").append(Thread.currentThread().getName());
      AppMethodBeat.o(91802);
      return;
    }
  }

  private void b(u<R> paramu, com.bumptech.glide.c.a parama)
  {
    AppMethodBeat.i(91799);
    if ((paramu instanceof q))
      ((q)paramu).initialize();
    u<R> localu = null;
    Object localObject = paramu;
    if (this.aAs.mz())
    {
      localObject = t.d(paramu);
      paramu = (u<R>)localObject;
      localu = paramu;
    }
    a((u)localObject, parama);
    this.aAw = g.g.aBa;
    try
    {
      if (this.aAs.mz())
        this.aAs.a(this.aAg, this.aAd);
      if (localu != null)
        localu.unlock();
      mq();
      AppMethodBeat.o(91799);
      return;
    }
    finally
    {
      if (localu != null)
        localu.unlock();
      AppMethodBeat.o(91799);
    }
    throw paramu;
  }

  private void mq()
  {
    AppMethodBeat.i(91785);
    if (this.aAt.mB())
      ms();
    AppMethodBeat.o(91785);
  }

  private void mr()
  {
    AppMethodBeat.i(91786);
    if (this.aAt.mC())
      ms();
    AppMethodBeat.o(91786);
  }

  private e mt()
  {
    AppMethodBeat.i(91789);
    Object localObject;
    switch (g.1.aAJ[this.aAw.ordinal()])
    {
    default:
      localObject = new IllegalStateException("Unrecognized stage: " + this.aAw);
      AppMethodBeat.o(91789);
      throw ((Throwable)localObject);
    case 1:
      localObject = new v(this.aAo, this);
      AppMethodBeat.o(91789);
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return localObject;
      localObject = new b(this.aAo, this);
      AppMethodBeat.o(91789);
      continue;
      localObject = new y(this.aAo, this);
      AppMethodBeat.o(91789);
      continue;
      localObject = null;
      AppMethodBeat.o(91789);
    }
  }

  private void mu()
  {
    AppMethodBeat.i(91790);
    this.aAA = Thread.currentThread();
    this.aAy = com.bumptech.glide.h.e.ok();
    boolean bool1 = false;
    boolean bool2;
    do
    {
      bool2 = bool1;
      if (this.isCancelled)
        break;
      bool2 = bool1;
      if (this.aAG == null)
        break;
      bool1 = this.aAG.mk();
      bool2 = bool1;
      if (bool1)
        break;
      this.aAw = a(this.aAw);
      this.aAG = mt();
    }
    while (this.aAw != g.g.aAZ);
    mm();
    AppMethodBeat.o(91790);
    while (true)
    {
      return;
      if (((this.aAw == g.g.aBb) || (this.isCancelled)) && (!bool2))
        mv();
      AppMethodBeat.o(91790);
    }
  }

  private void mv()
  {
    AppMethodBeat.i(91791);
    mw();
    p localp = new p("Failed to load resource", new ArrayList(this.aAp));
    this.aAv.a(localp);
    mr();
    AppMethodBeat.o(91791);
  }

  private void mw()
  {
    AppMethodBeat.i(91793);
    this.aAq.oq();
    if (this.aAH)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("Already notified");
      AppMethodBeat.o(91793);
      throw localIllegalStateException;
    }
    this.aAH = true;
    AppMethodBeat.o(91793);
  }

  private void mx()
  {
    AppMethodBeat.i(91798);
    if (Log.isLoggable("DecodeJob", 2))
      a("Retrieved data", this.aAy, "data: " + this.aAD + ", cache key: " + this.aAB + ", fetcher: " + this.aAF);
    try
    {
      u localu = a(this.aAF, this.aAD, this.aAE);
      if (localu != null)
      {
        b(localu, this.aAE);
        AppMethodBeat.o(91798);
        return;
      }
    }
    catch (p localp)
    {
      while (true)
      {
        localp.a(this.aAC, this.aAE, null);
        this.aAp.add(localp);
        Object localObject = null;
        continue;
        mu();
        AppMethodBeat.o(91798);
      }
    }
  }

  final g.g a(g.g paramg)
  {
    AppMethodBeat.i(91794);
    switch (g.1.aAJ[paramg.ordinal()])
    {
    default:
      paramg = new IllegalArgumentException("Unrecognized stage: ".concat(String.valueOf(paramg)));
      AppMethodBeat.o(91794);
      throw paramg;
    case 5:
      if (this.aAl.mE())
      {
        paramg = g.g.aAX;
        AppMethodBeat.o(91794);
      }
      break;
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return paramg;
      paramg = g.g.aAX;
      break;
      if (this.aAl.mF())
      {
        paramg = g.g.aAY;
        AppMethodBeat.o(91794);
      }
      else
      {
        paramg = g.g.aAY;
        break;
        if (this.aAz)
        {
          paramg = g.g.aBb;
          AppMethodBeat.o(91794);
        }
        else
        {
          paramg = g.g.aAZ;
          AppMethodBeat.o(91794);
          continue;
          paramg = g.g.aBb;
          AppMethodBeat.o(91794);
        }
      }
    }
  }

  public final void a(com.bumptech.glide.c.h paramh, Exception paramException, d<?> paramd, com.bumptech.glide.c.a parama)
  {
    AppMethodBeat.i(91797);
    paramd.cleanup();
    paramException = new p("Fetching data failed", paramException);
    paramException.a(paramh, parama, paramd.mg());
    this.aAp.add(paramException);
    if (Thread.currentThread() != this.aAA)
    {
      this.aAx = g.f.aAT;
      this.aAv.a(this);
      AppMethodBeat.o(91797);
    }
    while (true)
    {
      return;
      mu();
      AppMethodBeat.o(91797);
    }
  }

  public final void a(com.bumptech.glide.c.h paramh1, Object paramObject, d<?> paramd, com.bumptech.glide.c.a parama, com.bumptech.glide.c.h paramh2)
  {
    AppMethodBeat.i(91796);
    this.aAB = paramh1;
    this.aAD = paramObject;
    this.aAF = paramd;
    this.aAE = parama;
    this.aAC = paramh2;
    if (Thread.currentThread() != this.aAA)
    {
      this.aAx = g.f.aAU;
      this.aAv.a(this);
      AppMethodBeat.o(91796);
    }
    while (true)
    {
      return;
      try
      {
        mx();
        AppMethodBeat.o(91796);
      }
      finally
      {
        AppMethodBeat.o(91796);
      }
    }
  }

  public final void mm()
  {
    AppMethodBeat.i(91795);
    this.aAx = g.f.aAT;
    this.aAv.a(this);
    AppMethodBeat.o(91795);
  }

  final void ms()
  {
    AppMethodBeat.i(91787);
    this.aAt.reset();
    this.aAs.clear();
    this.aAo.clear();
    this.aAH = false;
    this.awi = null;
    this.aAb = null;
    this.aAd = null;
    this.aAk = null;
    this.aAu = null;
    this.aAv = null;
    this.aAw = null;
    this.aAG = null;
    this.aAA = null;
    this.aAB = null;
    this.aAD = null;
    this.aAE = null;
    this.aAF = null;
    this.aAy = 0L;
    this.isCancelled = false;
    this.axb = null;
    this.aAp.clear();
    this.aAr.release(this);
    AppMethodBeat.o(91787);
  }

  public final com.bumptech.glide.h.a.b my()
  {
    return this.aAq;
  }

  public final void run()
  {
    AppMethodBeat.i(91788);
    d locald = this.aAF;
    while (true)
    {
      try
      {
        if (this.isCancelled)
        {
          mv();
          return;
        }
        switch (g.1.aAI[this.aAx.ordinal()])
        {
        default:
          IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("Unrecognized run reason: ");
          localIllegalStateException.<init>(this.aAx);
          AppMethodBeat.o(91788);
          throw localIllegalStateException;
        case 1:
        case 2:
        case 3:
        }
      }
      catch (Throwable localThrowable)
      {
        StringBuilder localStringBuilder;
        if (Log.isLoggable("DecodeJob", 3))
        {
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("DecodeJob threw unexpectedly, isCancelled: ");
          localStringBuilder.append(this.isCancelled).append(", stage: ").append(this.aAw);
        }
        if (this.aAw != g.g.aBa)
        {
          this.aAp.add(localThrowable);
          mv();
        }
        if (this.isCancelled)
          break label272;
        AppMethodBeat.o(91788);
        throw localThrowable;
      }
      finally
      {
        if (locald != null)
          locald.cleanup();
        AppMethodBeat.o(91788);
      }
      this.aAw = a(g.g.aAW);
      this.aAG = mt();
      mu();
      while (true)
      {
        if (locald != null)
          locald.cleanup();
        AppMethodBeat.o(91788);
        break;
        mu();
        continue;
        mx();
      }
      label272: if (locald != null)
        locald.cleanup();
      AppMethodBeat.o(91788);
    }
  }

  static abstract interface d
  {
    public abstract com.bumptech.glide.c.b.b.a mn();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.g
 * JD-Core Version:    0.6.2
 */