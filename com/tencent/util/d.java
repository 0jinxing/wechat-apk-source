package com.tencent.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d
{
  private static int c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = 1;
    int j = paramInt1;
    if (paramBoolean)
    {
      j = paramInt1 + (paramInt2 - 1);
      i = -1;
    }
    paramInt1 = 0;
    while (paramInt2 > 0)
    {
      paramInt1 = paramInt1 << 8 | paramArrayOfByte[j] & 0xFF;
      j += i;
      paramInt2--;
    }
    return paramInt1;
  }

  public static int cs(byte[] paramArrayOfByte)
  {
    int i = 0;
    AppMethodBeat.i(86578);
    if (paramArrayOfByte == null)
      AppMethodBeat.o(86578);
    label22: int k;
    int m;
    int n;
    for (int j = i; ; j = i)
    {
      return j;
      j = 0;
      do
      {
        do
        {
          k = j;
          if (j + 3 >= paramArrayOfByte.length)
            break;
          k = j + 1;
          if ((paramArrayOfByte[j] & 0xFF) != 255)
            break label531;
          m = paramArrayOfByte[k] & 0xFF;
          if (m == 255)
            break label526;
          n = k + 1;
          j = n;
        }
        while (m == 216);
        j = n;
      }
      while (m == 1);
      k = n;
      if (m == 217)
        break label521;
      k = n;
      if (m == 218)
        break label521;
      j = c(paramArrayOfByte, n, 2, false);
      if ((j >= 2) && (n + j <= paramArrayOfByte.length))
        break;
      i.m("CameraExif", "Invalid length");
      AppMethodBeat.o(86578);
    }
    if ((m == 225) && (j >= 8) && (c(paramArrayOfByte, n + 2, 4, false) == 1165519206) && (c(paramArrayOfByte, n + 6, 2, false) == 0))
    {
      k = n + 8;
      j -= 8;
    }
    while (true)
    {
      if (j > 8)
      {
        n = c(paramArrayOfByte, k, 4, false);
        if ((n != 1229531648) && (n != 1296891946))
        {
          i.m("CameraExif", "Invalid byte order");
          AppMethodBeat.o(86578);
          j = i;
          break;
          j = n + j;
          break label22;
        }
        if (n == 1229531648);
        for (boolean bool = true; ; bool = false)
        {
          m = c(paramArrayOfByte, k + 4, 4, bool) + 2;
          if ((m >= 10) && (m <= j))
            break label322;
          i.m("CameraExif", "Invalid offset");
          AppMethodBeat.o(86578);
          j = i;
          break;
        }
        label322: n = k + m;
        k = c(paramArrayOfByte, n - 2, 2, bool);
        j -= m;
        while (true)
        {
          if ((k <= 0) || (j < 12))
            break label503;
          if (c(paramArrayOfByte, n, 2, bool) == 274)
            switch (c(paramArrayOfByte, n + 8, 2, bool))
            {
            case 2:
            case 4:
            case 5:
            case 7:
            default:
              i.j("CameraExif", "Unsupported orientation");
              AppMethodBeat.o(86578);
              j = i;
              break;
            case 1:
              AppMethodBeat.o(86578);
              j = i;
              break;
            case 3:
              j = 180;
              AppMethodBeat.o(86578);
              break;
            case 6:
              j = 90;
              AppMethodBeat.o(86578);
              break;
            case 8:
              j = 270;
              AppMethodBeat.o(86578);
              break;
            }
          n += 12;
          j -= 12;
          k--;
        }
      }
      label503: i.j("CameraExif", "Orientation not found");
      AppMethodBeat.o(86578);
      j = i;
      break;
      label521: j = 0;
      continue;
      label526: j = k;
      break label22;
      label531: j = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.util.d
 * JD-Core Version:    0.6.2
 */