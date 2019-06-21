package com.tencent.mm.plugin.address.ui;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class InvoiceEditView$3
  implements TextWatcher
{
  InvoiceEditView$3(InvoiceEditView paramInvoiceEditView)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(16832);
    if ((InvoiceEditView.a(this.gKa) == 5) && (InvoiceEditView.b(this.gKa) != paramEditable.toString().length()))
    {
      InvoiceEditView.a(this.gKa, paramEditable.toString().length());
      this.gKa.setBankNumberValStr(paramEditable.toString());
    }
    boolean bool = this.gKa.asa();
    if ((bool != this.gKa.gJN) && (InvoiceEditView.c(this.gKa) != null))
    {
      ab.d("MicroMsg.InvoiceEditView", "View:" + InvoiceEditView.d(this.gKa) + ", editType:" + InvoiceEditView.a(this.gKa) + " inputValid change to " + bool);
      this.gKa.gJN = bool;
      InvoiceEditView.c(this.gKa).arX();
    }
    if (((!this.gKa.gJU) || (this.gKa.gJN)) && (this.gKa.gJU) && (this.gKa.gJN))
      InvoiceEditView.e(this.gKa).setTextColor(this.gKa.getResources().getColor(2131689761));
    InvoiceEditView.a(this.gKa, InvoiceEditView.e(this.gKa).isFocused());
    AppMethodBeat.o(16832);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.InvoiceEditView.3
 * JD-Core Version:    0.6.2
 */