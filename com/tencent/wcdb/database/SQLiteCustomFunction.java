package com.tencent.wcdb.database;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class SQLiteCustomFunction
{
  public final SQLiteDatabase.CustomFunction callback;
  public final String name;
  public final int numArgs;

  public SQLiteCustomFunction(String paramString, int paramInt, SQLiteDatabase.CustomFunction paramCustomFunction)
  {
    AppMethodBeat.i(12420);
    if (paramString == null)
    {
      paramString = new IllegalArgumentException("name must not be null.");
      AppMethodBeat.o(12420);
      throw paramString;
    }
    this.name = paramString;
    this.numArgs = paramInt;
    this.callback = paramCustomFunction;
    AppMethodBeat.o(12420);
  }

  private void dispatchCallback(String[] paramArrayOfString)
  {
    AppMethodBeat.i(12421);
    this.callback.callback(paramArrayOfString);
    AppMethodBeat.o(12421);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.database.SQLiteCustomFunction
 * JD-Core Version:    0.6.2
 */