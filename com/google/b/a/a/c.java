package com.google.b.a.a;

import com.google.b.b.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public final class c
{
  private static final int[] byq = { 4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12 };

  private static com.google.b.b.a a(com.google.b.b.a parama, int paramInt)
  {
    AppMethodBeat.i(57200);
    com.google.b.b.a locala = new com.google.b.b.a();
    int i = parama.size;
    int j = (1 << paramInt) - 2;
    int k = 0;
    if (k < i)
    {
      int m = 0;
      int i1;
      for (int n = 0; m < paramInt; n = i1)
      {
        if (k + m < i)
        {
          i1 = n;
          if (!parama.get(k + m));
        }
        else
        {
          i1 = n | 1 << paramInt - 1 - m;
        }
        m++;
      }
      if ((n & j) == j)
      {
        locala.bA(n & j, paramInt);
        k--;
      }
      while (true)
      {
        k += paramInt;
        break;
        if ((n & j) == 0)
        {
          locala.bA(n | 0x1, paramInt);
          k--;
        }
        else
        {
          locala.bA(n, paramInt);
        }
      }
    }
    AppMethodBeat.o(57200);
    return locala;
  }

  private static com.google.b.b.a a(com.google.b.b.a parama, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57198);
    int i = parama.size / paramInt2;
    Object localObject;
    switch (paramInt2)
    {
    case 5:
    case 7:
    case 9:
    case 11:
    default:
      parama = new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(paramInt2)));
      AppMethodBeat.o(57198);
      throw parama;
    case 4:
      localObject = com.google.b.b.a.a.bzp;
    case 6:
    case 8:
    case 10:
    case 12:
    }
    while (true)
    {
      localObject = new com.google.b.b.a.c((com.google.b.b.a.a)localObject);
      int j = paramInt1 / paramInt2;
      parama = b(parama, paramInt2, j);
      ((com.google.b.b.a.c)localObject).e(parama, j - i);
      localObject = new com.google.b.b.a();
      ((com.google.b.b.a)localObject).bA(0, paramInt1 % paramInt2);
      j = parama.length;
      for (paramInt1 = 0; paramInt1 < j; paramInt1++)
        ((com.google.b.b.a)localObject).bA(parama[paramInt1], paramInt2);
      localObject = com.google.b.b.a.a.bzo;
      continue;
      localObject = com.google.b.b.a.a.bzs;
      continue;
      localObject = com.google.b.b.a.a.bzn;
      continue;
      localObject = com.google.b.b.a.a.bzm;
    }
    AppMethodBeat.o(57198);
    return localObject;
  }

  private static void a(b paramb, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57196);
    for (int i = 0; i < paramInt2; i += 2)
      for (int j = paramInt1 - i; j <= paramInt1 + i; j++)
      {
        paramb.set(j, paramInt1 - i);
        paramb.set(j, paramInt1 + i);
        paramb.set(paramInt1 - i, j);
        paramb.set(paramInt1 + i, j);
      }
    paramb.set(paramInt1 - paramInt2, paramInt1 - paramInt2);
    paramb.set(paramInt1 - paramInt2 + 1, paramInt1 - paramInt2);
    paramb.set(paramInt1 - paramInt2, paramInt1 - paramInt2 + 1);
    paramb.set(paramInt1 + paramInt2, paramInt1 - paramInt2);
    paramb.set(paramInt1 + paramInt2, paramInt1 - paramInt2 + 1);
    paramb.set(paramInt1 + paramInt2, paramInt1 + paramInt2 - 1);
    AppMethodBeat.o(57196);
  }

  private static void a(b paramb, boolean paramBoolean, int paramInt, com.google.b.b.a parama)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(57197);
    int k = paramInt / 2;
    paramInt = i;
    if (paramBoolean)
    {
      for (paramInt = j; paramInt < 7; paramInt++)
      {
        j = k - 3 + paramInt;
        if (parama.get(paramInt))
          paramb.set(j, k - 5);
        if (parama.get(paramInt + 7))
          paramb.set(k + 5, j);
        if (parama.get(20 - paramInt))
          paramb.set(j, k + 5);
        if (parama.get(27 - paramInt))
          paramb.set(k - 5, j);
      }
      AppMethodBeat.o(57197);
    }
    while (true)
    {
      return;
      while (paramInt < 10)
      {
        j = k - 5 + paramInt + paramInt / 5;
        if (parama.get(paramInt))
          paramb.set(j, k - 7);
        if (parama.get(paramInt + 10))
          paramb.set(k + 7, j);
        if (parama.get(29 - paramInt))
          paramb.set(j, k + 7);
        if (parama.get(39 - paramInt))
          paramb.set(k - 7, j);
        paramInt++;
      }
      AppMethodBeat.o(57197);
    }
  }

  private static int[] b(com.google.b.b.a parama, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57199);
    int[] arrayOfInt = new int[paramInt2];
    int i = parama.size / paramInt1;
    for (paramInt2 = 0; paramInt2 < i; paramInt2++)
    {
      int j = 0;
      int k = 0;
      if (j < paramInt1)
      {
        if (parama.get(paramInt2 * paramInt1 + j));
        for (int m = 1 << paramInt1 - j - 1; ; m = 0)
        {
          k |= m;
          j++;
          break;
        }
      }
      arrayOfInt[paramInt2] = k;
    }
    AppMethodBeat.o(57199);
    return arrayOfInt;
  }

  public static a n(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57195);
    Object localObject1 = new d(paramArrayOfByte);
    paramArrayOfByte = Collections.singletonList(f.byy);
    int i = 0;
    int j;
    if (i < ((d)localObject1).byv.length)
    {
      if (i + 1 < ((d)localObject1).byv.length)
      {
        j = localObject1.byv[(i + 1)];
        label57: switch (localObject1.byv[i])
        {
        default:
          j = 0;
          label111: if (j > 0)
          {
            paramArrayOfByte = d.a(paramArrayOfByte, i, j);
            i++;
          }
          break;
        case 13:
        case 46:
        case 44:
        case 58:
        }
      }
      while (true)
      {
        i++;
        break;
        j = 0;
        break label57;
        if (j == 10)
        {
          j = 2;
          break label111;
        }
        j = 0;
        break label111;
        if (j == 32)
        {
          j = 3;
          break label111;
        }
        j = 0;
        break label111;
        if (j == 32)
        {
          j = 4;
          break label111;
        }
        j = 0;
        break label111;
        if (j == 32)
        {
          j = 5;
          break label111;
        }
        j = 0;
        break label111;
        localObject2 = new LinkedList();
        paramArrayOfByte = paramArrayOfByte.iterator();
        while (paramArrayOfByte.hasNext())
          ((d)localObject1).a((f)paramArrayOfByte.next(), i, (Collection)localObject2);
        paramArrayOfByte = d.c((Iterable)localObject2);
      }
    }
    Object localObject2 = ((f)Collections.min(paramArrayOfByte, new d.1((d)localObject1))).r(((d)localObject1).byv);
    int k = ((com.google.b.b.a)localObject2).size * paramInt1 / 100 + 11;
    int m = ((com.google.b.b.a)localObject2).size;
    boolean bool;
    if (paramInt2 != 0)
    {
      if (paramInt2 < 0)
      {
        bool = true;
        i = Math.abs(paramInt2);
        if (!bool)
          break label383;
      }
      label383: for (paramInt1 = 4; ; paramInt1 = 32)
      {
        if (i <= paramInt1)
          break label389;
        paramArrayOfByte = new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[] { Integer.valueOf(paramInt2) }));
        AppMethodBeat.o(57195);
        throw paramArrayOfByte;
        bool = false;
        break;
      }
      label389: paramInt1 = t(i, bool);
      paramInt2 = byq[i];
      paramArrayOfByte = a((com.google.b.b.a)localObject2, paramInt2);
      if (paramArrayOfByte.size + k > paramInt1 - paramInt1 % paramInt2)
      {
        paramArrayOfByte = new IllegalArgumentException("Data to large for user specified layer");
        AppMethodBeat.o(57195);
        throw paramArrayOfByte;
      }
      if ((bool) && (paramArrayOfByte.size > paramInt2 << 6))
      {
        paramArrayOfByte = new IllegalArgumentException("Data to large for user specified layer");
        AppMethodBeat.o(57195);
        throw paramArrayOfByte;
      }
    }
    while (true)
    {
      localObject1 = a(paramArrayOfByte, paramInt1, paramInt2);
      m = paramArrayOfByte.size / paramInt2;
      paramArrayOfByte = new com.google.b.b.a();
      if (bool)
      {
        paramArrayOfByte.bA(i - 1, 2);
        paramArrayOfByte.bA(m - 1, 6);
        paramArrayOfByte = a(paramArrayOfByte, 28, 4);
        if (!bool)
          break label776;
      }
      int[] arrayOfInt;
      label616: int n;
      int i1;
      label776: for (paramInt1 = 11; ; paramInt1 = 14)
      {
        k = (i << 2) + paramInt1;
        arrayOfInt = new int[k];
        if (!bool)
          break label1051;
        for (paramInt1 = 0; paramInt1 < arrayOfInt.length; paramInt1++)
          arrayOfInt[paramInt1] = paramInt1;
        j = 0;
        paramArrayOfByte = null;
        paramInt2 = 0;
        if (paramInt2 > 32)
        {
          paramArrayOfByte = new IllegalArgumentException("Data too large for an Aztec code");
          AppMethodBeat.o(57195);
          throw paramArrayOfByte;
        }
        if (paramInt2 <= 3)
        {
          bool = true;
          if (!bool)
            break label740;
        }
        label740: for (i = paramInt2 + 1; ; i = paramInt2)
        {
          n = t(i, bool);
          localObject1 = paramArrayOfByte;
          i1 = j;
          if (m + k <= n)
          {
            paramInt1 = j;
            if (j != byq[i])
            {
              paramInt1 = byq[i];
              paramArrayOfByte = a((com.google.b.b.a)localObject2, paramInt1);
            }
            if (bool)
            {
              localObject1 = paramArrayOfByte;
              i1 = paramInt1;
              if (paramArrayOfByte.size > paramInt1 << 6);
            }
            else
            {
              if (paramArrayOfByte.size + k <= n - n % paramInt1)
                break label1328;
              i1 = paramInt1;
              localObject1 = paramArrayOfByte;
            }
          }
          paramInt2++;
          paramArrayOfByte = (byte[])localObject1;
          j = i1;
          break;
          bool = false;
          break label616;
        }
        paramArrayOfByte.bA(i - 1, 5);
        paramArrayOfByte.bA(m - 1, 11);
        paramArrayOfByte = a(paramArrayOfByte, 40, 4);
        break;
      }
      paramInt1 = k;
      localObject2 = new b(paramInt1);
      j = 0;
      paramInt2 = 0;
      while (true)
      {
        if (j >= i)
          break label1159;
        int i2;
        if (bool)
        {
          i1 = 9;
          i2 = (i - j << 2) + i1;
        }
        for (i1 = 0; ; i1++)
        {
          if (i1 >= i2)
            break label1146;
          int i3 = i1 << 1;
          n = 0;
          while (true)
            if (n < 2)
            {
              if (((com.google.b.b.a)localObject1).get(paramInt2 + i3 + n))
                ((b)localObject2).set(arrayOfInt[((j << 1) + n)], arrayOfInt[((j << 1) + i1)]);
              if (((com.google.b.b.a)localObject1).get((i2 << 1) + paramInt2 + i3 + n))
                ((b)localObject2).set(arrayOfInt[((j << 1) + i1)], arrayOfInt[(k - 1 - (j << 1) - n)]);
              if (((com.google.b.b.a)localObject1).get((i2 << 2) + paramInt2 + i3 + n))
                ((b)localObject2).set(arrayOfInt[(k - 1 - (j << 1) - n)], arrayOfInt[(k - 1 - (j << 1) - i1)]);
              if (((com.google.b.b.a)localObject1).get(i2 * 6 + paramInt2 + i3 + n))
                ((b)localObject2).set(arrayOfInt[(k - 1 - (j << 1) - i1)], arrayOfInt[((j << 1) + n)]);
              n++;
              continue;
              label1051: j = k + 1 + (k / 2 - 1) / 15 * 2;
              i1 = k / 2;
              n = j / 2;
              for (paramInt2 = 0; ; paramInt2++)
              {
                paramInt1 = j;
                if (paramInt2 >= i1)
                  break;
                paramInt1 = paramInt2 / 15 + paramInt2;
                arrayOfInt[(i1 - paramInt2 - 1)] = (n - paramInt1 - 1);
                arrayOfInt[(i1 + paramInt2)] = (paramInt1 + n + 1);
              }
              i1 = 12;
              break;
            }
        }
        label1146: j++;
        paramInt2 += (i2 << 3);
      }
      label1159: a((b)localObject2, bool, paramInt1, paramArrayOfByte);
      if (bool)
        a((b)localObject2, paramInt1 / 2, 5);
      while (true)
      {
        paramArrayOfByte = new a();
        paramArrayOfByte.byk = bool;
        paramArrayOfByte.size = paramInt1;
        paramArrayOfByte.byl = i;
        paramArrayOfByte.bym = m;
        paramArrayOfByte.byn = ((b)localObject2);
        AppMethodBeat.o(57195);
        return paramArrayOfByte;
        a((b)localObject2, paramInt1 / 2, 7);
        j = 0;
        for (paramInt2 = 0; j < k / 2 - 1; paramInt2 += 16)
        {
          for (i1 = paramInt1 / 2 & 0x1; i1 < paramInt1; i1 += 2)
          {
            ((b)localObject2).set(paramInt1 / 2 - paramInt2, i1);
            ((b)localObject2).set(paramInt1 / 2 + paramInt2, i1);
            ((b)localObject2).set(i1, paramInt1 / 2 - paramInt2);
            ((b)localObject2).set(i1, paramInt1 / 2 + paramInt2);
          }
          j += 15;
        }
      }
      label1328: paramInt2 = paramInt1;
      paramInt1 = n;
    }
  }

  private static int t(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 88; ; i = 112)
      return (i + (paramInt << 4)) * paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.b.a.a.c
 * JD-Core Version:    0.6.2
 */