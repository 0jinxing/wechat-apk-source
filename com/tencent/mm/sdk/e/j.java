package com.tencent.mm.sdk.e;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public abstract class j<T extends c> extends k
  implements d<T>
{
  private final e bSd;
  public int field_MARK_CURSOR_CHECK_IGNORE = 1;
  private final String table;
  protected final c.a xDe;

  public j(e parame, c.a parama, String paramString, String[] paramArrayOfString)
  {
    this.bSd = parame;
    this.xDe = parama;
    parama = this.xDe;
    if (bo.isNullOrNil(this.xDe.xDc));
    int j;
    for (parame = "rowid"; ; parame = this.xDe.xDc)
    {
      parama.xDc = parame;
      this.table = paramString;
      parame = a(this.xDe, getTableName(), this.bSd);
      for (j = 0; j < parame.size(); j++)
        if (!this.bSd.hY(this.table, (String)parame.get(j)))
          ab.i("MicroMsg.SDK.MAutoStorage", "updateColumnSQLs table failed %s, sql %s", new Object[] { this.table, parame.get(j) });
    }
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
      for (j = i; j < paramArrayOfString.length; j++)
        this.bSd.hY(this.table, paramArrayOfString[j]);
  }

  public static String a(c.a parama, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CREATE TABLE IF NOT EXISTS " + paramString + " ( ");
    localStringBuilder.append(parama.sql);
    localStringBuilder.append(");");
    return localStringBuilder.toString();
  }

  private static StringBuilder a(ContentValues paramContentValues, String[] paramArrayOfString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = paramArrayOfString.length;
    int j = 0;
    if (j < i)
    {
      String str = paramArrayOfString[j];
      localStringBuilder.append(str + " = ? AND ");
      if (paramContentValues.get(str) != null);
    }
    for (paramContentValues = null; ; paramContentValues = localStringBuilder)
    {
      return paramContentValues;
      j++;
      break;
      localStringBuilder.append(" 1=1");
    }
  }

  public static List<String> a(c.a parama, String paramString, e parame)
  {
    ArrayList localArrayList = new ArrayList();
    boolean bool;
    if ((parame == null) || (paramString == null))
      if (parame == null)
      {
        bool = true;
        ab.e("MicroMsg.SDK.MAutoStorage", "dk getUpdateSQLs db==null :%b  table:%s", new Object[] { Boolean.valueOf(bool), paramString });
      }
    while (true)
    {
      return localArrayList;
      bool = false;
      break;
      Object localObject1 = parame.a("PRAGMA table_info( " + paramString + " )", new String[0], 2);
      if (localObject1 != null)
      {
        parame = new HashMap();
        int i = ((Cursor)localObject1).getColumnIndex("name");
        int j = ((Cursor)localObject1).getColumnIndex("type");
        while (((Cursor)localObject1).moveToNext())
          parame.put(((Cursor)localObject1).getString(i), ((Cursor)localObject1).getString(j));
        ((Cursor)localObject1).close();
        localObject1 = parama.xDd.entrySet().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
          parama = (String)((Map.Entry)localObject2).getValue();
          String str = (String)((Map.Entry)localObject2).getKey();
          if ((parama != null) && (parama.length() > 0))
          {
            localObject2 = (String)parame.get(str);
            if (localObject2 == null)
            {
              localArrayList.add("ALTER TABLE " + paramString + " ADD COLUMN " + str + " " + parama + ";");
              parame.remove(str);
            }
            else if (!parama.toLowerCase().startsWith(((String)localObject2).toLowerCase()))
            {
              ab.e("MicroMsg.SDK.MAutoStorage", "conflicting alter table on column: " + str + ", " + (String)localObject2 + "<o-n>" + parama);
              parame.remove(str);
            }
          }
        }
      }
    }
  }

  private static String[] a(String[] paramArrayOfString, ContentValues paramContentValues)
  {
    String[] arrayOfString = new String[paramArrayOfString.length];
    for (int i = 0; i < arrayOfString.length; i++)
      arrayOfString[i] = bo.nullAsNil(paramContentValues.getAsString(paramArrayOfString[i]));
    return arrayOfString;
  }

  private void anG(String paramString)
  {
    ab.d("MicroMsg.SDK.MAutoStorage", getTableName() + ":" + paramString);
  }

  private void anH(String paramString)
  {
    ab.e("MicroMsg.SDK.MAutoStorage", getTableName() + ":" + paramString);
  }

  private boolean b(ContentValues paramContentValues)
  {
    Cursor localCursor = this.bSd.query(getTableName(), this.xDe.columns, this.xDe.xDc + " = ?", new String[] { bo.nullAsNil(paramContentValues.getAsString(this.xDe.xDc)) }, null, null, null);
    boolean bool = c.a(paramContentValues, localCursor);
    localCursor.close();
    return bool;
  }

  public boolean a(long paramLong, T paramT)
  {
    return a(paramLong, paramT, true);
  }

  public final boolean a(long paramLong, T paramT, boolean paramBoolean)
  {
    paramT = paramT.Hl();
    if ((paramT == null) || (paramT.size() <= 0))
      anH("update failed, value.size <= 0");
    Cursor localCursor;
    for (boolean bool1 = false; ; bool1 = true)
    {
      return bool1;
      localCursor = this.bSd.query(getTableName(), this.xDe.columns, "rowid = ?", new String[] { String.valueOf(paramLong) }, null, null, null);
      if (!c.a(paramT, localCursor))
        break;
      localCursor.close();
      anG("no need replace , fields no change");
    }
    localCursor.close();
    if (this.bSd.update(getTableName(), paramT, "rowid = ?", new String[] { String.valueOf(paramLong) }) > 0);
    for (boolean bool2 = true; ; bool2 = false)
    {
      bool1 = bool2;
      if (!bool2)
        break;
      bool1 = bool2;
      if (!paramBoolean)
        break;
      doNotify();
      bool1 = bool2;
      break;
    }
  }

  public boolean a(T paramT)
  {
    boolean bool1 = true;
    boolean bool2;
    ContentValues localContentValues;
    int k;
    if (!bo.isNullOrNil(this.xDe.xDc))
    {
      bool2 = true;
      Assert.assertTrue("replace primaryKey == null", bool2);
      localContentValues = paramT.Hl();
      if (localContentValues != null)
      {
        int i = localContentValues.size();
        int j = paramT.Ag().xDb.length;
        if (!localContentValues.containsKey("rowid"))
          break label91;
        k = 1;
        label65: if (i == k + j)
          break label97;
      }
      anH("replace failed, cv.size() != item.fields().length");
      bool2 = false;
    }
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      label91: k = 0;
      break label65;
      label97: if (b(localContentValues))
      {
        anG("no need replace , fields no change");
        bool2 = bool1;
      }
      else if (this.bSd.replace(getTableName(), this.xDe.xDc, localContentValues) > 0L)
      {
        anF(this.xDe.xDc);
        bool2 = bool1;
      }
      else
      {
        anH("replace failed");
        bool2 = false;
      }
    }
  }

  public boolean a(T paramT, boolean paramBoolean)
  {
    boolean bool = false;
    ContentValues localContentValues = paramT.Hl();
    if ((localContentValues == null) || (localContentValues.size() <= 0))
    {
      anH("insert failed, value.size <= 0");
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      paramT.xDa = this.bSd.insert(getTableName(), this.xDe.xDc, localContentValues);
      if (paramT.xDa <= 0L)
      {
        anH("insert failed");
        paramBoolean = bool;
      }
      else
      {
        localContentValues.put("rowid", Long.valueOf(paramT.xDa));
        if (paramBoolean)
          anF(localContentValues.getAsString(this.xDe.xDc));
        paramBoolean = true;
      }
    }
  }

  public boolean a(T paramT, boolean paramBoolean, String[] paramArrayOfString)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    ContentValues localContentValues = paramT.Hl();
    if ((localContentValues == null) || (localContentValues.size() <= 0))
      anH("delete failed, value.size <= 0");
    while (true)
    {
      return bool2;
      if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
      {
        anG("delete with primary key");
        if (this.bSd.delete(getTableName(), this.xDe.xDc + " = ?", new String[] { bo.nullAsNil(localContentValues.getAsString(this.xDe.xDc)) }) > 0)
          bool1 = true;
        bool2 = bool1;
        if (bool1)
        {
          bool2 = bool1;
          if (paramBoolean)
          {
            doNotify();
            bool2 = bool1;
          }
        }
      }
      else
      {
        paramT = a(localContentValues, paramArrayOfString);
        if (paramT == null)
        {
          anH("delete failed, check keys failed");
        }
        else if ((this.bSd.delete(getTableName(), paramT.toString(), a(paramArrayOfString, localContentValues)) > 0) && (paramBoolean))
        {
          anF(this.xDe.xDc);
          bool2 = true;
        }
        else
        {
          anH("delete failed");
        }
      }
    }
  }

  public boolean a(T paramT, String[] paramArrayOfString)
  {
    return a(paramT, true, paramArrayOfString);
  }

  public final boolean b(long paramLong, T paramT)
  {
    Cursor localCursor = this.bSd.a(getTableName(), this.xDe.columns, "rowid = ?", new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    if (localCursor.moveToFirst())
    {
      paramT.d(localCursor);
      localCursor.close();
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      localCursor.close();
    }
  }

  public boolean b(T paramT)
  {
    return a(paramT, true);
  }

  public boolean b(T paramT, boolean paramBoolean, String[] paramArrayOfString)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    ContentValues localContentValues = paramT.Hl();
    if ((localContentValues == null) || (localContentValues.size() <= 0))
      anH("update failed, value.size <= 0");
    while (true)
    {
      return bool2;
      if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
      {
        anG("update with primary key");
        if (b(localContentValues))
        {
          anG("no need replace , fields no change");
          bool2 = true;
        }
        else
        {
          if (this.bSd.update(getTableName(), localContentValues, this.xDe.xDc + " = ?", new String[] { bo.nullAsNil(localContentValues.getAsString(this.xDe.xDc)) }) > 0)
            bool1 = true;
          bool2 = bool1;
          if (bool1)
          {
            bool2 = bool1;
            if (paramBoolean)
            {
              doNotify();
              bool2 = bool1;
            }
          }
        }
      }
      else
      {
        paramT = a(localContentValues, paramArrayOfString);
        if (paramT == null)
        {
          anH("update failed, check keys failed");
        }
        else if (this.bSd.update(getTableName(), localContentValues, paramT.toString(), a(paramArrayOfString, localContentValues)) > 0)
        {
          if (paramBoolean)
            anF(localContentValues.getAsString(this.xDe.xDc));
          bool2 = true;
        }
        else
        {
          anH("update failed");
        }
      }
    }
  }

  public boolean b(T paramT, String[] paramArrayOfString)
  {
    ContentValues localContentValues = paramT.Hl();
    boolean bool;
    if ((localContentValues == null) || (localContentValues.size() <= 0))
    {
      anH("get failed, value.size <= 0");
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
      {
        anG("get with primary key");
        paramArrayOfString = this.bSd.a(getTableName(), this.xDe.columns, this.xDe.xDc + " = ?", new String[] { bo.nullAsNil(localContentValues.getAsString(this.xDe.xDc)) }, null, null, null, 2);
        if (paramArrayOfString.moveToFirst())
        {
          paramT.d(paramArrayOfString);
          paramArrayOfString.close();
          bool = true;
        }
        else
        {
          paramArrayOfString.close();
          bool = false;
        }
      }
      else
      {
        StringBuilder localStringBuilder = a(localContentValues, paramArrayOfString);
        if (localStringBuilder == null)
        {
          anH("get failed, check keys failed");
          bool = false;
        }
        else
        {
          paramArrayOfString = this.bSd.a(getTableName(), this.xDe.columns, localStringBuilder.toString(), a(paramArrayOfString, localContentValues), null, null, null, 2);
          if (paramArrayOfString.moveToFirst())
          {
            paramT.d(paramArrayOfString);
            paramArrayOfString.close();
            bool = true;
          }
          else
          {
            paramArrayOfString.close();
            anG("get failed, not found");
            bool = false;
          }
        }
      }
    }
  }

  public Cursor baR()
  {
    return this.bSd.query(getTableName(), this.xDe.columns, null, null, null, null, null);
  }

  public boolean c(T paramT, String[] paramArrayOfString)
  {
    return b(paramT, true, paramArrayOfString);
  }

  public boolean delete(long paramLong)
  {
    boolean bool = true;
    if (this.bSd.delete(getTableName(), "rowid = ?", new String[] { String.valueOf(paramLong) }) > 0);
    while (true)
    {
      if (bool)
        doNotify();
      return bool;
      bool = false;
    }
  }

  public final String dpX()
  {
    return this.xDe.xDc;
  }

  public int getCount()
  {
    int i = 0;
    Cursor localCursor = rawQuery("select count(*) from " + getTableName(), new String[0]);
    if (localCursor != null)
    {
      localCursor.moveToFirst();
      i = localCursor.getInt(0);
      localCursor.close();
    }
    return i;
  }

  public String getTableName()
  {
    return this.table;
  }

  public final boolean hY(String paramString1, String paramString2)
  {
    boolean bool = false;
    if (paramString1.length() == 0)
      anH("null or nill table");
    while (true)
    {
      return bool;
      if ((paramString2 == null) || (paramString2.length() == 0))
        anH("null or nill sql");
      else
        bool = this.bSd.hY(paramString1, paramString2);
    }
  }

  public final Cursor rawQuery(String paramString, String[] paramArrayOfString)
  {
    return this.bSd.rawQuery(paramString, paramArrayOfString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.e.j
 * JD-Core Version:    0.6.2
 */