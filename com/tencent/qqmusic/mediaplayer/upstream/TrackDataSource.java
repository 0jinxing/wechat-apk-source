package com.tencent.qqmusic.mediaplayer.upstream;

import android.text.TextUtils;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.BaseMediaPlayer;
import com.tencent.qqmusic.mediaplayer.PlayerListenerCallback;
import com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.File;
import java.io.IOException;

public class TrackDataSource
  implements PlayerListenerCallback, IDataSource
{
  private static final String TAG = "TrackDataSource";
  private IDataSource mDataSource;
  private long mEndBytePosition;
  private long mStartBytePosition;
  private long mStartTimePosition;
  private TrackInfo mTrackInfo;
  private TrackStateCallback mTrackStateCallback;

  public TrackDataSource(TrackInfo paramTrackInfo)
  {
    AppMethodBeat.i(104554);
    String str = paramTrackInfo.getUri();
    if (TextUtils.isEmpty(paramTrackInfo.getUri()))
    {
      paramTrackInfo = new DataSourceException(-1, "track info has no media file path!", null);
      AppMethodBeat.o(104554);
      throw paramTrackInfo;
    }
    if (!new File(str).exists())
    {
      paramTrackInfo = new DataSourceException(-1, "track info's media file not exists!", null);
      AppMethodBeat.o(104554);
      throw paramTrackInfo;
    }
    this.mDataSource = new FileDataSource(paramTrackInfo.getUri());
    this.mTrackInfo = paramTrackInfo;
    AppMethodBeat.o(104554);
  }

  public void close()
  {
    AppMethodBeat.i(104558);
    this.mDataSource.close();
    AppMethodBeat.o(104558);
  }

  public AudioFormat.AudioType getAudioType()
  {
    AppMethodBeat.i(104559);
    AudioFormat.AudioType localAudioType = this.mDataSource.getAudioType();
    AppMethodBeat.o(104559);
    return localAudioType;
  }

  public long getSize()
  {
    AppMethodBeat.i(104557);
    long l = this.mDataSource.getSize();
    AppMethodBeat.o(104557);
    return l;
  }

  public void onBufferingUpdate(BaseMediaPlayer paramBaseMediaPlayer, int paramInt)
  {
  }

  public void onCompletion(BaseMediaPlayer paramBaseMediaPlayer)
  {
  }

  public void onError(BaseMediaPlayer paramBaseMediaPlayer, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onPrepared(BaseMediaPlayer paramBaseMediaPlayer)
  {
    AppMethodBeat.i(104560);
    try
    {
      this.mDataSource.open();
      l1 = this.mDataSource.getSize();
      localSeekTable = paramBaseMediaPlayer.createSeekTable();
      paramBaseMediaPlayer = this.mTrackInfo.getRange();
      Logger.i("TrackDataSource", "start time: " + paramBaseMediaPlayer.first + ", end time: " + paramBaseMediaPlayer.second);
      if (((Long)paramBaseMediaPlayer.first).longValue() > ((Long)paramBaseMediaPlayer.second).longValue())
      {
        Logger.e("TrackDataSource", "start range larger, return");
        AppMethodBeat.o(104560);
        return;
      }
    }
    catch (IOException paramBaseMediaPlayer)
    {
      while (true)
      {
        long l1;
        SeekTable localSeekTable;
        Logger.e("TrackDataSource", "dataSource open failed!", paramBaseMediaPlayer);
        AppMethodBeat.o(104560);
        continue;
        this.mStartTimePosition = ((Long)paramBaseMediaPlayer.first).longValue();
        long l2 = localSeekTable.seek(((Long)paramBaseMediaPlayer.first).longValue());
        long l3 = localSeekTable.seek(((Long)paramBaseMediaPlayer.second).longValue());
        if ((l1 > 0L) && (l2 > l1))
        {
          Logger.e("TrackDataSource", "startBytePosition larger than size!");
          AppMethodBeat.o(104560);
        }
        else
        {
          long l4 = l3;
          if (l1 > 0L)
          {
            l4 = l3;
            if (l3 > l1)
              l4 = l1;
          }
          this.mStartBytePosition = l2;
          this.mEndBytePosition = l4;
          Logger.i("TrackDataSource", "start byte: " + this.mStartBytePosition + ", end byte: " + this.mEndBytePosition);
          if (this.mTrackStateCallback != null)
            this.mTrackStateCallback.onTrackPrepared(this.mTrackInfo);
          AppMethodBeat.o(104560);
        }
      }
    }
  }

  public void onSeekComplete(BaseMediaPlayer paramBaseMediaPlayer, int paramInt)
  {
  }

  public void onStarted(BaseMediaPlayer paramBaseMediaPlayer)
  {
    AppMethodBeat.i(104561);
    paramBaseMediaPlayer.seekTo(0);
    AppMethodBeat.o(104561);
  }

  public void onStateChanged(BaseMediaPlayer paramBaseMediaPlayer, int paramInt)
  {
  }

  public void open()
  {
    AppMethodBeat.i(104555);
    this.mDataSource.open();
    AppMethodBeat.o(104555);
  }

  public int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(104556);
    if ((this.mEndBytePosition > 0L) && (paramLong > this.mEndBytePosition))
    {
      paramInt1 = -1;
      AppMethodBeat.o(104556);
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = this.mDataSource.readAt(paramLong, paramArrayOfByte, paramInt1, paramInt2);
      AppMethodBeat.o(104556);
    }
  }

  public void setEndBytePosition(long paramLong)
  {
    this.mEndBytePosition = paramLong;
  }

  public void setTrackStateCallback(TrackStateCallback paramTrackStateCallback)
  {
    this.mTrackStateCallback = paramTrackStateCallback;
  }

  public static abstract interface TrackStateCallback
  {
    public abstract void onTrackPrepared(TrackInfo paramTrackInfo);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.TrackDataSource
 * JD-Core Version:    0.6.2
 */