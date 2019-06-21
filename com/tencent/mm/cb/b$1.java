package com.tencent.mm.cb;

import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.SpannableString;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$1 extends Spannable.Factory
{
  b$1(b paramb)
  {
  }

  public final Spannable newSpannable(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(62644);
    paramCharSequence = new SpannableString(paramCharSequence);
    AppMethodBeat.o(62644);
    return paramCharSequence;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cb.b.1
 * JD-Core Version:    0.6.2
 */