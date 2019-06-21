package com.tencent.liteav.audio;

import android.content.Context;
import com.tencent.liteav.audio.impl.Record.f;
import com.tencent.liteav.audio.impl.Record.h;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public class TXCAudioUGCRecorder
  implements h
{
  private static final String TAG = "AudioCenter:TXCAudioUGCRecorder";
  static TXCAudioUGCRecorder instance;
  protected int mAECType = TXEAudioDef.TXE_AEC_NONE;
  private com.tencent.liteav.audio.impl.Record.a mBGMRecorder = null;
  protected int mBits = com.tencent.liteav.basic.a.a.h;
  protected int mChannels = com.tencent.liteav.basic.a.a.f;
  protected Context mContext;
  private boolean mCurBGMRecordFlag = false;
  private long mEffectorObj = 0L;
  private boolean mEnableBGMRecord = false;
  protected boolean mIsEarphoneOn = false;
  protected boolean mIsMute = false;
  private boolean mIsPause = false;
  private long mLastPTS = 0L;
  protected int mReverbType = TXEAudioDef.TXE_REVERB_TYPE_0;
  protected int mSampleRate = com.tencent.liteav.basic.a.a.e;
  private float mSpeedRate = 1.0F;
  private int mVoiceEnvironment = -1;
  private int mVoiceKind = -1;
  private float mVolume = 1.0F;
  private WeakReference<d> mWeakRecordListener;

  static
  {
    AppMethodBeat.i(66500);
    b.e();
    instance = new TXCAudioUGCRecorder();
    AppMethodBeat.o(66500);
  }

  public static TXCAudioUGCRecorder getInstance()
  {
    return instance;
  }

  private void initEffector()
  {
    try
    {
      AppMethodBeat.i(66497);
      uninitEffector();
      this.mEffectorObj = nativeCreateEffector(this.mSampleRate, this.mChannels, this.mBits);
      boolean bool = false;
      if ((this.mIsEarphoneOn) || (this.mAECType == TXEAudioDef.TXE_AEC_SYSTEM))
        bool = true;
      nativeSetReverbType(this.mEffectorObj, this.mReverbType);
      nativeSetChangerType(this.mEffectorObj, this.mVoiceKind, this.mVoiceEnvironment);
      nativeMixBGM(this.mEffectorObj, bool);
      nativeSetVolume(this.mEffectorObj, this.mVolume);
      nativeSetSpeedRate(this.mEffectorObj, this.mSpeedRate);
      nativeEnableEncoder(this.mEffectorObj, true);
      this.mLastPTS = 0L;
      AppMethodBeat.o(66497);
      return;
    }
    finally
    {
    }
  }

  private native void nativeClearCache(long paramLong);

  private native long nativeCreateEffector(int paramInt1, int paramInt2, int paramInt3);

  private native void nativeDestroyEffector(long paramLong);

  private native void nativeEnableEncoder(long paramLong, boolean paramBoolean);

  private native long nativeGetPcmCacheLen(long paramLong);

  private native void nativeMixBGM(long paramLong, boolean paramBoolean);

  private native void nativeProcess(long paramLong, byte[] paramArrayOfByte, int paramInt);

  private native byte[] nativeReadOneFrame(long paramLong);

  private native void nativeSetChangerType(long paramLong, int paramInt1, int paramInt2);

  private native void nativeSetReverbType(long paramLong, int paramInt);

  private native void nativeSetSpeedRate(long paramLong, float paramFloat);

  private native void nativeSetVolume(long paramLong, float paramFloat);

  private void uninitEffector()
  {
    try
    {
      AppMethodBeat.i(66498);
      if (this.mEffectorObj > 0L)
      {
        nativeDestroyEffector(this.mEffectorObj);
        this.mEffectorObj = 0L;
      }
      AppMethodBeat.o(66498);
      return;
    }
    finally
    {
    }
  }

  public void clearCache()
  {
    try
    {
      AppMethodBeat.i(66492);
      TXCLog.i("AudioCenter:TXCAudioUGCRecorder", "clearCache");
      if (this.mEffectorObj <= 0L)
        AppMethodBeat.o(66492);
      while (true)
      {
        return;
        nativeClearCache(this.mEffectorObj);
        AppMethodBeat.o(66492);
      }
    }
    finally
    {
    }
  }

  public void enableBGMRecord(boolean paramBoolean)
  {
    AppMethodBeat.i(66486);
    TXCLog.i("AudioCenter:TXCAudioUGCRecorder", "enableBGMRecord: ".concat(String.valueOf(paramBoolean)));
    this.mEnableBGMRecord = paramBoolean;
    AppMethodBeat.o(66486);
  }

  public int getChannels()
  {
    return this.mChannels;
  }

  public d getListener()
  {
    try
    {
      AppMethodBeat.i(66480);
      d locald;
      if (this.mWeakRecordListener != null)
      {
        locald = (d)this.mWeakRecordListener.get();
        AppMethodBeat.o(66480);
      }
      while (true)
      {
        return locald;
        locald = null;
        AppMethodBeat.o(66480);
      }
    }
    finally
    {
    }
  }

  public long getPcmCacheLen()
  {
    long l = 0L;
    try
    {
      AppMethodBeat.i(66489);
      if (this.mEffectorObj <= 0L)
        AppMethodBeat.o(66489);
      while (true)
      {
        return l;
        l = nativeGetPcmCacheLen(this.mEffectorObj);
        AppMethodBeat.o(66489);
      }
    }
    finally
    {
    }
  }

  public int getSampleRate()
  {
    return this.mSampleRate;
  }

  public boolean isRecording()
  {
    AppMethodBeat.i(66488);
    boolean bool;
    if (this.mBGMRecorder != null)
    {
      bool = this.mBGMRecorder.b();
      AppMethodBeat.o(66488);
    }
    while (true)
    {
      return bool;
      bool = f.a().c();
      AppMethodBeat.o(66488);
    }
  }

  public void onAudioRecordError(int paramInt, String paramString)
  {
    AppMethodBeat.i(66495);
    TXCLog.e("AudioCenter:TXCAudioUGCRecorder", "sys audio record error: " + paramInt + ", " + paramString);
    f.a().a(null);
    d locald = getListener();
    if (locald != null)
      locald.a(paramInt, paramString);
    AppMethodBeat.o(66495);
  }

  // ERROR //
  public void onAudioRecordPCM(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    // Byte code:
    //   0: ldc_w 261
    //   3: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 111	com/tencent/liteav/audio/TXCAudioUGCRecorder:mIsPause	Z
    //   10: ifeq +10 -> 20
    //   13: ldc_w 261
    //   16: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: return
    //   20: aload_0
    //   21: getfield 97	com/tencent/liteav/audio/TXCAudioUGCRecorder:mEffectorObj	J
    //   24: lconst_0
    //   25: lcmp
    //   26: ifle +177 -> 203
    //   29: aload_0
    //   30: getfield 88	com/tencent/liteav/audio/TXCAudioUGCRecorder:mIsMute	Z
    //   33: ifeq +8 -> 41
    //   36: aload_1
    //   37: iconst_0
    //   38: invokestatic 267	java/util/Arrays:fill	([BB)V
    //   41: lload_3
    //   42: lstore 5
    //   44: aload_0
    //   45: getfield 99	com/tencent/liteav/audio/TXCAudioUGCRecorder:mLastPTS	J
    //   48: lload_3
    //   49: lcmp
    //   50: iflt +13 -> 63
    //   53: aload_0
    //   54: getfield 99	com/tencent/liteav/audio/TXCAudioUGCRecorder:mLastPTS	J
    //   57: ldc2_w 268
    //   60: ladd
    //   61: lstore 5
    //   63: aload_0
    //   64: monitorenter
    //   65: aload_0
    //   66: aload_0
    //   67: getfield 97	com/tencent/liteav/audio/TXCAudioUGCRecorder:mEffectorObj	J
    //   70: aload_1
    //   71: iload_2
    //   72: invokespecial 271	com/tencent/liteav/audio/TXCAudioUGCRecorder:nativeProcess	(J[BI)V
    //   75: aload_0
    //   76: monitorexit
    //   77: lload 5
    //   79: lstore_3
    //   80: aload_0
    //   81: monitorenter
    //   82: aload_0
    //   83: aload_0
    //   84: getfield 97	com/tencent/liteav/audio/TXCAudioUGCRecorder:mEffectorObj	J
    //   87: invokespecial 273	com/tencent/liteav/audio/TXCAudioUGCRecorder:nativeReadOneFrame	(J)[B
    //   90: astore 7
    //   92: aload_0
    //   93: monitorexit
    //   94: aload 7
    //   96: ifnull +38 -> 134
    //   99: aload_0
    //   100: lload_3
    //   101: putfield 99	com/tencent/liteav/audio/TXCAudioUGCRecorder:mLastPTS	J
    //   104: aload_0
    //   105: invokevirtual 256	com/tencent/liteav/audio/TXCAudioUGCRecorder:getListener	()Lcom/tencent/liteav/audio/d;
    //   108: astore_1
    //   109: aload_1
    //   110: ifnull +24 -> 134
    //   113: aload_1
    //   114: aload 7
    //   116: lload_3
    //   117: aload_0
    //   118: getfield 69	com/tencent/liteav/audio/TXCAudioUGCRecorder:mSampleRate	I
    //   121: aload_0
    //   122: getfield 74	com/tencent/liteav/audio/TXCAudioUGCRecorder:mChannels	I
    //   125: aload_0
    //   126: getfield 79	com/tencent/liteav/audio/TXCAudioUGCRecorder:mBits	I
    //   129: invokeinterface 276 7 0
    //   134: aload_0
    //   135: monitorenter
    //   136: lload_3
    //   137: ldc_w 277
    //   140: aload_0
    //   141: getfield 69	com/tencent/liteav/audio/TXCAudioUGCRecorder:mSampleRate	I
    //   144: i2f
    //   145: fdiv
    //   146: aload_0
    //   147: getfield 109	com/tencent/liteav/audio/TXCAudioUGCRecorder:mSpeedRate	F
    //   150: fmul
    //   151: f2l
    //   152: ladd
    //   153: lstore_3
    //   154: aload_0
    //   155: monitorexit
    //   156: aload 7
    //   158: ifnonnull -78 -> 80
    //   161: ldc_w 261
    //   164: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   167: goto -148 -> 19
    //   170: astore_1
    //   171: aload_0
    //   172: monitorexit
    //   173: ldc_w 261
    //   176: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   179: aload_1
    //   180: athrow
    //   181: astore_1
    //   182: aload_0
    //   183: monitorexit
    //   184: ldc_w 261
    //   187: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   190: aload_1
    //   191: athrow
    //   192: astore_1
    //   193: aload_0
    //   194: monitorexit
    //   195: ldc_w 261
    //   198: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   201: aload_1
    //   202: athrow
    //   203: ldc 10
    //   205: ldc_w 279
    //   208: invokestatic 251	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   211: ldc_w 261
    //   214: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   217: goto -198 -> 19
    //
    // Exception table:
    //   from	to	target	type
    //   65	77	170	finally
    //   171	173	170	finally
    //   82	94	181	finally
    //   182	184	181	finally
    //   136	156	192	finally
    //   193	195	192	finally
  }

  public void onAudioRecordStart()
  {
    AppMethodBeat.i(66493);
    TXCLog.i("AudioCenter:TXCAudioUGCRecorder", "sys audio record start");
    AppMethodBeat.o(66493);
  }

  public void onAudioRecordStop()
  {
    AppMethodBeat.i(66494);
    TXCLog.i("AudioCenter:TXCAudioUGCRecorder", "sys audio record stop");
    f.a().a(null);
    AppMethodBeat.o(66494);
  }

  public void pause()
  {
    AppMethodBeat.i(66477);
    TXCLog.i("AudioCenter:TXCAudioUGCRecorder", "pause");
    this.mIsPause = true;
    if ((!this.mEnableBGMRecord) && (isRecording()))
    {
      TXCLog.i("AudioCenter:TXCAudioUGCRecorder", "停止系统录音");
      f.a().b();
    }
    AppMethodBeat.o(66477);
  }

  public void resume()
  {
    AppMethodBeat.i(66478);
    TXCLog.i("AudioCenter:TXCAudioUGCRecorder", "resume");
    this.mIsPause = false;
    if ((!this.mEnableBGMRecord) && (!isRecording()))
    {
      TXCLog.i("AudioCenter:TXCAudioUGCRecorder", "恢复系统录音");
      this.mCurBGMRecordFlag = false;
      setEarphoneOn(false);
      f.a().a(this);
      f.a().a(this.mContext, this.mSampleRate, this.mChannels, this.mBits, this.mAECType);
    }
    AppMethodBeat.o(66478);
  }

  public void sendCustomPCMData(byte[] paramArrayOfByte)
  {
  }

  public void setAECType(int paramInt, Context paramContext)
  {
    AppMethodBeat.i(66484);
    TXCLog.i("AudioCenter:TXCAudioUGCRecorder", "setAECType: ".concat(String.valueOf(paramInt)));
    this.mAECType = paramInt;
    if (paramContext != null)
      this.mContext = paramContext.getApplicationContext();
    AppMethodBeat.o(66484);
  }

  public void setChangerType(int paramInt1, int paramInt2)
  {
    try
    {
      AppMethodBeat.i(66499);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("setChangerType: ");
      TXCLog.i("AudioCenter:TXCAudioUGCRecorder", paramInt1 + " " + paramInt2);
      this.mVoiceKind = paramInt1;
      this.mVoiceEnvironment = paramInt2;
      if (this.mEffectorObj <= 0L)
        AppMethodBeat.o(66499);
      while (true)
      {
        return;
        nativeSetChangerType(this.mEffectorObj, paramInt1, paramInt2);
        AppMethodBeat.o(66499);
      }
    }
    finally
    {
    }
  }

  public void setChannels(int paramInt)
  {
    AppMethodBeat.i(66481);
    TXCLog.i("AudioCenter:TXCAudioUGCRecorder", "setChannels: ".concat(String.valueOf(paramInt)));
    this.mChannels = paramInt;
    AppMethodBeat.o(66481);
  }

  public void setEarphoneOn(boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(66487);
      TXCLog.i("AudioCenter:TXCAudioUGCRecorder", "setEarphoneOn: ".concat(String.valueOf(paramBoolean)));
      this.mIsEarphoneOn = paramBoolean;
      if (this.mEffectorObj > 0L)
      {
        boolean bool = false;
        if (!paramBoolean)
        {
          paramBoolean = bool;
          if (this.mAECType != TXEAudioDef.TXE_AEC_SYSTEM);
        }
        else
        {
          paramBoolean = true;
        }
        nativeMixBGM(this.mEffectorObj, paramBoolean);
      }
      AppMethodBeat.o(66487);
      return;
    }
    finally
    {
    }
  }

  public void setListener(d paramd)
  {
    try
    {
      AppMethodBeat.i(66479);
      if (paramd == null)
      {
        this.mWeakRecordListener = null;
        AppMethodBeat.o(66479);
      }
      while (true)
      {
        return;
        WeakReference localWeakReference = new java/lang/ref/WeakReference;
        localWeakReference.<init>(paramd);
        this.mWeakRecordListener = localWeakReference;
        AppMethodBeat.o(66479);
      }
    }
    finally
    {
    }
    throw paramd;
  }

  public void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(66485);
    TXCLog.i("AudioCenter:TXCAudioUGCRecorder", "setMute: ".concat(String.valueOf(paramBoolean)));
    this.mIsMute = paramBoolean;
    AppMethodBeat.o(66485);
  }

  public void setReverbType(int paramInt)
  {
    try
    {
      AppMethodBeat.i(66483);
      TXCLog.i("AudioCenter:TXCAudioUGCRecorder", "setReverbType: ".concat(String.valueOf(paramInt)));
      this.mReverbType = paramInt;
      if (this.mEffectorObj > 0L)
        nativeSetReverbType(this.mEffectorObj, paramInt);
      AppMethodBeat.o(66483);
      return;
    }
    finally
    {
    }
  }

  public void setSampleRate(int paramInt)
  {
    AppMethodBeat.i(66482);
    TXCLog.i("AudioCenter:TXCAudioUGCRecorder", "setSampleRate: ".concat(String.valueOf(paramInt)));
    this.mSampleRate = paramInt;
    AppMethodBeat.o(66482);
  }

  public void setSpeedRate(float paramFloat)
  {
    try
    {
      AppMethodBeat.i(66491);
      TXCLog.i("AudioCenter:TXCAudioUGCRecorder", "setSpeedRate: ".concat(String.valueOf(paramFloat)));
      this.mSpeedRate = paramFloat;
      if (this.mEffectorObj <= 0L)
        AppMethodBeat.o(66491);
      while (true)
      {
        return;
        nativeSetSpeedRate(this.mEffectorObj, this.mSpeedRate);
        AppMethodBeat.o(66491);
      }
    }
    finally
    {
    }
  }

  public void setVolume(float paramFloat)
  {
    try
    {
      AppMethodBeat.i(66490);
      TXCLog.i("AudioCenter:TXCAudioUGCRecorder", "setVolume: ".concat(String.valueOf(paramFloat)));
      this.mVolume = paramFloat;
      if (this.mEffectorObj <= 0L)
        AppMethodBeat.o(66490);
      while (true)
      {
        return;
        nativeSetVolume(this.mEffectorObj, paramFloat);
        AppMethodBeat.o(66490);
      }
    }
    finally
    {
    }
  }

  public int startRecord(Context paramContext)
  {
    int i = 0;
    AppMethodBeat.i(66475);
    TXCLog.i("AudioCenter:TXCAudioUGCRecorder", "startRecord");
    boolean bool;
    if (isRecording())
    {
      if (this.mEnableBGMRecord == this.mCurBGMRecordFlag)
      {
        TXCLog.e("AudioCenter:TXCAudioUGCRecorder", "startRecord failed! recorder is still running!");
        i = -1;
        AppMethodBeat.o(66475);
        return i;
      }
      TXCLog.e("AudioCenter:TXCAudioUGCRecorder", "recorder is still running. will restart record! bgm record flag = " + this.mEnableBGMRecord);
      stopRecord();
      if (!this.mCurBGMRecordFlag)
      {
        bool = true;
        label91: enableBGMRecord(bool);
      }
    }
    else
    {
      if (paramContext != null)
        this.mContext = paramContext.getApplicationContext();
      initEffector();
      if (!this.mEnableBGMRecord)
        break label193;
      TXCLog.i("AudioCenter:TXCAudioUGCRecorder", "录制BGM");
      this.mCurBGMRecordFlag = true;
      this.mBGMRecorder = new com.tencent.liteav.audio.impl.Record.a();
      this.mBGMRecorder.a(this);
      setEarphoneOn(true);
      this.mBGMRecorder.a(this.mContext, this.mSampleRate, this.mChannels, this.mBits);
    }
    while (true)
    {
      AppMethodBeat.o(66475);
      break;
      bool = false;
      break label91;
      label193: TXCLog.i("AudioCenter:TXCAudioUGCRecorder", "录制人声");
      this.mCurBGMRecordFlag = false;
      setEarphoneOn(false);
      f.a().a(this);
      f.a().a(this.mContext, this.mSampleRate, this.mChannels, this.mBits, this.mAECType);
    }
  }

  public int stopRecord()
  {
    AppMethodBeat.i(66476);
    TXCLog.i("AudioCenter:TXCAudioUGCRecorder", "stopRecord");
    if (this.mBGMRecorder != null)
    {
      this.mBGMRecorder.a();
      this.mBGMRecorder = null;
    }
    f.a().b();
    enableBGMRecord(false);
    this.mIsPause = false;
    uninitEffector();
    AppMethodBeat.o(66476);
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.TXCAudioUGCRecorder
 * JD-Core Version:    0.6.2
 */