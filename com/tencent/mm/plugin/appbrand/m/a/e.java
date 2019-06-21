package com.tencent.mm.plugin.appbrand.m.a;

import com.tencent.mm.plugin.appbrand.q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class e
{
  public final q gMN;
  private final e.a iqa;
  private Set<Integer> iqb = new HashSet();

  public e(e.a parama, q paramq)
  {
    this.iqa = parama;
    this.gMN = paramq;
  }

  public final void D(Map<String, Object> paramMap)
  {
    Iterator localIterator = this.iqb.iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      this.iqa.d(i, paramMap);
    }
  }

  protected abstract void aIV();

  public abstract int getType();

  public final void listen(int paramInt)
  {
    while (true)
    {
      try
      {
        int i;
        if (!this.iqb.isEmpty())
        {
          i = 1;
          this.iqb.add(Integer.valueOf(paramInt));
          if (i == 0);
        }
        else
        {
          i = 0;
          continue;
        }
      }
      finally
      {
      }
      aIV();
    }
  }

  protected abstract void removeListener();

  public final void unListen(int paramInt)
  {
    try
    {
      if (this.iqb.contains(Integer.valueOf(paramInt)))
        this.iqb.remove(Integer.valueOf(paramInt));
      if (!this.iqb.isEmpty());
      while (true)
      {
        return;
        removeListener();
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.a.e
 * JD-Core Version:    0.6.2
 */