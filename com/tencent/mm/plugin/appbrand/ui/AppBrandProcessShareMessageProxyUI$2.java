package com.tencent.mm.plugin.appbrand.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.i;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandProcessShareMessageProxyUI$2
  implements AppBrandProcessShareMessageProxyUI.b
{
  AppBrandProcessShareMessageProxyUI$2(AppBrandProcessShareMessageProxyUI paramAppBrandProcessShareMessageProxyUI, String paramString, View paramView)
  {
  }

  public final void e(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(133010);
    ab.i("MicroMsg.AppBrandProcessShareMessageProxyUI", "onProcessDone, result:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (AppBrandProcessShareMessageProxyUI.a(this.iHh) != null)
      AppBrandProcessShareMessageProxyUI.a(this.iHh).a(paramBoolean, paramString, paramInt);
    ((i)g.K(i.class)).a(this.hno, this.val$view);
    AppMethodBeat.o(133010);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI.2
 * JD-Core Version:    0.6.2
 */