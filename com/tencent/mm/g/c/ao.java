package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ao extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dkV = "appId".hashCode();
  private static final int dlS = "version".hashCode();
  private static final int dth = "hit".hashCode();
  private static final int dti = "hitTimeMS".hashCode();
  private boolean dkE = true;
  private boolean dlM = true;
  private boolean dtf = true;
  private boolean dtg = true;
  public String field_appId;
  public int field_hit;
  public long field_hitTimeMS;
  public int field_version;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dkE)
      localContentValues.put("appId", this.field_appId);
    if (this.dlM)
      localContentValues.put("version", Integer.valueOf(this.field_version));
    if (this.dtf)
      localContentValues.put("hit", Integer.valueOf(this.field_hit));
    if (this.dtg)
      localContentValues.put("hitTimeMS", Long.valueOf(this.field_hitTimeMS));
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
      label57: if (dlS == k)
        this.field_version = paramCursor.getInt(i);
      else if (dth == k)
        this.field_hit = paramCursor.getInt(i);
      else if (dti == k)
        this.field_hitTimeMS = paramCursor.getLong(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.ao
 * JD-Core Version:    0.6.2
 */