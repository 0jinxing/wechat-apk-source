package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ca extends c
{
  private static final int dDT = "reqType".hashCode();
  private static final int dDU = "cache".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private boolean dDR = true;
  private boolean dDS = true;
  public byte[] field_cache;
  public String field_reqType;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dDR)
      localContentValues.put("reqType", this.field_reqType);
    if (this.dDS)
      localContentValues.put("cache", this.field_cache);
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
      if (dDT != k)
        break label62;
      this.field_reqType = paramCursor.getString(i);
      this.dDR = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dDU == k)
        this.field_cache = paramCursor.getBlob(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.ca
 * JD-Core Version:    0.6.2
 */