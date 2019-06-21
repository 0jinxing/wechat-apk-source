package com.tencent.mm.plugin.appbrand.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.List;

final class b$1
  implements k.a
{
  b$1(b paramb)
  {
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(129956);
    ab.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "WeApp storage change: event=%s | eventData=%s", new Object[] { paramString, paramm });
    switch (paramm.hsh)
    {
    case 4:
    default:
    case 2:
    case 3:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(129956);
      while (true)
      {
        return;
        if ("batch".equals(paramString))
        {
          if ((paramm.obj == null) || (!(paramm.obj instanceof List)))
            break;
          paramm = ((List)paramm.obj).iterator();
          while (paramm.hasNext())
          {
            paramString = (String)paramm.next();
            this.hpQ.eAX.a(65616, new b.b(this.hpQ, paramString));
          }
          AppMethodBeat.o(129956);
          continue;
        }
        this.hpQ.eAX.a(65616, new b.b(this.hpQ, paramm.obj.toString()));
        AppMethodBeat.o(129956);
        continue;
        if (!"batch".equals(paramString))
          break label299;
        if ((paramm.obj == null) || (!(paramm.obj instanceof List)))
          break;
        paramString = ((List)paramm.obj).iterator();
        while (paramString.hasNext())
        {
          paramm = (String)paramString.next();
          this.hpQ.eAX.a(65616, new b.a(this.hpQ, paramm));
        }
        AppMethodBeat.o(129956);
      }
      label299: this.hpQ.eAX.a(65616, new b.a(this.hpQ, paramm.obj.toString()));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.f.b.1
 * JD-Core Version:    0.6.2
 */