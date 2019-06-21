package com.google.android.exoplayer2.c.d;

import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class i
{
  private static final int[] aZl;

  static
  {
    AppMethodBeat.i(95012);
    aZl = new int[] { v.aT("isom"), v.aT("iso2"), v.aT("iso3"), v.aT("iso4"), v.aT("iso5"), v.aT("iso6"), v.aT("avc1"), v.aT("hvc1"), v.aT("hev1"), v.aT("mp41"), v.aT("mp42"), v.aT("3g2a"), v.aT("3g2b"), v.aT("3gr6"), v.aT("3gs6"), v.aT("3ge6"), v.aT("3gg6"), v.aT("M4V "), v.aT("M4A "), v.aT("f4v "), v.aT("kddi"), v.aT("M4VP"), v.aT("qt  "), v.aT("MSNV") };
    AppMethodBeat.o(95012);
  }

  private static boolean b(f paramf, boolean paramBoolean)
  {
    AppMethodBeat.i(95010);
    long l1 = paramf.getLength();
    long l2;
    if (l1 != -1L)
    {
      l2 = l1;
      if (l1 <= 4096L);
    }
    else
    {
      l2 = 4096L;
    }
    int i = (int)l2;
    l locall = new l(64);
    int j = 0;
    boolean bool1 = false;
    int k = 0;
    boolean bool2 = bool1;
    int m;
    int n;
    int i1;
    if (k < i)
    {
      m = 8;
      locall.reset(8);
      paramf.b(locall.data, 0, 8);
      l1 = locall.cM();
      n = locall.readInt();
      if (l1 == 1L)
      {
        i1 = 16;
        paramf.b(locall.data, 8, 8);
        locall.eL(16);
        l2 = locall.tK();
        label149: if (l2 >= i1)
          break label226;
        paramBoolean = false;
        AppMethodBeat.o(95010);
      }
    }
    while (true)
    {
      label165: return paramBoolean;
      l2 = l1;
      i1 = m;
      if (l1 != 0L)
        break label149;
      long l3 = paramf.getLength();
      l2 = l1;
      i1 = m;
      if (l3 == -1L)
        break label149;
      l2 = l3 - paramf.getPosition() + 8L;
      i1 = m;
      break label149;
      label226: m = k + i1;
      k = m;
      if (n == a.aWi)
        break;
      if ((n == a.aWr) || (n == a.aWt))
        bool2 = true;
      while (true)
        if ((j != 0) && (paramBoolean == bool2))
        {
          paramBoolean = true;
          AppMethodBeat.o(95010);
          break label165;
          bool2 = bool1;
          if (m + l2 - i1 < i)
          {
            i1 = (int)(l2 - i1);
            k = m + i1;
            if (n == a.aVH)
            {
              if (i1 < 8)
              {
                paramBoolean = false;
                AppMethodBeat.o(95010);
                break label165;
              }
              locall.reset(i1);
              paramf.b(locall.data, 0, i1);
              n = i1 / 4;
              m = 0;
              i1 = j;
              if (m < n)
              {
                if (m == 1)
                  locall.eM(4);
                while (!dY(locall.readInt()))
                {
                  m++;
                  break;
                }
                i1 = 1;
              }
              if (i1 == 0)
              {
                paramBoolean = false;
                AppMethodBeat.o(95010);
                break label165;
              }
              j = i1;
              break;
            }
            if (i1 != 0)
              paramf.dH(i1);
            break;
          }
        }
      paramBoolean = false;
      AppMethodBeat.o(95010);
    }
  }

  private static boolean dY(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(95011);
    if (paramInt >>> 8 == v.aT("3gp"))
      AppMethodBeat.o(95011);
    while (true)
    {
      return bool;
      int[] arrayOfInt = aZl;
      int i = arrayOfInt.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label64;
        if (arrayOfInt[j] == paramInt)
        {
          AppMethodBeat.o(95011);
          break;
        }
      }
      label64: AppMethodBeat.o(95011);
      bool = false;
    }
  }

  public static boolean g(f paramf)
  {
    AppMethodBeat.i(95008);
    boolean bool = b(paramf, true);
    AppMethodBeat.o(95008);
    return bool;
  }

  public static boolean h(f paramf)
  {
    AppMethodBeat.i(95009);
    boolean bool = b(paramf, false);
    AppMethodBeat.o(95009);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.d.i
 * JD-Core Version:    0.6.2
 */