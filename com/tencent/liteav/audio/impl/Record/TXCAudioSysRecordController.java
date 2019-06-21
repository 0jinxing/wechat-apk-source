package com.tencent.liteav.audio.impl.Record;

import android.content.Context;
import android.os.Build;
import com.tencent.liteav.audio.TXCLiveBGMPlayer;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TXCAudioSysRecordController extends c
  implements h, com.tencent.liteav.audio.impl.d
{
  private static final String TAG;
  private byte[] mBuf;
  private d mCustomRecord;
  private long mEffectorObj;
  private e mHWEcoder;
  private long mLastPTS;
  private boolean mNeedMix;
  private int mPosition;
  private int mRecordSampleRate;
  private long mSoftEncObj;

  static
  {
    AppMethodBeat.i(66704);
    com.tencent.liteav.basic.util.b.e();
    TAG = "AudioCenter:" + TXCAudioSysRecordController.class.getSimpleName();
    AppMethodBeat.o(66704);
  }

  public TXCAudioSysRecordController()
  {
    AppMethodBeat.i(66682);
    this.mEffectorObj = 0L;
    this.mSoftEncObj = 0L;
    this.mRecordSampleRate = com.tencent.liteav.basic.a.a.e;
    this.mHWEcoder = null;
    this.mBuf = null;
    this.mPosition = 0;
    this.mLastPTS = 0L;
    this.mNeedMix = false;
    this.mCustomRecord = null;
    com.tencent.liteav.audio.impl.a.a().a(this);
    AppMethodBeat.o(66682);
  }

  private void doHWEncode(byte[] paramArrayOfByte, long paramLong)
  {
    AppMethodBeat.i(66700);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0) || (this.mBuf == null) || (this.mHWEcoder == null))
    {
      TXCLog.e(TAG, "doHWEncode failed! data = " + paramArrayOfByte + ", buf = " + this.mBuf + ", encoder = " + this.mHWEcoder);
      AppMethodBeat.o(66700);
    }
    while (true)
    {
      return;
      int i = this.mBuf.length - this.mPosition;
      int j = i;
      if (i > paramArrayOfByte.length)
        j = paramArrayOfByte.length;
      System.arraycopy(paramArrayOfByte, 0, this.mBuf, this.mPosition, j);
      this.mPosition = (j + this.mPosition);
      if (this.mPosition == this.mBuf.length)
      {
        this.mPosition = 0;
        this.mHWEcoder.a(this.mBuf, paramLong);
      }
      AppMethodBeat.o(66700);
    }
  }

  private String getProperty(String paramString)
  {
    AppMethodBeat.i(66684);
    try
    {
      Class localClass = Class.forName("android.os.SystemProperties");
      paramString = (String)localClass.getMethod("get", new Class[] { String.class, String.class }).invoke(localClass, new Object[] { paramString, "unknown" });
      AppMethodBeat.o(66684);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
        paramString = "unknown";
    }
  }

  private void initEffectAndEnc()
  {
    AppMethodBeat.i(66698);
    this.mEffectorObj = nativeCreateEffector(this.mSampleRate, this.mChannels, this.mBits);
    if (this.mSampleRate != this.mRecordSampleRate)
      nativeSetInputInfo(this.mEffectorObj, this.mRecordSampleRate, this.mChannels, this.mBits);
    if ((this.mIsEarphoneOn) || (this.mAECType == TXEAudioDef.TXE_AEC_SYSTEM));
    for (boolean bool = true; ; bool = false)
    {
      nativeSetReverbType(this.mEffectorObj, this.mReverbType);
      nativeMixBGM(this.mEffectorObj, bool);
      nativeSetNoiseSuppression(this.mEffectorObj, this.mNSMode);
      nativeSetChangerType(this.mEffectorObj, this.mVoiceKind, this.mVoiceEnvironment);
      Object localObject2;
      label228: StringBuilder localStringBuilder;
      if (this.mEnableHWEncoder)
      {
        this.mHWEcoder = new e();
        localObject1 = getListener();
        localObject2 = this.mHWEcoder;
        int i = TXEAudioDef.TXE_AUDIO_TYPE_AAC;
        int j = this.mSampleRate;
        int k = this.mChannels;
        int m = this.mBits;
        if (localObject1 != null)
        {
          localObject1 = new WeakReference(localObject1);
          ((e)localObject2).a(i, j, k, m, (WeakReference)localObject1);
          this.mBuf = new byte[this.mChannels * 1024 * this.mBits / 8];
          this.mPosition = 0;
          this.mLastPTS = 0L;
          localObject2 = TAG;
          localStringBuilder = new StringBuilder("初始化直播录制:录制模式 = ");
          if (this.mCustomRecord != null)
            break label374;
        }
      }
      label374: for (Object localObject1 = "麦克风录制"; ; localObject1 = "用户自定义录制")
      {
        TXCLog.i((String)localObject2, (String)localObject1 + ", 录制采样率 = " + this.mRecordSampleRate + ", 输出采样率 = " + this.mSampleRate + ", 是否混音 = " + bool + ", 混响模式 = " + this.mReverbType + ", 是否启动硬编码 = " + this.mEnableHWEncoder + ", 噪声抑制mode = " + this.mNSMode);
        AppMethodBeat.o(66698);
        return;
        localObject1 = null;
        break;
        this.mSoftEncObj = nativeCreateSoftEncoder(this.mSampleRate, this.mChannels, this.mBits);
        break label228;
      }
    }
  }

  private native void nativeAddEffect(long paramLong, byte[] paramArrayOfByte);

  private native void nativeAddEffectAndSoftEnc(long paramLong1, long paramLong2, byte[] paramArrayOfByte);

  private native long nativeCreateEffector(int paramInt1, int paramInt2, int paramInt3);

  private native long nativeCreateSoftEncoder(int paramInt1, int paramInt2, int paramInt3);

  private native void nativeDestorySoftEncoder(long paramLong);

  private native void nativeDestroyEffector(long paramLong);

  private native void nativeEnableEncoder(long paramLong, boolean paramBoolean);

  private native void nativeMixBGM(long paramLong, boolean paramBoolean);

  private native byte[] nativeReadOneEncFrame();

  private native byte[] nativeReadOneFrame(long paramLong, int paramInt);

  private native void nativeSetChangerType(long paramLong, int paramInt1, int paramInt2);

  private native void nativeSetInputInfo(long paramLong, int paramInt1, int paramInt2, int paramInt3);

  private native void nativeSetNoiseSuppression(long paramLong, int paramInt);

  private native void nativeSetReverbParam(long paramLong, int paramInt, float paramFloat);

  private native void nativeSetReverbType(long paramLong, int paramInt);

  private native void nativeSetVolume(long paramLong, float paramFloat);

  private void onRecordPcmData(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(66702);
    com.tencent.liteav.audio.d locald = getListener();
    if (locald != null)
      locald.a(paramArrayOfByte, TXCTimeUtil.getTimeTick(), this.mSampleRate, this.mChannels, this.mBits);
    AppMethodBeat.o(66702);
  }

  private void onRecordRawPcmData(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66701);
    com.tencent.liteav.audio.d locald = getListener();
    long l;
    int i;
    if (locald != null)
    {
      l = TXCTimeUtil.getTimeTick();
      i = this.mBits;
      if ((!TXCLiveBGMPlayer.getInstance().isRunning()) || (this.mNeedMix))
        break label70;
    }
    label70: for (boolean bool = true; ; bool = false)
    {
      locald.a(paramArrayOfByte, l, paramInt1, paramInt2, i, bool);
      AppMethodBeat.o(66701);
      return;
    }
  }

  private void uninitEffectAndEnc()
  {
    AppMethodBeat.i(66699);
    if (this.mEffectorObj != 0L)
    {
      nativeDestroyEffector(this.mEffectorObj);
      this.mEffectorObj = 0L;
    }
    if (this.mSoftEncObj != 0L)
    {
      nativeDestorySoftEncoder(this.mSoftEncObj);
      this.mSoftEncObj = 0L;
    }
    if (this.mHWEcoder != null)
    {
      this.mHWEcoder.a();
      this.mHWEcoder = null;
    }
    AppMethodBeat.o(66699);
  }

  public void OnHeadsetState(boolean paramBoolean)
  {
    AppMethodBeat.i(66703);
    setEarphoneOn(paramBoolean);
    AppMethodBeat.o(66703);
  }

  public boolean isRecording()
  {
    AppMethodBeat.i(66687);
    boolean bool;
    if (this.mCustomRecord != null)
    {
      bool = this.mCustomRecord.d();
      AppMethodBeat.o(66687);
    }
    while (true)
    {
      return bool;
      bool = f.a().c();
      AppMethodBeat.o(66687);
    }
  }

  public void onAudioRecordError(int paramInt, String paramString)
  {
    try
    {
      AppMethodBeat.i(66696);
      String str = TAG;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("sys audio record error: ");
      TXCLog.e(str, paramInt + ", " + paramString);
      f.a().a(null);
      uninitEffectAndEnc();
      if (this.mWeakRecordListener != null)
      {
        localObject = (com.tencent.liteav.audio.d)this.mWeakRecordListener.get();
        if (localObject != null)
          ((com.tencent.liteav.audio.d)localObject).a(paramInt, paramString);
      }
      AppMethodBeat.o(66696);
      return;
    }
    finally
    {
    }
    throw paramString;
  }

  public void onAudioRecordPCM(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    label258: label276: 
    while (true)
    {
      com.tencent.liteav.audio.d locald;
      try
      {
        AppMethodBeat.i(66697);
        if (this.mEffectorObj <= 0L)
          break label258;
        if (this.mIsMute)
          Arrays.fill(paramArrayOfByte, (byte)0);
        if (this.mLastPTS < paramLong)
          break label276;
        paramLong = this.mLastPTS + 2L;
        if (this.mHWEcoder != null)
        {
          nativeAddEffect(this.mEffectorObj, paramArrayOfByte);
          paramArrayOfByte = nativeReadOneFrame(this.mEffectorObj, this.mChannels * 1024 * this.mBits / 8);
          if (paramArrayOfByte != null)
          {
            this.mLastPTS = paramLong;
            if (this.mHWEcoder != null)
              doHWEncode(paramArrayOfByte, paramLong);
          }
          else
          {
            paramLong += 1024000 / this.mSampleRate;
            if (paramArrayOfByte != null)
              continue;
            AppMethodBeat.o(66697);
            return;
          }
          locald = getListener();
          if (locald == null)
            continue;
          locald.b(paramArrayOfByte, paramLong, this.mSampleRate, this.mChannels, this.mBits);
          continue;
        }
      }
      finally
      {
      }
      nativeAddEffectAndSoftEnc(this.mEffectorObj, this.mSoftEncObj, paramArrayOfByte);
      while (true)
      {
        paramArrayOfByte = nativeReadOneEncFrame();
        if (paramArrayOfByte == null)
          break;
        this.mLastPTS = paramLong;
        locald = getListener();
        if (locald != null)
          locald.b(paramArrayOfByte, paramLong, this.mSampleRate, this.mChannels, this.mBits);
        paramLong += 1024000 / this.mSampleRate;
      }
      AppMethodBeat.o(66697);
      continue;
      TXCLog.e(TAG, "effectorObj is null");
      AppMethodBeat.o(66697);
    }
  }

  public void onAudioRecordStart()
  {
    try
    {
      AppMethodBeat.i(66694);
      TXCLog.i(TAG, "sys audio record start");
      uninitEffectAndEnc();
      initEffectAndEnc();
      AppMethodBeat.o(66694);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void onAudioRecordStop()
  {
    try
    {
      AppMethodBeat.i(66695);
      TXCLog.i(TAG, "sys audio record stop");
      f.a().a(null);
      uninitEffectAndEnc();
      AppMethodBeat.o(66695);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void sendCustomPCMData(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(66686);
    if (this.mCustomRecord != null)
      this.mCustomRecord.a(paramArrayOfByte);
    AppMethodBeat.o(66686);
  }

  public void setChangerType(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66693);
    super.setChangerType(paramInt1, paramInt2);
    if (this.mEffectorObj != 0L)
      nativeSetChangerType(this.mEffectorObj, paramInt1, paramInt2);
    AppMethodBeat.o(66693);
  }

  public void setEarphoneOn(boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(66688);
      super.setEarphoneOn(paramBoolean);
      if (this.mEffectorObj > 0L)
        if ((!paramBoolean) && (this.mAECType != TXEAudioDef.TXE_AEC_SYSTEM))
          break label62;
      label62: for (this.mNeedMix = true; ; this.mNeedMix = false)
      {
        nativeMixBGM(this.mEffectorObj, this.mNeedMix);
        AppMethodBeat.o(66688);
        return;
      }
    }
    finally
    {
    }
  }

  public void setNoiseSuppression(int paramInt)
  {
    try
    {
      AppMethodBeat.i(66690);
      super.setNoiseSuppression(paramInt);
      if (this.mEffectorObj > 0L)
        nativeSetNoiseSuppression(this.mEffectorObj, paramInt);
      AppMethodBeat.o(66690);
      return;
    }
    finally
    {
    }
  }

  public void setReverbParam(int paramInt, float paramFloat)
  {
    try
    {
      AppMethodBeat.i(66692);
      super.setReverbParam(paramInt, paramFloat);
      if (this.mEffectorObj != 0L)
        nativeSetReverbParam(this.mEffectorObj, paramInt, paramFloat);
      AppMethodBeat.o(66692);
      return;
    }
    finally
    {
    }
  }

  public void setReverbType(int paramInt)
  {
    try
    {
      AppMethodBeat.i(66689);
      super.setReverbType(paramInt);
      if (this.mEffectorObj > 0L)
        nativeSetReverbType(this.mEffectorObj, paramInt);
      AppMethodBeat.o(66689);
      return;
    }
    finally
    {
    }
  }

  public void setVolume(float paramFloat)
  {
    AppMethodBeat.i(66691);
    super.setVolume(paramFloat);
    if (this.mEffectorObj != 0L)
      nativeSetVolume(this.mEffectorObj, paramFloat);
    AppMethodBeat.o(66691);
  }

  public int startRecord(Context paramContext)
  {
    AppMethodBeat.i(66683);
    TXCLog.i(TAG, "startRecord");
    super.startRecord(paramContext);
    if (!this.mIsCustomRecord)
      if (this.mAECType == TXEAudioDef.TXE_AEC_SYSTEM)
        if (this.mSampleRate > com.tencent.liteav.basic.f.b.a().h())
        {
          this.mRecordSampleRate = com.tencent.liteav.basic.f.b.a().i();
          if (this.mRecordSampleRate == 0)
            this.mRecordSampleRate = 16000;
          label75: f.a().a(this);
          f.a().a(this.mContext, this.mRecordSampleRate, this.mChannels, this.mBits, this.mAECType);
          label108: if ((this.mWeakRecordListener != null) && (this.mWeakRecordListener.get() != null))
            if (this.mAECType != TXEAudioDef.TXE_AEC_SYSTEM)
              break label430;
        }
    label430: for (paramContext = "SYSTEM-AEC,"; ; paramContext = "NO-AEC,")
    {
      paramContext = paramContext + "采样率(" + this.mRecordSampleRate + "|" + this.mSampleRate + "),声道数" + this.mChannels;
      ((com.tencent.liteav.audio.d)this.mWeakRecordListener.get()).a(TXEAudioDef.TXE_AUDIO_NOTIFY_AUDIO_INFO, paramContext);
      AppMethodBeat.o(66683);
      return 0;
      this.mRecordSampleRate = com.tencent.liteav.basic.f.b.a().h();
      break;
      this.mRecordSampleRate = this.mSampleRate;
      if (!Build.MANUFACTURER.equalsIgnoreCase("HUAWEI"))
        break label75;
      paramContext = getProperty("ro.board.platform");
      String str = getProperty("ro.build.version.emui");
      if (((!paramContext.equalsIgnoreCase("hi3650")) || (!str.equalsIgnoreCase("EmotionUI_8.0.0"))) && ((!paramContext.equalsIgnoreCase("kirin970")) || (!str.equalsIgnoreCase("EmotionUI_8.1.0"))) && ((!paramContext.equalsIgnoreCase("kirin970")) || (!str.equalsIgnoreCase("EmotionUI_8.2.0"))))
        break label75;
      TXCLog.e(TAG, "Force record sample rate 16000, HUAWEI-" + paramContext + "-" + str);
      this.mRecordSampleRate = 16000;
      break label75;
      setNoiseSuppression(-1);
      this.mRecordSampleRate = this.mSampleRate;
      this.mCustomRecord = new d();
      this.mCustomRecord.a(this);
      this.mCustomRecord.a(this.mContext, this.mRecordSampleRate, this.mChannels, this.mBits);
      break label108;
    }
  }

  public int stopRecord()
  {
    AppMethodBeat.i(66685);
    TXCLog.i(TAG, "stopRecord");
    if (this.mCustomRecord != null)
    {
      this.mCustomRecord.c();
      this.mCustomRecord = null;
    }
    f.a().b();
    com.tencent.liteav.audio.impl.a.a().b(this);
    this.mNeedMix = false;
    AppMethodBeat.o(66685);
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.Record.TXCAudioSysRecordController
 * JD-Core Version:    0.6.2
 */