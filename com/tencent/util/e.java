package com.tencent.util;

import android.annotation.SuppressLint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.spec.KeySpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

@SuppressLint({"NewApi"})
public final class e
{
  public static final byte[] AHX = { 69, 78, 67, 82 };

  public static byte[] O(InputStream paramInputStream)
  {
    AppMethodBeat.i(86580);
    try
    {
      arrayOfByte = new byte[4];
      paramInputStream.read(arrayOfByte);
      if ((arrayOfByte[0] == AHX[0]) && (arrayOfByte[1] == AHX[1]) && (arrayOfByte[2] == AHX[2]) && (arrayOfByte[3] == AHX[3]))
      {
        i = P(paramInputStream);
        localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
        localByteArrayOutputStream.<init>(i);
        int j = P(paramInputStream);
        arrayOfByte = new byte[j];
        i = paramInputStream.read(arrayOfByte, 0, j);
        if (i < j)
        {
          k = paramInputStream.read(arrayOfByte, i, j - i);
          if (-1 == k)
          {
            paramInputStream = new java/lang/RuntimeException;
            paramInputStream.<init>("decryptFile: inputStream end before all data read");
            AppMethodBeat.o(86580);
            throw paramInputStream;
          }
        }
      }
    }
    catch (Exception paramInputStream)
    {
      byte[] arrayOfByte;
      int i;
      ByteArrayOutputStream localByteArrayOutputStream;
      int k;
      paramInputStream = null;
      AppMethodBeat.o(86580);
      while (true)
      {
        return paramInputStream;
        i += k;
        break;
        Integer.toString(i);
        Object localObject = new javax/crypto/spec/DESedeKeySpec;
        ((DESedeKeySpec)localObject).<init>(Coffee.dSI().getBytes());
        localObject = SecretKeyFactory.getInstance("desede").generateSecret((KeySpec)localObject);
        Cipher localCipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
        IvParameterSpec localIvParameterSpec = new javax/crypto/spec/IvParameterSpec;
        localIvParameterSpec.<init>("68881999".getBytes());
        localCipher.init(2, (Key)localObject, localIvParameterSpec);
        arrayOfByte = localCipher.doFinal(arrayOfByte);
        localByteArrayOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
        g.copy(paramInputStream, localByteArrayOutputStream);
        paramInputStream = localByteArrayOutputStream.toByteArray();
        AppMethodBeat.o(86580);
        continue;
        localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
        localByteArrayOutputStream.<init>();
        localByteArrayOutputStream.write(arrayOfByte);
        g.copy(paramInputStream, localByteArrayOutputStream);
        paramInputStream = localByteArrayOutputStream.toByteArray();
        AppMethodBeat.o(86580);
      }
    }
    catch (OutOfMemoryError paramInputStream)
    {
      label135: break label135;
    }
  }

  private static int P(InputStream paramInputStream)
  {
    AppMethodBeat.i(86581);
    int i = paramInputStream.read();
    int j = paramInputStream.read();
    int k = paramInputStream.read();
    int m = paramInputStream.read();
    if ((i | j | k | m) < 0)
    {
      paramInputStream = new EOFException();
      AppMethodBeat.o(86581);
      throw paramInputStream;
    }
    AppMethodBeat.o(86581);
    return (i << 24) + (j << 16) + (k << 8) + (m << 0);
  }

  private static void d(OutputStream paramOutputStream, int paramInt)
  {
    AppMethodBeat.i(86582);
    paramOutputStream.write(new byte[] { (byte)(paramInt >> 24 & 0xFF), (byte)(paramInt >> 16 & 0xFF), (byte)(paramInt >> 8 & 0xFF), (byte)(paramInt & 0xFF) });
    AppMethodBeat.o(86582);
  }

  public static void iF(String paramString1, String paramString2)
  {
    AppMethodBeat.i(86579);
    try
    {
      Object localObject1 = new java/io/File;
      ((File)localObject1).<init>(paramString1);
      Object localObject2 = new java/io/FileInputStream;
      ((FileInputStream)localObject2).<init>((File)localObject1);
      paramString1 = g.toByteArray((InputStream)localObject2);
      ((FileInputStream)localObject2).close();
      try
      {
        localObject1 = new java/io/File;
        ((File)localObject1).<init>(paramString2);
        paramString2 = new java/io/DataOutputStream;
        localObject2 = new java/io/FileOutputStream;
        ((FileOutputStream)localObject2).<init>((File)localObject1);
        paramString2.<init>((OutputStream)localObject2);
        paramString2.write(AHX);
        if (paramString1.length > 1024)
        {
          d(paramString2, paramString1.length);
          localObject1 = c.encode(Arrays.copyOfRange(paramString1, 0, 1024));
          d(paramString2, localObject1.length);
          paramString2.write((byte[])localObject1);
          paramString2.write(paramString1, 1024, paramString1.length - 1024);
        }
        while (true)
        {
          paramString2.close();
          AppMethodBeat.o(86579);
          return;
          d(paramString2, paramString1.length);
          paramString1 = c.encode(paramString1);
          d(paramString2, paramString1.length);
          paramString2.write(paramString1);
        }
      }
      catch (Exception paramString1)
      {
        while (true)
          AppMethodBeat.o(86579);
      }
    }
    catch (Exception paramString1)
    {
      while (true)
        AppMethodBeat.o(86579);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.util.e
 * JD-Core Version:    0.6.2
 */