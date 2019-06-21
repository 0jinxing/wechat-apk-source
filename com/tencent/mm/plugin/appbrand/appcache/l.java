package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.a.a;
import java.util.Locale;

public final class l extends a
{
  final int gSA;

  public l(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    this(str1, str2 + String.format(Locale.US, "%d_%d_%d.encwxapkg", new Object[] { Integer.valueOf(paramString1.hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), paramString2, paramString1, paramInt1, paramInt2);
    AppMethodBeat.i(59436);
    AppMethodBeat.o(59436);
  }

  private l(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2)
  {
    super(paramString1, paramString2, paramString3, paramString4, paramInt2, 0);
    this.gSA = paramInt1;
  }

  public final String toShortString()
  {
    AppMethodBeat.i(59437);
    String str = String.format(Locale.US, "EncryptPkgDownloadRequest[%s %d %d]", new Object[] { this.appId, Integer.valueOf(this.gSA), Integer.valueOf(this.version) });
    AppMethodBeat.o(59437);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.l
 * JD-Core Version:    0.6.2
 */