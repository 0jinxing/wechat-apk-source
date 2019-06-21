package com.tencent.mm.plugin.luckymoney.ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyPrepareUI$10
  implements TextWatcher
{
  LuckyMoneyPrepareUI$10(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI, EditText paramEditText)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(42950);
    if (paramEditable.toString().startsWith("."))
      paramEditable.insert(0, "0");
    String str = paramEditable.toString();
    int i = str.indexOf(".");
    int j = str.length();
    if ((i >= 0) && (j - i > 3))
      paramEditable.delete(i + 3, j);
    while (true)
    {
      this.gnV.setContentDescription(paramEditable.toString());
      AppMethodBeat.o(42950);
      return;
      if (i > 6)
        paramEditable.delete(6, i);
      else if ((i == -1) && (j > 6))
        paramEditable.delete(6, j);
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.10
 * JD-Core Version:    0.6.2
 */