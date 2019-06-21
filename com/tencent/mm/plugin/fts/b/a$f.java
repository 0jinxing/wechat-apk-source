package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

final class a$f extends com.tencent.mm.plugin.fts.a.a.a
{
  private int mGa = 0;
  private int mGb = 0;

  private a$f(a parama)
  {
  }

  public final String aAo()
  {
    AppMethodBeat.i(136675);
    String str = String.format("{users: %d labels: %d}", new Object[] { Integer.valueOf(this.mGa), Integer.valueOf(this.mGb) });
    AppMethodBeat.o(136675);
    return str;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136674);
    Cursor localCursor = a.a(this.mFK).mBT.rawQuery("SELECT user, label_id FROM FTS5ContactLabels;", null);
    while (localCursor.moveToNext())
    {
      String str = localCursor.getString(0);
      long l = localCursor.getLong(1);
      List localList = (List)a.g(this.mFK).get(str);
      Object localObject = localList;
      if (localList == null)
      {
        localObject = new ArrayList(16);
        a.g(this.mFK).put(str, localObject);
        this.mGa += 1;
      }
      ((List)localObject).add(Long.valueOf(l));
      this.mGb += 1;
    }
    localCursor.close();
    AppMethodBeat.o(136674);
    return true;
  }

  public final String getName()
  {
    return "LoadLabelCacheTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.f
 * JD-Core Version:    0.6.2
 */