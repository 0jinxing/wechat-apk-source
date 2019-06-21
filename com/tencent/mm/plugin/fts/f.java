package com.tencent.mm.plugin.fts;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.List;

public final class f
  implements com.tencent.mm.plugin.fts.a.j
{
  public final ad MU(String paramString)
  {
    AppMethodBeat.i(136566);
    ad localad1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoI(paramString);
    ad localad2 = localad1;
    if (localad1 == null)
    {
      localad2 = new ad();
      paramString = i("SELECT ROWID, username, alias, conRemark, nickname, verifyFlag, type, lvbuff, contactLabelIds FROM rcontact WHERE username = ? AND deleteFlag=0;", new String[] { paramString });
      if (paramString.moveToNext())
      {
        localad2.ewQ = paramString.getLong(0);
        localad2.setUsername(paramString.getString(1));
        localad2.iy(paramString.getString(2));
        localad2.iz(paramString.getString(3));
        localad2.iB(paramString.getString(4));
        localad2.hw(paramString.getInt(5));
        localad2.setType(paramString.getInt(6));
        localad2.H(paramString.getBlob(7));
        localad2.iI(paramString.getString(8));
        localad2.hy(0);
      }
      paramString.close();
    }
    AppMethodBeat.o(136566);
    return localad2;
  }

  public final boolean MV(String paramString)
  {
    AppMethodBeat.i(136567);
    Cursor localCursor = i(String.format("SELECT 1 FROM rconversation WHERE username = ?", new Object[0]), new String[] { paramString });
    try
    {
      boolean bool = localCursor.moveToNext();
      return bool;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
      AppMethodBeat.o(136567);
    }
    throw paramString;
  }

  public final long MW(String paramString)
  {
    AppMethodBeat.i(136568);
    paramString = i("SELECT conversationTime FROM rconversation WHERE username=?;", new String[] { paramString });
    long l1 = 0L;
    long l2 = l1;
    if (paramString != null)
    {
      l2 = l1;
      if (paramString.moveToFirst())
        l2 = paramString.getLong(0);
    }
    if (paramString != null)
      paramString.close();
    AppMethodBeat.o(136568);
    return l2;
  }

  public final List<String> MX(String paramString)
  {
    AppMethodBeat.i(136569);
    ArrayList localArrayList = new ArrayList();
    String str = paramString;
    if (paramString.endsWith(""))
      str = paramString.substring(0, paramString.length() - 1);
    if (str.length() == 0)
      AppMethodBeat.o(136569);
    while (true)
    {
      return localArrayList;
      paramString = i(String.format("SELECT labelName FROM ContactLabel WHERE labelID IN (%s);", new Object[] { str }), null);
      while (paramString.moveToNext())
        localArrayList.add(paramString.getString(0));
      paramString.close();
      AppMethodBeat.o(136569);
    }
  }

  public final Cursor i(String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(136564);
    g.RQ();
    paramString = g.RP().eJO.a(paramString, paramArrayOfString, 2);
    AppMethodBeat.o(136564);
    return paramString;
  }

  public final Cursor rawQuery(String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(136565);
    g.RQ();
    paramString = g.RP().eJO.a(paramString, paramArrayOfString, 0);
    AppMethodBeat.o(136565);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.f
 * JD-Core Version:    0.6.2
 */