package com.tencent.mm.plugin.traceroute.b;

import java.util.Set;

final class a$a
  implements Runnable
{
  private String ip;
  private Set<Integer> sIC;

  public a$a(String paramString, Set<Integer> paramSet)
  {
    this.ip = paramSet;
    Object localObject;
    this.sIC = localObject;
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: sipush 25972
    //   3: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 45
    //   8: iconst_1
    //   9: anewarray 4	java/lang/Object
    //   12: dup
    //   13: iconst_0
    //   14: aload_0
    //   15: getfield 25	com/tencent/mm/plugin/traceroute/b/a$a:ip	Ljava/lang/String;
    //   18: aastore
    //   19: invokestatic 51	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   22: astore_1
    //   23: aload_0
    //   24: getfield 20	com/tencent/mm/plugin/traceroute/b/a$a:sID	Lcom/tencent/mm/plugin/traceroute/b/a;
    //   27: aload_0
    //   28: getfield 25	com/tencent/mm/plugin/traceroute/b/a$a:ip	Ljava/lang/String;
    //   31: aload_1
    //   32: iconst_1
    //   33: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   36: invokevirtual 60	com/tencent/mm/plugin/traceroute/b/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    //   39: aload_0
    //   40: getfield 27	com/tencent/mm/plugin/traceroute/b/a$a:sIC	Ljava/util/Set;
    //   43: invokeinterface 66 1 0
    //   48: astore_2
    //   49: aload_2
    //   50: invokeinterface 72 1 0
    //   55: ifeq +746 -> 801
    //   58: aload_2
    //   59: invokeinterface 76 1 0
    //   64: checkcast 53	java/lang/Integer
    //   67: astore_1
    //   68: aload_0
    //   69: getfield 20	com/tencent/mm/plugin/traceroute/b/a$a:sID	Lcom/tencent/mm/plugin/traceroute/b/a;
    //   72: astore_3
    //   73: aload_0
    //   74: getfield 25	com/tencent/mm/plugin/traceroute/b/a$a:ip	Ljava/lang/String;
    //   77: astore 4
    //   79: aload_1
    //   80: invokevirtual 80	java/lang/Integer:intValue	()I
    //   83: istore 5
    //   85: new 82	java/net/Socket
    //   88: astore 6
    //   90: aload 6
    //   92: invokespecial 83	java/net/Socket:<init>	()V
    //   95: aload 6
    //   97: astore_1
    //   98: aload 6
    //   100: sipush 5000
    //   103: invokevirtual 86	java/net/Socket:setSoTimeout	(I)V
    //   106: aload 6
    //   108: astore_1
    //   109: invokestatic 92	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   112: lstore 7
    //   114: aload 6
    //   116: astore_1
    //   117: new 94	java/net/InetSocketAddress
    //   120: astore 9
    //   122: aload 6
    //   124: astore_1
    //   125: aload 9
    //   127: aload 4
    //   129: iload 5
    //   131: invokespecial 97	java/net/InetSocketAddress:<init>	(Ljava/lang/String;I)V
    //   134: aload 6
    //   136: astore_1
    //   137: aload 6
    //   139: aload 9
    //   141: invokevirtual 101	java/net/Socket:connect	(Ljava/net/SocketAddress;)V
    //   144: aload 6
    //   146: astore_1
    //   147: invokestatic 92	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   150: lstore 10
    //   152: aload 6
    //   154: astore_1
    //   155: new 103	java/lang/StringBuilder
    //   158: astore 9
    //   160: aload 6
    //   162: astore_1
    //   163: aload 9
    //   165: ldc 105
    //   167: invokespecial 108	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   170: aload 6
    //   172: astore_1
    //   173: ldc 110
    //   175: aload 9
    //   177: aload 4
    //   179: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   182: ldc 116
    //   184: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: iload 5
    //   189: invokevirtual 119	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   192: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   195: invokestatic 128	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   198: aload 6
    //   200: astore_1
    //   201: aload_3
    //   202: aload 4
    //   204: ldc 130
    //   206: iconst_2
    //   207: anewarray 4	java/lang/Object
    //   210: dup
    //   211: iconst_0
    //   212: iload 5
    //   214: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   217: aastore
    //   218: dup
    //   219: iconst_1
    //   220: lload 10
    //   222: lload 7
    //   224: lsub
    //   225: invokestatic 135	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   228: aastore
    //   229: invokestatic 51	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   232: iconst_1
    //   233: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   236: invokevirtual 60	com/tencent/mm/plugin/traceroute/b/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    //   239: aload 6
    //   241: invokevirtual 138	java/net/Socket:close	()V
    //   244: goto -195 -> 49
    //   247: astore_1
    //   248: ldc 110
    //   250: new 103	java/lang/StringBuilder
    //   253: dup
    //   254: ldc 140
    //   256: invokespecial 108	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   259: aload_1
    //   260: invokevirtual 143	java/io/IOException:getMessage	()Ljava/lang/String;
    //   263: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   269: invokestatic 146	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   272: ldc 110
    //   274: aload_1
    //   275: ldc 148
    //   277: iconst_0
    //   278: anewarray 4	java/lang/Object
    //   281: invokestatic 152	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   284: goto -235 -> 49
    //   287: astore 9
    //   289: aconst_null
    //   290: astore 6
    //   292: aload 6
    //   294: astore_1
    //   295: aload_3
    //   296: aload 4
    //   298: ldc 154
    //   300: iconst_2
    //   301: anewarray 4	java/lang/Object
    //   304: dup
    //   305: iconst_0
    //   306: iload 5
    //   308: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   311: aastore
    //   312: dup
    //   313: iconst_1
    //   314: aload 9
    //   316: invokevirtual 155	java/net/UnknownHostException:toString	()Ljava/lang/String;
    //   319: aastore
    //   320: invokestatic 51	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   323: iconst_1
    //   324: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   327: invokevirtual 60	com/tencent/mm/plugin/traceroute/b/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    //   330: aload 6
    //   332: astore_1
    //   333: new 103	java/lang/StringBuilder
    //   336: astore 4
    //   338: aload 6
    //   340: astore_1
    //   341: aload 4
    //   343: ldc 157
    //   345: invokespecial 108	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   348: aload 6
    //   350: astore_1
    //   351: ldc 110
    //   353: aload 4
    //   355: aload 9
    //   357: invokevirtual 158	java/net/UnknownHostException:getMessage	()Ljava/lang/String;
    //   360: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   363: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   366: invokestatic 146	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   369: aload 6
    //   371: astore_1
    //   372: ldc 110
    //   374: aload 9
    //   376: ldc 148
    //   378: iconst_0
    //   379: anewarray 4	java/lang/Object
    //   382: invokestatic 152	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   385: aload 6
    //   387: ifnull -338 -> 49
    //   390: aload 6
    //   392: invokevirtual 138	java/net/Socket:close	()V
    //   395: goto -346 -> 49
    //   398: astore_1
    //   399: ldc 110
    //   401: new 103	java/lang/StringBuilder
    //   404: dup
    //   405: ldc 140
    //   407: invokespecial 108	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   410: aload_1
    //   411: invokevirtual 143	java/io/IOException:getMessage	()Ljava/lang/String;
    //   414: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   417: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   420: invokestatic 146	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   423: ldc 110
    //   425: aload_1
    //   426: ldc 148
    //   428: iconst_0
    //   429: anewarray 4	java/lang/Object
    //   432: invokestatic 152	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   435: goto -386 -> 49
    //   438: astore 9
    //   440: aconst_null
    //   441: astore 6
    //   443: aload 6
    //   445: astore_1
    //   446: aload_3
    //   447: aload 4
    //   449: ldc 160
    //   451: iconst_2
    //   452: anewarray 4	java/lang/Object
    //   455: dup
    //   456: iconst_0
    //   457: iload 5
    //   459: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   462: aastore
    //   463: dup
    //   464: iconst_1
    //   465: aload 9
    //   467: invokevirtual 161	java/io/IOException:toString	()Ljava/lang/String;
    //   470: aastore
    //   471: invokestatic 51	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   474: iconst_1
    //   475: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   478: invokevirtual 60	com/tencent/mm/plugin/traceroute/b/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    //   481: aload 6
    //   483: astore_1
    //   484: new 103	java/lang/StringBuilder
    //   487: astore 4
    //   489: aload 6
    //   491: astore_1
    //   492: aload 4
    //   494: ldc 163
    //   496: invokespecial 108	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   499: aload 6
    //   501: astore_1
    //   502: ldc 110
    //   504: aload 4
    //   506: aload 9
    //   508: invokevirtual 143	java/io/IOException:getMessage	()Ljava/lang/String;
    //   511: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   514: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   517: invokestatic 146	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   520: aload 6
    //   522: astore_1
    //   523: ldc 110
    //   525: aload 9
    //   527: ldc 148
    //   529: iconst_0
    //   530: anewarray 4	java/lang/Object
    //   533: invokestatic 152	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   536: aload 6
    //   538: ifnull -489 -> 49
    //   541: aload 6
    //   543: invokevirtual 138	java/net/Socket:close	()V
    //   546: goto -497 -> 49
    //   549: astore_1
    //   550: ldc 110
    //   552: new 103	java/lang/StringBuilder
    //   555: dup
    //   556: ldc 140
    //   558: invokespecial 108	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   561: aload_1
    //   562: invokevirtual 143	java/io/IOException:getMessage	()Ljava/lang/String;
    //   565: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   568: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   571: invokestatic 146	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   574: ldc 110
    //   576: aload_1
    //   577: ldc 148
    //   579: iconst_0
    //   580: anewarray 4	java/lang/Object
    //   583: invokestatic 152	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   586: goto -537 -> 49
    //   589: astore 9
    //   591: aconst_null
    //   592: astore 6
    //   594: aload 6
    //   596: astore_1
    //   597: aload_3
    //   598: aload 4
    //   600: ldc 165
    //   602: iconst_2
    //   603: anewarray 4	java/lang/Object
    //   606: dup
    //   607: iconst_0
    //   608: iload 5
    //   610: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   613: aastore
    //   614: dup
    //   615: iconst_1
    //   616: aload 9
    //   618: invokevirtual 166	java/lang/Exception:toString	()Ljava/lang/String;
    //   621: aastore
    //   622: invokestatic 51	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   625: iconst_1
    //   626: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   629: invokevirtual 60	com/tencent/mm/plugin/traceroute/b/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    //   632: aload 6
    //   634: astore_1
    //   635: new 103	java/lang/StringBuilder
    //   638: astore 4
    //   640: aload 6
    //   642: astore_1
    //   643: aload 4
    //   645: ldc 163
    //   647: invokespecial 108	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   650: aload 6
    //   652: astore_1
    //   653: ldc 110
    //   655: aload 4
    //   657: aload 9
    //   659: invokevirtual 166	java/lang/Exception:toString	()Ljava/lang/String;
    //   662: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   665: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   668: invokestatic 146	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   671: aload 6
    //   673: astore_1
    //   674: ldc 110
    //   676: aload 9
    //   678: ldc 148
    //   680: iconst_0
    //   681: anewarray 4	java/lang/Object
    //   684: invokestatic 152	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   687: aload 6
    //   689: ifnull -640 -> 49
    //   692: aload 6
    //   694: invokevirtual 138	java/net/Socket:close	()V
    //   697: goto -648 -> 49
    //   700: astore_1
    //   701: ldc 110
    //   703: new 103	java/lang/StringBuilder
    //   706: dup
    //   707: ldc 140
    //   709: invokespecial 108	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   712: aload_1
    //   713: invokevirtual 143	java/io/IOException:getMessage	()Ljava/lang/String;
    //   716: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   719: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   722: invokestatic 146	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   725: ldc 110
    //   727: aload_1
    //   728: ldc 148
    //   730: iconst_0
    //   731: anewarray 4	java/lang/Object
    //   734: invokestatic 152	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   737: goto -688 -> 49
    //   740: astore 6
    //   742: aconst_null
    //   743: astore_1
    //   744: aload_1
    //   745: ifnull +7 -> 752
    //   748: aload_1
    //   749: invokevirtual 138	java/net/Socket:close	()V
    //   752: sipush 25972
    //   755: invokestatic 169	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   758: aload 6
    //   760: athrow
    //   761: astore_1
    //   762: ldc 110
    //   764: new 103	java/lang/StringBuilder
    //   767: dup
    //   768: ldc 140
    //   770: invokespecial 108	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   773: aload_1
    //   774: invokevirtual 143	java/io/IOException:getMessage	()Ljava/lang/String;
    //   777: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   780: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   783: invokestatic 146	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   786: ldc 110
    //   788: aload_1
    //   789: ldc 148
    //   791: iconst_0
    //   792: anewarray 4	java/lang/Object
    //   795: invokestatic 152	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   798: goto -46 -> 752
    //   801: aload_0
    //   802: getfield 20	com/tencent/mm/plugin/traceroute/b/a$a:sID	Lcom/tencent/mm/plugin/traceroute/b/a;
    //   805: aload_0
    //   806: getfield 25	com/tencent/mm/plugin/traceroute/b/a$a:ip	Ljava/lang/String;
    //   809: ldc 171
    //   811: iconst_1
    //   812: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   815: invokevirtual 60	com/tencent/mm/plugin/traceroute/b/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    //   818: sipush 25972
    //   821: invokestatic 169	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   824: return
    //   825: astore 6
    //   827: goto -83 -> 744
    //   830: astore 9
    //   832: goto -238 -> 594
    //   835: astore 9
    //   837: goto -394 -> 443
    //   840: astore 9
    //   842: goto -550 -> 292
    //
    // Exception table:
    //   from	to	target	type
    //   239	244	247	java/io/IOException
    //   85	95	287	java/net/UnknownHostException
    //   390	395	398	java/io/IOException
    //   85	95	438	java/io/IOException
    //   541	546	549	java/io/IOException
    //   85	95	589	java/lang/Exception
    //   692	697	700	java/io/IOException
    //   85	95	740	finally
    //   748	752	761	java/io/IOException
    //   98	106	825	finally
    //   109	114	825	finally
    //   117	122	825	finally
    //   125	134	825	finally
    //   137	144	825	finally
    //   147	152	825	finally
    //   155	160	825	finally
    //   163	170	825	finally
    //   173	198	825	finally
    //   201	239	825	finally
    //   295	330	825	finally
    //   333	338	825	finally
    //   341	348	825	finally
    //   351	369	825	finally
    //   372	385	825	finally
    //   446	481	825	finally
    //   484	489	825	finally
    //   492	499	825	finally
    //   502	520	825	finally
    //   523	536	825	finally
    //   597	632	825	finally
    //   635	640	825	finally
    //   643	650	825	finally
    //   653	671	825	finally
    //   674	687	825	finally
    //   98	106	830	java/lang/Exception
    //   109	114	830	java/lang/Exception
    //   117	122	830	java/lang/Exception
    //   125	134	830	java/lang/Exception
    //   137	144	830	java/lang/Exception
    //   147	152	830	java/lang/Exception
    //   155	160	830	java/lang/Exception
    //   163	170	830	java/lang/Exception
    //   173	198	830	java/lang/Exception
    //   201	239	830	java/lang/Exception
    //   98	106	835	java/io/IOException
    //   109	114	835	java/io/IOException
    //   117	122	835	java/io/IOException
    //   125	134	835	java/io/IOException
    //   137	144	835	java/io/IOException
    //   147	152	835	java/io/IOException
    //   155	160	835	java/io/IOException
    //   163	170	835	java/io/IOException
    //   173	198	835	java/io/IOException
    //   201	239	835	java/io/IOException
    //   98	106	840	java/net/UnknownHostException
    //   109	114	840	java/net/UnknownHostException
    //   117	122	840	java/net/UnknownHostException
    //   125	134	840	java/net/UnknownHostException
    //   137	144	840	java/net/UnknownHostException
    //   147	152	840	java/net/UnknownHostException
    //   155	160	840	java/net/UnknownHostException
    //   163	170	840	java/net/UnknownHostException
    //   173	198	840	java/net/UnknownHostException
    //   201	239	840	java/net/UnknownHostException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.b.a.a
 * JD-Core Version:    0.6.2
 */