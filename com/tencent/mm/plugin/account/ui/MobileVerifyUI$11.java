package com.tencent.mm.plugin.account.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MobileVerifyUI$11
  implements View.OnKeyListener
{
  MobileVerifyUI$11(MobileVerifyUI paramMobileVerifyUI)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125278);
    boolean bool;
    if ((66 == paramInt) && (paramKeyEvent.getAction() == 0))
    {
      MobileVerifyUI.e(this.gFn);
      bool = true;
      AppMethodBeat.o(125278);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(125278);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileVerifyUI.11
 * JD-Core Version:    0.6.2
 */