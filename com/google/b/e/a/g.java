package com.google.b.e.a;

import com.google.b.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;

final class g
{
  private static final byte[] bBa;
  private static final byte[] bBb;
  private static final byte[] bBc;
  private static final byte[] bBd;
  private static final Charset bBe;

  static
  {
    int i = 0;
    AppMethodBeat.i(57338);
    bBa = new byte[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0 };
    bBb = new byte[] { 59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0 };
    bBc = new byte[''];
    bBd = new byte[''];
    bBe = Charset.forName("ISO-8859-1");
    Arrays.fill(bBc, (byte)-1);
    for (int j = 0; j < bBa.length; j++)
    {
      int k = bBa[j];
      if (k > 0)
        bBc[k] = ((byte)(byte)j);
    }
    Arrays.fill(bBd, (byte)-1);
    for (j = i; j < bBb.length; j++)
    {
      i = bBb[j];
      if (i > 0)
        bBd[i] = ((byte)(byte)j);
    }
    AppMethodBeat.o(57338);
  }

  private static int a(CharSequence paramCharSequence, int paramInt1, int paramInt2, StringBuilder paramStringBuilder, int paramInt3)
  {
    AppMethodBeat.i(57332);
    StringBuilder localStringBuilder = new StringBuilder(paramInt2);
    int i = 0;
    int j;
    label81: 
    do
    {
      j = paramCharSequence.charAt(paramInt1 + i);
      switch (paramInt3)
      {
      default:
        if (!l(j))
          break label519;
        localStringBuilder.append((char)bBd[j]);
        k = i + 1;
        i = k;
      case 0:
      case 1:
      case 2:
      }
    }
    while (k < paramInt2);
    int k = localStringBuilder.length();
    paramInt2 = 0;
    paramInt1 = 0;
    label108: if (paramInt1 < k)
    {
      if (paramInt1 % 2 != 0)
      {
        i = 1;
        label123: if (i == 0)
          break label539;
        j = (char)(paramInt2 * 30 + localStringBuilder.charAt(paramInt1));
        paramStringBuilder.append(j);
      }
      for (paramInt2 = j; ; paramInt2 = localStringBuilder.charAt(paramInt1))
      {
        paramInt1++;
        break label108;
        if (i(j))
        {
          if (j == 32)
          {
            localStringBuilder.append('\032');
            break label81;
          }
          localStringBuilder.append((char)(j - 65));
          break label81;
        }
        if (j(j))
        {
          localStringBuilder.append('\033');
          paramInt3 = 1;
          break;
        }
        if (k(j))
        {
          paramInt3 = 2;
          localStringBuilder.append('\034');
          break;
        }
        localStringBuilder.append('\035');
        localStringBuilder.append((char)bBd[j]);
        break label81;
        if (j(j))
        {
          if (j == 32)
          {
            localStringBuilder.append('\032');
            break label81;
          }
          localStringBuilder.append((char)(j - 97));
          break label81;
        }
        if (i(j))
        {
          localStringBuilder.append('\033');
          localStringBuilder.append((char)(j - 65));
          break label81;
        }
        if (k(j))
        {
          paramInt3 = 2;
          localStringBuilder.append('\034');
          break;
        }
        localStringBuilder.append('\035');
        localStringBuilder.append((char)bBd[j]);
        break label81;
        if (k(j))
        {
          localStringBuilder.append((char)bBc[j]);
          break label81;
        }
        if (i(j))
        {
          localStringBuilder.append('\034');
          paramInt3 = 0;
          break;
        }
        if (j(j))
        {
          localStringBuilder.append('\033');
          paramInt3 = 1;
          break;
        }
        if ((paramInt1 + i + 1 < paramInt2) && (l(paramCharSequence.charAt(paramInt1 + i + 1))))
        {
          paramInt3 = 3;
          localStringBuilder.append('\031');
          break;
        }
        localStringBuilder.append('\035');
        localStringBuilder.append((char)bBd[j]);
        break label81;
        localStringBuilder.append('\035');
        paramInt3 = 0;
        break;
        i = 0;
        break label123;
      }
    }
    label519: label539: if (k % 2 != 0)
      paramStringBuilder.append((char)(paramInt2 * 30 + 29));
    AppMethodBeat.o(57332);
    return paramInt3;
  }

  private static int a(String paramString, int paramInt, Charset paramCharset)
  {
    AppMethodBeat.i(57337);
    paramCharset = paramCharset.newEncoder();
    int i = paramString.length();
    int j = paramInt;
    char c2;
    if (j < i)
    {
      char c1 = paramString.charAt(j);
      int k = 0;
      for (c2 = c1; ; c2 = c1)
      {
        c1 = k;
        if (k >= 13)
          break;
        c1 = k;
        if (!isDigit(c2))
          break;
        k++;
        int m = j + k;
        c1 = k;
        if (m >= i)
          break;
        c1 = paramString.charAt(m);
      }
      if (c1 >= '\r')
      {
        paramInt = j - paramInt;
        AppMethodBeat.o(57337);
      }
    }
    while (true)
    {
      return paramInt;
      c2 = paramString.charAt(j);
      if (!paramCharset.canEncode(c2))
      {
        paramString = new h("Non-encodable character detected: " + c2 + " (Unicode: " + c2 + ')');
        AppMethodBeat.o(57337);
        throw paramString;
      }
      j++;
      break;
      paramInt = j - paramInt;
      AppMethodBeat.o(57337);
    }
  }

  static String a(String paramString, c paramc, Charset paramCharset)
  {
    AppMethodBeat.i(57331);
    StringBuilder localStringBuilder = new StringBuilder(paramString.length());
    Charset localCharset;
    int i;
    if (paramCharset == null)
    {
      localCharset = bBe;
      i = paramString.length();
      if (paramc != c.bAO)
        break label239;
      a(paramString, 0, i, localStringBuilder, 0);
    }
    while (true)
    {
      paramString = localStringBuilder.toString();
      AppMethodBeat.o(57331);
      return paramString;
      localCharset = paramCharset;
      if (bBe.equals(paramCharset))
        break;
      com.google.b.b.c localc = com.google.b.b.c.bh(paramCharset.name());
      localCharset = paramCharset;
      if (localc == null)
        break;
      j = localc.bzj[0];
      if ((j >= 0) && (j < 900))
      {
        localStringBuilder.append('Ο');
        localStringBuilder.append((char)j);
        localCharset = paramCharset;
        break;
      }
      if (j < 810900)
      {
        localStringBuilder.append('Ξ');
        localStringBuilder.append((char)(j / 900 - 1));
        localStringBuilder.append((char)(j % 900));
        localCharset = paramCharset;
        break;
      }
      if (j < 811800)
      {
        localStringBuilder.append('Ν');
        localStringBuilder.append((char)(810900 - j));
        localCharset = paramCharset;
        break;
      }
      paramString = new h("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(j)));
      AppMethodBeat.o(57331);
      throw paramString;
      label239: if (paramc == c.bAP)
      {
        paramString = paramString.getBytes(localCharset);
        a(paramString, paramString.length, 1, localStringBuilder);
      }
      else
      {
        if (paramc != c.bAQ)
          break label290;
        localStringBuilder.append('Ά');
        a(paramString, 0, i, localStringBuilder);
      }
    }
    label290: int j = 0;
    int k = 0;
    int m = 0;
    label299: int n;
    while (k < i)
    {
      n = f(paramString, k);
      if (n >= 13)
      {
        localStringBuilder.append('Ά');
        m = 2;
        a(paramString, k, n, localStringBuilder);
        j = 0;
        k = n + k;
      }
      else
      {
        int i1 = g(paramString, k);
        if ((i1 >= 5) || (n == i))
        {
          n = m;
          if (m != 0)
          {
            localStringBuilder.append('΄');
            j = 0;
            n = 0;
          }
          j = a(paramString, k, i1, localStringBuilder, j);
          k += i1;
          m = n;
        }
        else
        {
          i1 = a(paramString, k, localCharset);
          n = i1;
          if (i1 == 0)
            n = 1;
          paramc = paramString.substring(k, k + n).getBytes(localCharset);
          if ((paramc.length != 1) || (m != 0))
            break label492;
          a(paramc, 1, 0, localStringBuilder);
        }
      }
    }
    while (true)
    {
      k = n + k;
      break label299;
      break;
      label492: a(paramc, paramc.length, m, localStringBuilder);
      j = 0;
      m = 1;
    }
  }

  private static void a(String paramString, int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(57334);
    StringBuilder localStringBuilder = new StringBuilder(paramInt2 / 3 + 1);
    BigInteger localBigInteger1 = BigInteger.valueOf(900L);
    BigInteger localBigInteger2 = BigInteger.valueOf(0L);
    int i = 0;
    while (i < paramInt2)
    {
      localStringBuilder.setLength(0);
      int j = Math.min(44, paramInt2 - i);
      Object localObject = new BigInteger("1" + paramString.substring(paramInt1 + i, paramInt1 + i + j));
      BigInteger localBigInteger3;
      do
      {
        localStringBuilder.append((char)((BigInteger)localObject).mod(localBigInteger1).intValue());
        localBigInteger3 = ((BigInteger)localObject).divide(localBigInteger1);
        localObject = localBigInteger3;
      }
      while (!localBigInteger3.equals(localBigInteger2));
      for (int k = localStringBuilder.length() - 1; k >= 0; k--)
        paramStringBuilder.append(localStringBuilder.charAt(k));
      i += j;
    }
    AppMethodBeat.o(57334);
  }

  private static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(57333);
    int i;
    char[] arrayOfChar;
    if ((paramInt1 == 1) && (paramInt2 == 0))
    {
      paramStringBuilder.append('Α');
      i = 0;
      paramInt2 = 0;
      if (paramInt1 >= 6)
        arrayOfChar = new char[5];
    }
    else
    {
      while (true)
      {
        i = paramInt2;
        if (paramInt1 + 0 - paramInt2 < 6)
          break label186;
        long l = 0L;
        i = 0;
        while (true)
          if (i < 6)
          {
            l = (l << 8) + (paramArrayOfByte[(paramInt2 + i)] & 0xFF);
            i++;
            continue;
            if (paramInt1 % 6 == 0)
            {
              paramStringBuilder.append('Μ');
              break;
            }
            paramStringBuilder.append('΅');
            break;
          }
        for (i = 0; i < 5; i++)
        {
          arrayOfChar[i] = ((char)(char)(int)(l % 900L));
          l /= 900L;
        }
        for (i = 4; i >= 0; i--)
          paramStringBuilder.append(arrayOfChar[i]);
        paramInt2 += 6;
      }
    }
    label186: 
    while (i < paramInt1 + 0)
    {
      paramStringBuilder.append((char)(paramArrayOfByte[i] & 0xFF));
      i++;
    }
    AppMethodBeat.o(57333);
  }

  private static int f(CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(57335);
    int i = 0;
    int j = 0;
    int k = paramCharSequence.length();
    if (paramInt < k)
    {
      i = paramCharSequence.charAt(paramInt);
      int m = paramInt;
      int n = i;
      paramInt = j;
      while (true)
      {
        i = paramInt;
        if (!isDigit(n))
          break;
        i = paramInt;
        if (m >= k)
          break;
        i = paramInt + 1;
        j = m + 1;
        paramInt = i;
        m = j;
        if (j < k)
        {
          m = paramCharSequence.charAt(j);
          paramInt = i;
          int i1 = m;
          m = j;
        }
      }
    }
    AppMethodBeat.o(57335);
    return i;
  }

  private static int g(CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(57336);
    int i = paramCharSequence.length();
    int j = paramInt;
    int k = j;
    int m;
    if (j < i)
    {
      m = paramCharSequence.charAt(j);
      k = 0;
      int n = m;
      m = j;
      while ((k < 13) && (isDigit(n)) && (m < i))
      {
        int i1 = k + 1;
        j = m + 1;
        m = j;
        k = i1;
        if (j < i)
        {
          int i2 = paramCharSequence.charAt(j);
          m = j;
          k = i1;
          n = i2;
        }
      }
      if (k >= 13)
      {
        paramInt = m - paramInt - k;
        AppMethodBeat.o(57336);
      }
    }
    while (true)
    {
      return paramInt;
      j = m;
      if (k > 0)
        break;
      j = paramCharSequence.charAt(m);
      if ((j == 9) || (j == 10) || (j == 13) || ((j >= 32) && (j <= 126)));
      for (j = 1; ; j = 0)
      {
        k = m;
        if (j == 0)
          break label202;
        j = m + 1;
        break;
      }
      label202: paramInt = k - paramInt;
      AppMethodBeat.o(57336);
    }
  }

  private static boolean i(char paramChar)
  {
    if ((paramChar == ' ') || ((paramChar >= 'A') && (paramChar <= 'Z')));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean isDigit(char paramChar)
  {
    if ((paramChar >= '0') && (paramChar <= '9'));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean j(char paramChar)
  {
    if ((paramChar == ' ') || ((paramChar >= 'a') && (paramChar <= 'z')));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean k(char paramChar)
  {
    if (bBc[paramChar] != -1);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean l(char paramChar)
  {
    if (bBd[paramChar] != -1);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.b.e.a.g
 * JD-Core Version:    0.6.2
 */