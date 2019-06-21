package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class bi extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dyB;
  private static final int dyG = "exptKey".hashCode();
  private boolean dyF = true;
  private boolean dyx = true;
  public int field_exptId;
  public String field_exptKey;

  static
  {
    dyB = "exptId".hashCode();
  }

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dyF)
      localContentValues.put("exptKey", this.field_exptKey);
    if (this.dyx)
      localContentValues.put("exptId", Integer.valueOf(this.field_exptId));
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
      if (dyG != k)
        break label62;
      this.field_exptKey = paramCursor.getString(i);
      this.dyF = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dyB == k)
        this.field_exptId = paramCursor.getInt(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.bi
 * JD-Core Version:    0.6.2
 */