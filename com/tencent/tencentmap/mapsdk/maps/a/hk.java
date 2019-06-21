package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.tencent.map.lib.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class hk
{
  private static boolean b;

  static
  {
    AppMethodBeat.i(99550);
    if (!hk.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      a = bool;
      b = false;
      AppMethodBeat.o(99550);
      return;
    }
  }

  public static File a(Context paramContext)
  {
    AppMethodBeat.i(99545);
    paramContext = new File(paramContext.getApplicationInfo().nativeLibraryDir);
    AppMethodBeat.o(99545);
    return paramContext;
  }

  private static ZipEntry a(ZipFile paramZipFile, String paramString)
  {
    AppMethodBeat.i(99548);
    ZipEntry localZipEntry = paramZipFile.getEntry("lib/" + Build.CPU_ABI + "/" + System.mapLibraryName(paramString));
    if (localZipEntry != null)
    {
      AppMethodBeat.o(99548);
      paramZipFile = localZipEntry;
    }
    while (true)
    {
      return paramZipFile;
      paramZipFile = paramZipFile.getEntry("lib/" + Build.CPU_ABI2 + "/" + System.mapLibraryName(paramString));
      AppMethodBeat.o(99548);
    }
  }

  private static void a(File paramFile)
  {
    AppMethodBeat.i(99549);
    try
    {
      File[] arrayOfFile = paramFile.listFiles();
      Object localObject;
      if (arrayOfFile != null)
      {
        int i = arrayOfFile.length;
        for (int j = 0; j < i; j++)
        {
          localObject = arrayOfFile[j];
          ((File)localObject).getName();
          if (!((File)localObject).delete())
          {
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("Failed to remove ");
            d.b(((File)localObject).getAbsolutePath());
          }
        }
      }
      if (!paramFile.delete())
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("Failed to remove ");
        d.b(paramFile.getAbsolutePath());
      }
      AppMethodBeat.o(99549);
      return;
    }
    catch (Exception paramFile)
    {
      while (true)
      {
        d.a("Failed to remove old libs, ", paramFile);
        AppMethodBeat.o(99549);
      }
    }
  }

  static boolean a(Context paramContext, String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(99544);
    if ((!a) && (paramContext == null))
    {
      paramContext = new AssertionError();
      AppMethodBeat.o(99544);
      throw paramContext;
    }
    paramString = b(paramContext, paramString);
    boolean bool2 = paramString.exists();
    d.a("libary:" + paramString.getAbsolutePath() + " is exist:" + bool2);
    if ((!bool2) && (!b(paramContext)))
      AppMethodBeat.o(99544);
    while (true)
    {
      return bool1;
      try
      {
        System.load(paramString.getAbsolutePath());
        bool1 = true;
        AppMethodBeat.o(99544);
      }
      catch (UnsatisfiedLinkError paramContext)
      {
        AppMethodBeat.o(99544);
      }
    }
  }

  private static File b(Context paramContext, String paramString)
  {
    AppMethodBeat.i(99546);
    paramString = System.mapLibraryName(paramString);
    paramContext = new File(a(paramContext), paramString);
    AppMethodBeat.o(99546);
    return paramContext;
  }

  // ERROR //
  private static boolean b(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc 154
    //   4: invokestatic 16	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: getstatic 26	com/tencent/tencentmap/mapsdk/maps/a/hk:b	Z
    //   10: ifeq +10 -> 20
    //   13: ldc 154
    //   15: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   18: iload_1
    //   19: ireturn
    //   20: iconst_1
    //   21: putstatic 26	com/tencent/tencentmap/mapsdk/maps/a/hk:b	Z
    //   24: aload_0
    //   25: invokestatic 148	com/tencent/tencentmap/mapsdk/maps/a/hk:a	(Landroid/content/Context;)Ljava/io/File;
    //   28: astore_2
    //   29: aload_2
    //   30: invokestatic 156	com/tencent/tencentmap/mapsdk/maps/a/hk:a	(Ljava/io/File;)V
    //   33: aload_0
    //   34: invokevirtual 43	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   37: astore_3
    //   38: new 82	java/util/zip/ZipFile
    //   41: astore 4
    //   43: new 37	java/io/File
    //   46: astore 5
    //   48: aload 5
    //   50: aload_3
    //   51: getfield 159	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   54: invokespecial 52	java/io/File:<init>	(Ljava/lang/String;)V
    //   57: aload 4
    //   59: aload 5
    //   61: iconst_1
    //   62: invokespecial 162	java/util/zip/ZipFile:<init>	(Ljava/io/File;I)V
    //   65: getstatic 167	com/tencent/tencentmap/mapsdk/maps/a/hj:a	[Ljava/lang/String;
    //   68: astore 5
    //   70: aload 5
    //   72: arraylength
    //   73: istore 6
    //   75: iconst_0
    //   76: istore 7
    //   78: iload 7
    //   80: iload 6
    //   82: if_icmpge +365 -> 447
    //   85: aload 5
    //   87: iload 7
    //   89: aaload
    //   90: astore 8
    //   92: aload 4
    //   94: aload 8
    //   96: invokestatic 169	com/tencent/tencentmap/mapsdk/maps/a/hk:a	(Ljava/util/zip/ZipFile;Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   99: astore_3
    //   100: aload_3
    //   101: ifnonnull +20 -> 121
    //   104: aload 4
    //   106: invokevirtual 172	java/util/zip/ZipFile:close	()V
    //   109: aload_2
    //   110: invokestatic 156	com/tencent/tencentmap/mapsdk/maps/a/hk:a	(Ljava/io/File;)V
    //   113: ldc 154
    //   115: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   118: goto -100 -> 18
    //   121: aload_0
    //   122: aload 8
    //   124: invokestatic 127	com/tencent/tencentmap/mapsdk/maps/a/hk:b	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   127: astore 9
    //   129: new 56	java/lang/StringBuilder
    //   132: astore 8
    //   134: aload 8
    //   136: ldc 174
    //   138: invokespecial 59	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   141: aload 8
    //   143: aload 9
    //   145: invokevirtual 108	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   148: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: invokevirtual 80	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   154: invokestatic 139	com/tencent/map/lib/d:a	(Ljava/lang/String;)V
    //   157: getstatic 24	com/tencent/tencentmap/mapsdk/maps/a/hk:a	Z
    //   160: ifne +45 -> 205
    //   163: aload 9
    //   165: invokevirtual 130	java/io/File:exists	()Z
    //   168: ifeq +37 -> 205
    //   171: new 123	java/lang/AssertionError
    //   174: astore_0
    //   175: aload_0
    //   176: invokespecial 124	java/lang/AssertionError:<init>	()V
    //   179: ldc 154
    //   181: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   184: aload_0
    //   185: athrow
    //   186: astore_0
    //   187: ldc 176
    //   189: aload_0
    //   190: invokestatic 117	com/tencent/map/lib/d:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   193: aload_2
    //   194: invokestatic 156	com/tencent/tencentmap/mapsdk/maps/a/hk:a	(Ljava/io/File;)V
    //   197: ldc 154
    //   199: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   202: goto -184 -> 18
    //   205: aload 9
    //   207: invokevirtual 179	java/io/File:createNewFile	()Z
    //   210: ifne +75 -> 285
    //   213: new 153	java/io/IOException
    //   216: astore_0
    //   217: aload_0
    //   218: invokespecial 180	java/io/IOException:<init>	()V
    //   221: ldc 154
    //   223: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   226: aload_0
    //   227: athrow
    //   228: astore_0
    //   229: aload 9
    //   231: invokevirtual 130	java/io/File:exists	()Z
    //   234: ifeq +39 -> 273
    //   237: aload 9
    //   239: invokevirtual 103	java/io/File:delete	()Z
    //   242: ifne +31 -> 273
    //   245: new 56	java/lang/StringBuilder
    //   248: astore 5
    //   250: aload 5
    //   252: ldc 182
    //   254: invokespecial 59	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   257: aload 5
    //   259: aload 9
    //   261: invokevirtual 108	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   264: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: invokevirtual 80	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   270: invokestatic 112	com/tencent/map/lib/d:b	(Ljava/lang/String;)V
    //   273: aload 4
    //   275: invokevirtual 172	java/util/zip/ZipFile:close	()V
    //   278: ldc 154
    //   280: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   283: aload_0
    //   284: athrow
    //   285: aload 4
    //   287: aload_3
    //   288: invokevirtual 186	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   291: astore_3
    //   292: new 188	java/io/FileOutputStream
    //   295: astore 8
    //   297: aload 8
    //   299: aload 9
    //   301: invokespecial 190	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   304: sipush 16384
    //   307: newarray byte
    //   309: astore 10
    //   311: aload_3
    //   312: aload 10
    //   314: invokevirtual 196	java/io/InputStream:read	([B)I
    //   317: istore 11
    //   319: iload 11
    //   321: ifle +45 -> 366
    //   324: aload 8
    //   326: aload 10
    //   328: iconst_0
    //   329: iload 11
    //   331: invokevirtual 200	java/io/FileOutputStream:write	([BII)V
    //   334: goto -23 -> 311
    //   337: astore 5
    //   339: aload 8
    //   341: astore_0
    //   342: aload_3
    //   343: ifnull +7 -> 350
    //   346: aload_3
    //   347: invokevirtual 201	java/io/InputStream:close	()V
    //   350: aload_0
    //   351: ifnull +7 -> 358
    //   354: aload_0
    //   355: invokevirtual 202	java/io/FileOutputStream:close	()V
    //   358: ldc 154
    //   360: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   363: aload 5
    //   365: athrow
    //   366: aload_3
    //   367: ifnull +7 -> 374
    //   370: aload_3
    //   371: invokevirtual 201	java/io/InputStream:close	()V
    //   374: aload 8
    //   376: invokevirtual 202	java/io/FileOutputStream:close	()V
    //   379: getstatic 208	android/os/Build$VERSION:SDK_INT	I
    //   382: bipush 9
    //   384: if_icmplt +26 -> 410
    //   387: aload 9
    //   389: iconst_1
    //   390: iconst_0
    //   391: invokevirtual 212	java/io/File:setReadable	(ZZ)Z
    //   394: pop
    //   395: aload 9
    //   397: iconst_1
    //   398: iconst_0
    //   399: invokevirtual 215	java/io/File:setExecutable	(ZZ)Z
    //   402: pop
    //   403: aload 9
    //   405: iconst_1
    //   406: invokevirtual 219	java/io/File:setWritable	(Z)Z
    //   409: pop
    //   410: iinc 7 1
    //   413: goto -335 -> 78
    //   416: astore_0
    //   417: aload 8
    //   419: invokevirtual 202	java/io/FileOutputStream:close	()V
    //   422: ldc 154
    //   424: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   427: aload_0
    //   428: athrow
    //   429: astore 5
    //   431: aload_0
    //   432: ifnull +7 -> 439
    //   435: aload_0
    //   436: invokevirtual 202	java/io/FileOutputStream:close	()V
    //   439: ldc 154
    //   441: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   444: aload 5
    //   446: athrow
    //   447: aload 4
    //   449: invokevirtual 172	java/util/zip/ZipFile:close	()V
    //   452: ldc 154
    //   454: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   457: iconst_1
    //   458: istore_1
    //   459: goto -441 -> 18
    //   462: astore 5
    //   464: aconst_null
    //   465: astore_0
    //   466: aconst_null
    //   467: astore_3
    //   468: goto -126 -> 342
    //   471: astore 5
    //   473: aconst_null
    //   474: astore_0
    //   475: goto -133 -> 342
    //
    // Exception table:
    //   from	to	target	type
    //   33	75	186	java/io/IOException
    //   92	100	186	java/io/IOException
    //   104	113	186	java/io/IOException
    //   121	186	186	java/io/IOException
    //   229	273	186	java/io/IOException
    //   273	285	186	java/io/IOException
    //   447	452	186	java/io/IOException
    //   205	228	228	java/io/IOException
    //   354	358	228	java/io/IOException
    //   358	366	228	java/io/IOException
    //   374	410	228	java/io/IOException
    //   417	429	228	java/io/IOException
    //   435	439	228	java/io/IOException
    //   439	447	228	java/io/IOException
    //   304	311	337	finally
    //   311	319	337	finally
    //   324	334	337	finally
    //   370	374	416	finally
    //   346	350	429	finally
    //   285	292	462	finally
    //   292	304	471	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hk
 * JD-Core Version:    0.6.2
 */