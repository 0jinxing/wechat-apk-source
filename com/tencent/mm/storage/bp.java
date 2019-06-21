package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;

public final class bp extends j<bo>
{
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(29069);
    fnj = new String[] { j.a(bo.ccO, "OpenMsgListener") };
    AppMethodBeat.o(29069);
  }

  public bp(e parame)
  {
    super(parame, bo.ccO, "OpenMsgListener", null);
    AppMethodBeat.i(29065);
    this.bSd = parame;
    parame.hY("OpenMsgListener", "CREATE INDEX IF NOT EXISTS openMsgListenerAppIdIndex ON OpenMsgListener ( appId )");
    parame.hY("OpenMsgListener", "CREATE INDEX IF NOT EXISTS openMsgListenerStatusIndex ON OpenMsgListener ( status )");
    AppMethodBeat.o(29065);
  }

  public final bo apN(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(29066);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      AppMethodBeat.o(29066);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      Cursor localCursor = this.bSd.a("OpenMsgListener", null, "appId=?", new String[] { com.tencent.mm.sdk.platformtools.bo.vA(paramString) }, null, null, null, 2);
      if (!localCursor.moveToFirst())
      {
        ab.w("MicroMsg.OpenMsgListenerStorage", "get null with appId:".concat(String.valueOf(paramString)));
        localCursor.close();
        AppMethodBeat.o(29066);
        paramString = localObject;
      }
      else
      {
        paramString = new bo();
        paramString.d(localCursor);
        localCursor.close();
        AppMethodBeat.o(29066);
      }
    }
  }

  public final Cursor dui()
  {
    AppMethodBeat.i(29067);
    Cursor localCursor = rawQuery("select * from OpenMsgListener where (status = ?) ", new String[] { "1" });
    AppMethodBeat.o(29067);
    return localCursor;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bp
 * JD-Core Version:    0.6.2
 */