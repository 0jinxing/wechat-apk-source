package com.tencent.mm.plugin.mmsight.segment;

import android.graphics.Point;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.v;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;

public final class h
  implements e.a
{
  private static int fYO = -1;
  long bqO;
  long eTA;
  int eTJ;
  Thread eVR;
  MediaExtractor eWb;
  int eWc;
  private int fYA;
  private int fYB;
  private int fYC;
  private int fYD;
  private int fYE;
  VideoTransPara fYK;
  private int fYL;
  String fYM;
  private MediaFormat fYP;
  private int fYx;
  private int fYy;
  private int fYz;
  private Object lock;
  h.a oyg;
  e oyh;
  private boolean oyi;
  int rotate;

  public h()
  {
    AppMethodBeat.i(3656);
    this.bqO = -1L;
    this.eTA = -1L;
    this.fYL = 0;
    this.oyi = false;
    this.lock = new byte[0];
    this.eTJ = -1;
    AppMethodBeat.o(3656);
  }

  public static int bQk()
  {
    AppMethodBeat.i(3657);
    int i = CaptureMMProxy.getInstance().getInt(ac.a.xPl, -1);
    if (i != -1)
      if (i == 1)
        if (com.tencent.mm.compatible.util.d.iW(21))
        {
          fYO = 2;
          i = fYO;
          AppMethodBeat.o(3657);
        }
    while (true)
    {
      return i;
      fYO = 1;
      break;
      if (i == 2)
      {
        fYO = 1;
        break;
      }
      fYO = 3;
      break;
      if (fYO == -1)
        break label97;
      i = fYO;
      AppMethodBeat.o(3657);
    }
    label97: i = q.etj.etD;
    if (i != -1)
      if (i == 1)
        fYO = 1;
    while (true)
    {
      i = fYO;
      AppMethodBeat.o(3657);
      break;
      if (i == 2)
      {
        if (com.tencent.mm.compatible.util.d.iW(21))
          fYO = 2;
        else
          fYO = 1;
      }
      else if (i == 3)
      {
        do
        {
          fYO = 3;
          break;
        }
        while (!com.tencent.mm.compatible.util.d.iW(bo.getInt(CaptureMMProxy.getInstance().getDynamicConfig("SightSegCutMinApiLevel"), 21)));
        fYO = 1;
      }
    }
  }

  private static Point v(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Point localPoint = null;
    AppMethodBeat.i(3660);
    ab.d("MicroMsg.MediaCodecFFMpegTranscoder", "scale() called with: decoderOutputWidth = [" + paramInt1 + "], decoderOutputHeight = [" + paramInt2 + "], specWidth = [" + paramInt3 + "], specHeight = [" + paramInt4 + "]");
    if ((paramInt1 <= paramInt3) && (paramInt2 <= paramInt4))
    {
      ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "calc scale, small or equal to spec size");
      AppMethodBeat.o(3660);
    }
    while (true)
    {
      return localPoint;
      int i = Math.max(paramInt1, paramInt2);
      int j = Math.min(paramInt1, paramInt2);
      int k = Math.max(paramInt3, paramInt4);
      int m = Math.min(paramInt3, paramInt4);
      if ((i % 16 == 0) && (Math.abs(i - k) < 16) && (j % 16 == 0) && (Math.abs(j - m) < 16))
      {
        ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "calc scale, same len divide by 16, no need scale");
        AppMethodBeat.o(3660);
      }
      else if ((i / 2 == k) && (j / 2 == m))
      {
        ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "calc scale, double ratio");
        paramInt4 = paramInt1 / 2;
        paramInt3 = paramInt2 / 2;
        paramInt1 = paramInt4;
        if (paramInt4 % 2 != 0)
          paramInt1 = paramInt4 + 1;
        paramInt2 = paramInt3;
        if (paramInt3 % 2 != 0)
          paramInt2 = paramInt3 + 1;
        localPoint = new Point(paramInt1, paramInt2);
        AppMethodBeat.o(3660);
      }
      else
      {
        i /= 2;
        j /= 2;
        if ((i % 16 != 0) || (Math.abs(i - k) >= 16) || (j % 16 != 0) || (Math.abs(j - m) >= 16))
          break;
        ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "calc scale, double ratio divide by 16");
        paramInt4 = paramInt1 / 2;
        paramInt3 = paramInt2 / 2;
        paramInt1 = paramInt4;
        if (paramInt4 % 2 != 0)
          paramInt1 = paramInt4 + 1;
        paramInt2 = paramInt3;
        if (paramInt3 % 2 != 0)
          paramInt2 = paramInt3 + 1;
        localPoint = new Point(paramInt1, paramInt2);
        AppMethodBeat.o(3660);
      }
    }
    localPoint = new Point();
    double d;
    if (paramInt1 < paramInt2)
    {
      paramInt3 = Math.min(paramInt3, paramInt4);
      d = paramInt1 * 1.0D / paramInt3;
      paramInt2 = (int)(paramInt2 / d);
      paramInt1 = paramInt3;
    }
    while (true)
    {
      paramInt3 = paramInt2;
      if (paramInt2 % 2 != 0)
        paramInt3 = paramInt2 + 1;
      paramInt2 = paramInt1;
      if (paramInt1 % 2 != 0)
        paramInt2 = paramInt1 + 1;
      ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "calc scale, outputsize: %s %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      localPoint.x = paramInt2;
      localPoint.y = paramInt3;
      AppMethodBeat.o(3660);
      break;
      paramInt3 = Math.min(paramInt3, paramInt4);
      d = paramInt2 * 1.0D / paramInt3;
      paramInt1 = (int)(paramInt1 / d);
      paramInt2 = paramInt3;
    }
  }

  public final void ba(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(3662);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "onYuvDataImp error data is null!!");
      AppMethodBeat.o(3662);
      return;
    }
    Point localPoint1 = this.oyh.alJ();
    this.fYx = localPoint1.x;
    this.fYy = localPoint1.y;
    Point localPoint2;
    if ((this.fYE <= 0) || (this.fYD <= 0))
    {
      localPoint2 = v(this.fYx, this.fYy, this.fYz, this.fYA);
      if (localPoint2 == null)
        break label540;
      this.fYD = localPoint2.x;
    }
    int k;
    int m;
    boolean bool;
    for (this.fYE = localPoint2.y; ; this.fYE = this.fYy)
    {
      ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "scaleYuvTargetWidth: %s, scaleYuvTargetHeight: %s, srcWidth: %s, srcHeight: %s", new Object[] { Integer.valueOf(this.fYD), Integer.valueOf(this.fYE), Integer.valueOf(this.fYx), Integer.valueOf(this.fYy) });
      long l = bo.yz();
      int i = 0;
      int j = 0;
      if (this.fYP != null)
      {
        k = this.fYP.getInteger("width");
        m = this.fYP.getInteger("height");
        if (this.fYB > 0)
        {
          i = k;
          j = m;
          if (this.fYC > 0);
        }
        else
        {
          localPoint2 = v(k, m, this.fYz, this.fYA);
          if (localPoint2 == null)
            break label559;
          this.fYB = localPoint2.x;
          this.fYC = localPoint2.y;
          bool = true;
          if (bool)
          {
            this.fYD = this.fYB;
            this.fYE = this.fYC;
          }
          ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "videoTargetWidth: %s, videoTargetHeight: %s, initWidth: %s, initHeight: %s, videoNeedScale: %s", new Object[] { Integer.valueOf(this.fYB), Integer.valueOf(this.fYC), Integer.valueOf(k), Integer.valueOf(m), Boolean.valueOf(bool) });
          j = m;
          i = k;
        }
      }
      this.fYL = this.oyh.alK();
      i = MP4MuxerJNI.writeYuvDataForSegment(paramArrayOfByte, localPoint1.x, localPoint1.y, this.fYD, this.fYE, this.fYL, i, j);
      ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "writeYuvDataForSegment used %sms", new Object[] { Long.valueOf(bo.az(l)) });
      if (i < 0)
        ab.e("MicroMsg.MediaCodecFFMpegTranscoder", "writeYuvDataForSegment error: %s", new Object[] { Integer.valueOf(i) });
      if (this.oyg == null)
      {
        MP4MuxerJNI.initH264Encoder(this.fYB, this.fYC, this.fYK.fps, this.fYK.videoBitrate, this.fYK.fzV, 8, this.fYK.fzU, 23.0F);
        this.oyg = new h.a(this, (byte)0);
        this.eVR = com.tencent.mm.sdk.g.d.h(this.oyg, "MediaCodecFFMpegTranscoder_Encoder");
        this.eVR.start();
        ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "initAndStartEncoder");
      }
      AppMethodBeat.o(3662);
      break;
      label540: this.fYD = this.fYx;
    }
    label559: if ((Math.abs(m - localPoint1.y) > 0) && (k == localPoint1.x))
      this.fYB = k;
    for (this.fYC = m; ; this.fYC = localPoint1.y)
    {
      bool = false;
      break;
      this.fYB = localPoint1.x;
    }
  }

  public final void cE(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3659);
    ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "registerDesiredSize: %s, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.fYz = paramInt1;
    this.fYA = paramInt2;
    AppMethodBeat.o(3659);
  }

  public final int f(MediaFormat paramMediaFormat)
  {
    AppMethodBeat.i(3658);
    ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "initDecoder, format: %s, filePath: %s", new Object[] { paramMediaFormat, this.fYM });
    this.fYP = paramMediaFormat;
    int i = bQk();
    if (i == 1)
    {
      this.oyh = new i(this.eWb, paramMediaFormat, this.eWc);
      this.oyi = false;
    }
    while (true)
    {
      if (this.oyh == null)
      {
        ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "use default config");
        this.oyh = new i(this.eWb, paramMediaFormat, this.eWc);
        this.oyi = false;
      }
      int j = this.oyh.i(this.fYM, this.bqO, this.eTA);
      ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "init decoder ret: %s", new Object[] { Integer.valueOf(j) });
      i = j;
      if (j < 0)
        if (fYO != 1)
        {
          i = j;
          if (fYO != 2);
        }
        else
        {
          ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "init mediaCodecDecoder failed, try ffmepg");
        }
      try
      {
        this.oyh.stop();
        this.oyh = null;
        label193: this.oyh = new b();
        this.oyi = true;
        fYO = 3;
        i = this.oyh.i(this.fYM, this.bqO, this.eTA);
        this.oyh.a(this);
        ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "init finish, ret: %d, decoderType: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(fYO) });
        AppMethodBeat.o(3658);
        return i;
        if (i == 2)
        {
          this.oyh = new j(this.eWb, paramMediaFormat, this.eWc);
          this.oyi = false;
          continue;
        }
        this.oyh = new b();
        this.oyi = true;
      }
      catch (Exception paramMediaFormat)
      {
        break label193;
      }
    }
  }

  public final void release()
  {
    AppMethodBeat.i(3661);
    ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "release, decoderType: %d", new Object[] { Integer.valueOf(fYO) });
    try
    {
      if (this.oyh != null)
        this.oyh.stop();
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MediaCodecFFMpegTranscoder", "release error: %s", new Object[] { localException.getMessage() });
        MP4MuxerJNI.releaseDataBuf(0);
        fYO = -1;
        AppMethodBeat.o(3661);
      }
    }
    finally
    {
      MP4MuxerJNI.releaseDataBuf(0);
      fYO = -1;
      AppMethodBeat.o(3661);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.h
 * JD-Core Version:    0.6.2
 */