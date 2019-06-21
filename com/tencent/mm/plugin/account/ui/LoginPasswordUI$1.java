package com.tencent.mm.plugin.account.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LoginPasswordUI$1
  implements TextView.OnEditorActionListener
{
  LoginPasswordUI$1(LoginPasswordUI paramLoginPasswordUI)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(124998);
    boolean bool;
    if ((paramInt == 6) || (paramInt == 5))
    {
      this.gCJ.aqU();
      bool = true;
      AppMethodBeat.o(124998);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(124998);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginPasswordUI.1
 * JD-Core Version:    0.6.2
 */