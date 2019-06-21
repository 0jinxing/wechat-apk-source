package com.tencent.mm.pluginsdk.ui.chat;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.sdk.b.a;

final class AppPanel$4$3
  implements DialogInterface.OnClickListener
{
  AppPanel$4$3(AppPanel.4 param4)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(27746);
    sz localsz = new sz();
    localsz.cPf.cPi = true;
    a.xxA.m(localsz);
    AppPanel.k(this.vmk.vmj).bNP();
    paramDialogInterface.dismiss();
    AppMethodBeat.o(27746);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.AppPanel.4.3
 * JD-Core Version:    0.6.2
 */