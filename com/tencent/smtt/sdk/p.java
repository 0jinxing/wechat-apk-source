package com.tencent.smtt.sdk;

import android.database.sqlite.SQLiteException;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class p
  implements Thread.UncaughtExceptionHandler
{
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    AppMethodBeat.i(64079);
    if ((paramThrowable instanceof SQLiteException))
    {
      AppMethodBeat.o(64079);
      return;
    }
    paramThread = new RuntimeException(paramThrowable);
    AppMethodBeat.o(64079);
    throw paramThread;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.p
 * JD-Core Version:    0.6.2
 */