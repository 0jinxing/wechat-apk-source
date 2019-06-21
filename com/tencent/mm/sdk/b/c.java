package com.tencent.mm.sdk.b;

import com.tencent.mm.sdk.platformtools.ListenerInstanceMonitor;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class c<T extends b>
{
  final int priority;
  protected int xxI = 0;
  private com.tencent.mm.vending.b.b<c> xxJ;

  public c()
  {
    this(0);
  }

  public c(int paramInt)
  {
    this.priority = paramInt;
  }

  public abstract boolean a(T paramT);

  public final void dead()
  {
    try
    {
      if (this.xxJ != null)
      {
        ListenerInstanceMonitor.cB((c)this.xxJ.d);
        this.xxJ.dead();
        this.xxJ = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final int dnS()
  {
    if (this.xxI == 0)
    {
      long l = System.currentTimeMillis();
      Type localType1 = getClass().getGenericSuperclass();
      Type localType2 = localType1;
      if (!(localType1 instanceof ParameterizedType))
        localType2 = getClass().getSuperclass().getGenericSuperclass();
      localType2 = ((ParameterizedType)localType2).getActualTypeArguments()[0];
      this.xxI = ((Class)localType2).getName().hashCode();
      ab.v("IListener", "genEventID, %s<%s>, useTime:%d", new Object[] { getClass().getName(), localType2, Long.valueOf(System.currentTimeMillis() - l) });
    }
    return this.xxI;
  }

  public final com.tencent.mm.vending.b.b<c> dnU()
  {
    try
    {
      if (this.xxJ == null)
      {
        ListenerInstanceMonitor.cA(this);
        this.xxJ = a.xxA.b(this);
      }
      com.tencent.mm.vending.b.b localb = this.xxJ;
      return localb;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.b.c
 * JD-Core Version:    0.6.2
 */