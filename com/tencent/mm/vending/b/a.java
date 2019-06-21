package com.tencent.mm.vending.b;

import com.tencent.mm.vending.h.d;
import com.tencent.mm.vending.h.f;
import com.tencent.mm.vending.h.g;
import java.util.LinkedList;
import junit.framework.Assert;

public abstract class a<_Callback>
{
  private LinkedList<b> a = new LinkedList();
  protected d ceu;
  protected f zXB;

  public a()
  {
    this(g.dMq());
  }

  public a(d paramd)
  {
    Assert.assertNotNull(paramd);
    this.ceu = paramd;
    this.zXB = new f(paramd, null);
  }

  protected final b a(b paramb)
  {
    try
    {
      this.a.add(paramb);
      return paramb;
    }
    finally
    {
      paramb = finally;
    }
    throw paramb;
  }

  protected final void b(b paramb)
  {
    try
    {
      this.a.remove(paramb);
      return;
    }
    finally
    {
      paramb = finally;
    }
    throw paramb;
  }

  public final boolean contains(_Callback param_Callback)
  {
    try
    {
      LinkedList localLinkedList = this.a;
      b localb = new com/tencent/mm/vending/b/b;
      localb.<init>(param_Callback, this);
      boolean bool = localLinkedList.contains(localb);
      return bool;
    }
    finally
    {
      param_Callback = finally;
    }
    throw param_Callback;
  }

  public final LinkedList<b> dMf()
  {
    try
    {
      LinkedList localLinkedList = dMg();
      return localLinkedList;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected final LinkedList<b> dMg()
  {
    return new LinkedList(this.a);
  }

  public final int size()
  {
    try
    {
      int i = this.a.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.b.a
 * JD-Core Version:    0.6.2
 */