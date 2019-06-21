package com.tencent.wcdb.database;

public class DatabaseObjectNotClosedException extends RuntimeException
{
  private static final String s = "Application did not close the cursor or database object that was opened here";

  public DatabaseObjectNotClosedException()
  {
    super("Application did not close the cursor or database object that was opened here");
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.database.DatabaseObjectNotClosedException
 * JD-Core Version:    0.6.2
 */