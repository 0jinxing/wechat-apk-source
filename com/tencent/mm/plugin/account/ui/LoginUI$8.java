package com.tencent.mm.plugin.account.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LoginUI$8
  implements View.OnKeyListener
{
  LoginUI$8(LoginUI paramLoginUI)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125033);
    boolean bool;
    if ((66 == paramInt) && (paramKeyEvent.getAction() == 0))
    {
      LoginUI.e(this.gDe);
      bool = true;
      AppMethodBeat.o(125033);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(125033);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginUI.8
 * JD-Core Version:    0.6.2
 */