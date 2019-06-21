package com.tencent.mm.memory.a.a.a;

import com.tencent.mm.a.f.b;
import com.tencent.mm.a.f.c;
import com.tencent.mm.a.h;

public abstract class f<T, V extends c<T>>
  implements d<T, V>
{
  h<T, V> feI;
  b<T, V> feJ = null;
  f.b<T, V> feK;
  f.c<T, V> feL;
  a fem = null;

  public f(a parama, f.b<T, V> paramb, f.c<T, V> paramc)
  {
    this.fem = parama;
    this.feK = paramb;
    this.feL = paramc;
    this.feI = new h(this.fem.fer, new f.b()
    {
    }
    , new f.c()
    {
    });
    this.feJ = new b(this.fem, new b.a()
    {
    }
    , new b.b()
    {
    });
  }

  protected abstract T p(T paramT1, T paramT2);

  public final boolean q(T paramT1, T paramT2)
  {
    if ((this.feI.aj(p(paramT1, paramT2))) || (this.feJ.q(paramT1, paramT2)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int size()
  {
    return this.feI.size();
  }

  public final void trimToSize(int paramInt)
  {
    this.feI.trimToSize(paramInt);
  }

  public final boolean v(T paramT1, T paramT2)
  {
    boolean bool1 = this.feI.ak(p(paramT1, paramT2));
    boolean bool2 = this.feJ.aY(paramT1).ak(paramT2);
    if ((bool1) || (bool2));
    for (bool1 = true; ; bool1 = false)
      return bool1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.a.a.a.f
 * JD-Core Version:    0.6.2
 */