package com.bumptech.glide.c.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$a extends g
{
  public final float l(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f = 1.0F;
    AppMethodBeat.i(92215);
    paramInt1 = Math.min(paramInt2 / paramInt4, paramInt1 / paramInt3);
    if (paramInt1 == 0)
      AppMethodBeat.o(92215);
    while (true)
    {
      return f;
      f = 1.0F / Integer.highestOneBit(paramInt1);
      AppMethodBeat.o(92215);
    }
  }

  public final g.g nq()
  {
    return g.g.aFj;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.g.a
 * JD-Core Version:    0.6.2
 */