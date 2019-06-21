package com.tencent.mm.plugin.account.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.normsg.a.b;
import com.tencent.mm.sdk.platformtools.av;

final class RegByMobileRegAIOUI$23
  implements TextWatcher
{
  private av gGg;

  RegByMobileRegAIOUI$23(RegByMobileRegAIOUI paramRegByMobileRegAIOUI, boolean[] paramArrayOfBoolean)
  {
    AppMethodBeat.i(125368);
    this.gGg = new av();
    AppMethodBeat.o(125368);
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(125369);
    RegByMobileRegAIOUI.b(this.gGd);
    AppMethodBeat.o(125369);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(125370);
    if (this.gGh[0] != 0)
    {
      this.gGh[0] = false;
      b.oTO.TI("ie_reg");
    }
    b.oTO.TJ("ie_reg");
    AppMethodBeat.o(125370);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.23
 * JD-Core Version:    0.6.2
 */