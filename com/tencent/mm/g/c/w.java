package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class w extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dnK;
  private static final int dnN = "msgListDataId".hashCode();
  private boolean dnH = true;
  private boolean dnM = true;
  public String field_msgListDataId;
  public String field_sessionName;

  static
  {
    dnK = "sessionName".hashCode();
  }

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dnM)
      localContentValues.put("msgListDataId", this.field_msgListDataId);
    if (this.field_sessionName == null)
      this.field_sessionName = "";
    if (this.dnH)
      localContentValues.put("sessionName", this.field_sessionName);
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
      if (dnN != k)
        break label62;
      this.field_msgListDataId = paramCursor.getString(i);
      this.dnM = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dnK == k)
        this.field_sessionName = paramCursor.getString(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.w
 * JD-Core Version:    0.6.2
 */