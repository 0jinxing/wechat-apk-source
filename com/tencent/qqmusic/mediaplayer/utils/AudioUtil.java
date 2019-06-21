package com.tencent.qqmusic.mediaplayer.utils;

import android.media.AudioTrack;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.AudioRecognition;
import com.tencent.qqmusic.mediaplayer.audioplaylist.AudioPlayListItemInfo;
import com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo;
import com.tencent.qqmusic.mediaplayer.codec.NativeDecoder;
import com.tencent.qqmusic.mediaplayer.seektable.NativeSeekTable;
import com.tencent.qqmusic.mediaplayer.upstream.TrackDataSource;
import com.tencent.qqmusic.mediaplayer.util.Logger;

public class AudioUtil
{
  private static final int DEFAULT_DECODE_BUFFER_SIZE = 8192;
  private static final String TAG = "AudioUtil";

  public static int getDecodeBufferSize(NativeDecoder paramNativeDecoder)
  {
    AppMethodBeat.i(104695);
    AudioInformation localAudioInformation = paramNativeDecoder.getAudioInformation();
    int i = 0;
    int j = i;
    if (localAudioInformation != null)
    {
      j = i;
      if (localAudioInformation.getAudioType() == AudioFormat.AudioType.FLAC)
        j = (int)paramNativeDecoder.getMinBufferSize();
    }
    i = j;
    if (j <= 0)
      i = 8192;
    AppMethodBeat.o(104695);
    return i;
  }

  public static int getDecodeBufferSizeForPlay(NativeDecoder paramNativeDecoder)
  {
    int i = 12;
    int j = 2;
    AppMethodBeat.i(104696);
    int k = getDecodeBufferSize(paramNativeDecoder);
    paramNativeDecoder = paramNativeDecoder.getAudioInformation();
    int m;
    if ((paramNativeDecoder == null) || (paramNativeDecoder.getAudioType() == AudioFormat.AudioType.FLAC))
    {
      m = k;
      AppMethodBeat.o(104696);
      return m;
    }
    int n = paramNativeDecoder.getChannels();
    if (n == 1)
      m = 4;
    while (true)
    {
      if (paramNativeDecoder.getBitDept() == 1)
        j = 3;
      m = Math.max(AudioTrack.getMinBufferSize((int)paramNativeDecoder.getSampleRate(), m, j), k);
      break;
      m = i;
      if (n != 2)
        if (n == 6)
        {
          m = 252;
        }
        else
        {
          m = i;
          if (n == 8)
            m = 1020;
        }
    }
  }

  public static NativeDecoder getDecoder(String paramString, boolean paramBoolean, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(104698);
    if (paramBoolean)
    {
      paramString = AudioRecognition.getDecoderFormFile(paramString);
      AppMethodBeat.o(104698);
    }
    while (true)
    {
      return paramString;
      paramString = getDecoderFromTrack(paramString, paramLong1, paramLong2);
      AppMethodBeat.o(104698);
    }
  }

  public static NativeDecoder getDecoderFromTrack(String paramString, long paramLong1, long paramLong2)
  {
    Object localObject1 = null;
    AppMethodBeat.i(104697);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(104697);
      paramString = localObject1;
    }
    while (true)
    {
      return paramString;
      if (paramLong1 >= paramLong2)
      {
        AppMethodBeat.o(104697);
        paramString = localObject1;
      }
      else
      {
        NativeDecoder localNativeDecoder = new NativeDecoder();
        Object localObject2 = new TrackInfo(AudioPlayListItemInfo.TYPE_CUE);
        ((TrackInfo)localObject2).setFilePath(paramString);
        ((TrackInfo)localObject2).setStartPosition(paramLong1);
        ((TrackInfo)localObject2).setEndPostion(paramLong2);
        try
        {
          paramString = new com/tencent/qqmusic/mediaplayer/upstream/TrackDataSource;
          paramString.<init>((TrackInfo)localObject2);
          if (localNativeDecoder.init(paramString) != 0)
          {
            Logger.e("AudioUtil", "init decoder from track failed!");
            AppMethodBeat.o(104697);
            paramString = localObject1;
          }
          else
          {
            localObject2 = new com/tencent/qqmusic/mediaplayer/seektable/NativeSeekTable;
            ((NativeSeekTable)localObject2).<init>(localNativeDecoder);
            paramLong2 = ((NativeSeekTable)localObject2).seek(paramLong2);
            if (paramLong2 <= 0L)
            {
              Logger.e("AudioUtil", "endPos from track <= 0");
              AppMethodBeat.o(104697);
              paramString = localObject1;
            }
            else
            {
              paramString.setEndBytePosition(paramLong2);
              localNativeDecoder.seekTo((int)paramLong1);
              AppMethodBeat.o(104697);
              paramString = localNativeDecoder;
            }
          }
        }
        catch (Exception paramString)
        {
          Logger.e("AudioUtil", paramString);
          AppMethodBeat.o(104697);
          paramString = localObject1;
        }
      }
    }
  }

  public static int getPlaybackHeadPositionSafely(AudioTrack paramAudioTrack)
  {
    AppMethodBeat.i(104699);
    int i = 0;
    int j = i;
    if (paramAudioTrack != null);
    try
    {
      j = paramAudioTrack.getPlaybackHeadPosition();
      AppMethodBeat.o(104699);
      return j;
    }
    catch (Exception paramAudioTrack)
    {
      while (true)
      {
        Logger.e("AudioUtil", "getPlaybackHeadPositionSafely", paramAudioTrack);
        j = i;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.utils.AudioUtil
 * JD-Core Version:    0.6.2
 */