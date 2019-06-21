package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.a.a;

class bc extends a
{
  final az.a gTR;
  final int gVu;

  public bc(String paramString1, String paramString2, int paramInt1, int paramInt2, az.a parama)
  {
    super(str1, str2 + String.format("_%d_%d.wxapkg.zstd", new Object[] { Integer.valueOf(paramString2.hashCode()), Integer.valueOf(paramInt1) }), paramString1, paramString2, paramInt1, paramInt2);
    AppMethodBeat.i(59548);
    this.gVu = paramInt1;
    this.gTR = parama;
    AppMethodBeat.o(59548);
  }

  public final String aws()
  {
    AppMethodBeat.i(59549);
    String str = aq.aq(this.appId, this.gVu);
    AppMethodBeat.o(59549);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.bc
 * JD-Core Version:    0.6.2
 */