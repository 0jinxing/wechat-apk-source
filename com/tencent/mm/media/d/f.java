package com.tencent.mm.media.d;

import a.f.b.j;
import a.l;
import a.y;
import android.media.MediaCodec;
import android.media.MediaCodec.Callback;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/encoder/MediaCodecTransEncoderAsync;", "Lcom/tencent/mm/media/encoder/IMediaCodecTransEncoder;", "videoCodecConfig", "Lcom/tencent/mm/media/config/VideoCodecConfig;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lcom/tencent/mm/media/config/VideoCodecConfig;Lkotlin/jvm/functions/Function1;)V", "TAG", "", "codecCallback", "com/tencent/mm/media/encoder/MediaCodecTransEncoderAsync$codecCallback$1", "Lcom/tencent/mm/media/encoder/MediaCodecTransEncoderAsync$codecCallback$1;", "encodeHandler", "Landroid/os/Handler;", "encodeThread", "Landroid/os/HandlerThread;", "encoder", "Landroid/media/MediaCodec;", "isEnd", "", "startTime", "", "encodeFrame", "pts", "finishEncode", "getRecordTimes", "release", "plugin-mediaeditor_release"})
public final class f extends b
{
  final String TAG;
  HandlerThread eSP;
  volatile boolean eTf;
  private Handler eVO;
  private f.a eVP;
  MediaCodec eVq;
  private long startTime;

  public f(c paramc, a.f.a.b<? super b, y> paramb)
  {
    super(paramc, paramb);
    AppMethodBeat.i(12963);
    this.TAG = "MicroMsg.MediaCodecTransEncoderAsync";
    Object localObject = MediaCodec.createByCodecName(paramc.name);
    j.o(localObject, "MediaCodec.createByCodec…me(videoCodecConfig.name)");
    this.eVq = ((MediaCodec)localObject);
    localObject = com.tencent.mm.sdk.g.d.anM("MediaCodecTransEncoder_encodeThread");
    j.o(localObject, "ThreadPool.newFreeHandle…ansEncoder_encodeThread\")");
    this.eSP = ((HandlerThread)localObject);
    this.eVP = new f.a(this);
    this.eVq.configure(paramc.Ux(), null, null, 1);
    if (com.tencent.mm.compatible.util.d.iW(23))
    {
      this.eSP.start();
      this.eVO = new Handler(this.eSP.getLooper());
      localObject = this.eVq;
      MediaCodec.Callback localCallback = (MediaCodec.Callback)this.eVP;
      paramc = this.eVO;
      if (paramc == null)
        j.avw("encodeHandler");
      ((MediaCodec)localObject).setCallback(localCallback, paramc);
    }
    while (true)
    {
      paramc = this.eVq.createInputSurface();
      j.o(paramc, "encoder.createInputSurface()");
      e(paramc);
      this.eVq.start();
      paramb.am((b)this);
      AppMethodBeat.o(12963);
      return;
      this.eVq.setCallback((MediaCodec.Callback)this.eVP);
    }
  }

  public final void UO()
  {
    AppMethodBeat.i(12960);
    Handler localHandler = this.eVO;
    if (localHandler == null)
      j.avw("encodeHandler");
    localHandler.post((Runnable)new f.b(this));
    AppMethodBeat.o(12960);
  }

  public final void UP()
  {
    AppMethodBeat.i(12959);
    if (0L == this.startTime)
      this.startTime = bo.yz();
    AppMethodBeat.o(12959);
  }

  public final long UQ()
  {
    AppMethodBeat.i(12962);
    long l1 = bo.yz();
    long l2 = this.startTime;
    AppMethodBeat.o(12962);
    return l1 - l2;
  }

  public final void release()
  {
    AppMethodBeat.i(12961);
    ab.i(this.TAG, "release");
    Handler localHandler = this.eVO;
    if (localHandler == null)
      j.avw("encodeHandler");
    localHandler.post((Runnable)new f.c(this));
    AppMethodBeat.o(12961);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.d.f
 * JD-Core Version:    0.6.2
 */