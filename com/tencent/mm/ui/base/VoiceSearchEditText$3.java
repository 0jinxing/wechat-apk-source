package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class VoiceSearchEditText$3
  implements View.OnFocusChangeListener
{
  VoiceSearchEditText$3(VoiceSearchEditText paramVoiceSearchEditText)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(107090);
    ab.d("MicroMsg.VoiceSearchEditText", "onFocusChange hasFocus = [%s], currentFocusState = [%s]", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(VoiceSearchEditText.g(this.yBg)) });
    if ((!paramBoolean) && (VoiceSearchEditText.g(this.yBg)))
    {
      VoiceSearchEditText.f(this.yBg);
      VoiceSearchEditText.a(this.yBg, false);
    }
    AppMethodBeat.o(107090);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.VoiceSearchEditText.3
 * JD-Core Version:    0.6.2
 */