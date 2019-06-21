package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class cj extends c
{
  public static final String[] diI = new String[0];
  private static final int diN = "payMsgId".hashCode();
  private static final int diQ = "msgId".hashCode();
  private static final int diR = "rowid".hashCode();
  private boolean diJ = true;
  private boolean diM = true;
  public long field_msgId;
  public String field_payMsgId;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.diJ)
      localContentValues.put("payMsgId", this.field_payMsgId);
    if (this.diM)
      localContentValues.put("msgId", Long.valueOf(this.field_msgId));
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
      if (diN != k)
        break label62;
      this.field_payMsgId = paramCursor.getString(i);
      this.diJ = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (diQ == k)
        this.field_msgId = paramCursor.getLong(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.cj
 * JD-Core Version:    0.6.2
 */