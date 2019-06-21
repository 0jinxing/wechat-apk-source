package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class fv extends c
{
  public static final String[] diI = { "CREATE INDEX IF NOT EXISTS WxaAttrVersionServerNotifyRecordAppVersionIndex ON WxaAttrVersionServerNotifyRecord(appVersion)" };
  private static final int diR = "rowid".hashCode();
  private static final int dlo = "username".hashCode();
  private static final int dmF = "appVersion".hashCode();
  private static final int dmd = "reportId".hashCode();
  private boolean dlm = true;
  private boolean dma = true;
  private boolean dmi = true;
  public int field_appVersion;
  public int field_reportId;
  public String field_username;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dlm)
      localContentValues.put("username", this.field_username);
    if (this.dmi)
      localContentValues.put("appVersion", Integer.valueOf(this.field_appVersion));
    if (this.dma)
      localContentValues.put("reportId", Integer.valueOf(this.field_reportId));
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
      label62: if (dmF == k)
        this.field_appVersion = paramCursor.getInt(i);
      else if (dmd == k)
        this.field_reportId = paramCursor.getInt(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.fv
 * JD-Core Version:    0.6.2
 */