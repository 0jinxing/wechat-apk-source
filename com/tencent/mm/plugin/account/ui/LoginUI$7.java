package com.tencent.mm.plugin.account.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LoginUI$7
  implements TextView.OnEditorActionListener
{
  LoginUI$7(LoginUI paramLoginUI)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125032);
    boolean bool;
    if ((paramInt == 6) || (paramInt == 5))
    {
      LoginUI.e(this.gDe);
      bool = true;
      AppMethodBeat.o(125032);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(125032);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginUI.7
 * JD-Core Version:    0.6.2
 */