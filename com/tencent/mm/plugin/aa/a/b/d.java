package com.tencent.mm.plugin.aa.a.b;

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
    AppMethodBeat.i(40674);
    fnj = new String[] { j.a(c.ccO, "AARecord") };
    gmr = new String[] { "*", "rowid" };
    gms = new HashMap();
    AppMethodBeat.o(40674);
  }

  public d(e parame)
  {
    super(parame, c.ccO, "AARecord", null);
    this.bSd = parame;
  }

  public final boolean a(c paramc)
  {
    AppMethodBeat.i(40668);
    if ((paramc != null) && (gms.containsKey(paramc.field_billNo)))
      gms.put(paramc.field_billNo, paramc);
    boolean bool = super.b(paramc);
    AppMethodBeat.o(40668);
    return bool;
  }

  public final boolean a(c paramc, String[] paramArrayOfString)
  {
    AppMethodBeat.i(40669);
    if ((paramc != null) && (gms.containsKey(paramc.field_billNo)))
      gms.remove(paramc.field_billNo);
    boolean bool = super.a(paramc, paramArrayOfString);
    AppMethodBeat.o(40669);
    return bool;
  }

  public final boolean b(c paramc)
  {
    AppMethodBeat.i(40670);
    if ((paramc != null) && (gms.containsKey(paramc.field_billNo)))
      gms.put(paramc.field_billNo, paramc);
    boolean bool = super.a(paramc);
    AppMethodBeat.o(40670);
    return bool;
  }

  public final c vH(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(40667);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(40667);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      Cursor localCursor = this.bSd.a("AARecord", gmr, "billNo=?", new String[] { paramString }, null, null, null, 2);
      try
      {
        if (localCursor.moveToFirst())
        {
          paramString = new com/tencent/mm/plugin/aa/a/b/c;
          paramString.<init>();
          paramString.d(localCursor);
          if (localCursor != null)
            localCursor.close();
          AppMethodBeat.o(40667);
        }
        else
        {
          if (localCursor != null)
            localCursor.close();
          AppMethodBeat.o(40667);
          paramString = localObject;
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.e("MicroMsg.AARecordStorage", "getRecordByBillno error: %s", new Object[] { paramString.getMessage() });
          if (localCursor != null)
            localCursor.close();
        }
      }
      finally
      {
        if (localCursor != null)
          localCursor.close();
        AppMethodBeat.o(40667);
      }
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.b.d
 * JD-Core Version:    0.6.2
 */