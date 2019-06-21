package com.tencent.mm.media.c;

import a.f.a.m;
import a.f.b.j;
import a.l;
import a.y;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.os.Looper;
import android.view.Surface;
import com.tencent.mm.plugin.sight.base.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/decoder/IMediaCodecTransDecoder;", "", "startTimeMs", "", "endTimeMs", "mediaExtractorWrapper", "Lcom/tencent/mm/media/extractor/MediaExtractorWrapper;", "decodeSurface", "Landroid/view/Surface;", "(JJLcom/tencent/mm/media/extractor/MediaExtractorWrapper;Landroid/view/Surface;)V", "TAG", "", "getDecodeSurface", "()Landroid/view/Surface;", "decoder", "Landroid/media/MediaCodec;", "getDecoder", "()Landroid/media/MediaCodec;", "setDecoder", "(Landroid/media/MediaCodec;)V", "decoderLock", "Ljava/lang/Object;", "getDecoderLock", "()Ljava/lang/Object;", "getEndTimeMs", "()J", "setEndTimeMs", "(J)V", "frameCount", "", "frameDropInterval", "frameDuration", "", "getFrameDuration", "()F", "setFrameDuration", "(F)V", "isFinished", "", "()Z", "setFinished", "(Z)V", "isPause", "setPause", "getMediaExtractorWrapper", "()Lcom/tencent/mm/media/extractor/MediaExtractorWrapper;", "mediaFormat", "Landroid/media/MediaFormat;", "getMediaFormat", "()Landroid/media/MediaFormat;", "setMediaFormat", "(Landroid/media/MediaFormat;)V", "onDecodeDataCallback", "Lkotlin/Function2;", "Ljava/nio/ByteBuffer;", "Lkotlin/ParameterName;", "name", "decodeData", "pts", "", "getOnDecodeDataCallback", "()Lkotlin/jvm/functions/Function2;", "setOnDecodeDataCallback", "(Lkotlin/jvm/functions/Function2;)V", "onDecodeEnd", "Lkotlin/Function0;", "getOnDecodeEnd", "()Lkotlin/jvm/functions/Function0;", "setOnDecodeEnd", "(Lkotlin/jvm/functions/Function0;)V", "onFormatChanged", "Lkotlin/Function1;", "getOnFormatChanged", "()Lkotlin/jvm/functions/Function1;", "setOnFormatChanged", "(Lkotlin/jvm/functions/Function1;)V", "pauseSemaphore", "Ljava/util/concurrent/Semaphore;", "getStartTimeMs", "setStartTimeMs", "useInRemuxer", "getUseInRemuxer", "setUseInRemuxer", "videoFps", "getVideoFps", "()I", "setVideoFps", "(I)V", "getFrameCount", "getFrameDropInterval", "getVideoFormat", "isDecoderPause", "onDecode", "callback", "processDecodeOutputBuffer", "byteBuffer", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "releaseDecoder", "setFrameDropInterval", "interval", "setPauseDecoder", "pause", "startDecode", "useInRemux", "plugin-mediaeditor_release"})
public abstract class b
{
  public final String TAG;
  long bqO;
  private volatile boolean cAY;
  long eTA;
  public m<? super ByteBuffer, ? super Long, y> eTG;
  public a.f.a.a<y> eTH;
  public a.f.a.b<? super MediaFormat, y> eTI;
  public int eTJ;
  private final Semaphore eTK;
  final Object eTL;
  boolean eTM;
  private float eTN;
  public boolean eTO;
  final Surface eTP;
  protected MediaCodec eTq;
  final com.tencent.mm.media.e.a eTz;
  private int frameCount;
  public MediaFormat mediaFormat;
  private int videoFps;

  public b(long paramLong1, long paramLong2, com.tencent.mm.media.e.a parama, Surface paramSurface)
  {
    this.bqO = paramLong1;
    this.eTA = paramLong2;
    this.eTz = parama;
    this.eTP = paramSurface;
    this.TAG = "MicroMsg.IMediaCodecTransDecoder";
    this.eTK = new Semaphore(1);
    this.eTL = new Object();
    ab.i(this.TAG, "create IMediaCodecTransDecoder, startTimeMs:" + this.bqO + ", endTimeMs:" + this.eTA);
    this.eTz.UT();
    if (this.bqO >= 0L)
      this.eTz.seek(this.bqO * 1000L);
  }

  public abstract void UB();

  protected final MediaCodec Uy()
  {
    MediaCodec localMediaCodec = this.eTq;
    if (localMediaCodec == null)
      j.avw("decoder");
    return localMediaCodec;
  }

  protected final void a(MediaCodec.BufferInfo paramBufferInfo)
  {
    int i = 0;
    j.p(paramBufferInfo, "bufferInfo");
    Object localObject;
    if (this.videoFps <= 0)
    {
      MediaFormat localMediaFormat = this.mediaFormat;
      localObject = localMediaFormat;
      if (localMediaFormat != null)
      {
        localObject = localMediaFormat;
        if (!localMediaFormat.containsKey("frame-rate"))
          localObject = this.eTz.eWe;
      }
      if ((localObject == null) || (((MediaFormat)localObject).containsKey("frame-rate")))
        break label325;
      localObject = d.WR(this.eTz.filePath);
      if (localObject == null)
        break label319;
      j = ((com.tencent.mm.plugin.sight.base.a)localObject).eTk;
      this.videoFps = j;
      if (this.videoFps > 0)
        this.eTN = (1000.0F / this.videoFps);
    }
    if (this.videoFps <= 0);
    for (int j = i; ; j = 1)
    {
      this.frameCount += 1;
      long l = ()(((float)this.bqO + this.frameCount * this.eTN) * 1000.0F);
      ab.i(this.TAG, "processDecodeOutputBuffer, byteBuffer: " + null + ", pts: " + paramBufferInfo.presentationTimeUs + ", calcPts:" + l + ", frameDuration:" + this.eTN + ", frameCount:" + this.frameCount + ", startTimeMs:" + this.bqO + ", size: " + paramBufferInfo.size + ", isMain:" + j.j(Looper.myLooper(), Looper.getMainLooper()));
      ab.d(this.TAG, "jump one frame: " + this.frameCount);
      if ((this.eTJ > 1) && (this.frameCount % this.eTJ == 0));
      while (true)
      {
        return;
        label319: j = 0;
        break;
        label325: if (localObject != null);
        for (j = ((MediaFormat)localObject).getInteger("frame-rate"); ; j = 0)
        {
          this.videoFps = j;
          break;
        }
        if (j != 0)
        {
          paramBufferInfo = this.eTG;
          if (paramBufferInfo != null)
            paramBufferInfo.m(null, Long.valueOf(l));
        }
        else
        {
          localObject = this.eTG;
          if (localObject != null)
            ((m)localObject).m(null, Long.valueOf(paramBufferInfo.presentationTimeUs));
        }
      }
    }
  }

  protected final void a(MediaCodec paramMediaCodec)
  {
    j.p(paramMediaCodec, "<set-?>");
    this.eTq = paramMediaCodec;
  }

  public final void cp(boolean paramBoolean)
  {
    long l = bo.yz();
    this.cAY = paramBoolean;
    ab.d(this.TAG, "setPauseDecoder:" + paramBoolean + ", remain:" + this.eTK.availablePermits() + ", thread:" + Thread.currentThread() + ' ' + l);
    if (paramBoolean)
    {
      ab.d(this.TAG, "try acquire, thread:" + Thread.currentThread() + ' ' + l);
      this.eTK.acquire();
    }
    while (true)
    {
      ab.d(this.TAG, "after setPauseDecoder:" + paramBoolean + ", remain:" + this.eTK.availablePermits() + ", thread:" + Thread.currentThread() + ' ' + l);
      return;
      ab.d(this.TAG, "release, thread:" + Thread.currentThread() + ' ' + l);
      this.eTK.release();
    }
  }

  public void sI()
  {
    ab.i(this.TAG, "releaseDecoder");
    try
    {
      synchronized (this.eTL)
      {
        Object localObject2 = this.eTq;
        if (localObject2 == null)
          j.avw("decoder");
        ((MediaCodec)localObject2).stop();
        localObject2 = this.eTq;
        if (localObject2 == null)
          j.avw("decoder");
        ((MediaCodec)localObject2).release();
        this.eTM = true;
        label58: localObject2 = y.AUy;
        return;
      }
    }
    catch (Exception localException)
    {
      break label58;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.c.b
 * JD-Core Version:    0.6.2
 */