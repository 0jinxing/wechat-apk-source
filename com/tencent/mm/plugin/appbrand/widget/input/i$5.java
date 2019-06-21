package com.tencent.mm.plugin.appbrand.widget.input;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class i$5
  implements w.d
{
  i$5(i parami)
  {
  }

  public final boolean EH(String paramString)
  {
    AppMethodBeat.i(123631);
    if (this.jeg.jdV != null)
    {
      if (!"[DELETE_EMOTION]".equalsIgnoreCase(paramString))
        break label119;
      paramString = this.jeg.jdV;
      if (paramString.jfF == null)
        break label86;
      if (!bo.ac(paramString.getEditableText()))
        paramString.jfF.deleteSurroundingText(paramString.getEditableText().length(), paramString.getEditableText().length() - 1);
    }
    while (true)
    {
      AppMethodBeat.o(123631);
      return true;
      label86: paramString.dispatchKeyEvent(new KeyEvent(0, 67));
      paramString.dispatchKeyEvent(new KeyEvent(1, 67));
    }
    label119: y localy = this.jeg.jdV;
    f.aQv();
    if (localy.getEditableText() == null)
      localy.setText(paramString, TextView.BufferType.EDITABLE);
    while (true)
    {
      localy.setSelection(localy.getEditableText().length());
      break;
      localy.getEditableText().append(paramString);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.i.5
 * JD-Core Version:    0.6.2
 */