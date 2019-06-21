package com.tencent.mm.plugin.mmsight.model.a;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;

@TargetApi(16)
public class h
  implements c
{
  private final int TIMEOUT_USEC;
  int audioSampleRate;
  volatile com.tencent.mm.audio.b.c coZ;
  boolean eVK;
  final Object eVL;
  MediaCodec eVq;
  private int fXX;
  private int fzS;
  int ils;
  private MediaFormat ovL;
  private MediaCodec.BufferInfo ovM;
  long ovN;
  int ovO;
  int ovP;
  long ovQ;
  long ovR;
  boolean ovS;
  boolean ovT;
  public c.a ovU;
  o ovV;
  boolean ovW;
  ak ovX;
  protected boolean ovY;
  boolean ovZ;
  final Object owa;
  c.b owb;
  boolean owc;
  ak owd;
  Runnable owe;
  private com.tencent.mm.audio.b.c.a owf;
  private long startTime;

  public h(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(76578);
    this.ovN = 0L;
    this.TIMEOUT_USEC = 10000;
    this.ovS = false;
    this.ovT = false;
    this.ovU = null;
    this.startTime = 0L;
    this.eVL = new Object();
    this.eVK = false;
    this.ovW = true;
    this.ovX = new h.1(this, Looper.getMainLooper());
    this.coZ = null;
    this.owa = new byte[0];
    this.owc = false;
    this.owe = new h.2(this);
    this.owf = new h.3(this);
    this.fzS = paramInt2;
    this.audioSampleRate = paramInt1;
    this.ovV = null;
    this.ovW = ((a)g.K(a.class)).a(a.a.lJi, true);
    ab.i("MicroMsg.MMSightAACMediaCodecRecorder", "create MMSightAACMediaCodecRecorder, audioBitrate: %s, audioSampleRate: %s", new Object[] { Integer.valueOf(this.fzS), Integer.valueOf(this.audioSampleRate) });
    AppMethodBeat.o(76578);
  }

  private void UO()
  {
    AppMethodBeat.i(138317);
    if (this.ovW)
    {
      bPQ();
      AppMethodBeat.o(138317);
    }
    while (true)
    {
      return;
      synchronized (this.eVL)
      {
        bPQ();
        AppMethodBeat.o(138317);
      }
    }
  }

  private void bPQ()
  {
    AppMethodBeat.i(138318);
    if ((this.eVK) || (0L == this.startTime))
      AppMethodBeat.o(138318);
    while (true)
    {
      return;
      this.eVK = true;
      try
      {
        if (this.eVq != null)
        {
          ab.i("MicroMsg.MMSightAACMediaCodecRecorder", "stop encoder");
          this.eVq.stop();
          this.eVq.release();
          this.eVq = null;
        }
        this.eVq = null;
        AppMethodBeat.o(138318);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.MMSightAACMediaCodecRecorder", "clear error: %s", new Object[] { localException.getMessage() });
        this.eVq = null;
        AppMethodBeat.o(138318);
      }
      finally
      {
        this.eVq = null;
        AppMethodBeat.o(138318);
      }
    }
  }

  protected boolean WF()
  {
    return false;
  }

  public final int a(c.a parama)
  {
    int i = -1;
    int j = 0;
    AppMethodBeat.i(76580);
    ab.i("MicroMsg.MMSightAACMediaCodecRecorder", "start, onPcmReady: %s", new Object[] { parama });
    this.ovU = parama;
    if (!this.ovT)
    {
      if (this.coZ == null)
      {
        ab.i("MicroMsg.MMSightAACMediaCodecRecorder", "start, pcmrecorder is null");
        AppMethodBeat.o(76580);
        return i;
      }
      if (this.coZ.EL())
        i = j;
    }
    while (true)
    {
      AppMethodBeat.o(76580);
      break;
      i = -1;
      continue;
      this.ovX.sendEmptyMessage(0);
      i = j;
    }
  }

  public final int a(c.b paramb)
  {
    int i = 0;
    AppMethodBeat.i(76581);
    boolean bool1;
    boolean bool2;
    label26: boolean bool3;
    if (this.coZ == null)
    {
      bool1 = true;
      if (this.owb != null)
        break label105;
      bool2 = true;
      if (paramb != null)
        break label111;
      bool3 = true;
      label33: ab.i("MicroMsg.MMSightAACMediaCodecRecorder", "call stop, pcmRecorder null[%B], old stopCallback null[%B]new stopCallback null[%B], pcmMarkStop[%B]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(this.ovY) });
      if ((this.coZ != null) || (this.ovT))
        break label117;
      i = -1;
      AppMethodBeat.o(76581);
    }
    while (true)
    {
      return i;
      bool1 = false;
      break;
      label105: bool2 = false;
      break label26;
      label111: bool3 = false;
      break label33;
      label117: this.ovY = true;
      synchronized (this.owa)
      {
        this.owb = paramb;
        if ((this.ovZ) && (paramb != null))
        {
          ab.i("MicroMsg.MMSightAACMediaCodecRecorder", "has stop, directly call stop callback");
          paramb.WT();
          this.owb = null;
        }
        al.n(new h.4(this), 500L);
        AppMethodBeat.o(76581);
      }
    }
  }

  public final void bPM()
  {
    this.ovS = true;
  }

  public final com.tencent.mm.audio.b.c.a bPN()
  {
    return this.owf;
  }

  public final void clear()
  {
    AppMethodBeat.i(76582);
    ab.i("MicroMsg.MMSightAACMediaCodecRecorder", "clear");
    UO();
    if ((this.coZ != null) && (!this.ovT))
    {
      ab.i("MicroMsg.MMSightAACMediaCodecRecorder", "stop pcm recorder");
      this.coZ.EB();
      this.coZ = null;
    }
    AppMethodBeat.o(76582);
  }

  final void drainEncoder(boolean paramBoolean)
  {
    AppMethodBeat.i(76583);
    if (this.eVq == null)
    {
      ab.w("MicroMsg.MMSightAACMediaCodecRecorder", "drain audio encoder error, encoder is null, end:".concat(String.valueOf(paramBoolean)));
      AppMethodBeat.o(76583);
    }
    while (true)
    {
      return;
      label137: label239: 
      do
      {
        Object localObject1;
        while (true)
        {
          try
          {
            ByteBuffer[] arrayOfByteBuffer = this.eVq.getOutputBuffers();
            this.fXX = this.eVq.dequeueOutputBuffer(this.ovM, 10000L);
            ab.v("MicroMsg.MMSightAACMediaCodecRecorder", "outputBufferIndex-->%s", new Object[] { Integer.valueOf(this.fXX) });
            if (this.fXX != -1)
              break label137;
            ab.d("MicroMsg.MMSightAACMediaCodecRecorder", "no output available, break");
            AppMethodBeat.o(76583);
          }
          catch (Exception localException)
          {
            ab.e("MicroMsg.MMSightAACMediaCodecRecorder", "drainEncoder error: %s", new Object[] { localException.getMessage() });
            AppMethodBeat.o(76583);
          }
          break;
          if (this.fXX == -3)
          {
            localObject1 = this.eVq.getOutputBuffers();
          }
          else if (this.fXX == -2)
          {
            localObject2 = this.eVq.getOutputFormat();
            ab.d("MicroMsg.MMSightAACMediaCodecRecorder", "encoder output format changed: ".concat(String.valueOf(localObject2)));
            if (this.ovV != null)
              this.ovV.e((MediaFormat)localObject2);
          }
          else
          {
            if (this.fXX >= 0)
              break label239;
            ab.v("MicroMsg.MMSightAACMediaCodecRecorder", "unexpected result from encoder.dequeueOutputBuffer: %s", new Object[] { Integer.valueOf(this.fXX) });
          }
        }
        ab.v("MicroMsg.MMSightAACMediaCodecRecorder", "perform encoding");
        Object localObject2 = localObject1[this.fXX];
        if (localObject2 == null)
        {
          localObject2 = new java/lang/RuntimeException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("encoderOutputBuffer ");
          ((RuntimeException)localObject2).<init>(this.fXX + " was null");
          AppMethodBeat.o(76583);
          throw ((Throwable)localObject2);
        }
        if ((this.ovM.flags & 0x2) != 0)
        {
          ab.v("MicroMsg.MMSightAACMediaCodecRecorder", "ignoring BUFFER_FLAG_CODEC_CONFIG,size: %s, %s", new Object[] { Integer.valueOf(this.ovM.size), Boolean.valueOf(WF()) });
          if (WF())
            this.ovM.size = 0;
        }
        if (this.ovM.size != 0)
        {
          if ((this.ovV != null) && (!this.ovV.cFy))
          {
            MediaFormat localMediaFormat = this.eVq.getOutputFormat();
            this.ovV.e(localMediaFormat);
          }
          ((ByteBuffer)localObject2).position(this.ovM.offset);
          ((ByteBuffer)localObject2).limit(this.ovM.offset + this.ovM.size);
          g((ByteBuffer)localObject2, this.ovM);
        }
        this.eVq.releaseOutputBuffer(this.fXX, false);
      }
      while ((this.ovM.flags & 0x4) == 0);
      if (!paramBoolean)
      {
        ab.w("MicroMsg.MMSightAACMediaCodecRecorder", "reached end of stream unexpectedly");
        AppMethodBeat.o(76583);
      }
      else
      {
        ab.w("MicroMsg.MMSightAACMediaCodecRecorder", "do stop audio encoder");
        UO();
        AppMethodBeat.o(76583);
      }
    }
  }

  protected void g(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    AppMethodBeat.i(76584);
    o localo;
    if ((this.ovV != null) && ((paramBufferInfo.flags & 0x4) == 0))
      localo = this.ovV;
    while (true)
    {
      try
      {
        if ((localo.owN != null) && (localo.owP != -1) && (localo.cFy) && (paramByteBuffer != null) && (paramBufferInfo != null))
        {
          long l1 = paramBufferInfo.presentationTimeUs;
          paramBufferInfo.presentationTimeUs = ((System.nanoTime() - localo.owQ) / 1000L);
          long l2 = bo.yz();
          localo.owN.writeSampleData(localo.owP, paramByteBuffer, paramBufferInfo);
          ab.v("MicroMsg.MMSightSystemMediaMuxer", "writeAACSampleData size: %s used %dms oldpts %s fix pts: %s", new Object[] { Integer.valueOf(paramBufferInfo.size), Long.valueOf(bo.az(l2)), Long.valueOf(l1), Long.valueOf(paramBufferInfo.presentationTimeUs) });
        }
        AppMethodBeat.o(76584);
        return;
      }
      catch (Exception paramByteBuffer)
      {
        ab.e("MicroMsg.MMSightSystemMediaMuxer", "writeAACSampleData error: %s", new Object[] { paramByteBuffer.getMessage() });
      }
      AppMethodBeat.o(76584);
    }
  }

  public final void iW(boolean paramBoolean)
  {
    this.ovT = paramBoolean;
  }

  public int q(int paramInt, String arg2)
  {
    paramInt = 0;
    AppMethodBeat.i(76579);
    boolean bool;
    if ((!this.ovT) && (this.coZ != null))
    {
      if (this.owb != null)
        break label423;
      bool = true;
    }
    while (true)
    {
      ab.e("MicroMsg.MMSightAACMediaCodecRecorder", "call init, before pcmRecorder stop, stopCallback null ? %B", new Object[] { Boolean.valueOf(bool) });
      this.coZ.EB();
      if (this.eVq != null)
      {
        if (this.owb != null)
          break label428;
        bool = true;
        label74: ab.e("MicroMsg.MMSightAACMediaCodecRecorder", "call init, before audioEncoder stop, stopCallback null ? %B", new Object[] { Boolean.valueOf(bool) });
        UO();
        if (this.owb != null)
        {
          this.owb.WT();
          this.owb = null;
        }
      }
      this.ils = 0;
      this.ovY = false;
      synchronized (this.owa)
      {
        this.ovZ = false;
        this.owb = null;
        if (!this.ovT)
        {
          this.coZ = new com.tencent.mm.audio.b.c(this.audioSampleRate, 1, 5);
          this.coZ.gG(128);
          this.coZ.bq(false);
          this.coZ.cpM = this.owf;
        }
        if (this.owd == null)
        {
          ab.i("MicroMsg.MMSightAACMediaCodecRecorder", "create pcm control handler");
          this.owd = new ak();
          label226: ab.i("MicroMsg.MMSightAACMediaCodecRecorder", "sample rate %d, audio rate %d", new Object[] { Integer.valueOf(this.audioSampleRate), Integer.valueOf(this.fzS) });
        }
      }
      try
      {
        ??? = new android/media/MediaCodec$BufferInfo;
        ???.<init>();
        this.ovM = ???;
        ??? = new android/media/MediaFormat;
        ???.<init>();
        this.ovL = ???;
        this.ovL.setString("mime", "audio/mp4a-latm");
        this.ovL.setInteger("aac-profile", 2);
        this.ovL.setInteger("sample-rate", this.audioSampleRate);
        this.ovL.setInteger("channel-count", 1);
        this.ovL.setInteger("bitrate", this.fzS);
        this.ovL.setInteger("max-input-size", 16384);
        this.eVq = MediaCodec.createEncoderByType("audio/mp4a-latm");
        this.eVq.configure(this.ovL, null, null, 1);
        this.eVq.start();
        if (this.ovW)
        {
          this.eVK = false;
          this.startTime = System.currentTimeMillis();
        }
        while (true)
        {
          return paramInt;
          label423: bool = false;
          break;
          label428: bool = false;
          break label74;
          localObject1 = finally;
          AppMethodBeat.o(76579);
          throw localObject1;
          if (this.owd.getLooper() == Looper.myLooper())
            break label226;
          ab.w("MicroMsg.MMSightAACMediaCodecRecorder", "error pcm control handler looper[%s, %s], recreate handler", new Object[] { this.owd.getLooper(), Looper.myLooper() });
          this.owd = new ak();
          break label226;
          synchronized (this.eVL)
          {
            this.eVK = false;
            this.startTime = System.currentTimeMillis();
          }
        }
      }
      catch (Throwable )
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.MMSightAACMediaCodecRecorder", ???, "start aac encoder error: %s", new Object[] { ???.getMessage() });
          UO();
          ab.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecAACInitError");
          com.tencent.mm.plugin.report.service.h.pYm.a(440L, 15L, 1L, false);
          this.ovS = false;
          paramInt = -1;
          AppMethodBeat.o(76579);
        }
      }
      finally
      {
        this.ovS = false;
        AppMethodBeat.o(76579);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.h
 * JD-Core Version:    0.6.2
 */