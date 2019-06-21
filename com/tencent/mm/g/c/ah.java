package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ah extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dkf;
  private static final int dqM = "canvasId".hashCode();
  private static final int dqN = "canvasXml".hashCode();
  private boolean djH = true;
  private boolean dqK = true;
  private boolean dqL = true;
  public long field_canvasId;
  public String field_canvasXml;
  public long field_createTime;

  static
  {
    dkf = "createTime".hashCode();
  }

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dqK)
      localContentValues.put("canvasId", Long.valueOf(this.field_canvasId));
    if (this.dqL)
      localContentValues.put("canvasXml", this.field_canvasXml);
    if (this.djH)
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
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
      if (dqM != k)
        break label62;
      this.field_canvasId = paramCursor.getLong(i);
      this.dqK = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dqN == k)
        this.field_canvasXml = paramCursor.getString(i);
      else if (dkf == k)
        this.field_createTime = paramCursor.getLong(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.ah
 * JD-Core Version:    0.6.2
 */