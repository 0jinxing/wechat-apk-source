package com.tencent.mm.media.a;

import a.f.a.m;
import a.f.b.k;
import a.l;
import a.y;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.loader.j.b;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ak.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/codec/MediaCodecAACCodec;", "Lcom/tencent/mm/media/codec/IAudioCodec;", "bufId", "", "mixType", "sampleRate", "channelCount", "onFrameEncode", "Lkotlin/Function2;", "Ljava/nio/ByteBuffer;", "Landroid/media/MediaCodec$BufferInfo;", "", "(IIIILkotlin/jvm/functions/Function2;)V", "TAG", "", "cacheAACFilePath", "decodeBackgroundFrameCount", "decodeMusicFrameCount", "encodeFrameCount", "encodeHandler", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "encodeThread", "Landroid/os/HandlerThread;", "isBackgroundDecodeEnd", "", "isDecodeEnd", "isMusicDecodeEnd", "mAudioEncoder", "Lcom/tencent/mm/media/encoder/IAudioEncoder;", "mAudioMixCodec", "Lcom/tencent/mm/media/mix/AudioMixCodec;", "mBackgroundDecoder", "Lcom/tencent/mm/media/decoder/IAudioDecoder;", "mBackgroundDecoderRunnable", "Ljava/lang/Runnable;", "mMediaFormat", "Landroid/media/MediaFormat;", "mMusicDecoder", "mMusicDecoderRunnable", "mixCount", "mixFinishCallback", "Lkotlin/Function0;", "mixStartTime", "", "useAsync", "checkPostEncoder", "data", "", "pts", "isEnd", "initDecoder", "background", "Lcom/tencent/mm/media/extractor/MediaExtractorWrapper;", "music", "startTime", "endTime", "initEncoder", "mediaFormat", "onAudioFrameEncode", "bufferInfo", "onAudioFrameEncodeEnd", "onBackgroundDecodeEnd", "onBackgroundFrameDecodeEnd", "pcmData", "onDecodeEnd", "isBackground", "onEncodeEnd", "onFrameMix", "onFrameMixEnd", "onMusicDecodeEnd", "onMusicFrameDecodeEnd", "startCodec", "stopCodec", "EncoderData", "plugin-mediaeditor_release"})
public final class a
{
  public final String TAG;
  public final int aOn;
  private int cmI;
  public com.tencent.mm.media.c.a eSI;
  public com.tencent.mm.media.c.a eSJ;
  public com.tencent.mm.media.d.a eSK;
  public com.tencent.mm.media.f.a eSL;
  private volatile boolean eSM;
  private boolean eSN;
  private boolean eSO;
  public HandlerThread eSP;
  private ak eSQ;
  public a.f.a.a<y> eSR;
  private final String eSS;
  private int eST;
  private int eSU;
  private int eSV;
  public Runnable eSW;
  public Runnable eSX;
  public boolean eSY;
  public long eSZ;
  private final int eTa;
  public int eTb;
  private final m<ByteBuffer, MediaCodec.BufferInfo, y> eTc;
  public MediaFormat mMediaFormat;
  public final int sampleRate;

  public a(int paramInt1, int paramInt2, int paramInt3, m<? super ByteBuffer, ? super MediaCodec.BufferInfo, y> paramm)
  {
    AppMethodBeat.i(12837);
    this.eTa = paramInt1;
    this.eTb = paramInt2;
    this.sampleRate = paramInt3;
    this.aOn = 1;
    this.eTc = paramm;
    this.TAG = "MicroMsg.MediaCodecAACCodec";
    paramm = d.anM("MediaCodecAACCodec_EncodeThread");
    a.f.b.j.o(paramm, "ThreadPool.newFreeHandle…ecAACCodec_EncodeThread\")");
    this.eSP = paramm;
    this.eSS = (b.eSn + "cache.pcm");
    this.eSW = ((Runnable)new a.q(this));
    this.eSX = ((Runnable)new a.r(this));
    ab.i(this.TAG, "init MediaCodecAACCodec, sampleRate:" + this.sampleRate + ", channelCount:" + this.aOn);
    this.eSL = new com.tencent.mm.media.f.a(this.sampleRate, this.aOn, a.a.j.listOf(new Integer[] { Integer.valueOf(3), Integer.valueOf(1) }).contains(Integer.valueOf(this.eTb)), a.a.j.listOf(new Integer[] { Integer.valueOf(2), Integer.valueOf(3) }).contains(Integer.valueOf(this.eTb)), (a.f.a.a)new a.1(this), (m)new a.2(this));
    AppMethodBeat.o(12837);
  }

  private final void a(byte[] paramArrayOfByte, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(12835);
    if (this.eSQ == null)
    {
      this.eSP.start();
      this.eSQ = new ak(this.eSP.getLooper(), (ak.a)new a.b(this));
    }
    Object localObject = this.eSQ;
    if (localObject != null)
    {
      localObject = ((ak)localObject).obtainMessage();
      if (localObject != null)
        ((Message)localObject).what = 1024;
      paramArrayOfByte = Arrays.copyOf(paramArrayOfByte, paramArrayOfByte.length);
      a.f.b.j.o(paramArrayOfByte, "Arrays.copyOf(data, data.size)");
      paramArrayOfByte = new a.a(paramArrayOfByte, paramLong, paramBoolean);
      if (localObject != null)
        ((Message)localObject).obj = paramArrayOfByte;
      paramArrayOfByte = this.eSQ;
      if (paramArrayOfByte == null)
        break label146;
      paramArrayOfByte.sendMessage((Message)localObject);
      AppMethodBeat.o(12835);
    }
    while (true)
    {
      return;
      localObject = null;
      break;
      label146: AppMethodBeat.o(12835);
    }
  }

  private final void co(boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(12836);
        String str = this.TAG;
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("onDecodeEnd, isDecodeEnd:");
        ab.c(str, this.eSM + ", isBackground:" + paramBoolean, new Object[0]);
        if (paramBoolean)
        {
          this.eSO = true;
          if ((this.eTb == 3) && (this.eSN) && (this.eSO))
          {
            if (this.eSM)
              break label208;
            this.eSM = true;
            localObject1 = this.eSI;
            if (localObject1 != null)
              ((com.tencent.mm.media.c.a)localObject1).UA();
            localObject1 = this.eSJ;
            if (localObject1 != null)
              ((com.tencent.mm.media.c.a)localObject1).UA();
            long l = bo.yz();
            a(new byte[0], l, true);
            AppMethodBeat.o(12836);
          }
        }
        else
        {
          this.eSN = true;
          continue;
        }
      }
      finally
      {
      }
      if ((this.eTb == 2) && (this.eSN) && (!this.eSM))
      {
        this.eSM = true;
        com.tencent.mm.media.c.a locala = this.eSI;
        if (locala != null)
        {
          locala.UA();
          AppMethodBeat.o(12836);
        }
      }
      else
      {
        label208: AppMethodBeat.o(12836);
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  public static final class c extends k
    implements a.f.a.a<y>
  {
    public c(a parama)
    {
      super();
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  public static final class s extends k
    implements a.f.a.a<y>
  {
    public s(a parama)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.a.a
 * JD-Core Version:    0.6.2
 */