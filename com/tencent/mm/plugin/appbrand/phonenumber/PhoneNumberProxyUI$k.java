package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"})
final class PhoneNumberProxyUI$k
  implements DialogInterface.OnClickListener
{
  PhoneNumberProxyUI$k(PhoneNumberProxyUI paramPhoneNumberProxyUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(134879);
    d.i("MicroMsg.PhoneNumberProxyUI", "confirm bind phone number");
    PhoneNumberProxyUI.d(this.iyQ);
    AppMethodBeat.o(134879);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberProxyUI.k
 * JD-Core Version:    0.6.2
 */