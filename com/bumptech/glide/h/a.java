package com.bumptech.glide.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

public final class a
{
  private static final AtomicReference<byte[]> aHU;

  static
  {
    AppMethodBeat.i(92552);
    aHU = new AtomicReference();
    AppMethodBeat.o(92552);
  }

  // ERROR //
  public static void b(ByteBuffer paramByteBuffer, java.io.File paramFile)
  {
    // Byte code:
    //   0: ldc 36
    //   2: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: iconst_0
    //   7: invokevirtual 42	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   10: pop
    //   11: new 44	java/io/RandomAccessFile
    //   14: astore_2
    //   15: aload_2
    //   16: aload_1
    //   17: ldc 46
    //   19: invokespecial 49	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   22: aload_2
    //   23: invokevirtual 53	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   26: astore_1
    //   27: aload_1
    //   28: aload_0
    //   29: invokevirtual 59	java/nio/channels/FileChannel:write	(Ljava/nio/ByteBuffer;)I
    //   32: pop
    //   33: aload_1
    //   34: iconst_0
    //   35: invokevirtual 63	java/nio/channels/FileChannel:force	(Z)V
    //   38: aload_1
    //   39: invokevirtual 66	java/nio/channels/FileChannel:close	()V
    //   42: aload_2
    //   43: invokevirtual 67	java/io/RandomAccessFile:close	()V
    //   46: aload_1
    //   47: ifnull +7 -> 54
    //   50: aload_1
    //   51: invokevirtual 66	java/nio/channels/FileChannel:close	()V
    //   54: aload_2
    //   55: invokevirtual 67	java/io/RandomAccessFile:close	()V
    //   58: ldc 36
    //   60: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   63: return
    //   64: astore_0
    //   65: ldc 36
    //   67: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   70: goto -7 -> 63
    //   73: astore_0
    //   74: aconst_null
    //   75: astore_1
    //   76: aconst_null
    //   77: astore_2
    //   78: aload_1
    //   79: ifnull +7 -> 86
    //   82: aload_1
    //   83: invokevirtual 66	java/nio/channels/FileChannel:close	()V
    //   86: aload_2
    //   87: ifnull +7 -> 94
    //   90: aload_2
    //   91: invokevirtual 67	java/io/RandomAccessFile:close	()V
    //   94: ldc 36
    //   96: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   99: aload_0
    //   100: athrow
    //   101: astore_0
    //   102: goto -48 -> 54
    //   105: astore_1
    //   106: goto -20 -> 86
    //   109: astore_1
    //   110: goto -16 -> 94
    //   113: astore_0
    //   114: aconst_null
    //   115: astore_1
    //   116: goto -38 -> 78
    //   119: astore_0
    //   120: goto -42 -> 78
    //
    // Exception table:
    //   from	to	target	type
    //   54	58	64	java/io/IOException
    //   11	22	73	finally
    //   50	54	101	java/io/IOException
    //   82	86	105	java/io/IOException
    //   90	94	109	java/io/IOException
    //   22	27	113	finally
    //   27	46	119	finally
  }

  public static byte[] d(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(92550);
    Object localObject;
    if ((!paramByteBuffer.isReadOnly()) && (paramByteBuffer.hasArray()))
    {
      localObject = new a.b(paramByteBuffer.array(), paramByteBuffer.arrayOffset(), paramByteBuffer.limit());
      if ((localObject == null) || (((a.b)localObject).offset != 0) || (((a.b)localObject).limit != ((a.b)localObject).data.length))
        break label79;
      paramByteBuffer = paramByteBuffer.array();
    }
    while (true)
    {
      AppMethodBeat.o(92550);
      return paramByteBuffer;
      localObject = null;
      break;
      label79: localObject = paramByteBuffer.asReadOnlyBuffer();
      paramByteBuffer = new byte[((ByteBuffer)localObject).limit()];
      ((ByteBuffer)localObject).position(0);
      ((ByteBuffer)localObject).get(paramByteBuffer);
    }
  }

  public static InputStream e(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(92551);
    paramByteBuffer = new a.a(paramByteBuffer);
    AppMethodBeat.o(92551);
    return paramByteBuffer;
  }

  // ERROR //
  public static ByteBuffer p(java.io.File paramFile)
  {
    // Byte code:
    //   0: ldc 118
    //   2: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokevirtual 124	java/io/File:length	()J
    //   9: lstore_1
    //   10: lload_1
    //   11: ldc2_w 125
    //   14: lcmp
    //   15: ifle +51 -> 66
    //   18: new 35	java/io/IOException
    //   21: astore_0
    //   22: aload_0
    //   23: ldc 128
    //   25: invokespecial 131	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   28: ldc 118
    //   30: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   33: aload_0
    //   34: athrow
    //   35: astore_0
    //   36: aconst_null
    //   37: astore_3
    //   38: aconst_null
    //   39: astore 4
    //   41: aload_3
    //   42: ifnull +7 -> 49
    //   45: aload_3
    //   46: invokevirtual 66	java/nio/channels/FileChannel:close	()V
    //   49: aload 4
    //   51: ifnull +8 -> 59
    //   54: aload 4
    //   56: invokevirtual 67	java/io/RandomAccessFile:close	()V
    //   59: ldc 118
    //   61: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   64: aload_0
    //   65: athrow
    //   66: lload_1
    //   67: lconst_0
    //   68: lcmp
    //   69: ifne +20 -> 89
    //   72: new 35	java/io/IOException
    //   75: astore_0
    //   76: aload_0
    //   77: ldc 133
    //   79: invokespecial 131	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   82: ldc 118
    //   84: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   87: aload_0
    //   88: athrow
    //   89: new 44	java/io/RandomAccessFile
    //   92: dup
    //   93: aload_0
    //   94: ldc 135
    //   96: invokespecial 49	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   99: astore_0
    //   100: aload_0
    //   101: invokevirtual 53	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   104: astore_3
    //   105: aload_3
    //   106: getstatic 141	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   109: lconst_0
    //   110: lload_1
    //   111: invokevirtual 145	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   114: invokevirtual 151	java/nio/MappedByteBuffer:load	()Ljava/nio/MappedByteBuffer;
    //   117: astore 4
    //   119: aload_3
    //   120: ifnull +7 -> 127
    //   123: aload_3
    //   124: invokevirtual 66	java/nio/channels/FileChannel:close	()V
    //   127: aload_0
    //   128: invokevirtual 67	java/io/RandomAccessFile:close	()V
    //   131: ldc 118
    //   133: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: aload 4
    //   138: areturn
    //   139: astore_3
    //   140: goto -13 -> 127
    //   143: astore_0
    //   144: goto -13 -> 131
    //   147: astore_3
    //   148: goto -99 -> 49
    //   151: astore 4
    //   153: goto -94 -> 59
    //   156: astore_3
    //   157: aconst_null
    //   158: astore 5
    //   160: aload_0
    //   161: astore 4
    //   163: aload_3
    //   164: astore_0
    //   165: aload 5
    //   167: astore_3
    //   168: goto -127 -> 41
    //   171: astore 5
    //   173: aload_0
    //   174: astore 4
    //   176: aload 5
    //   178: astore_0
    //   179: goto -138 -> 41
    //
    // Exception table:
    //   from	to	target	type
    //   5	10	35	finally
    //   18	35	35	finally
    //   72	89	35	finally
    //   89	100	35	finally
    //   123	127	139	java/io/IOException
    //   127	131	143	java/io/IOException
    //   45	49	147	java/io/IOException
    //   54	59	151	java/io/IOException
    //   100	105	156	finally
    //   105	119	171	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.h.a
 * JD-Core Version:    0.6.2
 */