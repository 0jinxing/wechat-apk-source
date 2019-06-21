package com.tencent.luggage.bridge.impl.a;

import com.tencent.mm.plugin.appbrand.d.a.a;
import com.tencent.mm.plugin.appbrand.d.a.b;

public abstract class a
  implements a.b
{
  public void a(String paramString, a.a parama)
  {
    if (parama != null)
      parama.Q(new byte[0]);
  }

  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (!(paramObject instanceof a.b))
      bool = false;
    while (true)
    {
      return bool;
      if (wP().equalsIgnoreCase(((a.b)paramObject).wP()))
        bool = true;
      else
        bool = super.equals(paramObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.bridge.impl.a.a
 * JD-Core Version:    0.6.2
 */