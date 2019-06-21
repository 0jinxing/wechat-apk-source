package com.tencent.mm.plugin.appbrand.game.widget.input;

import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.SpannableStringBuilder;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WAGamePanelInputEditText$3 extends Spannable.Factory
{
  WAGamePanelInputEditText$3(WAGamePanelInputEditText paramWAGamePanelInputEditText)
  {
  }

  public final Spannable newSpannable(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(130357);
    paramCharSequence = new SpannableStringBuilder(paramCharSequence);
    AppMethodBeat.o(130357);
    return paramCharSequence;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.widget.input.WAGamePanelInputEditText.3
 * JD-Core Version:    0.6.2
 */