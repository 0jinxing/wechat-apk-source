package com.tencent.mm.plugin.appbrand.widget.input;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class m$a
  implements CharSequence
{
  private CharSequence jeG;

  m$a(CharSequence paramCharSequence)
  {
    this.jeG = paramCharSequence;
  }

  public final char charAt(int paramInt)
  {
    return '●';
  }

  public final int length()
  {
    AppMethodBeat.i(77425);
    int i = this.jeG.length();
    AppMethodBeat.o(77425);
    return i;
  }

  public final CharSequence subSequence(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(77426);
    CharSequence localCharSequence = this.jeG.subSequence(paramInt1, paramInt2);
    AppMethodBeat.o(77426);
    return localCharSequence;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.m.a
 * JD-Core Version:    0.6.2
 */