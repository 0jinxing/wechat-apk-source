package com.tencent.mm.plugin.fingerprint.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class FingerPrintAuthUI$4
  implements Runnable
{
  FingerPrintAuthUI$4(FingerPrintAuthUI paramFingerPrintAuthUI, String paramString, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(41636);
    h.a(this.msI, this.val$text, "", this.msI.getString(2131304829), false, new FingerPrintAuthUI.4.1(this));
    AppMethodBeat.o(41636);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI.4
 * JD-Core Version:    0.6.2
 */