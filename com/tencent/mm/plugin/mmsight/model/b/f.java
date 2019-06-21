package com.tencent.mm.plugin.mmsight.model.b;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.EncoderCapabilities;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.mmsight.model.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;

public final class f
{
  private ByteBuffer[] aQJ;
  private int bitrate;
  boolean cFy;
  private boolean cpc;
  protected int eTa;
  int eTi;
  int eTj;
  private int eTk;
  int eTl;
  private int eTm;
  private MediaCodec.BufferInfo eTy;
  protected MediaCodec eVq;
  int fXV;
  private int fXW;
  private int fXX;
  private boolean fXY;
  byte[] fXZ;
  int fYa;
  int frameCount;
  private int gLw;
  private int gLx;
  private ByteBuffer[] inputBuffers;
  protected MediaFormat mediaFormat;
  a oxu;

  public f(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    AppMethodBeat.i(76715);
    this.eTa = -1;
    this.fXW = -1;
    this.fXX = -1;
    this.bitrate = 0;
    this.cFy = false;
    this.cpc = false;
    this.fXY = false;
    this.gLw = paramInt1;
    this.gLx = paramInt2;
    ab.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "create MMSightRemuxMediaCodecEncoder, init targetWidth: %d, targetHeight: %d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    this.eTi = paramInt3;
    this.eTj = paramInt4;
    this.eTk = paramInt6;
    this.eTm = 1;
    this.eTy = new MediaCodec.BufferInfo();
    this.bitrate = paramInt5;
    ab.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "create MMSightRemuxMediaCodecEncoder, frameWidth: %s, frameHeight: %s, targetWidth: %s, targetHeight: %s, bitrate: %s", new Object[] { Integer.valueOf(this.gLw), Integer.valueOf(this.gLx), Integer.valueOf(this.eTi), Integer.valueOf(this.eTj), Integer.valueOf(paramInt5) });
    AppMethodBeat.o(76715);
  }

  private void UR()
  {
    AppMethodBeat.i(76721);
    this.fXX = this.eVq.dequeueOutputBuffer(this.eTy, 600L);
    ab.v("MicroMsg.MMSightRemuxMediaCodecEncoder", "outputBufferIndex-->" + this.fXX);
    while (this.fXX == -1)
    {
      ab.d("MicroMsg.MMSightRemuxMediaCodecEncoder", "no output from encoder available, break encoderEndStream %s", new Object[] { Boolean.valueOf(this.fXY) });
      if (this.fXY)
      {
        this.fXX = this.eVq.dequeueOutputBuffer(this.eTy, 600L);
        if (this.fXX <= 0)
          ab.v("MicroMsg.MMSightRemuxMediaCodecEncoder", "get outputBufferIndex %d", new Object[] { Integer.valueOf(this.fXX) });
        if ((this.fXX >= 0) || (this.fXY))
          break;
      }
      else
      {
        AppMethodBeat.o(76721);
      }
    }
    while (true)
    {
      return;
      if (this.fXX == -3)
      {
        this.aQJ = this.eVq.getOutputBuffers();
        ab.d("MicroMsg.MMSightRemuxMediaCodecEncoder", "encoder output buffers changed");
        break;
      }
      if (this.fXX == -2)
      {
        ab.d("MicroMsg.MMSightRemuxMediaCodecEncoder", "encoder output format changed: ".concat(String.valueOf(this.eVq.getOutputFormat())));
        break;
      }
      if (this.fXX < 0)
      {
        ab.w("MicroMsg.MMSightRemuxMediaCodecEncoder", "unexpected result from encoder.dequeueOutputBuffer: " + this.fXX);
        break;
      }
      ab.v("MicroMsg.MMSightRemuxMediaCodecEncoder", "perform encoding");
      Object localObject = this.aQJ[this.fXX];
      if (localObject == null)
      {
        localObject = new RuntimeException("encoderOutputBuffer " + this.fXX + " was null");
        AppMethodBeat.o(76721);
        throw ((Throwable)localObject);
      }
      this.frameCount += 1;
      if ((this.eTy.flags & 0x2) != 0)
        ab.v("MicroMsg.MMSightRemuxMediaCodecEncoder", "ignoring BUFFER_FLAG_CODEC_CONFIG, size: %s, %s", new Object[] { Integer.valueOf(this.eTy.size), Boolean.FALSE });
      if (this.eTy.size != 0)
      {
        ((ByteBuffer)localObject).position(this.eTy.offset);
        ((ByteBuffer)localObject).limit(this.eTy.offset + this.eTy.size);
        g((ByteBuffer)localObject, this.eTy);
      }
      this.eVq.releaseOutputBuffer(this.fXX, false);
      if ((this.eTy.flags & 0x4) == 0)
        break;
      if (!this.cpc)
      {
        ab.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "reached end of stream unexpectedly");
        AppMethodBeat.o(76721);
      }
      else
      {
        ab.w("MicroMsg.MMSightRemuxMediaCodecEncoder", "do stop encoder, frameCount: %s, writeFrameCount: %s", new Object[] { Integer.valueOf(this.frameCount), Integer.valueOf(this.fXV) });
        try
        {
          this.eVq.stop();
          this.eVq.release();
          this.eVq = null;
          this.cFy = false;
          AppMethodBeat.o(76721);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "do stop encoder error: %s", new Object[] { localException.getMessage() });
          AppMethodBeat.o(76721);
        }
      }
    }
  }

  private static int a(MediaCodecInfo paramMediaCodecInfo, String paramString)
  {
    AppMethodBeat.i(76722);
    long l = bo.yz();
    paramString = paramMediaCodecInfo.getCapabilitiesForType(paramString);
    ab.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "getCapabilitiesForType used %sms", new Object[] { Long.valueOf(bo.az(l)) });
    ab.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "color format length: %s", new Object[] { Integer.valueOf(paramString.colorFormats.length) });
    int i = 0;
    int m;
    for (int j = 0; i < paramString.colorFormats.length; j = m)
    {
      int k = paramString.colorFormats[i];
      ab.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "capabilities colorFormat: %s", new Object[] { Integer.valueOf(k) });
      m = j;
      if (mr(k))
      {
        m = j;
        if (k > j)
        {
          j = k;
          if (k == 19)
            break;
          m = k;
        }
      }
      i++;
    }
    ab.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "codec: %s, colorFormat: %s", new Object[] { paramMediaCodecInfo.getName(), Integer.valueOf(j) });
    AppMethodBeat.o(76722);
    return j;
  }

  private int alL()
  {
    int i = 0;
    AppMethodBeat.i(76717);
    long l = bo.yz();
    MediaCodecInfo localMediaCodecInfo = selectCodec("video/avc");
    if (localMediaCodecInfo == null)
    {
      ab.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "Unable to find an appropriate codec for video/avc");
      k.bPA();
      i = -1;
      AppMethodBeat.o(76717);
      return i;
    }
    ab.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "found codec: %s, used %sms", new Object[] { localMediaCodecInfo.getName(), Long.valueOf(bo.az(l)) });
    l = bo.yz();
    this.eTl = a(localMediaCodecInfo, "video/avc");
    l = bo.az(l);
    ab.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "found colorFormat: %s, used %sms", new Object[] { Integer.valueOf(this.eTl), Long.valueOf(l) });
    if (this.eTl == 19);
    for (this.fYa = 2; ; this.fYa = 1)
    {
      l = bo.yz();
      this.mediaFormat = MediaFormat.createVideoFormat("video/avc", this.eTi, this.eTj);
      ab.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "createVideoFormat used %sms", new Object[] { Long.valueOf(bo.az(l)) });
      if (localMediaCodecInfo != null)
      {
        trySetProfile(localMediaCodecInfo);
        trySetBitRateMode(localMediaCodecInfo);
      }
      this.mediaFormat.setInteger("bitrate", this.bitrate);
      this.mediaFormat.setInteger("frame-rate", this.eTk);
      this.mediaFormat.setInteger("color-format", this.eTl);
      this.mediaFormat.setInteger("i-frame-interval", this.eTm);
      ab.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "mediaFormat: %s", new Object[] { this.mediaFormat });
      this.eVq = MediaCodec.createByCodecName(localMediaCodecInfo.getName());
      this.eVq.configure(this.mediaFormat, null, null, 1);
      this.eVq.start();
      AppMethodBeat.o(76717);
      break;
    }
  }

  private void g(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    AppMethodBeat.i(76714);
    if ((paramByteBuffer != null) && (paramBufferInfo != null) && (this.oxu != null))
      this.oxu.a(this.eTa, paramByteBuffer, paramBufferInfo.size);
    AppMethodBeat.o(76714);
  }

  private static boolean isRecognizedProfile(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 8:
    }
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  private static boolean mr(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 19:
    case 21:
    case 2130706688:
    }
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  private static MediaCodecInfo selectCodec(String paramString)
  {
    AppMethodBeat.i(76723);
    int i = MediaCodecList.getCodecCount();
    int j = 0;
    int k;
    if (j < i)
    {
      MediaCodecInfo localMediaCodecInfo = MediaCodecList.getCodecInfoAt(j);
      if (localMediaCodecInfo.isEncoder())
      {
        String[] arrayOfString = localMediaCodecInfo.getSupportedTypes();
        k = 0;
        label38: if (k < arrayOfString.length)
          if (arrayOfString[k].equalsIgnoreCase(paramString))
          {
            AppMethodBeat.o(76723);
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
      AppMethodBeat.o(76723);
    }
  }

  private void trySetBitRateMode(MediaCodecInfo paramMediaCodecInfo)
  {
    AppMethodBeat.i(76719);
    try
    {
      if (d.iW(21))
      {
        paramMediaCodecInfo = paramMediaCodecInfo.getCapabilitiesForType("video/avc");
        if (paramMediaCodecInfo != null)
        {
          paramMediaCodecInfo = paramMediaCodecInfo.getEncoderCapabilities();
          if (paramMediaCodecInfo != null)
          {
            if (paramMediaCodecInfo.isBitrateModeSupported(2))
            {
              ab.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "support cbr bitrate mode");
              this.mediaFormat.setInteger("bitrate-mode", 2);
              AppMethodBeat.o(76719);
            }
            while (true)
            {
              return;
              if (!paramMediaCodecInfo.isBitrateModeSupported(0))
                break;
              ab.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "support cq bitrate mode");
              this.mediaFormat.setInteger("bitrate-mode", 0);
              AppMethodBeat.o(76719);
            }
          }
        }
      }
    }
    catch (Exception paramMediaCodecInfo)
    {
      while (true)
      {
        ab.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "trySetBitRateMode error: %s", new Object[] { paramMediaCodecInfo.getMessage() });
        AppMethodBeat.o(76719);
        continue;
        ab.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "both cbr and cq bitrate mode not support!");
        AppMethodBeat.o(76719);
      }
    }
  }

  private void trySetProfile(MediaCodecInfo paramMediaCodecInfo)
  {
    AppMethodBeat.i(76718);
    if (d.iW(23));
    while (true)
    {
      try
      {
        paramMediaCodecInfo = paramMediaCodecInfo.getCapabilitiesForType("video/avc");
        if (paramMediaCodecInfo != null)
        {
          MediaCodecInfo.CodecProfileLevel[] arrayOfCodecProfileLevel = paramMediaCodecInfo.profileLevels;
          if (arrayOfCodecProfileLevel != null)
          {
            paramMediaCodecInfo = new android/media/MediaCodecInfo$CodecProfileLevel;
            paramMediaCodecInfo.<init>();
            paramMediaCodecInfo.level = 0;
            paramMediaCodecInfo.profile = 0;
            int i = arrayOfCodecProfileLevel.length;
            int j = 0;
            if (j < i)
            {
              MediaCodecInfo.CodecProfileLevel localCodecProfileLevel = arrayOfCodecProfileLevel[j];
              int k = localCodecProfileLevel.profile;
              int m = localCodecProfileLevel.level;
              ab.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "profile: %s, level: %s", new Object[] { Integer.valueOf(k), Integer.valueOf(m) });
              if ((isRecognizedProfile(k)) && (k >= paramMediaCodecInfo.profile) && (m >= paramMediaCodecInfo.level))
              {
                paramMediaCodecInfo.profile = k;
                paramMediaCodecInfo.level = m;
              }
              j++;
              continue;
            }
            ab.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "best profile: %s, level: %s", new Object[] { Integer.valueOf(paramMediaCodecInfo.profile), Integer.valueOf(paramMediaCodecInfo.level) });
            if ((paramMediaCodecInfo.profile > 0) && (paramMediaCodecInfo.level >= 256))
            {
              this.mediaFormat.setInteger("profile", paramMediaCodecInfo.profile);
              this.mediaFormat.setInteger("level", 256);
            }
          }
        }
        AppMethodBeat.o(76718);
        return;
      }
      catch (Exception paramMediaCodecInfo)
      {
        ab.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "trySetProfile error: %s", new Object[] { paramMediaCodecInfo.getMessage() });
      }
      AppMethodBeat.o(76718);
    }
  }

  public final void b(byte[] paramArrayOfByte, boolean paramBoolean, long paramLong)
  {
    AppMethodBeat.i(76720);
    try
    {
      if (!this.cFy)
      {
        ab.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "writeData, not start!");
        AppMethodBeat.o(76720);
      }
      long l1;
      while (true)
      {
        return;
        if (this.eVq == null)
        {
          ab.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "encoder is null");
          AppMethodBeat.o(76720);
        }
        else
        {
          l1 = bo.yz();
          this.inputBuffers = this.eVq.getInputBuffers();
          this.aQJ = this.eVq.getOutputBuffers();
          for (int i = 0; this.eVq != null; i++)
          {
            int j = this.eVq.dequeueInputBuffer(600L);
            this.fXW = j;
            if ((j >= 0) || (i >= 10))
              break;
            ab.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "video no input available, drain first");
            UR();
          }
          if (this.eVq != null)
            break;
          ab.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "encoder is null");
          AppMethodBeat.o(76720);
        }
      }
      ab.v("MicroMsg.MMSightRemuxMediaCodecEncoder", "inputBufferIndex: %s", new Object[] { Integer.valueOf(this.fXW) });
      long l2 = bo.yz();
      if (this.fXW >= 0)
      {
        if ((this.cFy) && (!paramBoolean) && (paramArrayOfByte != null))
        {
          ab.v("MicroMsg.MMSightRemuxMediaCodecEncoder", "presentationTime: ".concat(String.valueOf(paramLong)));
          ByteBuffer localByteBuffer = this.inputBuffers[this.fXW];
          localByteBuffer.clear();
          localByteBuffer.put(paramArrayOfByte);
          localByteBuffer.position(0);
          this.eVq.queueInputBuffer(this.fXW, 0, paramArrayOfByte.length, paramLong, 0);
        }
        while (true)
        {
          UR();
          ab.v("MicroMsg.MMSightRemuxMediaCodecEncoder", "encoder used %sms %sms", new Object[] { Long.valueOf(bo.az(l1)), Long.valueOf(bo.az(l2)) });
          AppMethodBeat.o(76720);
          break;
          ab.v("MicroMsg.MMSightRemuxMediaCodecEncoder", "end of stream");
          this.fXY = true;
          this.eVq.queueInputBuffer(this.fXW, 0, 0, paramLong, 4);
          this.cpc = true;
        }
      }
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        k.bPB();
        ab.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "writeData error: %s", new Object[] { paramArrayOfByte.getMessage() });
        ab.printErrStackTrace("MicroMsg.MMSightRemuxMediaCodecEncoder", paramArrayOfByte, "", new Object[0]);
        AppMethodBeat.o(76720);
        continue;
        ab.v("MicroMsg.MMSightRemuxMediaCodecEncoder", "input buffer not available");
      }
    }
  }

  public final int mq(int paramInt)
  {
    AppMethodBeat.i(76716);
    try
    {
      this.eTa = paramInt;
      paramInt = alL();
      AppMethodBeat.o(76716);
      return paramInt;
    }
    catch (Exception localException1)
    {
      while (true)
      {
        ab.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "init error: %s, try to re-init again", new Object[] { localException1.getMessage() });
        try
        {
          paramInt = alL();
          AppMethodBeat.o(76716);
        }
        catch (Exception localException2)
        {
          ab.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "re-init again error: %s", new Object[] { localException2.getMessage() });
          k.bPA();
          paramInt = -1;
          AppMethodBeat.o(76716);
        }
      }
    }
  }

  public static abstract interface a
  {
    public abstract void a(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.b.f
 * JD-Core Version:    0.6.2
 */