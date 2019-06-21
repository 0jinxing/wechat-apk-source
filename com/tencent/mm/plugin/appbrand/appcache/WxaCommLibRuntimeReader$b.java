package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;
import java.util.Locale;

final class WxaCommLibRuntimeReader$b extends a
{
  private final WxaPkgWrappingInfo gSf;
  private final ao gTI;

  private WxaCommLibRuntimeReader$b(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    AppMethodBeat.i(59460);
    this.gSf = paramWxaPkgWrappingInfo;
    this.gTI = new ao(paramWxaPkgWrappingInfo.gSP);
    AppMethodBeat.o(59460);
  }

  public final WxaPkgWrappingInfo avm()
  {
    return this.gSf;
  }

  public final void init()
  {
    AppMethodBeat.i(59461);
    this.gTI.avW();
    AppMethodBeat.o(59461);
  }

  public final InputStream openRead(String paramString)
  {
    AppMethodBeat.i(59462);
    this.gTI.avW();
    paramString = this.gTI.xy(paramString);
    AppMethodBeat.o(59462);
    return paramString;
  }

  public final String toString()
  {
    AppMethodBeat.i(59463);
    String str = String.format(Locale.US, "PkgReader[%d] [%s]", new Object[] { Integer.valueOf(this.gSf.gVu), avk() });
    AppMethodBeat.o(59463);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader.b
 * JD-Core Version:    0.6.2
 */