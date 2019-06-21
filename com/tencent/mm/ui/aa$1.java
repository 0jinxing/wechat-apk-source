package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.ui.contact.VoipAddressUI;

final class aa$1
  implements DialogInterface.OnClickListener
{
  aa$1(aa paramaa)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29839);
    sz localsz = new sz();
    localsz.cPf.cPi = true;
    a.xxA.m(localsz);
    VoipAddressUI.hX(aa.c(this.ypL));
    paramDialogInterface.dismiss();
    AppMethodBeat.o(29839);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.aa.1
 * JD-Core Version:    0.6.2
 */