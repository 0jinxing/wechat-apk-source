package com.tencent.mm.plugin.account.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RegSetInfoUI$33
  implements TextView.OnEditorActionListener
{
  RegSetInfoUI$33(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125539);
    boolean bool;
    if ((paramInt == 6) || (paramInt == 5))
    {
      RegSetInfoUI.p(this.gHM);
      bool = true;
      AppMethodBeat.o(125539);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(125539);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.33
 * JD-Core Version:    0.6.2
 */