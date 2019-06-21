package com.tencent.mm.plugin.account.ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap;

final class RegSetInfoUI$28
  implements TextWatcher
{
  RegSetInfoUI$28(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(125533);
    paramEditable = RegSetInfoUI.b(this.gHM).getText().toString().trim();
    if ((paramEditable != null) && (paramEditable.length() > 16))
    {
      RegSetInfoUI.b(this.gHM).setText(paramEditable.substring(0, 16));
      AppMethodBeat.o(125533);
    }
    while (true)
    {
      return;
      if (!RegSetInfoUI.m(this.gHM).doT())
        RegSetInfoUI.m(this.gHM).stopTimer();
      RegSetInfoUI.n(this.gHM);
      if (!RegSetInfoUI.o(this.gHM))
        RegSetInfoUI.a(this.gHM).setText(paramEditable);
      AppMethodBeat.o(125533);
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.28
 * JD-Core Version:    0.6.2
 */