package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum cs$b
{
  final int value;

  static
  {
    AppMethodBeat.i(51101);
    dhP = new b("SHAREAPPMSG", 0, 1);
    dhQ = new b("CLICKAPPMSG", 1, 2);
    dhR = new b("CLICKSUBSCRIBETV", 2, 3);
    dhS = new b("CLICKSTARTGAME", 3, 4);
    dhT = new b[] { dhP, dhQ, dhR, dhS };
    AppMethodBeat.o(51101);
  }

  private cs$b(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cs.b
 * JD-Core Version:    0.6.2
 */