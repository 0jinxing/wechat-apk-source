package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.model.i;
import com.tencent.mm.protocal.protobuf.lv;

final class RemittanceBusiUI$15
  implements DialogInterface.OnClickListener
{
  RemittanceBusiUI$15(RemittanceBusiUI paramRemittanceBusiUI, i parami)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(44906);
    RemittanceBusiUI.a(this.pUd, 3, this.pUh.pOT.vFb);
    if (!RemittanceBusiUI.a(this.pUd, this.pUh))
    {
      RemittanceBusiUI.b(this.pUd, this.pUh);
      AppMethodBeat.o(44906);
    }
    while (true)
    {
      return;
      RemittanceBusiUI.E(this.pUd);
      AppMethodBeat.o(44906);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI.15
 * JD-Core Version:    0.6.2
 */