package com.tencent.mm.plugin.fts.a;

import android.database.Cursor;
import com.tencent.wcdb.database.SQLiteStatement;

public abstract interface h
{
  public abstract long J(long paramLong1, long paramLong2);

  public abstract void K(long paramLong1, long paramLong2);

  public abstract Cursor MS(String paramString);

  public abstract boolean MT(String paramString);

  public abstract void beginTransaction();

  public abstract void commit();

  public abstract SQLiteStatement compileStatement(String paramString);

  public abstract boolean ei(int paramInt1, int paramInt2);

  public abstract void execSQL(String paramString);

  public abstract void execSQL(String paramString, Object[] paramArrayOfObject);

  public abstract boolean inTransaction();

  public abstract Cursor rawQuery(String paramString, String[] paramArrayOfString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.h
 * JD-Core Version:    0.6.2
 */