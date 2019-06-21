package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class dh extends c
{
  private static final int dMi = "sceneFlag".hashCode();
  private static final int dMj = "msgTypeFlag".hashCode();
  private static final int dMk = "msgState".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int diX;
  private static final int dkV = "appId".hashCode();
  private static final int dmH = "packageName".hashCode();
  private boolean dMf = true;
  private boolean dMg = true;
  private boolean dMh = true;
  private boolean diU = true;
  private boolean dkE = true;
  private boolean dmk = true;
  public String field_appId;
  public int field_msgState;
  public int field_msgTypeFlag;
  public String field_packageName;
  public int field_sceneFlag;
  public int field_status;

  static
  {
    diX = "status".hashCode();
  }

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dkE)
      localContentValues.put("appId", this.field_appId);
    if (this.dmk)
      localContentValues.put("packageName", this.field_packageName);
    if (this.diU)
      localContentValues.put("status", Integer.valueOf(this.field_status));
    if (this.dMf)
      localContentValues.put("sceneFlag", Integer.valueOf(this.field_sceneFlag));
    if (this.dMg)
      localContentValues.put("msgTypeFlag", Integer.valueOf(this.field_msgTypeFlag));
    if (this.dMh)
      localContentValues.put("msgState", Integer.valueOf(this.field_msgState));
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
        break label62;
      this.field_appId = paramCursor.getString(i);
      this.dkE = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dmH == k)
        this.field_packageName = paramCursor.getString(i);
      else if (diX == k)
        this.field_status = paramCursor.getInt(i);
      else if (dMi == k)
        this.field_sceneFlag = paramCursor.getInt(i);
      else if (dMj == k)
        this.field_msgTypeFlag = paramCursor.getInt(i);
      else if (dMk == k)
        this.field_msgState = paramCursor.getInt(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.dh
 * JD-Core Version:    0.6.2
 */