package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.platformtools.ab;

public final class ap extends n
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS qqlist ( qq long  PRIMARY KEY , wexinstatus int  , groupid int  , username text  , nickname text  , pyinitial text  , quanpin text  , qqnickname text  , qqpyinitial text  , qqquanpin text  , qqremark text  , qqremarkpyinitial text  , qqremarkquanpin text  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) ", "CREATE INDEX IF NOT EXISTS groupid_index ON qqlist ( groupid ) ", "CREATE INDEX IF NOT EXISTS qq_index ON qqlist ( qq ) " };
  public final h fni;

  public ap(h paramh)
  {
    this.fni = paramh;
  }

  public final Cursor E(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(108503);
    Object localObject;
    String[] arrayOfString;
    if (paramBoolean)
    {
      localObject = "select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.groupid=?  order by reserved3";
      arrayOfString = new String[1];
      arrayOfString[0] = String.valueOf(paramInt);
    }
    while (true)
    {
      localObject = this.fni.a((String)localObject, arrayOfString, 0);
      AppMethodBeat.o(108503);
      return localObject;
      localObject = "select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.groupid=? and (wexinstatus=? or wexinstatus=?) order by reserved3";
      arrayOfString = new String[3];
      arrayOfString[0] = String.valueOf(paramInt);
      arrayOfString[1] = "1";
      arrayOfString[2] = "2";
    }
  }

  public final int a(long paramLong, ao paramao)
  {
    int i = 0;
    AppMethodBeat.i(108507);
    paramao = paramao.aqn();
    if (paramao.size() > 0)
      i = this.fni.update("qqlist", paramao, "qq=?", new String[] { String.valueOf(paramLong) });
    if (i > 0)
      b(3, this, String.valueOf(paramLong));
    AppMethodBeat.o(108507);
    return i;
  }

  public final boolean a(ao paramao)
  {
    boolean bool = false;
    AppMethodBeat.i(108508);
    if (paramao == null)
      AppMethodBeat.o(108508);
    while (true)
    {
      return bool;
      ab.d("MicroMsg.QQListStorage", "insert: name:" + paramao.aqo());
      paramao.bJt = -1;
      ContentValues localContentValues = paramao.aqn();
      if ((int)this.fni.insert("qqlist", "qq", localContentValues) != -1)
      {
        b(2, this, paramao.gwC);
        bool = true;
        AppMethodBeat.o(108508);
      }
      else
      {
        AppMethodBeat.o(108508);
      }
    }
  }

  public final boolean apK()
  {
    boolean bool = true;
    AppMethodBeat.i(108509);
    Object localObject;
    if ((this.fni == null) || (this.fni.dpU()))
      if (this.fni == null)
      {
        localObject = "null";
        ab.w("MicroMsg.QQListStorage", "shouldProcessEvent db is close :%s", new Object[] { localObject });
        AppMethodBeat.o(108509);
        bool = false;
      }
    while (true)
    {
      return bool;
      localObject = Boolean.valueOf(this.fni.dpU());
      break;
      AppMethodBeat.o(108509);
    }
  }

  public final Cursor c(int paramInt, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(108504);
    ab.d("MicroMsg.QQListStorage", "getByGroupID: GroupID:" + paramInt + ", searchby:" + paramString);
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramBoolean)
      localStringBuilder.append("select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.groupid = \"" + paramInt + "\" and ( ");
    while (true)
    {
      localStringBuilder.append("qqlist.qq like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.username like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.nickname like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.pyinitial like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.quanpin like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.qqnickname like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.qqpyinitial like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.qqquanpin like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.qqremark like '%" + paramString + "%' )");
      localStringBuilder.append(" order by reserved3");
      paramString = this.fni.a(localStringBuilder.toString(), null, 0);
      AppMethodBeat.o(108504);
      return paramString;
      localStringBuilder.append("select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.groupid = \"" + paramInt + "\" and (wexinstatus =\"1\" or wexinstatus =\"2\") and ( ");
    }
  }

  public final ao ge(long paramLong)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(108505);
    Object localObject3 = "select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.qq = \"" + paramLong + "\"";
    localObject3 = this.fni.a((String)localObject3, null, 2);
    if (localObject3 == null)
      AppMethodBeat.o(108505);
    while (true)
    {
      return localObject2;
      localObject2 = localObject1;
      if (((Cursor)localObject3).moveToFirst())
      {
        localObject2 = new ao();
        ((ao)localObject2).d((Cursor)localObject3);
      }
      ((Cursor)localObject3).close();
      AppMethodBeat.o(108505);
    }
  }

  public final boolean mZ(int paramInt)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(108510);
    Object localObject1 = null;
    Object localObject2 = null;
    try
    {
      Cursor localCursor = this.fni.a("select reserved3 from qqlist where groupid=? and reserved3=?  limit 1", new String[] { String.valueOf(paramInt), "0" }, 2);
      boolean bool3 = bool2;
      if (localCursor != null)
      {
        localObject2 = localCursor;
        localObject1 = localCursor;
        boolean bool4 = localCursor.moveToFirst();
        bool3 = bool2;
        if (bool4)
          bool3 = true;
      }
      bool2 = bool3;
      if (localCursor != null)
      {
        localCursor.close();
        bool2 = bool3;
      }
      AppMethodBeat.o(108510);
      return bool2;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject1 = localObject2;
        ab.e("MicroMsg.QQListStorage", "[cpan] check qq list show head faild.:%s", new Object[] { localException.toString() });
        bool2 = bool1;
        if (localObject2 != null)
        {
          localObject2.close();
          bool2 = bool1;
        }
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(108510);
    }
  }

  public final ao wj(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(108506);
    paramString = "select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.username = \"" + paramString + "\"";
    Cursor localCursor = this.fni.a(paramString, null, 2);
    if (localCursor == null)
    {
      AppMethodBeat.o(108506);
      paramString = localObject2;
    }
    while (true)
    {
      return paramString;
      paramString = localObject1;
      if (localCursor.moveToFirst())
      {
        paramString = new ao();
        paramString.d(localCursor);
      }
      localCursor.close();
      AppMethodBeat.o(108506);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.ap
 * JD-Core Version:    0.6.2
 */