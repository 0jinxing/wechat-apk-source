package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class e extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int djA = "key".hashCode();
  private static final int djB = "mau".hashCode();
  private static final int djC = "dau".hashCode();
  private static final int djD = "useTime".hashCode();
  private boolean djw = true;
  private boolean djx = true;
  private boolean djy = true;
  private boolean djz = true;
  public int field_dau;
  public int field_key;
  public int field_mau;
  public long field_useTime;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.djw)
      localContentValues.put("key", Integer.valueOf(this.field_key));
    if (this.djx)
      localContentValues.put("mau", Integer.valueOf(this.field_mau));
    if (this.djy)
      localContentValues.put("dau", Integer.valueOf(this.field_dau));
    if (this.djz)
      localContentValues.put("useTime", Long.valueOf(this.field_useTime));
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
      this.field_key = paramCursor.getInt(i);
      this.djw = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (djB == k)
        this.field_mau = paramCursor.getInt(i);
      else if (djC == k)
        this.field_dau = paramCursor.getInt(i);
      else if (djD == k)
        this.field_useTime = paramCursor.getLong(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.e
 * JD-Core Version:    0.6.2
 */