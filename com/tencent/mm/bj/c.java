package com.tencent.mm.bj;

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
import com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;

public final class c
{
  private ByteBuffer[] aQJ;
  private int bitrate;
  boolean cFy;
  private boolean cpc;
  protected int eTa;
  private int eTi;
  private int eTj;
  private int eTk;
  private int eTl;
  private int eTm;
  private MediaCodec.BufferInfo eTy;
  protected MediaCodec eVq;
  c.a fXU;
  private int fXV;
  private int fXW;
  private int fXX;
  private boolean fXY;
  private byte[] fXZ;
  private int fYa;
  private int frameCount;
  private ByteBuffer[] inputBuffers;
  protected MediaFormat mediaFormat;

  public c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(50897);
    this.eTa = -1;
    this.fXW = -1;
    this.fXX = -1;
    this.bitrate = 0;
    this.cFy = false;
    this.cpc = false;
    this.fXY = false;
    ab.i("MicroMsg.MediaCodecTransCodeEncoder", "create MediaCodecTransCodeEncoder, init targetWidth: %d, targetHeight: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.eTi = paramInt1;
    this.eTj = paramInt2;
    this.eTk = paramInt4;
    this.eTm = 1;
    this.eTy = new MediaCodec.BufferInfo();
    this.bitrate = paramInt3;
    ab.i("MicroMsg.MediaCodecTransCodeEncoder", "create MMSightRemuxMediaCodecEncoder, targetWidth: %s, targetHeight: %s, bitrate: %s", new Object[] { Integer.valueOf(this.eTi), Integer.valueOf(this.eTj), Integer.valueOf(paramInt3) });
    AppMethodBeat.o(50897);
  }

  private void UR()
  {
    AppMethodBeat.i(50904);
    this.fXX = this.eVq.dequeueOutputBuffer(this.eTy, 600L);
    ab.v("MicroMsg.MediaCodecTransCodeEncoder", "outputBufferIndex-->" + this.fXX);
    while (this.fXX == -1)
    {
      ab.d("MicroMsg.MediaCodecTransCodeEncoder", "no output from encoder available, break encoderEndStream %s", new Object[] { Boolean.valueOf(this.fXY) });
      if (this.fXY)
      {
        this.fXX = this.eVq.dequeueOutputBuffer(this.eTy, 600L);
        if (this.fXX <= 0)
          ab.v("MicroMsg.MediaCodecTransCodeEncoder", "get outputBufferIndex %d", new Object[] { Integer.valueOf(this.fXX) });
        if ((this.fXX >= 0) || (this.fXY))
          break;
      }
      else
      {
        AppMethodBeat.o(50904);
      }
    }
    while (true)
    {
      return;
      if (this.fXX == -3)
      {
        this.aQJ = this.eVq.getOutputBuffers();
        ab.d("MicroMsg.MediaCodecTransCodeEncoder", "encoder output buffers changed");
        break;
      }
      if (this.fXX == -2)
      {
        ab.d("MicroMsg.MediaCodecTransCodeEncoder", "encoder output format changed: ".concat(String.valueOf(this.eVq.getOutputFormat())));
        break;
      }
      if (this.fXX < 0)
      {
        ab.w("MicroMsg.MediaCodecTransCodeEncoder", "unexpected result from encoder.dequeueOutputBuffer: " + this.fXX);
        break;
      }
      ab.v("MicroMsg.MediaCodecTransCodeEncoder", "perform encoding");
      Object localObject = this.aQJ[this.fXX];
      if (localObject == null)
      {
        localObject = new RuntimeException("encoderOutputBuffer " + this.fXX + " was null");
        AppMethodBeat.o(50904);
        throw ((Throwable)localObject);
      }
      this.frameCount += 1;
      if ((this.eTy.flags & 0x2) != 0)
        ab.v("MicroMsg.MediaCodecTransCodeEncoder", "ignoring BUFFER_FLAG_CODEC_CONFIG, size: %s, %s", new Object[] { Integer.valueOf(this.eTy.size), Boolean.FALSE });
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
        ab.e("MicroMsg.MediaCodecTransCodeEncoder", "reached end of stream unexpectedly");
        AppMethodBeat.o(50904);
      }
      else
      {
        ab.w("MicroMsg.MediaCodecTransCodeEncoder", "do stop encoder, frameCount: %s, writeFrameCount: %s", new Object[] { Integer.valueOf(this.frameCount), Integer.valueOf(this.fXV) });
        try
        {
          this.eVq.stop();
          this.eVq.release();
          this.eVq = null;
          this.cFy = false;
          AppMethodBeat.o(50904);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.MediaCodecTransCodeEncoder", "do stop encoder error: %s", new Object[] { localException.getMessage() });
          AppMethodBeat.o(50904);
        }
      }
    }
  }

  private static int a(MediaCodecInfo paramMediaCodecInfo, String paramString)
  {
    AppMethodBeat.i(50905);
    long l = bo.yz();
    paramString = paramMediaCodecInfo.getCapabilitiesForType(paramString);
    ab.i("MicroMsg.MediaCodecTransCodeEncoder", "getCapabilitiesForType used %sms", new Object[] { Long.valueOf(bo.az(l)) });
    ab.i("MicroMsg.MediaCodecTransCodeEncoder", "color format length: %s", new Object[] { Integer.valueOf(paramString.colorFormats.length) });
    int i = 0;
    int m;
    for (int j = 0; i < paramString.colorFormats.length; j = m)
    {
      int k = paramString.colorFormats[i];
      ab.i("MicroMsg.MediaCodecTransCodeEncoder", "capabilities colorFormat: %s", new Object[] { Integer.valueOf(k) });
      m = j;
      if (mr(k))
      {
        m = j;
        if (k > j)
        {
          j = k;
          if (k == 21)
            break;
          m = k;
        }
      }
      i++;
    }
    ab.i("MicroMsg.MediaCodecTransCodeEncoder", "codec: %s, colorFormat: %s", new Object[] { paramMediaCodecInfo.getName(), Integer.valueOf(j) });
    AppMethodBeat.o(50905);
    return j;
  }

  private int alL()
  {
    int i = 0;
    AppMethodBeat.i(50899);
    long l = bo.yz();
    MediaCodecInfo localMediaCodecInfo = selectCodec("video/avc");
    if (localMediaCodecInfo == null)
    {
      ab.e("MicroMsg.MediaCodecTransCodeEncoder", "Unable to find an appropriate codec for video/avc");
      i = -1;
      AppMethodBeat.o(50899);
      return i;
    }
    ab.i("MicroMsg.MediaCodecTransCodeEncoder", "found codec: %s, used %sms", new Object[] { localMediaCodecInfo.getName(), Long.valueOf(bo.az(l)) });
    l = bo.yz();
    this.eTl = a(localMediaCodecInfo, "video/avc");
    l = bo.az(l);
    ab.i("MicroMsg.MediaCodecTransCodeEncoder", "found colorFormat: %s, used %sms", new Object[] { Integer.valueOf(this.eTl), Long.valueOf(l) });
    if (this.eTl == 19);
    for (this.fYa = 2; ; this.fYa = 1)
    {
      l = bo.yz();
      this.mediaFormat = MediaFormat.createVideoFormat("video/avc", this.eTi, this.eTj);
      ab.i("MicroMsg.MediaCodecTransCodeEncoder", "createVideoFormat used %sms", new Object[] { Long.valueOf(bo.az(l)) });
      if (localMediaCodecInfo != null)
      {
        trySetProfile(localMediaCodecInfo);
        trySetBitRateMode(localMediaCodecInfo);
      }
      this.mediaFormat.setInteger("bitrate", this.bitrate);
      this.mediaFormat.setInteger("frame-rate", this.eTk);
      this.mediaFormat.setInteger("color-format", this.eTl);
      this.mediaFormat.setInteger("i-frame-interval", this.eTm);
      ab.i("MicroMsg.MediaCodecTransCodeEncoder", "mediaFormat: %s", new Object[] { this.mediaFormat });
      this.eVq = MediaCodec.createByCodecName(localMediaCodecInfo.getName());
      this.eVq.configure(this.mediaFormat, null, null, 1);
      this.eVq.start();
      AppMethodBeat.o(50899);
      break;
    }
  }

  private void b(byte[] paramArrayOfByte, boolean paramBoolean, long paramLong)
  {
    AppMethodBeat.i(50903);
    try
    {
      if (!this.cFy)
      {
        ab.e("MicroMsg.MediaCodecTransCodeEncoder", "writeData, not start!");
        AppMethodBeat.o(50903);
      }
      long l1;
      while (true)
      {
        return;
        if (this.eVq == null)
        {
          ab.e("MicroMsg.MediaCodecTransCodeEncoder", "encoder is null");
          AppMethodBeat.o(50903);
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
            ab.i("MicroMsg.MediaCodecTransCodeEncoder", "video no input available, drain first");
            UR();
          }
          if (this.eVq != null)
            break;
          ab.e("MicroMsg.MediaCodecTransCodeEncoder", "encoder is null");
          AppMethodBeat.o(50903);
        }
      }
      ab.v("MicroMsg.MediaCodecTransCodeEncoder", "inputBufferIndex: %s", new Object[] { Integer.valueOf(this.fXW) });
      long l2 = bo.yz();
      if (this.fXW >= 0)
      {
        if ((this.cFy) && (!paramBoolean) && (paramArrayOfByte != null))
        {
          ab.v("MicroMsg.MediaCodecTransCodeEncoder", "presentationTime: ".concat(String.valueOf(paramLong)));
          ByteBuffer localByteBuffer = this.inputBuffers[this.fXW];
          localByteBuffer.clear();
          localByteBuffer.put(paramArrayOfByte);
          localByteBuffer.position(0);
          this.eVq.queueInputBuffer(this.fXW, 0, paramArrayOfByte.length, paramLong, 0);
        }
        while (true)
        {
          UR();
          ab.v("MicroMsg.MediaCodecTransCodeEncoder", "encoder used %sms %sms", new Object[] { Long.valueOf(bo.az(l1)), Long.valueOf(bo.az(l2)) });
          AppMethodBeat.o(50903);
          break;
          ab.v("MicroMsg.MediaCodecTransCodeEncoder", "end of stream");
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
        ab.e("MicroMsg.MediaCodecTransCodeEncoder", "writeData error: %s", new Object[] { paramArrayOfByte.getMessage() });
        ab.printErrStackTrace("MicroMsg.MediaCodecTransCodeEncoder", paramArrayOfByte, "", new Object[0]);
        AppMethodBeat.o(50903);
        continue;
        ab.v("MicroMsg.MediaCodecTransCodeEncoder", "input buffer not available");
      }
    }
  }

  private void g(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    AppMethodBeat.i(50896);
    if ((paramByteBuffer != null) && (paramBufferInfo != null) && (this.fXU != null))
      this.fXU.a(this.eTa, paramByteBuffer, paramBufferInfo.size);
    AppMethodBeat.o(50896);
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
    AppMethodBeat.i(50906);
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
            AppMethodBeat.o(50906);
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
      AppMethodBeat.o(50906);
    }
  }

  private void trySetBitRateMode(MediaCodecInfo paramMediaCodecInfo)
  {
    AppMethodBeat.i(50901);
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
              ab.i("MicroMsg.MediaCodecTransCodeEncoder", "support cbr bitrate mode");
              this.mediaFormat.setInteger("bitrate-mode", 2);
              AppMethodBeat.o(50901);
            }
            while (true)
            {
              return;
              if (!paramMediaCodecInfo.isBitrateModeSupported(0))
                break;
              ab.i("MicroMsg.MediaCodecTransCodeEncoder", "support cq bitrate mode");
              this.mediaFormat.setInteger("bitrate-mode", 0);
              AppMethodBeat.o(50901);
            }
          }
        }
      }
    }
    catch (Exception paramMediaCodecInfo)
    {
      while (true)
      {
        ab.e("MicroMsg.MediaCodecTransCodeEncoder", "trySetBitRateMode error: %s", new Object[] { paramMediaCodecInfo.getMessage() });
        AppMethodBeat.o(50901);
        continue;
        ab.i("MicroMsg.MediaCodecTransCodeEncoder", "both cbr and cq bitrate mode not support!");
        AppMethodBeat.o(50901);
      }
    }
  }

  private void trySetProfile(MediaCodecInfo paramMediaCodecInfo)
  {
    AppMethodBeat.i(50900);
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
            MediaCodecInfo.CodecProfileLevel localCodecProfileLevel = new android/media/MediaCodecInfo$CodecProfileLevel;
            localCodecProfileLevel.<init>();
            localCodecProfileLevel.level = 0;
            localCodecProfileLevel.profile = 0;
            int i = arrayOfCodecProfileLevel.length;
            int j = 0;
            if (j < i)
            {
              paramMediaCodecInfo = arrayOfCodecProfileLevel[j];
              int k = paramMediaCodecInfo.profile;
              int m = paramMediaCodecInfo.level;
              ab.i("MicroMsg.MediaCodecTransCodeEncoder", "profile: %s, level: %s", new Object[] { Integer.valueOf(k), Integer.valueOf(m) });
              if ((isRecognizedProfile(k)) && (k >= localCodecProfileLevel.profile) && (m >= localCodecProfileLevel.level))
              {
                localCodecProfileLevel.profile = k;
                localCodecProfileLevel.level = m;
              }
              j++;
              continue;
            }
            ab.i("MicroMsg.MediaCodecTransCodeEncoder", "best profile: %s, level: %s", new Object[] { Integer.valueOf(localCodecProfileLevel.profile), Integer.valueOf(localCodecProfileLevel.level) });
            if ((localCodecProfileLevel.profile > 0) && (localCodecProfileLevel.level >= 256))
            {
              this.mediaFormat.setInteger("profile", localCodecProfileLevel.profile);
              this.mediaFormat.setInteger("level", 256);
            }
          }
        }
        AppMethodBeat.o(50900);
        return;
      }
      catch (Exception paramMediaCodecInfo)
      {
        ab.e("MicroMsg.MediaCodecTransCodeEncoder", "trySetProfile error: %s", new Object[] { paramMediaCodecInfo.getMessage() });
      }
      AppMethodBeat.o(50900);
    }
  }

  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, long paramLong, int paramInt5)
  {
    AppMethodBeat.i(50902);
    if ((!paramBoolean) && (paramArrayOfByte != null))
      if ((paramInt3 == this.eTi) && (paramInt4 == this.eTj))
      {
        paramBoolean = false;
        ab.d("MicroMsg.MediaCodecTransCodeEncoder", "writeData, needScale: %s, srcSize: [%s, %s] [%s, %s], targetSize: [%s, %s], pts: %s, srcColorFormat: %s, dstColorFormat: %s, data.size:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(this.eTi), Integer.valueOf(this.eTj), Long.valueOf(paramLong), Integer.valueOf(paramInt5), Integer.valueOf(this.fYa), Integer.valueOf(paramArrayOfByte.length) });
        if (this.fXZ == null)
          this.fXZ = new byte[this.eTi * this.eTj * 3 >> 1];
        if (this.fXZ.length != paramArrayOfByte.length)
          this.fXZ = new byte[paramArrayOfByte.length];
        if ((this.eTl != 19) || (paramBoolean))
          break label250;
        System.arraycopy(paramArrayOfByte, 0, this.fXZ, 0, paramArrayOfByte.length);
        label216: this.fXV += 1;
        b(this.fXZ, false, paramLong);
        AppMethodBeat.o(50902);
      }
    while (true)
    {
      return;
      paramBoolean = true;
      break;
      label250: MP4MuxerJNI.yuv420pTo420XXAndScaleLock(paramArrayOfByte, paramInt5, this.fXZ, this.fYa, paramInt1, paramInt2, paramInt3, paramInt4, this.eTi, this.eTj);
      break label216;
      b(this.fXZ, true, paramLong);
      AppMethodBeat.o(50902);
    }
  }

  public final int mq(int paramInt)
  {
    AppMethodBeat.i(50898);
    try
    {
      this.eTa = paramInt;
      paramInt = alL();
      AppMethodBeat.o(50898);
      return paramInt;
    }
    catch (Exception localException1)
    {
      while (true)
      {
        ab.e("MicroMsg.MediaCodecTransCodeEncoder", "init error: %s, try to re-init again", new Object[] { localException1.getMessage() });
        try
        {
          paramInt = alL();
          AppMethodBeat.o(50898);
        }
        catch (Exception localException2)
        {
          ab.e("MicroMsg.MediaCodecTransCodeEncoder", "re-init again error: %s", new Object[] { localException2.getMessage() });
          paramInt = -1;
          AppMethodBeat.o(50898);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bj.c
 * JD-Core Version:    0.6.2
 */