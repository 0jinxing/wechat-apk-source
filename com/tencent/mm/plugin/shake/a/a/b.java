package com.tencent.mm.plugin.shake.a.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class b extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dlo = "username".hashCode();
  private static final int qrx = "lastshaketime".hashCode();
  private static final int qry = "isshowed".hashCode();
  private boolean dlm;
  public boolean field_isshowed;
  public int field_lastshaketime;
  public String field_username;
  private boolean qrv;
  private boolean qrw;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.field_username == null)
      this.field_username = "";
    if (this.dlm)
      localContentValues.put("username", this.field_username);
    if (this.qrv)
      localContentValues.put("lastshaketime", Integer.valueOf(this.field_lastshaketime));
    if (this.qrw)
      localContentValues.put("isshowed", Boolean.valueOf(this.field_isshowed));
    if (this.xDa > 0L)
      localContentValues.put("rowid", Long.valueOf(this.xDa));
    return localContentValues;
  }

  public final void d(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
      return;
    int i = arrayOfString.length;
    int j = 0;
    label18: int k;
    if (j < i)
    {
      k = arrayOfString[j].hashCode();
      if (dlo != k)
        break label64;
      this.field_username = paramCursor.getString(j);
      this.dlm = true;
    }
    while (true)
    {
      j++;
      break label18;
      break;
      label64: if (qrx == k)
      {
        this.field_lastshaketime = paramCursor.getInt(j);
      }
      else
      {
        if (qry == k)
        {
          if (paramCursor.getInt(j) != 0);
          for (boolean bool = true; ; bool = false)
          {
            this.field_isshowed = bool;
            break;
          }
        }
        if (diR == k)
          this.xDa = paramCursor.getLong(j);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.a.a.b
 * JD-Core Version:    0.6.2
 */