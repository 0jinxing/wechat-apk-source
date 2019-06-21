package com.tencent.mm.plugin.webview.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.websearch.api.a;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.plugin.websearch.api.s;
import com.tencent.mm.plugin.websearch.api.z;
import com.tencent.mm.protocal.protobuf.caw;
import com.tencent.mm.protocal.protobuf.cmg;
import com.tencent.mm.protocal.protobuf.cvj;
import com.tencent.mm.protocal.protobuf.cvk;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class d extends a
  implements k
{
  private f ehi;
  private b fAT;
  private s fpL;
  private int scene;
  private int tZw;
  private cvk ufJ;
  private cvj ufK;

  // ERROR //
  public d(s params)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: invokespecial 28	com/tencent/mm/plugin/websearch/api/a:<init>	()V
    //   6: sipush 5714
    //   9: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   12: aload_0
    //   13: aload_1
    //   14: putfield 36	com/tencent/mm/plugin/webview/fts/d:fpL	Lcom/tencent/mm/plugin/websearch/api/s;
    //   17: aload_0
    //   18: aload_1
    //   19: getfield 42	com/tencent/mm/plugin/websearch/api/s:ctj	Ljava/lang/String;
    //   22: putfield 45	com/tencent/mm/plugin/webview/fts/d:tZu	Ljava/lang/String;
    //   25: aload_0
    //   26: aload_1
    //   27: getfield 48	com/tencent/mm/plugin/websearch/api/s:nQB	Ljava/lang/String;
    //   30: putfield 51	com/tencent/mm/plugin/webview/fts/d:cIz	Ljava/lang/String;
    //   33: aload_0
    //   34: aload_1
    //   35: getfield 54	com/tencent/mm/plugin/websearch/api/s:offset	I
    //   38: putfield 57	com/tencent/mm/plugin/webview/fts/d:Lp	I
    //   41: aload_0
    //   42: aload_1
    //   43: getfield 59	com/tencent/mm/plugin/websearch/api/s:scene	I
    //   46: putfield 62	com/tencent/mm/plugin/webview/fts/d:gOW	I
    //   49: aload_0
    //   50: aload_1
    //   51: getfield 65	com/tencent/mm/plugin/websearch/api/s:cIv	I
    //   54: putfield 68	com/tencent/mm/plugin/webview/fts/d:tZt	I
    //   57: aload_0
    //   58: aload_1
    //   59: getfield 70	com/tencent/mm/plugin/websearch/api/s:tZw	I
    //   62: putfield 71	com/tencent/mm/plugin/webview/fts/d:tZw	I
    //   65: aload_0
    //   66: aload_1
    //   67: putfield 36	com/tencent/mm/plugin/webview/fts/d:fpL	Lcom/tencent/mm/plugin/websearch/api/s;
    //   70: aload_0
    //   71: aload_1
    //   72: getfield 75	com/tencent/mm/plugin/websearch/api/s:tZN	Landroid/os/Bundle;
    //   75: putfield 78	com/tencent/mm/plugin/webview/fts/d:tZv	Landroid/os/Bundle;
    //   78: aload_1
    //   79: getfield 42	com/tencent/mm/plugin/websearch/api/s:ctj	Ljava/lang/String;
    //   82: invokestatic 84	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   85: ifne +1290 -> 1375
    //   88: ldc 86
    //   90: ldc 88
    //   92: iconst_1
    //   93: anewarray 90	java/lang/Object
    //   96: dup
    //   97: iconst_0
    //   98: aload_1
    //   99: getfield 42	com/tencent/mm/plugin/websearch/api/s:ctj	Ljava/lang/String;
    //   102: aastore
    //   103: invokestatic 95	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   106: aload_0
    //   107: aload_1
    //   108: getfield 59	com/tencent/mm/plugin/websearch/api/s:scene	I
    //   111: putfield 96	com/tencent/mm/plugin/webview/fts/d:scene	I
    //   114: new 98	com/tencent/mm/ai/b$a
    //   117: dup
    //   118: invokespecial 99	com/tencent/mm/ai/b$a:<init>	()V
    //   121: astore_3
    //   122: aload_1
    //   123: getfield 59	com/tencent/mm/plugin/websearch/api/s:scene	I
    //   126: sipush 201
    //   129: if_icmpeq +11 -> 140
    //   132: aload_1
    //   133: getfield 102	com/tencent/mm/plugin/websearch/api/s:tZI	I
    //   136: iconst_1
    //   137: if_icmpne +1172 -> 1309
    //   140: iconst_1
    //   141: istore 4
    //   143: iload 4
    //   145: ifeq +1170 -> 1315
    //   148: invokestatic 108	com/tencent/mm/plugin/appbrand/r/r:aNV	()Z
    //   151: ifeq +1164 -> 1315
    //   154: aload_3
    //   155: sipush 2676
    //   158: putfield 111	com/tencent/mm/ai/b$a:fsI	I
    //   161: aload_3
    //   162: ldc 113
    //   164: putfield 116	com/tencent/mm/ai/b$a:uri	Ljava/lang/String;
    //   167: aload_3
    //   168: new 118	com/tencent/mm/protocal/protobuf/cvj
    //   171: dup
    //   172: invokespecial 119	com/tencent/mm/protocal/protobuf/cvj:<init>	()V
    //   175: putfield 123	com/tencent/mm/ai/b$a:fsJ	Lcom/tencent/mm/bt/a;
    //   178: aload_3
    //   179: new 125	com/tencent/mm/protocal/protobuf/cvk
    //   182: dup
    //   183: invokespecial 126	com/tencent/mm/protocal/protobuf/cvk:<init>	()V
    //   186: putfield 129	com/tencent/mm/ai/b$a:fsK	Lcom/tencent/mm/bt/a;
    //   189: aload_0
    //   190: aload_3
    //   191: invokevirtual 133	com/tencent/mm/ai/b$a:acD	()Lcom/tencent/mm/ai/b;
    //   194: putfield 135	com/tencent/mm/plugin/webview/fts/d:fAT	Lcom/tencent/mm/ai/b;
    //   197: aload_0
    //   198: aload_0
    //   199: getfield 135	com/tencent/mm/plugin/webview/fts/d:fAT	Lcom/tencent/mm/ai/b;
    //   202: getfield 141	com/tencent/mm/ai/b:fsG	Lcom/tencent/mm/ai/b$b;
    //   205: getfield 146	com/tencent/mm/ai/b$b:fsP	Lcom/tencent/mm/bt/a;
    //   208: checkcast 118	com/tencent/mm/protocal/protobuf/cvj
    //   211: putfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   214: aload_0
    //   215: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   218: aload_1
    //   219: getfield 42	com/tencent/mm/plugin/websearch/api/s:ctj	Ljava/lang/String;
    //   222: putfield 151	com/tencent/mm/protocal/protobuf/cvj:wkD	Ljava/lang/String;
    //   225: aload_0
    //   226: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   229: aload_1
    //   230: getfield 70	com/tencent/mm/plugin/websearch/api/s:tZw	I
    //   233: putfield 154	com/tencent/mm/protocal/protobuf/cvj:wUr	I
    //   236: aload_0
    //   237: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   240: aload_1
    //   241: getfield 157	com/tencent/mm/plugin/websearch/api/s:businessType	I
    //   244: i2l
    //   245: putfield 161	com/tencent/mm/protocal/protobuf/cvj:vQd	J
    //   248: aload_0
    //   249: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   252: invokestatic 167	com/tencent/mm/plugin/websearch/api/aa:abJ	()Lcom/tencent/mm/protocal/protobuf/axy;
    //   255: putfield 171	com/tencent/mm/protocal/protobuf/cvj:wDI	Lcom/tencent/mm/protocal/protobuf/axy;
    //   258: aload_0
    //   259: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   262: aload_1
    //   263: getfield 54	com/tencent/mm/plugin/websearch/api/s:offset	I
    //   266: putfield 174	com/tencent/mm/protocal/protobuf/cvj:vOq	I
    //   269: aload_0
    //   270: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   273: iconst_0
    //   274: invokestatic 178	com/tencent/mm/plugin/websearch/api/aa:HV	(I)I
    //   277: putfield 181	com/tencent/mm/protocal/protobuf/cvj:wCu	I
    //   280: aload_0
    //   281: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   284: aload_1
    //   285: getfield 185	com/tencent/mm/plugin/websearch/api/s:tZx	Ljava/util/LinkedList;
    //   288: putfield 188	com/tencent/mm/protocal/protobuf/cvj:wWp	Ljava/util/LinkedList;
    //   291: aload_0
    //   292: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   295: aload_1
    //   296: getfield 59	com/tencent/mm/plugin/websearch/api/s:scene	I
    //   299: putfield 191	com/tencent/mm/protocal/protobuf/cvj:Scene	I
    //   302: aload_0
    //   303: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   306: aload_1
    //   307: getfield 194	com/tencent/mm/plugin/websearch/api/s:lcA	Ljava/lang/String;
    //   310: putfield 197	com/tencent/mm/protocal/protobuf/cvj:vQg	Ljava/lang/String;
    //   313: aload_0
    //   314: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   317: aload_1
    //   318: getfield 200	com/tencent/mm/plugin/websearch/api/s:cIC	I
    //   321: putfield 203	com/tencent/mm/protocal/protobuf/cvj:xrc	I
    //   324: aload_0
    //   325: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   328: aload_1
    //   329: getfield 206	com/tencent/mm/plugin/websearch/api/s:tZy	Ljava/lang/String;
    //   332: putfield 209	com/tencent/mm/protocal/protobuf/cvj:xro	Ljava/lang/String;
    //   335: aload_0
    //   336: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   339: aload_1
    //   340: getfield 212	com/tencent/mm/plugin/websearch/api/s:tZA	I
    //   343: putfield 215	com/tencent/mm/protocal/protobuf/cvj:xrq	I
    //   346: aload_0
    //   347: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   350: aload_1
    //   351: getfield 218	com/tencent/mm/plugin/websearch/api/s:tZz	Ljava/lang/String;
    //   354: putfield 221	com/tencent/mm/protocal/protobuf/cvj:xrp	Ljava/lang/String;
    //   357: aload_0
    //   358: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   361: aload_1
    //   362: getfield 224	com/tencent/mm/plugin/websearch/api/s:tZB	Ljava/util/LinkedList;
    //   365: putfield 227	com/tencent/mm/protocal/protobuf/cvj:xrr	Ljava/util/LinkedList;
    //   368: aload_0
    //   369: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   372: aload_1
    //   373: getfield 230	com/tencent/mm/plugin/websearch/api/s:tZG	Ljava/util/LinkedList;
    //   376: putfield 233	com/tencent/mm/protocal/protobuf/cvj:xqa	Ljava/util/LinkedList;
    //   379: aload_0
    //   380: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   383: getfield 233	com/tencent/mm/protocal/protobuf/cvj:xqa	Ljava/util/LinkedList;
    //   386: astore 5
    //   388: aload 5
    //   390: invokestatic 237	com/tencent/mm/sdk/platformtools/bo:ek	(Ljava/util/List;)Z
    //   393: ifne +121 -> 514
    //   396: aload 5
    //   398: invokevirtual 243	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   401: astore_3
    //   402: aload_3
    //   403: invokeinterface 248 1 0
    //   408: ifeq +992 -> 1400
    //   411: aload_3
    //   412: invokeinterface 252 1 0
    //   417: checkcast 254	com/tencent/mm/protocal/protobuf/tn
    //   420: astore 6
    //   422: aload 6
    //   424: ifnull -22 -> 402
    //   427: ldc_w 256
    //   430: aload 6
    //   432: getfield 259	com/tencent/mm/protocal/protobuf/tn:key	Ljava/lang/String;
    //   435: invokevirtual 265	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   438: ifeq -36 -> 402
    //   441: aload 6
    //   443: getfield 268	com/tencent/mm/protocal/protobuf/tn:waE	Ljava/lang/String;
    //   446: astore_3
    //   447: aload_3
    //   448: invokestatic 84	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   451: ifne +63 -> 514
    //   454: invokestatic 274	com/tencent/mm/model/v:Zp	()Lcom/tencent/mm/model/v;
    //   457: aload_3
    //   458: invokevirtual 278	com/tencent/mm/model/v:nV	(Ljava/lang/String;)Lcom/tencent/mm/model/v$b;
    //   461: astore_3
    //   462: aload_3
    //   463: ifnull +51 -> 514
    //   466: aload_3
    //   467: ldc_w 280
    //   470: ldc_w 282
    //   473: invokevirtual 288	com/tencent/mm/model/v$b:getString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   476: astore 6
    //   478: aload 6
    //   480: invokestatic 84	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   483: ifne +31 -> 514
    //   486: new 254	com/tencent/mm/protocal/protobuf/tn
    //   489: dup
    //   490: invokespecial 289	com/tencent/mm/protocal/protobuf/tn:<init>	()V
    //   493: astore_3
    //   494: aload_3
    //   495: ldc_w 280
    //   498: putfield 259	com/tencent/mm/protocal/protobuf/tn:key	Ljava/lang/String;
    //   501: aload_3
    //   502: aload 6
    //   504: putfield 268	com/tencent/mm/protocal/protobuf/tn:waE	Ljava/lang/String;
    //   507: aload 5
    //   509: aload_3
    //   510: invokevirtual 292	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   513: pop
    //   514: aload_0
    //   515: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   518: aload_1
    //   519: getfield 296	com/tencent/mm/plugin/websearch/api/s:tZF	Lcom/tencent/mm/protocal/protobuf/cgg;
    //   522: putfield 297	com/tencent/mm/protocal/protobuf/cvj:tZF	Lcom/tencent/mm/protocal/protobuf/cgg;
    //   525: aload_0
    //   526: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   529: aload_1
    //   530: getfield 300	com/tencent/mm/plugin/websearch/api/s:tZH	Ljava/util/LinkedList;
    //   533: putfield 303	com/tencent/mm/protocal/protobuf/cvj:xrs	Ljava/util/LinkedList;
    //   536: aload_0
    //   537: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   540: aload_1
    //   541: getfield 306	com/tencent/mm/plugin/websearch/api/s:aOt	Ljava/lang/String;
    //   544: putfield 309	com/tencent/mm/protocal/protobuf/cvj:luQ	Ljava/lang/String;
    //   547: aload_0
    //   548: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   551: aload_1
    //   552: getfield 312	com/tencent/mm/plugin/websearch/api/s:cvF	Ljava/lang/String;
    //   555: putfield 315	com/tencent/mm/protocal/protobuf/cvj:wCy	Ljava/lang/String;
    //   558: aload_1
    //   559: getfield 319	com/tencent/mm/plugin/websearch/api/s:tZK	Lcom/tencent/mm/protocal/protobuf/cvf;
    //   562: ifnonnull +14 -> 576
    //   565: aload_1
    //   566: new 321	com/tencent/mm/protocal/protobuf/cvf
    //   569: dup
    //   570: invokespecial 322	com/tencent/mm/protocal/protobuf/cvf:<init>	()V
    //   573: putfield 319	com/tencent/mm/plugin/websearch/api/s:tZK	Lcom/tencent/mm/protocal/protobuf/cvf;
    //   576: aload_1
    //   577: getfield 319	com/tencent/mm/plugin/websearch/api/s:tZK	Lcom/tencent/mm/protocal/protobuf/cvf;
    //   580: getfield 326	com/tencent/mm/protocal/protobuf/cvf:xrk	Lcom/tencent/mm/protocal/protobuf/li;
    //   583: ifnonnull +17 -> 600
    //   586: aload_1
    //   587: getfield 319	com/tencent/mm/plugin/websearch/api/s:tZK	Lcom/tencent/mm/protocal/protobuf/cvf;
    //   590: new 328	com/tencent/mm/protocal/protobuf/li
    //   593: dup
    //   594: invokespecial 329	com/tencent/mm/protocal/protobuf/li:<init>	()V
    //   597: putfield 326	com/tencent/mm/protocal/protobuf/cvf:xrk	Lcom/tencent/mm/protocal/protobuf/li;
    //   600: aload_1
    //   601: getfield 319	com/tencent/mm/plugin/websearch/api/s:tZK	Lcom/tencent/mm/protocal/protobuf/cvf;
    //   604: getfield 326	com/tencent/mm/protocal/protobuf/cvf:xrk	Lcom/tencent/mm/protocal/protobuf/li;
    //   607: invokestatic 335	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   610: invokevirtual 341	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   613: invokevirtual 347	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   616: getfield 352	android/util/DisplayMetrics:widthPixels	I
    //   619: invokestatic 357	com/tencent/mm/plugin/appbrand/r/p:qc	(I)I
    //   622: putfield 360	com/tencent/mm/protocal/protobuf/li:qzj	I
    //   625: ldc 86
    //   627: ldc_w 362
    //   630: iconst_3
    //   631: anewarray 90	java/lang/Object
    //   634: dup
    //   635: iconst_0
    //   636: invokestatic 335	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   639: invokevirtual 341	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   642: invokevirtual 347	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   645: getfield 352	android/util/DisplayMetrics:widthPixels	I
    //   648: invokestatic 368	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   651: aastore
    //   652: dup
    //   653: iconst_1
    //   654: aload_1
    //   655: getfield 319	com/tencent/mm/plugin/websearch/api/s:tZK	Lcom/tencent/mm/protocal/protobuf/cvf;
    //   658: getfield 326	com/tencent/mm/protocal/protobuf/cvf:xrk	Lcom/tencent/mm/protocal/protobuf/li;
    //   661: getfield 360	com/tencent/mm/protocal/protobuf/li:qzj	I
    //   664: invokestatic 368	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   667: aastore
    //   668: dup
    //   669: iconst_2
    //   670: invokestatic 335	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   673: invokevirtual 341	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   676: invokevirtual 347	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   679: getfield 372	android/util/DisplayMetrics:density	F
    //   682: invokestatic 377	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   685: aastore
    //   686: invokestatic 380	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   689: fconst_0
    //   690: fstore 7
    //   692: fconst_0
    //   693: fstore 8
    //   695: aload_0
    //   696: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   699: getfield 171	com/tencent/mm/protocal/protobuf/cvj:wDI	Lcom/tencent/mm/protocal/protobuf/axy;
    //   702: ifnull +636 -> 1338
    //   705: aload_1
    //   706: getfield 319	com/tencent/mm/plugin/websearch/api/s:tZK	Lcom/tencent/mm/protocal/protobuf/cvf;
    //   709: getfield 326	com/tencent/mm/protocal/protobuf/cvf:xrk	Lcom/tencent/mm/protocal/protobuf/li;
    //   712: astore_3
    //   713: invokestatic 386	com/tencent/mm/modelgeo/d:agz	()Lcom/tencent/mm/modelgeo/d;
    //   716: invokevirtual 389	com/tencent/mm/modelgeo/d:agC	()Z
    //   719: ifeq +613 -> 1332
    //   722: iconst_0
    //   723: istore 4
    //   725: aload_3
    //   726: iload 4
    //   728: putfield 392	com/tencent/mm/protocal/protobuf/li:vOU	I
    //   731: aload_0
    //   732: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   735: getfield 171	com/tencent/mm/protocal/protobuf/cvj:wDI	Lcom/tencent/mm/protocal/protobuf/axy;
    //   738: getfield 397	com/tencent/mm/protocal/protobuf/axy:vRp	F
    //   741: fstore 7
    //   743: aload_0
    //   744: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   747: getfield 171	com/tencent/mm/protocal/protobuf/cvj:wDI	Lcom/tencent/mm/protocal/protobuf/axy;
    //   750: getfield 400	com/tencent/mm/protocal/protobuf/axy:vRq	F
    //   753: fstore 8
    //   755: ldc 86
    //   757: ldc_w 402
    //   760: iconst_3
    //   761: anewarray 90	java/lang/Object
    //   764: dup
    //   765: iconst_0
    //   766: fload 7
    //   768: invokestatic 377	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   771: aastore
    //   772: dup
    //   773: iconst_1
    //   774: fload 8
    //   776: invokestatic 377	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   779: aastore
    //   780: dup
    //   781: iconst_2
    //   782: aload_1
    //   783: getfield 319	com/tencent/mm/plugin/websearch/api/s:tZK	Lcom/tencent/mm/protocal/protobuf/cvf;
    //   786: getfield 326	com/tencent/mm/protocal/protobuf/cvf:xrk	Lcom/tencent/mm/protocal/protobuf/li;
    //   789: getfield 392	com/tencent/mm/protocal/protobuf/li:vOU	I
    //   792: invokestatic 368	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   795: aastore
    //   796: invokestatic 95	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   799: aload_1
    //   800: getfield 405	com/tencent/mm/plugin/websearch/api/s:tZL	Ljava/lang/String;
    //   803: invokestatic 411	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   806: ifne +141 -> 947
    //   809: aload_1
    //   810: getfield 405	com/tencent/mm/plugin/websearch/api/s:tZL	Ljava/lang/String;
    //   813: invokestatic 417	java/net/URLDecoder:decode	(Ljava/lang/String;)Ljava/lang/String;
    //   816: astore 5
    //   818: new 419	org/json/JSONObject
    //   821: astore_3
    //   822: aload_3
    //   823: aload 5
    //   825: invokespecial 422	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   828: new 424	com/tencent/mm/protocal/protobuf/bkr
    //   831: astore 5
    //   833: aload 5
    //   835: invokespecial 425	com/tencent/mm/protocal/protobuf/bkr:<init>	()V
    //   838: aload 5
    //   840: aload_3
    //   841: ldc_w 427
    //   844: invokevirtual 430	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   847: putfield 433	com/tencent/mm/protocal/protobuf/bkr:guP	Ljava/lang/String;
    //   850: aload 5
    //   852: aload_3
    //   853: ldc_w 435
    //   856: invokevirtual 430	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   859: putfield 438	com/tencent/mm/protocal/protobuf/bkr:guW	Ljava/lang/String;
    //   862: aload 5
    //   864: aload_3
    //   865: ldc_w 440
    //   868: invokevirtual 444	org/json/JSONObject:optDouble	(Ljava/lang/String;)D
    //   871: d2f
    //   872: putfield 445	com/tencent/mm/protocal/protobuf/bkr:vRq	F
    //   875: aload 5
    //   877: aload_3
    //   878: ldc_w 447
    //   881: invokevirtual 444	org/json/JSONObject:optDouble	(Ljava/lang/String;)D
    //   884: d2f
    //   885: putfield 448	com/tencent/mm/protocal/protobuf/bkr:vRp	F
    //   888: aload 5
    //   890: aload_3
    //   891: ldc_w 450
    //   894: invokevirtual 430	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   897: putfield 453	com/tencent/mm/protocal/protobuf/bkr:wNK	Ljava/lang/String;
    //   900: aload 5
    //   902: aload_3
    //   903: ldc_w 455
    //   906: invokevirtual 430	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   909: putfield 458	com/tencent/mm/protocal/protobuf/bkr:wxQ	Ljava/lang/String;
    //   912: aload 5
    //   914: aload_3
    //   915: ldc_w 460
    //   918: invokevirtual 430	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   921: invokestatic 464	com/tencent/mm/plugin/websearch/api/aa:Xq	(Ljava/lang/String;)J
    //   924: putfield 467	com/tencent/mm/protocal/protobuf/bkr:wNM	J
    //   927: aload 5
    //   929: getfield 453	com/tencent/mm/protocal/protobuf/bkr:wNK	Ljava/lang/String;
    //   932: invokestatic 411	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   935: ifne +12 -> 947
    //   938: aload_0
    //   939: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   942: aload 5
    //   944: putfield 471	com/tencent/mm/protocal/protobuf/cvj:xrv	Lcom/tencent/mm/protocal/protobuf/bkr;
    //   947: aload_1
    //   948: getfield 319	com/tencent/mm/plugin/websearch/api/s:tZK	Lcom/tencent/mm/protocal/protobuf/cvf;
    //   951: ifnull +103 -> 1054
    //   954: aload_1
    //   955: getfield 319	com/tencent/mm/plugin/websearch/api/s:tZK	Lcom/tencent/mm/protocal/protobuf/cvf;
    //   958: ldc_w 473
    //   961: invokestatic 479	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   964: checkcast 473	com/tencent/mm/plugin/appbrand/service/a
    //   967: invokeinterface 483 1 0
    //   972: putfield 486	com/tencent/mm/protocal/protobuf/cvf:xrl	I
    //   975: aload_0
    //   976: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   979: astore_3
    //   980: new 488	com/tencent/mm/bt/b
    //   983: astore 5
    //   985: aload 5
    //   987: aload_1
    //   988: getfield 319	com/tencent/mm/plugin/websearch/api/s:tZK	Lcom/tencent/mm/protocal/protobuf/cvf;
    //   991: invokevirtual 492	com/tencent/mm/protocal/protobuf/cvf:toByteArray	()[B
    //   994: invokespecial 495	com/tencent/mm/bt/b:<init>	([B)V
    //   997: aload_3
    //   998: aload 5
    //   1000: putfield 499	com/tencent/mm/protocal/protobuf/cvj:wCz	Lcom/tencent/mm/bt/b;
    //   1003: ldc 86
    //   1005: ldc_w 501
    //   1008: iconst_3
    //   1009: anewarray 90	java/lang/Object
    //   1012: dup
    //   1013: iconst_0
    //   1014: aload_1
    //   1015: getfield 319	com/tencent/mm/plugin/websearch/api/s:tZK	Lcom/tencent/mm/protocal/protobuf/cvf;
    //   1018: getfield 504	com/tencent/mm/protocal/protobuf/cvf:xrj	J
    //   1021: invokestatic 509	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1024: aastore
    //   1025: dup
    //   1026: iconst_1
    //   1027: aload_1
    //   1028: getfield 319	com/tencent/mm/plugin/websearch/api/s:tZK	Lcom/tencent/mm/protocal/protobuf/cvf;
    //   1031: getfield 326	com/tencent/mm/protocal/protobuf/cvf:xrk	Lcom/tencent/mm/protocal/protobuf/li;
    //   1034: getfield 512	com/tencent/mm/protocal/protobuf/li:csB	Ljava/lang/String;
    //   1037: aastore
    //   1038: dup
    //   1039: iconst_2
    //   1040: aload_1
    //   1041: getfield 319	com/tencent/mm/plugin/websearch/api/s:tZK	Lcom/tencent/mm/protocal/protobuf/cvf;
    //   1044: getfield 326	com/tencent/mm/protocal/protobuf/cvf:xrk	Lcom/tencent/mm/protocal/protobuf/li;
    //   1047: getfield 515	com/tencent/mm/protocal/protobuf/li:kLN	Ljava/lang/String;
    //   1050: aastore
    //   1051: invokestatic 380	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1054: aload_1
    //   1055: getfield 519	com/tencent/mm/plugin/websearch/api/s:tZJ	Lcom/tencent/mm/protocal/protobuf/cxo;
    //   1058: ifnull +31 -> 1089
    //   1061: aload_0
    //   1062: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   1065: astore_3
    //   1066: new 488	com/tencent/mm/bt/b
    //   1069: astore 5
    //   1071: aload 5
    //   1073: aload_1
    //   1074: getfield 519	com/tencent/mm/plugin/websearch/api/s:tZJ	Lcom/tencent/mm/protocal/protobuf/cxo;
    //   1077: invokevirtual 522	com/tencent/mm/protocal/protobuf/cxo:toByteArray	()[B
    //   1080: invokespecial 495	com/tencent/mm/bt/b:<init>	([B)V
    //   1083: aload_3
    //   1084: aload 5
    //   1086: putfield 525	com/tencent/mm/protocal/protobuf/cvj:wCA	Lcom/tencent/mm/bt/b;
    //   1089: aload_0
    //   1090: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   1093: getfield 171	com/tencent/mm/protocal/protobuf/cvj:wDI	Lcom/tencent/mm/protocal/protobuf/axy;
    //   1096: ifnull +273 -> 1369
    //   1099: iconst_1
    //   1100: istore 9
    //   1102: ldc 86
    //   1104: ldc_w 527
    //   1107: bipush 7
    //   1109: anewarray 90	java/lang/Object
    //   1112: dup
    //   1113: iconst_0
    //   1114: iload 9
    //   1116: invokestatic 532	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1119: aastore
    //   1120: dup
    //   1121: iconst_1
    //   1122: aload_1
    //   1123: getfield 185	com/tencent/mm/plugin/websearch/api/s:tZx	Ljava/util/LinkedList;
    //   1126: invokevirtual 535	java/util/LinkedList:size	()I
    //   1129: invokestatic 368	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1132: aastore
    //   1133: dup
    //   1134: iconst_2
    //   1135: aload_1
    //   1136: getfield 59	com/tencent/mm/plugin/websearch/api/s:scene	I
    //   1139: invokestatic 368	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1142: aastore
    //   1143: dup
    //   1144: iconst_3
    //   1145: aload_1
    //   1146: getfield 157	com/tencent/mm/plugin/websearch/api/s:businessType	I
    //   1149: invokestatic 368	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1152: aastore
    //   1153: dup
    //   1154: iconst_4
    //   1155: aload_0
    //   1156: getfield 71	com/tencent/mm/plugin/webview/fts/d:tZw	I
    //   1159: invokestatic 368	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1162: aastore
    //   1163: dup
    //   1164: iconst_5
    //   1165: aload_1
    //   1166: getfield 200	com/tencent/mm/plugin/websearch/api/s:cIC	I
    //   1169: invokestatic 368	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1172: aastore
    //   1173: dup
    //   1174: bipush 6
    //   1176: aload_1
    //   1177: getfield 65	com/tencent/mm/plugin/websearch/api/s:cIv	I
    //   1180: invokestatic 368	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1183: aastore
    //   1184: invokestatic 95	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1187: aload_0
    //   1188: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   1191: getfield 171	com/tencent/mm/protocal/protobuf/cvj:wDI	Lcom/tencent/mm/protocal/protobuf/axy;
    //   1194: ifnull +39 -> 1233
    //   1197: sipush 2005
    //   1200: aload_0
    //   1201: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   1204: getfield 171	com/tencent/mm/protocal/protobuf/cvj:wDI	Lcom/tencent/mm/protocal/protobuf/axy;
    //   1207: getfield 397	com/tencent/mm/protocal/protobuf/axy:vRp	F
    //   1210: aload_0
    //   1211: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   1214: getfield 171	com/tencent/mm/protocal/protobuf/cvj:wDI	Lcom/tencent/mm/protocal/protobuf/axy;
    //   1217: getfield 400	com/tencent/mm/protocal/protobuf/axy:vRq	F
    //   1220: aload_0
    //   1221: getfield 148	com/tencent/mm/plugin/webview/fts/d:ufK	Lcom/tencent/mm/protocal/protobuf/cvj;
    //   1224: getfield 171	com/tencent/mm/protocal/protobuf/cvj:wDI	Lcom/tencent/mm/protocal/protobuf/axy;
    //   1227: getfield 538	com/tencent/mm/protocal/protobuf/axy:wfG	I
    //   1230: invokestatic 544	com/tencent/mm/modelstat/o:a	(IFFI)V
    //   1233: aload_1
    //   1234: getfield 59	com/tencent/mm/plugin/websearch/api/s:scene	I
    //   1237: istore 4
    //   1239: aload_1
    //   1240: getfield 312	com/tencent/mm/plugin/websearch/api/s:cvF	Ljava/lang/String;
    //   1243: astore 6
    //   1245: aload_1
    //   1246: getfield 547	com/tencent/mm/plugin/websearch/api/s:cIy	Ljava/lang/String;
    //   1249: astore_3
    //   1250: aload_1
    //   1251: getfield 194	com/tencent/mm/plugin/websearch/api/s:lcA	Ljava/lang/String;
    //   1254: astore 5
    //   1256: aload_1
    //   1257: getfield 54	com/tencent/mm/plugin/websearch/api/s:offset	I
    //   1260: istore 10
    //   1262: iload_2
    //   1263: istore 9
    //   1265: aload_1
    //   1266: getfield 70	com/tencent/mm/plugin/websearch/api/s:tZw	I
    //   1269: iconst_1
    //   1270: if_icmpne +6 -> 1276
    //   1273: iconst_1
    //   1274: istore 9
    //   1276: iload 4
    //   1278: aload 6
    //   1280: aload_3
    //   1281: aload 5
    //   1283: iload 10
    //   1285: iload 9
    //   1287: aload_1
    //   1288: getfield 48	com/tencent/mm/plugin/websearch/api/s:nQB	Ljava/lang/String;
    //   1291: aload_1
    //   1292: getfield 42	com/tencent/mm/plugin/websearch/api/s:ctj	Ljava/lang/String;
    //   1295: aload_1
    //   1296: getfield 157	com/tencent/mm/plugin/websearch/api/s:businessType	I
    //   1299: invokestatic 552	com/tencent/mm/plugin/websearch/api/z:a	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;I)V
    //   1302: sipush 5714
    //   1305: invokestatic 555	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1308: return
    //   1309: iconst_0
    //   1310: istore 4
    //   1312: goto -1169 -> 143
    //   1315: aload_3
    //   1316: sipush 719
    //   1319: putfield 111	com/tencent/mm/ai/b$a:fsI	I
    //   1322: aload_3
    //   1323: ldc_w 557
    //   1326: putfield 116	com/tencent/mm/ai/b$a:uri	Ljava/lang/String;
    //   1329: goto -1162 -> 167
    //   1332: iconst_1
    //   1333: istore 4
    //   1335: goto -610 -> 725
    //   1338: aload_1
    //   1339: getfield 319	com/tencent/mm/plugin/websearch/api/s:tZK	Lcom/tencent/mm/protocal/protobuf/cvf;
    //   1342: getfield 326	com/tencent/mm/protocal/protobuf/cvf:xrk	Lcom/tencent/mm/protocal/protobuf/li;
    //   1345: iconst_1
    //   1346: putfield 392	com/tencent/mm/protocal/protobuf/li:vOU	I
    //   1349: goto -594 -> 755
    //   1352: astore_3
    //   1353: ldc 86
    //   1355: aload_3
    //   1356: ldc_w 282
    //   1359: iconst_0
    //   1360: anewarray 90	java/lang/Object
    //   1363: invokestatic 561	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1366: goto -419 -> 947
    //   1369: iconst_0
    //   1370: istore 9
    //   1372: goto -270 -> 1102
    //   1375: ldc 86
    //   1377: ldc_w 563
    //   1380: invokestatic 567	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1383: sipush 5714
    //   1386: invokestatic 555	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1389: goto -81 -> 1308
    //   1392: astore_3
    //   1393: goto -304 -> 1089
    //   1396: astore_3
    //   1397: goto -343 -> 1054
    //   1400: aconst_null
    //   1401: astore_3
    //   1402: goto -955 -> 447
    //
    // Exception table:
    //   from	to	target	type
    //   818	947	1352	org/json/JSONException
    //   1061	1089	1392	java/lang/Exception
    //   954	1054	1396	java/lang/Exception
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(5715);
    an.gp(this.scene, 2);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(5715);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(5716);
    ab.i("MicroMsg.FTS.NetSceneWebSearch", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    boolean bool1;
    int i;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      bool1 = true;
      if ((paramInt2 == 0) && (paramInt3 == 0))
        break label200;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      paramInt1 = this.fpL.scene;
      paramString = this.fpL.cvF;
      paramArrayOfByte = this.fpL.cIy;
      paramq = this.fpL.lcA;
      i = this.fpL.offset;
      if (this.fpL.tZw != 1)
        break label194;
    }
    label194: for (boolean bool2 = true; ; bool2 = false)
    {
      z.a(paramInt1, paramString, paramArrayOfByte, paramq, i, bool2, this.fpL.nQB, bool1, this.fpL.ctj, this.fpL.businessType);
      an.an(this.scene, paramInt2, paramInt3);
      AppMethodBeat.o(5716);
      return;
      bool1 = false;
      break;
    }
    label200: this.ufJ = ((cvk)this.fAT.fsH.fsP);
    String str;
    if (this.ufJ != null)
    {
      i = this.fpL.scene;
      str = this.fpL.cvF;
      paramArrayOfByte = this.fpL.cIy;
      paramq = this.fpL.lcA;
      paramInt1 = this.fpL.offset;
      if (this.fpL.tZw != 1)
        break label373;
    }
    label373: for (bool2 = true; ; bool2 = false)
    {
      z.a(i, str, paramArrayOfByte, paramq, paramInt1, bool2, this.fpL.nQB, bool1, this.fpL.ctj, this.fpL.businessType);
      ab.v("MicroMsg.FTS.NetSceneWebSearch", "return data\n%s", new Object[] { this.ufJ.vOy });
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      an.an(this.scene, paramInt2, paramInt3);
      AppMethodBeat.o(5716);
      break;
    }
  }

  public final String abH()
  {
    if (this.ufJ != null);
    for (String str = this.ufJ.vOy; ; str = "")
      return str;
  }

  public final int abI()
  {
    if (this.ufJ != null);
    for (int i = this.ufJ.wCB; ; i = 0)
      return i;
  }

  public final void ax(LinkedList<cmg> paramLinkedList)
  {
    AppMethodBeat.i(5717);
    this.ufK.wWp = paramLinkedList;
    caw localcaw = new caw();
    localcaw.xab = paramLinkedList.size();
    this.ufK.xrt = localcaw;
    AppMethodBeat.o(5717);
  }

  public final int getType()
  {
    return 719;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.d
 * JD-Core Version:    0.6.2
 */