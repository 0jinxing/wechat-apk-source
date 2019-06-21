package com.google.android.exoplayer2.f.a;

import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class g
{
  private static int A(l paraml)
  {
    AppMethodBeat.i(95620);
    int i = 0;
    int j;
    if (paraml.tB() == 0)
    {
      j = -1;
      AppMethodBeat.o(95620);
    }
    while (true)
    {
      return j;
      int k = paraml.readUnsignedByte();
      j = i + k;
      i = j;
      if (k == 255)
        break;
      AppMethodBeat.o(95620);
    }
  }

  public static void a(long paramLong, l paraml, m[] paramArrayOfm)
  {
    AppMethodBeat.i(95619);
    while (paraml.tB() > 1)
    {
      int i = A(paraml);
      int j = A(paraml);
      if ((j == -1) || (j > paraml.tB()))
      {
        paraml.setPosition(paraml.limit);
      }
      else if (a(i, j, paraml))
      {
        paraml.eM(8);
        int k = paraml.readUnsignedByte() & 0x1F;
        paraml.eM(1);
        int m = k * 3;
        int n = paraml.position;
        int i1 = paramArrayOfm.length;
        for (i = 0; i < i1; i++)
        {
          m localm = paramArrayOfm[i];
          paraml.setPosition(n);
          localm.a(paraml, m);
          localm.a(paramLong, 1, m, 0, null);
        }
        paraml.eM(j - (k * 3 + 10));
      }
      else
      {
        paraml.eM(j);
      }
    }
    AppMethodBeat.o(95619);
  }

  private static boolean a(int paramInt1, int paramInt2, l paraml)
  {
    boolean bool = false;
    AppMethodBeat.i(95621);
    if ((paramInt1 != 4) || (paramInt2 < 8))
      AppMethodBeat.o(95621);
    while (true)
    {
      return bool;
      paramInt1 = paraml.position;
      int i = paraml.readUnsignedByte();
      paramInt2 = paraml.readUnsignedShort();
      int j = paraml.readInt();
      int k = paraml.readUnsignedByte();
      paraml.setPosition(paramInt1);
      if ((i == 181) && (paramInt2 == 49) && (j == 1195456820) && (k == 3))
      {
        bool = true;
        AppMethodBeat.o(95621);
      }
      else
      {
        AppMethodBeat.o(95621);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.a.g
 * JD-Core Version:    0.6.2
 */