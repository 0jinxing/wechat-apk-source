package com.google.b.f.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class d
{
  static int a(b paramb, boolean paramBoolean)
  {
    int i;
    int j;
    label18: int k;
    if (paramBoolean)
    {
      i = paramb.height;
      if (!paramBoolean)
        break label94;
      j = paramb.width;
      paramb = paramb.bBJ;
      k = 0;
    }
    label44: int i3;
    for (int m = 0; ; m = i3)
    {
      if (k >= i)
        break label184;
      int n = -1;
      int i1 = 0;
      int i2 = 0;
      if (i1 < j)
      {
        if (paramBoolean)
        {
          i3 = paramb[k][i1];
          label63: if (i3 != n)
            break label114;
        }
        for (i3 = i2 + 1; ; i3 = i2)
        {
          i1++;
          i2 = i3;
          break label44;
          i = paramb.width;
          break;
          label94: j = paramb.height;
          break label18;
          i3 = paramb[i1][k];
          break label63;
          label114: n = m;
          if (i2 >= 5)
            n = m + (i2 - 5 + 3);
          i2 = 1;
          m = n;
          n = i3;
        }
      }
      i3 = m;
      if (i2 >= 5)
        i3 = m + (i2 - 5 + 3);
      k++;
    }
    label184: return m;
  }

  static boolean a(byte[][] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = false;
    AppMethodBeat.i(57181);
    paramInt2 = Math.max(paramInt2, 0);
    paramInt3 = Math.min(paramInt3, paramArrayOfByte.length);
    if (paramInt2 < paramInt3)
      if (paramArrayOfByte[paramInt2][paramInt1] == 1)
        AppMethodBeat.o(57181);
    while (true)
    {
      return bool;
      paramInt2++;
      break;
      AppMethodBeat.o(57181);
      bool = true;
    }
  }

  static boolean o(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(57180);
    paramInt1 = Math.max(paramInt1, 0);
    paramInt2 = Math.min(paramInt2, paramArrayOfByte.length);
    if (paramInt1 < paramInt2)
      if (paramArrayOfByte[paramInt1] == 1)
        AppMethodBeat.o(57180);
    while (true)
    {
      return bool;
      paramInt1++;
      break;
      AppMethodBeat.o(57180);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.b.f.b.d
 * JD-Core Version:    0.6.2
 */