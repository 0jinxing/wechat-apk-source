package com.tencent.d.d.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

public final class b
{
  public static void closeQuietly(Closeable paramCloseable)
  {
    AppMethodBeat.i(114518);
    if (paramCloseable != null);
    try
    {
      paramCloseable.close();
      AppMethodBeat.o(114518);
      return;
    }
    catch (Throwable paramCloseable)
    {
      while (true)
        AppMethodBeat.o(114518);
    }
  }

  public static long copyLarge(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    AppMethodBeat.i(114519);
    byte[] arrayOfByte = new byte[4096];
    int i;
    for (long l = 0L; ; l += i)
    {
      i = paramInputStream.read(arrayOfByte);
      if (-1 == i)
        break;
      paramOutputStream.write(arrayOfByte, 0, i);
    }
    AppMethodBeat.o(114519);
    return l;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.d.d.b.b
 * JD-Core Version:    0.6.2
 */