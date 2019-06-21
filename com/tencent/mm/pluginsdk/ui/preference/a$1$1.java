package com.tencent.mm.pluginsdk.ui.preference;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.f;

final class a$1$1
  implements TextWatcher
{
  a$1$1(a.1 param1, TextView paramTextView)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(28025);
    int i = f.bP(100, paramEditable.toString());
    if (this.vqp != null)
      this.vqp.setText(String.valueOf(i));
    AppMethodBeat.o(28025);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.a.1.1
 * JD-Core Version:    0.6.2
 */