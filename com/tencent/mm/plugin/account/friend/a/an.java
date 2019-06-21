package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.ab;
import junit.framework.Assert;

public final class an extends k
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS qqgroup ( grouopid int PRIMARY KEY,membernum int,weixinnum int,insert_time int,lastupdate_time int,needupdate int,updatekey text,groupname text,reserved1 text ,reserved2 text ,reserved3 int ,reserved4 int )" };
  public final h fni;

  public an(h paramh)
  {
    this.fni = paramh;
  }

  public final boolean a(am paramam)
  {
    boolean bool1 = false;
    AppMethodBeat.i(108497);
    boolean bool2;
    ContentValues localContentValues;
    if (paramam != null)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      localContentValues = paramam.aqk();
      if (localContentValues.size() > 0)
        break label52;
      ab.e("MicroMsg.QQGroupStorage", "update failed, no values set");
      AppMethodBeat.o(108497);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      label52: if (this.fni.update("qqgroup", localContentValues, "grouopid= ?", new String[] { paramam.gwu }) <= 0)
      {
        AppMethodBeat.o(108497);
        bool2 = bool1;
      }
      else
      {
        doNotify();
        AppMethodBeat.o(108497);
        bool2 = true;
      }
    }
  }

  public final am mY(int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(108496);
    Cursor localCursor = this.fni.a("select qqgroup.grouopid,qqgroup.membernum,qqgroup.weixinnum,qqgroup.insert_time,qqgroup.lastupdate_time,qqgroup.needupdate,qqgroup.updatekey,qqgroup.groupname from qqgroup  where grouopid = ".concat(String.valueOf(paramInt)), null, 2);
    if (localCursor == null)
      AppMethodBeat.o(108496);
    while (true)
    {
      return localObject2;
      localObject2 = localObject1;
      if (localCursor.moveToFirst())
      {
        localObject2 = new am();
        ((am)localObject2).d(localCursor);
      }
      localCursor.close();
      AppMethodBeat.o(108496);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.an
 * JD-Core Version:    0.6.2
 */