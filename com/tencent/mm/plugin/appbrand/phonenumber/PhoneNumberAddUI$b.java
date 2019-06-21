package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;
import com.tencent.mm.ui.base.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class PhoneNumberAddUI$b
  implements View.OnClickListener
{
  PhoneNumberAddUI$b(PhoneNumberAddUI paramPhoneNumberAddUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(134817);
    PhoneNumberAddUI localPhoneNumberAddUI = this.ixX;
    paramView = this.ixX.ixR;
    if (paramView != null)
    {
      paramView = paramView.getText();
      localPhoneNumberAddUI.iN(String.valueOf(paramView));
      if (bo.isNullOrNil(this.ixX.cFl))
        break label146;
      h.d((Context)this.ixX, this.ixX.getString(2131296674) + this.ixX.cFl, this.ixX.getString(2131296669), this.ixX.getString(2131296994), this.ixX.getString(2131296868), (DialogInterface.OnClickListener)new PhoneNumberAddUI.b.1(this), (DialogInterface.OnClickListener)2.ixZ);
      AppMethodBeat.o(134817);
    }
    while (true)
    {
      return;
      paramView = null;
      break;
      label146: h.g((Context)this.ixX, 2131297140, 2131297141);
      ab.e("MicroMsg.PhoneNumberAddUI", "mobile:%s isn't phone", new Object[] { this.ixX.cFl });
      AppMethodBeat.o(134817);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberAddUI.b
 * JD-Core Version:    0.6.2
 */