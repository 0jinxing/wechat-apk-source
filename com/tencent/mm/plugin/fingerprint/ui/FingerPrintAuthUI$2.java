package com.tencent.mm.plugin.fingerprint.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.g;

final class FingerPrintAuthUI$2
  implements Runnable
{
  FingerPrintAuthUI$2(FingerPrintAuthUI paramFingerPrintAuthUI, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(41633);
    if (this.msJ)
    {
      FingerPrintAuthUI.a(this.msI, g.b(this.msI, false, null));
      AppMethodBeat.o(41633);
    }
    while (true)
    {
      return;
      if ((FingerPrintAuthUI.d(this.msI) != null) && (FingerPrintAuthUI.d(this.msI).isShowing()))
      {
        FingerPrintAuthUI.d(this.msI).dismiss();
        FingerPrintAuthUI.a(this.msI, null);
      }
      AppMethodBeat.o(41633);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI.2
 * JD-Core Version:    0.6.2
 */