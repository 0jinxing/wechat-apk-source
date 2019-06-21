package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.style.ParagraphStyle;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class r
  implements ParagraphStyle
{
  public final q uRP;
  public final ParagraphStyle uSv;

  public r(q paramq, ParagraphStyle paramParagraphStyle)
  {
    this.uRP = paramq;
    this.uSv = paramParagraphStyle;
  }

  public final String toString()
  {
    AppMethodBeat.i(26969);
    String str = this.uRP.name() + " - " + this.uSv.getClass().getSimpleName();
    AppMethodBeat.o(26969);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.spans.r
 * JD-Core Version:    0.6.2
 */