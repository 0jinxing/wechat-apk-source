package com.tencent.mm.plugin.sns.ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsUploadUI$7
  implements TextWatcher
{
  SnsUploadUI$7(SnsUploadUI paramSnsUploadUI)
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
    AppMethodBeat.i(39745);
    if (SnsUploadUI.f(this.rCO).getText().toString().trim().length() > 10)
    {
      paramCharSequence = this.rCO.findViewById(2131827936);
      if (paramCharSequence != null)
        paramCharSequence.setVisibility(8);
    }
    AppMethodBeat.o(39745);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadUI.7
 * JD-Core Version:    0.6.2
 */