package com.tencent.mm.ui.base;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class MMFormMobileInputView$3
  implements TextWatcher
{
  MMFormMobileInputView$3(MMFormMobileInputView paramMMFormMobileInputView)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(106573);
    paramEditable = MMFormMobileInputView.a(this.yus).getText().toString();
    if (bo.isNullOrNil(paramEditable))
    {
      MMFormMobileInputView.a(this.yus).setText("+");
      MMFormMobileInputView.a(this.yus).setSelection(MMFormMobileInputView.a(this.yus).getText().toString().length());
      if (MMFormMobileInputView.e(this.yus) != null)
        MMFormMobileInputView.e(this.yus);
      AppMethodBeat.o(106573);
    }
    while (true)
    {
      return;
      if (!paramEditable.contains("+"))
      {
        paramEditable = "+".concat(String.valueOf(paramEditable));
        MMFormMobileInputView.a(this.yus).setText(paramEditable);
        MMFormMobileInputView.a(this.yus).setSelection(MMFormMobileInputView.a(this.yus).getText().toString().length());
        break;
      }
      if (paramEditable.length() <= 1)
        break;
      paramEditable = paramEditable.substring(1);
      if (paramEditable.length() <= 4)
        break;
      MMFormMobileInputView.a(this.yus).setText(paramEditable.substring(0, 4));
      AppMethodBeat.o(106573);
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
 * Qualified Name:     com.tencent.mm.ui.base.MMFormMobileInputView.3
 * JD-Core Version:    0.6.2
 */