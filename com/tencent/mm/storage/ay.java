package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

public final class ay extends j<ax>
  implements com.tencent.mm.plugin.messenger.foundation.a.a.e
{
  public static final String[] fnj;
  private static final String[] xIq;
  public com.tencent.mm.sdk.e.e bSd;

  static
  {
    AppMethodBeat.i(1302);
    fnj = new String[] { j.a(ax.ccO, "fmessage_msginfo") };
    xIq = new String[] { "CREATE INDEX IF NOT EXISTS  fmessageTalkerIndex ON fmessage_msginfo ( talker )" };
    AppMethodBeat.o(1302);
  }

  public ay(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, ax.ccO, "fmessage_msginfo", xIq);
    this.bSd = parame;
  }

  public final boolean QS(String paramString)
  {
    AppMethodBeat.i(1300);
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.FMessageMsgInfoStorage", "deleteByTalker fail, talker is null");
      bool = false;
      AppMethodBeat.o(1300);
    }
    while (true)
    {
      return bool;
      paramString = "delete from fmessage_msginfo where talker = '" + bo.vA(paramString) + "'";
      bool = this.bSd.hY("fmessage_msginfo", paramString);
      AppMethodBeat.o(1300);
    }
  }

  public final ax[] apv(String paramString)
  {
    AppMethodBeat.i(1294);
    ab.d("MicroMsg.FMessageMsgInfoStorage", "getLastFMessageMsgInfo");
    paramString = "select *, rowid from fmessage_msginfo  where talker = '" + bo.vA(paramString) + "' order by createTime DESC limit 3";
    Cursor localCursor = this.bSd.a(paramString, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (localCursor.moveToNext())
    {
      paramString = new ax();
      paramString.d(localCursor);
      localArrayList.add(paramString);
    }
    localCursor.close();
    paramString = (ax[])localArrayList.toArray(new ax[localArrayList.size()]);
    AppMethodBeat.o(1294);
    return paramString;
  }

  public final ax apw(String paramString)
  {
    Cursor localCursor = null;
    AppMethodBeat.i(1295);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.FMessageMsgInfoStorage", "getLastFMsg fail, talker is null");
      AppMethodBeat.o(1295);
      paramString = localCursor;
    }
    while (true)
    {
      return paramString;
      paramString = "select * from fmessage_msginfo where talker = '" + bo.vA(paramString) + "' order by createTime DESC limit 1";
      localCursor = this.bSd.a(paramString, null, 2);
      paramString = new ax();
      if (localCursor.moveToFirst())
        paramString.d(localCursor);
      localCursor.close();
      AppMethodBeat.o(1295);
    }
  }

  public final ax apx(String paramString)
  {
    AppMethodBeat.i(1296);
    paramString = eq(paramString, 1);
    if ((paramString != null) && (paramString.length > 0))
    {
      paramString = paramString[0];
      AppMethodBeat.o(1296);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(1296);
    }
  }

  public final boolean b(ax paramax)
  {
    boolean bool = false;
    AppMethodBeat.i(1298);
    if (paramax == null)
    {
      ab.e("MicroMsg.FMessageMsgInfoStorage", "insert fail, fmsgInfo is null");
      AppMethodBeat.o(1298);
    }
    while (true)
    {
      return bool;
      if (super.b(paramax))
      {
        anF(paramax.xDa);
        bool = true;
        AppMethodBeat.o(1298);
      }
      else
      {
        AppMethodBeat.o(1298);
      }
    }
  }

  public final List<ax> bOw()
  {
    AppMethodBeat.i(1299);
    ab.d("MicroMsg.FMessageMsgInfoStorage", "getFMsgByType, type = 0");
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.bSd.a("select *, rowid from fmessage_msginfo where type = 0", null, 2);
    while (localCursor.moveToNext())
    {
      ax localax = new ax();
      localax.d(localCursor);
      localArrayList.add(localax);
    }
    localCursor.close();
    ab.d("MicroMsg.FMessageMsgInfoStorage", "getFMsgByType, size = " + localArrayList.size());
    AppMethodBeat.o(1299);
    return localArrayList;
  }

  public final ax[] eq(String paramString, int paramInt)
  {
    ArrayList localArrayList = null;
    AppMethodBeat.i(1297);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.FMessageMsgInfoStorage", "getLastRecvFMsg fail, talker is null");
      AppMethodBeat.o(1297);
      paramString = localArrayList;
    }
    while (true)
    {
      return paramString;
      paramString = "select * from fmessage_msginfo where isSend != 1 and talker = '" + bo.vA(paramString) + "' order by createTime DESC limit " + paramInt;
      paramString = this.bSd.a(paramString, null, 2);
      localArrayList = new ArrayList();
      while (paramString.moveToNext())
      {
        ax localax = new ax();
        localax.d(paramString);
        localArrayList.add(localax);
      }
      paramString.close();
      paramString = (ax[])localArrayList.toArray(new ax[localArrayList.size()]);
      AppMethodBeat.o(1297);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ay
 * JD-Core Version:    0.6.2
 */