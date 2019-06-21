package com.tencent.mm.pluginsdk.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMEditText;

final class VoiceInputUI$5
  implements TextWatcher
{
  VoiceInputUI$5(VoiceInputUI paramVoiceInputUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(27611);
    ab.d("VoiceInputUI", "afterTextChanged firstTextChange:%s,textChange:%s", new Object[] { Boolean.valueOf(VoiceInputUI.f(this.vjG)), Boolean.valueOf(VoiceInputUI.g(this.vjG)) });
    if (VoiceInputUI.f(this.vjG))
    {
      VoiceInputUI.h(this.vjG);
      AppMethodBeat.o(27611);
    }
    while (true)
    {
      return;
      VoiceInputUI.d(this.vjG);
      VoiceInputUI.c(this.vjG).requestLayout();
      AppMethodBeat.o(27611);
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.VoiceInputUI.5
 * JD-Core Version:    0.6.2
 */