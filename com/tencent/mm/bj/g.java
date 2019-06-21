package com.tencent.mm.bj;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class g
{
  private int eTa;
  private String eys;
  private a fYk;
  private a fYl;
  private List<a> fYm;
  private List<a> fYn;
  private String fYo;
  private String fYp;
  private VideoTransPara fYq;
  private long fYr;
  private long fYs;
  private int fYt;
  boolean fYu;
  boolean fYv;
  private boolean isInited;
  private MediaExtractor mMediaExtractor;
  private int mRotationDegree;

  public g()
  {
    AppMethodBeat.i(50932);
    this.fYm = new ArrayList();
    this.fYn = new ArrayList();
    this.fYt = -1;
    this.mRotationDegree = -1;
    this.isInited = false;
    this.fYu = false;
    this.fYv = false;
    AppMethodBeat.o(50932);
  }

  // ERROR //
  private int a(MediaExtractor paramMediaExtractor, int paramInt1, int paramInt2, String paramString)
  {
    // Byte code:
    //   0: ldc 69
    //   2: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 71
    //   7: ldc 73
    //   9: invokestatic 78	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   12: aconst_null
    //   13: astore 5
    //   15: new 80	com/tencent/mm/bj/h
    //   18: astore 6
    //   20: aload 6
    //   22: aload_0
    //   23: getfield 82	com/tencent/mm/bj/g:eTa	I
    //   26: invokespecial 84	com/tencent/mm/bj/h:<init>	(I)V
    //   29: aload 6
    //   31: aload_0
    //   32: getfield 86	com/tencent/mm/bj/g:fYr	J
    //   35: putfield 89	com/tencent/mm/bj/h:bqO	J
    //   38: aload 6
    //   40: aload_0
    //   41: getfield 91	com/tencent/mm/bj/g:fYs	J
    //   44: putfield 94	com/tencent/mm/bj/h:eTA	J
    //   47: aload_0
    //   48: getfield 96	com/tencent/mm/bj/g:fYq	Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   51: astore 5
    //   53: ldc 98
    //   55: ldc 100
    //   57: iconst_1
    //   58: anewarray 4	java/lang/Object
    //   61: dup
    //   62: iconst_0
    //   63: aload 5
    //   65: aastore
    //   66: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   69: aload 6
    //   71: aload 5
    //   73: putfield 106	com/tencent/mm/bj/h:fYK	Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   76: aload_0
    //   77: getfield 55	com/tencent/mm/bj/g:mRotationDegree	I
    //   80: bipush 90
    //   82: if_icmpeq +13 -> 95
    //   85: aload_0
    //   86: getfield 55	com/tencent/mm/bj/g:mRotationDegree	I
    //   89: sipush 270
    //   92: if_icmpne +845 -> 937
    //   95: aload 6
    //   97: aload 5
    //   99: getfield 111	com/tencent/mm/modelcontrol/VideoTransPara:height	I
    //   102: aload 5
    //   104: getfield 114	com/tencent/mm/modelcontrol/VideoTransPara:width	I
    //   107: invokevirtual 118	com/tencent/mm/bj/h:cE	(II)V
    //   110: aload 6
    //   112: aload 4
    //   114: putfield 121	com/tencent/mm/bj/h:fYM	Ljava/lang/String;
    //   117: aload_0
    //   118: getfield 55	com/tencent/mm/bj/g:mRotationDegree	I
    //   121: istore 7
    //   123: ldc 98
    //   125: ldc 123
    //   127: iconst_1
    //   128: anewarray 4	java/lang/Object
    //   131: dup
    //   132: iconst_0
    //   133: iload 7
    //   135: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   138: aastore
    //   139: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   142: aload 6
    //   144: iload 7
    //   146: putfield 132	com/tencent/mm/bj/h:rotate	I
    //   149: aload 6
    //   151: aload_0
    //   152: getfield 61	com/tencent/mm/bj/g:fYv	Z
    //   155: putfield 133	com/tencent/mm/bj/h:fYv	Z
    //   158: ldc 71
    //   160: ldc 135
    //   162: invokestatic 78	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   165: ldc 71
    //   167: ldc 137
    //   169: invokestatic 78	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   172: aload_1
    //   173: aload_0
    //   174: getfield 139	com/tencent/mm/bj/g:fYk	Lcom/tencent/mm/bj/g$a;
    //   177: getfield 142	com/tencent/mm/bj/g$a:index	I
    //   180: invokevirtual 147	android/media/MediaExtractor:selectTrack	(I)V
    //   183: aload_1
    //   184: aload_0
    //   185: getfield 86	com/tencent/mm/bj/g:fYr	J
    //   188: ldc2_w 148
    //   191: lmul
    //   192: iconst_0
    //   193: invokevirtual 153	android/media/MediaExtractor:seekTo	(JI)V
    //   196: aload_0
    //   197: getfield 96	com/tencent/mm/bj/g:fYq	Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   200: astore 4
    //   202: aload 4
    //   204: getfield 156	com/tencent/mm/modelcontrol/VideoTransPara:duration	I
    //   207: ifle +786 -> 993
    //   210: aload 4
    //   212: getfield 156	com/tencent/mm/modelcontrol/VideoTransPara:duration	I
    //   215: istore 7
    //   217: aload_0
    //   218: iload 7
    //   220: invokestatic 162	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:initDataBufLock	(I)I
    //   223: putfield 82	com/tencent/mm/bj/g:eTa	I
    //   226: invokestatic 168	com/tencent/mm/sdk/platformtools/bo:yz	()J
    //   229: lstore 8
    //   231: aload_0
    //   232: getfield 139	com/tencent/mm/bj/g:fYk	Lcom/tencent/mm/bj/g$a;
    //   235: getfield 142	com/tencent/mm/bj/g$a:index	I
    //   238: istore 7
    //   240: aload 6
    //   242: aload_1
    //   243: putfield 171	com/tencent/mm/bj/h:eWb	Landroid/media/MediaExtractor;
    //   246: aload 6
    //   248: iload 7
    //   250: putfield 174	com/tencent/mm/bj/h:eWc	I
    //   253: aload 6
    //   255: aload_0
    //   256: getfield 139	com/tencent/mm/bj/g:fYk	Lcom/tencent/mm/bj/g$a;
    //   259: getfield 178	com/tencent/mm/bj/g$a:mediaFormat	Landroid/media/MediaFormat;
    //   262: aload_0
    //   263: getfield 59	com/tencent/mm/bj/g:fYu	Z
    //   266: invokevirtual 181	com/tencent/mm/bj/h:a	(Landroid/media/MediaFormat;Z)I
    //   269: istore 7
    //   271: iload 7
    //   273: ifge +20 -> 293
    //   276: aload_0
    //   277: getfield 82	com/tencent/mm/bj/g:eTa	I
    //   280: invokestatic 184	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:releaseDataBuf	(I)V
    //   283: aload_1
    //   284: invokevirtual 187	android/media/MediaExtractor:release	()V
    //   287: getstatic 193	com/tencent/mm/bj/b:fXS	Lcom/tencent/mm/bj/b;
    //   290: invokevirtual 196	com/tencent/mm/bj/b:WY	()V
    //   293: aload 6
    //   295: getfield 121	com/tencent/mm/bj/h:fYM	Ljava/lang/String;
    //   298: invokestatic 200	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   301: ifne +146 -> 447
    //   304: aload 6
    //   306: getfield 121	com/tencent/mm/bj/h:fYM	Ljava/lang/String;
    //   309: invokestatic 206	com/tencent/mm/plugin/sight/base/SightVideoJNI:getSimpleMp4Info	(Ljava/lang/String;)Ljava/lang/String;
    //   312: astore 10
    //   314: ldc 98
    //   316: ldc 208
    //   318: iconst_1
    //   319: anewarray 4	java/lang/Object
    //   322: dup
    //   323: iconst_0
    //   324: aload 10
    //   326: aastore
    //   327: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   330: aload 10
    //   332: invokestatic 200	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   335: istore 11
    //   337: iload 11
    //   339: ifne +108 -> 447
    //   342: new 210	org/json/JSONObject
    //   345: astore 5
    //   347: aload 5
    //   349: aload 10
    //   351: invokespecial 213	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   354: aload 5
    //   356: ldc 215
    //   358: invokevirtual 219	org/json/JSONObject:getDouble	(Ljava/lang/String;)D
    //   361: d2i
    //   362: istore 7
    //   364: aload 6
    //   366: getfield 106	com/tencent/mm/bj/h:fYK	Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   369: ifnull +631 -> 1000
    //   372: aload 6
    //   374: getfield 106	com/tencent/mm/bj/h:fYK	Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   377: getfield 222	com/tencent/mm/modelcontrol/VideoTransPara:fps	I
    //   380: ifle +620 -> 1000
    //   383: aload 6
    //   385: getfield 106	com/tencent/mm/bj/h:fYK	Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   388: getfield 222	com/tencent/mm/modelcontrol/VideoTransPara:fps	I
    //   391: i2d
    //   392: dstore 12
    //   394: aload 6
    //   396: iload 7
    //   398: i2d
    //   399: dload 12
    //   401: ddiv
    //   402: invokestatic 228	java/lang/Math:ceil	(D)D
    //   405: d2i
    //   406: putfield 231	com/tencent/mm/bj/h:eTJ	I
    //   409: ldc 98
    //   411: ldc 233
    //   413: iconst_3
    //   414: anewarray 4	java/lang/Object
    //   417: dup
    //   418: iconst_0
    //   419: aload 6
    //   421: getfield 231	com/tencent/mm/bj/h:eTJ	I
    //   424: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   427: aastore
    //   428: dup
    //   429: iconst_1
    //   430: iload 7
    //   432: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   435: aastore
    //   436: dup
    //   437: iconst_2
    //   438: dload 12
    //   440: invokestatic 238	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   443: aastore
    //   444: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   447: aload 6
    //   449: getfield 242	com/tencent/mm/bj/h:fYN	Lcom/tencent/mm/bj/a;
    //   452: aload 6
    //   454: getfield 231	com/tencent/mm/bj/h:eTJ	I
    //   457: invokeinterface 247 2 0
    //   462: aload 6
    //   464: getfield 242	com/tencent/mm/bj/h:fYN	Lcom/tencent/mm/bj/a;
    //   467: astore 10
    //   469: new 249	com/tencent/mm/bj/h$2
    //   472: astore 5
    //   474: aload 5
    //   476: aload 6
    //   478: invokespecial 252	com/tencent/mm/bj/h$2:<init>	(Lcom/tencent/mm/bj/h;)V
    //   481: aload 10
    //   483: aload 5
    //   485: invokeinterface 256 2 0
    //   490: lload 8
    //   492: invokestatic 260	com/tencent/mm/sdk/platformtools/bo:az	(J)J
    //   495: lstore 8
    //   497: aload_1
    //   498: aload_0
    //   499: getfield 139	com/tencent/mm/bj/g:fYk	Lcom/tencent/mm/bj/g$a;
    //   502: getfield 142	com/tencent/mm/bj/g$a:index	I
    //   505: invokevirtual 263	android/media/MediaExtractor:unselectTrack	(I)V
    //   508: aload_0
    //   509: getfield 265	com/tencent/mm/bj/g:fYl	Lcom/tencent/mm/bj/g$a;
    //   512: ifnull +45 -> 557
    //   515: invokestatic 168	com/tencent/mm/sdk/platformtools/bo:yz	()J
    //   518: lstore 14
    //   520: aload_0
    //   521: aload_1
    //   522: iload_2
    //   523: iload_3
    //   524: invokespecial 268	com/tencent/mm/bj/g:a	(Landroid/media/MediaExtractor;II)Z
    //   527: pop
    //   528: ldc 71
    //   530: ldc_w 270
    //   533: iconst_2
    //   534: anewarray 4	java/lang/Object
    //   537: dup
    //   538: iconst_0
    //   539: lload 14
    //   541: invokestatic 260	com/tencent/mm/sdk/platformtools/bo:az	(J)J
    //   544: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   547: aastore
    //   548: dup
    //   549: iconst_1
    //   550: getstatic 281	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   553: aastore
    //   554: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   557: invokestatic 168	com/tencent/mm/sdk/platformtools/bo:yz	()J
    //   560: lstore 14
    //   562: aload_0
    //   563: invokespecial 285	com/tencent/mm/bj/g:alN	()Ljava/lang/String;
    //   566: astore 10
    //   568: ldc 71
    //   570: ldc_w 287
    //   573: iconst_1
    //   574: anewarray 4	java/lang/Object
    //   577: dup
    //   578: iconst_0
    //   579: lload 8
    //   581: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   584: aastore
    //   585: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   588: ldc 71
    //   590: ldc_w 289
    //   593: iconst_1
    //   594: anewarray 4	java/lang/Object
    //   597: dup
    //   598: iconst_0
    //   599: aload 10
    //   601: aastore
    //   602: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   605: iconst_1
    //   606: istore_3
    //   607: aload 4
    //   609: getfield 292	com/tencent/mm/modelcontrol/VideoTransPara:audioSampleRate	I
    //   612: istore 16
    //   614: aload 4
    //   616: getfield 295	com/tencent/mm/modelcontrol/VideoTransPara:fzS	I
    //   619: istore 17
    //   621: iload 16
    //   623: istore_2
    //   624: aload_0
    //   625: getfield 265	com/tencent/mm/bj/g:fYl	Lcom/tencent/mm/bj/g$a;
    //   628: getfield 178	com/tencent/mm/bj/g$a:mediaFormat	Landroid/media/MediaFormat;
    //   631: ldc_w 297
    //   634: invokevirtual 303	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   637: istore 7
    //   639: iload 16
    //   641: istore_2
    //   642: iload 7
    //   644: istore_3
    //   645: aload_0
    //   646: getfield 265	com/tencent/mm/bj/g:fYl	Lcom/tencent/mm/bj/g$a;
    //   649: getfield 178	com/tencent/mm/bj/g$a:mediaFormat	Landroid/media/MediaFormat;
    //   652: ldc_w 305
    //   655: invokevirtual 303	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   658: istore 16
    //   660: iload 16
    //   662: istore_2
    //   663: iload 7
    //   665: istore_3
    //   666: aload_0
    //   667: getfield 265	com/tencent/mm/bj/g:fYl	Lcom/tencent/mm/bj/g$a;
    //   670: getfield 178	com/tencent/mm/bj/g$a:mediaFormat	Landroid/media/MediaFormat;
    //   673: ldc_w 307
    //   676: invokevirtual 303	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   679: istore 18
    //   681: iload 18
    //   683: istore_2
    //   684: iload_2
    //   685: istore_3
    //   686: iload 7
    //   688: istore_2
    //   689: ldc 71
    //   691: ldc_w 309
    //   694: iconst_3
    //   695: anewarray 4	java/lang/Object
    //   698: dup
    //   699: iconst_0
    //   700: iload_2
    //   701: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   704: aastore
    //   705: dup
    //   706: iconst_1
    //   707: iload 16
    //   709: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   712: aastore
    //   713: dup
    //   714: iconst_2
    //   715: iload_3
    //   716: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   719: aastore
    //   720: invokestatic 312	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   723: ldc 71
    //   725: ldc_w 314
    //   728: iconst_4
    //   729: anewarray 4	java/lang/Object
    //   732: dup
    //   733: iconst_0
    //   734: iload 16
    //   736: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   739: aastore
    //   740: dup
    //   741: iconst_1
    //   742: iload_2
    //   743: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   746: aastore
    //   747: dup
    //   748: iconst_2
    //   749: aload 4
    //   751: getfield 222	com/tencent/mm/modelcontrol/VideoTransPara:fps	I
    //   754: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   757: aastore
    //   758: dup
    //   759: iconst_3
    //   760: aload 10
    //   762: aastore
    //   763: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   766: aload 6
    //   768: getfield 133	com/tencent/mm/bj/h:fYv	Z
    //   771: ifeq +345 -> 1116
    //   774: iload 16
    //   776: sipush 1024
    //   779: iconst_2
    //   780: iload_2
    //   781: aload 10
    //   783: aload 4
    //   785: getfield 222	com/tencent/mm/modelcontrol/VideoTransPara:fps	I
    //   788: i2f
    //   789: aload_0
    //   790: getfield 91	com/tencent/mm/bj/g:fYs	J
    //   793: aload_0
    //   794: getfield 86	com/tencent/mm/bj/g:fYr	J
    //   797: lsub
    //   798: l2i
    //   799: aconst_null
    //   800: iconst_0
    //   801: invokestatic 318	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:muxingForX264Lock	(IIIILjava/lang/String;FI[BI)I
    //   804: istore_2
    //   805: ldc 71
    //   807: ldc_w 320
    //   810: invokestatic 322	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   813: iload_2
    //   814: ifge +22 -> 836
    //   817: ldc 71
    //   819: ldc_w 324
    //   822: iconst_1
    //   823: anewarray 4	java/lang/Object
    //   826: dup
    //   827: iconst_0
    //   828: iload_2
    //   829: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   832: aastore
    //   833: invokestatic 312	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   836: aload_0
    //   837: getfield 55	com/tencent/mm/bj/g:mRotationDegree	I
    //   840: ifle +304 -> 1144
    //   843: aload_0
    //   844: invokespecial 285	com/tencent/mm/bj/g:alN	()Ljava/lang/String;
    //   847: aload_0
    //   848: getfield 326	com/tencent/mm/bj/g:fYp	Ljava/lang/String;
    //   851: aload_0
    //   852: getfield 55	com/tencent/mm/bj/g:mRotationDegree	I
    //   855: invokestatic 330	com/tencent/mm/plugin/sight/base/SightVideoJNI:tagRotateVideo	(Ljava/lang/String;Ljava/lang/String;I)I
    //   858: pop
    //   859: ldc 71
    //   861: ldc_w 332
    //   864: iconst_1
    //   865: anewarray 4	java/lang/Object
    //   868: dup
    //   869: iconst_0
    //   870: lload 14
    //   872: invokestatic 260	com/tencent/mm/sdk/platformtools/bo:az	(J)J
    //   875: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   878: aastore
    //   879: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   882: ldc 71
    //   884: ldc_w 334
    //   887: iconst_1
    //   888: anewarray 4	java/lang/Object
    //   891: dup
    //   892: iconst_0
    //   893: invokestatic 168	com/tencent/mm/sdk/platformtools/bo:yz	()J
    //   896: invokestatic 260	com/tencent/mm/sdk/platformtools/bo:az	(J)J
    //   899: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   902: aastore
    //   903: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   906: aload_0
    //   907: getfield 82	com/tencent/mm/bj/g:eTa	I
    //   910: invokestatic 337	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:releaseDataBufLock	(I)V
    //   913: aload_1
    //   914: invokevirtual 187	android/media/MediaExtractor:release	()V
    //   917: getstatic 193	com/tencent/mm/bj/b:fXS	Lcom/tencent/mm/bj/b;
    //   920: invokevirtual 196	com/tencent/mm/bj/b:WY	()V
    //   923: aload 6
    //   925: invokevirtual 338	com/tencent/mm/bj/h:release	()V
    //   928: iconst_0
    //   929: istore_2
    //   930: ldc 69
    //   932: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   935: iload_2
    //   936: ireturn
    //   937: aload 6
    //   939: aload 5
    //   941: getfield 114	com/tencent/mm/modelcontrol/VideoTransPara:width	I
    //   944: aload 5
    //   946: getfield 111	com/tencent/mm/modelcontrol/VideoTransPara:height	I
    //   949: invokevirtual 118	com/tencent/mm/bj/h:cE	(II)V
    //   952: goto -842 -> 110
    //   955: astore_1
    //   956: aload 6
    //   958: astore 4
    //   960: ldc 71
    //   962: aload_1
    //   963: ldc_w 340
    //   966: iconst_0
    //   967: anewarray 4	java/lang/Object
    //   970: invokestatic 344	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   973: aload 4
    //   975: ifnull +8 -> 983
    //   978: aload 4
    //   980: invokevirtual 338	com/tencent/mm/bj/h:release	()V
    //   983: iconst_m1
    //   984: istore_2
    //   985: ldc 69
    //   987: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   990: goto -55 -> 935
    //   993: bipush 10
    //   995: istore 7
    //   997: goto -780 -> 217
    //   1000: ldc2_w 345
    //   1003: dstore 12
    //   1005: goto -611 -> 394
    //   1008: astore 5
    //   1010: ldc 98
    //   1012: aload 5
    //   1014: ldc_w 348
    //   1017: iconst_1
    //   1018: anewarray 4	java/lang/Object
    //   1021: dup
    //   1022: iconst_0
    //   1023: aload 5
    //   1025: invokevirtual 351	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1028: aastore
    //   1029: invokestatic 344	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1032: goto -585 -> 447
    //   1035: astore 4
    //   1037: ldc 71
    //   1039: aload 4
    //   1041: ldc_w 353
    //   1044: iconst_1
    //   1045: anewarray 4	java/lang/Object
    //   1048: dup
    //   1049: iconst_0
    //   1050: aload 4
    //   1052: invokevirtual 351	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1055: aastore
    //   1056: invokestatic 344	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1059: aload_0
    //   1060: getfield 82	com/tencent/mm/bj/g:eTa	I
    //   1063: invokestatic 337	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:releaseDataBufLock	(I)V
    //   1066: aload_1
    //   1067: invokevirtual 187	android/media/MediaExtractor:release	()V
    //   1070: getstatic 193	com/tencent/mm/bj/b:fXS	Lcom/tencent/mm/bj/b;
    //   1073: invokevirtual 196	com/tencent/mm/bj/b:WY	()V
    //   1076: goto -153 -> 923
    //   1079: astore_1
    //   1080: goto -157 -> 923
    //   1083: astore 5
    //   1085: ldc 71
    //   1087: ldc_w 355
    //   1090: iconst_1
    //   1091: anewarray 4	java/lang/Object
    //   1094: dup
    //   1095: iconst_0
    //   1096: aload 5
    //   1098: invokevirtual 351	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1101: aastore
    //   1102: invokestatic 312	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1105: iload_2
    //   1106: istore 16
    //   1108: iload_3
    //   1109: istore_2
    //   1110: iload 17
    //   1112: istore_3
    //   1113: goto -424 -> 689
    //   1116: aload_0
    //   1117: getfield 82	com/tencent/mm/bj/g:eTa	I
    //   1120: iload 16
    //   1122: sipush 1024
    //   1125: iconst_2
    //   1126: iload_2
    //   1127: aload 10
    //   1129: aload 4
    //   1131: getfield 222	com/tencent/mm/modelcontrol/VideoTransPara:fps	I
    //   1134: i2f
    //   1135: aconst_null
    //   1136: iconst_0
    //   1137: invokestatic 359	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:muxingLock	(IIIIILjava/lang/String;F[BI)I
    //   1140: istore_2
    //   1141: goto -336 -> 805
    //   1144: aload_0
    //   1145: invokespecial 285	com/tencent/mm/bj/g:alN	()Ljava/lang/String;
    //   1148: aload_0
    //   1149: getfield 326	com/tencent/mm/bj/g:fYp	Ljava/lang/String;
    //   1152: invokestatic 365	com/tencent/mm/modelsfs/FileOp:aQ	(Ljava/lang/String;Ljava/lang/String;)Z
    //   1155: pop
    //   1156: goto -297 -> 859
    //   1159: astore 4
    //   1161: aload_0
    //   1162: getfield 82	com/tencent/mm/bj/g:eTa	I
    //   1165: invokestatic 337	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:releaseDataBufLock	(I)V
    //   1168: aload_1
    //   1169: invokevirtual 187	android/media/MediaExtractor:release	()V
    //   1172: getstatic 193	com/tencent/mm/bj/b:fXS	Lcom/tencent/mm/bj/b;
    //   1175: invokevirtual 196	com/tencent/mm/bj/b:WY	()V
    //   1178: ldc 69
    //   1180: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1183: aload 4
    //   1185: athrow
    //   1186: astore_1
    //   1187: ldc 71
    //   1189: aload_1
    //   1190: ldc_w 367
    //   1193: iconst_1
    //   1194: anewarray 4	java/lang/Object
    //   1197: dup
    //   1198: iconst_0
    //   1199: aload_1
    //   1200: invokevirtual 351	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1203: aastore
    //   1204: invokestatic 344	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1207: aload 6
    //   1209: invokevirtual 338	com/tencent/mm/bj/h:release	()V
    //   1212: iconst_m1
    //   1213: istore_2
    //   1214: ldc 69
    //   1216: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1219: goto -284 -> 935
    //   1222: astore_1
    //   1223: aload 6
    //   1225: invokevirtual 338	com/tencent/mm/bj/h:release	()V
    //   1228: ldc 69
    //   1230: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1233: aload_1
    //   1234: athrow
    //   1235: astore_1
    //   1236: goto -308 -> 928
    //   1239: astore_1
    //   1240: goto -28 -> 1212
    //   1243: astore 4
    //   1245: goto -17 -> 1228
    //   1248: astore_1
    //   1249: goto -71 -> 1178
    //   1252: astore_1
    //   1253: goto -330 -> 923
    //   1256: astore 5
    //   1258: goto -965 -> 293
    //   1261: astore_1
    //   1262: aload 5
    //   1264: astore 4
    //   1266: goto -306 -> 960
    //
    // Exception table:
    //   from	to	target	type
    //   29	95	955	java/lang/Exception
    //   95	110	955	java/lang/Exception
    //   110	158	955	java/lang/Exception
    //   937	952	955	java/lang/Exception
    //   342	394	1008	java/lang/Exception
    //   394	447	1008	java/lang/Exception
    //   196	217	1035	java/lang/Exception
    //   217	271	1035	java/lang/Exception
    //   293	337	1035	java/lang/Exception
    //   447	557	1035	java/lang/Exception
    //   557	605	1035	java/lang/Exception
    //   607	621	1035	java/lang/Exception
    //   689	805	1035	java/lang/Exception
    //   805	813	1035	java/lang/Exception
    //   817	836	1035	java/lang/Exception
    //   836	859	1035	java/lang/Exception
    //   859	906	1035	java/lang/Exception
    //   1010	1032	1035	java/lang/Exception
    //   1085	1105	1035	java/lang/Exception
    //   1116	1141	1035	java/lang/Exception
    //   1144	1156	1035	java/lang/Exception
    //   1059	1076	1079	java/lang/Exception
    //   624	639	1083	java/lang/Exception
    //   645	660	1083	java/lang/Exception
    //   666	681	1083	java/lang/Exception
    //   196	217	1159	finally
    //   217	271	1159	finally
    //   276	293	1159	finally
    //   293	337	1159	finally
    //   342	394	1159	finally
    //   394	447	1159	finally
    //   447	557	1159	finally
    //   557	605	1159	finally
    //   607	621	1159	finally
    //   624	639	1159	finally
    //   645	660	1159	finally
    //   666	681	1159	finally
    //   689	805	1159	finally
    //   805	813	1159	finally
    //   817	836	1159	finally
    //   836	859	1159	finally
    //   859	906	1159	finally
    //   1010	1032	1159	finally
    //   1037	1059	1159	finally
    //   1085	1105	1159	finally
    //   1116	1141	1159	finally
    //   1144	1156	1159	finally
    //   165	196	1186	java/lang/Exception
    //   1178	1186	1186	java/lang/Exception
    //   165	196	1222	finally
    //   906	923	1222	finally
    //   1059	1076	1222	finally
    //   1161	1178	1222	finally
    //   1178	1186	1222	finally
    //   1187	1207	1222	finally
    //   923	928	1235	java/lang/Exception
    //   1207	1212	1239	java/lang/Exception
    //   1223	1228	1243	java/lang/Exception
    //   1161	1178	1248	java/lang/Exception
    //   906	923	1252	java/lang/Exception
    //   276	293	1256	java/lang/Exception
    //   15	29	1261	java/lang/Exception
  }

  private void a(MediaExtractor paramMediaExtractor)
  {
    AppMethodBeat.i(50938);
    int i = paramMediaExtractor.getTrackCount();
    int j = 0;
    if (j < i)
    {
      MediaFormat localMediaFormat = paramMediaExtractor.getTrackFormat(j);
      String str;
      if ((localMediaFormat.containsKey("mime")) && (!bo.isNullOrNil(localMediaFormat.getString("mime"))))
      {
        str = localMediaFormat.getString("mime");
        ab.i("MicroMsg.VideoTranferH265toH264", "mime: %s", new Object[] { str });
        if (!str.startsWith("audio/"))
          break label115;
        this.fYn.add(new a(localMediaFormat, j));
      }
      while (true)
      {
        j++;
        break;
        label115: if (str.startsWith("video/"))
          this.fYm.add(new a(localMediaFormat, j));
      }
    }
    ab.i("MicroMsg.VideoTranferH265toH264", "findMediaFormat mAudioSelectedTrackList.size() = %d, mVideoSelectedTrackList.size() = %d", new Object[] { Integer.valueOf(this.fYn.size()), Integer.valueOf(this.fYm.size()) });
    AppMethodBeat.o(50938);
  }

  private boolean a(MediaExtractor paramMediaExtractor, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50936);
    if (this.fYl == null)
      AppMethodBeat.o(50936);
    while (true)
    {
      return false;
      paramMediaExtractor.selectTrack(this.fYl.index);
      paramMediaExtractor.seekTo(this.fYr * 1000L, 0);
      ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(paramInt1);
      try
      {
        this.fYl.mediaFormat.getInteger("channel-count");
        ab.i("MicroMsg.VideoTranferH265toH264", "audio channel count");
        localByteBuffer.clear();
        paramInt1 = paramMediaExtractor.readSampleData(localByteBuffer, 0);
        if (paramInt1 <= 0)
        {
          ab.i("MicroMsg.VideoTranferH265toH264", "VideoClipperAPI18.muxAudio size = %d. Saw eos.", new Object[] { Integer.valueOf(paramInt1) });
          AppMethodBeat.o(50936);
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.VideoTranferH265toH264", "get channel count error: %s", new Object[] { Integer.valueOf(1) });
          continue;
          if (paramMediaExtractor.getSampleTime() < this.fYs * 1000L)
            if (paramMediaExtractor.getSampleTrackIndex() != this.fYl.index)
            {
              ab.e("MicroMsg.VideoTranferH265toH264", "track index not match! break");
            }
            else
            {
              localByteBuffer.position(0);
              MP4MuxerJNI.writeAACDataLock(paramInt2, localByteBuffer, paramInt1);
              paramMediaExtractor.advance();
            }
        }
      }
    }
  }

  private int alM()
  {
    AppMethodBeat.i(50939);
    int i = -1;
    int j = i;
    Iterator localIterator;
    a locala;
    if (this.fYn != null)
    {
      j = i;
      if (this.fYn.size() != 0)
      {
        localIterator = this.fYn.iterator();
        j = -1;
        if (localIterator.hasNext())
        {
          locala = (a)localIterator.next();
          if (!locala.mediaFormat.containsKey("max-input-size"))
            break label195;
          j = Math.max(locala.mediaFormat.getInteger("max-input-size"), j);
        }
      }
    }
    label192: label195: 
    while (true)
    {
      break;
      i = j;
      if (this.fYm != null)
      {
        i = j;
        if (this.fYm.size() != 0)
        {
          localIterator = this.fYm.iterator();
          if (localIterator.hasNext())
          {
            locala = (a)localIterator.next();
            if (!locala.mediaFormat.containsKey("max-input-size"))
              break label192;
            j = Math.max(locala.mediaFormat.getInteger("max-input-size"), j);
          }
        }
      }
      while (true)
      {
        break;
        i = j;
        AppMethodBeat.o(50939);
        return i;
      }
    }
  }

  private String alN()
  {
    AppMethodBeat.i(50943);
    if (this.eys == null)
      this.eys = (this.fYp + "video_temp.mp4");
    String str = this.eys;
    AppMethodBeat.o(50943);
    return str;
  }

  private static void c(String paramString1, String paramString2, VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(50937);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)) || (paramVideoTransPara == null))
    {
      paramString1 = new IllegalArgumentException(String.format(Locale.CHINA, "Argument's null or nil. src = %s; dst = %s; param = %s", new Object[] { paramString1, paramString2, paramVideoTransPara }));
      AppMethodBeat.o(50937);
      throw paramString1;
    }
    paramVideoTransPara = new File(paramString1);
    new File(paramString2);
    if ((!FileOp.ct(paramString1)) || (!paramVideoTransPara.canRead()) || (paramVideoTransPara.length() == 0L))
    {
      paramString1 = new IllegalArgumentException(String.format(Locale.CHINA, "Argument src video file can not be read or empty %s", new Object[] { paramString1 }));
      AppMethodBeat.o(50937);
      throw paramString1;
    }
    AppMethodBeat.o(50937);
  }

  private void fX(long paramLong)
  {
    AppMethodBeat.i(50942);
    ab.e("MicroMsg.VideoTranferH265toH264", "init %s", new Object[] { Boolean.valueOf(this.isInited) });
    if (!this.isInited)
      ab.e("MicroMsg.VideoTranferH265toH264", "checkTimeParameter has not been initialized.");
    this.fYr = 0L;
    Object localObject = ((a)this.fYm.get(0)).mediaFormat;
    if (!((MediaFormat)localObject).containsKey("durationUs"))
    {
      localObject = new f("Can not find duration.");
      AppMethodBeat.o(50942);
      throw ((Throwable)localObject);
    }
    long l;
    if (paramLong > 0L)
    {
      l = paramLong;
      if (paramLong <= ((MediaFormat)localObject).getLong("durationUs") / 1000L);
    }
    else
    {
      l = ((MediaFormat)localObject).getLong("durationUs") / 1000L;
    }
    this.fYs = l;
    AppMethodBeat.o(50942);
  }

  private void release()
  {
    AppMethodBeat.i(50941);
    this.isInited = false;
    if (this.mMediaExtractor != null)
      this.mMediaExtractor.release();
    AppMethodBeat.o(50941);
  }

  private static int uG(String paramString)
  {
    AppMethodBeat.i(50940);
    try
    {
      localMediaMetadataRetriever = new android/media/MediaMetadataRetriever;
      localMediaMetadataRetriever.<init>();
    }
    finally
    {
      try
      {
        localMediaMetadataRetriever.setDataSource(paramString);
        if (d.iW(17));
        Object localObject1;
        for (paramString = localMediaMetadataRetriever.extractMetadata(24); ; paramString = SightVideoJNI.getMp4Rotate(paramString))
        {
          ab.d("MicroMsg.VideoTranferH265toH264", "findRotationMessage sDegree = ".concat(String.valueOf(paramString)));
          String str = localMediaMetadataRetriever.extractMetadata(19);
          localObject1 = localMediaMetadataRetriever.extractMetadata(18);
          ab.d("MicroMsg.VideoTranferH265toH264", "findRotationMessage sHeight = ".concat(String.valueOf(str)));
          ab.d("MicroMsg.VideoTranferH265toH264", "findRotationMessage sWidth = ".concat(String.valueOf(localObject1)));
          int i = bo.getInt(paramString, 0);
          localMediaMetadataRetriever.release();
          AppMethodBeat.o(50940);
          return i;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
        }
        localObject2 = finally;
        paramString = null;
        if (paramString != null)
          paramString.release();
        AppMethodBeat.o(50940);
        throw localObject2;
      }
      finally
      {
        while (true)
        {
          MediaMetadataRetriever localMediaMetadataRetriever;
          paramString = localMediaMetadataRetriever;
        }
      }
    }
  }

  public final void b(String paramString1, String paramString2, VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(50933);
    ab.d("MicroMsg.VideoTranferH265toH264", "init() called with: src = [" + paramString1 + "], dst = [" + paramString2 + "], para = [" + paramVideoTransPara + "]");
    long l = bo.yz();
    c(paramString1, paramString2, paramVideoTransPara);
    this.fYo = paramString1;
    this.fYp = paramString2;
    this.fYq = paramVideoTransPara;
    this.mMediaExtractor = new MediaExtractor();
    this.mMediaExtractor.setDataSource(paramString1);
    a(this.mMediaExtractor);
    if ((this.fYm == null) || (this.fYm.size() == 0))
    {
      paramString1 = new f("Can not find video or audio track in this video file.");
      AppMethodBeat.o(50933);
      throw paramString1;
    }
    this.fYt = alM();
    this.mRotationDegree = uG(paramString1);
    this.isInited = true;
    ab.e("MicroMsg.VideoTranferH265toH264", "init cost time %dms", new Object[] { Long.valueOf(bo.az(l)) });
    AppMethodBeat.o(50933);
  }

  public final int fW(long paramLong)
  {
    AppMethodBeat.i(50934);
    fX(paramLong);
    this.fYk = ((a)this.fYm.get(0));
    if ((this.fYn != null) && (this.fYn.size() != 0))
      this.fYl = ((a)this.fYn.get(0));
    MediaExtractor localMediaExtractor = this.mMediaExtractor;
    if (this.fYt <= 0)
    {
      i = 1048576;
      if (a(localMediaExtractor, i, this.eTa, this.fYo) != -1)
        break label133;
      ab.e("MicroMsg.VideoTranferH265toH264", "transcodeAndMux error");
      release();
      AppMethodBeat.o(50934);
    }
    for (int i = -1; ; i = 0)
    {
      return i;
      i = this.fYt;
      break;
      label133: AppMethodBeat.o(50934);
    }
  }

  final class a
  {
    int index;
    MediaFormat mediaFormat;

    a(MediaFormat paramInt, int arg3)
    {
      this.mediaFormat = paramInt;
      int i;
      this.index = i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bj.g
 * JD-Core Version:    0.6.2
 */