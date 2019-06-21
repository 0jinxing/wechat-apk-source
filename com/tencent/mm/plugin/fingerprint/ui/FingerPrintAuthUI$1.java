package com.tencent.mm.plugin.fingerprint.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.wallet.a;

final class FingerPrintAuthUI$1
  implements a
{
  FingerPrintAuthUI$1(FingerPrintAuthUI paramFingerPrintAuthUI)
  {
  }

  public final void aC(int paramInt, String paramString)
  {
    AppMethodBeat.i(41632);
    this.msI.fE(false);
    if (paramInt == 0)
    {
      FingerPrintAuthUI.b(this.msI);
      if (!FingerPrintAuthUI.c(this.msI))
        break label66;
      FingerPrintAuthUI.a(this.msI, false);
      AppMethodBeat.o(41632);
    }
    while (true)
    {
      return;
      FingerPrintAuthUI.a(this.msI, this.msI.getString(2131297636), paramInt);
      label66: AppMethodBeat.o(41632);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI.1
 * JD-Core Version:    0.6.2
 */