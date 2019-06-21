package com.tencent.mm.plugin.dbbackup.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.HashMap;

final class a$3
  implements a.d
{
  a$3(a parama, int paramInt, long[] paramArrayOfLong, HashMap paramHashMap)
  {
  }

  public final boolean a(Cursor paramCursor, SQLiteStatement paramSQLiteStatement)
  {
    AppMethodBeat.i(19003);
    long l1 = paramCursor.getLong(this.kJy);
    paramCursor = this.kJz;
    long l2 = paramCursor[0];
    paramCursor[0] = (1L + l2);
    this.kJA.put(Long.valueOf(l1), Long.valueOf(l2));
    paramSQLiteStatement.bindLong(this.kJy + 1, l2);
    if ((this.kJz[0] > 1000000L) && (this.kJz[0] <= 10000000L))
      this.kJz[0] = 10000001L;
    AppMethodBeat.o(19003);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.a.a.3
 * JD-Core Version:    0.6.2
 */