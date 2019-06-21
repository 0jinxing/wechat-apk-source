package com.tencent.mm.compatible.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class n
{
  public static <T> T checkNotNull(T paramT)
  {
    AppMethodBeat.i(93107);
    if (paramT == null)
    {
      paramT = new NullPointerException();
      AppMethodBeat.o(93107);
      throw paramT;
    }
    AppMethodBeat.o(93107);
    return paramT;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.util.n
 * JD-Core Version:    0.6.2
 */