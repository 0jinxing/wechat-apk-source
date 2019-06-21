package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.plugin.appbrand.h.t;
import com.tencent.mm.plugin.appbrand.jsapi.l;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.sdk.platformtools.ah;

public final class d extends s
  implements m
{
  private volatile l ikr;

  public final void M(int paramInt, String paramString)
  {
    AppMethodBeat.i(132120);
    ((j)super.getRuntime()).ikA.a(this, paramInt, paramString);
    AppMethodBeat.o(132120);
  }

  public final int a(i parami, int paramInt)
  {
    return paramInt;
  }

  public final l aCc()
  {
    AppMethodBeat.i(132118);
    l locall = new l(this);
    this.ikr = locall;
    AppMethodBeat.o(132118);
    return locall;
  }

  public final l aHR()
  {
    return this.ikr;
  }

  public final i aua()
  {
    AppMethodBeat.i(132119);
    ah.getContext();
    i locali = t.oU(WxaCommLibRuntimeReader.avQ().gVu);
    AppMethodBeat.o(132119);
    return locali;
  }

  public final void wO()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.d
 * JD-Core Version:    0.6.2
 */