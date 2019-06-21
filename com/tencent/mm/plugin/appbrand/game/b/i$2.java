package com.tencent.mm.plugin.appbrand.game.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.mm.plugin.appbrand.game.b.a.a;
import com.tencent.mm.plugin.appbrand.game.b.a.c;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class i$2
  implements k.a
{
  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(130094);
    ab.i("MicroMsg.SearchMiniGameQueryLogic", "AppBrandUsage storage change: event=%s | eventData=%s", new Object[] { paramString, paramm });
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
      AppMethodBeat.o(130094);
      while (true)
      {
        return;
        Object localObject;
        if ("batch".equals(paramString))
        {
          if ((paramm.obj == null) || (!(paramm.obj instanceof List)))
            break;
          paramm = (List)paramm.obj;
          paramString = new ArrayList();
          paramm = paramm.iterator();
          while (paramm.hasNext())
          {
            localObject = i.Au((String)paramm.next());
            if (localObject != null)
              paramString.add(i.b((AppBrandRecentTaskInfo)localObject));
          }
          f.avb().b(paramString, true);
          AppMethodBeat.o(130094);
          continue;
        }
        paramString = i.Au(paramm.obj.toString());
        if (paramString == null)
        {
          AppMethodBeat.o(130094);
        }
        else
        {
          paramString = i.b(paramString);
          f.avb().a(paramString, true);
          AppMethodBeat.o(130094);
          continue;
          if (!"batch".equals(paramString))
            break label331;
          if ((paramm.obj == null) || (!(paramm.obj instanceof List)))
            break;
          paramm = (List)paramm.obj;
          paramString = new ArrayList();
          paramm = paramm.iterator();
          while (paramm.hasNext())
          {
            localObject = i.Au((String)paramm.next());
            if (localObject != null)
            {
              localObject = i.b((AppBrandRecentTaskInfo)localObject);
              if (localObject != null)
                paramString.add(((a)localObject).euD);
            }
          }
          f.avb().aH(paramString);
          AppMethodBeat.o(130094);
        }
      }
      label331: f.avb().ae(paramm.obj.toString(), true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.b.i.2
 * JD-Core Version:    0.6.2
 */