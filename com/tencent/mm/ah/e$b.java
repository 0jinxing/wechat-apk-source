package com.tencent.mm.ah;

import android.annotation.SuppressLint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.sdk.platformtools.bo;

@SuppressLint({"DefaultLocale"})
final class e$b
  implements az.a
{
  public boolean aAR;
  public String frH;
  String frI;
  private g.a frK;
  boolean frq;
  public h frs;

  public e$b(e parame, h paramh)
  {
    AppMethodBeat.i(77907);
    this.frs = null;
    this.frH = null;
    this.aAR = true;
    this.frq = false;
    this.frs = paramh;
    o.acd();
    this.frH = d.C(paramh.getUsername(), true);
    this.frI = (this.frH + ".tmp");
    this.frK = new g.a();
    AppMethodBeat.o(77907);
  }

  // ERROR //
  public final boolean acf()
  {
    // Byte code:
    //   0: ldc 92
    //   2: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 40	com/tencent/mm/ah/e$b:frs	Lcom/tencent/mm/ah/h;
    //   9: ifnonnull +12 -> 21
    //   12: ldc 92
    //   14: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   17: iconst_0
    //   18: istore_1
    //   19: iload_1
    //   20: ireturn
    //   21: aload_0
    //   22: getfield 40	com/tencent/mm/ah/e$b:frs	Lcom/tencent/mm/ah/h;
    //   25: invokevirtual 95	com/tencent/mm/ah/h:ack	()Ljava/lang/String;
    //   28: astore_2
    //   29: ldc 97
    //   31: invokestatic 103	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   34: checkcast 97	com/tencent/mm/plugin/emoji/b/c
    //   37: invokeinterface 106 1 0
    //   42: istore_1
    //   43: ldc 108
    //   45: invokestatic 103	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   48: checkcast 108	com/tencent/mm/plugin/expt/a/a
    //   51: getstatic 114	com/tencent/mm/plugin/expt/a/a$a:lJf	Lcom/tencent/mm/plugin/expt/a/a$a;
    //   54: iconst_0
    //   55: invokeinterface 118 3 0
    //   60: istore_3
    //   61: iload_1
    //   62: ifeq +887 -> 949
    //   65: iload_3
    //   66: ifeq +883 -> 949
    //   69: ldc 120
    //   71: ldc 122
    //   73: invokestatic 127	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   76: aload_2
    //   77: ldc 129
    //   79: invokevirtual 135	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   82: ifeq +225 -> 307
    //   85: new 66	java/lang/StringBuilder
    //   88: dup
    //   89: invokespecial 67	java/lang/StringBuilder:<init>	()V
    //   92: aload_2
    //   93: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: ldc 137
    //   98: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: invokevirtual 76	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   104: astore_2
    //   105: getstatic 143	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   108: ldc2_w 144
    //   111: ldc2_w 146
    //   114: lconst_1
    //   115: invokevirtual 151	com/tencent/mm/plugin/report/service/h:k	(JJJ)V
    //   118: ldc 153
    //   120: astore 4
    //   122: invokestatic 157	com/tencent/mm/kernel/g:RN	()Lcom/tencent/mm/kernel/a;
    //   125: invokevirtual 162	com/tencent/mm/kernel/a:QY	()Z
    //   128: ifeq +64 -> 192
    //   131: getstatic 168	com/tencent/mm/protocal/d:vxo	I
    //   134: istore 5
    //   136: invokestatic 157	com/tencent/mm/kernel/g:RN	()Lcom/tencent/mm/kernel/a;
    //   139: pop
    //   140: ldc 170
    //   142: iconst_4
    //   143: anewarray 4	java/lang/Object
    //   146: dup
    //   147: iconst_0
    //   148: iload 5
    //   150: invokestatic 176	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   153: aastore
    //   154: dup
    //   155: iconst_1
    //   156: invokestatic 180	com/tencent/mm/kernel/a:QF	()I
    //   159: invokestatic 186	com/tencent/mm/a/p:getString	(I)Ljava/lang/String;
    //   162: aastore
    //   163: dup
    //   164: iconst_2
    //   165: invokestatic 192	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   168: invokestatic 198	com/tencent/mm/sdk/platformtools/at:getNetTypeForStat	(Landroid/content/Context;)I
    //   171: invokestatic 176	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   174: aastore
    //   175: dup
    //   176: iconst_3
    //   177: invokestatic 192	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   180: invokestatic 201	com/tencent/mm/sdk/platformtools/at:getStrength	(Landroid/content/Context;)I
    //   183: invokestatic 176	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   186: aastore
    //   187: invokestatic 205	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   190: astore 4
    //   192: ldc 120
    //   194: ldc 207
    //   196: iconst_3
    //   197: anewarray 4	java/lang/Object
    //   200: dup
    //   201: iconst_0
    //   202: aload_0
    //   203: getfield 40	com/tencent/mm/ah/e$b:frs	Lcom/tencent/mm/ah/h;
    //   206: invokevirtual 58	com/tencent/mm/ah/h:getUsername	()Ljava/lang/String;
    //   209: aastore
    //   210: dup
    //   211: iconst_1
    //   212: aload 4
    //   214: aastore
    //   215: dup
    //   216: iconst_2
    //   217: aload_2
    //   218: aastore
    //   219: invokestatic 211	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   222: aload_0
    //   223: iconst_1
    //   224: putfield 44	com/tencent/mm/ah/e$b:aAR	Z
    //   227: aload_2
    //   228: aconst_null
    //   229: invokestatic 216	com/tencent/mm/network/b:a	(Ljava/lang/String;Lcom/tencent/mm/network/b$b;)Lcom/tencent/mm/network/u;
    //   232: astore 6
    //   234: aload 6
    //   236: ldc 218
    //   238: invokevirtual 224	com/tencent/mm/network/u:setRequestMethod	(Ljava/lang/String;)V
    //   241: aload 6
    //   243: ldc 226
    //   245: aload 4
    //   247: invokevirtual 229	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   250: aload 6
    //   252: sipush 5000
    //   255: invokevirtual 232	com/tencent/mm/network/u:setConnectTimeout	(I)V
    //   258: aload 6
    //   260: sipush 5000
    //   263: invokevirtual 235	com/tencent/mm/network/u:setReadTimeout	(I)V
    //   266: aload 6
    //   268: invokestatic 238	com/tencent/mm/network/b:a	(Lcom/tencent/mm/network/u;)I
    //   271: ifeq +101 -> 372
    //   274: ldc 120
    //   276: ldc 240
    //   278: iconst_1
    //   279: anewarray 4	java/lang/Object
    //   282: dup
    //   283: iconst_0
    //   284: aload_2
    //   285: aastore
    //   286: invokestatic 243	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   289: aload 6
    //   291: getfield 247	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   294: invokevirtual 252	java/net/HttpURLConnection:disconnect	()V
    //   297: ldc 92
    //   299: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   302: iconst_1
    //   303: istore_1
    //   304: goto -285 -> 19
    //   307: new 66	java/lang/StringBuilder
    //   310: dup
    //   311: invokespecial 67	java/lang/StringBuilder:<init>	()V
    //   314: aload_2
    //   315: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   318: ldc 254
    //   320: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   323: invokevirtual 76	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   326: astore_2
    //   327: goto -222 -> 105
    //   330: astore_2
    //   331: ldc 120
    //   333: ldc_w 256
    //   336: iconst_1
    //   337: anewarray 4	java/lang/Object
    //   340: dup
    //   341: iconst_0
    //   342: aload_2
    //   343: invokestatic 262	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   346: aastore
    //   347: invokestatic 243	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   350: ldc 120
    //   352: ldc_w 264
    //   355: iconst_1
    //   356: anewarray 4	java/lang/Object
    //   359: dup
    //   360: iconst_0
    //   361: aload_2
    //   362: invokevirtual 267	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   365: aastore
    //   366: invokestatic 243	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   369: goto -72 -> 297
    //   372: aload 6
    //   374: ldc_w 269
    //   377: iconst_0
    //   378: invokevirtual 273	com/tencent/mm/network/u:getHeaderFieldInt	(Ljava/lang/String;I)I
    //   381: iconst_1
    //   382: if_icmpne +66 -> 448
    //   385: iconst_1
    //   386: istore_1
    //   387: aload_0
    //   388: iload_1
    //   389: putfield 46	com/tencent/mm/ah/e$b:frq	Z
    //   392: aload 6
    //   394: invokevirtual 277	com/tencent/mm/network/u:getInputStream	()Ljava/io/InputStream;
    //   397: astore 7
    //   399: aload 7
    //   401: ifnonnull +94 -> 495
    //   404: ldc 120
    //   406: ldc_w 279
    //   409: iconst_1
    //   410: anewarray 4	java/lang/Object
    //   413: dup
    //   414: iconst_0
    //   415: aload_2
    //   416: aastore
    //   417: invokestatic 211	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   420: aload 6
    //   422: getfield 247	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   425: invokevirtual 252	java/net/HttpURLConnection:disconnect	()V
    //   428: aload 7
    //   430: ifnull +8 -> 438
    //   433: aload 7
    //   435: invokevirtual 284	java/io/InputStream:close	()V
    //   438: ldc 92
    //   440: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   443: iconst_1
    //   444: istore_1
    //   445: goto -426 -> 19
    //   448: iconst_0
    //   449: istore_1
    //   450: goto -63 -> 387
    //   453: astore_2
    //   454: ldc 120
    //   456: ldc_w 256
    //   459: iconst_1
    //   460: anewarray 4	java/lang/Object
    //   463: dup
    //   464: iconst_0
    //   465: aload_2
    //   466: invokestatic 262	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   469: aastore
    //   470: invokestatic 243	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   473: ldc 120
    //   475: ldc_w 264
    //   478: iconst_1
    //   479: anewarray 4	java/lang/Object
    //   482: dup
    //   483: iconst_0
    //   484: aload_2
    //   485: invokevirtual 267	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   488: aastore
    //   489: invokestatic 243	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   492: goto -54 -> 438
    //   495: sipush 1024
    //   498: newarray byte
    //   500: astore_2
    //   501: aload_0
    //   502: getfield 78	com/tencent/mm/ah/e$b:frI	Ljava/lang/String;
    //   505: iconst_0
    //   506: invokestatic 290	com/tencent/mm/vfs/e:L	(Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   509: astore 4
    //   511: iconst_0
    //   512: istore 5
    //   514: aload 7
    //   516: aload_2
    //   517: invokevirtual 294	java/io/InputStream:read	([B)I
    //   520: istore 8
    //   522: iload 8
    //   524: iconst_m1
    //   525: if_icmpeq +22 -> 547
    //   528: aload 4
    //   530: aload_2
    //   531: iconst_0
    //   532: iload 8
    //   534: invokevirtual 300	java/io/OutputStream:write	([BII)V
    //   537: iload 5
    //   539: iload 8
    //   541: iadd
    //   542: istore 5
    //   544: goto -30 -> 514
    //   547: iload 5
    //   549: aload 6
    //   551: ldc_w 302
    //   554: aload 6
    //   556: getfield 247	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   559: invokevirtual 305	java/net/HttpURLConnection:getContentLength	()I
    //   562: invokevirtual 273	com/tencent/mm/network/u:getHeaderFieldInt	(Ljava/lang/String;I)I
    //   565: if_icmpne +46 -> 611
    //   568: aload_0
    //   569: iconst_0
    //   570: putfield 44	com/tencent/mm/ah/e$b:aAR	Z
    //   573: aload 6
    //   575: getfield 247	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   578: invokevirtual 252	java/net/HttpURLConnection:disconnect	()V
    //   581: aload 7
    //   583: ifnull +8 -> 591
    //   586: aload 7
    //   588: invokevirtual 284	java/io/InputStream:close	()V
    //   591: aload 4
    //   593: ifnull +8 -> 601
    //   596: aload 4
    //   598: invokevirtual 306	java/io/OutputStream:close	()V
    //   601: ldc 92
    //   603: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   606: iconst_1
    //   607: istore_1
    //   608: goto -589 -> 19
    //   611: ldc 120
    //   613: ldc_w 308
    //   616: iconst_3
    //   617: anewarray 4	java/lang/Object
    //   620: dup
    //   621: iconst_0
    //   622: iload 5
    //   624: invokestatic 176	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   627: aastore
    //   628: dup
    //   629: iconst_1
    //   630: aload 6
    //   632: ldc_w 302
    //   635: invokevirtual 312	com/tencent/mm/network/u:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   638: aastore
    //   639: dup
    //   640: iconst_2
    //   641: aload 6
    //   643: getfield 247	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   646: invokevirtual 305	java/net/HttpURLConnection:getContentLength	()I
    //   649: invokestatic 176	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   652: aastore
    //   653: invokestatic 243	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   656: goto -83 -> 573
    //   659: astore_2
    //   660: ldc 120
    //   662: ldc_w 256
    //   665: iconst_1
    //   666: anewarray 4	java/lang/Object
    //   669: dup
    //   670: iconst_0
    //   671: aload_2
    //   672: invokestatic 262	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   675: aastore
    //   676: invokestatic 243	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   679: aload 6
    //   681: ifnull +11 -> 692
    //   684: aload 6
    //   686: getfield 247	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   689: invokevirtual 252	java/net/HttpURLConnection:disconnect	()V
    //   692: aload 7
    //   694: ifnull +8 -> 702
    //   697: aload 7
    //   699: invokevirtual 284	java/io/InputStream:close	()V
    //   702: aload 4
    //   704: ifnull -103 -> 601
    //   707: aload 4
    //   709: invokevirtual 306	java/io/OutputStream:close	()V
    //   712: goto -111 -> 601
    //   715: astore_2
    //   716: ldc 120
    //   718: ldc_w 256
    //   721: iconst_1
    //   722: anewarray 4	java/lang/Object
    //   725: dup
    //   726: iconst_0
    //   727: aload_2
    //   728: invokestatic 262	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   731: aastore
    //   732: invokestatic 243	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   735: ldc 120
    //   737: ldc_w 264
    //   740: iconst_1
    //   741: anewarray 4	java/lang/Object
    //   744: dup
    //   745: iconst_0
    //   746: aload_2
    //   747: invokevirtual 267	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   750: aastore
    //   751: invokestatic 243	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   754: goto -153 -> 601
    //   757: astore_2
    //   758: ldc 120
    //   760: ldc_w 256
    //   763: iconst_1
    //   764: anewarray 4	java/lang/Object
    //   767: dup
    //   768: iconst_0
    //   769: aload_2
    //   770: invokestatic 262	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   773: aastore
    //   774: invokestatic 243	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   777: ldc 120
    //   779: ldc_w 264
    //   782: iconst_1
    //   783: anewarray 4	java/lang/Object
    //   786: dup
    //   787: iconst_0
    //   788: aload_2
    //   789: invokevirtual 267	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   792: aastore
    //   793: invokestatic 243	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   796: goto -195 -> 601
    //   799: astore_2
    //   800: aconst_null
    //   801: astore 7
    //   803: aconst_null
    //   804: astore 4
    //   806: aconst_null
    //   807: astore 6
    //   809: aload 6
    //   811: ifnull +11 -> 822
    //   814: aload 6
    //   816: getfield 247	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   819: invokevirtual 252	java/net/HttpURLConnection:disconnect	()V
    //   822: aload 7
    //   824: ifnull +8 -> 832
    //   827: aload 7
    //   829: invokevirtual 284	java/io/InputStream:close	()V
    //   832: aload 4
    //   834: ifnull +8 -> 842
    //   837: aload 4
    //   839: invokevirtual 306	java/io/OutputStream:close	()V
    //   842: ldc 92
    //   844: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   847: aload_2
    //   848: athrow
    //   849: astore 4
    //   851: ldc 120
    //   853: ldc_w 256
    //   856: iconst_1
    //   857: anewarray 4	java/lang/Object
    //   860: dup
    //   861: iconst_0
    //   862: aload 4
    //   864: invokestatic 262	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   867: aastore
    //   868: invokestatic 243	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   871: ldc 120
    //   873: ldc_w 264
    //   876: iconst_1
    //   877: anewarray 4	java/lang/Object
    //   880: dup
    //   881: iconst_0
    //   882: aload 4
    //   884: invokevirtual 267	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   887: aastore
    //   888: invokestatic 243	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   891: goto -49 -> 842
    //   894: astore_2
    //   895: aconst_null
    //   896: astore 7
    //   898: aconst_null
    //   899: astore 4
    //   901: goto -92 -> 809
    //   904: astore_2
    //   905: aconst_null
    //   906: astore 4
    //   908: goto -99 -> 809
    //   911: astore_2
    //   912: goto -103 -> 809
    //   915: astore_2
    //   916: goto -107 -> 809
    //   919: astore_2
    //   920: aconst_null
    //   921: astore 7
    //   923: aconst_null
    //   924: astore 4
    //   926: aconst_null
    //   927: astore 6
    //   929: goto -269 -> 660
    //   932: astore_2
    //   933: aconst_null
    //   934: astore 7
    //   936: aconst_null
    //   937: astore 4
    //   939: goto -279 -> 660
    //   942: astore_2
    //   943: aconst_null
    //   944: astore 4
    //   946: goto -286 -> 660
    //   949: goto -831 -> 118
    //
    // Exception table:
    //   from	to	target	type
    //   289	297	330	java/lang/Exception
    //   420	428	453	java/lang/Exception
    //   433	438	453	java/lang/Exception
    //   514	522	659	java/lang/Exception
    //   528	537	659	java/lang/Exception
    //   547	573	659	java/lang/Exception
    //   611	656	659	java/lang/Exception
    //   684	692	715	java/lang/Exception
    //   697	702	715	java/lang/Exception
    //   707	712	715	java/lang/Exception
    //   573	581	757	java/lang/Exception
    //   586	591	757	java/lang/Exception
    //   596	601	757	java/lang/Exception
    //   227	234	799	finally
    //   814	822	849	java/lang/Exception
    //   827	832	849	java/lang/Exception
    //   837	842	849	java/lang/Exception
    //   234	289	894	finally
    //   372	385	894	finally
    //   387	399	894	finally
    //   404	420	904	finally
    //   495	511	904	finally
    //   514	522	911	finally
    //   528	537	911	finally
    //   547	573	911	finally
    //   611	656	911	finally
    //   660	679	915	finally
    //   227	234	919	java/lang/Exception
    //   234	289	932	java/lang/Exception
    //   372	385	932	java/lang/Exception
    //   387	399	932	java/lang/Exception
    //   404	420	942	java/lang/Exception
    //   495	511	942	java/lang/Exception
  }

  public final boolean acg()
  {
    boolean bool = false;
    AppMethodBeat.i(77909);
    if (this.frJ.frF)
      AppMethodBeat.o(77909);
    while (true)
    {
      return bool;
      if ((this.aAR) || (bo.isNullOrNil(this.frH)))
      {
        this.frJ.frD.cr(4, -1);
        AppMethodBeat.o(77909);
      }
      else
      {
        ab.d("MicroMsg.GetHDHeadImgHelper", "dkavatar user:" + this.frs.getUsername() + " urltime:" + this.frK.Mr());
        if (ao.a.flv != null)
          ao.a.flv.cm((int)com.tencent.mm.vfs.e.asZ(this.frI), 0);
        this.frJ.frG.e(new e.a(this.frJ, this.frJ.fro, this.frH, this.frI));
        bool = true;
        AppMethodBeat.o(77909);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.e.b
 * JD-Core Version:    0.6.2
 */