package com.tencent.mm.media.d;

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

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/encoder/IAudioEncoder;", "", "mediaFormat", "Landroid/media/MediaFormat;", "frameEncodeCallback", "Lkotlin/Function2;", "Ljava/nio/ByteBuffer;", "Lkotlin/ParameterName;", "name", "data", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "", "frameEncodeEndCallback", "Lkotlin/Function0;", "(Landroid/media/MediaFormat;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "dstMediaFormat", "getDstMediaFormat", "()Landroid/media/MediaFormat;", "setDstMediaFormat", "(Landroid/media/MediaFormat;)V", "encodeStartTick", "", "getEncodeStartTick", "()J", "setEncodeStartTick", "(J)V", "encoder", "Landroid/media/MediaCodec;", "getEncoder", "()Landroid/media/MediaCodec;", "setEncoder", "(Landroid/media/MediaCodec;)V", "getFrameEncodeCallback", "()Lkotlin/jvm/functions/Function2;", "setFrameEncodeCallback", "(Lkotlin/jvm/functions/Function2;)V", "getFrameEncodeEndCallback", "()Lkotlin/jvm/functions/Function0;", "setFrameEncodeEndCallback", "(Lkotlin/jvm/functions/Function0;)V", "isEnd", "", "()Z", "setEnd", "(Z)V", "mMimeType", "", "getMMimeType", "()Ljava/lang/String;", "setMMimeType", "(Ljava/lang/String;)V", "stopLock", "Ljava/lang/Object;", "getStopLock", "()Ljava/lang/Object;", "totalEncodeTime", "getTotalEncodeTime", "setTotalEncodeTime", "finishEncode", "isIgnoreCodecConfig", "processEncodeBuffer", "buffer", "releaseEncoder", "startEncoder", "", "pts", "isLast", "stopEncoder", "Companion", "plugin-mediaeditor_release"})
public abstract class a
{
  public static final a.a eVw = new a.a((byte)0);
  volatile boolean eTf;
  final Object eTu;
  MediaCodec eVq;
  MediaFormat eVr;
  long eVs;
  private long eVt;
  private m<? super ByteBuffer, ? super MediaCodec.BufferInfo, y> eVu;
  private a.f.a.a<y> eVv;
  private String mMimeType;

  public a(MediaFormat paramMediaFormat, m<? super ByteBuffer, ? super MediaCodec.BufferInfo, y> paramm, a.f.a.a<y> parama)
  {
    this.eVu = paramm;
    this.eVv = parama;
    this.eTu = new Object();
    ab.i("MicroMsg.IAudioEncoder", "init audio encoder");
    this.mMimeType = paramMediaFormat.getString("mime");
    try
    {
      paramm = new android/media/MediaFormat;
      paramm.<init>();
      this.eVr = paramm;
      this.eVr.setString("mime", "audio/mp4a-latm");
      this.eVr.setInteger("aac-profile", 2);
      this.eVr.setInteger("sample-rate", 44100);
      this.eVr.setInteger("channel-count", 1);
      this.eVr.setInteger("bitrate", paramMediaFormat.getInteger("bitrate"));
      this.eVr.setInteger("max-input-size", 2048);
      paramMediaFormat = MediaCodec.createEncoderByType("audio/mp4a-latm");
      j.o(paramMediaFormat, "MediaCodec.createEncoderByType(AAC_MIME_TYPE)");
      this.eVq = paramMediaFormat;
      this.eVq.configure(this.eVr, null, null, 1);
      return;
    }
    catch (Exception paramMediaFormat)
    {
    }
    throw ((Throwable)new IllegalStateException("init encoder error"));
  }

  public final void UO()
  {
    releaseEncoder();
  }

  public abstract void b(byte[] paramArrayOfByte, long paramLong, boolean paramBoolean);

  protected final void c(MediaFormat paramMediaFormat)
  {
    j.p(paramMediaFormat, "<set-?>");
    this.eVr = paramMediaFormat;
  }

  public final void f(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    j.p(paramBufferInfo, "bufferInfo");
    if (paramByteBuffer == null)
      ab.e("MicroMsg.IAudioEncoder", "ERROR, retrieve encoderOutputBuffer is null!!");
    while (true)
    {
      return;
      if (paramBufferInfo.size > 0)
      {
        ab.i("MicroMsg.IAudioEncoder", "encoder output buffer:" + paramBufferInfo.size + ", pts:" + paramBufferInfo.presentationTimeUs);
        paramByteBuffer.position(paramBufferInfo.offset);
        paramByteBuffer.limit(paramBufferInfo.offset + paramBufferInfo.size);
        long l = bo.az(this.eVs);
        this.eVt += l;
        ab.i("MicroMsg.IAudioEncoder", hashCode() + " encode frame used " + l);
        this.eVu.m(paramByteBuffer, paramBufferInfo);
      }
    }
  }

  protected final void releaseEncoder()
  {
    try
    {
      synchronized (this.eTu)
      {
        if (!this.eTf)
        {
          this.eTf = true;
          ab.i("MicroMsg.IAudioEncoder", "releaseEncoder");
          this.eVq.stop();
          this.eVq.release();
          this.eVv.invoke();
        }
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("total encode used ");
        ab.i("MicroMsg.IAudioEncoder", this.eVt);
        localObject3 = y.AUy;
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.IAudioEncoder", "releaseEncoder error: %s", new Object[] { localException.getMessage() });
    }
    finally
    {
    }
  }

  public final void stopEncoder()
  {
    releaseEncoder();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.d.a
 * JD-Core Version:    0.6.2
 */