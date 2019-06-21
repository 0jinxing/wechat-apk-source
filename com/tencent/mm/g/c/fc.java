package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class fc extends c
{
  private static final int dVI = "bulletin_scene".hashCode();
  private static final int dVJ = "bulletin_content".hashCode();
  private static final int dVK = "bulletin_url".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private boolean dVF = true;
  private boolean dVG = true;
  private boolean dVH = true;
  public String field_bulletin_content;
  public String field_bulletin_scene;
  public String field_bulletin_url;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dVF)
      localContentValues.put("bulletin_scene", this.field_bulletin_scene);
    if (this.dVG)
      localContentValues.put("bulletin_content", this.field_bulletin_content);
    if (this.dVH)
      localContentValues.put("bulletin_url", this.field_bulletin_url);
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
      if (dVI != k)
        break label62;
      this.field_bulletin_scene = paramCursor.getString(i);
      this.dVF = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dVJ == k)
        this.field_bulletin_content = paramCursor.getString(i);
      else if (dVK == k)
        this.field_bulletin_url = paramCursor.getString(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.fc
 * JD-Core Version:    0.6.2
 */