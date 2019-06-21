package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class af extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dlp;
  private static final int dmP = "openId".hashCode();
  private static final int dqi = "brandUsername".hashCode();
  private static final int dqj = "headImgUrl".hashCode();
  private static final int dqk = "nickname".hashCode();
  private static final int dql = "kfType".hashCode();
  private boolean dln = true;
  private boolean dms = true;
  private boolean dqe = true;
  private boolean dqf = true;
  private boolean dqg = true;
  private boolean dqh = true;
  public String field_brandUsername;
  public String field_headImgUrl;
  public int field_kfType;
  public String field_nickname;
  public String field_openId;
  public long field_updateTime;

  static
  {
    dlp = "updateTime".hashCode();
  }

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dms)
      localContentValues.put("openId", this.field_openId);
    if (this.field_brandUsername == null)
      this.field_brandUsername = "";
    if (this.dqe)
      localContentValues.put("brandUsername", this.field_brandUsername);
    if (this.dqf)
      localContentValues.put("headImgUrl", this.field_headImgUrl);
    if (this.dqg)
      localContentValues.put("nickname", this.field_nickname);
    if (this.dqh)
      localContentValues.put("kfType", Integer.valueOf(this.field_kfType));
    if (this.dln)
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
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
      if (dmP != k)
        break label62;
      this.field_openId = paramCursor.getString(i);
      this.dms = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dqi == k)
        this.field_brandUsername = paramCursor.getString(i);
      else if (dqj == k)
        this.field_headImgUrl = paramCursor.getString(i);
      else if (dqk == k)
        this.field_nickname = paramCursor.getString(i);
      else if (dql == k)
        this.field_kfType = paramCursor.getInt(i);
      else if (dlp == k)
        this.field_updateTime = paramCursor.getLong(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.af
 * JD-Core Version:    0.6.2
 */