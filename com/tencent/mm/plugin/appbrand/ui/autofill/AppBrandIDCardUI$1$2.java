package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class AppBrandIDCardUI$1$2
  implements DialogInterface.OnClickListener
{
  AppBrandIDCardUI$1$2(AppBrandIDCardUI.1 param1, int paramInt, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(133216);
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("intent_err_code", bo.g(Integer.valueOf(this.crd), 0));
    paramDialogInterface.putExtra("intent_err_msg", bo.nullAsNil(this.ftO));
    this.iKk.iKj.setResult(1, paramDialogInterface);
    this.iKk.iKj.finish();
    AppMethodBeat.o(133216);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI.1.2
 * JD-Core Version:    0.6.2
 */