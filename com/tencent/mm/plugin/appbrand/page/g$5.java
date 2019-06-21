package com.tencent.mm.plugin.appbrand.page;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.f.e;
import com.tencent.mm.sdk.platformtools.ab;

final class g$5
  implements f.e
{
  g$5(g paramg, u paramu, g.b paramb, long paramLong)
  {
  }

  public final void onReady()
  {
    AppMethodBeat.i(87041);
    this.hTv.b(this);
    this.irs.run();
    ab.i("MicroMsg.AppBrandMultiplePage", "Tab page onReady received, time: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.ecn) });
    AppMethodBeat.o(87041);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.g.5
 * JD-Core Version:    0.6.2
 */