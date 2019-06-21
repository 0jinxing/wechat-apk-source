package com.tencent.mm.plugin.label.ui.widget;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText;

final class InputClearablePreference$4
  implements Runnable
{
  InputClearablePreference$4(InputClearablePreference paramInputClearablePreference)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(22706);
    if (InputClearablePreference.b(this.nJo) != null)
    {
      InputMethodManager localInputMethodManager = (InputMethodManager)InputClearablePreference.b(this.nJo).getContext().getSystemService("input_method");
      InputClearablePreference.b(this.nJo).requestFocus();
      localInputMethodManager.showSoftInput(InputClearablePreference.b(this.nJo), 0);
      InputClearablePreference.b(this.nJo).setCursorVisible(false);
      InputClearablePreference.b(this.nJo).setCursorVisible(true);
    }
    AppMethodBeat.o(22706);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.widget.InputClearablePreference.4
 * JD-Core Version:    0.6.2
 */