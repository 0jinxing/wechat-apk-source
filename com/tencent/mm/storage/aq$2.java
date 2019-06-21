package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class aq$2
  implements Runnable
{
  aq$2(aq paramaq)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: ldc 24
    //   2: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 36	java/lang/System:currentTimeMillis	()J
    //   8: lstore_1
    //   9: aload_0
    //   10: getfield 17	com/tencent/mm/storage/aq$2:xXU	Lcom/tencent/mm/storage/aq;
    //   13: astore_3
    //   14: aload_3
    //   15: invokevirtual 39	com/tencent/mm/storage/aq:clear	()V
    //   18: aconst_null
    //   19: astore 4
    //   21: aconst_null
    //   22: astore 5
    //   24: ldc 41
    //   26: invokestatic 47	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   29: checkcast 41	com/tencent/mm/plugin/emoji/b/d
    //   32: invokeinterface 51 1 0
    //   37: getfield 57	com/tencent/mm/storage/at:xYx	Lcom/tencent/mm/storage/emotion/f;
    //   40: invokevirtual 63	com/tencent/mm/storage/emotion/f:baR	()Landroid/database/Cursor;
    //   43: astore 6
    //   45: aload 6
    //   47: ifnull +282 -> 329
    //   50: aload 6
    //   52: astore 5
    //   54: aload 6
    //   56: astore 4
    //   58: aload 6
    //   60: invokeinterface 69 1 0
    //   65: ifeq +264 -> 329
    //   68: aload 6
    //   70: astore 5
    //   72: aload 6
    //   74: astore 4
    //   76: aload 6
    //   78: invokeinterface 73 1 0
    //   83: istore 7
    //   85: iconst_0
    //   86: istore 8
    //   88: iload 8
    //   90: iload 7
    //   92: if_icmpge +237 -> 329
    //   95: aload 6
    //   97: astore 5
    //   99: aload 6
    //   101: astore 4
    //   103: new 75	com/tencent/mm/storage/emotion/e
    //   106: astore 9
    //   108: aload 6
    //   110: astore 5
    //   112: aload 6
    //   114: astore 4
    //   116: aload 9
    //   118: invokespecial 76	com/tencent/mm/storage/emotion/e:<init>	()V
    //   121: aload 6
    //   123: astore 5
    //   125: aload 6
    //   127: astore 4
    //   129: aload 9
    //   131: aload 6
    //   133: invokevirtual 80	com/tencent/mm/storage/emotion/e:d	(Landroid/database/Cursor;)V
    //   136: aload 6
    //   138: astore 5
    //   140: aload 6
    //   142: astore 4
    //   144: aload 9
    //   146: getfield 84	com/tencent/mm/storage/emotion/e:field_desc	Ljava/lang/String;
    //   149: astore 10
    //   151: aload 6
    //   153: astore 5
    //   155: aload 6
    //   157: astore 4
    //   159: aload 10
    //   161: invokestatic 90	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   164: ifne +143 -> 307
    //   167: aload 6
    //   169: astore 5
    //   171: aload 6
    //   173: astore 4
    //   175: aload 10
    //   177: invokevirtual 96	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   180: astore 10
    //   182: aload 6
    //   184: astore 5
    //   186: aload 6
    //   188: astore 4
    //   190: aload_3
    //   191: getfield 100	com/tencent/mm/storage/aq:xXR	Ljava/util/HashMap;
    //   194: aload 10
    //   196: aload 9
    //   198: getfield 103	com/tencent/mm/storage/emotion/e:field_groupID	Ljava/lang/String;
    //   201: invokevirtual 109	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   204: pop
    //   205: aload 6
    //   207: astore 5
    //   209: aload 6
    //   211: astore 4
    //   213: aload_3
    //   214: getfield 112	com/tencent/mm/storage/aq:xXQ	Ljava/util/HashMap;
    //   217: aload 9
    //   219: getfield 103	com/tencent/mm/storage/emotion/e:field_groupID	Ljava/lang/String;
    //   222: invokevirtual 116	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   225: checkcast 118	java/util/ArrayList
    //   228: astore 11
    //   230: aload 11
    //   232: astore 10
    //   234: aload 11
    //   236: ifnonnull +29 -> 265
    //   239: aload 6
    //   241: astore 5
    //   243: aload 6
    //   245: astore 4
    //   247: new 118	java/util/ArrayList
    //   250: astore 10
    //   252: aload 6
    //   254: astore 5
    //   256: aload 6
    //   258: astore 4
    //   260: aload 10
    //   262: invokespecial 119	java/util/ArrayList:<init>	()V
    //   265: aload 6
    //   267: astore 5
    //   269: aload 6
    //   271: astore 4
    //   273: aload 10
    //   275: aload 9
    //   277: getfield 84	com/tencent/mm/storage/emotion/e:field_desc	Ljava/lang/String;
    //   280: invokevirtual 123	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   283: pop
    //   284: aload 6
    //   286: astore 5
    //   288: aload 6
    //   290: astore 4
    //   292: aload_3
    //   293: getfield 112	com/tencent/mm/storage/aq:xXQ	Ljava/util/HashMap;
    //   296: aload 9
    //   298: getfield 103	com/tencent/mm/storage/emotion/e:field_groupID	Ljava/lang/String;
    //   301: aload 10
    //   303: invokevirtual 109	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   306: pop
    //   307: aload 6
    //   309: astore 5
    //   311: aload 6
    //   313: astore 4
    //   315: aload 6
    //   317: invokeinterface 126 1 0
    //   322: pop
    //   323: iinc 8 1
    //   326: goto -238 -> 88
    //   329: aload 6
    //   331: ifnull +10 -> 341
    //   334: aload 6
    //   336: invokeinterface 129 1 0
    //   341: invokestatic 134	com/tencent/mm/sdk/platformtools/aa:dor	()Ljava/lang/String;
    //   344: invokevirtual 96	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   347: astore 9
    //   349: aload_3
    //   350: aload 9
    //   352: putfield 137	com/tencent/mm/storage/aq:xXM	Ljava/lang/String;
    //   355: aconst_null
    //   356: astore 10
    //   358: aconst_null
    //   359: astore 6
    //   361: aload 6
    //   363: astore 5
    //   365: aload 10
    //   367: astore 4
    //   369: invokestatic 36	java/lang/System:currentTimeMillis	()J
    //   372: lstore 12
    //   374: aload 6
    //   376: astore 5
    //   378: aload 10
    //   380: astore 4
    //   382: ldc 41
    //   384: invokestatic 47	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   387: checkcast 41	com/tencent/mm/plugin/emoji/b/d
    //   390: invokeinterface 51 1 0
    //   395: getfield 141	com/tencent/mm/storage/at:xYp	Lcom/tencent/mm/storage/emotion/c;
    //   398: ldc 143
    //   400: iconst_0
    //   401: anewarray 92	java/lang/String
    //   404: invokevirtual 149	com/tencent/mm/storage/emotion/c:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   407: astore 6
    //   409: aload 6
    //   411: astore 5
    //   413: aload 6
    //   415: astore 4
    //   417: new 151	java/lang/StringBuilder
    //   420: astore 10
    //   422: aload 6
    //   424: astore 5
    //   426: aload 6
    //   428: astore 4
    //   430: aload 10
    //   432: invokespecial 152	java/lang/StringBuilder:<init>	()V
    //   435: aload 6
    //   437: astore 5
    //   439: aload 6
    //   441: astore 4
    //   443: ldc 154
    //   445: ldc 156
    //   447: iconst_1
    //   448: anewarray 4	java/lang/Object
    //   451: dup
    //   452: iconst_0
    //   453: aload 10
    //   455: invokestatic 36	java/lang/System:currentTimeMillis	()J
    //   458: lload 12
    //   460: lsub
    //   461: invokevirtual 160	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   464: invokevirtual 163	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   467: aastore
    //   468: invokestatic 168	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   471: aload 6
    //   473: ifnull +640 -> 1113
    //   476: aload 6
    //   478: astore 5
    //   480: aload 6
    //   482: astore 4
    //   484: aload 6
    //   486: invokeinterface 69 1 0
    //   491: ifeq +622 -> 1113
    //   494: aload 6
    //   496: astore 5
    //   498: aload 6
    //   500: astore 4
    //   502: aload 6
    //   504: invokeinterface 69 1 0
    //   509: pop
    //   510: aload 6
    //   512: astore 5
    //   514: aload 6
    //   516: astore 4
    //   518: aload 6
    //   520: invokeinterface 73 1 0
    //   525: istore 7
    //   527: iconst_0
    //   528: istore 8
    //   530: iload 8
    //   532: iload 7
    //   534: if_icmpge +579 -> 1113
    //   537: aload 6
    //   539: astore 5
    //   541: aload 6
    //   543: astore 4
    //   545: aload 6
    //   547: aload 6
    //   549: ldc 170
    //   551: invokeinterface 174 2 0
    //   556: invokeinterface 178 2 0
    //   561: astore 10
    //   563: aload 6
    //   565: astore 5
    //   567: aload 6
    //   569: astore 4
    //   571: aload 6
    //   573: aload 6
    //   575: ldc 180
    //   577: invokeinterface 174 2 0
    //   582: invokeinterface 178 2 0
    //   587: astore 14
    //   589: aload 6
    //   591: astore 5
    //   593: aload 6
    //   595: astore 4
    //   597: aload 6
    //   599: aload 6
    //   601: ldc 182
    //   603: invokeinterface 174 2 0
    //   608: invokeinterface 178 2 0
    //   613: astore 11
    //   615: aload 6
    //   617: astore 5
    //   619: aload 6
    //   621: astore 4
    //   623: aload 6
    //   625: aload 6
    //   627: ldc 184
    //   629: invokeinterface 174 2 0
    //   634: invokeinterface 188 2 0
    //   639: istore 15
    //   641: aload 6
    //   643: astore 5
    //   645: aload 6
    //   647: astore 4
    //   649: aload 10
    //   651: invokestatic 90	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   654: ifne +214 -> 868
    //   657: aload 6
    //   659: astore 5
    //   661: aload 6
    //   663: astore 4
    //   665: aload 11
    //   667: invokestatic 90	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   670: ifne +198 -> 868
    //   673: aload 6
    //   675: astore 5
    //   677: aload 6
    //   679: astore 4
    //   681: aload 11
    //   683: aload 9
    //   685: invokevirtual 191	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   688: ifne +21 -> 709
    //   691: aload 6
    //   693: astore 5
    //   695: aload 6
    //   697: astore 4
    //   699: aload 11
    //   701: ldc 193
    //   703: invokevirtual 191	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   706: ifeq +162 -> 868
    //   709: aload 6
    //   711: astore 5
    //   713: aload 6
    //   715: astore 4
    //   717: aload 10
    //   719: invokevirtual 96	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   722: astore 16
    //   724: aload 6
    //   726: astore 5
    //   728: aload 6
    //   730: astore 4
    //   732: aload_3
    //   733: getfield 196	com/tencent/mm/storage/aq:xXS	Ljava/util/HashMap;
    //   736: aload 16
    //   738: invokevirtual 199	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   741: ifeq +202 -> 943
    //   744: aload 6
    //   746: astore 5
    //   748: aload 6
    //   750: astore 4
    //   752: aload_3
    //   753: getfield 196	com/tencent/mm/storage/aq:xXS	Ljava/util/HashMap;
    //   756: aload 16
    //   758: invokevirtual 116	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   761: checkcast 118	java/util/ArrayList
    //   764: astore 11
    //   766: aload 11
    //   768: astore 10
    //   770: aload 11
    //   772: ifnonnull +29 -> 801
    //   775: aload 6
    //   777: astore 5
    //   779: aload 6
    //   781: astore 4
    //   783: new 118	java/util/ArrayList
    //   786: astore 10
    //   788: aload 6
    //   790: astore 5
    //   792: aload 6
    //   794: astore 4
    //   796: aload 10
    //   798: invokespecial 119	java/util/ArrayList:<init>	()V
    //   801: aload 6
    //   803: astore 5
    //   805: aload 6
    //   807: astore 4
    //   809: new 201	com/tencent/mm/storage/aq$a
    //   812: astore 11
    //   814: aload 6
    //   816: astore 5
    //   818: aload 6
    //   820: astore 4
    //   822: aload 11
    //   824: aload_3
    //   825: aload 14
    //   827: iload 15
    //   829: invokespecial 204	com/tencent/mm/storage/aq$a:<init>	(Lcom/tencent/mm/storage/aq;Ljava/lang/String;I)V
    //   832: aload 6
    //   834: astore 5
    //   836: aload 6
    //   838: astore 4
    //   840: aload 10
    //   842: aload 11
    //   844: invokevirtual 123	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   847: pop
    //   848: aload 6
    //   850: astore 5
    //   852: aload 6
    //   854: astore 4
    //   856: aload_3
    //   857: getfield 207	com/tencent/mm/storage/aq:xXP	Ljava/util/HashMap;
    //   860: aload 14
    //   862: aload 16
    //   864: invokevirtual 109	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   867: pop
    //   868: aload 6
    //   870: astore 5
    //   872: aload 6
    //   874: astore 4
    //   876: aload 6
    //   878: invokeinterface 126 1 0
    //   883: pop
    //   884: iinc 8 1
    //   887: goto -357 -> 530
    //   890: astore 6
    //   892: aload 5
    //   894: astore 4
    //   896: ldc 154
    //   898: aload 6
    //   900: invokestatic 211	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   903: invokestatic 215	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   906: aload 5
    //   908: ifnull -567 -> 341
    //   911: aload 5
    //   913: invokeinterface 129 1 0
    //   918: goto -577 -> 341
    //   921: astore 5
    //   923: aload 4
    //   925: ifnull +10 -> 935
    //   928: aload 4
    //   930: invokeinterface 129 1 0
    //   935: ldc 24
    //   937: invokestatic 218	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   940: aload 5
    //   942: athrow
    //   943: aload 6
    //   945: astore 5
    //   947: aload 6
    //   949: astore 4
    //   951: new 118	java/util/ArrayList
    //   954: astore 11
    //   956: aload 6
    //   958: astore 5
    //   960: aload 6
    //   962: astore 4
    //   964: aload 11
    //   966: invokespecial 119	java/util/ArrayList:<init>	()V
    //   969: aload 6
    //   971: astore 5
    //   973: aload 6
    //   975: astore 4
    //   977: new 201	com/tencent/mm/storage/aq$a
    //   980: astore 10
    //   982: aload 6
    //   984: astore 5
    //   986: aload 6
    //   988: astore 4
    //   990: aload 10
    //   992: aload_3
    //   993: aload 14
    //   995: iload 15
    //   997: invokespecial 204	com/tencent/mm/storage/aq$a:<init>	(Lcom/tencent/mm/storage/aq;Ljava/lang/String;I)V
    //   1000: aload 6
    //   1002: astore 5
    //   1004: aload 6
    //   1006: astore 4
    //   1008: aload 11
    //   1010: aload 10
    //   1012: invokevirtual 123	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1015: pop
    //   1016: aload 6
    //   1018: astore 5
    //   1020: aload 6
    //   1022: astore 4
    //   1024: aload_3
    //   1025: getfield 196	com/tencent/mm/storage/aq:xXS	Ljava/util/HashMap;
    //   1028: aload 16
    //   1030: aload 11
    //   1032: invokevirtual 109	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1035: pop
    //   1036: goto -188 -> 848
    //   1039: astore 6
    //   1041: aload 5
    //   1043: astore 4
    //   1045: ldc 154
    //   1047: aload 6
    //   1049: invokestatic 211	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1052: invokestatic 221	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1055: aload 5
    //   1057: ifnull +10 -> 1067
    //   1060: aload 5
    //   1062: invokeinterface 129 1 0
    //   1067: aload_0
    //   1068: getfield 17	com/tencent/mm/storage/aq$2:xXU	Lcom/tencent/mm/storage/aq;
    //   1071: iconst_1
    //   1072: putfield 225	com/tencent/mm/storage/aq:mInit	Z
    //   1075: ldc 154
    //   1077: ldc 227
    //   1079: iconst_1
    //   1080: anewarray 4	java/lang/Object
    //   1083: dup
    //   1084: iconst_0
    //   1085: new 151	java/lang/StringBuilder
    //   1088: dup
    //   1089: invokespecial 152	java/lang/StringBuilder:<init>	()V
    //   1092: invokestatic 36	java/lang/System:currentTimeMillis	()J
    //   1095: lload_1
    //   1096: lsub
    //   1097: invokevirtual 160	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1100: invokevirtual 163	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1103: aastore
    //   1104: invokestatic 168	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1107: ldc 24
    //   1109: invokestatic 218	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1112: return
    //   1113: aload 6
    //   1115: ifnull -48 -> 1067
    //   1118: aload 6
    //   1120: invokeinterface 129 1 0
    //   1125: goto -58 -> 1067
    //   1128: astore 5
    //   1130: aload 4
    //   1132: ifnull +10 -> 1142
    //   1135: aload 4
    //   1137: invokeinterface 129 1 0
    //   1142: ldc 24
    //   1144: invokestatic 218	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1147: aload 5
    //   1149: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   24	45	890	java/lang/Exception
    //   58	68	890	java/lang/Exception
    //   76	85	890	java/lang/Exception
    //   103	108	890	java/lang/Exception
    //   116	121	890	java/lang/Exception
    //   129	136	890	java/lang/Exception
    //   144	151	890	java/lang/Exception
    //   159	167	890	java/lang/Exception
    //   175	182	890	java/lang/Exception
    //   190	205	890	java/lang/Exception
    //   213	230	890	java/lang/Exception
    //   247	252	890	java/lang/Exception
    //   260	265	890	java/lang/Exception
    //   273	284	890	java/lang/Exception
    //   292	307	890	java/lang/Exception
    //   315	323	890	java/lang/Exception
    //   24	45	921	finally
    //   58	68	921	finally
    //   76	85	921	finally
    //   103	108	921	finally
    //   116	121	921	finally
    //   129	136	921	finally
    //   144	151	921	finally
    //   159	167	921	finally
    //   175	182	921	finally
    //   190	205	921	finally
    //   213	230	921	finally
    //   247	252	921	finally
    //   260	265	921	finally
    //   273	284	921	finally
    //   292	307	921	finally
    //   315	323	921	finally
    //   896	906	921	finally
    //   369	374	1039	java/lang/Exception
    //   382	409	1039	java/lang/Exception
    //   417	422	1039	java/lang/Exception
    //   430	435	1039	java/lang/Exception
    //   443	471	1039	java/lang/Exception
    //   484	494	1039	java/lang/Exception
    //   502	510	1039	java/lang/Exception
    //   518	527	1039	java/lang/Exception
    //   545	563	1039	java/lang/Exception
    //   571	589	1039	java/lang/Exception
    //   597	615	1039	java/lang/Exception
    //   623	641	1039	java/lang/Exception
    //   649	657	1039	java/lang/Exception
    //   665	673	1039	java/lang/Exception
    //   681	691	1039	java/lang/Exception
    //   699	709	1039	java/lang/Exception
    //   717	724	1039	java/lang/Exception
    //   732	744	1039	java/lang/Exception
    //   752	766	1039	java/lang/Exception
    //   783	788	1039	java/lang/Exception
    //   796	801	1039	java/lang/Exception
    //   809	814	1039	java/lang/Exception
    //   822	832	1039	java/lang/Exception
    //   840	848	1039	java/lang/Exception
    //   856	868	1039	java/lang/Exception
    //   876	884	1039	java/lang/Exception
    //   951	956	1039	java/lang/Exception
    //   964	969	1039	java/lang/Exception
    //   977	982	1039	java/lang/Exception
    //   990	1000	1039	java/lang/Exception
    //   1008	1016	1039	java/lang/Exception
    //   1024	1036	1039	java/lang/Exception
    //   369	374	1128	finally
    //   382	409	1128	finally
    //   417	422	1128	finally
    //   430	435	1128	finally
    //   443	471	1128	finally
    //   484	494	1128	finally
    //   502	510	1128	finally
    //   518	527	1128	finally
    //   545	563	1128	finally
    //   571	589	1128	finally
    //   597	615	1128	finally
    //   623	641	1128	finally
    //   649	657	1128	finally
    //   665	673	1128	finally
    //   681	691	1128	finally
    //   699	709	1128	finally
    //   717	724	1128	finally
    //   732	744	1128	finally
    //   752	766	1128	finally
    //   783	788	1128	finally
    //   796	801	1128	finally
    //   809	814	1128	finally
    //   822	832	1128	finally
    //   840	848	1128	finally
    //   856	868	1128	finally
    //   876	884	1128	finally
    //   951	956	1128	finally
    //   964	969	1128	finally
    //   977	982	1128	finally
    //   990	1000	1128	finally
    //   1008	1016	1128	finally
    //   1024	1036	1128	finally
    //   1045	1055	1128	finally
  }

  public final String toString()
  {
    AppMethodBeat.i(62702);
    String str = super.toString() + "|newinit";
    AppMethodBeat.o(62702);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.aq.2
 * JD-Core Version:    0.6.2
 */