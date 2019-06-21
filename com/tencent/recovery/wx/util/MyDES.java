package com.tencent.recovery.wx.util;

public class MyDES
{
  public static char a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong, int paramInt, byte[] paramArrayOfByte3)
  {
    paramArrayOfByte1 = new MyByteArray(paramArrayOfByte1);
    MyByteArray localMyByteArray1 = new MyByteArray(paramArrayOfByte2);
    MyByteArray[] arrayOfMyByteArray = new MyByteArray[16];
    for (int i = 0; i < 16; i++)
      arrayOfMyByteArray[i] = new MyByteArray(new byte[48]);
    MyByteArray localMyByteArray2 = new MyByteArray(new byte[256]);
    MyByteArray localMyByteArray3 = new MyByteArray(new byte[24]);
    MyByteArray localMyByteArray4 = new MyByteArray(new byte[64]);
    MyByteArray localMyByteArray5 = new MyByteArray();
    MyByteArray localMyByteArray6 = new MyByteArray();
    MyByteArray localMyByteArray7 = new MyByteArray();
    MyByteArray localMyByteArray8 = new MyByteArray();
    paramArrayOfByte2 = new MyByteArray(new byte[64]);
    MyByteArray localMyByteArray9 = new MyByteArray(new byte[48]);
    MyByteArray localMyByteArray10 = new MyByteArray(new byte[32]);
    MyByteArray localMyByteArray11 = new MyByteArray(new byte[9]);
    MyByteArray localMyByteArray12 = new MyByteArray(new byte[8]);
    long l;
    if ((paramArrayOfByte3 != null) && (paramArrayOfByte3.length > 0))
    {
      l = 7L + paramLong & 0xFFFFFFF8;
      if (l != 0L);
    }
    else
    {
      paramInt = 0;
    }
    int k;
    for (int j = paramInt; ; k = paramInt)
    {
      return j;
      localMyByteArray5.ccb = 0;
      localMyByteArray5.cca = localMyByteArray4.cca;
      localMyByteArray6.ccb = 28;
      localMyByteArray6.cca = localMyByteArray4.cca;
      localMyByteArray7.ccb = 0;
      localMyByteArray7.cca = paramArrayOfByte2.cca;
      localMyByteArray8.ccb = 32;
      localMyByteArray8.cca = paramArrayOfByte2.cca;
      a(localMyByteArray3, 24);
      paramArrayOfByte3 = new MyByteArray(paramArrayOfByte3);
      i = paramInt;
      if (paramInt > 24)
        i = 24;
      d(localMyByteArray3, paramArrayOfByte3, i);
      paramArrayOfByte3 = new byte[16];
      byte[] tmp351_349 = paramArrayOfByte3;
      tmp351_349[0] = 1;
      byte[] tmp356_351 = tmp351_349;
      tmp356_351[1] = 1;
      byte[] tmp361_356 = tmp356_351;
      tmp361_356[2] = 2;
      byte[] tmp366_361 = tmp361_356;
      tmp366_361[3] = 2;
      byte[] tmp371_366 = tmp366_361;
      tmp371_366[4] = 2;
      byte[] tmp376_371 = tmp371_366;
      tmp376_371[5] = 2;
      byte[] tmp381_376 = tmp376_371;
      tmp381_376[6] = 2;
      byte[] tmp387_381 = tmp381_376;
      tmp387_381[7] = 2;
      byte[] tmp393_387 = tmp387_381;
      tmp393_387[8] = 1;
      byte[] tmp399_393 = tmp393_387;
      tmp399_393[9] = 2;
      byte[] tmp405_399 = tmp399_393;
      tmp405_399[10] = 2;
      byte[] tmp411_405 = tmp405_399;
      tmp411_405[11] = 2;
      byte[] tmp417_411 = tmp411_405;
      tmp417_411[12] = 2;
      byte[] tmp423_417 = tmp417_411;
      tmp423_417[13] = 2;
      byte[] tmp429_423 = tmp423_417;
      tmp429_423[14] = 2;
      byte[] tmp435_429 = tmp429_423;
      tmp435_429[15] = 1;
      tmp435_429;
      b(localMyByteArray4, localMyByteArray3, 64);
      a(localMyByteArray4, localMyByteArray4, new byte[] { 57, 49, 41, 33, 25, 17, 9, 1, 58, 50, 42, 34, 26, 18, 10, 2, 59, 51, 43, 35, 27, 19, 11, 3, 60, 52, 44, 36, 63, 55, 47, 39, 31, 23, 15, 7, 62, 54, 46, 38, 30, 22, 14, 6, 61, 53, 45, 37, 29, 21, 13, 5, 28, 20, 12, 4 }, 56, localMyByteArray2);
      for (paramInt = 0; paramInt < 16; paramInt++)
      {
        c(localMyByteArray5, localMyByteArray2, paramArrayOfByte3[paramInt]);
        c(localMyByteArray6, localMyByteArray2, paramArrayOfByte3[paramInt]);
        a(arrayOfMyByteArray[paramInt], localMyByteArray4, new byte[] { 14, 17, 11, 24, 1, 5, 3, 28, 15, 6, 21, 10, 23, 19, 12, 4, 26, 8, 16, 7, 27, 20, 13, 2, 41, 52, 31, 37, 47, 55, 30, 40, 51, 45, 33, 48, 44, 49, 39, 56, 34, 53, 46, 42, 50, 36, 29, 32 }, 48, localMyByteArray2);
      }
      i = localMyByteArray1.ccb;
      int m = paramArrayOfByte1.ccb;
      a(paramArrayOfByte1, localMyByteArray11, arrayOfMyByteArray, paramArrayOfByte2, localMyByteArray9, localMyByteArray10, localMyByteArray7, localMyByteArray8, localMyByteArray2);
      d(localMyByteArray12, paramArrayOfByte1, 8);
      paramArrayOfByte1.ccb += 8;
      paramLong = 0L;
      while (paramLong < l >> 3)
      {
        for (paramInt = 0; paramInt < 8; paramInt++)
          localMyByteArray12.cca[(localMyByteArray12.ccb + paramInt)] = ((byte)(byte)(localMyByteArray12.cca[(localMyByteArray12.ccb + paramInt)] ^ localMyByteArray1.cca[(localMyByteArray1.ccb + paramInt)]));
        a(paramArrayOfByte1, localMyByteArray12, arrayOfMyByteArray, paramArrayOfByte2, localMyByteArray9, localMyByteArray10, localMyByteArray7, localMyByteArray8, localMyByteArray2);
        d(localMyByteArray12, paramArrayOfByte1, 8);
        paramLong += 1L;
        paramArrayOfByte1.ccb += 8;
        localMyByteArray1.ccb += 8;
      }
      localMyByteArray1.ccb = i;
      paramArrayOfByte1.ccb = m;
      paramInt = 1;
    }
  }

  private static void a(MyByteArray paramMyByteArray, int paramInt)
  {
    for (int i = 0; i < paramInt; i++)
      paramMyByteArray.cca[(paramMyByteArray.ccb + i)] = ((byte)0);
  }

  private static void a(MyByteArray paramMyByteArray1, MyByteArray paramMyByteArray2, int paramInt)
  {
    for (int i = 0; i < paramInt; i++)
    {
      byte[] arrayOfByte = paramMyByteArray1.cca;
      int j = paramMyByteArray1.ccb + i;
      arrayOfByte[j] = ((byte)(byte)(arrayOfByte[j] ^ paramMyByteArray2.cca[(paramMyByteArray2.ccb + i)]));
    }
  }

  private static void a(MyByteArray paramMyByteArray1, MyByteArray paramMyByteArray2, byte[] paramArrayOfByte, int paramInt, MyByteArray paramMyByteArray3)
  {
    for (int i = 0; i < paramInt; i++)
      paramMyByteArray3.cca[(paramMyByteArray3.ccb + i)] = ((byte)paramMyByteArray2.cca[(paramMyByteArray2.ccb + paramArrayOfByte[i] - 1)]);
    d(paramMyByteArray1, paramMyByteArray3, paramInt);
  }

  private static void a(MyByteArray paramMyByteArray1, MyByteArray paramMyByteArray2, MyByteArray[] paramArrayOfMyByteArray, MyByteArray paramMyByteArray3, MyByteArray paramMyByteArray4, MyByteArray paramMyByteArray5, MyByteArray paramMyByteArray6, MyByteArray paramMyByteArray7, MyByteArray paramMyByteArray8)
  {
    b(paramMyByteArray3, paramMyByteArray2, 64);
    a(paramMyByteArray3, paramMyByteArray3, new byte[] { 58, 50, 42, 34, 26, 18, 10, 2, 60, 52, 44, 36, 28, 20, 12, 4, 62, 54, 46, 38, 30, 22, 14, 6, 64, 56, 48, 40, 32, 24, 16, 8, 57, 49, 41, 33, 25, 17, 9, 1, 59, 51, 43, 35, 27, 19, 11, 3, 61, 53, 45, 37, 29, 21, 13, 5, 63, 55, 47, 39, 31, 23, 15, 7 }, 64, paramMyByteArray8);
    int m;
    for (int i = 0; i < 16; i++)
    {
      d(paramMyByteArray5, paramMyByteArray7, 32);
      paramMyByteArray2 = paramArrayOfMyByteArray[i];
      a(paramMyByteArray4, paramMyByteArray7, new byte[] { 32, 1, 2, 3, 4, 5, 4, 5, 6, 7, 8, 9, 8, 9, 10, 11, 12, 13, 12, 13, 14, 15, 16, 17, 16, 17, 18, 19, 20, 21, 20, 21, 22, 23, 24, 25, 24, 25, 26, 27, 28, 29, 28, 29, 30, 31, 32, 1 }, 48, paramMyByteArray8);
      a(paramMyByteArray4, paramMyByteArray2, 48);
      paramMyByteArray2 = new byte[][] { { 14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7 }, { 0, 15, 7, 4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8 }, { 4, 1, 14, 8, 13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0 }, { 15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13 } };
      byte[][] arrayOfByte1 = { { 15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, 13, 12, 0, 5, 10 }, { 3, 13, 4, 7, 15, 2, 8, 14, 12, 0, 1, 10, 6, 9, 11, 5 }, { 0, 14, 7, 11, 10, 4, 13, 1, 5, 8, 12, 6, 9, 3, 2, 15 }, { 13, 8, 10, 1, 3, 15, 4, 2, 11, 6, 7, 12, 0, 5, 14, 9 } };
      byte[] arrayOfByte2 = { 10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8 };
      byte[] arrayOfByte3 = { 13, 6, 4, 9, 8, 15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7 };
      byte[] arrayOfByte4 = { 1, 10, 13, 0, 6, 9, 8, 7, 4, 15, 14, 3, 11, 5, 2, 12 };
      Object localObject1 = { 7, 13, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15 };
      Object localObject2 = { 3, 15, 0, 6, 10, 1, 13, 8, 9, 4, 5, 11, 12, 7, 2, 14 };
      localObject1 = new byte[][] { localObject1, { 13, 8, 11, 5, 6, 15, 0, 3, 4, 7, 2, 12, 1, 10, 14, 9 }, { 10, 6, 9, 0, 12, 11, 7, 13, 15, 1, 3, 14, 5, 2, 8, 4 }, localObject2 };
      localObject2 = new byte[][] { { 2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, 13, 0, 14, 9 }, { 14, 11, 2, 12, 4, 7, 13, 1, 5, 0, 15, 10, 3, 9, 8, 6 }, { 4, 2, 1, 11, 10, 13, 7, 8, 15, 9, 12, 5, 6, 3, 0, 14 }, { 11, 8, 12, 7, 1, 14, 2, 13, 6, 15, 0, 9, 10, 4, 5, 3 } };
      byte[][] arrayOfByte5 = { { 12, 1, 10, 15, 9, 2, 6, 8, 0, 13, 3, 4, 14, 7, 5, 11 }, { 10, 15, 4, 2, 7, 12, 9, 5, 6, 1, 13, 14, 0, 11, 3, 8 }, { 9, 14, 15, 5, 2, 8, 12, 3, 7, 0, 4, 10, 1, 13, 11, 6 }, { 4, 3, 2, 12, 9, 5, 15, 10, 11, 14, 1, 7, 6, 0, 8, 13 } };
      byte[] arrayOfByte6 = { 6, 11, 13, 8, 1, 4, 10, 7, 9, 5, 0, 15, 14, 2, 3, 12 };
      byte[] arrayOfByte7 = { 13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7 };
      byte[] arrayOfByte8 = { 1, 15, 13, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2 };
      byte[] arrayOfByte9 = { 7, 11, 4, 1, 9, 12, 14, 2, 0, 6, 10, 13, 15, 3, 5, 8 };
      byte[] arrayOfByte10 = { 2, 1, 14, 7, 4, 10, 8, 13, 15, 12, 9, 0, 3, 5, 6, 11 };
      int j = paramMyByteArray4.ccb;
      int k = paramMyByteArray7.ccb;
      m = 0;
      while (m < 8)
      {
        int n = (byte)((paramMyByteArray4.cca[(paramMyByteArray4.ccb + 0)] << 1) + paramMyByteArray4.cca[(paramMyByteArray4.ccb + 5)]);
        int i1 = (byte)((paramMyByteArray4.cca[(paramMyByteArray4.ccb + 1)] << 3) + (paramMyByteArray4.cca[(paramMyByteArray4.ccb + 2)] << 2) + (paramMyByteArray4.cca[(paramMyByteArray4.ccb + 3)] << 1) + paramMyByteArray4.cca[(paramMyByteArray4.ccb + 4)]);
        b(paramMyByteArray7, new MyByteArray(new byte[][][] { paramMyByteArray2, arrayOfByte1, { arrayOfByte2, { 13, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1 }, arrayOfByte3, arrayOfByte4 }, localObject1, localObject2, arrayOfByte5, { { 4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1 }, { 13, 0, 11, 7, 4, 9, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6 }, { 1, 4, 11, 13, 12, 3, 7, 14, 10, 15, 6, 8, 0, 5, 9, 2 }, arrayOfByte6 }, { arrayOfByte7, arrayOfByte8, arrayOfByte9, arrayOfByte10 } }[m][n][i1]), 4);
        m = (byte)(m + 1);
        paramMyByteArray4.ccb += 6;
        paramMyByteArray7.ccb += 4;
      }
      paramMyByteArray4.ccb = j;
      paramMyByteArray7.ccb = k;
      a(paramMyByteArray7, paramMyByteArray7, new byte[] { 16, 7, 20, 21, 29, 12, 28, 17, 1, 15, 23, 26, 5, 18, 31, 10, 2, 8, 24, 14, 32, 27, 3, 9, 19, 13, 30, 6, 22, 11, 4, 25 }, 32, paramMyByteArray8);
      a(paramMyByteArray7, paramMyByteArray6, 32);
      d(paramMyByteArray6, paramMyByteArray5, 32);
    }
    a(paramMyByteArray3, paramMyByteArray3, new byte[] { 40, 8, 48, 16, 56, 24, 64, 32, 39, 7, 47, 15, 55, 23, 63, 31, 38, 6, 46, 14, 54, 22, 62, 30, 37, 5, 45, 13, 53, 21, 61, 29, 36, 4, 44, 12, 52, 20, 60, 28, 35, 3, 43, 11, 51, 19, 59, 27, 34, 2, 42, 10, 50, 18, 58, 26, 33, 1, 41, 9, 49, 17, 57, 25 }, 64, paramMyByteArray8);
    a(paramMyByteArray1, 8);
    for (i = 0; i < 64; i++)
    {
      paramMyByteArray2 = paramMyByteArray1.cca;
      m = paramMyByteArray1.ccb + (i >> 3);
      paramMyByteArray2[m] = ((byte)(byte)(paramMyByteArray2[m] | paramMyByteArray3.cca[(paramMyByteArray3.ccb + i)] << (i & 0x7)));
    }
  }

  private static void b(MyByteArray paramMyByteArray1, MyByteArray paramMyByteArray2, int paramInt)
  {
    for (int i = 0; i < paramInt; i++)
      paramMyByteArray1.cca[(paramMyByteArray1.ccb + i)] = ((byte)(byte)(paramMyByteArray2.cca[((i >> 3) + paramMyByteArray2.ccb)] >> (i & 0x7) & 0x1));
  }

  private static void c(MyByteArray paramMyByteArray1, MyByteArray paramMyByteArray2, int paramInt)
  {
    int i = 0;
    d(paramMyByteArray2, paramMyByteArray1, paramInt);
    int k;
    for (int j = 0; ; j++)
    {
      k = i;
      if (j >= 28 - paramInt)
        break;
      paramMyByteArray1.cca[(paramMyByteArray1.ccb + j)] = ((byte)paramMyByteArray1.cca[(paramMyByteArray1.ccb + j + paramInt)]);
    }
    while (k < paramInt)
    {
      paramMyByteArray1.cca[(paramMyByteArray1.ccb + k + 28 - paramInt)] = ((byte)paramMyByteArray2.cca[(paramMyByteArray2.ccb + k)]);
      k++;
    }
  }

  private static void d(MyByteArray paramMyByteArray1, MyByteArray paramMyByteArray2, int paramInt)
  {
    for (int i = 0; i < paramInt; i++)
      paramMyByteArray1.cca[(paramMyByteArray1.ccb + i)] = ((byte)paramMyByteArray2.cca[(paramMyByteArray2.ccb + i)]);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.wx.util.MyDES
 * JD-Core Version:    0.6.2
 */