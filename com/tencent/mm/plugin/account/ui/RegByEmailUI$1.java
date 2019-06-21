package com.tencent.mm.plugin.account.ui;

import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RegByEmailUI$1
  implements Runnable
{
  RegByEmailUI$1(RegByEmailUI paramRegByEmailUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(125301);
    RegByEmailUI.a(this.gFF).requestFocus();
    AppMethodBeat.o(125301);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByEmailUI.1
 * JD-Core Version:    0.6.2
 */