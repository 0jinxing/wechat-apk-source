package com.tencent.mm.plugin.mmsight.model.b;

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

public final class e
  implements a
{
  protected long bqO;
  protected MediaExtractor clX;
  protected long eTA;
  protected int eTJ;
  protected MediaCodec eTq;
  protected MediaCodec.BufferInfo eTy;
  protected int eWc;
  protected String fUM;
  protected MediaFormat fYc;
  private byte[] fYd;
  private int frameCount;
  protected h oxp;
  private boolean oxs;
  protected int sampleSize;

  public e()
  {
    AppMethodBeat.i(76705);
    this.fUM = null;
    this.eTy = new MediaCodec.BufferInfo();
    this.eWc = -1;
    this.frameCount = 0;
    this.oxs = false;
    AppMethodBeat.o(76705);
  }

  private boolean UF()
  {
    AppMethodBeat.i(76709);
    boolean bool;
    if (this.eTq == null)
    {
      ab.e("MicroMsg.MMSightRemuxMediaCodecDecoder", "drainDecoder, decoder is null");
      bool = true;
      AppMethodBeat.o(76709);
    }
    Object localObject;
    int i;
    while (true)
    {
      return bool;
      localObject = this.eTq.getOutputBuffers();
      ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "decoderOutputByteBuffers length: %s", new Object[] { Integer.valueOf(localObject.length) });
      i = this.eTq.dequeueOutputBuffer(this.eTy, 60000L);
      ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "outputBufferIndex-->".concat(String.valueOf(i)));
      label84: if (i != -1)
        break;
      ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "no output from decoder available, break");
      label96: bool = false;
      AppMethodBeat.o(76709);
    }
    if (i == -3)
    {
      localObject = this.eTq.getOutputBuffers();
      ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "decoder output buffers changed");
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
          ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "decoder output format changed: " + this.fYc);
        }
        else if (i < 0)
        {
          ab.w("MicroMsg.MMSightRemuxMediaCodecDecoder", "unexpected result from decoder.dequeueOutputBuffer: ".concat(String.valueOf(i)));
        }
        else
        {
          ab.v("MicroMsg.MMSightRemuxMediaCodecDecoder", "perform decoding");
          h localh = localObject[i];
          if (localh == null)
            break label96;
          long l1 = this.eTy.presentationTimeUs;
          if ((l1 < this.bqO * 1000L) && ((this.eTy.flags & 0x4) == 0))
          {
            this.eTq.releaseOutputBuffer(i, false);
            ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "decoder pts: %s, not reach start: %s", new Object[] { Long.valueOf(l1), Long.valueOf(this.bqO * 1000L) });
            bool = false;
            AppMethodBeat.o(76709);
            break;
          }
          if (this.eTy.size == 0)
            break label783;
          localh.position(this.eTy.offset);
          localh.limit(this.eTy.offset + this.eTy.size);
          long l2 = bo.yz();
          localObject = this.eTy;
          if (localh == null)
            ab.e("MicroMsg.MMSightRemuxMediaCodecDecoder", "processDecodeOutputBuffer error! byteBuffer is null");
          while (true)
          {
            ab.v("MicroMsg.MMSightRemuxMediaCodecDecoder", "processDecodeOutputBuffer %s", new Object[] { Long.valueOf(bo.az(l2)) });
            this.eTq.releaseOutputBuffer(i, false);
            if ((this.eTA != 1L) && (l1 >= this.eTA * 1000L))
            {
              ab.e("MicroMsg.MMSightRemuxMediaCodecDecoder", "exceed endTimeMs");
              this.oxs = true;
              bool = true;
              AppMethodBeat.o(76709);
              break;
              this.frameCount += 1;
              if ((this.eTJ > 1) && (this.frameCount % this.eTJ == 0))
                continue;
              if (this.fYd == null)
                this.fYd = new byte[localh.remaining()];
              long l3 = bo.yz();
              try
              {
                this.fYc = this.eTq.getOutputFormat();
                localh.get(this.fYd, 0, localh.remaining());
                ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "processDecodeOutputBuffer, byteBuffer: %s, bufferInfo: %s, size: %d cost %d", new Object[] { localh, localObject, Integer.valueOf(((MediaCodec.BufferInfo)localObject).size), Long.valueOf(bo.az(l3)) });
                if (this.oxp != null)
                  if ((this.eTA != 1L) && (((MediaCodec.BufferInfo)localObject).presentationTimeUs >= this.eTA * 1000L))
                  {
                    j = 1;
                    localh = this.oxp;
                    byte[] arrayOfByte = this.fYd;
                    if ((this.fYd != null) && (!this.oxs) && (j == 0))
                      break label693;
                    bool = true;
                    localh.a(arrayOfByte, bool, ((MediaCodec.BufferInfo)localObject).presentationTimeUs / 1000L);
                  }
              }
              catch (Exception localException2)
              {
                while (true)
                {
                  ab.e("MicroMsg.MMSightRemuxMediaCodecDecoder", "get output format error");
                  continue;
                  j = 0;
                  continue;
                  label693: bool = false;
                }
              }
            }
          }
          if ((this.eTy.flags & 0x4) != 0)
          {
            ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "receive end of stream");
            try
            {
              this.eTq.stop();
              this.eTq.release();
              this.oxs = true;
              this.eTq = null;
              bool = true;
              AppMethodBeat.o(76709);
            }
            catch (Exception localException1)
            {
              while (true)
                ab.e("MicroMsg.MMSightRemuxMediaCodecDecoder", "stop and release decoder error: %s", new Object[] { localException1.getMessage() });
            }
          }
        }
      }
      bool = false;
      AppMethodBeat.o(76709);
      break;
      label783: this.eTq.releaseOutputBuffer(i, false);
    }
  }

  private static int a(MediaCodecInfo paramMediaCodecInfo, String paramString)
  {
    AppMethodBeat.i(76708);
    ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "selectColorFormat, mimeType: %s, codecInfo: %s", new Object[] { paramString, paramMediaCodecInfo });
    long l = bo.yz();
    paramString = paramMediaCodecInfo.getCapabilitiesForType(paramString);
    ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "getCapabilitiesForType used %sms", new Object[] { Long.valueOf(bo.az(l)) });
    ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "color format length: %s", new Object[] { Integer.valueOf(paramString.colorFormats.length) });
    int i = 0;
    int j = 0;
    if (i < paramString.colorFormats.length)
    {
      int k = paramString.colorFormats[i];
      ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "capabilities colorFormat: %s", new Object[] { Integer.valueOf(k) });
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
    ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "codec: %s, colorFormat: %s", new Object[] { paramMediaCodecInfo.getName(), Integer.valueOf(j) });
    AppMethodBeat.o(76708);
    return j;
  }

  private static MediaCodecInfo selectCodec(String paramString)
  {
    AppMethodBeat.i(76707);
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
            AppMethodBeat.o(76707);
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
      AppMethodBeat.o(76707);
    }
  }

  public final void a(h paramh)
  {
    this.oxp = paramh;
  }

  public final Point alJ()
  {
    AppMethodBeat.i(76712);
    Point localPoint = new Point(this.fYc.getInteger("width"), this.fYc.getInteger("height"));
    AppMethodBeat.o(76712);
    return localPoint;
  }

  public final int alK()
  {
    int i = 1;
    AppMethodBeat.i(76711);
    int j = this.fYc.getInteger("color-format");
    ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "src color format: %s", new Object[] { Integer.valueOf(j) });
    switch (j)
    {
    default:
      AppMethodBeat.o(76711);
    case 19:
    case 21:
    case 2130706688:
    }
    while (true)
    {
      return i;
      i = 2;
      AppMethodBeat.o(76711);
      continue;
      AppMethodBeat.o(76711);
    }
  }

  public final void bPZ()
  {
    AppMethodBeat.i(76710);
    this.frameCount = 0;
    this.oxs = false;
    Object localObject1 = this.clX;
    if (this.eTq == null)
      ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "input decoder is null");
    Object localObject2;
    long l;
    for (boolean bool1 = true; ; bool1 = false)
    {
      if (!bool1)
      {
        this.clX.advance();
        if (this.clX.getSampleTrackIndex() == this.eWc)
          break;
        ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "track index not match, break");
      }
      localObject1 = this.clX;
      ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "sendDecoderEOS");
      localObject2 = this.eTq.getInputBuffers();
      i = this.eTq.dequeueInputBuffer(60000L);
      if (i < 0)
      {
        ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "check decoder input buffer index = %d count = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(0) });
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
            break label567;
          ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "send EOS, decoderInputBufferIndex: %s", new Object[] { Integer.valueOf(i) });
          this.eTq.queueInputBuffer(i, 0, 0, l * 1000L, 4);
        }
        label224: this.oxs = true;
        UF();
      }
      al.n(new e.1(this), 500L);
      this.clX.release();
      AppMethodBeat.o(76710);
      return;
      localObject2 = this.eTq.getInputBuffers();
      if (localObject2 != null)
        break label279;
    }
    label279: ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "decoderInputByteBuffers size: %d", new Object[] { Integer.valueOf(localObject2.length) });
    int j;
    for (int i = 0; ; i++)
    {
      j = this.eTq.dequeueInputBuffer(60000L);
      if ((j >= 0) || (i >= 15))
        break label374;
      l = bo.yz();
      bool1 = UF();
      ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "drain cost1 %d", new Object[] { Long.valueOf(bo.az(l)) });
      if (bool1)
      {
        bool1 = true;
        break;
      }
    }
    label374: if (j >= 0)
    {
      localObject2 = localObject2[j];
      ((ByteBuffer)localObject2).clear();
      this.sampleSize = ((MediaExtractor)localObject1).readSampleData((ByteBuffer)localObject2, 0);
      ((ByteBuffer)localObject2).position(0);
      l = ((MediaExtractor)localObject1).getSampleTime();
      ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "sampleTime: %s", new Object[] { Long.valueOf(l) });
      if ((this.sampleSize >= 0) && (l < this.eTA * 1000L))
        break label578;
    }
    label567: label578: for (bool1 = true; ; bool1 = false)
    {
      ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "sawInputEOS: %s", new Object[] { Boolean.valueOf(bool1) });
      localObject1 = this.eTq;
      int k = this.sampleSize;
      if (bool1)
      {
        i = 4;
        label491: ((MediaCodec)localObject1).queueInputBuffer(j, 0, k, l, i);
      }
      while (true)
      {
        l = bo.yz();
        boolean bool2 = UF();
        ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "drain cost2 %d", new Object[] { Long.valueOf(bo.az(l)) });
        if (!bool2)
          break;
        bool1 = true;
        break;
        i = 0;
        break label491;
        ab.w("MicroMsg.MMSightRemuxMediaCodecDecoder", "input buffer not available");
        bool1 = false;
      }
      ab.w("MicroMsg.MMSightRemuxMediaCodecDecoder", "input buffer not available");
      break label224;
    }
  }

  public final int e(String paramString, long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(76706);
    if (!bo.isNullOrNil(paramString))
      ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "initDecoder, srcFilePath: %s, startTime: %s, endTime: %s, videoFps: %s", new Object[] { paramString, Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt) });
    while (true)
    {
      try
      {
        Object localObject = new android/media/MediaExtractor;
        ((MediaExtractor)localObject).<init>();
        this.clX = ((MediaExtractor)localObject);
        this.clX.setDataSource(paramString);
        paramInt = 0;
        if (paramInt < this.clX.getTrackCount())
        {
          localObject = this.clX.getTrackFormat(paramInt);
          if (((MediaFormat)localObject).getString("mime").toLowerCase().startsWith("video/"))
          {
            this.eWc = paramInt;
            this.fYc = ((MediaFormat)localObject);
          }
        }
        else
        {
          paramInt = this.eWc;
          if (paramInt >= 0)
            continue;
          paramInt = -1;
          AppMethodBeat.o(76706);
          return paramInt;
        }
        paramInt++;
        continue;
        this.fUM = paramString;
        this.bqO = paramLong1;
        this.eTA = paramLong2;
        this.clX.selectTrack(this.eWc);
        paramString = this.fYc.getString("mime");
        this.eTq = MediaCodec.createDecoderByType(paramString);
        localObject = selectCodec(paramString);
        ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "found codec: %s", new Object[] { localObject });
        if (localObject != null)
        {
          ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "codec name: %s", new Object[] { ((MediaCodecInfo)localObject).getName() });
          paramInt = a((MediaCodecInfo)localObject, paramString);
          ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "found colorFormat: %s", new Object[] { Integer.valueOf(paramInt) });
          this.fYc.setInteger("color-format", paramInt);
        }
        this.eTq.configure(this.fYc, null, null, 0);
        this.eTq.start();
        paramInt = 0;
        AppMethodBeat.o(76706);
        continue;
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.MMSightRemuxMediaCodecDecoder", paramString, "Init decoder failed : %s", new Object[] { paramString.getMessage() });
        paramInt = -1;
        AppMethodBeat.o(76706);
        continue;
      }
      paramInt = -1;
      AppMethodBeat.o(76706);
    }
  }

  public final void mp(int paramInt)
  {
    AppMethodBeat.i(76713);
    ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "setFrameDropInterval: %s", new Object[] { Integer.valueOf(paramInt) });
    this.eTJ = paramInt;
    AppMethodBeat.o(76713);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.b.e
 * JD-Core Version:    0.6.2
 */