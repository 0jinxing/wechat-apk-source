package com.tencent.mm.plugin.sns.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsUploadUI$8
  implements TextWatcher
{
  SnsUploadUI$8(SnsUploadUI paramSnsUploadUI)
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
    AppMethodBeat.i(39746);
    if (SnsUploadUI.f(this.rCO).getText().toString().trim().length() > 0)
    {
      this.rCO.enableOptionMenu(true);
      AppMethodBeat.o(39746);
    }
    while (true)
    {
      return;
      this.rCO.enableOptionMenu(false);
      AppMethodBeat.o(39746);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadUI.8
 * JD-Core Version:    0.6.2
 */