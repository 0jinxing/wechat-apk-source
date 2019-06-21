package com.tencent.mm.pluginsdk.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MultiSelectContactView$1
  implements TextWatcher
{
  MultiSelectContactView$1(MultiSelectContactView paramMultiSelectContactView)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(105158);
    MultiSelectContactView.a(this.vii);
    if (MultiSelectContactView.b(this.vii) != null)
      MultiSelectContactView.b(this.vii).Qa(paramCharSequence.toString());
    AppMethodBeat.o(105158);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.MultiSelectContactView.1
 * JD-Core Version:    0.6.2
 */