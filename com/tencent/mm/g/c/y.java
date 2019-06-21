package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class y extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dnS = "appMsgReportContextId".hashCode();
  private static final int dnT = "url".hashCode();
  private static final int dnU = "reportTime".hashCode();
  private static final int dnV = "aScene".hashCode();
  private boolean dnO = true;
  private boolean dnP = true;
  private boolean dnQ = true;
  private boolean dnR = true;
  public int field_aScene;
  public long field_appMsgReportContextId;
  public long field_reportTime;
  public String field_url;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dnO)
      localContentValues.put("appMsgReportContextId", Long.valueOf(this.field_appMsgReportContextId));
    if (this.dnP)
      localContentValues.put("url", this.field_url);
    if (this.dnQ)
      localContentValues.put("reportTime", Long.valueOf(this.field_reportTime));
    if (this.dnR)
      localContentValues.put("aScene", Integer.valueOf(this.field_aScene));
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
      if (dnS != k)
        break label62;
      this.field_appMsgReportContextId = paramCursor.getLong(i);
      this.dnO = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dnT == k)
        this.field_url = paramCursor.getString(i);
      else if (dnU == k)
        this.field_reportTime = paramCursor.getLong(i);
      else if (dnV == k)
        this.field_aScene = paramCursor.getInt(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.y
 * JD-Core Version:    0.6.2
 */