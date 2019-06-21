package com.tencent.qqmusic.mediaplayer.codec.flac;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition;
import com.tencent.qqmusic.mediaplayer.codec.NativeDecoder;
import com.tencent.qqmusic.mediaplayer.util.Logger;

public class FLACRecognition
  implements IAudioRecognition
{
  public static final String TAG = "FLACRecognition";

  private boolean checkFormatBySoftDecoder(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(128582);
    NativeDecoder localNativeDecoder = new NativeDecoder();
    try
    {
      boolean bool3;
      if (localNativeDecoder.init(paramString, false) == 0)
      {
        paramString = localNativeDecoder.getAudioInformation();
        bool3 = bool2;
        if (paramString != null)
        {
          AudioFormat.AudioType localAudioType = paramString.getAudioType();
          paramString = AudioFormat.AudioType.FLAC;
          bool3 = bool2;
          if (localAudioType == paramString)
            bool3 = true;
        }
      }
      while (true)
      {
        try
        {
          localNativeDecoder.release();
          AppMethodBeat.o(128582);
          return bool3;
        }
        catch (Throwable paramString)
        {
          Logger.e("FLACRecognition", paramString);
          continue;
        }
        try
        {
          localNativeDecoder.release();
          AppMethodBeat.o(128582);
          bool3 = bool1;
        }
        catch (Throwable paramString)
        {
          while (true)
            Logger.e("FLACRecognition", paramString);
        }
      }
    }
    catch (Throwable paramString)
    {
      while (true)
      {
        paramString = paramString;
        Logger.e("FLACRecognition", paramString);
        try
        {
          localNativeDecoder.release();
        }
        catch (Throwable paramString)
        {
          Logger.e("FLACRecognition", paramString);
        }
      }
    }
    finally
    {
    }
    try
    {
      localNativeDecoder.release();
      AppMethodBeat.o(128582);
      throw paramString;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        Logger.e("FLACRecognition", localThrowable);
    }
  }

  public AudioFormat.AudioType getAudioType(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(128581);
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0) && (new String(paramArrayOfByte).startsWith("flaC")))
    {
      paramString = AudioFormat.AudioType.FLAC;
      AppMethodBeat.o(128581);
    }
    while (true)
    {
      return paramString;
      if (checkFormatBySoftDecoder(paramString))
      {
        paramString = AudioFormat.AudioType.FLAC;
        AppMethodBeat.o(128581);
      }
      else
      {
        paramString = AudioFormat.AudioType.UNSUPPORT;
        AppMethodBeat.o(128581);
      }
    }
  }

  // ERROR //
  public AudioFormat.AudioType guessAudioType(String paramString)
  {
    // Byte code:
    //   0: ldc 84
    //   2: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: invokestatic 90	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   9: ifne +105 -> 114
    //   12: aload_1
    //   13: invokevirtual 94	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   16: ldc 96
    //   18: invokevirtual 99	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   21: ifeq +14 -> 35
    //   24: getstatic 49	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:FLAC	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   27: astore_1
    //   28: ldc 84
    //   30: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   33: aload_1
    //   34: areturn
    //   35: new 101	java/io/FileInputStream
    //   38: astore_2
    //   39: aload_2
    //   40: aload_1
    //   41: invokespecial 104	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   44: aload_2
    //   45: astore_3
    //   46: bipush 64
    //   48: newarray byte
    //   50: astore 4
    //   52: aload_2
    //   53: astore_3
    //   54: aload_2
    //   55: aload 4
    //   57: invokevirtual 110	java/io/InputStream:read	([B)I
    //   60: pop
    //   61: aload_2
    //   62: astore_3
    //   63: aload_0
    //   64: aload_1
    //   65: aload 4
    //   67: invokevirtual 112	com/tencent/qqmusic/mediaplayer/codec/flac/FLACRecognition:getAudioType	(Ljava/lang/String;[B)Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   70: astore_1
    //   71: aload_2
    //   72: invokevirtual 115	java/io/InputStream:close	()V
    //   75: ldc 84
    //   77: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   80: goto -47 -> 33
    //   83: astore_3
    //   84: ldc 10
    //   86: aload_3
    //   87: invokestatic 62	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   90: goto -15 -> 75
    //   93: astore 4
    //   95: aconst_null
    //   96: astore_1
    //   97: aload_1
    //   98: astore_3
    //   99: ldc 10
    //   101: aload 4
    //   103: invokestatic 62	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   106: aload_1
    //   107: ifnull +7 -> 114
    //   110: aload_1
    //   111: invokevirtual 115	java/io/InputStream:close	()V
    //   114: getstatic 79	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:UNSUPPORT	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   117: astore_1
    //   118: ldc 84
    //   120: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   123: goto -90 -> 33
    //   126: astore_1
    //   127: ldc 10
    //   129: aload_1
    //   130: invokestatic 62	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   133: goto -19 -> 114
    //   136: astore_1
    //   137: aconst_null
    //   138: astore_3
    //   139: aload_3
    //   140: ifnull +7 -> 147
    //   143: aload_3
    //   144: invokevirtual 115	java/io/InputStream:close	()V
    //   147: ldc 84
    //   149: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   152: aload_1
    //   153: athrow
    //   154: astore_3
    //   155: ldc 10
    //   157: aload_3
    //   158: invokestatic 62	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   161: goto -14 -> 147
    //   164: astore_1
    //   165: goto -26 -> 139
    //   168: astore 4
    //   170: aload_2
    //   171: astore_1
    //   172: goto -75 -> 97
    //
    // Exception table:
    //   from	to	target	type
    //   71	75	83	java/lang/Exception
    //   35	44	93	java/lang/Exception
    //   110	114	126	java/lang/Exception
    //   35	44	136	finally
    //   143	147	154	java/lang/Exception
    //   46	52	164	finally
    //   54	61	164	finally
    //   63	71	164	finally
    //   99	106	164	finally
    //   46	52	168	java/lang/Exception
    //   54	61	168	java/lang/Exception
    //   63	71	168	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.codec.flac.FLACRecognition
 * JD-Core Version:    0.6.2
 */