package com.tencent.mm.plugin.appbrand.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandProcessShareMessageProxyUI$5
  implements DialogInterface.OnKeyListener
{
  AppBrandProcessShareMessageProxyUI$5(AppBrandProcessShareMessageProxyUI paramAppBrandProcessShareMessageProxyUI, AppBrandProcessShareMessageProxyUI.c paramc)
  {
  }

  public final boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(133013);
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 1))
    {
      this.iHi.f(false, null, 0);
      paramDialogInterface.dismiss();
    }
    AppMethodBeat.o(133013);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI.5
 * JD-Core Version:    0.6.2
 */