package com.tencent.qqmusic.mediaplayer.perf;

public class FileLogger
{
  private static final String TAG = "FileLogger";

  // ERROR //
  public static void write(java.lang.StringBuilder paramStringBuilder, java.io.File paramFile, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 18
    //   2: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 26	java/io/FileWriter
    //   8: astore_3
    //   9: aload_3
    //   10: aload_1
    //   11: iload_2
    //   12: invokespecial 29	java/io/FileWriter:<init>	(Ljava/io/File;Z)V
    //   15: aload_3
    //   16: astore_1
    //   17: aload_3
    //   18: aload_0
    //   19: invokevirtual 35	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   22: invokevirtual 38	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   25: aload_3
    //   26: astore_1
    //   27: aload_3
    //   28: invokevirtual 41	java/io/FileWriter:flush	()V
    //   31: aload_3
    //   32: invokevirtual 44	java/io/FileWriter:close	()V
    //   35: ldc 18
    //   37: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   40: return
    //   41: astore_0
    //   42: ldc 18
    //   44: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   47: goto -7 -> 40
    //   50: astore 4
    //   52: aconst_null
    //   53: astore_0
    //   54: aload_0
    //   55: astore_1
    //   56: ldc 8
    //   58: ldc 49
    //   60: aload 4
    //   62: invokestatic 55	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   65: aload_0
    //   66: ifnull +42 -> 108
    //   69: aload_0
    //   70: invokevirtual 44	java/io/FileWriter:close	()V
    //   73: ldc 18
    //   75: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   78: goto -38 -> 40
    //   81: astore_0
    //   82: ldc 18
    //   84: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   87: goto -47 -> 40
    //   90: astore_0
    //   91: aconst_null
    //   92: astore_1
    //   93: aload_1
    //   94: ifnull +7 -> 101
    //   97: aload_1
    //   98: invokevirtual 44	java/io/FileWriter:close	()V
    //   101: ldc 18
    //   103: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   106: aload_0
    //   107: athrow
    //   108: ldc 18
    //   110: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   113: goto -73 -> 40
    //   116: astore_1
    //   117: goto -16 -> 101
    //   120: astore_0
    //   121: goto -28 -> 93
    //   124: astore 4
    //   126: aload_3
    //   127: astore_0
    //   128: goto -74 -> 54
    //
    // Exception table:
    //   from	to	target	type
    //   31	35	41	java/io/IOException
    //   5	15	50	java/io/IOException
    //   69	73	81	java/io/IOException
    //   5	15	90	finally
    //   97	101	116	java/io/IOException
    //   17	25	120	finally
    //   27	31	120	finally
    //   56	65	120	finally
    //   17	25	124	java/io/IOException
    //   27	31	124	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.perf.FileLogger
 * JD-Core Version:    0.6.2
 */