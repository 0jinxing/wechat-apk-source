package com.tencent.qqmusic.mediaplayer;

import android.media.AudioTrack;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.codec.BaseDecoder;
import com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition;
import com.tencent.qqmusic.mediaplayer.codec.NativeDecoder;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class AudioRecognition
{
  private static final int READ_FILE_HEADER_SIZE = 64;
  private static String TAG;
  private static HashMap<String, AudioFormat.AudioType> mGuessFormatResultCache;
  private static HashMap<String, AudioFormat.AudioType> mRecognitionResultCache;

  static
  {
    AppMethodBeat.i(128376);
    TAG = "AudioRecognition";
    mRecognitionResultCache = new HashMap();
    mGuessFormatResultCache = new HashMap();
    AppMethodBeat.o(128376);
  }

  public static int calcBitDept(long paramLong1, long paramLong2, int paramInt, long paramLong3)
  {
    AppMethodBeat.i(128374);
    if ((0L == paramLong2) || (paramInt == 0))
    {
      paramInt = 0;
      AppMethodBeat.o(128374);
    }
    while (true)
    {
      return paramInt;
      double d = 1000.0F * (float)paramLong1 / (float)(paramInt * paramLong2 * paramLong3);
      int i = (int)Math.round(d);
      Logger.i(TAG, "byteNumbers = " + paramLong1 + ",time = " + paramLong2 + ",channels = " + paramInt + ",sampleRate = " + paramLong3 + ",bitDept = " + d);
      AppMethodBeat.o(128374);
      paramInt = i;
    }
  }

  public static int getAudioBitDept(BaseDecoder paramBaseDecoder, AudioInformation paramAudioInformation)
  {
    int i = 0;
    AppMethodBeat.i(128373);
    int j;
    if (paramAudioInformation.getAudioType() == AudioFormat.AudioType.FLAC)
      j = 1;
    while (true)
    {
      int k = i;
      if (j != 0);
      try
      {
        long l = paramBaseDecoder.getMinBufferSize();
        k = (int)l;
        i = AudioTrack.getMinBufferSize((int)paramAudioInformation.getSampleRate(), paramAudioInformation.getChannels(), 2);
        if (j == 0)
          if (i % 2048 != 0)
          {
            k = (i / 2048 + 1) * 2048;
            j = paramBaseDecoder.decodeData(k, new byte[k]);
            if (j <= 0)
            {
              k *= 2;
              k = calcBitDept(k, paramBaseDecoder.getCurrentTime(), paramAudioInformation.getChannels(), paramAudioInformation.getSampleRate());
              AppMethodBeat.o(128373);
              return k;
              j = 0;
            }
          }
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          Logger.e(TAG, localThrowable);
          k = i;
          continue;
          k = j;
          continue;
          k = i;
        }
      }
    }
  }

  public static NativeDecoder getDecoderFormFile(String paramString)
  {
    AppMethodBeat.i(128372);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = null;
      AppMethodBeat.o(128372);
    }
    while (true)
    {
      return paramString;
      NativeDecoder localNativeDecoder = new NativeDecoder();
      localNativeDecoder.init(paramString, false);
      AppMethodBeat.o(128372);
      paramString = localNativeDecoder;
    }
  }

  public static AudioFormat.AudioType guessFormat(String paramString)
  {
    AppMethodBeat.i(128371);
    if ((mGuessFormatResultCache != null) && (mGuessFormatResultCache.containsKey(paramString)))
    {
      paramString = (AudioFormat.AudioType)mGuessFormatResultCache.get(paramString);
      AppMethodBeat.o(128371);
    }
    while (true)
    {
      return paramString;
      Iterator localIterator = MediaCodecFactory.getSupportAudioType().iterator();
      while (true)
        if (localIterator.hasNext())
        {
          Object localObject = MediaCodecFactory.createDecoderByType((AudioFormat.AudioType)localIterator.next());
          if (localObject != null)
          {
            localObject = ((IAudioRecognition)localObject).guessAudioType(paramString);
            if (AudioFormat.isAudioType((AudioFormat.AudioType)localObject))
            {
              mGuessFormatResultCache.put(paramString, localObject);
              AppMethodBeat.o(128371);
              paramString = (String)localObject;
              break;
            }
          }
        }
      paramString = AudioFormat.AudioType.UNSUPPORT;
      AppMethodBeat.o(128371);
    }
  }

  public static AudioFormat.AudioType recognitionAudioFormatByExtensions(String paramString)
  {
    AppMethodBeat.i(128370);
    Object localObject1;
    if (TextUtils.isEmpty(paramString))
    {
      localObject1 = null;
      AppMethodBeat.o(128370);
    }
    while (true)
    {
      return localObject1;
      if (mRecognitionResultCache.containsKey(paramString))
      {
        localObject1 = (AudioFormat.AudioType)mRecognitionResultCache.get(paramString);
        Logger.w(TAG, "Get from cache " + localObject1 + ",filepath = " + paramString + ",retType = " + localObject1);
        AppMethodBeat.o(128370);
        continue;
      }
      AudioFormat.AudioType localAudioType = guessFormat(paramString);
      localObject1 = localAudioType;
      if (!AudioFormat.isAudioType(localAudioType))
        Logger.i(TAG, "recognitionAudioFormatByExtensions guessAudioType = null,so recognitionAudioFormatExactly filepath = ".concat(String.valueOf(paramString)));
      try
      {
        localObject1 = recognitionAudioFormatExactly(paramString);
        Logger.i(TAG, "recognitionAudioFormatByExtensions filepath = " + paramString + ",guessAudioType = " + localObject1);
        AppMethodBeat.o(128370);
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          Logger.e(TAG, localIOException);
          Object localObject2 = localAudioType;
        }
      }
    }
  }

  // ERROR //
  public static AudioFormat.AudioType recognitionAudioFormatExactly(String paramString)
  {
    // Byte code:
    //   0: ldc 248
    //   2: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: ifnonnull +12 -> 18
    //   9: ldc 248
    //   11: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   14: aconst_null
    //   15: astore_1
    //   16: aload_1
    //   17: areturn
    //   18: getstatic 35	com/tencent/qqmusic/mediaplayer/AudioRecognition:mGuessFormatResultCache	Ljava/util/HashMap;
    //   21: aload_0
    //   22: invokevirtual 251	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   25: pop
    //   26: getstatic 26	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   29: ldc 253
    //   31: aload_0
    //   32: invokestatic 232	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   35: invokevirtual 236	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   38: invokestatic 87	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   41: new 255	java/io/File
    //   44: dup
    //   45: aload_0
    //   46: invokespecial 256	java/io/File:<init>	(Ljava/lang/String;)V
    //   49: astore_1
    //   50: aload_1
    //   51: invokevirtual 259	java/io/File:exists	()Z
    //   54: ifne +28 -> 82
    //   57: new 261	java/io/FileNotFoundException
    //   60: dup
    //   61: ldc_w 263
    //   64: aload_0
    //   65: invokestatic 232	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   68: invokevirtual 236	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   71: invokespecial 264	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   74: astore_0
    //   75: ldc 248
    //   77: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   80: aload_0
    //   81: athrow
    //   82: aload_1
    //   83: invokevirtual 267	java/io/File:canRead	()Z
    //   86: ifne +28 -> 114
    //   89: new 209	java/io/IOException
    //   92: dup
    //   93: ldc_w 269
    //   96: aload_0
    //   97: invokestatic 232	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   100: invokevirtual 236	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   103: invokespecial 270	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   106: astore_0
    //   107: ldc 248
    //   109: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   112: aload_0
    //   113: athrow
    //   114: getstatic 26	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   117: new 52	java/lang/StringBuilder
    //   120: dup
    //   121: ldc_w 272
    //   124: invokespecial 57	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   127: aload_1
    //   128: invokevirtual 275	java/io/File:length	()J
    //   131: invokevirtual 61	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   134: invokevirtual 82	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   137: invokestatic 87	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   140: invokestatic 280	java/lang/System:currentTimeMillis	()J
    //   143: lstore_2
    //   144: aload_0
    //   145: invokestatic 224	com/tencent/qqmusic/mediaplayer/AudioRecognition:guessFormat	(Ljava/lang/String;)Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   148: astore 4
    //   150: invokestatic 168	com/tencent/qqmusic/mediaplayer/MediaCodecFactory:getSupportAudioType	()Ljava/util/ArrayList;
    //   153: astore 5
    //   155: aload 4
    //   157: ifnull +58 -> 215
    //   160: aload 5
    //   162: aload 4
    //   164: invokevirtual 283	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
    //   167: ifeq +48 -> 215
    //   170: aload 5
    //   172: aload 4
    //   174: invokevirtual 285	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   177: pop
    //   178: aload 5
    //   180: iconst_0
    //   181: aload 4
    //   183: invokevirtual 289	java/util/ArrayList:add	(ILjava/lang/Object;)V
    //   186: getstatic 292	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:MP3	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   189: aload 4
    //   191: invokevirtual 295	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:equals	(Ljava/lang/Object;)Z
    //   194: ifeq +21 -> 215
    //   197: aload 5
    //   199: getstatic 104	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:FLAC	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   202: invokevirtual 285	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   205: pop
    //   206: aload 5
    //   208: iconst_0
    //   209: getstatic 104	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:FLAC	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   212: invokevirtual 289	java/util/ArrayList:add	(ILjava/lang/Object;)V
    //   215: new 297	java/io/FileInputStream
    //   218: astore 6
    //   220: aload 6
    //   222: aload_0
    //   223: invokespecial 298	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   226: aload 6
    //   228: astore 7
    //   230: sipush 1024
    //   233: invokestatic 304	com/tencent/qqmusic/mediaplayer/CacheBytesManager:getStatic	(I)[B
    //   236: astore 8
    //   238: aload 6
    //   240: astore 7
    //   242: aload 6
    //   244: aload 8
    //   246: invokevirtual 310	java/io/InputStream:read	([B)I
    //   249: istore 9
    //   251: iload 9
    //   253: bipush 64
    //   255: if_icmplt +520 -> 775
    //   258: aload 6
    //   260: astore 7
    //   262: bipush 64
    //   264: newarray byte
    //   266: astore_1
    //   267: aload 6
    //   269: astore 7
    //   271: aload_1
    //   272: astore 10
    //   274: aload 8
    //   276: iconst_0
    //   277: aload_1
    //   278: iconst_0
    //   279: bipush 64
    //   281: invokestatic 314	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   284: aload 6
    //   286: astore 7
    //   288: aload_1
    //   289: astore 10
    //   291: aload 8
    //   293: invokestatic 318	com/tencent/qqmusic/mediaplayer/CacheBytesManager:recycle	([B)[B
    //   296: pop
    //   297: aload 6
    //   299: astore 7
    //   301: aload_1
    //   302: astore 10
    //   304: getstatic 26	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   307: astore 11
    //   309: aload 6
    //   311: astore 7
    //   313: aload_1
    //   314: astore 10
    //   316: new 52	java/lang/StringBuilder
    //   319: astore 12
    //   321: aload 6
    //   323: astore 7
    //   325: aload_1
    //   326: astore 10
    //   328: aload 12
    //   330: ldc_w 320
    //   333: invokespecial 57	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   336: aload 6
    //   338: astore 7
    //   340: aload_1
    //   341: astore 10
    //   343: new 228	java/lang/String
    //   346: astore 13
    //   348: aload 6
    //   350: astore 7
    //   352: aload_1
    //   353: astore 10
    //   355: aload 13
    //   357: aload 8
    //   359: iconst_0
    //   360: iload 9
    //   362: invokespecial 323	java/lang/String:<init>	([BII)V
    //   365: aload 6
    //   367: astore 7
    //   369: aload_1
    //   370: astore 10
    //   372: aload 11
    //   374: aload 12
    //   376: aload 13
    //   378: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   381: ldc_w 325
    //   384: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: aload_0
    //   388: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   391: invokevirtual 82	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   394: invokestatic 87	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   397: aload 6
    //   399: invokevirtual 328	java/io/InputStream:close	()V
    //   402: aload 5
    //   404: invokevirtual 174	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   407: astore 10
    //   409: aload 10
    //   411: invokeinterface 180 1 0
    //   416: ifeq +351 -> 767
    //   419: aload 10
    //   421: invokeinterface 184 1 0
    //   426: checkcast 100	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType
    //   429: invokestatic 188	com/tencent/qqmusic/mediaplayer/MediaCodecFactory:createDecoderByType	(Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;)Lcom/tencent/qqmusic/mediaplayer/codec/IAudioRecognition;
    //   432: astore 7
    //   434: aload 7
    //   436: ifnull -27 -> 409
    //   439: aload 7
    //   441: aload_0
    //   442: aload_1
    //   443: invokeinterface 331 3 0
    //   448: astore 7
    //   450: aload 7
    //   452: invokestatic 199	com/tencent/qqmusic/mediaplayer/AudioFormat:isAudioType	(Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;)Z
    //   455: ifeq -46 -> 409
    //   458: getstatic 26	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   461: new 52	java/lang/StringBuilder
    //   464: dup
    //   465: ldc_w 333
    //   468: invokespecial 57	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   471: aload 7
    //   473: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   476: ldc_w 335
    //   479: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   482: aload_0
    //   483: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   486: ldc_w 337
    //   489: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   492: invokestatic 280	java/lang/System:currentTimeMillis	()J
    //   495: lload_2
    //   496: lsub
    //   497: invokevirtual 61	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   500: ldc_w 339
    //   503: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   506: aload 7
    //   508: aload 4
    //   510: invokevirtual 295	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:equals	(Ljava/lang/Object;)Z
    //   513: invokevirtual 342	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   516: invokevirtual 82	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   519: invokestatic 222	com/tencent/qqmusic/mediaplayer/util/Logger:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   522: aload 7
    //   524: astore_1
    //   525: aload_1
    //   526: ifnonnull +158 -> 684
    //   529: getstatic 206	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:UNSUPPORT	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   532: astore_1
    //   533: getstatic 26	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   536: new 52	java/lang/StringBuilder
    //   539: dup
    //   540: ldc_w 344
    //   543: invokespecial 57	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   546: aload_0
    //   547: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   550: ldc 219
    //   552: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   555: aload_1
    //   556: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   559: invokevirtual 82	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   562: invokestatic 87	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   565: ldc 248
    //   567: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   570: goto -554 -> 16
    //   573: astore 7
    //   575: getstatic 26	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   578: aload 7
    //   580: invokestatic 135	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   583: goto -181 -> 402
    //   586: astore 10
    //   588: aconst_null
    //   589: astore_1
    //   590: aconst_null
    //   591: astore 6
    //   593: aload 6
    //   595: astore 7
    //   597: getstatic 26	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   600: aload 10
    //   602: invokestatic 135	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   605: aload 6
    //   607: ifnull +165 -> 772
    //   610: aload 6
    //   612: invokevirtual 328	java/io/InputStream:close	()V
    //   615: goto -213 -> 402
    //   618: astore 7
    //   620: getstatic 26	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   623: aload 7
    //   625: invokestatic 135	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   628: goto -226 -> 402
    //   631: astore_0
    //   632: aconst_null
    //   633: astore 7
    //   635: aload 7
    //   637: ifnull +8 -> 645
    //   640: aload 7
    //   642: invokevirtual 328	java/io/InputStream:close	()V
    //   645: ldc 248
    //   647: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   650: aload_0
    //   651: athrow
    //   652: astore_1
    //   653: getstatic 26	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   656: aload_1
    //   657: invokestatic 135	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   660: goto -15 -> 645
    //   663: astore 7
    //   665: getstatic 26	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   668: ldc_w 346
    //   671: aload 7
    //   673: invokestatic 349	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   676: getstatic 206	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:UNSUPPORT	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   679: astore 7
    //   681: goto -231 -> 450
    //   684: getstatic 26	com/tencent/qqmusic/mediaplayer/AudioRecognition:TAG	Ljava/lang/String;
    //   687: new 52	java/lang/StringBuilder
    //   690: dup
    //   691: ldc_w 351
    //   694: invokespecial 57	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   697: aload_0
    //   698: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   701: ldc_w 353
    //   704: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   707: aload_1
    //   708: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   711: ldc_w 355
    //   714: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   717: invokevirtual 82	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   720: invokestatic 87	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   723: getstatic 33	com/tencent/qqmusic/mediaplayer/AudioRecognition:mRecognitionResultCache	Ljava/util/HashMap;
    //   726: aload_0
    //   727: aload_1
    //   728: invokevirtual 203	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   731: pop
    //   732: getstatic 35	com/tencent/qqmusic/mediaplayer/AudioRecognition:mGuessFormatResultCache	Ljava/util/HashMap;
    //   735: aload_0
    //   736: aload_1
    //   737: invokevirtual 203	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   740: pop
    //   741: goto -208 -> 533
    //   744: astore_0
    //   745: goto -110 -> 635
    //   748: astore 10
    //   750: aconst_null
    //   751: astore_1
    //   752: goto -159 -> 593
    //   755: astore 7
    //   757: aload 10
    //   759: astore_1
    //   760: aload 7
    //   762: astore 10
    //   764: goto -171 -> 593
    //   767: aconst_null
    //   768: astore_1
    //   769: goto -244 -> 525
    //   772: goto -370 -> 402
    //   775: aconst_null
    //   776: astore_1
    //   777: goto -493 -> 284
    //
    // Exception table:
    //   from	to	target	type
    //   397	402	573	java/lang/Exception
    //   215	226	586	java/lang/Exception
    //   610	615	618	java/lang/Exception
    //   215	226	631	finally
    //   640	645	652	java/lang/Exception
    //   439	450	663	com/tencent/qqmusic/mediaplayer/SoNotFindException
    //   230	238	744	finally
    //   242	251	744	finally
    //   262	267	744	finally
    //   274	284	744	finally
    //   291	297	744	finally
    //   304	309	744	finally
    //   316	321	744	finally
    //   328	336	744	finally
    //   343	348	744	finally
    //   355	365	744	finally
    //   372	397	744	finally
    //   597	605	744	finally
    //   230	238	748	java/lang/Exception
    //   242	251	748	java/lang/Exception
    //   262	267	748	java/lang/Exception
    //   274	284	755	java/lang/Exception
    //   291	297	755	java/lang/Exception
    //   304	309	755	java/lang/Exception
    //   316	321	755	java/lang/Exception
    //   328	336	755	java/lang/Exception
    //   343	348	755	java/lang/Exception
    //   355	365	755	java/lang/Exception
    //   372	397	755	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.AudioRecognition
 * JD-Core Version:    0.6.2
 */