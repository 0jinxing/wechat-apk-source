package com.tencent.luggage.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum b
{
  static
  {
    AppMethodBeat.i(90863);
    bPV = new b("PENDING", 0);
    bPW = new b("PASS", 1);
    bPX = new b("REJECT", 2);
    bPY = new b[] { bPV, bPW, bPX };
    AppMethodBeat.o(90863);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.d.a.b
 * JD-Core Version:    0.6.2
 */