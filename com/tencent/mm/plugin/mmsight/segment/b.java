package com.tencent.mm.plugin.mmsight.segment;

import android.graphics.Point;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class b
  implements e
{
  private long bqO;
  private long eTA;
  private int eTJ;
  private boolean fAA = false;
  private String fYM;
  private int frameCount = 0;
  private e.a oxF;
  private byte[] oxq = null;

  public final void a(e.a parama)
  {
    this.oxF = parama;
  }

  public final Point alJ()
  {
    AppMethodBeat.i(3606);
    Point localPoint = new Point(MP4MuxerJNI.ffmpegGetVideoWidth(), MP4MuxerJNI.ffmpegGetVideoHeight());
    AppMethodBeat.o(3606);
    return localPoint;
  }

  public final int alK()
  {
    return 2;
  }

  public final int i(String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(3604);
    ab.i("MicroMsg.FFMpegTranscodeDecoder", "initDecoder, srcFilePath: %s, start: %s, end: %s", new Object[] { paramString, Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
    this.fYM = paramString;
    this.bqO = paramLong1;
    this.eTA = paramLong2;
    int i;
    if (!bo.isNullOrNil(paramString))
    {
      long l = bo.yz();
      i = MP4MuxerJNI.ffmpegOpenAndSeekFile(paramString, paramLong1 * 1000.0D, paramLong2 * 1000.0D);
      ab.i("MicroMsg.FFMpegTranscodeDecoder", "ffmpegOpenAndSeekFile used %sms", new Object[] { Long.valueOf(bo.az(l)) });
      AppMethodBeat.o(3604);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(3604);
    }
  }

  public final void mp(int paramInt)
  {
    AppMethodBeat.i(3608);
    ab.i("MicroMsg.FFMpegTranscodeDecoder", "setFrameDropInterval: %s", new Object[] { Integer.valueOf(paramInt) });
    this.eTJ = paramInt;
    AppMethodBeat.o(3608);
  }

  public final void stop()
  {
    AppMethodBeat.i(3607);
    ab.i("MicroMsg.FFMpegTranscodeDecoder", "stop, start: %s", new Object[] { Boolean.valueOf(this.fAA) });
    this.fAA = false;
    AppMethodBeat.o(3607);
  }

  public final void z(Runnable paramRunnable)
  {
    AppMethodBeat.i(3605);
    ab.i("MicroMsg.FFMpegTranscodeDecoder", "startDecodeBlockLoop");
    this.fAA = true;
    this.frameCount = 0;
    while (true)
    {
      if (!this.fAA)
        AppMethodBeat.o(3605);
      while (true)
      {
        return;
        long l = bo.yz();
        this.oxq = MP4MuxerJNI.ffmpegGetNextVideoFrameData(this.oxq);
        ab.d("MicroMsg.FFMpegTranscodeDecoder", "ffmpegGetNextVideoFrameData used %sms", new Object[] { Long.valueOf(bo.az(l)) });
        boolean bool = MP4MuxerJNI.ffmpegCheckIfReachEndTimestamp();
        if ((this.oxq != null) && (!bool))
          break;
        ab.e("MicroMsg.FFMpegTranscodeDecoder", "ret buffer is null or reachEnd? %s", new Object[] { Boolean.valueOf(bool) });
        this.fAA = false;
        paramRunnable.run();
        AppMethodBeat.o(3605);
      }
      this.frameCount += 1;
      if (((this.eTJ <= 1) || (this.frameCount % this.eTJ != 0)) && (this.oxF != null))
        this.oxF.ba(this.oxq);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.b
 * JD-Core Version:    0.6.2
 */