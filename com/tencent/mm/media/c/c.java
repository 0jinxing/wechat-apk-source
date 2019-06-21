package com.tencent.mm.media.c;

import a.f.a.m;
import a.f.b.j;
import a.l;
import a.y;
import android.media.MediaCodec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/decoder/MediaCodecAACDecoder;", "Lcom/tencent/mm/media/decoder/IAudioDecoder;", "mediaExtractorWrapper", "Lcom/tencent/mm/media/extractor/MediaExtractorWrapper;", "audioId", "", "startTimeMs", "", "endTimeMs", "frameDecodeCallback", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "pcmData", "pts", "", "frameDecodeEndCallback", "Lkotlin/Function0;", "(Lcom/tencent/mm/media/extractor/MediaExtractorWrapper;Ljava/lang/String;JJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "codeOver", "", "drainDecoder", "readNextSample", "startDecoder", "Companion", "plugin-mediaeditor_release"})
public final class c extends a
{
  private static final String TAG = "MicroMsg.MediaCodecAACDecoder";
  private static final long eTR = 60000L;
  public static final c.a eTS;
  private boolean eTQ;

  static
  {
    AppMethodBeat.i(12855);
    eTS = new c.a((byte)0);
    TAG = "MicroMsg.MediaCodecAACDecoder";
    eTR = 60000L;
    AppMethodBeat.o(12855);
  }

  public c(com.tencent.mm.media.e.a parama, String paramString, long paramLong1, long paramLong2, m<? super byte[], ? super Long, y> paramm, a.f.a.a<y> parama1)
  {
    super(parama, paramString, paramLong1, paramLong2, paramm, parama1);
    AppMethodBeat.i(12854);
    Uy().start();
    AppMethodBeat.o(12854);
  }

  private final boolean UC()
  {
    AppMethodBeat.i(12851);
    int i;
    while (true)
    {
      try
      {
        synchronized (this.eTu)
        {
          if (this.eTr)
            ab.i(TAG, "readNextSample decoder stop");
          y localy = y.AUy;
          this.eTv = bo.yz();
          i = Uy().dequeueInputBuffer(100L);
          if (i < 0)
            UD();
          if (i >= 0)
            break;
          AppMethodBeat.o(12851);
          bool = false;
          return bool;
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace(TAG, (Throwable)localException, "", new Object[0]);
      }
      AppMethodBeat.o(12851);
      boolean bool = true;
    }
    ab.i(TAG, "inputIndex: ".concat(String.valueOf(i)));
    this.eTv = bo.yz();
    Object localObject4 = Uy().getInputBuffers()[i];
    if (localObject4 != null)
      ((ByteBuffer)localObject4).clear();
    Object localObject2 = this.eTz;
    j.o(localObject4, "inputBuffer");
    if (!((com.tencent.mm.media.e.a)localObject2).k((ByteBuffer)localObject4))
      ab.i(TAG, "read sample end");
    for (int j = 1; ; j = 0)
    {
      long l = 0L;
      int k;
      if (j == 0)
      {
        k = this.eTz.sampleSize;
        ((ByteBuffer)localObject4).position(0);
        l = this.eTz.getSampleTime();
        localObject4 = TAG;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("sampleTime : ");
        ab.i((String)localObject4, l + ", sampleSize:" + k);
        if ((k < 0) || (l >= this.eTA * 1000L))
        {
          ab.i(TAG, "sawInputEOS");
          j = 1;
        }
      }
      while (true)
      {
        localObject2 = Uy();
        if (j != 0);
        for (int m = 4; ; m = 0)
        {
          ((MediaCodec)localObject2).queueInputBuffer(i, 0, k, l, m);
          if (j != 0)
            UA();
          UD();
          break;
        }
        continue;
        k = 0;
      }
    }
  }

  // ERROR //
  private final void UD()
  {
    // Byte code:
    //   0: sipush 12852
    //   3: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 102	com/tencent/mm/media/c/a:eTu	Ljava/lang/Object;
    //   10: astore_1
    //   11: aload_1
    //   12: monitorenter
    //   13: aload_0
    //   14: getfield 105	com/tencent/mm/media/c/a:eTr	Z
    //   17: ifeq +20 -> 37
    //   20: getstatic 64	com/tencent/mm/media/c/c:TAG	Ljava/lang/String;
    //   23: ldc 233
    //   25: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   28: aload_1
    //   29: monitorexit
    //   30: sipush 12852
    //   33: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   36: return
    //   37: getstatic 118	a/y:AUy	La/y;
    //   40: astore_2
    //   41: aload_1
    //   42: monitorexit
    //   43: new 235	android/media/MediaCodec$BufferInfo
    //   46: astore_1
    //   47: aload_1
    //   48: invokespecial 237	android/media/MediaCodec$BufferInfo:<init>	()V
    //   51: aload_1
    //   52: ldc 239
    //   54: invokestatic 78	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   57: aload_0
    //   58: aload_1
    //   59: putfield 243	com/tencent/mm/media/c/a:eTy	Landroid/media/MediaCodec$BufferInfo;
    //   62: aload_0
    //   63: invokevirtual 87	com/tencent/mm/media/c/c:Uy	()Landroid/media/MediaCodec;
    //   66: aload_0
    //   67: getfield 243	com/tencent/mm/media/c/a:eTy	Landroid/media/MediaCodec$BufferInfo;
    //   70: getstatic 66	com/tencent/mm/media/c/c:eTR	J
    //   73: invokevirtual 247	android/media/MediaCodec:dequeueOutputBuffer	(Landroid/media/MediaCodec$BufferInfo;J)I
    //   76: istore_3
    //   77: iload_3
    //   78: iflt +56 -> 134
    //   81: aload_0
    //   82: invokevirtual 87	com/tencent/mm/media/c/c:Uy	()Landroid/media/MediaCodec;
    //   85: invokevirtual 250	android/media/MediaCodec:getOutputBuffers	()[Ljava/nio/ByteBuffer;
    //   88: iload_3
    //   89: aaload
    //   90: astore_1
    //   91: aload_1
    //   92: ifnonnull +62 -> 154
    //   95: getstatic 64	com/tencent/mm/media/c/c:TAG	Ljava/lang/String;
    //   98: ldc 252
    //   100: invokestatic 255	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   103: sipush 12852
    //   106: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   109: goto -73 -> 36
    //   112: astore_1
    //   113: aload_0
    //   114: iconst_1
    //   115: putfield 257	com/tencent/mm/media/c/c:eTQ	Z
    //   118: getstatic 64	com/tencent/mm/media/c/c:TAG	Ljava/lang/String;
    //   121: aload_1
    //   122: checkcast 138	java/lang/Throwable
    //   125: ldc 139
    //   127: iconst_0
    //   128: anewarray 141	java/lang/Object
    //   131: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   134: sipush 12852
    //   137: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   140: goto -104 -> 36
    //   143: astore_2
    //   144: aload_1
    //   145: monitorexit
    //   146: sipush 12852
    //   149: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   152: aload_2
    //   153: athrow
    //   154: aload_0
    //   155: getfield 243	com/tencent/mm/media/c/a:eTy	Landroid/media/MediaCodec$BufferInfo;
    //   158: getfield 260	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   161: lstore 4
    //   163: getstatic 64	com/tencent/mm/media/c/c:TAG	Ljava/lang/String;
    //   166: ldc_w 262
    //   169: lload 4
    //   171: invokestatic 265	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   174: invokevirtual 157	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   177: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   180: lload 4
    //   182: aload_0
    //   183: getfield 268	com/tencent/mm/media/c/a:bqO	J
    //   186: ldc2_w 221
    //   189: lmul
    //   190: lcmp
    //   191: ifge +78 -> 269
    //   194: aload_0
    //   195: getfield 243	com/tencent/mm/media/c/a:eTy	Landroid/media/MediaCodec$BufferInfo;
    //   198: getfield 271	android/media/MediaCodec$BufferInfo:flags	I
    //   201: iconst_4
    //   202: iand
    //   203: ifne +66 -> 269
    //   206: aload_0
    //   207: invokevirtual 87	com/tencent/mm/media/c/c:Uy	()Landroid/media/MediaCodec;
    //   210: iload_3
    //   211: iconst_0
    //   212: invokevirtual 275	android/media/MediaCodec:releaseOutputBuffer	(IZ)V
    //   215: getstatic 64	com/tencent/mm/media/c/c:TAG	Ljava/lang/String;
    //   218: astore_2
    //   219: new 196	java/lang/StringBuilder
    //   222: astore_1
    //   223: aload_1
    //   224: ldc_w 277
    //   227: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   230: aload_2
    //   231: aload_1
    //   232: lload 4
    //   234: invokevirtual 205	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   237: ldc_w 279
    //   240: invokevirtual 210	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   243: aload_0
    //   244: getfield 268	com/tencent/mm/media/c/a:bqO	J
    //   247: ldc2_w 221
    //   250: lmul
    //   251: invokevirtual 205	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   254: invokevirtual 217	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   257: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   260: sipush 12852
    //   263: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   266: goto -230 -> 36
    //   269: aload_0
    //   270: getfield 243	com/tencent/mm/media/c/a:eTy	Landroid/media/MediaCodec$BufferInfo;
    //   273: getfield 282	android/media/MediaCodec$BufferInfo:size	I
    //   276: ifle +12 -> 288
    //   279: aload_0
    //   280: aload_1
    //   281: aload_0
    //   282: getfield 243	com/tencent/mm/media/c/a:eTy	Landroid/media/MediaCodec$BufferInfo;
    //   285: invokevirtual 285	com/tencent/mm/media/c/c:e	(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    //   288: aload_0
    //   289: invokevirtual 87	com/tencent/mm/media/c/c:Uy	()Landroid/media/MediaCodec;
    //   292: iload_3
    //   293: iconst_0
    //   294: invokevirtual 275	android/media/MediaCodec:releaseOutputBuffer	(IZ)V
    //   297: aload_0
    //   298: getfield 220	com/tencent/mm/media/c/a:eTA	J
    //   301: ldc2_w 221
    //   304: lmul
    //   305: lconst_1
    //   306: lcmp
    //   307: ifeq +39 -> 346
    //   310: lload 4
    //   312: aload_0
    //   313: getfield 220	com/tencent/mm/media/c/a:eTA	J
    //   316: ldc2_w 221
    //   319: lmul
    //   320: lcmp
    //   321: iflt +25 -> 346
    //   324: getstatic 64	com/tencent/mm/media/c/c:TAG	Ljava/lang/String;
    //   327: ldc_w 287
    //   330: invokestatic 255	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   333: aload_0
    //   334: invokevirtual 231	com/tencent/mm/media/c/c:UA	()V
    //   337: sipush 12852
    //   340: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   343: goto -307 -> 36
    //   346: aload_0
    //   347: getfield 243	com/tencent/mm/media/c/a:eTy	Landroid/media/MediaCodec$BufferInfo;
    //   350: getfield 271	android/media/MediaCodec$BufferInfo:flags	I
    //   353: iconst_4
    //   354: iand
    //   355: ifeq +25 -> 380
    //   358: getstatic 64	com/tencent/mm/media/c/c:TAG	Ljava/lang/String;
    //   361: ldc_w 289
    //   364: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   367: aload_0
    //   368: invokevirtual 231	com/tencent/mm/media/c/c:UA	()V
    //   371: sipush 12852
    //   374: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   377: goto -341 -> 36
    //   380: aload_0
    //   381: invokevirtual 87	com/tencent/mm/media/c/c:Uy	()Landroid/media/MediaCodec;
    //   384: aload_0
    //   385: getfield 243	com/tencent/mm/media/c/a:eTy	Landroid/media/MediaCodec$BufferInfo;
    //   388: getstatic 66	com/tencent/mm/media/c/c:eTR	J
    //   391: invokevirtual 247	android/media/MediaCodec:dequeueOutputBuffer	(Landroid/media/MediaCodec$BufferInfo;J)I
    //   394: istore_3
    //   395: goto -318 -> 77
    //
    // Exception table:
    //   from	to	target	type
    //   6	13	112	java/lang/Exception
    //   28	36	112	java/lang/Exception
    //   41	77	112	java/lang/Exception
    //   81	91	112	java/lang/Exception
    //   95	109	112	java/lang/Exception
    //   144	154	112	java/lang/Exception
    //   154	266	112	java/lang/Exception
    //   269	288	112	java/lang/Exception
    //   288	343	112	java/lang/Exception
    //   346	377	112	java/lang/Exception
    //   380	395	112	java/lang/Exception
    //   13	28	143	finally
    //   37	41	143	finally
  }

  public final void Uz()
  {
    AppMethodBeat.i(12853);
    while ((!this.eTQ) && (!this.eTr))
      UC();
    UA();
    AppMethodBeat.o(12853);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.c.c
 * JD-Core Version:    0.6.2
 */