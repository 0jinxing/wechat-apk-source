package com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser;

import com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo;
import com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector;
import java.util.Iterator;

public abstract class AudioPlayListItemParser
{
  public static final String TAG = "AudioListItemParser";
  protected CharsetDetector charsetDetector = new CharsetDetector();
  protected String mUri;

  protected static String delSeprator(String paramString)
  {
    return paramString.substring(paramString.indexOf("\"") + 1, paramString.lastIndexOf("\""));
  }

  // ERROR //
  protected String guessCharsetEncoding(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: ldc 44
    //   2: astore_2
    //   3: new 46	java/io/BufferedInputStream
    //   6: astore_3
    //   7: aload_3
    //   8: aload_1
    //   9: invokespecial 49	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   12: aload_3
    //   13: astore_1
    //   14: aload_2
    //   15: astore 4
    //   17: aload_0
    //   18: getfield 20	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/AudioPlayListItemParser:charsetDetector	Lcom/tencent/qqmusic/mediaplayer/audioplaylist/charsetdetector/CharsetDetector;
    //   21: aload_3
    //   22: invokevirtual 53	com/tencent/qqmusic/mediaplayer/audioplaylist/charsetdetector/CharsetDetector:setText	(Ljava/io/InputStream;)Lcom/tencent/qqmusic/mediaplayer/audioplaylist/charsetdetector/CharsetDetector;
    //   25: pop
    //   26: aload_3
    //   27: astore_1
    //   28: aload_2
    //   29: astore 4
    //   31: aload_0
    //   32: getfield 20	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/AudioPlayListItemParser:charsetDetector	Lcom/tencent/qqmusic/mediaplayer/audioplaylist/charsetdetector/CharsetDetector;
    //   35: invokevirtual 57	com/tencent/qqmusic/mediaplayer/audioplaylist/charsetdetector/CharsetDetector:detect	()Lcom/tencent/qqmusic/mediaplayer/audioplaylist/charsetdetector/CharsetMatch;
    //   38: astore 5
    //   40: aload_2
    //   41: astore_1
    //   42: aload 5
    //   44: ifnull +79 -> 123
    //   47: aload_3
    //   48: astore_1
    //   49: aload_2
    //   50: astore 4
    //   52: aload 5
    //   54: invokevirtual 63	com/tencent/qqmusic/mediaplayer/audioplaylist/charsetdetector/CharsetMatch:getConfidence	()I
    //   57: istore 6
    //   59: aload_3
    //   60: astore_1
    //   61: aload_2
    //   62: astore 4
    //   64: aload 5
    //   66: invokevirtual 67	com/tencent/qqmusic/mediaplayer/audioplaylist/charsetdetector/CharsetMatch:getName	()Ljava/lang/String;
    //   69: astore_2
    //   70: aload_3
    //   71: astore_1
    //   72: aload_2
    //   73: astore 4
    //   75: new 69	java/lang/StringBuilder
    //   78: astore 5
    //   80: aload_3
    //   81: astore_1
    //   82: aload_2
    //   83: astore 4
    //   85: aload 5
    //   87: ldc 71
    //   89: invokespecial 74	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   92: aload_3
    //   93: astore_1
    //   94: aload_2
    //   95: astore 4
    //   97: ldc 8
    //   99: aload 5
    //   101: aload_2
    //   102: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: ldc 80
    //   107: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: iload 6
    //   112: invokevirtual 83	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   115: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   118: invokestatic 92	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   121: aload_2
    //   122: astore_1
    //   123: aload_3
    //   124: invokevirtual 95	java/io/BufferedInputStream:close	()V
    //   127: aload_1
    //   128: areturn
    //   129: astore_2
    //   130: ldc 8
    //   132: ldc 97
    //   134: aload_2
    //   135: invokestatic 101	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   138: goto -11 -> 127
    //   141: astore 5
    //   143: aconst_null
    //   144: astore 4
    //   146: aload 4
    //   148: astore_1
    //   149: ldc 8
    //   151: ldc 103
    //   153: aload 5
    //   155: invokestatic 101	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   158: aload_2
    //   159: astore_1
    //   160: aload 4
    //   162: ifnull -35 -> 127
    //   165: aload 4
    //   167: invokevirtual 95	java/io/BufferedInputStream:close	()V
    //   170: aload_2
    //   171: astore_1
    //   172: goto -45 -> 127
    //   175: astore_1
    //   176: ldc 8
    //   178: ldc 97
    //   180: aload_1
    //   181: invokestatic 101	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   184: aload_2
    //   185: astore_1
    //   186: goto -59 -> 127
    //   189: astore_2
    //   190: aconst_null
    //   191: astore_1
    //   192: aload_1
    //   193: ifnull +7 -> 200
    //   196: aload_1
    //   197: invokevirtual 95	java/io/BufferedInputStream:close	()V
    //   200: aload_2
    //   201: athrow
    //   202: astore_1
    //   203: ldc 8
    //   205: ldc 97
    //   207: aload_1
    //   208: invokestatic 101	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   211: goto -11 -> 200
    //   214: astore_2
    //   215: goto -23 -> 192
    //   218: astore 5
    //   220: aload 4
    //   222: astore_2
    //   223: aload_3
    //   224: astore 4
    //   226: goto -80 -> 146
    //
    // Exception table:
    //   from	to	target	type
    //   123	127	129	java/io/IOException
    //   3	12	141	java/io/IOException
    //   165	170	175	java/io/IOException
    //   3	12	189	finally
    //   196	200	202	java/io/IOException
    //   17	26	214	finally
    //   31	40	214	finally
    //   52	59	214	finally
    //   64	70	214	finally
    //   75	80	214	finally
    //   85	92	214	finally
    //   97	121	214	finally
    //   149	158	214	finally
    //   17	26	218	java/io/IOException
    //   31	40	218	java/io/IOException
    //   52	59	218	java/io/IOException
    //   64	70	218	java/io/IOException
    //   75	80	218	java/io/IOException
    //   85	92	218	java/io/IOException
    //   97	121	218	java/io/IOException
  }

  public abstract boolean isParseSuccess();

  public abstract Iterator<TrackInfo> iterator();

  public abstract void parse();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.AudioPlayListItemParser
 * JD-Core Version:    0.6.2
 */