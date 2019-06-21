package com.tencent.mm.plugin.account.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LoginIndepPass$11
  implements TextView.OnEditorActionListener
{
  LoginIndepPass$11(LoginIndepPass paramLoginIndepPass)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(124977);
    boolean bool;
    if ((paramInt == 6) || (paramInt == 5))
    {
      LoginIndepPass.a(this.gCE);
      bool = true;
      AppMethodBeat.o(124977);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(124977);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginIndepPass.11
 * JD-Core Version:    0.6.2
 */