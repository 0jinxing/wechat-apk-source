package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class bs extends c
{
  private static final int dBH = "ForcePushId".hashCode();
  private static final int dBI = "CreateTime".hashCode();
  private static final int dBJ = "ExpiredTime".hashCode();
  private static final int dBK = "Description".hashCode();
  private static final int dBL = "UserIcon".hashCode();
  private static final int dBM = "UserName".hashCode();
  private static final int dBN = "Extinfo".hashCode();
  private static final int dBO = "Status".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private boolean dBA = true;
  private boolean dBB = true;
  private boolean dBC = true;
  private boolean dBD = true;
  private boolean dBE = true;
  private boolean dBF = true;
  private boolean dBG = true;
  private boolean dBz = true;
  public long field_CreateTime;
  public String field_Description;
  public long field_ExpiredTime;
  public String field_Extinfo;
  public String field_ForcePushId;
  public int field_Status;
  public String field_UserIcon;
  public String field_UserName;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dBz)
      localContentValues.put("ForcePushId", this.field_ForcePushId);
    if (this.dBA)
      localContentValues.put("CreateTime", Long.valueOf(this.field_CreateTime));
    if (this.dBB)
      localContentValues.put("ExpiredTime", Long.valueOf(this.field_ExpiredTime));
    if (this.dBC)
      localContentValues.put("Description", this.field_Description);
    if (this.dBD)
      localContentValues.put("UserIcon", this.field_UserIcon);
    if (this.dBE)
      localContentValues.put("UserName", this.field_UserName);
    if (this.dBF)
      localContentValues.put("Extinfo", this.field_Extinfo);
    if (this.dBG)
      localContentValues.put("Status", Integer.valueOf(this.field_Status));
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
      if (dBH != k)
        break label57;
      this.field_ForcePushId = paramCursor.getString(i);
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label57: if (dBI == k)
      {
        this.field_CreateTime = paramCursor.getLong(i);
      }
      else if (dBJ == k)
      {
        this.field_ExpiredTime = paramCursor.getLong(i);
      }
      else if (dBK == k)
      {
        this.field_Description = paramCursor.getString(i);
      }
      else if (dBL == k)
      {
        this.field_UserIcon = paramCursor.getString(i);
      }
      else if (dBM == k)
      {
        this.field_UserName = paramCursor.getString(i);
        this.dBE = true;
      }
      else if (dBN == k)
      {
        this.field_Extinfo = paramCursor.getString(i);
      }
      else if (dBO == k)
      {
        this.field_Status = paramCursor.getInt(i);
      }
      else if (diR == k)
      {
        this.xDa = paramCursor.getLong(i);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.bs
 * JD-Core Version:    0.6.2
 */