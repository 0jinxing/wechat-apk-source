package com.tencent.mm.plugin.shake.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

public final class g extends j<f>
{
  public static final String[] diI;
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(24460);
    diI = new String[] { "CREATE INDEX IF NOT EXISTS  shakemessage_status_index ON shakemessage ( status )", "CREATE INDEX IF NOT EXISTS shakemessage_type_index ON shakemessage ( type )" };
    fnj = new String[] { j.a(f.ccO, "shakemessage") };
    AppMethodBeat.o(24460);
  }

  public g(e parame)
  {
    super(parame, f.ccO, "shakemessage", diI);
    this.bSd = parame;
  }

  public final Cursor Cv(int paramInt)
  {
    AppMethodBeat.i(24455);
    Object localObject = "SELECT * FROM " + getTableName() + " ORDER BY rowid DESC LIMIT " + paramInt;
    localObject = this.bSd.rawQuery((String)localObject, null);
    AppMethodBeat.o(24455);
    return localObject;
  }

  public final boolean a(f paramf)
  {
    boolean bool = false;
    AppMethodBeat.i(24454);
    if (paramf == null)
    {
      ab.e("MicroMsg.ShakeMessageStorage", "insert fail, shakeMsg is null");
      AppMethodBeat.o(24454);
    }
    while (true)
    {
      return bool;
      if (super.b(paramf))
      {
        anF(paramf.xDa);
        bool = true;
        AppMethodBeat.o(24454);
      }
      else
      {
        AppMethodBeat.o(24454);
      }
    }
  }

  public final int baS()
  {
    AppMethodBeat.i(24456);
    Cursor localCursor = this.bSd.a("select count(*) from " + getTableName() + " where status != 1", null, 2);
    if (localCursor.moveToFirst());
    for (int i = localCursor.getInt(0); ; i = 0)
    {
      localCursor.close();
      if (i > 0)
        AppMethodBeat.o(24456);
      while (true)
      {
        return i;
        AppMethodBeat.o(24456);
        i = 0;
      }
    }
  }

  public final f cjJ()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(24457);
    Object localObject3 = "SELECT * FROM " + getTableName() + " where status != 1 ORDER BY rowid DESC LIMIT 1";
    localObject3 = this.bSd.a((String)localObject3, null, 2);
    if (localObject3 == null)
      AppMethodBeat.o(24457);
    while (true)
    {
      return localObject2;
      localObject2 = localObject1;
      if (((Cursor)localObject3).moveToFirst())
      {
        localObject2 = new f();
        ((f)localObject2).d((Cursor)localObject3);
      }
      ((Cursor)localObject3).close();
      AppMethodBeat.o(24457);
    }
  }

  public final List<f> cjK()
  {
    AppMethodBeat.i(24458);
    ArrayList localArrayList = new ArrayList();
    Object localObject = "SELECT * FROM " + getTableName() + " where status != 1";
    localObject = this.bSd.a((String)localObject, null, 2);
    if (localObject != null)
    {
      while (((Cursor)localObject).moveToNext())
      {
        f localf = new f();
        localf.d((Cursor)localObject);
        localArrayList.add(localf);
      }
      ((Cursor)localObject).close();
    }
    AppMethodBeat.o(24458);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.b.g
 * JD-Core Version:    0.6.2
 */