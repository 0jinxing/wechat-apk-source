package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ax extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dvt = "bakLogId".hashCode();
  private static final int dvu = "valueStr".hashCode();
  private boolean dvr;
  private boolean dvs;
  public int field_bakLogId;
  public String field_valueStr;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dvr)
      localContentValues.put("bakLogId", Integer.valueOf(this.field_bakLogId));
    if (this.dvs)
      localContentValues.put("valueStr", this.field_valueStr);
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
      if (dvt != k)
        break label57;
      this.field_bakLogId = paramCursor.getInt(i);
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label57: if (dvu == k)
        this.field_valueStr = paramCursor.getString(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.ax
 * JD-Core Version:    0.6.2
 */