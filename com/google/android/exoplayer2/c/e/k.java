package com.google.android.exoplayer2.c.e;

import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class k
{
  static void a(int paramInt, i parami)
  {
    AppMethodBeat.i(95063);
    int i = parami.ed(6);
    int j = 0;
    if (j < i + 1)
    {
      switch (parami.ed(16))
      {
      default:
      case 0:
      }
      while (true)
      {
        j++;
        break;
        if (parami.rl());
        for (int k = parami.ed(4) + 1; parami.rl(); k = 1)
        {
          int m = parami.ed(8);
          for (n = 0; n < m + 1; n++)
          {
            parami.ee(ef(paramInt - 1));
            parami.ee(ef(paramInt - 1));
          }
        }
        if (parami.ed(2) != 0)
        {
          parami = new o("to reserved bits must be zero after mapping coupling steps");
          AppMethodBeat.o(95063);
          throw parami;
        }
        if (k > 1)
          for (n = 0; n < paramInt; n++)
            parami.ee(4);
        for (int n = 0; n < k; n++)
        {
          parami.ee(8);
          parami.ee(8);
          parami.ee(8);
        }
      }
    }
    AppMethodBeat.o(95063);
  }

  public static boolean a(int paramInt, l paraml, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(95061);
    if (paraml.tB() < 7)
      if (paramBoolean)
      {
        AppMethodBeat.o(95061);
        paramBoolean = bool;
      }
    while (true)
    {
      return paramBoolean;
      paraml = new o("too short header: " + paraml.tB());
      AppMethodBeat.o(95061);
      throw paraml;
      if (paraml.readUnsignedByte() != paramInt)
      {
        if (paramBoolean)
        {
          AppMethodBeat.o(95061);
          paramBoolean = bool;
        }
        else
        {
          paraml = new o("expected header type " + Integer.toHexString(paramInt));
          AppMethodBeat.o(95061);
          throw paraml;
        }
      }
      else if ((paraml.readUnsignedByte() != 118) || (paraml.readUnsignedByte() != 111) || (paraml.readUnsignedByte() != 114) || (paraml.readUnsignedByte() != 98) || (paraml.readUnsignedByte() != 105) || (paraml.readUnsignedByte() != 115))
      {
        if (paramBoolean)
        {
          AppMethodBeat.o(95061);
          paramBoolean = bool;
        }
        else
        {
          paraml = new o("expected characters 'vorbis'");
          AppMethodBeat.o(95061);
          throw paraml;
        }
      }
      else
      {
        paramBoolean = true;
        AppMethodBeat.o(95061);
      }
    }
  }

  static k.c[] a(i parami)
  {
    AppMethodBeat.i(95062);
    int i = parami.ed(6) + 1;
    k.c[] arrayOfc = new k.c[i];
    for (int j = 0; j < i; j++)
      arrayOfc[j] = new k.c(parami.rl(), parami.ed(16), parami.ed(16), parami.ed(8));
    AppMethodBeat.o(95062);
    return arrayOfc;
  }

  static void b(i parami)
  {
    AppMethodBeat.i(95064);
    int i = parami.ed(6);
    int j = 0;
    int k;
    int[] arrayOfInt;
    int m;
    label89: int n;
    if (j < i + 1)
    {
      if (parami.ed(16) > 2)
      {
        parami = new o("residueType greater than 2 is not decodable");
        AppMethodBeat.o(95064);
        throw parami;
      }
      parami.ee(24);
      parami.ee(24);
      parami.ee(24);
      k = parami.ed(6) + 1;
      parami.ee(8);
      arrayOfInt = new int[k];
      m = 0;
      if (m < k)
      {
        n = parami.ed(3);
        if (!parami.rl())
          break label197;
      }
    }
    label197: for (int i1 = parami.ed(5); ; i1 = 0)
    {
      arrayOfInt[m] = (i1 * 8 + n);
      m++;
      break label89;
      for (m = 0; m < k; m++)
        for (i1 = 0; i1 < 8; i1++)
          if ((arrayOfInt[m] & 1 << i1) != 0)
            parami.ee(8);
      j++;
      break;
      AppMethodBeat.o(95064);
      return;
    }
  }

  static void c(i parami)
  {
    AppMethodBeat.i(95065);
    int i = parami.ed(6);
    for (int j = 0; j < i + 1; j++)
    {
      int k = parami.ed(16);
      int m;
      switch (k)
      {
      default:
        parami = new o("floor type greater than 1 not decodable: ".concat(String.valueOf(k)));
        AppMethodBeat.o(95065);
        throw parami;
      case 0:
        parami.ee(8);
        parami.ee(16);
        parami.ee(16);
        parami.ee(6);
        parami.ee(8);
        m = parami.ed(4);
        k = 0;
      case 1:
      }
      while (k < m + 1)
      {
        parami.ee(8);
        k++;
        continue;
        int n = parami.ed(5);
        m = -1;
        int[] arrayOfInt1 = new int[n];
        k = 0;
        while (k < n)
        {
          arrayOfInt1[k] = parami.ed(4);
          i1 = m;
          if (arrayOfInt1[k] > m)
            i1 = arrayOfInt1[k];
          k++;
          m = i1;
        }
        int[] arrayOfInt2 = new int[m + 1];
        for (k = 0; k < arrayOfInt2.length; k++)
        {
          arrayOfInt2[k] = (parami.ed(3) + 1);
          i1 = parami.ed(2);
          if (i1 > 0)
            parami.ee(8);
          for (m = 0; m < 1 << i1; m++)
            parami.ee(8);
        }
        parami.ee(2);
        int i2 = parami.ed(4);
        m = 0;
        k = 0;
        int i1 = 0;
        while (k < n)
        {
          i1 += arrayOfInt2[arrayOfInt1[k]];
          while (m < i1)
          {
            parami.ee(i2);
            m++;
          }
          k++;
        }
      }
    }
    AppMethodBeat.o(95065);
  }

  public static int ef(int paramInt)
  {
    int i = 0;
    while (paramInt > 0)
    {
      i++;
      paramInt >>>= 1;
    }
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.e.k
 * JD-Core Version:    0.6.2
 */