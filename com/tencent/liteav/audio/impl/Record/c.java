package com.tencent.liteav.audio.impl.Record;

import android.content.Context;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.audio.d;
import com.tencent.liteav.basic.a.a;
import com.tencent.liteav.basic.log.TXCLog;
import java.lang.ref.WeakReference;

public abstract class c
{
  private static final String TAG = "AudioCenter:" + c.class.getSimpleName();
  protected int mAECType = TXEAudioDef.TXE_AEC_NONE;
  protected int mBits = a.h;
  protected int mChannels = a.f;
  protected Context mContext;
  protected boolean mEnableHWEncoder = false;
  protected boolean mIsCustomRecord = false;
  protected boolean mIsEarphoneOn = false;
  protected boolean mIsMute = false;
  protected int mNSMode = -1;
  protected int mReverbType = TXEAudioDef.TXE_REVERB_TYPE_0;
  protected int mSampleRate = a.e;
  protected int mVoiceEnvironment = -1;
  protected int mVoiceKind = -1;
  protected float mVolume = 1.0F;
  protected WeakReference<d> mWeakRecordListener;

  public void enableHWEncoder(boolean paramBoolean)
  {
    TXCLog.i(TAG, "enableHWEncoder: ".concat(String.valueOf(paramBoolean)));
    this.mEnableHWEncoder = paramBoolean;
  }

  public d getListener()
  {
    try
    {
      if (this.mWeakRecordListener != null)
      {
        locald = (d)this.mWeakRecordListener.get();
        return locald;
      }
      d locald = null;
    }
    finally
    {
    }
  }

  public abstract boolean isRecording();

  public abstract void sendCustomPCMData(byte[] paramArrayOfByte);

  public void setAECType(int paramInt)
  {
    TXCLog.i(TAG, "setAECType: ".concat(String.valueOf(paramInt)));
    this.mAECType = paramInt;
  }

  public void setChangerType(int paramInt1, int paramInt2)
  {
    TXCLog.i(TAG, "setChangerType: " + paramInt1 + " " + paramInt2);
    this.mVoiceKind = paramInt1;
    this.mVoiceEnvironment = paramInt2;
  }

  public void setChannels(int paramInt)
  {
    TXCLog.i(TAG, "setChannels: ".concat(String.valueOf(paramInt)));
    this.mChannels = paramInt;
  }

  public void setEarphoneOn(boolean paramBoolean)
  {
    TXCLog.i(TAG, "setEarphoneOn: ".concat(String.valueOf(paramBoolean)));
    this.mIsEarphoneOn = paramBoolean;
  }

  public void setIsCustomRecord(boolean paramBoolean)
  {
    TXCLog.i(TAG, "setIsCustomRecord: ".concat(String.valueOf(paramBoolean)));
    this.mIsCustomRecord = paramBoolean;
  }

  public void setListener(d paramd)
  {
    try
    {
      TXCLog.i(TAG, "setListener:".concat(String.valueOf(paramd)));
      if (paramd == null);
      WeakReference localWeakReference;
      for (this.mWeakRecordListener = null; ; this.mWeakRecordListener = localWeakReference)
      {
        return;
        localWeakReference = new java/lang/ref/WeakReference;
        localWeakReference.<init>(paramd);
      }
    }
    finally
    {
    }
    throw paramd;
  }

  public void setMute(boolean paramBoolean)
  {
    TXCLog.i(TAG, "setMute: ".concat(String.valueOf(paramBoolean)));
    this.mIsMute = paramBoolean;
  }

  public void setNoiseSuppression(int paramInt)
  {
    TXCLog.i(TAG, "setNoiseSuppression: ".concat(String.valueOf(paramInt)));
    this.mNSMode = paramInt;
  }

  public void setReverbParam(int paramInt, float paramFloat)
  {
  }

  public void setReverbType(int paramInt)
  {
    TXCLog.i(TAG, "setReverbType: ".concat(String.valueOf(paramInt)));
    this.mReverbType = paramInt;
  }

  public void setSamplerate(int paramInt)
  {
    TXCLog.i(TAG, "setSampleRate: ".concat(String.valueOf(paramInt)));
    this.mSampleRate = paramInt;
  }

  public void setVolume(float paramFloat)
  {
    if (paramFloat <= 0.2F)
      TXCLog.w(TAG, "setVolume, warning volume too low : ".concat(String.valueOf(paramFloat)));
    float f = paramFloat;
    if (paramFloat < 0.0F)
      f = 0.0F;
    this.mVolume = f;
  }

  public int startRecord(Context paramContext)
  {
    if (paramContext != null)
      this.mContext = paramContext.getApplicationContext();
    return 0;
  }

  public abstract int stopRecord();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.Record.c
 * JD-Core Version:    0.6.2
 */