package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;

final class AppBrandIDCardVerifyPwdFrag$5
  implements View.OnClickListener
{
  AppBrandIDCardVerifyPwdFrag$5(AppBrandIDCardVerifyPwdFrag paramAppBrandIDCardVerifyPwdFrag)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(133257);
    ab.i("MicroMsg.AppBrandIDCardVerifyPwdFrag", "verify sms click");
    if (AppBrandIDCardVerifyPwdFrag.a(this.iKp) != null)
      AppBrandIDCardVerifyPwdFrag.a(this.iKp).a(AppBrandIDCardVerifyPwdFrag.e(this.iKp).getText().toString(), AppBrandIDCardVerifyPwdFrag.d(this.iKp));
    AppMethodBeat.o(133257);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag.5
 * JD-Core Version:    0.6.2
 */