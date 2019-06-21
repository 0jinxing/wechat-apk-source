package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

final class IOUtils$zzb
{
  private final File file;

  private IOUtils$zzb(File paramFile)
  {
    AppMethodBeat.i(90219);
    this.file = ((File)Preconditions.checkNotNull(paramFile));
    AppMethodBeat.o(90219);
  }

  // ERROR //
  public final byte[] zzdd()
  {
    // Byte code:
    //   0: ldc 41
    //   2: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 43	java/io/FileInputStream
    //   8: astore_1
    //   9: aload_1
    //   10: aload_0
    //   11: getfield 31	com/google/android/gms/common/util/IOUtils$zzb:file	Ljava/io/File;
    //   14: invokespecial 44	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   17: aload_1
    //   18: aload_1
    //   19: invokevirtual 48	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   22: invokevirtual 54	java/nio/channels/FileChannel:size	()J
    //   25: invokestatic 57	com/google/android/gms/common/util/IOUtils:zzb	(Ljava/io/InputStream;J)[B
    //   28: astore_2
    //   29: aload_1
    //   30: invokestatic 61	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   33: ldc 41
    //   35: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   38: aload_2
    //   39: areturn
    //   40: astore_2
    //   41: aconst_null
    //   42: astore_1
    //   43: aload_1
    //   44: invokestatic 61	com/google/android/gms/common/util/IOUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   47: ldc 41
    //   49: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   52: aload_2
    //   53: athrow
    //   54: astore_2
    //   55: goto -12 -> 43
    //
    // Exception table:
    //   from	to	target	type
    //   5	17	40	finally
    //   17	29	54	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.IOUtils.zzb
 * JD-Core Version:    0.6.2
 */