package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.l;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.Closeable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class u
  implements Closeable
{
  private final WxaPkgWrappingInfo gTr;
  private final Map<String, ao> gTs;

  u(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    AppMethodBeat.i(86796);
    this.gTs = new HashMap();
    this.gTr = paramWxaPkgWrappingInfo;
    this.gTr.awr();
    AppMethodBeat.o(86796);
  }

  private ao xr(String paramString)
  {
    AppMethodBeat.i(86799);
    while (true)
    {
      ao localao;
      synchronized (this.gTs)
      {
        localao = (ao)this.gTs.get(paramString);
        if (localao != null)
        {
          paramString = localao;
          if (paramString != null)
            paramString.avW();
          AppMethodBeat.o(86799);
          return paramString;
        }
        if ("__APP__".equals(paramString))
        {
          localObject = this.gTr.gSP;
          label68: if (!bo.isNullOrNil((String)localObject))
            break label149;
          paramString = localao;
        }
      }
      Iterator localIterator = this.gTr.gVx.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          localObject = (ModulePkgInfo)localIterator.next();
          if (paramString.equals(((ModulePkgInfo)localObject).name))
          {
            localObject = ((ModulePkgInfo)localObject).gSP;
            break label68;
            label149: localao = new com/tencent/mm/plugin/appbrand/appcache/ao;
            localao.<init>((String)localObject);
            this.gTs.put(paramString, localao);
            paramString = localao;
            break;
          }
        }
      Object localObject = null;
    }
  }

  final void avK()
  {
    AppMethodBeat.i(86798);
    synchronized (this.gTs)
    {
      xr("__APP__");
      Iterator localIterator = this.gTr.gVx.iterator();
      if (localIterator.hasNext())
        xr(((ModulePkgInfo)localIterator.next()).name);
    }
    AppMethodBeat.o(86798);
  }

  public final void close()
  {
    AppMethodBeat.i(86800);
    synchronized (this.gTs)
    {
      Collection localCollection = this.gTs.values();
      ??? = localCollection.iterator();
      if (((Iterator)???).hasNext())
        ((ao)((Iterator)???).next()).close();
    }
    AppMethodBeat.o(86800);
  }

  final ao findAppropriateModuleInfo(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(86797);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(86797);
      paramString = (String)localObject;
      return paramString;
    }
    paramString = l.yk(paramString);
    Iterator localIterator = this.gTr.gVx.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      localObject = (ModulePkgInfo)localIterator.next();
    }
    while (!paramString.startsWith(((ModulePkgInfo)localObject).name));
    for (paramString = ((ModulePkgInfo)localObject).name; ; paramString = null)
    {
      localObject = paramString;
      if (bo.isNullOrNil(paramString))
        localObject = "__APP__";
      paramString = xr((String)localObject);
      AppMethodBeat.o(86797);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.u
 * JD-Core Version:    0.6.2
 */