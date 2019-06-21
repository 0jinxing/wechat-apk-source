package com.tencent.mm.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Properties;
import java.util.zip.ZipException;

public final class c
{
  private static final k cdn;
  private static final k cdo;
  private static int cdp;
  private static final k cdq;

  static
  {
    AppMethodBeat.i(125713);
    cdn = new k(84298576L);
    cdo = new k(50613072L);
    cdp = 0;
    cdq = new k(101010256L);
    AppMethodBeat.o(125713);
  }

  private static String D(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(125717);
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; ; i++)
    {
      if (i >= 2)
      {
        paramArrayOfByte = localStringBuilder.toString();
        AppMethodBeat.o(125717);
        return paramArrayOfByte;
      }
      localStringBuilder.append(paramArrayOfByte[i]);
      localStringBuilder.append(",");
    }
  }

  public static void c(File paramFile, String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(125715);
    try
    {
      localRandomAccessFile = new java/io/RandomAccessFile;
      localRandomAccessFile.<init>(paramFile, "rw");
    }
    finally
    {
      try
      {
        paramFile = c(localRandomAccessFile);
        if (paramFile == null)
          paramFile = (File)localObject1;
        while (true)
        {
          localObject1 = new com/tencent/mm/c/c$a;
          ((c.a)localObject1).<init>((byte)0);
          ((c.a)localObject1).E(paramFile);
          ((c.a)localObject1).cdr.setProperty("apkSecurityCode", paramString);
          paramString = ((c.a)localObject1).AL();
          localRandomAccessFile.seek(cdp);
          paramFile = new com/tencent/mm/c/l;
          paramFile.<init>(paramString.length);
          localRandomAccessFile.write(paramFile.getBytes());
          localRandomAccessFile.write(paramString);
          int i = cdp;
          localRandomAccessFile.setLength(paramString.length + i + 2);
          paramFile = System.err;
          paramString = new java/lang/StringBuilder;
          paramString.<init>("file length is = ");
          paramFile.println(localRandomAccessFile.length());
          localRandomAccessFile.close();
          System.err.println("exit writeSecurityCode");
          AppMethodBeat.o(125715);
          return;
          Object localObject2 = ByteBuffer.wrap(paramFile);
          localObject1 = new byte[4];
          ((ByteBuffer)localObject2).get((byte[])localObject1);
          localObject2 = cdn;
          k localk = new com/tencent/mm/c/k;
          localk.<init>((byte[])localObject1);
          if (!((k)localObject2).equals(localk))
          {
            localObject2 = cdo;
            localk = new com/tencent/mm/c/k;
            localk.<init>((byte[])localObject1);
            if (!((k)localObject2).equals(localk))
            {
              localObject1 = new java/io/ByteArrayOutputStream;
              ((ByteArrayOutputStream)localObject1).<init>();
              ((ByteArrayOutputStream)localObject1).write(cdo.getBytes());
              localObject2 = new com/tencent/mm/c/l;
              ((l)localObject2).<init>(paramFile.length);
              ((ByteArrayOutputStream)localObject1).write(((l)localObject2).getBytes());
              ((ByteArrayOutputStream)localObject1).write(paramFile);
              paramFile = ((ByteArrayOutputStream)localObject1).toByteArray();
            }
          }
        }
        paramFile = finally;
        paramString = null;
        if (paramString != null)
          paramString.close();
        System.err.println("exit writeSecurityCode");
        AppMethodBeat.o(125715);
        throw paramFile;
      }
      finally
      {
        while (true)
        {
          RandomAccessFile localRandomAccessFile;
          paramString = localRandomAccessFile;
        }
      }
    }
  }

  private static byte[] c(RandomAccessFile paramRandomAccessFile)
  {
    int i = 1;
    AppMethodBeat.i(125714);
    long l = paramRandomAccessFile.length() - 22L;
    paramRandomAccessFile.seek(l);
    byte[] arrayOfByte = cdq.getBytes();
    for (int j = paramRandomAccessFile.read(); ; j = paramRandomAccessFile.read())
    {
      if (j == -1)
        j = 0;
      do
      {
        if (j != 0)
          break label137;
        System.err.println("archive is not a ZIP archive");
        paramRandomAccessFile = new ZipException("archive is not a ZIP archive");
        AppMethodBeat.o(125714);
        throw paramRandomAccessFile;
        if ((j != arrayOfByte[0]) || (paramRandomAccessFile.read() != arrayOfByte[1]) || (paramRandomAccessFile.read() != arrayOfByte[2]))
          break;
        j = i;
      }
      while (paramRandomAccessFile.read() == arrayOfByte[3]);
      l -= 1L;
      paramRandomAccessFile.seek(l);
    }
    label137: paramRandomAccessFile.seek(l + 16L + 4L);
    if (cdp != l + 16L + 4L)
      cdp = (int)(l + 16L + 4L);
    arrayOfByte = new byte[2];
    paramRandomAccessFile.readFully(arrayOfByte);
    System.err.println("readComment:length bytes data = " + D(arrayOfByte));
    j = new l(arrayOfByte).value;
    if (j == 0)
    {
      paramRandomAccessFile = null;
      AppMethodBeat.o(125714);
    }
    while (true)
    {
      return paramRandomAccessFile;
      arrayOfByte = new byte[j];
      paramRandomAccessFile.read(arrayOfByte);
      AppMethodBeat.o(125714);
      paramRandomAccessFile = arrayOfByte;
    }
  }

  public static String y(File paramFile)
  {
    c.a locala = null;
    AppMethodBeat.i(125716);
    System.err.println("enter getSecurityCode");
    System.err.println("apkFile filename:" + paramFile.getName());
    try
    {
      localRandomAccessFile = new java/io/RandomAccessFile;
      localRandomAccessFile.<init>(paramFile, "r");
    }
    finally
    {
      try
      {
        paramFile = c(localRandomAccessFile);
        if (paramFile == null)
        {
          System.err.println("null == readComment");
          System.err.println("exit");
          localRandomAccessFile.close();
          System.err.println("exit getSecurityCode");
          AppMethodBeat.o(125716);
          paramFile = locala;
        }
        while (true)
        {
          return paramFile;
          locala = new com/tencent/mm/c/c$a;
          locala.<init>((byte)0);
          locala.E(paramFile);
          paramFile = locala.cdr.getProperty("apkSecurityCode");
          localRandomAccessFile.close();
          System.err.println("exit getSecurityCode");
          AppMethodBeat.o(125716);
        }
        paramFile = finally;
        RandomAccessFile localRandomAccessFile = null;
        label144: if (localRandomAccessFile != null)
          localRandomAccessFile.close();
        System.err.println("exit getSecurityCode");
        AppMethodBeat.o(125716);
        throw paramFile;
      }
      finally
      {
        break label144;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.c
 * JD-Core Version:    0.6.2
 */