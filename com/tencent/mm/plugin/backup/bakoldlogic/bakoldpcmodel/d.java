package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.backup.i.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public final class d
  implements com.tencent.mm.ai.g
{
  private boolean cAY;
  private Random eFe;
  private boolean eVT;
  List<String> jzq;
  HashSet<String> jzr;
  e.d jzs;
  f jzt;
  boolean jzu;
  private long jzv;
  private long jzw;
  int jzx;
  int jzy;
  Object lock;

  public d()
  {
    AppMethodBeat.i(17830);
    this.lock = new Object();
    this.eFe = new Random();
    this.cAY = false;
    this.eVT = false;
    this.jzq = new LinkedList();
    this.jzr = new HashSet();
    this.jzu = false;
    this.jzy = 0;
    AppMethodBeat.o(17830);
  }

  private static String a(Random paramRandom)
  {
    AppMethodBeat.i(17836);
    paramRandom = com.tencent.mm.a.g.x((bo.yz() + paramRandom.nextDouble()).getBytes());
    AppMethodBeat.o(17836);
    return paramRandom;
  }

  public final void a(int paramInt1, int paramInt2, m paramm)
  {
    AppMethodBeat.i(17837);
    this.jzw += paramInt1;
    if (this.jzv == 0L);
    for (paramInt1 = 0; ; paramInt1 = (int)(this.jzw * 100L / this.jzv))
    {
      if (paramInt1 > this.jzx)
      {
        this.jzx = paramInt1;
        com.tencent.mm.plugin.backup.bakoldlogic.c.c.setProgress(this.jzx);
        if ((!this.cAY) && (!this.eVT) && (this.jzs != null) && (this.jzx >= 0) && (this.jzx <= 100))
          this.jzs.rI(this.jzx);
      }
      AppMethodBeat.o(17837);
      return;
    }
  }

  final void aUI()
  {
    AppMethodBeat.i(17835);
    if ((!this.jzu) || (this.eVT))
      AppMethodBeat.o(17835);
    while (true)
    {
      return;
      synchronized (this.lock)
      {
        if (this.jzr.isEmpty())
        {
          a.aUB().aUC().jzK = 4;
          a.aUB().aUC().jzL = 3;
          com.tencent.mm.plugin.backup.g.b.b(5, this.jzt);
          Object localObject2 = new com/tencent/mm/plugin/backup/bakoldlogic/c/b;
          ((com.tencent.mm.plugin.backup.bakoldlogic.c.b)localObject2).<init>(5);
          ((com.tencent.mm.plugin.backup.bakoldlogic.c.b)localObject2).aUc();
          localObject2 = a.aUB().aUD();
          ((c)localObject2).jzm += 1;
          if (this.jzs != null)
          {
            this.jzs.aUP();
            cancel();
            ab.i("MicroMsg.BakPCServer", "send backup finish cmd");
          }
        }
        else
        {
          AppMethodBeat.o(17835);
          continue;
        }
        ab.i("MicroMsg.BakPCServer", "operatorCallback is null");
      }
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(17833);
    ab.i("MicroMsg.BakPCServer", "cancel");
    this.eVT = true;
    com.tencent.mm.plugin.backup.g.b.b(5, this.jzt);
    this.jzs = null;
    this.jzu = false;
    this.jzx = 0;
    synchronized (this.lock)
    {
      this.lock.notifyAll();
      AppMethodBeat.o(17833);
      return;
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(17831);
    ab.i("MicroMsg.BakPCServer", "pause");
    this.cAY = true;
    AppMethodBeat.o(17831);
  }

  // ERROR //
  public final boolean r(String arg1, String paramString2, int paramInt)
  {
    // Byte code:
    //   0: sipush 17834
    //   3: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 208	com/tencent/mm/pointers/PLong
    //   9: dup
    //   10: invokespecial 209	com/tencent/mm/pointers/PLong:<init>	()V
    //   13: astore 4
    //   15: invokestatic 215	com/tencent/mm/plugin/backup/bakoldlogic/d/b:aUY	()Lcom/tencent/mm/plugin/backup/bakoldlogic/d/b;
    //   18: invokevirtual 219	com/tencent/mm/plugin/backup/bakoldlogic/d/b:aUZ	()Lcom/tencent/mm/plugin/backup/bakoldlogic/d/c;
    //   21: invokevirtual 225	com/tencent/mm/plugin/backup/bakoldlogic/d/c:XO	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/h;
    //   24: aload_1
    //   25: invokeinterface 231 2 0
    //   30: astore 5
    //   32: new 55	java/util/LinkedList
    //   35: dup
    //   36: invokespecial 56	java/util/LinkedList:<init>	()V
    //   39: astore 6
    //   41: new 55	java/util/LinkedList
    //   44: dup
    //   45: invokespecial 56	java/util/LinkedList:<init>	()V
    //   48: astore 7
    //   50: aload 6
    //   52: astore_1
    //   53: aload 5
    //   55: invokeinterface 236 1 0
    //   60: ifeq +933 -> 993
    //   63: aload 5
    //   65: invokeinterface 239 1 0
    //   70: ifne +920 -> 990
    //   73: aload_0
    //   74: getfield 44	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:lock	Ljava/lang/Object;
    //   77: astore_1
    //   78: aload_1
    //   79: monitorenter
    //   80: aload_0
    //   81: getfield 63	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:jzr	Ljava/util/HashSet;
    //   84: invokevirtual 243	java/util/HashSet:size	()I
    //   87: istore 8
    //   89: iload 8
    //   91: bipush 10
    //   93: if_icmple +10 -> 103
    //   96: aload_0
    //   97: getfield 44	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:lock	Ljava/lang/Object;
    //   100: invokevirtual 246	java/lang/Object:wait	()V
    //   103: aload_0
    //   104: getfield 51	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:cAY	Z
    //   107: ifeq +21 -> 128
    //   110: aload_0
    //   111: getfield 53	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:eVT	Z
    //   114: istore 9
    //   116: iload 9
    //   118: ifne +10 -> 128
    //   121: aload_0
    //   122: getfield 44	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:lock	Ljava/lang/Object;
    //   125: invokevirtual 246	java/lang/Object:wait	()V
    //   128: aload_0
    //   129: getfield 53	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:eVT	Z
    //   132: ifeq +76 -> 208
    //   135: ldc 185
    //   137: ldc 248
    //   139: invokestatic 192	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   142: aload_1
    //   143: monitorexit
    //   144: aload 5
    //   146: invokeinterface 251 1 0
    //   151: iconst_0
    //   152: istore 9
    //   154: sipush 17834
    //   157: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   160: iload 9
    //   162: ireturn
    //   163: astore 10
    //   165: ldc 185
    //   167: aload 10
    //   169: ldc 253
    //   171: iconst_0
    //   172: anewarray 4	java/lang/Object
    //   175: invokestatic 257	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   178: goto -50 -> 128
    //   181: astore_2
    //   182: aload_1
    //   183: monitorexit
    //   184: sipush 17834
    //   187: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   190: aload_2
    //   191: athrow
    //   192: astore_1
    //   193: aload 5
    //   195: invokeinterface 251 1 0
    //   200: sipush 17834
    //   203: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   206: aload_1
    //   207: athrow
    //   208: aload_1
    //   209: monitorexit
    //   210: new 259	com/tencent/mm/storage/bi
    //   213: astore 10
    //   215: aload 10
    //   217: invokespecial 260	com/tencent/mm/storage/bi:<init>	()V
    //   220: aload 10
    //   222: aload 5
    //   224: invokevirtual 264	com/tencent/mm/storage/bi:d	(Landroid/database/Cursor;)V
    //   227: iload_3
    //   228: ifle +189 -> 417
    //   231: iconst_1
    //   232: istore 8
    //   234: aload 10
    //   236: getfield 269	com/tencent/mm/g/c/cy:field_msgSvrId	J
    //   239: lconst_0
    //   240: lcmp
    //   241: ifne +182 -> 423
    //   244: ldc_w 271
    //   247: ldc_w 273
    //   250: iconst_2
    //   251: anewarray 4	java/lang/Object
    //   254: dup
    //   255: iconst_0
    //   256: aload 10
    //   258: getfield 277	com/tencent/mm/g/c/cy:field_talker	Ljava/lang/String;
    //   261: aastore
    //   262: dup
    //   263: iconst_1
    //   264: aload 10
    //   266: invokevirtual 280	com/tencent/mm/storage/bi:getType	()I
    //   269: invokestatic 286	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   272: aastore
    //   273: invokestatic 290	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   276: aconst_null
    //   277: astore_1
    //   278: iinc 3 255
    //   281: aload_1
    //   282: ifnull +10 -> 292
    //   285: aload 6
    //   287: aload_1
    //   288: invokevirtual 294	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   291: pop
    //   292: aload 7
    //   294: invokevirtual 298	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   297: astore 11
    //   299: aload 11
    //   301: invokeinterface 303 1 0
    //   306: ifeq +513 -> 819
    //   309: aload 11
    //   311: invokeinterface 307 1 0
    //   316: checkcast 309	com/tencent/mm/plugin/backup/i/u
    //   319: astore 10
    //   321: new 118	com/tencent/mm/plugin/backup/bakoldlogic/c/c
    //   324: astore 12
    //   326: aload 12
    //   328: aload 10
    //   330: getfield 312	com/tencent/mm/plugin/backup/i/u:cHr	Ljava/lang/String;
    //   333: iconst_2
    //   334: aconst_null
    //   335: aload 10
    //   337: getfield 315	com/tencent/mm/plugin/backup/i/u:path	Ljava/lang/String;
    //   340: aload_0
    //   341: invokestatic 141	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/a:aUB	()Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/a;
    //   344: getfield 321	com/tencent/mm/plugin/backup/b/d:jqU	[B
    //   347: invokespecial 324	com/tencent/mm/plugin/backup/bakoldlogic/c/c:<init>	(Ljava/lang/String;ILjava/util/LinkedList;Ljava/lang/String;Lcom/tencent/mm/ai/g;[B)V
    //   350: aload_0
    //   351: getfield 44	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:lock	Ljava/lang/Object;
    //   354: astore_1
    //   355: aload_1
    //   356: monitorenter
    //   357: aload 12
    //   359: invokevirtual 325	com/tencent/mm/plugin/backup/bakoldlogic/c/c:aUc	()Z
    //   362: pop
    //   363: aload_0
    //   364: getfield 63	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:jzr	Ljava/util/HashSet;
    //   367: aload 10
    //   369: getfield 312	com/tencent/mm/plugin/backup/i/u:cHr	Ljava/lang/String;
    //   372: invokevirtual 326	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   375: pop
    //   376: ldc 185
    //   378: ldc_w 328
    //   381: iconst_1
    //   382: anewarray 4	java/lang/Object
    //   385: dup
    //   386: iconst_0
    //   387: aload_0
    //   388: getfield 63	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:jzr	Ljava/util/HashSet;
    //   391: invokevirtual 243	java/util/HashSet:size	()I
    //   394: invokestatic 286	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   397: aastore
    //   398: invokestatic 330	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   401: aload_1
    //   402: monitorexit
    //   403: goto -104 -> 299
    //   406: astore_2
    //   407: aload_1
    //   408: monitorexit
    //   409: sipush 17834
    //   412: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   415: aload_2
    //   416: athrow
    //   417: iconst_0
    //   418: istore 8
    //   420: goto -186 -> 234
    //   423: new 332	com/tencent/mm/protocal/protobuf/gu
    //   426: astore_1
    //   427: aload_1
    //   428: invokespecial 333	com/tencent/mm/protocal/protobuf/gu:<init>	()V
    //   431: aload_1
    //   432: aload 10
    //   434: getfield 269	com/tencent/mm/g/c/cy:field_msgSvrId	J
    //   437: putfield 336	com/tencent/mm/protocal/protobuf/gu:ptF	J
    //   440: aload 10
    //   442: getfield 339	com/tencent/mm/g/c/cy:field_isSend	I
    //   445: iconst_1
    //   446: if_icmpne +224 -> 670
    //   449: new 341	com/tencent/mm/protocal/protobuf/bts
    //   452: astore 12
    //   454: aload 12
    //   456: invokespecial 342	com/tencent/mm/protocal/protobuf/bts:<init>	()V
    //   459: aload_1
    //   460: aload 12
    //   462: aload_2
    //   463: invokevirtual 346	com/tencent/mm/protocal/protobuf/bts:alV	(Ljava/lang/String;)Lcom/tencent/mm/protocal/protobuf/bts;
    //   466: putfield 350	com/tencent/mm/protocal/protobuf/gu:vEB	Lcom/tencent/mm/protocal/protobuf/bts;
    //   469: new 341	com/tencent/mm/protocal/protobuf/bts
    //   472: astore 12
    //   474: aload 12
    //   476: invokespecial 342	com/tencent/mm/protocal/protobuf/bts:<init>	()V
    //   479: aload_1
    //   480: aload 12
    //   482: aload 10
    //   484: getfield 277	com/tencent/mm/g/c/cy:field_talker	Ljava/lang/String;
    //   487: invokevirtual 346	com/tencent/mm/protocal/protobuf/bts:alV	(Ljava/lang/String;)Lcom/tencent/mm/protocal/protobuf/bts;
    //   490: putfield 353	com/tencent/mm/protocal/protobuf/gu:vEC	Lcom/tencent/mm/protocal/protobuf/bts;
    //   493: iconst_2
    //   494: istore 8
    //   496: aload_1
    //   497: iload 8
    //   499: putfield 356	com/tencent/mm/protocal/protobuf/gu:vIY	I
    //   502: new 358	com/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t
    //   505: astore 12
    //   507: aload 12
    //   509: invokespecial 359	com/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t:<init>	()V
    //   512: aload_1
    //   513: aload 12
    //   515: putfield 363	com/tencent/mm/protocal/protobuf/gu:vJd	Lcom/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;
    //   518: aload_1
    //   519: iconst_0
    //   520: putfield 366	com/tencent/mm/protocal/protobuf/gu:vJe	I
    //   523: aload_1
    //   524: iconst_0
    //   525: putfield 369	com/tencent/mm/protocal/protobuf/gu:vJf	I
    //   528: aload_1
    //   529: ldc 253
    //   531: putfield 372	com/tencent/mm/protocal/protobuf/gu:vEG	Ljava/lang/String;
    //   534: aload_1
    //   535: aload 10
    //   537: invokevirtual 280	com/tencent/mm/storage/bi:getType	()I
    //   540: invokestatic 378	com/tencent/mm/pluginsdk/model/app/l:Kx	(I)I
    //   543: putfield 381	com/tencent/mm/protocal/protobuf/gu:jCt	I
    //   546: aload_1
    //   547: aload 10
    //   549: getfield 384	com/tencent/mm/g/c/cy:field_createTime	J
    //   552: ldc2_w 385
    //   555: ldiv
    //   556: l2i
    //   557: putfield 389	com/tencent/mm/protocal/protobuf/gu:vIZ	I
    //   560: aload_1
    //   561: aload 10
    //   563: getfield 384	com/tencent/mm/g/c/cy:field_createTime	J
    //   566: putfield 392	com/tencent/mm/protocal/protobuf/gu:vJh	J
    //   569: aload_1
    //   570: aload 10
    //   572: getfield 395	com/tencent/mm/g/c/cy:field_msgSeq	J
    //   575: l2i
    //   576: putfield 398	com/tencent/mm/protocal/protobuf/gu:vJg	I
    //   579: aload_1
    //   580: aload 10
    //   582: getfield 401	com/tencent/mm/g/c/cy:field_flag	I
    //   585: putfield 404	com/tencent/mm/protocal/protobuf/gu:vJi	I
    //   588: new 341	com/tencent/mm/protocal/protobuf/bts
    //   591: astore 12
    //   593: aload 12
    //   595: invokespecial 342	com/tencent/mm/protocal/protobuf/bts:<init>	()V
    //   598: aload 12
    //   600: aload 10
    //   602: getfield 407	com/tencent/mm/g/c/cy:field_content	Ljava/lang/String;
    //   605: ldc 253
    //   607: invokestatic 411	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   610: invokevirtual 346	com/tencent/mm/protocal/protobuf/bts:alV	(Ljava/lang/String;)Lcom/tencent/mm/protocal/protobuf/bts;
    //   613: pop
    //   614: aload_1
    //   615: aload 12
    //   617: putfield 414	com/tencent/mm/protocal/protobuf/gu:vED	Lcom/tencent/mm/protocal/protobuf/bts;
    //   620: invokestatic 420	com/tencent/mm/plugin/backup/bakoldlogic/b/d:aUA	()Lcom/tencent/mm/plugin/backup/bakoldlogic/b/d;
    //   623: aload 10
    //   625: invokevirtual 280	com/tencent/mm/storage/bi:getType	()I
    //   628: invokestatic 378	com/tencent/mm/pluginsdk/model/app/l:Kx	(I)I
    //   631: invokevirtual 424	com/tencent/mm/plugin/backup/bakoldlogic/b/d:rD	(I)Lcom/tencent/mm/plugin/backup/bakoldlogic/b/j;
    //   634: astore 12
    //   636: aload 12
    //   638: ifnonnull +93 -> 731
    //   641: ldc_w 271
    //   644: ldc_w 426
    //   647: iconst_1
    //   648: anewarray 4	java/lang/Object
    //   651: dup
    //   652: iconst_0
    //   653: aload 10
    //   655: invokevirtual 280	com/tencent/mm/storage/bi:getType	()I
    //   658: invokestatic 286	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   661: aastore
    //   662: invokestatic 428	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   665: aconst_null
    //   666: astore_1
    //   667: goto -389 -> 278
    //   670: new 341	com/tencent/mm/protocal/protobuf/bts
    //   673: astore 12
    //   675: aload 12
    //   677: invokespecial 342	com/tencent/mm/protocal/protobuf/bts:<init>	()V
    //   680: aload_1
    //   681: aload 12
    //   683: aload 10
    //   685: getfield 277	com/tencent/mm/g/c/cy:field_talker	Ljava/lang/String;
    //   688: invokevirtual 346	com/tencent/mm/protocal/protobuf/bts:alV	(Ljava/lang/String;)Lcom/tencent/mm/protocal/protobuf/bts;
    //   691: putfield 350	com/tencent/mm/protocal/protobuf/gu:vEB	Lcom/tencent/mm/protocal/protobuf/bts;
    //   694: new 341	com/tencent/mm/protocal/protobuf/bts
    //   697: astore 12
    //   699: aload 12
    //   701: invokespecial 342	com/tencent/mm/protocal/protobuf/bts:<init>	()V
    //   704: aload_1
    //   705: aload 12
    //   707: aload_2
    //   708: invokevirtual 346	com/tencent/mm/protocal/protobuf/bts:alV	(Ljava/lang/String;)Lcom/tencent/mm/protocal/protobuf/bts;
    //   711: putfield 353	com/tencent/mm/protocal/protobuf/gu:vEC	Lcom/tencent/mm/protocal/protobuf/bts;
    //   714: iload 8
    //   716: ifeq +9 -> 725
    //   719: iconst_3
    //   720: istore 8
    //   722: goto -226 -> 496
    //   725: iconst_4
    //   726: istore 8
    //   728: goto -232 -> 496
    //   731: aload 12
    //   733: aload_1
    //   734: aload 10
    //   736: aload 7
    //   738: invokeinterface 433 4 0
    //   743: istore 8
    //   745: iload 8
    //   747: ifge +8 -> 755
    //   750: aconst_null
    //   751: astore_1
    //   752: goto -474 -> 278
    //   755: aload 4
    //   757: aload 4
    //   759: getfield 436	com/tencent/mm/pointers/PLong:value	J
    //   762: iload 8
    //   764: i2l
    //   765: ladd
    //   766: putfield 436	com/tencent/mm/pointers/PLong:value	J
    //   769: aload 4
    //   771: aload 4
    //   773: getfield 436	com/tencent/mm/pointers/PLong:value	J
    //   776: ldc2_w 437
    //   779: ladd
    //   780: putfield 436	com/tencent/mm/pointers/PLong:value	J
    //   783: goto -505 -> 278
    //   786: astore_1
    //   787: ldc 185
    //   789: aload_1
    //   790: ldc 253
    //   792: iconst_0
    //   793: anewarray 4	java/lang/Object
    //   796: invokestatic 257	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   799: ldc 185
    //   801: ldc_w 440
    //   804: aload_1
    //   805: invokestatic 443	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   808: invokevirtual 447	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   811: invokestatic 450	com/tencent/mm/sdk/platformtools/ab:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   814: aconst_null
    //   815: astore_1
    //   816: goto -535 -> 281
    //   819: aload 7
    //   821: invokevirtual 453	java/util/LinkedList:clear	()V
    //   824: aload 6
    //   826: astore_1
    //   827: aload 4
    //   829: getfield 436	com/tencent/mm/pointers/PLong:value	J
    //   832: ldc2_w 454
    //   835: lcmp
    //   836: ifle +128 -> 964
    //   839: new 75	java/lang/StringBuilder
    //   842: astore_1
    //   843: aload_1
    //   844: ldc_w 457
    //   847: invokespecial 460	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   850: ldc 185
    //   852: aload_1
    //   853: aload 4
    //   855: getfield 436	com/tencent/mm/pointers/PLong:value	J
    //   858: invokevirtual 86	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   861: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   864: invokestatic 462	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   867: aload_0
    //   868: getfield 49	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:eFe	Ljava/util/Random;
    //   871: invokestatic 464	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:a	(Ljava/util/Random;)Ljava/lang/String;
    //   874: astore_1
    //   875: new 118	com/tencent/mm/plugin/backup/bakoldlogic/c/c
    //   878: astore 10
    //   880: aload 10
    //   882: aload_1
    //   883: iconst_1
    //   884: aload 6
    //   886: ldc 253
    //   888: aload_0
    //   889: invokestatic 141	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/a:aUB	()Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/a;
    //   892: getfield 321	com/tencent/mm/plugin/backup/b/d:jqU	[B
    //   895: invokespecial 324	com/tencent/mm/plugin/backup/bakoldlogic/c/c:<init>	(Ljava/lang/String;ILjava/util/LinkedList;Ljava/lang/String;Lcom/tencent/mm/ai/g;[B)V
    //   898: aload_0
    //   899: getfield 44	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:lock	Ljava/lang/Object;
    //   902: astore 6
    //   904: aload 6
    //   906: monitorenter
    //   907: aload 10
    //   909: invokevirtual 325	com/tencent/mm/plugin/backup/bakoldlogic/c/c:aUc	()Z
    //   912: pop
    //   913: aload_0
    //   914: getfield 63	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:jzr	Ljava/util/HashSet;
    //   917: aload_1
    //   918: invokevirtual 326	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   921: pop
    //   922: ldc 185
    //   924: ldc_w 328
    //   927: iconst_1
    //   928: anewarray 4	java/lang/Object
    //   931: dup
    //   932: iconst_0
    //   933: aload_0
    //   934: getfield 63	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:jzr	Ljava/util/HashSet;
    //   937: invokevirtual 243	java/util/HashSet:size	()I
    //   940: invokestatic 286	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   943: aastore
    //   944: invokestatic 330	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   947: aload 6
    //   949: monitorexit
    //   950: new 55	java/util/LinkedList
    //   953: astore_1
    //   954: aload_1
    //   955: invokespecial 56	java/util/LinkedList:<init>	()V
    //   958: aload 4
    //   960: lconst_0
    //   961: putfield 436	com/tencent/mm/pointers/PLong:value	J
    //   964: aload 5
    //   966: invokeinterface 467 1 0
    //   971: pop
    //   972: aload_1
    //   973: astore 6
    //   975: goto -912 -> 63
    //   978: astore_1
    //   979: aload 6
    //   981: monitorexit
    //   982: sipush 17834
    //   985: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   988: aload_1
    //   989: athrow
    //   990: aload 6
    //   992: astore_1
    //   993: aload 4
    //   995: getfield 436	com/tencent/mm/pointers/PLong:value	J
    //   998: lconst_0
    //   999: lcmp
    //   1000: ifle +96 -> 1096
    //   1003: aload_0
    //   1004: getfield 49	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:eFe	Ljava/util/Random;
    //   1007: invokestatic 464	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:a	(Ljava/util/Random;)Ljava/lang/String;
    //   1010: astore_2
    //   1011: new 118	com/tencent/mm/plugin/backup/bakoldlogic/c/c
    //   1014: astore 6
    //   1016: aload 6
    //   1018: aload_2
    //   1019: iconst_1
    //   1020: aload_1
    //   1021: ldc 253
    //   1023: aload_0
    //   1024: invokestatic 141	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/a:aUB	()Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/a;
    //   1027: getfield 321	com/tencent/mm/plugin/backup/b/d:jqU	[B
    //   1030: invokespecial 324	com/tencent/mm/plugin/backup/bakoldlogic/c/c:<init>	(Ljava/lang/String;ILjava/util/LinkedList;Ljava/lang/String;Lcom/tencent/mm/ai/g;[B)V
    //   1033: aload_0
    //   1034: getfield 44	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:lock	Ljava/lang/Object;
    //   1037: astore_1
    //   1038: aload_1
    //   1039: monitorenter
    //   1040: aload 6
    //   1042: invokevirtual 325	com/tencent/mm/plugin/backup/bakoldlogic/c/c:aUc	()Z
    //   1045: pop
    //   1046: aload_0
    //   1047: getfield 63	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:jzr	Ljava/util/HashSet;
    //   1050: aload_2
    //   1051: invokevirtual 326	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   1054: pop
    //   1055: ldc 185
    //   1057: ldc_w 328
    //   1060: iconst_1
    //   1061: anewarray 4	java/lang/Object
    //   1064: dup
    //   1065: iconst_0
    //   1066: aload_0
    //   1067: getfield 63	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:jzr	Ljava/util/HashSet;
    //   1070: invokevirtual 243	java/util/HashSet:size	()I
    //   1073: invokestatic 286	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1076: aastore
    //   1077: invokestatic 330	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1080: aload_1
    //   1081: monitorexit
    //   1082: aload 4
    //   1084: lconst_0
    //   1085: putfield 436	com/tencent/mm/pointers/PLong:value	J
    //   1088: new 55	java/util/LinkedList
    //   1091: dup
    //   1092: invokespecial 56	java/util/LinkedList:<init>	()V
    //   1095: pop
    //   1096: aload 5
    //   1098: invokeinterface 251 1 0
    //   1103: iconst_1
    //   1104: istore 9
    //   1106: sipush 17834
    //   1109: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1112: goto -952 -> 160
    //   1115: astore_2
    //   1116: aload_1
    //   1117: monitorexit
    //   1118: sipush 17834
    //   1121: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1124: aload_2
    //   1125: athrow
    //   1126: astore 10
    //   1128: goto -1025 -> 103
    //
    // Exception table:
    //   from	to	target	type
    //   121	128	163	java/lang/InterruptedException
    //   80	89	181	finally
    //   96	103	181	finally
    //   103	116	181	finally
    //   121	128	181	finally
    //   128	144	181	finally
    //   165	178	181	finally
    //   182	184	181	finally
    //   208	210	181	finally
    //   53	63	192	finally
    //   63	80	192	finally
    //   184	192	192	finally
    //   210	227	192	finally
    //   234	276	192	finally
    //   285	292	192	finally
    //   292	299	192	finally
    //   299	357	192	finally
    //   409	417	192	finally
    //   423	493	192	finally
    //   496	636	192	finally
    //   641	665	192	finally
    //   670	714	192	finally
    //   731	745	192	finally
    //   755	783	192	finally
    //   787	814	192	finally
    //   819	824	192	finally
    //   827	907	192	finally
    //   950	964	192	finally
    //   964	972	192	finally
    //   982	990	192	finally
    //   993	1040	192	finally
    //   1082	1096	192	finally
    //   1118	1126	192	finally
    //   357	403	406	finally
    //   407	409	406	finally
    //   234	276	786	java/lang/Exception
    //   423	493	786	java/lang/Exception
    //   496	636	786	java/lang/Exception
    //   641	665	786	java/lang/Exception
    //   670	714	786	java/lang/Exception
    //   731	745	786	java/lang/Exception
    //   755	783	786	java/lang/Exception
    //   907	950	978	finally
    //   979	982	978	finally
    //   1040	1082	1115	finally
    //   1116	1118	1115	finally
    //   96	103	1126	java/lang/InterruptedException
  }

  public final void resume()
  {
    AppMethodBeat.i(17832);
    ab.i("MicroMsg.BakPCServer", "resume");
    this.cAY = false;
    synchronized (this.lock)
    {
      this.lock.notifyAll();
      AppMethodBeat.o(17832);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.d
 * JD-Core Version:    0.6.2
 */