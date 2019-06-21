package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class fe extends c
{
  private static final int dWd = "wallet_tpa_country".hashCode();
  private static final int dWe = "wallet_type".hashCode();
  private static final int dWf = "wallet_name".hashCode();
  private static final int dWg = "wallet_selected".hashCode();
  private static final int dWh = "wallet_balance".hashCode();
  private static final int dWi = "wallet_tpa_country_mask".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private boolean dVX = true;
  private boolean dVY = true;
  private boolean dVZ = true;
  private boolean dWa = true;
  private boolean dWb = true;
  private boolean dWc = true;
  public int field_wallet_balance;
  public String field_wallet_name;
  public int field_wallet_selected;
  public String field_wallet_tpa_country;
  public int field_wallet_tpa_country_mask;
  public int field_wallet_type;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dVX)
      localContentValues.put("wallet_tpa_country", this.field_wallet_tpa_country);
    if (this.dVY)
      localContentValues.put("wallet_type", Integer.valueOf(this.field_wallet_type));
    if (this.dVZ)
      localContentValues.put("wallet_name", this.field_wallet_name);
    if (this.dWa)
      localContentValues.put("wallet_selected", Integer.valueOf(this.field_wallet_selected));
    if (this.dWb)
      localContentValues.put("wallet_balance", Integer.valueOf(this.field_wallet_balance));
    if (this.dWc)
      localContentValues.put("wallet_tpa_country_mask", Integer.valueOf(this.field_wallet_tpa_country_mask));
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
      if (dWd != k)
        break label62;
      this.field_wallet_tpa_country = paramCursor.getString(i);
      this.dVX = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dWe == k)
        this.field_wallet_type = paramCursor.getInt(i);
      else if (dWf == k)
        this.field_wallet_name = paramCursor.getString(i);
      else if (dWg == k)
        this.field_wallet_selected = paramCursor.getInt(i);
      else if (dWh == k)
        this.field_wallet_balance = paramCursor.getInt(i);
      else if (dWi == k)
        this.field_wallet_tpa_country_mask = paramCursor.getInt(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.fe
 * JD-Core Version:    0.6.2
 */