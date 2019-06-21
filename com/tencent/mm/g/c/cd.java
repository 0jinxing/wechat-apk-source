package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class cd extends c
{
  private static final int dEJ = "championUrl".hashCode();
  private static final int dEK = "championMotto".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dlo = "username".hashCode();
  private boolean dEH = true;
  private boolean dEI = true;
  private boolean dlm = true;
  public String field_championMotto;
  public String field_championUrl;
  public String field_username;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dlm)
      localContentValues.put("username", this.field_username);
    if (this.dEH)
      localContentValues.put("championUrl", this.field_championUrl);
    if (this.dEI)
      localContentValues.put("championMotto", this.field_championMotto);
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
      if (dlo != k)
        break label57;
      this.field_username = paramCursor.getString(i);
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label57: if (dEJ == k)
        this.field_championUrl = paramCursor.getString(i);
      else if (dEK == k)
        this.field_championMotto = paramCursor.getString(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.cd
 * JD-Core Version:    0.6.2
 */