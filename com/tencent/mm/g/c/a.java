package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class a extends c
{
  public static final String[] diI = new String[0];
  private static final int diN = "payMsgId".hashCode();
  private static final int diO = "insertmsg".hashCode();
  private static final int diP = "chatroom".hashCode();
  private static final int diQ = "msgId".hashCode();
  private static final int diR = "rowid".hashCode();
  private boolean diJ = true;
  private boolean diK = true;
  private boolean diL = true;
  private boolean diM = true;
  public String field_chatroom;
  public boolean field_insertmsg;
  public long field_msgId;
  public String field_payMsgId;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.diJ)
      localContentValues.put("payMsgId", this.field_payMsgId);
    if (this.diK)
      localContentValues.put("insertmsg", Boolean.valueOf(this.field_insertmsg));
    if (this.diL)
      localContentValues.put("chatroom", this.field_chatroom);
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
    int i = arrayOfString.length;
    int j = 0;
    label18: int k;
    if (j < i)
    {
      k = arrayOfString[j].hashCode();
      if (diN != k)
        break label64;
      this.field_payMsgId = paramCursor.getString(j);
      this.diJ = true;
    }
    while (true)
    {
      j++;
      break label18;
      break;
      label64: if (diO == k)
      {
        if (paramCursor.getInt(j) != 0);
        for (boolean bool = true; ; bool = false)
        {
          this.field_insertmsg = bool;
          break;
        }
      }
      if (diP == k)
        this.field_chatroom = paramCursor.getString(j);
      else if (diQ == k)
        this.field_msgId = paramCursor.getLong(j);
      else if (diR == k)
        this.xDa = paramCursor.getLong(j);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.a
 * JD-Core Version:    0.6.2
 */