package com.tencent.mm.pluginsdk.ui.applet;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class s$1
  implements TextWatcher
{
  s$1(s params)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(79788);
    int i = 50 - paramEditable.length();
    int j = i;
    if (i < 0)
      j = 0;
    if (this.vlo.pCu != null)
      this.vlo.pCu.setText(String.valueOf(j));
    AppMethodBeat.o(79788);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.s.1
 * JD-Core Version:    0.6.2
 */