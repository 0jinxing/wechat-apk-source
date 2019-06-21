package com.tencent.tinker.b;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;

public final class a
{
  public static int a(InputStream paramInputStream1, InputStream paramInputStream2, File paramFile)
  {
    int i;
    if (paramInputStream1 == null)
      i = 3;
    while (true)
    {
      return i;
      if (paramFile == null)
      {
        i = 4;
        continue;
      }
      if (paramInputStream2 == null)
      {
        i = 2;
        continue;
      }
      paramInputStream1 = b.K(paramInputStream1);
      Object localObject1 = b.K(paramInputStream2);
      int j = paramInputStream1.length;
      i = localObject1.length;
      paramInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[])localObject1, 0, i));
      paramInputStream2.skip(8L);
      long l1 = paramInputStream2.readLong();
      long l2 = paramInputStream2.readLong();
      int k = (int)paramInputStream2.readLong();
      paramInputStream2.close();
      paramInputStream2 = new ByteArrayInputStream((byte[])localObject1, 0, i);
      paramInputStream2.skip(32L);
      paramInputStream2 = new DataInputStream(new GZIPInputStream(paramInputStream2));
      Object localObject2 = new ByteArrayInputStream((byte[])localObject1, 0, i);
      ((InputStream)localObject2).skip(32L + l1);
      localObject2 = new GZIPInputStream((InputStream)localObject2);
      localObject1 = new ByteArrayInputStream((byte[])localObject1, 0, i);
      ((InputStream)localObject1).skip(l2 + l1 + 32L);
      GZIPInputStream localGZIPInputStream = new GZIPInputStream((InputStream)localObject1);
      localObject1 = new byte[k];
      i = 0;
      int[] arrayOfInt = new int[3];
      int m = 0;
      while (m < k)
      {
        for (int n = 0; n <= 2; n++)
          arrayOfInt[n] = paramInputStream2.readInt();
        if (arrayOfInt[0] + m > k)
          throw new IOException("Corrupt by wrong patch file.");
        if (!b.a((InputStream)localObject2, (byte[])localObject1, m, arrayOfInt[0]))
          throw new IOException("Corrupt by wrong patch file.");
        for (n = 0; n < arrayOfInt[0]; n++)
          if ((i + n >= 0) && (i + n < j))
          {
            i1 = m + n;
            localObject1[i1] = ((byte)(byte)(localObject1[i1] + paramInputStream1[(i + n)]));
          }
        m = arrayOfInt[0] + m;
        int i1 = arrayOfInt[0];
        if (arrayOfInt[1] + m > k)
          throw new IOException("Corrupt by wrong patch file.");
        if (!b.a(localGZIPInputStream, (byte[])localObject1, m, arrayOfInt[1]))
          throw new IOException("Corrupt by wrong patch file.");
        n = arrayOfInt[1];
        i = arrayOfInt[2] + (i1 + i);
        m += n;
      }
      paramInputStream2.close();
      ((InputStream)localObject2).close();
      localGZIPInputStream.close();
      paramInputStream1 = new FileOutputStream(paramFile);
      try
      {
        paramInputStream1.write((byte[])localObject1);
        paramInputStream1.close();
        i = 1;
      }
      finally
      {
        paramInputStream1.close();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.b.a
 * JD-Core Version:    0.6.2
 */