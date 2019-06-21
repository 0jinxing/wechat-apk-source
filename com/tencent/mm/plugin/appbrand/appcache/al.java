package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.a.a;
import java.util.Locale;

final class al extends a
{
  final int gTP;
  final int gTQ;
  final az.a gTR;

  al(String paramString1, int paramInt1, int paramInt2, String paramString2, az.a parama)
  {
    super(t(paramString1, paramInt1, paramInt2), ap.avY() + String.format(Locale.US, "_%s_%d_%d.wxapkg.diff", new Object[] { Integer.valueOf(paramString1.hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), paramString2, paramString1, 0, paramInt2);
    AppMethodBeat.i(59478);
    this.gTP = paramInt1;
    this.gTQ = paramInt2;
    this.gTR = parama;
    if (!"@LibraryAppId".equals(paramString1))
      bool = true;
    this.gVz = bool;
    AppMethodBeat.o(59478);
  }

  static String t(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(59477);
    paramString = String.format(Locale.US, "WxaPkgDiff_%s_%d_%d", new Object[] { Integer.valueOf(paramString.hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(59477);
    return paramString;
  }

  public final String avR()
  {
    AppMethodBeat.i(59479);
    String str = aq.aq(this.appId, this.gTQ);
    AppMethodBeat.o(59479);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.al
 * JD-Core Version:    0.6.2
 */