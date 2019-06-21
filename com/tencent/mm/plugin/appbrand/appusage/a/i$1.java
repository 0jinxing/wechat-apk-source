package com.tencent.mm.plugin.appbrand.appusage.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ipcinvoker.wx_extension.b;
import com.tencent.mm.plugin.appbrand.report.AppBrandRecommendStatObj;

final class i$1
  implements Runnable
{
  i$1(int paramInt, long paramLong1, long paramLong2, AppBrandRecommendStatObj paramAppBrandRecommendStatObj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(129754);
    if (this.hbP == 1)
    {
      b.a(i.a(this.hbP, this.hbQ, this.hbR, this.hbS).acD(), new i.1.1(this));
      AppMethodBeat.o(129754);
    }
    while (true)
    {
      return;
      new i.1.2(this, this.hbP, this.hbQ, this.hbR, this.hbS).acy();
      AppMethodBeat.o(129754);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.a.i.1
 * JD-Core Version:    0.6.2
 */