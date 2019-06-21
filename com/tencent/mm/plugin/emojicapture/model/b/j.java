package com.tencent.mm.plugin.emojicapture.model.b;

import a.f.a.a;
import a.k.m;
import a.y;
import android.media.MediaCodec;
import android.media.MediaCodec.Callback;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiMixVideoDecoderAsync;", "Lcom/tencent/mm/plugin/emojicapture/model/mix/IEmojiMixDecoder;", "videoPath", "", "videoDuration", "", "surface", "Landroid/view/Surface;", "(Ljava/lang/String;ILandroid/view/Surface;)V", "TAG", "codecCallback", "com/tencent/mm/plugin/emojicapture/model/mix/EmojiMixVideoDecoderAsync$codecCallback$1", "Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiMixVideoDecoderAsync$codecCallback$1;", "decoder", "Landroid/media/MediaCodec;", "decoderThread", "Landroid/os/HandlerThread;", "kotlin.jvm.PlatformType", "extractor", "Landroid/media/MediaExtractor;", "inputEos", "", "inputSampleTime", "", "mediaFormat", "Landroid/media/MediaFormat;", "mime", "pauseDecoderLock", "Ljava/lang/Object;", "getPauseDecoderLock", "()Ljava/lang/Object;", "init", "processDecodeBuffer", "", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "release", "sendDecoderEos", "setPauseDecode", "pause", "startDecode", "plugin-emojicapture_release"})
public final class j extends l
{
  final String TAG;
  private final Surface aOO;
  MediaExtractor clX;
  private String clY;
  MediaCodec eTq;
  HandlerThread eUd;
  private final int eWK;
  final Object liQ;
  boolean liS;
  long liT;
  private final j.a liU;
  MediaFormat mediaFormat;
  private final String videoPath;

  public j(String paramString, int paramInt, Surface paramSurface)
  {
    AppMethodBeat.i(2696);
    this.videoPath = paramString;
    this.eWK = paramInt;
    this.aOO = paramSurface;
    this.TAG = "MicroMsg.EmojiMixVideoDecoderAsync";
    this.clX = new MediaExtractor();
    this.clY = "";
    this.eUd = com.tencent.mm.sdk.g.d.anM("EmojiMixVideoDecoderAsync_decodeThread");
    this.liQ = new Object();
    this.liU = new j.a(this);
    try
    {
      paramSurface = this.TAG;
      paramString = new java/lang/StringBuilder;
      paramString.<init>("create decoder with path: ");
      ab.i(paramSurface, this.videoPath);
      this.clX.setDataSource(this.videoPath);
      int i = this.clX.getTrackCount();
      for (paramInt = 0; paramInt < i; paramInt++)
      {
        paramString = this.clX.getTrackFormat(paramInt);
        paramSurface = paramString.getString("mime");
        a.f.b.j.o(paramSurface, "trackFormat.getString(MediaFormat.KEY_MIME)");
        if (m.d((CharSequence)paramSurface, (CharSequence)"video") == true)
        {
          paramSurface = paramString.getString("mime");
          a.f.b.j.o(paramSurface, "trackFormat.getString(MediaFormat.KEY_MIME)");
          this.clY = paramSurface;
          this.mediaFormat = paramString;
          paramSurface = this.TAG;
          paramString = new java/lang/StringBuilder;
          paramString.<init>("find video format ");
          ab.i(paramSurface, this.mediaFormat + ", mime: " + this.clY);
          this.clX.selectTrack(paramInt);
          AppMethodBeat.o(2696);
          return;
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace(this.TAG, (Throwable)paramString, "init create extractor error", new Object[0]);
        AppMethodBeat.o(2696);
      }
    }
  }

  public final void UB()
  {
    AppMethodBeat.i(2694);
    Object localObject;
    if (this.eTq == null)
    {
      localObject = this.ljm;
      if (localObject != null)
      {
        ((a)localObject).invoke();
        AppMethodBeat.o(2694);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(2694);
      continue;
      localObject = this.eTq;
      if (localObject != null)
      {
        ((MediaCodec)localObject).start();
        AppMethodBeat.o(2694);
      }
      else
      {
        AppMethodBeat.o(2694);
      }
    }
  }

  public final void bnH()
  {
    AppMethodBeat.i(2695);
    synchronized (this.liQ)
    {
      try
      {
        this.liQ.notifyAll();
        y localy = y.AUy;
        AppMethodBeat.o(2695);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace(this.TAG, (Throwable)localException, "", new Object[0]);
      }
    }
  }

  public final int init()
  {
    AppMethodBeat.i(2693);
    if ((this.mediaFormat != null) && (!bo.isNullOrNil(this.clY)));
    while (true)
    {
      try
      {
        this.eTq = MediaCodec.createDecoderByType(this.clY);
        Object localObject1 = this.eTq;
        if (localObject1 != null)
          ((MediaCodec)localObject1).configure(this.mediaFormat, this.aOO, null, 0);
        if (com.tencent.mm.compatible.util.d.iW(23))
        {
          this.eUd.start();
          localObject1 = new android/os/Handler;
          Object localObject2 = this.eUd;
          a.f.b.j.o(localObject2, "decoderThread");
          ((Handler)localObject1).<init>(((HandlerThread)localObject2).getLooper());
          localObject2 = this.eTq;
          if (localObject2 != null)
            ((MediaCodec)localObject2).setCallback((MediaCodec.Callback)this.liU, (Handler)localObject1);
          AppMethodBeat.o(2693);
          i = 0;
          return i;
        }
        localObject1 = this.eTq;
        if (localObject1 == null)
          continue;
        ((MediaCodec)localObject1).setCallback((MediaCodec.Callback)this.liU);
        continue;
      }
      catch (Exception localException)
      {
        ab.e(this.TAG, "init decoder error " + localException.getMessage());
        AppMethodBeat.o(2693);
        i = -1;
        continue;
      }
      AppMethodBeat.o(2693);
      int i = -1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.b.j
 * JD-Core Version:    0.6.2
 */