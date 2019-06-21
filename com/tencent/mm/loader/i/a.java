package com.tencent.mm.loader.i;

import java.util.concurrent.LinkedBlockingDeque;

public final class a<E> extends LinkedBlockingDeque<E>
{
  public final boolean offer(E paramE)
  {
    return super.offerFirst(paramE);
  }

  public final E remove()
  {
    return super.removeFirst();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.i.a
 * JD-Core Version:    0.6.2
 */