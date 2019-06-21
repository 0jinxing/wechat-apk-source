package com.tencent.mm.plugin.card.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.protobuf.agv;
import com.tencent.mm.protocal.protobuf.agw;
import com.tencent.mm.protocal.protobuf.bvx;
import com.tencent.mm.protocal.protobuf.ol;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class ad extends m
  implements k
{
  private final b ehh;
  private f ehi;
  public boolean kei;
  public ol kej;
  public bvx kek;
  public int kel;

  public ad(double paramDouble1, double paramDouble2, int paramInt)
  {
    AppMethodBeat.i(87904);
    this.kei = false;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new agv();
    ((b.a)localObject).fsK = new agw();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getcardslayout";
    ((b.a)localObject).fsI = 984;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (agv)this.ehh.fsG.fsP;
    ((agv)localObject).latitude = paramDouble1;
    ((agv)localObject).longitude = paramDouble2;
    ((agv)localObject).scene = paramInt;
    ((agv)localObject).wno = ((String)g.RP().Ry().get(ac.a.xKi, null));
    AppMethodBeat.o(87904);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(87906);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(87906);
    return i;
  }

  // ERROR //
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc 135
    //   2: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 137
    //   7: ldc 139
    //   9: iconst_2
    //   10: anewarray 141	java/lang/Object
    //   13: dup
    //   14: iconst_0
    //   15: iload_2
    //   16: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   19: aastore
    //   20: dup
    //   21: iconst_1
    //   22: iload_3
    //   23: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   26: aastore
    //   27: invokestatic 152	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   30: aload_0
    //   31: getfield 69	com/tencent/mm/plugin/card/model/ad:ehh	Lcom/tencent/mm/ai/b;
    //   34: getfield 156	com/tencent/mm/ai/b:fsH	Lcom/tencent/mm/ai/b$c;
    //   37: getfield 159	com/tencent/mm/ai/b$c:fsP	Lcom/tencent/mm/bt/a;
    //   40: checkcast 44	com/tencent/mm/protocal/protobuf/agw
    //   43: astore 7
    //   45: ldc 137
    //   47: new 161	java/lang/StringBuilder
    //   50: dup
    //   51: ldc 163
    //   53: invokespecial 166	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   56: aload 7
    //   58: getfield 169	com/tencent/mm/protocal/protobuf/agw:kdS	Ljava/lang/String;
    //   61: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   67: invokestatic 181	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   70: aload_0
    //   71: aload 7
    //   73: getfield 184	com/tencent/mm/protocal/protobuf/agw:wnp	Lcom/tencent/mm/protocal/protobuf/ol;
    //   76: putfield 186	com/tencent/mm/plugin/card/model/ad:kej	Lcom/tencent/mm/protocal/protobuf/ol;
    //   79: iload_2
    //   80: ifne +288 -> 368
    //   83: iload_3
    //   84: ifne +284 -> 368
    //   87: invokestatic 96	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   90: invokevirtual 102	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   93: getstatic 108	com/tencent/mm/storage/ac$a:xKi	Lcom/tencent/mm/storage/ac$a;
    //   96: aload 7
    //   98: getfield 187	com/tencent/mm/protocal/protobuf/agw:wno	Ljava/lang/String;
    //   101: invokevirtual 191	com/tencent/mm/storage/z:set	(Lcom/tencent/mm/storage/ac$a;Ljava/lang/Object;)V
    //   104: aload 7
    //   106: getfield 169	com/tencent/mm/protocal/protobuf/agw:kdS	Ljava/lang/String;
    //   109: astore 5
    //   111: invokestatic 197	java/lang/System:currentTimeMillis	()J
    //   114: lstore 8
    //   116: invokestatic 96	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   119: invokevirtual 102	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   122: getstatic 200	com/tencent/mm/storage/ac$a:xKh	Lcom/tencent/mm/storage/ac$a;
    //   125: aconst_null
    //   126: invokevirtual 114	com/tencent/mm/storage/z:get	(Lcom/tencent/mm/storage/ac$a;Ljava/lang/Object;)Ljava/lang/Object;
    //   129: checkcast 116	java/lang/String
    //   132: astore 6
    //   134: aload 6
    //   136: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   139: ifne +7 -> 146
    //   142: aload 6
    //   144: astore 5
    //   146: aload 5
    //   148: invokestatic 212	com/tencent/mm/plugin/card/d/j:Hm	(Ljava/lang/String;)Lcom/tencent/mm/protocal/protobuf/agz;
    //   151: astore 6
    //   153: invokestatic 218	com/tencent/mm/plugin/card/model/am:baW	()Lcom/tencent/mm/plugin/card/model/c;
    //   156: getfield 224	com/tencent/mm/plugin/card/model/c:bSd	Lcom/tencent/mm/sdk/e/e;
    //   159: ldc 226
    //   161: ldc 228
    //   163: invokeinterface 234 3 0
    //   168: pop
    //   169: aload 6
    //   171: ifnonnull +217 -> 388
    //   174: ldc 236
    //   176: ldc 238
    //   178: invokestatic 241	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   181: iconst_0
    //   182: istore 10
    //   184: aload_0
    //   185: iload 10
    //   187: putfield 32	com/tencent/mm/plugin/card/model/ad:kei	Z
    //   190: aload_0
    //   191: getfield 186	com/tencent/mm/plugin/card/model/ad:kej	Lcom/tencent/mm/protocal/protobuf/ol;
    //   194: ifnull +1229 -> 1423
    //   197: aload_0
    //   198: getfield 186	com/tencent/mm/plugin/card/model/ad:kej	Lcom/tencent/mm/protocal/protobuf/ol;
    //   201: invokevirtual 247	com/tencent/mm/protocal/protobuf/ol:toByteArray	()[B
    //   204: astore 11
    //   206: invokestatic 96	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   209: invokevirtual 102	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   212: astore 12
    //   214: getstatic 250	com/tencent/mm/storage/ac$a:xKC	Lcom/tencent/mm/storage/ac$a;
    //   217: astore 5
    //   219: new 116	java/lang/String
    //   222: astore 6
    //   224: aload 6
    //   226: aload 11
    //   228: iconst_0
    //   229: aload 11
    //   231: arraylength
    //   232: ldc 252
    //   234: invokespecial 255	java/lang/String:<init>	([BIILjava/lang/String;)V
    //   237: aload 12
    //   239: aload 5
    //   241: aload 6
    //   243: invokevirtual 191	com/tencent/mm/storage/z:set	(Lcom/tencent/mm/storage/ac$a;Ljava/lang/Object;)V
    //   246: aload_0
    //   247: aload 7
    //   249: getfield 258	com/tencent/mm/protocal/protobuf/agw:wnq	I
    //   252: putfield 260	com/tencent/mm/plugin/card/model/ad:kel	I
    //   255: aload_0
    //   256: getfield 260	com/tencent/mm/plugin/card/model/ad:kel	I
    //   259: ifge +8 -> 267
    //   262: aload_0
    //   263: iconst_0
    //   264: putfield 260	com/tencent/mm/plugin/card/model/ad:kel	I
    //   267: invokestatic 96	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   270: invokevirtual 102	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   273: getstatic 263	com/tencent/mm/storage/ac$a:xKE	Lcom/tencent/mm/storage/ac$a;
    //   276: aload_0
    //   277: getfield 260	com/tencent/mm/plugin/card/model/ad:kel	I
    //   280: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   283: invokevirtual 191	com/tencent/mm/storage/z:set	(Lcom/tencent/mm/storage/ac$a;Ljava/lang/Object;)V
    //   286: aload 7
    //   288: getfield 266	com/tencent/mm/protocal/protobuf/agw:wnr	Lcom/tencent/mm/protocal/protobuf/bvx;
    //   291: ifnull +1169 -> 1460
    //   294: aload_0
    //   295: aload 7
    //   297: getfield 266	com/tencent/mm/protocal/protobuf/agw:wnr	Lcom/tencent/mm/protocal/protobuf/bvx;
    //   300: putfield 268	com/tencent/mm/plugin/card/model/ad:kek	Lcom/tencent/mm/protocal/protobuf/bvx;
    //   303: aload 7
    //   305: getfield 266	com/tencent/mm/protocal/protobuf/agw:wnr	Lcom/tencent/mm/protocal/protobuf/bvx;
    //   308: invokevirtual 271	com/tencent/mm/protocal/protobuf/bvx:toByteArray	()[B
    //   311: astore 12
    //   313: invokestatic 96	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   316: invokevirtual 102	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   319: astore 6
    //   321: getstatic 274	com/tencent/mm/storage/ac$a:xKD	Lcom/tencent/mm/storage/ac$a;
    //   324: astore 5
    //   326: new 116	java/lang/String
    //   329: astore 7
    //   331: aload 7
    //   333: aload 12
    //   335: iconst_0
    //   336: aload 12
    //   338: arraylength
    //   339: ldc 252
    //   341: invokespecial 255	java/lang/String:<init>	([BIILjava/lang/String;)V
    //   344: aload 6
    //   346: aload 5
    //   348: aload 7
    //   350: invokevirtual 191	com/tencent/mm/storage/z:set	(Lcom/tencent/mm/storage/ac$a;Ljava/lang/Object;)V
    //   353: invokestatic 96	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   356: invokevirtual 102	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   359: getstatic 277	com/tencent/mm/storage/ac$a:xKF	Lcom/tencent/mm/storage/ac$a;
    //   362: getstatic 283	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   365: invokevirtual 191	com/tencent/mm/storage/z:set	(Lcom/tencent/mm/storage/ac$a;Ljava/lang/Object;)V
    //   368: aload_0
    //   369: getfield 128	com/tencent/mm/plugin/card/model/ad:ehi	Lcom/tencent/mm/ai/f;
    //   372: iload_2
    //   373: iload_3
    //   374: aload 4
    //   376: aload_0
    //   377: invokeinterface 289 5 0
    //   382: ldc 135
    //   384: invokestatic 122	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   387: return
    //   388: iconst_0
    //   389: istore 13
    //   391: iconst_0
    //   392: istore 10
    //   394: aload 6
    //   396: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   399: ifnull +1100 -> 1499
    //   402: new 297	java/util/HashMap
    //   405: dup
    //   406: invokespecial 298	java/util/HashMap:<init>	()V
    //   409: astore 12
    //   411: aload 12
    //   413: ldc_w 300
    //   416: iconst_2
    //   417: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   420: invokeinterface 306 3 0
    //   425: pop
    //   426: aload 12
    //   428: ldc_w 308
    //   431: iconst_2
    //   432: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   435: invokeinterface 306 3 0
    //   440: pop
    //   441: aload 12
    //   443: ldc_w 310
    //   446: iconst_3
    //   447: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   450: invokeinterface 306 3 0
    //   455: pop
    //   456: aload 12
    //   458: ldc_w 312
    //   461: iconst_5
    //   462: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   465: invokeinterface 306 3 0
    //   470: pop
    //   471: aload 6
    //   473: getfield 315	com/tencent/mm/protocal/protobuf/agz:wnx	I
    //   476: bipush 100
    //   478: if_icmpne +870 -> 1348
    //   481: aload 12
    //   483: ldc_w 300
    //   486: iconst_4
    //   487: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   490: invokeinterface 306 3 0
    //   495: pop
    //   496: invokestatic 96	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   499: getfield 319	com/tencent/mm/kernel/e:eJN	Lcom/tencent/mm/cd/h;
    //   502: invokestatic 325	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   505: invokevirtual 328	java/lang/Thread:getId	()J
    //   508: invokevirtual 334	com/tencent/mm/cd/h:iV	(J)J
    //   511: lstore 14
    //   513: aload 6
    //   515: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   518: getfield 340	com/tencent/mm/protocal/protobuf/ph:vWA	Lcom/tencent/mm/protocal/protobuf/pg;
    //   521: ifnull +972 -> 1493
    //   524: aload 6
    //   526: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   529: getfield 340	com/tencent/mm/protocal/protobuf/ph:vWA	Lcom/tencent/mm/protocal/protobuf/pg;
    //   532: getfield 346	com/tencent/mm/protocal/protobuf/pg:vWz	Ljava/util/LinkedList;
    //   535: ifnull +958 -> 1493
    //   538: aload 6
    //   540: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   543: getfield 340	com/tencent/mm/protocal/protobuf/ph:vWA	Lcom/tencent/mm/protocal/protobuf/pg;
    //   546: getfield 346	com/tencent/mm/protocal/protobuf/pg:vWz	Ljava/util/LinkedList;
    //   549: invokevirtual 352	java/util/LinkedList:size	()I
    //   552: ifle +941 -> 1493
    //   555: iconst_1
    //   556: istore 10
    //   558: aload 12
    //   560: ldc_w 300
    //   563: invokeinterface 355 2 0
    //   568: checkcast 143	java/lang/Integer
    //   571: invokevirtual 358	java/lang/Integer:intValue	()I
    //   574: istore_1
    //   575: aload 6
    //   577: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   580: getfield 340	com/tencent/mm/protocal/protobuf/ph:vWA	Lcom/tencent/mm/protocal/protobuf/pg;
    //   583: getfield 346	com/tencent/mm/protocal/protobuf/pg:vWz	Ljava/util/LinkedList;
    //   586: iload_1
    //   587: ldc_w 359
    //   590: imul
    //   591: iconst_3
    //   592: iadd
    //   593: invokestatic 363	com/tencent/mm/plugin/card/d/j:c	(Ljava/util/LinkedList;I)V
    //   596: aload 6
    //   598: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   601: getfield 340	com/tencent/mm/protocal/protobuf/ph:vWA	Lcom/tencent/mm/protocal/protobuf/pg;
    //   604: getfield 346	com/tencent/mm/protocal/protobuf/pg:vWz	Ljava/util/LinkedList;
    //   607: invokevirtual 352	java/util/LinkedList:size	()I
    //   610: iconst_0
    //   611: iadd
    //   612: istore 16
    //   614: iload 16
    //   616: istore_1
    //   617: iload 10
    //   619: istore 13
    //   621: aload 6
    //   623: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   626: getfield 366	com/tencent/mm/protocal/protobuf/ph:vWB	Lcom/tencent/mm/protocal/protobuf/pg;
    //   629: ifnull +107 -> 736
    //   632: iload 16
    //   634: istore_1
    //   635: iload 10
    //   637: istore 13
    //   639: aload 6
    //   641: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   644: getfield 366	com/tencent/mm/protocal/protobuf/ph:vWB	Lcom/tencent/mm/protocal/protobuf/pg;
    //   647: getfield 346	com/tencent/mm/protocal/protobuf/pg:vWz	Ljava/util/LinkedList;
    //   650: ifnull +86 -> 736
    //   653: iload 16
    //   655: istore_1
    //   656: iload 10
    //   658: istore 13
    //   660: aload 6
    //   662: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   665: getfield 366	com/tencent/mm/protocal/protobuf/ph:vWB	Lcom/tencent/mm/protocal/protobuf/pg;
    //   668: getfield 346	com/tencent/mm/protocal/protobuf/pg:vWz	Ljava/util/LinkedList;
    //   671: invokevirtual 352	java/util/LinkedList:size	()I
    //   674: ifle +62 -> 736
    //   677: iconst_1
    //   678: istore 13
    //   680: aload 12
    //   682: ldc_w 308
    //   685: invokeinterface 355 2 0
    //   690: checkcast 143	java/lang/Integer
    //   693: invokevirtual 358	java/lang/Integer:intValue	()I
    //   696: istore_1
    //   697: aload 6
    //   699: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   702: getfield 366	com/tencent/mm/protocal/protobuf/ph:vWB	Lcom/tencent/mm/protocal/protobuf/pg;
    //   705: getfield 346	com/tencent/mm/protocal/protobuf/pg:vWz	Ljava/util/LinkedList;
    //   708: iload_1
    //   709: ldc_w 359
    //   712: imul
    //   713: iconst_2
    //   714: iadd
    //   715: invokestatic 363	com/tencent/mm/plugin/card/d/j:c	(Ljava/util/LinkedList;I)V
    //   718: iload 16
    //   720: aload 6
    //   722: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   725: getfield 366	com/tencent/mm/protocal/protobuf/ph:vWB	Lcom/tencent/mm/protocal/protobuf/pg;
    //   728: getfield 346	com/tencent/mm/protocal/protobuf/pg:vWz	Ljava/util/LinkedList;
    //   731: invokevirtual 352	java/util/LinkedList:size	()I
    //   734: iadd
    //   735: istore_1
    //   736: iload_1
    //   737: istore 16
    //   739: iload 13
    //   741: istore 10
    //   743: aload 6
    //   745: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   748: getfield 369	com/tencent/mm/protocal/protobuf/ph:vWC	Lcom/tencent/mm/protocal/protobuf/pg;
    //   751: ifnull +109 -> 860
    //   754: iload_1
    //   755: istore 16
    //   757: iload 13
    //   759: istore 10
    //   761: aload 6
    //   763: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   766: getfield 369	com/tencent/mm/protocal/protobuf/ph:vWC	Lcom/tencent/mm/protocal/protobuf/pg;
    //   769: getfield 346	com/tencent/mm/protocal/protobuf/pg:vWz	Ljava/util/LinkedList;
    //   772: ifnull +88 -> 860
    //   775: iload_1
    //   776: istore 16
    //   778: iload 13
    //   780: istore 10
    //   782: aload 6
    //   784: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   787: getfield 369	com/tencent/mm/protocal/protobuf/ph:vWC	Lcom/tencent/mm/protocal/protobuf/pg;
    //   790: getfield 346	com/tencent/mm/protocal/protobuf/pg:vWz	Ljava/util/LinkedList;
    //   793: invokevirtual 352	java/util/LinkedList:size	()I
    //   796: ifle +64 -> 860
    //   799: iconst_1
    //   800: istore 10
    //   802: aload 12
    //   804: ldc_w 310
    //   807: invokeinterface 355 2 0
    //   812: checkcast 143	java/lang/Integer
    //   815: invokevirtual 358	java/lang/Integer:intValue	()I
    //   818: istore 16
    //   820: aload 6
    //   822: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   825: getfield 369	com/tencent/mm/protocal/protobuf/ph:vWC	Lcom/tencent/mm/protocal/protobuf/pg;
    //   828: getfield 346	com/tencent/mm/protocal/protobuf/pg:vWz	Ljava/util/LinkedList;
    //   831: iload 16
    //   833: ldc_w 359
    //   836: imul
    //   837: iconst_1
    //   838: iadd
    //   839: invokestatic 363	com/tencent/mm/plugin/card/d/j:c	(Ljava/util/LinkedList;I)V
    //   842: iload_1
    //   843: aload 6
    //   845: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   848: getfield 369	com/tencent/mm/protocal/protobuf/ph:vWC	Lcom/tencent/mm/protocal/protobuf/pg;
    //   851: getfield 346	com/tencent/mm/protocal/protobuf/pg:vWz	Ljava/util/LinkedList;
    //   854: invokevirtual 352	java/util/LinkedList:size	()I
    //   857: iadd
    //   858: istore 16
    //   860: iload 16
    //   862: istore_1
    //   863: iload 10
    //   865: istore 13
    //   867: aload 6
    //   869: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   872: getfield 372	com/tencent/mm/protocal/protobuf/ph:vWD	Lcom/tencent/mm/protocal/protobuf/pg;
    //   875: ifnull +84 -> 959
    //   878: iload 16
    //   880: istore_1
    //   881: iload 10
    //   883: istore 13
    //   885: aload 6
    //   887: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   890: getfield 372	com/tencent/mm/protocal/protobuf/ph:vWD	Lcom/tencent/mm/protocal/protobuf/pg;
    //   893: getfield 346	com/tencent/mm/protocal/protobuf/pg:vWz	Ljava/util/LinkedList;
    //   896: ifnull +63 -> 959
    //   899: iload 16
    //   901: istore_1
    //   902: iload 10
    //   904: istore 13
    //   906: aload 6
    //   908: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   911: getfield 372	com/tencent/mm/protocal/protobuf/ph:vWD	Lcom/tencent/mm/protocal/protobuf/pg;
    //   914: getfield 346	com/tencent/mm/protocal/protobuf/pg:vWz	Ljava/util/LinkedList;
    //   917: invokevirtual 352	java/util/LinkedList:size	()I
    //   920: ifle +39 -> 959
    //   923: iconst_1
    //   924: istore 13
    //   926: iload 16
    //   928: aload 6
    //   930: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   933: getfield 372	com/tencent/mm/protocal/protobuf/ph:vWD	Lcom/tencent/mm/protocal/protobuf/pg;
    //   936: getfield 346	com/tencent/mm/protocal/protobuf/pg:vWz	Ljava/util/LinkedList;
    //   939: invokevirtual 352	java/util/LinkedList:size	()I
    //   942: iadd
    //   943: istore_1
    //   944: aload 6
    //   946: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   949: getfield 372	com/tencent/mm/protocal/protobuf/ph:vWD	Lcom/tencent/mm/protocal/protobuf/pg;
    //   952: getfield 346	com/tencent/mm/protocal/protobuf/pg:vWz	Ljava/util/LinkedList;
    //   955: iconst_0
    //   956: invokestatic 375	com/tencent/mm/plugin/card/d/j:d	(Ljava/util/LinkedList;I)V
    //   959: iload_1
    //   960: istore 16
    //   962: iload 13
    //   964: istore 10
    //   966: aload 6
    //   968: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   971: getfield 378	com/tencent/mm/protocal/protobuf/ph:vWE	Lcom/tencent/mm/protocal/protobuf/pg;
    //   974: ifnull +125 -> 1099
    //   977: iload_1
    //   978: istore 16
    //   980: iload 13
    //   982: istore 10
    //   984: aload 6
    //   986: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   989: getfield 378	com/tencent/mm/protocal/protobuf/ph:vWE	Lcom/tencent/mm/protocal/protobuf/pg;
    //   992: getfield 346	com/tencent/mm/protocal/protobuf/pg:vWz	Ljava/util/LinkedList;
    //   995: ifnull +104 -> 1099
    //   998: iload_1
    //   999: istore 16
    //   1001: iload 13
    //   1003: istore 10
    //   1005: aload 6
    //   1007: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   1010: getfield 378	com/tencent/mm/protocal/protobuf/ph:vWE	Lcom/tencent/mm/protocal/protobuf/pg;
    //   1013: getfield 346	com/tencent/mm/protocal/protobuf/pg:vWz	Ljava/util/LinkedList;
    //   1016: invokevirtual 352	java/util/LinkedList:size	()I
    //   1019: ifle +80 -> 1099
    //   1022: iconst_1
    //   1023: istore 10
    //   1025: aload 12
    //   1027: ldc_w 312
    //   1030: invokeinterface 355 2 0
    //   1035: checkcast 143	java/lang/Integer
    //   1038: invokevirtual 358	java/lang/Integer:intValue	()I
    //   1041: ldc_w 359
    //   1044: imul
    //   1045: iconst_4
    //   1046: iadd
    //   1047: istore 16
    //   1049: aload 6
    //   1051: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   1054: getfield 378	com/tencent/mm/protocal/protobuf/ph:vWE	Lcom/tencent/mm/protocal/protobuf/pg;
    //   1057: getfield 346	com/tencent/mm/protocal/protobuf/pg:vWz	Ljava/util/LinkedList;
    //   1060: iload 16
    //   1062: invokestatic 363	com/tencent/mm/plugin/card/d/j:c	(Ljava/util/LinkedList;I)V
    //   1065: aload 6
    //   1067: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   1070: getfield 378	com/tencent/mm/protocal/protobuf/ph:vWE	Lcom/tencent/mm/protocal/protobuf/pg;
    //   1073: getfield 346	com/tencent/mm/protocal/protobuf/pg:vWz	Ljava/util/LinkedList;
    //   1076: iload 16
    //   1078: invokestatic 375	com/tencent/mm/plugin/card/d/j:d	(Ljava/util/LinkedList;I)V
    //   1081: iload_1
    //   1082: aload 6
    //   1084: getfield 295	com/tencent/mm/protocal/protobuf/agz:wnu	Lcom/tencent/mm/protocal/protobuf/ph;
    //   1087: getfield 378	com/tencent/mm/protocal/protobuf/ph:vWE	Lcom/tencent/mm/protocal/protobuf/pg;
    //   1090: getfield 346	com/tencent/mm/protocal/protobuf/pg:vWz	Ljava/util/LinkedList;
    //   1093: invokevirtual 352	java/util/LinkedList:size	()I
    //   1096: iadd
    //   1097: istore 16
    //   1099: invokestatic 96	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   1102: getfield 319	com/tencent/mm/kernel/e:eJN	Lcom/tencent/mm/cd/h;
    //   1105: lload 14
    //   1107: invokevirtual 382	com/tencent/mm/cd/h:mB	(J)I
    //   1110: pop
    //   1111: iload 10
    //   1113: istore 13
    //   1115: invokestatic 386	com/tencent/mm/plugin/card/model/am:bbb	()Lcom/tencent/mm/plugin/card/b/e;
    //   1118: ldc_w 388
    //   1121: aload 6
    //   1123: invokevirtual 394	com/tencent/mm/plugin/card/b/e:putValue	(Ljava/lang/String;Ljava/lang/Object;)V
    //   1126: invokestatic 96	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   1129: invokevirtual 102	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   1132: getstatic 397	com/tencent/mm/storage/ac$a:xKq	Lcom/tencent/mm/storage/ac$a;
    //   1135: aload 5
    //   1137: invokevirtual 191	com/tencent/mm/storage/z:set	(Lcom/tencent/mm/storage/ac$a;Ljava/lang/Object;)V
    //   1140: iload 13
    //   1142: istore 10
    //   1144: iload 16
    //   1146: ifle -962 -> 184
    //   1149: invokestatic 197	java/lang/System:currentTimeMillis	()J
    //   1152: lstore 14
    //   1154: new 399	java/util/ArrayList
    //   1157: dup
    //   1158: invokespecial 400	java/util/ArrayList:<init>	()V
    //   1161: astore 17
    //   1163: new 402	com/tencent/mars/smc/IDKey
    //   1166: dup
    //   1167: invokespecial 403	com/tencent/mars/smc/IDKey:<init>	()V
    //   1170: astore 12
    //   1172: aload 12
    //   1174: sipush 281
    //   1177: invokevirtual 406	com/tencent/mars/smc/IDKey:SetID	(I)V
    //   1180: aload 12
    //   1182: bipush 36
    //   1184: invokevirtual 409	com/tencent/mars/smc/IDKey:SetKey	(I)V
    //   1187: aload 12
    //   1189: lconst_1
    //   1190: invokevirtual 413	com/tencent/mars/smc/IDKey:SetValue	(J)V
    //   1193: new 402	com/tencent/mars/smc/IDKey
    //   1196: dup
    //   1197: invokespecial 403	com/tencent/mars/smc/IDKey:<init>	()V
    //   1200: astore 5
    //   1202: aload 5
    //   1204: sipush 281
    //   1207: invokevirtual 406	com/tencent/mars/smc/IDKey:SetID	(I)V
    //   1210: aload 5
    //   1212: bipush 37
    //   1214: invokevirtual 409	com/tencent/mars/smc/IDKey:SetKey	(I)V
    //   1217: aload 5
    //   1219: lload 14
    //   1221: lload 8
    //   1223: lsub
    //   1224: l2i
    //   1225: i2l
    //   1226: invokevirtual 413	com/tencent/mars/smc/IDKey:SetValue	(J)V
    //   1229: new 402	com/tencent/mars/smc/IDKey
    //   1232: dup
    //   1233: invokespecial 403	com/tencent/mars/smc/IDKey:<init>	()V
    //   1236: astore 6
    //   1238: aload 6
    //   1240: sipush 281
    //   1243: invokevirtual 406	com/tencent/mars/smc/IDKey:SetID	(I)V
    //   1246: aload 6
    //   1248: bipush 38
    //   1250: invokevirtual 409	com/tencent/mars/smc/IDKey:SetKey	(I)V
    //   1253: aload 6
    //   1255: iload 16
    //   1257: i2l
    //   1258: invokevirtual 413	com/tencent/mars/smc/IDKey:SetValue	(J)V
    //   1261: new 402	com/tencent/mars/smc/IDKey
    //   1264: dup
    //   1265: invokespecial 403	com/tencent/mars/smc/IDKey:<init>	()V
    //   1268: astore 11
    //   1270: aload 11
    //   1272: sipush 281
    //   1275: invokevirtual 406	com/tencent/mars/smc/IDKey:SetID	(I)V
    //   1278: aload 11
    //   1280: bipush 40
    //   1282: invokevirtual 409	com/tencent/mars/smc/IDKey:SetKey	(I)V
    //   1285: aload 11
    //   1287: lload 14
    //   1289: lload 8
    //   1291: lsub
    //   1292: l2i
    //   1293: iload 16
    //   1295: idiv
    //   1296: i2l
    //   1297: invokevirtual 413	com/tencent/mars/smc/IDKey:SetValue	(J)V
    //   1300: aload 17
    //   1302: aload 12
    //   1304: invokevirtual 417	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1307: pop
    //   1308: aload 17
    //   1310: aload 5
    //   1312: invokevirtual 417	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1315: pop
    //   1316: aload 17
    //   1318: aload 6
    //   1320: invokevirtual 417	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1323: pop
    //   1324: aload 17
    //   1326: aload 11
    //   1328: invokevirtual 417	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1331: pop
    //   1332: getstatic 423	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1335: aload 17
    //   1337: iconst_1
    //   1338: invokevirtual 427	com/tencent/mm/plugin/report/service/h:b	(Ljava/util/ArrayList;Z)V
    //   1341: iload 13
    //   1343: istore 10
    //   1345: goto -1161 -> 184
    //   1348: aload 6
    //   1350: getfield 315	com/tencent/mm/protocal/protobuf/agz:wnx	I
    //   1353: bipush 102
    //   1355: if_icmpne +21 -> 1376
    //   1358: aload 12
    //   1360: ldc_w 308
    //   1363: iconst_4
    //   1364: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1367: invokeinterface 306 3 0
    //   1372: pop
    //   1373: goto -877 -> 496
    //   1376: aload 6
    //   1378: getfield 315	com/tencent/mm/protocal/protobuf/agz:wnx	I
    //   1381: bipush 101
    //   1383: if_icmpne -887 -> 496
    //   1386: aload 12
    //   1388: ldc_w 310
    //   1391: iconst_4
    //   1392: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1395: invokeinterface 306 3 0
    //   1400: pop
    //   1401: goto -905 -> 496
    //   1404: astore 5
    //   1406: ldc 137
    //   1408: aload 5
    //   1410: ldc_w 429
    //   1413: iconst_0
    //   1414: anewarray 141	java/lang/Object
    //   1417: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1420: goto -1174 -> 246
    //   1423: invokestatic 96	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   1426: invokevirtual 102	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   1429: getstatic 250	com/tencent/mm/storage/ac$a:xKC	Lcom/tencent/mm/storage/ac$a;
    //   1432: ldc_w 429
    //   1435: invokevirtual 191	com/tencent/mm/storage/z:set	(Lcom/tencent/mm/storage/ac$a;Ljava/lang/Object;)V
    //   1438: goto -1192 -> 246
    //   1441: astore 5
    //   1443: ldc 137
    //   1445: aload 5
    //   1447: ldc_w 429
    //   1450: iconst_0
    //   1451: anewarray 141	java/lang/Object
    //   1454: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1457: goto -1104 -> 353
    //   1460: invokestatic 96	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   1463: invokevirtual 102	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   1466: getstatic 274	com/tencent/mm/storage/ac$a:xKD	Lcom/tencent/mm/storage/ac$a;
    //   1469: ldc_w 429
    //   1472: invokevirtual 191	com/tencent/mm/storage/z:set	(Lcom/tencent/mm/storage/ac$a;Ljava/lang/Object;)V
    //   1475: invokestatic 96	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   1478: invokevirtual 102	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   1481: getstatic 277	com/tencent/mm/storage/ac$a:xKF	Lcom/tencent/mm/storage/ac$a;
    //   1484: getstatic 436	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1487: invokevirtual 191	com/tencent/mm/storage/z:set	(Lcom/tencent/mm/storage/ac$a;Ljava/lang/Object;)V
    //   1490: goto -1122 -> 368
    //   1493: iconst_0
    //   1494: istore 16
    //   1496: goto -882 -> 614
    //   1499: iconst_0
    //   1500: istore 16
    //   1502: goto -387 -> 1115
    //
    // Exception table:
    //   from	to	target	type
    //   197	246	1404	java/io/IOException
    //   303	353	1441	java/io/IOException
  }

  public final int getType()
  {
    return 984;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.ad
 * JD-Core Version:    0.6.2
 */