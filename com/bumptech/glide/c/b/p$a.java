package com.bumptech.glide.c.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class p$a
  implements Appendable
{
  private final Appendable aBY;
  private boolean aBZ = true;

  p$a(Appendable paramAppendable)
  {
    this.aBY = paramAppendable;
  }

  private static CharSequence p(CharSequence paramCharSequence)
  {
    Object localObject = paramCharSequence;
    if (paramCharSequence == null)
      localObject = "";
    return localObject;
  }

  public final Appendable append(char paramChar)
  {
    boolean bool = false;
    AppMethodBeat.i(91845);
    if (this.aBZ)
    {
      this.aBZ = false;
      this.aBY.append("  ");
    }
    if (paramChar == '\n')
      bool = true;
    this.aBZ = bool;
    this.aBY.append(paramChar);
    AppMethodBeat.o(91845);
    return this;
  }

  public final Appendable append(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(91846);
    paramCharSequence = p(paramCharSequence);
    paramCharSequence = append(paramCharSequence, 0, paramCharSequence.length());
    AppMethodBeat.o(91846);
    return paramCharSequence;
  }

  public final Appendable append(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    AppMethodBeat.i(91847);
    paramCharSequence = p(paramCharSequence);
    if (this.aBZ)
    {
      this.aBZ = false;
      this.aBY.append("  ");
    }
    boolean bool2 = bool1;
    if (paramCharSequence.length() > 0)
    {
      bool2 = bool1;
      if (paramCharSequence.charAt(paramInt2 - 1) == '\n')
        bool2 = true;
    }
    this.aBZ = bool2;
    this.aBY.append(paramCharSequence, paramInt1, paramInt2);
    AppMethodBeat.o(91847);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.p.a
 * JD-Core Version:    0.6.2
 */