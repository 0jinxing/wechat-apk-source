package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ConsolePanel$4
  implements View.OnKeyListener
{
  ConsolePanel$4(ConsolePanel paramConsolePanel)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(11140);
    boolean bool;
    if (paramInt == 66)
    {
      this.jpR.jpQ = this.jpR.jpK.getText().toString();
      ConsolePanel.a(this.jpR);
      f.cX(paramView);
      bool = true;
      AppMethodBeat.o(11140);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(11140);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.ConsolePanel.4
 * JD-Core Version:    0.6.2
 */