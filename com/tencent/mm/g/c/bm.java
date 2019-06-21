package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class bm extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int djh;
  private static final int dzC = "configId".hashCode();
  private boolean diZ = true;
  private boolean dzB = true;
  public int field_configId;
  public String field_value;

  static
  {
    djh = "value".hashCode();
  }

  public static c.a Hm()
  {
    c.a locala = new c.a();
    locala.xDb = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "configId";
    locala.xDd.put("configId", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" configId INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "configId";
    locala.columns[1] = "value";
    locala.xDd.put("value", "TEXT");
    localStringBuilder.append(" value TEXT");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    return locala;
  }

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dzB)
      localContentValues.put("configId", Integer.valueOf(this.field_configId));
    if (this.diZ)
      localContentValues.put("value", this.field_value);
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
      if (dzC != k)
        break label62;
      this.field_configId = paramCursor.getInt(i);
      this.dzB = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (djh == k)
        this.field_value = paramCursor.getString(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.bm
 * JD-Core Version:    0.6.2
 */