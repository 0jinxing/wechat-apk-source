package com.tencent.mm.plugin.downloader.d;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class b
{
  private static ByteBuffer C(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(2308);
    D(paramByteBuffer);
    paramByteBuffer = d(paramByteBuffer, paramByteBuffer.capacity() - 24);
    int i = 0;
    while (paramByteBuffer.hasRemaining())
    {
      i++;
      if (paramByteBuffer.remaining() < 8)
      {
        paramByteBuffer = new b.b("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i)));
        AppMethodBeat.o(2308);
        throw paramByteBuffer;
      }
      long l = paramByteBuffer.getLong();
      if ((l < 4L) || (l > 2147483647L))
      {
        paramByteBuffer = new b.b("APK Signing Block entry #" + i + " size out of range: " + l);
        AppMethodBeat.o(2308);
        throw paramByteBuffer;
      }
      int j = (int)l;
      int k = paramByteBuffer.position();
      if (j > paramByteBuffer.remaining())
      {
        paramByteBuffer = new b.b("APK Signing Block entry #" + i + " size out of range: " + j + ", available: " + paramByteBuffer.remaining());
        AppMethodBeat.o(2308);
        throw paramByteBuffer;
      }
      if (paramByteBuffer.getInt() == 1896449818)
      {
        paramByteBuffer = e(paramByteBuffer, j - 4);
        AppMethodBeat.o(2308);
        return paramByteBuffer;
      }
      paramByteBuffer.position(k + j);
    }
    paramByteBuffer = new b.b("No APK Signature Scheme v2 block in APK Signing Block");
    AppMethodBeat.o(2308);
    throw paramByteBuffer;
  }

  public static void D(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(2309);
    if (paramByteBuffer.order() != ByteOrder.LITTLE_ENDIAN)
    {
      paramByteBuffer = new IllegalArgumentException("ByteBuffer byte order must be little endian");
      AppMethodBeat.o(2309);
      throw paramByteBuffer;
    }
    AppMethodBeat.o(2309);
  }

  // ERROR //
  public static boolean Ik(String paramString)
  {
    // Byte code:
    //   0: sipush 2302
    //   3: invokestatic 16	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aconst_null
    //   7: astore_1
    //   8: new 122	java/io/RandomAccessFile
    //   11: astore_2
    //   12: aload_2
    //   13: aload_0
    //   14: ldc 124
    //   16: invokespecial 127	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: aload_2
    //   20: invokestatic 130	com/tencent/mm/plugin/downloader/d/b:e	(Ljava/io/RandomAccessFile;)Landroid/util/Pair;
    //   23: astore_1
    //   24: aload_1
    //   25: getfield 136	android/util/Pair:first	Ljava/lang/Object;
    //   28: checkcast 22	java/nio/ByteBuffer
    //   31: astore_0
    //   32: aload_1
    //   33: getfield 139	android/util/Pair:second	Ljava/lang/Object;
    //   36: checkcast 141	java/lang/Long
    //   39: invokevirtual 144	java/lang/Long:longValue	()J
    //   42: lstore_3
    //   43: aload_2
    //   44: lload_3
    //   45: invokestatic 150	com/tencent/mm/plugin/downloader/d/k:c	(Ljava/io/RandomAccessFile;J)Z
    //   48: ifeq +44 -> 92
    //   51: new 8	com/tencent/mm/plugin/downloader/d/b$b
    //   54: astore_0
    //   55: aload_0
    //   56: ldc 152
    //   58: invokespecial 53	com/tencent/mm/plugin/downloader/d/b$b:<init>	(Ljava/lang/String;)V
    //   61: sipush 2302
    //   64: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   67: aload_0
    //   68: athrow
    //   69: astore_0
    //   70: aload_2
    //   71: astore_0
    //   72: aload_0
    //   73: ifnull +7 -> 80
    //   76: aload_0
    //   77: invokevirtual 156	java/io/RandomAccessFile:close	()V
    //   80: sipush 2302
    //   83: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   86: iconst_0
    //   87: istore 5
    //   89: iload 5
    //   91: ireturn
    //   92: aload_0
    //   93: lload_3
    //   94: invokestatic 160	com/tencent/mm/plugin/downloader/d/b:b	(Ljava/nio/ByteBuffer;J)J
    //   97: lstore 6
    //   99: aload_2
    //   100: lload 6
    //   102: invokestatic 163	com/tencent/mm/plugin/downloader/d/b:b	(Ljava/io/RandomAccessFile;J)Landroid/util/Pair;
    //   105: astore 8
    //   107: aload 8
    //   109: getfield 136	android/util/Pair:first	Ljava/lang/Object;
    //   112: checkcast 22	java/nio/ByteBuffer
    //   115: astore_1
    //   116: aload 8
    //   118: getfield 139	android/util/Pair:second	Ljava/lang/Object;
    //   121: checkcast 141	java/lang/Long
    //   124: invokevirtual 144	java/lang/Long:longValue	()J
    //   127: lstore 9
    //   129: new 6	com/tencent/mm/plugin/downloader/d/b$a
    //   132: dup
    //   133: aload_1
    //   134: invokestatic 165	com/tencent/mm/plugin/downloader/d/b:C	(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   137: lload 9
    //   139: lload 6
    //   141: lload_3
    //   142: aload_0
    //   143: iconst_0
    //   144: invokespecial 168	com/tencent/mm/plugin/downloader/d/b$a:<init>	(Ljava/nio/ByteBuffer;JJJLjava/nio/ByteBuffer;B)V
    //   147: pop
    //   148: aload_2
    //   149: invokevirtual 156	java/io/RandomAccessFile:close	()V
    //   152: iconst_1
    //   153: istore 5
    //   155: sipush 2302
    //   158: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   161: goto -72 -> 89
    //   164: astore_0
    //   165: aconst_null
    //   166: astore_2
    //   167: aload_2
    //   168: ifnull +7 -> 175
    //   171: aload_2
    //   172: invokevirtual 156	java/io/RandomAccessFile:close	()V
    //   175: sipush 2302
    //   178: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   181: aload_0
    //   182: athrow
    //   183: astore_0
    //   184: goto -17 -> 167
    //   187: astore_0
    //   188: aload_1
    //   189: astore_0
    //   190: goto -118 -> 72
    //
    // Exception table:
    //   from	to	target	type
    //   19	69	69	com/tencent/mm/plugin/downloader/d/b$b
    //   92	148	69	com/tencent/mm/plugin/downloader/d/b$b
    //   8	19	164	finally
    //   19	69	183	finally
    //   92	148	183	finally
    //   8	19	187	com/tencent/mm/plugin/downloader/d/b$b
  }

  public static long b(ByteBuffer paramByteBuffer, long paramLong)
  {
    AppMethodBeat.i(2304);
    long l = k.G(paramByteBuffer);
    if (l >= paramLong)
    {
      paramByteBuffer = new b.b("ZIP Central Directory offset out of range: " + l + ". ZIP End of Central Directory offset: " + paramLong);
      AppMethodBeat.o(2304);
      throw paramByteBuffer;
    }
    if (k.H(paramByteBuffer) + l != paramLong)
    {
      paramByteBuffer = new b.b("ZIP Central Directory is not immediately followed by End of Central Directory");
      AppMethodBeat.o(2304);
      throw paramByteBuffer;
    }
    AppMethodBeat.o(2304);
    return l;
  }

  public static Pair<ByteBuffer, Long> b(RandomAccessFile paramRandomAccessFile, long paramLong)
  {
    AppMethodBeat.i(2307);
    if (paramLong < 32L)
    {
      paramRandomAccessFile = new b.b("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(String.valueOf(paramLong)));
      AppMethodBeat.o(2307);
      throw paramRandomAccessFile;
    }
    ByteBuffer localByteBuffer = ByteBuffer.allocate(24);
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramRandomAccessFile.seek(paramLong - localByteBuffer.capacity());
    paramRandomAccessFile.readFully(localByteBuffer.array(), localByteBuffer.arrayOffset(), localByteBuffer.capacity());
    if ((localByteBuffer.getLong(8) != 2334950737559900225L) || (localByteBuffer.getLong(16) != 3617552046287187010L))
    {
      paramRandomAccessFile = new b.b("No APK Signing Block before ZIP Central Directory");
      AppMethodBeat.o(2307);
      throw paramRandomAccessFile;
    }
    long l1 = localByteBuffer.getLong(0);
    if ((l1 < localByteBuffer.capacity()) || (l1 > 2147483639L))
    {
      paramRandomAccessFile = new b.b("APK Signing Block size out of range: ".concat(String.valueOf(l1)));
      AppMethodBeat.o(2307);
      throw paramRandomAccessFile;
    }
    int i = (int)(8L + l1);
    paramLong -= i;
    if (paramLong < 0L)
    {
      paramRandomAccessFile = new b.b("APK Signing Block offset out of range: ".concat(String.valueOf(paramLong)));
      AppMethodBeat.o(2307);
      throw paramRandomAccessFile;
    }
    localByteBuffer = ByteBuffer.allocate(i);
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramRandomAccessFile.seek(paramLong);
    paramRandomAccessFile.readFully(localByteBuffer.array(), localByteBuffer.arrayOffset(), localByteBuffer.capacity());
    long l2 = localByteBuffer.getLong(0);
    if (l2 != l1)
    {
      paramRandomAccessFile = new b.b("APK Signing Block sizes in header and footer do not match: " + l2 + " vs " + l1);
      AppMethodBeat.o(2307);
      throw paramRandomAccessFile;
    }
    paramRandomAccessFile = Pair.create(localByteBuffer, Long.valueOf(paramLong));
    AppMethodBeat.o(2307);
    return paramRandomAccessFile;
  }

  public static ByteBuffer d(ByteBuffer paramByteBuffer, int paramInt)
  {
    AppMethodBeat.i(2305);
    if (paramInt < 8)
    {
      paramByteBuffer = new IllegalArgumentException("end < start: " + paramInt + " < 8");
      AppMethodBeat.o(2305);
      throw paramByteBuffer;
    }
    int i = paramByteBuffer.capacity();
    if (paramInt > paramByteBuffer.capacity())
    {
      paramByteBuffer = new IllegalArgumentException("end > capacity: " + paramInt + " > " + i);
      AppMethodBeat.o(2305);
      throw paramByteBuffer;
    }
    int j = paramByteBuffer.limit();
    i = paramByteBuffer.position();
    try
    {
      paramByteBuffer.position(0);
      paramByteBuffer.limit(paramInt);
      paramByteBuffer.position(8);
      ByteBuffer localByteBuffer = paramByteBuffer.slice();
      localByteBuffer.order(paramByteBuffer.order());
      return localByteBuffer;
    }
    finally
    {
      paramByteBuffer.position(0);
      paramByteBuffer.limit(j);
      paramByteBuffer.position(i);
      AppMethodBeat.o(2305);
    }
  }

  public static Pair<ByteBuffer, Long> e(RandomAccessFile paramRandomAccessFile)
  {
    AppMethodBeat.i(2303);
    paramRandomAccessFile = k.f(paramRandomAccessFile);
    if (paramRandomAccessFile == null)
    {
      paramRandomAccessFile = new b.b("Not an APK file: ZIP End of Central Directory record not found");
      AppMethodBeat.o(2303);
      throw paramRandomAccessFile;
    }
    AppMethodBeat.o(2303);
    return paramRandomAccessFile;
  }

  public static ByteBuffer e(ByteBuffer paramByteBuffer, int paramInt)
  {
    AppMethodBeat.i(2306);
    if (paramInt < 0)
    {
      paramByteBuffer = new IllegalArgumentException("size: ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(2306);
      throw paramByteBuffer;
    }
    int i = paramByteBuffer.limit();
    int j = paramByteBuffer.position();
    paramInt = j + paramInt;
    if ((paramInt < j) || (paramInt > i))
    {
      paramByteBuffer = new BufferUnderflowException();
      AppMethodBeat.o(2306);
      throw paramByteBuffer;
    }
    paramByteBuffer.limit(paramInt);
    try
    {
      ByteBuffer localByteBuffer = paramByteBuffer.slice();
      localByteBuffer.order(paramByteBuffer.order());
      paramByteBuffer.position(paramInt);
      return localByteBuffer;
    }
    finally
    {
      paramByteBuffer.limit(i);
      AppMethodBeat.o(2306);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.d.b
 * JD-Core Version:    0.6.2
 */