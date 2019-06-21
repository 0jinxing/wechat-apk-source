package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandIDCardVerifyPwdFrag$1
  implements View.OnClickListener
{
  AppBrandIDCardVerifyPwdFrag$1(AppBrandIDCardVerifyPwdFrag paramAppBrandIDCardVerifyPwdFrag)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(133249);
    if (AppBrandIDCardVerifyPwdFrag.a(this.iKp) != null)
      AppBrandIDCardVerifyPwdFrag.a(this.iKp).back();
    AppMethodBeat.o(133249);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag.1
 * JD-Core Version:    0.6.2
 */