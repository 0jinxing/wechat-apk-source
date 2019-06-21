package com.tencent.mm.memory;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class d<T, S>
{
  protected Queue<T> fdy = new ConcurrentLinkedQueue();
  protected S fdz;

  public d(S paramS)
  {
    this.fdz = paramS;
  }

  public final S WZ()
  {
    return this.fdz;
  }

  public final T pop()
  {
    return this.fdy.poll();
  }

  public final void put(T paramT)
  {
    this.fdy.add(paramT);
  }

  public final int size()
  {
    return this.fdy.size();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.d
 * JD-Core Version:    0.6.2
 */