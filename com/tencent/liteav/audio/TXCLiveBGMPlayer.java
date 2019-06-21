package com.tencent.liteav.audio;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.audio.impl.TXCTraeJNI;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public class TXCLiveBGMPlayer
  implements Runnable
{
  private static final int PLAY_ERR_AUDIO_TRACK = -3;
  private static final int PLAY_ERR_AUDIO_TRACK_PLAY = -4;
  private static final int PLAY_ERR_FILE_NOTFOUND = -2;
  private static final int PLAY_ERR_OPEN = -1;
  private static final int PLAY_SUCCESS = 0;
  private static final String TAG;
  private static TXCLiveBGMPlayer instance;
  private int mAECType = TXEAudioDef.TXE_AEC_NONE;
  private Context mContext = null;
  private String mFilePath = null;
  private boolean mIsPause = false;
  private boolean mIsRunning = false;
  private float mPitch = 0.0F;
  private Thread mThread = null;
  private WeakReference<e> mWeakListener = null;

  static
  {
    AppMethodBeat.i(66516);
    b.e();
    TAG = "AudioCenter:" + TXCLiveBGMPlayer.class.getSimpleName();
    AppMethodBeat.o(66516);
  }

  public static TXCLiveBGMPlayer getInstance()
  {
    AppMethodBeat.i(66501);
    if (instance == null);
    try
    {
      if (instance == null)
      {
        localTXCLiveBGMPlayer = new com/tencent/liteav/audio/TXCLiveBGMPlayer;
        localTXCLiveBGMPlayer.<init>();
        instance = localTXCLiveBGMPlayer;
      }
      TXCLiveBGMPlayer localTXCLiveBGMPlayer = instance;
      AppMethodBeat.o(66501);
      return localTXCLiveBGMPlayer;
    }
    finally
    {
      AppMethodBeat.o(66501);
    }
  }

  private native int nativeGetBitsPerChannel();

  private native int nativeGetChannels();

  private native long nativeGetCurDurationMS();

  private native long nativeGetCurPtsMS();

  private native long nativeGetDurationMS(String paramString);

  private native int nativeGetSampleRate();

  private void nativeOPlayProgress(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(66514);
    onPlayProgress(paramLong1, paramLong2);
    if (paramLong1 == paramLong2)
      onPlayEnd(0);
    AppMethodBeat.o(66514);
  }

  private native void nativePause();

  private native int nativeRead(byte[] paramArrayOfByte, int paramInt);

  private native void nativeResume();

  private native void nativeSetPitch(float paramFloat);

  private native void nativeSetVolume(float paramFloat);

  private native boolean nativeStartPlay(String paramString, TXCLiveBGMPlayer paramTXCLiveBGMPlayer);

  private native void nativeStopPlay();

  private void onPlayEnd(int paramInt)
  {
    AppMethodBeat.i(66512);
    e locale = null;
    try
    {
      if (this.mWeakListener != null)
        locale = (e)this.mWeakListener.get();
      new Handler(Looper.getMainLooper()).post(new TXCLiveBGMPlayer.2(this, locale, paramInt));
      AppMethodBeat.o(66512);
      return;
    }
    finally
    {
      AppMethodBeat.o(66512);
    }
  }

  private void onPlayProgress(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(66513);
    e locale = null;
    try
    {
      if (this.mWeakListener != null)
        locale = (e)this.mWeakListener.get();
      if (locale != null)
        locale.a(paramLong1, paramLong2);
      AppMethodBeat.o(66513);
      return;
    }
    finally
    {
      AppMethodBeat.o(66513);
    }
  }

  private void onPlayStart()
  {
    AppMethodBeat.i(66511);
    e locale = null;
    try
    {
      if (this.mWeakListener != null)
        locale = (e)this.mWeakListener.get();
      new Handler(Looper.getMainLooper()).post(new TXCLiveBGMPlayer.1(this, locale));
      AppMethodBeat.o(66511);
      return;
    }
    finally
    {
      AppMethodBeat.o(66511);
    }
  }

  public long getMusicDuration(String paramString)
  {
    AppMethodBeat.i(66509);
    long l = nativeGetDurationMS(paramString);
    AppMethodBeat.o(66509);
    return l;
  }

  public boolean isPlaying()
  {
    return this.mIsRunning;
  }

  public boolean isRunning()
  {
    if ((this.mIsRunning) && (!this.mIsPause));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void pause()
  {
    AppMethodBeat.i(66506);
    TXCLog.i(TAG, "pause");
    this.mIsPause = true;
    nativePause();
    AppMethodBeat.o(66506);
  }

  public void resume()
  {
    AppMethodBeat.i(66507);
    TXCLog.i(TAG, "resume");
    this.mIsPause = false;
    nativeResume();
    AppMethodBeat.o(66507);
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: iconst_3
    //   1: istore_1
    //   2: ldc 201
    //   4: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: invokestatic 206	java/lang/System:currentTimeMillis	()J
    //   10: lstore_2
    //   11: aload_0
    //   12: getfield 80	com/tencent/liteav/audio/TXCLiveBGMPlayer:mFilePath	Ljava/lang/String;
    //   15: ifnull +13 -> 28
    //   18: aload_0
    //   19: getfield 80	com/tencent/liteav/audio/TXCLiveBGMPlayer:mFilePath	Ljava/lang/String;
    //   22: invokevirtual 211	java/lang/String:isEmpty	()Z
    //   25: ifeq +80 -> 105
    //   28: bipush 254
    //   30: istore 4
    //   32: aconst_null
    //   33: astore 5
    //   35: aload 5
    //   37: ifnull +23 -> 60
    //   40: aload 5
    //   42: invokevirtual 215	android/media/AudioTrack:pause	()V
    //   45: aload 5
    //   47: invokevirtual 218	android/media/AudioTrack:flush	()V
    //   50: aload 5
    //   52: invokevirtual 221	android/media/AudioTrack:stop	()V
    //   55: aload 5
    //   57: invokevirtual 224	android/media/AudioTrack:release	()V
    //   60: getstatic 72	com/tencent/liteav/audio/TXCLiveBGMPlayer:TAG	Ljava/lang/String;
    //   63: new 51	java/lang/StringBuilder
    //   66: dup
    //   67: ldc 226
    //   69: invokespecial 57	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   72: invokestatic 206	java/lang/System:currentTimeMillis	()J
    //   75: lload_2
    //   76: lsub
    //   77: invokevirtual 229	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   80: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   83: invokestatic 188	com/tencent/liteav/basic/log/TXCLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   86: aload_0
    //   87: getfield 82	com/tencent/liteav/audio/TXCLiveBGMPlayer:mIsRunning	Z
    //   90: ifeq +9 -> 99
    //   93: aload_0
    //   94: iload 4
    //   96: invokespecial 123	com/tencent/liteav/audio/TXCLiveBGMPlayer:onPlayEnd	(I)V
    //   99: ldc 201
    //   101: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   104: return
    //   105: aload_0
    //   106: invokespecial 231	com/tencent/liteav/audio/TXCLiveBGMPlayer:nativeGetSampleRate	()I
    //   109: istore 6
    //   111: aload_0
    //   112: invokespecial 233	com/tencent/liteav/audio/TXCLiveBGMPlayer:nativeGetChannels	()I
    //   115: istore 7
    //   117: aload_0
    //   118: invokespecial 235	com/tencent/liteav/audio/TXCLiveBGMPlayer:nativeGetBitsPerChannel	()I
    //   121: istore 8
    //   123: iload 7
    //   125: iconst_1
    //   126: if_icmpne +256 -> 382
    //   129: iconst_2
    //   130: istore 4
    //   132: iload 8
    //   134: bipush 8
    //   136: if_icmpne +241 -> 377
    //   139: iload 6
    //   141: iload 4
    //   143: iload_1
    //   144: invokestatic 239	android/media/AudioTrack:getMinBufferSize	(III)I
    //   147: istore 8
    //   149: new 213	android/media/AudioTrack
    //   152: astore 5
    //   154: aload 5
    //   156: iconst_3
    //   157: iload 6
    //   159: iload 4
    //   161: iload_1
    //   162: iload 8
    //   164: iconst_1
    //   165: invokespecial 242	android/media/AudioTrack:<init>	(IIIIII)V
    //   168: aload 5
    //   170: invokevirtual 245	android/media/AudioTrack:play	()V
    //   173: iload 7
    //   175: sipush 2048
    //   178: imul
    //   179: istore 4
    //   181: iload 4
    //   183: newarray byte
    //   185: astore 9
    //   187: aload_0
    //   188: getfield 82	com/tencent/liteav/audio/TXCLiveBGMPlayer:mIsRunning	Z
    //   191: ifeq +180 -> 371
    //   194: invokestatic 250	java/lang/Thread:interrupted	()Z
    //   197: ifne +174 -> 371
    //   200: aload_0
    //   201: getfield 95	com/tencent/liteav/audio/TXCLiveBGMPlayer:mAECType	I
    //   204: getstatic 253	com/tencent/liteav/audio/TXEAudioDef:TXE_AEC_TRAE	I
    //   207: if_icmpeq +164 -> 371
    //   210: aload_0
    //   211: aload 9
    //   213: iload 4
    //   215: invokespecial 255	com/tencent/liteav/audio/TXCLiveBGMPlayer:nativeRead	([BI)I
    //   218: istore_1
    //   219: iload_1
    //   220: ifge +96 -> 316
    //   223: aload_0
    //   224: aload_0
    //   225: invokespecial 257	com/tencent/liteav/audio/TXCLiveBGMPlayer:nativeGetCurDurationMS	()J
    //   228: aload_0
    //   229: invokespecial 257	com/tencent/liteav/audio/TXCLiveBGMPlayer:nativeGetCurDurationMS	()J
    //   232: invokespecial 120	com/tencent/liteav/audio/TXCLiveBGMPlayer:onPlayProgress	(JJ)V
    //   235: iconst_0
    //   236: istore 4
    //   238: goto -203 -> 35
    //   241: astore 5
    //   243: getstatic 72	com/tencent/liteav/audio/TXCLiveBGMPlayer:TAG	Ljava/lang/String;
    //   246: new 51	java/lang/StringBuilder
    //   249: dup
    //   250: ldc_w 259
    //   253: invokespecial 57	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   256: aload 5
    //   258: invokevirtual 262	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   261: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   267: invokestatic 264	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   270: bipush 253
    //   272: istore 4
    //   274: aconst_null
    //   275: astore 5
    //   277: goto -242 -> 35
    //   280: astore 9
    //   282: getstatic 72	com/tencent/liteav/audio/TXCLiveBGMPlayer:TAG	Ljava/lang/String;
    //   285: new 51	java/lang/StringBuilder
    //   288: dup
    //   289: ldc_w 266
    //   292: invokespecial 57	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   295: aload 9
    //   297: invokevirtual 262	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   300: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   306: invokestatic 264	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   309: bipush 252
    //   311: istore 4
    //   313: goto -278 -> 35
    //   316: iload_1
    //   317: ifne +24 -> 341
    //   320: aload_0
    //   321: getfield 86	com/tencent/liteav/audio/TXCLiveBGMPlayer:mIsPause	Z
    //   324: ifeq -137 -> 187
    //   327: ldc2_w 267
    //   330: invokestatic 272	java/lang/Thread:sleep	(J)V
    //   333: goto -146 -> 187
    //   336: astore 10
    //   338: goto -151 -> 187
    //   341: aload 5
    //   343: aload 9
    //   345: iconst_0
    //   346: iload_1
    //   347: invokevirtual 276	android/media/AudioTrack:write	([BII)I
    //   350: pop
    //   351: aload_0
    //   352: aload_0
    //   353: invokespecial 278	com/tencent/liteav/audio/TXCLiveBGMPlayer:nativeGetCurPtsMS	()J
    //   356: aload_0
    //   357: invokespecial 257	com/tencent/liteav/audio/TXCLiveBGMPlayer:nativeGetCurDurationMS	()J
    //   360: invokespecial 120	com/tencent/liteav/audio/TXCLiveBGMPlayer:onPlayProgress	(JJ)V
    //   363: goto -176 -> 187
    //   366: astore 5
    //   368: goto -308 -> 60
    //   371: iconst_0
    //   372: istore 4
    //   374: goto -339 -> 35
    //   377: iconst_2
    //   378: istore_1
    //   379: goto -240 -> 139
    //   382: iconst_3
    //   383: istore 4
    //   385: goto -253 -> 132
    //
    // Exception table:
    //   from	to	target	type
    //   139	168	241	java/lang/Exception
    //   168	173	280	java/lang/Exception
    //   327	333	336	java/lang/InterruptedException
    //   40	60	366	java/lang/Exception
  }

  public void setContext(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public void setOnPlayListener(e parame)
  {
    try
    {
      AppMethodBeat.i(66502);
      if (parame == null)
        this.mWeakListener = null;
      WeakReference localWeakReference = new java/lang/ref/WeakReference;
      localWeakReference.<init>(parame);
      this.mWeakListener = localWeakReference;
      AppMethodBeat.o(66502);
      return;
    }
    finally
    {
    }
    throw parame;
  }

  public void setPitch(float paramFloat)
  {
    AppMethodBeat.i(66510);
    this.mPitch = paramFloat;
    nativeSetPitch(paramFloat);
    AppMethodBeat.o(66510);
  }

  public void setVolume(float paramFloat)
  {
    AppMethodBeat.i(66508);
    nativeSetVolume(paramFloat);
    AppMethodBeat.o(66508);
  }

  public boolean startPlay(String paramString, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(66503);
    if ((paramString == null) || (paramString.isEmpty()))
    {
      TXCLog.e(TAG, "start live bgm failed! invalid params!");
      AppMethodBeat.o(66503);
    }
    while (true)
    {
      return bool;
      stopPlay();
      this.mAECType = paramInt;
      this.mFilePath = paramString;
      this.mIsRunning = true;
      onPlayStart();
      if (nativeStartPlay(this.mFilePath, this))
        break;
      onPlayEnd(-1);
      AppMethodBeat.o(66503);
    }
    if (this.mAECType == TXEAudioDef.TXE_AEC_TRAE)
      TXCTraeJNI.traeStartPlay(this.mContext);
    while (true)
    {
      TXCLog.i(TAG, "startPlay filePath = ".concat(String.valueOf(paramString)));
      AppMethodBeat.o(66503);
      bool = true;
      break;
      if (this.mThread == null)
      {
        this.mThread = new Thread(this, "BGMPlayer");
        this.mThread.start();
      }
    }
  }

  public void stopPlay()
  {
    AppMethodBeat.i(66504);
    this.mIsRunning = false;
    long l = System.currentTimeMillis();
    if ((this.mThread != null) && (this.mThread.isAlive()) && (Thread.currentThread().getId() != this.mThread.getId()));
    try
    {
      this.mThread.join();
      label56: this.mThread = null;
      nativeStopPlay();
      TXCTraeJNI.traeStopPlay();
      this.mIsPause = false;
      TXCLog.i(TAG, "stopBGMPlay cost(MS): " + (System.currentTimeMillis() - l));
      AppMethodBeat.o(66504);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label56;
    }
  }

  public void switchAecType(int paramInt)
  {
    AppMethodBeat.i(66505);
    if (!this.mIsRunning)
    {
      TXCLog.w(TAG, "未开始播放BGM，不能切换AEC Type");
      AppMethodBeat.o(66505);
    }
    while (true)
    {
      return;
      if (this.mAECType == paramInt)
      {
        TXCLog.i(TAG, "无需切换AEC Type. aecType = " + this.mAECType);
        AppMethodBeat.o(66505);
        continue;
      }
      TXCLog.i(TAG, "切换AEC Type为 ".concat(String.valueOf(paramInt)));
      this.mAECType = paramInt;
      if ((this.mAECType != TXEAudioDef.TXE_AEC_TRAE) || ((this.mThread != null) && (this.mThread.isAlive()) && (Thread.currentThread().getId() != this.mThread.getId())));
      try
      {
        this.mThread.join();
        label144: this.mThread = null;
        AppMethodBeat.o(66505);
        continue;
        if (this.mThread == null)
        {
          this.mThread = new Thread(this, "BGMPlayer");
          this.mThread.start();
        }
        AppMethodBeat.o(66505);
      }
      catch (InterruptedException localInterruptedException)
      {
        break label144;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.TXCLiveBGMPlayer
 * JD-Core Version:    0.6.2
 */