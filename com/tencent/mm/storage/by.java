package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.g.c.ev;
import com.tencent.mm.sdk.e.j;
import java.util.concurrent.ConcurrentHashMap;

public final class by extends j<ev>
{
  public static final String[] fnj;
  public h fni;

  static
  {
    AppMethodBeat.i(59018);
    fnj = new String[] { j.a(bx.ccO, "TablesVersion") };
    AppMethodBeat.o(59018);
  }

  public by(h paramh)
  {
    super(paramh, bx.ccO, "TablesVersion", ev.diI);
    this.fni = paramh;
  }

  public final ConcurrentHashMap<Integer, String> duv()
  {
    AppMethodBeat.i(59017);
    Cursor localCursor = this.fni.a("select * from TablesVersion", new String[0], 0);
    ConcurrentHashMap localConcurrentHashMap = new ConcurrentHashMap();
    if (localCursor == null)
      AppMethodBeat.o(59017);
    while (true)
    {
      return localConcurrentHashMap;
      try
      {
        if (localCursor.moveToNext())
          localConcurrentHashMap.putIfAbsent(Integer.valueOf(localCursor.getInt(0)), localCursor.getString(1));
      }
      finally
      {
        localCursor.close();
        AppMethodBeat.o(59017);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.by
 * JD-Core Version:    0.6.2
 */