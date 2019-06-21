package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.storage.z;

final class FindMContactIntroUI$5
  implements DialogInterface.OnClickListener
{
  FindMContactIntroUI$5(FindMContactIntroUI paramFindMContactIntroUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13601);
    g.RP().Ry().set(12322, Boolean.TRUE);
    com.tencent.mm.plugin.b.a.wA("R200_100");
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("mobile_input_purpose", 4);
    paramDialogInterface.putExtra("regsetinfo_ticket", FindMContactIntroUI.c(this.gsU));
    paramDialogInterface.putExtra("regsetinfo_NextStep", FindMContactIntroUI.d(this.gsU));
    paramDialogInterface.putExtra("regsetinfo_NextStyle", FindMContactIntroUI.e(this.gsU));
    com.tencent.mm.plugin.account.a.a.gkE.a(this.gsU, paramDialogInterface);
    com.tencent.mm.plugin.b.a.wA("R300_300_phone");
    paramDialogInterface = new StringBuilder();
    g.RN();
    paramDialogInterface = paramDialogInterface.append(com.tencent.mm.kernel.a.Rb()).append(",").append(this.gsU.getClass().getName()).append(",R300_200_phone,");
    g.RN();
    com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("R300_200_phone") + ",2");
    AppMethodBeat.o(13601);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI.5
 * JD-Core Version:    0.6.2
 */