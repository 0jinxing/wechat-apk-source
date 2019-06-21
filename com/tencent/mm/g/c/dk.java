package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class dk extends c
{
  private static final int dDb = "retryCount".hashCode();
  private static final int dMo;
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private boolean dCI = true;
  private boolean dMn = true;
  public String field_cardUserId;
  public int field_retryCount;

  static
  {
    dMo = "cardUserId".hashCode();
  }

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dMn)
      localContentValues.put("cardUserId", this.field_cardUserId);
    if (this.dCI)
      localContentValues.put("retryCount", Integer.valueOf(this.field_retryCount));
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
      if (dMo != k)
        break label62;
      this.field_cardUserId = paramCursor.getString(i);
      this.dMn = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dDb == k)
        this.field_retryCount = paramCursor.getInt(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.dk
 * JD-Core Version:    0.6.2
 */