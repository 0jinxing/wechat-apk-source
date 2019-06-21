package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ei extends c
{
  private static final int dQU = "position".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int djA = "key".hashCode();
  private boolean dQN = true;
  private boolean djw = true;
  public String field_key;
  public int field_position;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.djw)
      localContentValues.put("key", this.field_key);
    if (this.dQN)
      localContentValues.put("position", Integer.valueOf(this.field_position));
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
      label62: if (dQU == k)
        this.field_position = paramCursor.getInt(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.ei
 * JD-Core Version:    0.6.2
 */