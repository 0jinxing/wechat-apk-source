package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class r extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dkV = "appId".hashCode();
  private static final int dlS = "version".hashCode();
  private static final int dmb = "source".hashCode();
  private static final int dmc = "hitCount".hashCode();
  private static final int dmd = "reportId".hashCode();
  private boolean dkE = true;
  private boolean dlM = true;
  private boolean dlY = true;
  private boolean dlZ = true;
  private boolean dma = true;
  public String field_appId;
  public int field_hitCount;
  public int field_reportId;
  public int field_source;
  public int field_version;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dkE)
      localContentValues.put("appId", this.field_appId);
    if (this.dlM)
      localContentValues.put("version", Integer.valueOf(this.field_version));
    if (this.dlY)
      localContentValues.put("source", Integer.valueOf(this.field_source));
    if (this.dlZ)
      localContentValues.put("hitCount", Integer.valueOf(this.field_hitCount));
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
      else if (dmb == k)
        this.field_source = paramCursor.getInt(i);
      else if (dmc == k)
        this.field_hitCount = paramCursor.getInt(i);
      else if (dmd == k)
        this.field_reportId = paramCursor.getInt(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.r
 * JD-Core Version:    0.6.2
 */