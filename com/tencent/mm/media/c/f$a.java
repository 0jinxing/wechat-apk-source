package com.tencent.mm.media.c;

import a.f.b.j;
import a.l;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.e.a;
import com.tencent.mm.media.i.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.nio.ByteBuffer;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/media/decoder/MediaCodecTransDecoderAsync$codecCallback$1", "Landroid/media/MediaCodec$Callback;", "onError", "", "codec", "Landroid/media/MediaCodec;", "e", "Landroid/media/MediaCodec$CodecException;", "onInputBufferAvailable", "index", "", "onOutputBufferAvailable", "decoderOutputBufferIndex", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "onOutputFormatChanged", "format", "Landroid/media/MediaFormat;", "plugin-mediaeditor_release"})
public final class f$a extends MediaCodec.Callback
{
  f$a(Surface paramSurface, a parama)
  {
  }

  public final void onError(MediaCodec paramMediaCodec, MediaCodec.CodecException paramCodecException)
  {
    AppMethodBeat.i(12870);
    j.p(paramMediaCodec, "codec");
    j.p(paramCodecException, "e");
    ab.e(this.eUg.TAG, "onError, codec:" + paramMediaCodec + ", e:" + paramCodecException);
    if (this.eUg.eTO)
    {
      paramMediaCodec = c.faj;
      c.VW();
    }
    AppMethodBeat.o(12870);
  }

  public final void onInputBufferAvailable(MediaCodec paramMediaCodec, int paramInt)
  {
    AppMethodBeat.i(12868);
    j.p(paramMediaCodec, "codec");
    ab.i(this.eUg.TAG, "onInputBufferAvailable, index:".concat(String.valueOf(paramInt)));
    if (paramInt >= 0);
    while (true)
    {
      try
      {
        this.eUg.eUb = false;
        paramMediaCodec = this.eUg.Uy().getInputBuffer(paramInt);
        paramMediaCodec.clear();
        Object localObject = this.eUa;
        j.o(paramMediaCodec, "inputBuffer");
        if (!((a)localObject).k(paramMediaCodec))
        {
          ab.i(this.eUg.TAG, "read sample end");
          this.eUg.eUb = true;
        }
        long l1 = 0L;
        if (this.eUg.eUb)
          break label328;
        int i = this.eUa.sampleSize;
        paramMediaCodec.position(0);
        long l2 = this.eUa.getSampleTime();
        paramMediaCodec = this.eUg.TAG;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("sampleTime : ");
        ab.i(paramMediaCodec, l2 + ", sampleSize:" + i);
        if (i >= 0)
        {
          j = i;
          l1 = l2;
          if (l2 < this.eUg.eTA * 1000L);
        }
        else
        {
          this.eUg.eUb = true;
          ab.i(this.eUg.TAG, "sawInputEOS");
          l1 = l2;
          j = i;
        }
        paramMediaCodec = this.eUg.Uy();
        if (this.eUg.eUb)
        {
          i = 4;
          paramMediaCodec.queueInputBuffer(paramInt, 0, j, l1, i);
          AppMethodBeat.o(12868);
          return;
        }
        i = 0;
        continue;
      }
      catch (Exception paramMediaCodec)
      {
        ab.printErrStackTrace(this.eUg.TAG, (Throwable)paramMediaCodec, "onInputBufferAvailable error", new Object[0]);
        if (this.eUg.eTO)
        {
          paramMediaCodec = c.faj;
          c.VV();
        }
      }
      AppMethodBeat.o(12868);
      continue;
      label328: int j = 0;
    }
  }

  public final void onOutputBufferAvailable(MediaCodec paramMediaCodec, int paramInt, MediaCodec.BufferInfo paramBufferInfo)
  {
    AppMethodBeat.i(12867);
    j.p(paramMediaCodec, "codec");
    j.p(paramBufferInfo, "bufferInfo");
    ab.i(this.eUg.TAG, "onOutputBufferAvailable, index:" + paramInt + ", bufferInfo:" + paramBufferInfo + " size:" + paramBufferInfo.size);
    if (paramInt >= 0);
    while (true)
    {
      try
      {
        long l = paramBufferInfo.presentationTimeUs;
        ab.i(this.eUg.TAG, "presentationTimeUs : ".concat(String.valueOf(l)));
        if ((l < this.eUg.bqO * 1000L) && ((paramBufferInfo.flags & 0x4) == 0))
        {
          this.eUg.Uy().releaseOutputBuffer(paramInt, false);
          paramMediaCodec = this.eUg.TAG;
          paramBufferInfo = new java/lang/StringBuilder;
          paramBufferInfo.<init>("decoder pts: ");
          ab.i(paramMediaCodec, l + ", not reach start: " + this.eUg.bqO * 1000L);
          AppMethodBeat.o(12867);
          return;
        }
        this.eUg.a(paramBufferInfo);
        paramMediaCodec = this.eUg.Uy();
        if (this.eUh != null)
        {
          bool = true;
          paramMediaCodec.releaseOutputBuffer(paramInt, bool);
          if ((this.eUg.eTA * 1000L == 1L) || (l < this.eUg.eTA * 1000L))
            continue;
          ab.e(this.eUg.TAG, "exceed endTimeMs");
          this.eUg.sI();
          f.a(this.eUg);
          AppMethodBeat.o(12867);
          continue;
        }
      }
      catch (Exception paramMediaCodec)
      {
        ab.printErrStackTrace(this.eUg.TAG, (Throwable)paramMediaCodec, "onOutputBufferAvailable error", new Object[0]);
        if (this.eUg.eTO)
        {
          paramMediaCodec = c.faj;
          c.VV();
        }
        AppMethodBeat.o(12867);
        continue;
        boolean bool = false;
        continue;
        if (((paramBufferInfo.flags & 0x4) == 0) && (!this.eUg.eUb))
          continue;
        ab.i(this.eUg.TAG, "receive eos!");
        this.eUg.sI();
        f.a(this.eUg);
        AppMethodBeat.o(12867);
        continue;
      }
      this.eUg.Uy().releaseOutputBuffer(paramInt, false);
      AppMethodBeat.o(12867);
    }
  }

  public final void onOutputFormatChanged(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat)
  {
    AppMethodBeat.i(12869);
    j.p(paramMediaCodec, "codec");
    j.p(paramMediaFormat, "format");
    this.eUg.mediaFormat = paramMediaFormat;
    ab.i(this.eUg.TAG, "decoder output format changed: " + this.eUg.mediaFormat);
    paramMediaFormat = this.eUg.mediaFormat;
    if (paramMediaFormat != null)
    {
      paramMediaCodec = this.eUg.eTI;
      if (paramMediaCodec != null)
      {
        paramMediaCodec.am(paramMediaFormat);
        AppMethodBeat.o(12869);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(12869);
      continue;
      AppMethodBeat.o(12869);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.c.f.a
 * JD-Core Version:    0.6.2
 */