package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.model.v;
import com.tencent.mm.plugin.wallet_core.model.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class RemittanceBaseUI$7
  implements DialogInterface.OnClickListener
{
  RemittanceBaseUI$7(RemittanceBaseUI paramRemittanceBaseUI, v paramv)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(44832);
    ab.i("MicroMsg.RemittanceBaseUI", "goto h5: %s", new Object[] { this.pRY.cMO.kCs });
    e.n(this.pRX.mController.ylL, this.pRY.cMO.kCs, false);
    AppMethodBeat.o(44832);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.7
 * JD-Core Version:    0.6.2
 */