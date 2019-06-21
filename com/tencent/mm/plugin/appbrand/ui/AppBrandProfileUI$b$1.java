package com.tencent.mm.plugin.appbrand.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.model.r;
import com.tencent.mm.protocal.protobuf.cxk;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

final class AppBrandProfileUI$b$1
  implements Runnable
{
  AppBrandProfileUI$b$1(AppBrandProfileUI.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133051);
    AppBrandProfileUI localAppBrandProfileUI;
    boolean bool;
    if ((this.iIp.iIm != null) && (this.iIp.iIm.get() != null))
    {
      localAppBrandProfileUI = (AppBrandProfileUI)this.iIp.iIm.get();
      if (AppBrandProfileUI.i(localAppBrandProfileUI))
      {
        AppBrandProfileUI.j(localAppBrandProfileUI).removeFirst();
        AppBrandProfileUI.k(localAppBrandProfileUI);
        if (AppBrandProfileUI.i(localAppBrandProfileUI))
          break label147;
        bool = true;
        label71: AppBrandProfileUI.a(localAppBrandProfileUI, bool);
        AppBrandProfileUI.m(localAppBrandProfileUI);
        if (!AppBrandProfileUI.n(localAppBrandProfileUI))
          break label152;
        AppBrandProfileUI.a(localAppBrandProfileUI, 17, 1);
        AppMethodBeat.o(133051);
      }
    }
    while (true)
    {
      return;
      cxk localcxk = new cxk();
      localcxk.xsL = true;
      localcxk.nSa = b.pX(r.Yz());
      localcxk.nickname = r.YB();
      AppBrandProfileUI.j(localAppBrandProfileUI).addFirst(localcxk);
      AppBrandProfileUI.l(localAppBrandProfileUI);
      break;
      label147: bool = false;
      break label71;
      label152: AppBrandProfileUI.a(localAppBrandProfileUI, 18, 1);
      AppMethodBeat.o(133051);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.b.1
 * JD-Core Version:    0.6.2
 */