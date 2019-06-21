package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ev extends c
{
  private static final int dTp = "tableHash".hashCode();
  private static final int dTq = "tableSQLMD5".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private boolean dTn = true;
  private boolean dTo = true;
  public int field_tableHash;
  public String field_tableSQLMD5;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dTn)
      localContentValues.put("tableHash", Integer.valueOf(this.field_tableHash));
    if (this.dTo)
      localContentValues.put("tableSQLMD5", this.field_tableSQLMD5);
    if (this.xDa > 0L)
      localContentValues.put("rowid", Long.valueOf(this.xDa));
    return localContentValues;
  }

  public final void d(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
      return;
    int i = 0;
    int j = arrayOfString.length;
    label18: int k;
    if (i < j)
    {
      k = arrayOfString[i].hashCode();
      if (dTp != k)
        break label62;
      this.field_tableHash = paramCursor.getInt(i);
      this.dTn = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dTq == k)
        this.field_tableSQLMD5 = paramCursor.getString(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.ev
 * JD-Core Version:    0.6.2
 */