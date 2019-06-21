package com.tencent.mm.plugin.brandservice.ui.timeline.preload.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.c.a;
import com.tencent.mm.vending.g.b;
import java.util.Map;

final class c$1$2
  implements a<String, Void>
{
  c$1$2(c.1 param1, boolean paramBoolean, String paramString, Map paramMap)
  {
  }

  private String aXF()
  {
    AppMethodBeat.i(14411);
    Object localObject1;
    if (!this.jTW)
    {
      ab.i("MicroMsg.Preload.TmplDownloader", "not do getA8Key, return");
      localObject1 = this.val$downloadUrl;
      AppMethodBeat.o(14411);
    }
    while (true)
    {
      return localObject1;
      Object localObject2 = com.tencent.mm.vending.g.f.dMo();
      localObject1 = new h(this.val$downloadUrl, "", 0, 8, (int)System.currentTimeMillis(), new byte[0]);
      localObject2 = new c.1.2.1(this, (h)localObject1, (b)localObject2);
      g.Rg().a(233, (com.tencent.mm.ai.f)localObject2);
      g.Rg().a((m)localObject1, 0);
      localObject1 = "";
      AppMethodBeat.o(14411);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.c.1.2
 * JD-Core Version:    0.6.2
 */