package com.tencent.wxmm;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.EncoderCapabilities;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

public class v2encoder
{
  public static int EMethodGetQosPara = 0;
  public static final int EMethodGetRemoteHW = 26;
  public static final int ENUM_AVCEncCfgERROR = 2003;
  public static final int ENUM_AVCEncCreateERROR = 2002;
  public static final int ENUM_AVCEncERROR = 2004;
  public static final int ENUM_AVCEncNotFound = 2001;
  public static final int ENUM_AVCEncOK = 2000;
  public static final boolean SAVEVIDEOSTREAM = true;
  public static short[] SizeFormat2WH;
  private static final String TAG = "v2encoder";
  public static final int VFMT_420SP = 7;
  public static final int VFMT_HEVC_HW = 19;
  public static final int VFMT_ROTATE = 32;
  public static final int VFMT_i264 = 18;
  public static final byte enumCODEC_Vcodec2_hw = 4;
  public static final byte enumCODEC_f264 = 1;
  public static final byte enumCODEC_i264 = 8;
  public static final byte enumCODEC_vcodec2 = 16;
  public static int frameID;
  private static String path;
  private static int streamqueuesize;
  private static final String[] supportedH264HwCodecPrefixes;
  public String ENCODING;
  private int TIMEOUT_USEC;
  public byte[] configbyte;
  public int encLen;
  public boolean isRuning;
  public long mGeneratedIdx;
  int mPrevResolution;
  int mProfileCfg;
  public v2service mProtocol;
  int m_CapH;
  int m_CapW;
  int m_br_kbps;
  int m_framerate;
  int m_height;
  int m_width;
  private MediaCodec mediaCodec;
  protected MediaFormat mediaFormat;
  private BufferedOutputStream outputStream;
  v2stqos stQoS;

  static
  {
    AppMethodBeat.i(35413);
    streamqueuesize = 100;
    frameID = 0;
    path = Environment.getExternalStorageDirectory().getAbsolutePath();
    SizeFormat2WH = new short[] { 128, 96, 240, 160, 320, 240, 480, 360, 640, 480 };
    supportedH264HwCodecPrefixes = new String[] { "OMX.qcom.", "OMX.Exynos.", "OMX.hisi" };
    EMethodGetQosPara = 25;
    AppMethodBeat.o(35413);
  }

  public v2encoder(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, v2service paramv2service)
  {
    AppMethodBeat.i(35402);
    this.ENCODING = "hevc";
    this.TIMEOUT_USEC = 12000;
    this.mediaCodec = null;
    this.mProfileCfg = 1;
    this.configbyte = null;
    this.mGeneratedIdx = 0L;
    this.isRuning = false;
    this.encLen = 0;
    this.mPrevResolution = 8;
    this.m_width = paramInt1;
    this.m_height = paramInt2;
    this.m_CapW = paramInt1;
    this.m_CapH = paramInt2;
    this.mProtocol = paramv2service;
    this.m_framerate = paramInt3;
    this.m_br_kbps = paramInt4;
    this.mProfileCfg = paramInt5;
    frameID = 0;
    this.mGeneratedIdx = 0L;
    this.stQoS = new v2stqos();
    AppMethodBeat.o(35402);
  }

  private void NV21ToNV12(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(35412);
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null))
      AppMethodBeat.o(35412);
    while (true)
    {
      return;
      int k = paramInt1 * paramInt2;
      if (paramInt3 == 0)
      {
        System.arraycopy(paramArrayOfByte1, 0, paramArrayOfByte2, 0, k);
        for (paramInt1 = j; paramInt1 < k / 2; paramInt1 += 2)
        {
          paramArrayOfByte2[(k + paramInt1)] = ((byte)paramArrayOfByte1[(k + paramInt1 + 1)]);
          paramArrayOfByte2[(k + paramInt1 + 1)] = ((byte)paramArrayOfByte1[(k + paramInt1)]);
        }
      }
      for (paramInt2 = 0; ; paramInt2++)
      {
        paramInt1 = i;
        if (paramInt2 >= k)
          break;
        paramArrayOfByte2[paramInt2] = ((byte)paramArrayOfByte1[(k - 1 - paramInt2)]);
      }
      while (paramInt1 < k / 2)
      {
        paramArrayOfByte2[(k + paramInt1)] = ((byte)paramArrayOfByte1[(k / 2 + k - 1 - paramInt1)]);
        paramInt1++;
      }
      AppMethodBeat.o(35412);
    }
  }

  @SuppressLint({"NewApi"})
  private void StopEncoder()
  {
    AppMethodBeat.i(35405);
    try
    {
      if (this.mediaCodec != null)
      {
        this.mediaCodec.stop();
        this.mediaCodec.release();
      }
      AppMethodBeat.o(35405);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        new StringBuilder(" error523:").append(localException.toString());
        AppMethodBeat.o(35405);
      }
    }
  }

  @SuppressLint({"NewApi"})
  private boolean SupportAvcCodec(String paramString, int paramInt)
  {
    AppMethodBeat.i(35397);
    boolean bool1 = false;
    boolean bool2 = false;
    if (Build.VERSION.SDK_INT >= 18)
    {
      int i = MediaCodecList.getCodecCount() - 1;
      while (true)
      {
        bool1 = bool2;
        if (i < 0)
          break;
        MediaCodecInfo localMediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
        new StringBuilder("codecInfo : ").append(localMediaCodecInfo.getName());
        bool1 = bool2;
        if (localMediaCodecInfo.isEncoder())
        {
          String[] arrayOfString1 = localMediaCodecInfo.getSupportedTypes();
          String str = localMediaCodecInfo.getName();
          int j = 0;
          while (true)
          {
            bool1 = bool2;
            if (j >= arrayOfString1.length)
              break;
            bool1 = bool2;
            if (arrayOfString1[j].equalsIgnoreCase(paramString))
            {
              String[] arrayOfString2 = supportedH264HwCodecPrefixes;
              int k = arrayOfString2.length;
              int m = 0;
              while (true)
              {
                bool1 = bool2;
                if (m >= k)
                  break;
                bool1 = bool2;
                if (str.startsWith(arrayOfString2[m]))
                {
                  bool1 = bool2;
                  try
                  {
                    MediaCodecInfo.CodecProfileLevel[] arrayOfCodecProfileLevel = localMediaCodecInfo.getCapabilitiesForType(paramString).profileLevels;
                    bool1 = bool2;
                    int n = arrayOfCodecProfileLevel.length;
                    int i1 = 0;
                    while (true)
                    {
                      bool1 = bool2;
                      if (i1 >= n)
                        break;
                      MediaCodecInfo.CodecProfileLevel localCodecProfileLevel = arrayOfCodecProfileLevel[i1];
                      boolean bool3 = bool2;
                      bool1 = bool2;
                      if (localCodecProfileLevel.profile == paramInt)
                        bool3 = true;
                      bool1 = bool3;
                      StringBuilder localStringBuilder = new java/lang/StringBuilder;
                      bool1 = bool3;
                      localStringBuilder.<init>("steve : supported profiles:");
                      bool1 = bool3;
                      localStringBuilder.append(localCodecProfileLevel.profile).append(", MIME:").append(paramString);
                      i1++;
                      bool2 = bool3;
                    }
                  }
                  catch (Exception localException)
                  {
                  }
                }
                m++;
                bool2 = bool1;
              }
            }
            j++;
            bool2 = bool1;
          }
        }
        i--;
        bool2 = bool1;
      }
    }
    AppMethodBeat.o(35397);
    return bool1;
  }

  private long computePresentationTime(long paramLong)
  {
    return 132L + 1000000L * paramLong / 15L;
  }

  private void createfile(String paramString)
  {
    AppMethodBeat.i(35404);
    paramString = new File(paramString);
    if (paramString.exists())
      paramString.delete();
    try
    {
      BufferedOutputStream localBufferedOutputStream = new java/io/BufferedOutputStream;
      FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
      localFileOutputStream.<init>(paramString);
      localBufferedOutputStream.<init>(localFileOutputStream);
      this.outputStream = localBufferedOutputStream;
      AppMethodBeat.o(35404);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        new StringBuilder(" error510:").append(paramString.toString());
        AppMethodBeat.o(35404);
      }
    }
  }

  private boolean isRecognizedProfile(int paramInt)
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

  private MediaCodecInfo selectCodec(String paramString)
  {
    AppMethodBeat.i(35398);
    int i = MediaCodecList.getCodecCount();
    int j = 0;
    int k;
    if (j < i)
    {
      MediaCodecInfo localMediaCodecInfo = MediaCodecList.getCodecInfoAt(j);
      if (localMediaCodecInfo.isEncoder())
      {
        String[] arrayOfString = localMediaCodecInfo.getSupportedTypes();
        new StringBuilder("selectCodec one : ").append(j).append(arrayOfString);
        k = 0;
        label61: if (k < arrayOfString.length)
          if (arrayOfString[k].equalsIgnoreCase(paramString))
          {
            paramString = localMediaCodecInfo.getName();
            new StringBuilder("selectCodec two : ").append(k).append(paramString);
            AppMethodBeat.o(35398);
            paramString = localMediaCodecInfo;
          }
      }
    }
    while (true)
    {
      return paramString;
      k++;
      break label61;
      j++;
      break;
      paramString = null;
      AppMethodBeat.o(35398);
    }
  }

  @SuppressLint({"NewApi"})
  private void trySetBitRateMode(MediaCodecInfo paramMediaCodecInfo)
  {
    AppMethodBeat.i(35400);
    try
    {
      if (Build.VERSION.SDK_INT > 21)
      {
        paramMediaCodecInfo = paramMediaCodecInfo.getCapabilitiesForType(this.ENCODING);
        if (paramMediaCodecInfo != null)
        {
          paramMediaCodecInfo = paramMediaCodecInfo.getEncoderCapabilities();
          if (paramMediaCodecInfo != null)
            if (paramMediaCodecInfo.isBitrateModeSupported(2))
            {
              this.mediaFormat.setInteger("bitrate-mode", 2);
              AppMethodBeat.o(35400);
            }
        }
      }
      while (true)
      {
        return;
        if (paramMediaCodecInfo.isBitrateModeSupported(1))
          this.mediaFormat.setInteger("bitrate-mode", 1);
        AppMethodBeat.o(35400);
      }
    }
    catch (Exception paramMediaCodecInfo)
    {
      while (true)
      {
        new StringBuilder("trySetBitRateMode error: ").append(paramMediaCodecInfo.getMessage());
        AppMethodBeat.o(35400);
      }
    }
  }

  private void trySetProfile(MediaCodecInfo paramMediaCodecInfo)
  {
    int i = 0;
    AppMethodBeat.i(35399);
    if (Build.VERSION.SDK_INT >= 23);
    while (true)
    {
      try
      {
        paramMediaCodecInfo = paramMediaCodecInfo.getCapabilitiesForType(this.ENCODING);
        if (paramMediaCodecInfo != null)
        {
          Object localObject = paramMediaCodecInfo.profileLevels;
          if (localObject != null)
          {
            paramMediaCodecInfo = new android/media/MediaCodecInfo$CodecProfileLevel;
            paramMediaCodecInfo.<init>();
            paramMediaCodecInfo.level = 0;
            paramMediaCodecInfo.profile = 0;
            int j = localObject.length;
            if (i < j)
            {
              StringBuilder localStringBuilder = localObject[i];
              int k = localStringBuilder.profile;
              int m = localStringBuilder.level;
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>("profile: ");
              localStringBuilder.append(k).append(", level: ").append(m);
              if ((isRecognizedProfile(k)) && (k >= paramMediaCodecInfo.profile) && (m >= paramMediaCodecInfo.level))
              {
                paramMediaCodecInfo.profile = k;
                paramMediaCodecInfo.level = m;
              }
              i++;
              continue;
            }
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>("best profile: ");
            ((StringBuilder)localObject).append(paramMediaCodecInfo.profile).append(", best level: ").append(paramMediaCodecInfo.level);
            if ((paramMediaCodecInfo.profile > 0) && (paramMediaCodecInfo.level >= 256))
            {
              this.mediaFormat.setInteger("profile", paramMediaCodecInfo.profile);
              this.mediaFormat.setInteger("level", 256);
            }
          }
        }
        AppMethodBeat.o(35399);
        return;
      }
      catch (Exception paramMediaCodecInfo)
      {
        new StringBuilder("trySetProfile error: ").append(paramMediaCodecInfo.getMessage());
      }
      AppMethodBeat.o(35399);
    }
  }

  public int DoMediacodecEnc(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(35407);
    Object localObject1 = null;
    new StringBuilder("steve: m_framerate: ").append(this.m_framerate).append(", m_br_kbps:").append(this.m_br_kbps).append(" cwh ").append(this.m_CapW).append(this.m_CapH).append(" ewh ").append(this.m_width).append(this.m_height);
    int j = i;
    Object localObject2;
    if (this.stQoS.cSkipFlag == 0)
    {
      localObject2 = new byte[this.m_CapW * this.m_CapH * 3 / 2];
      NV21ToNV12(paramArrayOfByte, (byte[])localObject2, this.m_width, this.m_height, paramInt & 0x20);
      this.encLen = (this.m_width * this.m_height * 3 >> 1);
      if (this.m_width == this.m_width)
      {
        localObject1 = localObject2;
        j = i;
        if (this.m_height == this.m_height);
      }
      else
      {
        this.encLen = (this.m_width * this.m_height * 3 >> 1);
        try
        {
          paramInt = StartEncoder();
          if (paramInt < 0)
          {
            UninitHWEncoder();
            AppMethodBeat.o(35407);
            return paramInt;
          }
        }
        catch (Exception paramArrayOfByte)
        {
          while (true)
          {
            new StringBuilder("mediacodec init error: ").append(paramArrayOfByte.getMessage());
            paramInt = -2003;
          }
          j = paramInt;
          localObject1 = localObject2;
        }
      }
    }
    if (localObject1 != null)
      try
      {
        long l1 = System.currentTimeMillis();
        localObject2 = this.mediaCodec.getInputBuffers();
        paramArrayOfByte = this.mediaCodec.getOutputBuffers();
        paramInt = this.mediaCodec.dequeueInputBuffer(-1L);
        if (paramInt >= 0)
        {
          long l2 = computePresentationTime(this.mGeneratedIdx);
          localObject2 = localObject2[paramInt];
          ((ByteBuffer)localObject2).clear();
          ((ByteBuffer)localObject2).put((byte[])localObject1, 0, this.encLen);
          this.mediaCodec.queueInputBuffer(paramInt, 0, this.encLen, l2, 0);
          this.mGeneratedIdx += 1L;
        }
        localObject1 = new android/media/MediaCodec$BufferInfo;
        ((MediaCodec.BufferInfo)localObject1).<init>();
        i = this.mediaCodec.dequeueOutputBuffer((MediaCodec.BufferInfo)localObject1, this.TIMEOUT_USEC);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("put YUV into encoder, size:");
        ((StringBuilder)localObject2).append(this.encLen).append(", idx:").append(frameID).append(", time:").append(l1).append("outbuf: ").append(i);
        paramInt = j;
        for (j = i; j >= 0; j = this.mediaCodec.dequeueOutputBuffer((MediaCodec.BufferInfo)localObject1, this.TIMEOUT_USEC))
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("Get H264 Buffer Success! flag = ");
          ((StringBuilder)localObject2).append(((MediaCodec.BufferInfo)localObject1).flags).append(", enc size = ").append(((MediaCodec.BufferInfo)localObject1).size).append(",pts = ").append(((MediaCodec.BufferInfo)localObject1).presentationTimeUs);
          byte b = paramArrayOfByte[j];
          localObject2 = new byte[((MediaCodec.BufferInfo)localObject1).size];
          b.get((byte[])localObject2);
          if (this.outputStream != null)
            this.outputStream.write((byte[])localObject2, 0, localObject2.length);
          putH2645Data((byte[])localObject2, ((MediaCodec.BufferInfo)localObject1).flags, localObject2.length);
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("Protobuf  ");
          localStringBuilder.append(((MediaCodec.BufferInfo)localObject1).size).append(" : ").append(localObject2.length);
          paramInt = ((MediaCodec.BufferInfo)localObject1).flags;
          frameID += 1;
          this.mediaCodec.releaseOutputBuffer(j, false);
        }
      }
      catch (Exception paramArrayOfByte)
      {
        new StringBuilder(" error495:").append(paramArrayOfByte.toString());
        paramInt = -2004;
      }
    while (true)
    {
      AppMethodBeat.o(35407);
      break;
      paramInt = j;
    }
  }

  public void DoQosSvrCtrl()
  {
    AppMethodBeat.i(35408);
    if (this.mProtocol != null)
    {
      if (this.mProtocol.setAppCmd(EMethodGetQosPara, this.stQoS.s2p, this.stQoS.s2p.length) >= 0)
      {
        this.stQoS.parseS2PData();
        this.stQoS.printS2P();
      }
      if (this.stQoS.iKbps != this.m_br_kbps)
      {
        SetBitRate(this.m_br_kbps);
        this.m_br_kbps = this.stQoS.iKbps;
        new StringBuilder("steve[QoS]: Update BR! frameID: ").append(frameID).append(", new_br: ").append(this.m_br_kbps);
      }
      if (1 == this.stQoS.cIReqFlag)
      {
        MakeIFrame();
        new StringBuilder("steve[QoS]: Force I Frame! frameID: ").append(frameID);
      }
      if (this.stQoS.cFps != this.m_framerate)
        this.m_framerate = this.stQoS.cFps;
    }
    AppMethodBeat.o(35408);
  }

  public int InitHWEncoder(boolean paramBoolean)
  {
    AppMethodBeat.i(35403);
    Object localObject;
    int i;
    if (paramBoolean)
    {
      localObject = "video/avc";
      this.ENCODING = ((String)localObject);
      localObject = new byte[4];
      localObject[0] = ((byte)0);
      this.mProtocol.setAppCmd(26, (byte[])localObject, 4);
      new StringBuilder("InitHWEncoder remoteHW: ").append(localObject[0]).append(localObject[1]).append(localObject[2]).append(localObject[3]);
      if (!paramBoolean)
        break label114;
      if (((localObject[0] & 0x1) != 0) || ((localObject[0] & 0x8) != 0))
        break label143;
      i = -2;
      AppMethodBeat.o(35403);
    }
    label143: 
    while (true)
    {
      return i;
      localObject = "video/hevc";
      break;
      label114: if (((localObject[0] & 0x10) == 0) && ((localObject[0] & 0x4) == 0))
      {
        i = -3;
        AppMethodBeat.o(35403);
      }
      else
      {
        try
        {
          i = StartEncoder();
          if (i < 0)
            AppMethodBeat.o(35403);
        }
        catch (Exception localException)
        {
          while (true)
          {
            new StringBuilder("mediacodec init error: ").append(localException.getMessage());
            i = -2003;
          }
          createfile(path + "/AVLog/mediacodec.h264");
          AppMethodBeat.o(35403);
        }
      }
    }
  }

  @SuppressLint({"NewApi"})
  public void MakeIFrame()
  {
    AppMethodBeat.i(35410);
    if (this.mediaCodec != null)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("request-sync", 0);
      this.mediaCodec.setParameters(localBundle);
    }
    AppMethodBeat.o(35410);
  }

  @SuppressLint({"NewApi"})
  public boolean SetBitRate(int paramInt)
  {
    AppMethodBeat.i(35409);
    try
    {
      if (this.mediaCodec != null)
      {
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        localBundle.putInt("video-bitrate", paramInt * 1000);
        this.mediaCodec.setParameters(localBundle);
        bool = true;
        AppMethodBeat.o(35409);
        return bool;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        new StringBuilder("steve: setRates failed:").append(localException);
        boolean bool = false;
        AppMethodBeat.o(35409);
      }
    }
  }

  @SuppressLint({"NewApi"})
  public int StartEncoder()
  {
    AppMethodBeat.i(35401);
    if (this.mediaCodec != null)
      StopEncoder();
    MediaCodecInfo localMediaCodecInfo = selectCodec(this.ENCODING);
    int i;
    if (localMediaCodecInfo == null)
    {
      new StringBuilder("steve: Unable to find an appropriate codec for ").append(this.ENCODING);
      i = -2001;
      AppMethodBeat.o(35401);
    }
    while (true)
    {
      return i;
      new StringBuilder("steve: found HW codec: ").append(localMediaCodecInfo.getName());
      this.mediaFormat = MediaFormat.createVideoFormat(this.ENCODING, this.m_width, this.m_height);
      this.mediaFormat.setInteger("color-format", 21);
      this.mediaFormat.setInteger("bitrate", this.m_br_kbps * 1000);
      this.mediaFormat.setInteger("frame-rate", this.m_framerate);
      this.mediaFormat.setInteger("i-frame-interval", 1);
      String str = this.mediaFormat.getString("mime");
      if (this.ENCODING.equalsIgnoreCase("video/avc"))
      {
        if ((this.mProfileCfg & 0x4) == 0)
          break label292;
        i = 1;
        label187: if ((Build.VERSION.SDK_INT < 23) || (i == 0))
          break label297;
        if (SupportAvcCodec(str, 8))
          this.mediaFormat.setInteger("profile", 8);
      }
      label221: this.mediaFormat.setInteger("bitrate-mode", 2);
      try
      {
        this.mediaCodec = MediaCodec.createEncoderByType(str);
        new StringBuilder("steve: mediaFormat: ").append(this.mediaFormat);
        this.mediaCodec.configure(this.mediaFormat, null, null, 1);
        this.mediaCodec.start();
        i = 2000;
        AppMethodBeat.o(35401);
        continue;
        label292: i = 0;
        break label187;
        label297: if (localMediaCodecInfo == null)
          break label221;
        trySetProfile(localMediaCodecInfo);
      }
      catch (Exception localException)
      {
        new StringBuilder(" error392:").append(localException.toString());
        i = -2002;
        AppMethodBeat.o(35401);
      }
    }
  }

  public void UninitHWEncoder()
  {
    AppMethodBeat.i(35406);
    this.isRuning = false;
    try
    {
      StopEncoder();
      if (this.outputStream != null)
      {
        this.outputStream.flush();
        this.outputStream.close();
      }
      AppMethodBeat.o(35406);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        new StringBuilder(" error401:").append(localException.toString());
        AppMethodBeat.o(35406);
      }
    }
  }

  public void putH2645Data(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(35411);
    if ((paramArrayOfByte != null) && (this.mProtocol != null))
    {
      int i = 18;
      if (this.ENCODING.equalsIgnoreCase("video/hevc"))
        i = 19;
      this.mProtocol.videoEncodeToSend(paramArrayOfByte, paramInt2, this.m_width, paramInt1, i);
    }
    AppMethodBeat.o(35411);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.wxmm.v2encoder
 * JD-Core Version:    0.6.2
 */