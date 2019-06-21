package com.tencent.mm.plugin.appbrand.widget;

import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$1 extends Spannable.Factory
{
  d$1(d paramd)
  {
  }

  public final Spannable newSpannable(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(126657);
    paramCharSequence = super.newSpannable(paramCharSequence);
    if ((d.a(this.iTX) != null) && (!TextUtils.isEmpty(paramCharSequence)))
      paramCharSequence.setSpan(d.a(this.iTX), 0, paramCharSequence.length(), 18);
    AppMethodBeat.o(126657);
    return paramCharSequence;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.d.1
 * JD-Core Version:    0.6.2
 */