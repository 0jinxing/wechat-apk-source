package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"})
final class m$h
  implements DialogInterface.OnClickListener
{
  m$h(m paramm)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(134910);
    paramDialogInterface.dismiss();
    ab.e("MicroMsg.PhoneNumberVerifyCodeDialog", "verify code is error, do send the right code");
    m.g(this.izd);
    AppMethodBeat.o(134910);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.m.h
 * JD-Core Version:    0.6.2
 */