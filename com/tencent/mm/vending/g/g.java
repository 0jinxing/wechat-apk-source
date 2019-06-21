package com.tencent.mm.vending.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Stack;

final class g
{
  private static g zYo;
  ThreadLocal<Stack<c>> b;

  static
  {
    AppMethodBeat.i(126070);
    zYo = null;
    zYo = new g();
    AppMethodBeat.o(126070);
  }

  private g()
  {
    AppMethodBeat.i(126069);
    this.b = new ThreadLocal();
    AppMethodBeat.o(126069);
  }

  public static g dMp()
  {
    return zYo;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.g.g
 * JD-Core Version:    0.6.2
 */