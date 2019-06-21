package com.tencent.mm.plugin.remittance.ui;

import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.a;

final class RemittanceBaseUI$4
  implements a
{
  RemittanceBaseUI$4(RemittanceBaseUI paramRemittanceBaseUI)
  {
  }

  public final void ic(boolean paramBoolean)
  {
    AppMethodBeat.i(44828);
    if (paramBoolean)
    {
      RemittanceBaseUI.a(this.pRX, this.pRX.nsk, this.pRX.gHn);
      AppMethodBeat.o(44828);
    }
    while (true)
    {
      return;
      this.pRX.nsk.scrollTo(0, 0);
      AppMethodBeat.o(44828);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.4
 * JD-Core Version:    0.6.2
 */