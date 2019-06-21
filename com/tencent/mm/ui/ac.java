package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.tf;
import com.tencent.mm.sdk.b.a;

public final class ac
{
  public static void bL(int paramInt, String paramString)
  {
    AppMethodBeat.i(106131);
    if (a.xxA != null)
    {
      tf localtf = new tf();
      localtf.cPv.className = paramString;
      localtf.cPv.cPw = paramInt;
      a.xxA.m(localtf);
    }
    AppMethodBeat.o(106131);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ac
 * JD-Core Version:    0.6.2
 */