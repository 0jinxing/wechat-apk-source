package com.tencent.mm.plugin.account.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MobileInputUI$8
  implements View.OnKeyListener
{
  MobileInputUI$8(MobileInputUI paramMobileInputUI)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125168);
    boolean bool;
    if ((66 == paramInt) && (paramKeyEvent.getAction() == 0))
    {
      bool = MobileInputUI.e(this.gDZ);
      AppMethodBeat.o(125168);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(125168);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileInputUI.8
 * JD-Core Version:    0.6.2
 */