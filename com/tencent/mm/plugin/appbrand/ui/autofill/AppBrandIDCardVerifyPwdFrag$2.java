package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.d;

final class AppBrandIDCardVerifyPwdFrag$2
  implements View.OnClickListener
{
  AppBrandIDCardVerifyPwdFrag$2(AppBrandIDCardVerifyPwdFrag paramAppBrandIDCardVerifyPwdFrag)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(133252);
    if (AppBrandIDCardVerifyPwdFrag.a(this.iKp) != null)
      AppBrandIDCardVerifyPwdFrag.a(this.iKp).aMG();
    paramView = new d(this.iKp.getContext(), 1, false);
    paramView.rBl = new AppBrandIDCardVerifyPwdFrag.2.1(this);
    paramView.rBm = new AppBrandIDCardVerifyPwdFrag.2.2(this);
    paramView.cpD();
    AppMethodBeat.o(133252);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag.2
 * JD-Core Version:    0.6.2
 */