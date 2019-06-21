package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ConsolePanel$8
  implements View.OnClickListener
{
  ConsolePanel$8(ConsolePanel paramConsolePanel)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(11144);
    int i = 0;
    if (i < this.jpR.jpL.length)
    {
      Button localButton = this.jpR.jpL[i];
      if (localButton == paramView);
      for (boolean bool = true; ; bool = false)
      {
        localButton.setSelected(bool);
        if ((bool) && (this.jpR.jpP != i))
        {
          this.jpR.jpP = i;
          ConsolePanel.a(this.jpR);
        }
        i++;
        break;
      }
    }
    AppMethodBeat.o(11144);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.ConsolePanel.8
 * JD-Core Version:    0.6.2
 */