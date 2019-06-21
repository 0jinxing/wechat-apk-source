package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandIDCardUI$3
  implements DialogInterface.OnCancelListener
{
  AppBrandIDCardUI$3(AppBrandIDCardUI paramAppBrandIDCardUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(133237);
    this.iKj.setResult(0);
    this.iKj.finish();
    AppMethodBeat.o(133237);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI.3
 * JD-Core Version:    0.6.2
 */