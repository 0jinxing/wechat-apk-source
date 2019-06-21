package com.tencent.mm.plugin.account.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MobileVerifyUI$10
  implements TextView.OnEditorActionListener
{
  MobileVerifyUI$10(MobileVerifyUI paramMobileVerifyUI)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125277);
    boolean bool;
    if ((paramInt == 6) || (paramInt == 5))
    {
      MobileVerifyUI.e(this.gFn);
      bool = true;
      AppMethodBeat.o(125277);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(125277);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileVerifyUI.10
 * JD-Core Version:    0.6.2
 */