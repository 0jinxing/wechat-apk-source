package com.tencent.mm.plugin.appbrand.j;

import com.tencent.luggage.sdk.b.b;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.aw;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;

final class h$3$1
  implements Runnable
{
  h$3$1(h.3 param3, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(102154);
    int i;
    if ((!bo.isNullOrNil(this.inX)) && ((!this.inY.inV) || (this.inY.inU.aIz())))
    {
      i = 1;
      if (i != 0)
      {
        if (!"__APP__".equals(this.inY.gPZ))
          break label230;
        this.inY.inU.inR.xZ().hhd.gSP = this.inX;
        label113: break label253;
      }
    }
    label303: 
    while (true)
    {
      try
      {
        this.inY.inU.inR.xZ().hhd.cvZ = g.b(e.openRead(this.inX), 4096);
        aw.p(this.inY.inU.inR);
        this.inY.inU.CD(this.inY.gPZ);
        al.d(new h.3.1.1(this));
        h localh = this.inY.inU;
        localObject1 = this.inY.gPZ;
        if (i == 0)
          break label303;
        a.d locald = a.d.inH;
        h.a(localh, (String)localObject1, locald);
        AppMethodBeat.o(102154);
        return;
        i = 0;
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        ab.e("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loaded __APP__, appId = %s, pkg not found", new Object[] { this.inY.inU.inR.mAppId });
        continue;
      }
      label230: Object localObject1 = this.inY.inU.inR.xZ().hhd.gVx.iterator();
      label253: if (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (ModulePkgInfo)((Iterator)localObject1).next();
        if (!this.inY.gPZ.equals(((ModulePkgInfo)localObject2).name))
          break label113;
        ((ModulePkgInfo)localObject2).gSP = this.inX;
        continue;
        localObject2 = a.d.inI;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.j.h.3.1
 * JD-Core Version:    0.6.2
 */