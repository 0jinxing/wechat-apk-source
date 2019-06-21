package com.tencent.mm.media.g;

import a.f.b.j;
import a.l;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.e.a;
import com.tencent.mm.media.i.c;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.sight.base.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/remuxer/MixMuxerController;", "", "remuxStartTime", "", "remuxEndTime", "outputBitrate", "", "(JJI)V", "TAG", "", "aacSampleRate", "bufId", "channelCount", "duration", "frameCount", "isRelease", "", "getRemuxEndTime", "()J", "getRemuxStartTime", "getBufID", "output", "mediaExtractor", "Lcom/tencent/mm/media/extractor/MediaExtractorWrapper;", "muxOuputFilePath", "sampleRate", "mute", "release", "", "writeAudioData", "startTime", "endTime", "encodeData", "Ljava/nio/ByteBuffer;", "size", "writeVideoData", "plugin-mediaeditor_release"})
public final class h
{
  final String TAG;
  private int duration;
  int eTa;
  boolean eWi;
  final long eXM;
  final long eXN;
  private final int eYm;
  int frameCount;

  public h(long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(13082);
    this.eXM = paramLong1;
    this.eXN = paramLong2;
    this.eYm = paramInt;
    this.TAG = "MicroMsg.MixMuxerController";
    this.duration = ((int)(this.eXN - this.eXM));
    if (this.duration != 0)
      this.eTa = SightVideoJNI.initDataBufferForRemux();
    this.eWi = false;
    ab.i(this.TAG, "init endTime:" + this.eXN + ", startTime:" + this.eXM + ", duration:" + this.duration + ", bufId:" + this.eTa);
    AppMethodBeat.o(13082);
  }

  private void release()
  {
    AppMethodBeat.i(13080);
    SightVideoJNI.releaseDataBuffer(this.eTa);
    this.eWi = true;
    AppMethodBeat.o(13080);
  }

  public final int a(a parama, String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(13079);
    j.p(parama, "mediaExtractor");
    j.p(paramString, "muxOuputFilePath");
    if (this.eWi)
    {
      ab.e(this.TAG, "output, already release");
      paramInt1 = -1;
      AppMethodBeat.o(13079);
    }
    while (true)
    {
      return paramInt1;
      if (this.frameCount > 0)
        break;
      ab.e(this.TAG, "output, no write h264 frame!!");
      parama = c.faj;
      c.Wb();
      paramInt1 = -1;
      AppMethodBeat.o(13079);
    }
    int i;
    if ((paramInt1 == 0) || (paramInt2 == 0))
    {
      i = parama.eWd;
      String str = parama.UW();
      parama = parama.eWf;
      if ((i >= 0) && (parama != null) && (!bo.isNullOrNil(str)))
      {
        paramInt1 = parama.getInteger("channel-count");
        i = parama.getInteger("sample-rate");
      }
    }
    while (true)
    {
      float f = this.frameCount * 1000.0F / this.duration;
      ab.i(this.TAG, "output, fps:" + f + ", frameCount:" + this.frameCount + ", outputBitrate:" + this.eYm + ", finalChannelCount:" + paramInt1 + ", finalSampleRate:" + i + ", outputPath:" + paramString + ", bufId:" + this.eTa);
      paramInt1 = SightVideoJNI.muxingLock(this.eTa, null, i, 1024, 2, paramInt1, 0L, paramString, f, Math.max(1000, this.duration), this.eYm, b.qwW, 8, 2, 23.0F, null, 0, false, paramBoolean);
      release();
      if (paramInt1 < 0)
      {
        parama = c.faj;
        c.Wc();
      }
      AppMethodBeat.o(13079);
      break;
      i = paramInt1;
      paramInt1 = paramInt2;
    }
  }

  public final void a(a parama, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(13081);
    if (parama == null)
      AppMethodBeat.o(13081);
    while (true)
    {
      return;
      if (this.eWi)
      {
        ab.e(this.TAG, "writeAudioData, already release");
        AppMethodBeat.o(13081);
      }
      else
      {
        int i = parama.eWd;
        Object localObject = parama.UW();
        MediaFormat localMediaFormat = parama.eWf;
        if ((i >= 0) && (localMediaFormat != null) && (!bo.isNullOrNil((String)localObject)))
        {
          ab.i(this.TAG, "writeAudioData, startTime: ".concat(String.valueOf(paramLong1)));
          parama.UU();
          if (paramLong1 > 0L)
            parama.seek(1000L * paramLong1);
          localObject = ByteBuffer.allocateDirect(localMediaFormat.getInteger("max-input-size"));
          while (true)
          {
            ((ByteBuffer)localObject).clear();
            j.o(localObject, "dstBuf");
            parama.k((ByteBuffer)localObject);
            int j = parama.sampleSize;
            ab.d(this.TAG, "sampleSize: %d", new Object[] { Integer.valueOf(j) });
            if (j <= 0)
            {
              ab.i(this.TAG, "muxAudio size = %d. Saw eos.", new Object[] { Integer.valueOf(j) });
              AppMethodBeat.o(13081);
              break;
            }
            long l = parama.getSampleTime();
            ab.i(this.TAG, "aac pts:".concat(String.valueOf(l)));
            if ((l >= 1000L * paramLong2) || (l < 0L))
            {
              ab.i(this.TAG, "pts exceed endTime");
              AppMethodBeat.o(13081);
              break;
            }
            if (parama.eWb.getSampleTrackIndex() != i)
            {
              ab.e(this.TAG, "track index not match! break");
              AppMethodBeat.o(13081);
              break;
            }
            if (l < 1000L * paramLong1)
            {
              ab.i(this.TAG, "not reach start");
            }
            else
            {
              ((ByteBuffer)localObject).position(0);
              c((ByteBuffer)localObject, j);
            }
          }
        }
        AppMethodBeat.o(13081);
      }
    }
  }

  public final void c(ByteBuffer paramByteBuffer, int paramInt)
  {
    AppMethodBeat.i(13078);
    j.p(paramByteBuffer, "encodeData");
    if (this.eWi)
    {
      ab.e(this.TAG, "writeAACData, already release");
      AppMethodBeat.o(13078);
    }
    while (true)
    {
      return;
      ab.i(this.TAG, "writeAACData: " + paramByteBuffer.capacity() + ", " + paramInt + ", bufId:" + this.eTa);
      SightVideoJNI.writeAACDataLock(this.eTa, paramByteBuffer, paramInt);
      AppMethodBeat.o(13078);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.g.h
 * JD-Core Version:    0.6.2
 */