package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ab extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int doX;
  private static final int dol = "brandUserName".hashCode();
  private boolean dnX = true;
  private boolean doW = true;
  public String field_brandUserName;
  public String field_userId;

  static
  {
    doX = "userId".hashCode();
  }

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dnX)
      localContentValues.put("brandUserName", this.field_brandUserName);
    if (this.doW)
      localContentValues.put("userId", this.field_userId);
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
      if (dol != k)
        break label62;
      this.field_brandUserName = paramCursor.getString(i);
      this.dnX = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (doX == k)
        this.field_userId = paramCursor.getString(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.ab
 * JD-Core Version:    0.6.2
 */