package com.tencent.mm.plugin.scanner.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public final class a extends j<com.tencent.mm.plugin.scanner.history.a.a>
{
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(80895);
    fnj = new String[] { j.a(com.tencent.mm.plugin.scanner.history.a.a.ccO, "ScanHistoryItem") };
    AppMethodBeat.o(80895);
  }

  public a(e parame)
  {
    super(parame, com.tencent.mm.plugin.scanner.history.a.a.ccO, "ScanHistoryItem", null);
    this.bSd = parame;
  }

  public final Cursor baR()
  {
    AppMethodBeat.i(80894);
    Cursor localCursor = this.bSd.rawQuery("select * from ScanHistoryItem order by ScanTime desc", null);
    AppMethodBeat.o(80894);
    return localCursor;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.b.a
 * JD-Core Version:    0.6.2
 */