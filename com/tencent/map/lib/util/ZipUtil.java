package com.tencent.map.lib.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipUtil
{
  public static byte[] deflate(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(98234);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    DeflaterOutputStream localDeflaterOutputStream = new DeflaterOutputStream(localByteArrayOutputStream);
    try
    {
      localDeflaterOutputStream.write(paramArrayOfByte, 0, paramArrayOfByte.length);
      localDeflaterOutputStream.finish();
      localDeflaterOutputStream.flush();
      localDeflaterOutputStream.close();
      paramArrayOfByte = localByteArrayOutputStream.toByteArray();
      AppMethodBeat.o(98234);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        paramArrayOfByte = null;
        AppMethodBeat.o(98234);
      }
    }
  }

  public static byte[] inflate(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(98235);
    paramArrayOfByte = inflate(paramArrayOfByte, 0, paramArrayOfByte.length);
    AppMethodBeat.o(98235);
    return paramArrayOfByte;
  }

  public static byte[] inflate(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(98236);
    paramArrayOfByte = new InflaterInputStream(new ByteArrayInputStream(paramArrayOfByte, paramInt1, paramInt2));
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[1024];
    try
    {
      do
      {
        paramInt1 = paramArrayOfByte.read(arrayOfByte);
        if (paramInt1 > 0)
          localByteArrayOutputStream.write(arrayOfByte, 0, paramInt1);
      }
      while (paramInt1 > 0);
    }
    catch (IOException paramArrayOfByte)
    {
      try
      {
        paramArrayOfByte.close();
        paramArrayOfByte = localByteArrayOutputStream.toByteArray();
      }
      catch (IOException paramArrayOfByte)
      {
        try
        {
          localByteArrayOutputStream.close();
          label74: AppMethodBeat.o(98236);
          while (true)
          {
            return paramArrayOfByte;
            localIOException1 = localIOException1;
            try
            {
              paramArrayOfByte.close();
              label86: paramArrayOfByte = null;
              AppMethodBeat.o(98236);
            }
            catch (IOException paramArrayOfByte)
            {
              break label86;
            }
          }
          paramArrayOfByte = paramArrayOfByte;
        }
        catch (IOException localIOException2)
        {
          break label74;
        }
      }
    }
  }

  public static void upZipFile(File paramFile, String paramString)
  {
    AppMethodBeat.i(98233);
    Object localObject1 = new File(paramString);
    if (!((File)localObject1).exists())
      ((File)localObject1).mkdirs();
    ZipFile localZipFile = new ZipFile(paramFile);
    paramFile = new byte[49152];
    localObject1 = localZipFile.entries();
    while (((Enumeration)localObject1).hasMoreElements())
    {
      Object localObject2 = (ZipEntry)((Enumeration)localObject1).nextElement();
      Object localObject3 = ((ZipEntry)localObject2).getName();
      if ((localObject3 == null) || (!((String)localObject3).contains("../")))
        if (((ZipEntry)localObject2).isDirectory())
        {
          new File(paramString + File.separator + ((ZipEntry)localObject2).getName()).mkdir();
        }
        else
        {
          localObject3 = localZipFile.getInputStream((ZipEntry)localObject2);
          File localFile = new File(paramString + File.separator + ((ZipEntry)localObject2).getName());
          if (!localFile.exists())
          {
            localObject2 = localFile.getParentFile();
            if (!((File)localObject2).exists())
              ((File)localObject2).mkdirs();
            localFile.createNewFile();
          }
          localObject2 = new FileOutputStream(localFile);
          while (true)
          {
            int i = ((InputStream)localObject3).read(paramFile);
            if (i <= 0)
              break;
            ((OutputStream)localObject2).write(paramFile, 0, i);
          }
          ((OutputStream)localObject2).flush();
          ((InputStream)localObject3).close();
          ((OutputStream)localObject2).close();
        }
    }
    localZipFile.close();
    AppMethodBeat.o(98233);
  }

  public static void upZipFileFromInputStream(InputStream paramInputStream, File paramFile)
  {
    AppMethodBeat.i(98238);
    if (!paramFile.exists())
      paramFile.mkdirs();
    ZipInputStream localZipInputStream = new ZipInputStream(paramInputStream);
    byte[] arrayOfByte = new byte[49152];
    Object localObject = localZipInputStream.getNextEntry();
    if (localObject != null)
    {
      if (((ZipEntry)localObject).isDirectory())
      {
        localObject = ((ZipEntry)localObject).getName();
        localObject = ((String)localObject).substring(0, ((String)localObject).length() - 1);
        new File(paramFile + File.separator + (String)localObject).mkdir();
      }
      while (true)
      {
        localObject = localZipInputStream.getNextEntry();
        break;
        localObject = new File(paramFile, File.separator + ((ZipEntry)localObject).getName());
        if (!((File)localObject).exists())
        {
          File localFile = ((File)localObject).getParentFile();
          if (!localFile.exists())
            localFile.mkdirs();
          ((File)localObject).createNewFile();
        }
        localObject = new FileOutputStream((File)localObject);
        while (true)
        {
          int i = localZipInputStream.read(arrayOfByte);
          if (i <= 0)
            break;
          ((OutputStream)localObject).write(arrayOfByte, 0, i);
        }
        ((OutputStream)localObject).flush();
        ((OutputStream)localObject).close();
      }
    }
    paramInputStream.close();
    localZipInputStream.close();
    AppMethodBeat.o(98238);
  }

  public static void upZipFiles(File paramFile, String paramString)
  {
    AppMethodBeat.i(98237);
    try
    {
      FileInputStream localFileInputStream = new java/io/FileInputStream;
      localFileInputStream.<init>(paramFile);
      paramFile = new java/io/File;
      paramFile.<init>(paramString);
      upZipFileFromInputStream(localFileInputStream, paramFile);
      AppMethodBeat.o(98237);
      return;
    }
    catch (Exception paramFile)
    {
      while (true)
        AppMethodBeat.o(98237);
    }
  }

  public static void zipFile(File paramFile, String paramString)
  {
    AppMethodBeat.i(98232);
    if ((paramFile == null) || (!paramFile.exists()))
      AppMethodBeat.o(98232);
    while (true)
    {
      return;
      Object localObject = new File(paramString);
      if (!((File)localObject).exists())
        ((File)localObject).mkdirs();
      localObject = new byte[49152];
      FileInputStream localFileInputStream = new FileInputStream(paramFile);
      paramString = new ZipOutputStream(new FileOutputStream(new File(paramString, paramFile.getName() + ".zip")));
      paramString.setLevel(9);
      paramString.setMethod(8);
      paramString.putNextEntry(new ZipEntry(paramFile.getName()));
      while (true)
      {
        int i = localFileInputStream.read((byte[])localObject);
        if (i == -1)
          break;
        paramString.write((byte[])localObject, 0, i);
      }
      paramString.finish();
      paramString.close();
      localFileInputStream.close();
      AppMethodBeat.o(98232);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.util.ZipUtil
 * JD-Core Version:    0.6.2
 */