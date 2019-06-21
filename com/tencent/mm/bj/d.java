package com.tencent.mm.bj;

import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;

public final class d
  implements a
{
  protected long bqO;
  protected MediaExtractor clX;
  protected long eTA;
  protected int eTJ;
  private int eTl;
  protected MediaCodec eTq;
  protected MediaCodec.BufferInfo eTy;
  protected int eWc;
  protected String fUM;
  protected a.a fYb;
  protected MediaFormat fYc;
  private byte[] fYd;
  private int frameCount;
  protected int sampleSize;

  public d(MediaExtractor paramMediaExtractor, MediaFormat paramMediaFormat, int paramInt)
  {
    AppMethodBeat.i(50908);
    this.fUM = null;
    this.eTy = new MediaCodec.BufferInfo();
    this.frameCount = 0;
    this.eTl = -1;
    ab.i("MicroMsg.MediaCodecTranscodeDecoder", "create MediaCodecTranscodeDecoder: %s, %s, %s", new Object[] { paramMediaExtractor, paramMediaFormat, Integer.valueOf(paramInt) });
    this.clX = paramMediaExtractor;
    this.fYc = paramMediaFormat;
    this.eWc = paramInt;
    AppMethodBeat.o(50908);
  }

  private boolean UF()
  {
    AppMethodBeat.i(50912);
    boolean bool;
    if (this.eTq == null)
    {
      ab.e("MicroMsg.MediaCodecTranscodeDecoder", "drainDecoder, decoder is null");
      bool = true;
      AppMethodBeat.o(50912);
    }
    Object localObject;
    int i;
    while (true)
    {
      return bool;
      localObject = this.eTq.getOutputBuffers();
      ab.i("MicroMsg.MediaCodecTranscodeDecoder", "decoderOutputByteBuffers length: %s", new Object[] { Integer.valueOf(localObject.length) });
      i = this.eTq.dequeueOutputBuffer(this.eTy, 60000L);
      ab.i("MicroMsg.MediaCodecTranscodeDecoder", "outputBufferIndex-->".concat(String.valueOf(i)));
      label84: if (i != -1)
        break;
      ab.i("MicroMsg.MediaCodecTranscodeDecoder", "no output from decoder available, break");
      label96: bool = false;
      AppMethodBeat.o(50912);
    }
    if (i == -3)
    {
      localObject = this.eTq.getOutputBuffers();
      ab.i("MicroMsg.MediaCodecTranscodeDecoder", "decoder output buffers changed");
    }
    while (true)
    {
      while (true)
      {
        int j = this.eTq.dequeueOutputBuffer(this.eTy, 60000L);
        i = j;
        if (j >= 0)
          break label84;
        break label96;
        if (i == -2)
        {
          this.fYc = this.eTq.getOutputFormat();
          ab.i("MicroMsg.MediaCodecTranscodeDecoder", "decoder output format changed: " + this.fYc);
        }
        else if (i < 0)
        {
          ab.w("MicroMsg.MediaCodecTranscodeDecoder", "unexpected result from decoder.dequeueOutputBuffer: ".concat(String.valueOf(i)));
        }
        else
        {
          ab.v("MicroMsg.MediaCodecTranscodeDecoder", "perform decoding");
          a.a locala = localObject[i];
          if (locala == null)
            break label96;
          long l1 = this.eTy.presentationTimeUs;
          if ((l1 < this.bqO * 1000L) && ((this.eTy.flags & 0x4) == 0))
          {
            this.eTq.releaseOutputBuffer(i, false);
            ab.i("MicroMsg.MediaCodecTranscodeDecoder", "decoder pts: %s, not reach start: %s", new Object[] { Long.valueOf(l1), Long.valueOf(this.bqO * 1000L) });
            bool = false;
            AppMethodBeat.o(50912);
            break;
          }
          if (this.eTy.size == 0)
            break label725;
          locala.position(this.eTy.offset);
          locala.limit(this.eTy.offset + this.eTy.size);
          long l2 = bo.yz();
          localObject = this.eTy;
          if (locala == null)
            ab.e("MicroMsg.MediaCodecTranscodeDecoder", "processDecodeOutputBuffer error! byteBuffer is null");
          while (true)
          {
            ab.v("MicroMsg.MediaCodecTranscodeDecoder", "processDecodeOutputBuffer %s", new Object[] { Long.valueOf(bo.az(l2)) });
            this.eTq.releaseOutputBuffer(i, false);
            if ((this.eTA != 1L) && (l1 >= this.eTA * 1000L))
            {
              ab.e("MicroMsg.MediaCodecTranscodeDecoder", "exceed endTimeMs");
              bool = true;
              AppMethodBeat.o(50912);
              break;
              this.frameCount += 1;
              if ((this.eTJ > 1) && (this.frameCount % this.eTJ == 0))
                continue;
              if (this.fYd == null)
                this.fYd = new byte[locala.remaining()];
              long l3 = bo.yz();
              try
              {
                this.fYc = this.eTq.getOutputFormat();
                locala.get(this.fYd, 0, locala.remaining());
                ab.i("MicroMsg.MediaCodecTranscodeDecoder", "processDecodeOutputBuffer, byteBuffer: %s, bufferInfo: %s, size: %d cost %d", new Object[] { locala, localObject, Integer.valueOf(((MediaCodec.BufferInfo)localObject).size), Long.valueOf(bo.az(l3)) });
                if (this.fYb != null)
                {
                  locala = this.fYb;
                  byte[] arrayOfByte = this.fYd;
                  if ((((MediaCodec.BufferInfo)localObject).flags & 0x4) != 0)
                  {
                    bool = true;
                    locala.a(arrayOfByte, bool, ((MediaCodec.BufferInfo)localObject).presentationTimeUs);
                  }
                }
              }
              catch (Exception localException2)
              {
                while (true)
                {
                  ab.e("MicroMsg.MediaCodecTranscodeDecoder", "get output format error");
                  continue;
                  bool = false;
                }
              }
            }
          }
          if ((this.eTy.flags & 0x4) != 0)
          {
            ab.i("MicroMsg.MediaCodecTranscodeDecoder", "receive end of stream");
            try
            {
              this.eTq.stop();
              this.eTq.release();
              this.eTq = null;
              bool = true;
              AppMethodBeat.o(50912);
            }
            catch (Exception localException1)
            {
              while (true)
                ab.e("MicroMsg.MediaCodecTranscodeDecoder", "stop and release decoder error: %s", new Object[] { localException1.getMessage() });
            }
          }
        }
      }
      bool = false;
      AppMethodBeat.o(50912);
      break;
      label725: this.eTq.releaseOutputBuffer(i, false);
    }
  }

  private static int a(MediaCodecInfo paramMediaCodecInfo, String paramString)
  {
    AppMethodBeat.i(50911);
    ab.i("MicroMsg.MediaCodecTranscodeDecoder", "selectColorFormat, mimeType: %s, codecInfo: %s", new Object[] { paramString, paramMediaCodecInfo });
    long l = bo.yz();
    paramString = paramMediaCodecInfo.getCapabilitiesForType(paramString);
    ab.i("MicroMsg.MediaCodecTranscodeDecoder", "getCapabilitiesForType used %sms", new Object[] { Long.valueOf(bo.az(l)) });
    ab.i("MicroMsg.MediaCodecTranscodeDecoder", "color format length: %s", new Object[] { Integer.valueOf(paramString.colorFormats.length) });
    int i = 0;
    int j = 0;
    if (i < paramString.colorFormats.length)
    {
      int k = paramString.colorFormats[i];
      ab.i("MicroMsg.MediaCodecTranscodeDecoder", "capabilities colorFormat: %s", new Object[] { Integer.valueOf(k) });
      switch (k)
      {
      case 20:
      default:
      case 19:
      case 21:
      }
      for (int m = 0; ; m = 1)
      {
        int n = j;
        if (m != 0)
          if (k <= j)
          {
            n = j;
            if (k != 21);
          }
          else
          {
            n = k;
          }
        i++;
        j = n;
        break;
      }
    }
    ab.i("MicroMsg.MediaCodecTranscodeDecoder", "codec: %s, colorFormat: %s", new Object[] { paramMediaCodecInfo.getName(), Integer.valueOf(j) });
    AppMethodBeat.o(50911);
    return j;
  }

  private static MediaCodecInfo selectCodec(String paramString)
  {
    AppMethodBeat.i(50910);
    int i = MediaCodecList.getCodecCount();
    int j = 0;
    int k;
    if (j < i)
    {
      MediaCodecInfo localMediaCodecInfo = MediaCodecList.getCodecInfoAt(j);
      if (!localMediaCodecInfo.isEncoder())
      {
        String[] arrayOfString = localMediaCodecInfo.getSupportedTypes();
        k = 0;
        label38: if (k < arrayOfString.length)
          if (arrayOfString[k].equalsIgnoreCase(paramString))
          {
            AppMethodBeat.o(50910);
            paramString = localMediaCodecInfo;
          }
      }
    }
    while (true)
    {
      return paramString;
      k++;
      break label38;
      j++;
      break;
      paramString = null;
      AppMethodBeat.o(50910);
    }
  }

  public final void a(a.a parama)
  {
    this.fYb = parama;
  }

  public final Point alJ()
  {
    AppMethodBeat.i(50915);
    Point localPoint = new Point(this.fYc.getInteger("width"), this.fYc.getInteger("height"));
    AppMethodBeat.o(50915);
    return localPoint;
  }

  public final int alK()
  {
    int i = 1;
    AppMethodBeat.i(50914);
    ab.i("MicroMsg.MediaCodecTranscodeDecoder", "src color format: %s", new Object[] { Integer.valueOf(this.eTl) });
    switch (this.eTl)
    {
    default:
      AppMethodBeat.o(50914);
    case 19:
    case 21:
    case 2130706688:
    }
    while (true)
    {
      return i;
      i = 2;
      AppMethodBeat.o(50914);
      continue;
      AppMethodBeat.o(50914);
    }
  }

  public final int i(String paramString, long paramLong1, long paramLong2)
  {
    int i = 0;
    AppMethodBeat.i(50909);
    this.fUM = paramString;
    this.bqO = paramLong1;
    this.eTA = paramLong2;
    ab.i("MicroMsg.MediaCodecTranscodeDecoder", "initDecoder() called with: format = [" + this.fYc + "]");
    try
    {
      String str = this.fYc.getString("mime");
      this.eTq = MediaCodec.createDecoderByType(str);
      paramString = selectCodec(str);
      ab.i("MicroMsg.MediaCodecTranscodeDecoder", "found codec: %s", new Object[] { paramString });
      if (paramString != null)
      {
        ab.i("MicroMsg.MediaCodecTranscodeDecoder", "codec name: %s", new Object[] { paramString.getName() });
        this.eTl = a(paramString, str);
        ab.i("MicroMsg.MediaCodecTranscodeDecoder", "found colorFormat: %s", new Object[] { Integer.valueOf(this.eTl) });
        this.fYc.setInteger("color-format", this.eTl);
      }
      this.eTq.configure(this.fYc, null, null, 0);
      this.eTq.start();
      AppMethodBeat.o(50909);
      return i;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MediaCodecTranscodeDecoder", paramString, "Init decoder failed : %s", new Object[] { paramString.getMessage() });
        i = -1;
        AppMethodBeat.o(50909);
      }
    }
  }

  public final void mp(int paramInt)
  {
    AppMethodBeat.i(50917);
    ab.i("MicroMsg.MediaCodecTranscodeDecoder", "setFrameDropInterval: %s", new Object[] { Integer.valueOf(paramInt) });
    this.eTJ = paramInt;
    AppMethodBeat.o(50917);
  }

  public final void stop()
  {
    AppMethodBeat.i(50916);
    if (this.eTq != null);
    while (true)
    {
      try
      {
        ab.i("MicroMsg.MediaCodecTranscodeDecoder", "stop decoder");
        this.eTq.stop();
        this.eTq.release();
        this.eTq = null;
        AppMethodBeat.o(50916);
        return;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.MediaCodecTranscodeDecoder", localException, "stop decoder error: %s", new Object[] { localException.getMessage() });
      }
      AppMethodBeat.o(50916);
    }
  }

  public final void z(Runnable paramRunnable)
  {
    AppMethodBeat.i(50913);
    this.frameCount = 0;
    Object localObject1 = this.clX;
    if (this.eTq == null)
      ab.i("MicroMsg.MediaCodecTranscodeDecoder", "input decoder is null");
    Object localObject2;
    long l;
    for (boolean bool1 = true; ; bool1 = false)
    {
      if (!bool1)
      {
        this.clX.advance();
        if (this.clX.getSampleTrackIndex() == this.eWc)
          break;
        ab.i("MicroMsg.MediaCodecTranscodeDecoder", "track index not match, break");
      }
      localObject1 = this.clX;
      ab.i("MicroMsg.MediaCodecTranscodeDecoder", "sendDecoderEOS");
      localObject2 = this.eTq.getInputBuffers();
      i = this.eTq.dequeueInputBuffer(60000L);
      if (i < 0)
      {
        ab.i("MicroMsg.MediaCodecTranscodeDecoder", "check decoder input buffer index = %d count = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(0) });
        if (UF());
      }
      else
      {
        if (i >= 0)
        {
          localObject2 = localObject2[i];
          ((ByteBuffer)localObject2).clear();
          this.sampleSize = ((MediaExtractor)localObject1).readSampleData((ByteBuffer)localObject2, 0);
          ((ByteBuffer)localObject2).position(0);
          l = ((MediaExtractor)localObject1).getSampleTime();
          if (i < 0)
            break label570;
          ab.i("MicroMsg.MediaCodecTranscodeDecoder", "send EOS, decoderInputBufferIndex: %s", new Object[] { Integer.valueOf(i) });
          this.eTq.queueInputBuffer(i, 0, 0, l * 1000L, 4);
        }
        label225: UF();
      }
      al.n(new d.1(this), 500L);
      paramRunnable.run();
      AppMethodBeat.o(50913);
      return;
      localObject2 = this.eTq.getInputBuffers();
      if (localObject2 != null)
        break label276;
    }
    label276: ab.i("MicroMsg.MediaCodecTranscodeDecoder", "decoderInputByteBuffers size: %d", new Object[] { Integer.valueOf(localObject2.length) });
    int j;
    for (int i = 0; ; i++)
    {
      j = this.eTq.dequeueInputBuffer(60000L);
      if ((j >= 0) || (i >= 15))
        break label372;
      l = bo.yz();
      bool1 = UF();
      ab.i("MicroMsg.MediaCodecTranscodeDecoder", "drain cost1 %d", new Object[] { Long.valueOf(bo.az(l)) });
      if (bool1)
      {
        bool1 = true;
        break;
      }
    }
    label372: if (j >= 0)
    {
      localObject2 = localObject2[j];
      ((ByteBuffer)localObject2).clear();
      this.sampleSize = ((MediaExtractor)localObject1).readSampleData((ByteBuffer)localObject2, 0);
      ((ByteBuffer)localObject2).position(0);
      l = ((MediaExtractor)localObject1).getSampleTime();
      ab.i("MicroMsg.MediaCodecTranscodeDecoder", "sampleTime: %s", new Object[] { Long.valueOf(l) });
      if ((this.sampleSize >= 0) && (l < this.eTA * 1000L))
        break label581;
    }
    label570: label581: for (bool1 = true; ; bool1 = false)
    {
      ab.i("MicroMsg.MediaCodecTranscodeDecoder", "sawInputEOS: %s", new Object[] { Boolean.valueOf(bool1) });
      localObject1 = this.eTq;
      int k = this.sampleSize;
      if (bool1)
      {
        i = 4;
        label494: ((MediaCodec)localObject1).queueInputBuffer(j, 0, k, l, i);
      }
      while (true)
      {
        l = bo.yz();
        boolean bool2 = UF();
        ab.i("MicroMsg.MediaCodecTranscodeDecoder", "drain cost2 %d", new Object[] { Long.valueOf(bo.az(l)) });
        if (!bool2)
          break;
        bool1 = true;
        break;
        i = 0;
        break label494;
        ab.w("MicroMsg.MediaCodecTranscodeDecoder", "input buffer not available");
        bool1 = false;
      }
      ab.w("MicroMsg.MediaCodecTranscodeDecoder", "input buffer not available");
      break label225;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bj.d
 * JD-Core Version:    0.6.2
 */