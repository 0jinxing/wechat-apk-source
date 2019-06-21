package com.tencent.mm.plugin.mmsight.segment;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g
{
  private long bqO;
  private MediaExtractor clX;
  String clY;
  private long eTA;
  MediaFormat eVr;
  VideoTransPara fYK;
  MediaFormat fYc;
  MediaCodec oxW;
  MediaCodec oxX;
  boolean oxY;
  List<byte[]> oxZ;
  private boolean oya;
  private boolean oyb;
  private byte[] oyc;
  private HandlerThread oyd;
  private ak oye;

  public g(MediaExtractor paramMediaExtractor, MediaFormat paramMediaFormat, long paramLong1, long paramLong2, VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(3644);
    this.clY = null;
    this.oxY = true;
    this.oxZ = null;
    this.oya = false;
    this.oyb = false;
    this.oyd = null;
    this.oye = null;
    this.clX = paramMediaExtractor;
    this.fYc = paramMediaFormat;
    this.bqO = paramLong1;
    this.eTA = paramLong2;
    this.fYK = paramVideoTransPara;
    this.clY = paramMediaFormat.getString("mime");
    this.oxZ = new ArrayList();
    ab.i("MicroMsg.MediaCodecAACTranscoder", "create MediaCodecAACTranscoder, startTimeMs: %s, endTimeMs: %s, mime: %s, srcMediaFormat: %s, para: %s", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2), this.clY, paramMediaFormat, paramVideoTransPara });
    AppMethodBeat.o(3644);
  }

  private void UD()
  {
    AppMethodBeat.i(3646);
    if (this.oxW == null)
      AppMethodBeat.o(3646);
    while (true)
    {
      return;
      MediaCodec.BufferInfo localBufferInfo;
      label36: int i;
      label116: ByteBuffer[] arrayOfByteBuffer2;
      while (true)
      {
        try
        {
          ByteBuffer[] arrayOfByteBuffer1 = this.oxW.getOutputBuffers();
          localBufferInfo = new android/media/MediaCodec$BufferInfo;
          localBufferInfo.<init>();
          i = this.oxW.dequeueOutputBuffer(localBufferInfo, 20000L);
          ab.d("MicroMsg.MediaCodecAACTranscoder", "decoderOutputBufferIndex: %s", new Object[] { Integer.valueOf(i) });
          if (i != -1)
            break label116;
          ab.d("MicroMsg.MediaCodecAACTranscoder", "no output available, break");
          AppMethodBeat.o(3646);
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.MediaCodecAACTranscoder", localException, "drainDecoder error: %s", new Object[] { localException.getMessage() });
          AppMethodBeat.o(3646);
        }
        break;
        if (i == -3)
        {
          arrayOfByteBuffer2 = this.oxW.getOutputBuffers();
        }
        else if (i == -2)
        {
          this.fYc = this.oxW.getOutputFormat();
          ab.i("MicroMsg.MediaCodecAACTranscoder", "srcMediaFormat change: %s", new Object[] { this.fYc });
        }
        else
        {
          if (i >= 0)
            break label196;
          ab.e("MicroMsg.MediaCodecAACTranscoder", "unexpected decoderOutputBufferIndex: %s", new Object[] { Integer.valueOf(i) });
        }
      }
      label196: ab.v("MicroMsg.MediaCodecAACTranscoder", "perform decoding");
      ByteBuffer localByteBuffer = arrayOfByteBuffer2[i];
      if (localByteBuffer == null)
      {
        ab.e("MicroMsg.MediaCodecAACTranscoder", "ERROR, retrieve decoderOutputBuffer is null!!");
        AppMethodBeat.o(3646);
      }
      else
      {
        if ((localBufferInfo.flags & 0x2) != 0)
        {
          ab.e("MicroMsg.MediaCodecAACTranscoder", "ignore BUFFER_FLAG_CODEC_CONFIG");
          localBufferInfo.size = 0;
        }
        if (localBufferInfo.size > 0)
        {
          localByteBuffer.position(localBufferInfo.offset);
          localByteBuffer.limit(localBufferInfo.offset + localBufferInfo.size);
          if ((localBufferInfo.flags & 0x4) == 0)
            break label363;
        }
        label363: for (boolean bool = true; ; bool = false)
        {
          a(localByteBuffer, localBufferInfo, bool);
          this.oxW.releaseOutputBuffer(i, false);
          if ((localBufferInfo.flags & 0x4) == 0)
            break label36;
          ab.i("MicroMsg.MediaCodecAACTranscoder", "receive EOS!");
          if (this.oxW == null)
            break label369;
          this.oxW.stop();
          this.oxW.release();
          this.oxW = null;
          AppMethodBeat.o(3646);
          break;
        }
        label369: AppMethodBeat.o(3646);
      }
    }
  }

  private void UR()
  {
    AppMethodBeat.i(3650);
    if (this.oxX == null)
      AppMethodBeat.o(3650);
    while (true)
    {
      return;
      MediaCodec.BufferInfo localBufferInfo;
      label116: 
      do
      {
        int i;
        ByteBuffer[] arrayOfByteBuffer2;
        while (true)
        {
          try
          {
            ByteBuffer[] arrayOfByteBuffer1 = this.oxX.getOutputBuffers();
            localBufferInfo = new android/media/MediaCodec$BufferInfo;
            localBufferInfo.<init>();
            i = this.oxX.dequeueOutputBuffer(localBufferInfo, 20000L);
            ab.d("MicroMsg.MediaCodecAACTranscoder", "encoderOutputBufferIndex: %s", new Object[] { Integer.valueOf(i) });
            if (i != -1)
              break label116;
            ab.d("MicroMsg.MediaCodecAACTranscoder", "no output available, break");
            AppMethodBeat.o(3650);
          }
          catch (Exception localException)
          {
            ab.printErrStackTrace("MicroMsg.MediaCodecAACTranscoder", localException, "drainEncoder error: %s", new Object[] { localException.getMessage() });
            AppMethodBeat.o(3650);
          }
          break;
          if (i == -3)
          {
            arrayOfByteBuffer2 = this.oxX.getOutputBuffers();
          }
          else if (i == -2)
          {
            this.eVr = this.oxX.getOutputFormat();
            ab.i("MicroMsg.MediaCodecAACTranscoder", "dstMediaFormat change: %s", new Object[] { this.eVr });
          }
          else
          {
            if (i >= 0)
              break label196;
            ab.e("MicroMsg.MediaCodecAACTranscoder", "unexpected encoderOutputBufferIndex: %s", new Object[] { Integer.valueOf(i) });
          }
        }
        ab.v("MicroMsg.MediaCodecAACTranscoder", "perform encoding");
        ByteBuffer localByteBuffer = arrayOfByteBuffer2[i];
        if (localByteBuffer == null)
        {
          ab.e("MicroMsg.MediaCodecAACTranscoder", "ERROR, retrieve encoderOutputBuffer is null!!");
          AppMethodBeat.o(3650);
          break;
        }
        if (localBufferInfo.size > 0)
        {
          localByteBuffer.position(localBufferInfo.offset);
          localByteBuffer.limit(localBufferInfo.offset + localBufferInfo.size);
          h(localByteBuffer, localBufferInfo);
        }
        this.oxX.releaseOutputBuffer(i, false);
      }
      while ((localBufferInfo.flags & 0x4) == 0);
      label196: ab.i("MicroMsg.MediaCodecAACTranscoder", "receive EOS!");
      if (this.oxX != null)
      {
        this.oxX.stop();
        this.oxX.release();
        this.oxX = null;
        AppMethodBeat.o(3650);
      }
      else
      {
        AppMethodBeat.o(3650);
      }
    }
  }

  private void a(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo, boolean paramBoolean)
  {
    AppMethodBeat.i(3647);
    if (paramByteBuffer == null)
      AppMethodBeat.o(3647);
    while (true)
    {
      return;
      ab.d("MicroMsg.MediaCodecAACTranscoder", "processDecodeBuffer, EOS: %s, finishGetAllInputAACData: %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.oyb) });
      if (this.oxY)
      {
        if (!this.oya)
        {
          bQi();
          this.oya = true;
        }
        if (this.oyc == null)
        {
          this.oyc = new byte[paramByteBuffer.remaining()];
          paramByteBuffer.get(this.oyc, 0, paramByteBuffer.remaining());
        }
        c(this.oyc, paramBufferInfo.presentationTimeUs, paramBoolean);
        AppMethodBeat.o(3647);
      }
      else
      {
        Object localObject = new byte[paramByteBuffer.remaining()];
        paramByteBuffer.get((byte[])localObject, 0, paramByteBuffer.remaining());
        this.oxZ.add(localObject);
        if ((this.oyb) || (paramBoolean))
          try
          {
            this.oxW.stop();
            this.oxW.release();
            bQi();
            this.oya = true;
            localObject = this.oxZ.iterator();
            for (int i = 0; ; i++)
            {
              if (!((Iterator)localObject).hasNext())
                break label282;
              paramByteBuffer = (byte[])((Iterator)localObject).next();
              long l = paramBufferInfo.presentationTimeUs;
              if (i < this.oxZ.size() - 1)
                break;
              paramBoolean = true;
              c(paramByteBuffer, l, paramBoolean);
            }
          }
          catch (Exception paramByteBuffer)
          {
            while (true)
            {
              ab.printErrStackTrace("MicroMsg.MediaCodecAACTranscoder", paramByteBuffer, "", new Object[0]);
              continue;
              paramBoolean = false;
            }
          }
        label282: AppMethodBeat.o(3647);
      }
    }
  }

  private void bQi()
  {
    AppMethodBeat.i(3648);
    if ((this.oxX != null) && (this.oxY) && (!this.oya))
    {
      this.oxW.start();
      AppMethodBeat.o(3648);
    }
    while (true)
    {
      return;
      try
      {
        MediaFormat localMediaFormat = new android/media/MediaFormat;
        localMediaFormat.<init>();
        this.eVr = localMediaFormat;
        this.eVr.setString("mime", "audio/mp4a-latm");
        this.eVr.setInteger("aac-profile", 2);
        this.eVr.setInteger("sample-rate", this.fYK.audioSampleRate);
        this.eVr.setInteger("channel-count", 1);
        this.eVr.setInteger("bitrate", this.fYK.fzS);
        this.eVr.setInteger("max-input-size", 16384);
        this.oxX = MediaCodec.createEncoderByType(this.clY);
        this.oxX.configure(this.eVr, null, null, 1);
        this.oxX.start();
        ab.i("MicroMsg.MediaCodecAACTranscoder", "checkInitAndStartEncoder, not canEncodeDecodeBothExist, create new encoder");
        AppMethodBeat.o(3648);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.MediaCodecAACTranscoder", "checkInitAndStartEncoder, not canEncodeDecodeBothExist, error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(3648);
      }
    }
  }

  private void bQj()
  {
    AppMethodBeat.i(3652);
    al.n(new g.2(this), 500L);
    AppMethodBeat.o(3652);
  }

  private void c(byte[] paramArrayOfByte, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(3649);
    if ((this.oxX == null) || (paramArrayOfByte == null))
    {
      AppMethodBeat.o(3649);
      return;
    }
    Object localObject = this.oxX.getInputBuffers();
    int i = this.oxX.dequeueInputBuffer(20000L);
    if (i < 0)
    {
      ab.d("MicroMsg.MediaCodecAACTranscoder", "encoder no input buffer available, drain first");
      UR();
    }
    int j;
    if (i >= 0)
    {
      localObject = localObject[i];
      ((ByteBuffer)localObject).clear();
      ((ByteBuffer)localObject).position(0);
      ((ByteBuffer)localObject).put(paramArrayOfByte);
      if (!paramBoolean)
        break label187;
      ab.i("MicroMsg.MediaCodecAACTranscoder", "last, send EOS and try delay stop encoder");
      j = 1;
      bQj();
    }
    while (true)
    {
      if (this.oxX == null)
      {
        AppMethodBeat.o(3649);
        break;
      }
      if (j != 0)
      {
        ab.i("MicroMsg.MediaCodecAACTranscoder", "EOS received in sendAudioToEncoder");
        this.oxX.queueInputBuffer(i, 0, paramArrayOfByte.length, paramLong, 4);
      }
      while (true)
      {
        UR();
        AppMethodBeat.o(3649);
        break;
        this.oxX.queueInputBuffer(i, 0, paramArrayOfByte.length, paramLong, 0);
      }
      label187: j = 0;
    }
  }

  private static void h(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    AppMethodBeat.i(3651);
    if (paramByteBuffer != null)
      MP4MuxerJNI.writeAACData(0, paramByteBuffer, paramBufferInfo.size);
    AppMethodBeat.o(3651);
  }

  public final void bQh()
  {
    AppMethodBeat.i(3645);
    this.oya = false;
    this.oyb = false;
    try
    {
      if ((this.oxW == null) || (this.clX == null))
      {
        ab.e("MicroMsg.MediaCodecAACTranscoder", "startTranscodeBlockLoop error");
        AppMethodBeat.o(3645);
        label44: return;
      }
      Object localObject = this.oxW.getInputBuffers();
      int i = this.oxW.dequeueInputBuffer(20000L);
      if (i < 0)
      {
        ab.d("MicroMsg.MediaCodecAACTranscoder", "decoder no input buffer available, drain first");
        UD();
      }
      int j;
      long l;
      if (i >= 0)
      {
        ab.d("MicroMsg.MediaCodecAACTranscoder", "decoderInputBufferIndex: %d", new Object[] { Integer.valueOf(i) });
        localObject = localObject[i];
        ((ByteBuffer)localObject).clear();
        ((ByteBuffer)localObject).position(0);
        j = this.clX.readSampleData((ByteBuffer)localObject, 0);
        l = this.clX.getSampleTime();
        this.clX.advance();
        ab.d("MicroMsg.MediaCodecAACTranscoder", "sampleSize: %s, pts: %s", new Object[] { Integer.valueOf(j), Long.valueOf(l) });
        if ((l < this.eTA * 1000L) && (l > 0L) && (j > 0))
          break label346;
        ab.i("MicroMsg.MediaCodecAACTranscoder", "reach end time, send EOS and try delay stop decoder");
        this.oyb = true;
        localObject = new com/tencent/mm/plugin/mmsight/segment/g$1;
        ((g.1)localObject).<init>(this);
        al.n((Runnable)localObject, 500L);
        k = 1;
        if (this.oxW == null)
          break label337;
        if (k == 0)
          break label291;
        ab.i("MicroMsg.MediaCodecAACTranscoder", "EOS received in sendAudioToEncoder");
        this.oxW.queueInputBuffer(i, 0, j, l, 4);
      }
      while (true)
      {
        UD();
        if (!this.oyb)
          break;
        localObject = this.oxX;
        if (localObject != null)
          break;
        AppMethodBeat.o(3645);
        break label44;
        label291: this.oxW.queueInputBuffer(i, 0, j, l, 0);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MediaCodecAACTranscoder", localException, "startTranscodeBlockLoop error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(3645);
        continue;
        label337: AppMethodBeat.o(3645);
        continue;
        label346: int k = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.g
 * JD-Core Version:    0.6.2
 */