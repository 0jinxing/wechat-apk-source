package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class cu extends c
{
  private static final int dIL = "loan_jump_url".hashCode();
  private static final int dIM = "red_dot_index".hashCode();
  private static final int dIN = "is_show_entry".hashCode();
  private static final int dIO = "tips".hashCode();
  private static final int dIP = "is_overdue".hashCode();
  private static final int dIQ = "available_otb".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dnA = "title".hashCode();
  private boolean dIF = true;
  private boolean dIG = true;
  private boolean dIH = true;
  private boolean dII = true;
  private boolean dIJ = true;
  private boolean dIK = true;
  private boolean dnx = true;
  public String field_available_otb;
  public int field_is_overdue;
  public int field_is_show_entry;
  public String field_loan_jump_url;
  public int field_red_dot_index;
  public String field_tips;
  public String field_title;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dnx)
      localContentValues.put("title", this.field_title);
    if (this.dIF)
      localContentValues.put("loan_jump_url", this.field_loan_jump_url);
    if (this.dIG)
      localContentValues.put("red_dot_index", Integer.valueOf(this.field_red_dot_index));
    if (this.dIH)
      localContentValues.put("is_show_entry", Integer.valueOf(this.field_is_show_entry));
    if (this.dII)
      localContentValues.put("tips", this.field_tips);
    if (this.dIJ)
      localContentValues.put("is_overdue", Integer.valueOf(this.field_is_overdue));
    if (this.dIK)
      localContentValues.put("available_otb", this.field_available_otb);
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
      if (dnA != k)
        break label62;
      this.field_title = paramCursor.getString(i);
      this.dnx = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dIL == k)
        this.field_loan_jump_url = paramCursor.getString(i);
      else if (dIM == k)
        this.field_red_dot_index = paramCursor.getInt(i);
      else if (dIN == k)
        this.field_is_show_entry = paramCursor.getInt(i);
      else if (dIO == k)
        this.field_tips = paramCursor.getString(i);
      else if (dIP == k)
        this.field_is_overdue = paramCursor.getInt(i);
      else if (dIQ == k)
        this.field_available_otb = paramCursor.getString(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.cu
 * JD-Core Version:    0.6.2
 */