package com.tencent.mm.plugin.emojicapture.model.b;

import a.f.a.a;
import a.f.b.j;
import a.f.b.k;
import a.k.m;
import a.y;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ab.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiMixVideoDecoder;", "Lcom/tencent/mm/plugin/emojicapture/model/mix/IEmojiMixDecoder;", "videoPath", "", "surface", "Landroid/view/Surface;", "(Ljava/lang/String;Landroid/view/Surface;)V", "TAG", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "getBufferInfo", "()Landroid/media/MediaCodec$BufferInfo;", "setBufferInfo", "(Landroid/media/MediaCodec$BufferInfo;)V", "decoder", "Landroid/media/MediaCodec;", "extractor", "Landroid/media/MediaExtractor;", "mediaFormat", "Landroid/media/MediaFormat;", "mime", "pauseDecoderLock", "Ljava/lang/Object;", "getPauseDecoderLock", "()Ljava/lang/Object;", "waitInputQueueMaxCount", "", "waitInputQueueTimeout", "", "waitOutputQueueTimeout", "drainDecoder", "", "init", "inputDecoder", "processDecodeBuffer", "", "release", "sendDecoderEos", "setPauseDecode", "pause", "startDecode", "startDecodeImpl", "plugin-emojicapture_release"})
public final class i extends l
{
  final String TAG;
  private final Surface aOO;
  MediaExtractor clX;
  private String clY;
  MediaCodec eTq;
  private MediaCodec.BufferInfo eTy;
  final long liN;
  private final long liO;
  final int liP;
  private final Object liQ;
  private MediaFormat mediaFormat;
  private final String videoPath;

  public i(String paramString, Surface paramSurface)
  {
    AppMethodBeat.i(2688);
    this.videoPath = paramString;
    this.aOO = paramSurface;
    this.TAG = "MicroMsg.MixVideoDecoder";
    this.clX = new MediaExtractor();
    this.clY = "";
    this.liN = 60000L;
    this.liO = 10000L;
    this.liP = 10;
    this.eTy = new MediaCodec.BufferInfo();
    this.liQ = new Object();
    try
    {
      paramSurface = this.TAG;
      paramString = new java/lang/StringBuilder;
      paramString.<init>("create decoder with path: ");
      ab.i(paramSurface, this.videoPath);
      this.clX.setDataSource(this.videoPath);
      int i = this.clX.getTrackCount();
      for (int j = 0; j < i; j++)
      {
        paramString = this.clX.getTrackFormat(j);
        paramSurface = paramString.getString("mime");
        j.o(paramSurface, "trackFormat.getString(MediaFormat.KEY_MIME)");
        if (m.d((CharSequence)paramSurface, (CharSequence)"video") == true)
        {
          paramSurface = paramString.getString("mime");
          j.o(paramSurface, "trackFormat.getString(MediaFormat.KEY_MIME)");
          this.clY = paramSurface;
          j.o(paramString, "trackFormat");
          this.mediaFormat = paramString;
          paramSurface = this.TAG;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("find video format ");
          paramString = this.mediaFormat;
          if (paramString == null)
            j.avw("mediaFormat");
          ab.i(paramSurface, paramString + ", mime: " + this.clY);
          this.clX.selectTrack(j);
          AppMethodBeat.o(2688);
          return;
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace(this.TAG, (Throwable)paramString, "init create extractor error", new Object[0]);
        AppMethodBeat.o(2688);
      }
    }
  }

  public final void UB()
  {
    AppMethodBeat.i(2684);
    b.a((a)new a(this), "EmojiMixVideoDecoder_decodeThread");
    AppMethodBeat.o(2684);
  }

  // ERROR //
  final boolean UF()
  {
    // Byte code:
    //   0: sipush 2686
    //   3: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 220	com/tencent/mm/plugin/emojicapture/model/b/i:eTq	Landroid/media/MediaCodec;
    //   10: astore_1
    //   11: aload_1
    //   12: ifnonnull +8 -> 20
    //   15: ldc 221
    //   17: invokestatic 183	a/f/b/j:avw	(Ljava/lang/String;)V
    //   20: aload_1
    //   21: aload_0
    //   22: getfield 115	com/tencent/mm/plugin/emojicapture/model/b/i:eTy	Landroid/media/MediaCodec$BufferInfo;
    //   25: aload_0
    //   26: getfield 108	com/tencent/mm/plugin/emojicapture/model/b/i:liO	J
    //   29: invokevirtual 227	android/media/MediaCodec:dequeueOutputBuffer	(Landroid/media/MediaCodec$BufferInfo;J)I
    //   32: istore_2
    //   33: aload_0
    //   34: getfield 220	com/tencent/mm/plugin/emojicapture/model/b/i:eTq	Landroid/media/MediaCodec;
    //   37: astore_1
    //   38: aload_1
    //   39: ifnonnull +8 -> 47
    //   42: ldc 221
    //   44: invokestatic 183	a/f/b/j:avw	(Ljava/lang/String;)V
    //   47: aload_1
    //   48: invokevirtual 231	android/media/MediaCodec:getOutputBuffers	()[Ljava/nio/ByteBuffer;
    //   51: astore_1
    //   52: iload_2
    //   53: iconst_m1
    //   54: if_icmpne +22 -> 76
    //   57: aload_0
    //   58: getfield 92	com/tencent/mm/plugin/emojicapture/model/b/i:TAG	Ljava/lang/String;
    //   61: ldc 233
    //   63: invokestatic 140	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   66: sipush 2686
    //   69: invokestatic 193	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   72: iconst_0
    //   73: istore_3
    //   74: iload_3
    //   75: ireturn
    //   76: iload_2
    //   77: bipush 254
    //   79: if_icmpne +84 -> 163
    //   82: aload_0
    //   83: getfield 92	com/tencent/mm/plugin/emojicapture/model/b/i:TAG	Ljava/lang/String;
    //   86: astore 4
    //   88: new 122	java/lang/StringBuilder
    //   91: dup
    //   92: ldc 235
    //   94: invokespecial 127	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   97: astore 5
    //   99: aload_0
    //   100: getfield 220	com/tencent/mm/plugin/emojicapture/model/b/i:eTq	Landroid/media/MediaCodec;
    //   103: astore_1
    //   104: aload_1
    //   105: ifnonnull +8 -> 113
    //   108: ldc 221
    //   110: invokestatic 183	a/f/b/j:avw	(Ljava/lang/String;)V
    //   113: aload 4
    //   115: aload 5
    //   117: aload_1
    //   118: invokevirtual 239	android/media/MediaCodec:getOutputFormat	()Landroid/media/MediaFormat;
    //   121: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   124: invokevirtual 135	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   127: invokestatic 140	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   130: aload_0
    //   131: getfield 220	com/tencent/mm/plugin/emojicapture/model/b/i:eTq	Landroid/media/MediaCodec;
    //   134: astore_1
    //   135: aload_1
    //   136: ifnonnull +8 -> 144
    //   139: ldc 221
    //   141: invokestatic 183	a/f/b/j:avw	(Ljava/lang/String;)V
    //   144: aload_1
    //   145: invokevirtual 239	android/media/MediaCodec:getOutputFormat	()Landroid/media/MediaFormat;
    //   148: astore_1
    //   149: aload_1
    //   150: ldc 241
    //   152: invokestatic 163	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   155: aload_0
    //   156: aload_1
    //   157: putfield 177	com/tencent/mm/plugin/emojicapture/model/b/i:mediaFormat	Landroid/media/MediaFormat;
    //   160: goto -94 -> 66
    //   163: iload_2
    //   164: bipush 253
    //   166: if_icmpne +83 -> 249
    //   169: aload_0
    //   170: getfield 220	com/tencent/mm/plugin/emojicapture/model/b/i:eTq	Landroid/media/MediaCodec;
    //   173: astore 4
    //   175: aload 4
    //   177: ifnonnull +8 -> 185
    //   180: ldc 221
    //   182: invokestatic 183	a/f/b/j:avw	(Ljava/lang/String;)V
    //   185: aload 4
    //   187: invokevirtual 231	android/media/MediaCodec:getOutputBuffers	()[Ljava/nio/ByteBuffer;
    //   190: ifnull +456 -> 646
    //   193: aload_0
    //   194: getfield 220	com/tencent/mm/plugin/emojicapture/model/b/i:eTq	Landroid/media/MediaCodec;
    //   197: astore_1
    //   198: aload_1
    //   199: ifnonnull +8 -> 207
    //   202: ldc 221
    //   204: invokestatic 183	a/f/b/j:avw	(Ljava/lang/String;)V
    //   207: aload_1
    //   208: invokevirtual 231	android/media/MediaCodec:getOutputBuffers	()[Ljava/nio/ByteBuffer;
    //   211: astore_1
    //   212: aload_0
    //   213: getfield 220	com/tencent/mm/plugin/emojicapture/model/b/i:eTq	Landroid/media/MediaCodec;
    //   216: astore 4
    //   218: aload 4
    //   220: ifnonnull +8 -> 228
    //   223: ldc 221
    //   225: invokestatic 183	a/f/b/j:avw	(Ljava/lang/String;)V
    //   228: aload 4
    //   230: aload_0
    //   231: getfield 115	com/tencent/mm/plugin/emojicapture/model/b/i:eTy	Landroid/media/MediaCodec$BufferInfo;
    //   234: aload_0
    //   235: getfield 108	com/tencent/mm/plugin/emojicapture/model/b/i:liO	J
    //   238: invokevirtual 227	android/media/MediaCodec:dequeueOutputBuffer	(Landroid/media/MediaCodec$BufferInfo;J)I
    //   241: istore_2
    //   242: iload_2
    //   243: iflt -177 -> 66
    //   246: goto -194 -> 52
    //   249: iload_2
    //   250: ifge +34 -> 284
    //   253: aload_0
    //   254: getfield 92	com/tencent/mm/plugin/emojicapture/model/b/i:TAG	Ljava/lang/String;
    //   257: new 122	java/lang/StringBuilder
    //   260: dup
    //   261: ldc 243
    //   263: invokespecial 127	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   266: iload_2
    //   267: invokevirtual 246	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   270: ldc 248
    //   272: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: invokevirtual 135	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   278: invokestatic 140	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   281: goto -215 -> 66
    //   284: aload_1
    //   285: iload_2
    //   286: aaload
    //   287: astore 4
    //   289: aload_0
    //   290: getfield 115	com/tencent/mm/plugin/emojicapture/model/b/i:eTy	Landroid/media/MediaCodec$BufferInfo;
    //   293: getfield 251	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   296: lstore 6
    //   298: aload_0
    //   299: getfield 115	com/tencent/mm/plugin/emojicapture/model/b/i:eTy	Landroid/media/MediaCodec$BufferInfo;
    //   302: getfield 254	android/media/MediaCodec$BufferInfo:flags	I
    //   305: iconst_4
    //   306: iand
    //   307: ifeq +44 -> 351
    //   310: aload_0
    //   311: getfield 92	com/tencent/mm/plugin/emojicapture/model/b/i:TAG	Ljava/lang/String;
    //   314: ldc_w 256
    //   317: invokestatic 140	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   320: aload_0
    //   321: getfield 220	com/tencent/mm/plugin/emojicapture/model/b/i:eTq	Landroid/media/MediaCodec;
    //   324: astore_1
    //   325: aload_1
    //   326: ifnonnull +8 -> 334
    //   329: ldc 221
    //   331: invokestatic 183	a/f/b/j:avw	(Ljava/lang/String;)V
    //   334: aload_1
    //   335: iload_2
    //   336: iconst_1
    //   337: invokevirtual 260	android/media/MediaCodec:releaseOutputBuffer	(IZ)V
    //   340: sipush 2686
    //   343: invokestatic 193	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   346: iconst_1
    //   347: istore_3
    //   348: goto -274 -> 74
    //   351: aload 4
    //   353: ifnull +270 -> 623
    //   356: aload_0
    //   357: getfield 115	com/tencent/mm/plugin/emojicapture/model/b/i:eTy	Landroid/media/MediaCodec$BufferInfo;
    //   360: getfield 263	android/media/MediaCodec$BufferInfo:size	I
    //   363: ifeq +260 -> 623
    //   366: aload 4
    //   368: aload_0
    //   369: getfield 115	com/tencent/mm/plugin/emojicapture/model/b/i:eTy	Landroid/media/MediaCodec$BufferInfo;
    //   372: getfield 266	android/media/MediaCodec$BufferInfo:offset	I
    //   375: invokevirtual 272	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   378: pop
    //   379: aload 4
    //   381: aload_0
    //   382: getfield 115	com/tencent/mm/plugin/emojicapture/model/b/i:eTy	Landroid/media/MediaCodec$BufferInfo;
    //   385: getfield 266	android/media/MediaCodec$BufferInfo:offset	I
    //   388: aload_0
    //   389: getfield 115	com/tencent/mm/plugin/emojicapture/model/b/i:eTy	Landroid/media/MediaCodec$BufferInfo;
    //   392: getfield 263	android/media/MediaCodec$BufferInfo:size	I
    //   395: iadd
    //   396: invokevirtual 275	java/nio/ByteBuffer:limit	(I)Ljava/nio/Buffer;
    //   399: pop
    //   400: aload_0
    //   401: getfield 220	com/tencent/mm/plugin/emojicapture/model/b/i:eTq	Landroid/media/MediaCodec;
    //   404: astore 4
    //   406: aload 4
    //   408: ifnonnull +8 -> 416
    //   411: ldc 221
    //   413: invokestatic 183	a/f/b/j:avw	(Ljava/lang/String;)V
    //   416: aload 4
    //   418: iload_2
    //   419: iconst_1
    //   420: invokevirtual 260	android/media/MediaCodec:releaseOutputBuffer	(IZ)V
    //   423: aload_0
    //   424: getfield 115	com/tencent/mm/plugin/emojicapture/model/b/i:eTy	Landroid/media/MediaCodec$BufferInfo;
    //   427: astore 4
    //   429: aload_0
    //   430: getfield 92	com/tencent/mm/plugin/emojicapture/model/b/i:TAG	Ljava/lang/String;
    //   433: new 122	java/lang/StringBuilder
    //   436: dup
    //   437: ldc_w 277
    //   440: invokespecial 127	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   443: aload 4
    //   445: getfield 251	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   448: invokevirtual 280	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   451: ldc_w 282
    //   454: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   457: aload 4
    //   459: getfield 263	android/media/MediaCodec$BufferInfo:size	I
    //   462: invokevirtual 246	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   465: invokevirtual 135	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   468: invokestatic 140	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   471: aload_0
    //   472: getfield 286	com/tencent/mm/plugin/emojicapture/model/b/l:ljl	La/f/a/b;
    //   475: astore 5
    //   477: aload 5
    //   479: ifnull +23 -> 502
    //   482: aload 5
    //   484: aload 4
    //   486: getfield 251	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   489: ldc2_w 287
    //   492: lmul
    //   493: invokestatic 294	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   496: invokeinterface 300 2 0
    //   501: pop
    //   502: aload_0
    //   503: getfield 120	com/tencent/mm/plugin/emojicapture/model/b/i:liQ	Ljava/lang/Object;
    //   506: astore 4
    //   508: aload 4
    //   510: monitorenter
    //   511: aload_0
    //   512: getfield 120	com/tencent/mm/plugin/emojicapture/model/b/i:liQ	Ljava/lang/Object;
    //   515: ldc2_w 301
    //   518: invokevirtual 306	java/lang/Object:wait	(J)V
    //   521: getstatic 312	a/y:AUy	La/y;
    //   524: astore 5
    //   526: aload 4
    //   528: monitorexit
    //   529: aload_0
    //   530: getfield 115	com/tencent/mm/plugin/emojicapture/model/b/i:eTy	Landroid/media/MediaCodec$BufferInfo;
    //   533: getfield 254	android/media/MediaCodec$BufferInfo:flags	I
    //   536: iconst_4
    //   537: iand
    //   538: ifeq +108 -> 646
    //   541: aload_0
    //   542: getfield 220	com/tencent/mm/plugin/emojicapture/model/b/i:eTq	Landroid/media/MediaCodec;
    //   545: astore_1
    //   546: aload_1
    //   547: ifnonnull +8 -> 555
    //   550: ldc 221
    //   552: invokestatic 183	a/f/b/j:avw	(Ljava/lang/String;)V
    //   555: aload_1
    //   556: invokevirtual 315	android/media/MediaCodec:stop	()V
    //   559: aload_0
    //   560: getfield 220	com/tencent/mm/plugin/emojicapture/model/b/i:eTq	Landroid/media/MediaCodec;
    //   563: astore_1
    //   564: aload_1
    //   565: ifnonnull +8 -> 573
    //   568: ldc 221
    //   570: invokestatic 183	a/f/b/j:avw	(Ljava/lang/String;)V
    //   573: aload_1
    //   574: invokevirtual 317	android/media/MediaCodec:release	()V
    //   577: sipush 2686
    //   580: invokestatic 193	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   583: iconst_1
    //   584: istore_3
    //   585: goto -511 -> 74
    //   588: astore 5
    //   590: aload_0
    //   591: getfield 92	com/tencent/mm/plugin/emojicapture/model/b/i:TAG	Ljava/lang/String;
    //   594: aload 5
    //   596: checkcast 195	java/lang/Throwable
    //   599: ldc 98
    //   601: iconst_0
    //   602: anewarray 117	java/lang/Object
    //   605: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   608: goto -87 -> 521
    //   611: astore_1
    //   612: aload 4
    //   614: monitorexit
    //   615: sipush 2686
    //   618: invokestatic 193	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   621: aload_1
    //   622: athrow
    //   623: aload_0
    //   624: getfield 220	com/tencent/mm/plugin/emojicapture/model/b/i:eTq	Landroid/media/MediaCodec;
    //   627: astore 4
    //   629: aload 4
    //   631: ifnonnull +8 -> 639
    //   634: ldc 221
    //   636: invokestatic 183	a/f/b/j:avw	(Ljava/lang/String;)V
    //   639: aload 4
    //   641: iload_2
    //   642: iconst_1
    //   643: invokevirtual 260	android/media/MediaCodec:releaseOutputBuffer	(IZ)V
    //   646: goto -434 -> 212
    //   649: astore_1
    //   650: goto -73 -> 577
    //
    // Exception table:
    //   from	to	target	type
    //   511	521	588	java/lang/Exception
    //   511	521	611	finally
    //   521	526	611	finally
    //   590	608	611	finally
    //   541	546	649	java/lang/Exception
    //   550	555	649	java/lang/Exception
    //   555	564	649	java/lang/Exception
    //   568	573	649	java/lang/Exception
    //   573	577	649	java/lang/Exception
  }

  public final void bnH()
  {
    AppMethodBeat.i(2685);
    synchronized (this.liQ)
    {
      try
      {
        this.liQ.notifyAll();
        y localy = y.AUy;
        AppMethodBeat.o(2685);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace(this.TAG, (Throwable)localException, "", new Object[0]);
      }
    }
  }

  final void bnI()
  {
    AppMethodBeat.i(2687);
    ab.i(this.TAG, "sendDecoderEos");
    Object localObject = this.eTq;
    if (localObject == null)
      j.avw("decoder");
    int i = ((MediaCodec)localObject).dequeueInputBuffer(this.liN);
    int j = 0;
    if ((i < 0) && (j < this.liP))
      if (!UF())
        AppMethodBeat.o(2687);
    while (true)
    {
      return;
      localObject = this.eTq;
      if (localObject == null)
        j.avw("decoder");
      i = ((MediaCodec)localObject).dequeueInputBuffer(this.liN);
      j++;
      break;
      if (i >= 0)
      {
        localObject = this.eTq;
        if (localObject == null)
          j.avw("decoder");
        localObject = localObject.getInputBuffers()[i];
        ((ByteBuffer)localObject).clear();
        this.clX.readSampleData((ByteBuffer)localObject, 0);
        ((ByteBuffer)localObject).position(0);
        localObject = this.eTq;
        if (localObject == null)
          j.avw("decoder");
        ((MediaCodec)localObject).queueInputBuffer(i, 0, 0, 0L, 4);
      }
      UF();
      AppMethodBeat.o(2687);
    }
  }

  public final int init()
  {
    AppMethodBeat.i(2683);
    if ((((i)this).mediaFormat != null) && (!bo.isNullOrNil(this.clY)));
    while (true)
    {
      try
      {
        MediaCodec localMediaCodec = MediaCodec.createDecoderByType(this.clY);
        j.o(localMediaCodec, "MediaCodec.createDecoderByType(mime)");
        this.eTq = localMediaCodec;
        localMediaCodec = this.eTq;
        if (localMediaCodec == null)
          j.avw("decoder");
        MediaFormat localMediaFormat = this.mediaFormat;
        if (localMediaFormat == null)
          j.avw("mediaFormat");
        localMediaCodec.configure(localMediaFormat, this.aOO, null, 0);
        localMediaCodec = this.eTq;
        if (localMediaCodec == null)
          j.avw("decoder");
        localMediaCodec.start();
        AppMethodBeat.o(2683);
        i = 0;
        return i;
      }
      catch (Exception localException)
      {
        ab.e(this.TAG, "init decoder error " + localException.getMessage());
        AppMethodBeat.o(2683);
        i = -1;
        continue;
      }
      AppMethodBeat.o(2683);
      int i = -1;
    }
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  static final class a extends k
    implements a<y>
  {
    a(i parami)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.b.i
 * JD-Core Version:    0.6.2
 */