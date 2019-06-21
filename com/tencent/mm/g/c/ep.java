package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class ep extends c
{
  private static final int dSf = "storyId".hashCode();
  private static final int dSg = "readCommentId".hashCode();
  private static final int dSh = "syncCommentId".hashCode();
  private static final int dSi = "readCommentTime".hashCode();
  private static final int dSj = "syncCommentTime".hashCode();
  private static final int dSk = "commentFlag".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private boolean dRZ = true;
  private boolean dSa = true;
  private boolean dSb = true;
  private boolean dSc = true;
  private boolean dSd = true;
  private boolean dSe = true;
  public int field_commentFlag;
  public int field_readCommentId;
  public int field_readCommentTime;
  public long field_storyId;
  public int field_syncCommentId;
  public int field_syncCommentTime;

  public static c.a Hm()
  {
    c.a locala = new c.a();
    locala.xDb = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "storyId";
    locala.xDd.put("storyId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" storyId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "storyId";
    locala.columns[1] = "readCommentId";
    locala.xDd.put("readCommentId", "INTEGER");
    localStringBuilder.append(" readCommentId INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "syncCommentId";
    locala.xDd.put("syncCommentId", "INTEGER");
    localStringBuilder.append(" syncCommentId INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "readCommentTime";
    locala.xDd.put("readCommentTime", "INTEGER");
    localStringBuilder.append(" readCommentTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "syncCommentTime";
    locala.xDd.put("syncCommentTime", "INTEGER");
    localStringBuilder.append(" syncCommentTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "commentFlag";
    locala.xDd.put("commentFlag", "INTEGER");
    localStringBuilder.append(" commentFlag INTEGER");
    locala.columns[6] = "rowid";
    locala.sql = localStringBuilder.toString();
    return locala;
  }

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dRZ)
      localContentValues.put("storyId", Long.valueOf(this.field_storyId));
    if (this.dSa)
      localContentValues.put("readCommentId", Integer.valueOf(this.field_readCommentId));
    if (this.dSb)
      localContentValues.put("syncCommentId", Integer.valueOf(this.field_syncCommentId));
    if (this.dSc)
      localContentValues.put("readCommentTime", Integer.valueOf(this.field_readCommentTime));
    if (this.dSd)
      localContentValues.put("syncCommentTime", Integer.valueOf(this.field_syncCommentTime));
    if (this.dSe)
      localContentValues.put("commentFlag", Integer.valueOf(this.field_commentFlag));
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
      if (dSf != k)
        break label62;
      this.field_storyId = paramCursor.getLong(i);
      this.dRZ = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dSg == k)
        this.field_readCommentId = paramCursor.getInt(i);
      else if (dSh == k)
        this.field_syncCommentId = paramCursor.getInt(i);
      else if (dSi == k)
        this.field_readCommentTime = paramCursor.getInt(i);
      else if (dSj == k)
        this.field_syncCommentTime = paramCursor.getInt(i);
      else if (dSk == k)
        this.field_commentFlag = paramCursor.getInt(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.ep
 * JD-Core Version:    0.6.2
 */