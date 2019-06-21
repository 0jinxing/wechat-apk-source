package com.tencent.mm.plugin.backup.c;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.backup.b.b.b;
import com.tencent.mm.plugin.backup.b.f.a;
import com.tencent.mm.plugin.backup.g.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ai;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicLong;

public final class c
{
  private int jqS;
  boolean jrD = false;
  b.b jrE;
  com.tencent.mm.plugin.backup.b.d jrF;
  long jrG = 0L;
  public long jrH = 0L;

  public c(com.tencent.mm.plugin.backup.b.d paramd, int paramInt, b.b paramb)
  {
    this.jrF = paramd;
    this.jqS = paramInt;
    this.jrE = paramb;
    this.jrD = false;
  }

  public final void a(LinkedList<f.a> paramLinkedList, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(17196);
    if (paramLinkedList == null);
    for (int i = -1; ; i = paramLinkedList.size())
    {
      ab.i("MicroMsg.BackupPackAndSend", "startBackup, backupSessionList size[%d], bigFileSize[%d], isOnlyText[%b]", new Object[] { Integer.valueOf(i), Long.valueOf(paramLong), Boolean.valueOf(paramBoolean) });
      com.tencent.mm.sdk.g.d.a(new c.1(this, paramLinkedList, paramLong, paramBoolean), "backupPackThread", 10).start();
      AppMethodBeat.o(17196);
      return;
    }
  }

  // ERROR //
  final boolean a(f.a parama, c.c paramc, java.lang.String paramString, long paramLong, boolean paramBoolean)
  {
    // Byte code:
    //   0: sipush 17197
    //   3: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 109	com/tencent/mm/plugin/backup/h/d:aUr	()Lcom/tencent/mm/plugin/backup/h/d;
    //   9: invokevirtual 113	com/tencent/mm/plugin/backup/h/d:aUs	()Lcom/tencent/mm/plugin/backup/h/b;
    //   12: invokevirtual 119	com/tencent/mm/plugin/backup/h/b:XR	()Lcom/tencent/mm/storage/be;
    //   15: aload_1
    //   16: getfield 125	com/tencent/mm/plugin/backup/b/f$a:jrd	Ljava/lang/String;
    //   19: invokeinterface 131 2 0
    //   24: astore 7
    //   26: aload 7
    //   28: ifnull +184 -> 212
    //   31: aload 7
    //   33: getfield 136	com/tencent/mm/g/c/at:field_unReadCount	I
    //   36: istore 8
    //   38: ldc 49
    //   40: ldc 138
    //   42: iconst_5
    //   43: anewarray 4	java/lang/Object
    //   46: dup
    //   47: iconst_0
    //   48: aload_1
    //   49: getfield 141	com/tencent/mm/plugin/backup/b/f$a:jre	I
    //   52: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   55: aastore
    //   56: dup
    //   57: iconst_1
    //   58: aload_1
    //   59: getfield 125	com/tencent/mm/plugin/backup/b/f$a:jrd	Ljava/lang/String;
    //   62: aastore
    //   63: dup
    //   64: iconst_2
    //   65: aload_1
    //   66: getfield 144	com/tencent/mm/plugin/backup/b/f$a:startTime	J
    //   69: invokestatic 62	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   72: aastore
    //   73: dup
    //   74: iconst_3
    //   75: aload_1
    //   76: getfield 147	com/tencent/mm/plugin/backup/b/f$a:endTime	J
    //   79: invokestatic 62	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   82: aastore
    //   83: dup
    //   84: iconst_4
    //   85: iload 8
    //   87: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   90: aastore
    //   91: invokestatic 72	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   94: invokestatic 153	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   97: lstore 9
    //   99: iconst_0
    //   100: istore 11
    //   102: lconst_0
    //   103: lstore 12
    //   105: lconst_0
    //   106: lstore 14
    //   108: lconst_0
    //   109: lstore 16
    //   111: iload 8
    //   113: istore 18
    //   115: iload 11
    //   117: istore 8
    //   119: new 94	java/util/LinkedList
    //   122: dup
    //   123: invokespecial 154	java/util/LinkedList:<init>	()V
    //   126: astore 19
    //   128: invokestatic 153	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   131: lstore 20
    //   133: invokestatic 109	com/tencent/mm/plugin/backup/h/d:aUr	()Lcom/tencent/mm/plugin/backup/h/d;
    //   136: invokevirtual 113	com/tencent/mm/plugin/backup/h/d:aUs	()Lcom/tencent/mm/plugin/backup/h/b;
    //   139: invokevirtual 158	com/tencent/mm/plugin/backup/h/b:XO	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/h;
    //   142: aload_1
    //   143: getfield 125	com/tencent/mm/plugin/backup/b/f$a:jrd	Ljava/lang/String;
    //   146: aload_1
    //   147: getfield 144	com/tencent/mm/plugin/backup/b/f$a:startTime	J
    //   150: aload_1
    //   151: getfield 147	com/tencent/mm/plugin/backup/b/f$a:endTime	J
    //   154: iload 8
    //   156: invokeinterface 164 7 0
    //   161: astore 22
    //   163: aload 22
    //   165: invokeinterface 170 1 0
    //   170: ifeq +97 -> 267
    //   173: iload 8
    //   175: iconst_1
    //   176: iadd
    //   177: istore 11
    //   179: aload_0
    //   180: getfield 29	com/tencent/mm/plugin/backup/c/c:jrD	Z
    //   183: ifeq +35 -> 218
    //   186: ldc 49
    //   188: ldc 172
    //   190: invokestatic 176	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   193: aload 22
    //   195: invokeinterface 179 1 0
    //   200: iconst_0
    //   201: istore 6
    //   203: sipush 17197
    //   206: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   209: iload 6
    //   211: ireturn
    //   212: iconst_0
    //   213: istore 8
    //   215: goto -177 -> 38
    //   218: new 181	com/tencent/mm/storage/bi
    //   221: dup
    //   222: invokespecial 182	com/tencent/mm/storage/bi:<init>	()V
    //   225: astore 7
    //   227: aload 7
    //   229: aload 22
    //   231: invokevirtual 186	com/tencent/mm/storage/bi:d	(Landroid/database/Cursor;)V
    //   234: iload 6
    //   236: ifeq +16 -> 252
    //   239: iload 11
    //   241: istore 8
    //   243: aload 7
    //   245: invokevirtual 189	com/tencent/mm/storage/bi:getType	()I
    //   248: iconst_1
    //   249: if_icmpne -86 -> 163
    //   252: aload 19
    //   254: aload 7
    //   256: invokevirtual 193	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   259: pop
    //   260: iload 11
    //   262: istore 8
    //   264: goto -101 -> 163
    //   267: aload 22
    //   269: invokeinterface 179 1 0
    //   274: lload 16
    //   276: lload 20
    //   278: lsub
    //   279: invokestatic 153	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   282: ladd
    //   283: lstore 20
    //   285: aload 19
    //   287: invokevirtual 98	java/util/LinkedList:size	()I
    //   290: ifeq +419 -> 709
    //   293: iconst_0
    //   294: istore 11
    //   296: iload 11
    //   298: aload 19
    //   300: invokevirtual 98	java/util/LinkedList:size	()I
    //   303: if_icmpge +399 -> 702
    //   306: aload_0
    //   307: getfield 29	com/tencent/mm/plugin/backup/c/c:jrD	Z
    //   310: ifeq +22 -> 332
    //   313: ldc 49
    //   315: ldc 195
    //   317: invokestatic 176	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   320: iconst_0
    //   321: istore 6
    //   323: sipush 17197
    //   326: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   329: goto -120 -> 209
    //   332: aload 19
    //   334: iload 11
    //   336: invokevirtual 199	java/util/LinkedList:get	(I)Ljava/lang/Object;
    //   339: checkcast 181	com/tencent/mm/storage/bi
    //   342: astore 23
    //   344: new 201	com/tencent/mm/pointers/PLong
    //   347: dup
    //   348: invokespecial 202	com/tencent/mm/pointers/PLong:<init>	()V
    //   351: astore 24
    //   353: new 94	java/util/LinkedList
    //   356: dup
    //   357: invokespecial 154	java/util/LinkedList:<init>	()V
    //   360: astore 25
    //   362: new 204	java/util/HashMap
    //   365: dup
    //   366: invokespecial 205	java/util/HashMap:<init>	()V
    //   369: astore 26
    //   371: lload 14
    //   373: lstore 16
    //   375: lload 14
    //   377: invokestatic 153	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   380: lsub
    //   381: lstore 14
    //   383: iload 18
    //   385: ifle +279 -> 664
    //   388: iconst_1
    //   389: istore 27
    //   391: lload 14
    //   393: lstore 16
    //   395: aload 23
    //   397: iconst_0
    //   398: aload_3
    //   399: aload 24
    //   401: aload 25
    //   403: aload 26
    //   405: iload 27
    //   407: iconst_0
    //   408: lload 4
    //   410: invokestatic 210	com/tencent/mm/plugin/backup/f/h:a	(Lcom/tencent/mm/storage/bi;ZLjava/lang/String;Lcom/tencent/mm/pointers/PLong;Ljava/util/LinkedList;Ljava/util/HashMap;ZZJ)Lcom/tencent/mm/protocal/protobuf/gu;
    //   413: astore 7
    //   415: invokestatic 153	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   418: lstore 16
    //   420: lload 16
    //   422: lload 14
    //   424: ladd
    //   425: lstore 14
    //   427: aload 7
    //   429: ifnonnull +267 -> 696
    //   432: iconst_1
    //   433: istore 27
    //   435: ldc 49
    //   437: ldc 212
    //   439: bipush 8
    //   441: anewarray 4	java/lang/Object
    //   444: dup
    //   445: iconst_0
    //   446: iload 27
    //   448: invokestatic 67	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   451: aastore
    //   452: dup
    //   453: iconst_1
    //   454: aload 25
    //   456: invokevirtual 98	java/util/LinkedList:size	()I
    //   459: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   462: aastore
    //   463: dup
    //   464: iconst_2
    //   465: aload 24
    //   467: getfield 215	com/tencent/mm/pointers/PLong:value	J
    //   470: invokestatic 62	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   473: aastore
    //   474: dup
    //   475: iconst_3
    //   476: aload 26
    //   478: invokevirtual 216	java/util/HashMap:size	()I
    //   481: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   484: aastore
    //   485: dup
    //   486: iconst_4
    //   487: aload 23
    //   489: getfield 221	com/tencent/mm/g/c/cy:field_msgSvrId	J
    //   492: invokestatic 62	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   495: aastore
    //   496: dup
    //   497: iconst_5
    //   498: aload 23
    //   500: invokevirtual 189	com/tencent/mm/storage/bi:getType	()I
    //   503: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   506: aastore
    //   507: dup
    //   508: bipush 6
    //   510: aload 23
    //   512: getfield 224	com/tencent/mm/g/c/cy:field_createTime	J
    //   515: invokestatic 62	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   518: aastore
    //   519: dup
    //   520: bipush 7
    //   522: aload 23
    //   524: getfield 227	com/tencent/mm/g/c/cy:field_talker	Ljava/lang/String;
    //   527: aastore
    //   528: invokestatic 72	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   531: lload 12
    //   533: lstore 16
    //   535: iload 18
    //   537: istore 28
    //   539: aload 7
    //   541: ifnull +109 -> 650
    //   544: iload 18
    //   546: iconst_1
    //   547: isub
    //   548: istore 28
    //   550: invokestatic 153	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   553: lstore 29
    //   555: aload 24
    //   557: getfield 215	com/tencent/mm/pointers/PLong:value	J
    //   560: lstore 31
    //   562: aload 23
    //   564: getfield 224	com/tencent/mm/g/c/cy:field_createTime	J
    //   567: lstore 16
    //   569: aload_2
    //   570: getfield 231	com/tencent/mm/plugin/backup/c/c$c:jsm	Lcom/tencent/mm/plugin/backup/c/c$b;
    //   573: ifnonnull +41 -> 614
    //   576: aload_2
    //   577: getfield 235	com/tencent/mm/plugin/backup/c/c$c:jsk	Ljava/util/concurrent/LinkedBlockingQueue;
    //   580: astore 22
    //   582: new 9	com/tencent/mm/plugin/backup/c/c$b
    //   585: dup
    //   586: aload_2
    //   587: getfield 239	com/tencent/mm/plugin/backup/c/c$c:jrL	Lcom/tencent/mm/plugin/backup/c/c;
    //   590: aload_2
    //   591: getfield 243	com/tencent/mm/plugin/backup/c/c$c:jrQ	Lcom/tencent/mm/plugin/backup/c/c$a;
    //   594: aload_1
    //   595: invokespecial 246	com/tencent/mm/plugin/backup/c/c$b:<init>	(Lcom/tencent/mm/plugin/backup/c/c;Lcom/tencent/mm/plugin/backup/c/c$a;Lcom/tencent/mm/plugin/backup/b/f$a;)V
    //   598: astore 24
    //   600: aload_2
    //   601: aload 24
    //   603: putfield 231	com/tencent/mm/plugin/backup/c/c$c:jsm	Lcom/tencent/mm/plugin/backup/c/c$b;
    //   606: aload 22
    //   608: aload 24
    //   610: invokevirtual 251	java/util/concurrent/LinkedBlockingQueue:offer	(Ljava/lang/Object;)Z
    //   613: pop
    //   614: aload_2
    //   615: getfield 231	com/tencent/mm/plugin/backup/c/c$c:jsm	Lcom/tencent/mm/plugin/backup/c/c$b;
    //   618: aload 7
    //   620: lload 31
    //   622: lload 16
    //   624: aload 25
    //   626: aload 26
    //   628: invokevirtual 254	com/tencent/mm/plugin/backup/c/c$b:a	(Lcom/tencent/mm/protocal/protobuf/gu;JJLjava/util/LinkedList;Ljava/util/HashMap;)Z
    //   631: ifeq +8 -> 639
    //   634: aload_2
    //   635: aconst_null
    //   636: putfield 231	com/tencent/mm/plugin/backup/c/c$c:jsm	Lcom/tencent/mm/plugin/backup/c/c$b;
    //   639: lload 12
    //   641: lload 29
    //   643: lsub
    //   644: invokestatic 153	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   647: ladd
    //   648: lstore 16
    //   650: iinc 11 1
    //   653: lload 16
    //   655: lstore 12
    //   657: iload 28
    //   659: istore 18
    //   661: goto -365 -> 296
    //   664: iconst_0
    //   665: istore 27
    //   667: goto -276 -> 391
    //   670: astore 22
    //   672: aconst_null
    //   673: astore 7
    //   675: lload 16
    //   677: lstore 14
    //   679: ldc 49
    //   681: aload 22
    //   683: ldc_w 256
    //   686: iconst_0
    //   687: anewarray 4	java/lang/Object
    //   690: invokestatic 260	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   693: goto -266 -> 427
    //   696: iconst_0
    //   697: istore 27
    //   699: goto -264 -> 435
    //   702: lload 20
    //   704: lstore 16
    //   706: goto -587 -> 119
    //   709: invokestatic 153	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   712: lstore 16
    //   714: aload_2
    //   715: getfield 231	com/tencent/mm/plugin/backup/c/c$c:jsm	Lcom/tencent/mm/plugin/backup/c/c$b;
    //   718: ifnonnull +39 -> 757
    //   721: aload_2
    //   722: getfield 235	com/tencent/mm/plugin/backup/c/c$c:jsk	Ljava/util/concurrent/LinkedBlockingQueue;
    //   725: astore_3
    //   726: new 9	com/tencent/mm/plugin/backup/c/c$b
    //   729: dup
    //   730: aload_2
    //   731: getfield 239	com/tencent/mm/plugin/backup/c/c$c:jrL	Lcom/tencent/mm/plugin/backup/c/c;
    //   734: aload_2
    //   735: getfield 243	com/tencent/mm/plugin/backup/c/c$c:jrQ	Lcom/tencent/mm/plugin/backup/c/c$a;
    //   738: aload_1
    //   739: invokespecial 246	com/tencent/mm/plugin/backup/c/c$b:<init>	(Lcom/tencent/mm/plugin/backup/c/c;Lcom/tencent/mm/plugin/backup/c/c$a;Lcom/tencent/mm/plugin/backup/b/f$a;)V
    //   742: astore 7
    //   744: aload_2
    //   745: aload 7
    //   747: putfield 231	com/tencent/mm/plugin/backup/c/c$c:jsm	Lcom/tencent/mm/plugin/backup/c/c$b;
    //   750: aload_3
    //   751: aload 7
    //   753: invokevirtual 251	java/util/concurrent/LinkedBlockingQueue:offer	(Ljava/lang/Object;)Z
    //   756: pop
    //   757: aload_2
    //   758: getfield 231	com/tencent/mm/plugin/backup/c/c$c:jsm	Lcom/tencent/mm/plugin/backup/c/c$b;
    //   761: invokevirtual 263	com/tencent/mm/plugin/backup/c/c$b:aSJ	()V
    //   764: aload_2
    //   765: aconst_null
    //   766: putfield 231	com/tencent/mm/plugin/backup/c/c$c:jsm	Lcom/tencent/mm/plugin/backup/c/c$b;
    //   769: invokestatic 153	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   772: lstore 4
    //   774: ldc 49
    //   776: ldc_w 265
    //   779: bipush 7
    //   781: anewarray 4	java/lang/Object
    //   784: dup
    //   785: iconst_0
    //   786: aload_1
    //   787: getfield 141	com/tencent/mm/plugin/backup/b/f$a:jre	I
    //   790: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   793: aastore
    //   794: dup
    //   795: iconst_1
    //   796: aload_1
    //   797: getfield 125	com/tencent/mm/plugin/backup/b/f$a:jrd	Ljava/lang/String;
    //   800: aastore
    //   801: dup
    //   802: iconst_2
    //   803: iload 8
    //   805: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   808: aastore
    //   809: dup
    //   810: iconst_3
    //   811: lload 9
    //   813: invokestatic 269	com/tencent/mm/sdk/platformtools/bo:gb	(J)J
    //   816: invokestatic 62	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   819: aastore
    //   820: dup
    //   821: iconst_4
    //   822: lload 20
    //   824: invokestatic 62	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   827: aastore
    //   828: dup
    //   829: iconst_5
    //   830: lload 14
    //   832: invokestatic 62	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   835: aastore
    //   836: dup
    //   837: bipush 6
    //   839: lload 12
    //   841: lload 16
    //   843: lsub
    //   844: lload 4
    //   846: ladd
    //   847: invokestatic 62	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   850: aastore
    //   851: invokestatic 72	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   854: iconst_1
    //   855: istore 6
    //   857: sipush 17197
    //   860: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   863: goto -654 -> 209
    //   866: astore 22
    //   868: goto -189 -> 679
    //
    // Exception table:
    //   from	to	target	type
    //   375	383	670	java/lang/Exception
    //   395	415	670	java/lang/Exception
    //   415	420	866	java/lang/Exception
  }

  public final long aSH()
  {
    return this.jrG / 1024L;
  }

  public final void aSI()
  {
    AppMethodBeat.i(17195);
    ab.i("MicroMsg.BackupPackAndSend", "backupSendFinishRequest.");
    com.tencent.mm.plugin.backup.i.d locald = new com.tencent.mm.plugin.backup.i.d();
    locald.ID = this.jrF.jqO;
    try
    {
      b.K(locald.toByteArray(), 8);
      AppMethodBeat.o(17195);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BackupPackAndSend", localException, "BackupFinishRequest to buf err.", new Object[0]);
        AppMethodBeat.o(17195);
      }
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(17193);
    ab.e("MicroMsg.BackupPackAndSend", "cancel, caller:%s", new Object[] { an.doQ() });
    this.jrD = true;
    AppMethodBeat.o(17193);
  }

  public final void fj(boolean paramBoolean)
  {
    AppMethodBeat.i(17194);
    ab.i("MicroMsg.BackupPackAndSend", "clearContinueBackupData.");
    SharedPreferences.Editor localEditor;
    if (this.jqS == 1)
    {
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(ac.a.xPB, Boolean.FALSE);
      localEditor = com.tencent.mm.plugin.backup.b.d.aSz().edit();
      localEditor.putString("BACKUP_PC_CHOOSE_SESSION", null);
      if (paramBoolean)
      {
        if (this.jqS != 1)
          break label155;
        localEditor.putInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0);
        localEditor.putInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", 0);
        localEditor.putLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L);
        localEditor.putLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L);
      }
    }
    while (true)
    {
      localEditor.commit();
      AppMethodBeat.o(17194);
      return;
      if (this.jqS != 2)
        break;
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(ac.a.xPE, Boolean.FALSE);
      break;
      label155: if (this.jqS == 2)
      {
        localEditor.putInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0);
        localEditor.putInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", 0);
        localEditor.putLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0L);
        localEditor.putLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0L);
      }
    }
  }

  final class a
  {
    volatile AtomicLong jrM;
    ai jrN;
    ai jrO;

    private a()
    {
      AppMethodBeat.i(17175);
      this.jrM = new AtomicLong(0L);
      this.jrN = new ai(true);
      this.jrO = new ai(true);
      AppMethodBeat.o(17175);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.c
 * JD-Core Version:    0.6.2
 */