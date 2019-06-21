package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.model.i;
import com.tencent.mm.protocal.protobuf.bzp;
import com.tencent.mm.protocal.protobuf.lv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class RemittanceBusiUI$17
  implements DialogInterface.OnClickListener
{
  RemittanceBusiUI$17(RemittanceBusiUI paramRemittanceBusiUI, i parami)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(44908);
    ab.i("MicroMsg.RemittanceBusiUI", "goto h5: %s", new Object[] { this.pUh.pOT.vPB.kCs });
    e.n(this.pUd.mController.ylL, this.pUh.pOT.vPB.kCs, false);
    AppMethodBeat.o(44908);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI.17
 * JD-Core Version:    0.6.2
 */