package com.tencent.mm.plugin.account.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RegSetInfoUI$4
  implements View.OnKeyListener
{
  RegSetInfoUI$4(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125510);
    boolean bool;
    if ((66 == paramInt) && (paramKeyEvent.getAction() == 0))
    {
      RegSetInfoUI.p(this.gHM);
      bool = true;
      AppMethodBeat.o(125510);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(125510);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.4
 * JD-Core Version:    0.6.2
 */