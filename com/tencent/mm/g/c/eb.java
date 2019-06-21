package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class eb extends c
{
  private static final int dPr = "originMD5".hashCode();
  private static final int dPs = "resultFile".hashCode();
  private static final int dPt = "fromLang".hashCode();
  private static final int dPu = "toLang".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private boolean dPn = true;
  private boolean dPo = true;
  private boolean dPp = true;
  private boolean dPq = true;
  public String field_fromLang;
  public String field_originMD5;
  public String field_resultFile;
  public String field_toLang;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dPn)
      localContentValues.put("originMD5", this.field_originMD5);
    if (this.dPo)
      localContentValues.put("resultFile", this.field_resultFile);
    if (this.dPp)
      localContentValues.put("fromLang", this.field_fromLang);
    if (this.dPq)
      localContentValues.put("toLang", this.field_toLang);
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
      if (dPr != k)
        break label62;
      this.field_originMD5 = paramCursor.getString(i);
      this.dPn = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dPs == k)
        this.field_resultFile = paramCursor.getString(i);
      else if (dPt == k)
        this.field_fromLang = paramCursor.getString(i);
      else if (dPu == k)
        this.field_toLang = paramCursor.getString(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.eb
 * JD-Core Version:    0.6.2
 */