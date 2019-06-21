package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.bo;
import junit.framework.Assert;

public final class h extends k
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS facebookfriend ( fbid long  PRIMARY KEY , fbname text  , fbimgkey int  , status int  , username text  , nickname text  , nicknamepyinitial text  , nicknamequanpin text  , sex int  , personalcard int  , province text  , city text  , signature text  , alias text  , type int  , email text  ) " };
  public com.tencent.mm.cd.h fni;

  public h(com.tencent.mm.cd.h paramh)
  {
    this.fni = paramh;
  }

  public final boolean a(g paramg)
  {
    boolean bool1 = true;
    AppMethodBeat.i(108335);
    boolean bool2;
    Object localObject;
    if (paramg.bJt == -1)
    {
      bool2 = true;
      Assert.assertTrue("Func Set always conv_flag == flag_all", bool2);
      long l = paramg.dtU;
      localObject = "select facebookfriend.fbid,facebookfriend.fbname,facebookfriend.fbimgkey,facebookfriend.status,facebookfriend.username,facebookfriend.nickname,facebookfriend.nicknamepyinitial,facebookfriend.nicknamequanpin,facebookfriend.sex,facebookfriend.personalcard,facebookfriend.province,facebookfriend.city,facebookfriend.signature,facebookfriend.alias,facebookfriend.type,facebookfriend.email from facebookfriend   where facebookfriend.fbid = \"" + bo.vA(String.valueOf(l)) + "\"";
      localObject = this.fni.a((String)localObject, null, 2);
      bool2 = ((Cursor)localObject).moveToFirst();
      ((Cursor)localObject).close();
      if (bool2)
        break label146;
      if (paramg == null)
        break label136;
      paramg.bJt = -1;
      paramg = paramg.Hl();
      if ((int)this.fni.insert("facebookfriend", "fbid", paramg) == -1)
        break label136;
      AppMethodBeat.o(108335);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      label136: AppMethodBeat.o(108335);
      bool2 = false;
      continue;
      label146: localObject = paramg.Hl();
      int i = this.fni.update("facebookfriend", (ContentValues)localObject, "fbid=?", new String[] { paramg.dtU });
      if (i > 0)
        doNotify();
      if (i > 0)
      {
        AppMethodBeat.o(108335);
        bool2 = bool1;
      }
      else
      {
        AppMethodBeat.o(108335);
        bool2 = false;
      }
    }
  }

  public final boolean apM()
  {
    AppMethodBeat.i(108336);
    boolean bool = this.fni.hY("facebookfriend", "delete from facebookfriend");
    AppMethodBeat.o(108336);
    return bool;
  }

  public final Cursor wa(String paramString)
  {
    AppMethodBeat.i(108334);
    StringBuilder localStringBuilder = new StringBuilder();
    if ((paramString != null) && (paramString.length() > 0))
    {
      localStringBuilder.append(" where ( ");
      localStringBuilder.append("facebookfriend.fbname like '%" + paramString + "%' or ");
      localStringBuilder.append("facebookfriend.nickname like '%" + paramString + "%' or ");
      localStringBuilder.append("facebookfriend.username like '%" + paramString + "%' ) ");
    }
    paramString = this.fni.a("select facebookfriend.fbid,facebookfriend.fbname,facebookfriend.fbimgkey,facebookfriend.status,facebookfriend.username,facebookfriend.nickname,facebookfriend.nicknamepyinitial,facebookfriend.nicknamequanpin,facebookfriend.sex,facebookfriend.personalcard,facebookfriend.province,facebookfriend.city,facebookfriend.signature,facebookfriend.alias,facebookfriend.type,facebookfriend.email from facebookfriend  " + localStringBuilder.toString() + " order by  case when status = 100 then 0  when status = 102 then 3  when status = 101 then 1 else 2 end  , nicknamepyinitial", null, 0);
    AppMethodBeat.o(108334);
    return paramString;
  }

  public final g wb(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(108337);
    paramString = "select facebookfriend.fbid,facebookfriend.fbname,facebookfriend.fbimgkey,facebookfriend.status,facebookfriend.username,facebookfriend.nickname,facebookfriend.nicknamepyinitial,facebookfriend.nicknamequanpin,facebookfriend.sex,facebookfriend.personalcard,facebookfriend.province,facebookfriend.city,facebookfriend.signature,facebookfriend.alias,facebookfriend.type,facebookfriend.email from facebookfriend   where facebookfriend.username = \"" + paramString + "\"";
    Cursor localCursor = this.fni.a(paramString, null, 2);
    if (localCursor == null)
    {
      AppMethodBeat.o(108337);
      paramString = localObject2;
    }
    while (true)
    {
      return paramString;
      paramString = localObject1;
      if (localCursor.moveToFirst())
      {
        paramString = new g();
        paramString.d(localCursor);
      }
      localCursor.close();
      AppMethodBeat.o(108337);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.h
 * JD-Core Version:    0.6.2
 */