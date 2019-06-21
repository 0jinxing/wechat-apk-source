package com.tencent.mm.plugin.appbrand.phonenumber;

import a.f.b.j;
import a.l;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.be;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"})
final class PhoneNumberProxyUI$h
  implements DialogInterface.OnDismissListener
{
  PhoneNumberProxyUI$h(PhoneNumberProxyUI paramPhoneNumberProxyUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(134876);
    be localbe = this.iyQ.ixV;
    if (localbe != null)
    {
      paramDialogInterface = this.iyQ.ixV;
      if (paramDialogInterface == null)
        break label70;
    }
    label70: for (paramDialogInterface = Long.valueOf(paramDialogInterface.GA()); ; paramDialogInterface = null)
    {
      if (paramDialogInterface == null)
        j.dWJ();
      localbe.cQ(paramDialogInterface.longValue() + 1L);
      PhoneNumberProxyUI.a(this.iyQ, "user cancel");
      AppMethodBeat.o(134876);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberProxyUI.h
 * JD-Core Version:    0.6.2
 */