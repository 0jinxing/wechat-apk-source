package com.tencent.mm.plugin.brandservice.ui.timeline.preload.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.h;
import com.tencent.mm.protocal.protobuf.atp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vending.g.b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class c$1$2$1
  implements f
{
  c$1$2$1(c.1.2 param2, h paramh, b paramb)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(14410);
    g.Rg().b(233, this);
    ab.i("MicroMsg.Preload.TmplDownloader", "[processTmplInfo]errType:%d, errCode:%dm errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = this.jTX.aiT();
      paramm = this.jTX.aja();
      if (!bo.ek(paramm))
      {
        paramm = paramm.iterator();
        while (paramm.hasNext())
        {
          atp localatp = (atp)paramm.next();
          if ((!bo.isNullOrNil(localatp.vMU)) && (!bo.isNullOrNil(localatp.pXM)))
            this.jTY.jTU.put(localatp.vMU, localatp.pXM);
        }
      }
      this.bQV.B(new Object[] { paramString });
      AppMethodBeat.o(14410);
    }
    while (true)
    {
      return;
      this.bQV.B(new Object[] { "" });
      AppMethodBeat.o(14410);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.c.1.2.1
 * JD-Core Version:    0.6.2
 */