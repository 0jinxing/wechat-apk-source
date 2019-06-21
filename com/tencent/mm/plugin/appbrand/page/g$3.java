package com.tencent.mm.plugin.appbrand.page;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.a.f;
import com.tencent.mm.plugin.appbrand.config.a.g;
import com.tencent.mm.plugin.appbrand.widget.i.a.b;
import java.util.ArrayList;
import java.util.HashMap;

final class g$3
  implements a.b
{
  g$3(g paramg, a.f paramf)
  {
  }

  public final void Z(int paramInt, String paramString)
  {
    AppMethodBeat.i(87039);
    this.irq.getContainer().Db(paramString);
    HashMap localHashMap = new HashMap();
    localHashMap.put("pagePath", paramString);
    localHashMap.put("text", ((a.g)this.irr.cHb.get(paramInt)).text);
    localHashMap.put("index", Integer.valueOf(paramInt));
    this.irq.getCurrentPageView().b(new g.a().s(localHashMap));
    AppMethodBeat.o(87039);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.g.3
 * JD-Core Version:    0.6.2
 */