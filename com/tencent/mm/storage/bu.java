package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.l;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

public final class bu extends com.tencent.mm.sdk.e.j<bt>
  implements l
{
  public static final String[] diI;
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(1472);
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(bt.ccO, "shakeverifymessage") };
    diI = new String[] { "CREATE INDEX IF NOT EXISTS  shakeverifymessage_unread_index ON shakeverifymessage ( status )", "CREATE INDEX IF NOT EXISTS shakeverifymessage_statusIndex ON shakeverifymessage ( status )", "CREATE INDEX IF NOT EXISTS shakeverifymessage_createtimeIndex ON shakeverifymessage ( createtime )" };
    AppMethodBeat.o(1472);
  }

  public bu(e parame)
  {
    super(parame, bt.ccO, "shakeverifymessage", diI);
    this.bSd = parame;
  }

  public final void QT(String paramString)
  {
    AppMethodBeat.i(1465);
    paramString = "svrid = '" + paramString + "'";
    int i = this.bSd.delete(getTableName(), paramString, null);
    if (i > 0)
      doNotify();
    ab.i("MicroMsg.ShakeVerifyMessageStorage", "delBySvrId = ".concat(String.valueOf(i)));
    AppMethodBeat.o(1465);
  }

  public final long QV(String paramString)
  {
    AppMethodBeat.i(1470);
    if (paramString != null)
    {
      paramString = ((bu)((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOn()).duu();
      if (paramString == null);
    }
    for (long l1 = paramString.field_createtime + 1L; ; l1 = 0L)
    {
      long l2 = bo.anT();
      if (l1 > l2)
        AppMethodBeat.o(1470);
      while (true)
      {
        return l1;
        AppMethodBeat.o(1470);
        l1 = l2;
      }
    }
  }

  public final boolean a(bt parambt)
  {
    boolean bool = false;
    AppMethodBeat.i(1467);
    if (parambt == null)
    {
      ab.e("MicroMsg.ShakeVerifyMessageStorage", "insert fail, shakeMsg is null");
      AppMethodBeat.o(1467);
    }
    while (true)
    {
      return bool;
      if (super.b(parambt))
      {
        anF(parambt.xDa);
        bool = true;
        AppMethodBeat.o(1467);
      }
      else
      {
        AppMethodBeat.o(1467);
      }
    }
  }

  public final bt[] apY(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(1469);
    ab.d("MicroMsg.ShakeVerifyMessageStorage", "getLastShakeVerifyMessage");
    paramString = "select *, rowid from ShakeVerifyMessage  where sayhiuser = '" + bo.vA(paramString) + "' order by createtime DESC limit 3";
    paramString = this.bSd.a(paramString, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (paramString.moveToNext())
    {
      bt localbt = new bt();
      localbt.d(paramString);
      localArrayList.add(localbt);
    }
    paramString.close();
    if (localArrayList.size() == 0)
    {
      AppMethodBeat.o(1469);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = (bt[])localArrayList.toArray(new bt[localArrayList.size()]);
      AppMethodBeat.o(1469);
    }
  }

  public final void axQ()
  {
    AppMethodBeat.i(1466);
    this.bSd.delete(getTableName(), null, null);
    AppMethodBeat.o(1466);
  }

  public final int baS()
  {
    int i = 0;
    AppMethodBeat.i(1461);
    Cursor localCursor = this.bSd.a("select count(*) from " + getTableName() + " where status != 4", null, 2);
    int j;
    if (!localCursor.moveToFirst())
    {
      localCursor.close();
      AppMethodBeat.o(1461);
      j = i;
    }
    while (true)
    {
      return j;
      j = localCursor.getInt(0);
      localCursor.close();
      if (j > 0)
      {
        AppMethodBeat.o(1461);
      }
      else
      {
        AppMethodBeat.o(1461);
        j = i;
      }
    }
  }

  public final bt duu()
  {
    bt localbt = null;
    AppMethodBeat.i(1463);
    Cursor localCursor = this.bSd.a("SELECT * FROM " + getTableName() + " ORDER BY createtime DESC LIMIT 1", null, 2);
    if (localCursor == null)
      AppMethodBeat.o(1463);
    while (true)
    {
      return localbt;
      if (!localCursor.moveToFirst())
      {
        localCursor.close();
        AppMethodBeat.o(1463);
      }
      else
      {
        localbt = new bt();
        localbt.d(localCursor);
        localCursor.close();
        AppMethodBeat.o(1463);
      }
    }
  }

  public final bt[] et(String paramString, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(1468);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.ShakeVerifyMessageStorage", "getLastRecvShakeMsg fail, talker is null");
      AppMethodBeat.o(1468);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = "select * from ShakeVerifyMessage where isSend = 0 and sayhiuser = '" + bo.vA(paramString) + "' order by createTime DESC limit " + paramInt;
      paramString = this.bSd.a(paramString, null, 2);
      ArrayList localArrayList = new ArrayList();
      while (paramString.moveToNext())
      {
        bt localbt = new bt();
        localbt.d(paramString);
        localArrayList.add(localbt);
      }
      paramString.close();
      if (localArrayList.size() == 0)
      {
        AppMethodBeat.o(1468);
        paramString = localObject;
      }
      else
      {
        paramString = (bt[])localArrayList.toArray(new bt[localArrayList.size()]);
        AppMethodBeat.o(1468);
      }
    }
  }

  public final int getCount()
  {
    int i = 0;
    AppMethodBeat.i(1462);
    Cursor localCursor = this.bSd.a("select count(*) from " + getTableName(), null, 2);
    int j;
    if (!localCursor.moveToFirst())
    {
      localCursor.close();
      AppMethodBeat.o(1462);
      j = i;
    }
    while (true)
    {
      return j;
      j = localCursor.getInt(0);
      localCursor.close();
      if (j > 0)
      {
        AppMethodBeat.o(1462);
      }
      else
      {
        AppMethodBeat.o(1462);
        j = i;
      }
    }
  }

  public final Cursor xm(int paramInt)
  {
    AppMethodBeat.i(1464);
    Object localObject = "SELECT * FROM " + getTableName() + " where isSend = 0 ORDER BY createtime desc LIMIT " + paramInt;
    localObject = this.bSd.rawQuery((String)localObject, null);
    AppMethodBeat.o(1464);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bu
 * JD-Core Version:    0.6.2
 */