package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.model.i;
import com.tencent.mm.protocal.protobuf.lv;

final class RemittanceBusiUI$16
  implements DialogInterface.OnClickListener
{
  RemittanceBusiUI$16(RemittanceBusiUI paramRemittanceBusiUI, i parami)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(44907);
    RemittanceBusiUI.E(this.pUd);
    RemittanceBusiUI.a(this.pUd, 2, this.pUh.pOT.vFb);
    AppMethodBeat.o(44907);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI.16
 * JD-Core Version:    0.6.2
 */