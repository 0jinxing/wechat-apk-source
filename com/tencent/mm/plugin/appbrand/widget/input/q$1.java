package com.tencent.mm.plugin.appbrand.widget.input;

import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class q$1 extends Spannable.Factory
{
  q$1(q paramq)
  {
  }

  public final Spannable newSpannable(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(123698);
    paramCharSequence = super.newSpannable(paramCharSequence);
    if ((q.a(this.jfl) != null) && (!TextUtils.isEmpty(paramCharSequence)))
      paramCharSequence.setSpan(q.a(this.jfl), 0, paramCharSequence.length(), 18);
    AppMethodBeat.o(123698);
    return paramCharSequence;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.q.1
 * JD-Core Version:    0.6.2
 */