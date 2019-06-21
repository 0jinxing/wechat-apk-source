package com.tencent.mm.plugin.remittance.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.model.v;
import com.tencent.mm.plugin.report.service.h;

final class RemittanceBaseUI$16
  implements View.OnClickListener
{
  RemittanceBaseUI$16(RemittanceBaseUI paramRemittanceBaseUI, v paramv)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44840);
    this.pRX.a(this.pRY.cBT, this.pRX.edV, this.pRX.pRx, this.pRY);
    if (this.pRX.gOW == 1)
    {
      h.pYm.e(12689, new Object[] { Integer.valueOf(12), Integer.valueOf(1) });
      AppMethodBeat.o(44840);
    }
    while (true)
    {
      return;
      h.pYm.e(12689, new Object[] { Integer.valueOf(3), Integer.valueOf(1) });
      AppMethodBeat.o(44840);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.16
 * JD-Core Version:    0.6.2
 */