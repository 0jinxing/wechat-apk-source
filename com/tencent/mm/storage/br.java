package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.g;
import com.tencent.mm.cd.g.a;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class br extends com.tencent.mm.sdk.e.k
  implements g.a, com.tencent.mm.plugin.messenger.foundation.a.a.k
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS role_info ( id TEXT PRIMARY KEY, name TEXT, status INT, text_reserved1 TEXT, text_reserved2 TEXT, text_reserved3 TEXT, text_reserved4 TEXT, int_reserved1 INT, int_reserved2 INT, int_reserved3 INT, int_reserved4 INT )" };
  private e bSd = null;

  public br(h paramh)
  {
    this.bSd = paramh;
  }

  private void a(bq parambq)
  {
    AppMethodBeat.i(1454);
    parambq.bJt = 135;
    parambq = parambq.Hl();
    if ((parambq.size() > 0) && (this.bSd.insert("role_info", "id", parambq) != 0L))
      doNotify();
    AppMethodBeat.o(1454);
  }

  private bq apU(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(1452);
    if ((paramString != null) && (paramString.length() > 0));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      bq localbq = new bq();
      Cursor localCursor = this.bSd.a("role_info", null, "name= ?", new String[] { paramString }, null, null, null, 2);
      paramString = localObject;
      if (localCursor.moveToFirst())
      {
        localbq.d(localCursor);
        paramString = localbq;
      }
      localCursor.close();
      AppMethodBeat.o(1452);
      return paramString;
    }
  }

  private void b(bq parambq)
  {
    AppMethodBeat.i(1459);
    ContentValues localContentValues = parambq.Hl();
    if (localContentValues.size() > 0)
    {
      int i = this.bSd.update("role_info", localContentValues, "name like ?", new String[] { parambq.name });
      ab.d("MicroMsg.RoleStorage", "update role info, name=" + parambq.name + ", res:" + i);
      if (i > 0)
        doNotify();
    }
    AppMethodBeat.o(1459);
  }

  public final bq RA(String paramString)
  {
    Object localObject = null;
    bq localbq = null;
    AppMethodBeat.i(1451);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      AppMethodBeat.o(1451);
      paramString = localbq;
    }
    while (true)
    {
      return paramString;
      localbq = new bq();
      Cursor localCursor = this.bSd.a("role_info", null, "name LIKE ?", new String[] { "%".concat(String.valueOf(paramString)) }, null, null, null, 2);
      paramString = localObject;
      if (localCursor.moveToFirst())
      {
        localbq.d(localCursor);
        paramString = localbq;
      }
      localCursor.close();
      AppMethodBeat.o(1451);
    }
  }

  public final int a(g paramg)
  {
    this.bSd = paramg;
    return 0;
  }

  public final void aT(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(1457);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.RoleStorage", "insert role info failed: empty user");
      AppMethodBeat.o(1457);
    }
    while (true)
    {
      return;
      bq localbq = apU(paramString);
      if (localbq == null)
      {
        a(new bq(paramString, paramBoolean, 2));
        ab.d("MicroMsg.RoleStorage", "insert new role, user=".concat(String.valueOf(paramString)));
        AppMethodBeat.o(1457);
      }
      else
      {
        localbq.setEnable(paramBoolean);
        localbq.bJt = 4;
        b(localbq);
        AppMethodBeat.o(1457);
      }
    }
  }

  public final List<bq> bOJ()
  {
    AppMethodBeat.i(1453);
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = this.bSd.a("role_info", null, "int_reserved1=1", null, null, null, null, 2);
    while (localCursor.moveToNext())
    {
      bq localbq = new bq();
      localbq.d(localCursor);
      localLinkedList.add(localbq);
    }
    localCursor.close();
    AppMethodBeat.o(1453);
    return localLinkedList;
  }

  public final void cE(String paramString, int paramInt)
  {
    AppMethodBeat.i(1456);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.RoleStorage", "insert role info failed: empty user");
      AppMethodBeat.o(1456);
    }
    while (true)
    {
      return;
      if (apU(paramString) == null)
      {
        a(new bq(paramString, true, paramInt));
        ab.d("MicroMsg.RoleStorage", "insert new role, user=".concat(String.valueOf(paramString)));
      }
      AppMethodBeat.o(1456);
    }
  }

  public final void delete(String paramString)
  {
    AppMethodBeat.i(1460);
    if (paramString.length() > 0);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      int i = this.bSd.delete("role_info", "name=?", new String[] { String.valueOf(paramString) });
      ab.d("MicroMsg.RoleStorage", "delete name name :" + paramString + ", res:" + i);
      if (i > 0)
        doNotify();
      AppMethodBeat.o(1460);
      return;
    }
  }

  public final void e(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 2;
    AppMethodBeat.i(1458);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.RoleStorage", "insert role info failed: empty user");
      AppMethodBeat.o(1458);
    }
    bq localbq;
    while (true)
    {
      return;
      localbq = apU(paramString);
      if (localbq != null)
        break;
      a(new bq(paramString, paramBoolean1, 2));
      ab.d("MicroMsg.RoleStorage", "insert new role, user=".concat(String.valueOf(paramString)));
      AppMethodBeat.o(1458);
    }
    localbq.setEnable(paramBoolean1);
    int j;
    if (paramBoolean2)
    {
      j = localbq.status;
      if (!paramBoolean2);
    }
    label100: for (localbq.status = (i | j); ; localbq.status &= -3)
    {
      localbq.bJt = 4;
      b(localbq);
      AppMethodBeat.o(1458);
      break;
      i = 0;
      break label100;
    }
  }

  public final String getTableName()
  {
    return "role_info";
  }

  public final boolean has(String paramString)
  {
    AppMethodBeat.i(1455);
    bq localbq = RA(new bq.a(paramString).apT(""));
    boolean bool;
    if ((localbq != null) && (paramString.equals(localbq.name)))
    {
      bool = true;
      AppMethodBeat.o(1455);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(1455);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.br
 * JD-Core Version:    0.6.2
 */