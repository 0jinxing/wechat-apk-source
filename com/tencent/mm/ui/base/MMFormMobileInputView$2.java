package com.tencent.mm.ui.base;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.av;

final class MMFormMobileInputView$2
  implements TextWatcher
{
  private av gGg;

  MMFormMobileInputView$2(MMFormMobileInputView paramMMFormMobileInputView)
  {
    AppMethodBeat.i(106571);
    this.gGg = new av();
    AppMethodBeat.o(106571);
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(106572);
    int i = MMFormMobileInputView.b(this.yus).getSelectionEnd();
    paramEditable = MMFormMobileInputView.b(this.yus).getText().toString();
    String str1 = MMFormMobileInputView.b(this.yus).getText().toString().substring(0, i);
    String str2;
    if ((paramEditable != null) && (!paramEditable.equals(MMFormMobileInputView.c(this.yus))))
    {
      str2 = MMFormMobileInputView.a(this.yus).getText().toString();
      MMFormMobileInputView.a(this.yus, av.formatNumber(str2.replace("+", ""), paramEditable));
      MMFormMobileInputView.b(this.yus, av.formatNumber(str2.replace("+", ""), str1));
      if (paramEditable.equals(MMFormMobileInputView.c(this.yus)))
        AppMethodBeat.o(106572);
    }
    while (true)
    {
      return;
      MMFormMobileInputView.b(this.yus).setText(MMFormMobileInputView.c(this.yus));
      int j = MMFormMobileInputView.b(this.yus).getText().toString().length();
      if (str1 != null)
      {
        try
        {
          MMFormMobileInputView.b(this.yus, av.formatNumber(str2.replace("+", ""), str1));
          if ((paramEditable.length() > 13) && (i <= j))
            break label325;
          if ((i <= j) && (MMFormMobileInputView.d(this.yus).toString().length() <= j))
            break label294;
          MMFormMobileInputView.b(this.yus).setSelection(j - Math.abs(paramEditable.length() - i));
          AppMethodBeat.o(106572);
        }
        catch (Exception paramEditable)
        {
          ab.printErrStackTrace("MicroMsg.MMFormMobileInputView", paramEditable, "", new Object[0]);
        }
        AppMethodBeat.o(106572);
        continue;
        label294: MMFormMobileInputView.b(this.yus).setSelection(MMFormMobileInputView.d(this.yus).toString().length());
        AppMethodBeat.o(106572);
        continue;
        label325: MMFormMobileInputView.b(this.yus).setSelection(str1.toString().length());
        AppMethodBeat.o(106572);
      }
      else
      {
        MMFormMobileInputView.b(this.yus).setSelection(0);
        AppMethodBeat.o(106572);
      }
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMFormMobileInputView.2
 * JD-Core Version:    0.6.2
 */