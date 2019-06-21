package com.tencent.qqmusic.mediaplayer.codec.ffmpeg;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition;

public class FfmpegRecognition
  implements IAudioRecognition
{
  private static final String SO_AUDIO_COMMON = "audio_common";
  private static final String SO_BASE_NAME = "FFmpeg";
  private static final String SO_NAME = "ffmpeg_decoder";
  private static final String SO_NEON_BASE_NAME = "FFmpeg_v7a";
  private static final String SO_NEON_NAME = "ffmpeg_decoder_v7a";
  private static final String TAG = "FfmpegRecognition";

  // ERROR //
  public AudioFormat.AudioType getAudioType(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc 35
    //   4: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_2
    //   8: ifnull +8 -> 16
    //   11: aload_2
    //   12: arraylength
    //   13: ifne +157 -> 170
    //   16: new 43	java/io/FileInputStream
    //   19: astore_2
    //   20: aload_2
    //   21: aload_1
    //   22: invokespecial 46	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   25: aload_2
    //   26: astore_1
    //   27: bipush 64
    //   29: newarray byte
    //   31: astore 4
    //   33: aload_2
    //   34: astore_1
    //   35: aload_2
    //   36: aload 4
    //   38: invokevirtual 52	java/io/InputStream:read	([B)I
    //   41: pop
    //   42: aload_2
    //   43: astore_1
    //   44: new 54	java/lang/String
    //   47: astore 5
    //   49: aload_2
    //   50: astore_1
    //   51: aload 5
    //   53: aload 4
    //   55: invokespecial 57	java/lang/String:<init>	([B)V
    //   58: aload_2
    //   59: invokevirtual 60	java/io/InputStream:close	()V
    //   62: aload 5
    //   64: astore_1
    //   65: aload_1
    //   66: ifnull +116 -> 182
    //   69: aload_1
    //   70: ldc 62
    //   72: invokevirtual 66	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   75: ifeq +107 -> 182
    //   78: getstatic 72	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:M4A	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   81: astore_1
    //   82: ldc 35
    //   84: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   87: aload_1
    //   88: areturn
    //   89: astore_1
    //   90: ldc 25
    //   92: aload_1
    //   93: invokestatic 81	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   96: aload 5
    //   98: astore_1
    //   99: goto -34 -> 65
    //   102: astore 5
    //   104: aconst_null
    //   105: astore_2
    //   106: aload_2
    //   107: astore_1
    //   108: ldc 25
    //   110: aload 5
    //   112: invokestatic 81	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   115: aload_3
    //   116: astore_1
    //   117: aload_2
    //   118: ifnull -53 -> 65
    //   121: aload_2
    //   122: invokevirtual 60	java/io/InputStream:close	()V
    //   125: aload_3
    //   126: astore_1
    //   127: goto -62 -> 65
    //   130: astore_1
    //   131: ldc 25
    //   133: aload_1
    //   134: invokestatic 81	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   137: aload_3
    //   138: astore_1
    //   139: goto -74 -> 65
    //   142: astore_2
    //   143: aconst_null
    //   144: astore_1
    //   145: aload_1
    //   146: ifnull +7 -> 153
    //   149: aload_1
    //   150: invokevirtual 60	java/io/InputStream:close	()V
    //   153: ldc 35
    //   155: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   158: aload_2
    //   159: athrow
    //   160: astore_1
    //   161: ldc 25
    //   163: aload_1
    //   164: invokestatic 81	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   167: goto -14 -> 153
    //   170: new 54	java/lang/String
    //   173: dup
    //   174: aload_2
    //   175: invokespecial 57	java/lang/String:<init>	([B)V
    //   178: astore_1
    //   179: goto -114 -> 65
    //   182: getstatic 84	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:UNSUPPORT	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   185: astore_1
    //   186: ldc 35
    //   188: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   191: goto -104 -> 87
    //   194: astore_2
    //   195: goto -50 -> 145
    //   198: astore 5
    //   200: goto -94 -> 106
    //
    // Exception table:
    //   from	to	target	type
    //   58	62	89	java/lang/Exception
    //   16	25	102	java/lang/Exception
    //   121	125	130	java/lang/Exception
    //   16	25	142	finally
    //   149	153	160	java/lang/Exception
    //   27	33	194	finally
    //   35	42	194	finally
    //   44	49	194	finally
    //   51	58	194	finally
    //   108	115	194	finally
    //   27	33	198	java/lang/Exception
    //   35	42	198	java/lang/Exception
    //   44	49	198	java/lang/Exception
    //   51	58	198	java/lang/Exception
  }

  public AudioFormat.AudioType guessAudioType(String paramString)
  {
    AppMethodBeat.i(128580);
    paramString = getAudioType(paramString, null);
    AppMethodBeat.o(128580);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.codec.ffmpeg.FfmpegRecognition
 * JD-Core Version:    0.6.2
 */