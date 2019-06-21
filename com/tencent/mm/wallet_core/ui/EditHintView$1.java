package com.tencent.mm.wallet_core.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tenpay.android.wechat.TenpaySecureEditText;

final class EditHintView$1
  implements TextWatcher
{
  EditHintView$1(EditHintView paramEditHintView)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(49182);
    boolean bool = this.Ahi.asa();
    if ((bool != EditHintView.c(this.Ahi)) && (EditHintView.d(this.Ahi) != null))
    {
      ab.d("MicroMsg.EditHintView", "View:" + EditHintView.e(this.Ahi) + ", editType:" + EditHintView.f(this.Ahi) + " inputValid change to " + bool);
      EditHintView.a(this.Ahi, bool);
      EditHintView.d(this.Ahi);
      EditHintView.c(this.Ahi);
    }
    EditHintView.g(this.Ahi);
    AppMethodBeat.o(49182);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(49181);
    if ((EditHintView.a(this.Ahi) == 4) && (this.Ahi.asa()))
    {
      EditHintView.b(this.Ahi);
      this.Ahi.AgX.ClearInput();
    }
    AppMethodBeat.o(49181);
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.EditHintView.1
 * JD-Core Version:    0.6.2
 */