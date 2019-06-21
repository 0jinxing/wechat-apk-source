package com.tencent.tmassistantsdk.protocol;

public class ZipUtils
{
  private static final String TAG = "ZipUtils";

  // ERROR //
  public static byte[] unzip(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc 20
    //   2: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 28	java/util/zip/Inflater
    //   8: dup
    //   9: invokespecial 29	java/util/zip/Inflater:<init>	()V
    //   12: astore_1
    //   13: aconst_null
    //   14: astore_2
    //   15: new 31	java/io/ByteArrayOutputStream
    //   18: astore_3
    //   19: aload_3
    //   20: aload_0
    //   21: arraylength
    //   22: invokespecial 33	java/io/ByteArrayOutputStream:<init>	(I)V
    //   25: aload_3
    //   26: astore_2
    //   27: sipush 1024
    //   30: newarray byte
    //   32: astore 4
    //   34: aload_3
    //   35: astore_2
    //   36: aload_1
    //   37: aload_0
    //   38: invokevirtual 37	java/util/zip/Inflater:setInput	([B)V
    //   41: aload_3
    //   42: astore_2
    //   43: aload_1
    //   44: invokevirtual 41	java/util/zip/Inflater:finished	()Z
    //   47: ifne +68 -> 115
    //   50: aload_3
    //   51: astore_2
    //   52: aload_3
    //   53: aload 4
    //   55: iconst_0
    //   56: aload_1
    //   57: aload 4
    //   59: invokevirtual 45	java/util/zip/Inflater:inflate	([B)I
    //   62: invokevirtual 49	java/io/ByteArrayOutputStream:write	([BII)V
    //   65: goto -24 -> 41
    //   68: astore 4
    //   70: aload_3
    //   71: astore_0
    //   72: aload_0
    //   73: astore_2
    //   74: ldc 8
    //   76: aload 4
    //   78: ldc 51
    //   80: iconst_0
    //   81: anewarray 4	java/lang/Object
    //   84: invokestatic 57	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   87: aload_1
    //   88: invokevirtual 60	java/util/zip/Inflater:end	()V
    //   91: aload_0
    //   92: astore_3
    //   93: aload_0
    //   94: ifnull +9 -> 103
    //   97: aload_0
    //   98: invokevirtual 63	java/io/ByteArrayOutputStream:close	()V
    //   101: aload_0
    //   102: astore_3
    //   103: aload_3
    //   104: invokevirtual 67	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   107: astore_0
    //   108: ldc 20
    //   110: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   113: aload_0
    //   114: areturn
    //   115: aload_1
    //   116: invokevirtual 60	java/util/zip/Inflater:end	()V
    //   119: aload_3
    //   120: invokevirtual 63	java/io/ByteArrayOutputStream:close	()V
    //   123: goto -20 -> 103
    //   126: astore_0
    //   127: goto -24 -> 103
    //   130: astore_0
    //   131: aload_1
    //   132: invokevirtual 60	java/util/zip/Inflater:end	()V
    //   135: aload_2
    //   136: ifnull +7 -> 143
    //   139: aload_2
    //   140: invokevirtual 63	java/io/ByteArrayOutputStream:close	()V
    //   143: ldc 20
    //   145: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   148: aload_0
    //   149: athrow
    //   150: astore_3
    //   151: aload_0
    //   152: astore_3
    //   153: goto -50 -> 103
    //   156: astore_3
    //   157: goto -14 -> 143
    //   160: astore_0
    //   161: goto -30 -> 131
    //   164: astore 4
    //   166: aconst_null
    //   167: astore_0
    //   168: goto -96 -> 72
    //
    // Exception table:
    //   from	to	target	type
    //   27	34	68	java/util/zip/DataFormatException
    //   36	41	68	java/util/zip/DataFormatException
    //   43	50	68	java/util/zip/DataFormatException
    //   52	65	68	java/util/zip/DataFormatException
    //   119	123	126	java/io/IOException
    //   15	25	130	finally
    //   97	101	150	java/io/IOException
    //   139	143	156	java/io/IOException
    //   27	34	160	finally
    //   36	41	160	finally
    //   43	50	160	finally
    //   52	65	160	finally
    //   74	87	160	finally
    //   15	25	164	java/util/zip/DataFormatException
  }

  // ERROR //
  public static byte[] zip(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc 72
    //   2: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 74	java/util/zip/Deflater
    //   8: dup
    //   9: invokespecial 75	java/util/zip/Deflater:<init>	()V
    //   12: astore_1
    //   13: new 31	java/io/ByteArrayOutputStream
    //   16: astore_2
    //   17: aload_2
    //   18: aload_0
    //   19: arraylength
    //   20: invokespecial 33	java/io/ByteArrayOutputStream:<init>	(I)V
    //   23: aload_1
    //   24: bipush 9
    //   26: invokevirtual 78	java/util/zip/Deflater:setLevel	(I)V
    //   29: aload_1
    //   30: aload_0
    //   31: invokevirtual 79	java/util/zip/Deflater:setInput	([B)V
    //   34: aload_1
    //   35: invokevirtual 82	java/util/zip/Deflater:finish	()V
    //   38: sipush 1024
    //   41: newarray byte
    //   43: astore_0
    //   44: aload_1
    //   45: invokevirtual 83	java/util/zip/Deflater:finished	()Z
    //   48: ifne +37 -> 85
    //   51: aload_2
    //   52: aload_0
    //   53: iconst_0
    //   54: aload_1
    //   55: aload_0
    //   56: invokevirtual 86	java/util/zip/Deflater:deflate	([B)I
    //   59: invokevirtual 49	java/io/ByteArrayOutputStream:write	([BII)V
    //   62: goto -18 -> 44
    //   65: astore_0
    //   66: aload_1
    //   67: invokevirtual 87	java/util/zip/Deflater:end	()V
    //   70: aload_2
    //   71: ifnull +7 -> 78
    //   74: aload_2
    //   75: invokevirtual 63	java/io/ByteArrayOutputStream:close	()V
    //   78: ldc 72
    //   80: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   83: aload_0
    //   84: athrow
    //   85: aload_1
    //   86: invokevirtual 87	java/util/zip/Deflater:end	()V
    //   89: aload_2
    //   90: invokevirtual 63	java/io/ByteArrayOutputStream:close	()V
    //   93: aload_2
    //   94: invokevirtual 67	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   97: astore_0
    //   98: ldc 72
    //   100: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   103: aload_0
    //   104: areturn
    //   105: astore_0
    //   106: ldc 8
    //   108: aload_0
    //   109: ldc 51
    //   111: iconst_0
    //   112: anewarray 4	java/lang/Object
    //   115: invokestatic 57	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   118: goto -25 -> 93
    //   121: astore_2
    //   122: ldc 8
    //   124: aload_2
    //   125: ldc 51
    //   127: iconst_0
    //   128: anewarray 4	java/lang/Object
    //   131: invokestatic 57	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   134: goto -56 -> 78
    //   137: astore_0
    //   138: aconst_null
    //   139: astore_2
    //   140: goto -74 -> 66
    //
    // Exception table:
    //   from	to	target	type
    //   23	44	65	finally
    //   44	62	65	finally
    //   89	93	105	java/io/IOException
    //   74	78	121	java/io/IOException
    //   13	23	137	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.protocol.ZipUtils
 * JD-Core Version:    0.6.2
 */