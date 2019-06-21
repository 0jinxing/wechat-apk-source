package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;

public final class m
{
  public static boolean C(String paramString1, String paramString2, boolean paramBoolean)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(51987);
    if (bo.isNullOrNil(paramString1))
    {
      AppMethodBeat.o(51987);
      paramBoolean = bool;
    }
    File localFile;
    Object localObject;
    while (true)
    {
      return paramBoolean;
      localFile = new File(paramString1);
      if (!localFile.exists())
      {
        AppMethodBeat.o(51987);
        paramBoolean = bool;
      }
      else
      {
        localObject = new File(paramString2);
        if (!localFile.isFile())
          break label127;
        if ((((File)localObject).isFile()) || (!((File)localObject).exists()))
          break;
        AppMethodBeat.o(51987);
        paramBoolean = bool;
      }
    }
    copyFile(paramString1, paramString2);
    if (paramBoolean)
      localFile.delete();
    while (true)
    {
      paramBoolean = true;
      AppMethodBeat.o(51987);
      break;
      label127: if (localFile.isDirectory())
      {
        if (!((File)localObject).exists())
          ((File)localObject).mkdir();
        if (!((File)localObject).isDirectory())
        {
          AppMethodBeat.o(51987);
          paramBoolean = bool;
          break;
        }
        localObject = localFile.list();
        while (i < localObject.length)
        {
          C(paramString1 + "/" + localObject[i], paramString2 + "/" + localObject[i], paramBoolean);
          i++;
        }
      }
    }
  }

  // ERROR //
  private static boolean a(java.io.InputStream paramInputStream, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: iconst_0
    //   3: istore 4
    //   5: ldc 77
    //   7: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: invokevirtual 83	java/io/InputStream:available	()I
    //   14: istore 5
    //   16: new 85	java/io/FileOutputStream
    //   19: astore 6
    //   21: aload 6
    //   23: aload_1
    //   24: iload_2
    //   25: invokespecial 88	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   28: aload 6
    //   30: astore 7
    //   32: sipush 16384
    //   35: newarray byte
    //   37: astore 8
    //   39: aload 6
    //   41: astore 7
    //   43: aload_0
    //   44: aload 8
    //   46: invokevirtual 92	java/io/InputStream:read	([B)I
    //   49: istore 9
    //   51: iload 9
    //   53: iconst_m1
    //   54: if_icmpeq +74 -> 128
    //   57: aload 6
    //   59: astore 7
    //   61: aload 6
    //   63: aload 8
    //   65: iconst_0
    //   66: iload 9
    //   68: invokevirtual 96	java/io/FileOutputStream:write	([BII)V
    //   71: goto -32 -> 39
    //   74: astore 7
    //   76: aload 6
    //   78: astore_1
    //   79: aload 7
    //   81: astore 6
    //   83: aload_1
    //   84: astore 7
    //   86: ldc 98
    //   88: aload 6
    //   90: ldc 100
    //   92: iconst_0
    //   93: anewarray 4	java/lang/Object
    //   96: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   99: aload_0
    //   100: ifnull +7 -> 107
    //   103: aload_0
    //   104: invokevirtual 109	java/io/InputStream:close	()V
    //   107: iload 4
    //   109: istore_2
    //   110: aload_1
    //   111: ifnull +10 -> 121
    //   114: aload_1
    //   115: invokevirtual 110	java/io/FileOutputStream:close	()V
    //   118: iload 4
    //   120: istore_2
    //   121: ldc 77
    //   123: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   126: iload_2
    //   127: ireturn
    //   128: iload_2
    //   129: ifeq +23 -> 152
    //   132: iload_3
    //   133: istore_2
    //   134: aload_0
    //   135: ifnull +9 -> 144
    //   138: aload_0
    //   139: invokevirtual 109	java/io/InputStream:close	()V
    //   142: iload_3
    //   143: istore_2
    //   144: aload 6
    //   146: invokevirtual 110	java/io/FileOutputStream:close	()V
    //   149: goto -28 -> 121
    //   152: aload 6
    //   154: astore 7
    //   156: new 24	java/io/File
    //   159: astore 8
    //   161: aload 6
    //   163: astore 7
    //   165: aload 8
    //   167: aload_1
    //   168: invokespecial 28	java/io/File:<init>	(Ljava/lang/String;)V
    //   171: aload 6
    //   173: astore 7
    //   175: aload 8
    //   177: invokevirtual 32	java/io/File:exists	()Z
    //   180: ifeq +27 -> 207
    //   183: iload 5
    //   185: i2l
    //   186: lstore 10
    //   188: aload 6
    //   190: astore 7
    //   192: aload 8
    //   194: invokevirtual 114	java/io/File:length	()J
    //   197: lstore 12
    //   199: lload 10
    //   201: lload 12
    //   203: lcmp
    //   204: ifeq -72 -> 132
    //   207: iconst_0
    //   208: istore_3
    //   209: goto -77 -> 132
    //   212: astore_0
    //   213: ldc 98
    //   215: aload_0
    //   216: ldc 100
    //   218: iconst_0
    //   219: anewarray 4	java/lang/Object
    //   222: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   225: iconst_0
    //   226: istore_2
    //   227: goto -83 -> 144
    //   230: astore_0
    //   231: ldc 98
    //   233: aload_0
    //   234: ldc 100
    //   236: iconst_0
    //   237: anewarray 4	java/lang/Object
    //   240: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   243: iload 4
    //   245: istore_2
    //   246: goto -125 -> 121
    //   249: astore_0
    //   250: ldc 98
    //   252: aload_0
    //   253: ldc 100
    //   255: iconst_0
    //   256: anewarray 4	java/lang/Object
    //   259: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   262: goto -155 -> 107
    //   265: astore_0
    //   266: ldc 98
    //   268: aload_0
    //   269: ldc 100
    //   271: iconst_0
    //   272: anewarray 4	java/lang/Object
    //   275: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   278: iload 4
    //   280: istore_2
    //   281: goto -160 -> 121
    //   284: astore_1
    //   285: aconst_null
    //   286: astore 7
    //   288: aload_0
    //   289: ifnull +7 -> 296
    //   292: aload_0
    //   293: invokevirtual 109	java/io/InputStream:close	()V
    //   296: aload 7
    //   298: ifnull +8 -> 306
    //   301: aload 7
    //   303: invokevirtual 110	java/io/FileOutputStream:close	()V
    //   306: ldc 77
    //   308: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   311: aload_1
    //   312: athrow
    //   313: astore_0
    //   314: ldc 98
    //   316: aload_0
    //   317: ldc 100
    //   319: iconst_0
    //   320: anewarray 4	java/lang/Object
    //   323: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   326: goto -30 -> 296
    //   329: astore_0
    //   330: ldc 98
    //   332: aload_0
    //   333: ldc 100
    //   335: iconst_0
    //   336: anewarray 4	java/lang/Object
    //   339: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   342: goto -36 -> 306
    //   345: astore_1
    //   346: goto -58 -> 288
    //   349: astore 6
    //   351: aconst_null
    //   352: astore_1
    //   353: goto -270 -> 83
    //
    // Exception table:
    //   from	to	target	type
    //   32	39	74	java/lang/Exception
    //   43	51	74	java/lang/Exception
    //   61	71	74	java/lang/Exception
    //   156	161	74	java/lang/Exception
    //   165	171	74	java/lang/Exception
    //   175	183	74	java/lang/Exception
    //   192	199	74	java/lang/Exception
    //   138	142	212	java/io/IOException
    //   144	149	230	java/io/IOException
    //   103	107	249	java/io/IOException
    //   114	118	265	java/io/IOException
    //   10	28	284	finally
    //   292	296	313	java/io/IOException
    //   301	306	329	java/io/IOException
    //   32	39	345	finally
    //   43	51	345	finally
    //   61	71	345	finally
    //   86	99	345	finally
    //   156	161	345	finally
    //   165	171	345	finally
    //   175	183	345	finally
    //   192	199	345	finally
    //   10	28	349	java/lang/Exception
  }

  public static boolean copyAssets(Context paramContext, String paramString1, String paramString2)
  {
    int i = 0;
    AppMethodBeat.i(51988);
    while (true)
    {
      boolean bool;
      try
      {
        bool = a(paramContext.getAssets().open(paramString1), paramString2, false);
        AppMethodBeat.o(51988);
        return bool;
      }
      catch (IOException localIOException)
      {
        ab.e("MicroMsg.SDK.FilesCopy", "copy assets file srcpath=%s to=%s failed, try pattern now", new Object[] { paramString1, paramString2 });
      }
      String str = paramString1 + "." + i;
      try
      {
        bool = a(paramContext.getAssets().open(str), paramString2, true);
        if (!bool)
        {
          label97: AppMethodBeat.o(51988);
          bool = true;
          continue;
        }
        ab.d("MicroMsg.SDK.FilesCopy", "copy pattern %s", new Object[] { str });
        i++;
      }
      catch (IOException paramContext)
      {
        break label97;
      }
    }
  }

  // ERROR //
  public static boolean copyFile(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: iconst_1
    //   3: istore_3
    //   4: ldc 148
    //   6: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: invokestatic 19	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   13: ifne +10 -> 23
    //   16: aload_1
    //   17: invokestatic 19	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   20: ifeq +19 -> 39
    //   23: ldc 98
    //   25: ldc 150
    //   27: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   30: ldc 148
    //   32: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   35: iconst_0
    //   36: istore_3
    //   37: iload_3
    //   38: ireturn
    //   39: aload_0
    //   40: aload_1
    //   41: invokevirtual 160	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   44: ifeq +11 -> 55
    //   47: ldc 148
    //   49: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   52: goto -15 -> 37
    //   55: new 162	java/io/FileInputStream
    //   58: astore 4
    //   60: aload 4
    //   62: aload_0
    //   63: invokespecial 163	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   66: new 85	java/io/FileOutputStream
    //   69: astore_0
    //   70: aload_0
    //   71: aload_1
    //   72: invokespecial 164	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   75: aload_0
    //   76: astore 5
    //   78: aload 4
    //   80: astore_1
    //   81: sipush 16384
    //   84: newarray byte
    //   86: astore 6
    //   88: aload_0
    //   89: astore 5
    //   91: aload 4
    //   93: astore_1
    //   94: aload 4
    //   96: aload 6
    //   98: invokevirtual 165	java/io/FileInputStream:read	([B)I
    //   101: istore 7
    //   103: iload 7
    //   105: iconst_m1
    //   106: if_icmpeq +70 -> 176
    //   109: aload_0
    //   110: astore 5
    //   112: aload 4
    //   114: astore_1
    //   115: aload_0
    //   116: aload 6
    //   118: iconst_0
    //   119: iload 7
    //   121: invokevirtual 96	java/io/FileOutputStream:write	([BII)V
    //   124: goto -36 -> 88
    //   127: astore 6
    //   129: aload_0
    //   130: astore 5
    //   132: aload 4
    //   134: astore_1
    //   135: ldc 98
    //   137: aload 6
    //   139: ldc 100
    //   141: iconst_0
    //   142: anewarray 4	java/lang/Object
    //   145: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   148: aload 4
    //   150: ifnull +8 -> 158
    //   153: aload 4
    //   155: invokevirtual 166	java/io/FileInputStream:close	()V
    //   158: aload_0
    //   159: ifnull +195 -> 354
    //   162: aload_0
    //   163: invokevirtual 110	java/io/FileOutputStream:close	()V
    //   166: iconst_0
    //   167: istore_3
    //   168: ldc 148
    //   170: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   173: goto -136 -> 37
    //   176: aload 4
    //   178: invokevirtual 166	java/io/FileInputStream:close	()V
    //   181: iload_2
    //   182: istore_3
    //   183: aload_0
    //   184: invokevirtual 110	java/io/FileOutputStream:close	()V
    //   187: goto -19 -> 168
    //   190: astore_0
    //   191: ldc 98
    //   193: aload_0
    //   194: ldc 100
    //   196: iconst_0
    //   197: anewarray 4	java/lang/Object
    //   200: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   203: iconst_0
    //   204: istore_3
    //   205: goto -37 -> 168
    //   208: astore_1
    //   209: ldc 98
    //   211: aload_1
    //   212: ldc 100
    //   214: iconst_0
    //   215: anewarray 4	java/lang/Object
    //   218: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   221: iconst_0
    //   222: istore_3
    //   223: goto -40 -> 183
    //   226: astore_1
    //   227: ldc 98
    //   229: aload_1
    //   230: ldc 100
    //   232: iconst_0
    //   233: anewarray 4	java/lang/Object
    //   236: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   239: goto -81 -> 158
    //   242: astore_0
    //   243: ldc 98
    //   245: aload_0
    //   246: ldc 100
    //   248: iconst_0
    //   249: anewarray 4	java/lang/Object
    //   252: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   255: iconst_0
    //   256: istore_3
    //   257: goto -89 -> 168
    //   260: astore_0
    //   261: aconst_null
    //   262: astore 5
    //   264: aconst_null
    //   265: astore_1
    //   266: aload_1
    //   267: ifnull +7 -> 274
    //   270: aload_1
    //   271: invokevirtual 166	java/io/FileInputStream:close	()V
    //   274: aload 5
    //   276: ifnull +8 -> 284
    //   279: aload 5
    //   281: invokevirtual 110	java/io/FileOutputStream:close	()V
    //   284: ldc 148
    //   286: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   289: aload_0
    //   290: athrow
    //   291: astore_1
    //   292: ldc 98
    //   294: aload_1
    //   295: ldc 100
    //   297: iconst_0
    //   298: anewarray 4	java/lang/Object
    //   301: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   304: goto -30 -> 274
    //   307: astore_1
    //   308: ldc 98
    //   310: aload_1
    //   311: ldc 100
    //   313: iconst_0
    //   314: anewarray 4	java/lang/Object
    //   317: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   320: goto -36 -> 284
    //   323: astore_0
    //   324: aconst_null
    //   325: astore 5
    //   327: aload 4
    //   329: astore_1
    //   330: goto -64 -> 266
    //   333: astore_0
    //   334: goto -68 -> 266
    //   337: astore 6
    //   339: aconst_null
    //   340: astore_0
    //   341: aconst_null
    //   342: astore 4
    //   344: goto -215 -> 129
    //   347: astore 6
    //   349: aconst_null
    //   350: astore_0
    //   351: goto -222 -> 129
    //   354: iconst_0
    //   355: istore_3
    //   356: goto -188 -> 168
    //
    // Exception table:
    //   from	to	target	type
    //   81	88	127	java/lang/Exception
    //   94	103	127	java/lang/Exception
    //   115	124	127	java/lang/Exception
    //   183	187	190	java/io/IOException
    //   176	181	208	java/io/IOException
    //   153	158	226	java/io/IOException
    //   162	166	242	java/io/IOException
    //   55	66	260	finally
    //   270	274	291	java/io/IOException
    //   279	284	307	java/io/IOException
    //   66	75	323	finally
    //   81	88	333	finally
    //   94	103	333	finally
    //   115	124	333	finally
    //   135	148	333	finally
    //   55	66	337	java/lang/Exception
    //   66	75	347	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.m
 * JD-Core Version:    0.6.2
 */