package com.tencent.wcdb.database;

import com.tencent.wcdb.Cursor;

public abstract interface SQLiteCursorDriver
{
  public abstract void cursorClosed();

  public abstract void cursorDeactivated();

  public abstract void cursorRequeried(Cursor paramCursor);

  public abstract Cursor query(SQLiteDatabase.CursorFactory paramCursorFactory, Object[] paramArrayOfObject);

  public abstract void setBindArguments(String[] paramArrayOfString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.database.SQLiteCursorDriver
 * JD-Core Version:    0.6.2
 */