package com.tencent.qqmusic.mediaplayer.codec;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.AudioRecognition;
import com.tencent.qqmusic.mediaplayer.NativeLibs;
import com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable;
import com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3SeekTable;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.Mp4SeekTable;
import com.tencent.qqmusic.mediaplayer.upstream.FileDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
public class MediaCodecDecoder extends BaseDecoder
{
  private static final String TAG = "MediaCodecDecoder";
  private static final int TIMEOUT_US = 500000;
  private long mCurrentDecodeTime;
  private boolean mDecoderFinished;
  private long mFileSize;
  private AudioInformation mInfo;
  private MediaCodec mMediaCodec;
  private final MediaExtractor mMediaExtractor;
  private MediaFormat mMediaFormat;
  private byte[] mRemainBuffer;
  private SeekTable mSeekTable;

  public MediaCodecDecoder()
  {
    AppMethodBeat.i(128535);
    this.mMediaExtractor = new MediaExtractor();
    this.mMediaFormat = null;
    this.mMediaCodec = null;
    this.mInfo = null;
    this.mDecoderFinished = false;
    this.mCurrentDecodeTime = 0L;
    this.mRemainBuffer = null;
    this.mSeekTable = null;
    this.mFileSize = 0L;
    AppMethodBeat.o(128535);
  }

  private void initAudioInformation(String paramString, int paramInt, MediaFormat paramMediaFormat, IDataSource paramIDataSource)
  {
    AppMethodBeat.i(128545);
    this.mMediaExtractor.selectTrack(paramInt);
    this.mMediaCodec = MediaCodec.createDecoderByType(paramString);
    this.mMediaCodec.configure(paramMediaFormat, null, null, 0);
    this.mMediaFormat = paramMediaFormat;
    int i = this.mMediaFormat.getInteger("sample-rate");
    int j = this.mMediaFormat.getInteger("channel-count");
    long l = this.mMediaFormat.getLong("durationUs") / 1000L;
    int k;
    if (this.mMediaFormat.containsKey("bitrate"))
      k = this.mMediaFormat.getInteger("bitrate") / 1000;
    while (true)
    {
      label154: int m;
      if ((Build.VERSION.SDK_INT >= 24) && (this.mMediaFormat.containsKey("pcm-encoding")))
        switch (this.mMediaFormat.getInteger("pcm-encoding"))
        {
        default:
          paramInt = 2;
          if (Build.VERSION.SDK_INT >= 21)
            m = 0;
          break;
        case 3:
        case 4:
        }
      try
      {
        n = this.mMediaFormat.getInteger("bitrate-mode");
        switch (n)
        {
        default:
          label200: this.mInfo.setSampleRate(i);
          this.mInfo.setChannels(j);
          this.mInfo.setDuration(l);
          this.mInfo.setBitrate(k);
          this.mInfo.setBitDept(paramInt);
          paramString = paramIDataSource.getAudioType();
          if (paramString == AudioFormat.AudioType.FLAC)
          {
            this.mSeekTable = new FlacSeekTable(i);
            label273: if (this.mSeekTable == null)
              break;
          }
          break;
        case 2:
        case 1:
        }
        try
        {
          this.mSeekTable.parse(paramIDataSource);
          this.mMediaCodec.start();
          AppMethodBeat.o(128545);
          return;
          if (l > 0L)
          {
            k = (int)(paramIDataSource.getSize() / l * 8L);
            continue;
          }
          k = 0;
          continue;
          paramInt = 1;
          break label154;
          paramInt = 4;
          break label154;
          paramInt = 2;
          break label154;
          this.mInfo.setCbr(1);
          break label200;
          this.mInfo.setCbr(3);
          break label200;
          if ((paramString == AudioFormat.AudioType.M4A) || (paramString == AudioFormat.AudioType.MP4))
          {
            this.mSeekTable = new Mp4SeekTable();
            break label273;
          }
          if (paramString != AudioFormat.AudioType.MP3)
            break label273;
          this.mSeekTable = new Mp3SeekTable();
        }
        catch (InvalidBoxException paramString)
        {
          while (true)
          {
            this.mSeekTable = null;
            Logger.e("MediaCodecDecoder", "seek table parse", paramString);
          }
        }
      }
      catch (Exception paramString)
      {
        while (true)
          int n = m;
      }
    }
  }

  private void initMediaCodecAndFormat(IDataSource paramIDataSource)
  {
    AppMethodBeat.i(128544);
    int i = 0;
    if (i < this.mMediaExtractor.getTrackCount())
    {
      MediaFormat localMediaFormat = this.mMediaExtractor.getTrackFormat(i);
      String str = localMediaFormat.getString("mime");
      if ((!TextUtils.isEmpty(str)) && (str.startsWith("audio")))
      {
        this.mInfo = new AudioInformation();
        this.mInfo.setAudioType(paramIDataSource.getAudioType());
        setAudioType(paramIDataSource.getAudioType());
        initAudioInformation(str, i, localMediaFormat, paramIDataSource);
        AppMethodBeat.o(128544);
      }
    }
    while (true)
    {
      return;
      i++;
      break;
      AppMethodBeat.o(128544);
    }
  }

  public int decodeData(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(128539);
    int i;
    if ((this.mRemainBuffer != null) && (this.mRemainBuffer.length > 0))
      if (paramInt >= this.mRemainBuffer.length)
      {
        System.arraycopy(this.mRemainBuffer, 0, paramArrayOfByte, 0, this.mRemainBuffer.length);
        i = this.mRemainBuffer.length;
        this.mRemainBuffer = null;
      }
    while (true)
    {
      AppMethodBeat.o(128539);
      return i;
      System.arraycopy(this.mRemainBuffer, 0, paramArrayOfByte, 0, paramInt);
      int j = this.mRemainBuffer.length - paramInt;
      paramArrayOfByte = new byte[j];
      System.arraycopy(this.mRemainBuffer, paramInt, paramArrayOfByte, 0, j);
      this.mRemainBuffer = paramArrayOfByte;
      i = paramInt;
      continue;
      if (this.mMediaCodec != null)
      {
        ByteBuffer[] arrayOfByteBuffer1 = this.mMediaCodec.getInputBuffers();
        ByteBuffer[] arrayOfByteBuffer2 = this.mMediaCodec.getOutputBuffers();
        MediaCodec.BufferInfo localBufferInfo = new MediaCodec.BufferInfo();
        j = 0;
        i = j;
        if (!this.mDecoderFinished)
        {
          i = j;
          if (j <= 0)
          {
            int k = this.mMediaCodec.dequeueInputBuffer(500000L);
            ByteBuffer localByteBuffer;
            if (k >= 0)
            {
              localByteBuffer = arrayOfByteBuffer1[k];
              i = this.mMediaExtractor.readSampleData(localByteBuffer, 0);
              if (i < 0)
              {
                Logger.i("MediaCodecDecoder", "InputBuffer BUFFER_FLAG_END_OF_STREAM");
                this.mMediaCodec.queueInputBuffer(k, 0, 0, 0L, 4);
              }
            }
            else
            {
              label224: i = this.mMediaCodec.dequeueOutputBuffer(localBufferInfo, 500000L);
              switch (i)
              {
              default:
                localByteBuffer = arrayOfByteBuffer2[i];
                if (paramInt >= localBufferInfo.size)
                  break;
              case -3:
              case -2:
              case -1:
              }
            }
            for (j = paramInt; ; j = localBufferInfo.size)
            {
              localByteBuffer.get(paramArrayOfByte, 0, j);
              if (localBufferInfo.size > paramInt)
              {
                k = localBufferInfo.size - paramInt;
                this.mRemainBuffer = new byte[k];
                localByteBuffer.get(this.mRemainBuffer, 0, k);
              }
              localByteBuffer.clear();
              this.mMediaCodec.releaseOutputBuffer(i, false);
              long l1 = this.mCurrentDecodeTime;
              this.mCurrentDecodeTime = (localBufferInfo.presentationTimeUs / 1000L);
              if ((this.mInfo != null) && (this.mInfo.getBitDept() == 0))
              {
                long l2 = this.mCurrentDecodeTime;
                i = AudioRecognition.calcBitDept(localBufferInfo.size, l2 - l1, this.mInfo.getChannels(), this.mInfo.getSampleRate());
                this.mInfo.setBitDept(i);
              }
              while (true)
              {
                if ((localBufferInfo.flags & 0x4) != 0)
                {
                  this.mDecoderFinished = true;
                  Logger.i("MediaCodecDecoder", "OutputBuffer BUFFER_FLAG_END_OF_STREAM");
                }
                break;
                this.mMediaCodec.queueInputBuffer(k, 0, i, this.mMediaExtractor.getSampleTime(), 0);
                this.mMediaExtractor.advance();
                break label224;
                Logger.i("MediaCodecDecoder", "INFO_OUTPUT_BUFFERS_CHANGED");
                arrayOfByteBuffer2 = this.mMediaCodec.getOutputBuffers();
                continue;
                this.mMediaFormat = this.mMediaCodec.getOutputFormat();
                Logger.i("MediaCodecDecoder", "New format " + this.mMediaFormat);
                continue;
                Logger.i("MediaCodecDecoder", "dequeueOutputBuffer timed out!");
              }
            }
          }
        }
      }
      else
      {
        i = 0;
      }
    }
  }

  public AudioInformation getAudioInformation()
  {
    return this.mInfo;
  }

  public long getBytePositionOfTime(long paramLong)
  {
    long l = 0L;
    AppMethodBeat.i(128546);
    int i = this.mInfo.getBitrate();
    if (this.mSeekTable != null)
    {
      paramLong = this.mSeekTable.seek(paramLong);
      AppMethodBeat.o(128546);
    }
    while (true)
    {
      return paramLong;
      if (i > 0)
      {
        paramLong = i * paramLong;
        AppMethodBeat.o(128546);
      }
      else if (getDuration() > 0L)
      {
        paramLong = this.mFileSize * paramLong / getDuration();
        AppMethodBeat.o(128546);
      }
      else
      {
        AppMethodBeat.o(128546);
        paramLong = l;
      }
    }
  }

  public long getCurrentTime()
  {
    return this.mCurrentDecodeTime;
  }

  public long getDuration()
  {
    AppMethodBeat.i(128542);
    long l = 0L;
    if (this.mInfo != null)
      l = this.mInfo.getDuration();
    AppMethodBeat.o(128542);
    return l;
  }

  public int getErrorCodeMask()
  {
    return -1;
  }

  public long getMinBufferSize()
  {
    int i = 4;
    AppMethodBeat.i(128543);
    int j;
    if (this.mInfo != null)
    {
      j = this.mInfo.getBitDept();
      if (j == 1)
        i = 3;
    }
    for (long l = AudioTrack.getMinBufferSize((int)this.mInfo.getSampleRate(), 12, i); ; l = 0L)
    {
      AppMethodBeat.o(128543);
      return l;
      if ((j == 4) && (Build.VERSION.SDK_INT >= 21))
        break;
      i = 2;
      break;
    }
  }

  protected List<NativeLibs> getNativeLibs()
  {
    AppMethodBeat.i(128536);
    ArrayList localArrayList = new ArrayList();
    AppMethodBeat.o(128536);
    return localArrayList;
  }

  @TargetApi(23)
  public int init(IDataSource paramIDataSource)
  {
    AppMethodBeat.i(128538);
    int i = -1;
    int j = i;
    if (paramIDataSource != null);
    try
    {
      paramIDataSource.open();
      MediaExtractor localMediaExtractor = this.mMediaExtractor;
      MediaCodecDecoder.1 local1 = new com/tencent/qqmusic/mediaplayer/codec/MediaCodecDecoder$1;
      local1.<init>(this, paramIDataSource);
      localMediaExtractor.setDataSource(local1);
      this.mFileSize = paramIDataSource.getSize();
      initMediaCodecAndFormat(paramIDataSource);
      j = 0;
      AppMethodBeat.o(128538);
      return j;
    }
    catch (IOException paramIDataSource)
    {
      while (true)
      {
        Logger.e("MediaCodecDecoder", "init", paramIDataSource);
        j = i;
      }
    }
  }

  public int init(INativeDataSource paramINativeDataSource)
  {
    return -1;
  }

  public int init(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(128537);
    int i = init(new FileDataSource(paramString));
    AppMethodBeat.o(128537);
    return i;
  }

  public int release()
  {
    AppMethodBeat.i(128541);
    this.mMediaExtractor.release();
    if (this.mMediaCodec != null)
      this.mMediaCodec.release();
    AppMethodBeat.o(128541);
    return 0;
  }

  public int seekTo(int paramInt)
  {
    AppMethodBeat.i(128540);
    this.mMediaExtractor.seekTo(paramInt * 1000, 2);
    AppMethodBeat.o(128540);
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.codec.MediaCodecDecoder
 * JD-Core Version:    0.6.2
 */