package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bm;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

public final class k extends com.tencent.mm.sdk.e.k
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS friend_ext ( username text  PRIMARY KEY , sex int  , personalcard int  , province text  , city text  , signature text  , reserved1 text  , reserved2 text  , reserved3 text  , reserved4 text  , reserved5 int  , reserved6 int  , reserved7 int  , reserved8 int  ) " };
  public h fni;

  public k(h paramh)
  {
    this.fni = paramh;
  }

  public final boolean a(j paramj)
  {
    boolean bool1 = true;
    AppMethodBeat.i(108358);
    Object localObject = paramj.getUsername();
    localObject = "select friend_ext.username,friend_ext.sex,friend_ext.personalcard,friend_ext.province,friend_ext.city,friend_ext.signature from friend_ext   where friend_ext.username = \"" + bo.vA(String.valueOf(localObject)) + "\"";
    localObject = this.fni.a((String)localObject, null, 2);
    boolean bool2 = ((Cursor)localObject).moveToFirst();
    ((Cursor)localObject).close();
    if (bool2)
      if (paramj != null)
      {
        paramj = paramj.Hl();
        if (paramj.size() <= 0)
          break label166;
      }
    label166: for (int i = this.fni.update("friend_ext", paramj, "username=?", new String[] { "username" }); ; i = 0)
    {
      if (i > 0);
      while (true)
      {
        doNotify();
        AppMethodBeat.o(108358);
        return bool1;
        bool1 = false;
        continue;
        if (paramj != null)
        {
          paramj.bJt = -1;
          paramj = paramj.Hl();
          if ((int)this.fni.insert("friend_ext", "username", paramj) != -1);
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }

  public final boolean aa(List<j> paramList)
  {
    boolean bool = false;
    AppMethodBeat.i(108359);
    if (paramList.size() <= 0)
      AppMethodBeat.o(108359);
    while (true)
    {
      return bool;
      bm localbm = new bm("MicroMsg.FriendExtStorage", "batchSetFriendExt transaction");
      localbm.addSplit("transation begin");
      long l = this.fni.iV(Thread.currentThread().getId());
      int i = 0;
      try
      {
        while (i < paramList.size())
        {
          j localj = (j)paramList.get(i);
          if (localj != null)
            a(localj);
          i++;
        }
        bool = true;
        this.fni.mB(l);
        localbm.addSplit("transation end");
        localbm.dumpToLog();
        doNotify();
        AppMethodBeat.o(108359);
      }
      catch (Exception paramList)
      {
        while (true)
        {
          ab.e("MicroMsg.FriendExtStorage", paramList.getMessage());
          bool = false;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.k
 * JD-Core Version:    0.6.2
 */