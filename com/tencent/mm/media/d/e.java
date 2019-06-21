package com.tencent.mm.media.d;

import a.f.a.a;
import a.f.b.j;
import a.l;
import a.y;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/encoder/MediaCodecTransEncoder;", "Lcom/tencent/mm/media/encoder/IMediaCodecTransEncoder;", "videoCodecConfig", "Lcom/tencent/mm/media/config/VideoCodecConfig;", "highPriority", "", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lcom/tencent/mm/media/config/VideoCodecConfig;ZLkotlin/jvm/functions/Function1;)V", "TAG", "", "TIMEOUT", "", "TIMEOUT$1", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "encodeHandler", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "encodeThread", "Landroid/os/HandlerThread;", "encoder", "Landroid/media/MediaCodec;", "encoderLock", "Ljava/lang/Object;", "hasFinished", "isEnd", "startTime", "drainEncoder", "encodeFrame", "pts", "finishEncode", "finishWithEncodeLastFrame", "getRecordTimes", "release", "Companion", "plugin-mediaeditor_release"})
public final class e extends b
{
  public static final a eVM;
  private final String TAG;
  private HandlerThread eSP;
  private ak eSQ;
  private boolean eTf;
  private final MediaCodec.BufferInfo eTy;
  private final long eVJ;
  private boolean eVK;
  private final Object eVL;
  private MediaCodec eVq;
  private long startTime;

  static
  {
    AppMethodBeat.i(12951);
    eVM = new a((byte)0);
    AppMethodBeat.o(12951);
  }

  public e(com.tencent.mm.media.b.c paramc, boolean paramBoolean, a.f.a.b<? super b, y> paramb)
  {
    super(paramc, paramb);
    AppMethodBeat.i(12950);
    this.TAG = "MicroMsg.MediaCodecTransEncoder";
    this.eVJ = 10000L;
    this.eTy = new MediaCodec.BufferInfo();
    int i;
    if (paramBoolean)
    {
      i = -2;
      Object localObject = d.ek("MediaCodecTransEncoder_encodeThread", i);
      j.o(localObject, "ThreadPool.newFreeHandle….THREAD_PRIORITY_DEFAULT)");
      this.eSP = ((HandlerThread)localObject);
      this.eVL = new Object();
      localObject = MediaCodec.createByCodecName(paramc.name);
      j.o(localObject, "MediaCodec.createByCodec…me(videoCodecConfig.name)");
      this.eVq = ((MediaCodec)localObject);
      this.eVq.configure(paramc.Ux(), null, null, 1);
      paramc = this.eVq.createInputSurface();
      j.o(paramc, "encoder.createInputSurface()");
      e(paramc);
      this.eVq.start();
      this.eSP.start();
      this.eSQ = new ak(this.eSP.getLooper());
      if (paramb == null)
        break label195;
      paramb.am(this);
      AppMethodBeat.o(12950);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label195: AppMethodBeat.o(12950);
    }
  }

  private final void UR()
  {
    AppMethodBeat.i(12948);
    try
    {
      ab.i(this.TAG, "drainEncoder");
      i = this.eVq.dequeueOutputBuffer(this.eTy, this.eVJ);
      if (i == -1)
      {
        ab.d(this.TAG, "outputBuffer try again later");
        label45: US();
        AppMethodBeat.o(12948);
        return;
      }
      Object localObject2;
      if (i == -2)
      {
        localObject1 = this.TAG;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("encoder output format changed ");
        ab.d((String)localObject1, this.eVq.getOutputFormat());
      }
      while (true)
      {
        ab.d(this.TAG, "dequeueOutputBuffer start");
        i = this.eVq.dequeueOutputBuffer(this.eTy, this.eVJ);
        if (i < 0)
          break label45;
        break;
        if (i != -3)
        {
          if (i >= 0)
            break label199;
          localObject2 = this.TAG;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("outputBufferIndex ");
          ab.e((String)localObject2, i + ", ignore");
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        int i;
        Object localObject1;
        ab.e(this.TAG, "drainEncoder error");
        if (this.eTO)
        {
          Object localObject3 = com.tencent.mm.media.i.c.faj;
          com.tencent.mm.media.i.c.VX();
          continue;
          label199: ab.d(this.TAG, "outputBuffer index: ".concat(String.valueOf(i)));
          localObject3 = this.eVq.getOutputBuffers();
          ab.d(this.TAG, "getOutputBuffers");
          ByteBuffer localByteBuffer = localObject3[i];
          if (localByteBuffer == null)
          {
            localObject3 = new java/lang/RuntimeException;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("encoderOutputBuffer ");
            ((RuntimeException)localObject3).<init>(i + " was null");
            localObject3 = (Throwable)localObject3;
            AppMethodBeat.o(12948);
            throw ((Throwable)localObject3);
          }
          ab.d(this.TAG, "outputBuffers[outputBufferIndex]");
          if ((this.eTy.flags & 0x2) != 0)
            ab.i(this.TAG, "codec config!");
          localObject3 = this.TAG;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("bufferInfo.flags : ");
          ab.i((String)localObject3, this.eTy.flags & 0x4);
          if (this.eTy.size != 0)
          {
            localByteBuffer.position(this.eTy.offset);
            localByteBuffer.limit(this.eTy.offset + this.eTy.size);
            f(localByteBuffer, this.eTy);
            this.eVq.releaseOutputBuffer(i, false);
          }
          else if ((this.eTy.flags & 0x4) != 0)
          {
            ab.i(this.TAG, "encode end of stream");
            US();
          }
          else
          {
            ab.d(this.TAG, "bufferInfo.size == 0");
          }
        }
      }
    }
  }

  private final void US()
  {
    AppMethodBeat.i(12946);
    ab.d(this.TAG, "finishWithEncodeLastFrame  ,isEnd:" + this.eTf + "   ,hasFinished: " + this.eVK);
    synchronized (this.eVL)
    {
      if (this.eTf)
      {
        boolean bool = this.eVK;
        if (!bool);
      }
      else
      {
        AppMethodBeat.o(12946);
        return;
      }
      release();
      a locala = this.eVz;
      if (locala != null)
        locala.invoke();
      AppMethodBeat.o(12946);
    }
  }

  public final void UO()
  {
    AppMethodBeat.i(12945);
    ab.i(this.TAG, "finishEncode ");
    synchronized (this.eVL)
    {
      if ((!this.eTf) && (!this.eVK))
      {
        long l = this.startTime;
        if (0L != l);
      }
      else
      {
        AppMethodBeat.o(12945);
      }
      while (true)
      {
        return;
        try
        {
          this.eTf = true;
          this.eVq.signalEndOfInputStream();
          UR();
          y localy = y.AUy;
          AppMethodBeat.o(12945);
        }
        catch (Exception localException)
        {
          while (true)
          {
            String str = this.TAG;
            Throwable localThrowable = (Throwable)localException;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("finishEncode signalEndOfInputStream error:");
            ab.printErrStackTrace(str, localThrowable, localException.getMessage(), new Object[0]);
          }
        }
      }
    }
  }

  public final void UP()
  {
    AppMethodBeat.i(12944);
    if (0L == this.startTime)
      this.startTime = bo.yz();
    this.eSQ.post((Runnable)new e.b(this));
    AppMethodBeat.o(12944);
  }

  public final long UQ()
  {
    AppMethodBeat.i(12949);
    long l1 = bo.yz();
    long l2 = this.startTime;
    AppMethodBeat.o(12949);
    return l1 - l2;
  }

  public final void release()
  {
    AppMethodBeat.i(12947);
    synchronized (this.eVL)
    {
      if (this.eVK)
      {
        ab.i(this.TAG, "release, already finished");
        AppMethodBeat.o(12947);
      }
      while (true)
      {
        return;
        try
        {
          this.eVK = true;
          this.eVq.stop();
          this.eVq.release();
          this.eSQ.removeCallbacksAndMessages(null);
          this.eSP.quitSafely();
          AppMethodBeat.o(12947);
        }
        catch (Exception localException)
        {
          while (true)
          {
            String str = this.TAG;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("release encoder error ");
            ab.e(str, localException.getMessage());
          }
        }
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/encoder/MediaCodecTransEncoder$Companion;", "", "()V", "TIMEOUT", "", "plugin-mediaeditor_release"})
  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.d.e
 * JD-Core Version:    0.6.2
 */