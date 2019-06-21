package com.tencent.mm.plugin.appbrand.ipc;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class AppBrandProcessProxyUI$4
  implements DialogInterface.OnKeyListener
{
  AppBrandProcessProxyUI$4(AppBrandProcessProxyUI paramAppBrandProcessProxyUI, String paramString)
  {
  }

  public final boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(73127);
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 1))
    {
      if (!bo.isNullOrNil(this.hvh))
      {
        AppBrandProcessProxyUI.b(this.hvi).onClick(AppBrandProcessProxyUI.a(this.hvi), -3);
        paramDialogInterface.dismiss();
      }
      this.hvi.a(null);
    }
    AppMethodBeat.o(73127);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.4
 * JD-Core Version:    0.6.2
 */