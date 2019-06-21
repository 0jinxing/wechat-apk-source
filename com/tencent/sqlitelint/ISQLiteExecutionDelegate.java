package com.tencent.sqlitelint;

import android.database.Cursor;

public abstract interface ISQLiteExecutionDelegate
{
  public abstract void execSQL(String paramString);

  public abstract Cursor rawQuery(String paramString, String[] paramArrayOfString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.sqlitelint.ISQLiteExecutionDelegate
 * JD-Core Version:    0.6.2
 */