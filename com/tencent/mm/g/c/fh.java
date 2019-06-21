package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class fh extends c
{
  private static final int dVR = "wallet_region".hashCode();
  private static final int dWG = "wallet_grey_item_buf".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private boolean dVL = true;
  private boolean dWF = true;
  public byte[] field_wallet_grey_item_buf;
  public int field_wallet_region;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dVL)
      localContentValues.put("wallet_region", Integer.valueOf(this.field_wallet_region));
    if (this.dWF)
      localContentValues.put("wallet_grey_item_buf", this.field_wallet_grey_item_buf);
    if (this.xDa > 0L)
      localContentValues.put("rowid", Long.valueOf(this.xDa));
    return localContentValues;
  }

  public void d(Cursor paramCursor)
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
      if (dVR != k)
        break label62;
      this.field_wallet_region = paramCursor.getInt(i);
      this.dVL = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dWG == k)
        this.field_wallet_grey_item_buf = paramCursor.getBlob(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.fh
 * JD-Core Version:    0.6.2
 */