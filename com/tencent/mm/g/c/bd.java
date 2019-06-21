package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class bd extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dkn;
  private static final int dyk = "designerIDAndType".hashCode();
  private boolean djP = true;
  private boolean dyj = true;
  public byte[] field_content;
  public String field_designerIDAndType;

  static
  {
    dkn = "content".hashCode();
  }

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dyj)
      localContentValues.put("designerIDAndType", this.field_designerIDAndType);
    if (this.djP)
      localContentValues.put("content", this.field_content);
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
      if (dyk != k)
        break label62;
      this.field_designerIDAndType = paramCursor.getString(i);
      this.dyj = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dkn == k)
        this.field_content = paramCursor.getBlob(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.bd
 * JD-Core Version:    0.6.2
 */