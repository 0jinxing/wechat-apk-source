package com.tencent.mm.plugin.mmsight.model.b;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.api.a.a;
import com.tencent.mm.plugin.mmsight.model.a.j;
import com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class b extends com.tencent.mm.plugin.mmsight.api.a
{
  private int aOn;
  private MediaExtractor clX;
  private int eTa;
  private int eTt;
  private int eWK;
  private int eXJ;
  private int eXK;
  private int eXL;
  private long eXM;
  private long eXN;
  private Bitmap eXi;
  private String eYj;
  private int eYk;
  private int eYl;
  private int eYm;
  private int eYp;
  private Point fYS;
  private String filePath;
  private a oxf;
  private f oxg;
  private HandlerThread oxh;
  private b.a oxi;
  private byte[] oxj;
  private byte[] oxk;
  private a.a oxl;
  private int videoFps;

  public b(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(76694);
    this.eWK = -1;
    this.eXM = -1L;
    this.eXN = -1L;
    this.eYp = -1;
    this.fYS = null;
    this.oxj = null;
    this.oxk = null;
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)) || (paramInt1 <= 0) || (paramInt2 <= 0))
    {
      ab.e("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt4) });
      AppMethodBeat.o(76694);
    }
    while (true)
    {
      return;
      this.filePath = paramString1;
      this.eYj = paramString2;
      this.eYk = paramInt1;
      this.eYl = paramInt2;
      this.eYm = paramInt3;
      this.eYp = paramInt4;
      this.eXL = SightVideoJNI.getMp4Rotate(paramString1);
      com.tencent.mm.plugin.sight.base.a locala = com.tencent.mm.plugin.sight.base.d.WR(paramString1);
      if (locala != null)
      {
        this.eXJ = locala.width;
        this.eXK = locala.height;
        this.eWK = locala.eWK;
        this.videoFps = locala.eTk;
      }
      this.eXM = 0L;
      this.eXN = this.eWK;
      ab.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "create MMSightFFMpegMediaCodecRemuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s", new Object[] { paramString1, paramString2, Integer.valueOf(this.eXJ), Integer.valueOf(this.eXK), Integer.valueOf(this.eXL), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      AppMethodBeat.o(76694);
    }
  }

  public b(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(76695);
    this.eWK = -1;
    this.eXM = -1L;
    this.eXN = -1L;
    this.eYp = -1;
    this.fYS = null;
    this.oxj = null;
    this.oxk = null;
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)) || (paramInt1 <= 0) || (paramInt2 <= 0))
    {
      ab.e("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt4) });
      AppMethodBeat.o(76695);
    }
    while (true)
    {
      return;
      this.filePath = paramString1;
      this.eYj = paramString2;
      this.eYk = paramInt1;
      this.eYl = paramInt2;
      this.eYm = paramInt3;
      this.eYp = paramInt4;
      this.eXL = SightVideoJNI.getMp4Rotate(paramString1);
      com.tencent.mm.plugin.sight.base.a locala = com.tencent.mm.plugin.sight.base.d.WR(paramString1);
      if (locala != null)
      {
        this.eXJ = locala.width;
        this.eXK = locala.height;
        this.videoFps = locala.eTk;
      }
      this.eXM = paramLong1;
      this.eXN = paramLong2;
      ab.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "create MMSightFFMpegMediaCodecRemuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s, startTimeMs: %s, endTimeMs: %s", new Object[] { paramString1, paramString2, Integer.valueOf(this.eXJ), Integer.valueOf(this.eXK), Integer.valueOf(this.eXL), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
      AppMethodBeat.o(76695);
    }
  }

  public final int Va()
  {
    AppMethodBeat.i(76696);
    int i = Math.round(this.eWK / 1000.0F);
    int j = i;
    if (this.eXM >= 0L)
    {
      j = i;
      if (this.eXN >= 0L)
        j = Math.round((float)(this.eXN - this.eXM) / 1000.0F) + 1;
    }
    this.eTa = MP4MuxerJNI.initDataBufLock(j);
    if (com.tencent.mm.bj.e.uD(this.filePath))
    {
      ab.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "ish265, create mediacodec decoder");
      this.oxf = new e();
      if (this.eWK <= 0)
        break label177;
      j = this.oxf.e(this.filePath, 0L, this.eWK, this.videoFps);
      label125: ab.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "decoder init ret: %s", new Object[] { Integer.valueOf(j) });
      if (j >= 0)
        break label282;
      MP4MuxerJNI.releaseDataBufLock(this.eTa);
      j = -1;
      AppMethodBeat.o(76696);
    }
    while (true)
    {
      return j;
      this.oxf = new d();
      break;
      label177: if ((this.eXM >= 0L) && (this.eXN >= 0L))
      {
        j = this.oxf.e(this.filePath, this.eXM, this.eXN, this.videoFps);
        break label125;
      }
      ab.e("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "remux time error, videoDuration: %s, remuxStartTime: %s, remuxEndTime: %s", new Object[] { Integer.valueOf(this.eWK), Long.valueOf(this.eXM), Long.valueOf(this.eXN) });
      MP4MuxerJNI.releaseDataBufLock(this.eTa);
      j = -1;
      AppMethodBeat.o(76696);
    }
    label282: if ((this.eYp > 0) && (this.eYp < this.videoFps))
      this.oxf.mp((int)Math.ceil(this.videoFps / this.eYp));
    if (this.eYp > 0)
    {
      j = Math.min(this.eYp, this.videoFps);
      this.oxg = new f(this.eXJ, this.eXK, this.eYk, this.eYl, this.eYm, j);
      this.oxf.a(new b.1(this));
      this.oxg.oxu = new f.a()
      {
        public final void a(int paramAnonymousInt1, ByteBuffer paramAnonymousByteBuffer, int paramAnonymousInt2)
        {
          AppMethodBeat.i(76692);
          MP4MuxerJNI.writeH264DataLock(paramAnonymousInt1, paramAnonymousByteBuffer, paramAnonymousInt2);
          AppMethodBeat.o(76692);
        }
      };
    }
    while (true)
    {
      Object localObject2;
      try
      {
        while (true)
        {
          this.oxg.mq(this.eTa);
          Object localObject1 = this.oxg;
          ab.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "Start");
          ((f)localObject1).cFy = true;
          this.oxf.bPZ();
          this.oxh.quitSafely();
          this.oxh.join();
          this.oxi = null;
          localObject1 = new android/media/MediaExtractor;
          ((MediaExtractor)localObject1).<init>();
          this.clX = ((MediaExtractor)localObject1);
          try
          {
            this.clX.setDataSource(this.filePath);
            localObject1 = null;
            j = 0;
            if (j >= this.clX.getTrackCount())
              break label985;
            localObject2 = this.clX.getTrackFormat(j);
            localObject1 = ((MediaFormat)localObject2).getString("mime");
            if (!((String)localObject1).startsWith("audio/"))
              break label909;
            if ((j >= 0) && (localObject2 != null) && (!bo.isNullOrNil((String)localObject1)))
            {
              this.aOn = ((MediaFormat)localObject2).getInteger("channel-count");
              this.eTt = ((MediaFormat)localObject2).getInteger("sample-rate");
              this.clX.selectTrack(j);
              if (this.eXM > 0L)
                this.clX.seekTo(this.eXM * 1000L, 0);
              localObject1 = ByteBuffer.allocateDirect(((MediaFormat)localObject2).getInteger("max-input-size"));
              ((ByteBuffer)localObject1).clear();
              i = this.clX.readSampleData((ByteBuffer)localObject1, 0);
              ab.d("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "sampleSize: %d", new Object[] { Integer.valueOf(i) });
              if (i > 0)
                break label915;
              ab.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "muxAudio size = %d. Saw eos.", new Object[] { Integer.valueOf(i) });
            }
            localObject2 = this.eYj;
            localObject1 = localObject2;
            if (this.eXL > 0)
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              localObject1 = (String)localObject2 + "tempRotate.mp4";
            }
            long l = this.eWK;
            if (l > 0L)
              break label982;
            l = this.eXN - this.eXM;
            j = MP4MuxerJNI.muxingLock(this.eTa, this.eTt, 1024, 2, this.aOn, (String)localObject1, this.oxg.frameCount * 1000.0F / (float)l, null, 0);
            ab.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "muxing ret: %s", new Object[] { Integer.valueOf(j) });
            if (this.eXL > 0)
            {
              SightVideoJNI.tagRotateVideo((String)localObject1, this.eYj, this.eXL);
              com.tencent.mm.vfs.e.deleteFile((String)localObject1);
            }
            MP4MuxerJNI.releaseDataBufLock(this.eTa);
            j.owk.WY();
            AppMethodBeat.o(76696);
            break;
            j = this.videoFps;
          }
          catch (IOException localIOException)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.MMSightFFMpegMediaCodecRemuxer", localIOException, "muxAudio create extractor failed: %s", new Object[] { localIOException.getMessage() });
          }
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.MMSightFFMpegMediaCodecRemuxer", localException, "decode error: %s", new Object[] { localException.getMessage() });
        j = -1;
        AppMethodBeat.o(76696);
      }
      break;
      label909: j++;
      continue;
      label915: if (this.clX.getSampleTime() < this.eXN * 1000L)
        if (this.clX.getSampleTrackIndex() != j)
        {
          ab.e("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "track index not match! break");
        }
        else
        {
          localException.position(0);
          MP4MuxerJNI.writeAACDataLock(this.eTa, localException, i);
          this.clX.advance();
          continue;
          label982: continue;
          label985: localObject2 = null;
          j = -1;
        }
    }
  }

  public final int getType()
  {
    return 1;
  }

  public final void r(Bitmap paramBitmap)
  {
    if (paramBitmap != null)
      this.eXi = paramBitmap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.b.b
 * JD-Core Version:    0.6.2
 */