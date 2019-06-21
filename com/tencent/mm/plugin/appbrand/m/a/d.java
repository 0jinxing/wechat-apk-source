package com.tencent.mm.plugin.appbrand.m.a;

import com.tencent.mm.aa.g;
import com.tencent.mm.aa.i;

public abstract class d
  implements a
{
  public final String a(String paramString, c paramc)
  {
    try
    {
      i locali = new com/tencent/mm/aa/i;
      locali.<init>(paramString);
      paramString = b(locali, paramc);
      return paramString;
    }
    catch (g paramString)
    {
      while (true)
        paramString = paramc.aIU();
    }
  }

  protected abstract String b(i parami, c paramc);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.a.d
 * JD-Core Version:    0.6.2
 */