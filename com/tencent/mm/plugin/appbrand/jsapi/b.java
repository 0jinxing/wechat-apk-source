package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.compatible.loader.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import junit.framework.Assert;

public abstract class b
{
  private String hvI;

  public b()
  {
    Assert.assertTrue("Must declare NAME in subclasses", true);
  }

  public final String getName()
  {
    c localc;
    if (bo.isNullOrNil(this.hvI))
      localc = new c(this, "NAME", null);
    try
    {
      this.hvI = ((String)localc.get());
      return this.hvI;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.AppBrand.BaseJsApi", "getName exp = %s", new Object[] { bo.l(localException) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.b
 * JD-Core Version:    0.6.2
 */