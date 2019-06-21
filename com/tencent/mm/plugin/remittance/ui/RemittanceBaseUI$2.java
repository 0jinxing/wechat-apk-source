package com.tencent.mm.plugin.remittance.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RemittanceBaseUI$2
  implements View.OnClickListener
{
  RemittanceBaseUI$2(RemittanceBaseUI paramRemittanceBaseUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44826);
    this.pRX.aoB();
    RemittanceBaseUI.cfO();
    AppMethodBeat.o(44826);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.2
 * JD-Core Version:    0.6.2
 */