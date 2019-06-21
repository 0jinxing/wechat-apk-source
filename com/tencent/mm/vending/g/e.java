package com.tencent.mm.vending.g;

import android.os.Looper;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vending.h.f;
import com.tencent.mm.vending.h.f.a;
import com.tencent.mm.vending.h.h;
import com.tencent.mm.vending.j.k;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import junit.framework.Assert;

public class e<_Var>
  implements c<_Var>
{
  private volatile boolean b;
  boolean d;
  volatile Object h;
  volatile boolean i;
  volatile Object j;
  private int m;
  private long n;
  private boolean o;
  private boolean v;
  boolean w;
  private boolean x;
  volatile d zXK;
  private Queue<b> zXL;
  private volatile com.tencent.mm.vending.h.d zXM;
  private volatile com.tencent.mm.vending.h.d zXN;
  b zXO;
  b zXP;
  private b zXQ;
  private com.tencent.mm.vending.h.d zXR;
  f zXS;
  private f.a zXT;
  List<Pair<d.a, com.tencent.mm.vending.h.d>> zXU;
  private List<Pair<d.b, com.tencent.mm.vending.h.d>> zXV;
  private Object zXW;
  Object zXX;

  public e()
  {
    AppMethodBeat.i(126034);
    this.b = false;
    this.zXK = d.zYg;
    this.d = false;
    this.zXL = new LinkedList();
    this.m = 0;
    this.n = -1L;
    this.o = false;
    this.zXQ = new c();
    this.zXT = new f.a()
    {
      public final void cT(Object paramAnonymousObject)
      {
        AppMethodBeat.i(126062);
        ((Stack)g.dMp().b.get()).pop();
        while (true)
        {
          synchronized (e.this)
          {
            e.this.zXO = e.this.zXP;
            e.this.zXP = null;
            if (!e.this.d)
            {
              e.this.h = paramAnonymousObject;
              if (e.this.zXK == e.d.zYj)
              {
                com.tencent.mm.vending.f.a.i("Vending.Pipeline", "interrupted, just return", new Object[0]);
                AppMethodBeat.o(126062);
              }
            }
            else
            {
              com.tencent.mm.vending.f.a.i("Vending.Pipeline", "gonna retry, do not store functional result.", new Object[0]);
            }
          }
          if (e.this.zXK == e.d.zYi)
          {
            com.tencent.mm.vending.f.a.i("Vending.Pipeline", "pausing, just return.", new Object[0]);
            AppMethodBeat.o(126062);
          }
          else
          {
            e.this.zXK = e.d.zYh;
            e.this.cS(e.this.a(paramAnonymousObject));
            AppMethodBeat.o(126062);
          }
        }
      }

      public final void dMl()
      {
        AppMethodBeat.i(126061);
        g localg = g.dMp();
        e locale = e.this;
        Stack localStack1 = (Stack)localg.b.get();
        Stack localStack2 = localStack1;
        if (localStack1 == null)
        {
          localStack2 = new Stack();
          localg.b.set(localStack2);
        }
        localStack2.push(locale);
        AppMethodBeat.o(126061);
      }

      public final void interrupt()
      {
        AppMethodBeat.i(126063);
        e.this.a(true);
        AppMethodBeat.o(126063);
      }
    };
    this.v = false;
    this.w = false;
    this.x = false;
    this.zXN = com.tencent.mm.vending.h.g.dMq();
    this.zXM = this.zXN;
    this.zXS = new f(this.zXN, this.zXT);
    AppMethodBeat.o(126034);
  }

  private c<_Var> D(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(126040);
    if (this.zXK != d.zYg)
    {
      AppMethodBeat.o(126040);
      return this;
    }
    this.zXK = d.zYh;
    if (paramArrayOfObject.length == 0)
      paramArrayOfObject = null;
    while (true)
    {
      this.h = paramArrayOfObject;
      cS(this.h);
      AppMethodBeat.o(126040);
      break;
      if (paramArrayOfObject.length == 1)
        paramArrayOfObject = paramArrayOfObject[0];
      else
        paramArrayOfObject = k.E(paramArrayOfObject);
    }
  }

  private <_Ret> c<_Ret> a(com.tencent.mm.vending.c.a<_Ret, _Var> parama, boolean paramBoolean)
  {
    AppMethodBeat.i(126045);
    a();
    this.zXL.add(new b(parama, this.zXM, this.n, paramBoolean));
    this.n = -1L;
    if (this.zXK == d.zYg)
      AppMethodBeat.o(126045);
    while (true)
    {
      return this;
      if (this.zXK != d.zYh)
      {
        AppMethodBeat.o(126045);
      }
      else
      {
        cS(this.h);
        AppMethodBeat.o(126045);
      }
    }
  }

  private void a()
  {
    AppMethodBeat.i(126047);
    if (this.b)
    {
      a locala = new a("This Pipeline(%s) has terminate and do not allow any next().", new Object[] { this });
      AppMethodBeat.o(126047);
      throw locala;
    }
    AppMethodBeat.o(126047);
  }

  private void a(d.b paramb, com.tencent.mm.vending.h.d paramd)
  {
    AppMethodBeat.i(126050);
    this.b = true;
    cS(this.h);
    if (this.zXV == null)
      this.zXV = new LinkedList();
    paramb = new Pair(paramb, paramd);
    if (this.v)
    {
      b(paramb, this.zXW);
      AppMethodBeat.o(126050);
    }
    while (true)
    {
      return;
      this.zXV.add(paramb);
      AppMethodBeat.o(126050);
    }
  }

  private void b(final Pair<d.b, com.tencent.mm.vending.h.d> paramPair, final Object paramObject)
  {
    AppMethodBeat.i(126049);
    final RuntimeException localRuntimeException = new RuntimeException("object is not right: ".concat(String.valueOf(paramObject)));
    new f((com.tencent.mm.vending.h.d)paramPair.second, null).a(new com.tencent.mm.vending.c.a()
    {
      private Void dMm()
      {
        AppMethodBeat.i(126058);
        try
        {
          ((d.b)paramPair.first).az(paramObject);
          Void localVoid = zXH;
          AppMethodBeat.o(126058);
          return localVoid;
        }
        catch (ClassCastException localClassCastException)
        {
          if (localRuntimeException.getCause() == null)
            localRuntimeException.initCause(localClassCastException);
          RuntimeException localRuntimeException = localRuntimeException;
          AppMethodBeat.o(126058);
          throw localRuntimeException;
        }
      }
    }
    , null, this.o);
    AppMethodBeat.o(126049);
  }

  public c<_Var> C(Object[] paramArrayOfObject)
  {
    try
    {
      AppMethodBeat.i(126039);
      paramArrayOfObject = D(paramArrayOfObject);
      AppMethodBeat.o(126039);
      return paramArrayOfObject;
    }
    finally
    {
      paramArrayOfObject = finally;
    }
    throw paramArrayOfObject;
  }

  public c<_Var> a(com.tencent.mm.vending.e.b paramb)
  {
    AppMethodBeat.i(126037);
    Assert.assertNotNull("keeper should not be null!", paramb);
    paramb.keep(this);
    AppMethodBeat.o(126037);
    return this;
  }

  public c<_Var> a(c.a<_Var> parama)
  {
    try
    {
      AppMethodBeat.i(126038);
      D(new Object[0]);
      com.tencent.mm.vending.c.a local2 = new com/tencent/mm/vending/g/e$2;
      local2.<init>(this, parama);
      a(local2, true);
      AppMethodBeat.o(126038);
      return this;
    }
    finally
    {
      parama = finally;
    }
    throw parama;
  }

  public final d<_Var> a(d.a parama)
  {
    try
    {
      AppMethodBeat.i(126051);
      com.tencent.mm.vending.h.d locald = this.zXN;
      this.b = true;
      if (this.zXU == null)
      {
        localObject = new java/util/LinkedList;
        ((LinkedList)localObject).<init>();
        this.zXU = ((List)localObject);
      }
      Object localObject = new android/util/Pair;
      ((Pair)localObject).<init>(parama, locald);
      if (this.w)
        a((Pair)localObject, this.zXX);
      while (true)
      {
        AppMethodBeat.o(126051);
        return this;
        this.zXU.add(localObject);
      }
    }
    finally
    {
    }
    throw parama;
  }

  public final d<_Var> a(d.b<_Var> paramb)
  {
    try
    {
      AppMethodBeat.i(126052);
      a(paramb, this.zXN);
      AppMethodBeat.o(126052);
      return this;
    }
    finally
    {
      paramb = finally;
    }
    throw paramb;
  }

  public final d<_Var> a(com.tencent.mm.vending.h.d paramd, d.b<_Var> paramb)
  {
    try
    {
      AppMethodBeat.i(126053);
      a(paramb, paramd);
      AppMethodBeat.o(126053);
      return this;
    }
    finally
    {
      paramd = finally;
    }
    throw paramd;
  }

  final Object a(Object paramObject)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(126055);
        if (this.d)
        {
          this.m += 1;
          com.tencent.mm.vending.f.a.i("Vending.Pipeline", "Functional %s, gonna retry %s.", new Object[] { this.zXO.zYf.toString(), Integer.valueOf(this.m) });
          ((LinkedList)this.zXL).add(0, this.zXO);
          this.d = false;
          paramObject = this.h;
          AppMethodBeat.o(126055);
          return paramObject;
        }
        if (this.i)
        {
          this.h = this.j;
          this.j = null;
          this.i = false;
          this.m = 0;
          continue;
        }
      }
      finally
      {
      }
      this.h = paramObject;
    }
  }

  final void a(final Pair<d.a, com.tencent.mm.vending.h.d> paramPair, final Object paramObject)
  {
    AppMethodBeat.i(126048);
    com.tencent.mm.vending.h.d locald = (com.tencent.mm.vending.h.d)paramPair.second;
    paramPair = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(126060);
        ((d.a)paramPair.first).bi(paramObject);
        AppMethodBeat.o(126060);
      }
    };
    if (locald == null)
    {
      com.tencent.mm.vending.f.a.e("Vending.Pipeline", "Default scheduler %s is not available!!!", new Object[] { this.zXN });
      AppMethodBeat.o(126048);
    }
    while (true)
    {
      return;
      locald.o(paramPair);
      AppMethodBeat.o(126048);
    }
  }

  public final void a(boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(126054);
      if ((this.zXK == d.zYj) || (this.zXK == d.zYk))
        AppMethodBeat.o(126054);
      while (true)
      {
        return;
        if ((paramBoolean) && (this.zXL.size() > 0))
          com.tencent.mm.vending.f.a.w("Vending.Pipeline", "Pipe is not finish and be interrupt! %s pipes did not run", new Object[] { Integer.valueOf(this.zXL.size()) });
        this.zXK = d.zYj;
        this.zXL.clear();
        this.h = null;
        if (this.zXR != null)
          this.zXR.cancel();
        AppMethodBeat.o(126054);
      }
    }
    finally
    {
    }
  }

  public c<_Var> asS(String paramString)
  {
    AppMethodBeat.i(126035);
    if (paramString == null)
    {
      Assert.assertNotNull("schedulerTypeString should not be null!", paramString);
      AppMethodBeat.o(126035);
    }
    while (true)
    {
      return this;
      this.zXM = com.tencent.mm.vending.h.g.asU(paramString);
      Assert.assertNotNull("mCurrentScheduler should not be null!", this.zXM);
      AppMethodBeat.o(126035);
    }
  }

  public c<_Var> b(com.tencent.mm.vending.h.d paramd)
  {
    AppMethodBeat.i(126036);
    if (paramd == null)
    {
      Assert.assertNotNull("scheduler should not be null!", paramd);
      AppMethodBeat.o(126036);
    }
    while (true)
    {
      return this;
      this.zXM = paramd;
      AppMethodBeat.o(126036);
    }
  }

  public <_Ret> c<_Ret> c(com.tencent.mm.vending.c.a<_Ret, _Var> parama)
  {
    try
    {
      AppMethodBeat.i(126046);
      parama = a(parama, this.o);
      AppMethodBeat.o(126046);
      return parama;
    }
    finally
    {
      parama = finally;
    }
    throw parama;
  }

  final void cS(final Object paramObject)
  {
    AppMethodBeat.i(126056);
    if (this.zXK != d.zYh)
      AppMethodBeat.o(126056);
    final com.tencent.mm.vending.c.a locala;
    long l;
    final boolean bool;
    while (true)
    {
      return;
      this.zXK = d.zXK;
      b localb = (b)this.zXL.peek();
      if (localb == null)
      {
        if (this.b)
        {
          this.zXK = d.zYk;
          this.v = true;
          this.zXW = paramObject;
          if (this.zXV != null)
          {
            paramObject = this.zXV.iterator();
            while (paramObject.hasNext())
              b((Pair)paramObject.next(), this.zXW);
            AppMethodBeat.o(126056);
          }
        }
        else
        {
          this.zXK = d.zYh;
          AppMethodBeat.o(126056);
        }
      }
      else
      {
        locala = localb.zYf;
        com.tencent.mm.vending.h.d locald = localb.zXD;
        l = localb.c;
        bool = localb.d;
        if (this.zXK == d.zYi)
        {
          com.tencent.mm.vending.f.a.i("Vending.Pipeline", "This pipeline is Pausing. We will stop dequeFunctionAndInvoke and waiting resume() call", new Object[0]);
          AppMethodBeat.o(126056);
        }
        else
        {
          this.zXP = ((b)this.zXL.poll());
          this.zXS.c(locald);
          if (l >= 0L)
            break;
          this.zXS.a(locala, paramObject, bool);
          AppMethodBeat.o(126056);
        }
      }
    }
    if (Looper.myLooper() == null);
    for (this.zXR = new com.tencent.mm.vending.h.c(); ; this.zXR = new h(Looper.myLooper(), Looper.myLooper().toString()))
    {
      this.zXR.l(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(126068);
          e.this.zXS.a(locala, paramObject, bool);
          AppMethodBeat.o(126068);
        }
      }
      , l);
      AppMethodBeat.o(126056);
      break;
    }
  }

  public <_Ret> c<_Ret> d(com.tencent.mm.vending.c.a<_Ret, _Var> parama)
  {
    AppMethodBeat.i(126043);
    parama = asS("Vending.LOGIC").c(parama);
    AppMethodBeat.o(126043);
    return parama;
  }

  public final b dMj()
  {
    return this.zXQ;
  }

  public final d<_Var> dMk()
  {
    try
    {
      this.b = true;
      return this;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void dead()
  {
    AppMethodBeat.i(126041);
    a(true);
    AppMethodBeat.o(126041);
  }

  public <_Ret> c<_Ret> e(com.tencent.mm.vending.c.a<_Ret, _Var> parama)
  {
    AppMethodBeat.i(126044);
    parama = asS("Vending.HEAVY_WORK").c(parama);
    AppMethodBeat.o(126044);
    return parama;
  }

  public <_Ret> c<_Ret> f(com.tencent.mm.vending.c.a<_Ret, _Var> parama)
  {
    AppMethodBeat.i(126042);
    parama = asS("Vending.UI").c(parama);
    AppMethodBeat.o(126042);
    return parama;
  }

  public c<_Var> ny(long paramLong)
  {
    try
    {
      this.n = paramLong;
      return this;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public c<_Var> rg(boolean paramBoolean)
  {
    try
    {
      this.o = paramBoolean;
      return this;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static final class a extends Error
  {
    public a(String paramString, Object[] paramArrayOfObject)
    {
      super();
      AppMethodBeat.i(126013);
      AppMethodBeat.o(126013);
    }
  }

  static final class b
  {
    public long c;
    public boolean d;
    public com.tencent.mm.vending.h.d zXD;
    public com.tencent.mm.vending.c.a zYf;

    public b(com.tencent.mm.vending.c.a parama, com.tencent.mm.vending.h.d paramd, long paramLong, boolean paramBoolean)
    {
      this.zYf = parama;
      this.zXD = paramd;
      this.c = paramLong;
      this.d = paramBoolean;
    }
  }

  final class c
    implements b
  {
    c()
    {
    }

    public final void B(Object[] paramArrayOfObject)
    {
      AppMethodBeat.i(126066);
      synchronized (e.this)
      {
        if (e.this.zXK != e.d.zYi)
        {
          com.tencent.mm.vending.f.a.i("Vending.Pipeline", "state is not pausing %s, skip this wormhole", new Object[] { e.this.zXK });
          AppMethodBeat.o(126066);
          return;
        }
        e locale2 = e.this;
        if (paramArrayOfObject.length == 0);
        for (paramArrayOfObject = null; ; paramArrayOfObject = paramArrayOfObject[0])
        {
          locale2.j = paramArrayOfObject;
          e.this.i = true;
          com.tencent.mm.vending.f.a.i("Vending.Pipeline", "pipline(%s) wormhole().", new Object[] { e.this });
          resume();
          AppMethodBeat.o(126066);
          break;
          if (paramArrayOfObject.length != 1)
            break label124;
        }
        label124: paramArrayOfObject = k.E(paramArrayOfObject);
      }
    }

    public final void cR(Object paramObject)
    {
      AppMethodBeat.i(126064);
      while (true)
      {
        synchronized (e.this)
        {
          if (e.this.zXK == e.d.zYj)
          {
            com.tencent.mm.vending.f.a.i("Vending.Pipeline", "interrupted, skip this interrupt.", new Object[0]);
            AppMethodBeat.o(126064);
            return;
          }
          if ((!e.a(e.this)) && (e.this.zXK != e.d.zYi))
          {
            com.tencent.mm.vending.f.a.i("Vending.Pipeline", "interrupt not in func scope or pending, skip this retryOrInterrupt.", new Object[0]);
            AppMethodBeat.o(126064);
            continue;
          }
          com.tencent.mm.vending.f.a.i("Vending.Pipeline", "interrupt Pipeline(%s)", new Object[] { e.this });
          e.this.a(false);
          e.this.w = true;
          e.this.zXX = paramObject;
          if (e.this.zXU != null)
          {
            Iterator localIterator = e.this.zXU.iterator();
            if (localIterator.hasNext())
            {
              Pair localPair = (Pair)localIterator.next();
              e.this.a(localPair, paramObject);
            }
          }
        }
        AppMethodBeat.o(126064);
      }
    }

    public final void dMi()
    {
      AppMethodBeat.i(126065);
      while (true)
      {
        synchronized (e.this)
        {
          synchronized (e.this)
          {
            if ((e.this.zXK == e.d.zYj) || (e.this.zXK == e.d.zYg))
            {
              com.tencent.mm.vending.f.a.w("Vending.Pipeline", "current is state(%s), ignore pause.", new Object[] { e.this.zXK });
              AppMethodBeat.o(126065);
              return;
            }
            if (!e.a(e.this))
              com.tencent.mm.vending.f.a.e("Vending.Pipeline", "you are using mario().pause() out of a functional scope on %s!", new Object[] { e.this });
          }
        }
        if (!e.b(e.this))
          com.tencent.mm.vending.f.a.e("Vending.Pipeline", "you are using mario().pause() out of calling thread on %s!", new Object[] { e.this });
        else
          e.this.zXK = e.d.zYi;
      }
    }

    public final void resume()
    {
      AppMethodBeat.i(126067);
      synchronized (e.this)
      {
        if (e.this.zXK != e.d.zYi)
        {
          com.tencent.mm.vending.f.a.e("Vending.Pipeline", "this Pipeline(%s) is not pausing! why call resume?", new Object[] { e.this });
          AppMethodBeat.o(126067);
        }
        while (true)
        {
          return;
          if (e.a(e.this))
            break;
          e.this.zXK = e.d.zYh;
          if (!e.b(e.this))
            e.this.cS(e.this.a(e.this.h));
          AppMethodBeat.o(126067);
        }
        e.this.zXK = e.d.zXK;
      }
    }
  }

  static enum d
  {
    static
    {
      AppMethodBeat.i(126016);
      zYg = new d("Idle", 0);
      zYh = new d("Resolved", 1);
      zXK = new d("Invoking", 2);
      zYi = new d("Pausing", 3);
      zYj = new d("Interrupted", 4);
      zYk = new d("AllDone", 5);
      zYl = new d[] { zYg, zYh, zXK, zYi, zYj, zYk };
      AppMethodBeat.o(126016);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.g.e
 * JD-Core Version:    0.6.2
 */