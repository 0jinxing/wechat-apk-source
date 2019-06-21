package com.tencent.mm.pluginsdk.model.app;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.u;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

public final class o extends j<u>
{
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(27354);
    fnj = new String[] { j.a(n.ccO, "AppSort") };
    AppMethodBeat.o(27354);
  }

  public o(e parame)
  {
    super(parame, n.ccO, "AppSort", null);
    AppMethodBeat.i(27351);
    this.bSd = parame;
    parame.hY("AppSort", "CREATE INDEX IF NOT EXISTS flagIdIndex ON AppSort ( flag )");
    parame.hY("AppSort", "CREATE INDEX IF NOT EXISTS flagIdIndex ON AppSort ( sortId )");
    AppMethodBeat.o(27351);
  }

  public final boolean a(n paramn)
  {
    AppMethodBeat.i(27353);
    boolean bool = super.b(paramn);
    AppMethodBeat.o(27353);
    return bool;
  }

  public final List<String> mb(long paramLong)
  {
    AppMethodBeat.i(27352);
    ArrayList localArrayList = new ArrayList();
    Object localObject = new StringBuilder(256);
    ((StringBuilder)localObject).append("select * from AppSort");
    ((StringBuilder)localObject).append(" where ");
    ((StringBuilder)localObject).append("flag = ").append(paramLong);
    ((StringBuilder)localObject).append(" order by sortId desc ");
    localObject = rawQuery(((StringBuilder)localObject).toString(), new String[0]);
    if (localObject == null)
    {
      ab.e("MicroMsg.AppSortStorage", "getAppListByFlag : cursor is null");
      localArrayList = null;
      AppMethodBeat.o(27352);
    }
    while (true)
    {
      return localArrayList;
      ab.d("MicroMsg.AppSortStorage", "getAppListByFlag count = %d", new Object[] { Integer.valueOf(((Cursor)localObject).getCount()) });
      int i = ((Cursor)localObject).getColumnIndex("appId");
      while (((Cursor)localObject).moveToNext())
        localArrayList.add(((Cursor)localObject).getString(i));
      ((Cursor)localObject).close();
      AppMethodBeat.o(27352);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.o
 * JD-Core Version:    0.6.2
 */