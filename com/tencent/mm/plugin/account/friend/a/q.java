package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.bo;

public final class q extends k
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS invitefriendopen ( username text  PRIMARY KEY , friendtype int  , updatetime int  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  ) " };
  private h fni;

  public q(h paramh)
  {
    this.fni = paramh;
  }

  private boolean a(p paramp)
  {
    boolean bool = false;
    AppMethodBeat.i(108402);
    if (paramp == null)
      AppMethodBeat.o(108402);
    while (true)
    {
      return bool;
      paramp.bJt = -1;
      paramp = paramp.Hl();
      if ((int)this.fni.insert("invitefriendopen", "username", paramp) != -1)
      {
        bool = true;
        AppMethodBeat.o(108402);
      }
      else
      {
        AppMethodBeat.o(108402);
      }
    }
  }

  private boolean c(p paramp)
  {
    boolean bool = true;
    AppMethodBeat.i(108404);
    paramp.bJt = -1;
    ContentValues localContentValues = paramp.Hl();
    if (this.fni.update("invitefriendopen", localContentValues, "username=?", new String[] { paramp.getUsername() }) > 0)
      AppMethodBeat.o(108404);
    while (true)
    {
      return bool;
      AppMethodBeat.o(108404);
      bool = false;
    }
  }

  public final boolean b(p paramp)
  {
    AppMethodBeat.i(108403);
    boolean bool;
    if (wi(paramp.getUsername()))
    {
      bool = c(paramp);
      AppMethodBeat.o(108403);
    }
    while (true)
    {
      return bool;
      bool = a(paramp);
      AppMethodBeat.o(108403);
    }
  }

  public final boolean wi(String paramString)
  {
    AppMethodBeat.i(108405);
    paramString = "select invitefriendopen.username,invitefriendopen.friendtype,invitefriendopen.updatetime,invitefriendopen.reserved1,invitefriendopen.reserved2,invitefriendopen.reserved3,invitefriendopen.reserved4 from invitefriendopen   where invitefriendopen.username = \"" + bo.vA(String.valueOf(paramString)) + "\"";
    paramString = this.fni.a(paramString, null, 2);
    boolean bool = paramString.moveToFirst();
    paramString.close();
    AppMethodBeat.o(108405);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.q
 * JD-Core Version:    0.6.2
 */