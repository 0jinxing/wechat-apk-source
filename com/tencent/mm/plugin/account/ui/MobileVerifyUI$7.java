package com.tencent.mm.plugin.account.ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class MobileVerifyUI$7
  implements TextWatcher
{
  MobileVerifyUI$7(MobileVerifyUI paramMobileVerifyUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(125272);
    if (bo.isNullOrNil(this.gFn.grL.getText().toString()))
    {
      this.gFn.grL.setTextSize(15.0F);
      this.gFn.grL.setGravity(16);
      if ((this.gFn.grL.getText() == null) || (this.gFn.grL.getText().toString().length() <= 0))
        break label124;
      this.gFn.gEZ.setEnabled(true);
      AppMethodBeat.o(125272);
    }
    while (true)
    {
      return;
      this.gFn.grL.setTextSize(24.0F);
      this.gFn.grL.setGravity(16);
      break;
      label124: this.gFn.gEZ.setEnabled(false);
      AppMethodBeat.o(125272);
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileVerifyUI.7
 * JD-Core Version:    0.6.2
 */