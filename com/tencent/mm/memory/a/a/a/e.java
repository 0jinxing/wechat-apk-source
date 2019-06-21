package com.tencent.mm.memory.a.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.a.f.a;
import com.tencent.mm.a.f.b;
import com.tencent.mm.a.h;
import java.util.Set;

public abstract class e<T, V, X, Y>
  implements f<T, V>
{
  public f<T, X> feD = null;
  public d<T, Y> feE = null;
  public f.b<T, V> feF = null;
  protected a fey;
  public int maxSize;

  public e(int paramInt)
  {
    this.maxSize = paramInt;
    init();
  }

  public e(int paramInt, f.b<T, V> paramb, a parama)
  {
    this.feF = paramb;
    this.maxSize = paramInt;
    this.fey = parama;
    init();
  }

  public e(f.b<T, V> paramb)
  {
    this.feF = paramb;
    this.maxSize = 10;
    init();
  }

  protected abstract T Xn();

  protected f<T, X> Xo()
  {
    return new h(this.maxSize, new f.b()
    {
      public final void c(T paramAnonymousT, X paramAnonymousX1, X paramAnonymousX2)
      {
        AppMethodBeat.i(115467);
        if (e.this.feF != null)
          e.this.feF.c(paramAnonymousT, e.this.aV(paramAnonymousX1), e.this.aV(paramAnonymousX2));
        AppMethodBeat.o(115467);
      }
    });
  }

  protected d<T, Y> a(a parama)
  {
    return null;
  }

  public final void a(final f.a<T, V> parama)
  {
    this.feD.a(new f.a()
    {
    });
  }

  protected abstract V aV(X paramX);

  protected abstract X aX(V paramV);

  public V ai(T paramT)
  {
    Object localObject = aV(this.feD.ai(paramT));
    if (this.feE != null)
      this.feE.u(Xn(), paramT);
    return localObject;
  }

  public final boolean aj(T paramT)
  {
    boolean bool = this.feD.aj(paramT);
    if (this.feE != null)
      this.feE.q(Xn(), paramT);
    return bool;
  }

  public final boolean ak(T paramT)
  {
    boolean bool = this.feD.ak(paramT);
    if (this.feE != null)
      this.feE.v(Xn(), paramT);
    return bool;
  }

  public final void clear()
  {
    this.feD.clear();
  }

  public final int createCount()
  {
    return this.feD.createCount();
  }

  public final int evictionCount()
  {
    return this.feD.evictionCount();
  }

  public V get(T paramT)
  {
    Object localObject = aV(this.feD.get(paramT));
    if (this.feE != null)
      this.feE.t(Xn(), paramT);
    return localObject;
  }

  public final int hitCount()
  {
    return this.feD.hitCount();
  }

  protected void init()
  {
    this.feD = Xo();
    this.feE = a(this.fey);
  }

  public void k(T paramT, V paramV)
  {
    this.feD.k(paramT, aX(paramV));
    if (this.feE != null)
    {
      Object localObject = Xn();
      this.feE.e(localObject, paramT, o(paramT, paramV));
    }
  }

  public final Set<T> keySet()
  {
    return this.feD.keySet();
  }

  public final int maxSize()
  {
    return this.feD.maxSize();
  }

  public final int missCount()
  {
    return this.feD.missCount();
  }

  protected abstract Y o(T paramT, V paramV);

  public V put(T paramT, V paramV)
  {
    Object localObject1 = aV(this.feD.put(paramT, aX(paramV)));
    if (this.feE != null)
    {
      Object localObject2 = Xn();
      this.feE.f(localObject2, paramT, o(paramT, paramV));
    }
    return localObject1;
  }

  public final int putCount()
  {
    return this.feD.putCount();
  }

  public V remove(T paramT)
  {
    Object localObject = aV(this.feD.remove(paramT));
    if (this.feE != null)
      this.feE.s(Xn(), paramT);
    return localObject;
  }

  public final int size()
  {
    return this.feD.size();
  }

  public final int sizeOf(T paramT, V paramV)
  {
    return this.feD.sizeOf(paramT, aX(paramV));
  }

  public final void trimToSize(int paramInt)
  {
    this.feD.trimToSize(paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.a.a.a.e
 * JD-Core Version:    0.6.2
 */