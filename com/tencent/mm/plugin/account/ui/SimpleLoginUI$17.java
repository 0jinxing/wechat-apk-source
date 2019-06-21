package com.tencent.mm.plugin.account.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SimpleLoginUI$17
  implements View.OnKeyListener
{
  SimpleLoginUI$17(SimpleLoginUI paramSimpleLoginUI)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125613);
    boolean bool;
    if ((66 == paramInt) && (paramKeyEvent.getAction() == 0))
    {
      SimpleLoginUI.b(this.gIp);
      bool = true;
      AppMethodBeat.o(125613);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(125613);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.SimpleLoginUI.17
 * JD-Core Version:    0.6.2
 */