package com.tencent.matrix.resource.a.a;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipFile;

public final class c
{
  public static void a(File paramFile, OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = new byte[4096];
    try
    {
      BufferedInputStream localBufferedInputStream = new java/io/BufferedInputStream;
      FileInputStream localFileInputStream = new java/io/FileInputStream;
      localFileInputStream.<init>(paramFile);
      localBufferedInputStream.<init>(localFileInputStream);
      try
      {
        while (true)
        {
          int i = localBufferedInputStream.read(arrayOfByte);
          if (i <= 0)
            break;
          paramOutputStream.write(arrayOfByte, 0, i);
        }
      }
      finally
      {
        paramFile = localBufferedInputStream;
      }
      ah(paramFile);
      throw paramOutputStream;
      paramOutputStream.flush();
      ah(localBufferedInputStream);
      return;
    }
    finally
    {
      while (true)
        paramFile = null;
    }
  }

  public static void ah(Object paramObject)
  {
    if (paramObject == null);
    while (true)
    {
      return;
      try
      {
        if (!(paramObject instanceof Closeable))
          break label28;
        ((Closeable)paramObject).close();
      }
      catch (Throwable paramObject)
      {
      }
      continue;
      label28: if ((paramObject instanceof ZipFile))
        ((ZipFile)paramObject).close();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.resource.a.a.c
 * JD-Core Version:    0.6.2
 */