package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;

final class AppBrandIDCardVerifyPwdFrag$4
  implements TextWatcher
{
  AppBrandIDCardVerifyPwdFrag$4(AppBrandIDCardVerifyPwdFrag paramAppBrandIDCardVerifyPwdFrag)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(133256);
    if (AppBrandIDCardVerifyPwdFrag.e(this.iKp).getText().toString().length() > 0)
    {
      AppBrandIDCardVerifyPwdFrag.f(this.iKp).setEnabled(true);
      AppMethodBeat.o(133256);
    }
    while (true)
    {
      return;
      AppBrandIDCardVerifyPwdFrag.f(this.iKp).setEnabled(false);
      AppMethodBeat.o(133256);
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag.4
 * JD-Core Version:    0.6.2
 */