package com.tencent.mm.ba;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.bo;
import junit.framework.Assert;

public final class b extends k
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS chattingbginfo ( username text  PRIMARY KEY , bgflag int  , path text  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) " };
  public h fni;

  public b(h paramh)
  {
    this.fni = paramh;
  }

  public final boolean a(a parama)
  {
    AppMethodBeat.i(78433);
    parama.bJt = -1;
    ContentValues localContentValues = parama.Hl();
    boolean bool;
    if ((int)this.fni.insert("chattingbginfo", "username", localContentValues) != -1)
    {
      anF(parama.getUsername());
      bool = true;
      AppMethodBeat.o(78433);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(78433);
    }
  }

  public final boolean b(a parama)
  {
    boolean bool1 = true;
    AppMethodBeat.i(78434);
    if (parama != null)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      ContentValues localContentValues = parama.Hl();
      if (localContentValues.size() <= 0)
        break label80;
      if (this.fni.update("chattingbginfo", localContentValues, "username= ?", new String[] { parama.getUsername() }) <= 0)
        break label80;
      anF(parama.getUsername());
      AppMethodBeat.o(78434);
    }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      bool2 = false;
      break;
      label80: AppMethodBeat.o(78434);
    }
  }

  public final a sU(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(78435);
    paramString = "select chattingbginfo.username,chattingbginfo.bgflag,chattingbginfo.path,chattingbginfo.reserved1,chattingbginfo.reserved2,chattingbginfo.reserved3,chattingbginfo.reserved4 from chattingbginfo   where chattingbginfo.username = \"" + bo.vA(String.valueOf(paramString)) + "\"";
    Cursor localCursor = this.fni.a(paramString, null, 2);
    if (localCursor == null)
    {
      AppMethodBeat.o(78435);
      paramString = localObject2;
    }
    while (true)
    {
      return paramString;
      paramString = localObject1;
      if (localCursor.moveToFirst())
      {
        paramString = new a();
        paramString.d(localCursor);
      }
      localCursor.close();
      AppMethodBeat.o(78435);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ba.b
 * JD-Core Version:    0.6.2
 */