package android.support.design.widget;

import android.text.Editable;
import android.text.TextWatcher;

final class TextInputLayout$1
  implements TextWatcher
{
  TextInputLayout$1(TextInputLayout paramTextInputLayout)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    TextInputLayout localTextInputLayout = this.tS;
    if (!TextInputLayout.a(this.tS));
    for (boolean bool = true; ; bool = false)
    {
      localTextInputLayout.d(bool, false);
      if (this.tS.tq)
        this.tS.ak(paramEditable.length());
      return;
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.design.widget.TextInputLayout.1
 * JD-Core Version:    0.6.2
 */