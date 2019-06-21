package com.tencent.mm.ui.base.preference;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AutoHintSizeEditText$1
  implements TextWatcher
{
  AutoHintSizeEditText$1(AutoHintSizeEditText paramAutoHintSizeEditText)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(107123);
    AutoHintSizeEditText.a(this.yBn, paramEditable, this.yBn.getHint(), this.yBn.getWidth() - this.yBn.getPaddingLeft() - this.yBn.getPaddingRight());
    AppMethodBeat.o(107123);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.AutoHintSizeEditText.1
 * JD-Core Version:    0.6.2
 */