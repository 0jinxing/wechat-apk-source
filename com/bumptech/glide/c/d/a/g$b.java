package com.bumptech.glide.c.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$b extends g
{
  public final float l(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 1;
    AppMethodBeat.i(92216);
    paramInt1 = (int)Math.ceil(Math.max(paramInt2 / paramInt4, paramInt1 / paramInt3));
    paramInt2 = Math.max(1, Integer.highestOneBit(paramInt1));
    if (paramInt2 < paramInt1);
    for (paramInt1 = i; ; paramInt1 = 0)
    {
      float f = 1.0F / (paramInt2 << paramInt1);
      AppMethodBeat.o(92216);
      return f;
    }
  }

  public final g.g nq()
  {
    return g.g.aFi;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.g.b
 * JD-Core Version:    0.6.2
 */