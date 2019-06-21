package com.tencent.liteav.audio.impl.Play;

import android.content.Context;
import android.os.Environment;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

public class TXCAudioBasePlayController
  implements com.tencent.liteav.audio.c
{
  private static final String TAG;
  protected float mAutoAdjustMaxCache = com.tencent.liteav.audio.a.d;
  protected float mAutoAdjustMinCache = com.tencent.liteav.audio.a.e;
  protected float mCacheTime = com.tencent.liteav.audio.a.b;
  protected Context mContext;
  protected boolean mIsAutoAdjustCache = com.tencent.liteav.audio.a.c;
  protected boolean mIsHWAcceleration = false;
  protected boolean mIsMute = com.tencent.liteav.audio.a.f;
  protected volatile boolean mIsPlaying = false;
  protected boolean mIsRealTimePlay = false;
  protected long mJitterBuffer = 0L;
  protected com.tencent.liteav.audio.c mListener;
  protected int mSmoothMode = 0;

  static
  {
    AppMethodBeat.i(66623);
    TAG = "AudioCenter:" + TXCAudioBasePlayController.class.getSimpleName();
    nativeSetTempPath(Environment.getExternalStorageDirectory().getAbsolutePath());
    AppMethodBeat.o(66623);
  }

  public TXCAudioBasePlayController(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public static native byte[] nativeGetMixedTracksData(int paramInt);

  public static native boolean nativeIsTracksEmpty();

  public static native void nativeSetTempPath(String paramString);

  public static void setAudioMode(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(66604);
    b.a(paramContext, paramInt);
    c.a(paramContext, paramInt);
    AppMethodBeat.o(66604);
  }

  public void enableAutojustCache(boolean paramBoolean)
  {
    AppMethodBeat.i(66606);
    TXCLog.i(TAG, "set auto adjust cache to ".concat(String.valueOf(paramBoolean)));
    nativeEnableAutoAdjustCache(this.mJitterBuffer, paramBoolean);
    this.mIsAutoAdjustCache = paramBoolean;
    AppMethodBeat.o(66606);
  }

  public void enableHWAcceleration(boolean paramBoolean)
  {
    AppMethodBeat.i(66609);
    TXCLog.i(TAG, "set hw acceleration to ".concat(String.valueOf(paramBoolean)));
    this.mIsHWAcceleration = paramBoolean;
    AppMethodBeat.o(66609);
  }

  public void enableRealTimePlay(boolean paramBoolean)
  {
    AppMethodBeat.i(66612);
    if (paramBoolean == this.mIsRealTimePlay)
      AppMethodBeat.o(66612);
    while (true)
    {
      return;
      TXCLog.i(TAG, "set real-time play to ".concat(String.valueOf(paramBoolean)));
      nativeEnableRealTimePlay(this.mJitterBuffer, paramBoolean);
      this.mIsRealTimePlay = paramBoolean;
      AppMethodBeat.o(66612);
    }
  }

  public long getCacheDuration()
  {
    AppMethodBeat.i(66611);
    long l = nativeGetCacheDuration(this.mJitterBuffer);
    AppMethodBeat.o(66611);
    return l;
  }

  public float getCacheThreshold()
  {
    AppMethodBeat.i(66617);
    float f = nativeGetCacheThreshold(this.mJitterBuffer);
    AppMethodBeat.o(66617);
    return f;
  }

  public long getCurPts()
  {
    AppMethodBeat.i(66614);
    long l = nativeGetCurPts(this.mJitterBuffer);
    AppMethodBeat.o(66614);
    return l;
  }

  public long getCurRecvTS()
  {
    AppMethodBeat.i(66616);
    long l = nativeGetNetRecvTS(this.mJitterBuffer);
    AppMethodBeat.o(66616);
    return l;
  }

  public int getRecvJitter()
  {
    AppMethodBeat.i(66615);
    int i = nativeGetRecvJitter(this.mJitterBuffer);
    AppMethodBeat.o(66615);
    return i;
  }

  public TXAudioJitterBufferReportInfo getReportInfo()
  {
    AppMethodBeat.i(66613);
    TXAudioJitterBufferReportInfo localTXAudioJitterBufferReportInfo;
    if ((this.mIsPlaying) && (this.mJitterBuffer != 0L))
    {
      localTXAudioJitterBufferReportInfo = nativeGetLoadingInfo(this.mJitterBuffer);
      AppMethodBeat.o(66613);
    }
    while (true)
    {
      return localTXAudioJitterBufferReportInfo;
      localTXAudioJitterBufferReportInfo = null;
      AppMethodBeat.o(66613);
    }
  }

  public boolean isPlaying()
  {
    return this.mIsPlaying;
  }

  protected native void nativeAddData(long paramLong1, byte[] paramArrayOfByte, int paramInt, long paramLong2);

  protected native long nativeCreateJitterBuffer(boolean paramBoolean, TXCAudioBasePlayController paramTXCAudioBasePlayController);

  protected native void nativeDestoryJitterBuffer(long paramLong);

  protected native void nativeEnableAutoAdjustCache(long paramLong, boolean paramBoolean);

  protected native void nativeEnableRealTimePlay(long paramLong, boolean paramBoolean);

  protected native long nativeGetCacheDuration(long paramLong);

  protected native float nativeGetCacheThreshold(long paramLong);

  protected native int nativeGetChannel(long paramLong);

  protected native long nativeGetCurPts(long paramLong);

  protected native TXAudioJitterBufferReportInfo nativeGetLoadingInfo(long paramLong);

  protected native long nativeGetNetRecvTS(long paramLong);

  protected native int nativeGetRecvJitter(long paramLong);

  protected native int nativeGetSamplerate(long paramLong);

  protected native void nativeSetAutoAdjustMaxCache(long paramLong, float paramFloat);

  protected native void nativeSetAutoAdjustMinCache(long paramLong, float paramFloat);

  protected native void nativeSetCacheTime(long paramLong, float paramFloat);

  protected native void nativeSetJitterCycle(long paramLong1, long paramLong2);

  protected native void nativeSetLoadingThreshold(long paramLong1, long paramLong2);

  protected native void nativeSetMute(long paramLong, boolean paramBoolean);

  protected native void nativeSetRTCPlayHungryTimeThreshold(long paramLong, int paramInt);

  protected native void nativeSetRealtimeJitterCycle(long paramLong1, long paramLong2);

  protected native void nativeSetSmoothAdjust(long paramLong1, long paramLong2);

  protected native void nativeSetSmoothMode(long paramLong1, long paramLong2);

  protected native void nativeSetSmoothSpeed(long paramLong, float paramFloat);

  public void onPlayAudioInfoChanged(com.tencent.liteav.basic.g.a parama1, com.tencent.liteav.basic.g.a parama2)
  {
    try
    {
      AppMethodBeat.i(66622);
      if (this.mListener != null)
        this.mListener.onPlayAudioInfoChanged(parama1, parama2);
      AppMethodBeat.o(66622);
      return;
    }
    finally
    {
    }
    throw parama1;
  }

  public void onPlayError(int paramInt, String paramString)
  {
    try
    {
      AppMethodBeat.i(66620);
      if (this.mListener != null)
        this.mListener.onPlayError(paramInt, paramString);
      AppMethodBeat.o(66620);
      return;
    }
    finally
    {
    }
    throw paramString;
  }

  public void onPlayJitterStateNotify(int paramInt)
  {
    try
    {
      AppMethodBeat.i(66621);
      TXCLog.e(TAG, "onPlayJitterStateNotify  cur state ".concat(String.valueOf(paramInt)));
      if (this.mListener != null)
        this.mListener.onPlayJitterStateNotify(paramInt);
      AppMethodBeat.o(66621);
      return;
    }
    finally
    {
    }
  }

  public void onPlayPcmData(byte[] paramArrayOfByte, long paramLong)
  {
    try
    {
      AppMethodBeat.i(66619);
      if (this.mListener != null)
        this.mListener.onPlayPcmData(paramArrayOfByte, paramLong);
      AppMethodBeat.o(66619);
      return;
    }
    finally
    {
    }
    throw paramArrayOfByte;
  }

  public int playData(com.tencent.liteav.basic.g.a parama)
  {
    return TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK;
  }

  public void setAutoAdjustMaxCache(float paramFloat)
  {
    AppMethodBeat.i(66607);
    TXCLog.i(TAG, "set auto adjust max cache to ".concat(String.valueOf(paramFloat)));
    nativeSetAutoAdjustMaxCache(this.mJitterBuffer, paramFloat);
    this.mAutoAdjustMaxCache = paramFloat;
    AppMethodBeat.o(66607);
  }

  public void setAutoAdjustMinCache(float paramFloat)
  {
    AppMethodBeat.i(66608);
    TXCLog.i(TAG, "set auto adjust min cache to ".concat(String.valueOf(paramFloat)));
    nativeSetAutoAdjustMinCache(this.mJitterBuffer, paramFloat);
    this.mAutoAdjustMinCache = paramFloat;
    AppMethodBeat.o(66608);
  }

  public void setCacheTime(float paramFloat)
  {
    AppMethodBeat.i(66605);
    TXCLog.i(TAG, "set cache time to ".concat(String.valueOf(paramFloat)));
    nativeSetCacheTime(this.mJitterBuffer, paramFloat);
    this.mCacheTime = paramFloat;
    AppMethodBeat.o(66605);
  }

  public void setListener(com.tencent.liteav.audio.c paramc)
  {
    try
    {
      this.mListener = paramc;
      return;
    }
    finally
    {
      paramc = finally;
    }
    throw paramc;
  }

  public void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(66618);
    if (paramBoolean != this.mIsMute)
      nativeSetMute(this.mJitterBuffer, paramBoolean);
    TXCLog.i(TAG, "set mute to ".concat(String.valueOf(paramBoolean)));
    this.mIsMute = paramBoolean;
    AppMethodBeat.o(66618);
  }

  public void setSmootheMode(int paramInt)
  {
    AppMethodBeat.i(66610);
    TXCLog.i(TAG, "set careful mode to ".concat(String.valueOf(paramInt)));
    this.mSmoothMode = paramInt;
    AppMethodBeat.o(66610);
  }

  public int startPlay()
  {
    this.mIsPlaying = true;
    return TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK;
  }

  public int stopPlay()
  {
    this.mIsPlaying = false;
    this.mCacheTime = com.tencent.liteav.audio.a.b;
    this.mIsAutoAdjustCache = com.tencent.liteav.audio.a.c;
    this.mAutoAdjustMaxCache = com.tencent.liteav.audio.a.d;
    this.mAutoAdjustMinCache = com.tencent.liteav.audio.a.e;
    this.mIsRealTimePlay = false;
    this.mIsHWAcceleration = false;
    this.mIsMute = com.tencent.liteav.audio.a.f;
    this.mSmoothMode = 0;
    return TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.Play.TXCAudioBasePlayController
 * JD-Core Version:    0.6.2
 */