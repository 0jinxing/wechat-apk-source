package com.tencent.mm.plugin.recharge.ui.form;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MallFormView$1
  implements TextWatcher
{
  private boolean pIR = false;

  MallFormView$1(MallFormView paramMallFormView)
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
    AppMethodBeat.i(44375);
    if (this.pIS.asa() != this.pIR)
    {
      if (MallFormView.c(this.pIS) != null)
        MallFormView.c(this.pIS).hY(this.pIS.asa());
      this.pIR = this.pIS.asa();
    }
    this.pIS.cew();
    AppMethodBeat.o(44375);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.form.MallFormView.1
 * JD-Core Version:    0.6.2
 */