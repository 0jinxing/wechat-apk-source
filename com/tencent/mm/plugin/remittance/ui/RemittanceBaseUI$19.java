package com.tencent.mm.plugin.remittance.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class RemittanceBaseUI$19
  implements c.a
{
  RemittanceBaseUI$19(RemittanceBaseUI paramRemittanceBaseUI)
  {
  }

  public final void VS(String paramString)
  {
    AppMethodBeat.i(44844);
    ab.i("MicroMsg.RemittanceBaseUI", "onDialogClick  %s", new Object[] { paramString });
    this.pRX.pRE = paramString;
    this.pRX.cfL();
    AppMethodBeat.o(44844);
  }

  public final void onCancel()
  {
    this.pRX.pRE = "";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.19
 * JD-Core Version:    0.6.2
 */