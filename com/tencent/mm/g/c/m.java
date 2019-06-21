package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class m extends c
{
  public static final String[] diI = { "CREATE INDEX IF NOT EXISTS AppBrandLauncherLayoutItemUpdateTimeIndex ON AppBrandLauncherLayoutItem(updateTime)", "CREATE INDEX IF NOT EXISTS AppBrandLauncherLayoutItemSceneIndex ON AppBrandLauncherLayoutItem(scene)" };
  private static final int diR = "rowid".hashCode();
  private static final int dkC;
  private static final int dlF = "recordId".hashCode();
  private static final int dlG = "brandId".hashCode();
  private static final int dlH = "versionType".hashCode();
  private static final int dlp = "updateTime".hashCode();
  private boolean dkA = true;
  private boolean dlC = true;
  private boolean dlD = true;
  private boolean dlE = true;
  private boolean dln = true;
  public String field_brandId;
  public int field_recordId;
  public int field_scene;
  public long field_updateTime;
  public int field_versionType;

  static
  {
    dkC = "scene".hashCode();
  }

  public ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dlC)
      localContentValues.put("recordId", Integer.valueOf(this.field_recordId));
    if (this.dlD)
      localContentValues.put("brandId", this.field_brandId);
    if (this.dlE)
      localContentValues.put("versionType", Integer.valueOf(this.field_versionType));
    if (this.dln)
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    if (this.dkA)
      localContentValues.put("scene", Integer.valueOf(this.field_scene));
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
      if (dlF != k)
        break label62;
      this.field_recordId = paramCursor.getInt(i);
      this.dlC = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dlG == k)
        this.field_brandId = paramCursor.getString(i);
      else if (dlH == k)
        this.field_versionType = paramCursor.getInt(i);
      else if (dlp == k)
        this.field_updateTime = paramCursor.getLong(i);
      else if (dkC == k)
        this.field_scene = paramCursor.getInt(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.m
 * JD-Core Version:    0.6.2
 */