package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class av extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dkV = "appId".hashCode();
  private static final int dlH = "versionType".hashCode();
  private static final int dvq = "extJson".hashCode();
  private boolean dkE = true;
  private boolean dlE = true;
  private boolean dvp = true;
  public String field_appId;
  public String field_extJson;
  public int field_versionType;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dkE)
      localContentValues.put("appId", this.field_appId);
    if (this.dlE)
      localContentValues.put("versionType", Integer.valueOf(this.field_versionType));
    if (this.dvp)
      localContentValues.put("extJson", this.field_extJson);
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
      if (dkV != k)
        break label57;
      this.field_appId = paramCursor.getString(i);
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label57: if (dlH == k)
        this.field_versionType = paramCursor.getInt(i);
      else if (dvq == k)
        this.field_extJson = paramCursor.getString(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.av
 * JD-Core Version:    0.6.2
 */