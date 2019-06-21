package com.tencent.mm.plugin.downloader.d;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class i
{
  public static Map<Integer, ByteBuffer> E(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(2326);
    b.D(paramByteBuffer);
    paramByteBuffer = b.d(paramByteBuffer, paramByteBuffer.capacity() - 24);
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    int i = 0;
    while (paramByteBuffer.hasRemaining())
    {
      i++;
      if (paramByteBuffer.remaining() < 8)
      {
        paramByteBuffer = new b.b("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i)));
        AppMethodBeat.o(2326);
        throw paramByteBuffer;
      }
      long l = paramByteBuffer.getLong();
      if ((l < 4L) || (l > 2147483647L))
      {
        paramByteBuffer = new b.b("APK Signing Block entry #" + i + " size out of range: " + l);
        AppMethodBeat.o(2326);
        throw paramByteBuffer;
      }
      int j = (int)l;
      int k = paramByteBuffer.position();
      if (j > paramByteBuffer.remaining())
      {
        paramByteBuffer = new b.b("APK Signing Block entry #" + i + " size out of range: " + j + ", available: " + paramByteBuffer.remaining());
        AppMethodBeat.o(2326);
        throw paramByteBuffer;
      }
      int m = paramByteBuffer.getInt();
      localLinkedHashMap.put(Integer.valueOf(m), b.e(paramByteBuffer, j - 4));
      if (m == 1896449818)
        ab.i("MicroMsg.Channel.V2SchemeUtil", "find V2 signature block Id : 1896449818");
      paramByteBuffer.position(k + j);
    }
    if (localLinkedHashMap.isEmpty())
    {
      paramByteBuffer = new b.b("not have Id-Value Pair in APK Signing Block entry #".concat(String.valueOf(i)));
      AppMethodBeat.o(2326);
      throw paramByteBuffer;
    }
    AppMethodBeat.o(2326);
    return localLinkedHashMap;
  }

  public static ByteBuffer G(Map<Integer, ByteBuffer> paramMap)
  {
    AppMethodBeat.i(2330);
    if ((paramMap == null) || (paramMap.isEmpty()))
    {
      paramMap = new RuntimeException("getNewApkV2SchemeBlock , id value pair is empty");
      AppMethodBeat.o(2330);
      throw paramMap;
    }
    Object localObject = paramMap.entrySet().iterator();
    for (long l = 24L; ((Iterator)localObject).hasNext(); l = ((ByteBuffer)((Map.Entry)((Iterator)localObject).next()).getValue()).remaining() + 12 + l);
    localObject = ByteBuffer.allocate((int)(8L + l));
    ((ByteBuffer)localObject).order(ByteOrder.LITTLE_ENDIAN);
    ((ByteBuffer)localObject).putLong(l);
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      paramMap = (ByteBuffer)localEntry.getValue();
      ((ByteBuffer)localObject).putLong(paramMap.remaining() + 4);
      ((ByteBuffer)localObject).putInt(((Integer)localEntry.getKey()).intValue());
      ((ByteBuffer)localObject).put(paramMap.array(), paramMap.arrayOffset() + paramMap.position(), paramMap.remaining());
    }
    ((ByteBuffer)localObject).putLong(l);
    ((ByteBuffer)localObject).putLong(2334950737559900225L);
    ((ByteBuffer)localObject).putLong(3617552046287187010L);
    if (((ByteBuffer)localObject).remaining() > 0)
    {
      paramMap = new RuntimeException("generateNewApkV2SchemeBlock error");
      AppMethodBeat.o(2330);
      throw paramMap;
    }
    ((ByteBuffer)localObject).flip();
    AppMethodBeat.o(2330);
    return localObject;
  }

  // ERROR //
  public static ByteBuffer P(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: sipush 2327
    //   5: invokestatic 12	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: ifnull +17 -> 26
    //   12: aload_0
    //   13: invokevirtual 223	java/io/File:exists	()Z
    //   16: ifeq +10 -> 26
    //   19: aload_0
    //   20: invokevirtual 226	java/io/File:isFile	()Z
    //   23: ifne +13 -> 36
    //   26: sipush 2327
    //   29: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_1
    //   33: astore_0
    //   34: aload_0
    //   35: areturn
    //   36: new 228	java/io/RandomAccessFile
    //   39: astore_1
    //   40: aload_1
    //   41: aload_0
    //   42: ldc 230
    //   44: invokespecial 233	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   47: aload_1
    //   48: invokestatic 236	com/tencent/mm/plugin/downloader/d/b:e	(Ljava/io/RandomAccessFile;)Landroid/util/Pair;
    //   51: astore_0
    //   52: aload_0
    //   53: getfield 242	android/util/Pair:first	Ljava/lang/Object;
    //   56: checkcast 20	java/nio/ByteBuffer
    //   59: astore_2
    //   60: aload_0
    //   61: getfield 245	android/util/Pair:second	Ljava/lang/Object;
    //   64: checkcast 247	java/lang/Long
    //   67: invokevirtual 250	java/lang/Long:longValue	()J
    //   70: lstore_3
    //   71: aload_1
    //   72: lload_3
    //   73: invokestatic 256	com/tencent/mm/plugin/downloader/d/k:c	(Ljava/io/RandomAccessFile;J)Z
    //   76: ifeq +39 -> 115
    //   79: new 43	com/tencent/mm/plugin/downloader/d/b$b
    //   82: astore_0
    //   83: aload_0
    //   84: ldc_w 258
    //   87: invokespecial 58	com/tencent/mm/plugin/downloader/d/b$b:<init>	(Ljava/lang/String;)V
    //   90: sipush 2327
    //   93: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   96: aload_0
    //   97: athrow
    //   98: astore_0
    //   99: aload_1
    //   100: ifnull +7 -> 107
    //   103: aload_1
    //   104: invokevirtual 261	java/io/RandomAccessFile:close	()V
    //   107: sipush 2327
    //   110: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   113: aload_0
    //   114: athrow
    //   115: aload_1
    //   116: aload_2
    //   117: lload_3
    //   118: invokestatic 265	com/tencent/mm/plugin/downloader/d/b:b	(Ljava/nio/ByteBuffer;J)J
    //   121: invokestatic 268	com/tencent/mm/plugin/downloader/d/b:b	(Ljava/io/RandomAccessFile;J)Landroid/util/Pair;
    //   124: getfield 242	android/util/Pair:first	Ljava/lang/Object;
    //   127: checkcast 20	java/nio/ByteBuffer
    //   130: astore_0
    //   131: aload_1
    //   132: invokevirtual 261	java/io/RandomAccessFile:close	()V
    //   135: sipush 2327
    //   138: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   141: goto -107 -> 34
    //   144: astore_0
    //   145: aconst_null
    //   146: astore_1
    //   147: goto -48 -> 99
    //
    // Exception table:
    //   from	to	target	type
    //   47	98	98	finally
    //   115	131	98	finally
    //   36	47	144	finally
  }

  public static a Q(File paramFile)
  {
    AppMethodBeat.i(2328);
    Object localObject1 = null;
    try
    {
      localObject2 = new java/io/RandomAccessFile;
      ((RandomAccessFile)localObject2).<init>(paramFile, "r");
      long l1;
      try
      {
        localObject3 = b.e((RandomAccessFile)localObject2);
        localObject1 = (ByteBuffer)((Pair)localObject3).first;
        l1 = ((Long)((Pair)localObject3).second).longValue();
        if (!k.c((RandomAccessFile)localObject2, l1))
          break label89;
        paramFile = new com/tencent/mm/plugin/downloader/d/b$b;
        paramFile.<init>("ZIP64 APK not supported");
        AppMethodBeat.o(2328);
        throw paramFile;
      }
      finally
      {
      }
      if (localObject2 != null)
        ((RandomAccessFile)localObject2).close();
      AppMethodBeat.o(2328);
      throw paramFile;
      label89: long l2 = b.b((ByteBuffer)localObject1, l1);
      Pair localPair1 = b.b((RandomAccessFile)localObject2, l2);
      Pair localPair2 = Pair.create(a((RandomAccessFile)localObject2, l2, (int)(l1 - l2)), Long.valueOf(l2));
      localObject1 = new com/tencent/mm/plugin/downloader/d/a;
      ((a)localObject1).<init>();
      ((a)localObject1).lowMemory = false;
      ((a)localObject1).kLT = paramFile.length();
      ((a)localObject1).kLU = Pair.create(a((RandomAccessFile)localObject2, 0L, (int)((Long)localPair1.second).longValue()), Long.valueOf(0L));
      ((a)localObject1).kLV = localPair1;
      ((a)localObject1).kLW = localPair2;
      ((a)localObject1).kLX = ((Pair)localObject3);
      if (((!((a)localObject1).lowMemory) && (((a)localObject1).kLU == null)) || (((a)localObject1).kLV == null) || (((a)localObject1).kLW == null) || (((a)localObject1).kLX == null))
      {
        paramFile = new java/lang/RuntimeException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("ApkSectionInfo paramters is not valid : ");
        paramFile.<init>(((a)localObject1).toString());
        AppMethodBeat.o(2328);
        throw paramFile;
      }
      if (((((a)localObject1).lowMemory) || ((((Long)((a)localObject1).kLU.second).longValue() == 0L) && (((ByteBuffer)((a)localObject1).kLU.first).remaining() + ((Long)((a)localObject1).kLU.second).longValue() == ((Long)((a)localObject1).kLV.second).longValue()))) && (((ByteBuffer)((a)localObject1).kLV.first).remaining() + ((Long)((a)localObject1).kLV.second).longValue() == ((Long)((a)localObject1).kLW.second).longValue()) && (((ByteBuffer)((a)localObject1).kLW.first).remaining() + ((Long)((a)localObject1).kLW.second).longValue() == ((Long)((a)localObject1).kLX.second).longValue()))
      {
        l2 = ((ByteBuffer)((a)localObject1).kLX.first).remaining();
        if (((Long)((a)localObject1).kLX.second).longValue() + l2 != ((a)localObject1).kLT);
      }
      for (int i = 1; i == 0; i = 0)
      {
        localObject3 = new java/lang/RuntimeException;
        paramFile = new java/lang/StringBuilder;
        paramFile.<init>("ApkSectionInfo paramters is not valid : ");
        ((RuntimeException)localObject3).<init>(((a)localObject1).toString());
        AppMethodBeat.o(2328);
        throw ((Throwable)localObject3);
      }
      l2 = b.b((ByteBuffer)((a)localObject1).kLX.first, ((Long)((a)localObject1).kLX.second).longValue());
      if (l2 != ((Long)((a)localObject1).kLW.second).longValue())
      {
        paramFile = new java/lang/RuntimeException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("CentralDirOffset mismatch , EocdCentralDirOffset : ");
        paramFile.<init>(l2 + ", centralDirOffset : " + ((a)localObject1).kLW.second);
        AppMethodBeat.o(2328);
        throw paramFile;
      }
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("baseApk : ");
      ab.i("MicroMsg.Channel.V2SchemeUtil", paramFile.getAbsolutePath() + "\nApkSectionInfo = " + localObject1);
      ((RandomAccessFile)localObject2).close();
      AppMethodBeat.o(2328);
      return localObject1;
    }
    finally
    {
      while (true)
        Object localObject2 = localObject1;
    }
  }

  public static boolean R(File paramFile)
  {
    boolean bool1 = true;
    AppMethodBeat.i(2331);
    try
    {
      boolean bool2 = E(P(paramFile)).containsKey(Integer.valueOf(1896449818));
      if (bool2)
      {
        AppMethodBeat.o(2331);
        return bool1;
      }
    }
    catch (IOException paramFile)
    {
      while (true)
      {
        ab.e("MicroMsg.Channel.V2SchemeUtil", "containV2Signature, error: %s", new Object[] { paramFile.getMessage() });
        AppMethodBeat.o(2331);
        bool1 = false;
      }
    }
    catch (b.b localb)
    {
      while (true)
        ab.e("MicroMsg.Channel.V2SchemeUtil", "APK : " + paramFile.getAbsolutePath() + " not have apk signature block");
    }
  }

  private static ByteBuffer a(RandomAccessFile paramRandomAccessFile, long paramLong, int paramInt)
  {
    AppMethodBeat.i(2329);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramInt);
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramRandomAccessFile.seek(paramLong);
    paramRandomAccessFile.readFully(localByteBuffer.array(), localByteBuffer.arrayOffset(), localByteBuffer.capacity());
    AppMethodBeat.o(2329);
    return localByteBuffer;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.d.i
 * JD-Core Version:    0.6.2
 */