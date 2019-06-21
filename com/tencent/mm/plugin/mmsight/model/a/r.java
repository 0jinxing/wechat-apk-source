package com.tencent.mm.plugin.mmsight.model.a;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.model.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import java.nio.ByteBuffer;

@TargetApi(16)
public class r
  implements f
{
  private ByteBuffer[] aQJ;
  private int bitrate;
  private boolean cFy;
  boolean cpc;
  private long eDL;
  int eTi;
  int eTj;
  private int eTk;
  int eTl;
  private int eTm;
  private MediaCodec.BufferInfo eTy;
  private boolean eVK;
  private final Object eVL;
  protected MediaCodec eVq;
  private int fXW;
  private int fXX;
  private boolean fXY;
  int frameCount;
  private int gLw;
  private int gLx;
  private ByteBuffer[] inputBuffers;
  protected MediaFormat mediaFormat;
  boolean ouL;
  private o ovV;
  private boolean ovW;
  int owS;
  int owT;
  int owU;
  int owV;
  a owW;
  f.a owX;
  private a.a owY;
  private long startTime;

  public r(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
  {
    AppMethodBeat.i(76672);
    this.startTime = 0L;
    this.eDL = 0L;
    this.fXW = -1;
    this.fXX = -1;
    this.bitrate = 0;
    this.cFy = false;
    this.cpc = false;
    this.fXY = false;
    this.owS = -1;
    this.owT = -1;
    this.owU = -1;
    this.owV = -1;
    this.ouL = false;
    this.eVL = new Object();
    this.eVK = false;
    this.ovW = true;
    this.owY = new r.1(this);
    this.owW = new a(this.owY);
    this.gLw = paramInt1;
    this.gLx = paramInt2;
    ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "create MMSightYUVMediaCodecRecorder, init targetWidth: %d, targetHeight: %d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "create MMSightYUVMediaCodecRecorder, after align 16, targetWidth: %d, targetHeight: %d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    this.eTi = paramInt3;
    this.eTj = paramInt4;
    this.eTk = paramInt7;
    this.eTm = paramInt6;
    this.ovV = null;
    this.eTy = new MediaCodec.BufferInfo();
    this.bitrate = paramInt5;
    this.ouL = paramBoolean;
    this.ovW = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lJi, true);
    ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "create BigSightMediaCodecYUVRecorder, frameWidth: %s, frameHeight: %s, targetWidth: %s, targetHeight: %s, bitrate: %s, needRotateEachFrame: %s, muxer: %s", new Object[] { Integer.valueOf(this.gLw), Integer.valueOf(this.gLx), Integer.valueOf(this.eTi), Integer.valueOf(this.eTj), Integer.valueOf(paramInt5), Boolean.valueOf(paramBoolean), null });
    AppMethodBeat.o(76672);
  }

  private void UO()
  {
    AppMethodBeat.i(138320);
    if (this.ovW)
    {
      bPY();
      AppMethodBeat.o(138320);
    }
    while (true)
    {
      return;
      synchronized (this.eVL)
      {
        if ((this.eVK) || (0L == this.startTime))
        {
          AppMethodBeat.o(138320);
          continue;
        }
        this.eVK = true;
        bPY();
        AppMethodBeat.o(138320);
      }
    }
  }

  private void UR()
  {
    AppMethodBeat.i(76679);
    this.fXX = this.eVq.dequeueOutputBuffer(this.eTy, 100L);
    ab.v("MicroMsg.MMSightYUVMediaCodecRecorder", "outputBufferIndex-->" + this.fXX);
    while (this.fXX == -1)
    {
      ab.d("MicroMsg.MMSightYUVMediaCodecRecorder", "no output from encoder available, break encoderEndStream %s", new Object[] { Boolean.valueOf(this.fXY) });
      if (this.fXY)
      {
        this.fXX = this.eVq.dequeueOutputBuffer(this.eTy, 100L);
        if (this.fXX <= 0)
          ab.v("MicroMsg.MMSightYUVMediaCodecRecorder", "get outputBufferIndex %d", new Object[] { Integer.valueOf(this.fXX) });
        if ((this.fXX >= 0) || (this.fXY))
          break;
      }
      else
      {
        label143: AppMethodBeat.o(76679);
      }
    }
    while (true)
    {
      return;
      if (this.fXX == -3)
      {
        this.aQJ = this.eVq.getOutputBuffers();
        ab.d("MicroMsg.MMSightYUVMediaCodecRecorder", "encoder output buffers changed");
        break;
      }
      Object localObject;
      if (this.fXX == -2)
      {
        localObject = this.eVq.getOutputFormat();
        ab.d("MicroMsg.MMSightYUVMediaCodecRecorder", "encoder output format changed: ".concat(String.valueOf(localObject)));
        if (this.ovV == null)
          break;
        this.ovV.d((MediaFormat)localObject);
        break;
      }
      if (this.fXX < 0)
      {
        ab.w("MicroMsg.MMSightYUVMediaCodecRecorder", "unexpected result from encoder.dequeueOutputBuffer: " + this.fXX);
        break;
      }
      ab.v("MicroMsg.MMSightYUVMediaCodecRecorder", "perform encoding");
      ByteBuffer localByteBuffer = this.aQJ[this.fXX];
      if (localByteBuffer == null)
      {
        localObject = new RuntimeException("encoderOutputBuffer " + this.fXX + " was null");
        AppMethodBeat.o(76679);
        throw ((Throwable)localObject);
      }
      this.frameCount += 1;
      if ((this.eTy.flags & 0x2) != 0)
        ab.v("MicroMsg.MMSightYUVMediaCodecRecorder", "ignoring BUFFER_FLAG_CODEC_CONFIG, size: %s, %s", new Object[] { Integer.valueOf(this.eTy.size), Boolean.FALSE });
      if (this.eTy.size != 0)
      {
        if ((this.ovV != null) && (!this.ovV.cFy))
        {
          localObject = this.eVq.getOutputFormat();
          this.ovV.d((MediaFormat)localObject);
        }
        localByteBuffer.position(this.eTy.offset);
        localByteBuffer.limit(this.eTy.offset + this.eTy.size);
        g(localByteBuffer, this.eTy);
      }
      this.eVq.releaseOutputBuffer(this.fXX, false);
      if ((this.eTy.flags & 0x4) == 0)
        break;
      if (!this.cpc)
      {
        ab.e("MicroMsg.MMSightYUVMediaCodecRecorder", "reached end of stream unexpectedly");
        AppMethodBeat.o(76679);
      }
      else
      {
        ab.w("MicroMsg.MMSightYUVMediaCodecRecorder", "do stop encoder");
        UO();
        if (this.owX == null)
          break label143;
        this.owX.bPP();
        this.owX = null;
        AppMethodBeat.o(76679);
      }
    }
  }

  private int alL()
  {
    AppMethodBeat.i(76675);
    long l1 = bo.yz();
    int i = MediaCodecList.getCodecCount();
    int j = 0;
    MediaCodecInfo localMediaCodecInfo;
    Object localObject2;
    int k;
    if (j < i)
    {
      localMediaCodecInfo = MediaCodecList.getCodecInfoAt(j);
      if (localMediaCodecInfo.isEncoder())
      {
        localObject2 = localMediaCodecInfo.getSupportedTypes();
        k = 0;
        label48: if (k < localObject2.length)
          if (localObject2[k].equalsIgnoreCase("video/avc"))
          {
            label70: if (localMediaCodecInfo != null)
              break label116;
            ab.e("MicroMsg.MMSightYUVMediaCodecRecorder", "Unable to find an appropriate codec for video/avc");
            k.bPA();
            j = -1;
            AppMethodBeat.o(76675);
          }
      }
    }
    while (true)
    {
      return j;
      k++;
      break label48;
      j++;
      break;
      localMediaCodecInfo = null;
      break label70;
      label116: ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "found codec: %s, used %sms", new Object[] { localMediaCodecInfo.getName(), Long.valueOf(bo.az(l1)) });
      long l2 = bo.yz();
      j = -1;
      if (CaptureMMProxy.getInstance() != null)
        j = CaptureMMProxy.getInstance().getInt(ac.a.xPp, -1);
      ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "saveColorFormat: %s", new Object[] { Integer.valueOf(j) });
      if (j > 0)
      {
        this.eTl = j;
        l1 = bo.az(l2);
        if ((this.eTl > 0) && (l1 > 200L) && (CaptureMMProxy.getInstance() != null))
          CaptureMMProxy.getInstance().set(ac.a.xPp, Integer.valueOf(this.eTl));
        ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "found colorFormat: %s, used %sms", new Object[] { Integer.valueOf(this.eTl), Long.valueOf(l1) });
        l1 = bo.yz();
        ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "initRotate: %s", new Object[] { Integer.valueOf(this.owS) });
        if (!this.ouL)
          break label839;
        if ((this.owS != 180) && (this.owS != 0))
          break label821;
        j = this.eTi;
        label332: if ((this.owS != 180) && (this.owS != 0))
          break label830;
        k = this.eTj;
        label355: this.mediaFormat = MediaFormat.createVideoFormat("video/avc", j, k);
        ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "createVideoFormat used %sms", new Object[] { Long.valueOf(bo.az(l1)) });
        if ((localMediaCodecInfo != null) && (!d.iW(23)))
          break label1007;
      }
      try
      {
        localObject2 = localMediaCodecInfo.getCapabilitiesForType("video/avc");
        if (localObject2 != null)
        {
          MediaCodecInfo.CodecProfileLevel[] arrayOfCodecProfileLevel = ((MediaCodecInfo.CodecCapabilities)localObject2).profileLevels;
          if (arrayOfCodecProfileLevel != null)
          {
            MediaCodecInfo.CodecProfileLevel localCodecProfileLevel = new android/media/MediaCodecInfo$CodecProfileLevel;
            localCodecProfileLevel.<init>();
            localCodecProfileLevel.level = 0;
            localCodecProfileLevel.profile = 0;
            i = arrayOfCodecProfileLevel.length;
            j = 0;
            label460: if (j < i)
            {
              localObject2 = arrayOfCodecProfileLevel[j];
              int m = ((MediaCodecInfo.CodecProfileLevel)localObject2).profile;
              int n = ((MediaCodecInfo.CodecProfileLevel)localObject2).level;
              ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "profile: %s, level: %s", new Object[] { Integer.valueOf(m), Integer.valueOf(n) });
              switch (m)
              {
              default:
              case 1:
              case 2:
              case 8:
              }
              for (k = 0; ; k = 1)
              {
                if ((k != 0) && (m >= localCodecProfileLevel.profile) && (n >= localCodecProfileLevel.level))
                {
                  localCodecProfileLevel.profile = m;
                  localCodecProfileLevel.level = n;
                }
                j++;
                break label460;
                j = 0;
                l1 = bo.yz();
                localObject2 = localMediaCodecInfo.getCapabilitiesForType("video/avc");
                ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "getCapabilitiesForType used %sms", new Object[] { Long.valueOf(bo.az(l1)) });
                ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "color format length: %s", new Object[] { Integer.valueOf(((MediaCodecInfo.CodecCapabilities)localObject2).colorFormats.length) });
                k = 0;
                if (k < ((MediaCodecInfo.CodecCapabilities)localObject2).colorFormats.length)
                {
                  n = localObject2.colorFormats[k];
                  ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "capabilities colorFormat: %s", new Object[] { Integer.valueOf(n) });
                  switch (n)
                  {
                  default:
                  case 19:
                  case 21:
                  case 2130706688:
                  }
                  for (m = 0; ; m = 1)
                  {
                    i = j;
                    if (m != 0)
                      if (n <= j)
                      {
                        i = j;
                        if (n != 21);
                      }
                      else
                      {
                        i = n;
                      }
                    k++;
                    j = i;
                    break;
                  }
                }
                ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "codec: %s, colorFormat: %s", new Object[] { localMediaCodecInfo.getName(), Integer.valueOf(j) });
                break;
                j = this.eTj;
                break label332;
                k = this.eTi;
                break label355;
                if ((this.owS == 180) || (this.owS == 0))
                {
                  j = this.eTj;
                  label862: if ((this.owS != 180) && (this.owS != 0))
                    break label911;
                }
                for (k = this.eTi; ; k = this.eTj)
                {
                  this.mediaFormat = MediaFormat.createVideoFormat("video/avc", j, k);
                  break;
                  j = this.eTi;
                  break label862;
                }
              }
            }
            label821: label830: label839: ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "best profile: %s, level: %s", new Object[] { Integer.valueOf(localCodecProfileLevel.profile), Integer.valueOf(localCodecProfileLevel.level) });
            label911: if ((localCodecProfileLevel.profile > 0) && (localCodecProfileLevel.level >= 256))
            {
              this.mediaFormat.setInteger("profile", localCodecProfileLevel.profile);
              this.mediaFormat.setInteger("level", 256);
            }
          }
        }
      }
      catch (Exception localException1)
      {
        try
        {
          while (true)
          {
            label1007: if (d.iW(21))
              this.mediaFormat.setInteger("bitrate-mode", 1);
            this.mediaFormat.setInteger("bitrate", this.bitrate);
            this.mediaFormat.setInteger("frame-rate", this.eTk);
            this.mediaFormat.setInteger("color-format", this.eTl);
            this.mediaFormat.setInteger("i-frame-interval", this.eTm);
            ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "mediaFormat: %s", new Object[] { this.mediaFormat });
            this.eVq = MediaCodec.createByCodecName(localMediaCodecInfo.getName());
            this.eVq.configure(this.mediaFormat, null, null, 1);
            this.eVq.start();
            if (!this.ovW)
              break label1203;
            j = 0;
            AppMethodBeat.o(76675);
            break;
            localException1 = localException1;
            ab.e("MicroMsg.MMSightYUVMediaCodecRecorder", "trySetProfile error: %s", new Object[] { localException1.getMessage() });
          }
        }
        catch (Exception localException2)
        {
          while (true)
            ab.e("MicroMsg.MMSightYUVMediaCodecRecorder", "trySetBitRateMode error: %s", new Object[] { localException2.getMessage() });
          label1203: synchronized (this.eVL)
          {
            this.eVK = false;
            j = 0;
            AppMethodBeat.o(76675);
          }
        }
      }
    }
  }

  private void bPY()
  {
    AppMethodBeat.i(138321);
    try
    {
      if (this.owW != null)
        this.owW.stop();
      if (this.eVq != null)
      {
        ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "stop encoder");
        this.eVq.stop();
        this.eVq.release();
        this.cFy = false;
        this.eVq = null;
      }
      AppMethodBeat.o(138321);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MMSightYUVMediaCodecRecorder", "clear error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(138321);
      }
    }
  }

  public final long UQ()
  {
    long l = 0L;
    AppMethodBeat.i(76683);
    if (this.startTime <= 0L)
    {
      ab.w("MicroMsg.MMSightYUVMediaCodecRecorder", "do not start record");
      AppMethodBeat.o(76683);
    }
    while (true)
    {
      return l;
      l = System.currentTimeMillis() - this.startTime;
      AppMethodBeat.o(76683);
    }
  }

  public final void a(f.a parama)
  {
    AppMethodBeat.i(76681);
    this.owX = parama;
    this.cpc = true;
    boolean bool = this.owW.bPL();
    ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "!!!stop, isStart!!: %s %s isEnd %s", new Object[] { Boolean.valueOf(this.cFy), this.owX, Boolean.valueOf(bool) });
    if (bool)
      bPX();
    AppMethodBeat.o(76681);
  }

  final void bPX()
  {
    AppMethodBeat.i(76682);
    ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "stopImp %s  isStart:%b", new Object[] { bo.dpG().toString(), Boolean.valueOf(this.cFy) });
    try
    {
      if (this.cFy)
      {
        r.2 local2 = new com/tencent/mm/plugin/mmsight/model/a/r$2;
        local2.<init>(this);
        al.n(local2, 500L);
      }
      AppMethodBeat.o(76682);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MMSightYUVMediaCodecRecorder", "stop error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(76682);
      }
    }
  }

  public void clear()
  {
    AppMethodBeat.i(76684);
    ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "clear");
    UO();
    AppMethodBeat.o(76684);
  }

  public final void d(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    AppMethodBeat.i(76678);
    if (!this.ovW)
      synchronized (this.eVL)
      {
        if (this.eVK)
        {
          AppMethodBeat.o(76678);
          return;
        }
      }
    while (true)
    {
      try
      {
        if (!this.cFy)
        {
          ab.e("MicroMsg.MMSightYUVMediaCodecRecorder", "writeData, not start!");
          AppMethodBeat.o(76678);
          break;
          paramArrayOfByte = finally;
          AppMethodBeat.o(76678);
          throw paramArrayOfByte;
        }
        if (this.eVq == null)
        {
          ab.e("MicroMsg.MMSightYUVMediaCodecRecorder", "encoder is null");
          AppMethodBeat.o(76678);
          break;
        }
        if ((this.ovV != null) && (this.ovV.owQ <= 0L))
          this.ovV.owQ = System.nanoTime();
        long l1 = bo.yz();
        this.inputBuffers = this.eVq.getInputBuffers();
        this.aQJ = this.eVq.getOutputBuffers();
        int i = this.eVq.dequeueInputBuffer(100L);
        this.fXW = i;
        if (i < 0)
        {
          ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "video no input available, drain first");
          UR();
        }
        if (this.eVq == null)
        {
          ab.e("MicroMsg.MMSightYUVMediaCodecRecorder", "encoder is null");
          AppMethodBeat.o(76678);
          break;
        }
        ab.v("MicroMsg.MMSightYUVMediaCodecRecorder", "inputBufferIndex: %s", new Object[] { Integer.valueOf(this.fXW) });
        long l2 = bo.yz();
        if (this.fXW < 0)
          break label499;
        long l3 = System.nanoTime();
        long l4 = paramArrayOfByte.length / 1600000 / 1000000000;
        if (this.ovV != null)
        {
          l5 = this.ovV.owQ;
          l5 = (l3 - l4 - l5) / 1000L;
          ab.v("MicroMsg.MMSightYUVMediaCodecRecorder", "presentationTime: ".concat(String.valueOf(l5)));
          ??? = this.inputBuffers[this.fXW];
          ((ByteBuffer)???).clear();
          ((ByteBuffer)???).put(paramArrayOfByte);
          ((ByteBuffer)???).position(0);
          if ((!this.cFy) || (paramBoolean))
            continue;
          this.eVq.queueInputBuffer(this.fXW, 0, paramArrayOfByte.length, l5, 0);
          UR();
          ab.v("MicroMsg.MMSightYUVMediaCodecRecorder", "encoder used %sms %sms", new Object[] { Long.valueOf(bo.az(l1)), Long.valueOf(bo.az(l2)) });
          AppMethodBeat.o(76678);
          break;
        }
        long l5 = this.startTime;
        continue;
        ab.v("MicroMsg.MMSightYUVMediaCodecRecorder", "end of stream");
        this.fXY = true;
        this.eVq.queueInputBuffer(this.fXW, 0, paramArrayOfByte.length, l5, 4);
        continue;
      }
      catch (Exception paramArrayOfByte)
      {
        k.bPB();
        ab.e("MicroMsg.MMSightYUVMediaCodecRecorder", "writeData error: %s", new Object[] { paramArrayOfByte.getMessage() });
        ab.printErrStackTrace("MicroMsg.MMSightYUVMediaCodecRecorder", paramArrayOfByte, "", new Object[0]);
        AppMethodBeat.o(76678);
      }
      break;
      label499: ab.v("MicroMsg.MMSightYUVMediaCodecRecorder", "input buffer not available");
    }
  }

  public int ew(int paramInt1, int paramInt2)
  {
    paramInt1 = -1;
    AppMethodBeat.i(76674);
    try
    {
      this.owS = paramInt2;
      paramInt2 = alL();
      paramInt1 = paramInt2;
      AppMethodBeat.o(76674);
      return paramInt1;
    }
    catch (Exception localException1)
    {
      while (true)
      {
        ab.e("MicroMsg.MMSightYUVMediaCodecRecorder", "init error: %s, try to re-init again", new Object[] { localException1.getMessage() });
        try
        {
          if (CaptureMMProxy.getInstance() != null)
            CaptureMMProxy.getInstance().set(ac.a.xPp, Integer.valueOf(-1));
          paramInt2 = alL();
          paramInt1 = paramInt2;
          AppMethodBeat.o(76674);
        }
        catch (Exception localException2)
        {
          ab.e("MicroMsg.MMSightYUVMediaCodecRecorder", "re-init again error: %s", new Object[] { localException2.getMessage() });
          k.bPA();
          AppMethodBeat.o(76674);
        }
      }
    }
  }

  protected void g(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    AppMethodBeat.i(76680);
    o localo;
    if ((this.ovV != null) && ((paramBufferInfo.flags & 0x4) == 0))
      localo = this.ovV;
    while (true)
    {
      try
      {
        if ((localo.owN != null) && (localo.owO != -1) && (localo.cFy))
        {
          if (paramByteBuffer == null)
            continue;
          i = 1;
          if (paramBufferInfo == null)
            continue;
          j = 1;
          if ((j & i) != 0)
          {
            long l1 = paramBufferInfo.presentationTimeUs;
            paramBufferInfo.presentationTimeUs = ((System.nanoTime() - localo.owQ) / 1000L);
            paramBufferInfo.flags = 1;
            long l2 = bo.yz();
            localo.owN.writeSampleData(localo.owO, paramByteBuffer, paramBufferInfo);
            ab.v("MicroMsg.MMSightSystemMediaMuxer", "writeAACSampleData size: %s used %dms oldpts %s fix pts: %s", new Object[] { Integer.valueOf(paramBufferInfo.size), Long.valueOf(bo.az(l2)), Long.valueOf(l1), Long.valueOf(paramBufferInfo.presentationTimeUs) });
          }
        }
        AppMethodBeat.o(76680);
        return;
        int i = 0;
        continue;
        int j = 0;
        continue;
      }
      catch (Exception paramByteBuffer)
      {
        ab.e("MicroMsg.MMSightSystemMediaMuxer", "writeX264SampleData error: %s", new Object[] { paramByteBuffer.getMessage() });
      }
      AppMethodBeat.o(76680);
    }
  }

  public final void start()
  {
    AppMethodBeat.i(76673);
    ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "Start");
    this.cFy = true;
    ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "Start：isStart：" + this.cFy);
    this.startTime = System.currentTimeMillis();
    AppMethodBeat.o(76673);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.r
 * JD-Core Version:    0.6.2
 */