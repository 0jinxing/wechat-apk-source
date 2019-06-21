package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ck extends c
{
  private static final int dFP = "wechatUsername".hashCode();
  private static final int dFQ = "systemAddressBookUsername".hashCode();
  private static final int dFR = "contactId".hashCode();
  private static final int dFS = "sortKey".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private boolean dFL = true;
  private boolean dFM = true;
  private boolean dFN = true;
  private boolean dFO = true;
  public String field_contactId;
  public String field_sortKey;
  public String field_systemAddressBookUsername;
  public String field_wechatUsername;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dFL)
      localContentValues.put("wechatUsername", this.field_wechatUsername);
    if (this.dFM)
      localContentValues.put("systemAddressBookUsername", this.field_systemAddressBookUsername);
    if (this.dFN)
      localContentValues.put("contactId", this.field_contactId);
    if (this.dFO)
      localContentValues.put("sortKey", this.field_sortKey);
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
      if (dFP != k)
        break label57;
      this.field_wechatUsername = paramCursor.getString(i);
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label57: if (dFQ == k)
        this.field_systemAddressBookUsername = paramCursor.getString(i);
      else if (dFR == k)
        this.field_contactId = paramCursor.getString(i);
      else if (dFS == k)
        this.field_sortKey = paramCursor.getString(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.ck
 * JD-Core Version:    0.6.2
 */