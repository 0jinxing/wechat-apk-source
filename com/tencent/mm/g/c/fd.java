package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class fd extends c
{
  private static final int dVR = "wallet_region".hashCode();
  private static final int dVS = "function_list".hashCode();
  private static final int dVT = "new_list".hashCode();
  private static final int dVU = "banner_list".hashCode();
  private static final int dVV = "type_name_list".hashCode();
  private static final int dVW = "isShowSetting".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private boolean dVL = true;
  private boolean dVM = true;
  private boolean dVN = true;
  private boolean dVO = true;
  private boolean dVP = true;
  private boolean dVQ = true;
  public String field_banner_list;
  public String field_function_list;
  public int field_isShowSetting;
  public String field_new_list;
  public String field_type_name_list;
  public int field_wallet_region;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dVL)
      localContentValues.put("wallet_region", Integer.valueOf(this.field_wallet_region));
    if (this.dVM)
      localContentValues.put("function_list", this.field_function_list);
    if (this.dVN)
      localContentValues.put("new_list", this.field_new_list);
    if (this.dVO)
      localContentValues.put("banner_list", this.field_banner_list);
    if (this.dVP)
      localContentValues.put("type_name_list", this.field_type_name_list);
    if (this.dVQ)
      localContentValues.put("isShowSetting", Integer.valueOf(this.field_isShowSetting));
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
      label62: if (dVS == k)
        this.field_function_list = paramCursor.getString(i);
      else if (dVT == k)
        this.field_new_list = paramCursor.getString(i);
      else if (dVU == k)
        this.field_banner_list = paramCursor.getString(i);
      else if (dVV == k)
        this.field_type_name_list = paramCursor.getString(i);
      else if (dVW == k)
        this.field_isShowSetting = paramCursor.getInt(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.fd
 * JD-Core Version:    0.6.2
 */