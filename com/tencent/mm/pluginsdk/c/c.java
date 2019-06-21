package com.tencent.mm.pluginsdk.c;

import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.kp;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public abstract class c<T extends b> extends com.tencent.mm.sdk.b.c<T>
  implements f
{
  private static HashMap<b, c<? extends b>> fBy = new HashMap();
  private static HashMap<m, b> vaL = new HashMap();
  private int vaK = 0;

  public static void k(b paramb)
  {
    Iterator localIterator = vaL.entrySet().iterator();
    Map.Entry localEntry;
    do
    {
      if (!localIterator.hasNext())
        break;
      localEntry = (Map.Entry)localIterator.next();
    }
    while (localEntry.getValue() != paramb);
    for (paramb = (m)localEntry.getKey(); ; paramb = null)
    {
      if (paramb != null)
      {
        g.Rg().c(paramb);
        vaL.remove(paramb);
      }
      return;
    }
  }

  public abstract int Jy();

  public abstract b a(int paramInt, m paramm, T paramT);

  public abstract m b(T paramT);

  public final void bIW()
  {
    if (this.vaK == 0);
    while (true)
    {
      return;
      this.vaK -= 1;
      if (this.vaK == 0)
        g.Rg().b(Jy(), this);
    }
  }

  public final void dgW()
  {
    if (this.vaK == 0)
      g.Rg().a(Jy(), this);
    this.vaK += 1;
  }

  public final void l(T paramT)
  {
    m localm = b(paramT);
    g.Rg().a(localm, 0);
    vaL.put(localm, paramT);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    b localb;
    if (Jy() == paramm.getType())
    {
      localb = (b)vaL.remove(paramm);
      if (localb != null)
        break label31;
    }
    while (true)
    {
      return;
      label31: kp localkp = new kp();
      localkp.cGw.cGx = a(paramInt2, paramm, localb);
      localkp.cGw.errType = paramInt1;
      localkp.cGw.errCode = paramInt2;
      localkp.cGw.aIm = paramString;
      a.xxA.m(localkp);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.c.c
 * JD-Core Version:    0.6.2
 */