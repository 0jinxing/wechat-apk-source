package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"})
final class m$j
  implements DialogInterface.OnClickListener
{
  m$j(m paramm)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(134912);
    paramDialogInterface.dismiss();
    m.c(this.izd, "fail");
    AppMethodBeat.o(134912);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.m.j
 * JD-Core Version:    0.6.2
 */