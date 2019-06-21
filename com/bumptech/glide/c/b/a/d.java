package com.bumptech.glide.c.b.a;

import com.bumptech.glide.h.j;
import java.util.Queue;

abstract class d<T extends m>
{
  private final Queue<T> aCu = j.dn(20);

  public final void a(T paramT)
  {
    if (this.aCu.size() < 20)
      this.aCu.offer(paramT);
  }

  abstract T mR();

  final T mS()
  {
    m localm1 = (m)this.aCu.poll();
    m localm2 = localm1;
    if (localm1 == null)
      localm2 = mR();
    return localm2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.a.d
 * JD-Core Version:    0.6.2
 */