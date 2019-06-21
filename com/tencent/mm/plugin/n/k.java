package com.tencent.mm.plugin.n;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.nio.ByteBuffer;

public final class k extends h
{
  Surface aOO;
  float iac = 1.0F;
  boolean osn = false;
  private boolean oso = false;
  boolean osp = false;
  private long osq = 0L;
  long osr = -1L;
  private int videoHeight;
  private int videoWidth;

  public k(g paramg, ak paramak)
  {
    super(paramg, paramak);
  }

  protected final boolean R(int paramInt, long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(117914);
    ab.d("MicroMsg.VideoTrackDataSource", "%s reset extractor flag[%d] needReset[%b]", new Object[] { aZm(), Integer.valueOf(paramInt), Boolean.valueOf(this.orH.llI) });
    if ((this.orH.llI) && (paramInt == 1) && (this.osr != paramLong))
    {
      bool = N(paramLong, -1L);
      this.osr = paramLong;
      AppMethodBeat.o(117914);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(117914);
    }
  }

  final boolean a(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt, MediaCodec.BufferInfo paramBufferInfo)
  {
    AppMethodBeat.i(117908);
    ab.d("MicroMsg.VideoTrackDataSource", "%s start to process output buffer state %d time[%d, %d] index %d", new Object[] { aZm(), Integer.valueOf(this.state), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt) });
    boolean bool;
    if (d.yF(this.state))
    {
      ab.i("MicroMsg.VideoTrackDataSource", "%s video track flush surface", new Object[] { aZm() });
      paramMediaCodec.releaseOutputBuffer(paramInt, true);
      setState(4);
      bool = true;
      AppMethodBeat.o(117908);
    }
    while (true)
    {
      return bool;
      if (d.yE(this.state))
      {
        paramLong2 = paramBufferInfo.presentationTimeUs / 1000L;
        l1 = paramLong1 - paramLong2;
        ab.d("MicroMsg.VideoTrackDataSource", "%s start to handle precision seek[%d, %d] diff[%d]", new Object[] { aZm(), Long.valueOf(paramLong2), Long.valueOf(paramLong1), Long.valueOf(l1) });
        int i;
        if (l1 <= 30L)
        {
          i = 1;
          label184: if (i == 0)
            break label255;
          ab.i("MicroMsg.VideoTrackDataSource", "%s precision seek done to surface", new Object[] { aZm() });
          paramMediaCodec.releaseOutputBuffer(paramInt, true);
          if (this.oso)
          {
            setState(7);
            this.oso = false;
          }
          this.oso = true;
        }
        while (true)
        {
          bool = true;
          AppMethodBeat.o(117908);
          break;
          i = 0;
          break label184;
          label255: paramMediaCodec.releaseOutputBuffer(paramInt, false);
        }
      }
      if (!d.yG(this.state))
      {
        ab.i("MicroMsg.VideoTrackDataSource", "%s it no need process buffer now state %d", new Object[] { aZm(), Integer.valueOf(this.state) });
        bool = false;
        AppMethodBeat.o(117908);
        continue;
      }
      long l2 = paramBufferInfo.presentationTimeUs / 1000L;
      long l1 = SystemClock.elapsedRealtime();
      long l3 = l1 - paramLong2;
      long l4 = ()((float)l2 / this.iac - (float)paramLong1 - (float)l3);
      ab.d("MicroMsg.VideoTrackDataSource", "%s earlyMs[%d] time[%d, %d, %d] sample[%d %d]", new Object[] { aZm(), Long.valueOf(l4), Long.valueOf(l3), Long.valueOf(l1), Long.valueOf(paramLong2), Long.valueOf(paramLong1), Long.valueOf(l2) });
      if (l4 < -30L)
      {
        ab.d("MicroMsg.VideoTrackDataSource", "%s finish to process but it too late to show video frame. throw now", new Object[] { aZm() });
        paramMediaCodec.releaseOutputBuffer(paramInt, false);
        this.orH.orC = 0L;
        bool = true;
        AppMethodBeat.o(117908);
        continue;
      }
      if (l4 < 30L)
      {
        this.orH.orz = paramBufferInfo.presentationTimeUs;
        if (l4 <= 11L);
      }
      try
      {
        Thread.sleep(l4 - 10L);
        label514: if (!d.yG(this.state))
        {
          ab.i("MicroMsg.VideoTrackDataSource", "%s it no need process buffer now state %d", new Object[] { aZm(), Integer.valueOf(this.state) });
          bool = false;
          AppMethodBeat.o(117908);
          continue;
        }
        if (Math.abs(l2 - this.osq) > 1000L)
        {
          ab.i("MicroMsg.VideoTrackDataSource", "%s finish to process index[%d] time[%d] to surface", new Object[] { aZm(), Integer.valueOf(paramInt), Long.valueOf(l2) });
          this.osq = l2;
        }
        paramMediaCodec.releaseOutputBuffer(paramInt, true);
        bool = true;
        AppMethodBeat.o(117908);
        continue;
        ab.d("MicroMsg.VideoTrackDataSource", "%s finish to process but it too early now do nothing.", new Object[] { aZm() });
        bool = false;
        AppMethodBeat.o(117908);
      }
      catch (Exception paramByteBuffer)
      {
        break label514;
      }
    }
  }

  protected final void b(MediaFormat paramMediaFormat, String paramString, int paramInt)
  {
    AppMethodBeat.i(117913);
    super.b(paramMediaFormat, paramString, paramInt);
    this.videoHeight = paramMediaFormat.getInteger("height");
    this.videoWidth = paramMediaFormat.getInteger("width");
    if (paramMediaFormat.containsKey("rotation-degrees"))
      paramInt = paramMediaFormat.getInteger("rotation-degrees");
    for (int i = 1; ; i = 0)
    {
      if ((Math.abs(paramInt) == 90) || (Math.abs(paramInt) == 270))
      {
        int j = this.videoWidth;
        this.videoWidth = this.videoHeight;
        this.videoHeight = j;
      }
      if (i != 0)
        paramInt = 0;
      this.orI.obtainMessage(4, this.videoWidth, this.videoHeight, Integer.valueOf(paramInt)).sendToTarget();
      ab.i("MicroMsg.VideoTrackDataSource", "%s video size[%d, %d] degrees[%d]", new Object[] { aZm(), Integer.valueOf(this.videoWidth), Integer.valueOf(this.videoHeight), Integer.valueOf(paramInt) });
      AppMethodBeat.o(117913);
      return;
      paramInt = SightVideoJNI.getMp4Rotate(this.path);
      ab.w("MicroMsg.VideoTrackDataSource", "%s it don't contains rotation key. degrees [%d]", new Object[] { aZm(), Integer.valueOf(paramInt) });
    }
  }

  final boolean b(MediaCodec paramMediaCodec)
  {
    AppMethodBeat.i(117909);
    if (paramMediaCodec == null)
    {
      AppMethodBeat.o(117909);
      return false;
    }
    if (this.aOO == null)
    {
      ab.w("MicroMsg.VideoTrackDataSource", "%s decoder configure surface but surface is null.", new Object[] { aZm() });
      this.osn = false;
      label46: ab.i("MicroMsg.VideoTrackDataSource", "%s handleDecoderBeforeStart", new Object[] { aZm() });
      if (this.clX != null)
        break label103;
    }
    label103: for (MediaFormat localMediaFormat = this.orM; ; localMediaFormat = this.clX.getTrackFormat(this.orN))
    {
      paramMediaCodec.configure(localMediaFormat, this.aOO, null, 0);
      AppMethodBeat.o(117909);
      break;
      this.osn = true;
      break label46;
    }
  }

  @TargetApi(23)
  final void bPe()
  {
    AppMethodBeat.i(117911);
    try
    {
      if (this.eTq != null)
        this.eTq.setOutputSurface(this.aOO);
      AppMethodBeat.o(117911);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.VideoTrackDataSource", localException, "%s change surface23 error [%s]", new Object[] { aZm(), localException.toString() });
        bPf();
        AppMethodBeat.o(117911);
      }
    }
  }

  final void bPf()
  {
    AppMethodBeat.i(117912);
    ab.i("MicroMsg.VideoTrackDataSource", "%s change surface below 23", new Object[] { aZm() });
    if (this.eTq != null)
    {
      sI();
      N(this.orH.orz, -1L);
      bOZ();
    }
    AppMethodBeat.o(117912);
  }

  protected final void c(MediaCodec paramMediaCodec)
  {
    AppMethodBeat.i(117910);
    ab.i("MicroMsg.VideoTrackDataSource", "%s output format changed", new Object[] { aZm() });
    paramMediaCodec.setVideoScalingMode(1);
    AppMethodBeat.o(117910);
  }

  final String type()
  {
    return "video";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.n.k
 * JD-Core Version:    0.6.2
 */