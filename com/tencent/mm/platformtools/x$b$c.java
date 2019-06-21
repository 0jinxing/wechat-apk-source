package com.tencent.mm.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class x$b$c
{
  boolean ghA;
  int ghB;
  int ghC;

  public final String toString()
  {
    AppMethodBeat.i(79015);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("fail[").append(this.ghA).append("],");
    ((StringBuilder)localObject).append("tryTimes[").append(this.ghB).append("],");
    ((StringBuilder)localObject).append("lastTS[").append(this.ghC).append("]");
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(79015);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.x.b.c
 * JD-Core Version:    0.6.2
 */