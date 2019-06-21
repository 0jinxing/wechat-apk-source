package com.tencent.mm.bj;

import android.graphics.Point;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class h
  implements a.a
{
  private static int fYO = -1;
  private static int fYQ = 1;
  long bqO;
  long eTA;
  int eTJ;
  private int eTa;
  MediaExtractor eWb;
  int eWc;
  private int fYA;
  private int fYB;
  private int fYC;
  private int fYD;
  private int fYE;
  h.b fYF;
  Thread fYG;
  private c fYH;
  HandlerThread fYI;
  h.a fYJ;
  VideoTransPara fYK;
  private int fYL;
  String fYM;
  a fYN;
  private MediaFormat fYP;
  private boolean fYu;
  boolean fYv;
  private int fYx;
  private int fYy;
  private int fYz;
  private Object lock;
  int rotate;

  public h(int paramInt)
  {
    AppMethodBeat.i(50949);
    this.bqO = -1L;
    this.eTA = -1L;
    this.fYv = false;
    this.fYL = 0;
    this.lock = new byte[0];
    this.eTJ = -1;
    this.fYu = false;
    ab.i("MicroMsg.VideoTranscoder", "create VideoTranscoder: %s", new Object[] { Integer.valueOf(paramInt) });
    this.eTa = paramInt;
    AppMethodBeat.o(50949);
  }

  private static int ms(int paramInt)
  {
    AppMethodBeat.i(50953);
    int i = paramInt % 16;
    if (i == 0)
      AppMethodBeat.o(50953);
    while (true)
    {
      return paramInt;
      int j = paramInt - Math.min(16, i);
      if (j < 2147483647)
      {
        AppMethodBeat.o(50953);
        paramInt = j;
      }
      else
      {
        paramInt -= i;
        AppMethodBeat.o(50953);
      }
    }
  }

  private static Point v(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Point localPoint = null;
    AppMethodBeat.i(50952);
    ab.d("MicroMsg.VideoTranscoder", "scale() called with: decoderOutputWidth = [" + paramInt1 + "], decoderOutputHeight = [" + paramInt2 + "], specWidth = [" + paramInt3 + "], specHeight = [" + paramInt4 + "]");
    if ((paramInt1 <= paramInt3) && (paramInt2 <= paramInt4))
    {
      ab.i("MicroMsg.VideoTranscoder", "calc scale, small or equal to spec size");
      AppMethodBeat.o(50952);
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
        ab.i("MicroMsg.VideoTranscoder", "calc scale, same len divide by 16, no need scale");
        AppMethodBeat.o(50952);
      }
      else if ((i / 2 == k) && (j / 2 == m))
      {
        ab.i("MicroMsg.VideoTranscoder", "calc scale, double ratio");
        paramInt4 = paramInt1 / 2;
        paramInt3 = paramInt2 / 2;
        paramInt1 = paramInt4;
        if (paramInt4 % 2 != 0)
          paramInt1 = paramInt4 + 1;
        paramInt2 = paramInt3;
        if (paramInt3 % 2 != 0)
          paramInt2 = paramInt3 + 1;
        localPoint = new Point(paramInt1, paramInt2);
        AppMethodBeat.o(50952);
      }
      else
      {
        i /= 2;
        j /= 2;
        if ((i % 16 != 0) || (Math.abs(i - k) >= 16) || (j % 16 != 0) || (Math.abs(j - m) >= 16))
          break;
        ab.i("MicroMsg.VideoTranscoder", "calc scale, double ratio divide by 16");
        paramInt4 = paramInt1 / 2;
        paramInt3 = paramInt2 / 2;
        paramInt1 = paramInt4;
        if (paramInt4 % 2 != 0)
          paramInt1 = paramInt4 + 1;
        paramInt2 = paramInt3;
        if (paramInt3 % 2 != 0)
          paramInt2 = paramInt3 + 1;
        localPoint = new Point(paramInt1, paramInt2);
        AppMethodBeat.o(50952);
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
      ab.i("MicroMsg.VideoTranscoder", "calc scale, outputsize: %s %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      localPoint.x = paramInt2;
      localPoint.y = paramInt3;
      localPoint.x = ms(localPoint.x);
      localPoint.y = ms(localPoint.y);
      AppMethodBeat.o(50952);
      break;
      paramInt3 = Math.min(paramInt3, paramInt4);
      d = paramInt2 * 1.0D / paramInt3;
      paramInt1 = (int)(paramInt1 / d);
      paramInt2 = paramInt3;
    }
  }

  public final int a(MediaFormat paramMediaFormat, boolean paramBoolean)
  {
    AppMethodBeat.i(50950);
    ab.i("MicroMsg.VideoTranscoder", "initDecoder, format: %s, filePath: %s, scaleFrame: %s", new Object[] { paramMediaFormat, this.fYM, Boolean.valueOf(paramBoolean) });
    this.fYP = paramMediaFormat;
    this.fYu = paramBoolean;
    this.fYN = new d(this.eWb, paramMediaFormat, this.eWc);
    int i = this.fYN.i(this.fYM, this.bqO, this.eTA);
    bo.az(bo.yz());
    ab.i("MicroMsg.VideoTranscoder", "init decoder ret: %s", new Object[] { Integer.valueOf(i) });
    int j = i;
    if (i < 0)
      ab.i("MicroMsg.VideoTranscoder", "init mediaCodecDecoder failed, try ffmepg");
    try
    {
      this.fYN.stop();
      this.fYN = null;
      label139: this.fYN = new d(this.eWb, paramMediaFormat, this.eWc);
      j = this.fYN.i(this.fYM, this.bqO, this.eTA);
      this.fYN.a(this);
      ab.i("MicroMsg.VideoTranscoder", "init finish, ret: %d, decoderType: %d", new Object[] { Integer.valueOf(j), Integer.valueOf(fYO) });
      AppMethodBeat.o(50950);
      return j;
    }
    catch (Exception localException)
    {
      break label139;
    }
  }

  public final void a(byte[] paramArrayOfByte, boolean paramBoolean, long paramLong)
  {
    AppMethodBeat.i(50955);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      ab.i("MicroMsg.VideoTranscoder", "onYuvDataImp error data is null!!");
      AppMethodBeat.o(50955);
      return;
    }
    Object localObject1 = this.fYN.alJ();
    this.fYx = ((Point)localObject1).x;
    this.fYy = ((Point)localObject1).y;
    long l = bo.yz();
    int i = 0;
    int j = 0;
    int k;
    int m;
    label245: Object localObject2;
    if (!this.fYu)
    {
      if ((this.fYE <= 0) || (this.fYD <= 0))
      {
        this.fYD = this.fYx;
        this.fYE = this.fYy;
        ab.i("MicroMsg.VideoTranscoder", "scaleYuvTargetWidth: %s, scaleYuvTargetHeight: %s, srcWidth: %s, srcHeight: %s", new Object[] { Integer.valueOf(this.fYD), Integer.valueOf(this.fYE), Integer.valueOf(this.fYx), Integer.valueOf(this.fYy) });
      }
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
          if ((Math.abs(m - ((Point)localObject1).y) <= 0) || (k != ((Point)localObject1).x))
            break label627;
          this.fYB = k;
          this.fYC = m;
          ab.i("MicroMsg.VideoTranscoder", "videoTargetWidth: %s, videoTargetHeight: %s, initWidth: %s, initHeight: %s, videoNeedScale: %s", new Object[] { Integer.valueOf(this.fYB), Integer.valueOf(this.fYC), Integer.valueOf(k), Integer.valueOf(m), Boolean.FALSE });
          j = m;
          i = k;
        }
      }
      label307: this.fYL = this.fYN.alK();
      m = 0;
      if (this.fYv)
      {
        m = MP4MuxerJNI.writeYuvDataForSegmentLock(paramArrayOfByte, ((Point)localObject1).x, ((Point)localObject1).y, this.fYD, this.fYE, this.fYL, i, j);
        ab.i("MicroMsg.VideoTranscoder", "writeYuvDataForSegment used %sms", new Object[] { Long.valueOf(bo.az(l)) });
      }
      if (m < 0)
        ab.e("MicroMsg.VideoTranscoder", "writeYuvDataForSegment error: %s", new Object[] { Integer.valueOf(m) });
      if (!this.fYv)
        break label1024;
      if (this.fYF == null)
      {
        MP4MuxerJNI.initH264EncoderLock(this.fYB, this.fYC, this.fYK.fps, this.fYK.videoBitrate, this.fYK.fzV, 8, this.fYK.fzU, 23.0F);
        this.fYF = new h.b(this, (byte)0);
        this.fYG = com.tencent.mm.sdk.g.d.h(this.fYF, "MediaCodecFFMpegTranscoder_Encoder");
        this.fYG.start();
        ab.i("MicroMsg.VideoTranscoder", "initAndStartEncoderIfNeed, useX264: %s", new Object[] { Boolean.valueOf(this.fYv) });
      }
      label526: if ((!this.fYv) && (this.fYJ != null))
      {
        localObject1 = Message.obtain();
        ((Message)localObject1).what = fYQ;
        localObject2 = b.fXS.g(Integer.valueOf(paramArrayOfByte.length));
        if (localObject2 != null)
          System.arraycopy(paramArrayOfByte, 0, localObject2, 0, paramArrayOfByte.length);
        ((Message)localObject1).obj = localObject2;
        if (!paramBoolean)
          break label1231;
      }
    }
    label706: label964: label1231: for (i = 1; ; i = 0)
      while (true)
      {
        ((Message)localObject1).arg1 = i;
        ((Message)localObject1).arg2 = ((int)paramLong);
        this.fYJ.sendMessage((Message)localObject1);
        AppMethodBeat.o(50955);
        break;
        label627: this.fYB = ((Point)localObject1).x;
        this.fYC = ((Point)localObject1).y;
        break label245;
        boolean bool;
        if ((this.fYE <= 0) || (this.fYD <= 0))
        {
          localObject2 = v(this.fYx, this.fYy, this.fYz, this.fYA);
          if (localObject2 != null)
          {
            this.fYD = ((Point)localObject2).x;
            this.fYE = ((Point)localObject2).y;
            ab.i("MicroMsg.VideoTranscoder", "scaleYuvTargetWidth: %s, scaleYuvTargetHeight: %s, srcWidth: %s, srcHeight: %s", new Object[] { Integer.valueOf(this.fYD), Integer.valueOf(this.fYE), Integer.valueOf(this.fYx), Integer.valueOf(this.fYy) });
          }
        }
        else
        {
          if (this.fYP == null)
            break label307;
          k = this.fYP.getInteger("width");
          m = this.fYP.getInteger("height");
          if (this.fYB > 0)
          {
            i = k;
            j = m;
            if (this.fYC > 0)
              break label307;
          }
          bool = false;
          localObject2 = v(k, m, this.fYz, this.fYA);
          if (localObject2 == null)
            break label964;
          this.fYB = ((Point)localObject2).x;
          this.fYC = ((Point)localObject2).y;
          bool = true;
        }
        while (true)
        {
          if (bool)
          {
            this.fYD = this.fYB;
            this.fYE = this.fYC;
          }
          ab.i("MicroMsg.VideoTranscoder", "videoTargetWidth: %s, videoTargetHeight: %s, initWidth: %s, initHeight: %s, videoNeedScale: %s", new Object[] { Integer.valueOf(this.fYB), Integer.valueOf(this.fYC), Integer.valueOf(k), Integer.valueOf(m), Boolean.valueOf(bool) });
          i = k;
          j = m;
          break;
          this.fYD = this.fYx;
          this.fYE = this.fYy;
          break label706;
          if ((Math.abs(m - ((Point)localObject1).y) > 0) && (k == ((Point)localObject1).x))
          {
            this.fYB = k;
            this.fYC = m;
          }
          else
          {
            this.fYB = ((Point)localObject1).x;
            this.fYC = ((Point)localObject1).y;
          }
        }
        if (this.fYH != null)
          break label526;
        this.fYH = new c(this.fYB, this.fYC, this.fYK.videoBitrate, this.fYK.fps);
        this.fYH.fXU = new h.1(this);
        try
        {
          ab.i("MicroMsg.VideoTranscoder", "init mediaCodecEncoder: %s", new Object[] { Integer.valueOf(this.fYH.mq(this.eTa)) });
          localObject1 = this.fYH;
          ab.i("MicroMsg.MediaCodecTransCodeEncoder", "Start");
          ((c)localObject1).cFy = true;
          if (this.fYI == null)
          {
            this.fYI = com.tencent.mm.sdk.g.d.ek("remuxer_encode", -2);
            this.fYI.start();
            localObject1 = new com/tencent/mm/bj/h$a;
            ((h.a)localObject1).<init>(this, this.fYI.getLooper());
            this.fYJ = ((h.a)localObject1);
          }
          ab.i("MicroMsg.VideoTranscoder", "initAndStartEncoderIfNeed, useX264: %s", new Object[] { Boolean.valueOf(this.fYv) });
        }
        catch (Exception localException)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.VideoTranscoder", localException, "init mediaCodecEncoder error: %s", new Object[] { localException.getMessage() });
        }
      }
  }

  public final void cE(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50951);
    ab.i("MicroMsg.VideoTranscoder", "registerDesiredSize: %s, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.fYz = paramInt1;
    this.fYA = paramInt2;
    AppMethodBeat.o(50951);
  }

  public final void release()
  {
    AppMethodBeat.i(50954);
    ab.i("MicroMsg.VideoTranscoder", "release, decoderType: %d", new Object[] { Integer.valueOf(fYO) });
    try
    {
      if (this.fYN != null)
        this.fYN.stop();
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.VideoTranscoder", "release error: %s", new Object[] { localException.getMessage() });
        MP4MuxerJNI.releaseDataBufLock(0);
        fYO = -1;
        AppMethodBeat.o(50954);
      }
    }
    finally
    {
      MP4MuxerJNI.releaseDataBufLock(0);
      fYO = -1;
      AppMethodBeat.o(50954);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bj.h
 * JD-Core Version:    0.6.2
 */