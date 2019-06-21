package com.tencent.mm.plugin.appbrand.widget.input;

import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class q$4
  implements InputFilter
{
  q$4(q paramq)
  {
  }

  public final CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(123701);
    if ((!TextUtils.isEmpty(paramCharSequence)) && (q.a(this.jfl) != null))
      if ((paramCharSequence instanceof Spannable))
      {
        paramCharSequence = (Spannable)paramCharSequence;
        paramCharSequence.setSpan(q.a(this.jfl), 0, paramCharSequence.length(), 18);
        AppMethodBeat.o(123701);
      }
    while (true)
    {
      return paramCharSequence;
      paramCharSequence = new SpannableStringBuilder(paramCharSequence);
      break;
      paramCharSequence = null;
      AppMethodBeat.o(123701);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.q.4
 * JD-Core Version:    0.6.2
 */