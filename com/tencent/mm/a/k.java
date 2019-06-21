package com.tencent.mm.a;

public final class k
{
  public static char a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong, int paramInt1, byte[] paramArrayOfByte3, int paramInt2)
  {
    paramArrayOfByte1 = new j(paramArrayOfByte1);
    j localj1 = new j(paramArrayOfByte2);
    j[] arrayOfj = new j[16];
    for (int i = 0; i < 16; i++)
      arrayOfj[i] = new j(new byte[48]);
    j localj2 = new j(new byte[256]);
    j localj3 = new j(new byte[24]);
    paramArrayOfByte2 = new j(new byte[64]);
    j localj4 = new j();
    j localj5 = new j();
    j localj6 = new j();
    j localj7 = new j();
    j localj8 = new j(new byte[64]);
    j localj9 = new j(new byte[48]);
    j localj10 = new j(new byte[32]);
    j localj11 = new j(new byte[9]);
    j localj12 = new j(new byte[8]);
    long l;
    if ((paramArrayOfByte3 != null) && (paramArrayOfByte3.length > 0))
    {
      l = 7L + paramLong & 0xFFFFFFF8;
      if (l != 0L);
    }
    else
    {
      paramInt1 = 0;
    }
    int k;
    for (int j = paramInt1; ; k = paramInt1)
    {
      return j;
      a(localj8, paramArrayOfByte2, localj4, localj5, localj6, localj7);
      a(arrayOfj, localj3, paramArrayOfByte3, paramInt1, paramArrayOfByte2, localj4, localj5, localj2);
      i = localj1.ccb;
      paramInt1 = paramArrayOfByte1.ccb;
      if (paramInt2 == 0)
      {
        a(paramArrayOfByte1, localj11, arrayOfj, paramInt2, localj8, localj9, localj10, localj6, localj7, localj2);
        d(localj12, paramArrayOfByte1, 8);
        paramArrayOfByte1.ccb += 8;
        paramLong = 0L;
        while (paramLong < l >> 3)
        {
          a(localj12, localj12, localj1);
          a(paramArrayOfByte1, localj12, arrayOfj, paramInt2, localj8, localj9, localj10, localj6, localj7, localj2);
          d(localj12, paramArrayOfByte1, 8);
          paramLong += 1L;
          paramArrayOfByte1.ccb += 8;
          localj1.ccb += 8;
        }
      }
      d(localj11, localj1, 8);
      localj1.ccb += 8;
      paramLong = 1L;
      while (paramLong < l >> 3)
      {
        a(localj12, localj1, arrayOfj, paramInt2, localj8, localj9, localj10, localj6, localj7, localj2);
        a(paramArrayOfByte1, localj12, localj11);
        d(localj11, localj1, 8);
        paramLong += 1L;
        paramArrayOfByte1.ccb += 8;
        localj1.ccb += 8;
      }
      localj1.ccb = i;
      paramArrayOfByte1.ccb = paramInt1;
      paramInt1 = 1;
    }
  }

  private static void a(j paramj, int paramInt)
  {
    for (int i = 0; i < paramInt; i++)
      paramj.cca[(paramj.ccb + i)] = ((byte)0);
  }

  private static void a(j paramj1, j paramj2, int paramInt)
  {
    for (int i = 0; i < paramInt; i++)
    {
      byte[] arrayOfByte = paramj1.cca;
      int j = paramj1.ccb + i;
      arrayOfByte[j] = ((byte)(byte)(arrayOfByte[j] ^ paramj2.cca[(paramj2.ccb + i)]));
    }
  }

  private static void a(j paramj1, j paramj2, j paramj3)
  {
    for (int i = 0; i < 8; i++)
      paramj1.cca[(paramj1.ccb + i)] = ((byte)(byte)(paramj2.cca[(paramj2.ccb + i)] ^ paramj3.cca[(paramj3.ccb + i)]));
  }

  private static void a(j paramj1, j paramj2, j paramj3, j paramj4)
  {
    int i = 0;
    a(paramj3, paramj1, new byte[] { 32, 1, 2, 3, 4, 5, 4, 5, 6, 7, 8, 9, 8, 9, 10, 11, 12, 13, 12, 13, 14, 15, 16, 17, 16, 17, 18, 19, 20, 21, 20, 21, 22, 23, 24, 25, 24, 25, 26, 27, 28, 29, 28, 29, 30, 31, 32, 1 }, 48, paramj4);
    a(paramj3, paramj2, 48);
    paramj2 = new byte[] { 0, 15, 7, 4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8 };
    paramj2 = new byte[][] { { 14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7 }, paramj2, { 4, 1, 14, 8, 13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0 }, { 15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13 } };
    Object localObject1 = { 15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, 13, 12, 0, 5, 10 };
    byte[] arrayOfByte1 = { 0, 14, 7, 11, 10, 4, 13, 1, 5, 8, 12, 6, 9, 3, 2, 15 };
    byte[] arrayOfByte2 = { 13, 8, 10, 1, 3, 15, 4, 2, 11, 6, 7, 12, 0, 5, 14, 9 };
    localObject1 = new byte[][] { localObject1, { 3, 13, 4, 7, 15, 2, 8, 14, 12, 0, 1, 10, 6, 9, 11, 5 }, arrayOfByte1, arrayOfByte2 };
    arrayOfByte1 = new byte[] { 10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8 };
    arrayOfByte2 = new byte[] { 13, 6, 4, 9, 8, 15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7 };
    Object localObject2 = { 10, 6, 9, 0, 12, 11, 7, 13, 15, 1, 3, 14, 5, 2, 8, 4 };
    localObject2 = new byte[][] { { 7, 13, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15 }, { 13, 8, 11, 5, 6, 15, 0, 3, 4, 7, 2, 12, 1, 10, 14, 9 }, localObject2, { 3, 15, 0, 6, 10, 1, 13, 8, 9, 4, 5, 11, 12, 7, 2, 14 } };
    byte[] arrayOfByte3 = { 2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, 13, 0, 14, 9 };
    byte[] arrayOfByte4 = { 14, 11, 2, 12, 4, 7, 13, 1, 5, 0, 15, 10, 3, 9, 8, 6 };
    byte[] arrayOfByte5 = { 4, 2, 1, 11, 10, 13, 7, 8, 15, 9, 12, 5, 6, 3, 0, 14 };
    byte[] arrayOfByte6 = { 11, 8, 12, 7, 1, 14, 2, 13, 6, 15, 0, 9, 10, 4, 5, 3 };
    byte[][] arrayOfByte = { { 12, 1, 10, 15, 9, 2, 6, 8, 0, 13, 3, 4, 14, 7, 5, 11 }, { 10, 15, 4, 2, 7, 12, 9, 5, 6, 1, 13, 14, 0, 11, 3, 8 }, { 9, 14, 15, 5, 2, 8, 12, 3, 7, 0, 4, 10, 1, 13, 11, 6 }, { 4, 3, 2, 12, 9, 5, 15, 10, 11, 14, 1, 7, 6, 0, 8, 13 } };
    Object localObject3 = { 13, 0, 11, 7, 4, 9, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6 };
    byte[] arrayOfByte7 = { 6, 11, 13, 8, 1, 4, 10, 7, 9, 5, 0, 15, 14, 2, 3, 12 };
    localObject3 = new byte[][] { { 4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1 }, localObject3, { 1, 4, 11, 13, 12, 3, 7, 14, 10, 15, 6, 8, 0, 5, 9, 2 }, arrayOfByte7 };
    arrayOfByte7 = new byte[] { 13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7 };
    byte[] arrayOfByte8 = { 1, 15, 13, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2 };
    byte[] arrayOfByte9 = { 7, 11, 4, 1, 9, 12, 14, 2, 0, 6, 10, 13, 15, 3, 5, 8 };
    byte[] arrayOfByte10 = { 2, 1, 14, 7, 4, 10, 8, 13, 15, 12, 9, 0, 3, 5, 6, 11 };
    int j = paramj3.ccb;
    int k = paramj1.ccb;
    while (i < 8)
    {
      int m = (byte)((paramj3.cca[(paramj3.ccb + 0)] << 1) + paramj3.cca[(paramj3.ccb + 5)]);
      int n = (byte)((paramj3.cca[(paramj3.ccb + 1)] << 3) + (paramj3.cca[(paramj3.ccb + 2)] << 2) + (paramj3.cca[(paramj3.ccb + 3)] << 1) + paramj3.cca[(paramj3.ccb + 4)]);
      b(paramj1, new j(new byte[][][] { paramj2, localObject1, { arrayOfByte1, { 13, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1 }, arrayOfByte2, { 1, 10, 13, 0, 6, 9, 8, 7, 4, 15, 14, 3, 11, 5, 2, 12 } }, localObject2, { arrayOfByte3, arrayOfByte4, arrayOfByte5, arrayOfByte6 }, arrayOfByte, localObject3, { arrayOfByte7, arrayOfByte8, arrayOfByte9, arrayOfByte10 } }[i][m][n]), 4);
      i = (byte)(i + 1);
      paramj3.ccb += 6;
      paramj1.ccb += 4;
    }
    paramj3.ccb = j;
    paramj1.ccb = k;
    a(paramj1, paramj1, new byte[] { 16, 7, 20, 21, 29, 12, 28, 17, 1, 15, 23, 26, 5, 18, 31, 10, 2, 8, 24, 14, 32, 27, 3, 9, 19, 13, 30, 6, 22, 11, 4, 25 }, 32, paramj4);
  }

  private static void a(j paramj1, j paramj2, j paramj3, j paramj4, j paramj5, j paramj6)
  {
    paramj3.ccb = 0;
    paramj3.cca = paramj2.cca;
    paramj4.ccb = 28;
    paramj4.cca = paramj2.cca;
    paramj5.ccb = 0;
    paramj5.cca = paramj1.cca;
    paramj6.ccb = 32;
    paramj6.cca = paramj1.cca;
  }

  private static void a(j paramj1, j paramj2, byte[] paramArrayOfByte, int paramInt, j paramj3)
  {
    for (int i = 0; i < paramInt; i++)
      paramj3.cca[(paramj3.ccb + i)] = ((byte)paramj2.cca[(paramj2.ccb + paramArrayOfByte[i] - 1)]);
    d(paramj1, paramj3, paramInt);
  }

  private static void a(j paramj1, j paramj2, j[] paramArrayOfj, int paramInt, j paramj3, j paramj4, j paramj5, j paramj6, j paramj7, j paramj8)
  {
    b(paramj3, paramj2, 64);
    a(paramj3, paramj3, new byte[] { 58, 50, 42, 34, 26, 18, 10, 2, 60, 52, 44, 36, 28, 20, 12, 4, 62, 54, 46, 38, 30, 22, 14, 6, 64, 56, 48, 40, 32, 24, 16, 8, 57, 49, 41, 33, 25, 17, 9, 1, 59, 51, 43, 35, 27, 19, 11, 3, 61, 53, 45, 37, 29, 21, 13, 5, 63, 55, 47, 39, 31, 23, 15, 7 }, 64, paramj8);
    if (paramInt == 0)
      for (paramInt = 0; paramInt < 16; paramInt++)
      {
        d(paramj5, paramj7, 32);
        a(paramj7, paramArrayOfj[paramInt], paramj4, paramj8);
        a(paramj7, paramj6, 32);
        d(paramj6, paramj5, 32);
      }
    for (paramInt = 15; paramInt >= 0; paramInt--)
    {
      d(paramj5, paramj6, 32);
      a(paramj6, paramArrayOfj[paramInt], paramj4, paramj8);
      a(paramj6, paramj7, 32);
      d(paramj7, paramj5, 32);
    }
    a(paramj3, paramj3, new byte[] { 40, 8, 48, 16, 56, 24, 64, 32, 39, 7, 47, 15, 55, 23, 63, 31, 38, 6, 46, 14, 54, 22, 62, 30, 37, 5, 45, 13, 53, 21, 61, 29, 36, 4, 44, 12, 52, 20, 60, 28, 35, 3, 43, 11, 51, 19, 59, 27, 34, 2, 42, 10, 50, 18, 58, 26, 33, 1, 41, 9, 49, 17, 57, 25 }, 64, paramj8);
    a(paramj1, 8);
    for (paramInt = 0; paramInt < 64; paramInt++)
    {
      paramj2 = paramj1.cca;
      int i = paramj1.ccb + (paramInt >> 3);
      paramj2[i] = ((byte)(byte)(paramj2[i] | paramj3.cca[(paramj3.ccb + paramInt)] << (paramInt & 0x7)));
    }
  }

  private static void a(j[] paramArrayOfj, j paramj1, byte[] paramArrayOfByte, int paramInt, j paramj2, j paramj3, j paramj4, j paramj5)
  {
    a(paramj1, 24);
    paramArrayOfByte = new j(paramArrayOfByte);
    int i = paramInt;
    if (paramInt > 24)
      i = 24;
    d(paramj1, paramArrayOfByte, i);
    paramArrayOfByte = new byte[16];
    byte[] tmp41_40 = paramArrayOfByte;
    tmp41_40[0] = 1;
    byte[] tmp46_41 = tmp41_40;
    tmp46_41[1] = 1;
    byte[] tmp51_46 = tmp46_41;
    tmp51_46[2] = 2;
    byte[] tmp56_51 = tmp51_46;
    tmp56_51[3] = 2;
    byte[] tmp61_56 = tmp56_51;
    tmp61_56[4] = 2;
    byte[] tmp66_61 = tmp61_56;
    tmp66_61[5] = 2;
    byte[] tmp71_66 = tmp66_61;
    tmp71_66[6] = 2;
    byte[] tmp77_71 = tmp71_66;
    tmp77_71[7] = 2;
    byte[] tmp83_77 = tmp77_71;
    tmp83_77[8] = 1;
    byte[] tmp89_83 = tmp83_77;
    tmp89_83[9] = 2;
    byte[] tmp95_89 = tmp89_83;
    tmp95_89[10] = 2;
    byte[] tmp101_95 = tmp95_89;
    tmp101_95[11] = 2;
    byte[] tmp107_101 = tmp101_95;
    tmp107_101[12] = 2;
    byte[] tmp113_107 = tmp107_101;
    tmp113_107[13] = 2;
    byte[] tmp119_113 = tmp113_107;
    tmp119_113[14] = 2;
    byte[] tmp125_119 = tmp119_113;
    tmp125_119[15] = 1;
    tmp125_119;
    b(paramj2, paramj1, 64);
    a(paramj2, paramj2, new byte[] { 57, 49, 41, 33, 25, 17, 9, 1, 58, 50, 42, 34, 26, 18, 10, 2, 59, 51, 43, 35, 27, 19, 11, 3, 60, 52, 44, 36, 63, 55, 47, 39, 31, 23, 15, 7, 62, 54, 46, 38, 30, 22, 14, 6, 61, 53, 45, 37, 29, 21, 13, 5, 28, 20, 12, 4 }, 56, paramj5);
    for (paramInt = 0; paramInt < 16; paramInt++)
    {
      c(paramj3, paramj5, paramArrayOfByte[paramInt]);
      c(paramj4, paramj5, paramArrayOfByte[paramInt]);
      a(paramArrayOfj[paramInt], paramj2, new byte[] { 14, 17, 11, 24, 1, 5, 3, 28, 15, 6, 21, 10, 23, 19, 12, 4, 26, 8, 16, 7, 27, 20, 13, 2, 41, 52, 31, 37, 47, 55, 30, 40, 51, 45, 33, 48, 44, 49, 39, 56, 34, 53, 46, 42, 50, 36, 29, 32 }, 48, paramj5);
    }
  }

  private static void b(j paramj1, j paramj2, int paramInt)
  {
    for (int i = 0; i < paramInt; i++)
      paramj1.cca[(paramj1.ccb + i)] = ((byte)(byte)(paramj2.cca[((i >> 3) + paramj2.ccb)] >> (i & 0x7) & 0x1));
  }

  private static void c(j paramj1, j paramj2, int paramInt)
  {
    int i = 0;
    d(paramj2, paramj1, paramInt);
    int k;
    for (int j = 0; ; j++)
    {
      k = i;
      if (j >= 28 - paramInt)
        break;
      paramj1.cca[(paramj1.ccb + j)] = ((byte)paramj1.cca[(paramj1.ccb + j + paramInt)]);
    }
    while (k < paramInt)
    {
      paramj1.cca[(paramj1.ccb + k + 28 - paramInt)] = ((byte)paramj2.cca[(paramj2.ccb + k)]);
      k++;
    }
  }

  private static void d(j paramj1, j paramj2, int paramInt)
  {
    for (int i = 0; i < paramInt; i++)
      paramj1.cca[(paramj1.ccb + i)] = ((byte)paramj2.cca[(paramj2.ccb + i)]);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.k
 * JD-Core Version:    0.6.2
 */