package com.tencent.mm.media.c;

import a.f.b.j;
import a.l;
import a.y;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.i.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/decoder/MediaCodecTransDecoder;", "Lcom/tencent/mm/media/decoder/IMediaCodecTransDecoder;", "startTimeMs", "", "endTimeMs", "mediaExtractorWrapper", "Lcom/tencent/mm/media/extractor/MediaExtractorWrapper;", "decodeSurface", "Landroid/view/Surface;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(JJLcom/tencent/mm/media/extractor/MediaExtractorWrapper;Landroid/view/Surface;Lkotlin/jvm/functions/Function1;)V", "TAG", "", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "sawInputEOS", "", "drainDecoder", "inputDecoder", "sendDecoderEOS", "startDecode", "Companion", "plugin-mediaeditor_release"})
public final class e extends b
{
  public static final a eUc;
  private final String TAG;
  private MediaCodec.BufferInfo eTy;
  private volatile boolean eUb;

  static
  {
    AppMethodBeat.i(12866);
    eUc = new a((byte)0);
    AppMethodBeat.o(12866);
  }

  public e(long paramLong1, long paramLong2, com.tencent.mm.media.e.a parama, Surface paramSurface, a.f.a.b<? super b, y> paramb)
  {
    super(paramLong1, paramLong2, parama, paramSurface);
    AppMethodBeat.i(12865);
    this.eTy = new MediaCodec.BufferInfo();
    this.TAG = "MicroMsg.MediaCodecTransDecoder";
    try
    {
      this.mediaFormat = parama.eWe;
      parama = MediaCodec.createDecoderByType(parama.UV());
      j.o(parama, "MediaCodec.createDecoder…orWrapper.getVideoMIME())");
      a(parama);
      Uy().configure(this.mediaFormat, paramSurface, null, 0);
      Uy().start();
      paramb.am(this);
      AppMethodBeat.o(12865);
      return;
    }
    catch (Exception parama)
    {
      ab.printErrStackTrace(this.TAG, (Throwable)parama, "create decoder error:" + parama.getMessage(), new Object[0]);
      parama = (Throwable)new IllegalStateException("init decoder error");
      AppMethodBeat.o(12865);
    }
    throw parama;
  }

  private final boolean UE()
  {
    AppMethodBeat.i(12863);
    try
    {
      synchronized (this.eTL)
      {
        if (this.eTM)
          ab.i(this.TAG, "inputDecoder already finished");
        y localy = y.AUy;
        ab.i(this.TAG, "inputDecoder");
        l1 = bo.yz();
        ??? = Uy().getInputBuffers();
        if (??? == null)
        {
          bool = false;
          AppMethodBeat.o(12863);
          return bool;
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        long l1;
        ab.printErrStackTrace(this.TAG, (Throwable)localException, "inputDecoder error", new Object[0]);
        Object localObject2;
        if (this.eTO)
        {
          localObject2 = c.faj;
          c.VV();
        }
        boolean bool = true;
        AppMethodBeat.o(12863);
        continue;
        int i = 0;
        int j = Uy().dequeueInputBuffer(60000L);
        while (true)
        {
          if ((j >= 0) || (i >= 15))
            break label191;
          if (UF())
          {
            bool = true;
            AppMethodBeat.o(12863);
            break;
          }
          j = Uy().dequeueInputBuffer(60000L);
          i++;
        }
        label191: this.eUb = false;
        Object localObject4;
        if (j >= 0)
        {
          localObject2 = localObject2[j];
          ((ByteBuffer)localObject2).clear();
          localObject4 = this.eTz;
          j.o(localObject2, "inputBuffer");
          if (!((com.tencent.mm.media.e.a)localObject4).k((ByteBuffer)localObject2))
          {
            ab.i(this.TAG, "read sample end");
            bool = true;
            AppMethodBeat.o(12863);
          }
          else
          {
            int k = this.eTz.sampleSize;
            ((ByteBuffer)localObject2).position(0);
            long l2 = this.eTz.getSampleTime();
            localObject2 = this.TAG;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>("sampleTime : ");
            ab.i((String)localObject2, l2 + " us");
            if ((k < 0) || (l2 >= this.eTA * 1000L))
            {
              this.eUb = true;
              ab.i(this.TAG, "sawInputEOS");
            }
            localObject2 = Uy();
            if (this.eUb)
            {
              i = 4;
              label357: ((MediaCodec)localObject2).queueInputBuffer(j, 0, k, l2, i);
            }
          }
        }
        else
        {
          while (true)
          {
            bool = UF();
            localObject2 = this.TAG;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>("inputDecoder cost ");
            ab.i((String)localObject2, bo.az(l1));
            if (!bool)
              break label453;
            ab.i(this.TAG, "drainDecoder eos");
            bool = true;
            AppMethodBeat.o(12863);
            break;
            i = 0;
            break label357;
            ab.w(this.TAG, "input buffer not available");
          }
          label453: bool = this.eUb;
          AppMethodBeat.o(12863);
        }
      }
    }
  }

  private final boolean UF()
  {
    boolean bool1 = true;
    AppMethodBeat.i(12864);
    while (true)
    {
      long l;
      try
      {
        ab.i(this.TAG, "drainDecoder");
        synchronized (this.eTL)
        {
          if (this.eTM)
            ab.i(this.TAG, "drainDecoder already finished");
          y localy = y.AUy;
          i = Uy().dequeueOutputBuffer(this.eTy, 100L);
          if (i == -1)
          {
            ab.i(this.TAG, "no output from decoder available, break");
            AppMethodBeat.o(12864);
            bool2 = false;
            return bool2;
          }
        }
      }
      catch (Exception localException1)
      {
        ab.printErrStackTrace(this.TAG, (Throwable)localException1, "drainDecoder error", new Object[0]);
        if (this.eTO)
        {
          localObject2 = c.faj;
          c.VV();
        }
        AppMethodBeat.o(12864);
        bool2 = false;
        continue;
        if (i == -3)
        {
          ab.i(this.TAG, "decoder output buffers changed");
          continue;
        }
        Object localObject4;
        if (i == -2)
        {
          this.mediaFormat = Uy().getOutputFormat();
          localObject4 = this.TAG;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("decoder output format changed: ");
          ab.i((String)localObject4, this.mediaFormat);
          localObject2 = this.mediaFormat;
          if (localObject2 == null)
            continue;
          localObject4 = this.eTI;
          if (localObject4 == null)
            continue;
          ((a.f.a.b)localObject4).am(localObject2);
          continue;
        }
        if (i < 0)
        {
          ab.w(this.TAG, "unexpected result from decoder.dequeueOutputBuffer: ".concat(String.valueOf(i)));
          continue;
        }
        l = this.eTy.presentationTimeUs;
        ab.i(this.TAG, "presentationTimeUs : ".concat(String.valueOf(l)));
        if ((l < this.bqO * 1000L) && ((this.eTy.flags & 0x4) == 0))
        {
          Uy().releaseOutputBuffer(i, false);
          localObject2 = this.TAG;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>("decoder pts: ");
          ab.i((String)localObject2, l + ", not reach start: " + this.bqO * 1000L);
          AppMethodBeat.o(12864);
          bool2 = false;
          continue;
        }
        if (this.eTy.size == 0)
          break label543;
      }
      a(this.eTy);
      Object localObject2 = Uy();
      if (this.eTP != null);
      for (boolean bool2 = true; ; bool2 = false)
      {
        ((MediaCodec)localObject2).releaseOutputBuffer(i, bool2);
        if ((this.eTA * 1000L == 1L) || (l < this.eTA * 1000L))
          break label489;
        ab.e(this.TAG, "exceed endTimeMs");
        AppMethodBeat.o(12864);
        bool2 = bool1;
        break;
      }
      label489: int i = this.eTy.flags;
      if ((i & 0x4) != 0);
      try
      {
        Uy().stop();
        Uy().release();
        label519: AppMethodBeat.o(12864);
        bool2 = bool1;
        continue;
        AppMethodBeat.o(12864);
        bool2 = false;
        continue;
        label543: Uy().releaseOutputBuffer(i, false);
        i = Uy().dequeueOutputBuffer(this.eTy, 100L);
        if (i < 0)
          continue;
      }
      catch (Exception localException2)
      {
        break label519;
      }
    }
  }

  public final void UB()
  {
    AppMethodBeat.i(12862);
    while (!UE());
    ab.i(this.TAG, "inputDecoder end");
    int i;
    try
    {
      synchronized (this.eTL)
      {
        if (this.eTM)
          ab.i(this.TAG, "drainDecoder already finished");
        y localy = y.AUy;
        ab.i(this.TAG, "sendDecoderEOS");
        ??? = Uy().getInputBuffers();
        i = Uy().dequeueInputBuffer(60000L);
        if (i >= 0)
          break label164;
        if (!UF())
          i = Uy().dequeueInputBuffer(60000L);
      }
    }
    catch (Exception localException)
    {
      ab.printErrStackTrace(this.TAG, (Throwable)localException, "sendDecoderEOS error", new Object[0]);
    }
    sI();
    Object localObject2 = this.eTH;
    if (localObject2 != null)
    {
      ((a.f.a.a)localObject2).invoke();
      AppMethodBeat.o(12862);
    }
    while (true)
    {
      return;
      label164: if (i >= 0)
      {
        Object localObject4 = localObject2[i];
        localObject4.clear();
        localObject2 = this.eTz;
        j.o(localObject4, "inputBuffer");
        ((com.tencent.mm.media.e.a)localObject2).k(localObject4);
        localObject4.position(0);
        long l = this.eTz.getSampleTime();
        if (i >= 0)
          Uy().queueInputBuffer(i, 0, 0, l, 4);
      }
      UF();
      break;
      AppMethodBeat.o(12862);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/decoder/MediaCodecTransDecoder$Companion;", "", "()V", "DECODE_TIMEOUT", "", "TIMEOUT", "plugin-mediaeditor_release"})
  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.c.e
 * JD-Core Version:    0.6.2
 */