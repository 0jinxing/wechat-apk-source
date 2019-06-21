package com.tencent.wcdb;

public abstract interface CrossProcessCursor extends Cursor
{
  public abstract void fillWindow(int paramInt, CursorWindow paramCursorWindow);

  public abstract CursorWindow getWindow();

  public abstract boolean onMove(int paramInt1, int paramInt2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.CrossProcessCursor
 * JD-Core Version:    0.6.2
 */