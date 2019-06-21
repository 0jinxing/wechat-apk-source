package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cp;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

public final class bg extends com.tencent.mm.sdk.e.j<bf>
  implements f
{
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(1318);
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(bf.ccO, "LBSVerifyMessage") };
    AppMethodBeat.o(1318);
  }

  public bg(e parame)
  {
    super(parame, bf.ccO, "LBSVerifyMessage", cp.diI);
    this.bSd = parame;
  }

  public final Cursor Mq(int paramInt)
  {
    AppMethodBeat.i(1308);
    Object localObject = "SELECT sayhiencryptuser,max(createtime) createtime FROM " + getTableName() + " where isSend = 0 GROUP BY sayhiencryptuser LIMIT " + paramInt;
    localObject = "SELECT a.* FROM (" + (String)localObject + ") b left join " + getTableName() + " a on b.sayhiencryptuser=a.sayhiencryptuser and b.createtime=a.createtime where a.isSend = 0 ORDER BY a.createtime desc LIMIT " + paramInt;
    localObject = this.bSd.rawQuery((String)localObject, null);
    AppMethodBeat.o(1308);
    return localObject;
  }

  public final void QT(String paramString)
  {
    AppMethodBeat.i(1309);
    paramString = "svrid = '" + paramString + "'";
    int i = this.bSd.delete(getTableName(), paramString, null);
    if (i > 0)
      doNotify();
    ab.i("MicroMsg.LBSVerifyMessageStorage", "delBySvrId = ".concat(String.valueOf(i)));
    AppMethodBeat.o(1309);
  }

  public final void QU(String paramString)
  {
    AppMethodBeat.i(1310);
    paramString = "sayhiuser = '" + paramString + "' or sayhiencryptuser='" + paramString + "'";
    int i = this.bSd.delete(getTableName(), paramString, null);
    if (i > 0)
      doNotify();
    ab.i("MicroMsg.LBSVerifyMessageStorage", "delByUserName = ".concat(String.valueOf(i)));
    AppMethodBeat.o(1310);
  }

  public final long QV(String paramString)
  {
    AppMethodBeat.i(1316);
    Cursor localCursor;
    if (paramString != null)
    {
      paramString = (bg)((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOo();
      localCursor = paramString.bSd.a("SELECT * FROM " + paramString.getTableName() + " ORDER BY createtime DESC LIMIT 1", null, 2);
      if (localCursor == null)
      {
        paramString = null;
        if (paramString == null)
          break label154;
      }
    }
    label154: for (long l1 = paramString.field_createtime + 1L; ; l1 = 0L)
    {
      long l2 = bo.anT();
      if (l1 > l2)
        AppMethodBeat.o(1316);
      while (true)
      {
        return l1;
        if (!localCursor.moveToFirst())
        {
          localCursor.close();
          paramString = null;
          break;
        }
        paramString = new bf();
        paramString.d(localCursor);
        localCursor.close();
        break;
        AppMethodBeat.o(1316);
        l1 = l2;
      }
    }
  }

  public final boolean a(bf parambf)
  {
    boolean bool = false;
    AppMethodBeat.i(1312);
    if (parambf == null)
    {
      ab.e("MicroMsg.LBSVerifyMessageStorage", "insert fail, lbsMsg is null");
      AppMethodBeat.o(1312);
    }
    while (true)
    {
      return bool;
      if (super.b(parambf))
      {
        anF(parambf.xDa);
        bool = true;
        AppMethodBeat.o(1312);
      }
      else
      {
        AppMethodBeat.o(1312);
      }
    }
  }

  public final bf apA(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(1314);
    ab.d("MicroMsg.LBSVerifyMessageStorage", "getLBSVerifyMessage");
    paramString = "select *, rowid from LBSVerifyMessage  where (sayhiuser = '" + bo.vA(paramString) + "' or sayhiencryptuser = '" + bo.vA(paramString) + "') and flag=1 order by createtime DESC limit 1";
    Cursor localCursor = this.bSd.a(paramString, null, 2);
    if (localCursor.moveToFirst())
    {
      paramString = new bf();
      paramString.d(localCursor);
    }
    while (true)
    {
      localCursor.close();
      AppMethodBeat.o(1314);
      return paramString;
      ab.i("MicroMsg.LBSVerifyMessageStorage", "getLBSVerifyMessage, cursor count = 0");
      paramString = localObject;
    }
  }

  public final bf[] apz(String paramString)
  {
    AppMethodBeat.i(1313);
    ab.d("MicroMsg.LBSVerifyMessageStorage", "getLastLBSVerifyMessage");
    paramString = "select *, rowid from LBSVerifyMessage  where sayhiuser = '" + bo.vA(paramString) + "' or sayhiencryptuser = '" + bo.vA(paramString) + "' order by createtime DESC limit 3";
    Cursor localCursor = this.bSd.a(paramString, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (localCursor.moveToNext())
    {
      paramString = new bf();
      paramString.d(localCursor);
      localArrayList.add(paramString);
    }
    localCursor.close();
    paramString = (bf[])localArrayList.toArray(new bf[localArrayList.size()]);
    AppMethodBeat.o(1313);
    return paramString;
  }

  public final void axQ()
  {
    AppMethodBeat.i(1311);
    this.bSd.delete(getTableName(), null, null);
    AppMethodBeat.o(1311);
  }

  public final bf bOx()
  {
    bf localbf = null;
    AppMethodBeat.i(1306);
    Cursor localCursor = this.bSd.a("SELECT * FROM " + getTableName() + " where status != 4 ORDER BY createtime DESC LIMIT 1", null, 2);
    if (localCursor == null)
      AppMethodBeat.o(1306);
    while (true)
    {
      return localbf;
      if (!localCursor.moveToFirst())
      {
        localCursor.close();
        AppMethodBeat.o(1306);
      }
      else
      {
        localbf = new bf();
        localbf.d(localCursor);
        localCursor.close();
        AppMethodBeat.o(1306);
      }
    }
  }

  public final int baS()
  {
    int i = 0;
    AppMethodBeat.i(1304);
    Cursor localCursor = this.bSd.a("select count(*) from " + getTableName() + " where status != 4", null, 2);
    if (!localCursor.moveToFirst())
    {
      localCursor.close();
      AppMethodBeat.o(1304);
    }
    while (true)
    {
      return i;
      i = localCursor.getInt(0);
      localCursor.close();
      AppMethodBeat.o(1304);
    }
  }

  public final bf[] er(String paramString, int paramInt)
  {
    Cursor localCursor = null;
    AppMethodBeat.i(1315);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.LBSVerifyMessageStorage", "getLastRecvLbsMsg fail, talker is null");
      AppMethodBeat.o(1315);
      paramString = localCursor;
    }
    while (true)
    {
      return paramString;
      paramString = "select * from LBSVerifyMessage where isSend = 0 and (sayhiuser = '" + bo.vA(paramString) + "' or sayhiencryptuser = '" + bo.vA(paramString) + "') order by createTime DESC limit " + paramInt;
      localCursor = this.bSd.a(paramString, null, 2);
      ArrayList localArrayList = new ArrayList();
      while (localCursor.moveToNext())
      {
        paramString = new bf();
        paramString.d(localCursor);
        localArrayList.add(paramString);
      }
      localCursor.close();
      paramString = (bf[])localArrayList.toArray(new bf[localArrayList.size()]);
      AppMethodBeat.o(1315);
    }
  }

  public final int getCount()
  {
    int i = 0;
    AppMethodBeat.i(1305);
    Cursor localCursor = this.bSd.a("select count(*) from " + getTableName(), null, 2);
    if (localCursor.moveToFirst())
      i = localCursor.getInt(0);
    localCursor.close();
    AppMethodBeat.o(1305);
    return i;
  }

  public final Cursor xm(int paramInt)
  {
    AppMethodBeat.i(1307);
    Object localObject = "SELECT * FROM " + getTableName() + " where isSend = 0 ORDER BY createtime desc LIMIT " + paramInt;
    localObject = this.bSd.rawQuery((String)localObject, null);
    AppMethodBeat.o(1307);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bg
 * JD-Core Version:    0.6.2
 */