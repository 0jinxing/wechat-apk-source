package com.tencent.mm.media.c;

import a.f.a.m;
import a.f.b.j;
import a.l;
import a.y;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/decoder/IAudioDecoder;", "", "mediaExtractorWrapper", "Lcom/tencent/mm/media/extractor/MediaExtractorWrapper;", "audioId", "", "startTimeMs", "", "endTimeMs", "frameDecodeCallback", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "pcmData", "pts", "", "frameDecodeEndCallback", "Lkotlin/Function0;", "(Lcom/tencent/mm/media/extractor/MediaExtractorWrapper;Ljava/lang/String;JJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "aacSampleRate", "", "getAacSampleRate", "()I", "setAacSampleRate", "(I)V", "audioChannelCount", "getAudioChannelCount", "setAudioChannelCount", "getAudioId", "()Ljava/lang/String;", "setAudioId", "(Ljava/lang/String;)V", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "getBufferInfo", "()Landroid/media/MediaCodec$BufferInfo;", "setBufferInfo", "(Landroid/media/MediaCodec$BufferInfo;)V", "decodeFrame", "", "getDecodeFrame", "()Z", "setDecodeFrame", "(Z)V", "decodeStartTick", "getDecodeStartTick", "()J", "setDecodeStartTick", "(J)V", "decoder", "Landroid/media/MediaCodec;", "getDecoder", "()Landroid/media/MediaCodec;", "setDecoder", "(Landroid/media/MediaCodec;)V", "decoderStop", "getDecoderStop", "setDecoderStop", "getEndTimeMs", "setEndTimeMs", "getFrameDecodeCallback", "()Lkotlin/jvm/functions/Function2;", "setFrameDecodeCallback", "(Lkotlin/jvm/functions/Function2;)V", "getFrameDecodeEndCallback", "()Lkotlin/jvm/functions/Function0;", "setFrameDecodeEndCallback", "(Lkotlin/jvm/functions/Function0;)V", "mMediaFormat", "Landroid/media/MediaFormat;", "getMMediaFormat", "()Landroid/media/MediaFormat;", "setMMediaFormat", "(Landroid/media/MediaFormat;)V", "getMediaExtractorWrapper", "()Lcom/tencent/mm/media/extractor/MediaExtractorWrapper;", "setMediaExtractorWrapper", "(Lcom/tencent/mm/media/extractor/MediaExtractorWrapper;)V", "mime", "getMime", "setMime", "getStartTimeMs", "setStartTimeMs", "stopLock", "Ljava/lang/Object;", "getStopLock", "()Ljava/lang/Object;", "totalDecodeTime", "getTotalDecodeTime", "setTotalDecodeTime", "getChannelCount", "getSampleRate", "processDecodeBuffer", "byteBuffer", "Ljava/nio/ByteBuffer;", "startDecoder", "stopDecoder", "Companion", "plugin-mediaeditor_release"})
public abstract class a
{
  private static final int eTD = 2048;
  private static final int eTE = 4096;
  public static final a.a eTF = new a.a((byte)0);
  long bqO;
  String ckD;
  private String clY;
  long eTA;
  private m<? super byte[], ? super Long, y> eTB;
  private a.f.a.a<y> eTC;
  protected MediaCodec eTq;
  volatile boolean eTr;
  public int eTs;
  public int eTt;
  final Object eTu;
  long eTv;
  private long eTw;
  private boolean eTx;
  MediaCodec.BufferInfo eTy;
  com.tencent.mm.media.e.a eTz;
  MediaFormat mMediaFormat;

  public a(com.tencent.mm.media.e.a parama, String paramString, long paramLong1, long paramLong2, m<? super byte[], ? super Long, y> paramm, a.f.a.a<y> parama1)
  {
    this.eTz = parama;
    this.ckD = paramString;
    this.bqO = paramLong1;
    this.eTA = paramLong2;
    this.eTB = paramm;
    this.eTC = parama1;
    this.eTu = new Object();
    this.eTy = new MediaCodec.BufferInfo();
    this.clY = "";
    this.mMediaFormat = this.eTz.eWf;
    ab.i("MicroMsg.IAudioDecoder", "create MediaCodecAACDecoder, audioId:" + this.ckD + ", startTimeMs:" + this.bqO + ", endTimeMs:" + this.eTA + ", mediaFormat:" + this.mMediaFormat);
    if (this.mMediaFormat != null)
    {
      parama = this.mMediaFormat;
      if (parama != null)
        parama.setInteger("max-input-size", 16384);
      parama = this.mMediaFormat;
      if (parama == null)
        j.dWJ();
      this.eTs = parama.getInteger("channel-count");
      parama = this.mMediaFormat;
      if (parama == null)
        j.dWJ();
      this.eTt = parama.getInteger("sample-rate");
      parama = this.mMediaFormat;
      if (parama == null)
        j.dWJ();
      parama = parama.getString("mime");
      j.o(parama, "mMediaFormat!!.getString(MediaFormat.KEY_MIME)");
      this.clY = parama;
      parama = this.mMediaFormat;
      if ((parama != null) && (parama.containsKey("encoder-delay") == true))
      {
        parama = this.mMediaFormat;
        if (parama != null)
          parama.setInteger("encoder-delay", 0);
      }
      parama = this.mMediaFormat;
      if ((parama != null) && (parama.containsKey("encoder-padding") == true))
      {
        parama = this.mMediaFormat;
        if (parama != null)
          parama.setInteger("encoder-padding", 0);
      }
      this.eTz.UU();
      if (this.bqO >= 0L)
        this.eTz.seek(this.bqO * 1000L);
      parama = MediaCodec.createDecoderByType(this.clY);
      j.o(parama, "MediaCodec.createDecoderByType(mime)");
      this.eTq = parama;
      parama = this.eTq;
      if (parama == null)
        j.avw("decoder");
      parama.configure(this.mMediaFormat, null, null, 0);
    }
  }

  public final void UA()
  {
    ab.b("MicroMsg.IAudioDecoder", "stop decoder", new Object[0]);
    synchronized (this.eTu)
    {
      ab.i("MicroMsg.IAudioDecoder", "stopDecoder in lock");
      try
      {
        if (!this.eTr)
        {
          this.eTr = true;
          localObject2 = this.eTq;
          if (localObject2 == null)
            j.avw("decoder");
          ((MediaCodec)localObject2).stop();
          localObject2 = this.eTq;
          if (localObject2 == null)
            j.avw("decoder");
          ((MediaCodec)localObject2).release();
          this.eTC.invoke();
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ab.i("MicroMsg.IAudioDecoder", hashCode() + " total decode used " + this.eTw);
        }
        Object localObject2 = y.AUy;
        return;
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.IAudioDecoder", (Throwable)localException, "stopDecoder error", new Object[0]);
      }
    }
  }

  protected final MediaCodec Uy()
  {
    MediaCodec localMediaCodec = this.eTq;
    if (localMediaCodec == null)
      j.avw("decoder");
    return localMediaCodec;
  }

  public abstract void Uz();

  protected final void e(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    j.p(paramBufferInfo, "bufferInfo");
    if (paramByteBuffer != null)
    {
      paramByteBuffer.position(paramBufferInfo.offset);
      paramByteBuffer.limit(paramBufferInfo.offset + paramBufferInfo.size);
      byte[] arrayOfByte = new byte[paramByteBuffer.remaining()];
      paramByteBuffer.position(0);
      paramByteBuffer.get(arrayOfByte);
      int i;
      label186: int j;
      int k;
      if (arrayOfByte.length == 0)
      {
        i = 1;
        if (i != 0)
          return;
        ab.i("MicroMsg.IAudioDecoder", "decoder pcmData size:" + arrayOfByte.length + ", pts:" + paramBufferInfo.presentationTimeUs + ", audioId:" + this.ckD);
        long l = bo.az(this.eTv);
        this.eTw += l;
        ab.i("MicroMsg.IAudioDecoder", hashCode() + " decode frame cost " + l);
        this.eTx = true;
        if (this.eTs != 1)
          break label339;
        i = eTD;
        if (arrayOfByte.length <= i)
          break label354;
        j = arrayOfByte.length;
        k = 0;
        label200: if (j <= 0)
          return;
        if (j <= i)
          break label347;
      }
      label339: label347: for (int m = i; ; m = j)
      {
        paramByteBuffer = new byte[m];
        System.arraycopy(arrayOfByte, k, paramByteBuffer, 0, m);
        j -= m;
        k += m;
        ab.i("MicroMsg.IAudioDecoder", "split ret pcmData, leftSize:" + j + ", sizeOffset:" + k + ", maxBufferSize:" + i + ", copySize:" + m + ", data.size:" + paramByteBuffer.length);
        this.eTB.m(paramByteBuffer, Long.valueOf(paramBufferInfo.presentationTimeUs));
        break label200;
        i = 0;
        break;
        i = eTE;
        break label186;
      }
      label354: this.eTB.m(arrayOfByte, Long.valueOf(paramBufferInfo.presentationTimeUs));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.c.a
 * JD-Core Version:    0.6.2
 */