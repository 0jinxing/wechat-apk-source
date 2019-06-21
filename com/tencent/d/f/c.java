package com.tencent.d.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class c
{
  private static void a(byte[] paramArrayOfByte, int[] paramArrayOfInt)
  {
    int i = paramArrayOfByte.length;
    int j = 0;
    int m;
    for (int k = 0; j < i >> 2; k = m + 1)
    {
      m = k + 1;
      paramArrayOfByte[k] &= 255;
      int n = paramArrayOfInt[j];
      k = m + 1;
      paramArrayOfInt[j] = ((paramArrayOfByte[m] & 0xFF) << 8 | n);
      n = paramArrayOfInt[j];
      m = k + 1;
      paramArrayOfInt[j] = (n | (paramArrayOfByte[k] & 0xFF) << 16);
      paramArrayOfInt[j] |= (paramArrayOfByte[m] & 0xFF) << 24;
      j++;
    }
    if (k < paramArrayOfByte.length)
    {
      m = k + 1;
      paramArrayOfByte[k] &= 255;
      i = 8;
      k = m;
      while (k < paramArrayOfByte.length)
      {
        paramArrayOfInt[j] |= (paramArrayOfByte[k] & 0xFF) << i;
        k++;
        i += 8;
      }
    }
  }

  private static void a(int[] paramArrayOfInt, int paramInt, byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length >> 2;
    int j = i;
    if (i > paramInt)
      j = paramInt;
    i = 0;
    int k = 0;
    while (i < j)
    {
      int m = k + 1;
      paramArrayOfByte[k] = ((byte)(byte)(paramArrayOfInt[i] & 0xFF));
      k = m + 1;
      paramArrayOfByte[m] = ((byte)(byte)(paramArrayOfInt[i] >>> 8 & 0xFF));
      m = k + 1;
      paramArrayOfByte[k] = ((byte)(byte)(paramArrayOfInt[i] >>> 16 & 0xFF));
      k = m + 1;
      paramArrayOfByte[m] = ((byte)(byte)(paramArrayOfInt[i] >>> 24 & 0xFF));
      i++;
    }
    if ((paramInt > j) && (k < paramArrayOfByte.length))
    {
      j = k + 1;
      paramArrayOfByte[k] = ((byte)(byte)(paramArrayOfInt[i] & 0xFF));
      paramInt = 8;
      while ((paramInt <= 24) && (j < paramArrayOfByte.length))
      {
        paramArrayOfByte[j] = ((byte)(byte)(paramArrayOfInt[i] >>> paramInt & 0xFF));
        paramInt += 8;
        j++;
      }
    }
  }

  private static byte[] cm(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(114595);
    Object localObject = paramArrayOfByte;
    if (paramArrayOfByte != null)
    {
      localObject = paramArrayOfByte;
      if (paramArrayOfByte.length <= 16);
    }
    try
    {
      localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramArrayOfByte);
      localObject = ((MessageDigest)localObject).digest();
      AppMethodBeat.o(114595);
      return localObject;
    }
    catch (NoSuchAlgorithmException paramArrayOfByte)
    {
      while (true)
        localObject = null;
    }
  }

  public static byte[] dQC()
  {
    AppMethodBeat.i(114594);
    try
    {
      Object localObject1 = new java/lang/StringBuffer;
      ((StringBuffer)localObject1).<init>();
      for (int i = 0; i < "http://pmir.3g.qq.com".length(); i++)
        ((StringBuffer)localObject1).append((char)("http://pmir.3g.qq.com".charAt(i) + new int[] { -36, -46, -45, -77, -22, -10, 47, -77, -72, -69, -32, 25, 21, -21, -6, -75, -71, 31, -39, -49, -49 }[i]));
      localObject1 = ((StringBuffer)localObject1).toString().getBytes("UTF-8");
      AppMethodBeat.o(114594);
      return localObject1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
      {
        Object localObject2 = null;
        AppMethodBeat.o(114594);
      }
    }
  }

  public static byte[] m(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(114596);
    byte[] arrayOfByte = cm(paramArrayOfByte2);
    if ((paramArrayOfByte1 == null) || (arrayOfByte == null) || (paramArrayOfByte1.length == 0))
      AppMethodBeat.o(114596);
    while (true)
    {
      return paramArrayOfByte1;
      if (paramArrayOfByte1.length % 4 == 0)
      {
        i = (paramArrayOfByte1.length >>> 2) + 1;
        paramArrayOfByte2 = new int[i];
        a(paramArrayOfByte1, paramArrayOfByte2);
        paramArrayOfByte2[(i - 1)] = paramArrayOfByte1.length;
        if (arrayOfByte.length % 4 != 0)
          break label116;
      }
      label116: for (int i = arrayOfByte.length >>> 2; ; i = (arrayOfByte.length >>> 2) + 1)
      {
        j = i;
        if (i < 4)
          j = 4;
        paramArrayOfByte1 = new int[j];
        for (i = 0; i < j; i++)
          paramArrayOfByte1[i] = 0;
        i = (paramArrayOfByte1.length >>> 2) + 2;
        break;
      }
      a(arrayOfByte, paramArrayOfByte1);
      int k = paramArrayOfByte2.length - 1;
      i = paramArrayOfByte2[k];
      int j = 52 / (k + 1) + 6;
      int n;
      for (int m = 0; j > 0; m = n)
      {
        n = m - 1640531527;
        int i1 = n >>> 2 & 0x3;
        for (m = 0; m < k; m++)
        {
          i2 = paramArrayOfByte2[(m + 1)];
          int i3 = paramArrayOfByte2[m];
          i = ((i ^ paramArrayOfByte1[(m & 0x3 ^ i1)]) + (i2 ^ n) ^ (i >>> 5 ^ i2 << 2) + (i2 >>> 3 ^ i << 4)) + i3;
          paramArrayOfByte2[m] = i;
        }
        int i2 = paramArrayOfByte2[0];
        i = paramArrayOfByte2[k] + ((paramArrayOfByte1[(m & 0x3 ^ i1)] ^ i) + (i2 ^ n) ^ (i >>> 5 ^ i2 << 2) + (i2 >>> 3 ^ i << 4));
        paramArrayOfByte2[k] = i;
        j--;
      }
      paramArrayOfByte1 = new byte[paramArrayOfByte2.length << 2];
      a(paramArrayOfByte2, paramArrayOfByte2.length, paramArrayOfByte1);
      AppMethodBeat.o(114596);
    }
  }

  public static byte[] n(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(114597);
    byte[] arrayOfByte = cm(paramArrayOfByte2);
    if ((paramArrayOfByte1 == null) || (arrayOfByte == null) || (paramArrayOfByte1.length == 0))
      AppMethodBeat.o(114597);
    while (true)
    {
      return paramArrayOfByte1;
      if ((paramArrayOfByte1.length % 4 != 0) || (paramArrayOfByte1.length < 8))
      {
        paramArrayOfByte1 = null;
        AppMethodBeat.o(114597);
      }
      else
      {
        paramArrayOfByte2 = new int[paramArrayOfByte1.length >>> 2];
        a(paramArrayOfByte1, paramArrayOfByte2);
        if (arrayOfByte.length % 4 == 0);
        for (int i = arrayOfByte.length >>> 2; ; i = (arrayOfByte.length >>> 2) + 1)
        {
          j = i;
          if (i < 4)
            j = 4;
          paramArrayOfByte1 = new int[j];
          for (i = 0; i < j; i++)
            paramArrayOfByte1[i] = 0;
        }
        a(arrayOfByte, paramArrayOfByte1);
        int k = paramArrayOfByte2.length - 1;
        i = paramArrayOfByte2[0];
        int j = (52 / (k + 1) + 6) * -1640531527;
        while (j != 0)
        {
          int m = j >>> 2 & 0x3;
          for (int n = k; n > 0; n--)
          {
            i1 = paramArrayOfByte2[(n - 1)];
            i = paramArrayOfByte2[n] - ((i ^ j) + (i1 ^ paramArrayOfByte1[(n & 0x3 ^ m)]) ^ (i1 >>> 5 ^ i << 2) + (i >>> 3 ^ i1 << 4));
            paramArrayOfByte2[n] = i;
          }
          int i1 = paramArrayOfByte2[k];
          i = paramArrayOfByte2[0] - ((paramArrayOfByte1[(n & 0x3 ^ m)] ^ i1) + (i ^ j) ^ (i1 >>> 5 ^ i << 2) + (i >>> 3 ^ i1 << 4));
          paramArrayOfByte2[0] = i;
          j += 1640531527;
        }
        i = paramArrayOfByte2[k];
        if ((i < 0) || (i > paramArrayOfByte2.length - 1 << 2))
        {
          paramArrayOfByte1 = null;
          AppMethodBeat.o(114597);
        }
        else
        {
          paramArrayOfByte1 = new byte[i];
          a(paramArrayOfByte2, paramArrayOfByte2.length - 1, paramArrayOfByte1);
          AppMethodBeat.o(114597);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.d.f.c
 * JD-Core Version:    0.6.2
 */