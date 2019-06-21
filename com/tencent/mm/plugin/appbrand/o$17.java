package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.menu.WxaMenuHelper.GetCopyPathMenuExpireTimeTask;

final class o$17
  implements Runnable
{
  o$17(o paramo)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(129003);
    AppBrandSysConfigWC localAppBrandSysConfigWC = this.gPy.atH();
    WxaMenuHelper.GetCopyPathMenuExpireTimeTask localGetCopyPathMenuExpireTimeTask = new WxaMenuHelper.GetCopyPathMenuExpireTimeTask(this.gPy.mAppId);
    AppBrandMainProcessService.b(localGetCopyPathMenuExpireTimeTask);
    localAppBrandSysConfigWC.bQN = WxaMenuHelper.GetCopyPathMenuExpireTimeTask.a(localGetCopyPathMenuExpireTimeTask);
    AppMethodBeat.o(129003);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.o.17
 * JD-Core Version:    0.6.2
 */