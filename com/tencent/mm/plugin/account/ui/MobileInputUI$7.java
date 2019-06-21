package com.tencent.mm.plugin.account.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MobileInputUI$7
  implements TextView.OnEditorActionListener
{
  MobileInputUI$7(MobileInputUI paramMobileInputUI)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125167);
    boolean bool;
    if ((paramInt == 6) || (paramInt == 5))
    {
      bool = MobileInputUI.e(this.gDZ);
      AppMethodBeat.o(125167);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(125167);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileInputUI.7
 * JD-Core Version:    0.6.2
 */