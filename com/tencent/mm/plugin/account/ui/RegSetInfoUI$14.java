package com.tencent.mm.plugin.account.ui;

import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RegSetInfoUI$14
  implements Runnable
{
  RegSetInfoUI$14(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(125520);
    RegSetInfoUI.a(this.gHM).clearFocus();
    RegSetInfoUI.a(this.gHM).requestFocus();
    AppMethodBeat.o(125520);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.14
 * JD-Core Version:    0.6.2
 */