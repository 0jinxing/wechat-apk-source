package com.tencent.mm.plugin.dbbackup.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.HashMap;

final class a$4
  implements a.d
{
  a$4(a parama, int paramInt, HashMap paramHashMap)
  {
  }

  public final boolean a(Cursor paramCursor, SQLiteStatement paramSQLiteStatement)
  {
    AppMethodBeat.i(19004);
    long l = paramCursor.getLong(this.kJB);
    paramCursor = (Long)this.kJA.get(Long.valueOf(l));
    if (paramCursor != null)
      paramSQLiteStatement.bindLong(this.kJB + 1, paramCursor.longValue());
    AppMethodBeat.o(19004);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.a.a.4
 * JD-Core Version:    0.6.2
 */