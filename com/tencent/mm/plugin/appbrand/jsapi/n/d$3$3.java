package com.tencent.mm.plugin.appbrand.jsapi.n;

import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.h.a;

final class d$3$3 extends Spannable.Factory
{
  d$3$3(d.3 param3, int paramInt)
  {
  }

  public final Spannable newSpannable(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(74797);
    paramCharSequence = super.newSpannable(paramCharSequence);
    if (!TextUtils.isEmpty(paramCharSequence))
      paramCharSequence.setSpan(new a(this.hVo), 0, paramCharSequence.length(), 18);
    AppMethodBeat.o(74797);
    return paramCharSequence;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.n.d.3.3
 * JD-Core Version:    0.6.2
 */