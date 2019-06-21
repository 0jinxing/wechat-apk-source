package com.tencent.mm.pluginsdk.c;

import com.tencent.mm.g.a.jp;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;

public abstract class d
  implements k.a
{
  public int vaK = 0;

  public abstract b NJ(String paramString);

  public final void a(String paramString, m paramm)
  {
    paramm = new jp();
    paramm.cEP.cEQ = NJ(paramString);
    a.xxA.m(paramm);
  }

  public final void axy()
  {
    if (this.vaK == 0)
    {
      k localk = bCU();
      if (localk != null)
        localk.c(this);
    }
    this.vaK += 1;
  }

  public abstract k bCU();

  public final void unregister()
  {
    if (this.vaK == 0);
    while (true)
    {
      return;
      this.vaK -= 1;
      if (this.vaK == 0)
      {
        k localk = bCU();
        if (localk != null)
          localk.d(this);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.c.d
 * JD-Core Version:    0.6.2
 */