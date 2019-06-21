package com.tencent.mm.ui.base;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoiceSearchEditText$2
  implements TextWatcher
{
  VoiceSearchEditText$2(VoiceSearchEditText paramVoiceSearchEditText)
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
    AppMethodBeat.i(107089);
    VoiceSearchEditText.a(this.yBg, true);
    VoiceSearchEditText.f(this.yBg);
    AppMethodBeat.o(107089);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.VoiceSearchEditText.2
 * JD-Core Version:    0.6.2
 */