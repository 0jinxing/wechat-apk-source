package com.google.firebase.components;

import com.google.firebase.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class p<T>
  implements a<T>
{
  private static final Object bvh;
  private volatile Object bvi;
  private volatile a<T> bvj;

  static
  {
    AppMethodBeat.i(10628);
    bvh = new Object();
    AppMethodBeat.o(10628);
  }

  p(d<T> paramd, b paramb)
  {
    AppMethodBeat.i(10625);
    this.bvi = bvh;
    this.bvj = new q(paramd, paramb);
    AppMethodBeat.o(10625);
  }

  public final T get()
  {
    AppMethodBeat.i(10626);
    Object localObject1 = this.bvi;
    Object localObject2 = localObject1;
    if (localObject1 == bvh);
    try
    {
      localObject1 = this.bvi;
      localObject2 = localObject1;
      if (localObject1 == bvh)
      {
        localObject2 = this.bvj.get();
        this.bvi = localObject2;
        this.bvj = null;
      }
      return localObject2;
    }
    finally
    {
      AppMethodBeat.o(10626);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.firebase.components.p
 * JD-Core Version:    0.6.2
 */