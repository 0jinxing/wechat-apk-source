package com.tencent.qqmusic.mediaplayer;

import android.media.AudioTrack;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import com.tencent.qqmusic.mediaplayer.util.WaitNotify;
import com.tencent.qqmusic.mediaplayer.utils.AudioUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StaticDecodeDataComponent extends BaseDecodeDataComponent
{
  private static final String TAG = "StaticDecodeDataComponent";
  private int mAllBufferSize;
  private List<BufferInfo> mAllPcmBufferList;
  private int mBitDept = 2;
  private boolean mHasTerminal = false;
  private boolean mIsfirstStarted;

  StaticDecodeDataComponent(CorePlayer paramCorePlayer, PlayerStateRunner paramPlayerStateRunner, AudioInformation paramAudioInformation, PlayerCallback paramPlayerCallback, BaseDecodeDataComponent.HandleDecodeDataCallback paramHandleDecodeDataCallback, Handler paramHandler, int paramInt)
  {
    super(paramCorePlayer, paramPlayerStateRunner, paramAudioInformation, paramPlayerCallback, paramHandleDecodeDataCallback, paramHandler, paramInt);
    this.mBuffSize = 8192;
  }

  private boolean createAudioTrack()
  {
    int i = 3;
    AppMethodBeat.i(104512);
    Logger.d("StaticDecodeDataComponent", axiliary("createAudioTrack"));
    boolean bool;
    if (this.mInformation == null)
    {
      Logger.e("StaticDecodeDataComponent", axiliary("不留痕迹的退出 时机：获取Information时 step = 3"));
      this.mStateRunner.transfer(Integer.valueOf(9));
      callExceptionCallback(91, 63);
      AppMethodBeat.o(104512);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (!this.mStateRunner.isEqual(new Integer[] { Integer.valueOf(3) }))
      {
        Logger.e("StaticDecodeDataComponent", axiliary("mState is not preparing"));
        callExceptionCallback(91, 54);
        AppMethodBeat.o(104512);
        bool = false;
      }
      else
      {
        if (this.mInformation.getSampleRate() > 0L)
          break;
        Logger.e("StaticDecodeDataComponent", axiliary("mInformation.getSampleRate() failed"));
        callExceptionCallback(91, 64);
        AppMethodBeat.o(104512);
        bool = false;
      }
    }
    int j = 12;
    int k = this.mInformation.getChannels();
    if (k == 1)
      j = 4;
    while (true)
    {
      this.mPlaySample = this.mInformation.getSampleRate();
      this.mBitDept = this.mInformation.getBitDept();
      while (this.mPlaySample > MAX_PLAY_SAMPLE_RATE)
        this.mPlaySample /= 2L;
      if (k == 2)
        j = 12;
      else if (k == 6)
        j = 252;
      else if (k == 8)
        j = 1020;
    }
    if ((CAN_USE_FLOAT_IN_HI_RES) && (this.mBitDept >= 3))
    {
      this.mPlayBitDepth = this.mBitDept;
      this.isUseFloatInHiRes = true;
      if (this.mPlaySample != this.mInformation.getSampleRate())
      {
        Logger.i("StaticDecodeDataComponent", axiliary("will use float resampled pcm for Hi-Res, bitDept: " + this.mBitDept + ", origin sample rate: " + this.mInformation.getSampleRate() + ", target sample rate: " + this.mPlaySample));
        label362: if (this.mBitDept != 1)
          break label815;
      }
    }
    while (true)
    {
      while (true)
      {
        Logger.d("StaticDecodeDataComponent", axiliary(String.format("mPlaySample: %d, playChannel: %d", new Object[] { Long.valueOf(this.mPlaySample), Integer.valueOf(k) })));
        try
        {
          AudioTrack localAudioTrack = new android/media/AudioTrack;
          localAudioTrack.<init>(3, (int)this.mPlaySample, j, i, this.mAllBufferSize, 0);
          this.mAudioTrack = localAudioTrack;
          if (this.mAudioTrack.getState() == 2)
            Logger.d("StaticDecodeDataComponent", axiliary("new AudioTrack succeed"));
          if ((this.mAudioTrack != null) && (this.mAudioTrack.getState() == 2))
          {
            Logger.d("StaticDecodeDataComponent", axiliary("create audioTrack success"));
            AppMethodBeat.o(104512);
            bool = true;
            break;
            Logger.i("StaticDecodeDataComponent", axiliary("will use float pcm for Hi-Res, bitDept: " + this.mBitDept + ", sample rate: " + this.mPlaySample));
            break label362;
            if ((!CAN_USE_FLOAT_IN_HI_RES) && (this.mBitDept >= 3))
            {
              this.mPlayBitDepth = 2;
              if (this.mPlaySample != this.mInformation.getSampleRate())
              {
                Logger.i("StaticDecodeDataComponent", axiliary("will use byte pcm resampled and bitDept converted, origin bitDept: " + this.mBitDept + ", target bitDept: " + this.mPlayBitDepth + ", origin sample rate: " + this.mInformation.getSampleRate() + ", target sample rate: " + this.mPlaySample));
                break label362;
              }
              Logger.i("StaticDecodeDataComponent", axiliary("will use byte pcm with bitDept converted, origin bitDept: " + this.mBitDept + ", target bitDept: " + this.mPlayBitDepth));
              break label362;
            }
            if (this.mPlaySample != this.mInformation.getSampleRate())
            {
              this.mPlayBitDepth = this.mBitDept;
              Logger.i("StaticDecodeDataComponent", axiliary("will use byte pcm resampled, bitDept: " + this.mBitDept + ", origin sample rate: " + this.mInformation.getSampleRate() + ", target sample rate: " + this.mPlaySample));
              break label362;
            }
            this.mPlayBitDepth = 2;
            Logger.i("StaticDecodeDataComponent", axiliary("will use normal byte pcm, bitDept: " + this.mBitDept + ", sample rate: " + this.mPlaySample));
            break label362;
            label815: if (this.mBitDept == 2)
            {
              i = 2;
              continue;
            }
            if (!this.isUseFloatInHiRes)
              break label904;
            i = 4;
          }
        }
        catch (Throwable localThrowable)
        {
          while (true)
            Logger.e("StaticDecodeDataComponent", localThrowable);
          this.mCreateAudioTrackFail = true;
          Logger.e("StaticDecodeDataComponent", axiliary("create audioTrack fail mCreateAudioTrackFail = true"));
          this.mAudioTrack = null;
          this.mStateRunner.transfer(Integer.valueOf(9));
          callExceptionCallback(91, 66);
          AppMethodBeat.o(104512);
          bool = false;
        }
      }
      break;
      label904: i = 2;
    }
  }

  private boolean decodeAllData()
  {
    boolean bool = false;
    AppMethodBeat.i(104511);
    this.mAllPcmBufferList = new ArrayList();
    while (true)
    {
      BufferInfo localBufferInfo1;
      if (!this.mCorePlayer.mIsExit)
      {
        localBufferInfo1 = new BufferInfo();
        localBufferInfo1.setByteBufferCapacity(this.mBuffSize);
      }
      try
      {
        i = this.mHandleDecodeDataCallback.pullDecodeData(this.mBuffSize, localBufferInfo1.byteBuffer);
        this.mHasDecode = true;
        if (i > 0)
        {
          localBufferInfo1.bufferSize = i;
          this.mAllPcmBufferList.add(localBufferInfo1);
          if (this.mHasDecodeSuccess)
            continue;
          this.mHasDecodeSuccess = true;
        }
      }
      catch (SoNotFindException localSoNotFindException)
      {
        Logger.e("StaticDecodeDataComponent", localSoNotFindException);
        this.mStateRunner.transfer(Integer.valueOf(9));
        callExceptionCallback(91, 62);
        AppMethodBeat.o(104511);
        while (true)
        {
          return bool;
          if (i == 0)
          {
            localSoNotFindException.bufferSize = this.mBuffSize;
            this.mAllPcmBufferList.add(localSoNotFindException);
            Logger.i("StaticDecodeDataComponent", "static decode end");
            if (this.mAllPcmBufferList.isEmpty())
              break label403;
            Iterator localIterator1 = this.mAllPcmBufferList.iterator();
            for (i = 0; localIterator1.hasNext(); i = ((BufferInfo)localIterator1.next()).bufferSize + i);
          }
          this.mHandleDecodeDataCallback.onPullDecodeDataEndOrFailed(i, 91);
          AppMethodBeat.o(104511);
        }
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          Logger.e("StaticDecodeDataComponent", localThrowable);
          this.mStateRunner.transfer(Integer.valueOf(9));
          callExceptionCallback(91, 67);
          AppMethodBeat.o(104511);
          continue;
          Logger.i("StaticDecodeDataComponent", "static totalBufferSize = ".concat(String.valueOf(i)));
          this.mDecodeBufferInfo.setByteBufferCapacity(i);
          Iterator localIterator2 = this.mAllPcmBufferList.iterator();
          int i = 0;
          while (localIterator2.hasNext())
          {
            BufferInfo localBufferInfo2 = (BufferInfo)localIterator2.next();
            System.arraycopy(localBufferInfo2.byteBuffer, 0, this.mDecodeBufferInfo.byteBuffer, i, localBufferInfo2.bufferSize);
            i += localBufferInfo2.bufferSize;
            BufferInfo localBufferInfo3 = this.mDecodeBufferInfo;
            localBufferInfo3.bufferSize += localBufferInfo2.bufferSize;
            int j = this.mAllBufferSize;
            this.mAllBufferSize = (localBufferInfo2.bufferSize + j);
          }
          label403: AppMethodBeat.o(104511);
          bool = true;
        }
      }
    }
  }

  private boolean writeAudioTrack()
  {
    AppMethodBeat.i(104513);
    int i;
    label95: IAudioListener localIAudioListener;
    label144: boolean bool;
    if ((this.mDecodeBufferInfo.byteBuffer != null) && (this.mAudioTrack != null))
    {
      handleHighBitDept(this.mDecodeBufferInfo, this.mNewBitDepthBufferInfo);
      handleHighSample(this.mNewBitDepthBufferInfo, this.mReSampleBufferInfo);
      if (this.isUseFloatInHiRes)
      {
        convertBytePcmToFloatPcm(this.mReSampleBufferInfo, this.mFloatBufferInfo);
        processAudioListeners(this.mFloatBufferInfo, this.mFloatBufferInfo);
        this.mHasTerminal = false;
        i = this.mTerminalAudioEffectList.size() - 1;
        if (i >= 0)
        {
          localIAudioListener = (IAudioListener)this.mTerminalAudioEffectList.get(i);
          if (!localIAudioListener.isEnabled())
            break label297;
          if (!this.isUseFloatInHiRes)
            break label279;
          localIAudioListener.onPcm(this.mFloatBufferInfo, this.mFloatBufferInfo);
          this.mHasTerminal = true;
        }
        if (this.mHasTerminal)
          break label524;
        if (!this.isUseFloatInHiRes)
          break label367;
        i = this.mAudioTrack.write(this.mFloatBufferInfo.floatBuffer, 0, this.mFloatBufferInfo.bufferSize, 0);
        if (i >= 0)
          break label303;
        Logger.e("StaticDecodeDataComponent", axiliary("mAudioTrack write float failed: " + i + ", expect: " + this.mFloatBufferInfo.bufferSize));
        this.mStateRunner.transfer(Integer.valueOf(9));
        callExceptionCallback(91, 102);
        AppMethodBeat.o(104513);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      processAudioListeners(this.mReSampleBufferInfo, this.mDTSBufferInfo);
      break;
      label279: localIAudioListener.onPcm(this.mDTSBufferInfo, this.mDTSBufferInfo);
      break label144;
      label297: i--;
      break label95;
      label303: if (i != this.mFloatBufferInfo.bufferSize)
        Logger.w("StaticDecodeDataComponent", axiliary("mAudioTrack write float not equal: " + i + ", expect: " + this.mFloatBufferInfo.bufferSize));
      while (true)
      {
        AppMethodBeat.o(104513);
        bool = true;
        break;
        label367: i = this.mAudioTrack.write(this.mDTSBufferInfo.byteBuffer, 0, this.mDTSBufferInfo.bufferSize);
        if (i < 0)
        {
          Logger.e("StaticDecodeDataComponent", axiliary("mAudioTrack write bytes failed: " + i + ", expect: " + this.mDTSBufferInfo.bufferSize));
          this.mStateRunner.transfer(Integer.valueOf(9));
          callExceptionCallback(91, 102);
          AppMethodBeat.o(104513);
          bool = false;
          break;
        }
        if (i != this.mDTSBufferInfo.bufferSize)
          Logger.w("StaticDecodeDataComponent", axiliary("mAudioTrack write bytes not equal: " + i + ", expect: " + this.mDTSBufferInfo.bufferSize));
      }
      label524: Logger.i("StaticDecodeDataComponent", "mTerminalAudioEffectList has blocked");
      AppMethodBeat.o(104513);
      bool = false;
      continue;
      AppMethodBeat.o(104513);
      bool = false;
    }
  }

  int getAudioStreamType()
  {
    return 0;
  }

  long getCurPosition()
  {
    AppMethodBeat.i(104509);
    AudioTrack localAudioTrack = this.mAudioTrack;
    long l;
    if ((localAudioTrack == null) || (localAudioTrack.getState() == 0))
    {
      l = this.mCurPosition;
      AppMethodBeat.o(104509);
    }
    while (true)
    {
      return l;
      this.mCurPosition = getAudioTrackPosition(0L, localAudioTrack);
      l = this.mCurPosition;
      AppMethodBeat.o(104509);
    }
  }

  void handleDecodeData()
  {
    AppMethodBeat.i(104510);
    if (this.mInformation != null);
    while (true)
    {
      try
      {
        if (0L == this.mInformation.getSampleRate())
        {
          Logger.e("StaticDecodeDataComponent", "failed to getSampleRate");
          this.mStateRunner.transfer(Integer.valueOf(9));
          callExceptionCallback(91, 63);
          AppMethodBeat.o(104510);
          return;
        }
        this.mHasInit = true;
        if (!decodeAllData())
        {
          Logger.e("StaticDecodeDataComponent", "failed to decodeAllData");
          this.mStateRunner.transfer(Integer.valueOf(9));
          AppMethodBeat.o(104510);
          continue;
        }
        if (!createAudioTrack())
        {
          Logger.e("StaticDecodeDataComponent", "failed to createAudioTrack");
          this.mStateRunner.transfer(Integer.valueOf(9));
          AppMethodBeat.o(104510);
          continue;
        }
        if ((!writeAudioTrack()) && (!this.mHasTerminal))
        {
          Logger.e("StaticDecodeDataComponent", "failed to writeAudioTrack");
          this.mStateRunner.transfer(Integer.valueOf(9));
          AppMethodBeat.o(104510);
          continue;
        }
        if (this.mHasTerminal)
        {
          this.mStateRunner.transfer(Integer.valueOf(7));
          AppMethodBeat.o(104510);
          continue;
        }
        this.mStateRunner.transfer(Integer.valueOf(2));
        this.mIsfirstStarted = false;
        initAudioListeners(this.mInformation.getPlaySample(), getBytesPerSampleInPlay(this.mInformation.getBitDept()), this.mInformation.getChannels());
        StaticDecodeDataComponent.1 local1 = new com/tencent/qqmusic/mediaplayer/StaticDecodeDataComponent$1;
        local1.<init>(this);
        postRunnable(local1, 20);
        Logger.i("StaticDecodeDataComponent", axiliary("prepared. waiting..."));
        this.mSignalControl.doWait();
        Logger.i("StaticDecodeDataComponent", axiliary("woke after preparing"));
        playAudioTrack();
        AppMethodBeat.o(104510);
        continue;
      }
      catch (SoNotFindException localSoNotFindException)
      {
        Logger.e("StaticDecodeDataComponent", localSoNotFindException);
        continue;
      }
      Logger.e("StaticDecodeDataComponent", axiliary("不留痕迹的退出 时机：获取Information时 step = 3"));
      this.mStateRunner.transfer(Integer.valueOf(9));
      callExceptionCallback(91, 63);
      AppMethodBeat.o(104510);
    }
  }

  public void playAudioTrack()
  {
    AppMethodBeat.i(104514);
    this.mAudioTrack.reloadStaticData();
    while (true)
      if (!this.mCorePlayer.mIsExit)
        if (isPaused())
        {
          if (this.mAudioTrack.getPlayState() != 2)
            this.mAudioTrack.pause();
          postRunnable(new StaticDecodeDataComponent.2(this), 20);
          doWaitForPaused();
        }
        else if (!isIdle())
        {
          if (isError())
          {
            Logger.e("StaticDecodeDataComponent", "static play error");
            AppMethodBeat.o(104514);
          }
        }
    while (true)
    {
      return;
      if (isStopped())
      {
        if (this.mAudioTrack.getPlayState() != 1)
          this.mAudioTrack.stop();
        postRunnable(new StaticDecodeDataComponent.3(this), 20);
        AppMethodBeat.o(104514);
      }
      else if (isCompleted())
      {
        this.mCorePlayer.mIsExit = true;
        AppMethodBeat.o(104514);
      }
      else
      {
        if (!isPlaying())
          break;
        if (this.mAudioTrack.getPlayState() == 2)
        {
          this.mAudioTrack.play();
          break;
        }
        if (this.mAudioTrack.getPlayState() == 1)
        {
          if (this.mIsfirstStarted)
            break;
          this.mIsfirstStarted = true;
          this.mAudioTrack.play();
          this.mCallback.playerStarted(this.mCorePlayer);
          break;
        }
        if (AudioUtil.getPlaybackHeadPositionSafely(this.mAudioTrack) * this.mInformation.getChannels() * getBytesPerSampleInPlay(this.mInformation.getBitDept()) < this.mAllBufferSize)
          break;
        this.mStateRunner.transfer(Integer.valueOf(7));
        Logger.i("StaticDecodeDataComponent", "static play completed");
        postRunnable(new StaticDecodeDataComponent.4(this), 20);
        break;
        AppMethodBeat.o(104514);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent
 * JD-Core Version:    0.6.2
 */