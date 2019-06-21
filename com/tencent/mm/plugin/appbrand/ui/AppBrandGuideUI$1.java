package com.tencent.mm.plugin.appbrand.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandGuideUI$1
  implements DialogInterface.OnDismissListener
{
  AppBrandGuideUI$1(AppBrandGuideUI paramAppBrandGuideUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(132955);
    this.iGC.finish();
    AppMethodBeat.o(132955);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI.1
 * JD-Core Version:    0.6.2
 */