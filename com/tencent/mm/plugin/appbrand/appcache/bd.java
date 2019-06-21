package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.a.d;
import com.tencent.mm.plugin.appbrand.appcache.a.b.a.a;
import com.tencent.mm.pluginsdk.g.a.c.l;
import com.tencent.mm.pluginsdk.g.a.c.m;
import com.tencent.mm.sdk.platformtools.ab;

public final class bd
{
  public static void a(bc parambc, m paramm, z.a parama)
  {
    AppMethodBeat.i(59551);
    ab.e("MicroMsg.AppBrand.ZstdLogic", "onZstdPkgDownloadFail, request(%s %d)", new Object[] { parambc.appId, Integer.valueOf(parambc.gVu) });
    parama.a(paramm);
    paramm = ((d)g.K(d.class)).xF();
    if (paramm == null)
    {
      ab.e("MicroMsg.AppBrand.ZstdLogic", "onIncrementalPkgDownloadFail, before fallback full_pkg, nil storage");
      az.a(parambc.vdC, parambc.appId, b.a.a.gVH, null);
      AppMethodBeat.o(59551);
    }
    while (true)
    {
      return;
      az.xJ(parambc.vdC);
      paramm = paramm.a(parambc.appId, parambc.gVu, parambc.cBc, new String[] { "downloadURL" });
      if (paramm == null)
      {
        ab.e("MicroMsg.AppBrand.ZstdLogic", "onIncrementalPkgDownloadFail, before fallback full_pkg, nil record(%s %d)", new Object[] { parambc.appId, Integer.valueOf(parambc.gVu) });
        AppMethodBeat.o(59551);
      }
      else
      {
        az.b(parambc.appId, parambc.cBc, parambc.gVu, paramm.field_downloadURL, parambc.gTR);
        AppMethodBeat.o(59551);
      }
    }
  }

  // ERROR //
  static boolean a(bc parambc)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc 118
    //   4: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: invokevirtual 122	com/tencent/mm/plugin/appbrand/appcache/bc:getFilePath	()Ljava/lang/String;
    //   11: astore_2
    //   12: new 124	java/io/File
    //   15: dup
    //   16: aload_2
    //   17: invokespecial 128	java/io/File:<init>	(Ljava/lang/String;)V
    //   20: astore_3
    //   21: aload_3
    //   22: invokevirtual 132	java/io/File:exists	()Z
    //   25: ifne +17 -> 42
    //   28: ldc 15
    //   30: ldc 134
    //   32: invokestatic 61	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   35: ldc 118
    //   37: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   40: iload_1
    //   41: ireturn
    //   42: new 124	java/io/File
    //   45: dup
    //   46: aload_0
    //   47: invokevirtual 137	com/tencent/mm/plugin/appbrand/appcache/bc:aws	()Ljava/lang/String;
    //   50: invokespecial 128	java/io/File:<init>	(Ljava/lang/String;)V
    //   53: astore 4
    //   55: aload 4
    //   57: invokevirtual 132	java/io/File:exists	()Z
    //   60: ifeq +26 -> 86
    //   63: aload 4
    //   65: invokevirtual 140	java/io/File:delete	()Z
    //   68: ifne +18 -> 86
    //   71: ldc 15
    //   73: ldc 142
    //   75: invokestatic 61	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   78: ldc 118
    //   80: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   83: goto -43 -> 40
    //   86: new 144	com/tencent/mars/zstd/ZstdInputStream
    //   89: astore 5
    //   91: new 146	java/io/FileInputStream
    //   94: astore_0
    //   95: aload_0
    //   96: aload_3
    //   97: invokespecial 149	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   100: aload 5
    //   102: aload_0
    //   103: invokespecial 152	com/tencent/mars/zstd/ZstdInputStream:<init>	(Ljava/io/InputStream;)V
    //   106: new 154	java/io/FileOutputStream
    //   109: astore_0
    //   110: aload_0
    //   111: aload 4
    //   113: invokespecial 155	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   116: aload_0
    //   117: astore_3
    //   118: aload 5
    //   120: astore 4
    //   122: sipush 8192
    //   125: newarray byte
    //   127: astore 6
    //   129: aload_0
    //   130: astore_3
    //   131: aload 5
    //   133: astore 4
    //   135: aload 5
    //   137: aload 6
    //   139: iconst_0
    //   140: sipush 8192
    //   143: invokevirtual 159	com/tencent/mars/zstd/ZstdInputStream:read	([BII)I
    //   146: istore 7
    //   148: iload 7
    //   150: iconst_m1
    //   151: if_icmpeq +69 -> 220
    //   154: aload_0
    //   155: astore_3
    //   156: aload 5
    //   158: astore 4
    //   160: aload_0
    //   161: aload 6
    //   163: iconst_0
    //   164: iload 7
    //   166: invokevirtual 163	java/io/FileOutputStream:write	([BII)V
    //   169: goto -40 -> 129
    //   172: astore_2
    //   173: aload_0
    //   174: astore_3
    //   175: aload 5
    //   177: astore 4
    //   179: ldc 15
    //   181: ldc 165
    //   183: iconst_1
    //   184: anewarray 4	java/lang/Object
    //   187: dup
    //   188: iconst_0
    //   189: aload_2
    //   190: aastore
    //   191: invokestatic 39	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   194: aload_0
    //   195: ifnull +7 -> 202
    //   198: aload_0
    //   199: invokevirtual 169	java/io/FileOutputStream:close	()V
    //   202: aload 5
    //   204: ifnull +8 -> 212
    //   207: aload 5
    //   209: invokevirtual 170	com/tencent/mars/zstd/ZstdInputStream:close	()V
    //   212: ldc 118
    //   214: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   217: goto -177 -> 40
    //   220: aload_0
    //   221: astore_3
    //   222: aload 5
    //   224: astore 4
    //   226: aload_0
    //   227: invokevirtual 173	java/io/FileOutputStream:flush	()V
    //   230: aload_0
    //   231: astore_3
    //   232: aload 5
    //   234: astore 4
    //   236: aload_2
    //   237: invokestatic 179	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   240: pop
    //   241: aload_0
    //   242: invokevirtual 169	java/io/FileOutputStream:close	()V
    //   245: aload 5
    //   247: invokevirtual 170	com/tencent/mars/zstd/ZstdInputStream:close	()V
    //   250: ldc 118
    //   252: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   255: iconst_1
    //   256: istore_1
    //   257: goto -217 -> 40
    //   260: astore_0
    //   261: aconst_null
    //   262: astore_3
    //   263: aconst_null
    //   264: astore 5
    //   266: aload_3
    //   267: ifnull +7 -> 274
    //   270: aload_3
    //   271: invokevirtual 169	java/io/FileOutputStream:close	()V
    //   274: aload 5
    //   276: ifnull +8 -> 284
    //   279: aload 5
    //   281: invokevirtual 170	com/tencent/mars/zstd/ZstdInputStream:close	()V
    //   284: ldc 118
    //   286: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   289: aload_0
    //   290: athrow
    //   291: astore_0
    //   292: goto -47 -> 245
    //   295: astore_0
    //   296: goto -46 -> 250
    //   299: astore_0
    //   300: goto -98 -> 202
    //   303: astore_0
    //   304: goto -92 -> 212
    //   307: astore 4
    //   309: goto -35 -> 274
    //   312: astore 5
    //   314: goto -30 -> 284
    //   317: astore_0
    //   318: aconst_null
    //   319: astore_3
    //   320: goto -54 -> 266
    //   323: astore_0
    //   324: aload 4
    //   326: astore 5
    //   328: goto -62 -> 266
    //   331: astore_2
    //   332: aconst_null
    //   333: astore_0
    //   334: aconst_null
    //   335: astore 5
    //   337: goto -164 -> 173
    //   340: astore_2
    //   341: aconst_null
    //   342: astore_0
    //   343: goto -170 -> 173
    //
    // Exception table:
    //   from	to	target	type
    //   122	129	172	java/lang/Exception
    //   135	148	172	java/lang/Exception
    //   160	169	172	java/lang/Exception
    //   226	230	172	java/lang/Exception
    //   236	241	172	java/lang/Exception
    //   86	106	260	finally
    //   241	245	291	java/io/IOException
    //   245	250	295	java/io/IOException
    //   198	202	299	java/io/IOException
    //   207	212	303	java/io/IOException
    //   270	274	307	java/io/IOException
    //   279	284	312	java/io/IOException
    //   106	116	317	finally
    //   122	129	323	finally
    //   135	148	323	finally
    //   160	169	323	finally
    //   179	194	323	finally
    //   226	230	323	finally
    //   236	241	323	finally
    //   86	106	331	java/lang/Exception
    //   106	116	340	java/lang/Exception
  }

  public static boolean a(String paramString1, String paramString2, int paramInt1, int paramInt2, az.a parama)
  {
    AppMethodBeat.i(59550);
    boolean bool = az.a(new bc(paramString1, paramString2, paramInt1, paramInt2, parama), parama);
    AppMethodBeat.o(59550);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.bd
 * JD-Core Version:    0.6.2
 */