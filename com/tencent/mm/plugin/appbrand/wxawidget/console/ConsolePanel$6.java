package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ConsolePanel$6
  implements View.OnClickListener
{
  ConsolePanel$6(ConsolePanel paramConsolePanel)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(11142);
    this.jpR.jpQ = this.jpR.jpK.getText().toString();
    ConsolePanel.a(this.jpR);
    AppMethodBeat.o(11142);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.ConsolePanel.6
 * JD-Core Version:    0.6.2
 */