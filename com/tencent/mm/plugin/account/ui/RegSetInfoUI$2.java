package com.tencent.mm.plugin.account.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RegSetInfoUI$2
  implements View.OnKeyListener
{
  RegSetInfoUI$2(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125508);
    boolean bool;
    if ((66 == paramInt) && (paramKeyEvent.getAction() == 0))
    {
      RegSetInfoUI.p(this.gHM);
      bool = true;
      AppMethodBeat.o(125508);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(125508);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.2
 * JD-Core Version:    0.6.2
 */