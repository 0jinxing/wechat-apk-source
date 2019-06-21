package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class ca extends j<bz>
{
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(29075);
    fnj = new String[] { j.a(bz.ccO, "UserOpenIdInApp") };
    AppMethodBeat.o(29075);
  }

  public ca(e parame)
  {
    super(parame, bz.ccO, "UserOpenIdInApp", null);
    AppMethodBeat.i(29071);
    this.bSd = parame;
    parame.hY("UserOpenIdInApp", "CREATE INDEX IF NOT EXISTS userOpenIdInAppAppIdUsernameIndex ON UserOpenIdInApp ( appId,username )");
    parame.hY("UserOpenIdInApp", "CREATE INDEX IF NOT EXISTS userOpenIdInAppOpenIdIndex ON UserOpenIdInApp ( openId )");
    AppMethodBeat.o(29071);
  }

  public final boolean a(bz parambz)
  {
    AppMethodBeat.i(29073);
    if ((parambz == null) || (bo.isNullOrNil(parambz.field_appId)) || (bo.isNullOrNil(parambz.field_openId)) || (bo.isNullOrNil(parambz.field_username)))
    {
      ab.w("MicroMsg.scanner.UserOpenIdInAppStorage", "wrong argument");
      AppMethodBeat.o(29073);
      bool = false;
      return bool;
    }
    ContentValues localContentValues = parambz.Hl();
    if (this.bSd.replace("UserOpenIdInApp", bz.ccO.xDc, localContentValues) > 0L);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.scanner.UserOpenIdInAppStorage", "replace: appId=%s, username=%s, ret=%s ", new Object[] { parambz.field_appId, parambz.field_username, Boolean.valueOf(bool) });
      AppMethodBeat.o(29073);
      break;
    }
  }

  public final bz apZ(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(29072);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      AppMethodBeat.o(29072);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      Cursor localCursor = this.bSd.a("UserOpenIdInApp", null, "openId=?", new String[] { bo.vA(paramString) }, null, null, null, 2);
      if (!localCursor.moveToFirst())
      {
        ab.w("MicroMsg.scanner.UserOpenIdInAppStorage", "get null with openId:".concat(String.valueOf(paramString)));
        localCursor.close();
        AppMethodBeat.o(29072);
        paramString = localObject;
      }
      else
      {
        paramString = new bz();
        paramString.d(localCursor);
        localCursor.close();
        AppMethodBeat.o(29072);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ca
 * JD-Core Version:    0.6.2
 */