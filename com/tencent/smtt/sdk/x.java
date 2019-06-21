package com.tencent.smtt.sdk;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.k;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class x
{
  public static final String a = CookieManager.LOGTAG;
  static File b;

  public static File a(Context paramContext)
  {
    AppMethodBeat.i(64142);
    if ((b == null) && (paramContext != null))
      b = new File(paramContext.getDir("webview", 0), "Cookies");
    if (b == null)
      b = new File("/data/data/" + paramContext.getPackageName() + File.separator + "app_webview" + File.separator + "Cookies");
    paramContext = b;
    AppMethodBeat.o(64142);
    return paramContext;
  }

  private static String a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    AppMethodBeat.i(64146);
    paramSQLiteDatabase = paramSQLiteDatabase.rawQuery("select * from ".concat(String.valueOf(paramString)), null);
    int i = paramSQLiteDatabase.getCount();
    int j = paramSQLiteDatabase.getColumnCount();
    paramString = new StringBuilder();
    paramString.append("raws:" + i + ",columns:" + j + "\n");
    if ((i > 0) && (paramSQLiteDatabase.moveToFirst()));
    while (true)
    {
      paramString.append("\n");
      i = 0;
      label99: if (i < j);
      try
      {
        String str = paramSQLiteDatabase.getString(i);
        paramString.append(str).append(",");
        label125: i++;
        break label99;
        paramString.append("\n");
        if (paramSQLiteDatabase.moveToNext())
          continue;
        paramSQLiteDatabase = paramString.toString();
        AppMethodBeat.o(64146);
        return paramSQLiteDatabase;
      }
      catch (Exception localException)
      {
        break label125;
      }
    }
  }

  public static ArrayList<String> a(SQLiteDatabase paramSQLiteDatabase)
  {
    Object localObject1 = null;
    Object localObject3 = null;
    Cursor localCursor = null;
    AppMethodBeat.i(64145);
    if (paramSQLiteDatabase == null)
    {
      AppMethodBeat.o(64145);
      paramSQLiteDatabase = localCursor;
    }
    while (true)
    {
      return paramSQLiteDatabase;
      ArrayList localArrayList = new ArrayList();
      try
      {
        localCursor = paramSQLiteDatabase.rawQuery("select * from sqlite_master where type='table'", null);
        localObject1 = localCursor;
        localObject3 = localCursor;
        if (localCursor.moveToFirst())
        {
          boolean bool;
          do
          {
            localObject1 = localCursor;
            localObject3 = localCursor;
            String str = localCursor.getString(1);
            localObject1 = localCursor;
            localObject3 = localCursor;
            localCursor.getString(4);
            localObject1 = localCursor;
            localObject3 = localCursor;
            localArrayList.add(str);
            localObject1 = localCursor;
            localObject3 = localCursor;
            a(paramSQLiteDatabase, str);
            localObject1 = localCursor;
            localObject3 = localCursor;
            bool = localCursor.moveToNext();
          }
          while (bool);
        }
        if (localCursor != null)
          localCursor.close();
        if ((paramSQLiteDatabase != null) && (paramSQLiteDatabase.isOpen()))
          paramSQLiteDatabase.close();
        AppMethodBeat.o(64145);
        paramSQLiteDatabase = localArrayList;
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          if (localObject1 != null)
            localObject1.close();
          if ((paramSQLiteDatabase != null) && (paramSQLiteDatabase.isOpen()))
            paramSQLiteDatabase.close();
        }
      }
      finally
      {
        if (localThrowable != null)
          localThrowable.close();
        if ((paramSQLiteDatabase != null) && (paramSQLiteDatabase.isOpen()))
          paramSQLiteDatabase.close();
        AppMethodBeat.o(64145);
      }
    }
  }

  public static void a(Context paramContext, CookieManager.a parama, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(64148);
    if (paramContext == null)
      AppMethodBeat.o(64148);
    String[] arrayOfString;
    SQLiteDatabase localSQLiteDatabase;
    while (true)
    {
      return;
      if ((parama == CookieManager.a.b) && (TextUtils.isEmpty(paramString)))
      {
        AppMethodBeat.o(64148);
      }
      else
      {
        arrayOfString = paramString.split(",");
        if ((arrayOfString == null) || (arrayOfString.length <= 0))
        {
          AppMethodBeat.o(64148);
        }
        else
        {
          localSQLiteDatabase = c(paramContext);
          if (localSQLiteDatabase != null)
            break;
          AppMethodBeat.o(64148);
        }
      }
    }
    HashMap localHashMap = new HashMap();
    paramString = (String)localObject2;
    while (true)
    {
      try
      {
        localObject2 = localSQLiteDatabase.rawQuery("select * from cookies", null);
        paramString = (String)localObject2;
        localObject1 = localObject2;
        if (((Cursor)localObject2).getCount() > 0)
        {
          paramString = (String)localObject2;
          localObject1 = localObject2;
          if (((Cursor)localObject2).moveToFirst())
          {
            paramString = (String)localObject2;
            localObject1 = localObject2;
            String str = ((Cursor)localObject2).getString(((Cursor)localObject2).getColumnIndex("host_key"));
            paramString = (String)localObject2;
            localObject1 = localObject2;
            if (parama == CookieManager.a.b)
            {
              paramString = (String)localObject2;
              localObject1 = localObject2;
              int i = arrayOfString.length;
              j = 0;
              if (j >= i)
                break label720;
              paramString = (String)localObject2;
              localObject1 = localObject2;
              if (!str.equals(arrayOfString[j]))
                continue;
              j = 1;
              if (j == 0);
            }
            else
            {
              paramString = (String)localObject2;
              localObject1 = localObject2;
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              paramString = (String)localObject2;
              localObject1 = localObject2;
              localStringBuilder.<init>();
              paramString = (String)localObject2;
              localObject1 = localObject2;
              localStringBuilder.append(((Cursor)localObject2).getString(((Cursor)localObject2).getColumnIndex("value")));
              paramString = (String)localObject2;
              localObject1 = localObject2;
              localStringBuilder.append(";").append(((Cursor)localObject2).getString(((Cursor)localObject2).getColumnIndex("name")));
              paramString = (String)localObject2;
              localObject1 = localObject2;
              localStringBuilder.append(";").append(((Cursor)localObject2).getInt(((Cursor)localObject2).getColumnIndex("expires_utc")));
              paramString = (String)localObject2;
              localObject1 = localObject2;
              localStringBuilder.append(";").append(((Cursor)localObject2).getInt(((Cursor)localObject2).getColumnIndex("priority")));
              paramString = (String)localObject2;
              localObject1 = localObject2;
              localHashMap.put(str, localStringBuilder.toString());
            }
            paramString = (String)localObject2;
            localObject1 = localObject2;
            paramBoolean2 = ((Cursor)localObject2).moveToNext();
            if (paramBoolean2)
              continue;
          }
        }
        if (localObject2 != null)
          ((Cursor)localObject2).close();
        if ((localSQLiteDatabase != null) && (localSQLiteDatabase.isOpen()))
          localSQLiteDatabase.close();
        if (localHashMap.isEmpty())
        {
          AppMethodBeat.o(64148);
          break;
          j++;
          continue;
        }
      }
      catch (Throwable parama)
      {
        localObject1 = paramString;
        localObject2 = new java/lang/StringBuilder;
        localObject1 = paramString;
        ((StringBuilder)localObject2).<init>("getCookieDBVersion exception:");
        localObject1 = paramString;
        ((StringBuilder)localObject2).append(parama.toString());
        if (paramString != null)
          paramString.close();
        if ((localSQLiteDatabase == null) || (!localSQLiteDatabase.isOpen()))
          continue;
        localSQLiteDatabase.close();
        continue;
      }
      finally
      {
        if (localObject1 != null)
          ((Cursor)localObject1).close();
        if ((localSQLiteDatabase != null) && (localSQLiteDatabase.isOpen()))
          localSQLiteDatabase.close();
        AppMethodBeat.o(64148);
      }
      b(paramContext);
      parama = localHashMap.entrySet().iterator();
      while (parama.hasNext())
      {
        localObject1 = (Map.Entry)parama.next();
        paramString = (String)((Map.Entry)localObject1).getKey();
        localObject1 = (String)((Map.Entry)localObject1).getValue();
        CookieManager.getInstance().setCookie(paramString, (String)localObject1, true);
      }
      if (Build.VERSION.SDK_INT >= 21)
        CookieManager.getInstance().flush();
      while (true)
      {
        if (paramBoolean1)
        {
          a(c(paramContext));
          j = d(paramContext);
          if (j != -1)
          {
            CookieManager.getInstance();
            CookieManager.setROMCookieDBVersion(paramContext, j);
          }
        }
        AppMethodBeat.o(64148);
        break;
        CookieSyncManager.getInstance().sync();
      }
      label720: int j = 0;
    }
  }

  public static boolean b(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(64143);
    if (paramContext == null)
      AppMethodBeat.o(64143);
    while (true)
    {
      return bool;
      k.a(a(paramContext), false);
      bool = true;
      AppMethodBeat.o(64143);
    }
  }

  public static SQLiteDatabase c(Context paramContext)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(64144);
    if (paramContext == null)
    {
      AppMethodBeat.o(64144);
      paramContext = localObject2;
    }
    while (true)
    {
      return paramContext;
      paramContext = a(paramContext);
      if (paramContext == null)
      {
        AppMethodBeat.o(64144);
        paramContext = localObject2;
        continue;
      }
      try
      {
        paramContext = SQLiteDatabase.openDatabase(paramContext.getAbsolutePath(), null, 0);
        if (paramContext == null)
          TbsLog.i(a, "dbPath is not exist!");
        AppMethodBeat.o(64144);
      }
      catch (Exception paramContext)
      {
        while (true)
          paramContext = localObject1;
      }
    }
  }

  // ERROR //
  public static int d(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: ldc_w 297
    //   7: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: invokestatic 303	java/lang/System:currentTimeMillis	()J
    //   13: pop2
    //   14: aload_0
    //   15: invokestatic 171	com/tencent/smtt/sdk/x:c	(Landroid/content/Context;)Landroid/database/sqlite/SQLiteDatabase;
    //   18: astore_0
    //   19: aload_0
    //   20: ifnonnull +28 -> 48
    //   23: aload_0
    //   24: ifnull +14 -> 38
    //   27: aload_0
    //   28: invokevirtual 147	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   31: ifeq +7 -> 38
    //   34: aload_0
    //   35: invokevirtual 148	android/database/sqlite/SQLiteDatabase:close	()V
    //   38: iconst_m1
    //   39: istore_2
    //   40: ldc_w 297
    //   43: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   46: iload_2
    //   47: ireturn
    //   48: aload_0
    //   49: ldc_w 305
    //   52: aconst_null
    //   53: invokevirtual 93	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   56: astore_3
    //   57: aload_3
    //   58: invokeinterface 99 1 0
    //   63: istore 4
    //   65: aload_3
    //   66: invokeinterface 102 1 0
    //   71: pop
    //   72: iload_2
    //   73: istore 5
    //   75: iload 4
    //   77: ifle +43 -> 120
    //   80: iload_2
    //   81: istore 5
    //   83: aload_3
    //   84: invokeinterface 117 1 0
    //   89: ifeq +31 -> 120
    //   92: aload_3
    //   93: iconst_0
    //   94: invokeinterface 121 2 0
    //   99: ldc_w 307
    //   102: invokevirtual 185	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   105: ifeq +58 -> 163
    //   108: aload_3
    //   109: iconst_1
    //   110: invokeinterface 121 2 0
    //   115: invokestatic 312	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   118: istore 5
    //   120: aload_3
    //   121: ifnull +9 -> 130
    //   124: aload_3
    //   125: invokeinterface 144 1 0
    //   130: iload 5
    //   132: istore_2
    //   133: aload_0
    //   134: ifnull +20 -> 154
    //   137: iload 5
    //   139: istore_2
    //   140: aload_0
    //   141: invokevirtual 147	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   144: ifeq +10 -> 154
    //   147: aload_0
    //   148: invokevirtual 148	android/database/sqlite/SQLiteDatabase:close	()V
    //   151: iload 5
    //   153: istore_2
    //   154: ldc_w 297
    //   157: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   160: goto -114 -> 46
    //   163: aload_3
    //   164: invokeinterface 126 1 0
    //   169: istore 6
    //   171: iload 6
    //   173: ifne -81 -> 92
    //   176: iload_2
    //   177: istore 5
    //   179: goto -59 -> 120
    //   182: astore_0
    //   183: aconst_null
    //   184: astore_3
    //   185: aconst_null
    //   186: astore_0
    //   187: aload_3
    //   188: ifnull +9 -> 197
    //   191: aload_3
    //   192: invokeinterface 144 1 0
    //   197: iload_1
    //   198: istore_2
    //   199: aload_0
    //   200: ifnull -46 -> 154
    //   203: iload_1
    //   204: istore_2
    //   205: aload_0
    //   206: invokevirtual 147	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   209: ifeq -55 -> 154
    //   212: aload_0
    //   213: invokevirtual 148	android/database/sqlite/SQLiteDatabase:close	()V
    //   216: iload_1
    //   217: istore_2
    //   218: goto -64 -> 154
    //   221: astore 7
    //   223: aconst_null
    //   224: astore_3
    //   225: aconst_null
    //   226: astore_0
    //   227: aload_3
    //   228: ifnull +9 -> 237
    //   231: aload_3
    //   232: invokeinterface 144 1 0
    //   237: aload_0
    //   238: ifnull +14 -> 252
    //   241: aload_0
    //   242: invokevirtual 147	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   245: ifeq +7 -> 252
    //   248: aload_0
    //   249: invokevirtual 148	android/database/sqlite/SQLiteDatabase:close	()V
    //   252: ldc_w 297
    //   255: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   258: aload 7
    //   260: athrow
    //   261: astore 7
    //   263: aconst_null
    //   264: astore_3
    //   265: goto -38 -> 227
    //   268: astore 7
    //   270: goto -43 -> 227
    //   273: astore 7
    //   275: aconst_null
    //   276: astore_3
    //   277: goto -90 -> 187
    //   280: astore 7
    //   282: goto -95 -> 187
    //
    // Exception table:
    //   from	to	target	type
    //   14	19	182	java/lang/Throwable
    //   14	19	221	finally
    //   48	57	261	finally
    //   57	72	268	finally
    //   83	92	268	finally
    //   92	120	268	finally
    //   163	171	268	finally
    //   48	57	273	java/lang/Throwable
    //   57	72	280	java/lang/Throwable
    //   83	92	280	java/lang/Throwable
    //   92	120	280	java/lang/Throwable
    //   163	171	280	java/lang/Throwable
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.x
 * JD-Core Version:    0.6.2
 */