package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public final class f extends j<h>
{
  public static final String[] fjY;
  final e bSd;

  static
  {
    AppMethodBeat.i(129326);
    fjY = new String[] { j.a(h.gSs, "CodeLibUsageLRURecord") };
    AppMethodBeat.o(129326);
  }

  public f(e parame)
  {
    super(parame, h.gSs, "CodeLibUsageLRURecord", h.diI);
    this.bSd = parame;
  }

  public final void am(String paramString, int paramInt)
  {
    AppMethodBeat.i(129325);
    h localh = new h();
    localh.field_appId = paramString;
    localh.field_version = paramInt;
    super.a(localh, h.gSr);
    AppMethodBeat.o(129325);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.f
 * JD-Core Version:    0.6.2
 */