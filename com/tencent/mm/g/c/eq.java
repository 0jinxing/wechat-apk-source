package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class eq extends c
{
  private static final int dSr = "baseItemData".hashCode();
  private static final int dSs = "timeStamp".hashCode();
  private static final int dSt = "storyLocalId".hashCode();
  private static final int dSu = "mixFlag".hashCode();
  private static final int dSv = "mixRetryTime".hashCode();
  private static final int dSw = "available".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private boolean dSl = true;
  private boolean dSm = true;
  private boolean dSn = true;
  private boolean dSo = true;
  private boolean dSp = true;
  private boolean dSq = true;
  public int field_available;
  public byte[] field_baseItemData;
  public int field_mixFlag;
  public int field_mixRetryTime;
  public int field_storyLocalId;
  public long field_timeStamp;

  public static c.a Hm()
  {
    c.a locala = new c.a();
    locala.xDb = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "baseItemData";
    locala.xDd.put("baseItemData", "BLOB");
    localStringBuilder.append(" baseItemData BLOB");
    localStringBuilder.append(", ");
    locala.columns[1] = "timeStamp";
    locala.xDd.put("timeStamp", "LONG");
    localStringBuilder.append(" timeStamp LONG");
    localStringBuilder.append(", ");
    locala.columns[2] = "storyLocalId";
    locala.xDd.put("storyLocalId", "INTEGER");
    localStringBuilder.append(" storyLocalId INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "mixFlag";
    locala.xDd.put("mixFlag", "INTEGER");
    localStringBuilder.append(" mixFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "mixRetryTime";
    locala.xDd.put("mixRetryTime", "INTEGER");
    localStringBuilder.append(" mixRetryTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "available";
    locala.xDd.put("available", "INTEGER");
    localStringBuilder.append(" available INTEGER");
    locala.columns[6] = "rowid";
    locala.sql = localStringBuilder.toString();
    return locala;
  }

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dSl)
      localContentValues.put("baseItemData", this.field_baseItemData);
    if (this.dSm)
      localContentValues.put("timeStamp", Long.valueOf(this.field_timeStamp));
    if (this.dSn)
      localContentValues.put("storyLocalId", Integer.valueOf(this.field_storyLocalId));
    if (this.dSo)
      localContentValues.put("mixFlag", Integer.valueOf(this.field_mixFlag));
    if (this.dSp)
      localContentValues.put("mixRetryTime", Integer.valueOf(this.field_mixRetryTime));
    if (this.dSq)
      localContentValues.put("available", Integer.valueOf(this.field_available));
    if (this.xDa > 0L)
      localContentValues.put("rowid", Long.valueOf(this.xDa));
    return localContentValues;
  }

  public void d(Cursor paramCursor)
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
      if (dSr != k)
        break label57;
      this.field_baseItemData = paramCursor.getBlob(i);
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label57: if (dSs == k)
        this.field_timeStamp = paramCursor.getLong(i);
      else if (dSt == k)
        this.field_storyLocalId = paramCursor.getInt(i);
      else if (dSu == k)
        this.field_mixFlag = paramCursor.getInt(i);
      else if (dSv == k)
        this.field_mixRetryTime = paramCursor.getInt(i);
      else if (dSw == k)
        this.field_available = paramCursor.getInt(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.eq
 * JD-Core Version:    0.6.2
 */