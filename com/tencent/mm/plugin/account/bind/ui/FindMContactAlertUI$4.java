package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.z;

final class FindMContactAlertUI$4
  implements DialogInterface.OnClickListener
{
  FindMContactAlertUI$4(FindMContactAlertUI paramFindMContactAlertUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13566);
    g.RP().Ry().set(12322, Boolean.FALSE);
    paramDialogInterface = new StringBuilder();
    g.RN();
    paramDialogInterface = paramDialogInterface.append(com.tencent.mm.kernel.a.Rb()).append(",").append(this.gsO.getClass().getName()).append(",R300_200_phone,");
    g.RN();
    com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("R300_200_phone") + ",2");
    FindMContactAlertUI.d(this.gsO);
    AppMethodBeat.o(13566);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI.4
 * JD-Core Version:    0.6.2
 */