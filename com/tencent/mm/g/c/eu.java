package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class eu extends c
{
  private static final int dTk = "contactLabels".hashCode();
  private static final int dTl = "conDescription".hashCode();
  private static final int dTm = "conPhone".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dtB;
  private static final int dtL = "encryptUsername".hashCode();
  private boolean dTh = true;
  private boolean dTi = true;
  private boolean dTj = true;
  private boolean dtk = true;
  private boolean dtu = true;
  public String field_conDescription;
  public String field_conPhone;
  public String field_conRemark;
  public String field_contactLabels;
  public String field_encryptUsername;

  static
  {
    dtB = "conRemark".hashCode();
  }

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.field_encryptUsername == null)
      this.field_encryptUsername = "";
    if (this.dtu)
      localContentValues.put("encryptUsername", this.field_encryptUsername);
    if (this.field_conRemark == null)
      this.field_conRemark = "";
    if (this.dtk)
      localContentValues.put("conRemark", this.field_conRemark);
    if (this.field_contactLabels == null)
      this.field_contactLabels = "";
    if (this.dTh)
      localContentValues.put("contactLabels", this.field_contactLabels);
    if (this.field_conDescription == null)
      this.field_conDescription = "";
    if (this.dTi)
      localContentValues.put("conDescription", this.field_conDescription);
    if (this.field_conPhone == null)
      this.field_conPhone = "";
    if (this.dTj)
      localContentValues.put("conPhone", this.field_conPhone);
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
      if (dtL != k)
        break label62;
      this.field_encryptUsername = paramCursor.getString(i);
      this.dtu = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dtB == k)
        this.field_conRemark = paramCursor.getString(i);
      else if (dTk == k)
        this.field_contactLabels = paramCursor.getString(i);
      else if (dTl == k)
        this.field_conDescription = paramCursor.getString(i);
      else if (dTm == k)
        this.field_conPhone = paramCursor.getString(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.eu
 * JD-Core Version:    0.6.2
 */