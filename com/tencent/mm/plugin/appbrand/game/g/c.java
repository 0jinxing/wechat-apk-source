package com.tencent.mm.plugin.appbrand.game.g;

import android.support.v4.f.k.a;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class c<T>
  implements k.a<T>
{
  public ConcurrentLinkedQueue<T> hup = new ConcurrentLinkedQueue();

  public final T aA()
  {
    Object localObject1 = this.hup.poll();
    Object localObject2 = localObject1;
    if (localObject1 == null)
      localObject2 = aAJ();
    return localObject2;
  }

  protected abstract T aAJ();

  public final boolean release(T paramT)
  {
    return this.hup.offer(paramT);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.g.c
 * JD-Core Version:    0.6.2
 */