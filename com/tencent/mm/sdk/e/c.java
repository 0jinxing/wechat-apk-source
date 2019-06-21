package com.tencent.mm.sdk.e;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public abstract class c
{
  public long xDa = -1L;

  public static boolean a(ContentValues paramContentValues, Cursor paramCursor)
  {
    boolean bool;
    if (paramContentValues == null)
      if (paramCursor == null)
        bool = true;
    while (true)
    {
      return bool;
      bool = false;
      continue;
      if ((paramCursor == null) || (paramCursor.getCount() != 1))
      {
        bool = false;
      }
      else
      {
        paramCursor.moveToFirst();
        int i = paramCursor.getColumnCount();
        int j = paramContentValues.size();
        int k = j;
        if (paramContentValues.containsKey("rowid"))
          k = j - 1;
        j = i;
        if (paramCursor.getColumnIndex("rowid") != -1)
          j = i - 1;
        if (k != j)
        {
          bool = false;
        }
        else
        {
          try
          {
            Iterator localIterator = paramContentValues.valueSet().iterator();
            label312: label316: label318: 
            do
            {
              Object localObject;
              while (true)
              {
                if (!localIterator.hasNext())
                  break label405;
                localObject = (String)((Map.Entry)localIterator.next()).getKey();
                if (!((String)localObject).equals("rowid"))
                {
                  k = paramCursor.getColumnIndex((String)localObject);
                  if (k == -1)
                  {
                    bool = false;
                    break;
                  }
                  if (!(paramContentValues.get((String)localObject) instanceof byte[]))
                    break label318;
                  localObject = (byte[])paramContentValues.get((String)localObject);
                  byte[] arrayOfByte = paramCursor.getBlob(k);
                  if ((localObject != null) || (arrayOfByte != null))
                    if ((localObject == null) && (arrayOfByte != null))
                      k = 0;
                  while (true)
                  {
                    if (k != 0)
                      break label316;
                    bool = false;
                    break;
                    if ((localObject != null) && (arrayOfByte == null))
                    {
                      k = 0;
                    }
                    else if (localObject.length != arrayOfByte.length)
                    {
                      k = 0;
                    }
                    else
                    {
                      for (k = 0; ; k++)
                      {
                        if (k >= localObject.length)
                          break label312;
                        if (localObject[k] != arrayOfByte[k])
                        {
                          k = 0;
                          break;
                        }
                      }
                      k = 1;
                    }
                  }
                }
              }
              if ((paramCursor.getString(k) == null) && (paramContentValues.get((String)localObject) != null))
              {
                bool = false;
                break;
              }
              if (paramContentValues.get((String)localObject) == null)
              {
                bool = false;
                break;
              }
              bool = paramContentValues.get((String)localObject).toString().equals(paramCursor.getString(k));
            }
            while (bool);
            bool = false;
          }
          catch (Exception paramContentValues)
          {
            ab.printErrStackTrace("MicroMsg.SDK.IAutoDBItem", paramContentValues, "", new Object[0]);
            bool = false;
          }
          continue;
          label405: bool = true;
        }
      }
    }
  }

  private static String[] a(Field[] paramArrayOfField)
  {
    String[] arrayOfString = new String[paramArrayOfField.length + 1];
    int i = 0;
    if (i < paramArrayOfField.length)
    {
      arrayOfString[i] = b(paramArrayOfField[i]);
      String str = "getFullColumns failed:" + paramArrayOfField[i].getName();
      if (!bo.isNullOrNil(arrayOfString[i]));
      for (boolean bool = true; ; bool = false)
      {
        Assert.assertTrue(str, bool);
        i++;
        break;
      }
    }
    arrayOfString[paramArrayOfField.length] = "rowid";
    return arrayOfString;
  }

  public static a ax(Class<?> paramClass)
  {
    a locala = new a();
    LinkedList localLinkedList = new LinkedList();
    Field[] arrayOfField = paramClass.getDeclaredFields();
    int i = arrayOfField.length;
    int j = 0;
    if (j < i)
    {
      Field localField = arrayOfField[j];
      int k = localField.getModifiers();
      String str = localField.getName();
      if ((str != null) && (Modifier.isPublic(k)) && (!Modifier.isFinal(k)))
      {
        if (!str.startsWith("field_"))
          break label165;
        paramClass = str.substring(6);
        label94: if (!localField.isAnnotationPresent(i.class))
          break label171;
        if (((i)localField.getAnnotation(i.class)).dpW() == 1)
          locala.xDc = paramClass;
      }
      while (true)
      {
        if (!bo.isNullOrNil(paramClass))
        {
          if (paramClass.equals("rowid"))
            Assert.assertTrue("field_rowid reserved by MAutoDBItem, change now!", false);
          localLinkedList.add(localField);
        }
        label165: label171: 
        do
        {
          j++;
          break;
          paramClass = str;
          break label94;
        }
        while (!str.startsWith("field_"));
      }
    }
    locala.xDb = ((Field[])localLinkedList.toArray(new Field[0]));
    locala.columns = a(locala.xDb);
    locala.xDd = b(locala.xDb);
    locala.sql = c(locala.xDb);
    return locala;
  }

  public static String b(Field paramField)
  {
    Object localObject = null;
    if (paramField == null)
      paramField = localObject;
    while (true)
    {
      return paramField;
      String str = paramField.getName();
      paramField = localObject;
      if (str != null)
      {
        paramField = localObject;
        if (str.length() > 0)
          if (str.startsWith("field_"))
            paramField = str.substring(6);
          else
            paramField = str;
      }
    }
  }

  private static Map<String, String> b(Field[] paramArrayOfField)
  {
    HashMap localHashMap = new HashMap();
    int i = 0;
    if (i < paramArrayOfField.length)
    {
      Object localObject = paramArrayOfField[i];
      String str = b.aw(((Field)localObject).getType());
      if (str == null)
        ab.e("MicroMsg.SDK.IAutoDBItem", "failed identify on column: " + ((Field)localObject).getName() + ", skipped");
      while (true)
      {
        i++;
        break;
        localObject = b((Field)localObject);
        if (!bo.isNullOrNil((String)localObject))
          localHashMap.put(localObject, str);
      }
    }
    return localHashMap;
  }

  private static String c(Field[] paramArrayOfField)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    Field localField;
    String str1;
    Object localObject;
    String str2;
    if (i < paramArrayOfField.length)
    {
      localField = paramArrayOfField[i];
      str1 = b.aw(localField.getType());
      if (str1 == null)
        ab.e("MicroMsg.SDK.IAutoDBItem", "failed identify on column: " + localField.getName() + ", skipped");
      do
      {
        i++;
        break;
        localObject = b(localField);
      }
      while (bo.isNullOrNil((String)localObject));
      str2 = "";
      if (!localField.isAnnotationPresent(i.class))
        break label248;
      str2 = " default '" + ((i)localField.getAnnotation(i.class)).dpV() + "' ";
    }
    label191: label235: label248: for (int j = ((i)localField.getAnnotation(i.class)).dpW(); ; j = 0)
    {
      localObject = new StringBuilder().append((String)localObject).append(" ").append(str1).append(str2);
      if (j == 1)
      {
        str2 = " PRIMARY KEY ";
        localStringBuilder.append(str2);
        if (i != paramArrayOfField.length - 1)
          break label235;
      }
      for (str2 = ""; ; str2 = ", ")
      {
        localStringBuilder.append(str2);
        break;
        str2 = "";
        break label191;
      }
      return localStringBuilder.toString();
    }
  }

  protected abstract a Ag();

  public abstract ContentValues Hl();

  public abstract void d(Cursor paramCursor);

  public static final class a
  {
    public String[] columns;
    public String sql;
    public Field[] xDb;
    public String xDc;
    public Map<String, String> xDd;

    public a()
    {
      AppMethodBeat.i(52515);
      this.xDd = new HashMap();
      AppMethodBeat.o(52515);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.e.c
 * JD-Core Version:    0.6.2
 */