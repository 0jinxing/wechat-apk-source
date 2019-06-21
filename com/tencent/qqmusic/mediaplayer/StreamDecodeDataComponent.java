package com.tencent.qqmusic.mediaplayer;

import android.media.AudioTrack;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import com.tencent.qqmusic.mediaplayer.util.ReferenceTimer;
import com.tencent.qqmusic.mediaplayer.util.WaitNotify;
import com.tencent.qqmusic.mediaplayer.utils.AudioUtil;
import java.util.List;
import java.util.Stack;

public class StreamDecodeDataComponent extends BaseDecodeDataComponent
{
  private static final int DTS_OPTIMAL_FRAME_BYTE = 2048;
  private static final int MAX_AUDIO_TRACK_BUFFER_TIME = 1;
  private static final int MIN_AUDIO_TRACK_BUFFER_TIMES = 1;
  private static final String TAG = "StreamDecodeDataComponent";
  private static final int USE_AUDIO_TRACK_TIME_THRESHOLD = 1000;
  private long mCurrentFrameCount;
  private boolean mNeedFlush;
  private final Stack<Integer> mSeekRecord;
  private int mTrackBufferSizeInByte;

  StreamDecodeDataComponent(CorePlayer paramCorePlayer, PlayerStateRunner paramPlayerStateRunner, AudioInformation paramAudioInformation, PlayerCallback paramPlayerCallback, BaseDecodeDataComponent.HandleDecodeDataCallback paramHandleDecodeDataCallback, Handler paramHandler, int paramInt)
  {
    super(paramCorePlayer, paramPlayerStateRunner, paramAudioInformation, paramPlayerCallback, paramHandleDecodeDataCallback, paramHandler, paramInt);
    AppMethodBeat.i(104488);
    this.mSeekRecord = new Stack();
    this.mCurrentFrameCount = 0L;
    this.mNeedFlush = false;
    AppMethodBeat.o(104488);
  }

  private void addSeekRecord(int paramInt)
  {
    AppMethodBeat.i(104494);
    synchronized (this.mSeekRecord)
    {
      Logger.i("StreamDecodeDataComponent", "add seek: ".concat(String.valueOf(paramInt)));
      this.mSeekRecord.push(Integer.valueOf(paramInt));
      AppMethodBeat.o(104494);
      return;
    }
  }

  private boolean createAudioTrack()
  {
    AppMethodBeat.i(104492);
    Logger.d("StreamDecodeDataComponent", axiliary("createAudioTrack"));
    boolean bool;
    if (!this.mStateRunner.isEqual(new Integer[] { Integer.valueOf(3) }))
    {
      Logger.e("StreamDecodeDataComponent", "mState is not preparing");
      callExceptionCallback(91, 54);
      bool = false;
      AppMethodBeat.o(104492);
    }
    while (true)
    {
      return bool;
      if (this.mInformation.getSampleRate() <= 0L)
      {
        Logger.e("StreamDecodeDataComponent", "mInformation.getSampleRate() failed");
        callExceptionCallback(91, 64);
        bool = false;
        AppMethodBeat.o(104492);
      }
      else
      {
        int i = 12;
        int j = this.mInformation.getChannels();
        if (j == 1)
          i = 4;
        int k;
        while (true)
        {
          k = (int)this.mHandleDecodeDataCallback.getMinPcmBufferSize();
          Logger.d("StreamDecodeDataComponent", axiliary(this.mInformation.toString()));
          for (this.mPlaySample = this.mInformation.getSampleRate(); this.mPlaySample > MAX_PLAY_SAMPLE_RATE; this.mPlaySample /= 2L);
          if (j == 2)
            i = 12;
          else if (j == 6)
            i = 252;
          else if (j == 8)
            i = 1020;
        }
        this.mInformation.setPlaySample(this.mPlaySample);
        int m = getBytesPerSampleInPlay(this.mInformation.getBitDept());
        int n = m;
        if (m == 0)
          n = 2;
        label369: label381: int i1;
        int i2;
        if ((CAN_USE_FLOAT_IN_HI_RES) && (this.mInformation.getBitDept() >= 3) && (this.mInformation.getSampleRate() > 48000L))
        {
          this.mPlayBitDepth = n;
          this.isUseFloatInHiRes = true;
          if (this.mPlaySample != this.mInformation.getSampleRate())
          {
            Logger.i("StreamDecodeDataComponent", axiliary("will use float resampled pcm for Hi-Res, bitDept: " + this.mInformation.getBitDept() + ", origin sample rate: " + this.mInformation.getSampleRate() + ", target sample rate: " + this.mPlaySample));
            m = 2;
            if (n != 1)
              break label1143;
            m = 3;
            i1 = getMinBufferSize(this.mPlaySample, i, m, j, n);
            Logger.i("StreamDecodeDataComponent", axiliary("[createAudioTrack] playback_bufsize:" + i1 + " decoderBufsizeInByte:" + k));
            i2 = i1;
            if (i1 % 2048 != 0)
              i2 = (i1 / 2048 + 1) * 2048;
            i1 = k;
            if (i2 > k)
              i1 = i2;
            this.mBuffSize = i1;
            Logger.i("StreamDecodeDataComponent", axiliary(String.format("playback_bufsize: %d, mBuffSize: %d, mPlaySample: %d, playChannel: %d, pcmEncoding: %d", new Object[] { Integer.valueOf(i2), Integer.valueOf(this.mBuffSize), Long.valueOf(this.mPlaySample), Integer.valueOf(j), Integer.valueOf(m) })));
            i1 = Math.max((int)(Math.floor(1L * this.mPlaySample * j * 2L / i2) + 1.0D), 1);
            Logger.d("StreamDecodeDataComponent", axiliary("times: " + i1 + ", MIN_AUDIO_TRACK_BUFFER_TIMES: 1"));
            if (i1 <= 0);
          }
        }
        try
        {
          this.mTrackBufferSizeInByte = (i2 * i1);
          Object localObject = new android/media/AudioTrack;
          ((AudioTrack)localObject).<init>(this.mAudioStreamType, (int)this.mPlaySample, i, m, this.mTrackBufferSizeInByte, 1);
          this.mAudioTrack = ((AudioTrack)localObject);
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("[createAudioTrack] new AudioTrack, sampleRate: ");
          Logger.i("StreamDecodeDataComponent", axiliary(this.mPlaySample + ", channels: " + i + ", bitDepth: " + n + ", buffer: " + this.mTrackBufferSizeInByte));
          k = this.mAudioTrack.getState();
          if (k == 1)
          {
            Logger.i("StreamDecodeDataComponent", axiliary("new AudioTrack succeed"));
            if ((this.mAudioTrack != null) && (this.mAudioTrack.getState() == 1))
            {
              Logger.d("StreamDecodeDataComponent", axiliary("create audioTrack success times = ".concat(String.valueOf(i1))));
              this.mStateRunner.setAudioTrack(this.mAudioTrack);
              bool = true;
              AppMethodBeat.o(104492);
              continue;
              Logger.i("StreamDecodeDataComponent", axiliary("will use float pcm for Hi-Res, bitDept: " + this.mInformation.getBitDept() + ", sample rate: " + this.mPlaySample));
              break label369;
              if ((!CAN_USE_FLOAT_IN_HI_RES) && (this.mInformation.getBitDept() >= 3))
              {
                this.mPlayBitDepth = 2;
                if (this.mPlaySample != this.mInformation.getSampleRate())
                {
                  Logger.i("StreamDecodeDataComponent", axiliary("will use byte pcm resampled and bitDept converted, origin bitDept: " + this.mInformation.getBitDept() + ", target bitDept: " + this.mPlayBitDepth + ", origin sample rate: " + this.mInformation.getSampleRate() + ", target sample rate: " + this.mPlaySample));
                  break label369;
                }
                Logger.i("StreamDecodeDataComponent", axiliary("will use byte pcm with bitDept converted, origin bitDept: " + this.mInformation.getBitDept() + ", target bitDept: " + this.mPlayBitDepth));
                break label369;
              }
              if (this.mPlaySample != this.mInformation.getSampleRate())
              {
                this.mPlayBitDepth = n;
                Logger.i("StreamDecodeDataComponent", axiliary("will use byte pcm resampled, bitDept: " + this.mInformation.getBitDept() + ", origin sample rate: " + this.mInformation.getSampleRate() + ", target sample rate: " + this.mPlaySample));
                break label369;
              }
              this.mPlayBitDepth = 2;
              Logger.i("StreamDecodeDataComponent", axiliary("will use normal byte pcm, bitDept: " + this.mInformation.getBitDept() + ", sample rate: " + this.mPlaySample));
              break label369;
              label1143: if (n == 2)
              {
                m = 2;
                break label381;
              }
              if (!this.isUseFloatInHiRes)
                break label381;
              m = 4;
              break label381;
            }
          }
          else
          {
            Logger.e("StreamDecodeDataComponent", axiliary("audioTrack create fail!!! state = ".concat(String.valueOf(k))));
            this.mAudioTrack.release();
            i1 -= 2;
          }
        }
        catch (Throwable localThrowable)
        {
          while (true)
            Logger.e("StreamDecodeDataComponent", localThrowable);
          this.mCreateAudioTrackFail = true;
          Logger.e("StreamDecodeDataComponent", axiliary("create audioTrack fail mCreateAudioTrackFail = true"));
          this.mAudioTrack = null;
          callExceptionCallback(92, 66);
          bool = false;
          AppMethodBeat.o(104492);
        }
      }
    }
  }

  private long getCalcBitMinSize(AudioInformation paramAudioInformation)
  {
    AppMethodBeat.i(104495);
    long l;
    if (paramAudioInformation != null)
    {
      l = ()((float)(paramAudioInformation.getSampleRate() * paramAudioInformation.getChannels() * paramAudioInformation.getBitDept()) * 5.0F / 1000.0F);
      AppMethodBeat.o(104495);
    }
    while (true)
    {
      return l;
      l = 0L;
      AppMethodBeat.o(104495);
    }
  }

  private int getMinBufferSize(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(104493);
    int i = AudioTrack.getMinBufferSize((int)paramLong, paramInt1, paramInt2);
    int j = i;
    if (i < 0)
    {
      Logger.i("StreamDecodeDataComponent", axiliary("minBufferSize = " + i + " mPlaySample = " + paramLong + "  channelConfiguration = " + paramInt1 + "   pcmEncoding = " + paramInt2));
      j = paramInt3 * 3536 * paramInt4;
    }
    AppMethodBeat.o(104493);
    return j;
  }

  void flush()
  {
    this.mNeedFlush = true;
  }

  int getAudioStreamType()
  {
    return 3;
  }

  long getCurPosition()
  {
    AppMethodBeat.i(104497);
    AudioTrack localAudioTrack = this.mAudioTrack;
    if ((localAudioTrack == null) || (localAudioTrack.getState() == 0))
    {
      l = this.mCurPosition;
      AppMethodBeat.o(104497);
    }
    AudioInformation localAudioInformation;
    while (true)
    {
      return l;
      localAudioInformation = this.mInformation;
      if (localAudioInformation != null)
        break;
      l = this.mCurPosition;
      AppMethodBeat.o(104497);
    }
    int i = getAudioTrackPosition(this.mCurrentFrameCount, localAudioTrack);
    long l = localAudioInformation.getChannels() * getBytesPerSampleInPlay(localAudioInformation.getBitDept());
    l = localAudioInformation.getPlaySample() * l;
    if (l > 0L)
    {
      l = this.mTrackBufferSizeInByte / l * 1000L;
      label113: l = this.mHandleDecodeDataCallback.getCurPositionByDecoder() - Math.max(0L, l);
      if (l >= 0L)
        break label161;
      this.mCurPosition = i;
    }
    while (true)
    {
      l = this.mCurPosition;
      AppMethodBeat.o(104497);
      break;
      l = 0L;
      break label113;
      label161: if ((i > 0) && (Math.abs(i - l) < 1000L))
        this.mCurPosition = i;
      else
        this.mCurPosition = l;
    }
  }

  void handleDecodeData()
  {
    AppMethodBeat.i(104491);
    if ((this.mInformation != null) && (!this.mCorePlayer.mIsExit));
    int i;
    long l1;
    long l2;
    long l3;
    int j;
    int k;
    int m;
    int n;
    label261: int i1;
    int i2;
    while (true)
    {
      try
      {
        if (0L == this.mInformation.getSampleRate())
        {
          Logger.e("StreamDecodeDataComponent", "failed to getSampleRate");
          this.mStateRunner.transfer(Integer.valueOf(9));
          callExceptionCallback(91, 63);
          AppMethodBeat.o(104491);
          return;
        }
        this.mHasInit = true;
        if (!createAudioTrack())
        {
          Logger.e("StreamDecodeDataComponent", "failed to createAudioTrack");
          this.mStateRunner.transfer(Integer.valueOf(9));
          AppMethodBeat.o(104491);
          continue;
        }
      }
      catch (SoNotFindException localSoNotFindException1)
      {
        Logger.e("StreamDecodeDataComponent", localSoNotFindException1);
        this.mStateRunner.transfer(Integer.valueOf(2));
        initAudioListeners(this.mInformation.getPlaySample(), this.mPlayBitDepth, this.mInformation.getChannels());
        postRunnable(new StreamDecodeDataComponent.1(this), 20);
        if ((!isPlaying()) && (!this.mCorePlayer.mIsExit))
        {
          Logger.i("StreamDecodeDataComponent", axiliary("prepared. waiting..."));
          this.mSignalControl.doWait();
          Logger.i("StreamDecodeDataComponent", axiliary("woke after preparing"));
        }
        PlayerConfigManager.getInstance().setCommonPlayerRef(this.mCorePlayer);
        this.mDecodeBufferInfo.setByteBufferCapacity(this.mBuffSize);
        i = 0;
        l1 = 0L;
        l2 = System.currentTimeMillis();
        l3 = 0L;
        j = 0;
        k = 0;
        m = 1;
        n = 0;
      }
      if (this.mCorePlayer.mIsExit)
        break label2270;
      i1 = -1;
      synchronized (this.mSeekRecord)
      {
        if (!this.mSeekRecord.empty())
        {
          i1 = ((Integer)this.mSeekRecord.pop()).intValue();
          this.mSeekRecord.clear();
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("execute seek: ");
          Logger.i("StreamDecodeDataComponent", i1 + ", abandon the others");
        }
        i2 = i1;
        if (i1 < 0)
        {
          i2 = i1;
          if (this.mNeedFlush)
          {
            i2 = getAudioTrackPosition(this.mCurrentFrameCount, this.mAudioTrack);
            Logger.i("StreamDecodeDataComponent", axiliary("[run] flashback to ".concat(String.valueOf(i2))));
            this.mNeedFlush = false;
          }
        }
        i1 = j;
        if (i2 < 0)
          break label711;
        i1 = i2;
        if (i2 > this.mInformation.getDuration() - 1000L)
        {
          i1 = i2;
          if (this.mInformation.getDuration() > 1000L)
            i1 = (int)(this.mInformation.getDuration() - 1000L);
        }
        i2 = this.mHandleDecodeDataCallback.seekTo(i1);
        if (i2 < 0)
        {
          Logger.e("StreamDecodeDataComponent", axiliary("seekTo failed: ".concat(String.valueOf(i2))));
          this.mStateRunner.transfer(Integer.valueOf(9));
          callExceptionCallback(95, 74);
          AppMethodBeat.o(104491);
          continue;
          if (!this.mCorePlayer.mIsExit)
          {
            Logger.e("StreamDecodeDataComponent", axiliary("不留痕迹的退出 时机：获取Information时 step = 3"));
            this.mStateRunner.transfer(Integer.valueOf(9));
            callExceptionCallback(91, 63);
          }
          AppMethodBeat.o(104491);
        }
      }
      if (this.mAudioTrack != null)
      {
        this.mCurrentFrameCount = Math.round(i1 / 1000.0D * this.mAudioTrack.getSampleRate());
        if (this.mAudioTrack.getPlayState() != 3)
          break label767;
        this.mAudioTrack.pause();
        this.mAudioTrack.flush();
        this.mAudioTrack.play();
      }
      while (true)
      {
        j = 0;
        this.mCurPosition = i1;
        this.mTimer.refreshTimeInMs(i1);
        notifySeekCompleteForAudioListeners(i1);
        this.mCallback.playerSeekCompletion(this.mCorePlayer, i1);
        i1 = j;
        label711: j = i1;
        if (!isPaused())
          break label777;
        postRunnable(new StreamDecodeDataComponent.2(this), 20);
        Logger.i("StreamDecodeDataComponent", axiliary("paused. waiting..."));
        doWaitForPaused();
        Logger.i("StreamDecodeDataComponent", axiliary("woke after pausing"));
        break;
        label767: this.mAudioTrack.flush();
      }
      label777: if ((isIdle()) || (isError()) || (isStopped()))
        break label2270;
      if (isCompleted())
      {
        m = j / this.mInformation.getChannels() - n;
        if (m > 0)
        {
          label825: i = this.mTrackBufferSizeInByte / getBytesPerSampleInPlay(this.mInformation.getBitDept()) / this.mInformation.getChannels();
          if (m >= i)
            break label972;
          label856: m = (int)(m * 1000 / this.mInformation.getSampleRate());
          i = AudioPlayerConfigure.minAudioTrackWaitTimeMs;
          Logger.i("StreamDecodeDataComponent", axiliary("writeShortCount: " + j + ", playFramePosition: " + n + ", leftTimeInMs: " + m + ", minAudioTrackWaitTimeMs: " + i));
          if (m <= 0)
            break label2270;
        }
        try
        {
          wait(Math.max(i, m));
          AppMethodBeat.o(104491);
          continue;
          m = 0;
          break label825;
          label972: m = i;
          break label856;
        }
        finally
        {
          AppMethodBeat.o(104491);
        }
      }
    }
    if (m != 0);
    while (true)
    {
      try
      {
        i2 = this.mHandleDecodeDataCallback.pullDecodeData(this.mBuffSize, this.mDecodeBufferInfo.byteBuffer);
        this.mDecodeBufferInfo.bufferSize = i2;
        l1 = this.mDecodeBufferInfo.bufferSize + l1;
        l3 = this.mDecodeBufferInfo.bufferSize + l3;
        this.mHasDecode = true;
        if (i != 0)
          break label2303;
        i1 = 10;
        long l4 = getCalcBitMinSize(this.mInformation);
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("minSize: ");
        Logger.i("StreamDecodeDataComponent", axiliary(l4 + ", mDecodeBufferInfo.bufferSize: " + this.mDecodeBufferInfo.bufferSize));
        if (l4 > 0L)
        {
          l5 = l1;
          i = i2;
          l6 = l3;
          if (this.mDecodeBufferInfo.bufferSize < l4)
          {
            l5 = l1;
            i = i2;
            l6 = l3;
            if (i1 >= 0)
            {
              this.mDecodeBufferInfo.setTempByteBufferCapacity(this.mBuffSize);
              i2 = this.mHandleDecodeDataCallback.pullDecodeData(this.mBuffSize, this.mDecodeBufferInfo.tempByteBuffer);
              l5 = l1;
              l6 = l3;
              if (i2 > 0)
              {
                this.mDecodeBufferInfo.appendByte(this.mDecodeBufferInfo.tempByteBuffer, 0, i2);
                localObject2 = this.mDecodeBufferInfo;
                ((BufferInfo)localObject2).bufferSize += i2;
                l5 = l1 + i2;
                l6 = l3 + i2;
              }
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>("decode tmpSize: ");
              Logger.d("StreamDecodeDataComponent", axiliary(i2 + ", mDecodeBufferInfo.bufferSize: " + this.mDecodeBufferInfo.bufferSize));
              i1--;
              l1 = l5;
              l3 = l6;
              continue;
            }
          }
        }
        else
        {
          i = i2;
          l6 = l3;
          l5 = l1;
        }
        if (this.mInformation.getBitDept() == 0)
          this.mInformation.setBitDept(AudioRecognition.calcBitDept(l5, this.mHandleDecodeDataCallback.getCurPositionByDecoder(), this.mInformation.getChannels(), this.mInformation.getSampleRate()));
        i1 = this.mInformation.getBitDept();
        if ((this.isUseFloatInHiRes) || (i1 < 3))
        {
          i2 = i1;
          if (i1 > 0);
        }
        else
        {
          Logger.w("StreamDecodeDataComponent", "mPlayBitDept is set with 2, old value: ".concat(String.valueOf(i1)));
          i2 = 2;
        }
        Logger.d("StreamDecodeDataComponent", axiliary("mPlayBitDept: ".concat(String.valueOf(i2))));
        i1 = i;
        l3 = l6;
        l1 = l5;
        i = i2;
        i2 = i1;
        if (this.mNeedChangePlayThreadPriority)
        {
          this.mNeedChangePlayThreadPriority = false;
          PlayerConfigManager.getInstance().changeDecodeThreadPriorityIfNeed();
        }
        long l6 = System.currentTimeMillis();
        long l5 = l6 - l2;
        if (l5 <= 1000L)
          break label2300;
        PlayerConfigManager.getInstance().updateDecodeSpeed(()(1.0F * (float)l3 / (float)l5));
        l3 = 0L;
        l2 = l6;
        if (this.mDecodeBufferInfo.bufferSize <= 0)
          break label2250;
        if (!this.mHasDecodeSuccess)
        {
          this.mCallback.playerStarted(this.mCorePlayer);
          this.mHasDecodeSuccess = true;
        }
        handleHighBitDept(this.mDecodeBufferInfo, this.mNewBitDepthBufferInfo);
        handleHighSample(this.mNewBitDepthBufferInfo, this.mReSampleBufferInfo);
        if (!this.isUseFloatInHiRes)
          break label1889;
        convertBytePcmToFloatPcm(this.mReSampleBufferInfo, this.mFloatBufferInfo);
        processAudioListeners(this.mFloatBufferInfo, this.mFloatBufferInfo);
        if ((this.mAudioTrack == null) || (!isPlaying()))
          break label2263;
        i1 = this.mTerminalAudioEffectList.size() - 1;
        if (i1 < 0)
          break label2294;
        localObject2 = (IAudioListener)this.mTerminalAudioEffectList.get(i1);
        if (!((IAudioListener)localObject2).isEnabled())
          break label1922;
        if (!this.isUseFloatInHiRes)
          break label1904;
        ((IAudioListener)localObject2).onPcm(this.mFloatBufferInfo, this.mFloatBufferInfo);
        i1 = 1;
        if (i1 != 0)
          break label2279;
        if (!this.isUseFloatInHiRes)
          break label2046;
        m = this.mAudioTrack.write(this.mFloatBufferInfo.floatBuffer, 0, this.mFloatBufferInfo.bufferSize, 0);
        if (m >= 0)
          break label1971;
        if (this.mAudioTrack.getPlayState() != 3)
          break label1928;
        Logger.e("StreamDecodeDataComponent", axiliary("mAudioTrack write float failed: " + m + ", expect: " + this.mFloatBufferInfo.bufferSize));
        this.mStateRunner.transfer(Integer.valueOf(9));
        callExceptionCallback(92, 102);
        AppMethodBeat.o(104491);
      }
      catch (SoNotFindException localSoNotFindException2)
      {
        Logger.e("StreamDecodeDataComponent", localSoNotFindException2);
        this.mStateRunner.transfer(Integer.valueOf(9));
        callExceptionCallback(92, 62);
        AppMethodBeat.o(104491);
      }
      catch (Throwable localThrowable)
      {
        Logger.e("StreamDecodeDataComponent", localThrowable);
        this.mStateRunner.transfer(Integer.valueOf(9));
        callExceptionCallback(92, 67);
        AppMethodBeat.o(104491);
      }
      break;
      label1889: processAudioListeners(this.mReSampleBufferInfo, this.mDTSBufferInfo);
      continue;
      label1904: localThrowable.onPcm(this.mDTSBufferInfo, this.mDTSBufferInfo);
      continue;
      label1922: i1--;
      continue;
      label1928: n = 0;
      Logger.i("StreamDecodeDataComponent", axiliary("write data to audiotrack failed, but it's OK"));
      label1943: m = AudioUtil.getPlaybackHeadPositionSafely(this.mAudioTrack);
      while (true)
      {
        i1 = n;
        n = m;
        k = i2;
        m = i1;
        break label261;
        label1971: n = 1;
        if (m != this.mFloatBufferInfo.bufferSize)
          Logger.w("StreamDecodeDataComponent", axiliary("mAudioTrack write float not equal: " + m + ", expect: " + this.mFloatBufferInfo.bufferSize));
        j += this.mFloatBufferInfo.bufferSize * 2;
        break label1943;
        label2046: m = this.mAudioTrack.write(this.mDTSBufferInfo.byteBuffer, 0, this.mDTSBufferInfo.bufferSize);
        if (m < 0)
        {
          if (this.mAudioTrack.getPlayState() == 3)
          {
            Logger.e("StreamDecodeDataComponent", axiliary("mAudioTrack write bytes failed: " + m + ", expect: " + this.mDTSBufferInfo.bufferSize));
            this.mStateRunner.transfer(Integer.valueOf(9));
            callExceptionCallback(92, 102);
            AppMethodBeat.o(104491);
            break;
          }
          n = 0;
          Logger.i("StreamDecodeDataComponent", axiliary("write data to audiotrack failed, but it's OK"));
          break label1943;
        }
        n = 1;
        if (m != this.mDTSBufferInfo.bufferSize)
          Logger.w("StreamDecodeDataComponent", axiliary("mAudioTrack write bytes not equal: " + m + ", expect: " + this.mDTSBufferInfo.bufferSize));
        j += this.mDTSBufferInfo.bufferSize;
        break label1943;
        label2250: this.mHandleDecodeDataCallback.onPullDecodeDataEndOrFailed(i2, 92);
        label2263: k = i2;
        break label261;
        label2270: AppMethodBeat.o(104491);
        break;
        label2279: i1 = m;
        m = n;
        n = i1;
      }
      label2294: i1 = 0;
      continue;
      label2300: continue;
      label2303: continue;
      i2 = k;
    }
  }

  void pause()
  {
    AppMethodBeat.i(104490);
    super.pause();
    if ((this.mAudioTrack != null) && (this.mAudioTrack.getState() == 1) && (this.mAudioTrack.getPlayState() != 2));
    while (true)
    {
      try
      {
        this.mAudioTrack.pause();
        AppMethodBeat.o(104490);
        return;
      }
      catch (IllegalStateException localIllegalStateException)
      {
      }
      AppMethodBeat.o(104490);
    }
  }

  void play()
  {
    AppMethodBeat.i(104489);
    super.play();
    if ((this.mAudioTrack != null) && (this.mAudioTrack.getState() == 1) && (this.mAudioTrack.getPlayState() != 3));
    while (true)
    {
      try
      {
        this.mAudioTrack.play();
        AppMethodBeat.o(104489);
        return;
      }
      catch (IllegalStateException localIllegalStateException)
      {
      }
      AppMethodBeat.o(104489);
    }
  }

  void release()
  {
    AppMethodBeat.i(104499);
    super.release();
    this.mCurrentFrameCount = 0L;
    AppMethodBeat.o(104499);
  }

  void seek(int paramInt)
  {
    AppMethodBeat.i(104498);
    addSeekRecord(paramInt);
    refreshTimeAndNotify(paramInt);
    AppMethodBeat.o(104498);
  }

  void setAudioStreamType(int paramInt)
  {
    AppMethodBeat.i(104496);
    if (paramInt == this.mAudioStreamType)
      AppMethodBeat.o(104496);
    while (true)
    {
      return;
      try
      {
        this.mAudioStreamType = paramInt;
        if (this.mAudioTrack != null)
        {
          AudioTrack localAudioTrack = new android/media/AudioTrack;
          localAudioTrack.<init>(paramInt, this.mAudioTrack.getSampleRate(), this.mAudioTrack.getChannelConfiguration(), this.mAudioTrack.getAudioFormat(), this.mTrackBufferSizeInByte, 1);
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("[setAudioStreamType] new AudioTrack, sampleRate: ");
          Logger.i("StreamDecodeDataComponent", axiliary(this.mAudioTrack.getSampleRate() + ", channels: " + this.mAudioTrack.getChannelConfiguration() + ", bitDepth: " + this.mAudioTrack.getAudioFormat() + ", buffer: " + this.mTrackBufferSizeInByte));
          int i = this.mAudioTrack.getPlayState();
          if (i == 3)
            pause();
          this.mAudioTrack.release();
          this.mAudioTrack = localAudioTrack;
          this.mStateRunner.setAudioTrack(this.mAudioTrack);
          if (i == 3)
            play();
        }
        AppMethodBeat.o(104496);
      }
      catch (IllegalStateException localIllegalStateException)
      {
        Logger.e("StreamDecodeDataComponent", "failed in setting audio stream type to :".concat(String.valueOf(paramInt)), localIllegalStateException);
        AppMethodBeat.o(104496);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        label206: break label206;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.StreamDecodeDataComponent
 * JD-Core Version:    0.6.2
 */