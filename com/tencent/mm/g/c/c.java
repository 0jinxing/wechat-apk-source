package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;

public abstract class c extends com.tencent.mm.sdk.e.c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int djg = "abtestkey".hashCode();
  private static final int djh = "value".hashCode();
  private static final int dji = "expId".hashCode();
  private static final int djj = "sequence".hashCode();
  private static final int djk = "prioritylevel".hashCode();
  private static final int djl = "startTime".hashCode();
  private static final int djm = "endTime".hashCode();
  private static final int djn = "noReport".hashCode();
  private boolean diY = true;
  private boolean diZ = true;
  private boolean dja = true;
  private boolean djb = true;
  private boolean djc = true;
  private boolean djd = true;
  private boolean dje = true;
  private boolean djf = true;
  public String field_abtestkey;
  public long field_endTime;
  public String field_expId;
  public boolean field_noReport;
  public int field_prioritylevel;
  public long field_sequence;
  public long field_startTime;
  public String field_value;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.diY)
      localContentValues.put("abtestkey", this.field_abtestkey);
    if (this.diZ)
      localContentValues.put("value", this.field_value);
    if (this.dja)
      localContentValues.put("expId", this.field_expId);
    if (this.djb)
      localContentValues.put("sequence", Long.valueOf(this.field_sequence));
    if (this.djc)
      localContentValues.put("prioritylevel", Integer.valueOf(this.field_prioritylevel));
    if (this.djd)
      localContentValues.put("startTime", Long.valueOf(this.field_startTime));
    if (this.dje)
      localContentValues.put("endTime", Long.valueOf(this.field_endTime));
    if (this.djf)
      localContentValues.put("noReport", Boolean.valueOf(this.field_noReport));
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
      if (djg != k)
        break label64;
      this.field_abtestkey = paramCursor.getString(j);
      this.diY = true;
    }
    while (true)
    {
      j++;
      break label18;
      break;
      label64: if (djh == k)
      {
        this.field_value = paramCursor.getString(j);
      }
      else if (dji == k)
      {
        this.field_expId = paramCursor.getString(j);
      }
      else if (djj == k)
      {
        this.field_sequence = paramCursor.getLong(j);
      }
      else if (djk == k)
      {
        this.field_prioritylevel = paramCursor.getInt(j);
      }
      else if (djl == k)
      {
        this.field_startTime = paramCursor.getLong(j);
      }
      else if (djm == k)
      {
        this.field_endTime = paramCursor.getLong(j);
      }
      else
      {
        if (djn == k)
        {
          if (paramCursor.getInt(j) != 0);
          for (boolean bool = true; ; bool = false)
          {
            this.field_noReport = bool;
            break;
          }
        }
        if (diR == k)
          this.xDa = paramCursor.getLong(j);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.c
 * JD-Core Version:    0.6.2
 */