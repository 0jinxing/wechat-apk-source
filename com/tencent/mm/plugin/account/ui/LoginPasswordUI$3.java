package com.tencent.mm.plugin.account.ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LoginPasswordUI$3
  implements TextWatcher
{
  LoginPasswordUI$3(LoginPasswordUI paramLoginPasswordUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(125000);
    if (this.gCJ.gBJ.getText().toString().length() > 0)
    {
      this.gCJ.gBK.setEnabled(true);
      AppMethodBeat.o(125000);
    }
    while (true)
    {
      return;
      this.gCJ.gBK.setEnabled(false);
      AppMethodBeat.o(125000);
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
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginPasswordUI.3
 * JD-Core Version:    0.6.2
 */