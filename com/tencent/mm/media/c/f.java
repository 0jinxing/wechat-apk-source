package com.tencent.mm.media.c;

import a.f.b.j;
import a.l;
import a.y;
import android.media.MediaCodec;
import android.media.MediaCodec.Callback;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.e.a;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/decoder/MediaCodecTransDecoderAsync;", "Lcom/tencent/mm/media/decoder/IMediaCodecTransDecoder;", "startTimeMs", "", "endTimeMs", "mediaExtractorWrapper", "Lcom/tencent/mm/media/extractor/MediaExtractorWrapper;", "decodeSurface", "Landroid/view/Surface;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(JJLcom/tencent/mm/media/extractor/MediaExtractorWrapper;Landroid/view/Surface;Lkotlin/jvm/functions/Function1;)V", "TAG", "", "codecCallback", "com/tencent/mm/media/decoder/MediaCodecTransDecoderAsync$codecCallback$1", "Lcom/tencent/mm/media/decoder/MediaCodecTransDecoderAsync$codecCallback$1;", "decoderThread", "Landroid/os/HandlerThread;", "kotlin.jvm.PlatformType", "isInvokeDecodeEnd", "", "sawInputEOS", "onDecodeEnd", "releaseDecoder", "startDecode", "plugin-mediaeditor_release"})
public final class f extends b
{
  final String TAG;
  volatile boolean eUb;
  private HandlerThread eUd;
  private boolean eUe;
  private final f.a eUf;

  public f(long paramLong1, long paramLong2, a parama, Surface paramSurface, a.f.a.b<? super b, y> paramb)
  {
    super(paramLong1, paramLong2, parama, paramSurface);
    AppMethodBeat.i(12873);
    this.TAG = "MicroMsg.MediaCodecTransDecoderAsync";
    this.eUd = com.tencent.mm.sdk.g.d.anM("MediaCodecTransDecoderAsync_decodeThread");
    this.eUf = new f.a(this, paramSurface, parama);
    try
    {
      this.mediaFormat = parama.eWe;
      parama = MediaCodec.createDecoderByType(parama.UV());
      j.o(parama, "MediaCodec.createDecoder…orWrapper.getVideoMIME())");
      a(parama);
      Uy().configure(this.mediaFormat, paramSurface, null, 0);
      if (com.tencent.mm.compatible.util.d.iW(23))
      {
        this.eUd.start();
        paramSurface = new android/os/Handler;
        parama = this.eUd;
        j.o(parama, "decoderThread");
        paramSurface.<init>(parama.getLooper());
        Uy().setCallback((MediaCodec.Callback)this.eUf, paramSurface);
      }
      while (true)
      {
        paramb.am(this);
        AppMethodBeat.o(12873);
        return;
        Uy().setCallback((MediaCodec.Callback)this.eUf);
      }
    }
    catch (Exception parama)
    {
      ab.printErrStackTrace(this.TAG, (Throwable)parama, "create decoder error:" + parama.getMessage(), new Object[0]);
      parama = (Throwable)new IllegalStateException("init decoder error");
      AppMethodBeat.o(12873);
    }
    throw parama;
  }

  public final void UB()
  {
    AppMethodBeat.i(12871);
    try
    {
      Uy().start();
      AppMethodBeat.o(12871);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace(this.TAG, (Throwable)localException, "startDecode error", new Object[0]);
        AppMethodBeat.o(12871);
      }
    }
  }

  public final void sI()
  {
    AppMethodBeat.i(12872);
    super.sI();
    try
    {
      this.eUd.quit();
      AppMethodBeat.o(12872);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace(this.TAG, (Throwable)localException, "", new Object[0]);
        AppMethodBeat.o(12872);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.c.f
 * JD-Core Version:    0.6.2
 */