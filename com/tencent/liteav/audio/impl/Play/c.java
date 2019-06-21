package com.tencent.liteav.audio.impl.Play;

import android.content.Context;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.audio.impl.TXCTraeJNI;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class c extends TXCAudioBasePlayController
  implements com.tencent.liteav.audio.c
{
  private static final String a;
  private com.tencent.liteav.basic.g.a b;

  static
  {
    AppMethodBeat.i(66634);
    a = "AudioCenter:" + c.class.getSimpleName();
    AppMethodBeat.o(66634);
  }

  public c(Context paramContext)
  {
    super(paramContext);
  }

  public static void a(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(66629);
    TXCTraeJNI.setContext(paramContext);
    TXCTraeJNI.nativeSetAudioMode(paramInt);
    AppMethodBeat.o(66629);
  }

  protected void finalize()
  {
    AppMethodBeat.i(66628);
    if (this.mJitterBuffer != 0L)
    {
      nativeDestoryJitterBuffer(this.mJitterBuffer);
      this.mJitterBuffer = 0L;
    }
    AppMethodBeat.o(66628);
  }

  public void onPlayAudioInfoChanged(com.tencent.liteav.basic.g.a parama1, com.tencent.liteav.basic.g.a parama2)
  {
    AppMethodBeat.i(66633);
    if (this.b == null)
      this.b = parama1;
    if (this.mListener != null)
      this.mListener.onPlayAudioInfoChanged(parama1, parama2);
    TXCTraeJNI.traeStartPlay(this.mContext);
    AppMethodBeat.o(66633);
  }

  public int playData(com.tencent.liteav.basic.g.a parama)
  {
    AppMethodBeat.i(66632);
    int i;
    if (parama == null)
    {
      i = TXEAudioDef.TXE_AUDIO_COMMON_ERR_INVALID_PARAMS;
      AppMethodBeat.o(66632);
    }
    while (true)
    {
      return i;
      if ((com.tencent.liteav.basic.a.a.k != parama.d) && (com.tencent.liteav.basic.a.a.l != parama.d) && (com.tencent.liteav.basic.a.a.m != parama.d))
      {
        TXCLog.e(a, "soft dec, not support audio type , packet type : " + parama.d);
        onPlayError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_AUDIO_TYPE_NOT_SUPPORT, "解码器不支持当前音频格式，包类型:" + parama.d);
        i = TXEAudioDef.TXE_AUDIO_PLAY_ERR_AUDIO_TYPE_NOT_SUPPORT;
        AppMethodBeat.o(66632);
      }
      else
      {
        if (com.tencent.liteav.basic.a.a.k == parama.d)
          TXCLog.i(a, "soft dec, recv aac seq " + parama.f);
        if (this.mIsPlaying)
          break;
        onPlayError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_INVALID_STATE, "播放器还没有启动");
        TXCLog.w(a, "sotf dec, invalid state. player not started yet!");
        i = TXEAudioDef.TXE_AUDIO_PLAY_ERR_INVALID_STATE;
        AppMethodBeat.o(66632);
      }
    }
    if (this.mJitterBuffer == 0L)
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
        label406: TXCLog.e(a, "soft dec, create jitterbuffer with id " + this.mJitterBuffer);
      }
    }
    else
    {
      if (this.mJitterBuffer == 0L)
        break label597;
      nativeAddData(this.mJitterBuffer, parama.f, parama.d, parama.e);
      if (com.tencent.liteav.basic.a.a.k != parama.d)
        break label628;
      this.b = new com.tencent.liteav.basic.g.a();
      this.b.a = nativeGetSamplerate(this.mJitterBuffer);
      this.b.b = nativeGetChannel(this.mJitterBuffer);
      this.b.c = com.tencent.liteav.audio.b.c;
      this.b.d = com.tencent.liteav.basic.a.a.k;
      parama = new com.tencent.liteav.basic.g.a();
      parama.a = 48000;
      parama.b = 2;
      parama.c = 16;
      parama.d = com.tencent.liteav.basic.a.a.k;
      onPlayAudioInfoChanged(this.b, parama);
    }
    while (true)
    {
      i = TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK;
      AppMethodBeat.o(66632);
      break;
      TXCLog.e(a, "soft dec, create jitterbuffer failed!!");
      break label406;
      label597: onPlayError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "jitterbuf 还未创建");
      TXCLog.e(a, "soft dec, jitterbuffer not created yet!!");
      i = TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
      AppMethodBeat.o(66632);
      break;
      label628: if ((com.tencent.liteav.basic.a.a.m == parama.d) && (this.b == null))
      {
        this.b = new com.tencent.liteav.basic.g.a();
        this.b.a = nativeGetSamplerate(this.mJitterBuffer);
        this.b.b = nativeGetChannel(this.mJitterBuffer);
        this.b.c = com.tencent.liteav.audio.b.c;
        this.b.d = com.tencent.liteav.basic.a.a.k;
        parama = new com.tencent.liteav.basic.g.a();
        parama.a = 48000;
        parama.b = 2;
        parama.c = 16;
        parama.d = com.tencent.liteav.basic.a.a.k;
        onPlayAudioInfoChanged(this.b, parama);
      }
    }
  }

  public int startPlay()
  {
    AppMethodBeat.i(66630);
    TXCLog.i(a, "start play audio!");
    int i;
    if (!this.mIsPlaying)
    {
      super.startPlay();
      TXCLog.i(a, "finish start play audio!");
      i = TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK;
      AppMethodBeat.o(66630);
    }
    while (true)
    {
      return i;
      TXCLog.e(a, "repeat start play audio, ignore it!");
      i = TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION;
      AppMethodBeat.o(66630);
    }
  }

  public int stopPlay()
  {
    AppMethodBeat.i(66631);
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
      TXCTraeJNI.traeStopPlay();
      this.b = null;
      TXCLog.i(a, "finish stop play audio!");
      i = TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK;
      AppMethodBeat.o(66631);
    }
    while (true)
    {
      return i;
      TXCLog.e(a, "repeat stop play audio, ignore it!");
      i = TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION;
      AppMethodBeat.o(66631);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.Play.c
 * JD-Core Version:    0.6.2
 */