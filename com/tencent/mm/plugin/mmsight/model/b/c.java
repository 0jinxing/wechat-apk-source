package com.tencent.mm.plugin.mmsight.model.b;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.MediaExtractor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.api.a.a;
import com.tencent.mm.plugin.mmsight.model.a.j;
import com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class c extends com.tencent.mm.plugin.mmsight.api.a
{
  private int aOn;
  private MediaExtractor clX;
  private int eTa;
  private int eTt;
  private int eWK;
  private int eXJ;
  private int eXK;
  private int eXL;
  private long eXM;
  private long eXN;
  private Bitmap eXi;
  private String eYj;
  private int eYk;
  private int eYl;
  private int eYm;
  private int eYp;
  private Point fYS;
  private String filePath;
  private a oxf;
  private byte[] oxj;
  private byte[] oxk;
  private a.a oxl;
  private g oxn;
  private int videoFps;

  public c(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(76698);
    this.eWK = -1;
    this.eXM = -1L;
    this.eXN = -1L;
    this.eYp = -1;
    this.fYS = null;
    this.oxj = null;
    this.oxk = null;
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)) || (paramInt1 <= 0) || (paramInt2 <= 0))
    {
      ab.e("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt4) });
      AppMethodBeat.o(76698);
    }
    while (true)
    {
      return;
      this.filePath = paramString1;
      this.eYj = paramString2;
      this.eYk = paramInt1;
      this.eYl = paramInt2;
      this.eYm = paramInt3;
      this.eYp = paramInt4;
      this.eXL = SightVideoJNI.getMp4Rotate(paramString1);
      com.tencent.mm.plugin.sight.base.a locala = com.tencent.mm.plugin.sight.base.d.WR(paramString1);
      if (locala != null)
      {
        this.eXJ = locala.width;
        this.eXK = locala.height;
        this.eWK = locala.eWK;
        this.videoFps = locala.eTk;
      }
      this.eXM = 0L;
      this.eXN = this.eWK;
      ab.i("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegX264Remuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s", new Object[] { paramString1, paramString2, Integer.valueOf(this.eXJ), Integer.valueOf(this.eXK), Integer.valueOf(this.eXL), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      AppMethodBeat.o(76698);
    }
  }

  public c(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(76699);
    this.eWK = -1;
    this.eXM = -1L;
    this.eXN = -1L;
    this.eYp = -1;
    this.fYS = null;
    this.oxj = null;
    this.oxk = null;
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)) || (paramInt1 <= 0) || (paramInt2 <= 0))
    {
      ab.e("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt4) });
      AppMethodBeat.o(76699);
    }
    while (true)
    {
      return;
      this.filePath = paramString1;
      this.eYj = paramString2;
      this.eYk = paramInt1;
      this.eYl = paramInt2;
      this.eYm = paramInt3;
      this.eYp = paramInt4;
      this.eXL = SightVideoJNI.getMp4Rotate(paramString1);
      com.tencent.mm.plugin.sight.base.a locala = com.tencent.mm.plugin.sight.base.d.WR(paramString1);
      if (locala != null)
      {
        this.eXJ = locala.width;
        this.eXK = locala.height;
        this.videoFps = locala.eTk;
      }
      this.eXM = paramLong1;
      this.eXN = paramLong2;
      ab.i("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegX264Remuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s, startTimeMs: %s, endTimeMs: %s", new Object[] { paramString1, paramString2, Integer.valueOf(this.eXJ), Integer.valueOf(this.eXK), Integer.valueOf(this.eXL), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
      AppMethodBeat.o(76699);
    }
  }

  // ERROR //
  public final int Va()
  {
    // Byte code:
    //   0: ldc 182
    //   2: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 54	com/tencent/mm/plugin/mmsight/model/b/c:eWK	I
    //   9: i2f
    //   10: ldc 183
    //   12: fdiv
    //   13: invokestatic 189	java/lang/Math:round	(F)I
    //   16: istore_1
    //   17: iload_1
    //   18: istore_2
    //   19: aload_0
    //   20: getfield 58	com/tencent/mm/plugin/mmsight/model/b/c:eXM	J
    //   23: lconst_0
    //   24: lcmp
    //   25: iflt +33 -> 58
    //   28: iload_1
    //   29: istore_2
    //   30: aload_0
    //   31: getfield 60	com/tencent/mm/plugin/mmsight/model/b/c:eXN	J
    //   34: lconst_0
    //   35: lcmp
    //   36: iflt +22 -> 58
    //   39: aload_0
    //   40: getfield 60	com/tencent/mm/plugin/mmsight/model/b/c:eXN	J
    //   43: aload_0
    //   44: getfield 58	com/tencent/mm/plugin/mmsight/model/b/c:eXM	J
    //   47: lsub
    //   48: l2f
    //   49: ldc 183
    //   51: fdiv
    //   52: invokestatic 189	java/lang/Math:round	(F)I
    //   55: iconst_1
    //   56: iadd
    //   57: istore_2
    //   58: aload_0
    //   59: iload_2
    //   60: invokestatic 195	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:initDataBufLock	(I)I
    //   63: putfield 197	com/tencent/mm/plugin/mmsight/model/b/c:eTa	I
    //   66: aload_0
    //   67: getfield 97	com/tencent/mm/plugin/mmsight/model/b/c:filePath	Ljava/lang/String;
    //   70: invokestatic 202	com/tencent/mm/bj/e:uD	(Ljava/lang/String;)Z
    //   73: ifeq +90 -> 163
    //   76: ldc 76
    //   78: ldc 204
    //   80: invokestatic 207	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   83: aload_0
    //   84: new 209	com/tencent/mm/plugin/mmsight/model/b/e
    //   87: dup
    //   88: invokespecial 210	com/tencent/mm/plugin/mmsight/model/b/e:<init>	()V
    //   91: putfield 162	com/tencent/mm/plugin/mmsight/model/b/c:oxf	Lcom/tencent/mm/plugin/mmsight/model/b/a;
    //   94: aload_0
    //   95: getfield 54	com/tencent/mm/plugin/mmsight/model/b/c:eWK	I
    //   98: ifle +79 -> 177
    //   101: aload_0
    //   102: getfield 162	com/tencent/mm/plugin/mmsight/model/b/c:oxf	Lcom/tencent/mm/plugin/mmsight/model/b/a;
    //   105: aload_0
    //   106: getfield 97	com/tencent/mm/plugin/mmsight/model/b/c:filePath	Ljava/lang/String;
    //   109: lconst_0
    //   110: aload_0
    //   111: getfield 54	com/tencent/mm/plugin/mmsight/model/b/c:eWK	I
    //   114: i2l
    //   115: aload_0
    //   116: getfield 137	com/tencent/mm/plugin/mmsight/model/b/c:videoFps	I
    //   119: invokeinterface 215 7 0
    //   124: istore_2
    //   125: ldc 76
    //   127: ldc 217
    //   129: iconst_1
    //   130: anewarray 80	java/lang/Object
    //   133: dup
    //   134: iconst_0
    //   135: iload_2
    //   136: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   139: aastore
    //   140: invokestatic 141	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   143: iload_2
    //   144: ifge +138 -> 282
    //   147: aload_0
    //   148: getfield 197	com/tencent/mm/plugin/mmsight/model/b/c:eTa	I
    //   151: invokestatic 220	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:releaseDataBufLock	(I)V
    //   154: iconst_m1
    //   155: istore_2
    //   156: ldc 182
    //   158: invokestatic 95	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   161: iload_2
    //   162: ireturn
    //   163: aload_0
    //   164: new 222	com/tencent/mm/plugin/mmsight/model/b/d
    //   167: dup
    //   168: invokespecial 223	com/tencent/mm/plugin/mmsight/model/b/d:<init>	()V
    //   171: putfield 162	com/tencent/mm/plugin/mmsight/model/b/c:oxf	Lcom/tencent/mm/plugin/mmsight/model/b/a;
    //   174: goto -80 -> 94
    //   177: aload_0
    //   178: getfield 58	com/tencent/mm/plugin/mmsight/model/b/c:eXM	J
    //   181: lconst_0
    //   182: lcmp
    //   183: iflt +41 -> 224
    //   186: aload_0
    //   187: getfield 60	com/tencent/mm/plugin/mmsight/model/b/c:eXN	J
    //   190: lconst_0
    //   191: lcmp
    //   192: iflt +32 -> 224
    //   195: aload_0
    //   196: getfield 162	com/tencent/mm/plugin/mmsight/model/b/c:oxf	Lcom/tencent/mm/plugin/mmsight/model/b/a;
    //   199: aload_0
    //   200: getfield 97	com/tencent/mm/plugin/mmsight/model/b/c:filePath	Ljava/lang/String;
    //   203: aload_0
    //   204: getfield 58	com/tencent/mm/plugin/mmsight/model/b/c:eXM	J
    //   207: aload_0
    //   208: getfield 60	com/tencent/mm/plugin/mmsight/model/b/c:eXN	J
    //   211: aload_0
    //   212: getfield 137	com/tencent/mm/plugin/mmsight/model/b/c:videoFps	I
    //   215: invokeinterface 215 7 0
    //   220: istore_2
    //   221: goto -96 -> 125
    //   224: ldc 76
    //   226: ldc 225
    //   228: iconst_3
    //   229: anewarray 80	java/lang/Object
    //   232: dup
    //   233: iconst_0
    //   234: aload_0
    //   235: getfield 54	com/tencent/mm/plugin/mmsight/model/b/c:eWK	I
    //   238: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   241: aastore
    //   242: dup
    //   243: iconst_1
    //   244: aload_0
    //   245: getfield 58	com/tencent/mm/plugin/mmsight/model/b/c:eXM	J
    //   248: invokestatic 151	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   251: aastore
    //   252: dup
    //   253: iconst_2
    //   254: aload_0
    //   255: getfield 60	com/tencent/mm/plugin/mmsight/model/b/c:eXN	J
    //   258: invokestatic 151	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   261: aastore
    //   262: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   265: aload_0
    //   266: getfield 197	com/tencent/mm/plugin/mmsight/model/b/c:eTa	I
    //   269: invokestatic 220	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:releaseDataBufLock	(I)V
    //   272: iconst_m1
    //   273: istore_2
    //   274: ldc 182
    //   276: invokestatic 95	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   279: goto -118 -> 161
    //   282: aload_0
    //   283: getfield 62	com/tencent/mm/plugin/mmsight/model/b/c:eYp	I
    //   286: ifle +39 -> 325
    //   289: aload_0
    //   290: getfield 62	com/tencent/mm/plugin/mmsight/model/b/c:eYp	I
    //   293: aload_0
    //   294: getfield 137	com/tencent/mm/plugin/mmsight/model/b/c:videoFps	I
    //   297: if_icmpge +28 -> 325
    //   300: aload_0
    //   301: getfield 162	com/tencent/mm/plugin/mmsight/model/b/c:oxf	Lcom/tencent/mm/plugin/mmsight/model/b/a;
    //   304: aload_0
    //   305: getfield 137	com/tencent/mm/plugin/mmsight/model/b/c:videoFps	I
    //   308: i2f
    //   309: aload_0
    //   310: getfield 62	com/tencent/mm/plugin/mmsight/model/b/c:eYp	I
    //   313: i2f
    //   314: fdiv
    //   315: f2d
    //   316: invokestatic 229	java/lang/Math:ceil	(D)D
    //   319: d2i
    //   320: invokeinterface 232 2 0
    //   325: aload_0
    //   326: getfield 62	com/tencent/mm/plugin/mmsight/model/b/c:eYp	I
    //   329: ifle +592 -> 921
    //   332: aload_0
    //   333: getfield 62	com/tencent/mm/plugin/mmsight/model/b/c:eYp	I
    //   336: aload_0
    //   337: getfield 137	com/tencent/mm/plugin/mmsight/model/b/c:videoFps	I
    //   340: invokestatic 236	java/lang/Math:min	(II)I
    //   343: istore_2
    //   344: aload_0
    //   345: getfield 162	com/tencent/mm/plugin/mmsight/model/b/c:oxf	Lcom/tencent/mm/plugin/mmsight/model/b/a;
    //   348: new 6	com/tencent/mm/plugin/mmsight/model/b/c$1
    //   351: dup
    //   352: aload_0
    //   353: invokespecial 239	com/tencent/mm/plugin/mmsight/model/b/c$1:<init>	(Lcom/tencent/mm/plugin/mmsight/model/b/c;)V
    //   356: invokeinterface 242 2 0
    //   361: aload_0
    //   362: new 244	com/tencent/mm/plugin/mmsight/model/b/g
    //   365: dup
    //   366: aload_0
    //   367: getfield 126	com/tencent/mm/plugin/mmsight/model/b/c:eXJ	I
    //   370: aload_0
    //   371: getfield 131	com/tencent/mm/plugin/mmsight/model/b/c:eXK	I
    //   374: aload_0
    //   375: getfield 101	com/tencent/mm/plugin/mmsight/model/b/c:eYk	I
    //   378: aload_0
    //   379: getfield 103	com/tencent/mm/plugin/mmsight/model/b/c:eYl	I
    //   382: aload_0
    //   383: getfield 105	com/tencent/mm/plugin/mmsight/model/b/c:eYm	I
    //   386: iload_2
    //   387: getstatic 249	com/tencent/mm/plugin/sight/base/b:qwY	I
    //   390: invokespecial 252	com/tencent/mm/plugin/mmsight/model/b/g:<init>	(IIIIIII)V
    //   393: putfield 175	com/tencent/mm/plugin/mmsight/model/b/c:oxn	Lcom/tencent/mm/plugin/mmsight/model/b/g;
    //   396: aload_0
    //   397: getfield 175	com/tencent/mm/plugin/mmsight/model/b/c:oxn	Lcom/tencent/mm/plugin/mmsight/model/b/g;
    //   400: astore_3
    //   401: aload_3
    //   402: iconst_0
    //   403: putfield 255	com/tencent/mm/plugin/mmsight/model/b/g:frameCount	I
    //   406: aload_3
    //   407: getfield 258	com/tencent/mm/plugin/mmsight/model/b/g:eTi	I
    //   410: aload_3
    //   411: getfield 261	com/tencent/mm/plugin/mmsight/model/b/g:eTj	I
    //   414: aload_3
    //   415: getfield 262	com/tencent/mm/plugin/mmsight/model/b/g:eTk	I
    //   418: i2f
    //   419: aload_3
    //   420: getfield 265	com/tencent/mm/plugin/mmsight/model/b/g:bitrate	I
    //   423: aload_3
    //   424: getfield 268	com/tencent/mm/plugin/mmsight/model/b/g:fzV	I
    //   427: bipush 8
    //   429: aload_3
    //   430: getfield 271	com/tencent/mm/plugin/mmsight/model/b/g:fzU	I
    //   433: ldc_w 272
    //   436: invokestatic 276	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:initH264EncoderLock	(IIFIIIIF)I
    //   439: pop
    //   440: aload_3
    //   441: new 278	com/tencent/mm/plugin/mmsight/model/b/g$a
    //   444: dup
    //   445: aload_3
    //   446: iconst_0
    //   447: invokespecial 281	com/tencent/mm/plugin/mmsight/model/b/g$a:<init>	(Lcom/tencent/mm/plugin/mmsight/model/b/g;B)V
    //   450: putfield 285	com/tencent/mm/plugin/mmsight/model/b/g:oxv	Lcom/tencent/mm/plugin/mmsight/model/b/g$a;
    //   453: aload_3
    //   454: aload_3
    //   455: getfield 285	com/tencent/mm/plugin/mmsight/model/b/g:oxv	Lcom/tencent/mm/plugin/mmsight/model/b/g$a;
    //   458: ldc_w 287
    //   461: invokestatic 293	com/tencent/mm/sdk/g/d:h	(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Thread;
    //   464: putfield 297	com/tencent/mm/plugin/mmsight/model/b/g:eVR	Ljava/lang/Thread;
    //   467: aload_3
    //   468: getfield 297	com/tencent/mm/plugin/mmsight/model/b/g:eVR	Ljava/lang/Thread;
    //   471: invokevirtual 302	java/lang/Thread:start	()V
    //   474: aload_3
    //   475: iconst_0
    //   476: putfield 306	com/tencent/mm/plugin/mmsight/model/b/g:cFy	Z
    //   479: ldc_w 308
    //   482: ldc_w 310
    //   485: invokestatic 207	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   488: aload_0
    //   489: getfield 162	com/tencent/mm/plugin/mmsight/model/b/c:oxf	Lcom/tencent/mm/plugin/mmsight/model/b/a;
    //   492: invokeinterface 313 1 0
    //   497: aload_0
    //   498: getfield 175	com/tencent/mm/plugin/mmsight/model/b/c:oxn	Lcom/tencent/mm/plugin/mmsight/model/b/g;
    //   501: astore_3
    //   502: aload_3
    //   503: getfield 285	com/tencent/mm/plugin/mmsight/model/b/g:oxv	Lcom/tencent/mm/plugin/mmsight/model/b/g$a;
    //   506: ifnull +38 -> 544
    //   509: aload_3
    //   510: getfield 297	com/tencent/mm/plugin/mmsight/model/b/g:eVR	Ljava/lang/Thread;
    //   513: ifnull +31 -> 544
    //   516: aload_3
    //   517: getfield 285	com/tencent/mm/plugin/mmsight/model/b/g:oxv	Lcom/tencent/mm/plugin/mmsight/model/b/g$a;
    //   520: iconst_1
    //   521: putfield 316	com/tencent/mm/plugin/mmsight/model/b/g$a:fYU	Z
    //   524: aload_3
    //   525: getfield 297	com/tencent/mm/plugin/mmsight/model/b/g:eVR	Ljava/lang/Thread;
    //   528: invokevirtual 319	java/lang/Thread:join	()V
    //   531: getstatic 323	com/tencent/mm/sdk/g/d:xDG	Lcom/tencent/mm/sdk/g/a/e;
    //   534: aload_3
    //   535: getfield 285	com/tencent/mm/plugin/mmsight/model/b/g:oxv	Lcom/tencent/mm/plugin/mmsight/model/b/g$a;
    //   538: invokeinterface 329 2 0
    //   543: pop
    //   544: new 331	android/media/MediaExtractor
    //   547: astore_3
    //   548: aload_3
    //   549: invokespecial 332	android/media/MediaExtractor:<init>	()V
    //   552: aload_0
    //   553: aload_3
    //   554: putfield 334	com/tencent/mm/plugin/mmsight/model/b/c:clX	Landroid/media/MediaExtractor;
    //   557: aload_0
    //   558: getfield 334	com/tencent/mm/plugin/mmsight/model/b/c:clX	Landroid/media/MediaExtractor;
    //   561: aload_0
    //   562: getfield 97	com/tencent/mm/plugin/mmsight/model/b/c:filePath	Ljava/lang/String;
    //   565: invokevirtual 338	android/media/MediaExtractor:setDataSource	(Ljava/lang/String;)V
    //   568: aconst_null
    //   569: astore_3
    //   570: iconst_0
    //   571: istore_2
    //   572: iload_2
    //   573: aload_0
    //   574: getfield 334	com/tencent/mm/plugin/mmsight/model/b/c:clX	Landroid/media/MediaExtractor;
    //   577: invokevirtual 341	android/media/MediaExtractor:getTrackCount	()I
    //   580: if_icmpge +505 -> 1085
    //   583: aload_0
    //   584: getfield 334	com/tencent/mm/plugin/mmsight/model/b/c:clX	Landroid/media/MediaExtractor;
    //   587: iload_2
    //   588: invokevirtual 345	android/media/MediaExtractor:getTrackFormat	(I)Landroid/media/MediaFormat;
    //   591: astore 4
    //   593: aload 4
    //   595: ldc_w 347
    //   598: invokevirtual 353	android/media/MediaFormat:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   601: astore_3
    //   602: aload_3
    //   603: ldc_w 355
    //   606: invokevirtual 360	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   609: ifeq +400 -> 1009
    //   612: iload_2
    //   613: iflt +141 -> 754
    //   616: aload 4
    //   618: ifnull +136 -> 754
    //   621: aload_3
    //   622: invokestatic 74	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   625: ifne +129 -> 754
    //   628: aload_0
    //   629: aload 4
    //   631: ldc_w 362
    //   634: invokevirtual 365	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   637: putfield 367	com/tencent/mm/plugin/mmsight/model/b/c:aOn	I
    //   640: aload_0
    //   641: aload 4
    //   643: ldc_w 369
    //   646: invokevirtual 365	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   649: putfield 371	com/tencent/mm/plugin/mmsight/model/b/c:eTt	I
    //   652: aload_0
    //   653: getfield 334	com/tencent/mm/plugin/mmsight/model/b/c:clX	Landroid/media/MediaExtractor;
    //   656: iload_2
    //   657: invokevirtual 374	android/media/MediaExtractor:selectTrack	(I)V
    //   660: aload_0
    //   661: getfield 58	com/tencent/mm/plugin/mmsight/model/b/c:eXM	J
    //   664: lconst_0
    //   665: lcmp
    //   666: ifle +19 -> 685
    //   669: aload_0
    //   670: getfield 334	com/tencent/mm/plugin/mmsight/model/b/c:clX	Landroid/media/MediaExtractor;
    //   673: aload_0
    //   674: getfield 58	com/tencent/mm/plugin/mmsight/model/b/c:eXM	J
    //   677: ldc2_w 375
    //   680: lmul
    //   681: iconst_0
    //   682: invokevirtual 380	android/media/MediaExtractor:seekTo	(JI)V
    //   685: aload 4
    //   687: ldc_w 382
    //   690: invokevirtual 365	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   693: invokestatic 388	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   696: astore_3
    //   697: aload_3
    //   698: invokevirtual 392	java/nio/ByteBuffer:clear	()Ljava/nio/Buffer;
    //   701: pop
    //   702: aload_0
    //   703: getfield 334	com/tencent/mm/plugin/mmsight/model/b/c:clX	Landroid/media/MediaExtractor;
    //   706: aload_3
    //   707: iconst_0
    //   708: invokevirtual 396	android/media/MediaExtractor:readSampleData	(Ljava/nio/ByteBuffer;I)I
    //   711: istore_1
    //   712: ldc 76
    //   714: ldc_w 398
    //   717: iconst_1
    //   718: anewarray 80	java/lang/Object
    //   721: dup
    //   722: iconst_0
    //   723: iload_1
    //   724: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   727: aastore
    //   728: invokestatic 400	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   731: iload_1
    //   732: ifgt +283 -> 1015
    //   735: ldc 76
    //   737: ldc_w 402
    //   740: iconst_1
    //   741: anewarray 80	java/lang/Object
    //   744: dup
    //   745: iconst_0
    //   746: iload_1
    //   747: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   750: aastore
    //   751: invokestatic 141	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   754: aload_0
    //   755: getfield 99	com/tencent/mm/plugin/mmsight/model/b/c:eYj	Ljava/lang/String;
    //   758: astore 4
    //   760: aload 4
    //   762: astore_3
    //   763: aload_0
    //   764: getfield 113	com/tencent/mm/plugin/mmsight/model/b/c:eXL	I
    //   767: ifle +27 -> 794
    //   770: new 404	java/lang/StringBuilder
    //   773: astore_3
    //   774: aload_3
    //   775: invokespecial 405	java/lang/StringBuilder:<init>	()V
    //   778: aload_3
    //   779: aload 4
    //   781: invokevirtual 409	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   784: ldc_w 411
    //   787: invokevirtual 409	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   790: invokevirtual 415	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   793: astore_3
    //   794: aload_0
    //   795: getfield 54	com/tencent/mm/plugin/mmsight/model/b/c:eWK	I
    //   798: i2l
    //   799: lstore 5
    //   801: lload 5
    //   803: lconst_0
    //   804: lcmp
    //   805: ifgt +277 -> 1082
    //   808: aload_0
    //   809: getfield 60	com/tencent/mm/plugin/mmsight/model/b/c:eXN	J
    //   812: aload_0
    //   813: getfield 58	com/tencent/mm/plugin/mmsight/model/b/c:eXM	J
    //   816: lsub
    //   817: lstore 5
    //   819: aload_0
    //   820: getfield 371	com/tencent/mm/plugin/mmsight/model/b/c:eTt	I
    //   823: sipush 1024
    //   826: iconst_2
    //   827: aload_0
    //   828: getfield 367	com/tencent/mm/plugin/mmsight/model/b/c:aOn	I
    //   831: aload_3
    //   832: aload_0
    //   833: getfield 175	com/tencent/mm/plugin/mmsight/model/b/c:oxn	Lcom/tencent/mm/plugin/mmsight/model/b/g;
    //   836: getfield 255	com/tencent/mm/plugin/mmsight/model/b/g:frameCount	I
    //   839: i2f
    //   840: ldc 183
    //   842: fmul
    //   843: lload 5
    //   845: l2f
    //   846: fdiv
    //   847: lload 5
    //   849: l2i
    //   850: aconst_null
    //   851: iconst_0
    //   852: invokestatic 419	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:muxingForX264Lock	(IIIILjava/lang/String;FI[BI)I
    //   855: istore_2
    //   856: ldc 76
    //   858: ldc_w 421
    //   861: iconst_1
    //   862: anewarray 80	java/lang/Object
    //   865: dup
    //   866: iconst_0
    //   867: iload_2
    //   868: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   871: aastore
    //   872: invokestatic 141	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   875: aload_0
    //   876: getfield 113	com/tencent/mm/plugin/mmsight/model/b/c:eXL	I
    //   879: ifle +21 -> 900
    //   882: aload_3
    //   883: aload_0
    //   884: getfield 99	com/tencent/mm/plugin/mmsight/model/b/c:eYj	Ljava/lang/String;
    //   887: aload_0
    //   888: getfield 113	com/tencent/mm/plugin/mmsight/model/b/c:eXL	I
    //   891: invokestatic 425	com/tencent/mm/plugin/sight/base/SightVideoJNI:tagRotateVideo	(Ljava/lang/String;Ljava/lang/String;I)I
    //   894: pop
    //   895: aload_3
    //   896: invokestatic 430	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   899: pop
    //   900: aload_0
    //   901: getfield 197	com/tencent/mm/plugin/mmsight/model/b/c:eTa	I
    //   904: invokestatic 220	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:releaseDataBufLock	(I)V
    //   907: getstatic 436	com/tencent/mm/plugin/mmsight/model/a/j:owk	Lcom/tencent/mm/plugin/mmsight/model/a/j;
    //   910: invokevirtual 439	com/tencent/mm/plugin/mmsight/model/a/j:WY	()V
    //   913: ldc 182
    //   915: invokestatic 95	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   918: goto -757 -> 161
    //   921: aload_0
    //   922: getfield 137	com/tencent/mm/plugin/mmsight/model/b/c:videoFps	I
    //   925: istore_2
    //   926: goto -582 -> 344
    //   929: astore_3
    //   930: ldc_w 308
    //   933: aload_3
    //   934: ldc_w 441
    //   937: iconst_1
    //   938: anewarray 80	java/lang/Object
    //   941: dup
    //   942: iconst_0
    //   943: aload_3
    //   944: invokevirtual 444	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   947: aastore
    //   948: invokestatic 448	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   951: goto -407 -> 544
    //   954: astore_3
    //   955: ldc 76
    //   957: aload_3
    //   958: ldc_w 450
    //   961: iconst_1
    //   962: anewarray 80	java/lang/Object
    //   965: dup
    //   966: iconst_0
    //   967: aload_3
    //   968: invokevirtual 444	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   971: aastore
    //   972: invokestatic 448	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   975: iconst_m1
    //   976: istore_2
    //   977: ldc 182
    //   979: invokestatic 95	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   982: goto -821 -> 161
    //   985: astore_3
    //   986: ldc 76
    //   988: aload_3
    //   989: ldc_w 452
    //   992: iconst_1
    //   993: anewarray 80	java/lang/Object
    //   996: dup
    //   997: iconst_0
    //   998: aload_3
    //   999: invokevirtual 453	java/io/IOException:getMessage	()Ljava/lang/String;
    //   1002: aastore
    //   1003: invokestatic 448	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1006: goto -252 -> 754
    //   1009: iinc 2 1
    //   1012: goto -440 -> 572
    //   1015: aload_0
    //   1016: getfield 334	com/tencent/mm/plugin/mmsight/model/b/c:clX	Landroid/media/MediaExtractor;
    //   1019: invokevirtual 457	android/media/MediaExtractor:getSampleTime	()J
    //   1022: aload_0
    //   1023: getfield 60	com/tencent/mm/plugin/mmsight/model/b/c:eXN	J
    //   1026: ldc2_w 375
    //   1029: lmul
    //   1030: lcmp
    //   1031: ifge -277 -> 754
    //   1034: aload_0
    //   1035: getfield 334	com/tencent/mm/plugin/mmsight/model/b/c:clX	Landroid/media/MediaExtractor;
    //   1038: invokevirtual 460	android/media/MediaExtractor:getSampleTrackIndex	()I
    //   1041: iload_2
    //   1042: if_icmpeq +14 -> 1056
    //   1045: ldc 76
    //   1047: ldc_w 462
    //   1050: invokestatic 464	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1053: goto -299 -> 754
    //   1056: aload_3
    //   1057: iconst_0
    //   1058: invokevirtual 468	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   1061: pop
    //   1062: aload_0
    //   1063: getfield 197	com/tencent/mm/plugin/mmsight/model/b/c:eTa	I
    //   1066: aload_3
    //   1067: iload_1
    //   1068: invokestatic 472	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:writeAACDataLock	(ILjava/nio/ByteBuffer;I)V
    //   1071: aload_0
    //   1072: getfield 334	com/tencent/mm/plugin/mmsight/model/b/c:clX	Landroid/media/MediaExtractor;
    //   1075: invokevirtual 476	android/media/MediaExtractor:advance	()Z
    //   1078: pop
    //   1079: goto -382 -> 697
    //   1082: goto -263 -> 819
    //   1085: aconst_null
    //   1086: astore 4
    //   1088: iconst_m1
    //   1089: istore_2
    //   1090: goto -478 -> 612
    //
    // Exception table:
    //   from	to	target	type
    //   524	544	929	java/lang/Exception
    //   488	524	954	java/lang/Exception
    //   544	557	954	java/lang/Exception
    //   557	568	954	java/lang/Exception
    //   572	612	954	java/lang/Exception
    //   621	685	954	java/lang/Exception
    //   685	697	954	java/lang/Exception
    //   697	731	954	java/lang/Exception
    //   735	754	954	java/lang/Exception
    //   754	760	954	java/lang/Exception
    //   763	794	954	java/lang/Exception
    //   794	801	954	java/lang/Exception
    //   808	819	954	java/lang/Exception
    //   819	900	954	java/lang/Exception
    //   900	913	954	java/lang/Exception
    //   930	951	954	java/lang/Exception
    //   986	1006	954	java/lang/Exception
    //   1015	1053	954	java/lang/Exception
    //   1056	1079	954	java/lang/Exception
    //   557	568	985	java/io/IOException
  }

  public final int getType()
  {
    return 3;
  }

  public final void r(Bitmap paramBitmap)
  {
    if (paramBitmap != null)
      this.eXi = paramBitmap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.b.c
 * JD-Core Version:    0.6.2
 */