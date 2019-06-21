package com.google.b.f.b;

import com.google.b.f.a.c;
import com.google.b.h;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e
{
  private static final int[][] bBM = { { 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1 }, { 1, 0, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1 } };
  private static final int[][] bBN = { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 } };
  private static final int[][] bBO;
  private static final int[][] bBP = { { 8, 0 }, arrayOfInt1, { 8, 2 }, arrayOfInt2, { 8, 4 }, arrayOfInt3, arrayOfInt4, { 8, 8 }, arrayOfInt5, arrayOfInt6, arrayOfInt7, { 3, 8 }, arrayOfInt8, arrayOfInt9, { 0, 8 } };

  static
  {
    int[] arrayOfInt1 = { 6, 18, -1, -1, -1, -1, -1 };
    int[] arrayOfInt2 = { 6, 26, -1, -1, -1, -1, -1 };
    int[] arrayOfInt3 = { 6, 34, -1, -1, -1, -1, -1 };
    int[] arrayOfInt4 = { 6, 26, 46, -1, -1, -1, -1 };
    int[] arrayOfInt5 = { 6, 28, 50, -1, -1, -1, -1 };
    int[] arrayOfInt6 = { 6, 30, 54, -1, -1, -1, -1 };
    int[] arrayOfInt7 = { 6, 26, 46, 66, -1, -1, -1 };
    int[] arrayOfInt8 = { 6, 30, 58, 86, -1, -1, -1 };
    int[] arrayOfInt9 = { 6, 28, 50, 72, 94, -1, -1 };
    int[] arrayOfInt10 = { 6, 30, 54, 78, 102, -1, -1 };
    int[] arrayOfInt11 = { 6, 28, 54, 80, 106, -1, -1 };
    int[] arrayOfInt12 = { 6, 32, 58, 84, 110, -1, -1 };
    int[] arrayOfInt13 = { 6, 30, 58, 86, 114, -1, -1 };
    int[] arrayOfInt14 = { 6, 26, 52, 78, 104, 130, -1 };
    int[] arrayOfInt15 = { 6, 30, 58, 86, 114, 142, -1 };
    int[] arrayOfInt16 = { 6, 24, 50, 76, 102, 128, 154 };
    int[] arrayOfInt17 = { 6, 26, 54, 82, 110, 138, 166 };
    int[] arrayOfInt18 = { 6, 30, 58, 86, 114, 142, 170 };
    bBO = new int[][] { { -1, -1, -1, -1, -1, -1, -1 }, arrayOfInt1, { 6, 22, -1, -1, -1, -1, -1 }, arrayOfInt2, { 6, 30, -1, -1, -1, -1, -1 }, arrayOfInt3, { 6, 22, 38, -1, -1, -1, -1 }, { 6, 24, 42, -1, -1, -1, -1 }, arrayOfInt4, arrayOfInt5, arrayOfInt6, { 6, 32, 58, -1, -1, -1, -1 }, { 6, 34, 62, -1, -1, -1, -1 }, arrayOfInt7, { 6, 26, 48, 70, -1, -1, -1 }, { 6, 26, 50, 74, -1, -1, -1 }, { 6, 30, 54, 78, -1, -1, -1 }, { 6, 30, 56, 82, -1, -1, -1 }, arrayOfInt8, { 6, 34, 62, 90, -1, -1, -1 }, arrayOfInt9, { 6, 26, 50, 74, 98, -1, -1 }, arrayOfInt10, arrayOfInt11, arrayOfInt12, arrayOfInt13, { 6, 34, 62, 90, 118, -1, -1 }, { 6, 26, 50, 74, 98, 122, -1 }, { 6, 30, 54, 78, 102, 126, -1 }, arrayOfInt14, { 6, 30, 56, 82, 108, 134, -1 }, { 6, 34, 60, 86, 112, 138, -1 }, arrayOfInt15, { 6, 34, 62, 90, 118, 146, -1 }, { 6, 30, 54, 78, 102, 126, 150 }, arrayOfInt16, { 6, 28, 54, 80, 106, 132, 158 }, { 6, 32, 58, 84, 110, 136, 162 }, arrayOfInt17, arrayOfInt18 };
    arrayOfInt1 = new int[] { 8, 1 };
    arrayOfInt2 = new int[] { 8, 3 };
    arrayOfInt3 = new int[] { 8, 5 };
    arrayOfInt4 = new int[] { 8, 7 };
    arrayOfInt5 = new int[] { 7, 8 };
    arrayOfInt6 = new int[] { 5, 8 };
    arrayOfInt7 = new int[] { 4, 8 };
    arrayOfInt8 = new int[] { 2, 8 };
    arrayOfInt9 = new int[] { 1, 8 };
  }

  private static void a(int paramInt1, int paramInt2, b paramb)
  {
    AppMethodBeat.i(57186);
    for (int i = 0; i < 8; i++)
    {
      if (!fJ(paramb.bH(paramInt1 + i, paramInt2)))
      {
        paramb = new h();
        AppMethodBeat.o(57186);
        throw paramb;
      }
      paramb.set(paramInt1 + i, paramInt2, 0);
    }
    AppMethodBeat.o(57186);
  }

  private static void a(com.google.b.b.a parama, int paramInt, b paramb)
  {
    AppMethodBeat.i(57184);
    int i = paramb.width - 1;
    int j = paramb.height - 1;
    int k = -1;
    int m = 0;
    int n;
    if (i > 0)
    {
      if (i != 6)
        break label465;
      n = i - 1;
      i = j;
    }
    while (true)
      if ((i >= 0) && (i < paramb.height))
      {
        int i1 = 0;
        j = m;
        if (i1 < 2)
        {
          int i2 = n - i1;
          m = j;
          if (fJ(paramb.bH(i2, i)))
          {
            boolean bool1;
            if (j < parama.size)
              bool1 = parama.get(j);
            for (m = j + 1; ; m = j)
            {
              bool2 = bool1;
              if (paramInt == -1)
                break;
              switch (paramInt)
              {
              default:
                parama = new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(paramInt)));
                AppMethodBeat.o(57184);
                throw parama;
                bool1 = false;
              case 0:
              case 1:
              case 2:
              case 3:
              case 4:
              case 5:
              case 6:
              case 7:
              }
            }
            j = i + i2 & 0x1;
            label214: if (j != 0)
              break label363;
            j = 1;
            label222: bool2 = bool1;
            if (j != 0)
              if (bool1)
                break label369;
          }
          label363: label369: for (boolean bool2 = true; ; bool2 = false)
          {
            paramb.set(i2, i, bool2);
            i1++;
            j = m;
            break;
            j = i & 0x1;
            break label214;
            j = i2 % 3;
            break label214;
            j = (i + i2) % 3;
            break label214;
            j = i / 2 + i2 / 3 & 0x1;
            break label214;
            j = i * i2;
            j = j % 3 + (j & 0x1);
            break label214;
            j = i * i2;
            j = j % 3 + (j & 0x1) & 0x1;
            break label214;
            j = i * i2 % 3 + (i + i2 & 0x1) & 0x1;
            break label214;
            j = 0;
            break label222;
          }
        }
        i += k;
        m = j;
      }
      else
      {
        k = -k;
        j = i + k;
        i = n - 2;
        break;
        if (m != parama.size)
        {
          parama = new h("Not all bits consumed: " + m + '/' + parama.size);
          AppMethodBeat.o(57184);
          throw parama;
        }
        AppMethodBeat.o(57184);
        return;
        label465: n = i;
        i = j;
      }
  }

  static void a(com.google.b.b.a parama, com.google.b.f.a.a parama1, c paramc, int paramInt, b paramb)
  {
    AppMethodBeat.i(57182);
    int j;
    for (int i = 0; i < paramb.height; i++)
      for (j = 0; j < paramb.width; j++)
        paramb.bBJ[i][j] = ((byte)-1);
    i = bBM[0].length;
    c(0, 0, paramb);
    c(paramb.width - i, 0, paramb);
    c(0, paramb.width - i, paramb);
    a(0, 7, paramb);
    a(paramb.width - 8, 7, paramb);
    a(0, paramb.width - 8, paramb);
    b(7, 0, paramb);
    b(paramb.height - 7 - 1, 0, paramb);
    b(7, paramb.height - 7, paramb);
    if (paramb.bH(8, paramb.height - 8) == 0)
    {
      parama = new h();
      AppMethodBeat.o(57182);
      throw parama;
    }
    paramb.set(8, paramb.height - 8, 1);
    if (paramc.bBA >= 2)
    {
      i = paramc.bBA - 1;
      localObject = bBO[i];
      int k = bBO[i].length;
      for (i = 0; i < k; i++)
        for (j = 0; j < k; j++)
        {
          int m = localObject[i];
          int n = localObject[j];
          if ((n != -1) && (m != -1) && (fJ(paramb.bH(n, m))))
            for (int i1 = 0; i1 < 5; i1++)
              for (int i2 = 0; i2 < 5; i2++)
                paramb.set(n - 2 + i2, m - 2 + i1, bBN[i1][i2]);
        }
    }
    for (i = 8; i < paramb.width - 8; i++)
    {
      j = (i + 1) % 2;
      if (fJ(paramb.bH(i, 6)))
        paramb.set(i, 6, j);
      if (fJ(paramb.bH(6, i)))
        paramb.set(6, i, j);
    }
    Object localObject = new com.google.b.b.a();
    if ((paramInt >= 0) && (paramInt < 8));
    for (i = 1; i == 0; i = 0)
    {
      parama = new h("Invalid mask pattern");
      AppMethodBeat.o(57182);
      throw parama;
    }
    i = parama1.bBk << 3 | paramInt;
    ((com.google.b.b.a)localObject).bA(i, 5);
    ((com.google.b.b.a)localObject).bA(bI(i, 1335), 10);
    parama1 = new com.google.b.b.a();
    parama1.bA(21522, 15);
    if (((com.google.b.b.a)localObject).size != parama1.size)
    {
      parama = new IllegalArgumentException("Sizes don't match");
      AppMethodBeat.o(57182);
      throw parama;
    }
    for (i = 0; i < ((com.google.b.b.a)localObject).byE.length; i++)
    {
      int[] arrayOfInt = ((com.google.b.b.a)localObject).byE;
      arrayOfInt[i] ^= parama1.byE[i];
    }
    if (((com.google.b.b.a)localObject).size != 15)
    {
      parama = new h("should not happen but we got: " + ((com.google.b.b.a)localObject).size);
      AppMethodBeat.o(57182);
      throw parama;
    }
    i = 0;
    if (i < ((com.google.b.b.a)localObject).size)
    {
      boolean bool = ((com.google.b.b.a)localObject).get(((com.google.b.b.a)localObject).size - 1 - i);
      paramb.set(bBP[i][0], bBP[i][1], bool);
      if (i < 8)
        paramb.set(paramb.width - i - 1, 8, bool);
      while (true)
      {
        i++;
        break;
        paramb.set(8, paramb.height - 7 + (i - 8), bool);
      }
    }
    a(paramc, paramb);
    a(parama, paramInt, paramb);
    AppMethodBeat.o(57182);
  }

  private static void a(c paramc, b paramb)
  {
    AppMethodBeat.i(57183);
    if (paramc.bBA < 7)
      AppMethodBeat.o(57183);
    while (true)
    {
      return;
      com.google.b.b.a locala = new com.google.b.b.a();
      locala.bA(paramc.bBA, 6);
      locala.bA(bI(paramc.bBA, 7973), 12);
      if (locala.size != 18)
      {
        paramc = new h("should not happen but we got: " + locala.size);
        AppMethodBeat.o(57183);
        throw paramc;
      }
      int i = 17;
      for (int j = 0; j < 6; j++)
        for (int k = 0; k < 3; k++)
        {
          boolean bool = locala.get(i);
          i--;
          paramb.set(j, paramb.height - 11 + k, bool);
          paramb.set(paramb.height - 11 + k, j, bool);
        }
      AppMethodBeat.o(57183);
    }
  }

  private static void b(int paramInt1, int paramInt2, b paramb)
  {
    AppMethodBeat.i(57187);
    for (int i = 0; i < 7; i++)
    {
      if (!fJ(paramb.bH(paramInt1, paramInt2 + i)))
      {
        paramb = new h();
        AppMethodBeat.o(57187);
        throw paramb;
      }
      paramb.set(paramInt1, paramInt2 + i, 0);
    }
    AppMethodBeat.o(57187);
  }

  private static int bI(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57185);
    if (paramInt2 == 0)
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("0 polynomial");
      AppMethodBeat.o(57185);
      throw localIllegalArgumentException;
    }
    int i = 32 - Integer.numberOfLeadingZeros(paramInt2);
    paramInt1 <<= i - 1;
    while (32 - Integer.numberOfLeadingZeros(paramInt1) >= i)
      paramInt1 ^= paramInt2 << 32 - Integer.numberOfLeadingZeros(paramInt1) - i;
    AppMethodBeat.o(57185);
    return paramInt1;
  }

  private static void c(int paramInt1, int paramInt2, b paramb)
  {
    AppMethodBeat.i(57188);
    for (int i = 0; i < 7; i++)
      for (int j = 0; j < 7; j++)
        paramb.set(paramInt1 + j, paramInt2 + i, bBM[i][j]);
    AppMethodBeat.o(57188);
  }

  private static boolean fJ(int paramInt)
  {
    if (paramInt == -1);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.b.f.b.e
 * JD-Core Version:    0.6.2
 */