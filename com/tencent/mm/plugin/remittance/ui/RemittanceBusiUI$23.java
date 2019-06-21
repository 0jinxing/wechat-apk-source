package com.tencent.mm.plugin.remittance.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.model.BusiRemittanceResp;

final class RemittanceBusiUI$23
  implements TextWatcher
{
  RemittanceBusiUI$23(RemittanceBusiUI paramRemittanceBusiUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(44917);
    if (paramEditable.toString().startsWith("."))
      paramEditable.insert(0, "0");
    String str = paramEditable.toString();
    int i = str.indexOf(".");
    int j = str.length();
    if ((i >= 0) && (j - i > 2))
      paramEditable.delete(i + 3, j);
    RemittanceBusiUI.g(this.pUd);
    if (RemittanceBusiUI.h(this.pUd) == 32)
    {
      paramEditable = this.pUd;
      if (RemittanceBusiUI.i(this.pUd) != null)
        break label121;
    }
    label121: for (j = 400; ; j = RemittanceBusiUI.i(this.pUd).pOH)
    {
      RemittanceBusiUI.a(paramEditable, null, j);
      AppMethodBeat.o(44917);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI.23
 * JD-Core Version:    0.6.2
 */