package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class au extends c
{
  public static final String[] diI = new String[0];
  private static final int diQ = "msgId".hashCode();
  private static final int diR = "rowid".hashCode();
  private static final int dvo = "transferId".hashCode();
  private boolean diM = true;
  private boolean dvn = true;
  public long field_msgId;
  public String field_transferId;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.diM)
      localContentValues.put("msgId", Long.valueOf(this.field_msgId));
    if (this.dvn)
      localContentValues.put("transferId", this.field_transferId);
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
      if (diQ != k)
        break label62;
      this.field_msgId = paramCursor.getLong(i);
      this.diM = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dvo == k)
        this.field_transferId = paramCursor.getString(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.au
 * JD-Core Version:    0.6.2
 */