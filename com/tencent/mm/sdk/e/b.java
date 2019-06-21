package com.tencent.mm.sdk.e;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

final class b
{
  private static final Map<Class<?>, Object> efv = new HashMap();
  private static final Map<Class<?>, Object> efw = new HashMap();
  private static final Map<Class<?>, String> xCZ = new HashMap();

  static
  {
    AppMethodBeat.i(52514);
    try
    {
      Object localObject1 = efv;
      Object localObject2 = new com/tencent/mm/sdk/e/b$1;
      ((1)localObject2).<init>();
      ((Map)localObject1).put([B.class, localObject2);
      localObject1 = efv;
      localObject2 = Short.TYPE;
      Object localObject3 = new com/tencent/mm/sdk/e/b$12;
      ((12)localObject3).<init>();
      ((Map)localObject1).put(localObject2, localObject3);
      localObject1 = efv;
      localObject2 = new com/tencent/mm/sdk/e/b$22;
      ((22)localObject2).<init>();
      ((Map)localObject1).put(Short.class, localObject2);
      localObject1 = efv;
      localObject2 = Boolean.TYPE;
      localObject3 = new com/tencent/mm/sdk/e/b$23;
      ((23)localObject3).<init>();
      ((Map)localObject1).put(localObject2, localObject3);
      localObject1 = efv;
      localObject2 = new com/tencent/mm/sdk/e/b$24;
      ((24)localObject2).<init>();
      ((Map)localObject1).put(Boolean.class, localObject2);
      localObject1 = efv;
      localObject2 = Integer.TYPE;
      localObject3 = new com/tencent/mm/sdk/e/b$25;
      ((25)localObject3).<init>();
      ((Map)localObject1).put(localObject2, localObject3);
      localObject1 = efv;
      localObject2 = new com/tencent/mm/sdk/e/b$26;
      ((26)localObject2).<init>();
      ((Map)localObject1).put(Integer.class, localObject2);
      localObject2 = efv;
      localObject1 = Float.TYPE;
      localObject3 = new com/tencent/mm/sdk/e/b$27;
      ((27)localObject3).<init>();
      ((Map)localObject2).put(localObject1, localObject3);
      localObject1 = efv;
      localObject2 = new com/tencent/mm/sdk/e/b$28;
      ((28)localObject2).<init>();
      ((Map)localObject1).put(Float.class, localObject2);
      localObject3 = efv;
      localObject2 = Double.TYPE;
      localObject1 = new com/tencent/mm/sdk/e/b$2;
      ((2)localObject1).<init>();
      ((Map)localObject3).put(localObject2, localObject1);
      localObject2 = efv;
      localObject1 = new com/tencent/mm/sdk/e/b$3;
      ((3)localObject1).<init>();
      ((Map)localObject2).put(Double.class, localObject1);
      localObject3 = efv;
      localObject1 = Long.TYPE;
      localObject2 = new com/tencent/mm/sdk/e/b$4;
      ((4)localObject2).<init>();
      ((Map)localObject3).put(localObject1, localObject2);
      localObject2 = efv;
      localObject1 = new com/tencent/mm/sdk/e/b$5;
      ((5)localObject1).<init>();
      ((Map)localObject2).put(Long.class, localObject1);
      localObject2 = efv;
      localObject1 = new com/tencent/mm/sdk/e/b$6;
      ((6)localObject1).<init>();
      ((Map)localObject2).put(String.class, localObject1);
      localObject1 = efw;
      localObject2 = new com/tencent/mm/sdk/e/b$7;
      ((7)localObject2).<init>();
      ((Map)localObject1).put([B.class, localObject2);
      localObject2 = efw;
      localObject3 = Short.TYPE;
      localObject1 = new com/tencent/mm/sdk/e/b$8;
      ((8)localObject1).<init>();
      ((Map)localObject2).put(localObject3, localObject1);
      localObject2 = efw;
      localObject1 = new com/tencent/mm/sdk/e/b$9;
      ((9)localObject1).<init>();
      ((Map)localObject2).put(Short.class, localObject1);
      localObject2 = efw;
      localObject1 = Boolean.TYPE;
      localObject3 = new com/tencent/mm/sdk/e/b$10;
      ((10)localObject3).<init>();
      ((Map)localObject2).put(localObject1, localObject3);
      localObject1 = efw;
      localObject2 = new com/tencent/mm/sdk/e/b$11;
      ((11)localObject2).<init>();
      ((Map)localObject1).put(Boolean.class, localObject2);
      localObject2 = efw;
      localObject1 = Integer.TYPE;
      localObject3 = new com/tencent/mm/sdk/e/b$13;
      ((13)localObject3).<init>();
      ((Map)localObject2).put(localObject1, localObject3);
      localObject1 = efw;
      localObject2 = new com/tencent/mm/sdk/e/b$14;
      ((14)localObject2).<init>();
      ((Map)localObject1).put(Integer.class, localObject2);
      localObject1 = efw;
      localObject2 = Float.TYPE;
      localObject3 = new com/tencent/mm/sdk/e/b$15;
      ((15)localObject3).<init>();
      ((Map)localObject1).put(localObject2, localObject3);
      localObject2 = efw;
      localObject1 = new com/tencent/mm/sdk/e/b$16;
      ((16)localObject1).<init>();
      ((Map)localObject2).put(Float.class, localObject1);
      localObject3 = efw;
      localObject1 = Double.TYPE;
      localObject2 = new com/tencent/mm/sdk/e/b$17;
      ((17)localObject2).<init>();
      ((Map)localObject3).put(localObject1, localObject2);
      localObject1 = efw;
      localObject2 = new com/tencent/mm/sdk/e/b$18;
      ((18)localObject2).<init>();
      ((Map)localObject1).put(Double.class, localObject2);
      localObject3 = efw;
      localObject1 = Long.TYPE;
      localObject2 = new com/tencent/mm/sdk/e/b$19;
      ((19)localObject2).<init>();
      ((Map)localObject3).put(localObject1, localObject2);
      localObject2 = efw;
      localObject1 = new com/tencent/mm/sdk/e/b$20;
      ((20)localObject1).<init>();
      ((Map)localObject2).put(Long.class, localObject1);
      localObject1 = efw;
      localObject2 = new com/tencent/mm/sdk/e/b$21;
      ((21)localObject2).<init>();
      ((Map)localObject1).put(String.class, localObject2);
      xCZ.put([B.class, "BLOB");
      xCZ.put(Short.TYPE, "SHORT");
      xCZ.put(Short.class, "SHORT");
      xCZ.put(Boolean.TYPE, "INTEGER");
      xCZ.put(Boolean.class, "INTEGER");
      xCZ.put(Integer.TYPE, "INTEGER");
      xCZ.put(Integer.class, "INTEGER");
      xCZ.put(Float.TYPE, "FLOAT");
      xCZ.put(Float.class, "FLOAT");
      xCZ.put(Double.TYPE, "DOUBLE");
      xCZ.put(Double.class, "DOUBLE");
      xCZ.put(Long.TYPE, "LONG");
      xCZ.put(Long.class, "LONG");
      xCZ.put(String.class, "TEXT");
      AppMethodBeat.o(52514);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SDK.CursorFieldHelper", localException, "", new Object[0]);
        AppMethodBeat.o(52514);
      }
    }
  }

  public static String aw(Class<?> paramClass)
  {
    AppMethodBeat.i(52497);
    paramClass = (String)xCZ.get(paramClass);
    AppMethodBeat.o(52497);
    return paramClass;
  }

  public static void keep_getBlob(Field paramField, Object paramObject, ContentValues paramContentValues)
  {
    AppMethodBeat.i(52499);
    try
    {
      paramContentValues.put(c.b(paramField), (byte[])paramField.get(paramObject));
      AppMethodBeat.o(52499);
      return;
    }
    catch (Exception paramField)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SDK.CursorFieldHelper", paramField, "", new Object[0]);
        AppMethodBeat.o(52499);
      }
    }
  }

  public static void keep_getBoolean(Field paramField, Object paramObject, ContentValues paramContentValues)
  {
    AppMethodBeat.i(52503);
    try
    {
      String str = c.b(paramField);
      if (paramField.getBoolean(paramObject));
      for (int i = 1; ; i = 0)
      {
        paramContentValues.put(str, Integer.valueOf(i));
        AppMethodBeat.o(52503);
        return;
      }
    }
    catch (Exception paramField)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SDK.CursorFieldHelper", paramField, "", new Object[0]);
        AppMethodBeat.o(52503);
      }
    }
  }

  public static void keep_getDouble(Field paramField, Object paramObject, ContentValues paramContentValues)
  {
    AppMethodBeat.i(52509);
    try
    {
      if (!paramField.getType().equals(Double.TYPE))
      {
        paramContentValues.put(c.b(paramField), (Double)paramField.get(paramObject));
        AppMethodBeat.o(52509);
      }
      while (true)
      {
        return;
        paramContentValues.put(c.b(paramField), Double.valueOf(paramField.getDouble(paramObject)));
        AppMethodBeat.o(52509);
      }
    }
    catch (Exception paramField)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SDK.CursorFieldHelper", paramField, "", new Object[0]);
        AppMethodBeat.o(52509);
      }
    }
  }

  public static void keep_getFloat(Field paramField, Object paramObject, ContentValues paramContentValues)
  {
    AppMethodBeat.i(52507);
    try
    {
      if (!paramField.getType().equals(Float.TYPE))
      {
        paramContentValues.put(c.b(paramField), (Float)paramField.get(paramObject));
        AppMethodBeat.o(52507);
      }
      while (true)
      {
        return;
        paramContentValues.put(c.b(paramField), Float.valueOf(paramField.getFloat(paramObject)));
        AppMethodBeat.o(52507);
      }
    }
    catch (Exception paramField)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SDK.CursorFieldHelper", paramField, "", new Object[0]);
        AppMethodBeat.o(52507);
      }
    }
  }

  public static void keep_getInt(Field paramField, Object paramObject, ContentValues paramContentValues)
  {
    AppMethodBeat.i(52505);
    try
    {
      if (!paramField.getType().equals(Integer.TYPE))
      {
        paramContentValues.put(c.b(paramField), (Integer)paramField.get(paramObject));
        AppMethodBeat.o(52505);
      }
      while (true)
      {
        return;
        paramContentValues.put(c.b(paramField), Integer.valueOf(paramField.getInt(paramObject)));
        AppMethodBeat.o(52505);
      }
    }
    catch (Exception paramField)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SDK.CursorFieldHelper", paramField, "", new Object[0]);
        AppMethodBeat.o(52505);
      }
    }
  }

  public static void keep_getLong(Field paramField, Object paramObject, ContentValues paramContentValues)
  {
    AppMethodBeat.i(52511);
    try
    {
      if (!paramField.getType().equals(Long.TYPE))
      {
        paramContentValues.put(c.b(paramField), (Long)paramField.get(paramObject));
        AppMethodBeat.o(52511);
      }
      while (true)
      {
        return;
        paramContentValues.put(c.b(paramField), Long.valueOf(paramField.getLong(paramObject)));
        AppMethodBeat.o(52511);
      }
    }
    catch (Exception paramField)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SDK.CursorFieldHelper", paramField, "", new Object[0]);
        AppMethodBeat.o(52511);
      }
    }
  }

  public static void keep_getShort(Field paramField, Object paramObject, ContentValues paramContentValues)
  {
    AppMethodBeat.i(52501);
    try
    {
      paramContentValues.put(c.b(paramField), Short.valueOf(paramField.getShort(paramObject)));
      AppMethodBeat.o(52501);
      return;
    }
    catch (Exception paramField)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SDK.CursorFieldHelper", paramField, "", new Object[0]);
        AppMethodBeat.o(52501);
      }
    }
  }

  public static void keep_getString(Field paramField, Object paramObject, ContentValues paramContentValues)
  {
    AppMethodBeat.i(52513);
    try
    {
      paramContentValues.put(c.b(paramField), (String)paramField.get(paramObject));
      AppMethodBeat.o(52513);
      return;
    }
    catch (Exception paramField)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SDK.CursorFieldHelper", paramField, "", new Object[0]);
        AppMethodBeat.o(52513);
      }
    }
  }

  public static void keep_setBlob(Field paramField, Object paramObject, Cursor paramCursor, int paramInt)
  {
    AppMethodBeat.i(52498);
    try
    {
      paramField.set(paramObject, paramCursor.getBlob(paramInt));
      AppMethodBeat.o(52498);
      return;
    }
    catch (Exception paramField)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SDK.CursorFieldHelper", paramField, "", new Object[0]);
        AppMethodBeat.o(52498);
      }
    }
  }

  public static void keep_setBoolean(Field paramField, Object paramObject, Cursor paramCursor, int paramInt)
  {
    AppMethodBeat.i(52502);
    try
    {
      boolean bool;
      if (paramField.getType().equals(Boolean.TYPE))
        if (paramCursor.getInt(paramInt) != 0)
        {
          bool = true;
          paramField.setBoolean(paramObject, bool);
          AppMethodBeat.o(52502);
        }
      while (true)
      {
        return;
        bool = false;
        break;
        paramField.set(paramObject, Integer.valueOf(paramCursor.getInt(paramInt)));
        AppMethodBeat.o(52502);
      }
    }
    catch (Exception paramField)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SDK.CursorFieldHelper", paramField, "", new Object[0]);
        AppMethodBeat.o(52502);
      }
    }
  }

  public static void keep_setDouble(Field paramField, Object paramObject, Cursor paramCursor, int paramInt)
  {
    AppMethodBeat.i(52508);
    try
    {
      if (paramField.getType().equals(Double.TYPE))
      {
        paramField.setDouble(paramObject, paramCursor.getDouble(paramInt));
        AppMethodBeat.o(52508);
      }
      while (true)
      {
        return;
        paramField.set(paramObject, Double.valueOf(paramCursor.getDouble(paramInt)));
        AppMethodBeat.o(52508);
      }
    }
    catch (Exception paramField)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SDK.CursorFieldHelper", paramField, "", new Object[0]);
        AppMethodBeat.o(52508);
      }
    }
  }

  public static void keep_setFloat(Field paramField, Object paramObject, Cursor paramCursor, int paramInt)
  {
    AppMethodBeat.i(52506);
    try
    {
      if (paramField.getType().equals(Float.TYPE))
      {
        paramField.setFloat(paramObject, paramCursor.getFloat(paramInt));
        AppMethodBeat.o(52506);
      }
      while (true)
      {
        return;
        paramField.set(paramObject, Float.valueOf(paramCursor.getFloat(paramInt)));
        AppMethodBeat.o(52506);
      }
    }
    catch (Exception paramField)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SDK.CursorFieldHelper", paramField, "", new Object[0]);
        AppMethodBeat.o(52506);
      }
    }
  }

  public static void keep_setInt(Field paramField, Object paramObject, Cursor paramCursor, int paramInt)
  {
    AppMethodBeat.i(52504);
    try
    {
      if (paramField.getType().equals(Integer.TYPE))
      {
        paramField.setInt(paramObject, paramCursor.getInt(paramInt));
        AppMethodBeat.o(52504);
      }
      while (true)
      {
        return;
        paramField.set(paramObject, Integer.valueOf(paramCursor.getInt(paramInt)));
        AppMethodBeat.o(52504);
      }
    }
    catch (Exception paramField)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SDK.CursorFieldHelper", paramField, "", new Object[0]);
        AppMethodBeat.o(52504);
      }
    }
  }

  public static void keep_setLong(Field paramField, Object paramObject, Cursor paramCursor, int paramInt)
  {
    AppMethodBeat.i(52510);
    try
    {
      if (paramField.getType().equals(Long.TYPE))
      {
        paramField.setLong(paramObject, paramCursor.getLong(paramInt));
        AppMethodBeat.o(52510);
      }
      while (true)
      {
        return;
        paramField.set(paramObject, Long.valueOf(paramCursor.getLong(paramInt)));
        AppMethodBeat.o(52510);
      }
    }
    catch (Exception paramField)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SDK.CursorFieldHelper", paramField, "", new Object[0]);
        AppMethodBeat.o(52510);
      }
    }
  }

  public static void keep_setShort(Field paramField, Object paramObject, Cursor paramCursor, int paramInt)
  {
    AppMethodBeat.i(52500);
    try
    {
      if (paramField.getType().equals(Short.TYPE))
      {
        paramField.setShort(paramObject, paramCursor.getShort(paramInt));
        AppMethodBeat.o(52500);
      }
      while (true)
      {
        return;
        paramField.set(paramObject, Short.valueOf(paramCursor.getShort(paramInt)));
        AppMethodBeat.o(52500);
      }
    }
    catch (Exception paramField)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SDK.CursorFieldHelper", paramField, "", new Object[0]);
        AppMethodBeat.o(52500);
      }
    }
  }

  public static void keep_setString(Field paramField, Object paramObject, Cursor paramCursor, int paramInt)
  {
    AppMethodBeat.i(52512);
    try
    {
      paramField.set(paramObject, paramCursor.getString(paramInt));
      AppMethodBeat.o(52512);
      return;
    }
    catch (Exception paramField)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SDK.CursorFieldHelper", paramField, "", new Object[0]);
        AppMethodBeat.o(52512);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.e.b
 * JD-Core Version:    0.6.2
 */