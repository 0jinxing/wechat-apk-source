package com.tencent.mm.pluginsdk.ui.chat;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.sdk.b.a;

final class AppPanel$4$1
  implements DialogInterface.OnClickListener
{
  AppPanel$4$1(AppPanel.4 param4)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(27744);
    sz localsz = new sz();
    localsz.cPf.cPi = true;
    a.xxA.m(localsz);
    AppPanel.k(this.vmk.vmj).bNO();
    paramDialogInterface.dismiss();
    AppMethodBeat.o(27744);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.AppPanel.4.1
 * JD-Core Version:    0.6.2
 */