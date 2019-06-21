package com.tencent.mm.plugin.ipcall.a.g;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public final class l extends j<k>
{
  public static final String[] fnj;
  static final String[] nzF;
  public e bSd;

  static
  {
    AppMethodBeat.i(21947);
    fnj = new String[] { j.a(k.ccO, "IPCallRecord") };
    nzF = new String[] { "*", "rowid" };
    AppMethodBeat.o(21947);
  }

  public l(e parame)
  {
    super(parame, k.ccO, "IPCallRecord", null);
    this.bSd = parame;
  }

  public final Cursor OU(String paramString)
  {
    AppMethodBeat.i(21943);
    paramString = this.bSd.query("IPCallRecord", nzF, "phonenumber=?", new String[] { paramString }, null, null, "calltime desc limit 4");
    AppMethodBeat.o(21943);
    return paramString;
  }

  public final Cursor OV(String paramString)
  {
    AppMethodBeat.i(21944);
    paramString = this.bSd.query("IPCallRecord", nzF, "phonenumber=?", new String[] { paramString }, null, null, "calltime desc");
    AppMethodBeat.o(21944);
    return paramString;
  }

  public final void a(k paramk)
  {
    AppMethodBeat.i(21946);
    if (paramk != null)
      a(paramk.xDa, paramk);
    AppMethodBeat.o(21946);
  }

  public final Cursor iX(long paramLong)
  {
    AppMethodBeat.i(21945);
    Cursor localCursor = this.bSd.query("IPCallRecord", nzF, "addressId=?", new String[] { String.valueOf(paramLong) }, null, null, "calltime desc");
    AppMethodBeat.o(21945);
    return localCursor;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.g.l
 * JD-Core Version:    0.6.2
 */