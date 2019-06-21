package com.tencent.mm.plugin.fingerprint.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.wallet.a;
import com.tencent.mm.sdk.platformtools.ab;

final class FingerPrintAuthTransparentUI$11
  implements a
{
  FingerPrintAuthTransparentUI$11(FingerPrintAuthTransparentUI paramFingerPrintAuthTransparentUI)
  {
  }

  public final void aC(int paramInt, String paramString)
  {
    AppMethodBeat.i(41607);
    this.msC.fE(false);
    if (paramInt == 0)
    {
      ab.i("MicroMsg.FingerPrintAuthTransparentUI", "cert ready and do openFP");
      FingerPrintAuthTransparentUI.d(this.msC);
      FingerPrintAuthTransparentUI.a(this.msC, false);
      AppMethodBeat.o(41607);
    }
    while (true)
    {
      return;
      FingerPrintAuthTransparentUI.a(this.msC, this.msC.getString(2131297636));
      AppMethodBeat.o(41607);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI.11
 * JD-Core Version:    0.6.2
 */