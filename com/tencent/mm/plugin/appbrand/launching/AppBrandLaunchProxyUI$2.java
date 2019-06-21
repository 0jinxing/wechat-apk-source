package com.tencent.mm.plugin.appbrand.launching;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandLaunchProxyUI$2
  implements DialogInterface.OnDismissListener
{
  AppBrandLaunchProxyUI$2(AppBrandLaunchProxyUI paramAppBrandLaunchProxyUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(131705);
    if (!this.ifF.isFinishing())
      this.ifF.finish();
    AppMethodBeat.o(131705);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI.2
 * JD-Core Version:    0.6.2
 */