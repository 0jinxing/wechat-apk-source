package com.tencent.mm.wallet_core.ui.formview;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class EditHintPasswdView$1
  implements TextWatcher
{
  EditHintPasswdView$1(EditHintPasswdView paramEditHintPasswdView)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(49389);
    if (EditHintPasswdView.b(this.Aic) != null)
      EditHintPasswdView.b(this.Aic).hY(EditHintPasswdView.c(this.Aic));
    AppMethodBeat.o(49389);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView.1
 * JD-Core Version:    0.6.2
 */