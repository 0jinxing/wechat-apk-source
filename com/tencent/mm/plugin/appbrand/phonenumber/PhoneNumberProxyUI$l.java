package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"})
final class PhoneNumberProxyUI$l
  implements DialogInterface.OnClickListener
{
  PhoneNumberProxyUI$l(PhoneNumberProxyUI paramPhoneNumberProxyUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(134880);
    d.i("MicroMsg.PhoneNumberProxyUI", "cancel to bind phone number");
    paramDialogInterface.dismiss();
    PhoneNumberProxyUI.a(this.iyQ, "fail:user cancel");
    AppMethodBeat.o(134880);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberProxyUI.l
 * JD-Core Version:    0.6.2
 */