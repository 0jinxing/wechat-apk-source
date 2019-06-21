package com.tencent.mm.plugin.remittance.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class RemittanceBaseUI$12 extends s
{
  RemittanceBaseUI$12(RemittanceBaseUI paramRemittanceBaseUI)
  {
  }

  public final void bgW()
  {
    AppMethodBeat.i(44836);
    if (this.pRX.pQY == 33)
    {
      this.pRX.a(this.pRX.eeO, RemittanceBaseUI.a(this.pRX), this.pRX.mName, this.pRX.pdC, this.pRX.pRs, this.pRX.pRu, "", null);
      if (RemittanceBaseUI.b(this.pRX) == 0.0D)
      {
        if (this.pRX.gOW != 1)
          break label309;
        h.pYm.e(12689, new Object[] { Integer.valueOf(15), Integer.valueOf(1) });
      }
    }
    while (true)
    {
      if ((this.pRX.gOW == 1) && (!bo.isNullOrNil(this.pRX.eeO)))
        h.pYm.e(14074, new Object[] { Integer.valueOf(2) });
      AppMethodBeat.o(44836);
      return;
      this.pRX.pQV = bo.getDouble(this.pRX.kGa.getText(), 0.0D);
      if (!this.pRX.kGa.asa())
      {
        t.makeText(this.pRX.mController.ylL, 2131304579, 0).show();
        break;
      }
      if (this.pRX.pQV < 0.01D)
      {
        this.pRX.cfC();
        break;
      }
      this.pRX.aoB();
      RemittanceBaseUI.cfO();
      this.pRX.a(this.pRX.eeO, RemittanceBaseUI.a(this.pRX), this.pRX.mName, this.pRX.pdC, this.pRX.pRs, null, "", null);
      break;
      label309: h.pYm.e(12689, new Object[] { Integer.valueOf(6), Integer.valueOf(1) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.12
 * JD-Core Version:    0.6.2
 */