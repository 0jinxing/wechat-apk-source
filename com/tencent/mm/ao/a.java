package com.tencent.mm.ao;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.j;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.json.JSONObject;

public final class a
{
  private static String eSk = "";
  public static int fAH = 1;

  private static String afT()
  {
    AppMethodBeat.i(62273);
    if (bo.isNullOrNil(eSk))
      eSk = com.tencent.mm.compatible.util.e.eSk.replace("/data/user/0", "/data/data");
    String str = eSk;
    AppMethodBeat.o(62273);
    return str;
  }

  public static String afU()
  {
    AppMethodBeat.i(62274);
    Object localObject = new b(afT(), "emoji/res");
    if (!((b)localObject).exists())
      ((b)localObject).mkdirs();
    localObject = j.w(((b)localObject).dMD());
    AppMethodBeat.o(62274);
    return localObject;
  }

  public static String afV()
  {
    AppMethodBeat.i(62275);
    String str = afT() + "emoji/newemoji/";
    AppMethodBeat.o(62275);
    return str;
  }

  public static int afW()
  {
    AppMethodBeat.i(62276);
    Object localObject1 = null;
    InputStream localInputStream1 = null;
    InputStream localInputStream2 = localInputStream1;
    Object localObject3 = localObject1;
    try
    {
      Object localObject4 = new com/tencent/mm/vfs/b;
      localInputStream2 = localInputStream1;
      localObject3 = localObject1;
      ((b)localObject4).<init>(afU(), "config.conf");
      localInputStream2 = localInputStream1;
      localObject3 = localObject1;
      localInputStream1 = com.tencent.mm.vfs.e.p((b)localObject4);
      localInputStream2 = localInputStream1;
      localObject3 = localInputStream1;
      localObject1 = new java/io/InputStreamReader;
      localInputStream2 = localInputStream1;
      localObject3 = localInputStream1;
      ((InputStreamReader)localObject1).<init>(localInputStream1);
      localInputStream2 = localInputStream1;
      localObject3 = localInputStream1;
      localObject4 = new java/io/BufferedReader;
      localInputStream2 = localInputStream1;
      localObject3 = localInputStream1;
      ((BufferedReader)localObject4).<init>((Reader)localObject1);
      String str;
      StringBuilder localStringBuilder;
      for (localObject1 = ""; ; localObject1 = (String)localObject1 + str)
      {
        localInputStream2 = localInputStream1;
        localObject3 = localInputStream1;
        str = ((BufferedReader)localObject4).readLine();
        if (str == null)
          break;
        localInputStream2 = localInputStream1;
        localObject3 = localInputStream1;
        localStringBuilder = new java/lang/StringBuilder;
        localInputStream2 = localInputStream1;
        localObject3 = localInputStream1;
        localStringBuilder.<init>();
        localInputStream2 = localInputStream1;
        localObject3 = localInputStream1;
      }
      localInputStream2 = localInputStream1;
      localObject3 = localInputStream1;
      localObject4 = new org/json/JSONObject;
      localInputStream2 = localInputStream1;
      localObject3 = localInputStream1;
      ((JSONObject)localObject4).<init>((String)localObject1);
      localInputStream2 = localInputStream1;
      localObject3 = localInputStream1;
      i = ((JSONObject)localObject4).getInt("version");
      localInputStream2 = localInputStream1;
      localObject3 = localInputStream1;
      ab.d("MicroMsg.emoji.EmojiStoreExportLogic", "config file content:%s version:%d", new Object[] { localObject1, Integer.valueOf(i) });
      bo.b(localInputStream1);
      AppMethodBeat.o(62276);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject3 = localInputStream2;
        ab.printErrStackTrace("MicroMsg.emoji.EmojiStoreExportLogic", localException, localException.getMessage(), new Object[0]);
        bo.b(localInputStream2);
        AppMethodBeat.o(62276);
        int i = 1;
      }
    }
    finally
    {
      bo.b((Closeable)localObject3);
      AppMethodBeat.o(62276);
    }
  }

  // ERROR //
  private static int afX()
  {
    // Byte code:
    //   0: ldc 160
    //   2: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 166	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   8: invokevirtual 172	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   11: astore_0
    //   12: aload_0
    //   13: ldc 174
    //   15: invokevirtual 180	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   18: astore_1
    //   19: new 109	java/io/InputStreamReader
    //   22: astore_2
    //   23: aload_2
    //   24: aload_1
    //   25: invokespecial 112	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   28: new 114	java/io/BufferedReader
    //   31: astore_0
    //   32: aload_0
    //   33: aload_2
    //   34: invokespecial 117	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   37: ldc 14
    //   39: astore_3
    //   40: aload_0
    //   41: astore 4
    //   43: aload_2
    //   44: astore 5
    //   46: aload_1
    //   47: astore 6
    //   49: aload_0
    //   50: invokevirtual 120	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   53: astore 7
    //   55: aload 7
    //   57: ifnull +58 -> 115
    //   60: aload_0
    //   61: astore 4
    //   63: aload_2
    //   64: astore 5
    //   66: aload_1
    //   67: astore 6
    //   69: new 81	java/lang/StringBuilder
    //   72: astore 8
    //   74: aload_0
    //   75: astore 4
    //   77: aload_2
    //   78: astore 5
    //   80: aload_1
    //   81: astore 6
    //   83: aload 8
    //   85: invokespecial 83	java/lang/StringBuilder:<init>	()V
    //   88: aload_0
    //   89: astore 4
    //   91: aload_2
    //   92: astore 5
    //   94: aload_1
    //   95: astore 6
    //   97: aload 8
    //   99: aload_3
    //   100: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: aload 7
    //   105: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: invokevirtual 92	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   111: astore_3
    //   112: goto -72 -> 40
    //   115: aload_0
    //   116: astore 4
    //   118: aload_2
    //   119: astore 5
    //   121: aload_1
    //   122: astore 6
    //   124: new 122	org/json/JSONObject
    //   127: astore 8
    //   129: aload_0
    //   130: astore 4
    //   132: aload_2
    //   133: astore 5
    //   135: aload_1
    //   136: astore 6
    //   138: aload 8
    //   140: aload_3
    //   141: invokespecial 125	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   144: aload_0
    //   145: astore 4
    //   147: aload_2
    //   148: astore 5
    //   150: aload_1
    //   151: astore 6
    //   153: aload 8
    //   155: ldc 127
    //   157: invokevirtual 131	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   160: istore 9
    //   162: aload_0
    //   163: astore 4
    //   165: aload_2
    //   166: astore 5
    //   168: aload_1
    //   169: astore 6
    //   171: ldc 133
    //   173: ldc 135
    //   175: iconst_2
    //   176: anewarray 4	java/lang/Object
    //   179: dup
    //   180: iconst_0
    //   181: aload_3
    //   182: aastore
    //   183: dup
    //   184: iconst_1
    //   185: iload 9
    //   187: invokestatic 141	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   190: aastore
    //   191: invokestatic 147	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   194: aload_1
    //   195: invokestatic 151	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   198: aload_2
    //   199: invokestatic 151	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   202: aload_0
    //   203: invokestatic 151	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   206: ldc 160
    //   208: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   211: iload 9
    //   213: ireturn
    //   214: astore_3
    //   215: aconst_null
    //   216: astore_0
    //   217: aconst_null
    //   218: astore_2
    //   219: aconst_null
    //   220: astore_1
    //   221: aload_0
    //   222: astore 4
    //   224: aload_2
    //   225: astore 5
    //   227: aload_1
    //   228: astore 6
    //   230: ldc 133
    //   232: aload_3
    //   233: aload_3
    //   234: invokevirtual 154	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   237: iconst_0
    //   238: anewarray 4	java/lang/Object
    //   241: invokestatic 158	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   244: aload_1
    //   245: invokestatic 151	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   248: aload_2
    //   249: invokestatic 151	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   252: aload_0
    //   253: invokestatic 151	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   256: ldc 160
    //   258: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   261: iconst_1
    //   262: istore 9
    //   264: goto -53 -> 211
    //   267: astore_0
    //   268: aconst_null
    //   269: astore_3
    //   270: aconst_null
    //   271: astore_2
    //   272: aconst_null
    //   273: astore_1
    //   274: aload_1
    //   275: invokestatic 151	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   278: aload_2
    //   279: invokestatic 151	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   282: aload_3
    //   283: invokestatic 151	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   286: ldc 160
    //   288: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   291: aload_0
    //   292: athrow
    //   293: astore_0
    //   294: aconst_null
    //   295: astore_3
    //   296: aconst_null
    //   297: astore_2
    //   298: goto -24 -> 274
    //   301: astore_0
    //   302: aconst_null
    //   303: astore_3
    //   304: goto -30 -> 274
    //   307: astore_0
    //   308: aload 4
    //   310: astore_3
    //   311: aload 5
    //   313: astore_2
    //   314: aload 6
    //   316: astore_1
    //   317: goto -43 -> 274
    //   320: astore_3
    //   321: aconst_null
    //   322: astore_0
    //   323: aconst_null
    //   324: astore_2
    //   325: goto -104 -> 221
    //   328: astore_3
    //   329: aconst_null
    //   330: astore_0
    //   331: goto -110 -> 221
    //   334: astore_3
    //   335: goto -114 -> 221
    //
    // Exception table:
    //   from	to	target	type
    //   12	19	214	java/lang/Exception
    //   12	19	267	finally
    //   19	28	293	finally
    //   28	37	301	finally
    //   49	55	307	finally
    //   69	74	307	finally
    //   83	88	307	finally
    //   97	112	307	finally
    //   124	129	307	finally
    //   138	144	307	finally
    //   153	162	307	finally
    //   171	194	307	finally
    //   230	244	307	finally
    //   19	28	320	java/lang/Exception
    //   28	37	328	java/lang/Exception
    //   49	55	334	java/lang/Exception
    //   69	74	334	java/lang/Exception
    //   83	88	334	java/lang/Exception
    //   97	112	334	java/lang/Exception
    //   124	129	334	java/lang/Exception
    //   138	144	334	java/lang/Exception
    //   153	162	334	java/lang/Exception
    //   171	194	334	java/lang/Exception
  }

  private static void c(b paramb)
  {
    AppMethodBeat.i(62280);
    if (!paramb.exists())
      paramb.mkdirs();
    b localb = new b(paramb, ".nomedia");
    if (!localb.exists());
    try
    {
      localb.createNewFile();
      paramb = new b(paramb, "emoji_template.zip");
      if (rU(j.w(paramb.dMD())))
      {
        int i = com.tencent.mm.vfs.e.iu(j.w(paramb.dMD()), paramb.getParent());
        if (i < 0)
        {
          ab.e("MicroMsg.emoji.EmojiStoreExportLogic", "unzip fail, ret = " + i + ", zipFilePath = " + j.w(paramb.dMD()) + ", unzipPath = " + paramb.getParent());
          AppMethodBeat.o(62280);
          return;
        }
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.emoji.EmojiStoreExportLogic", localIOException, "create nomedia file error", new Object[0]);
        continue;
        fAH = afW();
        ab.i("MicroMsg.emoji.EmojiStoreExportLogic", "Unzip Path%s version=%d", new Object[] { paramb.getParent(), Integer.valueOf(fAH) });
        AppMethodBeat.o(62280);
        continue;
        ab.i("MicroMsg.emoji.EmojiStoreExportLogic", "copy template file from asset fail %s", new Object[] { j.w(paramb.dMD()) });
        AppMethodBeat.o(62280);
      }
    }
  }

  public static void cM(boolean paramBoolean)
  {
    AppMethodBeat.i(62279);
    b localb = new b(afU());
    ab.i("MicroMsg.emoji.EmojiStoreExportLogic", "copy search template file to path: %s", new Object[] { localb.dME() });
    if (d.vxr)
    {
      ab.i("MicroMsg.emoji.EmojiStoreExportLogic", "need to init search template folder %b", new Object[] { Boolean.valueOf(paramBoolean) });
      com.tencent.mm.vfs.e.N(j.w(localb.mUri), true);
      c(localb);
    }
    while (true)
    {
      com.tencent.mm.vfs.e.N(j.w(new b(com.tencent.mm.compatible.util.e.eSn, "emoji").mUri), true);
      AppMethodBeat.o(62279);
      return;
      fAH = afW();
      if (paramBoolean)
      {
        int i = afX();
        ab.i("MicroMsg.emoji.EmojiStoreExportLogic", "need update assetVersion=%d currentVersion=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(fAH) });
        if (fAH < i)
        {
          com.tencent.mm.vfs.e.N(j.w(localb.mUri), true);
          c(localb);
        }
      }
      else if (fAH == 1)
      {
        ab.i("MicroMsg.emoji.EmojiStoreExportLogic", "no need update currentVersion=%d", new Object[] { Integer.valueOf(fAH) });
        com.tencent.mm.vfs.e.N(j.w(localb.mUri), true);
        c(localb);
      }
    }
  }

  public static void d(b paramb)
  {
    AppMethodBeat.i(62281);
    b localb1 = new b(afU());
    com.tencent.mm.vfs.e.N(j.w(localb1.mUri), true);
    localb1.mkdirs();
    b localb2 = new b(localb1, ".nomedia");
    if (!localb2.exists());
    try
    {
      localb2.createNewFile();
      localb1 = new b(localb1, "emoji_template.zip");
      com.tencent.mm.vfs.e.y(j.w(paramb.mUri), j.w(localb1.mUri));
      int i = bo.hU(j.w(localb1.mUri), localb1.getParent());
      if (i < 0)
      {
        ab.e("MicroMsg.emoji.EmojiStoreExportLogic", "unzip fail, ret = " + i + ", zipFilePath = " + j.w(localb1.dMD()) + ", unzipPath = " + localb1.getParent());
        AppMethodBeat.o(62281);
        return;
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.emoji.EmojiStoreExportLogic", localIOException, "create nomedia file error", new Object[0]);
        continue;
        fAH = afW();
        ab.i("MicroMsg.emoji.EmojiStoreExportLogic", "Unzip Path%s version=%d", new Object[] { localb1.getParent(), Integer.valueOf(fAH) });
        AppMethodBeat.o(62281);
      }
    }
  }

  // ERROR //
  private static boolean rU(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc_w 283
    //   5: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: invokestatic 166	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   11: invokevirtual 172	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   14: astore_2
    //   15: aload_2
    //   16: ldc 195
    //   18: invokevirtual 180	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   21: astore_2
    //   22: aload_2
    //   23: ifnonnull +37 -> 60
    //   26: ldc 133
    //   28: ldc_w 285
    //   31: invokestatic 218	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   34: ldc_w 283
    //   37: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   40: iload_1
    //   41: ireturn
    //   42: astore_2
    //   43: ldc 133
    //   45: aload_2
    //   46: ldc 14
    //   48: iconst_0
    //   49: anewarray 4	java/lang/Object
    //   52: invokestatic 158	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   55: aconst_null
    //   56: astore_2
    //   57: goto -35 -> 22
    //   60: new 52	com/tencent/mm/vfs/b
    //   63: dup
    //   64: aload_0
    //   65: invokespecial 232	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   68: astore_0
    //   69: aload_0
    //   70: invokevirtual 64	com/tencent/mm/vfs/b:exists	()Z
    //   73: ifeq +8 -> 81
    //   76: aload_0
    //   77: invokevirtual 288	com/tencent/mm/vfs/b:delete	()Z
    //   80: pop
    //   81: aload_0
    //   82: invokevirtual 291	com/tencent/mm/vfs/b:dMC	()Lcom/tencent/mm/vfs/b;
    //   85: invokevirtual 67	com/tencent/mm/vfs/b:mkdirs	()Z
    //   88: pop
    //   89: aload_0
    //   90: invokestatic 295	com/tencent/mm/vfs/e:q	(Lcom/tencent/mm/vfs/b;)Ljava/io/OutputStream;
    //   93: astore_0
    //   94: aload_0
    //   95: ifnull +117 -> 212
    //   98: sipush 1024
    //   101: newarray byte
    //   103: astore_3
    //   104: aload_2
    //   105: aload_3
    //   106: invokevirtual 301	java/io/InputStream:read	([B)I
    //   109: istore 4
    //   111: iload 4
    //   113: iconst_m1
    //   114: if_icmpeq +62 -> 176
    //   117: aload_0
    //   118: aload_3
    //   119: iconst_0
    //   120: iload 4
    //   122: invokevirtual 307	java/io/OutputStream:write	([BII)V
    //   125: goto -21 -> 104
    //   128: astore_3
    //   129: ldc 133
    //   131: aload_3
    //   132: ldc 14
    //   134: iconst_0
    //   135: anewarray 4	java/lang/Object
    //   138: invokestatic 158	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   141: aload_2
    //   142: invokestatic 151	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   145: aload_0
    //   146: invokestatic 151	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   149: ldc_w 283
    //   152: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   155: goto -115 -> 40
    //   158: astore_0
    //   159: ldc 133
    //   161: aload_0
    //   162: ldc 14
    //   164: iconst_0
    //   165: anewarray 4	java/lang/Object
    //   168: invokestatic 158	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   171: aconst_null
    //   172: astore_0
    //   173: goto -79 -> 94
    //   176: aload_2
    //   177: invokestatic 151	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   180: aload_0
    //   181: invokestatic 151	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   184: iconst_1
    //   185: istore_1
    //   186: ldc_w 283
    //   189: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   192: goto -152 -> 40
    //   195: astore_3
    //   196: aload_2
    //   197: invokestatic 151	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   200: aload_0
    //   201: invokestatic 151	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   204: ldc_w 283
    //   207: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   210: aload_3
    //   211: athrow
    //   212: aload_2
    //   213: invokestatic 151	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   216: ldc_w 283
    //   219: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   222: goto -182 -> 40
    //
    // Exception table:
    //   from	to	target	type
    //   15	22	42	java/io/IOException
    //   98	104	128	java/io/IOException
    //   104	111	128	java/io/IOException
    //   117	125	128	java/io/IOException
    //   89	94	158	java/io/FileNotFoundException
    //   98	104	195	finally
    //   104	111	195	finally
    //   117	125	195	finally
    //   129	141	195	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ao.a
 * JD-Core Version:    0.6.2
 */