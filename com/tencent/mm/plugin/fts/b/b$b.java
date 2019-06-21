package com.tencent.mm.plugin.fts.b;

import com.tencent.mm.plugin.fts.a.a.a;

final class b$b extends a
{
  private b$b(b paramb)
  {
  }

  // ERROR //
  public final boolean execute()
  {
    // Byte code:
    //   0: ldc 27
    //   2: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 37	com/tencent/mm/plugin/fts/b/b:bAy	()Lcom/tencent/mm/vfs/b;
    //   8: invokestatic 41	com/tencent/mm/plugin/fts/b/b:j	(Lcom/tencent/mm/vfs/b;)I
    //   11: istore_1
    //   12: invokestatic 45	com/tencent/mm/plugin/fts/b/b:bAz	()I
    //   15: istore_2
    //   16: ldc 47
    //   18: ldc 49
    //   20: iconst_2
    //   21: anewarray 51	java/lang/Object
    //   24: dup
    //   25: iconst_0
    //   26: iload_1
    //   27: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   30: aastore
    //   31: dup
    //   32: iconst_1
    //   33: iload_2
    //   34: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   37: aastore
    //   38: invokestatic 62	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   41: iload_1
    //   42: istore_3
    //   43: iload_2
    //   44: iload_1
    //   45: if_icmple +11 -> 56
    //   48: iload_1
    //   49: istore_3
    //   50: iload_2
    //   51: ifle +5 -> 56
    //   54: iconst_m1
    //   55: istore_3
    //   56: iload_3
    //   57: ifge +225 -> 282
    //   60: new 64	com/tencent/mm/vfs/b
    //   63: dup
    //   64: invokestatic 70	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   67: invokevirtual 76	android/content/Context:getCacheDir	()Ljava/io/File;
    //   70: ldc 78
    //   72: invokespecial 81	com/tencent/mm/vfs/b:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   75: astore 4
    //   77: invokestatic 70	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   80: invokevirtual 85	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   83: astore 5
    //   85: aload 5
    //   87: ldc 78
    //   89: invokevirtual 91	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   92: astore 5
    //   94: aload 4
    //   96: invokevirtual 94	com/tencent/mm/vfs/b:exists	()Z
    //   99: ifeq +9 -> 108
    //   102: aload 4
    //   104: invokevirtual 97	com/tencent/mm/vfs/b:delete	()Z
    //   107: pop
    //   108: new 99	com/tencent/mm/vfs/f
    //   111: astore 6
    //   113: aload 6
    //   115: aload 4
    //   117: invokespecial 102	com/tencent/mm/vfs/f:<init>	(Lcom/tencent/mm/vfs/b;)V
    //   120: aload 6
    //   122: astore 7
    //   124: aload 5
    //   126: astore 8
    //   128: sipush 1024
    //   131: newarray byte
    //   133: astore 9
    //   135: aload 6
    //   137: astore 7
    //   139: aload 5
    //   141: astore 8
    //   143: aload 5
    //   145: aload 9
    //   147: invokevirtual 108	java/io/InputStream:read	([B)I
    //   150: istore_3
    //   151: iload_3
    //   152: iconst_m1
    //   153: if_icmpeq +136 -> 289
    //   156: aload 6
    //   158: astore 7
    //   160: aload 5
    //   162: astore 8
    //   164: aload 6
    //   166: aload 9
    //   168: iconst_0
    //   169: iload_3
    //   170: invokevirtual 114	java/io/OutputStream:write	([BII)V
    //   173: goto -38 -> 135
    //   176: astore 9
    //   178: aload 6
    //   180: astore 7
    //   182: aload 5
    //   184: astore 8
    //   186: ldc 47
    //   188: aload 9
    //   190: ldc 116
    //   192: iconst_0
    //   193: anewarray 51	java/lang/Object
    //   196: invokestatic 120	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   199: aload 5
    //   201: ifnull +8 -> 209
    //   204: aload 5
    //   206: invokevirtual 123	java/io/InputStream:close	()V
    //   209: aload 6
    //   211: ifnull +8 -> 219
    //   214: aload 6
    //   216: invokevirtual 124	java/io/OutputStream:close	()V
    //   219: aload 4
    //   221: invokevirtual 94	com/tencent/mm/vfs/b:exists	()Z
    //   224: ifeq +58 -> 282
    //   227: new 126	com/tencent/mm/g/a/bf
    //   230: dup
    //   231: invokespecial 127	com/tencent/mm/g/a/bf:<init>	()V
    //   234: astore 5
    //   236: aload 5
    //   238: getfield 131	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   241: bipush 35
    //   243: putfield 137	com/tencent/mm/g/a/bf$a:cut	I
    //   246: aload 5
    //   248: getfield 131	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   251: iconst_1
    //   252: putfield 140	com/tencent/mm/g/a/bf$a:cuu	I
    //   255: aload 5
    //   257: getfield 131	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   260: aload 4
    //   262: invokevirtual 144	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   265: invokestatic 150	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   268: putfield 154	com/tencent/mm/g/a/bf$a:filePath	Ljava/lang/String;
    //   271: getstatic 160	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   274: aload 5
    //   276: invokestatic 166	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   279: invokevirtual 170	com/tencent/mm/sdk/b/a:a	(Lcom/tencent/mm/sdk/b/b;Landroid/os/Looper;)V
    //   282: ldc 27
    //   284: invokestatic 173	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   287: iconst_1
    //   288: ireturn
    //   289: aload 5
    //   291: ifnull +8 -> 299
    //   294: aload 5
    //   296: invokevirtual 123	java/io/InputStream:close	()V
    //   299: aload 6
    //   301: invokevirtual 124	java/io/OutputStream:close	()V
    //   304: goto -85 -> 219
    //   307: astore 5
    //   309: goto -90 -> 219
    //   312: astore 6
    //   314: aconst_null
    //   315: astore 7
    //   317: aconst_null
    //   318: astore 5
    //   320: aload 5
    //   322: ifnull +8 -> 330
    //   325: aload 5
    //   327: invokevirtual 123	java/io/InputStream:close	()V
    //   330: aload 7
    //   332: ifnull +8 -> 340
    //   335: aload 7
    //   337: invokevirtual 124	java/io/OutputStream:close	()V
    //   340: ldc 27
    //   342: invokestatic 173	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   345: aload 6
    //   347: athrow
    //   348: astore 5
    //   350: goto -51 -> 299
    //   353: astore 5
    //   355: goto -146 -> 209
    //   358: astore 5
    //   360: goto -141 -> 219
    //   363: astore 5
    //   365: goto -35 -> 330
    //   368: astore 5
    //   370: goto -30 -> 340
    //   373: astore 6
    //   375: aconst_null
    //   376: astore 7
    //   378: goto -58 -> 320
    //   381: astore 6
    //   383: aload 8
    //   385: astore 5
    //   387: goto -67 -> 320
    //   390: astore 9
    //   392: aconst_null
    //   393: astore 6
    //   395: aconst_null
    //   396: astore 5
    //   398: goto -220 -> 178
    //   401: astore 9
    //   403: aconst_null
    //   404: astore 6
    //   406: goto -228 -> 178
    //
    // Exception table:
    //   from	to	target	type
    //   128	135	176	java/lang/Exception
    //   143	151	176	java/lang/Exception
    //   164	173	176	java/lang/Exception
    //   299	304	307	java/io/IOException
    //   85	94	312	finally
    //   294	299	348	java/io/IOException
    //   204	209	353	java/io/IOException
    //   214	219	358	java/io/IOException
    //   325	330	363	java/io/IOException
    //   335	340	368	java/io/IOException
    //   94	108	373	finally
    //   108	120	373	finally
    //   128	135	381	finally
    //   143	151	381	finally
    //   164	173	381	finally
    //   186	199	381	finally
    //   85	94	390	java/lang/Exception
    //   94	108	401	java/lang/Exception
    //   108	120	401	java/lang/Exception
  }

  public final String getName()
  {
    return "CheckFeatureResourceTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.b.b
 * JD-Core Version:    0.6.2
 */