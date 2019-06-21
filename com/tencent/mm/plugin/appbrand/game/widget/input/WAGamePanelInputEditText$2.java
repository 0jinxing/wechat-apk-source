package com.tencent.mm.plugin.appbrand.game.widget.input;

import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WAGamePanelInputEditText$2
  implements InputFilter
{
  WAGamePanelInputEditText$2(WAGamePanelInputEditText paramWAGamePanelInputEditText)
  {
  }

  public final CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(130356);
    paramCharSequence = paramCharSequence.subSequence(paramInt1, paramInt2);
    if ((paramCharSequence instanceof Spannable));
    for (paramCharSequence = (Spannable)paramCharSequence; ; paramCharSequence = new SpannableStringBuilder(paramCharSequence))
    {
      paramCharSequence = WAGamePanelInputEditText.a(this.huB, paramCharSequence);
      AppMethodBeat.o(130356);
      return paramCharSequence;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.widget.input.WAGamePanelInputEditText.2
 * JD-Core Version:    0.6.2
 */