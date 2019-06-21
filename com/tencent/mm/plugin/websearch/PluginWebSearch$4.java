package com.tencent.mm.plugin.websearch;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.bf;
import com.tencent.mm.sdk.b.c;

final class PluginWebSearch$4 extends c<bf>
{
  PluginWebSearch$4(PluginWebSearch paramPluginWebSearch)
  {
    AppMethodBeat.i(91308);
    this.xxI = bf.class.getName().hashCode();
    AppMethodBeat.o(91308);
  }

  // ERROR //
  private boolean a(bf parambf)
  {
    // Byte code:
    //   0: ldc 50
    //   2: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: ifnull +358 -> 364
    //   9: aload_1
    //   10: getfield 54	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   13: getfield 59	com/tencent/mm/g/a/bf$a:cut	I
    //   16: bipush 27
    //   18: if_icmpne +346 -> 364
    //   21: aload_1
    //   22: getfield 54	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   25: getfield 62	com/tencent/mm/g/a/bf$a:cuu	I
    //   28: iconst_2
    //   29: if_icmpne +21 -> 50
    //   32: invokestatic 66	com/tencent/mm/plugin/websearch/PluginWebSearch:checkTopStoryTemplateFolderValid	()Z
    //   35: ifne +15 -> 50
    //   38: aload_1
    //   39: getfield 54	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   42: getfield 62	com/tencent/mm/g/a/bf$a:cuu	I
    //   45: bipush 12
    //   47: invokestatic 70	com/tencent/mm/plugin/websearch/PluginWebSearch:access$100	(II)V
    //   50: aload_1
    //   51: getfield 54	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   54: getfield 62	com/tencent/mm/g/a/bf$a:cuu	I
    //   57: invokestatic 76	com/tencent/mm/plugin/websearch/api/aa:Ib	(I)Ljava/lang/String;
    //   60: astore_2
    //   61: aload_1
    //   62: getfield 54	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   65: getfield 62	com/tencent/mm/g/a/bf$a:cuu	I
    //   68: invokestatic 79	com/tencent/mm/plugin/websearch/api/aa:Ic	(I)Ljava/lang/String;
    //   71: astore_3
    //   72: aload_1
    //   73: getfield 54	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   76: getfield 62	com/tencent/mm/g/a/bf$a:cuu	I
    //   79: invokestatic 83	com/tencent/mm/plugin/websearch/api/aa:Id	(I)I
    //   82: istore 4
    //   84: aload_2
    //   85: invokestatic 89	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   88: ifne +276 -> 364
    //   91: aload_3
    //   92: invokestatic 89	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   95: ifne +269 -> 364
    //   98: new 91	com/tencent/mm/vfs/b
    //   101: dup
    //   102: aload_1
    //   103: getfield 54	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   106: getfield 95	com/tencent/mm/g/a/bf$a:filePath	Ljava/lang/String;
    //   109: invokespecial 98	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   112: astore 5
    //   114: aload 5
    //   116: invokevirtual 101	com/tencent/mm/vfs/b:exists	()Z
    //   119: ifeq +370 -> 489
    //   122: ldc 103
    //   124: ldc 105
    //   126: iconst_1
    //   127: anewarray 107	java/lang/Object
    //   130: dup
    //   131: iconst_0
    //   132: aload 5
    //   134: invokevirtual 111	com/tencent/mm/vfs/b:dME	()Lcom/tencent/mm/vfs/b;
    //   137: aastore
    //   138: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   141: new 91	com/tencent/mm/vfs/b
    //   144: dup
    //   145: aload_2
    //   146: ldc 118
    //   148: invokespecial 121	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   151: astore 6
    //   153: new 91	com/tencent/mm/vfs/b
    //   156: dup
    //   157: aload 6
    //   159: aload_3
    //   160: invokespecial 124	com/tencent/mm/vfs/b:<init>	(Lcom/tencent/mm/vfs/b;Ljava/lang/String;)V
    //   163: astore_3
    //   164: aload 6
    //   166: invokevirtual 127	com/tencent/mm/vfs/b:mkdirs	()Z
    //   169: pop
    //   170: aload 5
    //   172: invokevirtual 131	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   175: invokestatic 137	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   178: aload_3
    //   179: invokevirtual 131	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   182: invokestatic 137	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   185: invokestatic 143	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   188: pop2
    //   189: aload_3
    //   190: invokevirtual 131	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   193: invokestatic 137	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   196: aload 6
    //   198: invokevirtual 131	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   201: invokestatic 137	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   204: invokestatic 147	com/tencent/mm/sdk/platformtools/bo:hU	(Ljava/lang/String;Ljava/lang/String;)I
    //   207: istore 7
    //   209: iconst_1
    //   210: istore 8
    //   212: iload 7
    //   214: iflt +62 -> 276
    //   217: new 149	java/util/Properties
    //   220: dup
    //   221: invokespecial 150	java/util/Properties:<init>	()V
    //   224: astore 9
    //   226: new 152	com/tencent/mm/vfs/d
    //   229: astore_2
    //   230: new 91	com/tencent/mm/vfs/b
    //   233: astore_3
    //   234: aload_3
    //   235: aload 6
    //   237: ldc 154
    //   239: invokespecial 124	com/tencent/mm/vfs/b:<init>	(Lcom/tencent/mm/vfs/b;Ljava/lang/String;)V
    //   242: aload_2
    //   243: aload_3
    //   244: invokespecial 157	com/tencent/mm/vfs/d:<init>	(Lcom/tencent/mm/vfs/b;)V
    //   247: aload_2
    //   248: astore_3
    //   249: aload 9
    //   251: aload_2
    //   252: invokevirtual 161	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   255: aload_2
    //   256: invokestatic 165	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   259: aload 9
    //   261: ldc 167
    //   263: ldc 169
    //   265: invokevirtual 173	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   268: invokestatic 179	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   271: invokevirtual 182	java/lang/Integer:intValue	()I
    //   274: istore 8
    //   276: aload 6
    //   278: getfield 186	com/tencent/mm/vfs/b:mUri	Landroid/net/Uri;
    //   281: invokestatic 137	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   284: iconst_1
    //   285: invokestatic 190	com/tencent/mm/vfs/e:N	(Ljava/lang/String;Z)Z
    //   288: pop
    //   289: iload 4
    //   291: iload 8
    //   293: if_icmpge +121 -> 414
    //   296: aload_1
    //   297: getfield 54	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   300: getfield 62	com/tencent/mm/g/a/bf$a:cuu	I
    //   303: bipush 9
    //   305: invokestatic 70	com/tencent/mm/plugin/websearch/PluginWebSearch:access$100	(II)V
    //   308: ldc 103
    //   310: ldc 192
    //   312: iconst_3
    //   313: anewarray 107	java/lang/Object
    //   316: dup
    //   317: iconst_0
    //   318: aload_1
    //   319: getfield 54	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   322: getfield 62	com/tencent/mm/g/a/bf$a:cuu	I
    //   325: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   328: aastore
    //   329: dup
    //   330: iconst_1
    //   331: iload 4
    //   333: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   336: aastore
    //   337: dup
    //   338: iconst_2
    //   339: iload 8
    //   341: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   344: aastore
    //   345: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   348: aload_0
    //   349: getfield 13	com/tencent/mm/plugin/websearch/PluginWebSearch$4:tZc	Lcom/tencent/mm/plugin/websearch/PluginWebSearch;
    //   352: aload 5
    //   354: aload_1
    //   355: getfield 54	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   358: getfield 62	com/tencent/mm/g/a/bf$a:cuu	I
    //   361: invokestatic 199	com/tencent/mm/plugin/websearch/PluginWebSearch:access$200	(Lcom/tencent/mm/plugin/websearch/PluginWebSearch;Lcom/tencent/mm/vfs/b;I)V
    //   364: ldc 50
    //   366: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   369: iconst_0
    //   370: ireturn
    //   371: astore 10
    //   373: aconst_null
    //   374: astore_2
    //   375: aload_2
    //   376: astore_3
    //   377: ldc 103
    //   379: aload 10
    //   381: aload 10
    //   383: invokevirtual 202	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   386: iconst_0
    //   387: anewarray 107	java/lang/Object
    //   390: invokestatic 206	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   393: aload_2
    //   394: invokestatic 165	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   397: goto -138 -> 259
    //   400: astore_1
    //   401: aconst_null
    //   402: astore_3
    //   403: aload_3
    //   404: invokestatic 165	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   407: ldc 50
    //   409: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   412: aload_1
    //   413: athrow
    //   414: iload 7
    //   416: iflt +58 -> 474
    //   419: aload_1
    //   420: getfield 54	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   423: getfield 62	com/tencent/mm/g/a/bf$a:cuu	I
    //   426: bipush 13
    //   428: invokestatic 70	com/tencent/mm/plugin/websearch/PluginWebSearch:access$100	(II)V
    //   431: ldc 103
    //   433: ldc 208
    //   435: iconst_3
    //   436: anewarray 107	java/lang/Object
    //   439: dup
    //   440: iconst_0
    //   441: aload_1
    //   442: getfield 54	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   445: getfield 62	com/tencent/mm/g/a/bf$a:cuu	I
    //   448: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   451: aastore
    //   452: dup
    //   453: iconst_1
    //   454: iload 4
    //   456: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   459: aastore
    //   460: dup
    //   461: iconst_2
    //   462: iload 8
    //   464: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   467: aastore
    //   468: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   471: goto -107 -> 364
    //   474: aload_1
    //   475: getfield 54	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   478: getfield 62	com/tencent/mm/g/a/bf$a:cuu	I
    //   481: bipush 11
    //   483: invokestatic 70	com/tencent/mm/plugin/websearch/PluginWebSearch:access$100	(II)V
    //   486: goto -55 -> 431
    //   489: ldc 103
    //   491: ldc 210
    //   493: invokestatic 213	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   496: goto -132 -> 364
    //   499: astore_1
    //   500: goto -97 -> 403
    //   503: astore 10
    //   505: goto -130 -> 375
    //
    // Exception table:
    //   from	to	target	type
    //   226	247	371	java/lang/Exception
    //   226	247	400	finally
    //   249	255	499	finally
    //   377	393	499	finally
    //   249	255	503	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.PluginWebSearch.4
 * JD-Core Version:    0.6.2
 */