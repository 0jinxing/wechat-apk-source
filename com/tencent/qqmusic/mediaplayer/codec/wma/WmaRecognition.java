package com.tencent.qqmusic.mediaplayer.codec.wma;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition;

public class WmaRecognition
  implements IAudioRecognition
{
  public static String TAG = "WmaRecognition";
  private final int HEARER_LENGTH;
  private final byte[] WMA_HEADER;

  public WmaRecognition()
  {
    AppMethodBeat.i(128584);
    this.HEARER_LENGTH = 16;
    this.WMA_HEADER = new byte[] { 48, 38, -78, 117, -114, 102, -49, 17, -90, -39, 0, -86, 0, 98, -50, 108 };
    AppMethodBeat.o(128584);
  }

  // ERROR //
  public AudioFormat.AudioType getAudioType(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc 56
    //   2: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_2
    //   6: ifnull +47 -> 53
    //   9: aload_2
    //   10: arraylength
    //   11: bipush 16
    //   13: if_icmplt +40 -> 53
    //   16: aload_2
    //   17: ifnull +182 -> 199
    //   20: aload_2
    //   21: arraylength
    //   22: bipush 16
    //   24: if_icmplt +175 -> 199
    //   27: iconst_0
    //   28: istore_3
    //   29: iload_3
    //   30: bipush 16
    //   32: if_icmpge +150 -> 182
    //   35: aload_2
    //   36: iload_3
    //   37: baload
    //   38: aload_0
    //   39: getfield 48	com/tencent/qqmusic/mediaplayer/codec/wma/WmaRecognition:WMA_HEADER	[B
    //   42: iload_3
    //   43: baload
    //   44: if_icmpne +138 -> 182
    //   47: iinc 3 1
    //   50: goto -21 -> 29
    //   53: new 58	java/io/FileInputStream
    //   56: astore 4
    //   58: aload 4
    //   60: aload_1
    //   61: invokespecial 61	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   64: aload 4
    //   66: astore_2
    //   67: bipush 16
    //   69: newarray byte
    //   71: astore_1
    //   72: aload 4
    //   74: astore_2
    //   75: aload 4
    //   77: aload_1
    //   78: invokevirtual 67	java/io/InputStream:read	([B)I
    //   81: pop
    //   82: aload 4
    //   84: invokevirtual 70	java/io/InputStream:close	()V
    //   87: aload_1
    //   88: astore_2
    //   89: goto -73 -> 16
    //   92: astore_2
    //   93: getstatic 18	com/tencent/qqmusic/mediaplayer/codec/wma/WmaRecognition:TAG	Ljava/lang/String;
    //   96: aload_2
    //   97: invokestatic 76	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   100: aload_1
    //   101: astore_2
    //   102: goto -86 -> 16
    //   105: astore 5
    //   107: aconst_null
    //   108: astore_1
    //   109: aconst_null
    //   110: astore 4
    //   112: aload 4
    //   114: astore_2
    //   115: getstatic 18	com/tencent/qqmusic/mediaplayer/codec/wma/WmaRecognition:TAG	Ljava/lang/String;
    //   118: aload 5
    //   120: invokestatic 76	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   123: aload_1
    //   124: astore_2
    //   125: aload 4
    //   127: ifnull -111 -> 16
    //   130: aload 4
    //   132: invokevirtual 70	java/io/InputStream:close	()V
    //   135: aload_1
    //   136: astore_2
    //   137: goto -121 -> 16
    //   140: astore_2
    //   141: getstatic 18	com/tencent/qqmusic/mediaplayer/codec/wma/WmaRecognition:TAG	Ljava/lang/String;
    //   144: aload_2
    //   145: invokestatic 76	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   148: aload_1
    //   149: astore_2
    //   150: goto -134 -> 16
    //   153: astore_1
    //   154: aconst_null
    //   155: astore_2
    //   156: aload_2
    //   157: ifnull +7 -> 164
    //   160: aload_2
    //   161: invokevirtual 70	java/io/InputStream:close	()V
    //   164: ldc 56
    //   166: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   169: aload_1
    //   170: athrow
    //   171: astore_2
    //   172: getstatic 18	com/tencent/qqmusic/mediaplayer/codec/wma/WmaRecognition:TAG	Ljava/lang/String;
    //   175: aload_2
    //   176: invokestatic 76	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   179: goto -15 -> 164
    //   182: iload_3
    //   183: bipush 16
    //   185: if_icmpne +14 -> 199
    //   188: getstatic 82	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:WMA	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   191: astore_1
    //   192: ldc 56
    //   194: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   197: aload_1
    //   198: areturn
    //   199: getstatic 85	com/tencent/qqmusic/mediaplayer/AudioFormat$AudioType:UNSUPPORT	Lcom/tencent/qqmusic/mediaplayer/AudioFormat$AudioType;
    //   202: astore_1
    //   203: ldc 56
    //   205: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   208: goto -11 -> 197
    //   211: astore_1
    //   212: goto -56 -> 156
    //   215: astore 5
    //   217: aconst_null
    //   218: astore_1
    //   219: goto -107 -> 112
    //   222: astore 5
    //   224: goto -112 -> 112
    //
    // Exception table:
    //   from	to	target	type
    //   82	87	92	java/io/IOException
    //   53	64	105	java/io/IOException
    //   130	135	140	java/io/IOException
    //   53	64	153	finally
    //   160	164	171	java/io/IOException
    //   67	72	211	finally
    //   75	82	211	finally
    //   115	123	211	finally
    //   67	72	215	java/io/IOException
    //   75	82	222	java/io/IOException
  }

  public AudioFormat.AudioType guessAudioType(String paramString)
  {
    AppMethodBeat.i(128586);
    if ((!TextUtils.isEmpty(paramString)) && (paramString.toLowerCase().contains(".wma")))
    {
      paramString = AudioFormat.AudioType.WMA;
      AppMethodBeat.o(128586);
    }
    while (true)
    {
      return paramString;
      paramString = AudioFormat.AudioType.UNSUPPORT;
      AppMethodBeat.o(128586);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.codec.wma.WmaRecognition
 * JD-Core Version:    0.6.2
 */