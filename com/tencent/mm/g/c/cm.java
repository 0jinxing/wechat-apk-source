package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class cm extends c
{
  private static final int dGa = "countryCode".hashCode();
  private static final int dGb = "callTimeCount".hashCode();
  private static final int dGc = "lastCallTime".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private boolean dFX = true;
  private boolean dFY = true;
  private boolean dFZ = true;
  public long field_callTimeCount;
  public int field_countryCode;
  public long field_lastCallTime;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dFX)
      localContentValues.put("countryCode", Integer.valueOf(this.field_countryCode));
    if (this.dFY)
      localContentValues.put("callTimeCount", Long.valueOf(this.field_callTimeCount));
    if (this.dFZ)
      localContentValues.put("lastCallTime", Long.valueOf(this.field_lastCallTime));
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
      if (dGa != k)
        break label62;
      this.field_countryCode = paramCursor.getInt(i);
      this.dFX = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dGb == k)
        this.field_callTimeCount = paramCursor.getLong(i);
      else if (dGc == k)
        this.field_lastCallTime = paramCursor.getLong(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.cm
 * JD-Core Version:    0.6.2
 */