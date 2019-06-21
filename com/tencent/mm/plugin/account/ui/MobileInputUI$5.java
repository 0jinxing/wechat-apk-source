package com.tencent.mm.plugin.account.ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.normsg.a.b;

final class MobileInputUI$5
  implements TextWatcher
{
  MobileInputUI$5(MobileInputUI paramMobileInputUI, boolean[] paramArrayOfBoolean)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(125164);
    this.gDZ.gDN.setEnabled(MobileInputUI.e(this.gDZ));
    AppMethodBeat.o(125164);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(125165);
    if (this.gEa[0] != 0)
    {
      this.gEa[0] = false;
      b.oTO.TI("ie_reg_eu");
    }
    b.oTO.TJ("ie_reg_eu");
    AppMethodBeat.o(125165);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileInputUI.5
 * JD-Core Version:    0.6.2
 */