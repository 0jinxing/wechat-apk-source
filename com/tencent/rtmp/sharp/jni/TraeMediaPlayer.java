package com.tencent.rtmp.sharp.jni;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Timer;
import java.util.TimerTask;

public class TraeMediaPlayer
  implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener
{
  public static final int TRAE_MEDIAPLAER_DATASOURCE_FILEPATH = 2;
  public static final int TRAE_MEDIAPLAER_DATASOURCE_RSID = 0;
  public static final int TRAE_MEDIAPLAER_DATASOURCE_URI = 1;
  public static final int TRAE_MEDIAPLAER_STOP = 100;
  private Context _context;
  private int _durationMS = -1;
  private boolean _hasCall = false;
  private boolean _loop = false;
  int _loopCount = 0;
  private int _prevVolume = -1;
  boolean _ringMode = false;
  private int _streamType = 0;
  private Timer _watchTimer = null;
  private TimerTask _watchTimertask = null;
  private TraeMediaPlayer.a mCallback;
  private MediaPlayer mMediaPlay = null;

  public TraeMediaPlayer(Context paramContext, TraeMediaPlayer.a parama)
  {
    this._context = paramContext;
    this.mCallback = parama;
  }

  private void volumeDo()
  {
    AppMethodBeat.i(65623);
    if ((this.mMediaPlay == null) || (!this._ringMode) || (this._streamType == 2))
      AppMethodBeat.o(65623);
    while (true)
    {
      return;
      try
      {
        AudioManager localAudioManager = (AudioManager)this._context.getSystemService("audio");
        int i = localAudioManager.getStreamVolume(this._streamType);
        int j = localAudioManager.getStreamMaxVolume(this._streamType);
        int k = localAudioManager.getStreamVolume(2);
        int m = localAudioManager.getStreamMaxVolume(2);
        int n = (int)(k * 1.0D / m * j);
        if (QLog.isColorLevel())
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("TraeMediaPlay volumeDo currV:");
          QLog.e("TRAE", 2, i + " maxV:" + j + " currRV:" + k + " maxRV:" + m + " setV:" + n);
        }
        if (n + 1 >= j);
        while (true)
        {
          localAudioManager.setStreamVolume(this._streamType, j, 0);
          this._prevVolume = i;
          AppMethodBeat.o(65623);
          break;
          j = n + 1;
        }
      }
      catch (Exception localException)
      {
        AppMethodBeat.o(65623);
      }
    }
  }

  private void volumeUndo()
  {
    AppMethodBeat.i(65624);
    if ((this.mMediaPlay == null) || (!this._ringMode) || (this._streamType == 2) || (this._prevVolume == -1))
      AppMethodBeat.o(65624);
    while (true)
    {
      return;
      try
      {
        if (QLog.isColorLevel())
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("TraeMediaPlay volumeUndo _prevVolume:");
          QLog.e("TRAE", 2, this._prevVolume);
        }
        ((AudioManager)this._context.getSystemService("audio")).setStreamVolume(this._streamType, this._prevVolume, 0);
        AppMethodBeat.o(65624);
      }
      catch (Exception localException)
      {
        AppMethodBeat.o(65624);
      }
    }
  }

  public int getDuration()
  {
    return this._durationMS;
  }

  public int getStreamType()
  {
    return this._streamType;
  }

  public boolean hasCall()
  {
    return this._hasCall;
  }

  public void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(65621);
    AudioDeviceInterface.LogTraceEntry(" cb:" + this.mCallback + " loopCount:" + this._loopCount + " _loop:" + this._loop);
    if (this._loop)
    {
      if (QLog.isColorLevel())
        QLog.d("TRAE", 2, "loop play,continue...");
      AppMethodBeat.o(65621);
    }
    while (true)
    {
      return;
      try
      {
        if (this._loopCount <= 0)
        {
          volumeUndo();
          if (this.mMediaPlay.isPlaying())
            this.mMediaPlay.stop();
          this.mMediaPlay.reset();
          this.mMediaPlay.release();
          this.mMediaPlay = null;
          if (this.mCallback != null)
            this.mCallback.a();
        }
        while (true)
        {
          label141: AudioDeviceInterface.LogTraceExit();
          AppMethodBeat.o(65621);
          break;
          this.mMediaPlay.start();
          this._loopCount -= 1;
        }
      }
      catch (Exception paramMediaPlayer)
      {
        break label141;
      }
    }
  }

  public boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(65622);
    AudioDeviceInterface.LogTraceEntry(" cb:" + this.mCallback + " arg1:" + paramInt1 + " arg2:" + paramInt2);
    try
    {
      this.mMediaPlay.release();
      label52: this.mMediaPlay = null;
      if (this.mCallback != null)
        this.mCallback.a();
      AudioDeviceInterface.LogTraceExit();
      AppMethodBeat.o(65622);
      return false;
    }
    catch (Exception paramMediaPlayer)
    {
      break label52;
    }
  }

  // ERROR //
  public boolean playRing(int paramInt1, int paramInt2, android.net.Uri paramUri, java.lang.String paramString, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, boolean paramBoolean3, int paramInt4)
  {
    // Byte code:
    //   0: ldc 221
    //   2: invokestatic 83	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 109	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   8: ifeq +129 -> 137
    //   11: new 111	java/lang/StringBuilder
    //   14: dup
    //   15: ldc 223
    //   17: invokespecial 116	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   20: iload_1
    //   21: invokevirtual 122	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   24: ldc 225
    //   26: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: iload_2
    //   30: invokevirtual 122	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   33: ldc 227
    //   35: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: aload_3
    //   39: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   42: ldc 229
    //   44: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: aload 4
    //   49: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: ldc 231
    //   54: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: astore 10
    //   59: iload 5
    //   61: ifeq +156 -> 217
    //   64: ldc 233
    //   66: astore 11
    //   68: aload 10
    //   70: aload 11
    //   72: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: ldc 235
    //   77: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: iload 6
    //   82: invokevirtual 122	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   85: ldc 237
    //   87: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: astore 10
    //   92: iload 7
    //   94: ifeq +130 -> 224
    //   97: ldc 233
    //   99: astore 11
    //   101: ldc 118
    //   103: iconst_2
    //   104: aload 10
    //   106: aload 11
    //   108: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: ldc 239
    //   113: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: iload 8
    //   118: invokevirtual 168	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   121: ldc 241
    //   123: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: iload 9
    //   128: invokevirtual 122	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   131: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   134: invokestatic 141	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   137: iload 5
    //   139: ifne +98 -> 237
    //   142: iload 6
    //   144: ifgt +93 -> 237
    //   147: invokestatic 109	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   150: ifeq +56 -> 206
    //   153: new 111	java/lang/StringBuilder
    //   156: dup
    //   157: ldc 243
    //   159: invokespecial 116	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   162: iload_1
    //   163: invokevirtual 122	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   166: ldc 231
    //   168: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: astore 4
    //   173: iload 5
    //   175: ifeq +56 -> 231
    //   178: ldc 233
    //   180: astore_3
    //   181: ldc 118
    //   183: iconst_2
    //   184: aload 4
    //   186: aload_3
    //   187: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: ldc 235
    //   192: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: iload 6
    //   197: invokevirtual 122	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   200: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   203: invokestatic 141	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   206: iconst_0
    //   207: istore 5
    //   209: ldc 221
    //   211: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   214: iload 5
    //   216: ireturn
    //   217: ldc 245
    //   219: astore 11
    //   221: goto -153 -> 68
    //   224: ldc 245
    //   226: astore 11
    //   228: goto -127 -> 101
    //   231: ldc 245
    //   233: astore_3
    //   234: goto -53 -> 181
    //   237: aload_0
    //   238: getfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   241: ifnull +40 -> 281
    //   244: aload_0
    //   245: getfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   248: invokevirtual 185	android/media/MediaPlayer:isPlaying	()Z
    //   251: istore 12
    //   253: iload 12
    //   255: ifeq +14 -> 269
    //   258: iconst_0
    //   259: istore 5
    //   261: ldc 221
    //   263: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   266: goto -52 -> 214
    //   269: aload_0
    //   270: getfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   273: invokevirtual 194	android/media/MediaPlayer:release	()V
    //   276: aload_0
    //   277: aconst_null
    //   278: putfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   281: aload_0
    //   282: getfield 60	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_watchTimer	Ljava/util/Timer;
    //   285: ifnull +20 -> 305
    //   288: aload_0
    //   289: getfield 60	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_watchTimer	Ljava/util/Timer;
    //   292: invokevirtual 250	java/util/Timer:cancel	()V
    //   295: aload_0
    //   296: aconst_null
    //   297: putfield 60	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_watchTimer	Ljava/util/Timer;
    //   300: aload_0
    //   301: aconst_null
    //   302: putfield 62	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_watchTimertask	Ljava/util/TimerTask;
    //   305: aload_0
    //   306: getfield 66	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_context	Landroid/content/Context;
    //   309: ldc 88
    //   311: invokevirtual 94	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   314: checkcast 96	android/media/AudioManager
    //   317: astore 11
    //   319: new 182	android/media/MediaPlayer
    //   322: astore 10
    //   324: aload 10
    //   326: invokespecial 251	android/media/MediaPlayer:<init>	()V
    //   329: aload_0
    //   330: aload 10
    //   332: putfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   335: aload_0
    //   336: getfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   339: ifnonnull +225 -> 564
    //   342: aload_0
    //   343: getfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   346: invokevirtual 194	android/media/MediaPlayer:release	()V
    //   349: aload_0
    //   350: aconst_null
    //   351: putfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   354: iconst_0
    //   355: istore 5
    //   357: ldc 221
    //   359: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   362: goto -148 -> 214
    //   365: astore 11
    //   367: aload_0
    //   368: aconst_null
    //   369: putfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   372: goto -91 -> 281
    //   375: astore_3
    //   376: invokestatic 109	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   379: ifeq +46 -> 425
    //   382: new 111	java/lang/StringBuilder
    //   385: astore 4
    //   387: aload 4
    //   389: ldc 253
    //   391: invokespecial 116	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   394: ldc 118
    //   396: iconst_2
    //   397: aload 4
    //   399: aload_3
    //   400: invokevirtual 256	java/lang/IllegalStateException:getLocalizedMessage	()Ljava/lang/String;
    //   403: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   406: ldc_w 258
    //   409: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   412: aload_3
    //   413: invokevirtual 261	java/lang/IllegalStateException:getMessage	()Ljava/lang/String;
    //   416: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   419: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   422: invokestatic 178	com/tencent/rtmp/sharp/jni/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   425: aload_0
    //   426: getfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   429: invokevirtual 194	android/media/MediaPlayer:release	()V
    //   432: aload_0
    //   433: aconst_null
    //   434: putfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   437: iconst_0
    //   438: istore 5
    //   440: ldc 221
    //   442: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   445: goto -231 -> 214
    //   448: astore_3
    //   449: aload_0
    //   450: aconst_null
    //   451: putfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   454: ldc 221
    //   456: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   459: aload_3
    //   460: athrow
    //   461: astore_3
    //   462: invokestatic 109	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   465: ifeq -40 -> 425
    //   468: new 111	java/lang/StringBuilder
    //   471: astore 4
    //   473: aload 4
    //   475: ldc_w 263
    //   478: invokespecial 116	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   481: ldc 118
    //   483: iconst_2
    //   484: aload 4
    //   486: aload_3
    //   487: invokevirtual 264	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   490: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   493: ldc_w 258
    //   496: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   499: aload_3
    //   500: invokevirtual 265	java/io/IOException:getMessage	()Ljava/lang/String;
    //   503: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   506: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   509: invokestatic 178	com/tencent/rtmp/sharp/jni/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   512: goto -87 -> 425
    //   515: astore_3
    //   516: invokestatic 109	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   519: ifeq -94 -> 425
    //   522: ldc 118
    //   524: iconst_2
    //   525: new 111	java/lang/StringBuilder
    //   528: dup
    //   529: ldc_w 267
    //   532: invokespecial 116	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   535: aload_3
    //   536: invokevirtual 268	java/lang/Exception:getLocalizedMessage	()Ljava/lang/String;
    //   539: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   542: ldc_w 258
    //   545: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   548: aload_3
    //   549: invokevirtual 269	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   552: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   555: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   558: invokestatic 178	com/tencent/rtmp/sharp/jni/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   561: goto -136 -> 425
    //   564: aload_0
    //   565: getfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   568: aload_0
    //   569: invokevirtual 273	android/media/MediaPlayer:setOnCompletionListener	(Landroid/media/MediaPlayer$OnCompletionListener;)V
    //   572: aload_0
    //   573: getfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   576: aload_0
    //   577: invokevirtual 277	android/media/MediaPlayer:setOnErrorListener	(Landroid/media/MediaPlayer$OnErrorListener;)V
    //   580: iload_1
    //   581: tableswitch	default:+27 -> 608, 0:+81->662, 1:+244->825, 2:+335->916
    //   609: nop
    //   610: ldiv
    //   611: ifeq +19 -> 630
    //   614: ldc 118
    //   616: iconst_2
    //   617: ldc_w 279
    //   620: iload_1
    //   621: invokestatic 285	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   624: invokevirtual 289	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   627: invokestatic 141	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   630: aload_0
    //   631: getfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   634: invokevirtual 194	android/media/MediaPlayer:release	()V
    //   637: aload_0
    //   638: aconst_null
    //   639: putfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   642: aload_0
    //   643: getfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   646: astore_3
    //   647: aload_3
    //   648: ifnonnull +303 -> 951
    //   651: iconst_0
    //   652: istore 5
    //   654: ldc 221
    //   656: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   659: goto -445 -> 214
    //   662: invokestatic 109	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   665: ifeq +19 -> 684
    //   668: ldc 118
    //   670: iconst_2
    //   671: ldc_w 291
    //   674: iload_2
    //   675: invokestatic 285	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   678: invokevirtual 289	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   681: invokestatic 141	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   684: aload_0
    //   685: getfield 66	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_context	Landroid/content/Context;
    //   688: invokevirtual 295	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   691: iload_2
    //   692: invokevirtual 301	android/content/res/Resources:openRawResourceFd	(I)Landroid/content/res/AssetFileDescriptor;
    //   695: astore_3
    //   696: aload_3
    //   697: ifnonnull +48 -> 745
    //   700: invokestatic 109	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   703: ifeq +19 -> 722
    //   706: ldc 118
    //   708: iconst_2
    //   709: ldc_w 303
    //   712: iload_2
    //   713: invokestatic 285	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   716: invokevirtual 289	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   719: invokestatic 141	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   722: aload_0
    //   723: getfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   726: invokevirtual 194	android/media/MediaPlayer:release	()V
    //   729: aload_0
    //   730: aconst_null
    //   731: putfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   734: iconst_0
    //   735: istore 5
    //   737: ldc 221
    //   739: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   742: goto -528 -> 214
    //   745: aload_0
    //   746: getfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   749: aload_3
    //   750: invokevirtual 309	android/content/res/AssetFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   753: aload_3
    //   754: invokevirtual 313	android/content/res/AssetFileDescriptor:getStartOffset	()J
    //   757: aload_3
    //   758: invokevirtual 316	android/content/res/AssetFileDescriptor:getLength	()J
    //   761: invokevirtual 320	android/media/MediaPlayer:setDataSource	(Ljava/io/FileDescriptor;JJ)V
    //   764: aload_3
    //   765: invokevirtual 323	android/content/res/AssetFileDescriptor:close	()V
    //   768: goto -126 -> 642
    //   771: astore_3
    //   772: invokestatic 109	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   775: ifeq -350 -> 425
    //   778: new 111	java/lang/StringBuilder
    //   781: astore 4
    //   783: aload 4
    //   785: ldc_w 325
    //   788: invokespecial 116	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   791: ldc 118
    //   793: iconst_2
    //   794: aload 4
    //   796: aload_3
    //   797: invokevirtual 326	java/lang/IllegalArgumentException:getLocalizedMessage	()Ljava/lang/String;
    //   800: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   803: ldc_w 258
    //   806: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   809: aload_3
    //   810: invokevirtual 327	java/lang/IllegalArgumentException:getMessage	()Ljava/lang/String;
    //   813: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   816: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   819: invokestatic 178	com/tencent/rtmp/sharp/jni/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   822: goto -397 -> 425
    //   825: invokestatic 109	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   828: ifeq +19 -> 847
    //   831: ldc 118
    //   833: iconst_2
    //   834: ldc_w 329
    //   837: aload_3
    //   838: invokestatic 332	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   841: invokevirtual 289	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   844: invokestatic 141	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   847: aload_0
    //   848: getfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   851: aload_0
    //   852: getfield 66	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_context	Landroid/content/Context;
    //   855: aload_3
    //   856: invokevirtual 335	android/media/MediaPlayer:setDataSource	(Landroid/content/Context;Landroid/net/Uri;)V
    //   859: goto -217 -> 642
    //   862: astore 4
    //   864: invokestatic 109	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   867: ifeq -442 -> 425
    //   870: new 111	java/lang/StringBuilder
    //   873: astore_3
    //   874: aload_3
    //   875: ldc_w 337
    //   878: invokespecial 116	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   881: ldc 118
    //   883: iconst_2
    //   884: aload_3
    //   885: aload 4
    //   887: invokevirtual 338	java/lang/SecurityException:getLocalizedMessage	()Ljava/lang/String;
    //   890: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   893: ldc_w 258
    //   896: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   899: aload 4
    //   901: invokevirtual 339	java/lang/SecurityException:getMessage	()Ljava/lang/String;
    //   904: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   907: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   910: invokestatic 178	com/tencent/rtmp/sharp/jni/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   913: goto -488 -> 425
    //   916: invokestatic 109	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   919: ifeq +20 -> 939
    //   922: ldc 118
    //   924: iconst_2
    //   925: ldc_w 341
    //   928: aload 4
    //   930: invokestatic 332	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   933: invokevirtual 289	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   936: invokestatic 141	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   939: aload_0
    //   940: getfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   943: aload 4
    //   945: invokevirtual 343	android/media/MediaPlayer:setDataSource	(Ljava/lang/String;)V
    //   948: goto -306 -> 642
    //   951: aload_0
    //   952: iload 7
    //   954: putfield 58	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_ringMode	Z
    //   957: iconst_0
    //   958: istore_1
    //   959: aload_0
    //   960: getfield 58	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_ringMode	Z
    //   963: ifeq +222 -> 1185
    //   966: aload_0
    //   967: iconst_2
    //   968: putfield 48	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_streamType	I
    //   971: iconst_1
    //   972: istore_1
    //   973: aload_0
    //   974: iload 8
    //   976: putfield 50	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_hasCall	Z
    //   979: aload_0
    //   980: getfield 50	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_hasCall	Z
    //   983: ifeq +9 -> 992
    //   986: aload_0
    //   987: iload 9
    //   989: putfield 48	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_streamType	I
    //   992: aload_0
    //   993: getfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   996: aload_0
    //   997: getfield 48	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_streamType	I
    //   1000: invokevirtual 346	android/media/MediaPlayer:setAudioStreamType	(I)V
    //   1003: aload_0
    //   1004: getfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   1007: invokevirtual 349	android/media/MediaPlayer:prepare	()V
    //   1010: aload_0
    //   1011: getfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   1014: iload 5
    //   1016: invokevirtual 353	android/media/MediaPlayer:setLooping	(Z)V
    //   1019: aload_0
    //   1020: getfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   1023: invokevirtual 203	android/media/MediaPlayer:start	()V
    //   1026: aload_0
    //   1027: iload 5
    //   1029: putfield 52	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_loop	Z
    //   1032: aload_0
    //   1033: getfield 52	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_loop	Z
    //   1036: iconst_1
    //   1037: if_icmpne +166 -> 1203
    //   1040: aload_0
    //   1041: iconst_1
    //   1042: putfield 56	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_loopCount	I
    //   1045: aload_0
    //   1046: iconst_m1
    //   1047: putfield 54	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_durationMS	I
    //   1050: aload_0
    //   1051: aload_0
    //   1052: getfield 56	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_loopCount	I
    //   1055: iconst_1
    //   1056: isub
    //   1057: putfield 56	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_loopCount	I
    //   1060: aload_0
    //   1061: getfield 50	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_hasCall	Z
    //   1064: ifne +9 -> 1073
    //   1067: aload 11
    //   1069: iload_1
    //   1070: invokevirtual 356	android/media/AudioManager:setMode	(I)V
    //   1073: aload_0
    //   1074: getfield 54	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_durationMS	I
    //   1077: ifle +50 -> 1127
    //   1080: new 247	java/util/Timer
    //   1083: astore_3
    //   1084: aload_3
    //   1085: invokespecial 357	java/util/Timer:<init>	()V
    //   1088: aload_0
    //   1089: aload_3
    //   1090: putfield 60	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_watchTimer	Ljava/util/Timer;
    //   1093: new 10	com/tencent/rtmp/sharp/jni/TraeMediaPlayer$1
    //   1096: astore_3
    //   1097: aload_3
    //   1098: aload_0
    //   1099: invokespecial 360	com/tencent/rtmp/sharp/jni/TraeMediaPlayer$1:<init>	(Lcom/tencent/rtmp/sharp/jni/TraeMediaPlayer;)V
    //   1102: aload_0
    //   1103: aload_3
    //   1104: putfield 62	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_watchTimertask	Ljava/util/TimerTask;
    //   1107: aload_0
    //   1108: getfield 60	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_watchTimer	Ljava/util/Timer;
    //   1111: aload_0
    //   1112: getfield 62	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_watchTimertask	Ljava/util/TimerTask;
    //   1115: aload_0
    //   1116: getfield 54	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_durationMS	I
    //   1119: sipush 1000
    //   1122: iadd
    //   1123: i2l
    //   1124: invokevirtual 364	java/util/Timer:schedule	(Ljava/util/TimerTask;J)V
    //   1127: invokestatic 109	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   1130: ifeq +44 -> 1174
    //   1133: new 111	java/lang/StringBuilder
    //   1136: astore_3
    //   1137: aload_3
    //   1138: ldc_w 366
    //   1141: invokespecial 116	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1144: ldc 118
    //   1146: iconst_2
    //   1147: aload_3
    //   1148: aload_0
    //   1149: getfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   1152: invokevirtual 368	android/media/MediaPlayer:getDuration	()I
    //   1155: invokevirtual 122	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1158: ldc 231
    //   1160: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1163: iload 5
    //   1165: invokevirtual 168	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   1168: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1171: invokestatic 141	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   1174: iconst_1
    //   1175: istore 5
    //   1177: ldc 221
    //   1179: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1182: goto -968 -> 214
    //   1185: aload_0
    //   1186: iconst_0
    //   1187: putfield 48	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_streamType	I
    //   1190: getstatic 373	android/os/Build$VERSION:SDK_INT	I
    //   1193: bipush 11
    //   1195: if_icmplt -222 -> 973
    //   1198: iconst_3
    //   1199: istore_1
    //   1200: goto -227 -> 973
    //   1203: aload_0
    //   1204: iload 6
    //   1206: putfield 56	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_loopCount	I
    //   1209: aload_0
    //   1210: aload_0
    //   1211: getfield 56	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_loopCount	I
    //   1214: aload_0
    //   1215: getfield 46	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:mMediaPlay	Landroid/media/MediaPlayer;
    //   1218: invokevirtual 368	android/media/MediaPlayer:getDuration	()I
    //   1221: imul
    //   1222: putfield 54	com/tencent/rtmp/sharp/jni/TraeMediaPlayer:_durationMS	I
    //   1225: goto -175 -> 1050
    //   1228: astore_3
    //   1229: goto -797 -> 432
    //
    // Exception table:
    //   from	to	target	type
    //   269	276	365	java/lang/Exception
    //   237	253	375	java/lang/IllegalStateException
    //   276	281	375	java/lang/IllegalStateException
    //   281	305	375	java/lang/IllegalStateException
    //   305	354	375	java/lang/IllegalStateException
    //   367	372	375	java/lang/IllegalStateException
    //   449	461	375	java/lang/IllegalStateException
    //   564	580	375	java/lang/IllegalStateException
    //   608	630	375	java/lang/IllegalStateException
    //   630	642	375	java/lang/IllegalStateException
    //   642	647	375	java/lang/IllegalStateException
    //   662	684	375	java/lang/IllegalStateException
    //   684	696	375	java/lang/IllegalStateException
    //   700	722	375	java/lang/IllegalStateException
    //   722	734	375	java/lang/IllegalStateException
    //   745	768	375	java/lang/IllegalStateException
    //   825	847	375	java/lang/IllegalStateException
    //   847	859	375	java/lang/IllegalStateException
    //   916	939	375	java/lang/IllegalStateException
    //   939	948	375	java/lang/IllegalStateException
    //   951	957	375	java/lang/IllegalStateException
    //   959	971	375	java/lang/IllegalStateException
    //   973	992	375	java/lang/IllegalStateException
    //   992	1050	375	java/lang/IllegalStateException
    //   1050	1073	375	java/lang/IllegalStateException
    //   1073	1127	375	java/lang/IllegalStateException
    //   1127	1174	375	java/lang/IllegalStateException
    //   1185	1190	375	java/lang/IllegalStateException
    //   1190	1198	375	java/lang/IllegalStateException
    //   1203	1225	375	java/lang/IllegalStateException
    //   269	276	448	finally
    //   237	253	461	java/io/IOException
    //   276	281	461	java/io/IOException
    //   281	305	461	java/io/IOException
    //   305	354	461	java/io/IOException
    //   367	372	461	java/io/IOException
    //   449	461	461	java/io/IOException
    //   564	580	461	java/io/IOException
    //   608	630	461	java/io/IOException
    //   630	642	461	java/io/IOException
    //   642	647	461	java/io/IOException
    //   662	684	461	java/io/IOException
    //   684	696	461	java/io/IOException
    //   700	722	461	java/io/IOException
    //   722	734	461	java/io/IOException
    //   745	768	461	java/io/IOException
    //   825	847	461	java/io/IOException
    //   847	859	461	java/io/IOException
    //   916	939	461	java/io/IOException
    //   939	948	461	java/io/IOException
    //   951	957	461	java/io/IOException
    //   959	971	461	java/io/IOException
    //   973	992	461	java/io/IOException
    //   992	1050	461	java/io/IOException
    //   1050	1073	461	java/io/IOException
    //   1073	1127	461	java/io/IOException
    //   1127	1174	461	java/io/IOException
    //   1185	1190	461	java/io/IOException
    //   1190	1198	461	java/io/IOException
    //   1203	1225	461	java/io/IOException
    //   237	253	515	java/lang/Exception
    //   276	281	515	java/lang/Exception
    //   281	305	515	java/lang/Exception
    //   305	354	515	java/lang/Exception
    //   367	372	515	java/lang/Exception
    //   376	425	515	java/lang/Exception
    //   449	461	515	java/lang/Exception
    //   462	512	515	java/lang/Exception
    //   564	580	515	java/lang/Exception
    //   608	630	515	java/lang/Exception
    //   630	642	515	java/lang/Exception
    //   642	647	515	java/lang/Exception
    //   662	684	515	java/lang/Exception
    //   684	696	515	java/lang/Exception
    //   700	722	515	java/lang/Exception
    //   722	734	515	java/lang/Exception
    //   745	768	515	java/lang/Exception
    //   772	822	515	java/lang/Exception
    //   825	847	515	java/lang/Exception
    //   847	859	515	java/lang/Exception
    //   864	913	515	java/lang/Exception
    //   916	939	515	java/lang/Exception
    //   939	948	515	java/lang/Exception
    //   951	957	515	java/lang/Exception
    //   959	971	515	java/lang/Exception
    //   973	992	515	java/lang/Exception
    //   992	1050	515	java/lang/Exception
    //   1050	1073	515	java/lang/Exception
    //   1073	1127	515	java/lang/Exception
    //   1127	1174	515	java/lang/Exception
    //   1185	1190	515	java/lang/Exception
    //   1190	1198	515	java/lang/Exception
    //   1203	1225	515	java/lang/Exception
    //   237	253	771	java/lang/IllegalArgumentException
    //   276	281	771	java/lang/IllegalArgumentException
    //   281	305	771	java/lang/IllegalArgumentException
    //   305	354	771	java/lang/IllegalArgumentException
    //   367	372	771	java/lang/IllegalArgumentException
    //   449	461	771	java/lang/IllegalArgumentException
    //   564	580	771	java/lang/IllegalArgumentException
    //   608	630	771	java/lang/IllegalArgumentException
    //   630	642	771	java/lang/IllegalArgumentException
    //   642	647	771	java/lang/IllegalArgumentException
    //   662	684	771	java/lang/IllegalArgumentException
    //   684	696	771	java/lang/IllegalArgumentException
    //   700	722	771	java/lang/IllegalArgumentException
    //   722	734	771	java/lang/IllegalArgumentException
    //   745	768	771	java/lang/IllegalArgumentException
    //   825	847	771	java/lang/IllegalArgumentException
    //   847	859	771	java/lang/IllegalArgumentException
    //   916	939	771	java/lang/IllegalArgumentException
    //   939	948	771	java/lang/IllegalArgumentException
    //   951	957	771	java/lang/IllegalArgumentException
    //   959	971	771	java/lang/IllegalArgumentException
    //   973	992	771	java/lang/IllegalArgumentException
    //   992	1050	771	java/lang/IllegalArgumentException
    //   1050	1073	771	java/lang/IllegalArgumentException
    //   1073	1127	771	java/lang/IllegalArgumentException
    //   1127	1174	771	java/lang/IllegalArgumentException
    //   1185	1190	771	java/lang/IllegalArgumentException
    //   1190	1198	771	java/lang/IllegalArgumentException
    //   1203	1225	771	java/lang/IllegalArgumentException
    //   237	253	862	java/lang/SecurityException
    //   276	281	862	java/lang/SecurityException
    //   281	305	862	java/lang/SecurityException
    //   305	354	862	java/lang/SecurityException
    //   367	372	862	java/lang/SecurityException
    //   449	461	862	java/lang/SecurityException
    //   564	580	862	java/lang/SecurityException
    //   608	630	862	java/lang/SecurityException
    //   630	642	862	java/lang/SecurityException
    //   642	647	862	java/lang/SecurityException
    //   662	684	862	java/lang/SecurityException
    //   684	696	862	java/lang/SecurityException
    //   700	722	862	java/lang/SecurityException
    //   722	734	862	java/lang/SecurityException
    //   745	768	862	java/lang/SecurityException
    //   825	847	862	java/lang/SecurityException
    //   847	859	862	java/lang/SecurityException
    //   916	939	862	java/lang/SecurityException
    //   939	948	862	java/lang/SecurityException
    //   951	957	862	java/lang/SecurityException
    //   959	971	862	java/lang/SecurityException
    //   973	992	862	java/lang/SecurityException
    //   992	1050	862	java/lang/SecurityException
    //   1050	1073	862	java/lang/SecurityException
    //   1073	1127	862	java/lang/SecurityException
    //   1127	1174	862	java/lang/SecurityException
    //   1185	1190	862	java/lang/SecurityException
    //   1190	1198	862	java/lang/SecurityException
    //   1203	1225	862	java/lang/SecurityException
    //   425	432	1228	java/lang/Exception
  }

  public void stopRing()
  {
    AppMethodBeat.i(65620);
    if (QLog.isColorLevel())
      QLog.d("TRAE", 2, "TraeMediaPlay stopRing ");
    if (this.mMediaPlay == null)
      AppMethodBeat.o(65620);
    while (true)
    {
      return;
      if (this.mMediaPlay.isPlaying())
        this.mMediaPlay.stop();
      this.mMediaPlay.reset();
      try
      {
        if (this._watchTimer != null)
        {
          this._watchTimer.cancel();
          this._watchTimer = null;
          this._watchTimertask = null;
        }
        this.mMediaPlay.release();
        label90: this.mMediaPlay = null;
        this._durationMS = -1;
        AppMethodBeat.o(65620);
      }
      catch (Exception localException)
      {
        break label90;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.sharp.jni.TraeMediaPlayer
 * JD-Core Version:    0.6.2
 */