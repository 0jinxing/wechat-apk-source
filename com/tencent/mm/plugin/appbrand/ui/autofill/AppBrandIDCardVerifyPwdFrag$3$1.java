package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;

final class AppBrandIDCardVerifyPwdFrag$3$1
  implements DialogInterface.OnClickListener
{
  AppBrandIDCardVerifyPwdFrag$3$1(AppBrandIDCardVerifyPwdFrag.3 param3)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(133253);
    AppBrandIDCardVerifyPwdFrag.e(this.iKr.iKp).dzH();
    ab.i("MicroMsg.AppBrandIDCardVerifyPwdFrag", "sendSms click");
    if (AppBrandIDCardVerifyPwdFrag.a(this.iKr.iKp) != null)
      AppBrandIDCardVerifyPwdFrag.a(this.iKr.iKp).a(AppBrandIDCardVerifyPwdFrag.d(this.iKr.iKp));
    AppMethodBeat.o(133253);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag.3.1
 * JD-Core Version:    0.6.2
 */