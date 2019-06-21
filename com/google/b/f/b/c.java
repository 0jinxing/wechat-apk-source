package com.google.b.f.b;

import com.google.b.f.a.c.b;
import com.google.b.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map<Lcom.google.b.c;*>;

public final class c
{
  private static final int[] bBK = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1 };

  private static int a(com.google.b.b.a parama, com.google.b.f.a.a parama1, com.google.b.f.a.c paramc, b paramb)
  {
    AppMethodBeat.i(57252);
    int i = 2147483647;
    int j = -1;
    int k = 0;
    if (k < 8)
    {
      e.a(parama, parama1, paramc, k, paramb);
      int m = d.a(paramb, true);
      int n = d.a(paramb, false);
      int i1 = 0;
      byte[][] arrayOfByte = paramb.bBJ;
      int i2 = paramb.width;
      int i3 = paramb.height;
      for (int i4 = 0; i4 < i3 - 1; i4++)
      {
        i5 = 0;
        while (i5 < i2 - 1)
        {
          i6 = arrayOfByte[i4][i5];
          i7 = i1;
          if (i6 == arrayOfByte[i4][(i5 + 1)])
          {
            i7 = i1;
            if (i6 == arrayOfByte[(i4 + 1)][i5])
            {
              i7 = i1;
              if (i6 == arrayOfByte[(i4 + 1)][(i5 + 1)])
                i7 = i1 + 1;
            }
          }
          i5++;
          i1 = i7;
        }
      }
      i4 = 0;
      Object localObject = paramb.bBJ;
      int i6 = paramb.width;
      i2 = paramb.height;
      for (int i7 = 0; i7 < i2; i7++)
        for (i3 = 0; i3 < i6; i3++)
        {
          arrayOfByte = localObject[i7];
          i5 = i4;
          if (i3 + 6 < i6)
          {
            i5 = i4;
            if (arrayOfByte[i3] == 1)
            {
              i5 = i4;
              if (arrayOfByte[(i3 + 1)] == 0)
              {
                i5 = i4;
                if (arrayOfByte[(i3 + 2)] == 1)
                {
                  i5 = i4;
                  if (arrayOfByte[(i3 + 3)] == 1)
                  {
                    i5 = i4;
                    if (arrayOfByte[(i3 + 4)] == 1)
                    {
                      i5 = i4;
                      if (arrayOfByte[(i3 + 5)] == 0)
                      {
                        i5 = i4;
                        if (arrayOfByte[(i3 + 6)] == 1)
                          if (!d.o(arrayOfByte, i3 - 4, i3))
                          {
                            i5 = i4;
                            if (!d.o(arrayOfByte, i3 + 7, i3 + 11));
                          }
                          else
                          {
                            i5 = i4 + 1;
                          }
                      }
                    }
                  }
                }
              }
            }
          }
          i4 = i5;
          if (i7 + 6 < i2)
          {
            i4 = i5;
            if (localObject[i7][i3] == 1)
            {
              i4 = i5;
              if (localObject[(i7 + 1)][i3] == 0)
              {
                i4 = i5;
                if (localObject[(i7 + 2)][i3] == 1)
                {
                  i4 = i5;
                  if (localObject[(i7 + 3)][i3] == 1)
                  {
                    i4 = i5;
                    if (localObject[(i7 + 4)][i3] == 1)
                    {
                      i4 = i5;
                      if (localObject[(i7 + 5)][i3] == 0)
                      {
                        i4 = i5;
                        if (localObject[(i7 + 6)][i3] == 1)
                          if (!d.a((byte[][])localObject, i3, i7 - 4, i7))
                          {
                            i4 = i5;
                            if (!d.a((byte[][])localObject, i3, i7 + 7, i7 + 11));
                          }
                          else
                          {
                            i4 = i5 + 1;
                          }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      i7 = 0;
      arrayOfByte = paramb.bBJ;
      int i8 = paramb.width;
      i6 = paramb.height;
      for (int i5 = 0; i5 < i6; i5++)
      {
        localObject = arrayOfByte[i5];
        i3 = 0;
        while (i3 < i8)
        {
          i2 = i7;
          if (localObject[i3] == 1)
            i2 = i7 + 1;
          i3++;
          i7 = i2;
        }
      }
      i5 = paramb.height * paramb.width;
      i4 = m + n + i1 * 3 + i4 * 40 + Math.abs((i7 << 1) - i5) * 10 / i5 * 10;
      if (i4 >= i)
        break label743;
      j = k;
      i = i4;
    }
    label743: 
    while (true)
    {
      k++;
      break;
      AppMethodBeat.o(57252);
      return j;
    }
  }

  private static int a(com.google.b.f.a.b paramb, com.google.b.b.a parama1, com.google.b.b.a parama2, com.google.b.f.a.c paramc)
  {
    AppMethodBeat.i(57250);
    int i = parama1.size;
    int j = paramb.a(paramc);
    int k = parama2.size;
    AppMethodBeat.o(57250);
    return i + j + k;
  }

  private static com.google.b.b.a a(com.google.b.b.a parama, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(57256);
    if (parama.vt() != paramInt2)
    {
      parama = new h("Number of bits and data bytes does not match");
      AppMethodBeat.o(57256);
      throw parama;
    }
    int i = 0;
    int j = 0;
    ArrayList localArrayList = new ArrayList(paramInt3);
    int k = 0;
    int m = 0;
    Object localObject1;
    Object localObject3;
    if (k < paramInt3)
    {
      localObject1 = new int[1];
      Object localObject2 = new int[1];
      if (k >= paramInt3)
      {
        parama = new h("Block ID too large");
        AppMethodBeat.o(57256);
        throw parama;
      }
      int n = paramInt1 % paramInt3;
      int i1 = paramInt3 - n;
      int i2 = paramInt1 / paramInt3;
      int i3 = paramInt2 / paramInt3;
      int i4 = i3 + 1;
      int i5 = i2 - i3;
      i2 = i2 + 1 - i4;
      if (i5 != i2)
      {
        parama = new h("EC bytes mismatch");
        AppMethodBeat.o(57256);
        throw parama;
      }
      if (paramInt3 != i1 + n)
      {
        parama = new h("RS blocks mismatch");
        AppMethodBeat.o(57256);
        throw parama;
      }
      if (paramInt1 != n * (i4 + i2) + (i3 + i5) * i1)
      {
        parama = new h("Total bytes mismatch");
        AppMethodBeat.o(57256);
        throw parama;
      }
      if (k < i1)
      {
        localObject1[0] = i3;
        localObject2[0] = i5;
      }
      while (true)
      {
        i5 = localObject1[0];
        localObject3 = new byte[i5];
        parama.a(i << 3, (byte[])localObject3, i5);
        localObject2 = r((byte[])localObject3, localObject2[0]);
        localArrayList.add(new a((byte[])localObject3, (byte[])localObject2));
        j = Math.max(j, i5);
        m = Math.max(m, localObject2.length);
        i += localObject1[0];
        k++;
        break;
        localObject1[0] = i4;
        localObject2[0] = i2;
      }
    }
    if (paramInt2 != i)
    {
      parama = new h("Data bytes does not match offset");
      AppMethodBeat.o(57256);
      throw parama;
    }
    parama = new com.google.b.b.a();
    for (paramInt2 = 0; paramInt2 < j; paramInt2++)
    {
      localObject3 = localArrayList.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject1 = ((a)((Iterator)localObject3).next()).bBH;
        if (paramInt2 < localObject1.length)
          parama.bA(localObject1[paramInt2], 8);
      }
    }
    for (paramInt2 = 0; paramInt2 < m; paramInt2++)
    {
      localObject3 = localArrayList.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject1 = ((a)((Iterator)localObject3).next()).bBI;
        if (paramInt2 < localObject1.length)
          parama.bA(localObject1[paramInt2], 8);
      }
    }
    if (paramInt1 != parama.vt())
    {
      parama = new h("Interleaving error: " + paramInt1 + " and " + parama.vt() + " differ.");
      AppMethodBeat.o(57256);
      throw parama;
    }
    AppMethodBeat.o(57256);
    return parama;
  }

  private static com.google.b.f.a.c a(int paramInt, com.google.b.f.a.a parama)
  {
    AppMethodBeat.i(57253);
    for (int i = 1; i <= 40; i++)
    {
      com.google.b.f.a.c localc = com.google.b.f.a.c.fH(i);
      if (a(paramInt, localc, parama))
      {
        AppMethodBeat.o(57253);
        return localc;
      }
    }
    parama = new h("Data too big");
    AppMethodBeat.o(57253);
    throw parama;
  }

  public static f a(String paramString, com.google.b.f.a.a parama, Map<com.google.b.c, ?> paramMap)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    AppMethodBeat.i(57249);
    Object localObject1 = "ISO-8859-1";
    Object localObject2 = localObject1;
    if (paramMap != null)
    {
      localObject2 = localObject1;
      if (paramMap.containsKey(com.google.b.c.bxU))
        localObject2 = paramMap.get(com.google.b.c.bxU).toString();
    }
    if (("Shift_JIS".equals(localObject2)) && (bl(paramString)))
      localObject1 = com.google.b.f.a.b.bBs;
    com.google.b.b.a locala;
    Object localObject3;
    int i1;
    while (true)
    {
      locala = new com.google.b.b.a();
      if ((localObject1 == com.google.b.f.a.b.bBq) && (!"ISO-8859-1".equals(localObject2)))
      {
        localObject3 = com.google.b.b.c.bh((String)localObject2);
        if (localObject3 != null)
        {
          locala.bA(com.google.b.f.a.b.bBr.bBk, 4);
          locala.bA(localObject3.bzj[0], 8);
        }
      }
      locala.bA(((com.google.b.f.a.b)localObject1).bBk, 4);
      localObject3 = new com.google.b.b.a();
      switch (c.1.bBL[localObject1.ordinal()])
      {
      default:
        paramString = new h("Invalid mode: ".concat(String.valueOf(localObject1)));
        AppMethodBeat.o(57249);
        throw paramString;
        n = 0;
        i1 = 0;
        i2 = 0;
        if (n < paramString.length())
        {
          int i3 = paramString.charAt(n);
          if ((i3 >= 48) && (i3 <= 57))
            i2 = 1;
          while (true)
          {
            n++;
            break;
            if (fI(i3) == -1)
              break label293;
            i1 = 1;
          }
          label293: localObject1 = com.google.b.f.a.b.bBq;
        }
        else if (i1 != 0)
        {
          localObject1 = com.google.b.f.a.b.bBo;
        }
        else if (i2 != 0)
        {
          localObject1 = com.google.b.f.a.b.bBn;
        }
        else
        {
          localObject1 = com.google.b.f.a.b.bBq;
        }
        break;
      case 1:
      case 2:
      case 3:
      case 4:
      }
    }
    int i2 = paramString.length();
    int n = m;
    while (n < i2)
    {
      i1 = paramString.charAt(n) - '0';
      if (n + 2 < i2)
      {
        ((com.google.b.b.a)localObject3).bA(i1 * 100 + (paramString.charAt(n + 1) - '0') * 10 + (paramString.charAt(n + 2) - '0'), 10);
        n += 3;
      }
      else if (n + 1 < i2)
      {
        ((com.google.b.b.a)localObject3).bA(i1 * 10 + (paramString.charAt(n + 1) - '0'), 7);
        n += 2;
      }
      else
      {
        ((com.google.b.b.a)localObject3).bA(i1, 4);
        n++;
        continue;
        i2 = paramString.length();
        n = i;
        while (n < i2)
        {
          i1 = fI(paramString.charAt(n));
          if (i1 == -1)
          {
            paramString = new h();
            AppMethodBeat.o(57249);
            throw paramString;
          }
          if (n + 1 < i2)
          {
            m = fI(paramString.charAt(n + 1));
            if (m == -1)
            {
              paramString = new h();
              AppMethodBeat.o(57249);
              throw paramString;
            }
            ((com.google.b.b.a)localObject3).bA(i1 * 45 + m, 11);
            n += 2;
          }
          else
          {
            ((com.google.b.b.a)localObject3).bA(i1, 6);
            n++;
            continue;
            try
            {
              localObject2 = paramString.getBytes((String)localObject2);
              i2 = localObject2.length;
              for (n = j; n < i2; n++)
                ((com.google.b.b.a)localObject3).bA(localObject2[n], 8);
            }
            catch (UnsupportedEncodingException paramString)
            {
              paramString = new h(paramString);
              AppMethodBeat.o(57249);
              throw paramString;
            }
          }
        }
      }
    }
    while (true)
    {
      try
      {
        localObject2 = paramString.getBytes("Shift_JIS");
        i1 = localObject2.length;
        i2 = k;
        if (i2 >= i1)
          break label843;
        n = (localObject2[i2] & 0xFF) << 8 | localObject2[(i2 + 1)] & 0xFF;
        if ((n >= 33088) && (n <= 40956))
        {
          n -= 33088;
          if (n != -1)
            break label814;
          paramString = new h("Invalid byte sequence");
          AppMethodBeat.o(57249);
          throw paramString;
        }
      }
      catch (UnsupportedEncodingException paramString)
      {
        paramString = new h(paramString);
        AppMethodBeat.o(57249);
        throw paramString;
      }
      if ((n >= 57408) && (n <= 60351))
      {
        n -= 49472;
        continue;
        label814: ((com.google.b.b.a)localObject3).bA((n & 0xFF) + (n >> 8) * 192, 13);
        i2 += 2;
        continue;
        label843: if ((paramMap != null) && (paramMap.containsKey(com.google.b.c.byd)))
        {
          localObject2 = com.google.b.f.a.c.fH(Integer.parseInt(paramMap.get(com.google.b.c.byd).toString()));
          paramMap = (Map<com.google.b.c, ?>)localObject2;
          if (!a(a((com.google.b.f.a.b)localObject1, locala, (com.google.b.b.a)localObject3, (com.google.b.f.a.c)localObject2), (com.google.b.f.a.c)localObject2, parama))
          {
            paramString = new h("Data too big for requested version");
            AppMethodBeat.o(57249);
            throw paramString;
          }
        }
        else
        {
          paramMap = a(a((com.google.b.f.a.b)localObject1, locala, (com.google.b.b.a)localObject3, a(a((com.google.b.f.a.b)localObject1, locala, (com.google.b.b.a)localObject3, com.google.b.f.a.c.fH(1)), parama)), parama);
        }
        localObject2 = new com.google.b.b.a();
        ((com.google.b.b.a)localObject2).a(locala);
        if (localObject1 == com.google.b.f.a.b.bBq);
        for (n = ((com.google.b.b.a)localObject3).vt(); ; n = paramString.length())
        {
          i2 = ((com.google.b.f.a.b)localObject1).a(paramMap);
          if (n < 1 << i2)
            break;
          paramString = new h(n + " is bigger than " + ((1 << i2) - 1));
          AppMethodBeat.o(57249);
          throw paramString;
        }
        ((com.google.b.b.a)localObject2).bA(n, i2);
        ((com.google.b.b.a)localObject2).a((com.google.b.b.a)localObject3);
        paramString = paramMap.a(parama);
        n = paramMap.bBD - paramString.vM();
        a(n, (com.google.b.b.a)localObject2);
        localObject2 = a((com.google.b.b.a)localObject2, paramMap.bBD, n, paramString.vL());
        paramString = new f();
        paramString.bBR = parama;
        paramString.bBQ = ((com.google.b.f.a.b)localObject1);
        paramString.bBS = paramMap;
        n = paramMap.bBA * 4 + 17;
        localObject1 = new b(n, n);
        n = a((com.google.b.b.a)localObject2, parama, paramMap, (b)localObject1);
        paramString.bBT = n;
        e.a((com.google.b.b.a)localObject2, parama, paramMap, n, (b)localObject1);
        paramString.bBU = ((b)localObject1);
        AppMethodBeat.o(57249);
        return paramString;
      }
      else
      {
        n = -1;
      }
    }
  }

  private static void a(int paramInt, com.google.b.b.a parama)
  {
    AppMethodBeat.i(57255);
    int i = paramInt << 3;
    if (parama.size > i)
    {
      parama = new h("data bits cannot fit in the QR Code" + parama.size + " > " + i);
      AppMethodBeat.o(57255);
      throw parama;
    }
    for (int j = 0; (j < 4) && (parama.size < i); j++)
      parama.aT(false);
    j = parama.size & 0x7;
    if (j > 0)
      while (j < 8)
      {
        parama.aT(false);
        j++;
      }
    int k = parama.vt();
    j = 0;
    if (j < paramInt - k)
    {
      if ((j & 0x1) == 0);
      for (int m = 236; ; m = 17)
      {
        parama.bA(m, 8);
        j++;
        break;
      }
    }
    if (parama.size != i)
    {
      parama = new h("Bits size does not equal capacity");
      AppMethodBeat.o(57255);
      throw parama;
    }
    AppMethodBeat.o(57255);
  }

  private static boolean a(int paramInt, com.google.b.f.a.c paramc, com.google.b.f.a.a parama)
  {
    AppMethodBeat.i(57254);
    boolean bool;
    if (paramc.bBD - paramc.a(parama).vM() >= (paramInt + 7) / 8)
    {
      bool = true;
      AppMethodBeat.o(57254);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(57254);
    }
  }

  private static boolean bl(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(57251);
    try
    {
      paramString = paramString.getBytes("Shift_JIS");
      i = paramString.length;
      if (i % 2 != 0)
      {
        AppMethodBeat.o(57251);
        return bool;
      }
    }
    catch (UnsupportedEncodingException paramString)
    {
      while (true)
      {
        int i;
        AppMethodBeat.o(57251);
        continue;
        for (int j = 0; ; j += 2)
        {
          if (j >= i)
            break label105;
          int k = paramString[j] & 0xFF;
          if (((k < 129) || (k > 159)) && ((k < 224) || (k > 235)))
          {
            AppMethodBeat.o(57251);
            break;
          }
        }
        label105: bool = true;
        AppMethodBeat.o(57251);
      }
    }
  }

  private static int fI(int paramInt)
  {
    if (paramInt < bBK.length);
    for (paramInt = bBK[paramInt]; ; paramInt = -1)
      return paramInt;
  }

  private static byte[] r(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(57257);
    int j = paramArrayOfByte.length;
    int[] arrayOfInt = new int[j + paramInt];
    for (int k = 0; k < j; k++)
      paramArrayOfByte[k] &= 255;
    new com.google.b.b.a.c(com.google.b.b.a.a.bzq).e(arrayOfInt, paramInt);
    paramArrayOfByte = new byte[paramInt];
    for (k = i; k < paramInt; k++)
      paramArrayOfByte[k] = ((byte)(byte)arrayOfInt[(j + k)]);
    AppMethodBeat.o(57257);
    return paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.b.f.b.c
 * JD-Core Version:    0.6.2
 */