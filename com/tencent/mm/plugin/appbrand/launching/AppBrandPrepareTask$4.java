package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class AppBrandPrepareTask$4
  implements Runnable
{
  AppBrandPrepareTask$4(AppBrandPrepareTask paramAppBrandPrepareTask, WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131735);
    ab.i("MicroMsg.AppBrandPrepareTask", "runInClientProcess, prepare done, appPkg [%d | %s]", new Object[] { Integer.valueOf(this.ifY.gVu), bo.mx(this.ifY.gVv) });
    AppMethodBeat.o(131735);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask.4
 * JD-Core Version:    0.6.2
 */