package com.tencent.tinker.b;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public final class b
{
  public static byte[] K(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[8192];
    while (true)
    {
      int i = paramInputStream.read(arrayOfByte, 0, 8192);
      if (i == -1)
        break;
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    return localByteArrayOutputStream.toByteArray();
  }

  public static final boolean a(InputStream paramInputStream, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    int i = 0;
    int j;
    if (i < paramInt2)
    {
      j = paramInputStream.read(paramArrayOfByte, paramInt1 + i, paramInt2 - i);
      if (j >= 0);
    }
    while (true)
    {
      return bool;
      i += j;
      break;
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.b.b
 * JD-Core Version:    0.6.2
 */