package com.tencent.mm.plugin.account.ui;

import android.view.KeyEvent;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RegByEmailUI$10
  implements TextView.OnEditorActionListener
{
  RegByEmailUI$10(RegByEmailUI paramRegByEmailUI)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(125310);
    if ((paramInt == 6) || (paramInt == 5))
      if (!RegByEmailUI.d(this.gFF).isChecked())
        AppMethodBeat.o(125310);
    while (true)
    {
      return bool;
      RegByEmailUI.c(this.gFF);
      bool = true;
      AppMethodBeat.o(125310);
      continue;
      AppMethodBeat.o(125310);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByEmailUI.10
 * JD-Core Version:    0.6.2
 */