package com.tencent.mm.media.d;

import a.f.a.a;
import a.f.a.m;
import a.f.b.j;
import a.l;
import a.y;
import android.media.MediaCodec.BufferInfo;
import android.os.Looper;
import android.view.Surface;
import com.tencent.mm.media.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.nio.ByteBuffer;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/encoder/IMediaCodecTransEncoder;", "", "videoCodecConfig", "Lcom/tencent/mm/media/config/VideoCodecConfig;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lcom/tencent/mm/media/config/VideoCodecConfig;Lkotlin/jvm/functions/Function1;)V", "TAG", "", "codecSurface", "Landroid/view/Surface;", "getCodecSurface", "()Landroid/view/Surface;", "setCodecSurface", "(Landroid/view/Surface;)V", "frameNum", "", "getFrameNum", "()I", "setFrameNum", "(I)V", "getInit", "()Lkotlin/jvm/functions/Function1;", "setInit", "(Lkotlin/jvm/functions/Function1;)V", "onEncodeDataCallback", "Lkotlin/Function2;", "Ljava/nio/ByteBuffer;", "Lkotlin/ParameterName;", "name", "data", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "getOnEncodeDataCallback", "()Lkotlin/jvm/functions/Function2;", "setOnEncodeDataCallback", "(Lkotlin/jvm/functions/Function2;)V", "onEncodeEnd", "Lkotlin/Function0;", "getOnEncodeEnd", "()Lkotlin/jvm/functions/Function0;", "setOnEncodeEnd", "(Lkotlin/jvm/functions/Function0;)V", "useInRemuxer", "", "getUseInRemuxer", "()Z", "setUseInRemuxer", "(Z)V", "getVideoCodecConfig", "()Lcom/tencent/mm/media/config/VideoCodecConfig;", "setVideoCodecConfig", "(Lcom/tencent/mm/media/config/VideoCodecConfig;)V", "encodeFrame", "pts", "", "finishEncode", "getFrameCount", "getInputSurface", "getRecordTimes", "onEncode", "callback", "processEncodeBuffer", "buffer", "release", "useInRemux", "plugin-mediaeditor_release"})
public abstract class b
{
  private final String TAG;
  public boolean eTO;
  private c eVA;
  private a.f.a.b<? super b, y> eVB;
  protected Surface eVx;
  public m<? super ByteBuffer, ? super MediaCodec.BufferInfo, y> eVy;
  public a<y> eVz;
  public int frameNum;

  public b(c paramc, a.f.a.b<? super b, y> paramb)
  {
    this.eVA = paramc;
    this.eVB = paramb;
    this.TAG = "MicroMsg.IMediaCodecTransEncoder";
  }

  public abstract void UO();

  public abstract void UP();

  public abstract long UQ();

  protected final void e(Surface paramSurface)
  {
    j.p(paramSurface, "<set-?>");
    this.eVx = paramSurface;
  }

  protected final void f(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    j.p(paramByteBuffer, "buffer");
    j.p(paramBufferInfo, "bufferInfo");
    ab.i(this.TAG, "processEncodeBuffer, buffer " + paramByteBuffer + ", pts: " + paramBufferInfo.presentationTimeUs + ", size: " + paramBufferInfo.size + ", isMain: " + j.j(Looper.getMainLooper(), Looper.myLooper()));
    m localm = this.eVy;
    if (localm != null)
      localm.m(paramByteBuffer, paramBufferInfo);
    this.frameNum += 1;
  }

  public final Surface getInputSurface()
  {
    Surface localSurface = this.eVx;
    if (localSurface == null)
      j.avw("codecSurface");
    return localSurface;
  }

  public abstract void release();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.d.b
 * JD-Core Version:    0.6.2
 */