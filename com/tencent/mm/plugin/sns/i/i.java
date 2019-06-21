package com.tencent.mm.plugin.sns.i;

import com.tencent.mm.modelsns.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.Vector;

public abstract class i
{
  private Vector<b> qTq = new Vector();

  public final b b(b paramb)
  {
    this.qTq.add(paramb);
    return paramb;
  }

  public final boolean c(b paramb)
  {
    Iterator localIterator = this.qTq.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if (localb.fQi == paramb.fQi)
        this.qTq.remove(localb);
    }
    for (boolean bool = true; ; bool = false)
    {
      this.qTq.add(paramb);
      return bool;
    }
  }

  public final b co(Object paramObject)
  {
    if (paramObject == null)
      paramObject = null;
    while (true)
    {
      return paramObject;
      try
      {
        Iterator localIterator = this.qTq.iterator();
        while (localIterator.hasNext())
        {
          b localb = (b)localIterator.next();
          if (paramObject.equals(localb.fQg))
          {
            this.qTq.remove(localb);
            paramObject = localb;
          }
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.Ss_log_base_helper", "report by key " + localException.getMessage() + " " + paramObject);
        paramObject = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.i.i
 * JD-Core Version:    0.6.2
 */