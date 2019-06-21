package com.tencent.mm.plugin.dbbackup;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.c;

final class d$3
  implements Runnable
{
  final String[] kIR;

  d$3(d paramd, c paramc, String paramString, b paramb)
  {
    AppMethodBeat.i(18971);
    this.kIR = new String[] { "message", "ImgInfo2", "videoinfo2", "EmojiInfo", "conversation", "rconversation" };
    AppMethodBeat.o(18971);
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: sipush 18972
    //   3: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   10: aconst_null
    //   11: invokestatic 67	com/tencent/mm/plugin/dbbackup/d:a	(Lcom/tencent/mm/plugin/dbbackup/d;Lcom/tencent/wcdb/repair/RepairKit;)Lcom/tencent/wcdb/repair/RepairKit;
    //   14: pop
    //   15: invokestatic 73	com/tencent/mm/model/c:XO	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/h;
    //   18: pop
    //   19: invokestatic 77	com/tencent/mm/model/c:XR	()Lcom/tencent/mm/storage/be;
    //   22: pop
    //   23: invokestatic 83	com/tencent/mm/at/o:ahl	()Lcom/tencent/mm/at/g;
    //   26: pop
    //   27: invokestatic 89	com/tencent/mm/modelvideo/o:all	()Lcom/tencent/mm/modelvideo/t;
    //   30: pop
    //   31: new 91	java/lang/StringBuilder
    //   34: astore_1
    //   35: aload_1
    //   36: invokespecial 92	java/lang/StringBuilder:<init>	()V
    //   39: aload_1
    //   40: invokestatic 98	com/tencent/mm/compatible/e/q:LK	()Ljava/lang/String;
    //   43: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: invokestatic 106	com/tencent/mm/model/c:QF	()I
    //   49: invokevirtual 109	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   52: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: invokevirtual 116	java/lang/String:getBytes	()[B
    //   58: astore_1
    //   59: aload_1
    //   60: invokestatic 122	com/tencent/mm/a/g:y	([B)[B
    //   63: astore_2
    //   64: aload_1
    //   65: invokestatic 126	com/tencent/mm/a/g:x	([B)Ljava/lang/String;
    //   68: iconst_0
    //   69: bipush 7
    //   71: invokevirtual 130	java/lang/String:substring	(II)Ljava/lang/String;
    //   74: invokevirtual 116	java/lang/String:getBytes	()[B
    //   77: astore_3
    //   78: ldc 131
    //   80: istore 4
    //   82: invokestatic 137	com/tencent/mm/cd/f:dvt	()Z
    //   85: ifeq +7 -> 92
    //   88: ldc 138
    //   90: istore 4
    //   92: invokestatic 142	com/tencent/mm/model/c:Ru	()Lcom/tencent/mm/cd/h;
    //   95: invokevirtual 148	com/tencent/mm/cd/h:dvx	()Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   98: invokevirtual 153	com/tencent/wcdb/database/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   101: aload_3
    //   102: invokestatic 157	com/tencent/mm/plugin/dbbackup/d:bhT	()Lcom/tencent/wcdb/database/SQLiteCipherSpec;
    //   105: aconst_null
    //   106: iload 4
    //   108: aconst_null
    //   109: iconst_0
    //   110: invokestatic 161	com/tencent/wcdb/database/SQLiteDatabase:openDatabase	(Ljava/lang/String;[BLcom/tencent/wcdb/database/SQLiteCipherSpec;Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;ILcom/tencent/wcdb/DatabaseErrorHandler;I)Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   113: astore 5
    //   115: invokestatic 167	java/lang/System:nanoTime	()J
    //   118: lstore 6
    //   120: new 91	java/lang/StringBuilder
    //   123: astore_1
    //   124: aload_1
    //   125: invokespecial 92	java/lang/StringBuilder:<init>	()V
    //   128: aload_1
    //   129: aload_0
    //   130: getfield 29	com/tencent/mm/plugin/dbbackup/d$3:kIS	Ljava/lang/String;
    //   133: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: ldc 169
    //   138: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   144: astore 8
    //   146: new 91	java/lang/StringBuilder
    //   149: astore_1
    //   150: aload_1
    //   151: invokespecial 92	java/lang/StringBuilder:<init>	()V
    //   154: invokestatic 175	com/tencent/mm/kernel/g:RQ	()Lcom/tencent/mm/kernel/g;
    //   157: pop
    //   158: aload_1
    //   159: invokestatic 179	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   162: getfield 184	com/tencent/mm/kernel/e:eJM	Ljava/lang/String;
    //   165: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: ldc 186
    //   170: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   176: astore 9
    //   178: iconst_0
    //   179: istore 4
    //   181: aconst_null
    //   182: astore_1
    //   183: aload_1
    //   184: astore 10
    //   186: iload 4
    //   188: iconst_2
    //   189: if_icmpge +59 -> 248
    //   192: iconst_2
    //   193: anewarray 42	java/lang/String
    //   196: dup
    //   197: iconst_0
    //   198: aload 8
    //   200: aastore
    //   201: dup
    //   202: iconst_1
    //   203: aload 9
    //   205: aastore
    //   206: iload 4
    //   208: aaload
    //   209: astore 11
    //   211: aload_1
    //   212: astore 12
    //   214: aload 11
    //   216: aload_2
    //   217: aload_0
    //   218: getfield 56	com/tencent/mm/plugin/dbbackup/d$3:kIR	[Ljava/lang/String;
    //   221: invokestatic 192	com/tencent/wcdb/repair/RepairKit$MasterInfo:load	(Ljava/lang/String;[B[Ljava/lang/String;)Lcom/tencent/wcdb/repair/RepairKit$MasterInfo;
    //   224: astore 10
    //   226: aload 10
    //   228: astore 12
    //   230: aload 10
    //   232: astore_1
    //   233: ldc 194
    //   235: ldc 196
    //   237: aload 11
    //   239: invokestatic 200	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   242: invokevirtual 204	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   245: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   248: aload 10
    //   250: ifnonnull +444 -> 694
    //   253: aload 10
    //   255: astore 11
    //   257: aload 10
    //   259: astore_1
    //   260: aload_0
    //   261: getfield 56	com/tencent/mm/plugin/dbbackup/d$3:kIR	[Ljava/lang/String;
    //   264: invokestatic 213	com/tencent/wcdb/repair/RepairKit$MasterInfo:make	([Ljava/lang/String;)Lcom/tencent/wcdb/repair/RepairKit$MasterInfo;
    //   267: astore 12
    //   269: aload 12
    //   271: astore 11
    //   273: aload 12
    //   275: astore_1
    //   276: ldc 194
    //   278: ldc 215
    //   280: invokestatic 218	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   283: aload 12
    //   285: astore 11
    //   287: aload 12
    //   289: astore_1
    //   290: getstatic 224	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   293: ldc2_w 225
    //   296: ldc2_w 227
    //   299: lconst_1
    //   300: iconst_1
    //   301: invokevirtual 231	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   304: aload 12
    //   306: astore 11
    //   308: aload 12
    //   310: astore_1
    //   311: aload_0
    //   312: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   315: astore 10
    //   317: aload 12
    //   319: astore 11
    //   321: aload 12
    //   323: astore_1
    //   324: new 233	com/tencent/wcdb/repair/RepairKit
    //   327: astore_2
    //   328: aload 12
    //   330: astore 11
    //   332: aload 12
    //   334: astore_1
    //   335: aload_2
    //   336: aload_0
    //   337: getfield 29	com/tencent/mm/plugin/dbbackup/d$3:kIS	Ljava/lang/String;
    //   340: aload_3
    //   341: invokestatic 157	com/tencent/mm/plugin/dbbackup/d:bhT	()Lcom/tencent/wcdb/database/SQLiteCipherSpec;
    //   344: aload 12
    //   346: invokespecial 236	com/tencent/wcdb/repair/RepairKit:<init>	(Ljava/lang/String;[BLcom/tencent/wcdb/database/SQLiteCipherSpec;Lcom/tencent/wcdb/repair/RepairKit$MasterInfo;)V
    //   349: aload 12
    //   351: astore 11
    //   353: aload 12
    //   355: astore_1
    //   356: aload 10
    //   358: aload_2
    //   359: invokestatic 67	com/tencent/mm/plugin/dbbackup/d:a	(Lcom/tencent/mm/plugin/dbbackup/d;Lcom/tencent/wcdb/repair/RepairKit;)Lcom/tencent/wcdb/repair/RepairKit;
    //   362: pop
    //   363: aload 12
    //   365: astore 11
    //   367: aload 12
    //   369: astore_1
    //   370: aload_0
    //   371: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   374: invokestatic 240	com/tencent/mm/plugin/dbbackup/d:e	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RepairKit;
    //   377: aload 5
    //   379: iconst_1
    //   380: invokevirtual 244	com/tencent/wcdb/repair/RepairKit:output	(Lcom/tencent/wcdb/database/SQLiteDatabase;I)I
    //   383: ifne +536 -> 919
    //   386: iconst_1
    //   387: istore 4
    //   389: aload 12
    //   391: astore 11
    //   393: aload 12
    //   395: astore_1
    //   396: aload_0
    //   397: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   400: invokestatic 240	com/tencent/mm/plugin/dbbackup/d:e	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RepairKit;
    //   403: invokevirtual 247	com/tencent/wcdb/repair/RepairKit:isHeaderCorrupted	()Z
    //   406: ifeq +23 -> 429
    //   409: aload 12
    //   411: astore 11
    //   413: aload 12
    //   415: astore_1
    //   416: aload_0
    //   417: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   420: invokestatic 240	com/tencent/mm/plugin/dbbackup/d:e	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RepairKit;
    //   423: invokevirtual 250	com/tencent/wcdb/repair/RepairKit:isDataCorrupted	()Z
    //   426: ifne +499 -> 925
    //   429: iconst_1
    //   430: istore 13
    //   432: iload 4
    //   434: iload 13
    //   436: iand
    //   437: istore 4
    //   439: aload 12
    //   441: astore 11
    //   443: aload 12
    //   445: astore_1
    //   446: aload 5
    //   448: invokevirtual 253	com/tencent/wcdb/database/SQLiteDatabase:close	()V
    //   451: aconst_null
    //   452: astore 10
    //   454: aload 12
    //   456: invokevirtual 256	com/tencent/wcdb/repair/RepairKit$MasterInfo:release	()V
    //   459: aconst_null
    //   460: astore 11
    //   462: aconst_null
    //   463: astore 12
    //   465: aload_0
    //   466: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   469: invokestatic 240	com/tencent/mm/plugin/dbbackup/d:e	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RepairKit;
    //   472: invokevirtual 257	com/tencent/wcdb/repair/RepairKit:release	()V
    //   475: aload_0
    //   476: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   479: aconst_null
    //   480: invokestatic 67	com/tencent/mm/plugin/dbbackup/d:a	(Lcom/tencent/mm/plugin/dbbackup/d;Lcom/tencent/wcdb/repair/RepairKit;)Lcom/tencent/wcdb/repair/RepairKit;
    //   483: pop
    //   484: invokestatic 260	com/tencent/mm/plugin/dbbackup/d:bhR	()V
    //   487: invokestatic 167	java/lang/System:nanoTime	()J
    //   490: lstore 14
    //   492: iload 4
    //   494: ifeq +437 -> 931
    //   497: ldc_w 262
    //   500: astore_1
    //   501: ldc 194
    //   503: ldc_w 264
    //   506: iconst_2
    //   507: anewarray 4	java/lang/Object
    //   510: dup
    //   511: iconst_0
    //   512: aload_1
    //   513: aastore
    //   514: dup
    //   515: iconst_1
    //   516: lload 14
    //   518: lload 6
    //   520: lsub
    //   521: l2f
    //   522: ldc_w 265
    //   525: fdiv
    //   526: invokestatic 270	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   529: aastore
    //   530: invokestatic 273	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   533: iload 4
    //   535: ifeq +403 -> 938
    //   538: bipush 26
    //   540: istore 13
    //   542: iload 13
    //   544: istore 4
    //   546: aload_0
    //   547: getfield 31	com/tencent/mm/plugin/dbbackup/d$3:kIC	Lcom/tencent/mm/plugin/dbbackup/b;
    //   550: ifnull +17 -> 567
    //   553: aload_0
    //   554: getfield 31	com/tencent/mm/plugin/dbbackup/d$3:kIC	Lcom/tencent/mm/plugin/dbbackup/b;
    //   557: iconst_0
    //   558: invokeinterface 278 2 0
    //   563: iload 13
    //   565: istore 4
    //   567: getstatic 224	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   570: ldc2_w 225
    //   573: iload 4
    //   575: i2l
    //   576: lconst_1
    //   577: iconst_1
    //   578: invokevirtual 231	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   581: aload_0
    //   582: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   585: invokestatic 240	com/tencent/mm/plugin/dbbackup/d:e	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RepairKit;
    //   588: ifnull +22 -> 610
    //   591: aload_0
    //   592: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   595: invokestatic 240	com/tencent/mm/plugin/dbbackup/d:e	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RepairKit;
    //   598: invokevirtual 257	com/tencent/wcdb/repair/RepairKit:release	()V
    //   601: aload_0
    //   602: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   605: aconst_null
    //   606: invokestatic 67	com/tencent/mm/plugin/dbbackup/d:a	(Lcom/tencent/mm/plugin/dbbackup/d;Lcom/tencent/wcdb/repair/RepairKit;)Lcom/tencent/wcdb/repair/RepairKit;
    //   609: pop
    //   610: aload_0
    //   611: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   614: invokestatic 282	com/tencent/mm/plugin/dbbackup/d:c	(Lcom/tencent/mm/plugin/dbbackup/d;)Z
    //   617: pop
    //   618: invokestatic 288	com/tencent/mm/model/aw:RS	()Lcom/tencent/mm/sdk/platformtools/al;
    //   621: invokevirtual 293	com/tencent/mm/sdk/platformtools/al:doM	()V
    //   624: sipush 18972
    //   627: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   630: return
    //   631: astore 16
    //   633: aload 12
    //   635: astore 11
    //   637: aload 12
    //   639: astore_1
    //   640: new 91	java/lang/StringBuilder
    //   643: astore 10
    //   645: aload 12
    //   647: astore 11
    //   649: aload 12
    //   651: astore_1
    //   652: aload 10
    //   654: ldc_w 295
    //   657: invokespecial 298	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   660: aload 12
    //   662: astore 11
    //   664: aload 12
    //   666: astore_1
    //   667: ldc 194
    //   669: aload 10
    //   671: aload 16
    //   673: invokevirtual 301	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   676: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   679: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   682: invokestatic 303	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   685: iinc 4 1
    //   688: aload 12
    //   690: astore_1
    //   691: goto -508 -> 183
    //   694: aload 10
    //   696: astore 12
    //   698: iload 4
    //   700: ifle -396 -> 304
    //   703: aload 10
    //   705: astore 11
    //   707: aload 10
    //   709: astore_1
    //   710: ldc 194
    //   712: ldc_w 305
    //   715: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   718: aload 10
    //   720: astore 11
    //   722: aload 10
    //   724: astore_1
    //   725: getstatic 224	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   728: ldc2_w 225
    //   731: ldc2_w 306
    //   734: lconst_1
    //   735: iconst_1
    //   736: invokevirtual 231	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   739: aload 10
    //   741: astore 12
    //   743: goto -439 -> 304
    //   746: astore 10
    //   748: aload 5
    //   750: astore_1
    //   751: aload 11
    //   753: astore 12
    //   755: aload 10
    //   757: astore 11
    //   759: ldc 194
    //   761: aload 11
    //   763: ldc_w 309
    //   766: iconst_1
    //   767: anewarray 4	java/lang/Object
    //   770: dup
    //   771: iconst_0
    //   772: aload_0
    //   773: getfield 29	com/tencent/mm/plugin/dbbackup/d$3:kIS	Ljava/lang/String;
    //   776: aastore
    //   777: invokestatic 313	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   780: aload_0
    //   781: getfield 31	com/tencent/mm/plugin/dbbackup/d$3:kIC	Lcom/tencent/mm/plugin/dbbackup/b;
    //   784: ifnull +13 -> 797
    //   787: aload_0
    //   788: getfield 31	com/tencent/mm/plugin/dbbackup/d$3:kIC	Lcom/tencent/mm/plugin/dbbackup/b;
    //   791: iconst_m1
    //   792: invokeinterface 278 2 0
    //   797: getstatic 224	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   800: astore 11
    //   802: new 91	java/lang/StringBuilder
    //   805: astore 10
    //   807: aload 10
    //   809: ldc_w 315
    //   812: invokespecial 298	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   815: aload 11
    //   817: ldc_w 317
    //   820: aload 10
    //   822: invokestatic 320	com/tencent/wcdb/repair/RepairKit:lastError	()Ljava/lang/String;
    //   825: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   828: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   831: aconst_null
    //   832: invokevirtual 324	com/tencent/mm/plugin/report/service/h:g	(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    //   835: getstatic 224	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   838: ldc2_w 225
    //   841: ldc2_w 325
    //   844: lconst_1
    //   845: iconst_1
    //   846: invokevirtual 231	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   849: aload_0
    //   850: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   853: invokestatic 240	com/tencent/mm/plugin/dbbackup/d:e	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RepairKit;
    //   856: ifnull +22 -> 878
    //   859: aload_0
    //   860: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   863: invokestatic 240	com/tencent/mm/plugin/dbbackup/d:e	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RepairKit;
    //   866: invokevirtual 257	com/tencent/wcdb/repair/RepairKit:release	()V
    //   869: aload_0
    //   870: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   873: aconst_null
    //   874: invokestatic 67	com/tencent/mm/plugin/dbbackup/d:a	(Lcom/tencent/mm/plugin/dbbackup/d;Lcom/tencent/wcdb/repair/RepairKit;)Lcom/tencent/wcdb/repair/RepairKit;
    //   877: pop
    //   878: aload_1
    //   879: ifnull +7 -> 886
    //   882: aload_1
    //   883: invokevirtual 253	com/tencent/wcdb/database/SQLiteDatabase:close	()V
    //   886: aload 12
    //   888: ifnull +8 -> 896
    //   891: aload 12
    //   893: invokevirtual 256	com/tencent/wcdb/repair/RepairKit$MasterInfo:release	()V
    //   896: aload_0
    //   897: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   900: invokestatic 282	com/tencent/mm/plugin/dbbackup/d:c	(Lcom/tencent/mm/plugin/dbbackup/d;)Z
    //   903: pop
    //   904: invokestatic 288	com/tencent/mm/model/aw:RS	()Lcom/tencent/mm/sdk/platformtools/al;
    //   907: invokevirtual 293	com/tencent/mm/sdk/platformtools/al:doM	()V
    //   910: sipush 18972
    //   913: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   916: goto -286 -> 630
    //   919: iconst_0
    //   920: istore 4
    //   922: goto -533 -> 389
    //   925: iconst_0
    //   926: istore 13
    //   928: goto -496 -> 432
    //   931: ldc_w 328
    //   934: astore_1
    //   935: goto -434 -> 501
    //   938: bipush 27
    //   940: istore 4
    //   942: aload_0
    //   943: getfield 31	com/tencent/mm/plugin/dbbackup/d$3:kIC	Lcom/tencent/mm/plugin/dbbackup/b;
    //   946: ifnull +13 -> 959
    //   949: aload_0
    //   950: getfield 31	com/tencent/mm/plugin/dbbackup/d$3:kIC	Lcom/tencent/mm/plugin/dbbackup/b;
    //   953: iconst_m1
    //   954: invokeinterface 278 2 0
    //   959: getstatic 224	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   962: astore 5
    //   964: new 91	java/lang/StringBuilder
    //   967: astore_1
    //   968: aload_1
    //   969: ldc_w 315
    //   972: invokespecial 298	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   975: aload 5
    //   977: ldc_w 317
    //   980: aload_1
    //   981: invokestatic 320	com/tencent/wcdb/repair/RepairKit:lastError	()Ljava/lang/String;
    //   984: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   987: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   990: aconst_null
    //   991: invokevirtual 324	com/tencent/mm/plugin/report/service/h:g	(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    //   994: goto -427 -> 567
    //   997: astore 11
    //   999: aload 10
    //   1001: astore_1
    //   1002: goto -243 -> 759
    //   1005: astore_1
    //   1006: aconst_null
    //   1007: astore 11
    //   1009: aconst_null
    //   1010: astore 12
    //   1012: aload_0
    //   1013: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   1016: invokestatic 240	com/tencent/mm/plugin/dbbackup/d:e	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RepairKit;
    //   1019: ifnull +22 -> 1041
    //   1022: aload_0
    //   1023: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   1026: invokestatic 240	com/tencent/mm/plugin/dbbackup/d:e	(Lcom/tencent/mm/plugin/dbbackup/d;)Lcom/tencent/wcdb/repair/RepairKit;
    //   1029: invokevirtual 257	com/tencent/wcdb/repair/RepairKit:release	()V
    //   1032: aload_0
    //   1033: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   1036: aconst_null
    //   1037: invokestatic 67	com/tencent/mm/plugin/dbbackup/d:a	(Lcom/tencent/mm/plugin/dbbackup/d;Lcom/tencent/wcdb/repair/RepairKit;)Lcom/tencent/wcdb/repair/RepairKit;
    //   1040: pop
    //   1041: aload 11
    //   1043: ifnull +8 -> 1051
    //   1046: aload 11
    //   1048: invokevirtual 253	com/tencent/wcdb/database/SQLiteDatabase:close	()V
    //   1051: aload 12
    //   1053: ifnull +8 -> 1061
    //   1056: aload 12
    //   1058: invokevirtual 256	com/tencent/wcdb/repair/RepairKit$MasterInfo:release	()V
    //   1061: aload_0
    //   1062: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kIO	Lcom/tencent/mm/plugin/dbbackup/d;
    //   1065: invokestatic 282	com/tencent/mm/plugin/dbbackup/d:c	(Lcom/tencent/mm/plugin/dbbackup/d;)Z
    //   1068: pop
    //   1069: invokestatic 288	com/tencent/mm/model/aw:RS	()Lcom/tencent/mm/sdk/platformtools/al;
    //   1072: invokevirtual 293	com/tencent/mm/sdk/platformtools/al:doM	()V
    //   1075: sipush 18972
    //   1078: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1081: aload_1
    //   1082: athrow
    //   1083: astore_1
    //   1084: aconst_null
    //   1085: astore 12
    //   1087: aload 5
    //   1089: astore 11
    //   1091: goto -79 -> 1012
    //   1094: astore 12
    //   1096: aload_1
    //   1097: astore 11
    //   1099: aload 12
    //   1101: astore_1
    //   1102: aload 11
    //   1104: astore 12
    //   1106: aload 5
    //   1108: astore 11
    //   1110: goto -98 -> 1012
    //   1113: astore_1
    //   1114: aconst_null
    //   1115: astore 11
    //   1117: goto -105 -> 1012
    //   1120: astore_1
    //   1121: aconst_null
    //   1122: astore 10
    //   1124: aload 11
    //   1126: astore 12
    //   1128: aload 10
    //   1130: astore 11
    //   1132: goto -120 -> 1012
    //   1135: astore 10
    //   1137: aload_1
    //   1138: astore 11
    //   1140: aload 10
    //   1142: astore_1
    //   1143: goto -131 -> 1012
    //   1146: astore 11
    //   1148: aconst_null
    //   1149: astore_1
    //   1150: aconst_null
    //   1151: astore 12
    //   1153: goto -394 -> 759
    //   1156: astore 11
    //   1158: aload 5
    //   1160: astore_1
    //   1161: aconst_null
    //   1162: astore 12
    //   1164: goto -405 -> 759
    //   1167: astore 11
    //   1169: aload 10
    //   1171: astore_1
    //   1172: goto -413 -> 759
    //
    // Exception table:
    //   from	to	target	type
    //   214	226	631	java/lang/Exception
    //   233	248	631	java/lang/Exception
    //   260	269	746	java/lang/Exception
    //   276	283	746	java/lang/Exception
    //   290	304	746	java/lang/Exception
    //   311	317	746	java/lang/Exception
    //   324	328	746	java/lang/Exception
    //   335	349	746	java/lang/Exception
    //   356	363	746	java/lang/Exception
    //   370	386	746	java/lang/Exception
    //   396	409	746	java/lang/Exception
    //   416	429	746	java/lang/Exception
    //   446	451	746	java/lang/Exception
    //   640	645	746	java/lang/Exception
    //   652	660	746	java/lang/Exception
    //   667	685	746	java/lang/Exception
    //   710	718	746	java/lang/Exception
    //   725	739	746	java/lang/Exception
    //   465	492	997	java/lang/Exception
    //   501	533	997	java/lang/Exception
    //   546	563	997	java/lang/Exception
    //   567	581	997	java/lang/Exception
    //   942	959	997	java/lang/Exception
    //   959	994	997	java/lang/Exception
    //   15	78	1005	finally
    //   82	88	1005	finally
    //   92	115	1005	finally
    //   115	178	1083	finally
    //   214	226	1094	finally
    //   233	248	1094	finally
    //   260	269	1094	finally
    //   276	283	1094	finally
    //   290	304	1094	finally
    //   311	317	1094	finally
    //   324	328	1094	finally
    //   335	349	1094	finally
    //   356	363	1094	finally
    //   370	386	1094	finally
    //   396	409	1094	finally
    //   416	429	1094	finally
    //   446	451	1094	finally
    //   640	645	1094	finally
    //   652	660	1094	finally
    //   667	685	1094	finally
    //   710	718	1094	finally
    //   725	739	1094	finally
    //   454	459	1113	finally
    //   465	492	1120	finally
    //   501	533	1120	finally
    //   546	563	1120	finally
    //   567	581	1120	finally
    //   942	959	1120	finally
    //   959	994	1120	finally
    //   759	797	1135	finally
    //   797	849	1135	finally
    //   15	78	1146	java/lang/Exception
    //   82	88	1146	java/lang/Exception
    //   92	115	1146	java/lang/Exception
    //   115	178	1156	java/lang/Exception
    //   454	459	1167	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.d.3
 * JD-Core Version:    0.6.2
 */