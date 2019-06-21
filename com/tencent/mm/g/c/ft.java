package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ft extends c
{
  private static final int dLV = "appid".hashCode();
  private static final int dZv = "jsExceptionCount".hashCode();
  private static final int dZw = "crashCount".hashCode();
  private static final int dZx = "beginTimestamp".hashCode();
  private static final int dZy = "pkgVersion".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private boolean dLT = true;
  private boolean dZr = true;
  private boolean dZs = true;
  private boolean dZt = true;
  private boolean dZu = true;
  public String field_appid;
  public long field_beginTimestamp;
  public int field_crashCount;
  public int field_jsExceptionCount;
  public int field_pkgVersion;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dLT)
      localContentValues.put("appid", this.field_appid);
    if (this.dZr)
      localContentValues.put("jsExceptionCount", Integer.valueOf(this.field_jsExceptionCount));
    if (this.dZs)
      localContentValues.put("crashCount", Integer.valueOf(this.field_crashCount));
    if (this.dZt)
      localContentValues.put("beginTimestamp", Long.valueOf(this.field_beginTimestamp));
    if (this.dZu)
      localContentValues.put("pkgVersion", Integer.valueOf(this.field_pkgVersion));
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
      if (dLV != k)
        break label62;
      this.field_appid = paramCursor.getString(i);
      this.dLT = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dZv == k)
        this.field_jsExceptionCount = paramCursor.getInt(i);
      else if (dZw == k)
        this.field_crashCount = paramCursor.getInt(i);
      else if (dZx == k)
        this.field_beginTimestamp = paramCursor.getLong(i);
      else if (dZy == k)
        this.field_pkgVersion = paramCursor.getInt(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.ft
 * JD-Core Version:    0.6.2
 */