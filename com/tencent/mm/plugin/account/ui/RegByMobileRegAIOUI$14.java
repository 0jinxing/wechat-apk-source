package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ba;

final class RegByMobileRegAIOUI$14
  implements DialogInterface.OnClickListener
{
  RegByMobileRegAIOUI$14(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125356);
    RegByMobileRegAIOUI.u(this.gGd);
    RegByMobileRegAIOUI.w(this.gGd).daR = RegByMobileRegAIOUI.v(this.gGd);
    RegByMobileRegAIOUI.w(this.gGd).cVS = 8L;
    RegByMobileRegAIOUI.w(this.gGd).ajK();
    AppMethodBeat.o(125356);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.14
 * JD-Core Version:    0.6.2
 */