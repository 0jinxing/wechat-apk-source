package com.tencent.mm.cd;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.l;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabaseCorruptException;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.database.SQLiteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import junit.framework.Assert;

public final class a
{
  public static final Pattern ybj;
  private String aIm = "";
  private boolean isNew = false;
  String key;
  f ybk;
  String ybl = "";
  public boolean ybm = false;
  String ybn = "";
  public boolean ybo = false;

  static
  {
    AppMethodBeat.i(59031);
    ybj = Pattern.compile("^[\\s]*CREATE[\\s]+TABLE[\\s]*", 2);
    AppMethodBeat.o(59031);
  }

  private static void a(f paramf)
  {
    AppMethodBeat.i(59027);
    if (paramf.ybt != null);
    for (paramf = paramf.ybt; ; paramf = paramf.ybu)
    {
      paramf = paramf.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT count(*) FROM sqlite_master;", null, null);
      if (paramf.moveToFirst())
        break;
      paramf = new SQLiteException("Cannot get count for sqlite_master");
      AppMethodBeat.o(59027);
      throw paramf;
    }
    paramf.close();
    AppMethodBeat.o(59027);
  }

  private boolean a(String paramString1, long paramLong, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(59029);
    if (this.ybk != null)
    {
      paramString1 = new AssertionError();
      AppMethodBeat.o(59029);
      throw paramString1;
    }
    boolean bool;
    int i;
    label56: String str;
    if (!com.tencent.mm.vfs.e.ct(paramString1))
    {
      bool = true;
      this.isNew = bool;
      i = 0;
      Iterator localIterator = dvm().iterator();
      if (!localIterator.hasNext())
        break label221;
      str = (String)localIterator.next();
      this.key = com.tencent.mm.a.g.x((str + paramLong).getBytes()).substring(0, 7);
    }
    while (true)
    {
      try
      {
        this.ybk = f.E(paramString1, this.key, paramBoolean);
        a(this.ybk);
        if (!q.LK().equals(str))
        {
          ab.i("MicroMsg.DBInit", "IMEI changed detected: ".concat(String.valueOf(str)));
          l.Lu().set(258, str);
          com.tencent.mm.plugin.report.e.pXa.a(181L, 5L, 1L, false);
        }
        paramBoolean = true;
        AppMethodBeat.o(59029);
        return paramBoolean;
        bool = false;
      }
      catch (SQLiteException localSQLiteException)
      {
        if ((localSQLiteException instanceof SQLiteDatabaseCorruptException))
        {
          i = 1;
          break label56;
        }
        i = 0;
      }
      label221: if (i != 0)
      {
        if (!paramBoolean)
        {
          i = 42;
          label235: com.tencent.mm.plugin.report.e.pXa.a(181L, i, 1L, true);
          f.aqu(paramString1);
          if (paramString1.endsWith("EnMicroMsg.db"))
            f.aqu(com.tencent.mm.kernel.g.RP().eJM + "dbback/EnMicroMsg.db");
        }
        try
        {
          paramString2 = new java/lang/StringBuilder;
          paramString2.<init>();
          this.key = com.tencent.mm.a.g.x((q.LK() + paramLong).getBytes()).substring(0, 7);
          this.ybk = f.E(paramString1, this.key, paramBoolean);
          a(this.ybk);
          this.isNew = true;
          com.tencent.mm.plugin.report.e.pXa.a(181L, 6L, 1L, false);
          paramBoolean = true;
          AppMethodBeat.o(59029);
          continue;
          if (f.dvu())
          {
            i = 43;
            break label235;
          }
          i = 41;
        }
        catch (SQLiteException paramString1)
        {
          com.tencent.mm.plugin.report.e.pXa.a(181L, 7L, 1L, false);
        }
      }
    }
    while (true)
      while (true)
      {
        if (this.ybk != null)
        {
          this.ybk.close();
          this.ybk = null;
        }
        this.key = null;
        paramBoolean = false;
        AppMethodBeat.o(59029);
        break;
        if ((paramString2 != null) && (paramString2.length() > 0))
        {
          if (!com.tencent.mm.vfs.e.ct(paramString2))
          {
            bool = true;
            this.isNew = bool;
          }
          try
          {
            this.ybk = f.E(paramString2, this.key, paramBoolean);
            a(this.ybk);
            com.tencent.mm.plugin.report.e.pXa.a(181L, 6L, 1L, false);
            paramBoolean = true;
            AppMethodBeat.o(59029);
            break;
            bool = false;
          }
          catch (SQLiteException paramString1)
          {
            com.tencent.mm.plugin.report.e.pXa.a(181L, 7L, 1L, false);
          }
        }
      }
  }

  private boolean a(HashMap<Integer, h.d> paramHashMap, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(59030);
    if (this.ybk == null)
    {
      paramBoolean1 = false;
      AppMethodBeat.o(59030);
    }
    while (true)
    {
      return paramBoolean1;
      if (paramHashMap == null);
      Object localObject3;
      int j;
      for (int i = -1; ; i = paramHashMap.size())
      {
        ab.d("MicroMsg.DBInit", "createtables checkCreateIni:%b  tables:%d", new Object[] { Boolean.valueOf(paramBoolean1), Integer.valueOf(i) });
        localObject1 = "";
        if (!paramBoolean1)
          break label347;
        this.ybl = (this.ybk.getPath() + ".ini");
        localObject2 = new StringBuilder();
        if (paramHashMap == null)
          break;
        localObject1 = paramHashMap.values().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject3 = (h.d)((Iterator)localObject1).next();
          if (((h.d)localObject3).Af() == null)
          {
            ab.e("MicroMsg.DBInit", "factory.getSQLs() is null: %s", new Object[] { localObject3.getClass().toString() });
            Assert.assertTrue("factory.getSQLs() is null:" + localObject3.getClass().toString(), false);
          }
          localObject3 = ((h.d)localObject3).Af();
          j = localObject3.length;
          for (i = 0; i < j; i++)
            ((StringBuilder)localObject2).append(localObject3[i].hashCode());
        }
      }
      Object localObject2 = com.tencent.mm.a.g.x(((StringBuilder)localObject2).toString().getBytes());
      Object localObject1 = localObject2;
      if (!paramBoolean2)
      {
        localObject3 = com.tencent.mm.sdk.e.a.getValue(this.ybl, "createmd5");
        localObject1 = localObject2;
        if (!bo.isNullOrNil((String)localObject3))
        {
          localObject1 = localObject2;
          if (((String)localObject2).equals(localObject3))
          {
            ab.i("MicroMsg.DBInit", "Create table factories not changed , no need create !  %s", new Object[] { this.ybk.getPath() });
            paramBoolean1 = true;
            AppMethodBeat.o(59030);
          }
        }
      }
      else
      {
        label347: this.ybk.execSQL("pragma auto_vacuum = 0 ");
        localObject2 = new g.a();
        this.ybk.beginTransaction();
        if (paramHashMap != null)
        {
          Iterator localIterator = paramHashMap.values().iterator();
          i = 0;
          while (true)
          {
            j = i;
            if (!localIterator.hasNext())
              break;
            String[] arrayOfString = ((h.d)localIterator.next()).Af();
            int k = arrayOfString.length;
            j = 0;
            while (true)
              if (j < k)
              {
                String str = arrayOfString[j];
                try
                {
                  this.ybk.execSQL(str);
                  i++;
                  j++;
                }
                catch (Exception paramHashMap)
                {
                  while (true)
                  {
                    localObject3 = ybj.matcher(str);
                    if ((localObject3 != null) && (((Matcher)localObject3).matches()))
                      Assert.assertTrue("CreateTable failed:[" + str + "][" + paramHashMap.getMessage() + "]", false);
                    else
                      ab.w("MicroMsg.DBInit", "CreateTable failed:[" + str + "][" + paramHashMap.getMessage() + "]");
                  }
                }
              }
          }
        }
        j = 0;
        long l = ((g.a)localObject2).Mr();
        this.ybk.endTransaction();
        ab.i("MicroMsg.DBInit", "createtables end sql:%d trans:%d sqlCount:%d", new Object[] { Long.valueOf(l), Long.valueOf(((g.a)localObject2).Mr()), Integer.valueOf(j) });
        if (paramBoolean1)
          com.tencent.mm.sdk.e.a.aB(this.ybl, "createmd5", (String)localObject1);
        paramBoolean1 = true;
        AppMethodBeat.o(59030);
      }
    }
  }

  // ERROR //
  private static Collection<String> dvm()
  {
    // Byte code:
    //   0: ldc_w 389
    //   3: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 395	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   9: astore_0
    //   10: new 397	java/util/LinkedHashSet
    //   13: dup
    //   14: invokespecial 398	java/util/LinkedHashSet:<init>	()V
    //   17: astore_1
    //   18: aload_1
    //   19: invokestatic 174	com/tencent/mm/compatible/e/q:LK	()Ljava/lang/String;
    //   22: invokevirtual 401	java/util/LinkedHashSet:add	(Ljava/lang/Object;)Z
    //   25: pop
    //   26: aload_1
    //   27: aload_0
    //   28: invokestatic 405	com/tencent/mm/compatible/e/q:getDeviceID	(Landroid/content/Context;)Ljava/lang/String;
    //   31: invokevirtual 401	java/util/LinkedHashSet:add	(Ljava/lang/Object;)Z
    //   34: pop
    //   35: aconst_null
    //   36: astore_2
    //   37: new 407	javax/crypto/spec/SecretKeySpec
    //   40: astore_3
    //   41: aload_3
    //   42: ldc_w 409
    //   45: invokevirtual 151	java/lang/String:getBytes	()[B
    //   48: ldc_w 411
    //   51: invokespecial 414	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   54: ldc_w 411
    //   57: invokestatic 420	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   60: astore 4
    //   62: aload 4
    //   64: iconst_2
    //   65: aload_3
    //   66: invokevirtual 424	javax/crypto/Cipher:init	(ILjava/security/Key;)V
    //   69: new 426	java/io/BufferedReader
    //   72: astore_3
    //   73: new 428	java/io/InputStreamReader
    //   76: astore 5
    //   78: new 430	javax/crypto/CipherInputStream
    //   81: astore 6
    //   83: aload 6
    //   85: aload_0
    //   86: ldc_w 432
    //   89: invokevirtual 438	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   92: aload 4
    //   94: invokespecial 441	javax/crypto/CipherInputStream:<init>	(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    //   97: aload 5
    //   99: aload 6
    //   101: invokespecial 444	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   104: aload_3
    //   105: aload 5
    //   107: invokespecial 447	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   110: aload_3
    //   111: astore 4
    //   113: aload_3
    //   114: invokevirtual 450	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   117: astore_2
    //   118: aload_2
    //   119: ifnull +52 -> 171
    //   122: aload_3
    //   123: astore 4
    //   125: aload_1
    //   126: aload_2
    //   127: invokevirtual 401	java/util/LinkedHashSet:add	(Ljava/lang/Object;)Z
    //   130: pop
    //   131: goto -21 -> 110
    //   134: astore_2
    //   135: aload_3
    //   136: astore 4
    //   138: ldc 180
    //   140: aload_2
    //   141: ldc_w 452
    //   144: iconst_0
    //   145: anewarray 4	java/lang/Object
    //   148: invokestatic 456	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   151: aload_3
    //   152: invokestatic 460	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   155: aload_1
    //   156: ldc_w 462
    //   159: invokevirtual 401	java/util/LinkedHashSet:add	(Ljava/lang/Object;)Z
    //   162: pop
    //   163: ldc_w 389
    //   166: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   169: aload_1
    //   170: areturn
    //   171: aload_3
    //   172: invokestatic 460	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   175: goto -20 -> 155
    //   178: astore 4
    //   180: aload 4
    //   182: astore_3
    //   183: aload_2
    //   184: invokestatic 460	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   187: ldc_w 389
    //   190: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   193: aload_3
    //   194: athrow
    //   195: astore_3
    //   196: aload 4
    //   198: astore_2
    //   199: goto -16 -> 183
    //   202: astore_2
    //   203: aconst_null
    //   204: astore_3
    //   205: goto -70 -> 135
    //
    // Exception table:
    //   from	to	target	type
    //   113	118	134	java/lang/Exception
    //   125	131	134	java/lang/Exception
    //   37	110	178	finally
    //   113	118	195	finally
    //   125	131	195	finally
    //   138	151	195	finally
    //   37	110	202	java/lang/Exception
  }

  private void jdMethod_if(String paramString1, String paramString2)
  {
    AppMethodBeat.i(59020);
    HashSet localHashSet = new HashSet();
    Object localObject = this.ybk.a("select * from " + paramString1 + " limit 1 ", null, 0);
    if (((Cursor)localObject).getCount() == 0)
    {
      ((Cursor)localObject).close();
      AppMethodBeat.o(59020);
    }
    while (true)
    {
      return;
      ((Cursor)localObject).moveToFirst();
      for (int i = 0; i < ((Cursor)localObject).getColumnCount(); i++)
        localHashSet.add(((Cursor)localObject).getColumnName(i));
      ((Cursor)localObject).close();
      Cursor localCursor = this.ybk.a("PRAGMA table_info( " + paramString2 + " )", null, 0);
      localObject = "";
      while (localCursor.moveToNext())
      {
        String str = localCursor.getString(localCursor.getColumnIndex("name"));
        if (localHashSet.contains(str))
        {
          localObject = (String)localObject + str;
          localObject = (String)localObject + ",";
        }
      }
      localCursor.close();
      localObject = ((String)localObject).substring(0, ((String)localObject).length() - 1);
      paramString1 = "insert into " + paramString2 + "(" + (String)localObject + ") select " + (String)localObject + " from " + paramString1 + ";";
      this.ybk.execSQL(paramString1);
      AppMethodBeat.o(59020);
    }
  }

  private List<String> ig(String paramString1, String paramString2)
  {
    AppMethodBeat.i(59022);
    ArrayList localArrayList = new ArrayList();
    if (this.ybk == null)
      AppMethodBeat.o(59022);
    while (true)
    {
      return localArrayList;
      Object localObject1 = this.ybk.a("PRAGMA table_info( " + paramString1 + " )", null, 0);
      if (localObject1 == null)
      {
        AppMethodBeat.o(59022);
      }
      else
      {
        paramString1 = new HashMap();
        int i = ((Cursor)localObject1).getColumnIndex("name");
        int j = ((Cursor)localObject1).getColumnIndex("type");
        while (((Cursor)localObject1).moveToNext())
          paramString1.put(((Cursor)localObject1).getString(i), ((Cursor)localObject1).getString(j));
        ((Cursor)localObject1).close();
        Object localObject2 = this.ybk.a("PRAGMA table_info( " + paramString2 + " )", null, 0);
        if (localObject2 == null)
        {
          AppMethodBeat.o(59022);
        }
        else
        {
          localObject1 = new HashMap();
          i = ((Cursor)localObject2).getColumnIndex("name");
          j = ((Cursor)localObject2).getColumnIndex("type");
          while (((Cursor)localObject2).moveToNext())
            paramString1.put(((Cursor)localObject2).getString(i), ((Cursor)localObject2).getString(j));
          ((Cursor)localObject2).close();
          localObject2 = new HashSet(paramString1.entrySet()).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            Object localObject3 = (Map.Entry)((Iterator)localObject2).next();
            String str1 = (String)((Map.Entry)localObject3).getKey();
            String str2 = (String)((Map.Entry)localObject3).getValue();
            if ((str2 != null) && (str2.length() > 0))
            {
              localObject3 = (String)((Map)localObject1).get(str1);
              if (localObject3 == null)
              {
                localArrayList.add("ALTER TABLE " + paramString2 + " ADD COLUMN " + str1 + " " + str2 + ";");
                paramString1.remove(str1);
              }
              else if (!str2.toLowerCase().startsWith(((String)localObject3).toLowerCase()))
              {
                ab.e("MicroMsg.DBInit", "conflicting alter table on column: " + str1 + ", " + (String)localObject3 + "<o-n>" + str2);
                paramString1.remove(str1);
              }
            }
          }
          AppMethodBeat.o(59022);
        }
      }
    }
  }

  private boolean ih(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(59023);
    Cursor localCursor = this.ybk.a("select DISTINCT  tbl_name from sqlite_master;", null, 0);
    if (localCursor == null)
      AppMethodBeat.o(59023);
    while (true)
    {
      return bool;
      try
      {
        Object localObject;
        if (bo.isNullOrNil(paramString2))
        {
          localObject = this.ybk;
          paramString2 = new java/lang/StringBuilder;
          paramString2.<init>("ATTACH DATABASE '");
          ((f)localObject).execSQL(paramString1 + "' AS old KEY ''");
        }
        while (true)
        {
          if (r(localCursor))
            break label177;
          AppMethodBeat.o(59023);
          break;
          f localf = this.ybk;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("ATTACH DATABASE '");
          localf.execSQL(paramString1 + "' AS old KEY '" + paramString2 + "'");
        }
      }
      catch (SQLiteDatabaseCorruptException paramString2)
      {
        ab.e("MicroMsg.DBInit", "Attached database is corrupted: ".concat(String.valueOf(paramString1)));
        com.tencent.mm.vfs.e.deleteFile(paramString1);
        AppMethodBeat.o(59023);
        throw paramString2;
      }
    }
    label177: this.ybk.beginTransaction();
    int i = 0;
    int j;
    if (i < localCursor.getCount())
    {
      localCursor.moveToPosition(i);
      paramString1 = this.ybk.a("select * from old.sqlite_master where tbl_name = '" + localCursor.getString(0) + "'", null, 0);
      if (paramString1 == null)
        break label490;
      j = paramString1.getCount();
      paramString1.close();
    }
    while (true)
    {
      if (j == 0)
        ab.w("MicroMsg.DBInit", "In old db not found :" + localCursor.getString(0));
      while (true)
      {
        i++;
        break;
        try
        {
          paramString1 = new java/lang/StringBuilder;
          paramString1.<init>("old.");
          paramString1 = ig(localCursor.getString(0), localCursor.getString(0)).iterator();
          while (paramString1.hasNext())
          {
            paramString2 = (String)paramString1.next();
            this.ybk.execSQL(paramString2);
          }
        }
        catch (Exception paramString1)
        {
          ab.w("MicroMsg.DBInit", "Insertselect FAILED :" + localCursor.getString(0));
        }
        continue;
        paramString1 = new java/lang/StringBuilder;
        paramString1.<init>("old.");
        jdMethod_if(localCursor.getString(0), localCursor.getString(0));
      }
      this.ybk.endTransaction();
      localCursor.close();
      this.ybk.execSQL("DETACH DATABASE old;");
      bool = true;
      AppMethodBeat.o(59023);
      break;
      label490: j = 0;
    }
  }

  private boolean ii(String paramString1, String paramString2)
  {
    boolean bool = true;
    AppMethodBeat.i(59026);
    if (ih(paramString1, paramString2))
    {
      ab.i("MicroMsg.DBInit", "system transfer success ,delete it path %s", new Object[] { paramString1 });
      ab.i("MicroMsg.DBInit", "delete result :%b", new Object[] { Boolean.valueOf(com.tencent.mm.vfs.e.deleteFile(paramString1)) });
      AppMethodBeat.o(59026);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.DBInit", "system transfer fail path %s", new Object[] { paramString1 });
      AppMethodBeat.o(59026);
      bool = false;
    }
  }

  private boolean r(Cursor paramCursor)
  {
    boolean bool = false;
    AppMethodBeat.i(59021);
    HashSet localHashSet = new HashSet();
    Object localObject = new HashSet();
    for (int i = 0; i < paramCursor.getCount(); i++)
    {
      paramCursor.moveToPosition(i);
      localHashSet.add(paramCursor.getString(0));
    }
    paramCursor = this.ybk.a("select DISTINCT tbl_name from old.sqlite_master;", null, 0);
    if (paramCursor == null)
      AppMethodBeat.o(59021);
    while (true)
    {
      return bool;
      for (i = 0; i < paramCursor.getCount(); i++)
      {
        paramCursor.moveToPosition(i);
        ((HashSet)localObject).add(paramCursor.getString(0));
      }
      paramCursor.close();
      this.ybk.beginTransaction();
      paramCursor = ((HashSet)localObject).iterator();
      while (paramCursor.hasNext())
      {
        localObject = (String)paramCursor.next();
        if (!localHashSet.contains(localObject))
        {
          Cursor localCursor = this.ybk.a("SELECT sql FROM old.sqlite_master WHERE type='table' AND tbl_name='" + (String)localObject + "'", null, 0);
          if (localCursor != null)
          {
            localObject = localCursor.getString(0);
            this.ybk.execSQL((String)localObject);
            localCursor.close();
          }
        }
      }
      this.ybk.endTransaction();
      bool = true;
      AppMethodBeat.o(59021);
    }
  }

  public final boolean a(String paramString1, String paramString2, String paramString3, long paramLong, HashMap<Integer, h.d> paramHashMap, boolean paramBoolean)
  {
    AppMethodBeat.i(59025);
    boolean bool1;
    boolean bool3;
    boolean bool4;
    int i;
    label98: int j;
    if (!bo.isNullOrNil(paramString2))
    {
      bool1 = true;
      Assert.assertTrue("create SqliteDB enDbCachePath == null ", bool1);
      this.ybn = (paramString2 + ".errreport");
      if (this.ybk != null)
      {
        this.ybk.close();
        this.ybk = null;
      }
      boolean bool2 = com.tencent.mm.vfs.e.ct(paramString2);
      bool3 = com.tencent.mm.vfs.e.ct(paramString1);
      bool4 = com.tencent.mm.vfs.e.ct(paramString3);
      if ((bool2) || (!bool3))
        break label268;
      i = 1;
      this.ybm = a(paramString2, paramLong, f.dvt(), paramString3);
      Boolean localBoolean = Boolean.TRUE;
      boolean bool5 = this.ybm;
      if (this.ybk == null)
        break label274;
      bool1 = true;
      label134: ab.i("MicroMsg.DBInit", "initDb(en) path:%s enExist:%b oldExist:%b copyold:%b dbopenSUCC:%b db:%b thr:%s", new Object[] { paramString2, Boolean.valueOf(bool2), Boolean.valueOf(bool3), localBoolean, Boolean.valueOf(bool5), Boolean.valueOf(bool1), Thread.currentThread().getName() });
      if ((this.ybk == null) || (this.ybk.getPath().equals(paramString3)) || (!bool4))
        break label437;
      j = 1;
      ab.i("MicroMsg.DBInit", "backup db exsits, copy data to en db");
    }
    while (true)
    {
      if (!a(paramHashMap, paramBoolean, this.isNew))
      {
        paramBoolean = false;
        AppMethodBeat.o(59025);
      }
      while (true)
      {
        return paramBoolean;
        bool1 = false;
        break;
        label268: i = 0;
        break label98;
        label274: bool1 = false;
        break label134;
        if ((!bool3) && (!bool4))
        {
          paramBoolean = true;
          AppMethodBeat.o(59025);
        }
        else
        {
          if ((j != 0) || (i != 0))
            this.ybo = true;
          if (j != 0)
          {
            this.key = com.tencent.mm.a.g.x((q.LK() + paramLong).getBytes()).substring(0, 7);
            ii(paramString3, this.key);
            com.tencent.mm.blink.a.r(201L, 1L);
          }
          if (i != 0)
          {
            paramBoolean = ii(paramString1, "");
            com.tencent.mm.blink.a.r(200L, 1L);
            AppMethodBeat.o(59025);
          }
          else if (this.ybk != null)
          {
            paramBoolean = true;
            AppMethodBeat.o(59025);
          }
          else
          {
            paramBoolean = false;
            AppMethodBeat.o(59025);
          }
        }
      }
      label437: j = 0;
    }
  }

  public final boolean a(String paramString, HashMap<Integer, h.d> paramHashMap, boolean paramBoolean)
  {
    boolean bool1 = false;
    AppMethodBeat.i(59024);
    if (this.ybk != null)
    {
      this.ybk.close();
      this.ybk = null;
    }
    boolean bool2 = com.tencent.mm.vfs.e.ct(paramString);
    try
    {
      ab.i("MicroMsg.DBInit", "initSysDB checkini:%b exist:%b db:%s ", new Object[] { Boolean.TRUE, Boolean.valueOf(bool2), paramString });
      this.ybk = f.ca(paramString, paramBoolean);
      if (!bool2)
      {
        paramBoolean = true;
        if (a(paramHashMap, true, paramBoolean))
          break label138;
        if (this.ybk != null)
        {
          this.ybk.close();
          this.ybk = null;
        }
        AppMethodBeat.o(59024);
        paramBoolean = bool1;
        return paramBoolean;
      }
    }
    catch (SQLiteException paramString)
    {
      while (true)
      {
        AppMethodBeat.o(59024);
        paramBoolean = bool1;
        continue;
        paramBoolean = false;
        continue;
        label138: AppMethodBeat.o(59024);
        paramBoolean = true;
      }
    }
  }

  public final String getError()
  {
    AppMethodBeat.i(59019);
    String str;
    if ((bo.isNullOrNil(this.aIm)) || (bo.isNullOrNil(this.ybn)))
    {
      str = "";
      AppMethodBeat.o(59019);
    }
    while (true)
    {
      return str;
      if (!bo.isNullOrNil(com.tencent.mm.sdk.e.a.getValue(this.ybn, "Reported")))
      {
        str = "";
        AppMethodBeat.o(59019);
      }
      else
      {
        com.tencent.mm.sdk.e.a.aB(this.ybn, "Reported", "true");
        str = this.aIm;
        AppMethodBeat.o(59019);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cd.a
 * JD-Core Version:    0.6.2
 */