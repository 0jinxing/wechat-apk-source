package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class bt extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int djA = "key".hashCode();
  private static final int djh = "value".hashCode();
  private static final int dmI = "modifyTime".hashCode();
  private boolean diZ = true;
  private boolean djw = true;
  private boolean dml = true;
  public String field_key;
  public long field_modifyTime;
  public String field_value;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.djw)
      localContentValues.put("key", this.field_key);
    if (this.diZ)
      localContentValues.put("value", this.field_value);
    if (this.dml)
      localContentValues.put("modifyTime", Long.valueOf(this.field_modifyTime));
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
      if (djA != k)
        break label62;
      this.field_key = paramCursor.getString(i);
      this.djw = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (djh == k)
        this.field_value = paramCursor.getString(i);
      else if (dmI == k)
        this.field_modifyTime = paramCursor.getLong(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.bt
 * JD-Core Version:    0.6.2
 */