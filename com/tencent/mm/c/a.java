package com.tencent.mm.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;

public final class a
{
  public a.a cdb;
  public b cdc = null;

  public a(b paramb)
  {
    this.cdc = paramb;
  }

  public static a cL(String paramString)
  {
    int i = 0;
    Object localObject1 = null;
    AppMethodBeat.i(125702);
    if (paramString == null)
    {
      if (i >= 8)
        break label53;
      AppMethodBeat.o(125702);
      paramString = localObject1;
    }
    while (true)
      while (true)
      {
        return paramString;
        try
        {
          Object localObject2 = new java/io/File;
          ((File)localObject2).<init>(paramString);
          if (!((File)localObject2).exists())
            break;
          i = (int)((File)localObject2).length();
          break;
          label53: localObject2 = a.a.C(f(paramString, i - 8, 8));
          if (localObject2 == null)
          {
            AppMethodBeat.o(125702);
            paramString = localObject1;
          }
          else if (((a.a)localObject2).cde >= 0)
          {
            b localb = new com/tencent/mm/c/b;
            localb.<init>();
            localb.parseFrom(f(paramString, i - ((a.a)localObject2).cde - 8, ((a.a)localObject2).cde));
            paramString = new com/tencent/mm/c/a;
            paramString.<init>(localb);
            paramString.cdb = ((a.a)localObject2);
            AppMethodBeat.o(125702);
          }
        }
        catch (Exception paramString)
        {
          AppMethodBeat.o(125702);
          paramString = localObject1;
        }
      }
  }

  public static boolean cM(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(125703);
    if (paramString == null)
      AppMethodBeat.o(125703);
    while (true)
    {
      return bool1;
      File localFile1 = new File(paramString);
      if (!localFile1.exists())
      {
        AppMethodBeat.o(125703);
      }
      else
      {
        a locala = cL(paramString);
        if ((locala != null) && (locala.cdc != null))
          try
          {
            File localFile2 = new java/io/File;
            localFile2.<init>(paramString);
            if (localFile2.exists())
            {
              boolean bool2 = locala.cdc.apkMd5.equalsIgnoreCase(g.a(localFile2, (int)(localFile1.length() - (locala.cdb.cde + 8) - 2L), new byte[] { 0, 0 }));
              bool1 = bool2;
              AppMethodBeat.o(125703);
            }
          }
          catch (Exception paramString)
          {
          }
        else
          AppMethodBeat.o(125703);
      }
    }
  }

  private static byte[] f(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(125704);
    if (paramString == null)
      AppMethodBeat.o(125704);
    Object localObject;
    for (paramString = null; ; paramString = null)
    {
      return paramString;
      localObject = new File(paramString);
      if (((File)localObject).exists())
        break;
      AppMethodBeat.o(125704);
    }
    if (paramInt2 == -1)
      paramInt2 = (int)((File)localObject).length();
    while (true)
      while (true)
      {
        if (paramInt1 < 0)
        {
          AppMethodBeat.o(125704);
          paramString = null;
          break;
        }
        if (paramInt2 <= 0)
        {
          AppMethodBeat.o(125704);
          paramString = null;
          break;
        }
        int i = paramInt2;
        if (paramInt1 + paramInt2 > (int)((File)localObject).length())
          i = (int)((File)localObject).length() - paramInt1;
        try
        {
          localObject = new java/io/RandomAccessFile;
          ((RandomAccessFile)localObject).<init>(paramString, "r");
          paramString = new byte[i];
          l = paramInt1;
        }
        catch (Exception paramString)
        {
          try
          {
            long l;
            ((RandomAccessFile)localObject).seek(l);
            ((RandomAccessFile)localObject).readFully(paramString);
            ((RandomAccessFile)localObject).close();
            while (true)
            {
              label141: AppMethodBeat.o(125704);
              break;
              paramString = paramString;
              paramString = null;
            }
          }
          catch (Exception localException)
          {
            break label141;
          }
        }
      }
  }

  public final int x(File paramFile)
  {
    int i = -1;
    AppMethodBeat.i(125701);
    try
    {
      if (cL(paramFile.getAbsolutePath()) != null)
      {
        System.out.println("Error: duplicate append apk external info!");
        AppMethodBeat.o(125701);
      }
      while (true)
      {
        return i;
        byte[] arrayOfByte = this.cdc.toByteArray();
        Object localObject1 = new com/tencent/mm/c/a$a;
        ((a.a)localObject1).<init>(arrayOfByte.length);
        localObject1 = a.a.aL(a.a.cdd << 32 | ((a.a)localObject1).cde);
        int j = (byte)((arrayOfByte.length + 8) % 256);
        int k = (byte)((arrayOfByte.length + 8) / 256);
        Object localObject2 = new java/io/RandomAccessFile;
        ((RandomAccessFile)localObject2).<init>(paramFile, "rw");
        ((RandomAccessFile)localObject2).seek(paramFile.length() - 2L);
        ((RandomAccessFile)localObject2).write(new byte[] { j, k });
        ((RandomAccessFile)localObject2).close();
        localObject2 = new java/io/FileOutputStream;
        ((FileOutputStream)localObject2).<init>(paramFile, true);
        ((FileOutputStream)localObject2).write(arrayOfByte);
        ((FileOutputStream)localObject2).write((byte[])localObject1);
        ((FileOutputStream)localObject2).flush();
        ((FileOutputStream)localObject2).close();
        AppMethodBeat.o(125701);
        i = 0;
      }
    }
    catch (Exception paramFile)
    {
      while (true)
        AppMethodBeat.o(125701);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.a
 * JD-Core Version:    0.6.2
 */