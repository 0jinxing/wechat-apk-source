package com.tencent.mm.plugin.order.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public final class b extends j<a>
{
  public static final String[] fnj;
  private e bSd;

  static
  {
    AppMethodBeat.i(43797);
    fnj = new String[] { j.a(a.ccO, "OrderCommonMsgXml") };
    AppMethodBeat.o(43797);
  }

  public b(e parame)
  {
    super(parame, a.ccO, "OrderCommonMsgXml", null);
    this.bSd = parame;
  }

  public final boolean a(a parama)
  {
    AppMethodBeat.i(43794);
    boolean bool = super.b(parama);
    AppMethodBeat.o(43794);
    return bool;
  }

  public final Cursor baR()
  {
    AppMethodBeat.i(43793);
    Cursor localCursor = this.bSd.rawQuery("select * from OrderCommonMsgXml order by msgId desc", null);
    AppMethodBeat.o(43793);
    return localCursor;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.b.b
 * JD-Core Version:    0.6.2
 */