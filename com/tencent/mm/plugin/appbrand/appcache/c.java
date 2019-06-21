package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

public final class c extends a
{
  public static final c gSg;
  final WxaPkgWrappingInfo gSf;

  static
  {
    AppMethodBeat.i(114304);
    gSg = new c();
    AppMethodBeat.o(114304);
  }

  public c()
  {
    AppMethodBeat.i(114303);
    this.gSf = new WxaPkgWrappingInfo();
    this.gSf.gVw = true;
    this.gSf.gVt = 0;
    this.gSf.gVu = an.VERSION;
    this.gSf.cvZ = "";
    AppMethodBeat.o(114303);
  }

  public final WxaPkgWrappingInfo avm()
  {
    return this.gSf;
  }

  public final void init()
  {
  }

  public final InputStream openRead(String paramString)
  {
    AppMethodBeat.i(114302);
    paramString = an.openRead(paramString);
    AppMethodBeat.o(114302);
    return paramString;
  }

  public final String toString()
  {
    return "AssetReader";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.c
 * JD-Core Version:    0.6.2
 */