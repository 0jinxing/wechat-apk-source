package com.tencent.mm.plugin.account.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RegSetInfoUI$3
  implements TextView.OnEditorActionListener
{
  RegSetInfoUI$3(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125509);
    boolean bool;
    if ((paramInt == 6) || (paramInt == 5))
    {
      RegSetInfoUI.p(this.gHM);
      bool = true;
      AppMethodBeat.o(125509);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(125509);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.3
 * JD-Core Version:    0.6.2
 */