package com.tencent.mm.plugin.remittance.ui;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$1
  implements Runnable
{
  c$1(c paramc, EditText paramEditText)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(44814);
    this.pQK.requestFocus();
    ((InputMethodManager)this.pQL.mContext.getSystemService("input_method")).showSoftInput(this.pQK, 0);
    AppMethodBeat.o(44814);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.c.1
 * JD-Core Version:    0.6.2
 */