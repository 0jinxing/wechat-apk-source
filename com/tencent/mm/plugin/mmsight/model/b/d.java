package com.tencent.mm.plugin.mmsight.model.b;

import android.graphics.Point;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class d
  implements a
{
  private long bqO;
  private long eTA;
  private int eTJ = 0;
  private boolean fAA = false;
  private String fYM;
  private int frameCount = 0;
  private h oxp;
  private byte[] oxq = null;
  private double oxr;
  private int videoFps;

  public final void a(h paramh)
  {
    this.oxp = paramh;
  }

  public final Point alJ()
  {
    AppMethodBeat.i(76703);
    Point localPoint = new Point(MP4MuxerJNI.ffmpegGetVideoWidthLock(), MP4MuxerJNI.ffmpegGetVideoHeightLock());
    AppMethodBeat.o(76703);
    return localPoint;
  }

  public final int alK()
  {
    return 2;
  }

  public final void bPZ()
  {
    AppMethodBeat.i(76702);
    ab.i("MicroMsg.FFMpegTranscodeDecoder", "startDecodeBlockLoop");
    this.fAA = true;
    this.frameCount = 0;
    label34: boolean bool1;
    do
    {
      if (!this.fAA)
      {
        AppMethodBeat.o(76702);
        return;
      }
      long l = bo.yz();
      this.oxq = MP4MuxerJNI.ffmpegGetNextVideoFrameDataLock(this.oxq);
      ab.d("MicroMsg.FFMpegTranscodeDecoder", "ffmpegGetNextVideoFrameData used %sms", new Object[] { Long.valueOf(bo.az(l)) });
      bool1 = MP4MuxerJNI.ffmpegCheckIfReachEndTimestampLock();
      this.frameCount += 1;
    }
    while ((this.eTJ > 1) && (this.frameCount % this.eTJ == 0));
    h localh;
    byte[] arrayOfByte;
    if (this.oxp != null)
    {
      localh = this.oxp;
      arrayOfByte = this.oxq;
      if ((this.oxq != null) && (!bool1))
        break label227;
    }
    label227: for (boolean bool2 = true; ; bool2 = false)
    {
      localh.a(arrayOfByte, bool2, ()(this.frameCount * this.oxr * 1000.0D));
      if ((this.oxq != null) && (!bool1))
        break;
      ab.e("MicroMsg.FFMpegTranscodeDecoder", "ret buffer is null or reachEnd? %s", new Object[] { Boolean.valueOf(bool1) });
      ab.i("MicroMsg.FFMpegTranscodeDecoder", "decode finish, frame count: %s", new Object[] { Integer.valueOf(this.frameCount) });
      this.fAA = false;
      AppMethodBeat.o(76702);
      break label34;
    }
  }

  public final int e(String paramString, long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(76701);
    ab.i("MicroMsg.FFMpegTranscodeDecoder", "initDecoder, srcFilePath: %s, start: %s, end: %s, videoFps: %s", new Object[] { paramString, Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt) });
    this.fYM = paramString;
    this.bqO = paramLong1;
    this.eTA = paramLong2;
    this.videoFps = paramInt;
    this.oxr = (1000.0D / paramInt);
    if (!bo.isNullOrNil(paramString))
    {
      long l = bo.yz();
      paramInt = MP4MuxerJNI.ffmpegOpenAndSeekFileLock(paramString, paramLong1 * 1000.0D, paramLong2 * 1000.0D);
      ab.i("MicroMsg.FFMpegTranscodeDecoder", "ffmpegOpenAndSeekFile used %sms", new Object[] { Long.valueOf(bo.az(l)) });
      AppMethodBeat.o(76701);
    }
    while (true)
    {
      return paramInt;
      paramInt = -1;
      AppMethodBeat.o(76701);
    }
  }

  public final void mp(int paramInt)
  {
    this.oxr = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.b.d
 * JD-Core Version:    0.6.2
 */