package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$8
  implements Runnable
{
  a$8(Context paramContext, EditText paramEditText)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47861);
    ((InputMethodManager)this.val$context.getSystemService("input_method")).showSoftInput(this.tMX, 2);
    AppMethodBeat.o(47861);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.a.8
 * JD-Core Version:    0.6.2
 */