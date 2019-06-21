package com.tencent.mm.plugin.account.ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.o;

final class RegSetInfoUI$31
  implements TextWatcher
{
  RegSetInfoUI$31(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(125537);
    if (!RegSetInfoUI.m(this.gHM).doT())
      RegSetInfoUI.m(this.gHM).stopTimer();
    paramEditable = RegSetInfoUI.a(this.gHM).getText().toString().trim();
    if (bo.isNullOrNil(paramEditable))
    {
      RegSetInfoUI.r(this.gHM).setText(this.gHM.getString(2131302345));
      RegSetInfoUI.s(this.gHM);
      if (RegSetInfoUI.t(this.gHM) != null)
      {
        RegSetInfoUI.t(this.gHM).dismiss();
        RegSetInfoUI.u(this.gHM);
      }
      RegSetInfoUI.a(this.gHM).postDelayed(new RegSetInfoUI.31.1(this), 50L);
    }
    if ((!bo.isNullOrNil(paramEditable)) && ((RegSetInfoUI.c(this.gHM)) || (!paramEditable.equals(RegSetInfoUI.v(this.gHM)))))
    {
      RegSetInfoUI.s(this.gHM);
      RegSetInfoUI.m(this.gHM).ae(500L, 500L);
    }
    RegSetInfoUI.a(this.gHM, paramEditable);
    AppMethodBeat.o(125537);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.31
 * JD-Core Version:    0.6.2
 */