package com.tencent.mm.vending.base;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vending.g.f;
import com.tencent.mm.vending.h.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Vending<_Struct, _Index, _Change>
  implements com.tencent.mm.vending.e.a
{
  private c a;
  HashSet<Vending<_Struct, _Index, _Change>.d> b = new HashSet();
  private Looper c;
  private Looper d;
  private Handler e;
  private Handler f;
  private AtomicBoolean g = new AtomicBoolean(false);
  private Vending.c h;
  private byte[] i = new byte[0];
  private byte[] j = new byte[0];
  private boolean k = false;
  private boolean l = false;
  private Vending.g<_Index> m = new Vending.g((byte)0);
  private volatile com.tencent.mm.vending.b.c n = new Vending.1(this, d.zYp);
  private volatile com.tencent.mm.vending.b.c o = new com.tencent.mm.vending.b.c(d.zYp)
  {
  };
  private Vending.h<_Index, i<_Struct, _Index>> p = new Vending.h();
  private boolean q = false;

  public Vending()
  {
    this(Looper.getMainLooper());
  }

  public Vending(Looper paramLooper)
  {
    this.c = paramLooper;
    this.d = com.tencent.mm.vending.i.b.dMs().a.getLooper();
    this.p.zXy = new Vending.3(this);
    this.a = new c(this.c, this.d);
    this.a.zXA = new c.a()
    {
      public final void dMc()
      {
        AppMethodBeat.i(126159);
        com.tencent.mm.vending.f.a.i("Vending", "%s beforeSynchronize", new Object[] { Vending.this });
        Vending.b(Vending.this).dMe();
        AppMethodBeat.o(126159);
      }

      public final void dMd()
      {
        AppMethodBeat.i(126161);
        com.tencent.mm.vending.f.a.i("Vending", "%s afterSynchronize", new Object[] { Vending.this });
        if (Vending.e(Vending.this) != null)
          Vending.e(Vending.this).aDt();
        AppMethodBeat.o(126161);
      }

      public final void synchronizing(int paramAnonymousInt, Object paramAnonymousObject)
      {
        AppMethodBeat.i(126160);
        com.tencent.mm.vending.f.a.i("Vending", "%s synchronizing", new Object[] { Vending.this });
        Vending.this.b.clear();
        Vending.b(Vending.this).dMe();
        Vending.c(Vending.this).removeCallbacksAndMessages(null);
        if (paramAnonymousInt == 2)
          paramAnonymousObject = Vending.this.prepareVendingDataAsynchronous();
        if ((paramAnonymousInt == 2) || (paramAnonymousInt == 1))
          Vending.this.applyChangeSynchronized(paramAnonymousObject);
        Vending.this.synchronizing(paramAnonymousInt, paramAnonymousObject);
        Vending.d(Vending.this).clear();
        AppMethodBeat.o(126160);
      }
    };
    this.e = new Vending.5(this, this.c);
    this.f = new Vending.6(this, this.d);
    this.h = new Vending.c(this.d, new Vending.7(this));
  }

  private _Struct a(_Index param_Index)
  {
    Looper localLooper = Looper.myLooper();
    if ((localLooper != this.c) && (localLooper != this.d))
      throw new IllegalAccessError("Call from wrong looper");
    if (this.g.get())
      param_Index = null;
    while (true)
    {
      return param_Index;
      i locali = getLock(param_Index);
      if (invalidIndex(param_Index))
      {
        param_Index = locali.b;
      }
      else if (localLooper == this.c)
      {
        param_Index = b(locali, param_Index).b;
      }
      else
      {
        a(locali, param_Index);
        param_Index = locali.b;
      }
    }
  }

  private void a(Vending<_Struct, _Index, _Change>.d arg1, _Index param_Index, _Struct param_Struct)
  {
    if (!this.b.contains(???));
    while (true)
    {
      return;
      i locali = getLock(param_Index);
      synchronized (locali.c)
      {
        locali.g = false;
        a(locali, param_Index, param_Struct);
        a(locali);
      }
    }
  }

  private void a(i<_Struct, _Index> parami)
  {
    if (parami.h)
      parami.h = false;
    while (true)
    {
      return;
      this.e.sendMessage(this.e.obtainMessage(1, parami));
    }
  }

  private void a(i<_Struct, _Index> parami, _Index param_Index, _Struct param_Struct)
  {
    parami.b = param_Struct;
    parami.a = param_Index;
    parami.d = false;
    parami.e = false;
    parami.f = true;
    if (this.m.zXx == parami)
      parami.h = true;
    parami.c.notify();
  }

  private void a(_Index param_Index, _Struct param_Struct)
  {
    if (this.g.get());
    while (true)
    {
      return;
      if (this.o != null)
        this.o.a(f.cV(param_Index));
    }
  }

  private void a(_Index param_Index, boolean paramBoolean)
  {
    looperCheckBoth();
    if (this.g.get());
    while (true)
    {
      return;
      i locali = getLock(param_Index);
      synchronized (locali.c)
      {
        if (locali.f)
        {
          if (paramBoolean)
            locali.d = true;
        }
        else
        {
          b(param_Index);
          continue;
        }
        locali.e = true;
      }
    }
  }

  private void a(boolean paramBoolean)
  {
    if (this.g.get());
    while (true)
    {
      return;
      if ((Looper.myLooper() != this.c) && (Looper.myLooper() != this.d))
        throw new IllegalAccessError("Call from wrong thread");
      if (paramBoolean)
      {
        this.a.s(2, null);
      }
      else
      {
        synchronized (this.j)
        {
          if (this.l)
            this.k = true;
        }
        if (Looper.myLooper() == this.d)
        {
          c();
        }
        else
        {
          this.f.removeMessages(1);
          this.f.sendMessage(this.f.obtainMessage(1));
          this.f.post(new Vending.8(this));
        }
      }
    }
  }

  private boolean a(i<_Struct, _Index> parami, _Index param_Index)
  {
    boolean bool = true;
    synchronized (parami.c)
    {
      if ((!parami.f) || (parami.d) || (parami.e))
      {
        this.q = true;
        Object localObject = resolveAsynchronous(param_Index);
        this.q = false;
        if (parami.g);
        for (bool = false; ; bool = false)
        {
          return bool;
          a(parami, param_Index, localObject);
        }
      }
    }
  }

  private i<_Struct, _Index> b(i<_Struct, _Index> parami, _Index param_Index)
  {
    if (!com.tencent.mm.vending.i.b.dMs().a.isAlive())
      com.tencent.mm.vending.f.a.e("Vending", "Vending thread is not running!", new Object[0]);
    while (true)
    {
      return parami;
      synchronized (parami.c)
      {
        boolean bool = c(parami, param_Index);
        if ((parami.f) && (!parami.d))
          break label159;
        if (bool);
      }
      this.m.zXw.a = param_Index;
      this.m.zXx = parami;
      com.tencent.mm.vending.f.a.i("Vending", "%s waiting %s", new Object[] { this, param_Index });
      long l1 = System.nanoTime();
      try
      {
        parami.c.wait();
        label123: com.tencent.mm.vending.f.a.i("Vending", "%s waiting duration %s", new Object[] { this, Long.valueOf(System.nanoTime() - l1) });
        this.m.a();
      }
      catch (InterruptedException param_Index)
      {
        label159: break label123;
      }
    }
  }

  private _Struct b(_Index param_Index)
  {
    Object localObject1 = null;
    Object localObject2;
    if (invalidIndex(param_Index))
      localObject2 = localObject1;
    while (true)
    {
      return localObject2;
      i locali = getLock(param_Index);
      localObject2 = localObject1;
      if (c(locali, param_Index))
      {
        localObject2 = localObject1;
        if (!locali.d)
          localObject2 = locali.b;
      }
    }
  }

  private void b()
  {
    if (this.m.zXw.a != null)
    {
      com.tencent.mm.vending.f.a.e("Vending", "Catch deadlock! Tell Carl! .. " + this.m.zXw.a, new Object[0]);
      if (this.m.zXx == null);
    }
    synchronized (this.m.zXx.c)
    {
      this.m.zXx.c.notify();
      this.m.a();
      return;
    }
  }

  private void c()
  {
    if (this.g.get());
    while (true)
    {
      return;
      com.tencent.mm.vending.f.a.i("Vending", "Vending.callPrepareVendingData()", new Object[0]);
      Object localObject = prepareVendingDataAsynchronous();
      this.a.s(1, localObject);
    }
  }

  private boolean c(i<_Struct, _Index> parami, _Index param_Index)
  {
    boolean bool = false;
    if (invalidIndex(param_Index));
    while (true)
    {
      return bool;
      if (this.g.get())
      {
        com.tencent.mm.vending.f.a.e("Vending", "Vending.destroyed() has called.", new Object[0]);
        continue;
      }
      Vending.c localc = this.h;
      if (!localc.zXq.get());
      synchronized (localc.b)
      {
        localc.a.put(param_Index, Vending.c.b.zXt);
        localc.e.sendMessageAtFrontOfQueue(localc.e.obtainMessage(0, param_Index));
        requestIndexImpl(parami, param_Index);
        bool = true;
      }
    }
  }

  Vending.c<_Index> a()
  {
    return this.h;
  }

  public com.tencent.mm.vending.b.b<Vending.a> addVendingDataChangedCallback(Vending.a parama)
  {
    return this.n.aD(parama);
  }

  public com.tencent.mm.vending.b.b<Vending.b> addVendingDataResolvedCallback(Vending.b paramb)
  {
    return this.o.aD(paramb);
  }

  protected abstract void applyChangeSynchronized(_Change param_Change);

  public final void dead()
  {
    looperCheckBoth();
    com.tencent.mm.vending.f.a.i("Vending", "Vending.destroy()", new Object[0]);
    this.g.set(true);
    this.f.removeCallbacksAndMessages(null);
    this.e.removeCallbacksAndMessages(null);
    this.h.zXq.set(true);
    this.h.dMe();
    this.f.sendMessage(this.f.obtainMessage(2));
  }

  protected Vending<_Struct, _Index, _Change>.d defer(_Index param_Index)
  {
    looperCheckForVending();
    if (!this.q)
    {
      com.tencent.mm.vending.f.a.w("Vending", "Please call defer in resolveAsynchronous()", new Object[0]);
      param_Index = null;
    }
    while (true)
    {
      return param_Index;
      getLock(param_Index).g = true;
      param_Index = new Vending.d(this, param_Index);
      this.b.add(param_Index);
    }
  }

  protected abstract void destroyAsynchronous();

  public void freezeDataChange()
  {
    if (this.g.get());
    while (true)
    {
      return;
      synchronized (this.j)
      {
        this.l = true;
      }
    }
  }

  public <T> T get(_Index param_Index)
  {
    return a(param_Index);
  }

  protected i<_Struct, _Index> getLock(_Index param_Index)
  {
    synchronized (this.i)
    {
      i locali1 = (i)this.p.get(param_Index);
      i locali2 = locali1;
      if (locali1 == null)
      {
        locali2 = new com/tencent/mm/vending/base/Vending$i;
        locali2.<init>();
        this.p.put(param_Index, locali2);
      }
      return locali2;
    }
  }

  public Looper getLooper()
  {
    return this.d;
  }

  protected boolean invalidIndex(_Index param_Index)
  {
    return false;
  }

  protected void loaderClear()
  {
  }

  protected void looperCheckBoth()
  {
    Looper localLooper = Looper.myLooper();
    if ((localLooper != this.c) && (localLooper != this.d))
      throw new IllegalAccessError("Call from wrong looper");
  }

  protected void looperCheckForSubscriber()
  {
    if (Looper.myLooper() != this.c)
      throw new IllegalAccessError("Call from wrong looper");
  }

  protected void looperCheckForVending()
  {
    if (Looper.myLooper() != this.d)
      throw new IllegalAccessError("Call from wrong looper");
  }

  public void notifyVendingDataChange()
  {
    a(false);
  }

  public void notifyVendingDataChangeSynchronize()
  {
    a(true);
  }

  public <T> T peek(_Index param_Index)
  {
    Object localObject1 = null;
    Object localObject2;
    if (this.g.get())
      localObject2 = localObject1;
    while (true)
    {
      return localObject2;
      localObject2 = localObject1;
      if (!invalidIndex(param_Index))
      {
        param_Index = peekLock(param_Index);
        localObject2 = localObject1;
        if (param_Index != null)
        {
          localObject2 = localObject1;
          if (!param_Index.d)
            localObject2 = param_Index.b;
        }
      }
    }
  }

  protected i<_Struct, _Index> peekLock(_Index param_Index)
  {
    synchronized (this.i)
    {
      param_Index = (i)this.p.get(param_Index);
      return param_Index;
    }
  }

  protected abstract _Change prepareVendingDataAsynchronous();

  public void removeVendingDataChangedCallback(Vending.a parama)
  {
    this.n.remove(parama);
  }

  public void removeVendingDataResolvedCallback(Vending.b paramb)
  {
    this.o.remove(paramb);
  }

  public void request(_Index param_Index)
  {
    a(param_Index, false);
  }

  public void requestConsistent(_Index param_Index)
  {
    a(param_Index, true);
  }

  protected void requestIndexImpl(i<_Struct, _Index> parami, _Index param_Index)
  {
  }

  protected abstract _Struct resolveAsynchronous(_Index param_Index);

  public void resolvedClear()
  {
    looperCheckBoth();
    if (this.g.get());
    while (true)
    {
      return;
      this.a.s(3, null);
    }
  }

  protected void synchronizing(int paramInt, Object paramObject)
  {
  }

  public void unfreezeDataChange()
  {
    if (this.g.get());
    while (true)
    {
      return;
      synchronized (this.j)
      {
        this.l = false;
        if (this.k)
        {
          notifyVendingDataChange();
          this.k = false;
        }
      }
    }
  }

  static final class i<_Struct, _Index>
  {
    _Index a;
    _Struct b;
    byte[] c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;

    i()
    {
      AppMethodBeat.i(126167);
      this.c = new byte[0];
      this.d = false;
      this.e = false;
      this.f = false;
      this.g = false;
      this.h = false;
      AppMethodBeat.o(126167);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.base.Vending
 * JD-Core Version:    0.6.2
 */