package com.tencent.liteav.audio;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public class TXCUGCBGMPlayer
  implements Runnable
{
  private static final int PLAY_ERR_AUDIO_TRACK = -3;
  private static final int PLAY_ERR_AUDIO_TRACK_PLAY = -4;
  private static final int PLAY_ERR_FILE_NOTFOUND = -2;
  private static final int PLAY_ERR_OPEN = -1;
  private static final int PLAY_SUCCESS = 0;
  private static final String TAG = "AudioCenter:TXCUGCBGMPlayer";
  private static TXCUGCBGMPlayer instance;
  private long mEndTimeMS = 0L;
  private String mFilePath = null;
  private boolean mIsPause = false;
  private boolean mIsRunning = false;
  private long mSeekBytes = 0L;
  private float mSpeedRate = 1.0F;
  private long mStartTimeMS = 0L;
  private Thread mThread = null;
  private float mVolume = 1.0F;
  private WeakReference<e> mWeakListener = null;

  static
  {
    AppMethodBeat.i(66725);
    b.e();
    AppMethodBeat.o(66725);
  }

  public static long getDurationMS(String paramString)
  {
    AppMethodBeat.i(66720);
    long l = nativeGetDurationMS(paramString);
    AppMethodBeat.o(66720);
    return l;
  }

  public static TXCUGCBGMPlayer getInstance()
  {
    AppMethodBeat.i(66709);
    if (instance == null);
    try
    {
      if (instance == null)
      {
        localTXCUGCBGMPlayer = new com/tencent/liteav/audio/TXCUGCBGMPlayer;
        localTXCUGCBGMPlayer.<init>();
        instance = localTXCUGCBGMPlayer;
      }
      TXCUGCBGMPlayer localTXCUGCBGMPlayer = instance;
      AppMethodBeat.o(66709);
      return localTXCUGCBGMPlayer;
    }
    finally
    {
      AppMethodBeat.o(66709);
    }
  }

  private native int nativeGetBitsPerChannel();

  private native int nativeGetChannels();

  private native long nativeGetCurDurationMS();

  private native long nativeGetCurPosition();

  private native long nativeGetCurPtsMS();

  private static native long nativeGetDurationMS(String paramString);

  private native int nativeGetSampleRate();

  private native void nativePause();

  private native void nativePlayFromTime(long paramLong1, long paramLong2);

  private native int nativeRead(byte[] paramArrayOfByte, int paramInt);

  private native void nativeResume();

  private native void nativeSeekBytes(long paramLong);

  private native void nativeSetSpeedRate(float paramFloat);

  private native void nativeSetVolume(float paramFloat);

  private native boolean nativeStartPlay(String paramString);

  private native void nativeStopPlay();

  private void onPlayEnd(int paramInt)
  {
    AppMethodBeat.i(66722);
    e locale = null;
    try
    {
      if (this.mWeakListener != null)
        locale = (e)this.mWeakListener.get();
      if (locale != null)
        locale.a(paramInt);
      AppMethodBeat.o(66722);
      return;
    }
    finally
    {
      AppMethodBeat.o(66722);
    }
  }

  private void onPlayProgress(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(66723);
    e locale = null;
    try
    {
      if (this.mWeakListener != null)
        locale = (e)this.mWeakListener.get();
      if (locale != null)
        locale.a(paramLong1, paramLong2);
      AppMethodBeat.o(66723);
      return;
    }
    finally
    {
      AppMethodBeat.o(66723);
    }
  }

  private void onPlayStart()
  {
    AppMethodBeat.i(66721);
    e locale = null;
    try
    {
      if (this.mWeakListener != null)
        locale = (e)this.mWeakListener.get();
      if (locale != null)
        locale.a();
      AppMethodBeat.o(66721);
      return;
    }
    finally
    {
      AppMethodBeat.o(66721);
    }
  }

  public long getCurPosition()
  {
    AppMethodBeat.i(66719);
    long l = nativeGetCurPosition();
    TXCLog.i("AudioCenter:TXCUGCBGMPlayer", "getCurPosition:".concat(String.valueOf(l)));
    AppMethodBeat.o(66719);
    return l;
  }

  public void pause()
  {
    AppMethodBeat.i(66713);
    TXCLog.i("AudioCenter:TXCUGCBGMPlayer", "pause");
    this.mIsPause = true;
    nativePause();
    AppMethodBeat.o(66713);
  }

  public void playFromTime(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(66717);
    TXCLog.i("AudioCenter:TXCUGCBGMPlayer", "playFromTime:" + paramLong1 + ", " + paramLong2);
    this.mStartTimeMS = paramLong1;
    this.mEndTimeMS = paramLong2;
    nativePlayFromTime(paramLong1, paramLong2);
    AppMethodBeat.o(66717);
  }

  public void resume()
  {
    AppMethodBeat.i(66714);
    TXCLog.i("AudioCenter:TXCUGCBGMPlayer", "resume");
    this.mIsPause = false;
    nativeResume();
    AppMethodBeat.o(66714);
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: iconst_3
    //   1: istore_1
    //   2: ldc 196
    //   4: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: invokestatic 201	java/lang/System:currentTimeMillis	()J
    //   10: lstore_2
    //   11: aload_0
    //   12: invokespecial 203	com/tencent/liteav/audio/TXCUGCBGMPlayer:onPlayStart	()V
    //   15: aload_0
    //   16: getfield 62	com/tencent/liteav/audio/TXCUGCBGMPlayer:mFilePath	Ljava/lang/String;
    //   19: ifnull +13 -> 32
    //   22: aload_0
    //   23: getfield 62	com/tencent/liteav/audio/TXCUGCBGMPlayer:mFilePath	Ljava/lang/String;
    //   26: invokevirtual 207	java/lang/String:isEmpty	()Z
    //   29: ifeq +103 -> 132
    //   32: ldc 21
    //   34: new 165	java/lang/StringBuilder
    //   37: dup
    //   38: ldc 209
    //   40: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   43: aload_0
    //   44: getfield 62	com/tencent/liteav/audio/TXCUGCBGMPlayer:mFilePath	Ljava/lang/String;
    //   47: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: invokevirtual 183	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   53: invokestatic 211	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   56: bipush 254
    //   58: istore 4
    //   60: aconst_null
    //   61: astore 5
    //   63: aload 5
    //   65: ifnull +23 -> 88
    //   68: aload 5
    //   70: invokevirtual 215	android/media/AudioTrack:pause	()V
    //   73: aload 5
    //   75: invokevirtual 218	android/media/AudioTrack:flush	()V
    //   78: aload 5
    //   80: invokevirtual 221	android/media/AudioTrack:stop	()V
    //   83: aload 5
    //   85: invokevirtual 224	android/media/AudioTrack:release	()V
    //   88: ldc 21
    //   90: new 165	java/lang/StringBuilder
    //   93: dup
    //   94: ldc 226
    //   96: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   99: invokestatic 201	java/lang/System:currentTimeMillis	()J
    //   102: lload_2
    //   103: lsub
    //   104: invokevirtual 174	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   107: invokevirtual 183	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   110: invokestatic 156	com/tencent/liteav/basic/log/TXCLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   113: aload_0
    //   114: getfield 64	com/tencent/liteav/audio/TXCUGCBGMPlayer:mIsRunning	Z
    //   117: ifeq +9 -> 126
    //   120: aload_0
    //   121: iload 4
    //   123: invokespecial 228	com/tencent/liteav/audio/TXCUGCBGMPlayer:onPlayEnd	(I)V
    //   126: ldc 196
    //   128: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   131: return
    //   132: aload_0
    //   133: aload_0
    //   134: getfield 72	com/tencent/liteav/audio/TXCUGCBGMPlayer:mVolume	F
    //   137: invokespecial 230	com/tencent/liteav/audio/TXCUGCBGMPlayer:nativeSetVolume	(F)V
    //   140: aload_0
    //   141: aload_0
    //   142: getfield 74	com/tencent/liteav/audio/TXCUGCBGMPlayer:mSpeedRate	F
    //   145: invokespecial 232	com/tencent/liteav/audio/TXCUGCBGMPlayer:nativeSetSpeedRate	(F)V
    //   148: aload_0
    //   149: aload_0
    //   150: getfield 76	com/tencent/liteav/audio/TXCUGCBGMPlayer:mStartTimeMS	J
    //   153: aload_0
    //   154: getfield 78	com/tencent/liteav/audio/TXCUGCBGMPlayer:mEndTimeMS	J
    //   157: invokespecial 185	com/tencent/liteav/audio/TXCUGCBGMPlayer:nativePlayFromTime	(JJ)V
    //   160: aload_0
    //   161: aload_0
    //   162: getfield 80	com/tencent/liteav/audio/TXCUGCBGMPlayer:mSeekBytes	J
    //   165: invokespecial 234	com/tencent/liteav/audio/TXCUGCBGMPlayer:nativeSeekBytes	(J)V
    //   168: aload_0
    //   169: aload_0
    //   170: getfield 62	com/tencent/liteav/audio/TXCUGCBGMPlayer:mFilePath	Ljava/lang/String;
    //   173: invokespecial 236	com/tencent/liteav/audio/TXCUGCBGMPlayer:nativeStartPlay	(Ljava/lang/String;)Z
    //   176: ifne +12 -> 188
    //   179: iconst_m1
    //   180: istore 4
    //   182: aconst_null
    //   183: astore 5
    //   185: goto -122 -> 63
    //   188: aload_0
    //   189: getfield 68	com/tencent/liteav/audio/TXCUGCBGMPlayer:mIsPause	Z
    //   192: ifeq +238 -> 430
    //   195: aload_0
    //   196: invokespecial 161	com/tencent/liteav/audio/TXCUGCBGMPlayer:nativePause	()V
    //   199: ldc 21
    //   201: new 165	java/lang/StringBuilder
    //   204: dup
    //   205: ldc 238
    //   207: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   210: aload_0
    //   211: getfield 62	com/tencent/liteav/audio/TXCUGCBGMPlayer:mFilePath	Ljava/lang/String;
    //   214: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: ldc 240
    //   219: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: aload_0
    //   223: getfield 72	com/tencent/liteav/audio/TXCUGCBGMPlayer:mVolume	F
    //   226: invokevirtual 243	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   229: ldc 245
    //   231: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   234: aload_0
    //   235: getfield 74	com/tencent/liteav/audio/TXCUGCBGMPlayer:mSpeedRate	F
    //   238: invokevirtual 243	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   241: ldc 247
    //   243: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: aload_0
    //   247: getfield 76	com/tencent/liteav/audio/TXCUGCBGMPlayer:mStartTimeMS	J
    //   250: invokevirtual 174	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   253: ldc 249
    //   255: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: aload_0
    //   259: getfield 78	com/tencent/liteav/audio/TXCUGCBGMPlayer:mEndTimeMS	J
    //   262: invokevirtual 174	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   265: ldc 251
    //   267: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: aload_0
    //   271: getfield 80	com/tencent/liteav/audio/TXCUGCBGMPlayer:mSeekBytes	J
    //   274: invokevirtual 174	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   277: ldc 253
    //   279: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: aload_0
    //   283: getfield 68	com/tencent/liteav/audio/TXCUGCBGMPlayer:mIsPause	Z
    //   286: invokevirtual 256	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   289: invokevirtual 183	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   292: invokestatic 156	com/tencent/liteav/basic/log/TXCLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   295: aload_0
    //   296: invokespecial 258	com/tencent/liteav/audio/TXCUGCBGMPlayer:nativeGetSampleRate	()I
    //   299: istore 6
    //   301: aload_0
    //   302: invokespecial 260	com/tencent/liteav/audio/TXCUGCBGMPlayer:nativeGetChannels	()I
    //   305: istore 7
    //   307: aload_0
    //   308: invokespecial 262	com/tencent/liteav/audio/TXCUGCBGMPlayer:nativeGetBitsPerChannel	()I
    //   311: istore 8
    //   313: iload 7
    //   315: iconst_1
    //   316: if_icmpne +262 -> 578
    //   319: iconst_2
    //   320: istore 4
    //   322: iload 8
    //   324: bipush 8
    //   326: if_icmpne +247 -> 573
    //   329: iload 6
    //   331: iload 4
    //   333: iload_1
    //   334: invokestatic 266	android/media/AudioTrack:getMinBufferSize	(III)I
    //   337: istore 8
    //   339: new 213	android/media/AudioTrack
    //   342: astore 5
    //   344: aload 5
    //   346: iconst_3
    //   347: iload 6
    //   349: iload 4
    //   351: iload_1
    //   352: iload 8
    //   354: iconst_1
    //   355: invokespecial 269	android/media/AudioTrack:<init>	(IIIIII)V
    //   358: aload 5
    //   360: invokevirtual 272	android/media/AudioTrack:play	()V
    //   363: iload 7
    //   365: sipush 2048
    //   368: imul
    //   369: iconst_2
    //   370: imul
    //   371: istore_1
    //   372: iload_1
    //   373: newarray byte
    //   375: astore 9
    //   377: aload_0
    //   378: getfield 64	com/tencent/liteav/audio/TXCUGCBGMPlayer:mIsRunning	Z
    //   381: ifeq +186 -> 567
    //   384: invokestatic 277	java/lang/Thread:interrupted	()Z
    //   387: ifne +180 -> 567
    //   390: aload_0
    //   391: aload 9
    //   393: iload_1
    //   394: invokespecial 279	com/tencent/liteav/audio/TXCUGCBGMPlayer:nativeRead	([BI)I
    //   397: istore 4
    //   399: iload 4
    //   401: ifge +109 -> 510
    //   404: ldc 21
    //   406: ldc_w 281
    //   409: invokestatic 156	com/tencent/liteav/basic/log/TXCLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   412: aload_0
    //   413: aload_0
    //   414: invokespecial 283	com/tencent/liteav/audio/TXCUGCBGMPlayer:nativeGetCurDurationMS	()J
    //   417: aload_0
    //   418: invokespecial 283	com/tencent/liteav/audio/TXCUGCBGMPlayer:nativeGetCurDurationMS	()J
    //   421: invokespecial 285	com/tencent/liteav/audio/TXCUGCBGMPlayer:onPlayProgress	(JJ)V
    //   424: iconst_0
    //   425: istore 4
    //   427: goto -364 -> 63
    //   430: aload_0
    //   431: invokespecial 190	com/tencent/liteav/audio/TXCUGCBGMPlayer:nativeResume	()V
    //   434: goto -235 -> 199
    //   437: astore 5
    //   439: ldc 21
    //   441: new 165	java/lang/StringBuilder
    //   444: dup
    //   445: ldc_w 287
    //   448: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   451: aload 5
    //   453: invokevirtual 290	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   456: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   459: invokevirtual 183	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   462: invokestatic 211	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   465: bipush 253
    //   467: istore 4
    //   469: aconst_null
    //   470: astore 5
    //   472: goto -409 -> 63
    //   475: astore 9
    //   477: ldc 21
    //   479: new 165	java/lang/StringBuilder
    //   482: dup
    //   483: ldc_w 292
    //   486: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   489: aload 9
    //   491: invokevirtual 290	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   494: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   497: invokevirtual 183	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   500: invokestatic 211	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   503: bipush 252
    //   505: istore 4
    //   507: goto -444 -> 63
    //   510: iload 4
    //   512: ifne +24 -> 536
    //   515: aload_0
    //   516: getfield 68	com/tencent/liteav/audio/TXCUGCBGMPlayer:mIsPause	Z
    //   519: ifeq -142 -> 377
    //   522: ldc2_w 293
    //   525: invokestatic 297	java/lang/Thread:sleep	(J)V
    //   528: goto -151 -> 377
    //   531: astore 10
    //   533: goto -156 -> 377
    //   536: aload 5
    //   538: aload 9
    //   540: iconst_0
    //   541: iload 4
    //   543: invokevirtual 301	android/media/AudioTrack:write	([BII)I
    //   546: pop
    //   547: aload_0
    //   548: aload_0
    //   549: invokespecial 303	com/tencent/liteav/audio/TXCUGCBGMPlayer:nativeGetCurPtsMS	()J
    //   552: aload_0
    //   553: invokespecial 283	com/tencent/liteav/audio/TXCUGCBGMPlayer:nativeGetCurDurationMS	()J
    //   556: invokespecial 285	com/tencent/liteav/audio/TXCUGCBGMPlayer:onPlayProgress	(JJ)V
    //   559: goto -182 -> 377
    //   562: astore 5
    //   564: goto -476 -> 88
    //   567: iconst_0
    //   568: istore 4
    //   570: goto -507 -> 63
    //   573: iconst_2
    //   574: istore_1
    //   575: goto -246 -> 329
    //   578: iconst_3
    //   579: istore 4
    //   581: goto -259 -> 322
    //
    // Exception table:
    //   from	to	target	type
    //   329	358	437	java/lang/Exception
    //   358	363	475	java/lang/Exception
    //   522	528	531	java/lang/InterruptedException
    //   68	88	562	java/lang/Exception
  }

  public void seekBytes(long paramLong)
  {
    AppMethodBeat.i(66718);
    TXCLog.i("AudioCenter:TXCUGCBGMPlayer", "seekBytes:".concat(String.valueOf(paramLong)));
    long l = paramLong;
    if (paramLong < 0L)
    {
      TXCLog.e("AudioCenter:TXCUGCBGMPlayer", "seek bytes can not be negative. change to 0");
      l = 0L;
    }
    this.mSeekBytes = l;
    nativeSeekBytes(l);
    AppMethodBeat.o(66718);
  }

  public void setOnPlayListener(e parame)
  {
    try
    {
      AppMethodBeat.i(66710);
      if (parame == null)
        this.mWeakListener = null;
      WeakReference localWeakReference = new java/lang/ref/WeakReference;
      localWeakReference.<init>(parame);
      this.mWeakListener = localWeakReference;
      AppMethodBeat.o(66710);
      return;
    }
    finally
    {
    }
    throw parame;
  }

  public void setSpeedRate(float paramFloat)
  {
    AppMethodBeat.i(66716);
    TXCLog.i("AudioCenter:TXCUGCBGMPlayer", "setSpeedRate:".concat(String.valueOf(paramFloat)));
    this.mSpeedRate = paramFloat;
    nativeSetSpeedRate(paramFloat);
    AppMethodBeat.o(66716);
  }

  public void setVolume(float paramFloat)
  {
    AppMethodBeat.i(66715);
    this.mVolume = paramFloat;
    nativeSetVolume(paramFloat);
    AppMethodBeat.o(66715);
  }

  public void startPlay(String paramString)
  {
    AppMethodBeat.i(66711);
    TXCLog.i("AudioCenter:TXCUGCBGMPlayer", "startPlay:".concat(String.valueOf(paramString)));
    if ((paramString == null) || (paramString.isEmpty()))
      AppMethodBeat.o(66711);
    while (true)
    {
      return;
      if (this.mIsRunning)
      {
        TXCLog.w("AudioCenter:TXCUGCBGMPlayer", "BGM正在播放中，将重新启动");
        stopPlay();
      }
      this.mIsPause = false;
      this.mSeekBytes = 0L;
      this.mFilePath = paramString;
      this.mIsRunning = true;
      this.mThread = new Thread(this, "UGCBGMPlayer");
      this.mThread.start();
      AppMethodBeat.o(66711);
    }
  }

  public void stopPlay()
  {
    AppMethodBeat.i(66712);
    TXCLog.i("AudioCenter:TXCUGCBGMPlayer", "stopPlay");
    this.mIsRunning = false;
    long l = System.currentTimeMillis();
    if ((this.mThread != null) && (this.mThread.isAlive()) && (Thread.currentThread().getId() != this.mThread.getId()));
    try
    {
      this.mThread.join();
      label64: this.mThread = null;
      try
      {
        nativeStopPlay();
        TXCLog.i("AudioCenter:TXCUGCBGMPlayer", "stopBGMPlay cost(MS): " + (System.currentTimeMillis() - l));
        AppMethodBeat.o(66712);
        return;
      }
      finally
      {
        AppMethodBeat.o(66712);
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      break label64;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.TXCUGCBGMPlayer
 * JD-Core Version:    0.6.2
 */