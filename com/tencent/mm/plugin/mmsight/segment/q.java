package com.tencent.mm.plugin.mmsight.segment;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(18)
public final class q extends a
{
  private int eTa;
  private a.a ozt;
  private a.a ozu;

  // ERROR //
  private int a(MediaExtractor paramMediaExtractor, int paramInt1, int paramInt2, String paramString)
  {
    // Byte code:
    //   0: sipush 3692
    //   3: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 29
    //   8: ldc 31
    //   10: invokestatic 36	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   13: aconst_null
    //   14: astore 5
    //   16: new 38	com/tencent/mm/plugin/mmsight/segment/h
    //   19: astore 6
    //   21: aload 6
    //   23: invokespecial 39	com/tencent/mm/plugin/mmsight/segment/h:<init>	()V
    //   26: aload 6
    //   28: aload_0
    //   29: getfield 43	com/tencent/mm/plugin/mmsight/segment/a:fYr	J
    //   32: putfield 46	com/tencent/mm/plugin/mmsight/segment/h:bqO	J
    //   35: aload 6
    //   37: aload_0
    //   38: getfield 49	com/tencent/mm/plugin/mmsight/segment/a:fYs	J
    //   41: putfield 52	com/tencent/mm/plugin/mmsight/segment/h:eTA	J
    //   44: aload_0
    //   45: getfield 56	com/tencent/mm/plugin/mmsight/segment/a:fYq	Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   48: astore 5
    //   50: ldc 58
    //   52: ldc 60
    //   54: iconst_1
    //   55: anewarray 62	java/lang/Object
    //   58: dup
    //   59: iconst_0
    //   60: aload 5
    //   62: aastore
    //   63: invokestatic 65	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   66: aload 6
    //   68: aload 5
    //   70: putfield 68	com/tencent/mm/plugin/mmsight/segment/h:fYK	Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   73: aload_0
    //   74: getfield 71	com/tencent/mm/plugin/mmsight/segment/a:mRotationDegree	I
    //   77: bipush 90
    //   79: if_icmpeq +13 -> 92
    //   82: aload_0
    //   83: getfield 71	com/tencent/mm/plugin/mmsight/segment/a:mRotationDegree	I
    //   86: sipush 270
    //   89: if_icmpne +314 -> 403
    //   92: aload 6
    //   94: aload 5
    //   96: getfield 76	com/tencent/mm/modelcontrol/VideoTransPara:height	I
    //   99: aload 5
    //   101: getfield 79	com/tencent/mm/modelcontrol/VideoTransPara:width	I
    //   104: invokevirtual 83	com/tencent/mm/plugin/mmsight/segment/h:cE	(II)V
    //   107: aload 6
    //   109: aload 4
    //   111: putfield 87	com/tencent/mm/plugin/mmsight/segment/h:fYM	Ljava/lang/String;
    //   114: aload_0
    //   115: getfield 71	com/tencent/mm/plugin/mmsight/segment/a:mRotationDegree	I
    //   118: istore 7
    //   120: ldc 58
    //   122: ldc 89
    //   124: iconst_1
    //   125: anewarray 62	java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: iload 7
    //   132: invokestatic 95	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   135: aastore
    //   136: invokestatic 65	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   139: aload 6
    //   141: iload 7
    //   143: putfield 98	com/tencent/mm/plugin/mmsight/segment/h:rotate	I
    //   146: ldc 29
    //   148: ldc 100
    //   150: invokestatic 36	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   153: ldc 29
    //   155: ldc 102
    //   157: invokestatic 36	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   160: aload_1
    //   161: aload_0
    //   162: getfield 104	com/tencent/mm/plugin/mmsight/segment/q:ozt	Lcom/tencent/mm/plugin/mmsight/segment/a$a;
    //   165: getfield 109	com/tencent/mm/plugin/mmsight/segment/a$a:index	I
    //   168: invokevirtual 114	android/media/MediaExtractor:selectTrack	(I)V
    //   171: aload_1
    //   172: aload_0
    //   173: getfield 43	com/tencent/mm/plugin/mmsight/segment/a:fYr	J
    //   176: ldc2_w 115
    //   179: lmul
    //   180: iconst_0
    //   181: invokevirtual 120	android/media/MediaExtractor:seekTo	(JI)V
    //   184: aload_0
    //   185: getfield 56	com/tencent/mm/plugin/mmsight/segment/a:fYq	Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   188: astore 4
    //   190: aload 4
    //   192: getfield 123	com/tencent/mm/modelcontrol/VideoTransPara:duration	I
    //   195: ifle +264 -> 459
    //   198: aload 4
    //   200: getfield 123	com/tencent/mm/modelcontrol/VideoTransPara:duration	I
    //   203: istore 7
    //   205: aload_0
    //   206: iload 7
    //   208: invokestatic 129	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:initDataBuf	(I)I
    //   211: putfield 131	com/tencent/mm/plugin/mmsight/segment/q:eTa	I
    //   214: invokestatic 137	com/tencent/mm/sdk/platformtools/bo:yz	()J
    //   217: lstore 8
    //   219: aload_0
    //   220: getfield 104	com/tencent/mm/plugin/mmsight/segment/q:ozt	Lcom/tencent/mm/plugin/mmsight/segment/a$a;
    //   223: getfield 109	com/tencent/mm/plugin/mmsight/segment/a$a:index	I
    //   226: istore 7
    //   228: aload 6
    //   230: aload_1
    //   231: putfield 141	com/tencent/mm/plugin/mmsight/segment/h:eWb	Landroid/media/MediaExtractor;
    //   234: aload 6
    //   236: iload 7
    //   238: putfield 144	com/tencent/mm/plugin/mmsight/segment/h:eWc	I
    //   241: aload 6
    //   243: aload_0
    //   244: getfield 104	com/tencent/mm/plugin/mmsight/segment/q:ozt	Lcom/tencent/mm/plugin/mmsight/segment/a$a;
    //   247: getfield 148	com/tencent/mm/plugin/mmsight/segment/a$a:mediaFormat	Landroid/media/MediaFormat;
    //   250: invokevirtual 152	com/tencent/mm/plugin/mmsight/segment/h:f	(Landroid/media/MediaFormat;)I
    //   253: istore 7
    //   255: iload 7
    //   257: ifge +209 -> 466
    //   260: aload_0
    //   261: getfield 131	com/tencent/mm/plugin/mmsight/segment/q:eTa	I
    //   264: invokestatic 155	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:releaseDataBuf	(I)V
    //   267: aload_1
    //   268: invokevirtual 158	android/media/MediaExtractor:release	()V
    //   271: getstatic 164	com/tencent/mm/plugin/mmsight/model/a/j:owk	Lcom/tencent/mm/plugin/mmsight/model/a/j;
    //   274: invokevirtual 167	com/tencent/mm/plugin/mmsight/model/a/j:WY	()V
    //   277: new 169	com/tencent/mm/plugin/mmsight/segment/l
    //   280: astore 4
    //   282: aload 4
    //   284: ldc 171
    //   286: invokespecial 174	com/tencent/mm/plugin/mmsight/segment/l:<init>	(Ljava/lang/String;)V
    //   289: sipush 3692
    //   292: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   295: aload 4
    //   297: athrow
    //   298: astore 5
    //   300: ldc 29
    //   302: ldc 179
    //   304: iconst_1
    //   305: anewarray 62	java/lang/Object
    //   308: dup
    //   309: iconst_0
    //   310: aload 5
    //   312: invokevirtual 183	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   315: aastore
    //   316: invokestatic 186	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   319: new 188	java/lang/RuntimeException
    //   322: astore 4
    //   324: aload 4
    //   326: aload 5
    //   328: invokespecial 191	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   331: sipush 3692
    //   334: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   337: aload 4
    //   339: athrow
    //   340: astore 4
    //   342: aload_0
    //   343: getfield 131	com/tencent/mm/plugin/mmsight/segment/q:eTa	I
    //   346: invokestatic 155	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:releaseDataBuf	(I)V
    //   349: aload_1
    //   350: invokevirtual 158	android/media/MediaExtractor:release	()V
    //   353: getstatic 164	com/tencent/mm/plugin/mmsight/model/a/j:owk	Lcom/tencent/mm/plugin/mmsight/model/a/j;
    //   356: invokevirtual 167	com/tencent/mm/plugin/mmsight/model/a/j:WY	()V
    //   359: sipush 3692
    //   362: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   365: aload 4
    //   367: athrow
    //   368: astore_1
    //   369: ldc 29
    //   371: aload_1
    //   372: ldc 193
    //   374: iconst_1
    //   375: anewarray 62	java/lang/Object
    //   378: dup
    //   379: iconst_0
    //   380: aload_1
    //   381: invokevirtual 183	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   384: aastore
    //   385: invokestatic 197	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   388: aload 6
    //   390: invokevirtual 198	com/tencent/mm/plugin/mmsight/segment/h:release	()V
    //   393: iconst_m1
    //   394: istore_2
    //   395: sipush 3692
    //   398: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   401: iload_2
    //   402: ireturn
    //   403: aload 6
    //   405: aload 5
    //   407: getfield 79	com/tencent/mm/modelcontrol/VideoTransPara:width	I
    //   410: aload 5
    //   412: getfield 76	com/tencent/mm/modelcontrol/VideoTransPara:height	I
    //   415: invokevirtual 83	com/tencent/mm/plugin/mmsight/segment/h:cE	(II)V
    //   418: goto -311 -> 107
    //   421: astore_1
    //   422: aload 6
    //   424: astore 4
    //   426: ldc 29
    //   428: aload_1
    //   429: ldc 200
    //   431: iconst_0
    //   432: anewarray 62	java/lang/Object
    //   435: invokestatic 197	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   438: aload 4
    //   440: ifnull +8 -> 448
    //   443: aload 4
    //   445: invokevirtual 198	com/tencent/mm/plugin/mmsight/segment/h:release	()V
    //   448: iconst_m1
    //   449: istore_2
    //   450: sipush 3692
    //   453: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   456: goto -55 -> 401
    //   459: bipush 10
    //   461: istore 7
    //   463: goto -258 -> 205
    //   466: aload 6
    //   468: getfield 87	com/tencent/mm/plugin/mmsight/segment/h:fYM	Ljava/lang/String;
    //   471: invokestatic 204	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   474: ifne +146 -> 620
    //   477: aload 6
    //   479: getfield 87	com/tencent/mm/plugin/mmsight/segment/h:fYM	Ljava/lang/String;
    //   482: invokestatic 210	com/tencent/mm/plugin/sight/base/SightVideoJNI:getSimpleMp4Info	(Ljava/lang/String;)Ljava/lang/String;
    //   485: astore 5
    //   487: ldc 58
    //   489: ldc 212
    //   491: iconst_1
    //   492: anewarray 62	java/lang/Object
    //   495: dup
    //   496: iconst_0
    //   497: aload 5
    //   499: aastore
    //   500: invokestatic 65	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   503: aload 5
    //   505: invokestatic 204	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   508: istore 10
    //   510: iload 10
    //   512: ifne +108 -> 620
    //   515: new 214	org/json/JSONObject
    //   518: astore 11
    //   520: aload 11
    //   522: aload 5
    //   524: invokespecial 215	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   527: aload 11
    //   529: ldc 217
    //   531: invokevirtual 221	org/json/JSONObject:getDouble	(Ljava/lang/String;)D
    //   534: d2i
    //   535: istore 7
    //   537: aload 6
    //   539: getfield 68	com/tencent/mm/plugin/mmsight/segment/h:fYK	Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   542: ifnull +456 -> 998
    //   545: aload 6
    //   547: getfield 68	com/tencent/mm/plugin/mmsight/segment/h:fYK	Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   550: getfield 224	com/tencent/mm/modelcontrol/VideoTransPara:fps	I
    //   553: ifle +445 -> 998
    //   556: aload 6
    //   558: getfield 68	com/tencent/mm/plugin/mmsight/segment/h:fYK	Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   561: getfield 224	com/tencent/mm/modelcontrol/VideoTransPara:fps	I
    //   564: i2d
    //   565: dstore 12
    //   567: aload 6
    //   569: iload 7
    //   571: i2d
    //   572: dload 12
    //   574: ddiv
    //   575: invokestatic 230	java/lang/Math:ceil	(D)D
    //   578: d2i
    //   579: putfield 233	com/tencent/mm/plugin/mmsight/segment/h:eTJ	I
    //   582: ldc 58
    //   584: ldc 235
    //   586: iconst_3
    //   587: anewarray 62	java/lang/Object
    //   590: dup
    //   591: iconst_0
    //   592: aload 6
    //   594: getfield 233	com/tencent/mm/plugin/mmsight/segment/h:eTJ	I
    //   597: invokestatic 95	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   600: aastore
    //   601: dup
    //   602: iconst_1
    //   603: iload 7
    //   605: invokestatic 95	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   608: aastore
    //   609: dup
    //   610: iconst_2
    //   611: dload 12
    //   613: invokestatic 240	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   616: aastore
    //   617: invokestatic 65	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   620: aload 6
    //   622: getfield 244	com/tencent/mm/plugin/mmsight/segment/h:oyh	Lcom/tencent/mm/plugin/mmsight/segment/e;
    //   625: aload 6
    //   627: getfield 233	com/tencent/mm/plugin/mmsight/segment/h:eTJ	I
    //   630: invokeinterface 249 2 0
    //   635: aload 6
    //   637: getfield 244	com/tencent/mm/plugin/mmsight/segment/h:oyh	Lcom/tencent/mm/plugin/mmsight/segment/e;
    //   640: astore 11
    //   642: new 251	com/tencent/mm/plugin/mmsight/segment/h$1
    //   645: astore 5
    //   647: aload 5
    //   649: aload 6
    //   651: invokespecial 254	com/tencent/mm/plugin/mmsight/segment/h$1:<init>	(Lcom/tencent/mm/plugin/mmsight/segment/h;)V
    //   654: aload 11
    //   656: aload 5
    //   658: invokeinterface 258 2 0
    //   663: lload 8
    //   665: invokestatic 262	com/tencent/mm/sdk/platformtools/bo:az	(J)J
    //   668: lstore 8
    //   670: aload_1
    //   671: aload_0
    //   672: getfield 104	com/tencent/mm/plugin/mmsight/segment/q:ozt	Lcom/tencent/mm/plugin/mmsight/segment/a$a;
    //   675: getfield 109	com/tencent/mm/plugin/mmsight/segment/a$a:index	I
    //   678: invokevirtual 265	android/media/MediaExtractor:unselectTrack	(I)V
    //   681: iconst_0
    //   682: istore 10
    //   684: aload_0
    //   685: getfield 267	com/tencent/mm/plugin/mmsight/segment/q:ozu	Lcom/tencent/mm/plugin/mmsight/segment/a$a;
    //   688: ifnull +48 -> 736
    //   691: invokestatic 137	com/tencent/mm/sdk/platformtools/bo:yz	()J
    //   694: lstore 14
    //   696: aload_0
    //   697: aload_1
    //   698: iload_2
    //   699: iload_3
    //   700: invokespecial 270	com/tencent/mm/plugin/mmsight/segment/q:a	(Landroid/media/MediaExtractor;II)Z
    //   703: istore 10
    //   705: ldc 29
    //   707: ldc_w 272
    //   710: iconst_2
    //   711: anewarray 62	java/lang/Object
    //   714: dup
    //   715: iconst_0
    //   716: lload 14
    //   718: invokestatic 262	com/tencent/mm/sdk/platformtools/bo:az	(J)J
    //   721: invokestatic 277	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   724: aastore
    //   725: dup
    //   726: iconst_1
    //   727: iload 10
    //   729: invokestatic 282	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   732: aastore
    //   733: invokestatic 65	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   736: invokestatic 137	com/tencent/mm/sdk/platformtools/bo:yz	()J
    //   739: lstore 14
    //   741: aload_0
    //   742: invokevirtual 285	com/tencent/mm/plugin/mmsight/segment/q:alN	()Ljava/lang/String;
    //   745: astore 11
    //   747: ldc 29
    //   749: ldc_w 287
    //   752: iconst_1
    //   753: anewarray 62	java/lang/Object
    //   756: dup
    //   757: iconst_0
    //   758: lload 8
    //   760: invokestatic 277	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   763: aastore
    //   764: invokestatic 65	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   767: ldc 29
    //   769: ldc_w 289
    //   772: iconst_1
    //   773: anewarray 62	java/lang/Object
    //   776: dup
    //   777: iconst_0
    //   778: aload 11
    //   780: aastore
    //   781: invokestatic 65	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   784: invokestatic 293	com/tencent/mm/plugin/mmsight/segment/h:bQk	()I
    //   787: lload 8
    //   789: invokestatic 299	com/tencent/mm/plugin/mmsight/segment/m:S	(IJ)V
    //   792: iconst_1
    //   793: istore_3
    //   794: iconst_1
    //   795: istore 16
    //   797: aload 4
    //   799: getfield 302	com/tencent/mm/modelcontrol/VideoTransPara:audioSampleRate	I
    //   802: istore 7
    //   804: aload 4
    //   806: getfield 305	com/tencent/mm/modelcontrol/VideoTransPara:fzS	I
    //   809: istore 17
    //   811: iload 7
    //   813: istore_2
    //   814: iload 10
    //   816: ifne +239 -> 1055
    //   819: iload 7
    //   821: istore_2
    //   822: iload 16
    //   824: istore_3
    //   825: aload_0
    //   826: getfield 267	com/tencent/mm/plugin/mmsight/segment/q:ozu	Lcom/tencent/mm/plugin/mmsight/segment/a$a;
    //   829: getfield 148	com/tencent/mm/plugin/mmsight/segment/a$a:mediaFormat	Landroid/media/MediaFormat;
    //   832: ldc_w 307
    //   835: invokevirtual 313	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   838: istore 16
    //   840: iload 7
    //   842: istore_2
    //   843: iload 16
    //   845: istore_3
    //   846: aload_0
    //   847: getfield 267	com/tencent/mm/plugin/mmsight/segment/q:ozu	Lcom/tencent/mm/plugin/mmsight/segment/a$a;
    //   850: getfield 148	com/tencent/mm/plugin/mmsight/segment/a$a:mediaFormat	Landroid/media/MediaFormat;
    //   853: ldc_w 315
    //   856: invokevirtual 313	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   859: istore 7
    //   861: iload 7
    //   863: istore_2
    //   864: iload 16
    //   866: istore_3
    //   867: aload_0
    //   868: getfield 267	com/tencent/mm/plugin/mmsight/segment/q:ozu	Lcom/tencent/mm/plugin/mmsight/segment/a$a;
    //   871: getfield 148	com/tencent/mm/plugin/mmsight/segment/a$a:mediaFormat	Landroid/media/MediaFormat;
    //   874: ldc_w 317
    //   877: invokevirtual 313	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   880: istore 18
    //   882: iload 18
    //   884: istore_2
    //   885: iload 16
    //   887: istore_3
    //   888: ldc 29
    //   890: ldc_w 319
    //   893: iconst_3
    //   894: anewarray 62	java/lang/Object
    //   897: dup
    //   898: iconst_0
    //   899: iload_3
    //   900: invokestatic 95	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   903: aastore
    //   904: dup
    //   905: iconst_1
    //   906: iload 7
    //   908: invokestatic 95	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   911: aastore
    //   912: dup
    //   913: iconst_2
    //   914: iload_2
    //   915: invokestatic 95	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   918: aastore
    //   919: invokestatic 322	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   922: iload 7
    //   924: sipush 1024
    //   927: iconst_2
    //   928: iload_3
    //   929: aload 11
    //   931: aload 4
    //   933: getfield 224	com/tencent/mm/modelcontrol/VideoTransPara:fps	I
    //   936: i2f
    //   937: aload_0
    //   938: getfield 49	com/tencent/mm/plugin/mmsight/segment/a:fYs	J
    //   941: aload_0
    //   942: getfield 43	com/tencent/mm/plugin/mmsight/segment/a:fYr	J
    //   945: lsub
    //   946: l2i
    //   947: aconst_null
    //   948: iconst_0
    //   949: invokestatic 326	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:muxingForX264	(IIIILjava/lang/String;FI[BI)I
    //   952: istore_2
    //   953: iload_2
    //   954: ifge +110 -> 1064
    //   957: ldc 29
    //   959: ldc_w 328
    //   962: iconst_1
    //   963: anewarray 62	java/lang/Object
    //   966: dup
    //   967: iconst_0
    //   968: iload_2
    //   969: invokestatic 95	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   972: aastore
    //   973: invokestatic 322	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   976: new 169	com/tencent/mm/plugin/mmsight/segment/l
    //   979: astore 4
    //   981: aload 4
    //   983: ldc_w 330
    //   986: invokespecial 174	com/tencent/mm/plugin/mmsight/segment/l:<init>	(Ljava/lang/String;)V
    //   989: sipush 3692
    //   992: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   995: aload 4
    //   997: athrow
    //   998: ldc2_w 331
    //   1001: dstore 12
    //   1003: goto -436 -> 567
    //   1006: astore 5
    //   1008: ldc 58
    //   1010: aload 5
    //   1012: ldc_w 334
    //   1015: iconst_1
    //   1016: anewarray 62	java/lang/Object
    //   1019: dup
    //   1020: iconst_0
    //   1021: aload 5
    //   1023: invokevirtual 183	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1026: aastore
    //   1027: invokestatic 197	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1030: goto -410 -> 620
    //   1033: astore 5
    //   1035: ldc 29
    //   1037: ldc_w 336
    //   1040: iconst_1
    //   1041: anewarray 62	java/lang/Object
    //   1044: dup
    //   1045: iconst_0
    //   1046: aload 5
    //   1048: invokevirtual 183	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1051: aastore
    //   1052: invokestatic 322	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1055: iload_2
    //   1056: istore 7
    //   1058: iload 17
    //   1060: istore_2
    //   1061: goto -173 -> 888
    //   1064: aload_0
    //   1065: getfield 71	com/tencent/mm/plugin/mmsight/segment/a:mRotationDegree	I
    //   1068: ifle +116 -> 1184
    //   1071: aload_0
    //   1072: invokevirtual 285	com/tencent/mm/plugin/mmsight/segment/q:alN	()Ljava/lang/String;
    //   1075: aload_0
    //   1076: getfield 339	com/tencent/mm/plugin/mmsight/segment/a:fYp	Ljava/lang/String;
    //   1079: aload_0
    //   1080: getfield 71	com/tencent/mm/plugin/mmsight/segment/a:mRotationDegree	I
    //   1083: invokestatic 343	com/tencent/mm/plugin/sight/base/SightVideoJNI:tagRotateVideo	(Ljava/lang/String;Ljava/lang/String;I)I
    //   1086: pop
    //   1087: ldc 29
    //   1089: ldc_w 345
    //   1092: iconst_1
    //   1093: anewarray 62	java/lang/Object
    //   1096: dup
    //   1097: iconst_0
    //   1098: lload 14
    //   1100: invokestatic 262	com/tencent/mm/sdk/platformtools/bo:az	(J)J
    //   1103: invokestatic 277	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1106: aastore
    //   1107: invokestatic 65	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1110: invokestatic 137	com/tencent/mm/sdk/platformtools/bo:yz	()J
    //   1113: lstore 8
    //   1115: aload_0
    //   1116: getfield 339	com/tencent/mm/plugin/mmsight/segment/a:fYp	Ljava/lang/String;
    //   1119: invokestatic 351	com/tencent/mm/plugin/mmsight/model/CaptureMMProxy:getInstance	()Lcom/tencent/mm/plugin/mmsight/model/CaptureMMProxy;
    //   1122: invokevirtual 355	com/tencent/mm/plugin/mmsight/model/CaptureMMProxy:getWeixinMeta	()[B
    //   1125: invokestatic 359	com/tencent/mm/plugin/sight/base/SightVideoJNI:tagMP4Dscp	(Ljava/lang/String;[B)V
    //   1128: ldc 29
    //   1130: ldc_w 361
    //   1133: iconst_1
    //   1134: anewarray 62	java/lang/Object
    //   1137: dup
    //   1138: iconst_0
    //   1139: lload 8
    //   1141: invokestatic 262	com/tencent/mm/sdk/platformtools/bo:az	(J)J
    //   1144: invokestatic 277	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1147: aastore
    //   1148: invokestatic 65	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1151: aload_0
    //   1152: getfield 131	com/tencent/mm/plugin/mmsight/segment/q:eTa	I
    //   1155: invokestatic 155	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:releaseDataBuf	(I)V
    //   1158: aload_1
    //   1159: invokevirtual 158	android/media/MediaExtractor:release	()V
    //   1162: getstatic 164	com/tencent/mm/plugin/mmsight/model/a/j:owk	Lcom/tencent/mm/plugin/mmsight/model/a/j;
    //   1165: invokevirtual 167	com/tencent/mm/plugin/mmsight/model/a/j:WY	()V
    //   1168: aload 6
    //   1170: invokevirtual 198	com/tencent/mm/plugin/mmsight/segment/h:release	()V
    //   1173: iconst_0
    //   1174: istore_2
    //   1175: sipush 3692
    //   1178: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1181: goto -780 -> 401
    //   1184: aload_0
    //   1185: invokevirtual 285	com/tencent/mm/plugin/mmsight/segment/q:alN	()Ljava/lang/String;
    //   1188: aload_0
    //   1189: getfield 339	com/tencent/mm/plugin/mmsight/segment/a:fYp	Ljava/lang/String;
    //   1192: invokestatic 367	com/tencent/mm/vfs/e:aQ	(Ljava/lang/String;Ljava/lang/String;)Z
    //   1195: pop
    //   1196: goto -109 -> 1087
    //   1199: astore_1
    //   1200: aload 6
    //   1202: invokevirtual 198	com/tencent/mm/plugin/mmsight/segment/h:release	()V
    //   1205: sipush 3692
    //   1208: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1211: aload_1
    //   1212: athrow
    //   1213: astore_1
    //   1214: goto -41 -> 1173
    //   1217: astore_1
    //   1218: goto -825 -> 393
    //   1221: astore 4
    //   1223: goto -18 -> 1205
    //   1226: astore_1
    //   1227: goto -868 -> 359
    //   1230: astore_1
    //   1231: goto -63 -> 1168
    //   1234: astore 4
    //   1236: goto -959 -> 277
    //   1239: astore_1
    //   1240: aload 5
    //   1242: astore 4
    //   1244: goto -818 -> 426
    //
    // Exception table:
    //   from	to	target	type
    //   184	205	298	java/lang/Exception
    //   205	255	298	java/lang/Exception
    //   277	298	298	java/lang/Exception
    //   466	510	298	java/lang/Exception
    //   620	681	298	java/lang/Exception
    //   684	736	298	java/lang/Exception
    //   736	792	298	java/lang/Exception
    //   797	811	298	java/lang/Exception
    //   888	953	298	java/lang/Exception
    //   957	998	298	java/lang/Exception
    //   1008	1030	298	java/lang/Exception
    //   1035	1055	298	java/lang/Exception
    //   1064	1087	298	java/lang/Exception
    //   1087	1151	298	java/lang/Exception
    //   1184	1196	298	java/lang/Exception
    //   184	205	340	finally
    //   205	255	340	finally
    //   260	277	340	finally
    //   277	298	340	finally
    //   300	340	340	finally
    //   466	510	340	finally
    //   515	567	340	finally
    //   567	620	340	finally
    //   620	681	340	finally
    //   684	736	340	finally
    //   736	792	340	finally
    //   797	811	340	finally
    //   825	840	340	finally
    //   846	861	340	finally
    //   867	882	340	finally
    //   888	953	340	finally
    //   957	998	340	finally
    //   1008	1030	340	finally
    //   1035	1055	340	finally
    //   1064	1087	340	finally
    //   1087	1151	340	finally
    //   1184	1196	340	finally
    //   153	184	368	java/lang/Exception
    //   359	368	368	java/lang/Exception
    //   26	92	421	java/lang/Exception
    //   92	107	421	java/lang/Exception
    //   107	146	421	java/lang/Exception
    //   403	418	421	java/lang/Exception
    //   515	567	1006	java/lang/Exception
    //   567	620	1006	java/lang/Exception
    //   825	840	1033	java/lang/Exception
    //   846	861	1033	java/lang/Exception
    //   867	882	1033	java/lang/Exception
    //   153	184	1199	finally
    //   342	359	1199	finally
    //   359	368	1199	finally
    //   369	388	1199	finally
    //   1151	1168	1199	finally
    //   1168	1173	1213	java/lang/Exception
    //   388	393	1217	java/lang/Exception
    //   1200	1205	1221	java/lang/Exception
    //   342	359	1226	java/lang/Exception
    //   1151	1168	1230	java/lang/Exception
    //   260	277	1234	java/lang/Exception
    //   16	26	1239	java/lang/Exception
  }

  private boolean a(MediaExtractor paramMediaExtractor, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3693);
    boolean bool;
    if (this.ozu == null)
    {
      bool = false;
      AppMethodBeat.o(3693);
    }
    ByteBuffer localByteBuffer;
    while (true)
    {
      return bool;
      paramMediaExtractor.selectTrack(this.ozu.index);
      paramMediaExtractor.seekTo(this.fYr * 1000L, 0);
      localByteBuffer = ByteBuffer.allocateDirect(paramInt1);
      try
      {
        this.ozu.mediaFormat.getInteger("channel-count");
        ab.i("VideoClipperAPI18", "audio channel count");
        if (CaptureMMProxy.getInstance().getInt(ac.a.xPm, 0) != 1)
          break label461;
        paramMediaExtractor = new g(paramMediaExtractor, this.ozu.mediaFormat, this.fYr, this.fYs, this.fYq);
        paramMediaExtractor.oxY = true;
      }
      catch (Exception localException2)
      {
        try
        {
          paramMediaExtractor.oxW = MediaCodec.createDecoderByType(paramMediaExtractor.clY);
          paramMediaExtractor.oxW.configure(paramMediaExtractor.fYc, null, null, 0);
          paramMediaExtractor.oxW.start();
          paramMediaExtractor.fYc = paramMediaExtractor.oxW.getOutputFormat();
        }
        catch (Exception localException2)
        {
          try
          {
            while (true)
            {
              MediaFormat localMediaFormat = new android/media/MediaFormat;
              localMediaFormat.<init>();
              paramMediaExtractor.eVr = localMediaFormat;
              paramMediaExtractor.eVr.setString("mime", "audio/mp4a-latm");
              paramMediaExtractor.eVr.setInteger("aac-profile", 2);
              paramMediaExtractor.eVr.setInteger("sample-rate", paramMediaExtractor.fYK.audioSampleRate);
              paramMediaExtractor.eVr.setInteger("channel-count", 1);
              paramMediaExtractor.eVr.setInteger("bitrate", paramMediaExtractor.fYK.fzS);
              paramMediaExtractor.eVr.setInteger("max-input-size", 16384);
              paramMediaExtractor.oxX = MediaCodec.createEncoderByType(paramMediaExtractor.clY);
              paramMediaExtractor.oxX.configure(paramMediaExtractor.eVr, null, null, 1);
              paramMediaExtractor.oxW.start();
              ab.i("MicroMsg.MediaCodecAACTranscoder", "init finish, canEncodeDecodeBothExist: %s", new Object[] { Boolean.valueOf(paramMediaExtractor.oxY) });
              paramMediaExtractor.bQh();
              bool = true;
              AppMethodBeat.o(3693);
              break;
              localException1 = localException1;
              ab.e("VideoClipperAPI18", "get channel count error: %s", new Object[] { Integer.valueOf(1) });
              continue;
              localException2 = localException2;
              ab.printErrStackTrace("MicroMsg.MediaCodecAACTranscoder", localException2, "init decoder error: %s", new Object[] { localException2.getMessage() });
            }
          }
          catch (Exception localException3)
          {
            while (true)
            {
              ab.e("MicroMsg.MediaCodecAACTranscoder", "init encoder error: %s", new Object[] { localException3.getMessage() });
              paramMediaExtractor.oxY = false;
              paramMediaExtractor.oxZ = new ArrayList();
              paramMediaExtractor.oxX.release();
              paramMediaExtractor.oxX = null;
            }
          }
        }
      }
    }
    label442: localByteBuffer.position(0);
    MP4MuxerJNI.writeAACData(paramInt2, localByteBuffer, paramInt1);
    paramMediaExtractor.advance();
    label461: localByteBuffer.clear();
    paramInt1 = paramMediaExtractor.readSampleData(localByteBuffer, 0);
    ab.d("VideoClipperAPI18", "sampleSize: %d", new Object[] { Integer.valueOf(paramInt1) });
    if (paramInt1 <= 0)
      ab.i("VideoClipperAPI18", "VideoClipperAPI18.muxAudio size = %d. Saw eos.", new Object[] { Integer.valueOf(paramInt1) });
    while (true)
    {
      bool = false;
      AppMethodBeat.o(3693);
      break;
      if (paramMediaExtractor.getSampleTime() < this.fYs * 1000L)
      {
        if (paramMediaExtractor.getSampleTrackIndex() == this.ozu.index)
          break label442;
        ab.e("VideoClipperAPI18", "track index not match! break");
      }
    }
  }

  public final int O(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(3690);
    m.yV(h.bQk());
    int i = super.O(paramLong1, paramLong2);
    if (i == -1)
      m.yW(h.bQk());
    AppMethodBeat.o(3690);
    return i;
  }

  protected final int a(MediaExtractor paramMediaExtractor, List<a.a> paramList1, List<a.a> paramList2)
  {
    AppMethodBeat.i(3691);
    this.ozt = ((a.a)paramList2.get(0));
    if ((paramList1 != null) && (paramList1.size() != 0))
      this.ozu = ((a.a)paramList1.get(0));
    if (this.fYt <= 0)
    {
      i = 1048576;
      if (a(paramMediaExtractor, i, this.eTa, this.fYo) != -1)
        break label111;
      ab.e("VideoClipperAPI18", "transcodeAndMux error");
      release();
      AppMethodBeat.o(3691);
    }
    for (int i = -1; ; i = 0)
    {
      return i;
      i = this.fYt;
      break;
      label111: AppMethodBeat.o(3691);
    }
  }

  public final void b(String paramString1, String paramString2, VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(3689);
    super.b(paramString1, paramString2, paramVideoTransPara);
    AppMethodBeat.o(3689);
  }

  public final int uG(String paramString)
  {
    AppMethodBeat.i(3694);
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
        Object localObject;
        for (paramString = localMediaMetadataRetriever.extractMetadata(24); ; paramString = SightVideoJNI.getMp4Rotate(paramString))
        {
          ab.d("VideoClipperAPI18", "findRotationMessage sDegree = ".concat(String.valueOf(paramString)));
          String str = localMediaMetadataRetriever.extractMetadata(19);
          localObject = localMediaMetadataRetriever.extractMetadata(18);
          ab.d("VideoClipperAPI18", "findRotationMessage sHeight = ".concat(String.valueOf(str)));
          ab.d("VideoClipperAPI18", "findRotationMessage sWidth = ".concat(String.valueOf(localObject)));
          int i = bo.getInt(paramString, 0);
          localMediaMetadataRetriever.release();
          AppMethodBeat.o(3694);
          return i;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
        }
        paramString = finally;
        MediaMetadataRetriever localMediaMetadataRetriever = null;
        label144: if (localMediaMetadataRetriever != null)
          localMediaMetadataRetriever.release();
        AppMethodBeat.o(3694);
        throw paramString;
      }
      finally
      {
        break label144;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.q
 * JD-Core Version:    0.6.2
 */