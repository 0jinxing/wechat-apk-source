package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class es extends c
{
  private static final int dSK = "userStoryFlag".hashCode();
  private static final int dTb;
  private static final int dTc = "newStoryList".hashCode();
  private static final int dTd = "extbuf".hashCode();
  private static final int dTe = "nextSyncTime".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private boolean dSX = true;
  private boolean dSY = true;
  private boolean dSZ = true;
  private boolean dSx = true;
  private boolean dTa = true;
  public byte[] field_extbuf;
  public String field_newStoryList;
  public long field_nextSyncTime;
  public String field_roomname;
  public int field_userStoryFlag;

  static
  {
    dTb = "roomname".hashCode();
  }

  public static c.a Hm()
  {
    c.a locala = new c.a();
    locala.xDb = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "roomname";
    locala.xDd.put("roomname", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" roomname TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "roomname";
    locala.columns[1] = "userStoryFlag";
    locala.xDd.put("userStoryFlag", "INTEGER");
    localStringBuilder.append(" userStoryFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "newStoryList";
    locala.xDd.put("newStoryList", "TEXT");
    localStringBuilder.append(" newStoryList TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "extbuf";
    locala.xDd.put("extbuf", "BLOB");
    localStringBuilder.append(" extbuf BLOB");
    localStringBuilder.append(", ");
    locala.columns[4] = "nextSyncTime";
    locala.xDd.put("nextSyncTime", "LONG");
    localStringBuilder.append(" nextSyncTime LONG");
    locala.columns[5] = "rowid";
    locala.sql = localStringBuilder.toString();
    return locala;
  }

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.field_roomname == null)
      this.field_roomname = "";
    if (this.dSX)
      localContentValues.put("roomname", this.field_roomname);
    if (this.dSx)
      localContentValues.put("userStoryFlag", Integer.valueOf(this.field_userStoryFlag));
    if (this.dSY)
      localContentValues.put("newStoryList", this.field_newStoryList);
    if (this.dSZ)
      localContentValues.put("extbuf", this.field_extbuf);
    if (this.dTa)
      localContentValues.put("nextSyncTime", Long.valueOf(this.field_nextSyncTime));
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
      if (dTb != k)
        break label62;
      this.field_roomname = paramCursor.getString(i);
      this.dSX = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dSK == k)
        this.field_userStoryFlag = paramCursor.getInt(i);
      else if (dTc == k)
        this.field_newStoryList = paramCursor.getString(i);
      else if (dTd == k)
        this.field_extbuf = paramCursor.getBlob(i);
      else if (dTe == k)
        this.field_nextSyncTime = paramCursor.getLong(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.es
 * JD-Core Version:    0.6.2
 */