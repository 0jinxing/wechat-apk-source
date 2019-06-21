package com.tencent.mm.memory;

import com.tencent.mm.sdk.platformtools.ab;
import java.util.NavigableMap;
import java.util.Vector;
import java.util.concurrent.ConcurrentSkipListMap;

public abstract class e<T, S extends Comparable>
{
  protected NavigableMap<S, d<T, S>> fdA = new ConcurrentSkipListMap();
  private Vector<e<T, S>.a> fdB = new Vector();
  protected long fdC = 0L;

  private void fi(long paramLong)
  {
    try
    {
      this.fdC += paramLong;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void Dw()
  {
    if (this.fdB.size() > 0)
      com.tencent.mm.sdk.g.d.post(new e.1(this), "BucketPool_preload");
  }

  protected abstract long WW();

  protected abstract long WX();

  public void WY()
  {
    ab.i("MicroMsg.BucketPool", "freeAll: %s", new Object[] { getClass().getName() });
    this.fdA.clear();
    this.fdC = 0L;
  }

  public T a(S paramS)
  {
    try
    {
      d locald = (d)this.fdA.get(paramS);
      if ((locald != null) && (locald.size() > 0))
      {
        paramS = locald.pop();
        this.fdA.put(locald.WZ(), locald);
        fj(aS(paramS));
      }
      while (true)
      {
        return paramS;
        ab.d("MicroMsg.BucketPool", "BucketPool get cannot get %s size", new Object[] { paramS });
        paramS = null;
      }
    }
    finally
    {
    }
    throw paramS;
  }

  public final void a(e<T, S>.a parame)
  {
    this.fdB.add(parame);
    ab.i("MicroMsg.BucketPool", "%s addPreload: %s", new Object[] { this, parame });
    Dw();
  }

  public void aR(T paramT)
  {
    if (paramT == null);
    while (true)
    {
      return;
      Comparable localComparable;
      long l;
      try
      {
        localComparable = aT(paramT);
        l = aS(paramT);
        if (l > WX())
        {
          ab.e("MicroMsg.BucketPool", "release, reach maximum element size: %s, ignore this", new Object[] { Long.valueOf(l) });
          continue;
        }
      }
      finally
      {
      }
      if (this.fdC + l > WW())
      {
        ab.e("MicroMsg.BucketPool", "release, reach maximum size, just ignore %s %s", new Object[] { Long.valueOf(l), Long.valueOf(this.fdC) });
      }
      else
      {
        d locald1 = (d)this.fdA.get(localComparable);
        d locald2 = locald1;
        if (locald1 == null)
          locald2 = c(localComparable);
        locald2.put(paramT);
        this.fdA.put(localComparable, locald2);
        fi(l);
      }
    }
  }

  protected abstract long aS(T paramT);

  protected abstract S aT(T paramT);

  protected abstract S b(S paramS);

  protected abstract d<T, S> c(S paramS);

  protected abstract T d(S paramS);

  protected final void fj(long paramLong)
  {
    try
    {
      this.fdC -= paramLong;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public abstract class a
  {
    public a()
    {
    }

    public abstract S Xa();

    public abstract long Xb();

    public abstract int Xc();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.e
 * JD-Core Version:    0.6.2
 */