package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class i extends c
{
  public static final String[] diI = { "CREATE INDEX IF NOT EXISTS AppBrandAppLaunchRecordUpdateTimeIndex ON AppBrandAppLaunchUsernameDuplicateRecord(updateTime)" };
  private static final int diR = "rowid".hashCode();
  private static final int dlo = "username".hashCode();
  private static final int dlp = "updateTime".hashCode();
  private boolean dlm = true;
  private boolean dln = true;
  public long field_updateTime;
  public String field_username;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dlm)
      localContentValues.put("username", this.field_username);
    if (this.dln)
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
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
      if (dlo != k)
        break label62;
      this.field_username = paramCursor.getString(i);
      this.dlm = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dlp == k)
        this.field_updateTime = paramCursor.getLong(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.i
 * JD-Core Version:    0.6.2
 */