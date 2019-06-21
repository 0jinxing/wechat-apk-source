package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class fo extends c
{
  private static final int dDp = "expireTime".hashCode();
  private static final int dYu;
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private boolean dDh = true;
  private boolean dYt = true;
  public long field_expireTime;
  public String field_host;

  static
  {
    dYu = "host".hashCode();
  }

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dYt)
      localContentValues.put("host", this.field_host);
    if (this.dDh)
      localContentValues.put("expireTime", Long.valueOf(this.field_expireTime));
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
      if (dYu != k)
        break label57;
      this.field_host = paramCursor.getString(i);
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label57: if (dDp == k)
        this.field_expireTime = paramCursor.getLong(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.fo
 * JD-Core Version:    0.6.2
 */