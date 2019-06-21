package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.launching.ae;
import com.tencent.mm.plugin.appbrand.launching.o;
import com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import org.xwalk.core.XWalkEnvironment;

final class a$2
  implements Runnable
{
  a$2(a parama, Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132049);
    a.2.1 local1 = new a.2.1(this);
    AppBrandLaunchProxyUI localAppBrandLaunchProxyUI = (AppBrandLaunchProxyUI)this.ijF.getBaseContext();
    if (com.tencent.mm.sdk.platformtools.g.dnY())
    {
      ab.i("MicroMsg.AppBrand.PreLaunchCheckForXWEB", "check xweb download, gp version, just return");
      local1.aHx();
      AppMethodBeat.o(132049);
    }
    while (true)
    {
      return;
      int i = XWalkEnvironment.getInstalledNewstVersion(ah.getContext());
      if (i > 400)
      {
        ab.i("MicroMsg.AppBrand.PreLaunchCheckForXWEB", "have available version , no need check");
        local1.onReady();
        AppMethodBeat.o(132049);
      }
      else
      {
        long l = com.tencent.mm.kernel.g.RP().Ry().a(ac.a.xOA, 0L);
        if (Math.abs(bo.anT() - l) < 7200L)
        {
          ab.i("MicroMsg.AppBrand.PreLaunchCheckForXWEB", "check xweb download, not exceed interval, just return");
          local1.aHx();
          AppMethodBeat.o(132049);
        }
        else
        {
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xOA, Long.valueOf(bo.anT()));
          l = bo.anU();
          ab.d("MicroMsg.AppBrand.PreLaunchCheckForXWEB", "check xweb download, cost = %d, xweb core ver = %d", new Object[] { Long.valueOf(bo.anU() - l), Integer.valueOf(i) });
          if ((localAppBrandLaunchProxyUI == null) || (!localAppBrandLaunchProxyUI.aHa()))
          {
            local1.aHx();
            AppMethodBeat.o(132049);
          }
          else
          {
            localAppBrandLaunchProxyUI.a(local1, new Intent().setClass(localAppBrandLaunchProxyUI.getBaseContext(), AppBrandXWebDownloadProxyUI.class).putExtra("intent_extra_download_ignore_network_type", true), local1.requestCode);
            AppMethodBeat.o(132049);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.precondition.a.2
 * JD-Core Version:    0.6.2
 */