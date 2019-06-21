package com.tencent.mm.plugin.account.ui;

import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RegSetInfoUI$31$1
  implements Runnable
{
  RegSetInfoUI$31$1(RegSetInfoUI.31 param31)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(125536);
    RegSetInfoUI.a(this.gHU.gHM).clearFocus();
    RegSetInfoUI.a(this.gHU.gHM).requestFocus();
    AppMethodBeat.o(125536);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.31.1
 * JD-Core Version:    0.6.2
 */