package com.tencent.mm.plugin.account.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LoginPasswordUI$2
  implements View.OnKeyListener
{
  LoginPasswordUI$2(LoginPasswordUI paramLoginPasswordUI)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(124999);
    boolean bool;
    if ((66 == paramInt) && (paramKeyEvent.getAction() == 0))
    {
      this.gCJ.aqU();
      bool = true;
      AppMethodBeat.o(124999);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(124999);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginPasswordUI.2
 * JD-Core Version:    0.6.2
 */