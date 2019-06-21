package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;

final class RegByMobileRegAIOUI$13
  implements DialogInterface.OnClickListener
{
  RegByMobileRegAIOUI$13(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125355);
    paramDialogInterface = new StringBuilder();
    g.RN();
    paramDialogInterface = paramDialogInterface.append(com.tencent.mm.kernel.a.Rb()).append(",").append(this.gGd.getClass().getName()).append(",RE200_200,");
    g.RN();
    com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("RE200_200") + ",2");
    com.tencent.mm.plugin.b.a.wA("RE200_100");
    AppMethodBeat.o(125355);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.13
 * JD-Core Version:    0.6.2
 */