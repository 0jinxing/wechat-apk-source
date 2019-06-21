package com.tencent.mm.plugin.product.ui;

import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al.a;

final class HtmlTextView$1
  implements al.a
{
  private volatile Spanned pie;

  HtmlTextView$1(HtmlTextView paramHtmlTextView, String paramString)
  {
  }

  public final boolean acf()
  {
    AppMethodBeat.i(44009);
    this.pie = HtmlTextView.a(this.pig, this.pif);
    AppMethodBeat.o(44009);
    return true;
  }

  public final boolean acg()
  {
    AppMethodBeat.i(44010);
    HtmlTextView.a(this.pig, this.pie, TextView.BufferType.SPANNABLE);
    this.pig.setMovementMethod(LinkMovementMethod.getInstance());
    AppMethodBeat.o(44010);
    return true;
  }

  public final String toString()
  {
    AppMethodBeat.i(44011);
    String str = super.toString() + "|setText";
    AppMethodBeat.o(44011);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.HtmlTextView.1
 * JD-Core Version:    0.6.2
 */