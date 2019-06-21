package com.tencent.qqmusic.mediaplayer;

import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener;
import com.tencent.qqmusic.mediaplayer.codec.BaseDecoder;
import com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer;
import com.tencent.qqmusic.mediaplayer.perf.PrefInfoCollector;
import com.tencent.qqmusic.mediaplayer.seektable.NativeSeekTable;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.util.concurrent.atomic.AtomicInteger;

class CorePlayer
  implements BaseDecodeDataComponent.HandleDecodeDataCallback, Runnable
{
  private static final AtomicInteger PLAYER_ID_CREATOR;
  private static final String TAG = "CorePlayer";
  private final PlayerCallback mCallback;
  private IDataSource mDataSource;
  private final BaseDecoder mDecoder;
  private final Handler mEventHandler;
  protected AudioInformation mInformation;
  volatile boolean mIsExit;
  private INativeDataSource mNativeDataSource;
  private BaseDecodeDataComponent mPcmCompnent;
  private int mPlayerID;
  private int mPlayerMode;
  protected final PrefInfoCollector mPrefInfoCollector;
  private final PlayerStateRunner mStateRunner;
  private String mThreadName;
  private final PerformanceTracer performanceTracer;

  static
  {
    AppMethodBeat.i(104670);
    PLAYER_ID_CREATOR = new AtomicInteger(0);
    AppMethodBeat.o(104670);
  }

  CorePlayer(IDataSource paramIDataSource, INativeDataSource paramINativeDataSource, PlayerCallback paramPlayerCallback, Looper paramLooper, BaseDecoder paramBaseDecoder)
  {
    AppMethodBeat.i(104638);
    this.mStateRunner = new PlayerStateRunner(Integer.valueOf(0));
    this.mPlayerID = PLAYER_ID_CREATOR.addAndGet(1);
    this.mThreadName = "Unnamed";
    this.mPlayerMode = 0;
    this.mIsExit = false;
    this.performanceTracer = new PerformanceTracer();
    this.mPrefInfoCollector = PrefInfoCollector.getInstance();
    if ((paramIDataSource != null) && (paramINativeDataSource != null))
    {
      paramIDataSource = new IllegalArgumentException("you can't set IDataSource and INativeDataSource at the same time!");
      AppMethodBeat.o(104638);
      throw paramIDataSource;
    }
    if ((paramIDataSource == null) && (paramINativeDataSource == null))
    {
      paramIDataSource = new IllegalArgumentException("at least on data source is required!");
      AppMethodBeat.o(104638);
      throw paramIDataSource;
    }
    this.mEventHandler = new Handler(paramLooper);
    this.mDecoder = paramBaseDecoder;
    this.mDataSource = paramIDataSource;
    this.mNativeDataSource = paramINativeDataSource;
    this.mCallback = paramPlayerCallback;
    this.mStateRunner.transfer(Integer.valueOf(1));
    AppMethodBeat.o(104638);
  }

  private String axiliary(String paramString)
  {
    AppMethodBeat.i(104644);
    paramString = "ID: " + this.mPlayerID + ". " + paramString;
    AppMethodBeat.o(104644);
    return paramString;
  }

  private void callExceptionCallback(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(104642);
    callExceptionCallback(paramInt1, paramInt2, 0);
    AppMethodBeat.o(104642);
  }

  private void callExceptionCallback(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(104643);
    this.mCallback.playerException(this, paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(104643);
  }

  private void decodeEndOrFailed(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(104645);
    Logger.d("CorePlayer", axiliary("decodeEndOrFailed"));
    try
    {
      if (this.mPcmCompnent == null)
      {
        Logger.e("CorePlayer", axiliary("mPcmCompnent null! Exiting"));
        AppMethodBeat.o(104645);
      }
      while (true)
      {
        return;
        int i = paramInt1;
        if (this.mInformation != null)
        {
          Logger.i("CorePlayer", axiliary(String.format("current: %d, duration: %d, isExit: %b, decodeSucc: %b", new Object[] { Long.valueOf(this.mDecoder.getCurrentTime()), Long.valueOf(this.mInformation.getDuration()), Boolean.valueOf(this.mIsExit), Boolean.valueOf(this.mPcmCompnent.hasDecodeDataSuccess()) })));
          i = paramInt1 & this.mDecoder.getErrorCodeMask();
        }
        if ((this.mIsExit) || (!this.mPcmCompnent.hasDecodeDataSuccess()))
        {
          Logger.i("CorePlayer", axiliary("不留痕迹的退出 时机：解码时退出  step = 4"));
          exitNotCallback();
          this.mStateRunner.transfer(Integer.valueOf(9));
          callExceptionCallback(paramInt2, 67, i);
          AppMethodBeat.o(104645);
        }
        else if (getCurPositionByDecoder() < getDuration() - 5000L)
        {
          Logger.e("CorePlayer", axiliary("Decode failed! Exiting."));
          callExceptionCallback(paramInt2, 67, i);
          this.mStateRunner.transfer(Integer.valueOf(6));
          AppMethodBeat.o(104645);
        }
        else
        {
          if (paramInt2 == 92)
          {
            Logger.i("CorePlayer", axiliary("Decode ended! Exiting."));
            this.mStateRunner.transfer(Integer.valueOf(7));
          }
          AppMethodBeat.o(104645);
        }
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        Logger.e("CorePlayer", localThrowable);
        AppMethodBeat.o(104645);
      }
    }
  }

  private void exitNotCallback()
  {
    AppMethodBeat.i(104639);
    Logger.i("CorePlayer", axiliary("exitNotCallback"));
    this.mIsExit = true;
    AppMethodBeat.o(104639);
  }

  void addAudioListener(IAudioListener paramIAudioListener)
  {
    AppMethodBeat.i(104653);
    if (this.mPcmCompnent != null)
      this.mPcmCompnent.addAudioListener(paramIAudioListener);
    AppMethodBeat.o(104653);
  }

  void changePlayThreadPriorityImmediately()
  {
    AppMethodBeat.i(104640);
    Logger.d("CorePlayer", axiliary("changePlayThreadPriorityImmediately"));
    if (this.mPcmCompnent == null)
      AppMethodBeat.o(104640);
    while (true)
    {
      return;
      this.mPcmCompnent.changePlayThreadPriorityImmediately();
      AppMethodBeat.o(104640);
    }
  }

  SeekTable createSeekTable()
  {
    AppMethodBeat.i(104664);
    if (this.mDecoder == null)
    {
      localObject = new IllegalStateException("please setDataSource before creating seek table!");
      AppMethodBeat.o(104664);
      throw ((Throwable)localObject);
    }
    Object localObject = new NativeSeekTable(this.mDecoder);
    AppMethodBeat.o(104664);
    return localObject;
  }

  void flush()
  {
    AppMethodBeat.i(104661);
    if (this.mPcmCompnent != null)
      this.mPcmCompnent.flush();
    AppMethodBeat.o(104661);
  }

  long getCurPosition()
  {
    AppMethodBeat.i(104648);
    long l;
    if (this.mPcmCompnent == null)
    {
      l = 0L;
      AppMethodBeat.o(104648);
    }
    while (true)
    {
      return l;
      l = this.mPcmCompnent.getCurPosition();
      AppMethodBeat.o(104648);
    }
  }

  public long getCurPositionByDecoder()
  {
    AppMethodBeat.i(104666);
    try
    {
      l = this.mDecoder.getCurrentTime();
      AppMethodBeat.o(104666);
      return l;
    }
    catch (SoNotFindException localSoNotFindException)
    {
      while (true)
      {
        Logger.e("CorePlayer", localSoNotFindException);
        long l = 0L;
        AppMethodBeat.o(104666);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
        Logger.e("CorePlayer", "Strange Exception!", localThrowable);
    }
  }

  AudioInformation getCurrentAudioInformation()
  {
    return this.mInformation;
  }

  long getDuration()
  {
    AppMethodBeat.i(104646);
    if (this.mInformation != null);
    while (true)
    {
      try
      {
        l = this.mInformation.getDuration();
        AppMethodBeat.o(104646);
        return l;
      }
      catch (Throwable localThrowable)
      {
        Logger.e("CorePlayer", localThrowable);
      }
      long l = 0L;
      AppMethodBeat.o(104646);
    }
  }

  public long getMinPcmBufferSize()
  {
    AppMethodBeat.i(104667);
    long l = this.mDecoder.getMinBufferSize();
    AppMethodBeat.o(104667);
    return l;
  }

  int getPlayerMode()
  {
    return this.mPlayerMode;
  }

  int getPlayerState()
  {
    AppMethodBeat.i(104647);
    int i;
    if (this.mPcmCompnent == null)
    {
      i = 0;
      AppMethodBeat.o(104647);
    }
    while (true)
    {
      return i;
      i = this.mPcmCompnent.getPlayerState();
      AppMethodBeat.o(104647);
    }
  }

  int getSessionId()
  {
    AppMethodBeat.i(104652);
    int i;
    if (this.mPcmCompnent != null)
    {
      i = this.mPcmCompnent.getSessionId();
      AppMethodBeat.o(104652);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(104652);
    }
  }

  boolean hasDecodeData()
  {
    try
    {
      AppMethodBeat.i(104649);
      boolean bool;
      if (this.mPcmCompnent == null)
      {
        bool = false;
        AppMethodBeat.o(104649);
      }
      while (true)
      {
        return bool;
        bool = this.mPcmCompnent.hasDecodeData();
        AppMethodBeat.o(104649);
      }
    }
    finally
    {
    }
  }

  boolean hasDecodeDataSuccess()
  {
    try
    {
      AppMethodBeat.i(104650);
      boolean bool;
      if (this.mPcmCompnent == null)
      {
        bool = false;
        AppMethodBeat.o(104650);
      }
      while (true)
      {
        return bool;
        bool = this.mPcmCompnent.hasDecodeDataSuccess();
        AppMethodBeat.o(104650);
      }
    }
    finally
    {
    }
  }

  boolean isInit()
  {
    AppMethodBeat.i(104651);
    boolean bool;
    if (this.mPcmCompnent == null)
    {
      bool = false;
      AppMethodBeat.o(104651);
    }
    while (true)
    {
      return bool;
      bool = this.mPcmCompnent.isInit();
      AppMethodBeat.o(104651);
    }
  }

  public void onPullDecodeDataEndOrFailed(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(104669);
    decodeEndOrFailed(paramInt1, paramInt2);
    AppMethodBeat.o(104669);
  }

  void pause()
  {
    AppMethodBeat.i(104657);
    Logger.i("CorePlayer", axiliary("pause"));
    if (this.mPcmCompnent == null)
      AppMethodBeat.o(104657);
    while (true)
    {
      return;
      this.mPcmCompnent.pause();
      AppMethodBeat.o(104657);
    }
  }

  void play()
  {
    AppMethodBeat.i(104656);
    Logger.i("CorePlayer", axiliary("play"));
    if (this.mPcmCompnent == null)
      AppMethodBeat.o(104656);
    while (true)
    {
      return;
      this.mPcmCompnent.play();
      AppMethodBeat.o(104656);
    }
  }

  public void prepare()
  {
    AppMethodBeat.i(104655);
    Logger.i("CorePlayer", axiliary("prepare"));
    this.mStateRunner.transfer(Integer.valueOf(3));
    new Thread(this, "decoder-" + this.mThreadName).start();
    AppMethodBeat.o(104655);
  }

  public int pullDecodeData(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(104668);
    paramInt = this.mDecoder.decodeData(paramInt, paramArrayOfByte);
    AppMethodBeat.o(104668);
    return paramInt;
  }

  public void release()
  {
    AppMethodBeat.i(104659);
    Logger.i("CorePlayer", axiliary("release"));
    this.mEventHandler.removeCallbacksAndMessages(null);
    exitNotCallback();
    if (this.mPcmCompnent != null)
      this.mPcmCompnent.releaseNotify();
    this.mStateRunner.transfer(Integer.valueOf(8));
    AppMethodBeat.o(104659);
  }

  void removeAudioListener(IAudioListener paramIAudioListener)
  {
    AppMethodBeat.i(104654);
    if (this.mPcmCompnent != null)
      this.mPcmCompnent.removeAudioListener(paramIAudioListener);
    AppMethodBeat.o(104654);
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: ldc_w 365
    //   3: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 370	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil:startProcessInfoOutput	()V
    //   9: ldc 14
    //   11: aload_0
    //   12: new 137	java/lang/StringBuilder
    //   15: dup
    //   16: ldc_w 372
    //   19: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   22: invokestatic 376	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   25: invokevirtual 379	java/lang/Thread:getName	()Ljava/lang/String;
    //   28: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   34: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   37: invokestatic 225	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   40: aload_0
    //   41: getfield 128	com/tencent/qqmusic/mediaplayer/CorePlayer:mCallback	Lcom/tencent/qqmusic/mediaplayer/PlayerCallback;
    //   44: aload_0
    //   45: invokeinterface 383 2 0
    //   50: aload_0
    //   51: getfield 124	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   54: ifnull +305 -> 359
    //   57: aload_0
    //   58: getfield 122	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   61: aload_0
    //   62: getfield 124	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   65: invokevirtual 387	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:init	(Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;)I
    //   68: istore_1
    //   69: ldc 14
    //   71: aload_0
    //   72: ldc_w 389
    //   75: iload_1
    //   76: invokestatic 392	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   79: invokevirtual 395	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   82: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   85: invokestatic 225	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   88: iload_1
    //   89: bipush 247
    //   91: if_icmpne +625 -> 716
    //   94: ldc 14
    //   96: aload_0
    //   97: ldc_w 397
    //   100: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   103: invokestatic 186	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   106: aload_0
    //   107: getfield 77	com/tencent/qqmusic/mediaplayer/CorePlayer:mStateRunner	Lcom/tencent/qqmusic/mediaplayer/PlayerStateRunner;
    //   110: bipush 9
    //   112: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   115: invokevirtual 132	com/tencent/qqmusic/mediaplayer/PlayerStateRunner:transfer	(Ljava/lang/Integer;)Ljava/lang/Integer;
    //   118: pop
    //   119: aload_0
    //   120: bipush 91
    //   122: bipush 100
    //   124: invokespecial 399	com/tencent/qqmusic/mediaplayer/CorePlayer:callExceptionCallback	(II)V
    //   127: invokestatic 404	com/tencent/qqmusic/mediaplayer/PlayerConfigManager:getInstance	()Lcom/tencent/qqmusic/mediaplayer/PlayerConfigManager;
    //   130: aload_0
    //   131: invokevirtual 407	com/tencent/qqmusic/mediaplayer/PlayerConfigManager:setCommonPlayerRef	(Lcom/tencent/qqmusic/mediaplayer/CorePlayer;)V
    //   134: aload_0
    //   135: getfield 188	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   138: ifnull +87 -> 225
    //   141: aload_0
    //   142: getfield 91	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   145: ifne +80 -> 225
    //   148: aload_0
    //   149: getfield 181	com/tencent/qqmusic/mediaplayer/CorePlayer:mPcmCompnent	Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent;
    //   152: ifnonnull +73 -> 225
    //   155: aload_0
    //   156: getfield 188	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   159: invokevirtual 206	com/tencent/qqmusic/mediaplayer/AudioInformation:getDuration	()J
    //   162: ldc2_w 408
    //   165: lcmp
    //   166: iflt +11 -> 177
    //   169: aload_0
    //   170: getfield 89	com/tencent/qqmusic/mediaplayer/CorePlayer:mPlayerMode	I
    //   173: iconst_1
    //   174: if_icmpne +918 -> 1092
    //   177: aload_0
    //   178: getfield 89	com/tencent/qqmusic/mediaplayer/CorePlayer:mPlayerMode	I
    //   181: iconst_1
    //   182: if_icmpeq +8 -> 190
    //   185: aload_0
    //   186: iconst_1
    //   187: putfield 89	com/tencent/qqmusic/mediaplayer/CorePlayer:mPlayerMode	I
    //   190: new 411	com/tencent/qqmusic/mediaplayer/StaticDecodeDataComponent
    //   193: astore_2
    //   194: aload_2
    //   195: aload_0
    //   196: aload_0
    //   197: getfield 77	com/tencent/qqmusic/mediaplayer/CorePlayer:mStateRunner	Lcom/tencent/qqmusic/mediaplayer/PlayerStateRunner;
    //   200: aload_0
    //   201: getfield 188	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   204: aload_0
    //   205: getfield 128	com/tencent/qqmusic/mediaplayer/CorePlayer:mCallback	Lcom/tencent/qqmusic/mediaplayer/PlayerCallback;
    //   208: aload_0
    //   209: aload_0
    //   210: getfield 120	com/tencent/qqmusic/mediaplayer/CorePlayer:mEventHandler	Landroid/os/Handler;
    //   213: aload_0
    //   214: getfield 83	com/tencent/qqmusic/mediaplayer/CorePlayer:mPlayerID	I
    //   217: invokespecial 414	com/tencent/qqmusic/mediaplayer/StaticDecodeDataComponent:<init>	(Lcom/tencent/qqmusic/mediaplayer/CorePlayer;Lcom/tencent/qqmusic/mediaplayer/PlayerStateRunner;Lcom/tencent/qqmusic/mediaplayer/AudioInformation;Lcom/tencent/qqmusic/mediaplayer/PlayerCallback;Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent$HandleDecodeDataCallback;Landroid/os/Handler;I)V
    //   220: aload_0
    //   221: aload_2
    //   222: putfield 181	com/tencent/qqmusic/mediaplayer/CorePlayer:mPcmCompnent	Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent;
    //   225: aload_0
    //   226: getfield 181	com/tencent/qqmusic/mediaplayer/CorePlayer:mPcmCompnent	Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent;
    //   229: ifnull +10 -> 239
    //   232: aload_0
    //   233: getfield 181	com/tencent/qqmusic/mediaplayer/CorePlayer:mPcmCompnent	Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent;
    //   236: invokevirtual 417	com/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent:handleDecodeData	()V
    //   239: aload_0
    //   240: getfield 181	com/tencent/qqmusic/mediaplayer/CorePlayer:mPcmCompnent	Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent;
    //   243: ifnull +1016 -> 1259
    //   246: ldc 14
    //   248: aload_0
    //   249: new 137	java/lang/StringBuilder
    //   252: dup
    //   253: ldc_w 419
    //   256: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   259: aload_0
    //   260: getfield 91	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   263: invokevirtual 422	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   266: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   269: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   272: invokestatic 225	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   275: invokestatic 425	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil:stopProcessInfoOutput	()V
    //   278: aload_0
    //   279: getfield 122	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   282: invokevirtual 427	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   285: pop
    //   286: aload_0
    //   287: getfield 124	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   290: ifnull +12 -> 302
    //   293: aload_0
    //   294: getfield 124	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   297: invokeinterface 432 1 0
    //   302: aload_0
    //   303: getfield 181	com/tencent/qqmusic/mediaplayer/CorePlayer:mPcmCompnent	Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent;
    //   306: ifnull +10 -> 316
    //   309: aload_0
    //   310: getfield 181	com/tencent/qqmusic/mediaplayer/CorePlayer:mPcmCompnent	Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent;
    //   313: invokevirtual 434	com/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent:release	()V
    //   316: aload_0
    //   317: iconst_0
    //   318: putfield 89	com/tencent/qqmusic/mediaplayer/CorePlayer:mPlayerMode	I
    //   321: ldc 14
    //   323: aload_0
    //   324: new 137	java/lang/StringBuilder
    //   327: dup
    //   328: ldc_w 436
    //   331: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   334: invokestatic 376	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   337: invokevirtual 379	java/lang/Thread:getName	()Ljava/lang/String;
    //   340: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   346: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   349: invokestatic 225	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   352: ldc_w 365
    //   355: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   358: return
    //   359: aload_0
    //   360: getfield 126	com/tencent/qqmusic/mediaplayer/CorePlayer:mNativeDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/INativeDataSource;
    //   363: ifnull +214 -> 577
    //   366: aload_0
    //   367: getfield 122	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   370: aload_0
    //   371: getfield 126	com/tencent/qqmusic/mediaplayer/CorePlayer:mNativeDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/INativeDataSource;
    //   374: invokevirtual 439	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:init	(Lcom/tencent/qqmusic/mediaplayer/upstream/INativeDataSource;)I
    //   377: istore_1
    //   378: ldc 14
    //   380: aload_0
    //   381: ldc_w 441
    //   384: iload_1
    //   385: invokestatic 392	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   388: invokevirtual 395	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   391: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   394: invokestatic 225	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   397: goto -309 -> 88
    //   400: astore_2
    //   401: bipush 62
    //   403: istore_1
    //   404: aload_2
    //   405: instanceof 282
    //   408: ifeq +586 -> 994
    //   411: bipush 69
    //   413: istore_1
    //   414: ldc 14
    //   416: aload_0
    //   417: ldc_w 443
    //   420: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   423: invokestatic 186	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   426: aload_0
    //   427: getfield 77	com/tencent/qqmusic/mediaplayer/CorePlayer:mStateRunner	Lcom/tencent/qqmusic/mediaplayer/PlayerStateRunner;
    //   430: bipush 9
    //   432: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   435: invokevirtual 132	com/tencent/qqmusic/mediaplayer/PlayerStateRunner:transfer	(Ljava/lang/Integer;)Ljava/lang/Integer;
    //   438: pop
    //   439: aload_0
    //   440: bipush 91
    //   442: iload_1
    //   443: invokespecial 399	com/tencent/qqmusic/mediaplayer/CorePlayer:callExceptionCallback	(II)V
    //   446: ldc 14
    //   448: ldc_w 445
    //   451: aload_2
    //   452: invokestatic 288	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   455: aload_0
    //   456: getfield 181	com/tencent/qqmusic/mediaplayer/CorePlayer:mPcmCompnent	Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent;
    //   459: ifnull +550 -> 1009
    //   462: ldc 14
    //   464: aload_0
    //   465: new 137	java/lang/StringBuilder
    //   468: dup
    //   469: ldc_w 419
    //   472: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   475: aload_0
    //   476: getfield 91	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   479: invokevirtual 422	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   482: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   485: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   488: invokestatic 225	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   491: invokestatic 425	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil:stopProcessInfoOutput	()V
    //   494: aload_0
    //   495: getfield 122	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   498: invokevirtual 427	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   501: pop
    //   502: aload_0
    //   503: getfield 124	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   506: ifnull +12 -> 518
    //   509: aload_0
    //   510: getfield 124	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   513: invokeinterface 432 1 0
    //   518: aload_0
    //   519: getfield 181	com/tencent/qqmusic/mediaplayer/CorePlayer:mPcmCompnent	Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent;
    //   522: ifnull +10 -> 532
    //   525: aload_0
    //   526: getfield 181	com/tencent/qqmusic/mediaplayer/CorePlayer:mPcmCompnent	Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent;
    //   529: invokevirtual 434	com/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent:release	()V
    //   532: aload_0
    //   533: iconst_0
    //   534: putfield 89	com/tencent/qqmusic/mediaplayer/CorePlayer:mPlayerMode	I
    //   537: ldc 14
    //   539: aload_0
    //   540: new 137	java/lang/StringBuilder
    //   543: dup
    //   544: ldc_w 436
    //   547: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   550: invokestatic 376	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   553: invokevirtual 379	java/lang/Thread:getName	()Ljava/lang/String;
    //   556: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   559: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   562: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   565: invokestatic 225	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   568: ldc_w 365
    //   571: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   574: goto -216 -> 358
    //   577: iconst_m1
    //   578: istore_1
    //   579: ldc 14
    //   581: aload_0
    //   582: ldc_w 447
    //   585: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   588: invokestatic 225	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   591: goto -503 -> 88
    //   594: astore_2
    //   595: aload_0
    //   596: getfield 181	com/tencent/qqmusic/mediaplayer/CorePlayer:mPcmCompnent	Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent;
    //   599: ifnull +826 -> 1425
    //   602: ldc 14
    //   604: aload_0
    //   605: new 137	java/lang/StringBuilder
    //   608: dup
    //   609: ldc_w 419
    //   612: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   615: aload_0
    //   616: getfield 91	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   619: invokevirtual 422	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   622: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   625: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   628: invokestatic 225	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   631: invokestatic 425	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil:stopProcessInfoOutput	()V
    //   634: aload_0
    //   635: getfield 122	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   638: invokevirtual 427	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   641: pop
    //   642: aload_0
    //   643: getfield 124	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   646: ifnull +12 -> 658
    //   649: aload_0
    //   650: getfield 124	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   653: invokeinterface 432 1 0
    //   658: aload_0
    //   659: getfield 181	com/tencent/qqmusic/mediaplayer/CorePlayer:mPcmCompnent	Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent;
    //   662: ifnull +10 -> 672
    //   665: aload_0
    //   666: getfield 181	com/tencent/qqmusic/mediaplayer/CorePlayer:mPcmCompnent	Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent;
    //   669: invokevirtual 434	com/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent:release	()V
    //   672: aload_0
    //   673: iconst_0
    //   674: putfield 89	com/tencent/qqmusic/mediaplayer/CorePlayer:mPlayerMode	I
    //   677: ldc 14
    //   679: aload_0
    //   680: new 137	java/lang/StringBuilder
    //   683: dup
    //   684: ldc_w 436
    //   687: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   690: invokestatic 376	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   693: invokevirtual 379	java/lang/Thread:getName	()Ljava/lang/String;
    //   696: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   699: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   702: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   705: invokestatic 225	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   708: ldc_w 365
    //   711: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   714: aload_2
    //   715: athrow
    //   716: iload_1
    //   717: ifeq +263 -> 980
    //   720: ldc 14
    //   722: aload_0
    //   723: ldc_w 449
    //   726: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   729: invokestatic 186	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   732: aload_0
    //   733: getfield 77	com/tencent/qqmusic/mediaplayer/CorePlayer:mStateRunner	Lcom/tencent/qqmusic/mediaplayer/PlayerStateRunner;
    //   736: bipush 9
    //   738: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   741: invokevirtual 132	com/tencent/qqmusic/mediaplayer/PlayerStateRunner:transfer	(Ljava/lang/Integer;)Ljava/lang/Integer;
    //   744: pop
    //   745: iload_1
    //   746: bipush 254
    //   748: if_icmpne +143 -> 891
    //   751: bipush 55
    //   753: istore_1
    //   754: aload_0
    //   755: bipush 91
    //   757: iload_1
    //   758: invokespecial 399	com/tencent/qqmusic/mediaplayer/CorePlayer:callExceptionCallback	(II)V
    //   761: aload_0
    //   762: bipush 91
    //   764: bipush 62
    //   766: invokespecial 399	com/tencent/qqmusic/mediaplayer/CorePlayer:callExceptionCallback	(II)V
    //   769: aload_0
    //   770: getfield 181	com/tencent/qqmusic/mediaplayer/CorePlayer:mPcmCompnent	Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent;
    //   773: ifnull +124 -> 897
    //   776: ldc 14
    //   778: aload_0
    //   779: new 137	java/lang/StringBuilder
    //   782: dup
    //   783: ldc_w 419
    //   786: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   789: aload_0
    //   790: getfield 91	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   793: invokevirtual 422	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   796: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   799: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   802: invokestatic 225	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   805: invokestatic 425	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil:stopProcessInfoOutput	()V
    //   808: aload_0
    //   809: getfield 122	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   812: invokevirtual 427	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   815: pop
    //   816: aload_0
    //   817: getfield 124	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   820: ifnull +12 -> 832
    //   823: aload_0
    //   824: getfield 124	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   827: invokeinterface 432 1 0
    //   832: aload_0
    //   833: getfield 181	com/tencent/qqmusic/mediaplayer/CorePlayer:mPcmCompnent	Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent;
    //   836: ifnull +10 -> 846
    //   839: aload_0
    //   840: getfield 181	com/tencent/qqmusic/mediaplayer/CorePlayer:mPcmCompnent	Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent;
    //   843: invokevirtual 434	com/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent:release	()V
    //   846: aload_0
    //   847: iconst_0
    //   848: putfield 89	com/tencent/qqmusic/mediaplayer/CorePlayer:mPlayerMode	I
    //   851: ldc 14
    //   853: aload_0
    //   854: new 137	java/lang/StringBuilder
    //   857: dup
    //   858: ldc_w 436
    //   861: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   864: invokestatic 376	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   867: invokevirtual 379	java/lang/Thread:getName	()Ljava/lang/String;
    //   870: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   873: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   876: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   879: invokestatic 225	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   882: ldc_w 365
    //   885: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   888: goto -530 -> 358
    //   891: bipush 62
    //   893: istore_1
    //   894: goto -140 -> 754
    //   897: ldc 14
    //   899: aload_0
    //   900: ldc_w 451
    //   903: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   906: invokestatic 186	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   909: goto -104 -> 805
    //   912: astore_2
    //   913: ldc 14
    //   915: aload_0
    //   916: new 137	java/lang/StringBuilder
    //   919: dup
    //   920: ldc_w 453
    //   923: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   926: aload_2
    //   927: invokevirtual 456	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   930: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   933: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   936: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   939: aload_2
    //   940: invokestatic 288	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   943: goto -127 -> 816
    //   946: astore_2
    //   947: ldc 14
    //   949: aload_0
    //   950: new 137	java/lang/StringBuilder
    //   953: dup
    //   954: ldc_w 458
    //   957: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   960: aload_2
    //   961: invokevirtual 459	java/io/IOException:getMessage	()Ljava/lang/String;
    //   964: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   967: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   970: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   973: aload_2
    //   974: invokestatic 288	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   977: goto -145 -> 832
    //   980: aload_0
    //   981: aload_0
    //   982: getfield 122	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   985: invokevirtual 462	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:getAudioInformation	()Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   988: putfield 188	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   991: goto -864 -> 127
    //   994: aload_2
    //   995: instanceof 464
    //   998: istore_3
    //   999: iload_3
    //   1000: ifeq -586 -> 414
    //   1003: bipush 60
    //   1005: istore_1
    //   1006: goto -592 -> 414
    //   1009: ldc 14
    //   1011: aload_0
    //   1012: ldc_w 451
    //   1015: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1018: invokestatic 186	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1021: goto -530 -> 491
    //   1024: astore_2
    //   1025: ldc 14
    //   1027: aload_0
    //   1028: new 137	java/lang/StringBuilder
    //   1031: dup
    //   1032: ldc_w 453
    //   1035: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1038: aload_2
    //   1039: invokevirtual 456	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   1042: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1045: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1048: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1051: aload_2
    //   1052: invokestatic 288	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1055: goto -553 -> 502
    //   1058: astore_2
    //   1059: ldc 14
    //   1061: aload_0
    //   1062: new 137	java/lang/StringBuilder
    //   1065: dup
    //   1066: ldc_w 458
    //   1069: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1072: aload_2
    //   1073: invokevirtual 459	java/io/IOException:getMessage	()Ljava/lang/String;
    //   1076: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1079: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1082: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1085: aload_2
    //   1086: invokestatic 288	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1089: goto -571 -> 518
    //   1092: new 466	com/tencent/qqmusic/mediaplayer/StreamDecodeDataComponent
    //   1095: astore_2
    //   1096: aload_2
    //   1097: aload_0
    //   1098: aload_0
    //   1099: getfield 77	com/tencent/qqmusic/mediaplayer/CorePlayer:mStateRunner	Lcom/tencent/qqmusic/mediaplayer/PlayerStateRunner;
    //   1102: aload_0
    //   1103: getfield 188	com/tencent/qqmusic/mediaplayer/CorePlayer:mInformation	Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   1106: aload_0
    //   1107: getfield 128	com/tencent/qqmusic/mediaplayer/CorePlayer:mCallback	Lcom/tencent/qqmusic/mediaplayer/PlayerCallback;
    //   1110: aload_0
    //   1111: aload_0
    //   1112: getfield 120	com/tencent/qqmusic/mediaplayer/CorePlayer:mEventHandler	Landroid/os/Handler;
    //   1115: aload_0
    //   1116: getfield 83	com/tencent/qqmusic/mediaplayer/CorePlayer:mPlayerID	I
    //   1119: invokespecial 467	com/tencent/qqmusic/mediaplayer/StreamDecodeDataComponent:<init>	(Lcom/tencent/qqmusic/mediaplayer/CorePlayer;Lcom/tencent/qqmusic/mediaplayer/PlayerStateRunner;Lcom/tencent/qqmusic/mediaplayer/AudioInformation;Lcom/tencent/qqmusic/mediaplayer/PlayerCallback;Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent$HandleDecodeDataCallback;Landroid/os/Handler;I)V
    //   1122: aload_0
    //   1123: aload_2
    //   1124: putfield 181	com/tencent/qqmusic/mediaplayer/CorePlayer:mPcmCompnent	Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent;
    //   1127: goto -902 -> 225
    //   1130: astore_2
    //   1131: ldc 14
    //   1133: aload_2
    //   1134: invokestatic 247	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1137: aload_0
    //   1138: getfield 181	com/tencent/qqmusic/mediaplayer/CorePlayer:mPcmCompnent	Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent;
    //   1141: ifnull +201 -> 1342
    //   1144: ldc 14
    //   1146: aload_0
    //   1147: new 137	java/lang/StringBuilder
    //   1150: dup
    //   1151: ldc_w 419
    //   1154: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1157: aload_0
    //   1158: getfield 91	com/tencent/qqmusic/mediaplayer/CorePlayer:mIsExit	Z
    //   1161: invokevirtual 422	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   1164: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1167: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1170: invokestatic 225	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1173: invokestatic 425	com/tencent/qqmusic/mediaplayer/util/CpuInfoUtil:stopProcessInfoOutput	()V
    //   1176: aload_0
    //   1177: getfield 122	com/tencent/qqmusic/mediaplayer/CorePlayer:mDecoder	Lcom/tencent/qqmusic/mediaplayer/codec/BaseDecoder;
    //   1180: invokevirtual 427	com/tencent/qqmusic/mediaplayer/codec/BaseDecoder:release	()I
    //   1183: pop
    //   1184: aload_0
    //   1185: getfield 124	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   1188: ifnull +12 -> 1200
    //   1191: aload_0
    //   1192: getfield 124	com/tencent/qqmusic/mediaplayer/CorePlayer:mDataSource	Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;
    //   1195: invokeinterface 432 1 0
    //   1200: aload_0
    //   1201: getfield 181	com/tencent/qqmusic/mediaplayer/CorePlayer:mPcmCompnent	Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent;
    //   1204: ifnull +10 -> 1214
    //   1207: aload_0
    //   1208: getfield 181	com/tencent/qqmusic/mediaplayer/CorePlayer:mPcmCompnent	Lcom/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent;
    //   1211: invokevirtual 434	com/tencent/qqmusic/mediaplayer/BaseDecodeDataComponent:release	()V
    //   1214: aload_0
    //   1215: iconst_0
    //   1216: putfield 89	com/tencent/qqmusic/mediaplayer/CorePlayer:mPlayerMode	I
    //   1219: ldc 14
    //   1221: aload_0
    //   1222: new 137	java/lang/StringBuilder
    //   1225: dup
    //   1226: ldc_w 436
    //   1229: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1232: invokestatic 376	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1235: invokevirtual 379	java/lang/Thread:getName	()Ljava/lang/String;
    //   1238: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1241: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1244: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1247: invokestatic 225	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1250: ldc_w 365
    //   1253: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1256: goto -898 -> 358
    //   1259: ldc 14
    //   1261: aload_0
    //   1262: ldc_w 451
    //   1265: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1268: invokestatic 186	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1271: goto -996 -> 275
    //   1274: astore_2
    //   1275: ldc 14
    //   1277: aload_0
    //   1278: new 137	java/lang/StringBuilder
    //   1281: dup
    //   1282: ldc_w 453
    //   1285: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1288: aload_2
    //   1289: invokevirtual 456	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   1292: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1295: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1298: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1301: aload_2
    //   1302: invokestatic 288	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1305: goto -1019 -> 286
    //   1308: astore_2
    //   1309: ldc 14
    //   1311: aload_0
    //   1312: new 137	java/lang/StringBuilder
    //   1315: dup
    //   1316: ldc_w 458
    //   1319: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1322: aload_2
    //   1323: invokevirtual 459	java/io/IOException:getMessage	()Ljava/lang/String;
    //   1326: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1329: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1332: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1335: aload_2
    //   1336: invokestatic 288	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1339: goto -1037 -> 302
    //   1342: ldc 14
    //   1344: aload_0
    //   1345: ldc_w 451
    //   1348: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1351: invokestatic 186	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1354: goto -181 -> 1173
    //   1357: astore_2
    //   1358: ldc 14
    //   1360: aload_0
    //   1361: new 137	java/lang/StringBuilder
    //   1364: dup
    //   1365: ldc_w 453
    //   1368: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1371: aload_2
    //   1372: invokevirtual 456	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   1375: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1378: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1381: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1384: aload_2
    //   1385: invokestatic 288	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1388: goto -204 -> 1184
    //   1391: astore_2
    //   1392: ldc 14
    //   1394: aload_0
    //   1395: new 137	java/lang/StringBuilder
    //   1398: dup
    //   1399: ldc_w 458
    //   1402: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1405: aload_2
    //   1406: invokevirtual 459	java/io/IOException:getMessage	()Ljava/lang/String;
    //   1409: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1412: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1415: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1418: aload_2
    //   1419: invokestatic 288	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1422: goto -222 -> 1200
    //   1425: ldc 14
    //   1427: aload_0
    //   1428: ldc_w 451
    //   1431: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1434: invokestatic 186	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1437: goto -806 -> 631
    //   1440: astore 4
    //   1442: ldc 14
    //   1444: aload_0
    //   1445: new 137	java/lang/StringBuilder
    //   1448: dup
    //   1449: ldc_w 453
    //   1452: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1455: aload 4
    //   1457: invokevirtual 456	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   1460: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1463: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1466: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1469: aload 4
    //   1471: invokestatic 288	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1474: goto -832 -> 642
    //   1477: astore 4
    //   1479: ldc 14
    //   1481: aload_0
    //   1482: new 137	java/lang/StringBuilder
    //   1485: dup
    //   1486: ldc_w 458
    //   1489: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1492: aload 4
    //   1494: invokevirtual 459	java/io/IOException:getMessage	()Ljava/lang/String;
    //   1497: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1500: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1503: invokespecial 173	com/tencent/qqmusic/mediaplayer/CorePlayer:axiliary	(Ljava/lang/String;)Ljava/lang/String;
    //   1506: aload 4
    //   1508: invokestatic 288	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1511: goto -853 -> 658
    //
    // Exception table:
    //   from	to	target	type
    //   40	88	400	java/lang/Throwable
    //   94	127	400	java/lang/Throwable
    //   359	397	400	java/lang/Throwable
    //   579	591	400	java/lang/Throwable
    //   720	745	400	java/lang/Throwable
    //   754	769	400	java/lang/Throwable
    //   980	991	400	java/lang/Throwable
    //   40	88	594	finally
    //   94	127	594	finally
    //   127	177	594	finally
    //   177	190	594	finally
    //   190	225	594	finally
    //   225	239	594	finally
    //   359	397	594	finally
    //   404	411	594	finally
    //   414	455	594	finally
    //   579	591	594	finally
    //   720	745	594	finally
    //   754	769	594	finally
    //   980	991	594	finally
    //   994	999	594	finally
    //   1092	1127	594	finally
    //   1131	1137	594	finally
    //   808	816	912	java/lang/Throwable
    //   823	832	946	java/io/IOException
    //   494	502	1024	java/lang/Throwable
    //   509	518	1058	java/io/IOException
    //   127	177	1130	java/lang/Throwable
    //   177	190	1130	java/lang/Throwable
    //   190	225	1130	java/lang/Throwable
    //   225	239	1130	java/lang/Throwable
    //   404	411	1130	java/lang/Throwable
    //   414	455	1130	java/lang/Throwable
    //   994	999	1130	java/lang/Throwable
    //   1092	1127	1130	java/lang/Throwable
    //   278	286	1274	java/lang/Throwable
    //   293	302	1308	java/io/IOException
    //   1176	1184	1357	java/lang/Throwable
    //   1191	1200	1391	java/io/IOException
    //   634	642	1440	java/lang/Throwable
    //   649	658	1477	java/io/IOException
  }

  public void seek(int paramInt)
  {
    AppMethodBeat.i(104663);
    if (this.mPcmCompnent != null)
      this.mPcmCompnent.seek(paramInt);
    AppMethodBeat.o(104663);
  }

  public int seekTo(int paramInt)
  {
    AppMethodBeat.i(104665);
    paramInt = this.mDecoder.seekTo(paramInt);
    AppMethodBeat.o(104665);
    return paramInt;
  }

  void setAudioStreamType(int paramInt)
  {
    AppMethodBeat.i(104662);
    if (this.mPcmCompnent != null)
      this.mPcmCompnent.setAudioStreamType(paramInt);
    AppMethodBeat.o(104662);
  }

  void setPlayerMode(int paramInt)
  {
    this.mPlayerMode = paramInt;
  }

  void setThreadName(String paramString)
  {
    this.mThreadName = paramString;
  }

  void setVolume(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(104660);
    if (this.mPcmCompnent != null)
      this.mPcmCompnent.setVolume(paramFloat1, paramFloat2);
    AppMethodBeat.o(104660);
  }

  void stop()
  {
    AppMethodBeat.i(104658);
    Logger.i("CorePlayer", axiliary("stop"));
    if (this.mPcmCompnent == null)
      AppMethodBeat.o(104658);
    while (true)
    {
      return;
      this.mPcmCompnent.stop();
      AppMethodBeat.o(104658);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.CorePlayer
 * JD-Core Version:    0.6.2
 */