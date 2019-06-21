package com.tencent.mm.plugin.ipcall.a.g;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public final class h extends j<g>
{
  public static final String[] fnj;
  private static final String[] nzC;
  public static int nzD;
  public e bSd;

  static
  {
    AppMethodBeat.i(21935);
    fnj = new String[] { j.a(g.ccO, "IPCallMsg") };
    nzC = new String[] { "*", "rowid" };
    nzD = 0;
    AppMethodBeat.o(21935);
  }

  public h(e parame)
  {
    super(parame, g.ccO, "IPCallMsg", null);
    this.bSd = parame;
  }

  public final Cursor xm(int paramInt)
  {
    AppMethodBeat.i(21934);
    Cursor localCursor = this.bSd.query("IPCallMsg", nzC, null, null, null, null, "pushTime desc limit ".concat(String.valueOf(paramInt)));
    AppMethodBeat.o(21934);
    return localCursor;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.g.h
 * JD-Core Version:    0.6.2
 */