package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.gc;
import com.tencent.mm.ui.base.h;

final class AppBrandIDCardVerifyPwdFrag$3
  implements View.OnClickListener
{
  AppBrandIDCardVerifyPwdFrag$3(AppBrandIDCardVerifyPwdFrag paramAppBrandIDCardVerifyPwdFrag)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(133255);
    h.a(this.iKp.getContext(), this.iKp.getString(2131296674) + AppBrandIDCardVerifyPwdFrag.d(this.iKp).vIe, this.iKp.getString(2131296669), this.iKp.getString(2131296994), this.iKp.getString(2131296868), false, new AppBrandIDCardVerifyPwdFrag.3.1(this), new AppBrandIDCardVerifyPwdFrag.3.2(this));
    AppMethodBeat.o(133255);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag.3
 * JD-Core Version:    0.6.2
 */