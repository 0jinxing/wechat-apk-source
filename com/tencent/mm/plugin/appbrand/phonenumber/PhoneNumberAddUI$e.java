package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class PhoneNumberAddUI$e
  implements View.OnClickListener
{
  PhoneNumberAddUI$e(PhoneNumberAddUI paramPhoneNumberAddUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(134822);
    PhoneNumberAddUI localPhoneNumberAddUI = this.ixX;
    paramView = this.ixX.ixR;
    if (paramView != null);
    for (paramView = paramView.getText(); ; paramView = null)
    {
      localPhoneNumberAddUI.iN(String.valueOf(paramView));
      if (!bo.isNullOrNil(this.ixX.cFl))
        PhoneNumberAddUI.b(this.ixX);
      AppMethodBeat.o(134822);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberAddUI.e
 * JD-Core Version:    0.6.2
 */