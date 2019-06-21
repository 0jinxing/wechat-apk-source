package com.tencent.qqmusic.mediaplayer;

import android.media.AudioTrack;
import android.os.Build.VERSION;
import android.os.Handler;
import com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener;
import com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import com.tencent.qqmusic.mediaplayer.util.PcmConvertionUtil;
import com.tencent.qqmusic.mediaplayer.util.ReferenceTimer;
import com.tencent.qqmusic.mediaplayer.util.WaitNotify;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class BaseDecodeDataComponent
{
  protected static final int CALL_PREPARED_DELAY_TIME = 20;
  protected static final boolean CAN_USE_FLOAT_IN_HI_RES;
  protected static final long MAX_PLAY_SAMPLE_RATE;
  private static final String TAG = "BaseDecodeDataComponent";
  protected final List<IAudioListener> audioEffects = new ArrayList(3);
  protected boolean isUseFloatInHiRes = false;
  protected int mAudioStreamType = getAudioStreamType();
  protected AudioTrack mAudioTrack;
  protected int mBuffSize;
  protected PlayerCallback mCallback;
  protected CorePlayer mCorePlayer;
  protected boolean mCreateAudioTrackFail = false;
  protected long mCurPosition = 0L;
  protected final BufferInfo mDTSBufferInfo = new BufferInfo();
  protected final BufferInfo mDecodeBufferInfo = new BufferInfo();
  protected Handler mEventHandler;
  protected final FloatBufferInfo mFloatBufferInfo = new FloatBufferInfo();
  protected final BaseDecodeDataComponent.HandleDecodeDataCallback mHandleDecodeDataCallback;
  protected boolean mHasDecode = false;
  protected boolean mHasDecodeSuccess = false;
  protected boolean mHasInit = false;
  protected AudioInformation mInformation;
  protected volatile boolean mNeedChangePlayThreadPriority = false;
  protected final BufferInfo mNewBitDepthBufferInfo = new BufferInfo();
  protected int mPlayBitDepth = 2;
  protected long mPlaySample;
  private int mPlayerID;
  protected final BufferInfo mReSampleBufferInfo = new BufferInfo();
  protected final WaitNotify mSignalControl = new WaitNotify();
  protected PlayerStateRunner mStateRunner;
  protected final List<IAudioListener> mTerminalAudioEffectList = new ArrayList();
  protected ReferenceTimer mTimer = new ReferenceTimer();
  protected PerformanceTracer performanceTracer = null;

  static
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 21)
    {
      bool = true;
      CAN_USE_FLOAT_IN_HI_RES = bool;
      if (Build.VERSION.SDK_INT < 23)
        break label36;
    }
    label36: for (long l = 192000L; ; l = 48000L)
    {
      MAX_PLAY_SAMPLE_RATE = l;
      return;
      bool = false;
      break;
    }
  }

  BaseDecodeDataComponent(CorePlayer paramCorePlayer, PlayerStateRunner paramPlayerStateRunner, AudioInformation paramAudioInformation, PlayerCallback paramPlayerCallback, BaseDecodeDataComponent.HandleDecodeDataCallback paramHandleDecodeDataCallback, Handler paramHandler, int paramInt)
  {
    this.mCorePlayer = paramCorePlayer;
    this.mStateRunner = paramPlayerStateRunner;
    this.mInformation = paramAudioInformation;
    this.mCallback = paramPlayerCallback;
    this.mHandleDecodeDataCallback = paramHandleDecodeDataCallback;
    this.mEventHandler = paramHandler;
    this.mPlayerID = paramInt;
  }

  protected static int getAudioTrackPosition(long paramLong, AudioTrack paramAudioTrack)
  {
    long l1 = 0L;
    long l2 = l1;
    if (paramAudioTrack != null);
    try
    {
      l2 = Math.round((paramAudioTrack.getPlaybackHeadPosition() + paramLong) / paramAudioTrack.getSampleRate() * 1000.0D);
      return (int)l2;
    }
    catch (Exception paramAudioTrack)
    {
      while (true)
      {
        Logger.e("BaseDecodeDataComponent", "getAudioTrackPosition", paramAudioTrack);
        l2 = l1;
      }
    }
  }

  private static boolean processAudioListener(IAudioListener paramIAudioListener, BufferInfo paramBufferInfo1, BufferInfo paramBufferInfo2)
  {
    try
    {
      paramBufferInfo2.setByteBufferCapacity(paramBufferInfo1.bufferSize);
      bool = paramIAudioListener.onPcm(paramBufferInfo1, paramBufferInfo2);
      return bool;
    }
    catch (Throwable paramBufferInfo1)
    {
      while (true)
      {
        Logger.e("BaseDecodeDataComponent", "[processAudioListener] failed. audio: ".concat(String.valueOf(paramIAudioListener)), paramBufferInfo1);
        boolean bool = false;
      }
    }
  }

  private static boolean processAudioListener(IAudioListener paramIAudioListener, FloatBufferInfo paramFloatBufferInfo1, FloatBufferInfo paramFloatBufferInfo2)
  {
    try
    {
      paramFloatBufferInfo2.setFloatBufferCapacity(paramFloatBufferInfo1.bufferSize);
      bool = paramIAudioListener.onPcm(paramFloatBufferInfo1, paramFloatBufferInfo2);
      return bool;
    }
    catch (Throwable paramFloatBufferInfo1)
    {
      while (true)
      {
        Logger.e("BaseDecodeDataComponent", "[processAudioListener] failed. audio: ".concat(String.valueOf(paramIAudioListener)), paramFloatBufferInfo1);
        boolean bool = false;
      }
    }
  }

  void addAudioListener(IAudioListener paramIAudioListener)
  {
    if (paramIAudioListener.isTerminal())
      synchronized (this.mTerminalAudioEffectList)
      {
        if (!this.mTerminalAudioEffectList.contains(paramIAudioListener))
        {
          this.mTerminalAudioEffectList.add(paramIAudioListener);
          Logger.i("BaseDecodeDataComponent", "[addAudioListener] terminal audio added: ".concat(String.valueOf(paramIAudioListener)));
        }
        if ((this.mInformation == null) || (this.mInformation.getPlaySample() <= 0L) || (this.mInformation.getChannels() <= 0));
      }
    while (true)
    {
      try
      {
        while (true)
        {
          l = paramIAudioListener.onPlayerReady(this.mInformation.getPlaySample(), this.mPlayBitDepth, this.mInformation.getChannels());
          if (l != 0L)
            Logger.e("BaseDecodeDataComponent", "[addAudioListener] failed to init audio %s, ret: %d", new Object[] { paramIAudioListener, Long.valueOf(l) });
          return;
          paramIAudioListener = finally;
          throw paramIAudioListener;
          synchronized (this.audioEffects)
          {
            if (!this.audioEffects.contains(paramIAudioListener))
            {
              this.audioEffects.add(paramIAudioListener);
              Logger.i("BaseDecodeDataComponent", "[addAudioListener] audio added: ".concat(String.valueOf(paramIAudioListener)));
            }
          }
        }
      }
      catch (Throwable localThrowable)
      {
        Logger.e("BaseDecodeDataComponent", "[addAudioListener] failed to init audio: ".concat(String.valueOf(paramIAudioListener)), localThrowable);
        long l = 0L;
        continue;
      }
      Logger.i("BaseDecodeDataComponent", "[addAudioListener] audio information not ready. init will be delayed.");
    }
  }

  protected String axiliary(String paramString)
  {
    return "ID: " + this.mPlayerID + ". " + paramString;
  }

  protected void callExceptionCallback(int paramInt1, int paramInt2)
  {
    callExceptionCallback(paramInt1, paramInt2, 0);
  }

  protected void callExceptionCallback(int paramInt1, int paramInt2, int paramInt3)
  {
    this.mCallback.playerException(this.mCorePlayer, paramInt1, paramInt2, paramInt3);
  }

  void changePlayThreadPriorityImmediately()
  {
    Logger.d("BaseDecodeDataComponent", axiliary("changePlayThreadPriorityImmediately"));
    this.mNeedChangePlayThreadPriority = true;
  }

  protected void convertBytePcmToFloatPcm(BufferInfo paramBufferInfo, FloatBufferInfo paramFloatBufferInfo)
  {
    try
    {
      PcmConvertionUtil.convertByteBufferToFloatBuffer(paramBufferInfo, paramFloatBufferInfo, this.mInformation.getBitDept());
      return;
    }
    catch (Throwable paramBufferInfo)
    {
      while (true)
        Logger.e("BaseDecodeDataComponent", paramBufferInfo);
    }
  }

  protected void destroyAudioListeners()
  {
    synchronized (this.audioEffects)
    {
      Iterator localIterator1 = this.audioEffects.iterator();
      if (localIterator1.hasNext())
        ((IAudioListener)localIterator1.next()).onPlayerStopped();
    }
    synchronized (this.mTerminalAudioEffectList)
    {
      Iterator localIterator2 = this.mTerminalAudioEffectList.iterator();
      if (localIterator2.hasNext())
        ((IAudioListener)localIterator2.next()).onPlayerStopped();
    }
  }

  protected void doWaitForPaused()
  {
    this.mSignalControl.doWait(2000L, 5, new BaseDecodeDataComponent.1(this));
  }

  void flush()
  {
  }

  abstract int getAudioStreamType();

  protected int getBytesPerSampleInPlay(int paramInt)
  {
    int i = paramInt;
    if (paramInt > 2)
    {
      i = paramInt;
      if (!CAN_USE_FLOAT_IN_HI_RES)
        i = 2;
    }
    return i;
  }

  abstract long getCurPosition();

  int getPlayerState()
  {
    return this.mStateRunner.get().intValue();
  }

  int getSessionId()
  {
    if ((this.mAudioTrack != null) && (Build.VERSION.SDK_INT >= 9));
    for (int i = this.mAudioTrack.getAudioSessionId(); ; i = 0)
      return i;
  }

  abstract void handleDecodeData();

  protected void handleHighBitDept(BufferInfo paramBufferInfo1, BufferInfo paramBufferInfo2)
  {
    if (this.isUseFloatInHiRes)
      paramBufferInfo1.copy(paramBufferInfo2);
    while (true)
    {
      return;
      try
      {
        PcmConvertionUtil.convertBitDepthTo16(paramBufferInfo1, paramBufferInfo2, this.mInformation.getBitDept());
      }
      catch (Throwable paramBufferInfo1)
      {
        Logger.e("BaseDecodeDataComponent", paramBufferInfo1);
      }
    }
  }

  protected void handleHighSample(BufferInfo paramBufferInfo1, BufferInfo paramBufferInfo2)
  {
    try
    {
      PcmConvertionUtil.reSample(paramBufferInfo1, paramBufferInfo2, this.mInformation.getSampleRate(), this.mPlaySample, this.mPlayBitDepth);
      return;
    }
    catch (Throwable paramBufferInfo1)
    {
      while (true)
        Logger.e("BaseDecodeDataComponent", paramBufferInfo1);
    }
  }

  boolean hasDecodeData()
  {
    try
    {
      boolean bool = this.mHasDecode;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  boolean hasDecodeDataSuccess()
  {
    try
    {
      boolean bool = this.mHasDecodeSuccess;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected void initAudioListeners(long paramLong, int paramInt1, int paramInt2)
  {
    synchronized (this.audioEffects)
    {
      Iterator localIterator1 = this.audioEffects.iterator();
      if (localIterator1.hasNext())
        ((IAudioListener)localIterator1.next()).onPlayerReady(paramLong, paramInt1, paramInt2);
    }
    synchronized (this.mTerminalAudioEffectList)
    {
      Iterator localIterator2 = this.mTerminalAudioEffectList.iterator();
      if (localIterator2.hasNext())
        ((IAudioListener)localIterator2.next()).onPlayerReady(paramLong, paramInt1, paramInt2);
    }
  }

  protected boolean isCompleted()
  {
    try
    {
      boolean bool = this.mStateRunner.isEqual(new Integer[] { Integer.valueOf(7) });
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  boolean isCreateAudioTrackFail()
  {
    return this.mCreateAudioTrackFail;
  }

  protected boolean isError()
  {
    try
    {
      boolean bool = this.mStateRunner.isEqual(new Integer[] { Integer.valueOf(9) });
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected boolean isIdle()
  {
    try
    {
      boolean bool = this.mStateRunner.isEqual(new Integer[] { Integer.valueOf(0) });
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  boolean isInit()
  {
    return this.mHasInit;
  }

  protected boolean isPaused()
  {
    try
    {
      boolean bool = this.mStateRunner.isEqual(new Integer[] { Integer.valueOf(5) });
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected boolean isPlaying()
  {
    try
    {
      boolean bool = this.mStateRunner.isEqual(new Integer[] { Integer.valueOf(4) });
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected boolean isStopped()
  {
    try
    {
      boolean bool = this.mStateRunner.isEqual(new Integer[] { Integer.valueOf(6) });
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected void notifySeekCompleteForAudioListeners(long paramLong)
  {
    synchronized (this.audioEffects)
    {
      Iterator localIterator1 = this.audioEffects.iterator();
      if (localIterator1.hasNext())
        ((IAudioListener)localIterator1.next()).onPlayerSeekComplete(paramLong);
    }
    synchronized (this.mTerminalAudioEffectList)
    {
      Iterator localIterator2 = this.mTerminalAudioEffectList.iterator();
      if (localIterator2.hasNext())
        ((IAudioListener)localIterator2.next()).onPlayerSeekComplete(paramLong);
    }
  }

  void pause()
  {
    Logger.i("BaseDecodeDataComponent", axiliary("pause"));
    this.mStateRunner.transfer(Integer.valueOf(5), new Integer[] { Integer.valueOf(4), Integer.valueOf(2) });
  }

  void play()
  {
    Logger.i("BaseDecodeDataComponent", axiliary("play"));
    this.mTimer.refreshTimeInMs(this.mCurPosition);
    this.mStateRunner.transfer(Integer.valueOf(4));
    if (this.mSignalControl.isWaiting())
    {
      Logger.d("BaseDecodeDataComponent", axiliary("lock is Waiting, event: play, doNotify"));
      this.mSignalControl.doNotify();
    }
  }

  protected void postRunnable(Runnable paramRunnable, int paramInt)
  {
    this.mEventHandler.postDelayed(paramRunnable, paramInt);
  }

  void processAudioListeners(BufferInfo paramBufferInfo1, BufferInfo paramBufferInfo2)
  {
    while (true)
    {
      Object localObject1;
      Object localObject3;
      synchronized (this.audioEffects)
      {
        if (this.audioEffects.size() == 0)
        {
          paramBufferInfo1.copy(paramBufferInfo2);
          return;
        }
        Iterator localIterator = this.audioEffects.iterator();
        localObject1 = paramBufferInfo2;
        localObject2 = paramBufferInfo1;
        localObject3 = localObject2;
        if (!localIterator.hasNext())
          break label139;
        localObject2 = (IAudioListener)localIterator.next();
        if (((IAudioListener)localObject2).isEnabled())
        {
          if (processAudioListener((IAudioListener)localObject2, localObject3, (BufferInfo)localObject1))
          {
            localObject2 = localObject1;
            localObject1 = localObject3;
            continue;
          }
          localObject3.copy((BufferInfo)localObject1);
          localObject2 = localObject3;
        }
      }
      localObject3.copy((BufferInfo)localObject1);
      Object localObject2 = localObject3;
      continue;
      label139: if (localObject3 == paramBufferInfo1)
        paramBufferInfo1.copy(paramBufferInfo2);
    }
  }

  void processAudioListeners(FloatBufferInfo paramFloatBufferInfo1, FloatBufferInfo paramFloatBufferInfo2)
  {
    while (true)
    {
      Object localObject1;
      Object localObject2;
      synchronized (this.audioEffects)
      {
        if (this.audioEffects.size() == 0)
        {
          paramFloatBufferInfo1.copy(paramFloatBufferInfo2);
          return;
        }
        Iterator localIterator = this.audioEffects.iterator();
        localObject1 = paramFloatBufferInfo2;
        localObject2 = paramFloatBufferInfo1;
        if (!localIterator.hasNext())
          break label131;
        Object localObject3 = (IAudioListener)localIterator.next();
        if (((IAudioListener)localObject3).isEnabled())
        {
          if (processAudioListener((IAudioListener)localObject3, (FloatBufferInfo)localObject2, (FloatBufferInfo)localObject1))
          {
            localObject3 = localObject1;
            localObject1 = localObject2;
            localObject2 = localObject3;
            continue;
          }
          ((FloatBufferInfo)localObject2).copy((FloatBufferInfo)localObject1);
        }
      }
      ((FloatBufferInfo)localObject2).copy((FloatBufferInfo)localObject1);
      continue;
      label131: if (localObject2 == paramFloatBufferInfo1)
        paramFloatBufferInfo1.copy(paramFloatBufferInfo2);
    }
  }

  protected void refreshTimeAndNotify(int paramInt)
  {
    this.mTimer.refreshTimeInMs(paramInt);
    if (this.mSignalControl.isWaiting())
    {
      Logger.d("BaseDecodeDataComponent", axiliary("lock is Waiting, event: seek, doNotify"));
      this.mSignalControl.doNotify();
    }
  }

  void release()
  {
    if (this.mAudioTrack != null);
    try
    {
      this.mAudioTrack.stop();
    }
    catch (Throwable localThrowable3)
    {
      try
      {
        this.mAudioTrack.flush();
      }
      catch (Throwable localThrowable3)
      {
        try
        {
          this.mAudioTrack.release();
        }
        catch (Throwable localThrowable3)
        {
          try
          {
            while (true)
            {
              destroyAudioListeners();
              this.mAudioTrack = null;
              Logger.d("BaseDecodeDataComponent", axiliary("finally release audioTrack"));
              if (!this.mCorePlayer.mIsExit)
              {
                if (!this.mStateRunner.isEqual(new Integer[] { Integer.valueOf(7) }))
                  break;
                this.mCallback.playerEnded(this.mCorePlayer);
              }
              return;
              localThrowable1 = localThrowable1;
              Logger.e("BaseDecodeDataComponent", localThrowable1);
              continue;
              localThrowable2 = localThrowable2;
              Logger.e("BaseDecodeDataComponent", localThrowable2);
              continue;
              localThrowable3 = localThrowable3;
              Logger.e("BaseDecodeDataComponent", localThrowable3);
            }
          }
          catch (Throwable localThrowable4)
          {
            while (true)
            {
              Logger.i("BaseDecodeDataComponent", "[run] failed to destroyAudioListeners!", localThrowable4);
              continue;
              this.mCallback.playerStopped(this.mCorePlayer);
            }
          }
        }
      }
    }
  }

  void releaseNotify()
  {
    if (this.mSignalControl.isWaiting())
    {
      Logger.d("BaseDecodeDataComponent", axiliary("lock is Waiting, event: release, doNotify"));
      this.mSignalControl.doNotify();
    }
  }

  void removeAudioListener(IAudioListener paramIAudioListener)
  {
    synchronized (this.audioEffects)
    {
      if (this.audioEffects.remove(paramIAudioListener))
        Logger.i("BaseDecodeDataComponent", "[removeAudioListener] audio removed: ".concat(String.valueOf(paramIAudioListener)));
    }
    synchronized (this.mTerminalAudioEffectList)
    {
      if (this.mTerminalAudioEffectList.remove(paramIAudioListener))
        Logger.i("BaseDecodeDataComponent", "[removeAudioListener] terminal audio removed: ".concat(String.valueOf(paramIAudioListener)));
      return;
      paramIAudioListener = finally;
      throw paramIAudioListener;
    }
  }

  void seek(int paramInt)
  {
  }

  void setAudioStreamType(int paramInt)
  {
    if (paramInt == this.mAudioStreamType);
    while (true)
    {
      return;
      this.mAudioStreamType = paramInt;
    }
  }

  void setPerformanceTracer(PerformanceTracer paramPerformanceTracer)
  {
    this.performanceTracer = paramPerformanceTracer;
  }

  void setVolume(float paramFloat1, float paramFloat2)
  {
    if (this.mAudioTrack != null);
    try
    {
      this.mAudioTrack.setStereoVolume(paramFloat1, paramFloat2);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      while (true)
        Logger.e("BaseDecodeDataComponent", "setVolume", localIllegalStateException);
    }
  }

  void stop()
  {
    Logger.i("BaseDecodeDataComponent", axiliary("stop"));
    if ((this.mStateRunner.transfer(Integer.valueOf(6), new Integer[] { Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(2) })) && (this.mSignalControl.isWaiting()))
    {
      Logger.d("BaseDecodeDataComponent", axiliary("lock is Waiting, event: stop, doNotify"));
      this.mSignalControl.doNotify();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent
 * JD-Core Version:    0.6.2
 */