package com.tencent.mm.media.c;

import a.f.a.m;
import a.f.b.j;
import a.l;
import a.y;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/decoder/MediaCodecAACDecoderAsync;", "Lcom/tencent/mm/media/decoder/IAudioDecoder;", "mediaExtractorWrapper", "Lcom/tencent/mm/media/extractor/MediaExtractorWrapper;", "audioId", "", "startTimeMs", "", "endTimeMs", "frameDecodeCallback", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "pcmData", "pts", "", "frameDecodeEndCallback", "Lkotlin/Function0;", "(Lcom/tencent/mm/media/extractor/MediaExtractorWrapper;Ljava/lang/String;JJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "aacCallback", "Landroid/media/MediaCodec$Callback;", "endTimeMsChanged", "zeroCount", "", "startDecoder", "Companion", "plugin-mediaeditor_release"})
public final class d extends a
{
  private static final String TAG = "MicroMsg.MediaCodecAACDecoderAsync";
  public static final d.a eTW;
  private int eTT;
  private long eTU;
  private MediaCodec.Callback eTV;

  static
  {
    AppMethodBeat.i(12861);
    eTW = new d.a((byte)0);
    TAG = "MicroMsg.MediaCodecAACDecoderAsync";
    AppMethodBeat.o(12861);
  }

  public d(com.tencent.mm.media.e.a parama, final String paramString, final long paramLong1, long paramLong2, m<? super byte[], ? super Long, y> paramm, a.f.a.a<y> parama1)
  {
    super(parama, paramString, paramLong1, paramLong2, paramm, parama1);
    AppMethodBeat.i(12860);
    this.eTU = paramLong2;
    this.eTV = ((MediaCodec.Callback)new b(this, paramString, paramLong1, parama));
    Uy().setCallback(this.eTV);
    AppMethodBeat.o(12860);
  }

  public final void Uz()
  {
    AppMethodBeat.i(12859);
    try
    {
      Uy().start();
      String str = TAG;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("startDecoder ");
      ab.i(str, this.ckD);
      AppMethodBeat.o(12859);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace(TAG, (Throwable)localException, "startDecoder error", new Object[0]);
        AppMethodBeat.o(12859);
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/media/decoder/MediaCodecAACDecoderAsync$aacCallback$1", "Landroid/media/MediaCodec$Callback;", "onError", "", "codec", "Landroid/media/MediaCodec;", "e", "Landroid/media/MediaCodec$CodecException;", "onInputBufferAvailable", "index", "", "onOutputBufferAvailable", "decoderOutputBufferIndex", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "onOutputFormatChanged", "format", "Landroid/media/MediaFormat;", "plugin-mediaeditor_release"})
  public static final class b extends MediaCodec.Callback
  {
    b(String paramString, long paramLong, com.tencent.mm.media.e.a parama)
    {
    }

    public final void onError(MediaCodec paramMediaCodec, MediaCodec.CodecException paramCodecException)
    {
    }

    public final void onInputBufferAvailable(MediaCodec paramMediaCodec, int paramInt)
    {
      AppMethodBeat.i(12857);
      try
      {
        Object localObject = d.access$getTAG$cp();
        paramMediaCodec = new java/lang/StringBuilder;
        paramMediaCodec.<init>("onInputBufferAvailable, index:");
        ab.i((String)localObject, paramInt + ", audioId:" + paramString);
        this.eTX.eTv = bo.yz();
        if (paramInt < 0)
        {
          AppMethodBeat.o(12857);
          return;
        }
        localObject = this.eTX.Uy().getInputBuffer(paramInt);
        if (localObject != null)
          ((ByteBuffer)localObject).clear();
        paramMediaCodec = this.eUa;
        j.o(localObject, "inputBuffer");
        if (!paramMediaCodec.k((ByteBuffer)localObject))
        {
          ab.i(d.access$getTAG$cp(), "read sample end");
          i = 1;
          long l = 0L;
          if (i == 0)
          {
            j = this.eUa.sampleSize;
            ((ByteBuffer)localObject).position(0);
            l = this.eUa.getSampleTime();
            localObject = d.access$getTAG$cp();
            paramMediaCodec = new java/lang/StringBuilder;
            paramMediaCodec.<init>("sampleTime : ");
            ab.i((String)localObject, l + ", sampleSize:" + j + ", audioId:" + paramString);
            if ((j < 0) || (l >= d.b(this.eTX) * 1000L))
            {
              paramMediaCodec = d.access$getTAG$cp();
              localObject = new java/lang/StringBuilder;
              ((StringBuilder)localObject).<init>("sawInputEOS, audioId:");
              ab.i(paramMediaCodec, paramString);
              i = 1;
              paramMediaCodec = this.eTX.Uy();
              if (i != 0);
              for (int k = 4; ; k = 0)
              {
                paramMediaCodec.queueInputBuffer(paramInt, 0, j, l, k);
                if (i == 0)
                  break label323;
                this.eTX.UA();
                AppMethodBeat.o(12857);
                break;
              }
            }
          }
        }
      }
      catch (Exception paramMediaCodec)
      {
        while (true)
        {
          ab.printErrStackTrace(d.access$getTAG$cp(), (Throwable)paramMediaCodec, "", new Object[0]);
          label323: AppMethodBeat.o(12857);
          continue;
          continue;
          int j = 0;
          continue;
          int i = 0;
        }
      }
    }

    public final void onOutputBufferAvailable(MediaCodec paramMediaCodec, int paramInt, MediaCodec.BufferInfo paramBufferInfo)
    {
      AppMethodBeat.i(12856);
      j.p(paramBufferInfo, "bufferInfo");
      try
      {
        String str = d.access$getTAG$cp();
        paramMediaCodec = new java/lang/StringBuilder;
        paramMediaCodec.<init>("onOutputBufferAvailable, index:");
        ab.i(str, paramInt + ", bufferInfo:" + paramBufferInfo + " size:" + paramBufferInfo.size + paramString);
        if (paramInt >= 0)
        {
          l = paramBufferInfo.presentationTimeUs;
          ab.i(d.access$getTAG$cp(), "presentationTimeUs : ".concat(String.valueOf(l)));
          if ((l < paramLong1 * 1000L) && ((paramBufferInfo.flags & 0x4) == 0))
          {
            this.eTX.Uy().releaseOutputBuffer(paramInt, false);
            paramBufferInfo = d.access$getTAG$cp();
            paramMediaCodec = new java/lang/StringBuilder;
            paramMediaCodec.<init>("decoder pts: ");
            ab.i(paramBufferInfo, l + ", not reach start: " + paramLong1 * 1000L + ", audioId:" + paramString);
            AppMethodBeat.o(12856);
          }
          while (true)
          {
            return;
            if (paramBufferInfo.size != 0)
              break;
            paramMediaCodec = d.access$getTAG$cp();
            paramBufferInfo = new java/lang/StringBuilder;
            paramBufferInfo.<init>("decode zero size:");
            ab.i(paramMediaCodec, paramString + ", zeroCount:" + d.a(this.eTX));
            paramMediaCodec = this.eTX;
            d.a(paramMediaCodec, d.a(paramMediaCodec) + 1);
            this.eTX.Uy().releaseOutputBuffer(paramInt, false);
            AppMethodBeat.o(12856);
          }
        }
      }
      catch (Exception paramMediaCodec)
      {
        while (true)
        {
          long l;
          ab.printErrStackTrace(d.access$getTAG$cp(), (Throwable)paramMediaCodec, "", new Object[0]);
          do
          {
            AppMethodBeat.o(12856);
            break;
            paramMediaCodec = this.eTX.Uy().getOutputBuffer(paramInt);
            this.eTX.e(paramMediaCodec, paramBufferInfo);
            this.eTX.Uy().releaseOutputBuffer(paramInt, false);
            if ((d.b(this.eTX) * 1000L != 1L) && (l >= d.b(this.eTX) * 1000L))
            {
              paramMediaCodec = d.access$getTAG$cp();
              paramBufferInfo = new java/lang/StringBuilder;
              paramBufferInfo.<init>("exceed endTimeMs, audioId:");
              ab.e(paramMediaCodec, paramString);
              this.eTX.UA();
              AppMethodBeat.o(12856);
              break;
            }
          }
          while ((paramBufferInfo.flags & 0x4) == 0);
          paramMediaCodec = d.access$getTAG$cp();
          paramBufferInfo = new java/lang/StringBuilder;
          paramBufferInfo.<init>("receive eos! audioId:");
          ab.i(paramMediaCodec, paramString);
          this.eTX.UA();
          AppMethodBeat.o(12856);
          continue;
          this.eTX.Uy().releaseOutputBuffer(paramInt, false);
          AppMethodBeat.o(12856);
        }
      }
    }

    public final void onOutputFormatChanged(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat)
    {
      AppMethodBeat.i(12858);
      this.eTX.mMediaFormat = paramMediaFormat;
      ab.i(d.access$getTAG$cp(), "onOutputFormatChanged:" + this.eTX.mMediaFormat + ", audioId:" + paramString);
      AppMethodBeat.o(12858);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.c.d
 * JD-Core Version:    0.6.2
 */