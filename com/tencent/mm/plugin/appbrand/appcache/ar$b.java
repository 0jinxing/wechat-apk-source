package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.y;
import java.io.Closeable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

final class ar$b
  implements Closeable
{
  private final u gUF;
  private final Map<ao, y> gUG;

  private ar$b(u paramu)
  {
    AppMethodBeat.i(86802);
    this.gUG = new HashMap();
    this.gUF = paramu;
    AppMethodBeat.o(86802);
  }

  final Collection<y> awi()
  {
    AppMethodBeat.i(86803);
    synchronized (this.gUG)
    {
      Collection localCollection = this.gUG.values();
      AppMethodBeat.o(86803);
      return localCollection;
    }
  }

  public final void close()
  {
    AppMethodBeat.i(86805);
    synchronized (this.gUG)
    {
      this.gUG.clear();
      if (this.gUF != null)
        this.gUF.close();
      AppMethodBeat.o(86805);
      return;
    }
  }

  final y xA(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(86804);
    if (this.gUF == null)
    {
      AppMethodBeat.o(86804);
      paramString = (String)localObject;
    }
    while (true)
    {
      return paramString;
      ao localao = this.gUF.findAppropriateModuleInfo(paramString);
      if (localao == null)
      {
        AppMethodBeat.o(86804);
        paramString = (String)localObject;
        continue;
      }
      synchronized (this.gUG)
      {
        localObject = (y)this.gUG.get(localao);
        paramString = (String)localObject;
        if (localObject == null)
        {
          localObject = this.gUG;
          paramString = new com/tencent/mm/plugin/appbrand/appstorage/y;
          paramString.<init>(localao);
          ((Map)localObject).put(localao, paramString);
        }
        AppMethodBeat.o(86804);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.ar.b
 * JD-Core Version:    0.6.2
 */