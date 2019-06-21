package com.tencent.mm.plugin.account.security.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class SecurityAccountVerifyUI$1
  implements TextWatcher
{
  SecurityAccountVerifyUI$1(SecurityAccountVerifyUI paramSecurityAccountVerifyUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(69915);
    if ((paramEditable != null) && (!bo.isNullOrNil(paramEditable.toString())));
    for (boolean bool = true; ; bool = false)
    {
      this.gAa.enableOptionMenu(bool);
      AppMethodBeat.o(69915);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI.1
 * JD-Core Version:    0.6.2
 */