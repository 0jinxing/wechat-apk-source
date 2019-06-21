package com.tencent.qqmusic.mediaplayer.codec.wav;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class WaveReader
{
  private static final String TAG = "WaveReader";
  private static final int WAV_FORMAT = 1463899717;
  private static final int WAV_FORMAT_CHUNK_ID = 1718449184;
  private static final int WAV_HEADER_CHUNK_ID = 1380533830;
  private static final int WAV_HEADER_SIZE = 50;

  private static short byteToShortLE(byte paramByte1, byte paramByte2)
  {
    return (short)(paramByte1 & 0xFF | (paramByte2 & 0xFF) << 8);
  }

  // ERROR //
  public static boolean isWavFormat(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc 29
    //   4: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: bipush 50
    //   9: invokestatic 41	com/tencent/qqmusic/mediaplayer/CacheBytesManager:getStatic	(I)[B
    //   12: astore_2
    //   13: new 43	java/io/FileInputStream
    //   16: astore_3
    //   17: aload_3
    //   18: aload_0
    //   19: invokespecial 46	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   22: aload_3
    //   23: astore_0
    //   24: aload_2
    //   25: iconst_0
    //   26: invokestatic 50	com/tencent/qqmusic/mediaplayer/codec/wav/WaveReader:readUnsignedInt	([BI)I
    //   29: istore 4
    //   31: iload 4
    //   33: ldc 15
    //   35: if_icmpeq +46 -> 81
    //   38: aload_3
    //   39: astore_0
    //   40: ldc 8
    //   42: ldc 52
    //   44: iload 4
    //   46: invokestatic 58	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   49: invokevirtual 62	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   52: invokestatic 67	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   55: aload_3
    //   56: invokevirtual 72	java/io/InputStream:close	()V
    //   59: aload_2
    //   60: invokestatic 76	com/tencent/qqmusic/mediaplayer/CacheBytesManager:recycle	([B)[B
    //   63: pop
    //   64: ldc 29
    //   66: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   69: iload_1
    //   70: ireturn
    //   71: astore_0
    //   72: ldc 8
    //   74: aload_0
    //   75: invokestatic 83	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   78: goto -19 -> 59
    //   81: aload_3
    //   82: astore_0
    //   83: aload_2
    //   84: bipush 8
    //   86: invokestatic 50	com/tencent/qqmusic/mediaplayer/codec/wav/WaveReader:readUnsignedInt	([BI)I
    //   89: istore 4
    //   91: iload 4
    //   93: ldc 11
    //   95: if_icmpeq +47 -> 142
    //   98: aload_3
    //   99: astore_0
    //   100: ldc 8
    //   102: ldc 85
    //   104: iload 4
    //   106: invokestatic 58	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   109: invokevirtual 62	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   112: invokestatic 67	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   115: aload_3
    //   116: invokevirtual 72	java/io/InputStream:close	()V
    //   119: aload_2
    //   120: invokestatic 76	com/tencent/qqmusic/mediaplayer/CacheBytesManager:recycle	([B)[B
    //   123: pop
    //   124: ldc 29
    //   126: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   129: goto -60 -> 69
    //   132: astore_0
    //   133: ldc 8
    //   135: aload_0
    //   136: invokestatic 83	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   139: goto -20 -> 119
    //   142: aload_3
    //   143: astore_0
    //   144: aload_2
    //   145: bipush 12
    //   147: invokestatic 50	com/tencent/qqmusic/mediaplayer/codec/wav/WaveReader:readUnsignedInt	([BI)I
    //   150: istore 4
    //   152: iload 4
    //   154: ldc 13
    //   156: if_icmpeq +47 -> 203
    //   159: aload_3
    //   160: astore_0
    //   161: ldc 8
    //   163: ldc 87
    //   165: iload 4
    //   167: invokestatic 58	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   170: invokevirtual 62	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   173: invokestatic 67	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   176: aload_3
    //   177: invokevirtual 72	java/io/InputStream:close	()V
    //   180: aload_2
    //   181: invokestatic 76	com/tencent/qqmusic/mediaplayer/CacheBytesManager:recycle	([B)[B
    //   184: pop
    //   185: ldc 29
    //   187: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   190: goto -121 -> 69
    //   193: astore_0
    //   194: ldc 8
    //   196: aload_0
    //   197: invokestatic 83	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   200: goto -20 -> 180
    //   203: aload_3
    //   204: astore_0
    //   205: ldc 8
    //   207: ldc 89
    //   209: aload_2
    //   210: bipush 16
    //   212: invokestatic 92	com/tencent/qqmusic/mediaplayer/codec/wav/WaveReader:readUnsignedIntLE	([BI)I
    //   215: invokestatic 58	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   218: invokevirtual 62	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   221: invokestatic 67	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   224: aload_3
    //   225: astore_0
    //   226: ldc 8
    //   228: ldc 94
    //   230: aload_2
    //   231: bipush 20
    //   233: invokestatic 98	com/tencent/qqmusic/mediaplayer/codec/wav/WaveReader:readUnsignedShortLE	([BI)S
    //   236: invokestatic 58	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   239: invokevirtual 62	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   242: invokestatic 67	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   245: aload_3
    //   246: invokevirtual 72	java/io/InputStream:close	()V
    //   249: aload_2
    //   250: invokestatic 76	com/tencent/qqmusic/mediaplayer/CacheBytesManager:recycle	([B)[B
    //   253: pop
    //   254: iconst_1
    //   255: istore_1
    //   256: ldc 29
    //   258: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   261: goto -192 -> 69
    //   264: astore_0
    //   265: ldc 8
    //   267: aload_0
    //   268: invokestatic 83	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   271: goto -22 -> 249
    //   274: astore 5
    //   276: aconst_null
    //   277: astore_3
    //   278: aload_3
    //   279: astore_0
    //   280: ldc 8
    //   282: aload 5
    //   284: invokestatic 83	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   287: aload_3
    //   288: ifnull +7 -> 295
    //   291: aload_3
    //   292: invokevirtual 72	java/io/InputStream:close	()V
    //   295: aload_2
    //   296: invokestatic 76	com/tencent/qqmusic/mediaplayer/CacheBytesManager:recycle	([B)[B
    //   299: pop
    //   300: ldc 29
    //   302: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   305: goto -236 -> 69
    //   308: astore_0
    //   309: ldc 8
    //   311: aload_0
    //   312: invokestatic 83	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   315: goto -20 -> 295
    //   318: astore_3
    //   319: aconst_null
    //   320: astore_0
    //   321: aload_0
    //   322: ifnull +7 -> 329
    //   325: aload_0
    //   326: invokevirtual 72	java/io/InputStream:close	()V
    //   329: aload_2
    //   330: invokestatic 76	com/tencent/qqmusic/mediaplayer/CacheBytesManager:recycle	([B)[B
    //   333: pop
    //   334: ldc 29
    //   336: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   339: aload_3
    //   340: athrow
    //   341: astore_0
    //   342: ldc 8
    //   344: aload_0
    //   345: invokestatic 83	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   348: goto -19 -> 329
    //   351: astore_3
    //   352: goto -31 -> 321
    //   355: astore 5
    //   357: goto -79 -> 278
    //
    // Exception table:
    //   from	to	target	type
    //   55	59	71	java/lang/Exception
    //   115	119	132	java/lang/Exception
    //   176	180	193	java/lang/Exception
    //   245	249	264	java/lang/Exception
    //   13	22	274	java/lang/Exception
    //   291	295	308	java/lang/Exception
    //   13	22	318	finally
    //   325	329	341	java/lang/Exception
    //   24	31	351	finally
    //   40	55	351	finally
    //   83	91	351	finally
    //   100	115	351	finally
    //   144	152	351	finally
    //   161	176	351	finally
    //   205	224	351	finally
    //   226	245	351	finally
    //   280	287	351	finally
    //   24	31	355	java/lang/Exception
    //   40	55	355	java/lang/Exception
    //   83	91	355	java/lang/Exception
    //   100	115	355	java/lang/Exception
    //   144	152	355	java/lang/Exception
    //   161	176	355	java/lang/Exception
    //   205	224	355	java/lang/Exception
    //   226	245	355	java/lang/Exception
  }

  private static int readUnsignedInt(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt + 4 > paramArrayOfByte.length);
    for (paramInt = -1; ; paramInt = (paramArrayOfByte[paramInt] & 0xFF) << 24 | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt + 2)] & 0xFF) << 8 | paramArrayOfByte[(paramInt + 3)] & 0xFF)
      return paramInt;
  }

  private static int readUnsignedIntLE(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt + 4 > paramArrayOfByte.length);
    for (paramInt = -1; ; paramInt = paramArrayOfByte[0] & 0xFF | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8 | (paramArrayOfByte[(paramInt + 2)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24)
      return paramInt;
  }

  private static short readUnsignedShortLE(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(128532);
    if (paramInt + 2 > paramArrayOfByte.length)
    {
      paramInt = -1;
      AppMethodBeat.o(128532);
    }
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      return i;
      paramInt = byteToShortLE(paramArrayOfByte[paramInt], paramArrayOfByte[(paramInt + 1)]);
      AppMethodBeat.o(128532);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.codec.wav.WaveReader
 * JD-Core Version:    0.6.2
 */