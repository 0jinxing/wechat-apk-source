package com.tencent.mm.plugin.websearch;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ji;
import com.tencent.mm.sdk.b.c;

final class PluginWebSearch$5 extends c<ji>
{
  PluginWebSearch$5(PluginWebSearch paramPluginWebSearch)
  {
    AppMethodBeat.i(91311);
    this.xxI = ji.class.getName().hashCode();
    AppMethodBeat.o(91311);
  }

  // ERROR //
  private boolean a(ji paramji)
  {
    // Byte code:
    //   0: ldc 50
    //   2: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: ifnull +274 -> 280
    //   9: aload_1
    //   10: getfield 54	com/tencent/mm/g/a/ji:cEE	Lcom/tencent/mm/g/a/ji$a;
    //   13: getfield 59	com/tencent/mm/g/a/ji$a:cut	I
    //   16: bipush 27
    //   18: if_icmpne +262 -> 280
    //   21: aload_1
    //   22: getfield 54	com/tencent/mm/g/a/ji:cEE	Lcom/tencent/mm/g/a/ji$a;
    //   25: getfield 62	com/tencent/mm/g/a/ji$a:cuu	I
    //   28: iconst_1
    //   29: if_icmpne +317 -> 346
    //   32: new 64	com/tencent/mm/vfs/b
    //   35: dup
    //   36: aload_1
    //   37: getfield 54	com/tencent/mm/g/a/ji:cEE	Lcom/tencent/mm/g/a/ji$a;
    //   40: getfield 68	com/tencent/mm/g/a/ji$a:filePath	Ljava/lang/String;
    //   43: invokespecial 71	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   46: astore_2
    //   47: aload_2
    //   48: invokevirtual 75	com/tencent/mm/vfs/b:exists	()Z
    //   51: ifeq +285 -> 336
    //   54: ldc 77
    //   56: ldc 79
    //   58: iconst_1
    //   59: anewarray 81	java/lang/Object
    //   62: dup
    //   63: iconst_0
    //   64: aload_2
    //   65: invokevirtual 85	com/tencent/mm/vfs/b:dME	()Lcom/tencent/mm/vfs/b;
    //   68: aastore
    //   69: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   72: new 64	com/tencent/mm/vfs/b
    //   75: dup
    //   76: aload_1
    //   77: getfield 54	com/tencent/mm/g/a/ji:cEE	Lcom/tencent/mm/g/a/ji$a;
    //   80: getfield 62	com/tencent/mm/g/a/ji$a:cuu	I
    //   83: invokestatic 96	com/tencent/mm/plugin/websearch/api/aa:Ib	(I)Ljava/lang/String;
    //   86: ldc 98
    //   88: invokespecial 101	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   91: astore_3
    //   92: new 64	com/tencent/mm/vfs/b
    //   95: dup
    //   96: aload_3
    //   97: aload_1
    //   98: getfield 54	com/tencent/mm/g/a/ji:cEE	Lcom/tencent/mm/g/a/ji$a;
    //   101: getfield 62	com/tencent/mm/g/a/ji$a:cuu	I
    //   104: invokestatic 104	com/tencent/mm/plugin/websearch/api/aa:Ic	(I)Ljava/lang/String;
    //   107: invokespecial 107	com/tencent/mm/vfs/b:<init>	(Lcom/tencent/mm/vfs/b;Ljava/lang/String;)V
    //   110: astore 4
    //   112: aload_3
    //   113: invokevirtual 110	com/tencent/mm/vfs/b:mkdirs	()Z
    //   116: pop
    //   117: aload_2
    //   118: invokevirtual 114	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   121: invokestatic 120	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   124: aload 4
    //   126: invokevirtual 114	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   129: invokestatic 120	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   132: invokestatic 126	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   135: pop2
    //   136: aload 4
    //   138: invokevirtual 114	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   141: invokestatic 120	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   144: aload_3
    //   145: invokevirtual 114	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   148: invokestatic 120	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   151: invokestatic 132	com/tencent/mm/sdk/platformtools/bo:hU	(Ljava/lang/String;Ljava/lang/String;)I
    //   154: iflt +300 -> 454
    //   157: new 134	java/util/Properties
    //   160: dup
    //   161: invokespecial 135	java/util/Properties:<init>	()V
    //   164: astore 5
    //   166: new 137	com/tencent/mm/vfs/d
    //   169: astore 6
    //   171: new 64	com/tencent/mm/vfs/b
    //   174: astore 4
    //   176: aload 4
    //   178: aload_3
    //   179: ldc 139
    //   181: invokespecial 107	com/tencent/mm/vfs/b:<init>	(Lcom/tencent/mm/vfs/b;Ljava/lang/String;)V
    //   184: aload 6
    //   186: aload 4
    //   188: invokespecial 142	com/tencent/mm/vfs/d:<init>	(Lcom/tencent/mm/vfs/b;)V
    //   191: aload 6
    //   193: astore 4
    //   195: aload 5
    //   197: aload 6
    //   199: invokevirtual 146	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   202: aload 6
    //   204: invokestatic 150	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   207: aload 5
    //   209: ldc 152
    //   211: ldc 154
    //   213: invokevirtual 158	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   216: invokestatic 164	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   219: invokevirtual 167	java/lang/Integer:intValue	()I
    //   222: istore 7
    //   224: aload_3
    //   225: getfield 171	com/tencent/mm/vfs/b:mUri	Landroid/net/Uri;
    //   228: invokestatic 120	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   231: iconst_1
    //   232: invokestatic 175	com/tencent/mm/vfs/e:N	(Ljava/lang/String;Z)Z
    //   235: pop
    //   236: ldc 77
    //   238: ldc 177
    //   240: iconst_2
    //   241: anewarray 81	java/lang/Object
    //   244: dup
    //   245: iconst_0
    //   246: iconst_0
    //   247: invokestatic 181	com/tencent/mm/plugin/websearch/api/aa:HV	(I)I
    //   250: invokestatic 184	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   253: aastore
    //   254: dup
    //   255: iconst_1
    //   256: iload 7
    //   258: invokestatic 184	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   261: aastore
    //   262: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   265: aload_0
    //   266: getfield 13	com/tencent/mm/plugin/websearch/PluginWebSearch$5:tZc	Lcom/tencent/mm/plugin/websearch/PluginWebSearch;
    //   269: aload_2
    //   270: aload_1
    //   271: getfield 54	com/tencent/mm/g/a/ji:cEE	Lcom/tencent/mm/g/a/ji$a;
    //   274: getfield 62	com/tencent/mm/g/a/ji$a:cuu	I
    //   277: invokestatic 188	com/tencent/mm/plugin/websearch/PluginWebSearch:access$200	(Lcom/tencent/mm/plugin/websearch/PluginWebSearch;Lcom/tencent/mm/vfs/b;I)V
    //   280: ldc 50
    //   282: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   285: iconst_0
    //   286: ireturn
    //   287: astore 8
    //   289: aconst_null
    //   290: astore 6
    //   292: aload 6
    //   294: astore 4
    //   296: ldc 77
    //   298: aload 8
    //   300: aload 8
    //   302: invokevirtual 191	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   305: iconst_0
    //   306: anewarray 81	java/lang/Object
    //   309: invokestatic 195	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   312: aload 6
    //   314: invokestatic 150	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   317: goto -110 -> 207
    //   320: astore_1
    //   321: aconst_null
    //   322: astore 4
    //   324: aload 4
    //   326: invokestatic 150	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   329: ldc 50
    //   331: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   334: aload_1
    //   335: athrow
    //   336: ldc 77
    //   338: ldc 197
    //   340: invokestatic 200	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   343: goto -63 -> 280
    //   346: aload_1
    //   347: getfield 54	com/tencent/mm/g/a/ji:cEE	Lcom/tencent/mm/g/a/ji$a;
    //   350: getfield 62	com/tencent/mm/g/a/ji$a:cuu	I
    //   353: iconst_2
    //   354: if_icmpne -74 -> 280
    //   357: new 64	com/tencent/mm/vfs/b
    //   360: dup
    //   361: aload_1
    //   362: getfield 54	com/tencent/mm/g/a/ji:cEE	Lcom/tencent/mm/g/a/ji$a;
    //   365: getfield 68	com/tencent/mm/g/a/ji$a:filePath	Ljava/lang/String;
    //   368: invokespecial 71	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   371: astore 4
    //   373: aload 4
    //   375: invokevirtual 75	com/tencent/mm/vfs/b:exists	()Z
    //   378: ifeq +57 -> 435
    //   381: iconst_1
    //   382: invokestatic 181	com/tencent/mm/plugin/websearch/api/aa:HV	(I)I
    //   385: istore 7
    //   387: aload_0
    //   388: getfield 13	com/tencent/mm/plugin/websearch/PluginWebSearch$5:tZc	Lcom/tencent/mm/plugin/websearch/PluginWebSearch;
    //   391: aload 4
    //   393: aload_1
    //   394: getfield 54	com/tencent/mm/g/a/ji:cEE	Lcom/tencent/mm/g/a/ji$a;
    //   397: getfield 62	com/tencent/mm/g/a/ji$a:cuu	I
    //   400: invokestatic 188	com/tencent/mm/plugin/websearch/PluginWebSearch:access$200	(Lcom/tencent/mm/plugin/websearch/PluginWebSearch;Lcom/tencent/mm/vfs/b;I)V
    //   403: ldc 77
    //   405: ldc 177
    //   407: iconst_2
    //   408: anewarray 81	java/lang/Object
    //   411: dup
    //   412: iconst_0
    //   413: iload 7
    //   415: invokestatic 184	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   418: aastore
    //   419: dup
    //   420: iconst_1
    //   421: iconst_1
    //   422: invokestatic 181	com/tencent/mm/plugin/websearch/api/aa:HV	(I)I
    //   425: invokestatic 184	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   428: aastore
    //   429: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   432: goto -152 -> 280
    //   435: ldc 77
    //   437: ldc 197
    //   439: invokestatic 200	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   442: goto -162 -> 280
    //   445: astore_1
    //   446: goto -122 -> 324
    //   449: astore 8
    //   451: goto -159 -> 292
    //   454: iconst_1
    //   455: istore 7
    //   457: goto -233 -> 224
    //
    // Exception table:
    //   from	to	target	type
    //   166	191	287	java/lang/Exception
    //   166	191	320	finally
    //   195	202	445	finally
    //   296	312	445	finally
    //   195	202	449	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.PluginWebSearch.5
 * JD-Core Version:    0.6.2
 */