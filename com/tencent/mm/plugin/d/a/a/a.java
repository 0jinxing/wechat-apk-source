package com.tencent.mm.plugin.d.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  int[] jEI;

  public a(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(18325);
    this.jEI = null;
    if (paramArrayOfInt.length == 0)
    {
      paramArrayOfInt = new NullPointerException("null == aDataGroup || 0 == aDataGroup.length");
      AppMethodBeat.o(18325);
      throw paramArrayOfInt;
    }
    this.jEI = paramArrayOfInt;
    AppMethodBeat.o(18325);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.a.a
 * JD-Core Version:    0.6.2
 */