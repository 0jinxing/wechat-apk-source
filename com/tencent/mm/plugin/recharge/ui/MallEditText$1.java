package com.tencent.mm.plugin.recharge.ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MallEditText$1
  implements TextWatcher
{
  MallEditText$1(MallEditText paramMallEditText)
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
    AppMethodBeat.i(44208);
    String str = paramCharSequence.toString();
    paramInt2 = MallEditText.a(this.pGB).getSelectionStart();
    paramCharSequence = "";
    paramInt1 = paramInt2;
    int i;
    if (str != null)
    {
      paramCharSequence = new StringBuilder(str.replaceAll(" ", ""));
      paramInt1 = paramCharSequence.length();
      if (paramInt1 >= 4)
        paramCharSequence.insert(3, ' ');
      if (paramInt1 >= 8)
        paramCharSequence.insert(8, ' ');
      paramCharSequence = paramCharSequence.toString();
      i = paramCharSequence.length();
      if (i <= MallEditText.b(this.pGB))
        break label215;
      if (((paramInt2 == 4) || (paramInt2 == 9)) && (paramInt3 == 1))
      {
        paramInt1 = paramInt2 + 1;
        MallEditText.a(this.pGB, i);
      }
    }
    else
    {
      if (str.equals(paramCharSequence))
        break label274;
      MallEditText.a(this.pGB).setText(paramCharSequence);
      if (paramInt1 >= MallEditText.b(this.pGB))
        break label249;
      MallEditText.a(this.pGB).setSelection(paramInt1);
      AppMethodBeat.o(44208);
    }
    while (true)
    {
      return;
      if (paramInt2 != 4)
      {
        paramInt1 = paramInt2;
        if (paramInt2 != 9)
          break;
      }
      paramInt1 = paramInt2;
      if (paramInt3 <= 1)
        break;
      paramInt1 = paramInt2 + paramInt3;
      break;
      label215: paramInt1 = paramInt2;
      if (i >= MallEditText.b(this.pGB))
        break;
      if (paramInt2 != 4)
      {
        paramInt1 = paramInt2;
        if (paramInt2 != 9)
          break;
      }
      paramInt1 = paramInt2 - 1;
      break;
      label249: MallEditText.a(this.pGB).setSelection(MallEditText.b(this.pGB));
      AppMethodBeat.o(44208);
      continue;
      label274: MallEditText.c(this.pGB);
      AppMethodBeat.o(44208);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.MallEditText.1
 * JD-Core Version:    0.6.2
 */