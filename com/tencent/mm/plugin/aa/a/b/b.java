package com.tencent.mm.plugin.aa.a.b;

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
    AppMethodBeat.i(40665);
    fnj = new String[] { j.a(a.ccO, "AAPayRecord") };
    gmr = new String[] { "*", "rowid" };
    AppMethodBeat.o(40665);
  }

  public b(e parame)
  {
    super(parame, a.ccO, "AAPayRecord", null);
    this.bSd = parame;
  }

  public final a vG(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(40664);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(40664);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      Cursor localCursor = this.bSd.a("AAPayRecord", gmr, "payMsgId=?", new String[] { paramString }, null, null, null, 2);
      try
      {
        if (localCursor.moveToFirst())
        {
          paramString = new com/tencent/mm/plugin/aa/a/b/a;
          paramString.<init>();
          paramString.d(localCursor);
          if (localCursor != null)
            localCursor.close();
          AppMethodBeat.o(40664);
        }
        else
        {
          if (localCursor != null)
            localCursor.close();
          AppMethodBeat.o(40664);
          paramString = localObject;
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.e("MicroMsg.AAPayRecordStorage", "getByPayMsgId error: %s", new Object[] { paramString.getMessage() });
          if (localCursor != null)
            localCursor.close();
        }
      }
      finally
      {
        if (localCursor != null)
          localCursor.close();
        AppMethodBeat.o(40664);
      }
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.b.b
 * JD-Core Version:    0.6.2
 */