package com.tencent.mm.plugin.qqmail.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MailAddrsViewControl$1
  implements View.OnClickListener
{
  MailAddrsViewControl$1(MailAddrsViewControl paramMailAddrsViewControl)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(68337);
    this.pyG.pyz.requestFocus();
    ((InputMethodManager)this.pyG.getContext().getSystemService("input_method")).toggleSoftInput(0, 1);
    AppMethodBeat.o(68337);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl.1
 * JD-Core Version:    0.6.2
 */