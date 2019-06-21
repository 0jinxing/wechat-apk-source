package com.tencent.rtmp.sharp.jni;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@TargetApi(16)
public class AudioDeviceInterface
{
  private static boolean _dumpEnable = false;
  private static boolean _logEnable = true;
  private TraeAudioSession _as;
  private AudioManager _audioManager;
  private AudioRecord _audioRecord;
  private boolean _audioRouteChanged;
  private int _audioSource;
  private int _audioSourcePolicy;
  private int _audioStreamTypePolicy;
  private AudioTrack _audioTrack;
  private int _bufferedPlaySamples;
  private int _bufferedRecSamples;
  private int _channelOutType;
  private String _connectedDev;
  private Context _context;
  private boolean _doPlayInit;
  private boolean _doRecInit;
  private TraeAudioSession _init_as;
  private boolean _isPlaying;
  private boolean _isRecording;
  private int _modePolicy;
  private ByteBuffer _playBuffer;
  private final ReentrantLock _playLock;
  private int _playPosition;
  private int _playSamplerate;
  private File _play_dump;
  private FileOutputStream _play_out;
  private boolean _preDone;
  private Condition _precon;
  private ReentrantLock _prelock;
  private ByteBuffer _recBuffer;
  private final ReentrantLock _recLock;
  private File _rec_dump;
  private FileOutputStream _rec_out;
  private int _sceneModeKey;
  private int _sessionId;
  private int _streamType;
  private byte[] _tempBufPlay;
  private byte[] _tempBufRec;
  private int switchState;
  private boolean usingJava;

  public AudioDeviceInterface()
  {
    AppMethodBeat.i(65760);
    this._audioTrack = null;
    this._audioRecord = null;
    this._streamType = 0;
    this._playSamplerate = 8000;
    this._channelOutType = 4;
    this._audioSource = 0;
    this._sceneModeKey = 0;
    this._sessionId = 0;
    this._context = null;
    this._modePolicy = -1;
    this._audioSourcePolicy = -1;
    this._audioStreamTypePolicy = -1;
    this._audioManager = null;
    this._playLock = new ReentrantLock();
    this._recLock = new ReentrantLock();
    this._doPlayInit = true;
    this._doRecInit = true;
    this._isRecording = false;
    this._isPlaying = false;
    this._bufferedRecSamples = 0;
    this._bufferedPlaySamples = 0;
    this._playPosition = 0;
    this._rec_dump = null;
    this._play_dump = null;
    this._rec_out = null;
    this._play_out = null;
    this._as = null;
    this._connectedDev = "DEVICE_NONE";
    this._audioRouteChanged = false;
    this._prelock = new ReentrantLock();
    this._precon = this._prelock.newCondition();
    this._preDone = false;
    this.usingJava = true;
    this.switchState = 0;
    this._init_as = null;
    try
    {
      this._playBuffer = ByteBuffer.allocateDirect(1920);
      this._recBuffer = ByteBuffer.allocateDirect(1920);
      this._tempBufPlay = new byte[1920];
      this._tempBufRec = new byte[1920];
      int i = Build.VERSION.SDK_INT;
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "AudioDeviceInterface apiLevel:".concat(String.valueOf(i)));
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, " SDK_INT:" + Build.VERSION.SDK_INT);
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "manufacture:" + Build.MANUFACTURER);
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "MODEL:" + Build.MODEL);
      AppMethodBeat.o(65760);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        if (QLog.isColorLevel())
          QLog.w("TRAE", 2, localException.getMessage());
    }
  }

  private int GetPlayoutVolume()
  {
    AppMethodBeat.i(65775);
    if ((this._audioManager == null) && (this._context != null))
      this._audioManager = ((AudioManager)this._context.getSystemService("audio"));
    int i = -1;
    if (this._audioManager != null)
      i = this._audioManager.getStreamVolume(0);
    AppMethodBeat.o(65775);
    return i;
  }

  // ERROR //
  private int InitPlayback(int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: ldc_w 259
    //   3: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   9: ifeq +19 -> 28
    //   12: ldc 187
    //   14: iconst_2
    //   15: ldc_w 261
    //   18: iload_1
    //   19: invokestatic 195	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   22: invokevirtual 199	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   25: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   28: aload_0
    //   29: getfield 122	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   32: ifne +15 -> 47
    //   35: aload_0
    //   36: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   39: ifnonnull +8 -> 47
    //   42: iload_2
    //   43: iconst_2
    //   44: if_icmple +45 -> 89
    //   47: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   50: ifeq +29 -> 79
    //   53: ldc 187
    //   55: iconst_2
    //   56: new 205	java/lang/StringBuilder
    //   59: dup
    //   60: ldc_w 263
    //   63: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   66: aload_0
    //   67: getfield 122	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   70: invokevirtual 266	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   73: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   76: invokestatic 269	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   79: iconst_m1
    //   80: istore_1
    //   81: ldc_w 259
    //   84: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   87: iload_1
    //   88: ireturn
    //   89: aload_0
    //   90: getfield 107	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   93: ifnonnull +19 -> 112
    //   96: aload_0
    //   97: aload_0
    //   98: getfield 99	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_context	Landroid/content/Context;
    //   101: ldc 244
    //   103: invokevirtual 250	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   106: checkcast 252	android/media/AudioManager
    //   109: putfield 107	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   112: iload_2
    //   113: iconst_2
    //   114: if_icmpne +506 -> 620
    //   117: aload_0
    //   118: bipush 12
    //   120: putfield 91	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   123: aload_0
    //   124: iload_1
    //   125: putfield 89	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playSamplerate	I
    //   128: iload_1
    //   129: aload_0
    //   130: getfield 91	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   133: iconst_2
    //   134: invokestatic 275	android/media/AudioTrack:getMinBufferSize	(III)I
    //   137: istore_3
    //   138: aload_0
    //   139: getfield 91	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   142: bipush 12
    //   144: if_icmpne +18 -> 162
    //   147: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   150: ifeq +478 -> 628
    //   153: ldc 187
    //   155: iconst_2
    //   156: ldc_w 277
    //   159: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   162: iload_1
    //   163: bipush 20
    //   165: imul
    //   166: iconst_1
    //   167: imul
    //   168: iconst_2
    //   169: imul
    //   170: sipush 1000
    //   173: idiv
    //   174: istore_2
    //   175: aload_0
    //   176: getfield 91	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   179: bipush 12
    //   181: if_icmpne +749 -> 930
    //   184: iload_2
    //   185: iconst_2
    //   186: imul
    //   187: istore_2
    //   188: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   191: ifeq +36 -> 227
    //   194: ldc 187
    //   196: iconst_2
    //   197: new 205	java/lang/StringBuilder
    //   200: dup
    //   201: ldc_w 279
    //   204: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   207: iload_3
    //   208: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   211: ldc_w 281
    //   214: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: iload_2
    //   218: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   221: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   224: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   227: aload_0
    //   228: iconst_0
    //   229: putfield 126	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_bufferedPlaySamples	I
    //   232: aload_0
    //   233: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   236: ifnull +15 -> 251
    //   239: aload_0
    //   240: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   243: invokevirtual 284	android/media/AudioTrack:release	()V
    //   246: aload_0
    //   247: aconst_null
    //   248: putfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   251: iconst_4
    //   252: newarray int
    //   254: astore 4
    //   256: aload 4
    //   258: dup
    //   259: iconst_0
    //   260: iconst_0
    //   261: iastore
    //   262: dup
    //   263: iconst_1
    //   264: iconst_0
    //   265: iastore
    //   266: dup
    //   267: iconst_2
    //   268: iconst_3
    //   269: iastore
    //   270: dup
    //   271: iconst_3
    //   272: iconst_1
    //   273: iastore
    //   274: pop
    //   275: aload_0
    //   276: aload_0
    //   277: getfield 105	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioStreamTypePolicy	I
    //   280: invokestatic 289	com/tencent/rtmp/sharp/jni/TraeAudioManager:getAudioStreamType	(I)I
    //   283: putfield 87	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   286: aload_0
    //   287: getfield 144	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRouteChanged	Z
    //   290: ifeq +81 -> 371
    //   293: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   296: ifeq +42 -> 338
    //   299: ldc 187
    //   301: iconst_2
    //   302: new 205	java/lang/StringBuilder
    //   305: dup
    //   306: ldc_w 291
    //   309: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   312: aload_0
    //   313: getfield 144	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRouteChanged	Z
    //   316: invokevirtual 266	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   319: ldc_w 293
    //   322: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   325: aload_0
    //   326: getfield 87	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   329: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   332: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   335: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   338: aload_0
    //   339: getfield 107	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   342: invokevirtual 296	android/media/AudioManager:getMode	()I
    //   345: ifne +309 -> 654
    //   348: aload_0
    //   349: getfield 142	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_connectedDev	Ljava/lang/String;
    //   352: ldc_w 298
    //   355: invokevirtual 302	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   358: ifeq +296 -> 654
    //   361: aload_0
    //   362: iconst_3
    //   363: putfield 87	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   366: aload_0
    //   367: iconst_0
    //   368: putfield 144	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRouteChanged	Z
    //   371: aload 4
    //   373: iconst_0
    //   374: aload_0
    //   375: getfield 87	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   378: iastore
    //   379: iconst_0
    //   380: istore 5
    //   382: iload_3
    //   383: istore_1
    //   384: iload 5
    //   386: iconst_4
    //   387: if_icmpge +348 -> 735
    //   390: aload_0
    //   391: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   394: ifnonnull +341 -> 735
    //   397: aload_0
    //   398: aload 4
    //   400: iload 5
    //   402: iaload
    //   403: putfield 87	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   406: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   409: ifeq +42 -> 451
    //   412: ldc 187
    //   414: iconst_2
    //   415: new 205	java/lang/StringBuilder
    //   418: dup
    //   419: ldc_w 304
    //   422: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   425: iload_3
    //   426: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   429: ldc_w 306
    //   432: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   435: aload_0
    //   436: getfield 87	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   439: invokestatic 309	android/media/AudioTrack:getNativeOutputSampleRate	(I)I
    //   442: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   445: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   448: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   451: iconst_1
    //   452: istore 6
    //   454: iload 6
    //   456: iconst_2
    //   457: if_icmpgt +272 -> 729
    //   460: iload_3
    //   461: iload 6
    //   463: imul
    //   464: istore 7
    //   466: iload 7
    //   468: iload_2
    //   469: iconst_4
    //   470: imul
    //   471: if_icmpge +9 -> 480
    //   474: iload 6
    //   476: iconst_2
    //   477: if_icmplt +104 -> 581
    //   480: new 271	android/media/AudioTrack
    //   483: astore 8
    //   485: aload 8
    //   487: aload_0
    //   488: getfield 87	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   491: aload_0
    //   492: getfield 89	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playSamplerate	I
    //   495: aload_0
    //   496: getfield 91	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   499: iconst_2
    //   500: iload 7
    //   502: iconst_1
    //   503: invokespecial 312	android/media/AudioTrack:<init>	(IIIIII)V
    //   506: aload_0
    //   507: aload 8
    //   509: putfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   512: iload 7
    //   514: istore_1
    //   515: aload_0
    //   516: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   519: invokevirtual 315	android/media/AudioTrack:getState	()I
    //   522: iconst_1
    //   523: if_icmpeq +206 -> 729
    //   526: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   529: ifeq +40 -> 569
    //   532: ldc 187
    //   534: iconst_2
    //   535: new 205	java/lang/StringBuilder
    //   538: dup
    //   539: ldc_w 317
    //   542: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   545: iload 7
    //   547: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   550: ldc_w 319
    //   553: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   556: aload_0
    //   557: getfield 89	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playSamplerate	I
    //   560: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   563: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   566: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   569: aload_0
    //   570: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   573: invokevirtual 284	android/media/AudioTrack:release	()V
    //   576: aload_0
    //   577: aconst_null
    //   578: putfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   581: iinc 6 1
    //   584: iload 7
    //   586: istore_1
    //   587: goto -133 -> 454
    //   590: astore 4
    //   592: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   595: ifeq +14 -> 609
    //   598: ldc 187
    //   600: iconst_2
    //   601: aload 4
    //   603: invokevirtual 239	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   606: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   609: iconst_m1
    //   610: istore_1
    //   611: ldc_w 259
    //   614: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   617: goto -530 -> 87
    //   620: aload_0
    //   621: iconst_4
    //   622: putfield 91	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   625: goto -502 -> 123
    //   628: aload_0
    //   629: getfield 91	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   632: iconst_4
    //   633: if_icmpne -471 -> 162
    //   636: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   639: ifeq -477 -> 162
    //   642: ldc 187
    //   644: iconst_2
    //   645: ldc_w 321
    //   648: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   651: goto -489 -> 162
    //   654: aload_0
    //   655: iconst_0
    //   656: putfield 87	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   659: goto -293 -> 366
    //   662: astore 8
    //   664: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   667: ifeq +40 -> 707
    //   670: ldc 187
    //   672: iconst_2
    //   673: new 205	java/lang/StringBuilder
    //   676: dup
    //   677: invokespecial 322	java/lang/StringBuilder:<init>	()V
    //   680: aload 8
    //   682: invokevirtual 239	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   685: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   688: ldc_w 324
    //   691: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   694: aload_0
    //   695: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   698: invokevirtual 327	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   701: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   704: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   707: aload_0
    //   708: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   711: ifnull +10 -> 721
    //   714: aload_0
    //   715: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   718: invokevirtual 284	android/media/AudioTrack:release	()V
    //   721: aload_0
    //   722: aconst_null
    //   723: putfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   726: goto -145 -> 581
    //   729: iinc 5 1
    //   732: goto -348 -> 384
    //   735: aload_0
    //   736: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   739: ifnonnull +29 -> 768
    //   742: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   745: ifeq +12 -> 757
    //   748: ldc 187
    //   750: iconst_2
    //   751: ldc_w 329
    //   754: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   757: iconst_m1
    //   758: istore_1
    //   759: ldc_w 259
    //   762: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   765: goto -678 -> 87
    //   768: aload_0
    //   769: getfield 138	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_as	Lcom/tencent/rtmp/sharp/jni/TraeAudioSession;
    //   772: ifnull +29 -> 801
    //   775: aload_0
    //   776: getfield 107	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   779: ifnull +22 -> 801
    //   782: aload_0
    //   783: getfield 138	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_as	Lcom/tencent/rtmp/sharp/jni/TraeAudioSession;
    //   786: aload_0
    //   787: getfield 107	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   790: invokevirtual 296	android/media/AudioManager:getMode	()I
    //   793: aload_0
    //   794: getfield 87	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   797: invokevirtual 334	com/tencent/rtmp/sharp/jni/TraeAudioSession:voiceCallAudioParamChanged	(II)I
    //   800: pop
    //   801: aload_0
    //   802: aload_0
    //   803: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   806: invokevirtual 337	android/media/AudioTrack:getPlaybackHeadPosition	()I
    //   809: putfield 128	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playPosition	I
    //   812: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   815: ifeq +65 -> 880
    //   818: ldc 187
    //   820: iconst_2
    //   821: new 205	java/lang/StringBuilder
    //   824: dup
    //   825: ldc_w 339
    //   828: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   831: aload_0
    //   832: getfield 87	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   835: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   838: ldc_w 341
    //   841: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   844: aload_0
    //   845: getfield 89	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playSamplerate	I
    //   848: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   851: ldc_w 343
    //   854: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   857: aload_0
    //   858: getfield 128	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playPosition	I
    //   861: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   864: ldc_w 345
    //   867: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   870: iload_1
    //   871: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   874: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   877: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   880: aload_0
    //   881: getfield 107	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   884: astore 4
    //   886: aload_0
    //   887: getfield 142	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_connectedDev	Ljava/lang/String;
    //   890: ldc_w 347
    //   893: invokevirtual 302	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   896: ifeq +23 -> 919
    //   899: bipush 6
    //   901: istore_1
    //   902: aload 4
    //   904: iload_1
    //   905: invokestatic 351	com/tencent/rtmp/sharp/jni/TraeAudioManager:forceVolumeControlStream	(Landroid/media/AudioManager;I)V
    //   908: iconst_0
    //   909: istore_1
    //   910: ldc_w 259
    //   913: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   916: goto -829 -> 87
    //   919: aload_0
    //   920: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   923: invokevirtual 354	android/media/AudioTrack:getStreamType	()I
    //   926: istore_1
    //   927: goto -25 -> 902
    //   930: goto -742 -> 188
    //
    // Exception table:
    //   from	to	target	type
    //   96	112	590	java/lang/Exception
    //   480	512	662	java/lang/Exception
  }

  private int InitRecording(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(65764);
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "InitRecording entry:".concat(String.valueOf(paramInt1)));
    if ((this._isRecording) || (this._audioRecord != null) || (paramInt2 > 2))
    {
      if (QLog.isColorLevel())
        QLog.e("TRAE", 2, "InitRecording _isRecording:" + this._isRecording);
      paramInt1 = -1;
      AppMethodBeat.o(65764);
    }
    while (true)
    {
      return paramInt1;
      int i = 16;
      if (paramInt2 == 2)
        i = 12;
      int j = AudioRecord.getMinBufferSize(paramInt1, i, 2);
      int k = paramInt1 * 20 * paramInt2 * 2 / 1000;
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "InitRecording: min rec buf size is " + j + " sr:" + getLowlatencySamplerate() + " fp" + getLowlatencyFramesPerBuffer() + " 20msFZ:" + k);
      this._bufferedRecSamples = (paramInt1 * 5 / 200);
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "  rough rec delay set to " + this._bufferedRecSamples);
      if (this._audioRecord != null)
      {
        this._audioRecord.release();
        this._audioRecord = null;
      }
      int[] arrayOfInt = new int[4];
      int[] tmp258_256 = arrayOfInt;
      tmp258_256[0] = 0;
      int[] tmp262_258 = tmp258_256;
      tmp262_258[1] = 1;
      int[] tmp266_262 = tmp262_258;
      tmp266_262[2] = 5;
      int[] tmp270_266 = tmp266_262;
      tmp270_266[3] = 0;
      tmp270_266;
      arrayOfInt[0] = TraeAudioManager.getAudioSource(this._audioSourcePolicy);
      int m = 0;
      paramInt2 = j;
      while ((m < 4) && (this._audioRecord == null))
      {
        this._audioSource = arrayOfInt[m];
        int n = 1;
        while (true)
          if (n <= 2)
          {
            int i1 = j * n;
            if ((i1 >= k * 4) || (n >= 2));
            try
            {
              AudioRecord localAudioRecord = new android/media/AudioRecord;
              localAudioRecord.<init>(this._audioSource, paramInt1, i, 2, i1);
              this._audioRecord = localAudioRecord;
              paramInt2 = i1;
              if (this._audioRecord.getState() != 1)
              {
                if (QLog.isColorLevel())
                  QLog.w("TRAE", 2, "InitRecording:  rec not initialized,try agine,  minbufsize:" + i1 + " sr:" + paramInt1 + " as:" + this._audioSource);
                this._audioRecord.release();
                this._audioRecord = null;
                n++;
                paramInt2 = i1;
              }
            }
            catch (Exception localException)
            {
              while (true)
              {
                if (QLog.isColorLevel())
                  QLog.w("TRAE", 2, localException.getMessage() + " _audioRecord:" + this._audioRecord);
                if (this._audioRecord != null)
                  this._audioRecord.release();
                this._audioRecord = null;
              }
            }
          }
        m++;
      }
      if (this._audioRecord == null)
      {
        if (QLog.isColorLevel())
          QLog.w("TRAE", 2, "InitRecording fail!!!");
        paramInt1 = -1;
        AppMethodBeat.o(65764);
      }
      else
      {
        if (QLog.isColorLevel())
          QLog.w("TRAE", 2, " [Config] InitRecording: audioSession:" + this._sessionId + " audioSource:" + this._audioSource + " rec sample rate set to " + paramInt1 + " recBufSize:" + paramInt2);
        if (QLog.isColorLevel())
          QLog.w("TRAE", 2, "InitRecording exit");
        paramInt1 = this._bufferedRecSamples;
        AppMethodBeat.o(65764);
      }
    }
  }

  private int InitSetting(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(65763);
    this._audioSourcePolicy = paramInt1;
    this._audioStreamTypePolicy = paramInt2;
    this._modePolicy = paramInt3;
    this._sceneModeKey = paramInt4;
    if ((this._sceneModeKey == 1) || (this._sceneModeKey == 2) || (this._sceneModeKey == 3));
    for (TraeAudioManager.IsMusicScene = true; ; TraeAudioManager.IsMusicScene = false)
    {
      TraeAudioManager.IsUpdateSceneFlag = true;
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "InitSetting: _audioSourcePolicy:" + this._audioSourcePolicy + " _audioStreamTypePolicy:" + this._audioStreamTypePolicy + " _modePolicy:" + this._modePolicy + " sceneModeKey:" + paramInt4);
      AppMethodBeat.o(65763);
      return 0;
    }
  }

  public static final void LogTraceEntry(String paramString)
  {
    AppMethodBeat.i(65777);
    if (!_logEnable)
      AppMethodBeat.o(65777);
    while (true)
    {
      return;
      paramString = getTraceInfo() + " entry:" + paramString;
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, paramString);
      AppMethodBeat.o(65777);
    }
  }

  public static final void LogTraceExit()
  {
    AppMethodBeat.i(65778);
    if (!_logEnable)
      AppMethodBeat.o(65778);
    while (true)
    {
      return;
      String str = getTraceInfo() + " exit";
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, str);
      AppMethodBeat.o(65778);
    }
  }

  private int OpenslesNeedResetAudioTrack(boolean paramBoolean)
  {
    AppMethodBeat.i(65772);
    try
    {
      boolean bool = TraeAudioManager.isCloseSystemAPM(this._modePolicy);
      if (!bool);
      for (int i = -1; ; i = 0)
      {
        return i;
        if ((!this._audioRouteChanged) && (!paramBoolean))
          break label124;
        if ((this._audioManager == null) && (this._context != null))
          this._audioManager = ((AudioManager)this._context.getSystemService("audio"));
        AudioManager localAudioManager = this._audioManager;
        if (localAudioManager != null)
          break;
        AppMethodBeat.o(65772);
      }
      if ((this._audioManager.getMode() == 0) && (this._connectedDev.equals("DEVICE_SPEAKERPHONE")));
      for (this._audioStreamTypePolicy = 3; ; this._audioStreamTypePolicy = 0)
      {
        this._audioRouteChanged = false;
        label124: i = this._audioStreamTypePolicy;
        AppMethodBeat.o(65772);
        break;
      }
    }
    catch (Exception localException)
    {
      while (true)
        if (QLog.isColorLevel())
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("PlayAudio Exception: ");
          QLog.e("TRAE", 2, localException.getMessage());
        }
    }
    finally
    {
      AppMethodBeat.o(65772);
    }
  }

  // ERROR //
  private int PlayAudio(int paramInt)
  {
    // Byte code:
    //   0: ldc_w 446
    //   3: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 122	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   10: ifne +75 -> 85
    //   13: iconst_1
    //   14: istore_2
    //   15: aload_0
    //   16: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   19: ifnonnull +71 -> 90
    //   22: iconst_1
    //   23: istore_3
    //   24: iload_2
    //   25: iload_3
    //   26: ior
    //   27: ifeq +68 -> 95
    //   30: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   33: ifeq +42 -> 75
    //   36: ldc 187
    //   38: iconst_2
    //   39: new 205	java/lang/StringBuilder
    //   42: dup
    //   43: ldc_w 448
    //   46: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   49: aload_0
    //   50: getfield 122	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   53: invokevirtual 266	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   56: ldc_w 450
    //   59: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: aload_0
    //   63: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   66: invokevirtual 327	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   69: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   72: invokestatic 269	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   75: iconst_m1
    //   76: istore_1
    //   77: ldc_w 446
    //   80: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   83: iload_1
    //   84: ireturn
    //   85: iconst_0
    //   86: istore_2
    //   87: goto -72 -> 15
    //   90: iconst_0
    //   91: istore_3
    //   92: goto -68 -> 24
    //   95: aload_0
    //   96: getfield 112	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   99: invokevirtual 453	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   102: aload_0
    //   103: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   106: astore 4
    //   108: aload 4
    //   110: ifnonnull +22 -> 132
    //   113: aload_0
    //   114: getfield 112	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   117: invokevirtual 456	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   120: bipush 254
    //   122: istore_1
    //   123: ldc_w 446
    //   126: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   129: goto -46 -> 83
    //   132: aload_0
    //   133: getfield 116	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_doPlayInit	Z
    //   136: istore 5
    //   138: iload 5
    //   140: iconst_1
    //   141: if_icmpne +13 -> 154
    //   144: bipush 237
    //   146: invokestatic 461	android/os/Process:setThreadPriority	(I)V
    //   149: aload_0
    //   150: iconst_0
    //   151: putfield 116	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_doPlayInit	Z
    //   154: getstatic 66	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_dumpEnable	Z
    //   157: ifeq +27 -> 184
    //   160: aload_0
    //   161: getfield 136	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_play_out	Ljava/io/FileOutputStream;
    //   164: astore 4
    //   166: aload 4
    //   168: ifnull +16 -> 184
    //   171: aload_0
    //   172: getfield 136	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_play_out	Ljava/io/FileOutputStream;
    //   175: aload_0
    //   176: getfield 172	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_tempBufPlay	[B
    //   179: iconst_0
    //   180: iconst_0
    //   181: invokevirtual 467	java/io/FileOutputStream:write	([BII)V
    //   184: aload_0
    //   185: getfield 144	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRouteChanged	Z
    //   188: ifne +646 -> 834
    //   191: iconst_0
    //   192: istore_2
    //   193: aload_0
    //   194: getfield 168	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playBuffer	Ljava/nio/ByteBuffer;
    //   197: aload_0
    //   198: getfield 172	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_tempBufPlay	[B
    //   201: invokevirtual 471	java/nio/ByteBuffer:get	([B)Ljava/nio/ByteBuffer;
    //   204: pop
    //   205: iload_2
    //   206: ifeq +981 -> 1187
    //   209: aload_0
    //   210: getfield 168	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playBuffer	Ljava/nio/ByteBuffer;
    //   213: invokevirtual 475	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   216: pop
    //   217: invokestatic 481	android/os/SystemClock:elapsedRealtime	()J
    //   220: lstore 6
    //   222: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   225: ifeq +50 -> 275
    //   228: new 205	java/lang/StringBuilder
    //   231: astore 4
    //   233: aload 4
    //   235: ldc_w 483
    //   238: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   241: ldc 187
    //   243: iconst_2
    //   244: aload 4
    //   246: aload_0
    //   247: getfield 87	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   250: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   253: ldc_w 485
    //   256: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: aload_0
    //   260: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   263: invokevirtual 354	android/media/AudioTrack:getStreamType	()I
    //   266: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   269: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   272: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   275: aload_0
    //   276: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   279: invokevirtual 488	android/media/AudioTrack:getPlayState	()I
    //   282: istore_2
    //   283: iload_2
    //   284: iconst_3
    //   285: if_icmpne +124 -> 409
    //   288: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   291: ifeq +12 -> 303
    //   294: ldc 187
    //   296: iconst_2
    //   297: ldc_w 490
    //   300: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   303: aload_0
    //   304: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   307: invokevirtual 493	android/media/AudioTrack:stop	()V
    //   310: aload_0
    //   311: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   314: invokevirtual 496	android/media/AudioTrack:flush	()V
    //   317: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   320: ifeq +37 -> 357
    //   323: new 205	java/lang/StringBuilder
    //   326: astore 4
    //   328: aload 4
    //   330: ldc_w 498
    //   333: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   336: ldc 187
    //   338: iconst_2
    //   339: aload 4
    //   341: aload_0
    //   342: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   345: invokevirtual 488	android/media/AudioTrack:getPlayState	()I
    //   348: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   351: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   354: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   357: aload_0
    //   358: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   361: invokevirtual 284	android/media/AudioTrack:release	()V
    //   364: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   367: ifeq +37 -> 404
    //   370: new 205	java/lang/StringBuilder
    //   373: astore 4
    //   375: aload 4
    //   377: ldc_w 500
    //   380: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   383: ldc 187
    //   385: iconst_2
    //   386: aload 4
    //   388: aload_0
    //   389: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   392: invokevirtual 488	android/media/AudioTrack:getPlayState	()I
    //   395: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   398: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   401: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   404: aload_0
    //   405: aconst_null
    //   406: putfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   409: aload_0
    //   410: getfield 89	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playSamplerate	I
    //   413: aload_0
    //   414: getfield 91	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   417: iconst_2
    //   418: invokestatic 275	android/media/AudioTrack:getMinBufferSize	(III)I
    //   421: istore 8
    //   423: iconst_4
    //   424: newarray int
    //   426: astore 4
    //   428: aload 4
    //   430: dup
    //   431: iconst_0
    //   432: iconst_0
    //   433: iastore
    //   434: dup
    //   435: iconst_1
    //   436: iconst_0
    //   437: iastore
    //   438: dup
    //   439: iconst_2
    //   440: iconst_3
    //   441: iastore
    //   442: dup
    //   443: iconst_3
    //   444: iconst_1
    //   445: iastore
    //   446: pop
    //   447: aload 4
    //   449: iconst_0
    //   450: aload_0
    //   451: getfield 87	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   454: iastore
    //   455: aload_0
    //   456: getfield 89	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playSamplerate	I
    //   459: bipush 20
    //   461: imul
    //   462: iconst_1
    //   463: imul
    //   464: iconst_2
    //   465: imul
    //   466: sipush 1000
    //   469: idiv
    //   470: istore_2
    //   471: aload_0
    //   472: getfield 91	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   475: bipush 12
    //   477: if_icmpne +932 -> 1409
    //   480: iload_2
    //   481: iconst_2
    //   482: imul
    //   483: istore_2
    //   484: iconst_0
    //   485: istore_3
    //   486: iload_3
    //   487: iconst_4
    //   488: if_icmpge +562 -> 1050
    //   491: aload_0
    //   492: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   495: ifnonnull +555 -> 1050
    //   498: aload_0
    //   499: aload 4
    //   501: iload_3
    //   502: iaload
    //   503: putfield 87	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   506: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   509: ifeq +48 -> 557
    //   512: new 205	java/lang/StringBuilder
    //   515: astore 9
    //   517: aload 9
    //   519: ldc_w 304
    //   522: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   525: ldc 187
    //   527: iconst_2
    //   528: aload 9
    //   530: iload 8
    //   532: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   535: ldc_w 306
    //   538: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   541: aload_0
    //   542: getfield 87	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   545: invokestatic 309	android/media/AudioTrack:getNativeOutputSampleRate	(I)I
    //   548: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   551: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   554: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   557: iconst_1
    //   558: istore 10
    //   560: iload 10
    //   562: iconst_2
    //   563: if_icmpgt +481 -> 1044
    //   566: iload 8
    //   568: iload 10
    //   570: imul
    //   571: istore 11
    //   573: iload 11
    //   575: iload_2
    //   576: iconst_4
    //   577: imul
    //   578: if_icmpge +9 -> 587
    //   581: iload 10
    //   583: iconst_2
    //   584: if_icmplt +143 -> 727
    //   587: new 271	android/media/AudioTrack
    //   590: astore 9
    //   592: aload 9
    //   594: aload_0
    //   595: getfield 87	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   598: aload_0
    //   599: getfield 89	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playSamplerate	I
    //   602: aload_0
    //   603: getfield 91	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   606: iconst_2
    //   607: iload 11
    //   609: iconst_1
    //   610: invokespecial 312	android/media/AudioTrack:<init>	(IIIIII)V
    //   613: aload_0
    //   614: aload 9
    //   616: putfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   619: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   622: ifeq +34 -> 656
    //   625: new 205	java/lang/StringBuilder
    //   628: astore 9
    //   630: aload 9
    //   632: ldc_w 324
    //   635: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   638: ldc 187
    //   640: iconst_2
    //   641: aload 9
    //   643: aload_0
    //   644: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   647: invokevirtual 327	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   650: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   653: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   656: aload_0
    //   657: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   660: invokevirtual 315	android/media/AudioTrack:getState	()I
    //   663: iconst_1
    //   664: if_icmpeq +380 -> 1044
    //   667: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   670: ifeq +45 -> 715
    //   673: new 205	java/lang/StringBuilder
    //   676: astore 9
    //   678: aload 9
    //   680: ldc_w 317
    //   683: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   686: ldc 187
    //   688: iconst_2
    //   689: aload 9
    //   691: iload 11
    //   693: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   696: ldc_w 319
    //   699: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   702: aload_0
    //   703: getfield 89	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playSamplerate	I
    //   706: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   709: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   712: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   715: aload_0
    //   716: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   719: invokevirtual 284	android/media/AudioTrack:release	()V
    //   722: aload_0
    //   723: aconst_null
    //   724: putfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   727: iinc 10 1
    //   730: goto -170 -> 560
    //   733: astore 9
    //   735: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   738: ifeq -589 -> 149
    //   741: new 205	java/lang/StringBuilder
    //   744: astore 4
    //   746: aload 4
    //   748: ldc_w 502
    //   751: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   754: ldc 187
    //   756: iconst_2
    //   757: aload 4
    //   759: aload 9
    //   761: invokevirtual 239	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   764: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   767: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   770: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   773: goto -624 -> 149
    //   776: astore 4
    //   778: iconst_0
    //   779: istore_1
    //   780: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   783: ifeq +35 -> 818
    //   786: new 205	java/lang/StringBuilder
    //   789: astore 9
    //   791: aload 9
    //   793: ldc_w 440
    //   796: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   799: ldc 187
    //   801: iconst_2
    //   802: aload 9
    //   804: aload 4
    //   806: invokevirtual 239	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   809: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   812: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   815: invokestatic 269	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   818: aload_0
    //   819: getfield 112	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   822: invokevirtual 456	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   825: ldc_w 446
    //   828: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   831: goto -748 -> 83
    //   834: aload_0
    //   835: getfield 107	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   838: ifnonnull +26 -> 864
    //   841: aload_0
    //   842: getfield 99	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_context	Landroid/content/Context;
    //   845: ifnull +19 -> 864
    //   848: aload_0
    //   849: aload_0
    //   850: getfield 99	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_context	Landroid/content/Context;
    //   853: ldc 244
    //   855: invokevirtual 250	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   858: checkcast 252	android/media/AudioManager
    //   861: putfield 107	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   864: aload_0
    //   865: getfield 107	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   868: invokevirtual 296	android/media/AudioManager:getMode	()I
    //   871: ifne +63 -> 934
    //   874: aload_0
    //   875: getfield 142	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_connectedDev	Ljava/lang/String;
    //   878: ldc_w 298
    //   881: invokevirtual 302	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   884: ifeq +50 -> 934
    //   887: aload_0
    //   888: iconst_3
    //   889: putfield 87	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   892: aload_0
    //   893: getfield 87	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   896: aload_0
    //   897: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   900: invokevirtual 354	android/media/AudioTrack:getStreamType	()I
    //   903: if_icmpne +39 -> 942
    //   906: iconst_0
    //   907: istore_2
    //   908: aload_0
    //   909: iconst_0
    //   910: putfield 144	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRouteChanged	Z
    //   913: goto -720 -> 193
    //   916: astore 4
    //   918: aload_0
    //   919: getfield 112	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   922: invokevirtual 456	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   925: ldc_w 446
    //   928: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   931: aload 4
    //   933: athrow
    //   934: aload_0
    //   935: iconst_0
    //   936: putfield 87	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   939: goto -47 -> 892
    //   942: iconst_1
    //   943: istore_2
    //   944: goto -36 -> 908
    //   947: astore 4
    //   949: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   952: ifeq -543 -> 409
    //   955: ldc 187
    //   957: iconst_2
    //   958: ldc_w 504
    //   961: invokestatic 269	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   964: goto -555 -> 409
    //   967: astore 4
    //   969: goto -189 -> 780
    //   972: astore 12
    //   974: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   977: ifeq +45 -> 1022
    //   980: new 205	java/lang/StringBuilder
    //   983: astore 9
    //   985: aload 9
    //   987: invokespecial 322	java/lang/StringBuilder:<init>	()V
    //   990: ldc 187
    //   992: iconst_2
    //   993: aload 9
    //   995: aload 12
    //   997: invokevirtual 239	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1000: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1003: ldc_w 324
    //   1006: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1009: aload_0
    //   1010: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   1013: invokevirtual 327	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1016: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1019: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   1022: aload_0
    //   1023: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   1026: ifnull +10 -> 1036
    //   1029: aload_0
    //   1030: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   1033: invokevirtual 284	android/media/AudioTrack:release	()V
    //   1036: aload_0
    //   1037: aconst_null
    //   1038: putfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   1041: goto -314 -> 727
    //   1044: iinc 3 1
    //   1047: goto -561 -> 486
    //   1050: aload_0
    //   1051: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   1054: astore 4
    //   1056: aload 4
    //   1058: ifnull +57 -> 1115
    //   1061: aload_0
    //   1062: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   1065: invokevirtual 507	android/media/AudioTrack:play	()V
    //   1068: aload_0
    //   1069: getfield 138	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_as	Lcom/tencent/rtmp/sharp/jni/TraeAudioSession;
    //   1072: aload_0
    //   1073: getfield 107	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   1076: invokevirtual 296	android/media/AudioManager:getMode	()I
    //   1079: aload_0
    //   1080: getfield 87	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   1083: invokevirtual 334	com/tencent/rtmp/sharp/jni/TraeAudioSession:voiceCallAudioParamChanged	(II)I
    //   1086: pop
    //   1087: aload_0
    //   1088: getfield 107	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   1091: astore 4
    //   1093: aload_0
    //   1094: getfield 142	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_connectedDev	Ljava/lang/String;
    //   1097: ldc_w 347
    //   1100: invokevirtual 302	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1103: ifeq +73 -> 1176
    //   1106: bipush 6
    //   1108: istore_2
    //   1109: aload 4
    //   1111: iload_2
    //   1112: invokestatic 351	com/tencent/rtmp/sharp/jni/TraeAudioManager:forceVolumeControlStream	(Landroid/media/AudioManager;I)V
    //   1115: iload_1
    //   1116: istore_2
    //   1117: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   1120: ifeq +44 -> 1164
    //   1123: new 205	java/lang/StringBuilder
    //   1126: astore 4
    //   1128: aload 4
    //   1130: ldc_w 509
    //   1133: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1136: ldc 187
    //   1138: iconst_2
    //   1139: aload 4
    //   1141: invokestatic 481	android/os/SystemClock:elapsedRealtime	()J
    //   1144: lload 6
    //   1146: lsub
    //   1147: invokevirtual 512	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1150: ldc_w 514
    //   1153: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1156: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1159: invokestatic 269	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   1162: iload_1
    //   1163: istore_2
    //   1164: aload_0
    //   1165: getfield 112	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   1168: invokevirtual 456	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   1171: iload_2
    //   1172: istore_1
    //   1173: goto -348 -> 825
    //   1176: aload_0
    //   1177: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   1180: invokevirtual 354	android/media/AudioTrack:getStreamType	()I
    //   1183: istore_2
    //   1184: goto -75 -> 1109
    //   1187: aload_0
    //   1188: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   1191: aload_0
    //   1192: getfield 172	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_tempBufPlay	[B
    //   1195: iconst_0
    //   1196: iload_1
    //   1197: invokevirtual 517	android/media/AudioTrack:write	([BII)I
    //   1200: istore_2
    //   1201: aload_0
    //   1202: getfield 168	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playBuffer	Ljava/nio/ByteBuffer;
    //   1205: invokevirtual 475	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   1208: pop
    //   1209: iload_2
    //   1210: ifge +71 -> 1281
    //   1213: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   1216: ifeq +47 -> 1263
    //   1219: new 205	java/lang/StringBuilder
    //   1222: astore 4
    //   1224: aload 4
    //   1226: ldc_w 519
    //   1229: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1232: ldc 187
    //   1234: iconst_2
    //   1235: aload 4
    //   1237: iload_2
    //   1238: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1241: ldc_w 521
    //   1244: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1247: iload_1
    //   1248: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1251: ldc_w 523
    //   1254: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1257: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1260: invokestatic 269	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   1263: aload_0
    //   1264: getfield 112	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   1267: invokevirtual 456	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   1270: iconst_m1
    //   1271: istore_1
    //   1272: ldc_w 446
    //   1275: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1278: goto -1195 -> 83
    //   1281: iload_2
    //   1282: iload_1
    //   1283: if_icmpeq +53 -> 1336
    //   1286: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   1289: ifeq +47 -> 1336
    //   1292: new 205	java/lang/StringBuilder
    //   1295: astore 4
    //   1297: aload 4
    //   1299: ldc_w 525
    //   1302: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1305: ldc 187
    //   1307: iconst_2
    //   1308: aload 4
    //   1310: iload_2
    //   1311: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1314: ldc_w 521
    //   1317: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1320: iload_1
    //   1321: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1324: ldc_w 523
    //   1327: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1330: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1333: invokestatic 269	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   1336: aload_0
    //   1337: aload_0
    //   1338: getfield 126	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_bufferedPlaySamples	I
    //   1341: iload_2
    //   1342: iconst_1
    //   1343: ishr
    //   1344: iadd
    //   1345: putfield 126	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_bufferedPlaySamples	I
    //   1348: aload_0
    //   1349: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   1352: invokevirtual 337	android/media/AudioTrack:getPlaybackHeadPosition	()I
    //   1355: istore_1
    //   1356: iload_1
    //   1357: aload_0
    //   1358: getfield 128	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playPosition	I
    //   1361: if_icmpge +8 -> 1369
    //   1364: aload_0
    //   1365: iconst_0
    //   1366: putfield 128	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playPosition	I
    //   1369: aload_0
    //   1370: aload_0
    //   1371: getfield 126	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_bufferedPlaySamples	I
    //   1374: iload_1
    //   1375: aload_0
    //   1376: getfield 128	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playPosition	I
    //   1379: isub
    //   1380: isub
    //   1381: putfield 126	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_bufferedPlaySamples	I
    //   1384: aload_0
    //   1385: iload_1
    //   1386: putfield 128	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playPosition	I
    //   1389: goto -225 -> 1164
    //   1392: astore 4
    //   1394: iload_2
    //   1395: istore_1
    //   1396: goto -616 -> 780
    //   1399: astore 4
    //   1401: goto -286 -> 1115
    //   1404: astore 4
    //   1406: goto -1222 -> 184
    //   1409: goto -925 -> 484
    //
    // Exception table:
    //   from	to	target	type
    //   144	149	733	java/lang/Exception
    //   102	108	776	java/lang/Exception
    //   132	138	776	java/lang/Exception
    //   149	154	776	java/lang/Exception
    //   154	166	776	java/lang/Exception
    //   171	184	776	java/lang/Exception
    //   184	191	776	java/lang/Exception
    //   193	205	776	java/lang/Exception
    //   735	773	776	java/lang/Exception
    //   834	864	776	java/lang/Exception
    //   864	892	776	java/lang/Exception
    //   892	906	776	java/lang/Exception
    //   908	913	776	java/lang/Exception
    //   934	939	776	java/lang/Exception
    //   1187	1201	776	java/lang/Exception
    //   102	108	916	finally
    //   132	138	916	finally
    //   144	149	916	finally
    //   149	154	916	finally
    //   154	166	916	finally
    //   171	184	916	finally
    //   184	191	916	finally
    //   193	205	916	finally
    //   209	275	916	finally
    //   275	283	916	finally
    //   288	303	916	finally
    //   303	357	916	finally
    //   357	404	916	finally
    //   404	409	916	finally
    //   409	480	916	finally
    //   491	557	916	finally
    //   587	619	916	finally
    //   619	656	916	finally
    //   656	715	916	finally
    //   715	727	916	finally
    //   735	773	916	finally
    //   780	818	916	finally
    //   834	864	916	finally
    //   864	892	916	finally
    //   892	906	916	finally
    //   908	913	916	finally
    //   934	939	916	finally
    //   949	964	916	finally
    //   974	1022	916	finally
    //   1022	1036	916	finally
    //   1036	1041	916	finally
    //   1050	1056	916	finally
    //   1061	1106	916	finally
    //   1109	1115	916	finally
    //   1117	1162	916	finally
    //   1176	1184	916	finally
    //   1187	1201	916	finally
    //   1201	1209	916	finally
    //   1213	1263	916	finally
    //   1286	1336	916	finally
    //   1336	1369	916	finally
    //   1369	1389	916	finally
    //   288	303	947	java/lang/IllegalStateException
    //   303	357	947	java/lang/IllegalStateException
    //   357	404	947	java/lang/IllegalStateException
    //   404	409	947	java/lang/IllegalStateException
    //   209	275	967	java/lang/Exception
    //   275	283	967	java/lang/Exception
    //   288	303	967	java/lang/Exception
    //   303	357	967	java/lang/Exception
    //   357	404	967	java/lang/Exception
    //   404	409	967	java/lang/Exception
    //   409	480	967	java/lang/Exception
    //   491	557	967	java/lang/Exception
    //   619	656	967	java/lang/Exception
    //   656	715	967	java/lang/Exception
    //   715	727	967	java/lang/Exception
    //   949	964	967	java/lang/Exception
    //   974	1022	967	java/lang/Exception
    //   1022	1036	967	java/lang/Exception
    //   1036	1041	967	java/lang/Exception
    //   1050	1056	967	java/lang/Exception
    //   1117	1162	967	java/lang/Exception
    //   587	619	972	java/lang/Exception
    //   1201	1209	1392	java/lang/Exception
    //   1213	1263	1392	java/lang/Exception
    //   1286	1336	1392	java/lang/Exception
    //   1336	1369	1392	java/lang/Exception
    //   1369	1389	1392	java/lang/Exception
    //   1061	1106	1399	java/lang/Exception
    //   1109	1115	1399	java/lang/Exception
    //   1176	1184	1399	java/lang/Exception
    //   171	184	1404	java/io/IOException
  }

  // ERROR //
  private int RecordAudio(int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc_w 527
    //   5: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: getfield 120	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isRecording	Z
    //   12: ifne +45 -> 57
    //   15: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   18: ifeq +29 -> 47
    //   21: ldc 187
    //   23: iconst_2
    //   24: new 205	java/lang/StringBuilder
    //   27: dup
    //   28: ldc_w 529
    //   31: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   34: aload_0
    //   35: getfield 120	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isRecording	Z
    //   38: invokevirtual 266	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   41: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   44: invokestatic 269	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   47: ldc_w 527
    //   50: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   53: iconst_m1
    //   54: istore_1
    //   55: iload_1
    //   56: ireturn
    //   57: aload_0
    //   58: getfield 114	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   61: invokevirtual 453	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   64: iload_2
    //   65: istore_3
    //   66: aload_0
    //   67: getfield 85	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   70: astore 4
    //   72: aload 4
    //   74: ifnonnull +22 -> 96
    //   77: aload_0
    //   78: getfield 114	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   81: invokevirtual 456	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   84: bipush 254
    //   86: istore_1
    //   87: ldc_w 527
    //   90: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   93: goto -38 -> 55
    //   96: iload_2
    //   97: istore_3
    //   98: aload_0
    //   99: getfield 118	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_doRecInit	Z
    //   102: istore 5
    //   104: iload 5
    //   106: iconst_1
    //   107: if_icmpne +15 -> 122
    //   110: bipush 237
    //   112: invokestatic 461	android/os/Process:setThreadPriority	(I)V
    //   115: iload_2
    //   116: istore_3
    //   117: aload_0
    //   118: iconst_0
    //   119: putfield 118	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_doRecInit	Z
    //   122: iload_2
    //   123: istore_3
    //   124: aload_0
    //   125: getfield 170	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recBuffer	Ljava/nio/ByteBuffer;
    //   128: invokevirtual 475	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   131: pop
    //   132: iload_2
    //   133: istore_3
    //   134: aload_0
    //   135: getfield 85	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   138: aload_0
    //   139: getfield 174	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_tempBufRec	[B
    //   142: iconst_0
    //   143: iload_1
    //   144: invokevirtual 532	android/media/AudioRecord:read	([BII)I
    //   147: istore_2
    //   148: iload_2
    //   149: ifge +188 -> 337
    //   152: iload_2
    //   153: istore_3
    //   154: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   157: ifeq +53 -> 210
    //   160: iload_2
    //   161: istore_3
    //   162: new 205	java/lang/StringBuilder
    //   165: astore 4
    //   167: iload_2
    //   168: istore_3
    //   169: aload 4
    //   171: ldc_w 534
    //   174: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   177: iload_2
    //   178: istore_3
    //   179: ldc 187
    //   181: iconst_2
    //   182: aload 4
    //   184: iload_2
    //   185: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   188: ldc_w 521
    //   191: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: iload_1
    //   195: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   198: ldc_w 523
    //   201: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   207: invokestatic 269	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   210: aload_0
    //   211: getfield 114	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   214: invokevirtual 456	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   217: ldc_w 527
    //   220: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   223: iconst_m1
    //   224: istore_1
    //   225: goto -170 -> 55
    //   228: astore 4
    //   230: iload_2
    //   231: istore_3
    //   232: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   235: ifeq -120 -> 115
    //   238: iload_2
    //   239: istore_3
    //   240: new 205	java/lang/StringBuilder
    //   243: astore 6
    //   245: iload_2
    //   246: istore_3
    //   247: aload 6
    //   249: ldc_w 536
    //   252: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   255: iload_2
    //   256: istore_3
    //   257: ldc 187
    //   259: iconst_2
    //   260: aload 6
    //   262: aload 4
    //   264: invokevirtual 239	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   267: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   273: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   276: goto -161 -> 115
    //   279: astore 4
    //   281: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   284: ifeq +35 -> 319
    //   287: new 205	java/lang/StringBuilder
    //   290: astore 6
    //   292: aload 6
    //   294: ldc_w 538
    //   297: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   300: ldc 187
    //   302: iconst_2
    //   303: aload 6
    //   305: aload 4
    //   307: invokevirtual 239	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   310: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   316: invokestatic 269	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   319: aload_0
    //   320: getfield 114	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   323: invokevirtual 456	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   326: iload_3
    //   327: istore_1
    //   328: ldc_w 527
    //   331: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   334: goto -279 -> 55
    //   337: iload_2
    //   338: istore_3
    //   339: aload_0
    //   340: getfield 170	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recBuffer	Ljava/nio/ByteBuffer;
    //   343: aload_0
    //   344: getfield 174	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_tempBufRec	[B
    //   347: iconst_0
    //   348: iload_2
    //   349: invokevirtual 542	java/nio/ByteBuffer:put	([BII)Ljava/nio/ByteBuffer;
    //   352: pop
    //   353: iload_2
    //   354: istore_3
    //   355: getstatic 66	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_dumpEnable	Z
    //   358: ifeq +31 -> 389
    //   361: iload_2
    //   362: istore_3
    //   363: aload_0
    //   364: getfield 134	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_rec_out	Ljava/io/FileOutputStream;
    //   367: astore 4
    //   369: aload 4
    //   371: ifnull +18 -> 389
    //   374: iload_2
    //   375: istore_3
    //   376: aload_0
    //   377: getfield 134	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_rec_out	Ljava/io/FileOutputStream;
    //   380: aload_0
    //   381: getfield 174	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_tempBufRec	[B
    //   384: iconst_0
    //   385: iload_2
    //   386: invokevirtual 467	java/io/FileOutputStream:write	([BII)V
    //   389: iload_2
    //   390: iload_1
    //   391: if_icmpeq +79 -> 470
    //   394: iload_2
    //   395: istore_3
    //   396: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   399: ifeq +53 -> 452
    //   402: iload_2
    //   403: istore_3
    //   404: new 205	java/lang/StringBuilder
    //   407: astore 4
    //   409: iload_2
    //   410: istore_3
    //   411: aload 4
    //   413: ldc_w 544
    //   416: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   419: iload_2
    //   420: istore_3
    //   421: ldc 187
    //   423: iconst_2
    //   424: aload 4
    //   426: iload_2
    //   427: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   430: ldc_w 521
    //   433: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   436: iload_1
    //   437: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   440: ldc_w 523
    //   443: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   446: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   449: invokestatic 269	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   452: aload_0
    //   453: getfield 114	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   456: invokevirtual 456	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   459: ldc_w 527
    //   462: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   465: iconst_m1
    //   466: istore_1
    //   467: goto -412 -> 55
    //   470: aload_0
    //   471: getfield 114	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   474: invokevirtual 456	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   477: iload_2
    //   478: istore_1
    //   479: goto -151 -> 328
    //   482: astore 4
    //   484: aload_0
    //   485: getfield 114	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   488: invokevirtual 456	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   491: ldc_w 527
    //   494: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   497: aload 4
    //   499: athrow
    //   500: astore 4
    //   502: goto -113 -> 389
    //
    // Exception table:
    //   from	to	target	type
    //   110	115	228	java/lang/Exception
    //   66	72	279	java/lang/Exception
    //   98	104	279	java/lang/Exception
    //   117	122	279	java/lang/Exception
    //   124	132	279	java/lang/Exception
    //   134	148	279	java/lang/Exception
    //   154	160	279	java/lang/Exception
    //   162	167	279	java/lang/Exception
    //   169	177	279	java/lang/Exception
    //   179	210	279	java/lang/Exception
    //   232	238	279	java/lang/Exception
    //   240	245	279	java/lang/Exception
    //   247	255	279	java/lang/Exception
    //   257	276	279	java/lang/Exception
    //   339	353	279	java/lang/Exception
    //   355	361	279	java/lang/Exception
    //   363	369	279	java/lang/Exception
    //   376	389	279	java/lang/Exception
    //   396	402	279	java/lang/Exception
    //   404	409	279	java/lang/Exception
    //   411	419	279	java/lang/Exception
    //   421	452	279	java/lang/Exception
    //   66	72	482	finally
    //   98	104	482	finally
    //   110	115	482	finally
    //   117	122	482	finally
    //   124	132	482	finally
    //   134	148	482	finally
    //   154	160	482	finally
    //   162	167	482	finally
    //   169	177	482	finally
    //   179	210	482	finally
    //   232	238	482	finally
    //   240	245	482	finally
    //   247	255	482	finally
    //   257	276	482	finally
    //   281	319	482	finally
    //   339	353	482	finally
    //   355	361	482	finally
    //   363	369	482	finally
    //   376	389	482	finally
    //   396	402	482	finally
    //   404	409	482	finally
    //   411	419	482	finally
    //   421	452	482	finally
    //   376	389	500	java/io/IOException
  }

  private int SetPlayoutVolume(int paramInt)
  {
    AppMethodBeat.i(65774);
    if ((this._audioManager == null) && (this._context != null))
      this._audioManager = ((AudioManager)this._context.getSystemService("audio"));
    int i = -1;
    if (this._audioManager != null)
    {
      this._audioManager.setStreamVolume(0, paramInt, 0);
      i = 0;
    }
    AppMethodBeat.o(65774);
    return i;
  }

  // ERROR //
  private int StartPlayback()
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_1
    //   2: ldc_w 554
    //   5: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: getfield 122	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   12: ifeq +26 -> 38
    //   15: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   18: ifeq +12 -> 30
    //   21: ldc 187
    //   23: iconst_2
    //   24: ldc_w 556
    //   27: invokestatic 269	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   30: ldc_w 554
    //   33: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   36: iload_1
    //   37: ireturn
    //   38: aload_0
    //   39: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   42: ifnonnull +44 -> 86
    //   45: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   48: ifeq +29 -> 77
    //   51: ldc 187
    //   53: iconst_2
    //   54: new 205	java/lang/StringBuilder
    //   57: dup
    //   58: ldc_w 558
    //   61: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   64: aload_0
    //   65: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   68: invokevirtual 327	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   71: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: invokestatic 269	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   77: ldc_w 554
    //   80: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   83: goto -47 -> 36
    //   86: aload_0
    //   87: getfield 83	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   90: invokevirtual 507	android/media/AudioTrack:play	()V
    //   93: getstatic 66	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_dumpEnable	Z
    //   96: ifeq +54 -> 150
    //   99: aload_0
    //   100: getfield 107	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   103: ifnull +11 -> 114
    //   106: aload_0
    //   107: getfield 107	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   110: invokevirtual 296	android/media/AudioManager:getMode	()I
    //   113: istore_1
    //   114: aload_0
    //   115: new 560	java/io/File
    //   118: dup
    //   119: aload_0
    //   120: ldc_w 562
    //   123: iload_1
    //   124: invokespecial 566	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:getDumpFilePath	(Ljava/lang/String;I)Ljava/lang/String;
    //   127: invokespecial 567	java/io/File:<init>	(Ljava/lang/String;)V
    //   130: putfield 132	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_play_dump	Ljava/io/File;
    //   133: new 463	java/io/FileOutputStream
    //   136: astore_2
    //   137: aload_2
    //   138: aload_0
    //   139: getfield 132	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_play_dump	Ljava/io/File;
    //   142: invokespecial 570	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   145: aload_0
    //   146: aload_2
    //   147: putfield 136	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_play_out	Ljava/io/FileOutputStream;
    //   150: aload_0
    //   151: iconst_1
    //   152: putfield 122	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   155: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   158: ifeq +12 -> 170
    //   161: ldc 187
    //   163: iconst_2
    //   164: ldc_w 572
    //   167: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   170: iconst_0
    //   171: istore_1
    //   172: ldc_w 554
    //   175: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   178: goto -142 -> 36
    //   181: astore_2
    //   182: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   185: ifeq +12 -> 197
    //   188: ldc 187
    //   190: iconst_2
    //   191: ldc_w 574
    //   194: invokestatic 269	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   197: ldc_w 554
    //   200: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   203: goto -167 -> 36
    //   206: astore_2
    //   207: goto -57 -> 150
    //
    // Exception table:
    //   from	to	target	type
    //   86	93	181	java/lang/IllegalStateException
    //   133	150	206	java/io/FileNotFoundException
  }

  // ERROR //
  private int StartRecording()
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_1
    //   2: ldc_w 576
    //   5: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   11: ifeq +12 -> 23
    //   14: ldc 187
    //   16: iconst_2
    //   17: ldc_w 578
    //   20: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   23: aload_0
    //   24: getfield 120	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isRecording	Z
    //   27: ifeq +43 -> 70
    //   30: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   33: ifeq +29 -> 62
    //   36: ldc 187
    //   38: iconst_2
    //   39: new 205	java/lang/StringBuilder
    //   42: dup
    //   43: ldc_w 580
    //   46: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   49: aload_0
    //   50: getfield 120	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isRecording	Z
    //   53: invokevirtual 266	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   56: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   59: invokestatic 269	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   62: ldc_w 576
    //   65: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   68: iload_1
    //   69: ireturn
    //   70: aload_0
    //   71: getfield 85	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   74: ifnonnull +44 -> 118
    //   77: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   80: ifeq +29 -> 109
    //   83: ldc 187
    //   85: iconst_2
    //   86: new 205	java/lang/StringBuilder
    //   89: dup
    //   90: ldc_w 582
    //   93: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   96: aload_0
    //   97: getfield 85	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   100: invokevirtual 327	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   103: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: invokestatic 269	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   109: ldc_w 576
    //   112: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   115: goto -47 -> 68
    //   118: aload_0
    //   119: getfield 85	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   122: invokevirtual 585	android/media/AudioRecord:startRecording	()V
    //   125: getstatic 66	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_dumpEnable	Z
    //   128: ifeq +54 -> 182
    //   131: aload_0
    //   132: getfield 107	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   135: ifnull +11 -> 146
    //   138: aload_0
    //   139: getfield 107	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   142: invokevirtual 296	android/media/AudioManager:getMode	()I
    //   145: istore_1
    //   146: aload_0
    //   147: new 560	java/io/File
    //   150: dup
    //   151: aload_0
    //   152: ldc_w 587
    //   155: iload_1
    //   156: invokespecial 566	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:getDumpFilePath	(Ljava/lang/String;I)Ljava/lang/String;
    //   159: invokespecial 567	java/io/File:<init>	(Ljava/lang/String;)V
    //   162: putfield 130	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_rec_dump	Ljava/io/File;
    //   165: new 463	java/io/FileOutputStream
    //   168: astore_2
    //   169: aload_2
    //   170: aload_0
    //   171: getfield 130	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_rec_dump	Ljava/io/File;
    //   174: invokespecial 570	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   177: aload_0
    //   178: aload_2
    //   179: putfield 134	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_rec_out	Ljava/io/FileOutputStream;
    //   182: aload_0
    //   183: iconst_1
    //   184: putfield 120	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isRecording	Z
    //   187: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   190: ifeq +12 -> 202
    //   193: ldc 187
    //   195: iconst_2
    //   196: ldc_w 589
    //   199: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   202: iconst_0
    //   203: istore_1
    //   204: ldc_w 576
    //   207: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   210: goto -142 -> 68
    //   213: astore_2
    //   214: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   217: ifeq +12 -> 229
    //   220: ldc 187
    //   222: iconst_2
    //   223: ldc_w 591
    //   226: invokestatic 269	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   229: ldc_w 576
    //   232: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   235: goto -167 -> 68
    //   238: astore_2
    //   239: goto -57 -> 182
    //
    // Exception table:
    //   from	to	target	type
    //   118	125	213	java/lang/IllegalStateException
    //   165	182	238	java/io/FileNotFoundException
  }

  private int StopPlayback()
  {
    int i = -1;
    AppMethodBeat.i(65770);
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "StopPlayback entry _isPlaying:" + this._isPlaying);
    if (this._audioTrack == null)
    {
      if (QLog.isColorLevel())
        QLog.e("TRAE", 2, "StopPlayback _isPlaying:" + this._isPlaying + " " + this._audioTrack);
      AppMethodBeat.o(65770);
    }
    while (true)
    {
      return i;
      this._playLock.lock();
      try
      {
        int j = this._audioTrack.getPlayState();
        if (j == 3);
        try
        {
          if (QLog.isColorLevel())
            QLog.w("TRAE", 2, "StopPlayback stoping...");
          this._audioTrack.stop();
          StringBuilder localStringBuilder;
          if (QLog.isColorLevel())
          {
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("StopPlayback flushing... state:");
            QLog.w("TRAE", 2, this._audioTrack.getPlayState());
          }
          this._audioTrack.flush();
          if (QLog.isColorLevel())
          {
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("StopPlayback releaseing... state:");
            QLog.w("TRAE", 2, this._audioTrack.getPlayState());
          }
          this._audioTrack.release();
          this._audioTrack = null;
          this._isPlaying = false;
          this._playLock.unlock();
          if (QLog.isColorLevel())
            QLog.w("TRAE", 2, "StopPlayback exit ok");
          AppMethodBeat.o(65770);
          i = 0;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          if (QLog.isColorLevel())
            QLog.e("TRAE", 2, "StopPlayback err");
        }
      }
      finally
      {
        this._playLock.unlock();
        AppMethodBeat.o(65770);
      }
    }
  }

  private int StopRecording()
  {
    int i = -1;
    AppMethodBeat.i(65769);
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "StopRecording entry");
    if (this._audioRecord == null)
    {
      if (QLog.isColorLevel())
        QLog.e("TRAE", 2, "UnintRecord:" + this._audioRecord);
      AppMethodBeat.o(65769);
    }
    while (true)
    {
      return i;
      this._recLock.lock();
      try
      {
        int j = this._audioRecord.getRecordingState();
        if (j == 3);
        try
        {
          StringBuilder localStringBuilder;
          if (QLog.isColorLevel())
          {
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("StopRecording stop... state:");
            QLog.w("TRAE", 2, this._audioRecord.getRecordingState());
          }
          this._audioRecord.stop();
          if (QLog.isColorLevel())
          {
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("StopRecording releaseing... state:");
            QLog.w("TRAE", 2, this._audioRecord.getRecordingState());
          }
          this._audioRecord.release();
          this._audioRecord = null;
          this._isRecording = false;
          this._recLock.unlock();
          if (QLog.isColorLevel())
            QLog.w("TRAE", 2, "StopRecording exit ok");
          AppMethodBeat.o(65769);
          i = 0;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          if (QLog.isColorLevel())
            QLog.e("TRAE", 2, "StopRecording  err");
        }
      }
      finally
      {
        this._recLock.unlock();
        AppMethodBeat.o(65769);
      }
    }
  }

  private int getAndroidSdkVersion()
  {
    return Build.VERSION.SDK_INT;
  }

  @TargetApi(16)
  private int getAudioSessionId(AudioRecord paramAudioRecord)
  {
    return 0;
  }

  private String getDumpFilePath(String paramString, int paramInt)
  {
    AppMethodBeat.i(65766);
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "manufacture:" + Build.MANUFACTURER);
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "MODEL:" + Build.MODEL);
    paramString = Environment.getExternalStorageDirectory().getPath() + "/MF-" + Build.MANUFACTURER + "-M-" + Build.MODEL + "-as-" + TraeAudioManager.getAudioSource(this._audioSourcePolicy) + "-st-" + this._streamType + "-m-" + paramInt + "-" + paramString;
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "dump:".concat(String.valueOf(paramString)));
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "dump replace:" + paramString.replace(" ", "_"));
    paramString = paramString.replace(" ", "_");
    AppMethodBeat.o(65766);
    return paramString;
  }

  private int getLowlatencyFramesPerBuffer()
  {
    AppMethodBeat.i(65762);
    if ((this._context == null) || (Build.VERSION.SDK_INT < 9))
    {
      if (QLog.isColorLevel())
        QLog.e("TRAE", 2, "getLowlatencySamplerate err, _context:" + this._context + " api:" + Build.VERSION.SDK_INT);
      AppMethodBeat.o(65762);
    }
    while (true)
    {
      return 0;
      boolean bool = this._context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
      StringBuilder localStringBuilder;
      if (QLog.isColorLevel())
      {
        localStringBuilder = new StringBuilder("LOW_LATENCY:");
        if (bool != true)
          break label159;
      }
      label159: for (String str = "Y"; ; str = "N")
      {
        QLog.w("TRAE", 2, str);
        if (Build.VERSION.SDK_INT >= 17)
          break label166;
        if (QLog.isColorLevel())
          QLog.e("TRAE", 2, "API Level too low not support PROPERTY_OUTPUT_SAMPLE_RATE");
        AppMethodBeat.o(65762);
        break;
      }
      label166: AppMethodBeat.o(65762);
    }
  }

  private int getLowlatencySamplerate()
  {
    AppMethodBeat.i(65761);
    if ((this._context == null) || (Build.VERSION.SDK_INT < 9))
    {
      if (QLog.isColorLevel())
        QLog.e("TRAE", 2, "getLowlatencySamplerate err, _context:" + this._context + " api:" + Build.VERSION.SDK_INT);
      AppMethodBeat.o(65761);
    }
    while (true)
    {
      return 0;
      boolean bool = this._context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
      StringBuilder localStringBuilder;
      if (QLog.isColorLevel())
      {
        localStringBuilder = new StringBuilder("LOW_LATENCY:");
        if (bool != true)
          break label159;
      }
      label159: for (String str = "Y"; ; str = "N")
      {
        QLog.w("TRAE", 2, str);
        if (Build.VERSION.SDK_INT >= 17)
          break label166;
        if (QLog.isColorLevel())
          QLog.e("TRAE", 2, "API Level too low not support PROPERTY_OUTPUT_SAMPLE_RATE");
        AppMethodBeat.o(65761);
        break;
      }
      label166: if (QLog.isColorLevel())
        QLog.e("TRAE", 2, "getLowlatencySamplerate not support right now!");
      AppMethodBeat.o(65761);
    }
  }

  public static String getTraceInfo()
  {
    AppMethodBeat.i(65776);
    Object localObject = new StringBuffer();
    StackTraceElement[] arrayOfStackTraceElement = new Throwable().getStackTrace();
    ((StringBuffer)localObject).append(arrayOfStackTraceElement[2].getClassName()).append(".").append(arrayOfStackTraceElement[2].getMethodName()).append(": ").append(arrayOfStackTraceElement[2].getLineNumber());
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(65776);
    return localObject;
  }

  private void initTRAEAudioManager()
  {
    AppMethodBeat.i(65786);
    if (this._context != null)
    {
      TraeAudioManager.init(this._context);
      if (this._init_as == null)
      {
        QLog.e("TRAE", 2, "TraeAudioSession-LeakCheck init: initTRAEAudioManager");
        this._init_as = new TraeAudioSession(this._context, null);
      }
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "initTRAEAudioManager , TraeAudioSession startService");
      this._init_as.startService("DEVICE_SPEAKERPHONE;DEVICE_WIREDHEADSET;DEVICE_BLUETOOTHHEADSET;");
    }
    AppMethodBeat.o(65786);
  }

  private void onOutputChanage(String paramString)
  {
    AppMethodBeat.i(65779);
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, " onOutputChanage:".concat(String.valueOf(paramString)));
    setAudioRouteSwitchState(paramString);
    if (!TraeAudioManager.isCloseSystemAPM(this._modePolicy))
      AppMethodBeat.o(65779);
    while (true)
    {
      return;
      if ((this._sceneModeKey == 1) || (this._sceneModeKey == 2) || (this._sceneModeKey == 3))
      {
        AppMethodBeat.o(65779);
        continue;
      }
      this._connectedDev = paramString;
      Object localObject;
      if (QLog.isColorLevel())
      {
        StringBuilder localStringBuilder = new StringBuilder(" onOutputChanage:").append(paramString);
        if (this._audioManager != null)
          break label277;
        localObject = " am==null";
        label120: localStringBuilder = localStringBuilder.append((String)localObject).append(" st:").append(this._streamType);
        if (this._audioTrack != null)
          break label304;
        localObject = "_audioTrack==null";
        label150: QLog.w("TRAE", 2, (String)localObject);
      }
      try
      {
        if (this._audioManager == null)
          this._audioManager = ((AudioManager)this._context.getSystemService("audio"));
        if (QLog.isColorLevel())
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>(" curr mode:");
          localObject = ((StringBuilder)localObject).append(paramString);
          if (this._audioManager != null)
            break label331;
        }
        for (paramString = "am==null"; ; paramString = this._audioManager.getMode())
        {
          QLog.w("TRAE", 2, paramString);
          if ((this._audioManager != null) && (this._connectedDev.equals("DEVICE_SPEAKERPHONE")))
            this._audioManager.setMode(0);
          this._audioRouteChanged = true;
          AppMethodBeat.o(65779);
          break;
          label277: localObject = " mode:" + this._audioManager.getMode();
          break label120;
          label304: localObject = " at.st:" + this._audioTrack.getStreamType();
          break label150;
          label331: paramString = new java/lang/StringBuilder;
          paramString.<init>(" mode:");
        }
      }
      catch (Exception paramString)
      {
        while (true)
          if (QLog.isColorLevel())
            QLog.w("TRAE", 2, paramString.getMessage());
      }
    }
  }

  private void setAudioRouteSwitchState(String paramString)
  {
    AppMethodBeat.i(65785);
    if (paramString.equals("DEVICE_EARPHONE"))
    {
      this.switchState = 1;
      AppMethodBeat.o(65785);
    }
    while (true)
    {
      return;
      if (paramString.equals("DEVICE_SPEAKERPHONE"))
      {
        this.switchState = 2;
        AppMethodBeat.o(65785);
      }
      else if (paramString.equals("DEVICE_WIREDHEADSET"))
      {
        this.switchState = 3;
        AppMethodBeat.o(65785);
      }
      else if (paramString.equals("DEVICE_BLUETOOTHHEADSET"))
      {
        this.switchState = 4;
        AppMethodBeat.o(65785);
      }
      else
      {
        this.switchState = 0;
        AppMethodBeat.o(65785);
      }
    }
  }

  private void uninitTRAEAudioManager()
  {
    AppMethodBeat.i(65787);
    if (this._context != null)
    {
      if (this._init_as != null)
      {
        if (QLog.isColorLevel())
          QLog.w("TRAE", 2, "uninitTRAEAudioManager , stopService");
        this._init_as.stopService();
        this._init_as.release();
        this._init_as = null;
        QLog.e("TRAE", 2, "TraeAudioSession-LeakCheck release: uninitTRAEAudioManager");
      }
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "uninitTRAEAudioManager , stopService");
      TraeAudioManager.uninit();
      AppMethodBeat.o(65787);
    }
    while (true)
    {
      return;
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "uninitTRAEAudioManager , context null");
      AppMethodBeat.o(65787);
    }
  }

  public int call_postprocess()
  {
    AppMethodBeat.i(65781);
    LogTraceEntry("");
    this.switchState = 0;
    if (this._as != null)
    {
      this._as.voiceCallPostprocess();
      this._as.release();
      this._as = null;
      QLog.e("TRAE", 2, "TraeAudioSession-LeakCheck release: call_postprocess");
    }
    TraeAudioManager.IsUpdateSceneFlag = false;
    LogTraceExit();
    AppMethodBeat.o(65781);
    return 0;
  }

  public int call_postprocess_media()
  {
    AppMethodBeat.i(65783);
    LogTraceEntry("");
    this.switchState = 0;
    if (this._as != null)
    {
      this._as.release();
      this._as = null;
      QLog.e("TRAE", 2, "TraeAudioSession-LeakCheck release: call_postprocess_media");
    }
    TraeAudioManager.IsUpdateSceneFlag = false;
    LogTraceExit();
    AppMethodBeat.o(65783);
    return 0;
  }

  // ERROR //
  public int call_preprocess()
  {
    // Byte code:
    //   0: ldc_w 812
    //   3: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc_w 795
    //   9: invokestatic 797	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:LogTraceEntry	(Ljava/lang/String;)V
    //   12: aload_0
    //   13: iconst_0
    //   14: putfield 158	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:switchState	I
    //   17: aload_0
    //   18: aload_0
    //   19: getfield 105	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioStreamTypePolicy	I
    //   22: invokestatic 289	com/tencent/rtmp/sharp/jni/TraeAudioManager:getAudioStreamType	(I)I
    //   25: putfield 87	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   28: aload_0
    //   29: getfield 138	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_as	Lcom/tencent/rtmp/sharp/jni/TraeAudioSession;
    //   32: ifnonnull +12 -> 44
    //   35: ldc 187
    //   37: iconst_2
    //   38: ldc_w 814
    //   41: invokestatic 269	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   44: aload_0
    //   45: new 331	com/tencent/rtmp/sharp/jni/TraeAudioSession
    //   48: dup
    //   49: aload_0
    //   50: getfield 99	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_context	Landroid/content/Context;
    //   53: new 816	com/tencent/rtmp/sharp/jni/AudioDeviceInterface$1
    //   56: dup
    //   57: aload_0
    //   58: invokespecial 819	com/tencent/rtmp/sharp/jni/AudioDeviceInterface$1:<init>	(Lcom/tencent/rtmp/sharp/jni/AudioDeviceInterface;)V
    //   61: invokespecial 742	com/tencent/rtmp/sharp/jni/TraeAudioSession:<init>	(Landroid/content/Context;Lcom/tencent/rtmp/sharp/jni/TraeAudioSession$a;)V
    //   64: putfield 138	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_as	Lcom/tencent/rtmp/sharp/jni/TraeAudioSession;
    //   67: aload_0
    //   68: iconst_0
    //   69: putfield 154	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_preDone	Z
    //   72: aload_0
    //   73: getfield 138	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_as	Lcom/tencent/rtmp/sharp/jni/TraeAudioSession;
    //   76: ifnull +135 -> 211
    //   79: aload_0
    //   80: getfield 146	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_prelock	Ljava/util/concurrent/locks/ReentrantLock;
    //   83: invokevirtual 453	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   86: aload_0
    //   87: getfield 138	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_as	Lcom/tencent/rtmp/sharp/jni/TraeAudioSession;
    //   90: aload_0
    //   91: getfield 101	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_modePolicy	I
    //   94: aload_0
    //   95: getfield 87	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   98: invokevirtual 822	com/tencent/rtmp/sharp/jni/TraeAudioSession:voiceCallPreprocess	(II)I
    //   101: pop
    //   102: aload_0
    //   103: getfield 138	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_as	Lcom/tencent/rtmp/sharp/jni/TraeAudioSession;
    //   106: invokevirtual 825	com/tencent/rtmp/sharp/jni/TraeAudioSession:connectHighestPriorityDevice	()I
    //   109: pop
    //   110: bipush 7
    //   112: istore_1
    //   113: iload_1
    //   114: iconst_1
    //   115: isub
    //   116: istore_2
    //   117: iload_1
    //   118: ifle +63 -> 181
    //   121: aload_0
    //   122: getfield 154	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_preDone	Z
    //   125: ifne +56 -> 181
    //   128: aload_0
    //   129: getfield 152	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_precon	Ljava/util/concurrent/locks/Condition;
    //   132: lconst_1
    //   133: getstatic 831	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   136: invokeinterface 837 4 0
    //   141: pop
    //   142: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   145: ifeq +97 -> 242
    //   148: new 205	java/lang/StringBuilder
    //   151: astore_3
    //   152: aload_3
    //   153: ldc_w 839
    //   156: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   159: ldc 187
    //   161: iconst_2
    //   162: aload_3
    //   163: aload_0
    //   164: getfield 138	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_as	Lcom/tencent/rtmp/sharp/jni/TraeAudioSession;
    //   167: invokevirtual 327	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   170: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   173: invokestatic 269	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   176: iload_2
    //   177: istore_1
    //   178: goto -65 -> 113
    //   181: invokestatic 185	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   184: ifeq +12 -> 196
    //   187: ldc 187
    //   189: iconst_2
    //   190: ldc_w 841
    //   193: invokestatic 269	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   196: aload_0
    //   197: getfield 138	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_as	Lcom/tencent/rtmp/sharp/jni/TraeAudioSession;
    //   200: invokevirtual 844	com/tencent/rtmp/sharp/jni/TraeAudioSession:getConnectedDevice	()I
    //   203: pop
    //   204: aload_0
    //   205: getfield 146	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_prelock	Ljava/util/concurrent/locks/ReentrantLock;
    //   208: invokevirtual 456	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   211: invokestatic 804	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:LogTraceExit	()V
    //   214: ldc_w 812
    //   217: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   220: iconst_0
    //   221: ireturn
    //   222: astore_3
    //   223: aload_0
    //   224: getfield 146	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_prelock	Ljava/util/concurrent/locks/ReentrantLock;
    //   227: invokevirtual 456	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   230: ldc_w 812
    //   233: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   236: aload_3
    //   237: athrow
    //   238: astore_3
    //   239: goto -43 -> 196
    //   242: iload_2
    //   243: istore_1
    //   244: goto -131 -> 113
    //
    // Exception table:
    //   from	to	target	type
    //   86	110	222	finally
    //   121	176	222	finally
    //   181	196	222	finally
    //   196	204	222	finally
    //   121	176	238	java/lang/InterruptedException
    //   181	196	238	java/lang/InterruptedException
  }

  public int call_preprocess_media()
  {
    AppMethodBeat.i(65782);
    LogTraceEntry("");
    this.switchState = 0;
    if (this._as == null)
      QLog.e("TRAE", 2, "TraeAudioSession-LeakCheck init: call_preprocess_media");
    this._as = new TraeAudioSession(this._context, new AudioDeviceInterface.2(this));
    if (this._as != null);
    try
    {
      if (this._audioManager == null)
        this._audioManager = ((AudioManager)this._context.getSystemService("audio"));
      if (this._audioManager != null)
      {
        if (this._audioManager.getMode() == 2)
          for (int i = 5; (i > 0) && (this._audioManager.getMode() == 2); i--)
          {
            if (QLog.isColorLevel())
            {
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>("media call_preprocess waiting...  mode:");
              QLog.e("TRAE", 2, this._audioManager.getMode());
            }
            Thread.sleep(500L);
          }
        if (this._audioManager.getMode() != 0)
          this._audioManager.setMode(0);
      }
      this._as.connectHighestPriorityDevice();
      this._as.getConnectedDevice();
      if (QLog.isColorLevel())
        QLog.e("TRAE", 2, "call_preprocess done!");
      label219: LogTraceExit();
      AppMethodBeat.o(65782);
      return 0;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label219;
    }
  }

  public int getAudioRouteSwitchState()
  {
    return this.switchState;
  }

  public void setContext(Context paramContext)
  {
    this._context = paramContext;
  }

  public void setJavaInterface(int paramInt)
  {
    AppMethodBeat.i(65784);
    if (paramInt == 0);
    for (this.usingJava = false; ; this.usingJava = true)
    {
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "setJavaInterface flg:".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(65784);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.sharp.jni.AudioDeviceInterface
 * JD-Core Version:    0.6.2
 */