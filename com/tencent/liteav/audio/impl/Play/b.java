package com.tencent.liteav.audio.impl.Play;

import android.content.Context;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.audio.c;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public class b extends TXCAudioBasePlayController
{
  public static final String a;
  private a b;
  private com.tencent.liteav.basic.g.a c;

  static
  {
    AppMethodBeat.i(66603);
    a = "AudioCenter:" + b.class.getSimpleName();
    AppMethodBeat.o(66603);
  }

  public b(Context paramContext)
  {
    super(paramContext);
  }

  private int a(com.tencent.liteav.basic.g.a parama)
  {
    AppMethodBeat.i(66599);
    int i;
    if (parama == null)
    {
      i = TXEAudioDef.TXE_AUDIO_COMMON_ERR_INVALID_PARAMS;
      AppMethodBeat.o(66599);
    }
    while (true)
    {
      return i;
      i = TXEAudioDef.TXE_AUDIO_TYPE_INVALID;
      if ((com.tencent.liteav.basic.a.a.k == parama.d) || (com.tencent.liteav.basic.a.a.l == parama.d));
      for (i = TXEAudioDef.TXE_AUDIO_TYPE_AAC; ; i = TXEAudioDef.TXE_AUDIO_TYPE_MP3)
      {
        if (this.mIsPlaying)
          break label164;
        onPlayError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_INVALID_STATE, "播放器还没有启动");
        TXCLog.w(a, "sotf dec, invalid state. player not started yet!");
        i = TXEAudioDef.TXE_AUDIO_PLAY_ERR_INVALID_STATE;
        AppMethodBeat.o(66599);
        break;
        if (com.tencent.liteav.basic.a.a.m != parama.d)
          break label101;
      }
      label101: TXCLog.e(a, "soft dec, not support audio type , packet type : " + parama.d);
      onPlayError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_AUDIO_TYPE_NOT_SUPPORT, "解码器不支持当前音频格式，包类型:" + parama.d);
      i = TXEAudioDef.TXE_AUDIO_PLAY_ERR_AUDIO_TYPE_NOT_SUPPORT;
      AppMethodBeat.o(66599);
    }
    label164: if (this.mJitterBuffer == 0L)
    {
      this.mJitterBuffer = nativeCreateJitterBuffer(false, this);
      if (this.mJitterBuffer != 0L)
      {
        nativeSetSmoothMode(this.mJitterBuffer, this.mSmoothMode);
        nativeSetSmoothAdjust(this.mJitterBuffer, com.tencent.liteav.basic.f.b.a().a("Audio", "SmoothAdjust"));
        nativeSetCacheTime(this.mJitterBuffer, this.mCacheTime);
        nativeSetMute(this.mJitterBuffer, this.mIsMute);
        nativeEnableRealTimePlay(this.mJitterBuffer, this.mIsRealTimePlay);
        nativeEnableAutoAdjustCache(this.mJitterBuffer, this.mIsAutoAdjustCache);
        nativeSetAutoAdjustMaxCache(this.mJitterBuffer, this.mAutoAdjustMaxCache);
        nativeSetAutoAdjustMinCache(this.mJitterBuffer, this.mAutoAdjustMinCache);
        nativeSetSmoothSpeed(this.mJitterBuffer, com.tencent.liteav.basic.f.b.a().b("Audio", "SmoothSpeed"));
        nativeSetJitterCycle(this.mJitterBuffer, com.tencent.liteav.basic.f.b.a().a("Audio", "LIVE_JitterCycle"));
        nativeSetRealtimeJitterCycle(this.mJitterBuffer, com.tencent.liteav.basic.f.b.a().a("Audio", "RTC_JitterCycle"));
        nativeSetLoadingThreshold(this.mJitterBuffer, com.tencent.liteav.basic.f.b.a().a("Audio", "LoadingThreshold"));
        nativeSetRTCPlayHungryTimeThreshold(this.mJitterBuffer, (int)com.tencent.liteav.basic.f.b.a().a("Audio", "RtcPlayHungryTimeThreshold"));
        TXCLog.e(a, "soft dec, create jitterbuffer with id " + this.mJitterBuffer);
      }
    }
    else
    {
      if (com.tencent.liteav.basic.a.a.k == parama.d)
        TXCLog.i(a, "soft dec, recv aac seq " + com.tencent.liteav.audio.impl.b.a(parama.f));
      if (this.mJitterBuffer == 0L)
        break label615;
      nativeAddData(this.mJitterBuffer, parama.f, parama.d, parama.e);
      if (com.tencent.liteav.basic.a.a.k != parama.d)
        break label646;
      this.c = new com.tencent.liteav.basic.g.a();
      this.c.a = nativeGetSamplerate(this.mJitterBuffer);
      this.c.b = nativeGetChannel(this.mJitterBuffer);
      this.c.c = com.tencent.liteav.audio.b.c;
      this.c.d = com.tencent.liteav.basic.a.a.k;
      parama = new com.tencent.liteav.basic.g.a();
      parama.a = 48000;
      parama.b = 2;
      parama.c = 16;
      parama.d = com.tencent.liteav.basic.a.a.k;
      onPlayAudioInfoChanged(this.c, parama);
    }
    while (true)
    {
      label386: i = TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK;
      AppMethodBeat.o(66599);
      break;
      TXCLog.e(a, "soft dec, create jitterbuffer failed!!");
      break label386;
      label615: onPlayError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "jitterbuf 还未创建");
      TXCLog.e(a, "soft dec, jitterbuffer not created yet!!");
      i = TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
      AppMethodBeat.o(66599);
      break;
      label646: if ((com.tencent.liteav.basic.a.a.m == parama.d) && (this.c == null))
      {
        this.c = new com.tencent.liteav.basic.g.a();
        this.c.a = nativeGetSamplerate(this.mJitterBuffer);
        this.c.b = nativeGetChannel(this.mJitterBuffer);
        this.c.c = com.tencent.liteav.audio.b.c;
        this.c.d = com.tencent.liteav.basic.a.a.k;
        parama = new com.tencent.liteav.basic.g.a();
        parama.a = 48000;
        parama.b = 2;
        parama.c = 16;
        parama.d = com.tencent.liteav.basic.a.a.k;
        onPlayAudioInfoChanged(this.c, parama);
      }
    }
  }

  public static void a(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(66594);
    d.a().a(paramContext, paramInt);
    AppMethodBeat.o(66594);
  }

  private int b(com.tencent.liteav.basic.g.a parama)
  {
    AppMethodBeat.i(66600);
    int i;
    if (parama == null)
    {
      i = TXEAudioDef.TXE_AUDIO_COMMON_ERR_INVALID_PARAMS;
      AppMethodBeat.o(66600);
    }
    while (true)
    {
      return i;
      i = TXEAudioDef.TXE_AUDIO_TYPE_INVALID;
      if ((com.tencent.liteav.basic.a.a.k == parama.d) || (com.tencent.liteav.basic.a.a.l == parama.d));
      for (i = TXEAudioDef.TXE_AUDIO_TYPE_AAC; ; i = TXEAudioDef.TXE_AUDIO_TYPE_MP3)
      {
        if (this.mIsPlaying)
          break label170;
        onPlayError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_INVALID_STATE, "播放器还没有启动");
        TXCLog.w(a, "hw dec, invalid state. player not started yet!");
        i = TXEAudioDef.TXE_AUDIO_PLAY_ERR_INVALID_STATE;
        AppMethodBeat.o(66600);
        break;
        if (com.tencent.liteav.basic.a.a.m != parama.d)
          break label105;
      }
      label105: TXCLog.e(a, "hw dec, not support audio type , packet type : " + parama.d);
      onPlayError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_AUDIO_TYPE_NOT_SUPPORT, "解码器不支持当前音频格式，包类型:" + parama.d);
      i = TXEAudioDef.TXE_AUDIO_PLAY_ERR_AUDIO_TYPE_NOT_SUPPORT;
      AppMethodBeat.o(66600);
    }
    label170: if (this.mJitterBuffer == 0L)
    {
      this.mJitterBuffer = nativeCreateJitterBuffer(true, this);
      if (this.mJitterBuffer == 0L)
        break label484;
      nativeSetSmoothMode(this.mJitterBuffer, this.mSmoothMode);
      nativeSetSmoothAdjust(this.mJitterBuffer, com.tencent.liteav.basic.f.b.a().a("Audio", "SmoothAdjust"));
      nativeSetCacheTime(this.mJitterBuffer, this.mCacheTime);
      nativeSetMute(this.mJitterBuffer, this.mIsMute);
      nativeEnableRealTimePlay(this.mJitterBuffer, this.mIsRealTimePlay);
      nativeEnableAutoAdjustCache(this.mJitterBuffer, this.mIsAutoAdjustCache);
      nativeSetAutoAdjustMaxCache(this.mJitterBuffer, this.mAutoAdjustMaxCache);
      nativeSetAutoAdjustMinCache(this.mJitterBuffer, this.mAutoAdjustMinCache);
      nativeSetSmoothSpeed(this.mJitterBuffer, com.tencent.liteav.basic.f.b.a().b("Audio", "SmoothSpeed"));
      nativeSetJitterCycle(this.mJitterBuffer, com.tencent.liteav.basic.f.b.a().a("Audio", "LIVE_JitterCycle"));
      nativeSetRealtimeJitterCycle(this.mJitterBuffer, com.tencent.liteav.basic.f.b.a().a("Audio", "RTC_JitterCycle"));
      nativeSetLoadingThreshold(this.mJitterBuffer, com.tencent.liteav.basic.f.b.a().a("Audio", "LoadingThreshold"));
      nativeSetRTCPlayHungryTimeThreshold(this.mJitterBuffer, (int)com.tencent.liteav.basic.f.b.a().a("Audio", "RtcPlayHungryTimeThreshold"));
    }
    while (true)
    {
      TXCLog.e(a, "hw dec, create jitterbuffer with id " + this.mJitterBuffer);
      if (com.tencent.liteav.basic.a.a.k == parama.d)
        TXCLog.i(a, "soft dec, recv aac seq " + com.tencent.liteav.audio.impl.b.a(parama.f));
      if (this.b != null)
        this.b.a(parama);
      i = TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK;
      AppMethodBeat.o(66600);
      break;
      label484: TXCLog.e(a, "hw dec, create jitterbuffer failed!!");
    }
  }

  protected void finalize()
  {
    AppMethodBeat.i(66593);
    if (this.mJitterBuffer != 0L)
    {
      nativeDestoryJitterBuffer(this.mJitterBuffer);
      this.mJitterBuffer = 0L;
    }
    AppMethodBeat.o(66593);
  }

  public long getCacheDuration()
  {
    AppMethodBeat.i(66595);
    long l;
    if (this.mIsHWAcceleration)
    {
      l = this.b.a() + nativeGetCacheDuration(this.mJitterBuffer);
      AppMethodBeat.o(66595);
    }
    while (true)
    {
      return l;
      l = nativeGetCacheDuration(this.mJitterBuffer);
      AppMethodBeat.o(66595);
    }
  }

  public void onPlayAudioInfoChanged(com.tencent.liteav.basic.g.a parama1, com.tencent.liteav.basic.g.a parama2)
  {
    AppMethodBeat.i(66601);
    if (this.c == null)
      this.c = parama1;
    if (this.mListener != null)
      this.mListener.onPlayAudioInfoChanged(parama1, parama2);
    if (!nativeIsTracksEmpty())
      d.a().b();
    AppMethodBeat.o(66601);
  }

  public void onPlayPcmData(byte[] paramArrayOfByte, long paramLong)
  {
    AppMethodBeat.i(66602);
    super.onPlayPcmData(paramArrayOfByte, paramLong);
    if ((this.mJitterBuffer != 0L) && (this.mIsHWAcceleration))
      nativeAddData(this.mJitterBuffer, paramArrayOfByte, com.tencent.liteav.basic.a.a.n, paramLong);
    AppMethodBeat.o(66602);
  }

  public int playData(com.tencent.liteav.basic.g.a parama)
  {
    AppMethodBeat.i(66598);
    int i;
    if (this.mIsHWAcceleration)
    {
      i = b(parama);
      AppMethodBeat.o(66598);
    }
    while (true)
    {
      return i;
      i = a(parama);
      AppMethodBeat.o(66598);
    }
  }

  public int startPlay()
  {
    AppMethodBeat.i(66596);
    TXCLog.i(a, "start play audio!");
    int i;
    if (!this.mIsPlaying)
    {
      if (this.mIsHWAcceleration)
      {
        this.b = new a();
        this.b.a(new WeakReference(this));
      }
      this.mIsPlaying = true;
      TXCLog.i(a, "finish start play audio!");
      i = TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK;
      AppMethodBeat.o(66596);
    }
    while (true)
    {
      return i;
      TXCLog.e(a, "repeat start play audio, ignore it!");
      i = TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION;
      AppMethodBeat.o(66596);
    }
  }

  public int stopPlay()
  {
    AppMethodBeat.i(66597);
    TXCLog.i(a, "stop play audio!");
    int i;
    if (this.mIsPlaying)
    {
      super.stopPlay();
      if (this.mJitterBuffer != 0L)
      {
        nativeDestoryJitterBuffer(this.mJitterBuffer);
        this.mJitterBuffer = 0L;
      }
      if (nativeIsTracksEmpty())
        d.a().c();
      if (this.b != null)
      {
        this.b.b();
        this.b = null;
      }
      this.c = null;
      TXCLog.i(a, "finish stop play audio!");
      i = TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK;
      AppMethodBeat.o(66597);
    }
    while (true)
    {
      return i;
      TXCLog.e(a, "repeat stop play audio, ignore it!");
      i = TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION;
      AppMethodBeat.o(66597);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.Play.b
 * JD-Core Version:    0.6.2
 */