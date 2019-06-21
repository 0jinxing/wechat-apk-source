package com.tencent.mm.plugin.appbrand.phonenumber;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialog$updateSendText$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "arg0", "Landroid/view/View;", "plugin-appbrand-integration_release"})
public final class m$o extends ClickableSpan
{
  public final void onClick(View paramView)
  {
    AppMethodBeat.i(134917);
    j.p(paramView, "arg0");
    ab.i("MicroMsg.PhoneNumberVerifyCodeDialog", "click the resend spanBuilder, do resend sms");
    if (this.izd.iza.ixL)
    {
      m.a(this.izd);
      AppMethodBeat.o(134917);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.PhoneNumberVerifyCodeDialog", "allow_send_sms is false, show send_verify_code_frequent error");
      paramView = this.izd;
      String str = this.izd.context.getString(2131296650);
      j.o(str, "context.getString(R.stri…end_verify_code_frequent)");
      m.b(paramView, str);
      AppMethodBeat.o(134917);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.m.o
 * JD-Core Version:    0.6.2
 */