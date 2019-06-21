package com.tencent.mm.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.zip.GZIPInputStream;

public final class d
{
  private static int a(RandomAccessFile paramRandomAccessFile, int paramInt1, byte[] paramArrayOfByte, int paramInt2, File paramFile, int paramInt3)
  {
    AppMethodBeat.i(125687);
    if ((paramRandomAccessFile == null) || (paramInt1 <= 0))
    {
      paramInt1 = 3;
      AppMethodBeat.o(125687);
    }
    int i;
    while (true)
    {
      return paramInt1;
      if (paramFile == null)
      {
        paramInt1 = 4;
        AppMethodBeat.o(125687);
      }
      else if (paramInt2 <= 0)
      {
        paramInt1 = 2;
        AppMethodBeat.o(125687);
      }
      else
      {
        i = paramInt1 - paramInt3 - 2;
        if (i > 2)
          break;
        paramInt1 = 3;
        AppMethodBeat.o(125687);
      }
    }
    Object localObject1 = new DataInputStream(new ByteArrayInputStream(paramArrayOfByte, 0, paramInt2));
    ((DataInputStream)localObject1).skip(8L);
    long l1 = ((DataInputStream)localObject1).readLong();
    long l2 = ((DataInputStream)localObject1).readLong();
    int j = (int)((DataInputStream)localObject1).readLong();
    ((DataInputStream)localObject1).close();
    localObject1 = new ByteArrayInputStream(paramArrayOfByte, 0, paramInt2);
    ((InputStream)localObject1).skip(32L);
    localObject1 = new DataInputStream(new GZIPInputStream((InputStream)localObject1));
    Object localObject2 = new ByteArrayInputStream(paramArrayOfByte, 0, paramInt2);
    ((InputStream)localObject2).skip(32L + l1);
    localObject2 = new GZIPInputStream((InputStream)localObject2);
    paramArrayOfByte = new ByteArrayInputStream(paramArrayOfByte, 0, paramInt2);
    paramArrayOfByte.skip(l1 + l2 + 32L);
    paramArrayOfByte = new GZIPInputStream(paramArrayOfByte);
    paramFile = new FileOutputStream(paramFile);
    paramInt2 = 0;
    int[] arrayOfInt = new int[3];
    int k;
    for (paramInt3 = 0; ; paramInt3 = k + paramInt3)
    {
      if (paramInt3 >= j)
      {
        ((DataInputStream)localObject1).close();
        ((InputStream)localObject2).close();
        paramArrayOfByte.close();
        paramRandomAccessFile.close();
        paramFile.close();
        paramInt1 = 1;
        AppMethodBeat.o(125687);
        break;
      }
      for (k = 0; ; k++)
      {
        if (k > 2)
        {
          if (arrayOfInt[0] + paramInt3 <= j)
            break label351;
          paramFile.close();
          paramInt1 = 2;
          AppMethodBeat.o(125687);
          break;
        }
        arrayOfInt[k] = ((DataInputStream)localObject1).readInt();
      }
      label351: byte[] arrayOfByte1 = new byte[arrayOfInt[0]];
      if (!e.a((InputStream)localObject2, arrayOfByte1, arrayOfInt[0]))
      {
        paramFile.close();
        paramInt1 = 2;
        AppMethodBeat.o(125687);
        break;
      }
      byte[] arrayOfByte2 = new byte[arrayOfInt[0]];
      if (paramRandomAccessFile.read(arrayOfByte2, 0, arrayOfInt[0]) < arrayOfInt[0])
      {
        paramFile.close();
        paramInt1 = 2;
        AppMethodBeat.o(125687);
        break;
      }
      int m;
      for (k = 0; ; k++)
      {
        if (k >= arrayOfInt[0])
        {
          paramFile.write(arrayOfByte1);
          k = arrayOfInt[0] + paramInt3;
          m = arrayOfInt[0];
          if (arrayOfInt[1] + k <= j)
            break label554;
          paramFile.close();
          paramInt1 = 2;
          AppMethodBeat.o(125687);
          break;
        }
        if (paramInt2 + k == i)
        {
          arrayOfByte2[k] = ((byte)0);
          arrayOfByte2[(k + 1)] = ((byte)0);
        }
        if ((paramInt2 + k >= 0) && (paramInt2 + k < paramInt1))
          arrayOfByte1[k] = ((byte)(byte)(arrayOfByte1[k] + arrayOfByte2[k]));
      }
      label554: arrayOfByte2 = new byte[arrayOfInt[1]];
      if (!e.a(paramArrayOfByte, arrayOfByte2, arrayOfInt[1]))
      {
        paramFile.close();
        paramInt1 = 2;
        AppMethodBeat.o(125687);
        break;
      }
      paramFile.write(arrayOfByte2);
      paramFile.flush();
      paramInt3 = arrayOfInt[1];
      paramInt2 = arrayOfInt[2] + (m + paramInt2);
      paramRandomAccessFile.seek(paramInt2);
    }
  }

  public static int a(RandomAccessFile paramRandomAccessFile, File paramFile1, File paramFile2, int paramInt)
  {
    AppMethodBeat.i(125686);
    if (paramRandomAccessFile.length() <= 0L)
    {
      paramInt = 3;
      AppMethodBeat.o(125686);
    }
    while (true)
    {
      return paramInt;
      if (paramFile2.length() <= 0L)
      {
        paramInt = 2;
        AppMethodBeat.o(125686);
      }
      else
      {
        byte[] arrayOfByte = new byte[(int)paramFile2.length()];
        e.a(new FileInputStream(paramFile2), arrayOfByte, arrayOfByte.length);
        paramInt = a(paramRandomAccessFile, (int)paramRandomAccessFile.length(), arrayOfByte, arrayOfByte.length, paramFile1, paramInt);
        AppMethodBeat.o(125686);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.d
 * JD-Core Version:    0.6.2
 */