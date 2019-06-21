package com.tencent.mm.plugin.appbrand.dynamic.j;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.b;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.plugin.appbrand.dynamic.i;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.Iterator;

public final class a$1
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(10980);
    Iterator localIterator = i.azC().azD().iterator();
    String str;
    if (localIterator.hasNext())
    {
      str = (String)localIterator.next();
      if (!b.PL().le(str))
      {
        ab.i("MicroMsg.DynamicPkgUpdater", "has not Connected RemoteService, abort clearCache");
        AppMethodBeat.o(10980);
      }
    }
    while (true)
    {
      return;
      f.a(str, null, a.b.class, null);
      break;
      AppMethodBeat.o(10980);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.j.a.1
 * JD-Core Version:    0.6.2
 */