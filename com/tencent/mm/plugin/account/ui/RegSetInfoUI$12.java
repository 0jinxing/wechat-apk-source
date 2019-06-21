package com.tencent.mm.plugin.account.ui;

import android.widget.EditText;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RegSetInfoUI$12
  implements Runnable
{
  RegSetInfoUI$12(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(125518);
    RegSetInfoUI.i(this.gHM).requestFocus();
    RegSetInfoUI.b(this.gHM).clearFocus();
    AppMethodBeat.o(125518);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.12
 * JD-Core Version:    0.6.2
 */