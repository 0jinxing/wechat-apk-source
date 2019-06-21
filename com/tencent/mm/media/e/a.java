package com.tencent.mm.media.e;

import a.f.b.j;
import a.k.m;
import a.l;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.nio.ByteBuffer;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/extractor/MediaExtractorWrapper;", "", "filePath", "", "(Ljava/lang/String;)V", "audioTrackForamt", "Landroid/media/MediaFormat;", "audioTrackIndex", "", "hasError", "", "isRelease", "mediaExtractor", "Landroid/media/MediaExtractor;", "sampleSize", "selectVideo", "videoBitrate", "videoTrackFormat", "videoTrackIndex", "getAudioFormat", "getAudioMIME", "getAudioTrackIndex", "getBitrate", "getCurrentSampleSize", "getDuration", "getFile", "getFilePath", "getSampleTime", "", "getSampleTrackIndex", "getVideoFormat", "getVideoHeight", "getVideoMIME", "getVideoWidth", "isSelectVideo", "readNextSampleData", "byteBuffer", "Ljava/nio/ByteBuffer;", "release", "", "seek", "startTime", "selectAudio", "setBitrate", "bitrate", "toString", "Companion", "plugin-mediaeditor_release"})
public final class a
{
  public static final a.a eWj;
  public final MediaExtractor eWb;
  private int eWc;
  public int eWd;
  public MediaFormat eWe;
  public MediaFormat eWf;
  private boolean eWg;
  public boolean eWh;
  private boolean eWi;
  public final String filePath;
  public int sampleSize;
  private int videoBitrate;

  static
  {
    AppMethodBeat.i(12981);
    eWj = new a.a((byte)0);
    AppMethodBeat.o(12981);
  }

  public a(String paramString)
  {
    AppMethodBeat.i(12980);
    this.filePath = paramString;
    this.eWb = new MediaExtractor();
    this.eWc = -1;
    this.eWd = -1;
    try
    {
      paramString = new java/lang/StringBuilder;
      paramString.<init>("filePath :");
      ab.c("MicroMsg.MediaExtractorWrapper", this.filePath, new Object[0]);
      this.eWb.setDataSource(this.filePath);
      int i = this.eWb.getTrackCount();
      ab.c("MicroMsg.MediaExtractorWrapper", "trackCount :".concat(String.valueOf(i)), new Object[0]);
      int j = 0;
      if (j < i)
      {
        MediaFormat localMediaFormat = this.eWb.getTrackFormat(j);
        paramString = localMediaFormat.getString("mime");
        j.o(paramString, "mime");
        if (m.d((CharSequence)paramString, (CharSequence)"video"))
        {
          this.eWe = localMediaFormat;
          this.eWc = j;
        }
        while (true)
        {
          j++;
          break;
          if (m.d((CharSequence)paramString, (CharSequence)"audio"))
          {
            this.eWf = localMediaFormat;
            this.eWd = j;
          }
        }
      }
    }
    catch (Exception paramString)
    {
      ab.printErrStackTrace("MicroMsg.MediaExtractorWrapper", (Throwable)paramString, "", new Object[0]);
      this.eWh = true;
      AppMethodBeat.o(12980);
    }
    while (true)
    {
      return;
      if (this.eWc >= 0)
      {
        this.eWb.selectTrack(this.eWc);
        this.eWg = true;
      }
      paramString = new android/media/MediaMetadataRetriever;
      paramString.<init>();
      paramString.setDataSource(this.filePath);
      this.videoBitrate = Integer.parseInt(paramString.extractMetadata(20));
      paramString = new java/lang/StringBuilder;
      paramString.<init>("current info :");
      ab.d("MicroMsg.MediaExtractorWrapper", toString());
      AppMethodBeat.o(12980);
    }
  }

  public final void UT()
  {
    AppMethodBeat.i(12970);
    try
    {
      if (this.eWd >= 0)
        this.eWb.unselectTrack(this.eWd);
      if (this.eWc >= 0)
      {
        this.eWg = true;
        this.eWb.selectTrack(this.eWc);
        this.sampleSize = 0;
        AppMethodBeat.o(12970);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MediaExtractorWrapper", (Throwable)localException, "selectVideo error", new Object[0]);
        AppMethodBeat.o(12970);
      }
    }
  }

  public final void UU()
  {
    AppMethodBeat.i(12971);
    try
    {
      if (this.eWc >= 0)
        this.eWb.unselectTrack(this.eWc);
      if (this.eWd >= 0)
      {
        this.eWg = false;
        this.eWb.selectTrack(this.eWd);
        this.sampleSize = 0;
        AppMethodBeat.o(12971);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MediaExtractorWrapper", (Throwable)localException, "selectAudio error", new Object[0]);
        AppMethodBeat.o(12971);
      }
    }
  }

  public final String UV()
  {
    AppMethodBeat.i(12972);
    Object localObject = this.eWe;
    if (localObject != null)
    {
      localObject = ((MediaFormat)localObject).getString("mime");
      AppMethodBeat.o(12972);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(12972);
    }
  }

  public final String UW()
  {
    AppMethodBeat.i(12973);
    Object localObject = this.eWf;
    if (localObject != null)
    {
      localObject = ((MediaFormat)localObject).getString("mime");
      AppMethodBeat.o(12973);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(12973);
    }
  }

  public final int getDuration()
  {
    int i = 0;
    AppMethodBeat.i(12978);
    MediaFormat localMediaFormat = this.eWe;
    int j;
    if (localMediaFormat != null)
    {
      j = (int)localMediaFormat.getLong("durationUs");
      if (j > 0)
        break label61;
      localMediaFormat = this.eWf;
      j = i;
      if (localMediaFormat != null)
        j = (int)localMediaFormat.getLong("durationUs");
    }
    label61: 
    while (true)
    {
      AppMethodBeat.o(12978);
      return j;
      j = 0;
      break;
    }
  }

  public final long getSampleTime()
  {
    AppMethodBeat.i(12974);
    try
    {
      l = this.eWb.getSampleTime();
      AppMethodBeat.o(12974);
      return l;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MediaExtractorWrapper", (Throwable)localException, "getSampleTime error", new Object[0]);
        long l = -1L;
        AppMethodBeat.o(12974);
      }
    }
  }

  public final boolean k(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(12976);
    j.p(paramByteBuffer, "byteBuffer");
    try
    {
      if (this.eWi)
      {
        ab.e("MicroMsg.MediaExtractorWrapper", "readNextSampleData already release");
        AppMethodBeat.o(12976);
        bool = false;
      }
      while (true)
      {
        return bool;
        this.sampleSize = this.eWb.readSampleData(paramByteBuffer, 0);
        this.eWb.advance();
        if (this.eWg);
        for (int i = this.eWc; ; i = this.eWd)
        {
          if (this.eWb.getSampleTrackIndex() == i)
            break label99;
          AppMethodBeat.o(12976);
          bool = false;
          break;
        }
        label99: bool = true;
        AppMethodBeat.o(12976);
      }
    }
    catch (Exception paramByteBuffer)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MediaExtractorWrapper", (Throwable)paramByteBuffer, "readNextSampleData", new Object[0]);
        AppMethodBeat.o(12976);
        boolean bool = false;
      }
    }
  }

  public final void release()
  {
    AppMethodBeat.i(12977);
    this.eWb.release();
    this.eWi = true;
    AppMethodBeat.o(12977);
  }

  public final void seek(long paramLong)
  {
    AppMethodBeat.i(12975);
    this.eWb.seekTo(paramLong, 0);
    AppMethodBeat.o(12975);
  }

  public final String toString()
  {
    AppMethodBeat.i(12979);
    String str = "MediaExtractorWrapper(filePath='" + this.filePath + "', mediaExtractor=" + this.eWb + ", videoTrackIndex=" + this.eWc + ", audioTrackIndex=" + this.eWd + ", videoTrackFormat=" + this.eWe + ", audioTrackForamt=" + this.eWf + ", videoBitrate=" + this.videoBitrate + ", selectVideo=" + this.eWg + ", sampleSize=" + this.sampleSize + ", hasError=" + this.eWh + ", isRelease=" + this.eWi + ')';
    AppMethodBeat.o(12979);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.e.a
 * JD-Core Version:    0.6.2
 */