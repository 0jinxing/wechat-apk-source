package com.bumptech.glide.h.a;

import android.support.v4.f.k.a;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$b<T>
  implements k.a<T>
{
  private final k.a<T> aAr;
  private final a.a<T> aIj;
  private final a.d<T> aIk;

  a$b(k.a<T> parama, a.a<T> parama1, a.d<T> paramd)
  {
    this.aAr = parama;
    this.aIj = parama1;
    this.aIk = paramd;
  }

  public final T aA()
  {
    AppMethodBeat.i(92618);
    Object localObject1 = this.aAr.aA();
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject1 = this.aIj.mG();
      localObject2 = localObject1;
      if (Log.isLoggable("FactoryPools", 2))
      {
        new StringBuilder("Created new ").append(localObject1.getClass());
        localObject2 = localObject1;
      }
    }
    if ((localObject2 instanceof a.c))
      ((a.c)localObject2).my().ay(false);
    AppMethodBeat.o(92618);
    return localObject2;
  }

  public final boolean release(T paramT)
  {
    AppMethodBeat.i(92619);
    if ((paramT instanceof a.c))
      ((a.c)paramT).my().ay(true);
    this.aIk.reset(paramT);
    boolean bool = this.aAr.release(paramT);
    AppMethodBeat.o(92619);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.h.a.a.b
 * JD-Core Version:    0.6.2
 */