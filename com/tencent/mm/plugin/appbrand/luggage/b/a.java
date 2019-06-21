package com.tencent.mm.plugin.appbrand.luggage.b;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appstorage.o;
import java.io.InputStream;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/luggage/customize/CustomizeCommLibReaderWrapper;", "Lcom/tencent/mm/plugin/appbrand/appstorage/ICommLibReader;", "()V", "info", "Lcom/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo;", "init", "", "openRead", "Ljava/io/InputStream;", "fileName", "", "versionBuildInfo", "versionName", "plugin-appbrand-integration_release"})
public final class a
  implements o
{
  public static final a ikd;

  static
  {
    AppMethodBeat.i(134723);
    ikd = new a();
    AppMethodBeat.o(134723);
  }

  public final String avk()
  {
    AppMethodBeat.i(134721);
    String str = WxaCommLibRuntimeReader.avP().avk();
    j.o(str, "WxaCommLibRuntimeReader.getReader().versionName()");
    AppMethodBeat.o(134721);
    return str;
  }

  public final String avl()
  {
    AppMethodBeat.i(134722);
    String str = WxaCommLibRuntimeReader.avP().avl();
    j.o(str, "WxaCommLibRuntimeReader.…ader().versionBuildInfo()");
    AppMethodBeat.o(134722);
    return str;
  }

  public final WxaPkgWrappingInfo avm()
  {
    AppMethodBeat.i(134720);
    WxaPkgWrappingInfo localWxaPkgWrappingInfo = WxaCommLibRuntimeReader.avP().avm();
    j.o(localWxaPkgWrappingInfo, "WxaCommLibRuntimeReader.getReader().info()");
    AppMethodBeat.o(134720);
    return localWxaPkgWrappingInfo;
  }

  public final void init()
  {
  }

  public final InputStream openRead(String paramString)
  {
    AppMethodBeat.i(134719);
    paramString = WxaCommLibRuntimeReader.avP().openRead(paramString);
    AppMethodBeat.o(134719);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.b.a
 * JD-Core Version:    0.6.2
 */