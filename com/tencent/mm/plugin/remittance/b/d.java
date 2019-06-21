package com.tencent.mm.plugin.remittance.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

public final class d extends j<c>
{
  public static final String[] fnj;
  private static final String[] gmr;
  public static Map<String, c> gms;
  private e bSd;

  static
  {
    AppMethodBeat.i(44712);
    fnj = new String[] { j.a(c.ccO, "RemittanceRecord") };
    gmr = new String[] { "*", "rowid" };
    gms = new HashMap();
    AppMethodBeat.o(44712);
  }

  public d(e parame)
  {
    super(parame, c.ccO, "RemittanceRecord", null);
    this.bSd = parame;
  }

  public final c VN(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(44707);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(44707);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      Cursor localCursor = this.bSd.a("RemittanceRecord", gmr, "transferId=?", new String[] { paramString }, null, null, null, 2);
      try
      {
        if (localCursor.moveToFirst())
        {
          paramString = new com/tencent/mm/plugin/remittance/b/c;
          paramString.<init>();
          paramString.d(localCursor);
          localCursor.close();
          AppMethodBeat.o(44707);
        }
        else
        {
          localCursor.close();
          AppMethodBeat.o(44707);
          paramString = localObject;
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.RemittanceSendRecordStorage", paramString, "getRecordByTransferId error: %s", new Object[] { paramString.getMessage() });
          localCursor.close();
        }
      }
      finally
      {
        localCursor.close();
        AppMethodBeat.o(44707);
      }
    }
    throw paramString;
  }

  public final boolean a(c paramc)
  {
    AppMethodBeat.i(44708);
    if ((paramc != null) && (gms.containsKey(paramc.field_transferId)))
      gms.put(paramc.field_transferId, paramc);
    boolean bool = super.a(paramc);
    AppMethodBeat.o(44708);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.b.d
 * JD-Core Version:    0.6.2
 */