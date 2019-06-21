package com.tencent.mm.plugin.remittance.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class RemittanceBaseUI$5
  implements View.OnClickListener
{
  RemittanceBaseUI$5(RemittanceBaseUI paramRemittanceBaseUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44829);
    f.a(this.pRX, this.pRX.gOW, RemittanceBaseUI.j(this.pRX), RemittanceBaseUI.b(this.pRX));
    if (this.pRX.gOW == 1)
    {
      h.pYm.e(12689, new Object[] { Integer.valueOf(13), Integer.valueOf(1) });
      AppMethodBeat.o(44829);
    }
    while (true)
    {
      return;
      h.pYm.e(12689, new Object[] { Integer.valueOf(4), Integer.valueOf(1) });
      AppMethodBeat.o(44829);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.5
 * JD-Core Version:    0.6.2
 */