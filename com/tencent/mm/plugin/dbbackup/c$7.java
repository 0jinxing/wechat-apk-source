package com.tencent.mm.plugin.dbbackup;

import android.os.Handler.Callback;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.wcdb.database.SQLiteDatabase;

final class c$7
  implements Handler.Callback
{
  c$7(c paramc)
  {
  }

  public final boolean handleMessage(Message paramMessage)
  {
    boolean bool = true;
    AppMethodBeat.i(18937);
    SQLiteDatabase localSQLiteDatabase = g.RP().eJN.dvx();
    switch (paramMessage.what)
    {
    default:
      bool = false;
      AppMethodBeat.o(18937);
    case 1:
    case 2:
    }
    while (true)
    {
      return bool;
      localSQLiteDatabase.beginTransaction();
      AppMethodBeat.o(18937);
      continue;
      localSQLiteDatabase.endTransaction();
      AppMethodBeat.o(18937);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.c.7
 * JD-Core Version:    0.6.2
 */