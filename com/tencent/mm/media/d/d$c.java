package com.tencent.mm.media.d;

import a.l;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/media/encoder/MediaCodecAACEncoderAsync$aacCallback$1", "Landroid/media/MediaCodec$Callback;", "onError", "", "codec", "Landroid/media/MediaCodec;", "e", "Landroid/media/MediaCodec$CodecException;", "onInputBufferAvailable", "index", "", "onOutputBufferAvailable", "info", "Landroid/media/MediaCodec$BufferInfo;", "onOutputFormatChanged", "format", "Landroid/media/MediaFormat;", "plugin-mediaeditor_release"})
public final class d$c extends MediaCodec.Callback
{
  public final void onError(MediaCodec paramMediaCodec, MediaCodec.CodecException paramCodecException)
  {
  }

  public final void onInputBufferAvailable(MediaCodec paramMediaCodec, int paramInt)
  {
    AppMethodBeat.i(12939);
    d.b localb;
    long l;
    try
    {
      ab.i("MicroMsg.MediaCodecAACEncoder", "has input buffer ".concat(String.valueOf(paramInt)));
      if (d.c(this.eVI).size() == 0)
      {
        ab.i("MicroMsg.MediaCodecAACEncoder", "current data is null");
        this.eVI.eVq.queueInputBuffer(paramInt, 0, 0, 0L, 0);
        AppMethodBeat.o(12939);
      }
      while (true)
      {
        return;
        ab.i("MicroMsg.MediaCodecAACEncoder", "has input buffer avaiable".concat(String.valueOf(paramInt)));
        if (!this.eVI.eTf)
          break;
        ab.i("MicroMsg.MediaCodecAACEncoder", "sendDataToEncoder end now");
        AppMethodBeat.o(12939);
      }
    }
    catch (Exception paramMediaCodec)
    {
      ab.printErrStackTrace("MicroMsg.MediaCodecAACEncoder", (Throwable)paramMediaCodec, "onInputBufferAvailable error", new Object[0]);
      boolean bool;
      do
      {
        AppMethodBeat.o(12939);
        break;
        this.eVI.eVs = bo.yz();
        if (paramInt < 0)
        {
          ab.d("MicroMsg.MediaCodecAACEncoder", "encoder no input buffer available, drain first");
          AppMethodBeat.o(12939);
          break;
        }
        paramMediaCodec = d.c(this.eVI);
        a.f.b.j.o(paramMediaCodec, "inputDataSource");
        localb = (d.b)a.a.j.fJ(paramMediaCodec);
        paramMediaCodec = localb.ckv;
        l = localb.eTe;
        bool = localb.eVH;
        if (paramMediaCodec == null)
        {
          AppMethodBeat.o(12939);
          break;
        }
      }
      while (paramInt < 0);
      ByteBuffer localByteBuffer = this.eVI.eVq.getInputBuffer(paramInt);
      if (localByteBuffer != null)
        localByteBuffer.clear();
      if (localByteBuffer != null)
        localByteBuffer.position(0);
      if (localByteBuffer != null)
        localByteBuffer.put(paramMediaCodec);
      if (!bool)
        break label357;
    }
    ab.i("MicroMsg.MediaCodecAACEncoder", "last, send EOS and try delay stop encoder");
    label357: for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        d.b(this.eVI);
        ab.i("MicroMsg.MediaCodecAACEncoder", "EOS received in sendAudioToEncoder");
        this.eVI.eVq.queueInputBuffer(paramInt, 0, paramMediaCodec.length, l, 4);
      }
      while (true)
      {
        d.c(this.eVI).remove(localb);
        AppMethodBeat.o(12939);
        break;
        this.eVI.eVq.queueInputBuffer(paramInt, 0, paramMediaCodec.length, l, 0);
      }
    }
  }

  public final void onOutputBufferAvailable(MediaCodec paramMediaCodec, int paramInt, MediaCodec.BufferInfo paramBufferInfo)
  {
    AppMethodBeat.i(12938);
    try
    {
      ab.d("MicroMsg.MediaCodecAACEncoder", "encoderOutputBufferIndex: %s", new Object[] { Integer.valueOf(paramInt) });
      if (paramInt == -1)
      {
        ab.d("MicroMsg.MediaCodecAACEncoder", "no output available, break");
        AppMethodBeat.o(12938);
      }
      while (true)
      {
        return;
        if (paramInt != -2)
          break;
        paramBufferInfo = this.eVI;
        paramMediaCodec = this.eVI.eVq.getOutputFormat();
        a.f.b.j.o(paramMediaCodec, "encoder.outputFormat");
        paramBufferInfo.c(paramMediaCodec);
        ab.i("MicroMsg.MediaCodecAACEncoder", "dstMediaFormat change: %s", new Object[] { this.eVI.eVr });
        AppMethodBeat.o(12938);
      }
    }
    catch (Exception paramMediaCodec)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MediaCodecAACEncoder", (Throwable)paramMediaCodec, "drainEncoder error: %s", new Object[] { paramMediaCodec.getMessage() });
        AppMethodBeat.o(12938);
        continue;
        if (paramInt < 0)
        {
          ab.e("MicroMsg.MediaCodecAACEncoder", "unexpected encoderOutputBufferIndex: %s", new Object[] { Integer.valueOf(paramInt) });
          AppMethodBeat.o(12938);
        }
        else
        {
          if (paramBufferInfo == null)
            a.f.b.j.dWJ();
          if ((paramBufferInfo.flags & 0x2) != 0)
          {
            ab.v("MicroMsg.MediaCodecAACEncoder", "ignoring BUFFER_FLAG_CODEC_CONFIG,size: %s, %s", new Object[] { Integer.valueOf(paramBufferInfo.size), Boolean.TRUE });
            paramBufferInfo.size = 0;
          }
          ab.v("MicroMsg.MediaCodecAACEncoder", "perform encoding");
          paramMediaCodec = this.eVI.eVq.getOutputBuffer(paramInt);
          this.eVI.f(paramMediaCodec, paramBufferInfo);
          this.eVI.eVq.releaseOutputBuffer(paramInt, false);
          if (((paramBufferInfo.flags & 0x4) != 0) || (d.a(this.eVI)))
          {
            ab.i("MicroMsg.MediaCodecAACEncoder", "receive EOS!");
            this.eVI.releaseEncoder();
            AppMethodBeat.o(12938);
          }
          else
          {
            AppMethodBeat.o(12938);
          }
        }
      }
    }
  }

  public final void onOutputFormatChanged(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.d.d.c
 * JD-Core Version:    0.6.2
 */