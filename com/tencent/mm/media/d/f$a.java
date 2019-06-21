package com.tencent.mm.media.d;

import a.f.a.a;
import a.f.b.j;
import a.l;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.i.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.nio.ByteBuffer;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/media/encoder/MediaCodecTransEncoderAsync$codecCallback$1", "Landroid/media/MediaCodec$Callback;", "onError", "", "codec", "Landroid/media/MediaCodec;", "e", "Landroid/media/MediaCodec$CodecException;", "onInputBufferAvailable", "index", "", "onOutputBufferAvailable", "outputBufferIndex", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "onOutputFormatChanged", "format", "Landroid/media/MediaFormat;", "plugin-mediaeditor_release"})
public final class f$a extends MediaCodec.Callback
{
  public final void onError(MediaCodec paramMediaCodec, MediaCodec.CodecException paramCodecException)
  {
    AppMethodBeat.i(12956);
    j.p(paramMediaCodec, "codec");
    j.p(paramCodecException, "e");
    ab.e(this.eVQ.TAG, "codec Error, e:".concat(String.valueOf(paramCodecException)));
    if (this.eVQ.eTO)
    {
      paramMediaCodec = c.faj;
      c.VY();
    }
    AppMethodBeat.o(12956);
  }

  public final void onInputBufferAvailable(MediaCodec paramMediaCodec, int paramInt)
  {
    AppMethodBeat.i(12954);
    j.p(paramMediaCodec, "codec");
    ab.i(this.eVQ.TAG, "onInputBufferAvailable, index:".concat(String.valueOf(paramInt)));
    AppMethodBeat.o(12954);
  }

  public final void onOutputBufferAvailable(MediaCodec paramMediaCodec, int paramInt, MediaCodec.BufferInfo paramBufferInfo)
  {
    AppMethodBeat.i(12953);
    j.p(paramMediaCodec, "codec");
    j.p(paramBufferInfo, "bufferInfo");
    ab.d(this.eVQ.TAG, "onOutputBufferAvailable index:" + paramInt + ", info: " + paramBufferInfo);
    if (paramInt >= 0);
    while (true)
    {
      try
      {
        localObject = this.eVQ.eVq.getOutputBuffer(paramInt);
        if ((paramBufferInfo.flags & 0x2) != 0)
          ab.i(this.eVQ.TAG, "codec config!");
        if (((paramBufferInfo.flags & 0x4) != 0) || (this.eVQ.eTf))
        {
          ab.i(this.eVQ.TAG, "encode end of stream");
          try
          {
            this.eVQ.eVq.stop();
            this.eVQ.eVq.release();
            this.eVQ.eTf = true;
            this.eVQ.release();
            paramMediaCodec = this.eVQ.eVz;
            if (paramMediaCodec != null)
            {
              paramMediaCodec.invoke();
              AppMethodBeat.o(12953);
              return;
            }
          }
          catch (Exception paramMediaCodec)
          {
            localObject = this.eVQ.TAG;
            paramBufferInfo = new java/lang/StringBuilder;
            paramBufferInfo.<init>("release encoder error ");
            ab.e((String)localObject, paramMediaCodec.getMessage());
            continue;
          }
        }
      }
      catch (Exception paramMediaCodec)
      {
        Object localObject;
        ab.printErrStackTrace(this.eVQ.TAG, (Throwable)paramMediaCodec, "onOutputBufferAvailable error", new Object[0]);
        if (this.eVQ.eTO)
        {
          paramMediaCodec = c.faj;
          c.VX();
        }
        AppMethodBeat.o(12953);
        continue;
        AppMethodBeat.o(12953);
        continue;
        if (paramBufferInfo.size != 0)
        {
          ((ByteBuffer)localObject).position(paramBufferInfo.offset);
          ((ByteBuffer)localObject).limit(paramBufferInfo.offset + paramBufferInfo.size);
          paramMediaCodec = this.eVQ;
          j.o(localObject, "outputBuffer");
          paramMediaCodec.f((ByteBuffer)localObject, paramBufferInfo);
          this.eVQ.eVq.releaseOutputBuffer(paramInt, paramBufferInfo.presentationTimeUs);
        }
        AppMethodBeat.o(12953);
        continue;
      }
      this.eVQ.eVq.releaseOutputBuffer(paramInt, false);
      AppMethodBeat.o(12953);
    }
  }

  public final void onOutputFormatChanged(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat)
  {
    AppMethodBeat.i(12955);
    j.p(paramMediaCodec, "codec");
    j.p(paramMediaFormat, "format");
    ab.i(this.eVQ.TAG, "encoder output format changed " + this.eVQ.eVq.getOutputFormat());
    AppMethodBeat.o(12955);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.d.f.a
 * JD-Core Version:    0.6.2
 */