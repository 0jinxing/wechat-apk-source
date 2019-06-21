package com.tencent.xweb.xwalk.a;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.io.File;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkEnvironment;

public abstract class c
{
  public int ASG = -1;

  public c()
  {
    if (XWalkEnvironment.getApplicationContext() == null)
      Log.e("XWalkPlugin", "load ver of " + dVM() + " context is null");
    while (true)
    {
      return;
      SharedPreferences localSharedPreferences = XWalkEnvironment.getSharedPreferencesForPluginVersionInfo(dVM());
      if (localSharedPreferences == null)
      {
        XWalkEnvironment.addXWalkInitializeLog("XWalkPlugin", "load ver of " + dVM() + " sp is null");
      }
      else
      {
        this.ASG = localSharedPreferences.getInt("availableVersion", -1);
        XWalkEnvironment.addXWalkInitializeLog("XWalkPlugin", "load ver of " + dVM() + " ver " + this.ASG);
      }
    }
  }

  public final boolean SD(int paramInt)
  {
    boolean bool = false;
    if (XWalkEnvironment.getApplicationContext() == null)
      Log.e("XWalkPlugin", "set ver of " + dVM() + " context is null");
    while (true)
    {
      return bool;
      Object localObject = XWalkEnvironment.getSharedPreferencesForPluginVersionInfo(dVM());
      if (localObject == null)
      {
        XWalkEnvironment.addXWalkInitializeLog("XWalkPlugin", "set ver of " + dVM() + " sp is null");
      }
      else
      {
        localObject = ((SharedPreferences)localObject).edit();
        ((SharedPreferences.Editor)localObject).putInt("availableVersion", paramInt);
        bool = ((SharedPreferences.Editor)localObject).commit();
        if (bool)
          this.ASG = paramInt;
        XWalkEnvironment.addXWalkInitializeLog("XWalkPlugin", "set ver of " + dVM() + " to " + paramInt + ", isNow = true, ret = " + bool);
      }
    }
  }

  public final String SE(int paramInt)
  {
    Object localObject;
    if (XWalkEnvironment.getApplicationContext() == null)
    {
      Log.e("XWalkPlugin", "get dir of " + dVM() + " context is null");
      localObject = "";
    }
    while (true)
    {
      return localObject;
      localObject = XWalkEnvironment.getPluginBaseDir();
      if (((String)localObject).isEmpty())
      {
        Log.e("XWalkPlugin", "get dir of " + dVM() + " pluginBaseDir is null");
        localObject = "";
      }
      else
      {
        String str = (String)localObject + File.separator + dVM() + "_" + paramInt;
        File localFile = new File(str);
        localObject = str;
        if (!localFile.exists())
        {
          localFile.mkdirs();
          localObject = str;
        }
      }
    }
  }

  public abstract int a(d paramd);

  public abstract String aM(int paramInt, boolean paramBoolean);

  // ERROR //
  public final boolean b(d paramd)
  {
    // Byte code:
    //   0: new 113	java/io/File
    //   3: dup
    //   4: aload_1
    //   5: getfield 139	com/tencent/xweb/xwalk/a/d:path	Ljava/lang/String;
    //   8: invokespecial 120	java/io/File:<init>	(Ljava/lang/String;)V
    //   11: astore_2
    //   12: aload_1
    //   13: getfield 139	com/tencent/xweb/xwalk/a/d:path	Ljava/lang/String;
    //   16: aload_1
    //   17: getfield 142	com/tencent/xweb/xwalk/a/d:cvZ	Ljava/lang/String;
    //   20: invokestatic 148	com/tencent/xweb/util/d:gA	(Ljava/lang/String;Ljava/lang/String;)Z
    //   23: istore_3
    //   24: iload_3
    //   25: ifne +27 -> 52
    //   28: aconst_null
    //   29: invokestatic 154	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   32: aconst_null
    //   33: invokestatic 154	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   36: aload_2
    //   37: invokevirtual 123	java/io/File:exists	()Z
    //   40: ifeq +8 -> 48
    //   43: aload_2
    //   44: invokevirtual 157	java/io/File:delete	()Z
    //   47: pop
    //   48: iconst_0
    //   49: istore_3
    //   50: iload_3
    //   51: ireturn
    //   52: new 159	java/util/zip/ZipFile
    //   55: astore 4
    //   57: aload 4
    //   59: aload_1
    //   60: getfield 139	com/tencent/xweb/xwalk/a/d:path	Ljava/lang/String;
    //   63: invokespecial 160	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   66: aload 4
    //   68: invokevirtual 164	java/util/zip/ZipFile:entries	()Ljava/util/Enumeration;
    //   71: astore 5
    //   73: aload 5
    //   75: invokeinterface 169 1 0
    //   80: ifeq +127 -> 207
    //   83: aload 5
    //   85: invokeinterface 173 1 0
    //   90: checkcast 175	java/util/zip/ZipEntry
    //   93: astore 6
    //   95: aload 6
    //   97: invokevirtual 178	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   100: ldc 180
    //   102: invokestatic 186	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   105: astore 7
    //   107: aload 7
    //   109: ldc 188
    //   111: invokevirtual 192	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   114: ifne -41 -> 73
    //   117: aload 7
    //   119: ldc 194
    //   121: invokevirtual 192	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   124: ifne -51 -> 73
    //   127: aload 6
    //   129: invokevirtual 197	java/util/zip/ZipEntry:isDirectory	()Z
    //   132: ifne -59 -> 73
    //   135: aload 4
    //   137: aload 6
    //   139: invokevirtual 201	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   142: astore 8
    //   144: new 113	java/io/File
    //   147: astore 6
    //   149: aload 6
    //   151: aload_0
    //   152: aload_1
    //   153: getfield 204	com/tencent/xweb/xwalk/a/d:version	I
    //   156: aload 7
    //   158: invokevirtual 208	com/tencent/xweb/xwalk/a/c:bY	(ILjava/lang/String;)Ljava/lang/String;
    //   161: invokespecial 120	java/io/File:<init>	(Ljava/lang/String;)V
    //   164: aload 8
    //   166: aload 6
    //   168: invokestatic 211	com/tencent/xweb/util/b:b	(Ljava/io/InputStream;Ljava/io/File;)Z
    //   171: ifne -98 -> 73
    //   174: ldc 20
    //   176: ldc 213
    //   178: invokestatic 46	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   181: aload 4
    //   183: invokestatic 154	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   186: aconst_null
    //   187: invokestatic 154	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   190: aload_2
    //   191: invokevirtual 123	java/io/File:exists	()Z
    //   194: ifeq +8 -> 202
    //   197: aload_2
    //   198: invokevirtual 157	java/io/File:delete	()Z
    //   201: pop
    //   202: iconst_0
    //   203: istore_3
    //   204: goto -154 -> 50
    //   207: aload_0
    //   208: aload_1
    //   209: getfield 204	com/tencent/xweb/xwalk/a/d:version	I
    //   212: ldc 215
    //   214: invokevirtual 208	com/tencent/xweb/xwalk/a/c:bY	(ILjava/lang/String;)Ljava/lang/String;
    //   217: astore 5
    //   219: new 217	java/io/FileReader
    //   222: astore 7
    //   224: aload 7
    //   226: aload 5
    //   228: invokespecial 218	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   231: new 220	java/io/BufferedReader
    //   234: dup
    //   235: aload 7
    //   237: invokespecial 223	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   240: astore 7
    //   242: aload 7
    //   244: invokevirtual 226	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   247: astore 5
    //   249: aload 5
    //   251: ifnull +133 -> 384
    //   254: aload 5
    //   256: invokevirtual 108	java/lang/String:isEmpty	()Z
    //   259: ifne -17 -> 242
    //   262: aload 5
    //   264: ldc 228
    //   266: invokevirtual 232	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   269: astore 6
    //   271: aload 6
    //   273: arraylength
    //   274: iconst_2
    //   275: if_icmpne -33 -> 242
    //   278: aload 6
    //   280: iconst_0
    //   281: aaload
    //   282: ifnull -40 -> 242
    //   285: aload 6
    //   287: iconst_0
    //   288: aaload
    //   289: invokevirtual 108	java/lang/String:isEmpty	()Z
    //   292: ifne -50 -> 242
    //   295: aload 6
    //   297: iconst_1
    //   298: aaload
    //   299: ifnull -57 -> 242
    //   302: aload 6
    //   304: iconst_1
    //   305: aaload
    //   306: invokevirtual 108	java/lang/String:isEmpty	()Z
    //   309: ifne -67 -> 242
    //   312: aload 6
    //   314: iconst_0
    //   315: aaload
    //   316: astore 5
    //   318: aload 6
    //   320: iconst_1
    //   321: aaload
    //   322: astore 6
    //   324: aload_0
    //   325: aload_1
    //   326: getfield 204	com/tencent/xweb/xwalk/a/d:version	I
    //   329: aload 5
    //   331: invokevirtual 208	com/tencent/xweb/xwalk/a/c:bY	(ILjava/lang/String;)Ljava/lang/String;
    //   334: aload 6
    //   336: invokestatic 148	com/tencent/xweb/util/d:gA	(Ljava/lang/String;Ljava/lang/String;)Z
    //   339: ifne -97 -> 242
    //   342: ldc 20
    //   344: ldc 234
    //   346: aload 5
    //   348: invokestatic 238	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   351: invokevirtual 242	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   354: invokestatic 46	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   357: aload 4
    //   359: invokestatic 154	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   362: aload 7
    //   364: invokestatic 154	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   367: aload_2
    //   368: invokevirtual 123	java/io/File:exists	()Z
    //   371: ifeq +8 -> 379
    //   374: aload_2
    //   375: invokevirtual 157	java/io/File:delete	()Z
    //   378: pop
    //   379: iconst_0
    //   380: istore_3
    //   381: goto -331 -> 50
    //   384: aload 4
    //   386: invokestatic 154	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   389: aload 7
    //   391: invokestatic 154	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   394: aload_2
    //   395: invokevirtual 123	java/io/File:exists	()Z
    //   398: ifeq +8 -> 406
    //   401: aload_2
    //   402: invokevirtual 157	java/io/File:delete	()Z
    //   405: pop
    //   406: iconst_1
    //   407: istore_3
    //   408: goto -358 -> 50
    //   411: astore 7
    //   413: aconst_null
    //   414: astore_1
    //   415: aconst_null
    //   416: astore 4
    //   418: new 22	java/lang/StringBuilder
    //   421: astore 5
    //   423: aload 5
    //   425: ldc 244
    //   427: invokespecial 27	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   430: ldc 20
    //   432: aload 5
    //   434: aload 7
    //   436: invokevirtual 247	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   439: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   442: invokevirtual 40	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   445: invokestatic 46	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   448: aload 4
    //   450: invokestatic 154	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   453: aload_1
    //   454: invokestatic 154	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   457: aload_2
    //   458: invokevirtual 123	java/io/File:exists	()Z
    //   461: ifeq +8 -> 469
    //   464: aload_2
    //   465: invokevirtual 157	java/io/File:delete	()Z
    //   468: pop
    //   469: iconst_0
    //   470: istore_3
    //   471: goto -421 -> 50
    //   474: astore_1
    //   475: aconst_null
    //   476: astore 7
    //   478: aconst_null
    //   479: astore 4
    //   481: aload 4
    //   483: invokestatic 154	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   486: aload 7
    //   488: invokestatic 154	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   491: aload_2
    //   492: invokevirtual 123	java/io/File:exists	()Z
    //   495: ifeq +8 -> 503
    //   498: aload_2
    //   499: invokevirtual 157	java/io/File:delete	()Z
    //   502: pop
    //   503: aload_1
    //   504: athrow
    //   505: astore_1
    //   506: aconst_null
    //   507: astore 7
    //   509: goto -28 -> 481
    //   512: astore_1
    //   513: goto -32 -> 481
    //   516: astore 5
    //   518: aload_1
    //   519: astore 7
    //   521: aload 5
    //   523: astore_1
    //   524: goto -43 -> 481
    //   527: astore 7
    //   529: aconst_null
    //   530: astore_1
    //   531: goto -113 -> 418
    //   534: astore_1
    //   535: aload 7
    //   537: astore 5
    //   539: aload_1
    //   540: astore 7
    //   542: aload 5
    //   544: astore_1
    //   545: goto -127 -> 418
    //
    // Exception table:
    //   from	to	target	type
    //   12	24	411	java/lang/Exception
    //   52	66	411	java/lang/Exception
    //   12	24	474	finally
    //   52	66	474	finally
    //   66	73	505	finally
    //   73	181	505	finally
    //   207	242	505	finally
    //   242	249	512	finally
    //   254	278	512	finally
    //   285	295	512	finally
    //   302	312	512	finally
    //   324	357	512	finally
    //   418	448	516	finally
    //   66	73	527	java/lang/Exception
    //   73	181	527	java/lang/Exception
    //   207	242	527	java/lang/Exception
    //   242	249	534	java/lang/Exception
    //   254	278	534	java/lang/Exception
    //   285	295	534	java/lang/Exception
    //   302	312	534	java/lang/Exception
    //   324	357	534	java/lang/Exception
  }

  public final String bY(int paramInt, String paramString)
  {
    if ((paramString == null) || (paramString.isEmpty()))
    {
      Log.e("XWalkPlugin", "getExtractFile fileName is null");
      paramString = "";
    }
    while (true)
    {
      return paramString;
      Object localObject = SE(paramInt);
      if (((String)localObject).isEmpty())
      {
        Log.e("XWalkPlugin", "getExtractFile versionDir is null");
        paramString = "";
      }
      else
      {
        String str = (String)localObject + File.separator + "extracted";
        localObject = new File(str);
        if (!((File)localObject).exists())
          ((File)localObject).mkdirs();
        paramString = str + File.separator + paramString;
      }
    }
  }

  public abstract String dVM();

  public abstract boolean dVN();

  public abstract boolean dVO();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.a.c
 * JD-Core Version:    0.6.2
 */