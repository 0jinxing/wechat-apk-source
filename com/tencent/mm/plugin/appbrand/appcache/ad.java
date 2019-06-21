package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public final class ad extends j<ac>
{
  public static final String[] fjY;
  final e bSd;

  static
  {
    AppMethodBeat.i(129411);
    fjY = new String[] { j.a(ac.gSs, "PkgUsageLRURecord") };
    AppMethodBeat.o(129411);
  }

  public ad(e parame)
  {
    super(parame, ac.gSs, "PkgUsageLRURecord", ac.diI);
    this.bSd = parame;
  }

  public final void am(String paramString, int paramInt)
  {
    AppMethodBeat.i(129410);
    ac localac = new ac();
    localac.field_appId = paramString;
    localac.field_type = paramInt;
    super.a(localac, ac.gSr);
    AppMethodBeat.o(129410);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.ad
 * JD-Core Version:    0.6.2
 */