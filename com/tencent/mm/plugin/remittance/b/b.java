package com.tencent.mm.plugin.remittance.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class b extends j<a>
{
  public static final String[] fnj;
  private static final String[] gmr;
  private e bSd;

  static
  {
    AppMethodBeat.i(44705);
    fnj = new String[] { j.a(a.ccO, "DelayTransferRecord") };
    gmr = new String[] { "*", "rowid" };
    AppMethodBeat.o(44705);
  }

  public b(e parame)
  {
    super(parame, a.ccO, "DelayTransferRecord", null);
    this.bSd = parame;
  }

  public final a VM(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(44704);
    if (bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.AARecordStorage", "empty transferId");
      AppMethodBeat.o(44704);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      Cursor localCursor = this.bSd.a("DelayTransferRecord", gmr, "transferId=?", new String[] { paramString }, null, null, null, 2);
      try
      {
        if (localCursor.moveToFirst())
        {
          paramString = new com/tencent/mm/plugin/remittance/b/a;
          paramString.<init>();
          paramString.d(localCursor);
          if (localCursor != null)
            localCursor.close();
          AppMethodBeat.o(44704);
        }
        else
        {
          if (localCursor != null)
            localCursor.close();
          AppMethodBeat.o(44704);
          paramString = localObject;
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.AARecordStorage", paramString, "", new Object[0]);
          if (localCursor != null)
            localCursor.close();
        }
      }
      finally
      {
        if (localCursor != null)
          localCursor.close();
        AppMethodBeat.o(44704);
      }
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.b.b
 * JD-Core Version:    0.6.2
 */