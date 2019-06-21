package com.tencent.mm.vending.b;

import com.tencent.mm.vending.h.d;
import com.tencent.mm.vending.h.f;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class c<_Callback> extends a<_Callback>
{
  public c()
  {
  }

  public c(d paramd)
  {
    super(paramd);
  }

  private void b(com.tencent.mm.vending.j.a parama)
  {
    Iterator localIterator = dMg().iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if (localb != null)
      {
        if (localb.zXD != null)
          this.zXB.c(localb.zXD);
        while (true)
        {
          this.zXB.a(new c.1(this, localb, parama), com.tencent.mm.vending.c.a.zXH, true);
          break;
          this.zXB.c(d.dMq());
        }
      }
    }
  }

  public final void a(com.tencent.mm.vending.j.a parama)
  {
    try
    {
      b(parama);
      return;
    }
    finally
    {
      parama = finally;
    }
    throw parama;
  }

  public abstract void a(_Callback param_Callback, com.tencent.mm.vending.j.a parama);

  public final b<_Callback> aD(_Callback param_Callback)
  {
    return a(new b(param_Callback, this));
  }

  public final void aDt()
  {
    try
    {
      b(null);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void remove(_Callback param_Callback)
  {
    b(new b(param_Callback, this));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.b.c
 * JD-Core Version:    0.6.2
 */