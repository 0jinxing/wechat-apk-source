package com.tencent.mm.plugin.offline.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.offline.a.r;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends j<r>
{
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(43442);
    fnj = new String[] { j.a(r.ccO, "OfflineOrderStatus") };
    AppMethodBeat.o(43442);
  }

  public a(e parame)
  {
    super(parame, r.ccO, "OfflineOrderStatus", null);
    this.bSd = parame;
  }

  private boolean b(r paramr)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(43436);
    paramr = this.bSd.a("select * from OfflineOrderStatus where reqkey=?", new String[] { paramr.field_reqkey }, 2);
    if (paramr == null)
    {
      AppMethodBeat.o(43436);
      bool1 = bool2;
      return bool1;
    }
    paramr.moveToFirst();
    if (!paramr.isAfterLast());
    while (true)
    {
      paramr.close();
      AppMethodBeat.o(43436);
      break;
      bool1 = false;
    }
  }

  public final r TY(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(43437);
    Cursor localCursor = this.bSd.a("select * from OfflineOrderStatus where reqkey=?", new String[] { paramString }, 2);
    if (localCursor == null)
    {
      AppMethodBeat.o(43437);
      paramString = localObject2;
    }
    while (true)
    {
      return paramString;
      localCursor.moveToFirst();
      ab.i("MicroMsg.OfflineOrderStatusStorage", "in getOrderStatusByTranId: cursor.isAfterLast() = " + localCursor.isAfterLast());
      paramString = localObject1;
      if (!localCursor.isAfterLast())
      {
        paramString = new r();
        paramString.d(localCursor);
      }
      localCursor.close();
      AppMethodBeat.o(43437);
    }
  }

  public final void TZ(String paramString)
  {
    AppMethodBeat.i(43439);
    r localr = TY(paramString);
    if (localr != null)
      localr.field_status = -1;
    for (paramString = localr; ; paramString = localr)
    {
      c(paramString);
      AppMethodBeat.o(43439);
      return;
      localr = new r();
      localr.field_reqkey = paramString;
      localr.field_status = -1;
    }
  }

  public final r bXo()
  {
    int i = 1;
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(43435);
    ab.i("MicroMsg.OfflineOrderStatusStorage", "in getLastestOrder: orders count: %d, latest 3 orders: %s", new Object[] { Integer.valueOf(bXq()), bXp() });
    Cursor localCursor = this.bSd.a("SELECT * FROM OfflineOrderStatus WHERE status!=-1 ORDER BY rowid DESC LIMIT 1", null, 2);
    if (localCursor == null)
    {
      AppMethodBeat.o(43435);
      return localObject2;
    }
    localCursor.moveToFirst();
    if (!localCursor.isAfterLast())
    {
      label84: localObject2 = localObject1;
      if (i != 0)
      {
        localObject2 = new r();
        ((r)localObject2).d(localCursor);
      }
      localCursor.close();
      if (localObject2 == null)
        break label152;
      ab.i("MicroMsg.OfflineOrderStatusStorage", "getLastestOrder status = " + ((r)localObject2).field_status);
    }
    while (true)
    {
      AppMethodBeat.o(43435);
      break;
      i = 0;
      break label84;
      label152: ab.i("MicroMsg.OfflineOrderStatusStorage", "getLastestOrder null");
    }
  }

  public final String bXp()
  {
    AppMethodBeat.i(43440);
    String str = String.format("SELECT * FROM %s ORDER BY %s DESC LIMIT %d;", new Object[] { "OfflineOrderStatus", "rowid", Integer.valueOf(3) });
    Cursor localCursor = this.bSd.a(str, null, 2);
    str = "";
    if (localCursor == null)
    {
      ab.e("MicroMsg.OfflineOrderStatusStorage", "getAllOrdersInfo: error.cursor is null\n");
      AppMethodBeat.o(43440);
      return str;
      label66: str = str + ";";
    }
    int i;
    for (int j = i; ; j = 0)
    {
      if (localCursor.moveToNext())
      {
        i = j + 1;
        if (i <= 3)
        {
          for (j = 0; j < localCursor.getColumnCount(); j++)
            str = str + localCursor.getColumnName(j) + ": " + localCursor.getString(j) + ", ";
          break label66;
        }
      }
      localCursor.close();
      break;
    }
  }

  public final int bXq()
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(43441);
    Object localObject = String.format("SELECT COUNT(*) FROM %s;", new Object[] { "OfflineOrderStatus" });
    localObject = this.bSd.a((String)localObject, null, 2);
    if (localObject == null)
      ab.e("MicroMsg.OfflineOrderStatusStorage", "getOrdersCount: error.cursor is null\n");
    while (true)
    {
      AppMethodBeat.o(43441);
      return j;
      j = i;
      if (((Cursor)localObject).moveToNext())
      {
        j = i;
        if (((Cursor)localObject).getColumnCount() > 0)
          j = ((Cursor)localObject).getInt(0);
      }
      ((Cursor)localObject).close();
    }
  }

  public final void c(r paramr)
  {
    AppMethodBeat.i(43438);
    if (paramr.field_reqkey == null)
    {
      ab.e("MicroMsg.OfflineOrderStatusStorage", "status.field_reqkey is null");
      AppMethodBeat.o(43438);
    }
    while (true)
    {
      return;
      if (!b(paramr))
      {
        ab.i("MicroMsg.OfflineOrderStatusStorage", "saveOfflineOrderStatus: insert reqKey: %s,  status: %d ", new Object[] { paramr.field_reqkey, Integer.valueOf(paramr.field_status) });
        b(paramr);
        AppMethodBeat.o(43438);
      }
      else
      {
        ab.i("MicroMsg.OfflineOrderStatusStorage", "saveOfflineOrderStatus: update reqKey: %s,  status: %d ", new Object[] { paramr.field_reqkey, Integer.valueOf(paramr.field_status) });
        c(paramr, new String[0]);
        AppMethodBeat.o(43438);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.b.a
 * JD-Core Version:    0.6.2
 */