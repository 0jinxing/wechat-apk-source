package com.tencent.mm.plugin.honey_pay.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public final class b extends j<a>
{
  public static final String[] fnj;
  private static final String[] gmr;
  private e bSd;

  static
  {
    AppMethodBeat.i(41751);
    fnj = new String[] { j.a(a.ccO, "HoneyPayMsgRecord") };
    gmr = new String[] { "*", "rowid" };
    AppMethodBeat.o(41751);
  }

  public b(e parame)
  {
    super(parame, a.ccO, "HoneyPayMsgRecord", null);
    this.bSd = parame;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.model.b
 * JD-Core Version:    0.6.2
 */