package com.tencent.mm.plugin.appbrand.report.quality;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.o;

final class a$1 extends g.c
{
  a$1(o paramo)
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(132675);
    d.i("MicroMsg.AppBrandQualitySystem", "[QualitySystem] closeSession appId = [%s] runtime.hashCode = [%d]", new Object[] { this.gQw.mAppId, Integer.valueOf(this.gQw.hashCode()) });
    a.p(this.gQw);
    AppMethodBeat.o(132675);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.quality.a.1
 * JD-Core Version:    0.6.2
 */