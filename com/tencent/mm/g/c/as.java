package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class as extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int duL = "labelId".hashCode();
  private static final int duM = "contactName".hashCode();
  private boolean duJ;
  private boolean duK;
  public String field_contactName;
  public String field_labelId;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.duJ)
      localContentValues.put("labelId", this.field_labelId);
    if (this.duK)
      localContentValues.put("contactName", this.field_contactName);
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
      if (duL != k)
        break label57;
      this.field_labelId = paramCursor.getString(i);
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label57: if (duM == k)
        this.field_contactName = paramCursor.getString(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.as
 * JD-Core Version:    0.6.2
 */