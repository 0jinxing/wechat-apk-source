package com.tencent.mm.plugin.downloader.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public final class h
{
  // ERROR //
  public static android.util.Pair<ByteBuffer, java.lang.Long> N(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: sipush 2323
    //   5: invokestatic 12	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: ifnull +17 -> 26
    //   12: aload_0
    //   13: invokevirtual 18	java/io/File:exists	()Z
    //   16: ifeq +10 -> 26
    //   19: aload_0
    //   20: invokevirtual 21	java/io/File:isFile	()Z
    //   23: ifne +13 -> 36
    //   26: sipush 2323
    //   29: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_1
    //   33: astore_0
    //   34: aload_0
    //   35: areturn
    //   36: new 26	java/io/RandomAccessFile
    //   39: astore_1
    //   40: aload_1
    //   41: aload_0
    //   42: ldc 28
    //   44: invokespecial 32	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   47: aload_1
    //   48: invokestatic 38	com/tencent/mm/plugin/downloader/d/b:e	(Ljava/io/RandomAccessFile;)Landroid/util/Pair;
    //   51: astore_0
    //   52: aload_1
    //   53: aload_0
    //   54: getfield 44	android/util/Pair:second	Ljava/lang/Object;
    //   57: checkcast 46	java/lang/Long
    //   60: invokevirtual 50	java/lang/Long:longValue	()J
    //   63: invokestatic 56	com/tencent/mm/plugin/downloader/d/k:c	(Ljava/io/RandomAccessFile;J)Z
    //   66: ifeq +38 -> 104
    //   69: new 58	com/tencent/mm/plugin/downloader/d/b$b
    //   72: astore_0
    //   73: aload_0
    //   74: ldc 60
    //   76: invokespecial 63	com/tencent/mm/plugin/downloader/d/b$b:<init>	(Ljava/lang/String;)V
    //   79: sipush 2323
    //   82: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   85: aload_0
    //   86: athrow
    //   87: astore_0
    //   88: aload_1
    //   89: ifnull +7 -> 96
    //   92: aload_1
    //   93: invokevirtual 67	java/io/RandomAccessFile:close	()V
    //   96: sipush 2323
    //   99: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   102: aload_0
    //   103: athrow
    //   104: aload_1
    //   105: invokevirtual 67	java/io/RandomAccessFile:close	()V
    //   108: sipush 2323
    //   111: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   114: goto -80 -> 34
    //   117: astore_0
    //   118: aconst_null
    //   119: astore_1
    //   120: goto -32 -> 88
    //
    // Exception table:
    //   from	to	target	type
    //   47	87	87	finally
    //   36	47	117	finally
  }

  public static boolean O(File paramFile)
  {
    AppMethodBeat.i(2324);
    try
    {
      JarFile localJarFile = new java/util/jar/JarFile;
      localJarFile.<init>(paramFile);
      JarEntry localJarEntry = localJarFile.getJarEntry("META-INF/MANIFEST.MF");
      Enumeration localEnumeration = localJarFile.entries();
      do
      {
        if (!localEnumeration.hasMoreElements())
          break;
        paramFile = (JarEntry)localEnumeration.nextElement();
      }
      while (!paramFile.getName().matches("META-INF/\\w+\\.SF"));
      paramFile = localJarFile.getJarEntry(paramFile.getName());
      if ((localJarEntry != null) && (paramFile != null))
      {
        AppMethodBeat.o(2324);
        bool = true;
        return bool;
      }
    }
    catch (IOException paramFile)
    {
      while (true)
      {
        ab.e("MicroMsg.Channel.V1SchemeUtil", "containV1Signature, error: %s", new Object[] { paramFile.getMessage() });
        AppMethodBeat.o(2324);
        boolean bool = false;
        continue;
        paramFile = null;
      }
    }
  }

  static void a(int paramInt, DataOutput paramDataOutput)
  {
    AppMethodBeat.i(2325);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN);
    localByteBuffer.putShort((short)paramInt);
    paramDataOutput.write(localByteBuffer.array());
    AppMethodBeat.o(2325);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.d.h
 * JD-Core Version:    0.6.2
 */