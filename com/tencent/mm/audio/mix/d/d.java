package com.tencent.mm.audio.mix.d;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.c.a;
import com.tencent.mm.audio.mix.c.g;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class d extends c
{
  private MediaCodec bek;
  private byte[] buffer;
  private int cku;
  private MediaExtractor clX;
  private String clY;
  private int clZ;
  private byte[] cma;
  private int cmb;
  private byte[] cmc;
  private long duration;
  private int mSize;
  private long presentationTimeUs;

  public d(com.tencent.mm.audio.mix.f.d paramd, com.tencent.mm.audio.mix.g.b paramb)
  {
    super(paramd, paramb);
    AppMethodBeat.i(137051);
    this.clY = null;
    this.cku = 2;
    this.presentationTimeUs = 0L;
    this.duration = 0L;
    this.clZ = 14144;
    this.buffer = new byte[this.clZ];
    this.cma = new byte[3536];
    this.cmb = 3536;
    this.cmc = new byte[3536];
    this.mSize = 0;
    AppMethodBeat.o(137051);
  }

  private void DO()
  {
    AppMethodBeat.i(137060);
    try
    {
      if (this.clX != null)
      {
        this.clX.release();
        this.clX = null;
      }
      AppMethodBeat.o(137060);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.audio.mix.h.b.printErrStackTrace("MicroMsg.Mix.AudioDecoderMediaCodec", localException, "releaseMediaExtractor", new Object[0]);
        AppMethodBeat.o(137060);
      }
    }
  }

  private void DP()
  {
    AppMethodBeat.i(137061);
    try
    {
      if (this.bek != null)
      {
        this.bek.stop();
        this.bek.release();
        this.bek = null;
      }
      AppMethodBeat.o(137061);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.audio.mix.h.b.printErrStackTrace("MicroMsg.Mix.AudioDecoderMediaCodec", localException, "releaseMediaCodec", new Object[0]);
        AppMethodBeat.o(137061);
      }
    }
  }

  private void a(com.tencent.mm.audio.mix.a.c paramc, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(137057);
    if (paramArrayOfByte == null)
    {
      com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecoderMediaCodec", "pushBuffer chunk is null");
      AppMethodBeat.o(137057);
    }
    while (true)
    {
      return;
      int i = paramArrayOfByte.length;
      if (i == 3536)
      {
        if (this.mSize > 0)
          c(paramc);
        b(paramc, paramArrayOfByte);
        AppMethodBeat.o(137057);
      }
      else
      {
        if (i != 3536)
        {
          if (i > this.clZ)
          {
            while (this.clZ < i)
              this.clZ += 3536;
            byte[] arrayOfByte = new byte[this.clZ];
            if (this.mSize > 0)
              System.arraycopy(this.buffer, 0, arrayOfByte, 0, this.mSize);
            this.buffer = arrayOfByte;
          }
          int j = this.mSize + i;
          int k = this.mSize;
          System.arraycopy(paramArrayOfByte, 0, this.buffer, k, i);
          i = j / 3536;
          k = j % 3536;
          for (j = 0; j < i; j++)
          {
            paramArrayOfByte = new byte[3536];
            System.arraycopy(this.buffer, j * 3536, paramArrayOfByte, 0, 3536);
            b(paramc, paramArrayOfByte);
          }
          System.arraycopy(this.buffer, i * 3536, this.cmc, 0, k);
          Arrays.fill(this.buffer, 0, this.clZ, (byte)0);
          System.arraycopy(this.cmc, 0, this.buffer, 0, k);
          this.mSize = k;
        }
        AppMethodBeat.o(137057);
      }
    }
  }

  private void b(com.tencent.mm.audio.mix.a.c paramc, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(137058);
    com.tencent.mm.audio.mix.a.d locald = com.tencent.mm.audio.mix.b.c.Dk().Dj();
    locald.ckv = paramArrayOfByte;
    locald.sampleRate = this.sampleRate;
    locald.channels = this.channels;
    locald.cku = this.cku;
    paramc.a(locald);
    a(locald);
    AppMethodBeat.o(137058);
  }

  // ERROR //
  protected final void DG()
  {
    // Byte code:
    //   0: ldc 154
    //   2: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 71
    //   7: ldc 156
    //   9: invokestatic 158	com/tencent/mm/audio/mix/h/b:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   12: aload_0
    //   13: new 66	android/media/MediaExtractor
    //   16: dup
    //   17: invokespecial 160	android/media/MediaExtractor:<init>	()V
    //   20: putfield 64	com/tencent/mm/audio/mix/d/d:clX	Landroid/media/MediaExtractor;
    //   23: aload_0
    //   24: getfield 64	com/tencent/mm/audio/mix/d/d:clX	Landroid/media/MediaExtractor;
    //   27: aload_0
    //   28: getfield 163	com/tencent/mm/audio/mix/d/d:clO	Ljava/lang/String;
    //   31: invokevirtual 167	android/media/MediaExtractor:setDataSource	(Ljava/lang/String;)V
    //   34: aload_0
    //   35: getfield 64	com/tencent/mm/audio/mix/d/d:clX	Landroid/media/MediaExtractor;
    //   38: invokevirtual 171	android/media/MediaExtractor:getTrackCount	()I
    //   41: istore_1
    //   42: ldc 71
    //   44: ldc 173
    //   46: iconst_1
    //   47: anewarray 75	java/lang/Object
    //   50: dup
    //   51: iconst_0
    //   52: iload_1
    //   53: invokestatic 179	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   56: aastore
    //   57: invokestatic 182	com/tencent/mm/audio/mix/h/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   60: iconst_0
    //   61: istore_2
    //   62: iload_2
    //   63: iload_1
    //   64: if_icmpge +1409 -> 1473
    //   67: aload_0
    //   68: getfield 64	com/tencent/mm/audio/mix/d/d:clX	Landroid/media/MediaExtractor;
    //   71: iload_2
    //   72: invokevirtual 186	android/media/MediaExtractor:getTrackFormat	(I)Landroid/media/MediaFormat;
    //   75: astore_3
    //   76: aload_0
    //   77: aload_3
    //   78: ldc 188
    //   80: invokevirtual 194	android/media/MediaFormat:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   83: putfield 35	com/tencent/mm/audio/mix/d/d:clY	Ljava/lang/String;
    //   86: aload_0
    //   87: getfield 35	com/tencent/mm/audio/mix/d/d:clY	Ljava/lang/String;
    //   90: invokestatic 200	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   93: ifne +90 -> 183
    //   96: aload_0
    //   97: getfield 35	com/tencent/mm/audio/mix/d/d:clY	Ljava/lang/String;
    //   100: ldc 202
    //   102: invokevirtual 208	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   105: ifeq +78 -> 183
    //   108: aload_3
    //   109: ifnonnull +80 -> 189
    //   112: ldc 71
    //   114: ldc 210
    //   116: invokestatic 102	com/tencent/mm/audio/mix/h/b:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   119: aload_0
    //   120: sipush 703
    //   123: putfield 213	com/tencent/mm/audio/mix/d/d:clN	I
    //   126: aload_0
    //   127: aload_0
    //   128: getfield 213	com/tencent/mm/audio/mix/d/d:clN	I
    //   131: invokevirtual 216	com/tencent/mm/audio/mix/d/d:onError	(I)V
    //   134: aload_0
    //   135: invokespecial 218	com/tencent/mm/audio/mix/d/d:DO	()V
    //   138: ldc 154
    //   140: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   143: return
    //   144: astore_3
    //   145: ldc 71
    //   147: aload_3
    //   148: ldc 220
    //   150: iconst_1
    //   151: anewarray 75	java/lang/Object
    //   154: dup
    //   155: iconst_0
    //   156: aload_0
    //   157: getfield 163	com/tencent/mm/audio/mix/d/d:clO	Ljava/lang/String;
    //   160: aastore
    //   161: invokestatic 81	com/tencent/mm/audio/mix/h/b:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   164: aload_0
    //   165: sipush 702
    //   168: putfield 213	com/tencent/mm/audio/mix/d/d:clN	I
    //   171: aload_0
    //   172: invokevirtual 223	com/tencent/mm/audio/mix/d/d:Dz	()V
    //   175: ldc 154
    //   177: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   180: goto -37 -> 143
    //   183: iinc 2 1
    //   186: goto -124 -> 62
    //   189: ldc 71
    //   191: ldc 225
    //   193: iconst_1
    //   194: anewarray 75	java/lang/Object
    //   197: dup
    //   198: iconst_0
    //   199: aload_3
    //   200: aastore
    //   201: invokestatic 182	com/tencent/mm/audio/mix/h/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   204: aload_0
    //   205: aload_3
    //   206: ldc 227
    //   208: invokevirtual 231	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   211: putfield 140	com/tencent/mm/audio/mix/d/d:sampleRate	I
    //   214: aload_0
    //   215: aload_3
    //   216: ldc 233
    //   218: invokevirtual 231	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   221: putfield 144	com/tencent/mm/audio/mix/d/d:channels	I
    //   224: aload_0
    //   225: aload_3
    //   226: ldc 235
    //   228: invokevirtual 239	android/media/MediaFormat:getLong	(Ljava/lang/String;)J
    //   231: putfield 41	com/tencent/mm/audio/mix/d/d:duration	J
    //   234: aload_0
    //   235: aload_0
    //   236: getfield 35	com/tencent/mm/audio/mix/d/d:clY	Ljava/lang/String;
    //   239: invokestatic 243	android/media/MediaCodec:createDecoderByType	(Ljava/lang/String;)Landroid/media/MediaCodec;
    //   242: putfield 85	com/tencent/mm/audio/mix/d/d:bek	Landroid/media/MediaCodec;
    //   245: aload_0
    //   246: getfield 85	com/tencent/mm/audio/mix/d/d:bek	Landroid/media/MediaCodec;
    //   249: aload_3
    //   250: aconst_null
    //   251: aconst_null
    //   252: iconst_0
    //   253: invokevirtual 247	android/media/MediaCodec:configure	(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    //   256: aload_0
    //   257: getfield 85	com/tencent/mm/audio/mix/d/d:bek	Landroid/media/MediaCodec;
    //   260: invokevirtual 250	android/media/MediaCodec:start	()V
    //   263: aload_0
    //   264: getfield 85	com/tencent/mm/audio/mix/d/d:bek	Landroid/media/MediaCodec;
    //   267: invokevirtual 254	android/media/MediaCodec:getInputBuffers	()[Ljava/nio/ByteBuffer;
    //   270: astore 4
    //   272: aload_0
    //   273: getfield 85	com/tencent/mm/audio/mix/d/d:bek	Landroid/media/MediaCodec;
    //   276: invokevirtual 257	android/media/MediaCodec:getOutputBuffers	()[Ljava/nio/ByteBuffer;
    //   279: astore 5
    //   281: ldc 71
    //   283: ldc_w 259
    //   286: iconst_2
    //   287: anewarray 75	java/lang/Object
    //   290: dup
    //   291: iconst_0
    //   292: aload_3
    //   293: aastore
    //   294: dup
    //   295: iconst_1
    //   296: aload_0
    //   297: getfield 35	com/tencent/mm/audio/mix/d/d:clY	Ljava/lang/String;
    //   300: aastore
    //   301: invokestatic 182	com/tencent/mm/audio/mix/h/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   304: ldc 71
    //   306: ldc_w 261
    //   309: iconst_5
    //   310: anewarray 75	java/lang/Object
    //   313: dup
    //   314: iconst_0
    //   315: aload_0
    //   316: getfield 140	com/tencent/mm/audio/mix/d/d:sampleRate	I
    //   319: invokestatic 179	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   322: aastore
    //   323: dup
    //   324: iconst_1
    //   325: aload_0
    //   326: getfield 144	com/tencent/mm/audio/mix/d/d:channels	I
    //   329: invokestatic 179	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   332: aastore
    //   333: dup
    //   334: iconst_2
    //   335: aload_0
    //   336: getfield 37	com/tencent/mm/audio/mix/d/d:cku	I
    //   339: invokestatic 179	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   342: aastore
    //   343: dup
    //   344: iconst_3
    //   345: aload_0
    //   346: getfield 41	com/tencent/mm/audio/mix/d/d:duration	J
    //   349: invokestatic 266	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   352: aastore
    //   353: dup
    //   354: iconst_4
    //   355: aload_0
    //   356: getfield 270	com/tencent/mm/audio/mix/d/d:clK	Lcom/tencent/mm/audio/mix/g/b;
    //   359: invokeinterface 276 1 0
    //   364: getfield 281	com/tencent/mm/ag/b:ckD	Ljava/lang/String;
    //   367: aastore
    //   368: invokestatic 182	com/tencent/mm/audio/mix/h/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   371: aload_0
    //   372: getfield 64	com/tencent/mm/audio/mix/d/d:clX	Landroid/media/MediaExtractor;
    //   375: iconst_0
    //   376: invokevirtual 284	android/media/MediaExtractor:selectTrack	(I)V
    //   379: new 286	android/media/MediaCodec$BufferInfo
    //   382: dup
    //   383: invokespecial 287	android/media/MediaCodec$BufferInfo:<init>	()V
    //   386: astore 6
    //   388: iconst_0
    //   389: istore_1
    //   390: aload_0
    //   391: invokevirtual 291	com/tencent/mm/audio/mix/d/d:DC	()Lcom/tencent/mm/audio/mix/a/c;
    //   394: astore 7
    //   396: aload 7
    //   398: invokevirtual 294	com/tencent/mm/audio/mix/a/c:reset	()V
    //   401: aload_0
    //   402: getfield 140	com/tencent/mm/audio/mix/d/d:sampleRate	I
    //   405: aload_0
    //   406: getfield 144	com/tencent/mm/audio/mix/d/d:channels	I
    //   409: aload_0
    //   410: getfield 37	com/tencent/mm/audio/mix/d/d:cku	I
    //   413: invokestatic 300	com/tencent/mm/audio/mix/f/a:E	(III)Z
    //   416: ifne +40 -> 456
    //   419: ldc 71
    //   421: ldc_w 302
    //   424: invokestatic 102	com/tencent/mm/audio/mix/h/b:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   427: aload_0
    //   428: new 304	com/tencent/mm/audio/mix/c/d
    //   431: dup
    //   432: aload 7
    //   434: aload_0
    //   435: getfield 140	com/tencent/mm/audio/mix/d/d:sampleRate	I
    //   438: aload_0
    //   439: getfield 144	com/tencent/mm/audio/mix/d/d:channels	I
    //   442: aload_0
    //   443: getfield 37	com/tencent/mm/audio/mix/d/d:cku	I
    //   446: aload_0
    //   447: getfield 163	com/tencent/mm/audio/mix/d/d:clO	Ljava/lang/String;
    //   450: invokespecial 307	com/tencent/mm/audio/mix/c/d:<init>	(Lcom/tencent/mm/audio/mix/a/c;IIILjava/lang/String;)V
    //   453: putfield 311	com/tencent/mm/audio/mix/d/d:clM	Lcom/tencent/mm/audio/mix/c/g;
    //   456: aload 7
    //   458: aload_0
    //   459: getfield 41	com/tencent/mm/audio/mix/d/d:duration	J
    //   462: ldc2_w 312
    //   465: ldiv
    //   466: putfield 314	com/tencent/mm/audio/mix/a/c:duration	J
    //   469: iconst_0
    //   470: istore 8
    //   472: iconst_0
    //   473: istore_2
    //   474: aload 5
    //   476: astore_3
    //   477: iload 8
    //   479: ifne +865 -> 1344
    //   482: iload_1
    //   483: bipush 50
    //   485: if_icmpge +859 -> 1344
    //   488: aload_0
    //   489: invokevirtual 318	com/tencent/mm/audio/mix/d/d:DB	()Z
    //   492: ifne +852 -> 1344
    //   495: aload_0
    //   496: invokevirtual 321	com/tencent/mm/audio/mix/d/d:DD	()V
    //   499: iinc 1 1
    //   502: iload_2
    //   503: ifne +321 -> 824
    //   506: aload_0
    //   507: getfield 85	com/tencent/mm/audio/mix/d/d:bek	Landroid/media/MediaCodec;
    //   510: ldc2_w 312
    //   513: invokevirtual 325	android/media/MediaCodec:dequeueInputBuffer	(J)I
    //   516: istore 9
    //   518: iload 9
    //   520: iflt +288 -> 808
    //   523: aload 4
    //   525: iload 9
    //   527: aaload
    //   528: astore 5
    //   530: aload_0
    //   531: getfield 64	com/tencent/mm/audio/mix/d/d:clX	Landroid/media/MediaExtractor;
    //   534: aload 5
    //   536: iconst_0
    //   537: invokevirtual 329	android/media/MediaExtractor:readSampleData	(Ljava/nio/ByteBuffer;I)I
    //   540: istore 10
    //   542: iload 10
    //   544: ifge +244 -> 788
    //   547: ldc 71
    //   549: ldc_w 331
    //   552: invokestatic 102	com/tencent/mm/audio/mix/h/b:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   555: iconst_1
    //   556: istore_2
    //   557: iconst_0
    //   558: istore 10
    //   560: aload_0
    //   561: getfield 85	com/tencent/mm/audio/mix/d/d:bek	Landroid/media/MediaCodec;
    //   564: astore 5
    //   566: aload_0
    //   567: getfield 39	com/tencent/mm/audio/mix/d/d:presentationTimeUs	J
    //   570: lstore 11
    //   572: iload_2
    //   573: ifeq +229 -> 802
    //   576: iconst_4
    //   577: istore 13
    //   579: aload 5
    //   581: iload 9
    //   583: iconst_0
    //   584: iload 10
    //   586: lload 11
    //   588: iload 13
    //   590: invokevirtual 335	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   593: iload_2
    //   594: ifne +11 -> 605
    //   597: aload_0
    //   598: getfield 64	com/tencent/mm/audio/mix/d/d:clX	Landroid/media/MediaExtractor;
    //   601: invokevirtual 338	android/media/MediaExtractor:advance	()Z
    //   604: pop
    //   605: aload_0
    //   606: getfield 85	com/tencent/mm/audio/mix/d/d:bek	Landroid/media/MediaCodec;
    //   609: aload 6
    //   611: ldc2_w 312
    //   614: invokevirtual 342	android/media/MediaCodec:dequeueOutputBuffer	(Landroid/media/MediaCodec$BufferInfo;J)I
    //   617: istore 10
    //   619: iload 10
    //   621: iflt +206 -> 827
    //   624: aload 6
    //   626: getfield 345	android/media/MediaCodec$BufferInfo:size	I
    //   629: ifle +841 -> 1470
    //   632: iconst_0
    //   633: istore_1
    //   634: aload_3
    //   635: iload 10
    //   637: aaload
    //   638: astore 5
    //   640: aload 6
    //   642: getfield 345	android/media/MediaCodec$BufferInfo:size	I
    //   645: istore 13
    //   647: iload 13
    //   649: ifle +13 -> 662
    //   652: aload_0
    //   653: aload 7
    //   655: aload 5
    //   657: iload 13
    //   659: invokevirtual 348	com/tencent/mm/audio/mix/d/d:a	(Lcom/tencent/mm/audio/mix/a/c;Ljava/nio/ByteBuffer;I)V
    //   662: aload 5
    //   664: invokevirtual 354	java/nio/ByteBuffer:clear	()Ljava/nio/Buffer;
    //   667: pop
    //   668: aload_0
    //   669: getfield 85	com/tencent/mm/audio/mix/d/d:bek	Landroid/media/MediaCodec;
    //   672: iload 10
    //   674: iconst_0
    //   675: invokevirtual 358	android/media/MediaCodec:releaseOutputBuffer	(IZ)V
    //   678: aload 6
    //   680: getfield 361	android/media/MediaCodec$BufferInfo:flags	I
    //   683: iconst_4
    //   684: iand
    //   685: ifeq +14 -> 699
    //   688: ldc 71
    //   690: ldc_w 363
    //   693: invokestatic 102	com/tencent/mm/audio/mix/h/b:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   696: iconst_1
    //   697: istore 8
    //   699: goto -222 -> 477
    //   702: astore_3
    //   703: ldc 71
    //   705: aload_3
    //   706: ldc_w 365
    //   709: iconst_0
    //   710: anewarray 75	java/lang/Object
    //   713: invokestatic 81	com/tencent/mm/audio/mix/h/b:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   716: aload_0
    //   717: sipush 705
    //   720: putfield 213	com/tencent/mm/audio/mix/d/d:clN	I
    //   723: aload_0
    //   724: aload_0
    //   725: getfield 213	com/tencent/mm/audio/mix/d/d:clN	I
    //   728: invokevirtual 216	com/tencent/mm/audio/mix/d/d:onError	(I)V
    //   731: aload_0
    //   732: invokespecial 218	com/tencent/mm/audio/mix/d/d:DO	()V
    //   735: ldc 154
    //   737: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   740: goto -597 -> 143
    //   743: astore_3
    //   744: ldc 71
    //   746: aload_3
    //   747: ldc_w 366
    //   750: iconst_0
    //   751: anewarray 75	java/lang/Object
    //   754: invokestatic 81	com/tencent/mm/audio/mix/h/b:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   757: aload_0
    //   758: sipush 704
    //   761: putfield 213	com/tencent/mm/audio/mix/d/d:clN	I
    //   764: aload_0
    //   765: aload_0
    //   766: getfield 213	com/tencent/mm/audio/mix/d/d:clN	I
    //   769: invokevirtual 216	com/tencent/mm/audio/mix/d/d:onError	(I)V
    //   772: aload_0
    //   773: invokespecial 218	com/tencent/mm/audio/mix/d/d:DO	()V
    //   776: aload_0
    //   777: invokespecial 368	com/tencent/mm/audio/mix/d/d:DP	()V
    //   780: ldc 154
    //   782: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   785: goto -642 -> 143
    //   788: aload_0
    //   789: aload_0
    //   790: getfield 64	com/tencent/mm/audio/mix/d/d:clX	Landroid/media/MediaExtractor;
    //   793: invokevirtual 372	android/media/MediaExtractor:getSampleTime	()J
    //   796: putfield 39	com/tencent/mm/audio/mix/d/d:presentationTimeUs	J
    //   799: goto -239 -> 560
    //   802: iconst_0
    //   803: istore 13
    //   805: goto -226 -> 579
    //   808: ldc 71
    //   810: ldc_w 374
    //   813: iload 9
    //   815: invokestatic 377	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   818: invokevirtual 380	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   821: invokestatic 102	com/tencent/mm/audio/mix/h/b:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   824: goto -219 -> 605
    //   827: iload 10
    //   829: bipush 253
    //   831: if_icmpne +22 -> 853
    //   834: aload_0
    //   835: getfield 85	com/tencent/mm/audio/mix/d/d:bek	Landroid/media/MediaCodec;
    //   838: invokevirtual 257	android/media/MediaCodec:getOutputBuffers	()[Ljava/nio/ByteBuffer;
    //   841: astore_3
    //   842: ldc 71
    //   844: ldc_w 382
    //   847: invokestatic 158	com/tencent/mm/audio/mix/h/b:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   850: goto -373 -> 477
    //   853: iload 10
    //   855: bipush 254
    //   857: if_icmpne +468 -> 1325
    //   860: aload_0
    //   861: getfield 85	com/tencent/mm/audio/mix/d/d:bek	Landroid/media/MediaCodec;
    //   864: invokevirtual 386	android/media/MediaCodec:getOutputFormat	()Landroid/media/MediaFormat;
    //   867: astore 5
    //   869: ldc 71
    //   871: ldc_w 388
    //   874: aload 5
    //   876: invokestatic 391	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   879: invokevirtual 380	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   882: invokestatic 158	com/tencent/mm/audio/mix/h/b:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   885: aload_0
    //   886: aload 5
    //   888: ldc 227
    //   890: invokevirtual 231	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   893: putfield 140	com/tencent/mm/audio/mix/d/d:sampleRate	I
    //   896: aload_0
    //   897: aload 5
    //   899: ldc 233
    //   901: invokevirtual 231	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   904: putfield 144	com/tencent/mm/audio/mix/d/d:channels	I
    //   907: aload 5
    //   909: ldc_w 393
    //   912: invokevirtual 396	android/media/MediaFormat:containsKey	(Ljava/lang/String;)Z
    //   915: ifeq +170 -> 1085
    //   918: aload_0
    //   919: aload 5
    //   921: ldc_w 393
    //   924: invokevirtual 231	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   927: putfield 37	com/tencent/mm/audio/mix/d/d:cku	I
    //   930: ldc 71
    //   932: ldc_w 398
    //   935: iconst_5
    //   936: anewarray 75	java/lang/Object
    //   939: dup
    //   940: iconst_0
    //   941: aload_0
    //   942: getfield 140	com/tencent/mm/audio/mix/d/d:sampleRate	I
    //   945: invokestatic 179	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   948: aastore
    //   949: dup
    //   950: iconst_1
    //   951: aload_0
    //   952: getfield 144	com/tencent/mm/audio/mix/d/d:channels	I
    //   955: invokestatic 179	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   958: aastore
    //   959: dup
    //   960: iconst_2
    //   961: aload_0
    //   962: getfield 37	com/tencent/mm/audio/mix/d/d:cku	I
    //   965: invokestatic 179	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   968: aastore
    //   969: dup
    //   970: iconst_3
    //   971: aload_0
    //   972: getfield 270	com/tencent/mm/audio/mix/d/d:clK	Lcom/tencent/mm/audio/mix/g/b;
    //   975: invokeinterface 276 1 0
    //   980: getfield 281	com/tencent/mm/ag/b:ckD	Ljava/lang/String;
    //   983: aastore
    //   984: dup
    //   985: iconst_4
    //   986: aload_0
    //   987: getfield 163	com/tencent/mm/audio/mix/d/d:clO	Ljava/lang/String;
    //   990: aastore
    //   991: invokestatic 182	com/tencent/mm/audio/mix/h/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   994: aload_0
    //   995: getfield 37	com/tencent/mm/audio/mix/d/d:cku	I
    //   998: tableswitch	default:+26 -> 1024, 1:+223->1221, 2:+223->1221, 3:+223->1221
    //   1025: istore 10
    //   1027: iload 10
    //   1029: ifne +198 -> 1227
    //   1032: ldc 71
    //   1034: ldc_w 400
    //   1037: iconst_1
    //   1038: anewarray 75	java/lang/Object
    //   1041: dup
    //   1042: iconst_0
    //   1043: aload_0
    //   1044: getfield 37	com/tencent/mm/audio/mix/d/d:cku	I
    //   1047: invokestatic 179	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1050: aastore
    //   1051: invokestatic 402	com/tencent/mm/audio/mix/h/b:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1054: aload_0
    //   1055: sipush 709
    //   1058: putfield 213	com/tencent/mm/audio/mix/d/d:clN	I
    //   1061: aload_0
    //   1062: aload_0
    //   1063: getfield 213	com/tencent/mm/audio/mix/d/d:clN	I
    //   1066: invokevirtual 216	com/tencent/mm/audio/mix/d/d:onError	(I)V
    //   1069: aload_0
    //   1070: invokespecial 218	com/tencent/mm/audio/mix/d/d:DO	()V
    //   1073: aload_0
    //   1074: invokespecial 368	com/tencent/mm/audio/mix/d/d:DP	()V
    //   1077: ldc 154
    //   1079: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1082: goto -939 -> 143
    //   1085: aload 5
    //   1087: ldc_w 404
    //   1090: invokevirtual 396	android/media/MediaFormat:containsKey	(Ljava/lang/String;)Z
    //   1093: ifeq -163 -> 930
    //   1096: aload 5
    //   1098: ldc_w 404
    //   1101: invokevirtual 231	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   1104: istore 10
    //   1106: iload 10
    //   1108: bipush 16
    //   1110: if_icmpne +80 -> 1190
    //   1113: aload_0
    //   1114: iconst_2
    //   1115: putfield 37	com/tencent/mm/audio/mix/d/d:cku	I
    //   1118: goto -188 -> 930
    //   1121: astore_3
    //   1122: ldc 71
    //   1124: aload_3
    //   1125: ldc 156
    //   1127: iconst_0
    //   1128: anewarray 75	java/lang/Object
    //   1131: invokestatic 81	com/tencent/mm/audio/mix/h/b:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1134: aload_0
    //   1135: sipush 706
    //   1138: putfield 213	com/tencent/mm/audio/mix/d/d:clN	I
    //   1141: aload_0
    //   1142: aload_0
    //   1143: getfield 213	com/tencent/mm/audio/mix/d/d:clN	I
    //   1146: invokevirtual 216	com/tencent/mm/audio/mix/d/d:onError	(I)V
    //   1149: aload_0
    //   1150: invokespecial 218	com/tencent/mm/audio/mix/d/d:DO	()V
    //   1153: aload_0
    //   1154: invokespecial 368	com/tencent/mm/audio/mix/d/d:DP	()V
    //   1157: aload 7
    //   1159: aload_0
    //   1160: getfield 270	com/tencent/mm/audio/mix/d/d:clK	Lcom/tencent/mm/audio/mix/g/b;
    //   1163: invokeinterface 276 1 0
    //   1168: getfield 408	com/tencent/mm/ag/b:ckA	Z
    //   1171: putfield 409	com/tencent/mm/audio/mix/a/c:ckA	Z
    //   1174: ldc 71
    //   1176: ldc_w 411
    //   1179: invokestatic 158	com/tencent/mm/audio/mix/h/b:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1182: ldc 154
    //   1184: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1187: goto -1044 -> 143
    //   1190: iload 10
    //   1192: bipush 8
    //   1194: if_icmpne -264 -> 930
    //   1197: aload_0
    //   1198: iconst_3
    //   1199: putfield 37	com/tencent/mm/audio/mix/d/d:cku	I
    //   1202: goto -272 -> 930
    //   1205: astore_3
    //   1206: aload_0
    //   1207: invokespecial 218	com/tencent/mm/audio/mix/d/d:DO	()V
    //   1210: aload_0
    //   1211: invokespecial 368	com/tencent/mm/audio/mix/d/d:DP	()V
    //   1214: ldc 154
    //   1216: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1219: aload_3
    //   1220: athrow
    //   1221: iconst_1
    //   1222: istore 10
    //   1224: goto -197 -> 1027
    //   1227: aload_0
    //   1228: getfield 140	com/tencent/mm/audio/mix/d/d:sampleRate	I
    //   1231: aload_0
    //   1232: getfield 144	com/tencent/mm/audio/mix/d/d:channels	I
    //   1235: aload_0
    //   1236: getfield 37	com/tencent/mm/audio/mix/d/d:cku	I
    //   1239: invokestatic 300	com/tencent/mm/audio/mix/f/a:E	(III)Z
    //   1242: ifeq +44 -> 1286
    //   1245: aload_0
    //   1246: getfield 311	com/tencent/mm/audio/mix/d/d:clM	Lcom/tencent/mm/audio/mix/c/g;
    //   1249: ifnull +37 -> 1286
    //   1252: ldc 71
    //   1254: ldc_w 413
    //   1257: invokestatic 158	com/tencent/mm/audio/mix/h/b:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1260: aload_0
    //   1261: getfield 311	com/tencent/mm/audio/mix/d/d:clM	Lcom/tencent/mm/audio/mix/c/g;
    //   1264: invokeinterface 418 1 0
    //   1269: aload_0
    //   1270: getfield 311	com/tencent/mm/audio/mix/d/d:clM	Lcom/tencent/mm/audio/mix/c/g;
    //   1273: invokeinterface 419 1 0
    //   1278: aload_0
    //   1279: aconst_null
    //   1280: putfield 311	com/tencent/mm/audio/mix/d/d:clM	Lcom/tencent/mm/audio/mix/c/g;
    //   1283: goto -806 -> 477
    //   1286: aload_0
    //   1287: getfield 311	com/tencent/mm/audio/mix/d/d:clM	Lcom/tencent/mm/audio/mix/c/g;
    //   1290: ifnull +32 -> 1322
    //   1293: ldc 71
    //   1295: ldc_w 421
    //   1298: invokestatic 158	com/tencent/mm/audio/mix/h/b:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1301: aload_0
    //   1302: getfield 311	com/tencent/mm/audio/mix/d/d:clM	Lcom/tencent/mm/audio/mix/c/g;
    //   1305: aload_0
    //   1306: getfield 140	com/tencent/mm/audio/mix/d/d:sampleRate	I
    //   1309: aload_0
    //   1310: getfield 144	com/tencent/mm/audio/mix/d/d:channels	I
    //   1313: aload_0
    //   1314: getfield 37	com/tencent/mm/audio/mix/d/d:cku	I
    //   1317: invokeinterface 425 4 0
    //   1322: goto -845 -> 477
    //   1325: ldc 71
    //   1327: ldc_w 427
    //   1330: iload 10
    //   1332: invokestatic 377	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1335: invokevirtual 380	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1338: invokestatic 158	com/tencent/mm/audio/mix/h/b:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1341: goto -864 -> 477
    //   1344: aload_0
    //   1345: getfield 41	com/tencent/mm/audio/mix/d/d:duration	J
    //   1348: ldc2_w 312
    //   1351: ldiv
    //   1352: aload_0
    //   1353: getfield 39	com/tencent/mm/audio/mix/d/d:presentationTimeUs	J
    //   1356: ldc2_w 312
    //   1359: ldiv
    //   1360: lsub
    //   1361: ldc2_w 428
    //   1364: lcmp
    //   1365: ifge +57 -> 1422
    //   1368: iconst_1
    //   1369: istore 14
    //   1371: iload_1
    //   1372: bipush 50
    //   1374: if_icmplt +54 -> 1428
    //   1377: ldc 71
    //   1379: ldc_w 431
    //   1382: iconst_1
    //   1383: anewarray 75	java/lang/Object
    //   1386: dup
    //   1387: iconst_0
    //   1388: iload_1
    //   1389: invokestatic 179	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1392: aastore
    //   1393: invokestatic 402	com/tencent/mm/audio/mix/h/b:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1396: aload_0
    //   1397: sipush 706
    //   1400: putfield 213	com/tencent/mm/audio/mix/d/d:clN	I
    //   1403: aload_0
    //   1404: aload_0
    //   1405: getfield 213	com/tencent/mm/audio/mix/d/d:clN	I
    //   1408: invokevirtual 216	com/tencent/mm/audio/mix/d/d:onError	(I)V
    //   1411: aload_0
    //   1412: invokespecial 218	com/tencent/mm/audio/mix/d/d:DO	()V
    //   1415: aload_0
    //   1416: invokespecial 368	com/tencent/mm/audio/mix/d/d:DP	()V
    //   1419: goto -262 -> 1157
    //   1422: iconst_0
    //   1423: istore 14
    //   1425: goto -54 -> 1371
    //   1428: ldc 71
    //   1430: ldc_w 433
    //   1433: iconst_1
    //   1434: anewarray 75	java/lang/Object
    //   1437: dup
    //   1438: iconst_0
    //   1439: iload 14
    //   1441: invokestatic 438	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1444: aastore
    //   1445: invokestatic 182	com/tencent/mm/audio/mix/h/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1448: iload 14
    //   1450: ifeq +12 -> 1462
    //   1453: aload_0
    //   1454: aload 7
    //   1456: invokevirtual 440	com/tencent/mm/audio/mix/d/d:b	(Lcom/tencent/mm/audio/mix/a/c;)V
    //   1459: goto -48 -> 1411
    //   1462: aload 7
    //   1464: invokevirtual 294	com/tencent/mm/audio/mix/a/c:reset	()V
    //   1467: goto -56 -> 1411
    //   1470: goto -836 -> 634
    //   1473: aconst_null
    //   1474: astore_3
    //   1475: goto -1367 -> 108
    //
    // Exception table:
    //   from	to	target	type
    //   23	34	144	java/lang/Exception
    //   34	60	702	java/lang/Exception
    //   67	108	702	java/lang/Exception
    //   112	138	702	java/lang/Exception
    //   189	234	702	java/lang/Exception
    //   234	263	743	java/lang/Exception
    //   488	499	1121	java/lang/Exception
    //   506	518	1121	java/lang/Exception
    //   530	542	1121	java/lang/Exception
    //   547	555	1121	java/lang/Exception
    //   560	572	1121	java/lang/Exception
    //   579	593	1121	java/lang/Exception
    //   597	605	1121	java/lang/Exception
    //   605	619	1121	java/lang/Exception
    //   624	632	1121	java/lang/Exception
    //   640	647	1121	java/lang/Exception
    //   652	662	1121	java/lang/Exception
    //   662	678	1121	java/lang/Exception
    //   678	696	1121	java/lang/Exception
    //   788	799	1121	java/lang/Exception
    //   808	824	1121	java/lang/Exception
    //   834	850	1121	java/lang/Exception
    //   860	930	1121	java/lang/Exception
    //   930	1024	1121	java/lang/Exception
    //   1032	1069	1121	java/lang/Exception
    //   1085	1106	1121	java/lang/Exception
    //   1113	1118	1121	java/lang/Exception
    //   1197	1202	1121	java/lang/Exception
    //   1227	1283	1121	java/lang/Exception
    //   1286	1322	1121	java/lang/Exception
    //   1325	1341	1121	java/lang/Exception
    //   1344	1368	1121	java/lang/Exception
    //   1377	1411	1121	java/lang/Exception
    //   1428	1448	1121	java/lang/Exception
    //   1453	1459	1121	java/lang/Exception
    //   1462	1467	1121	java/lang/Exception
    //   488	499	1205	finally
    //   506	518	1205	finally
    //   530	542	1205	finally
    //   547	555	1205	finally
    //   560	572	1205	finally
    //   579	593	1205	finally
    //   597	605	1205	finally
    //   605	619	1205	finally
    //   624	632	1205	finally
    //   640	647	1205	finally
    //   652	662	1205	finally
    //   662	678	1205	finally
    //   678	696	1205	finally
    //   788	799	1205	finally
    //   808	824	1205	finally
    //   834	850	1205	finally
    //   860	930	1205	finally
    //   930	1024	1205	finally
    //   1032	1069	1205	finally
    //   1085	1106	1205	finally
    //   1113	1118	1205	finally
    //   1122	1149	1205	finally
    //   1197	1202	1205	finally
    //   1227	1283	1205	finally
    //   1286	1322	1205	finally
    //   1325	1341	1205	finally
    //   1344	1368	1205	finally
    //   1377	1411	1205	finally
    //   1428	1448	1205	finally
    //   1453	1459	1205	finally
    //   1462	1467	1205	finally
  }

  protected void a(com.tencent.mm.audio.mix.a.c paramc, ByteBuffer paramByteBuffer, int paramInt)
  {
    AppMethodBeat.i(137053);
    if (this.clM != null)
    {
      if (paramInt != this.cmb)
      {
        this.cmb = paramInt;
        this.cma = new byte[paramInt];
      }
      paramByteBuffer.get(this.cma);
      if (this.clK.Ev().fqW)
        a.a(this.cma, DM().fqN);
      this.clM.F(this.cma);
      AppMethodBeat.o(137053);
    }
    while (true)
    {
      return;
      b(paramc, paramByteBuffer, paramInt);
      AppMethodBeat.o(137053);
    }
  }

  protected void b(com.tencent.mm.audio.mix.a.c paramc)
  {
    AppMethodBeat.i(137055);
    if (this.clM != null)
    {
      this.clM.Ds();
      if (DB())
      {
        com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderMediaCodec", "flushCache");
        this.clM.flushCache();
        AppMethodBeat.o(137055);
      }
    }
    while (true)
    {
      return;
      if (DA())
      {
        com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderMediaCodec", "flushCache and readCacheAndPlay");
        this.clM.flushCache();
        DH();
        AppMethodBeat.o(137055);
      }
      else
      {
        com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderMediaCodec", "writeCacheAndPlay");
        a(paramc);
        AppMethodBeat.o(137055);
        continue;
        c(paramc);
        paramc.complete();
        AppMethodBeat.o(137055);
      }
    }
  }

  protected final void b(com.tencent.mm.audio.mix.a.c paramc, ByteBuffer paramByteBuffer, int paramInt)
  {
    AppMethodBeat.i(137054);
    byte[] arrayOfByte;
    if (3536 == paramInt)
    {
      arrayOfByte = new byte[paramInt];
      paramByteBuffer.get(arrayOfByte);
    }
    for (paramByteBuffer = arrayOfByte; ; paramByteBuffer = this.cma)
    {
      if (this.clK.Ev().fqW)
        a.a(paramByteBuffer, DM().fqN);
      a(paramc, paramByteBuffer);
      AppMethodBeat.o(137054);
      return;
      if (paramInt != this.cmb)
      {
        this.cmb = paramInt;
        this.cma = new byte[paramInt];
      }
      Arrays.fill(this.cma, 0, this.cmb, (byte)0);
      paramByteBuffer.get(this.cma, 0, this.cmb);
    }
  }

  protected final void c(com.tencent.mm.audio.mix.a.c paramc)
  {
    AppMethodBeat.i(137056);
    if (this.mSize <= 0)
      AppMethodBeat.o(137056);
    while (true)
    {
      return;
      byte[] arrayOfByte;
      if (this.mSize > 3536)
      {
        int i = this.mSize;
        int j = i / 3536;
        int k = i % 3536;
        for (i = 0; i < j; i++)
        {
          arrayOfByte = new byte[3536];
          System.arraycopy(this.buffer, i * 3536, arrayOfByte, 0, 3536);
          b(paramc, arrayOfByte);
        }
        System.arraycopy(this.buffer, j * 3536, this.cmc, 0, k);
        Arrays.fill(this.buffer, 0, this.clZ, (byte)0);
        System.arraycopy(this.cmc, 0, this.buffer, 0, k);
        this.mSize = k;
      }
      if (this.mSize <= 3536)
      {
        arrayOfByte = new byte[3536];
        System.arraycopy(this.buffer, 0, arrayOfByte, 0, this.mSize);
        b(paramc, arrayOfByte);
        this.mSize = 0;
      }
      AppMethodBeat.o(137056);
    }
  }

  public void onRelease()
  {
    AppMethodBeat.i(137059);
    DO();
    DP();
    if (this.clM != null)
    {
      this.clM.Ds();
      this.clM.release();
      this.clM = null;
    }
    this.clO = null;
    this.clY = null;
    this.sampleRate = 0;
    this.channels = 0;
    this.presentationTimeUs = 0L;
    this.duration = 0L;
    AppMethodBeat.o(137059);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.d.d
 * JD-Core Version:    0.6.2
 */