package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public final class et
{
  private static byte[] a = { -128, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
  private long[] b;
  private long[] c;
  private byte[] d;
  private byte[] e;

  public et()
  {
    AppMethodBeat.i(98828);
    this.b = new long[4];
    this.c = new long[2];
    this.d = new byte[64];
    this.e = new byte[16];
    a();
    AppMethodBeat.o(98828);
  }

  private long a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
  {
    paramLong1 = (paramLong2 & paramLong3 | (0xFFFFFFFF ^ paramLong2) & paramLong4) + paramLong5 + paramLong7 + paramLong1;
    int i = (int)paramLong1;
    int j = (int)paramLong6;
    return ((int)paramLong1 >>> (int)(32L - paramLong6) | i << j) + paramLong2;
  }

  public static String a(String paramString)
  {
    AppMethodBeat.i(98832);
    try
    {
      Object localObject = paramString.getBytes("ISO8859_1");
      paramString = (String)localObject;
      localObject = new et();
      ((et)localObject).a();
      ((et)localObject).a(new ByteArrayInputStream(paramString), paramString.length);
      paramString = new byte[8];
      a(paramString, ((et)localObject).c, 8);
      i = (int)(localObject.c[0] >>> 3) & 0x3F;
      if (i < 56)
      {
        i = 56 - i;
        ((et)localObject).a(a, i);
        ((et)localObject).a(paramString, 8);
        a(((et)localObject).e, ((et)localObject).b, 16);
        localObject = ((et)localObject).e;
        localStringBuilder = new StringBuilder();
        for (i = 0; i < 16; i++)
        {
          int j = localObject[i];
          paramString = new char[16];
          paramString[0] = 48;
          paramString[1] = 49;
          paramString[2] = 50;
          paramString[3] = 51;
          paramString[4] = 52;
          paramString[5] = 53;
          paramString[6] = 54;
          paramString[7] = 55;
          paramString[8] = 56;
          paramString[9] = 57;
          paramString[10] = 65;
          paramString[11] = 66;
          paramString[12] = 67;
          paramString[13] = 68;
          paramString[14] = 69;
          paramString[15] = 70;
          paramString;
          localStringBuilder.append(new String(new char[] { paramString[(j >>> 4 & 0xF)], paramString[(j & 0xF)] }));
        }
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      StringBuilder localStringBuilder;
      while (true)
      {
        paramString = paramString.getBytes();
        continue;
        int i = 120 - i;
      }
      paramString = localStringBuilder.toString();
      AppMethodBeat.o(98832);
    }
    return paramString;
  }

  private void a()
  {
    this.c[0] = 0L;
    this.c[1] = 0L;
    this.b[0] = 1732584193L;
    this.b[1] = 4023233417L;
    this.b[2] = 2562383102L;
    this.b[3] = 271733878L;
  }

  private void a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(98831);
    long l1 = this.b[0];
    long l2 = this.b[1];
    long l3 = this.b[2];
    long l4 = this.b[3];
    long[] arrayOfLong = new long[16];
    int i = 0;
    int j = 0;
    if (i < 64)
    {
      int k = paramArrayOfByte[i];
      if (k < 0)
      {
        l5 = k & 0xFF;
        label75: k = paramArrayOfByte[(i + 1)];
        if (k >= 0)
          break label183;
        l6 = k & 0xFF;
        label97: k = paramArrayOfByte[(i + 2)];
        if (k >= 0)
          break label191;
        l7 = k & 0xFF;
        label119: k = paramArrayOfByte[(i + 3)];
        if (k >= 0)
          break label199;
      }
      label183: label191: label199: for (l8 = k & 0xFF; ; l8 = k)
      {
        arrayOfLong[j] = (l8 << 24 | (l6 << 8 | l5 | l7 << 16));
        i += 4;
        j++;
        break;
        l5 = k;
        break label75;
        l6 = k;
        break label97;
        l7 = k;
        break label119;
      }
    }
    long l5 = a(l1, l2, l3, l4, arrayOfLong[0], 7L, 3614090360L);
    long l6 = a(l4, l5, l2, l3, arrayOfLong[1], 12L, 3905402710L);
    long l7 = a(l3, l6, l5, l2, arrayOfLong[2], 17L, 606105819L);
    long l8 = a(l2, l7, l6, l5, arrayOfLong[3], 22L, 3250441966L);
    l2 = a(l5, l8, l7, l6, arrayOfLong[4], 7L, 4118548399L);
    l6 = a(l6, l2, l8, l7, arrayOfLong[5], 12L, 1200080426L);
    l7 = a(l7, l6, l2, l8, arrayOfLong[6], 17L, 2821735955L);
    l5 = a(l8, l7, l6, l2, arrayOfLong[7], 22L, 4249261313L);
    l8 = a(l2, l5, l7, l6, arrayOfLong[8], 7L, 1770035416L);
    l2 = a(l6, l8, l5, l7, arrayOfLong[9], 12L, 2336552879L);
    l6 = a(l7, l2, l8, l5, arrayOfLong[10], 17L, 4294925233L);
    l3 = a(l5, l6, l2, l8, arrayOfLong[11], 22L, 2304563134L);
    l7 = a(l8, l3, l6, l2, arrayOfLong[12], 7L, 1804603682L);
    l5 = a(l2, l7, l3, l6, arrayOfLong[13], 12L, 4254626195L);
    l8 = a(l6, l5, l7, l3, arrayOfLong[14], 17L, 2792965006L);
    l6 = a(l3, l8, l5, l7, arrayOfLong[15], 22L, 1236535329L);
    l7 = b(l7, l6, l8, l5, arrayOfLong[1], 5L, 4129170786L);
    l5 = b(l5, l7, l6, l8, arrayOfLong[6], 9L, 3225465664L);
    l8 = b(l8, l5, l7, l6, arrayOfLong[11], 14L, 643717713L);
    l6 = b(l6, l8, l5, l7, arrayOfLong[0], 20L, 3921069994L);
    l7 = b(l7, l6, l8, l5, arrayOfLong[5], 5L, 3593408605L);
    l5 = b(l5, l7, l6, l8, arrayOfLong[10], 9L, 38016083L);
    l8 = b(l8, l5, l7, l6, arrayOfLong[15], 14L, 3634488961L);
    l6 = b(l6, l8, l5, l7, arrayOfLong[4], 20L, 3889429448L);
    l7 = b(l7, l6, l8, l5, arrayOfLong[9], 5L, 568446438L);
    l5 = b(l5, l7, l6, l8, arrayOfLong[14], 9L, 3275163606L);
    l8 = b(l8, l5, l7, l6, arrayOfLong[3], 14L, 4107603335L);
    l6 = b(l6, l8, l5, l7, arrayOfLong[8], 20L, 1163531501L);
    l2 = b(l7, l6, l8, l5, arrayOfLong[13], 5L, 2850285829L);
    l7 = b(l5, l2, l6, l8, arrayOfLong[2], 9L, 4243563512L);
    l5 = b(l8, l7, l2, l6, arrayOfLong[7], 14L, 1735328473L);
    l6 = b(l6, l5, l7, l2, arrayOfLong[12], 20L, 2368359562L);
    l2 = c(l2, l6, l5, l7, arrayOfLong[5], 4L, 4294588738L);
    l7 = c(l7, l2, l6, l5, arrayOfLong[8], 11L, 2272392833L);
    l8 = c(l5, l7, l2, l6, arrayOfLong[11], 16L, 1839030562L);
    l5 = c(l6, l8, l7, l2, arrayOfLong[14], 23L, 4259657740L);
    l6 = c(l2, l5, l8, l7, arrayOfLong[1], 4L, 2763975236L);
    l7 = c(l7, l6, l5, l8, arrayOfLong[4], 11L, 1272893353L);
    l8 = c(l8, l7, l6, l5, arrayOfLong[7], 16L, 4139469664L);
    l5 = c(l5, l8, l7, l6, arrayOfLong[10], 23L, 3200236656L);
    l2 = c(l6, l5, l8, l7, arrayOfLong[13], 4L, 681279174L);
    l6 = c(l7, l2, l5, l8, arrayOfLong[0], 11L, 3936430074L);
    l8 = c(l8, l6, l2, l5, arrayOfLong[3], 16L, 3572445317L);
    l3 = c(l5, l8, l6, l2, arrayOfLong[6], 23L, 76029189L);
    l5 = c(l2, l3, l8, l6, arrayOfLong[9], 4L, 3654602809L);
    l7 = c(l6, l5, l3, l8, arrayOfLong[12], 11L, 3873151461L);
    l6 = c(l8, l7, l5, l3, arrayOfLong[15], 16L, 530742520L);
    l8 = c(l3, l6, l7, l5, arrayOfLong[2], 23L, 3299628645L);
    l3 = d(l5, l8, l6, l7, arrayOfLong[0], 6L, 4096336452L);
    l2 = d(l7, l3, l8, l6, arrayOfLong[7], 10L, 1126891415L);
    l6 = d(l6, l2, l3, l8, arrayOfLong[14], 15L, 2878612391L);
    l5 = d(l8, l6, l2, l3, arrayOfLong[5], 21L, 4237533241L);
    l7 = d(l3, l5, l6, l2, arrayOfLong[12], 6L, 1700485571L);
    l8 = d(l2, l7, l5, l6, arrayOfLong[3], 10L, 2399980690L);
    l6 = d(l6, l8, l7, l5, arrayOfLong[10], 15L, 4293915773L);
    l5 = d(l5, l6, l8, l7, arrayOfLong[1], 21L, 2240044497L);
    l7 = d(l7, l5, l6, l8, arrayOfLong[8], 6L, 1873313359L);
    l8 = d(l8, l7, l5, l6, arrayOfLong[15], 10L, 4264355552L);
    l2 = d(l6, l8, l7, l5, arrayOfLong[6], 15L, 2734768916L);
    l6 = d(l5, l2, l8, l7, arrayOfLong[13], 21L, 1309151649L);
    l5 = d(l7, l6, l2, l8, arrayOfLong[4], 6L, 4149444226L);
    l7 = d(l8, l5, l6, l2, arrayOfLong[11], 10L, 3174756917L);
    l8 = d(l2, l7, l5, l6, arrayOfLong[2], 15L, 718787259L);
    l6 = d(l6, l8, l7, l5, arrayOfLong[9], 21L, 3951481745L);
    paramArrayOfByte = this.b;
    paramArrayOfByte[0] += l5;
    paramArrayOfByte = this.b;
    paramArrayOfByte[1] = (l6 + paramArrayOfByte[1]);
    paramArrayOfByte = this.b;
    paramArrayOfByte[2] += l8;
    paramArrayOfByte = this.b;
    paramArrayOfByte[3] += l7;
    AppMethodBeat.o(98831);
  }

  private void a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(98830);
    byte[] arrayOfByte = new byte[64];
    int j = (int)(this.c[0] >>> 3) & 0x3F;
    Object localObject = this.c;
    long l = localObject[0] + (paramInt << 3);
    localObject[0] = l;
    if (l < paramInt << 3)
    {
      localObject = this.c;
      localObject[1] += 1L;
    }
    localObject = this.c;
    localObject[1] += (paramInt >>> 29);
    int k = 64 - j;
    int m;
    if (paramInt >= k)
    {
      localObject = this.d;
      for (m = 0; m < k; m++)
        localObject[(j + m)] = ((byte)paramArrayOfByte[(m + 0)]);
      a(this.d);
      for (m = k; m + 63 < paramInt; m += 64)
      {
        for (j = 0; j < 64; j++)
          arrayOfByte[(j + 0)] = ((byte)paramArrayOfByte[(m + j)]);
        a(arrayOfByte);
      }
      j = 0;
    }
    while (true)
    {
      arrayOfByte = this.d;
      while (i < paramInt - m)
      {
        arrayOfByte[(j + i)] = ((byte)paramArrayOfByte[(m + i)]);
        i++;
      }
      m = 0;
    }
    AppMethodBeat.o(98830);
  }

  private static void a(byte[] paramArrayOfByte, long[] paramArrayOfLong, int paramInt)
  {
    int i = 0;
    for (int j = 0; i < paramInt; j++)
    {
      paramArrayOfByte[i] = ((byte)(byte)(int)(paramArrayOfLong[j] & 0xFF));
      paramArrayOfByte[(i + 1)] = ((byte)(byte)(int)(paramArrayOfLong[j] >>> 8 & 0xFF));
      paramArrayOfByte[(i + 2)] = ((byte)(byte)(int)(paramArrayOfLong[j] >>> 16 & 0xFF));
      paramArrayOfByte[(i + 3)] = ((byte)(byte)(int)(paramArrayOfLong[j] >>> 24 & 0xFF));
      i += 4;
    }
  }

  private boolean a(InputStream paramInputStream, long paramLong)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(98829);
    byte[] arrayOfByte1 = new byte[64];
    int j = (int)(this.c[0] >>> 3) & 0x3F;
    Object localObject = this.c;
    long l = localObject[0] + (paramLong << 3);
    localObject[0] = l;
    if (l < paramLong << 3)
    {
      localObject = this.c;
      localObject[1] += 1L;
    }
    localObject = this.c;
    localObject[1] += (paramLong >>> 29);
    int k = 64 - j;
    int m;
    if (paramLong >= k)
    {
      byte[] arrayOfByte2 = new byte[k];
      try
      {
        paramInputStream.read(arrayOfByte2, 0, k);
        localObject = this.d;
        for (m = 0; m < k; m++)
          localObject[(j + m)] = ((byte)arrayOfByte2[(m + 0)]);
      }
      catch (Exception paramInputStream)
      {
        AppMethodBeat.o(98829);
      }
    }
    while (true)
    {
      return bool;
      a(this.d);
      m = k;
      while (true)
      {
        if (m + 63 >= paramLong)
          break label229;
        try
        {
          paramInputStream.read(arrayOfByte1);
          a(arrayOfByte1);
          m += 64;
        }
        catch (Exception paramInputStream)
        {
          AppMethodBeat.o(98829);
        }
      }
      continue;
      label229: j = 0;
      while (true)
      {
        arrayOfByte1 = new byte[(int)(paramLong - m)];
        try
        {
          paramInputStream.read(arrayOfByte1);
          paramInputStream = this.d;
          k = arrayOfByte1.length;
          for (m = i; m < k; m++)
            paramInputStream[(j + m)] = ((byte)arrayOfByte1[(m + 0)]);
          m = 0;
        }
        catch (Exception paramInputStream)
        {
          AppMethodBeat.o(98829);
        }
      }
      continue;
      AppMethodBeat.o(98829);
      bool = true;
    }
  }

  private long b(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
  {
    paramLong1 = (paramLong2 & paramLong4 | (0xFFFFFFFF ^ paramLong4) & paramLong3) + paramLong5 + paramLong7 + paramLong1;
    int i = (int)paramLong1;
    int j = (int)paramLong6;
    return ((int)paramLong1 >>> (int)(32L - paramLong6) | i << j) + paramLong2;
  }

  private long c(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
  {
    paramLong1 = (paramLong2 ^ paramLong3 ^ paramLong4) + paramLong5 + paramLong7 + paramLong1;
    int i = (int)paramLong1;
    int j = (int)paramLong6;
    return ((int)paramLong1 >>> (int)(32L - paramLong6) | i << j) + paramLong2;
  }

  private long d(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
  {
    paramLong1 = ((0xFFFFFFFF ^ paramLong4 | paramLong2) ^ paramLong3) + paramLong5 + paramLong7 + paramLong1;
    int i = (int)paramLong1;
    int j = (int)paramLong6;
    return ((int)paramLong1 >>> (int)(32L - paramLong6) | i << j) + paramLong2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.et
 * JD-Core Version:    0.6.2
 */