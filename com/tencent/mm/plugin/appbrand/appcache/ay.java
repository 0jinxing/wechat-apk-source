package com.tencent.mm.plugin.appbrand.appcache;

import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.t.a;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appcache/WxaPkgStorageInvalidRecordFixer;", "", "()V", "TAG", "", "removeInvalidReleaseRecords", "", "plugin-appbrand-integration_release"})
public final class ay
{
  public static final ay gVo;

  static
  {
    AppMethodBeat.i(134468);
    gVo = new ay();
    AppMethodBeat.o(134468);
  }

  public static final void awp()
  {
    AppMethodBeat.i(134467);
    t.a locala = f.auK();
    if (locala != null);
    while (true)
    {
      try
      {
        locala.hY("AppBrandWxaPkgManifestRecord", "delete from AppBrandWxaPkgManifestRecord where debugType=0 and version=0");
        AppMethodBeat.o(134467);
        return;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MiroMsg.WxaPkgStorageInvalidRecordFixer", (Throwable)localException, " removeInvalidReleaseRecords", new Object[0]);
        y localy = y.AUy;
        AppMethodBeat.o(134467);
        continue;
      }
      AppMethodBeat.o(134467);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.ay
 * JD-Core Version:    0.6.2
 */