package com.tencent.mm.plugin.appbrand.launching;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandLaunchProxyUI$1
  implements DialogInterface.OnCancelListener
{
  AppBrandLaunchProxyUI$1(AppBrandLaunchProxyUI paramAppBrandLaunchProxyUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(131704);
    this.ifF.finish();
    AppMethodBeat.o(131704);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI.1
 * JD-Core Version:    0.6.2
 */