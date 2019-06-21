package com.tencent.mm.plugin.appbrand.game.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

final class b$1
  implements k.a
{
  b$1(b paramb)
  {
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(130065);
    ab.i("MicroMsg.FTS.FTS5SearchMiniGameLogic", "MiniGame storage change: event=%s | eventData=%s", new Object[] { paramString, paramm });
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
      AppMethodBeat.o(130065);
      while (true)
      {
        return;
        if ("batch".equals(paramString))
        {
          if ((paramm.obj == null) || (!(paramm.obj instanceof List)))
            break;
          paramString = (List)paramm.obj;
          this.hqZ.eAX.a(65601, new b.b(this.hqZ, paramString));
          AppMethodBeat.o(130065);
          continue;
        }
        paramString = new ArrayList();
        paramString.add(paramm.obj.toString());
        this.hqZ.eAX.a(65601, new b.b(this.hqZ, paramString));
        AppMethodBeat.o(130065);
        continue;
        if (!"batch".equals(paramString))
          break label261;
        if ((paramm.obj == null) || (!(paramm.obj instanceof List)))
          break;
        paramString = (List)paramm.obj;
        this.hqZ.eAX.a(65601, new b.a(this.hqZ, paramString));
        AppMethodBeat.o(130065);
      }
      label261: paramString = new ArrayList();
      paramString.add(paramm.obj.toString());
      this.hqZ.eAX.a(65601, new b.a(this.hqZ, paramString));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.b.b.1
 * JD-Core Version:    0.6.2
 */